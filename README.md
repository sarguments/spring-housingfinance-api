# KaKaoPay 서버개발자 사전과제

## 문제해결전략

**엔티티 모델링**

- YearlySupply (연별 공급총액) : year로 키를 가짐
```
id : year
```

- Institute (기관) : institute_code를 키로 가짐
```
id : institute_code
column : institute_name
```

- YearlyInstituteSupply (연, 기관별 공급총액) : year, institute_code 복합키
```
id : year
id : institute_code
```

- InstituteMonthlySupply (연,월 기관별 공급액) : year, institute_code, month 복합키
```
id : year
id : institute_code
id : month
column : monthly_data
```

##### `YearlySupply` 1 : n `YearlyInstituteSupply`
##### `Institute` 1 : n `YearlyInstituteSupply`
##### `InstituteMonthlySupply` 1 : n `YearlyInstituteSupply`


* [x] 데이터 파일(csv)에서 각 레코드를 데이터베이스에 저장
    * 서버를 실행하는 시점에 csv 파일을 모두 읽어 `Entity`를 나누어 영속성을 부여하게 하기 위해 `Spring Data Batch`를 사용
    * csv 파일을 읽고, Entity로 가공하고, DB에 저장하는 과정을 하나의 `Job`으로 설정
        * csv 파일을 읽을 때, 특정 컬럼에 있는 `"`와`,`를 제거해 `Integer` 값으로 변환해 주는 `IntValueEditor`를 직접 만듦
        * process 과정 : 한 로우를 가장 작은 단위인 `InstituteMonthlySupply` Entity로 변환
        * write 과정 : `Entity`에 영속성을 부여하는 과정에서 중복으로 Entity가 생성되지 않도록 `EntityManager`의 merge() 사용
            * 엔티티를 생성하는 과정에서 이미 복합키를 식별자로 만들어 중복여부를 판단할 수 있게함
            
* [x] 주택금융 공급 금융기관(은행) 목록을 출력
    * 금융기관 Entity를 개별적으로 만들어서 간단하게 조회할 수 있게 함

* [x] 년도별 각 금융기관의 지원금액 합계를 출력
    * 연도별 공급총액(`YearlySupply`) 엔티티를 모두 조회할 때, 관계를 맺고 있는 모든 엔티티(`YearlyInstituteSupply`, `InstituteMonthlySupply`)를 조회하고 싶었음
    * 기존 ManyToOne 관계의 lazy loading은 유지하면서 N + 1 이슈와 카다시안 곱 문제를 해결하기 위해 `@EntityGraph`를 사용하고, @OneToMany 필드를 Set타입으로 변경 
    * 개별 엔티티에 직접 합을 구할 수 있는 메소드를 구현해, 총합을 모아 출력할 수 있었음

* [x] 각 연도별 각 기관의 전체 지원금액 중에서 가장 큰 금액의 기관명을 출력
    * 각 연도별 각 기관의 전체 지원금액의 합을 객체(`YearlySupplyDto`)로 만들어 `Comparable`인터페이스를 구현해 크기 비교

* [x] 전체 년도(2005~2016)에서 `특정은행`의 지원금액 평균 중에서 가장 작은 금액과 큰 금액을 출력
    * 전체 년도 중 12달 이하인 년도는 비교대상에서 제외해야 함.
    * `Entity`(도메인 역할)에서 `DTO`로 가공하는 과정에서 `stream().filter()`를 사용해 필터링
   

---

## Requirement

### 과제
***주택 금융 서비스 API 개발***

### 요구사항
• 데이터 파일에서 각 레코드를 데이터베이스에 저장하는 API 개발

• 주택금융 공급 금융기관(은행) 목록을 출력하는 API 를 개발

