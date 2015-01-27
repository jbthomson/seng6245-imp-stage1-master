package edu.ecu.cs.sle.imp.interpreter;

import edu.ecu.cs.sle.imp.ast.Expression;
import edu.ecu.cs.sle.imp.parser.ParserUtil;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class Interpreter {

	public IntegerValue interpret(String cmd) {
		Expression expr = ParserUtil.parseExpression(cmd);
		if (expr != null) {
			IntegerValue iv = expr.interpret();
			return iv;
		}
		return new IntegerValue(0); // NOTE: This is a bad idea, we will revisit this...
	}
}
