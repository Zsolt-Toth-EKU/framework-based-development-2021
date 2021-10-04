package hu.ekcu.inf.framework;

import hu.ekcu.inf.framework.service.GreetingsService;
import hu.ekcu.inf.framework.service.GreetingsServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GreetingsService service = new GreetingsServiceImpl();
        service.sayHello("World");
    }
}