• 년도별 각 금융기관의 지원금액 합계를 출력하는 API 를 개발
##### 출력 :
```json
{
  "name":"주택금융 공급현황", 
  "data":
  [
    { "year":"2004 년", 
      "total_amount":"14145", 
      "detail_amount":
      {"주택도시기금":"2143","국민은행":"4356","우리은행":"5342",...,"기타은행":"1324"}},
    { "year":"2005 년",
      "total_amount":"23145", 
      "detail_amount":
      {"주택도시기금":"1243","국민은행":"5336","우리은행":"4849",...,"기타은행":"1093"}},
    ...,
    { "year":"2017 년", 
      "total_amount":"33145", 
      "detail_amount":
      {"주택도시기금":"2240","국민은행":"4338","우리은행":"5131",...,"기타은행":"1392"}}
  ]
}
```

• 각년도별각기관의전체지원금액중에서가장큰금액의기관명을출력하는API개발 
    * 예를들어, 2005 년 ~2017 년 중에 2010 년 국민은행의 전체 지원금액(1 월~12 월 지원 합계)이 가장 높았다면 { "year": "2010" , "bank": "국민은행"}을 결과로 출력합니다.
##### 출력 :
```json
{
  "year": "2010" , 
  "bank": "국민은행"
}
```

• 전체 년도(2005~2016)에서 외환은행의 지원금액 평균 중에서 가장 작은 금액과 큰 금액을 출력하는 API 개발
    * 예를들어, 2005 년 ~ 2016 년 외환은행의 평균 지원금액 (매년 12 달의 지원금액 평균값)을 계산하여 가장 작은 값과 큰 값을 출력합니다. 소수점 이하는 반올림해서 계산하세요.
##### 출력 :
```json
{ "bank":"외환은행", 
  "support_amount": [
    { "year":"2008" , "amount":"78" },
    { "year":"2015" , "amount":"1702"} 
  ]
}
```

• 특정 은행의 특정 달에 대해서 2018년도 해당 달에 금융지원 금액을 예측하는 API 개발
    * 단, 예측 알고리즘을 무엇을 써야하는지에 대한 제약은 없지만, 가장 근사치에 가까울 수록 높은 점수 부여.

> 데이터는 2005 년부터 2017 년까지의 데이터로 2018 년 금융지원 금약을 예측하시면 됩니다.

##### 입력 :
```json
{
  "bank":"국민은행", 
  "month":"2"
}
```
##### 출력 :
```json
{
  "bank":"bnk3726", 
  "year":"2018", 
  "month":"2", 
  "amount":"4850"
}
```

> 예를들어, 국민은행의 기관코드가 “bnk3726”라는 가정으로, 국민은행이 2018 년도 2 월달에 4850 억을 지원할것이라는 예측 결과 입니다.

---

## Environment
- Java 8
- Gradle
- JUnit 4, logback
- Spring-Boot 2.1.1 RELEASE
- Spring Data JPA/Hibernate
- H2 Database
- Spring Data Batch

---

## 프로젝트 빌드, 실행방법

### 프로젝트 빌드

#### 1. 프로젝트 클론
```bash
$ git clone https://github.com/Sehun-Kim/spring-housingfinance-api.git
$ cd spring-housingfinance-api
```

#### 2. 프로젝트 빌드
- **build jar**
```bash
$ ./gradlew build -x test
$ chmod 755 build/libs/spring-housingfinance-1.0.0.jar
$ java -jar build/libs/spring-housingfinance-1.0.0.jar
```

- **use gradle**
```bash
$ ./gradlew bootRun
```

#### 3. 프로젝트 접속
- Project url : `http://localhost:8080` 접속
- DB url : `http://localhost:8080/h2-console/` 접속
```
1) JDBC URL 설정 : jdbc:h2:mem://localhost/~/springhousingfinance;
2) Connect 클릭
```

#### 4. 서버 종료
- `ctrl + c`

---

### 프로젝트 실행 방법

