package in.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdpipelineDemoApplication {
	@GetMapping
	public String message() {
		return "Welcome to GitHub Actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdpipelineDemoApplication.class, args);
	}

}
