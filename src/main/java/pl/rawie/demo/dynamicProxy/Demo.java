package pl.rawie.demo.dynamicProxy;

public class Demo {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.add(1, 4);
        service.sub(5, 2);

        service = ServiceProxy.proxy(service);
        service.add(1, 4);
        service.sub(5, 2);
    }
}
