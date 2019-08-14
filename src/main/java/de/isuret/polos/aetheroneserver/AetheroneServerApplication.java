package de.isuret.polos.aetheroneserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class AetheroneServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AetheroneServerApplication.class, args);
	}

}
