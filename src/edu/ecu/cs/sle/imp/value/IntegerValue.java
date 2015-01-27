package edu.ecu.cs.sle.imp.value;

public class IntegerValue {
	private Integer intValue;

	public IntegerValue(Integer iv) {
		intValue = iv.intValue();
	}
	
	public Integer getIntValue() {
		return intValue;
	}
	
	public IntegerValue plus(IntegerValue iv) {
		return new IntegerValue(intValue + iv.getIntValue());
	}

	public IntegerValue minus(IntegerValue iv) {
		return new IntegerValue(intValue - iv.getIntValue());
	}

	public IntegerValue times(IntegerValue iv) {
		return new IntegerValue(intValue * iv.getIntValue());
	}

	public IntegerValue div(IntegerValue iv) {
		return new IntegerValue(intValue / iv.getIntValue());
	}
}
