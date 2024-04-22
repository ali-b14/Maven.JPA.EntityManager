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
        SpringApplication.run(Main.class, args);
    }

@Bean
    CommandLineRunner commandLineRunner(CdRepository cdRepository){
        return args -> {

            Cd classic = new Cd("NY", "Brooklyn", "1958", "Trank Pinatra", 15.99F);
            cdRepository.save(classic);
            System.out.println(classic);
        };
    }
}
