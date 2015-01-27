package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class MinusExpression extends Expression {
	private final Expression left;
	private final Expression right;
	
	public MinusExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public IntegerValue interpret() {
		return left.interpret().minus(right.interpret());
	}

}
