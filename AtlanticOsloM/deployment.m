module Deployment {

	type Node {
		NestedNode_ContRef : Node*;
		Name_Att : Text;
	};

	type Device : Node;

	type ExecutionEnvironment : Node;

	type Specification {
		OwnedNode_ContRef : Node*;
		OwnedCommunicationLink_ContRef : CommunicationLink*;
	};

	type CommunicationLink {
		Source_Ref : Node?;
		Target_Ref : Node?;
		Name_Att : Text;
	};
}