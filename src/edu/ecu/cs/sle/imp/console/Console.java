package edu.ecu.cs.sle.imp.console;

import java.util.Scanner;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class Console {

	private final Interpreter interpreter;
	
	public Console() {
		interpreter = new Interpreter();
	}
	
	public void repl() {
		System.out.println("Welcome to the IMP console!");
		System.out.println("Type each command on its own line, type #quit to exit");
		
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			System.out.println("IMP> ");
			String cmd = in.nextLine();
			if (cmd.trim().equalsIgnoreCase("#quit")) {
				break;
			}
			IntegerValue iv = interpreter.interpret(cmd);
			System.out.println("result = " + iv.getIntValue());
		}
		
		System.out.println("Exiting...");
		in.close();
	}
	
	public static void main(String[] args) {
		Console c = new Console();
		c.repl();
	}
}
