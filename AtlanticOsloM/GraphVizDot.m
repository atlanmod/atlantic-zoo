module DOT {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type Graph : NamedElement {
		Type_Att : Text;
		RankDir_Att : Text;
		Dim_Att : Integer32;
		Contents_ContRef : GraphElement*;
	};

	type GraphElement : NamedElement {
		Label_Att : Text;
		Color_Att : Text;
		Z_Att : Integer32;
		Graph_Ref : Graph;
	};

	type Node : GraphElement, NamedElement {
		Shape_Att : Text;
		Style_Att : Text;
	};

	type DirectedArc : GraphElement {
		SourceNode_Att : Text;
		SourcePart_Att : Text;
		TargetNode_Att : Text;
		TargetPart_Att : Text;
		Shape_Att : Text;
	};

	type Constraint : GraphElement {
		Val_Att : Text;
		Refers_Att : Text;
	};

	type SubGraph : Graph, GraphElement;
}