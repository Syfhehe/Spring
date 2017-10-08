package com.syf.staticproxy;

public class Client {
	public static void main(String args[]) {
		Target subject = new Target();
		Proxy p = new Proxy(subject);
		p.request();
	}
}