1. 주택금융 공급 금융기관(은행) 목록을 출력
- 입력 `url : http://localhost:8080/institutes`
- 출력
```json
{
  "name":"주택금융 공급업체",
  "data":[
    {"name":"주택도시기금","code":"hcf"},
    {"name":"국민은행","code":"bnk006"},
    {"name":"우리은행","code":"bnk020"},
    {"name":"신한은행","code":"bnk021"},
    {"name":"한국씨티은행","code":"bnk027"},
    {"name":"하나은행","code":"bnk081"},
    {"name":"농협은행/수협은행","code":"bnk095"},
    {"name":"외환은행","code":"bnk005"},
    {"name":"기타은행","code":"bnk999"}
    ],
}
```

2. 년도별 각 금융기관의 지원금액 합계를 출력
- 입력 `url : http://localhost:8080/yearlySupplies`
- 출력
```json
{
  "name": "주택금융 공급현황",
  "data": [
    {
      "year": 2007,
      "totalAmount": 50893,
      "detailAmount": {
        "농협은행/수협은행": 3515,
        "하나은행": 2279,
        "우리은행": 3545,
        "국민은행": 8260,
        "신한은행": 2497,
        "주택도시기금": 27745,
        "외환은행": 2059,
        "한국씨티은행": 139,
        "기타은행": 854
      }
    },
    {
      "year": 2010,
      "totalAmount": 114903,
      "detailAmount": {
        "하나은행": 1872,
        "농협은행/수협은행": 10984,
        "우리은행": 15846,
        "국민은행": 16017,
        "신한은행": 2724,
        "주택도시기금": 50554,
        "외환은행": 11158,
        "한국씨티은행": 22,
        "기타은행": 5726
      }
    },
    {
      "year": 2006,
      "totalAmount": 41210,
      "detailAmount": {
        "농협은행/수협은행": 2299,
        "하나은행": 3443,
        "우리은행": 4134,
        "국민은행": 5811,
        "신한은행": 1198,
        "주택도시기금": 20789,
        "외환은행": 2187,
        "한국씨티은행": 288,
        "기타은행": 1061
      }
    },
    {
      "year": 2008,
      "totalAmount": 67603,
      "detailAmount": {
        "하나은행": 1706,
        "농협은행/수협은행": 9630,
        "우리은행": 4290,
        "국민은행": 12786,
        "신한은행": 1701,
        "외환은행": 941,
        "주택도시기금": 35721,
        "한국씨티은행": 69,
        "기타은행": 759
      }
    }, ...
```

3. 각 연도별 각 기관의 전체 지원금액 중에서 가장 큰 금액의 기관명을 출력
- 입력 `url : http://localhost:8080/yearlySupplies/institutes/max`
- 출력
```json
{
  "year": 2014,
  "bank": "주택도시기금"
}
```

4. 전체 년도(2005~2016)에서 `특정은행`의 지원금액 평균 중에서 가장 작은 금액과 큰 금액을 출력
- 입력 `url : http://localhost:8080/institutes/{institute_code}/avgs`
>
```
[기관코드]
"주택도시기금" : "hcf"
"국민은행" : "bnk006"
"우리은행" : "bnk020"
"신한은행" : "bnk021"
"한국씨티은행" : "bnk027"
"하나은행" : "bnk081"
"농협은행/수협은행" : "bnk095"
"외환은행" : "bnk005"
"기타은행" : "bnk999"
```
- 출력
```json
  "bank": "주택도시기금",
  "supportAmount": [
    {
      "year": 2006,
      "amount": 1732
    },
    {
      "year": 2014,
      "amount": 8015
    }
  ]
}
```
---
### Test 코드 실행
> Acceptance Test, Unit Test

1. `application.properties`의 `hibernate` logging level "TRACE"로 변경

```properties
# hibernate logging level
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```

2. logback.xml 설정 변경

> INFO -> DEBUG
```xml
<logger name="com.pretest.kakaopay" level="INFO"/>
```


3. IntelliJ 혹은 STS IDE를 사용하여 JUnit 테스트 코드 실행

---




            
            