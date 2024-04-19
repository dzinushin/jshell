package dz.example.jshelldemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JshellDemoApplication {

	public static final Logger log = LoggerFactory.getLogger(JshellDemoApplication.class);

	public static void main(String[] args) {
		bootstrap(args);
	}

	public static ApplicationContext bootstrap(String[] args) {
		log.info("Starting application");
		return SpringApplication.run(JshellDemoApplication.class, args);
	}

}
