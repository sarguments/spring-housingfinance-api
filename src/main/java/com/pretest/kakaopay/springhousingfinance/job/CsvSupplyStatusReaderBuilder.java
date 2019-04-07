package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.dto.MonthlySupplyStatusDto;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.core.io.Resource;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

public class CsvSupplyStatusReaderBuilder {
    private Resource resource;
    private int skipLineNum;
    private String[] names;

    private CsvSupplyStatusReaderBuilder() {
    }

    public static CsvSupplyStatusReaderBuilder init() {
        return new CsvSupplyStatusReaderBuilder();
    }

    public CsvSupplyStatusReaderBuilder resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public CsvSupplyStatusReaderBuilder lineToSkip(int skipLineNum) {
        this.skipLineNum = skipLineNum;
        return this;
    }

    public CsvSupplyStatusReaderBuilder names(String[] names) {
        this.names = names;
        return this;
    }

    public FlatFileItemReader<MonthlySupplyStatusDto> build() {
        FlatFileItemReader<MonthlySupplyStatusDto> reader = new FlatFileItemReader();
        reader.setResource(this.resource);
        reader.setLinesToSkip(this.skipLineNum);
        reader.setLineMapper(generateLineMapper(this.names));

        return reader;
    }

    private LineMapper<MonthlySupplyStatusDto> generateLineMapper(String[] values) {
        return new DefaultLineMapper<MonthlySupplyStatusDto>() {
            {
                setLineTokenizer(generateLineTokenizer(values));
                setFieldSetMapper(generateFieldSetMapper());
            }
        };
    }

    private LineTokenizer generateLineTokenizer(String[] values) {
        return new DelimitedLineTokenizer() {
            {
                setNames(values);
            }
        };
    }

    private FieldSetMapper<MonthlySupplyStatusDto> generateFieldSetMapper() {
        return new BeanWrapperFieldSetMapper<MonthlySupplyStatusDto>() {
            {
                setCustomEditors(generateEditors());
                setTargetType(MonthlySupplyStatusDto.class);
            }
        };
    }

    private Map<Object, PropertyEditor> generateEditors() {
        Map<Object, PropertyEditor> editors = new HashMap<>();
        IntValueEditor intEditor = new IntValueEditor();
        editors.put(Integer.class, intEditor);

        return editors;
    }

}
