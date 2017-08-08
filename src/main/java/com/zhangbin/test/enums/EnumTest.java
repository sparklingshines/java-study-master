package com.zhangbin.test.enums;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Color.RED);
		System.out.println(Color.RED.ordinal());
		System.out.println(Color.RED.name());
		System.out.println(Color.RED.toString());
		System.out.println("====================");
		System.out.println(Colors.GREEN);
		System.out.println(Colors.GREEN.ordinal());
		System.out.println(Colors.GREEN.name());
		System.out.println(Colors.GREEN.toString());
		System.out.println(Colors.GREEN.getName()+"|"+Colors.GREEN.getIndex());
		System.out.println("====================");
		System.out.println(ColorWithImplement.GREEN);
		System.out.println(ColorWithImplement.GREEN.ordinal());
		System.out.println(ColorWithImplement.GREEN.name());
		System.out.println(ColorWithImplement.GREEN.toString());
		System.out.println(ColorWithImplement.GREEN.getName()+"|"+Colors.GREEN.getIndex());
		ColorWithImplement.GREEN.print();
		System.out.println(ColorWithImplement.GREEN.getInfo());
		System.out.println("====================");
		System.out.println(Food.Coffee.CAPPUCCINO);
		System.out.println(Food.Coffee.CAPPUCCINO.ordinal());
		System.out.println(Food.Coffee.CAPPUCCINO.name());
		System.out.println(Food.Coffee.CAPPUCCINO.toString());
		System.out.println("====================");
		System.out.println(Food.Dessert.FRUIT);
		System.out.println(Food.Dessert.FRUIT.ordinal());
		System.out.println(Food.Dessert.FRUIT.name());
		System.out.println(Food.Dessert.FRUIT.toString());
		System.out.println(Food.Dessert.FRUIT.getInfo());
		System.out.println("====================");
		Foods foods = new Foods();
		System.out.println(foods.getInfo());
	}

}
