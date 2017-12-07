package com.demo.study.java8;

public interface Defaultable {
	//接口允许默认方法
	default String notRequired(){
		return "Default method impl";
	}
}
