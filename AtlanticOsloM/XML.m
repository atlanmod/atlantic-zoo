module XML {

	type Node {
		StartLine_Att : Integer32;
		StartColumn_Att : Integer32;
		EndLine_Att : Integer32;
		EndColumn_Att : Integer32;
		Name_Att : Text;
		Value_Att : Text;
		Parent_Ref : Element?;
	};

	type Attribute : Node;

	type Text : Node;

	type Element : Node {
		Children_ContRef : Node*;
	};

	type Root : Element;
}