package com.buleocean_health.springboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果颜色注解
 * @author huyanqiu
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	/**
	 * 颜色枚举
	 */
	public enum Color{RED, BULE, GREEN};
	/**
	 * 颜色属性
	 */
	Color fruitColor() default Color.GREEN;
}
