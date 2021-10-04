package hu.ekcu.inf.framework.service;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public void sayHello(String name) {
        System.out.println(String.format("Hello %s", name));
    }
}
