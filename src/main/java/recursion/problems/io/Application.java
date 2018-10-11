package recursion.problems.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ComponentScan(value = "recursion.problems.io")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		log.info(" | Recursion study app started!!!");
	}
}
