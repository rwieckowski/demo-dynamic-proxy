package pl.rawie.demo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {
    private Object service;

    public static <T> T proxy(T service) {
        return (T) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new ServiceProxy(service));
    }

    public ServiceProxy(Object service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("proxy: %s(%s, %s)", method.getName(), args[0].toString(), args[1].toString()));
        return method.invoke(service, args);
    }
}
