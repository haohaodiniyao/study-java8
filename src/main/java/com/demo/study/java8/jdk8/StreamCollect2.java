package com.demo.study.java8.jdk8;

import java.util.Arrays;
import java.util.List;

public class StreamCollect2 {

	public static void main(String[] args) {
		//Stream.collect() using Supplier, Accumulator and Combiner
		//供应-收集-聚合
		List<String> list = Arrays.asList("tom","jack","grace");
		String result = list.parallelStream().collect(StringBuilder::new
				,(response,element) -> response.append("###").append(element)
				,(response1,response2)->response1.append(",").append(response2.toString()))
		.toString();
		System.out.println("Result:"+result);
	}

}
