package com.zq.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Administrator
 *
 */
public class MapTest1 {

	public static final int ONE = 1;
	public static final int TWO = 2;
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aq");
		map.put(2, "bw");
		map.put(3, "ce");
		
		for(Object obj : map.entrySet()){
			System.out.println(obj);
		}
		System.out.println("-----------------------------------------------------------------------");
		for(Object obj : map.entrySet()){
			@SuppressWarnings("unchecked")
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) obj;
			System.out.println(entry.getKey().intValue() +" .. "+ entry.getValue().substring(entry.getValue().length()-ONE));
		}
		System.out.println("-----------------------------------------------------------------------");
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey().intValue() +" .. "+ entry.getValue());
		}
		
	}

}
