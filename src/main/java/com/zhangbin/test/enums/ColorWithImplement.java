package com.zhangbin.test.enums;

public enum ColorWithImplement implements Behaviour {
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);  
    // 成员变量  
	private String name;
	private int index;

	// 构造方法
	private ColorWithImplement(String name, int index) {  
        this.name = name;  
        this.index = index;  
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

	@Override
	public void print() {
		System.out.println("this is from enum with implement class");
	}

	@Override
	public String getInfo() {
		System.out.println("this is from enum with implement class");
		return "enum inplements interface";
	}
}
