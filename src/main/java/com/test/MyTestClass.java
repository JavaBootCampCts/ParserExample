package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.parserUtil.UniversalParser;

public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// XmlParser parser = new XmlParser();
		// String output = parser.parseInputWithParser("gsdfjkahdfjk",
		// "XmlParser");
		// System.out.println(output);
		// output = parser
		// .parseInputWithParser("gsdfjkahdfjk", "JASONParser");
		// System.out.println(output);
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"beans.xml");
		UniversalParser parser = (UniversalParser) applicationContext
				.getBean("XmlParserBean");
		System.out.println(parser.parseInput("dgfhdk"));
		parser = (UniversalParser) applicationContext
				.getBean("JASONParserBean");
		System.out.println(parser.parseInput("dghkaf"));

		((ConfigurableApplicationContext) applicationContext).close();
	}

}
