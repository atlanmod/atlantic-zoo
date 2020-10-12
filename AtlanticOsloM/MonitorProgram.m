module MonitorProgram {

	type LocatedElement {
		Location_Att : Text;
	};

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type Structure : NamedElement {
		Variables_ContRef : VariableDeclaration*;
	};

	type ProcContainerElement : Structure {
		Procedures_ContRef : Procedure*;
	};

	type Program : ProcContainerElement {
		Monitors_ContRef : Monitor*;
	};

	type Monitor : ProcContainerElement {
		Program_Ref : Program;
	};

	type Procedure : Structure {
		Container_Ref : ProcContainerElement;
		Parameters_ContRef : Parameter*;
		Statements_ContRef : Statement*;
	};

	type VariableDeclaration : NamedElement {
		Type_Ref : Type;
		InitialValue_ContRef : Expression?;
		Structure_Ref : Structure;
	};

	type Parameter : VariableDeclaration {
		Direction_Att : Direction;
		Procedure_Ref : Procedure;
	};

	type Direction {"in", "out"};

	type Type : NamedElement;

	type Expression : LocatedElement;

	type VariableExp : Expression {
		Declaration_Ref : VariableDeclaration;
	};

	type PropertyCallExp : Expression {
		Source_ContRef : Expression;
		Name_Att : Text;
	};

	type OperatorCallExp : PropertyCallExp {
		Right_ContRef : Expression;
	};

	type AttributeCallExp : PropertyCallExp;

	type ProcedureCallExp : PropertyCallExp {
		Arguments_ContRef : Expression*;
	};

	type LiteralExp : Expression;

	type BooleanExp : LiteralExp {
		Symbol_Att : Logical;
	};

	type IntegerExp : LiteralExp {
		Symbol_Att : Integer32;
	};

	type Statement : LocatedElement;

	type AssignmentStat : Statement {
		Target_ContRef : VariableExp;
		Value_ContRef : Expression;
	};

	type ConditionalStat : Statement {
		Condition_ContRef : Expression;
		ThenStats_ContRef : Statement+;
		ElseStats_ContRef : Statement*;
	};

	type WhileStat : Statement {
		Condition_ContRef : Expression;
		DoStats_ContRef : Statement+;
	};

	type ExpressionStat : Statement {
		Expression_ContRef : Expression;
	};
}