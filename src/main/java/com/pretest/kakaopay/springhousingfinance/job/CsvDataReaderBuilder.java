package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
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

public class CsvDataReaderBuilder {
    private Resource resource;
    private int skipLineNum;
    private String[] names;

    private CsvDataReaderBuilder() {
    }

    public static CsvDataReaderBuilder init() {
        return new CsvDataReaderBuilder();
    }

    public CsvDataReaderBuilder resource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public CsvDataReaderBuilder lineToSkip(int skipLineNum) {
        this.skipLineNum = skipLineNum;
        return this;
    }

    public CsvDataReaderBuilder names(String[] names) {
        this.names = names;
        return this;
    }

    public FlatFileItemReader<CsvDataDto> build() {
        FlatFileItemReader<CsvDataDto> reader = new FlatFileItemReader();
        reader.setResource(this.resource);
        reader.setLinesToSkip(this.skipLineNum);
        reader.setLineMapper(generateLineMapper(this.names));

        return reader;
    }

    private LineMapper<CsvDataDto> generateLineMapper(String[] values) {
        return new DefaultLineMapper<CsvDataDto>() {
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

    private FieldSetMapper<CsvDataDto> generateFieldSetMapper() {
        return new BeanWrapperFieldSetMapper<CsvDataDto>() {
            {
                setCustomEditors(generateEditors());
                setTargetType(CsvDataDto.class);
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
