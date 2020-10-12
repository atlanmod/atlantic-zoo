module Perceptory {

	type Process;

	type StopProcess : Process;

	type SkipProcess : Process;

	type Action : Process;

	type Construction : Process;

	type Instance : Process {
		Name_Att : Text;
	};

	type Assignment : Action {
		Variable_ContRef : Variable;
		Expression_ContRef : Expression;
	};

	type Input : Action {
		Channel_ContRef : Channel;
		Variable_ContRef : Variable;
	};

	type Output : Action {
		Channel_ContRef : Channel;
		Expression_ContRef : Expression;
	};

	type Sequence : Construction {
		Process_ContRef : Process;
	};

	type NormalSequence : Sequence;

	type ReplicatorSequence : Sequence {
		Replicator_ContRef : Replicator;
	};

	type Conditional : Construction {
		Choice_ContRef : Choice;
	};

	type NormalConditional : Conditional;

	type ReplicatorConditional : Conditional {
		Replicator_ContRef : Replicator;
	};

	type Loop : Construction {
		Boolean_ContRef : BooleanRef;
		Process_ContRef : Process;
	};

	type Parallel : Construction {
		Process_ContRef : Process;
	};

	type NormalParallel : Parallel;

	type ReplicatorParallel : Parallel {
		Replicator_ContRef : Replicator;
	};

	type Alternation : Construction {
		Alternative_ContRef : Alternative;
	};

	type NormalAlternation : Parallel;

	type ReplicatorAlternation : Parallel {
		Replicator_ContRef : Replicator;
	};

	type Choice {
		Boolean_ContRef : BooleanRef;
		Process_ContRef : Process;
	};

	type BooleanRef {
		Expression_ContRef : Expression;
	};

	type Alternative {
		Guard_ContRef : Guard;
		Process_ContRef : Process;
	};

	type Guard {
		Input_ContRef : Input;
	};

	type InputGuard : Guard;

	type BooleanGuard : Guard {
		Boolean_ContRef : BooleanRef;
	};

	type Replicator {
		Name_Att : Text;
		Base_ContRef : Base;
		Count_ContRef : Count;
	};

	type Base {
		Expression_ContRef : Expression;
	};

	type Count {
		Expression_ContRef : Expression;
	};

	type Type {
		PrimitiveType_ContRef : PrimitiveType;
		Expression_ContRef : Expression?;
	};

	type PrimitiveType {
		IsInt_Att : Logical;
		IsChan_Att : Logical;
	};

	type Literal {
		Integer_Att : Integer32;
	};

	type Element {
		Name_Att : Text;
		Subscript_ContRef : Subscript?;
	};

	type Subscript {
		Expression_ContRef : Expression;
	};

	type Variable {
		Element_ContRef : Element;
	};

	type Channel {
		Element_ContRef : Element;
	};

	type Operand;

	type VariableOPerand : Variable;

	type LiteralOperand : Literal;

	type ExpressionOperand : Expression;

	type Expression {
		Operand_ContRef : Operand;
	};

	type MonadicExpression : Expression {
		MonadicOperator_ContRef : MonadicOperator;
	};

	type DyadicExpression : Expression {
		OperandRight_ContRef : Operand;
		DyadicOperator_ContRef : DyadicOperator;
	};

	type SimpleExpression : Expression;

	type Specification : Process;

	type Declaration : Specification;

	type TypeDeclaration : Declaration {
		Type_ContRef : Type;
	};

	type IntDeclaration : Declaration {
		Name_Att : Text;
		Expression_ContRef : Expression;
	};

	type ValDeclaration : Declaration {
		Name_Att : Text;
		Expression_ContRef : Expression;
	};

	type Definition : Specification {
		Name_Att : Text;
		ProcedureBody_ContRef : ProcedureBody;
	};

	type Formal {
		Name_Att : Text;
		PrimitiveType_ContRef : PrimitiveType;
	};

	type ProcedureBody {
		Name_Att : Text;
		Process_ContRef : Process;
	};

	type Actual {
		Element_ContRef : Element;
	};

	type MonadicOperator {
		Minus_Att : Logical;
		Not_Att : Logical;
	};

	type DyadicOperator {
		Plus_Att : Logical;
		Minus_Att : Logical;
		Star_Att : Logical;
		Slash_Att : Logical;
		Or_Att : Logical;
		InverseSlash_Att : Logical;
		And_Att : Logical;
		Eq_Att : Logical;
		Ne_Att : Logical;
		Lt_Att : Logical;
		Gt_Att : Logical;
		Le_Att : Logical;
		Ge_Att : Logical;
	};
}