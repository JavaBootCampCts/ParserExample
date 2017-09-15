package com.parserUtil;

import com.interfaces.Parser;

public class XmlParserImpl implements Parser {

	public String parse(String input) {
		// TODO Auto-generated method stub
		String output = "<xml>" + input + "</xml>";
		return output;
	}

}
