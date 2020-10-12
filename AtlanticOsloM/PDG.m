module PDG {

	type MProgramDependenceGraph {
		Node_ContRef : EnterNode;
	};

	type EnterNode {
		Name_Att : Text;
		ControlDependenceNodes_ContRef : ExpressionNode*;
	};

	type ExpressionNode {
		Name_Att : Text;
		Expression_ContRef : Expression;
		DataDependenceNodes_Ref : ExpressionNode*;
		ControlDependenceNodes_ContRef : ExpressionNode*;
	};

	type Expression {
		Name_Att : Text;
		IsIdentifier_Att : Logical;
		InnerExpressions_ContRef : Expression*;
	};
}