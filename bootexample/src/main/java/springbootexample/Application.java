package springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// {
// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
// }=@SpringBootApplication
@SpringBootApplication
public class Application {

	public static void main( final String[] args ) {

		SpringApplication.run( Application.class, args );
	}
}
