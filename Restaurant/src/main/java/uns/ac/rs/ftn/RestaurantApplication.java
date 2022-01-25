package uns.ac.rs.ftn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class RestaurantApplication {
	public RestaurantApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

}
