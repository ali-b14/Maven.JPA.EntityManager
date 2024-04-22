package entities;

import com.apple.eawt.Application;
import entities.Cd;
import entities.CdRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

@Bean
    CommandLineRunner commandLineRunner(CdRepository cdRepository){
        return args -> {
            Cd classic = new Cd("NewYork", "BigApple", "1956", "Frank Sinatra", 39.99F);
            System.out.println(classic);
        };
    }
}
