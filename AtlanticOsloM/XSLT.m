module XSLT {

	type Node {
		Name_Att : Text;
		ParentNode_Ref : ElementNode?;
	};

	type ElementNode : Node {
		Nodes_ContRef : Node*;
	};

	type AttributeNode : Node;

	type RootNode : ElementNode {
		Document_ContRef : Document;
	};

	type TextNode : ElementNode {
		Value_Att : Text;
	};

	type XSLTNode : ElementNode;

	type XSLTRootNode : RootNode;

	type Document {
		DocumentName_Att : Text;
		Document_ContRef : RootNode;
	};

	type ApplyTemplates : XSLTNode {
		Select_Att : Text;
	};

	type If : XSLTNode {
		Test_Att : Text;
	};

	type Template : XSLTNode {
		Match_Att : Text;
	};

	type ValueOf : XSLTNode {
		Select_Att : Text;
	};

	type When : XSLTNode {
		Test_Att : Text;
	};

	type Choose : XSLTNode {
		When_ContRef : When;
		Otherwise_ContRef : Otherwise;
	};

	type Otherwise : XSLTNode;

	type Sort : XSLTNode {
		Select_Att : Text;
	};
}