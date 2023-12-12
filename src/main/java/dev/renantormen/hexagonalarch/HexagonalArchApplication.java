package dev.renantormen.hexagonalarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableFeignClients
public class HexagonalArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalArchApplication.class, args);
	}

}
