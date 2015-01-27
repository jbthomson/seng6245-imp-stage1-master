package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class PlusExpression extends Expression {
	private final Expression left;
	private final Expression right;
	
	public PlusExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public IntegerValue interpret() {
		return left.interpret().plus(right.interpret());
	}

}
