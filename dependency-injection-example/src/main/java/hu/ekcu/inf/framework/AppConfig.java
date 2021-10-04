package hu.ekcu.inf.framework;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.io.PrintStream;

@SpringBootConfiguration
public class AppConfig {

    @Bean
    public PrintStream stdout(){
        return System.out;
    }

    @Bean
    public PrintStream stderr(){
        return System.err;
    }
}
