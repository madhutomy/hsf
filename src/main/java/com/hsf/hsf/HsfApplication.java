package com.hsf.hsf;

import com.hsf.hsf.beans.SequenceGenerator;
import com.hsf.hsf.config.SequenceGeneratorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class HsfApplication {

	public static void main(String[] args) {

		//SpringApplication.run(HsfApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfig.class);
		SequenceGenerator generator = context.getBean(SequenceGenerator.class);

		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
	}

}
