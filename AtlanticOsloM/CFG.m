module CFG {

	type AbstractNode {
		Expression_ContRef : Expression;
	};

	type Node : AbstractNode {
		InNode_Ref : Node?;
		OutNode_Ref : Node?;
	};

	type ConditionalNode : AbstractNode {
		TrueConditionNode_Ref : Node;
		FalseConditionNode_Ref : Node;
	};

	type Expression {
		ExpressionName_Att : Text;
	};
}