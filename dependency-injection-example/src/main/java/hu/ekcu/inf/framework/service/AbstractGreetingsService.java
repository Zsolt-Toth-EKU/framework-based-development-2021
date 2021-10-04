package hu.ekcu.inf.framework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@RequiredArgsConstructor
public abstract class AbstractGreetingsService implements GreetingsService {

    private final PrintStream stream;

    @Override
    public final void sayHello(String name) {
        this.stream.println(String.format("Hello %s", name));
    }
}
