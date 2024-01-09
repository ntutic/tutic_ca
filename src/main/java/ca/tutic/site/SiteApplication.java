package ca.tutic.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

}


// WHy is my application not rendering css?

// https://stackoverflow.com/questions/39192777/why-is-my-application-not-rendering-css
//	You need to add the following to your application.properties file:
//
//		spring.mvc.view.prefix=/WEB-INF/jsp/
