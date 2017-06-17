package com.sky.locale.demo.formatter.factory;

import com.sky.locale.demo.formatter.MyDateFormatter;
import com.sky.locale.demo.formatter.ann.MyDateFormat;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gantianxing on 2017/6/17.
 */
public class MyDateFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<MyDateFormat> {
    private static final Set<Class<?>> FIELD_TYPES;

    static {
        Set<Class<?>> fieldTypes = new HashSet<Class<?>>(4);
        fieldTypes.add(Date.class);
        FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
    }

    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(MyDateFormat myDateFormat, Class<?> aClass) {
        return getFormatter(myDateFormat, aClass);
    }

    @Override
    public Parser<?> getParser(MyDateFormat myDateFormat, Class<?> aClass) {
        return getFormatter(myDateFormat, aClass);
    }

    protected Formatter<Date> getFormatter(MyDateFormat annotation, Class<?> fieldType) {
        MyDateFormatter formatter = new MyDateFormatter();
        return formatter;
    }
}
