package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class IntegerLiteral extends Literal {
	private final Integer intValue;
	
	public IntegerLiteral(Integer iv) {
		intValue = iv;
	}
	
	@Override
	public IntegerValue interpret() {
		return new IntegerValue(intValue);
	}
}
