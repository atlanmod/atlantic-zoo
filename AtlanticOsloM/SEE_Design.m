module SEEDesign {

	type LogFile {
		File_Att : Text;
		Instance_Ref : LogFile;
		Logger_Ref : Logger;
	};

	type Logger {
		Instance_Ref : Logger;
		Expression_Ref : Expression;
		LogFile_Ref : LogFile;
	};

	type Expression {
		LoggingOn_Att : Logical;
		Logger_Ref : Logger;
	};

	type Literal : Expression {
		Value_Att : Integer32;
	};

	type VariableExpression : Literal {
		Name_Att : Text;
	};

	type NumberExpression : Literal;

	type UnaryOperator : Expression {
		Operand_ContRef : Expression;
	};

	type UnaryPlusOp : UnaryOperator;

	type UnaryMinusOp : UnaryOperator;

	type BinaryOperator : Expression {
		Operand1_ContRef : Expression;
		Operand2_ContRef : Expression;
	};

	type PlusOperator : BinaryOperator;

	type MinusOperator : BinaryOperator;
}