package me.dfzhang.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Header
 * 
 * @Version v1.0
 * @Date 2017年12月6日 上午12:56:57
 * @Author 854154025@qq.com
 * 
 * @Description TODO
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.ANNOTATION_TYPE)
public @interface Header {
	int column();

	String key();

	String value();

	Style style() default @Style();
}
