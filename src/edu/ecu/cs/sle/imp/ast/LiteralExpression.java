package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class LiteralExpression extends Expression {
	private final Literal lit;
	
	public LiteralExpression(Literal l) {
		lit = l;
	}
	
	@Override
	public IntegerValue interpret() {
		return lit.interpret();
	}

}
