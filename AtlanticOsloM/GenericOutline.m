module Outline {

	type LocatedElement {
		Location_Att : Text;
	};

	type Outline : LocatedElement {
		Extension_Att : Text;
		Nodes_ContRef : Node*;
	};

	type Node : LocatedElement {
		Name_Att : Text;
		Label_ContRef : Label;
		Icon_Att : Text;
		Outline_Ref : Outline?;
		Mapping_ContRef : Map*;
	};

	type Label : LocatedElement {
		Label_Att : Text;
		MethodCall_Att : Text;
		LabelSuite_ContRef : LabelSuite*;
	};

	type LabelSuite : LocatedElement {
		Label_Att : Text;
		MethodCall_Att : Text;
	};

	type Map : LocatedElement {
		MapString_Att : Text;
	};
}