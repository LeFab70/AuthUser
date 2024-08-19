package login.and.registration.login.and.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginAndRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAndRegistrationApplication.class, args);
	}

}
