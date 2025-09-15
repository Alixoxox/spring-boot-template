package starter;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {Dotenv dotenv = Dotenv.load();
		System.setProperty("MySqlUrl", dotenv.get("MySqlUrl"));
		System.setProperty("DbUsername", dotenv.get("DbUsername"));
		System.setProperty("DbPassword", dotenv.get("DbPassword"));
		SpringApplication.run(Application.class, args);
	}

}
