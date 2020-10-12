module GraphML {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Root : LocatedElement {
		Keys_ContRef : Key*;
		Graphs_ContRef : Graph*;
	};

	type Element : LocatedElement {
		Id_Att : Text;
		Datas_ContRef : Data*;
	};

	type Key : Element {
		For_Att : ElemType;
		AttrName_Att : Text;
		Type_Att : AttrType;
		DefValue_Att : Text;
	};

	type Graph : Element {
		Contents_ContRef : Element*;
		EdgeDefault_Att : EdgeType;
	};

	type Edge : Element {
		Source_Ref : Node;
		Target_Ref : Node;
		Sourceport_Ref : Port;
		Targetport_Ref : Port;
	};

	type HyperEdge : Element {
		Endpoints_ContRef : EndPoint*;
	};

	type Node : Element {
		Subgraph_ContRef : Graph;
		Ports_ContRef : Port*;
	};

	type Port : LocatedElement {
		Name_Att : Text;
	};

	type EndPoint : LocatedElement {
		Node_Ref : Node;
		Port_Ref : Port;
	};

	type Data : LocatedElement {
		Key_Att : Text;
		Value_Att : Text;
	};

	type ElemType {"edge", "node", "graph"};

	type AttrType {"double", "string", "integer", "boolean"};

	type EdgeType {"directed", "undirected"};
}