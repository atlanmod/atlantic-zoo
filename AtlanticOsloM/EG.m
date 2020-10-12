module EG_MOF {

	type ExecutionGraph {
		Node_ContRef : Node+;
		NodeNested_Ref : Node;
	};

	type Node {
		Predecessor_Ref : Node*;
		Successor_Ref : Node*;
		ExecutionGraph_Ref : ExecutionGraph;
		Nested_Ref : ExecutionGraph*;
	};

	type Start : Node;

	type End : Node;

	type Control : Node;

	type Basic : Node;

	type Branch : Control;

	type Loop : Control;

	type Fork : Control;

	type Join : Control;

	type Acquire : Control;

	type Release : Control;

	type Split : Control;
}