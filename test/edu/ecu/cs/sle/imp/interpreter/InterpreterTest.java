package edu.ecu.cs.sle.imp.interpreter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import edu.ecu.cs.sle.imp.value.IntegerValue;


public class InterpreterTest {

	private static Interpreter interpreter;
	

	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testMultiply() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 2, iv.getIntValue().intValue());
	}	
	
	
	@Test
	public void testDivide() {
		IntegerValue iv = interpreter.interpret("-8 / 4");
		assertEquals("-8 / 4", -2, iv.getIntValue().intValue());
	
	}

	@Test
	public void testMinus() {
		IntegerValue iv = interpreter.interpret("5 - 2");
		assertEquals("5 - 2", 3, iv.getIntValue().intValue());
	
		
	}


	@Test
	public void testAddition() {
		IntegerValue iv = interpreter.interpret("6 + 12");
		assertEquals("6 + 12", 18, iv.getIntValue().intValue());
	}
	

	
}
