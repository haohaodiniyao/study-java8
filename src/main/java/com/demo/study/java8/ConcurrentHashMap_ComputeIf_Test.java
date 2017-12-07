package com.demo.study.java8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * java8
 * computeIfAbsent
 * computeIfPresent
 */
public class ConcurrentHashMap_ComputeIf_Test 
{
	//
	static String genVal(String val){
		System.out.println("call genVal("+val+")");
		return val;
	}
	//遍历缓存
	static void foreachMap(Map<String,String> maps){
		for(String key:maps.keySet()){
			System.out.println("key->"+key+",val->"+maps.get(key));
		}
	}
	
    public static void main( String[] args )
    {
        Map<String,String> cache = new ConcurrentHashMap<String,String>();
        foreachMap(cache);
        String str = "hello";
        //健值不存在，则计算，并存入
        cache.computeIfAbsent(str,key -> genVal(key));
        foreachMap(cache);
        cache.computeIfAbsent(str,key -> genVal(key));
        foreachMap(cache);
        //健值存在，则重新计算
        cache.computeIfPresent("world",(key,val) -> genVal(key));
        foreachMap(cache);
    }
}
