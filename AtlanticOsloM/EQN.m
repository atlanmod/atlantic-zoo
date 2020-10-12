module EQN {

	type RoutingChain {
		QueuingNetwork_Ref : QueuingNetwork*;
	};

	type QueuingNetwork {
		Center_ContRef : Center+;
		WorkLoad_ContRef : RoutingChain;
	};

	type ExecutionGraph {
		NodeNested_Ref : Node;
		Node_ContRef : Node+;
	};

	type Center {
		Node_Ref : Node;
		QueuingNetwork_Ref : QueuingNetwork;
	};

	type Node {
		Nested_Ref : ExecutionGraph;
		ExecutionGraph_Ref : ExecutionGraph;
		Demand_Ref : Center+;
	};

	type Special : Center;

	type ActiveCenter : Center;

	type PassiveCenter : Center;

	type Source : Special;

	type Sink : Special;

	type Fork : Special;

	type Join : Special;

	type Split : Special;

	type Allocate : Special;

	type Release : Special;
}