package com.webapp.app;

import com.webapp.app.Singleton.ConcurrentSingleton;
import com.webapp.app.Singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppApplication.class, args);
		ConcurrentSingleton concurrentSingleton=ConcurrentSingleton.getInstance();
		Singleton singleton=Singleton.SINGLETON;
		singleton.print("Hello");

	}

}
