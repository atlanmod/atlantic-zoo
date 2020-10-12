module XQuery {

	type XQueryProgram {
		Expressions_ContRef : ExecutableExpression*;
	};

	type Expression {
		ParentNode_Ref : ElementNode?;
		ReturnEx_Ref : Return;
	};

	type ExecutableExpression : Expression {
		XQueryProgram_Ref : XQueryProgram;
		FunctionDeclaration_Ref : FunctionDeclaration;
	};

	type Node : Expression {
		Name_Att : Text;
	};

	type FLWOR : ExecutableExpression {
		For_ContRef : For;
		Let_ContRef : Let;
		Where_ContRef : Where;
		OrderBy_ContRef : OrderBy;
		Return_ContRef : Return;
	};

	type FunctionCall : ExecutableExpression {
		Name_Att : Text;
		Parameters_ContRef : XPath*;
	};

	type FunctionDeclaration : ExecutableExpression {
		Name_Att : Text;
		Expression_ContRef : ExecutableExpression+;
	};

	type ElementNode : Node {
		Nodes_ContRef : Expression*;
	};

	type AttributeNode : Node {
		Value_Att : Text;
	};

	type TextNode : ElementNode;

	type ReturnXPath : Expression {
		Value_Att : Text;
	};

	type XPath : ReturnXPath {
		FunctionCall_Ref : FunctionCall;
		For_Ref : For;
		Let_Ref : Let;
	};

	type BooleanExp : XPath {
		Where_Ref : Where;
	};

	type For {
		Var_Att : Text;
		Flwor_Ref : FLWOR;
		Expression_ContRef : XPath;
	};

	type Let {
		Var_Att : Text;
		Flwor_Ref : FLWOR;
		Expression_ContRef : XPath;
	};

	type Where {
		Flwor_Ref : FLWOR;
		Expression_ContRef : BooleanExp;
	};

	type OrderBy {
		Flwor_ContRef : FLWOR;
	};

	type Return {
		Flwor_Ref : FLWOR;
		Expressions_ContRef : Expression*;
	};
}