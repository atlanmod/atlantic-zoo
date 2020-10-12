module MoMM {

	type ModelElement {
		Level_Att : Integer32;
		Name_Att : Text;
		Potency_Att : Text;
		HasClass_Ref : ModelElement;
		ClassElement_Ref : ModelElement*;
		ElementTarget_Ref : Relationship;
		ElementSource_Ref : Relationship;
		Attributes_Ref : Attribute*;
		AttType_Ref : Attribute;
	};

	type Attribute : ModelElement {
		Type_Ref : ModelElement;
	};

	type Relationship : ModelElement {
		Target_Ref : ModelElement;
		Source_Ref : ModelElement;
	};

	type Generalization : Relationship;

	type Association : Relationship {
		MaxSource_Att : Text;
		MaxTarget_Att : Text;
		MinSource_Att : Text;
		MinTarget_Att : Text;
	};
}