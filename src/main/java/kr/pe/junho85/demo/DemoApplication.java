package kr.pe.junho85.demo;

import kr.pe.junho85.demo.service.BookService;
import kr.pe.junho85.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        var app = new SpringApplication(DemoApplication.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!!"));
        });
        app.run(args);
    }

}
