package com.syf.dynamicproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// 生成Proxy的class文件
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 获取动态代理类
		Class<?> proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(), IHello.class);
		// 获得代理类的构造函数，并传入参数类型InvocationHandler.class
		Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
		// 通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
		IHello iHello = (IHello) constructor.newInstance(new HWInvocationHandler(new Hello()));
		// 通过代理对象调用目标方法
		iHello.sayHello();
	}
}
