package pl.rawie.demo.dynamicProxy;

public class ServiceImpl implements Service {
    @Override
    public int add(int a, int b) {
        System.out.println(String.format("service: %d + %d = %d", a, b, a + b));
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println(String.format("service: %d - %d = %d", a, b, a - b));
        return a - b;
    }
}
