module OCLExpressions {

	type OclExpression {
		QueryArg_Ref : QueryExp*;
		QuerySrc_Ref : QueryExp*;
		ResultType_ContRef : Type;
		VarDec_Ref : VariableDeclaration+;
		VarInit_Ref : VariableInitialisation*;
	};

	type SelfExp : OclExpression;

	type ResultExp : OclExpression;

	type VariableExp : OclExpression {
		Var_Att : Text;
	};

	type OperationExp : OclExpression;

	type QueryExp : OclExpression {
		Argument_ContRef : OclExpression;
		Source_ContRef : OclExpression;
		VarDeclaration_ContRef : VariableDeclaration?;
	};

	type Type {
		OclExpression_Ref : OclExpression*;
		VarDec_ContRef : VariableDeclaration*;
	};

	type VariableDeclaration {
		Var_Att : Text;
		VarType_Ref : Type;
		OclExpression_Ref : OclExpression*;
		QueryExp_Ref : QueryExp*;
		VarInit_Ref : VariableInitialisation*;
	};

	type VariableInitialisation {
		InitExpression_ContRef : OclExpression;
		VarDec_ContRef : VariableDeclaration;
		IterateExp_ContRef : IterateExp;
	};

	type ForAllExp;

	type ExistsExp;

	type SelectExp;

	type RejectExp;

	type CollectExp;

	type IterateExp {
		VarInit_ContRef : VariableInitialisation;
	};
}