package com.sky.locale.demo.formatter.ann;

import java.lang.annotation.*;

/**
 * Created by gantianxing on 2017/6/17.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface MyDateFormat {

}
