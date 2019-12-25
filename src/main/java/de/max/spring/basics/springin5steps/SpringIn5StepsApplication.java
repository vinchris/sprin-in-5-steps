package de.max.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are beans? Beans are managed instances, managed by the
	// ApplicationContext, they are marked for the application context with the
	// @Component annotation

	// What are the dependencies of a bean? The necessary components it needs to
	// function, which we inject with the @Autowired annotation

	// Where to search for beans? The spring framework searches in the general
	// package de.max.spring.basics.springin5steps (it does a component scan in this
	// particular package). Springboot will scan the general package where the main
	// application file (with the @SpringBootApplication annotation) is found
	
	/** 
	 * The Spring Framework does the following when starting the app: 
	 * 1. It searches for components
	 * 2. It created instances of these beans
	 * 3. It autowires dependencies by dependency injection
	 * @param args
	 */

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 3);
		System.out.println(result);
	}

}
