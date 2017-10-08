package com.syf.dynamicproxy;

//委托类
class Hello implements IHello {
	public void sayHello() {
		System.out.println("Hello world!!");
	}
}