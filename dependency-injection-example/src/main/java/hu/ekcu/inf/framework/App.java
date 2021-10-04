package hu.ekcu.inf.framework;

import hu.ekcu.inf.framework.service.GreetingsService;
import hu.ekcu.inf.framework.service.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    private ApplicationContext context;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        GreetingsService service = context.getBean(GreetingsService.class);
        service.sayHello("World");
    }
}
