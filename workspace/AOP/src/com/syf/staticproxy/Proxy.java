package com.syf.staticproxy;

//代理类
class Proxy implements Interface {
	private Interface subject;

	public Proxy(Interface subject) {
		this.subject = subject;
	}

	public void request() {
		System.out.println("PreProcess");
		subject.request();
		System.out.println("PostProcess");
	}
}
