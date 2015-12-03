package com.zq.test;
/**
 * @author  作者: 郑强 
 * @date 创建时间: 2015年12月1日 下午3:07:52 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
public enum Color {

	RED("红色", 1), GREEN("绿色", 2), WHITE("白色", 3), YELLO("黄色", 4), BLACK("黑色",5);
	
	/**
	 * 成员变量
	 */
	private String name;
	private int index;
	
	/**
	 * 构造方法
	 * @param name
	 * @param index
	 */
	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name() + "_" + this.index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public static void main(String [] args){
		System.out.println(Color.WHITE.index + ":" + Color.WHITE.name);
		System.out.println(Color.BLACK.index + ":" + Color.BLACK.name);
		System.out.println(Color.RED.toString());
	}
	
}
