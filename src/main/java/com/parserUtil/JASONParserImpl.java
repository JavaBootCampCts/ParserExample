package com.parserUtil;

import com.interfaces.Parser;

public class JASONParserImpl implements Parser {

	public String parse(String input) {
		// TODO Auto-generated method stub
		String output = "{" + input + "}";
		return output;
	}
}
