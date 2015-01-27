package edu.ecu.cs.sle.imp.parser;

import java.io.IOException;
import java.io.StringReader;

import beaver.Parser;
import edu.ecu.cs.sle.imp.ast.Expression;

public class ParserUtil {

	public static Expression parseExpression(String s) {
		ExpressionParser parser = new ExpressionParser();
		ExpressionScanner scanner = new ExpressionScanner(new StringReader(s));
		try {
			Expression expr = (Expression) parser.parse(scanner);
			return expr;
		} catch (Parser.Exception | IOException e) {
			System.err.println("Error, could not parse expression, make sure your syntax is correct: " + e.toString());
		}
		
		return null;
	}
}
