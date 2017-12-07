package com.demo.study.java8;
/**
 * 函数式接口
 * 默认方法和静态方法
 * 抽象方法(静态方法)必须要求实现，而默认方法则没有这个要求(可以覆盖)
 * @author yaokai
 *
 */
public interface FunctionalDefaultMethods {
//	void method1();
//	void method2();
	default void defaultMethod(){
		
	};
}
