package hu.ekcu.inf.framework.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service("errorGreetingsService")
public class ErrorGreetingsService extends AbstractGreetingsService{

    public ErrorGreetingsService(@Qualifier("stderr") PrintStream stream) {
        super(stream);
    }
}
