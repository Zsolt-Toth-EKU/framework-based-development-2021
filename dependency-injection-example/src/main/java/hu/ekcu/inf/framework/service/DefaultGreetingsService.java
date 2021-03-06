package hu.ekcu.inf.framework.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service("defaultGreetingsService")
public class DefaultGreetingsService extends AbstractGreetingsService{

    public DefaultGreetingsService(@Qualifier("stdout") PrintStream stream) {
        super(stream);
    }
}
