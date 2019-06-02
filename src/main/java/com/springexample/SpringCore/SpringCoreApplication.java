package com.springexample.SpringCore;

import com.springexample.SpringCore.POJOs.SequenceGenerator;
import com.springexample.SpringCore.POJOs.shop.Battery;
import com.springexample.SpringCore.POJOs.shop.Disk;
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
		System.out.println();

		SequenceGenerator seqGenerator = (SequenceGenerator) context.getBean("seqGeneratorConstructor");
		System.out.println(seqGenerator.getSequence());
		System.out.println(seqGenerator.getSequence());
		System.out.println(seqGenerator.getSequence());
		System.out.println(seqGenerator.getSequence());
		System.out.println();

		ApplicationContext productsContest = new GenericXmlApplicationContext("products.xml");
		Battery battery = (Battery) productsContest.getBean("battery");
		Disk disk = (Disk) productsContest.getBean("disk");
		System.out.println(battery);
		System.out.println(disk);
		System.out.println();

		SequenceGenerator generatorSeqConstructor1 = (SequenceGenerator) context.getBean("sequenceConstructor1");
		System.out.println(generatorSeqConstructor1.getSequence());
		System.out.println(generatorSeqConstructor1.getSequence());
		System.out.println();

		SequenceGenerator generatorSeqConstructor2 = (SequenceGenerator) context.getBean("sequenceConstructor2");
		System.out.println(generatorSeqConstructor2.getSequence());
		System.out.println(generatorSeqConstructor2.getSequence());
		System.out.println();

		ApplicationContext dateContext = new GenericXmlApplicationContext("dates.xml");
		SequenceGenerator dateGenerator = (SequenceGenerator) dateContext.getBean("sequenceGenerator");
		System.out.println(dateGenerator.getSequenceGenerator());
		System.out.println();

		ApplicationContext listContext = new GenericXmlApplicationContext("collections.xml");
		SequenceGenerator listGenerator = (SequenceGenerator) listContext.getBean("seqListGenerator");
		System.out.println(listGenerator.getSequenceListGenerator());
		System.out.println();

		ApplicationContext mapContext = new GenericXmlApplicationContext("collections.xml");
		SequenceGenerator mapGenerator = (SequenceGenerator) mapContext.getBean("seqMapGenerator");
		System.out.println(mapGenerator.getSequenceMapGenerator());

	}

}
