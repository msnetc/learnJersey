package cn.mobilemd;

import cn.mobilemd.service.TestService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HimalayanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HimalayanApplication.class, args);
		PropertyConfigurator.configure("log4j.properties");
		Logger logger = Logger.getLogger(TestService.class);
		logger.error("debug");
	}
}
