package hu.ekcu.inf.framework.service;

import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class DefaultGreetingsService extends AbstractGreetingsService{

    public DefaultGreetingsService(PrintStream stream) {
        super(stream);
    }
}
