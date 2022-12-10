package by.issoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true)
public class MovieTicketingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieTicketingSystemApplication.class, args);
    }
}
