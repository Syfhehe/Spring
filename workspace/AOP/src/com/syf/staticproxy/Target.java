package com.syf.staticproxy;

//委托类
class Target implements Interface {
	public void request() {
		System.out.println("request");
	}
}
