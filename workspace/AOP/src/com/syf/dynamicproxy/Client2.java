package com.syf.dynamicproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Client2 {
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
	       //生成$Proxy0的class文件
	       System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
	       IHello  ihello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),  //加载接口的类加载器
	               new Class[]{IHello.class},      //一组接口
	               new HWInvocationHandler(new Hello())); //自定义的InvocationHandler
	       ihello.sayHello();
	   }
}
