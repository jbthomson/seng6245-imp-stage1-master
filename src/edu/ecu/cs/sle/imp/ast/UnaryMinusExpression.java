package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class UnaryMinusExpression extends Expression {
	private final Expression operand;
	
	public UnaryMinusExpression(Expression e) {
		operand = e;
	}
	
	@Override
	public IntegerValue interpret() {
		return operand.interpret().times(new IntegerValue(-1));
	}

}
