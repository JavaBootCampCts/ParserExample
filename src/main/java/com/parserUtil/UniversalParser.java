package com.parserUtil;

import com.interfaces.Parser;

public class UniversalParser {
	Parser parser;

	public UniversalParser(Parser parser) {
		this.parser = parser;
	}

	public String parseInput(String input) {
		return parser.parse(input);
	}

	// public String parseInputWithParser(String input, String parserType) {
	// String output = null;
	// ApplicationContext applicationContext = new
	// FileSystemXmlApplicationContext(
	// "beans.xml");
	// parser = getParserObject(applicationContext, parserType);
	// output = parser.parse(input);
	// ((ConfigurableApplicationContext) applicationContext).close();
	// return output;
	// }
	//
	// private Parser getParserObject(ApplicationContext applicationContext,
	// String parserType) {
	// // TODO Auto-generated method stub
	// Parser parser = (Parser) applicationContext.getBean(parserType);
	// return parser;
	// }
}