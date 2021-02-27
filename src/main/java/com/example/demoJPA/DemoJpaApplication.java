package com.example.demoJPA;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJpaApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
    
//    @Bean
//    public Docket documentation(){
//        return  new Docket(DocumentationType.SWAGGER_2).select()
//               
//      .paths(PathSelectors.any())                     
//      .build();
//    }
//    
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("users-public-api")
//                .select().apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any()).build().pathMapping("/")
//                .enableUrlTemplating(false);
//    }
}
