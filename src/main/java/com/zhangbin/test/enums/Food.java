package com.zhangbin.test.enums;

public interface Food {
	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO;

		@Override
		public String getInfo() {
			return "this is from the enum in a interface which implement a methend";
		}
	}

	enum Dessert implements Food {
		FRUIT, CAKE, GELATO;

		@Override
		public String getInfo() {
			return "this is from the enum in a interface which implement a methend";
		}
	}
	
	String getInfo();
}
