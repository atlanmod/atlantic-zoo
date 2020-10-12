module YUML {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Model : LocatedElement {
		Classes_ContRef : Class*;
		Elements_ContRef : ModelElement*;
	};

	type Class : LocatedElement {
		Name_Att : Text;
	};

	type ModelElement : LocatedElement {
		Model_Ref : Model;
	};

	type ColorableElement : ModelElement {
		Color_Att : Text;
	};

	type ClassReference : ColorableElement {
		Class_Ref : Class;
		Stereotype_Att : Text;
		Definition_ContRef : ClassDefinition?;
	};

	type AssociationType {"simpleAssociation", "aggregation", "composition"};

	type Relationship : ModelElement {
		Source_ContRef : ClassReference;
		Target_ContRef : ClassReference;
	};

	type ClassDefinition : LocatedElement {
		Attributes_ContRef : Attribute*;
		Methods_ContRef : Method*;
	};

	type Association : Relationship {
		Type_Att : AssociationType;
		SourceCardinality_ContRef : Cardinality?;
		SourceLabel_Att : Text;
		NavigableSource_Att : Logical;
		SourceVisibility_Att : Visibility;
		TargetCardinality_ContRef : Cardinality?;
		TargetLabel_Att : Text;
		NavigableTarget_Att : Logical;
		TargetVisibility_Att : Visibility;
	};

	type Inheritance : Relationship;

	type Cardinality : LocatedElement {
		LowerBound_Att : Integer32;
		UpperBound_Att : Integer32;
	};

	type Visibility {"unspecified", "public", "private", "protected", "package"};

	type ClassMember : LocatedElement {
		Visibility_Att : Visibility;
		Name_Att : Text;
	};

	type Attribute : ClassMember {
		Type_Att : Text;
	};

	type Method : ClassMember {
		Arguments_Att : Text;
	};

	type Note : ColorableElement {
		Text_Att : Text;
	};

	type NoteAssociation : Relationship {
		Note_ContRef : Note;
	};
}