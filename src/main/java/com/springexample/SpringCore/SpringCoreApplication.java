package com.springexample.SpringCore;

import com.springexample.SpringCore.POJOs.SequenceGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}

}
