module AbstractSynthax {

	type ModelElement {
		ReferenceTag_Ref : TaggedValue*;
		Stereotype_Ref : Stereotype*;
		Constraint_Ref : Constraint*;
		TaggedValue_ContRef : TaggedValue*;
	};

	type Constraint {
		ConstrainedElement_Ref : ModelElement*;
		ConstrainedStereotype_Ref : Stereotype?;
	};

	type TaggedValue {
		DataValue_Att : Text;
		ReferenceValue_Ref : ModelElement*;
		Type_Ref : TagDefinition;
	};

	type TagDefinition : ModelElement {
		TagType_Att : Text;
		Multiplicity_Ref : Multiplicity;
		TypedValue_Ref : TaggedValue*;
		Owner_Ref : Stereotype?;
	};

	type Multiplicity {
		Value_Att : Text;
	};

	type GeneralizableElement;

	type Stereotype : GeneralizableElement {
		Icon_Ref : Geometry;
		BaseClass_Ref : Name*;
		DefinedTag_ContRef : TagDefinition*;
		StereotypeConstraint_ContRef : Constraint*;
		ExtendedElement_Ref : ModelElement*;
	};

	type Geometry {
		Value_Att : Text;
	};

	type Name {
		Value_Att : Text;
	};
}