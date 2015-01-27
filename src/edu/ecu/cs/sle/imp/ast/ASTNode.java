package edu.ecu.cs.sle.imp.ast;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public abstract class ASTNode extends beaver.Symbol {
	public abstract IntegerValue interpret();
}
