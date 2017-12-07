package com.demo.study.java8;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
/**
 * java8新特性
 * @author yaokai
 *
 */
public class Test {

	public static void main(String[] args) {
		//参数类型(String e)
		//lambda引用成员变量和局部变量，如果变量不是final，隐含被转为final
		String separator = ",";
		Arrays.asList("a","b","c").forEach((String e) -> {
			System.out.println(e + separator);
		});
		//lambda返回值
		List<String> list = Arrays.asList("d","a","b");
		list.sort((e1,e2)-> e1.compareTo(e2));
		System.out.println("sort:"+list.toString());
		
		Arrays.asList("a","b","d").sort((e1,e2)->{
			int result = e1.compareTo(e2);
			return result;
		});
		//函数式接口(具有一个方法的普通接口)
		
		Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
		System.out.println(defaultable.notRequired());
		
		defaultable = DefaultableFactory.create(OverridableImpl::new);
		System.out.println(defaultable.notRequired());
		//Base64
		
		String text = "Base64 finally in Java 8";
		String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
		System.out.println(encoded);
	}

}
