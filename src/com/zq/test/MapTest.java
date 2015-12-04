package com.zq.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 作者: 郑强
 * @date 创建时间: 2015年11月8日 下午10:44:50
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class MapTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "张三");
		map.put("2", "李四");
		// System.err.println(map.get("1"));

		// Set set = map.entrySet();
		// for(Object obj : set){
		// System.err.println("obj是什么？" + obj);
		//
		// Map.Entry entry = (Entry) obj;
		// System.out.println("key:" + entry.getKey() + "," + "value:" +
		// entry.getValue());
		// }
		for (Object obj : map.entrySet()) {
			System.err.println("obj是什么？-->" + obj);

			Map.Entry entry = (Entry) obj;
			System.out.println("key:" + entry.getKey() + "," + "value:" + entry.getValue());
		}
	}
}
