package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class DivExpression extends Expression {
	private final Expression left;
	private final Expression right;
	
	public DivExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public IntegerValue interpret() {
		return left.interpret().div(right.interpret());
	}

}
