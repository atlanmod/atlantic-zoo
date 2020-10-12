module KDMSimplified {

	type Element {
		Annotation_ContRef : Annotation*;
		Attribute_ContRef : Attribute*;
	};

	type ModelElement : Element {
		TaggedValue_ContRef : TaggedValue*;
		Stereotype_Ref : Stereotype?;
	};

	type KDMEntity : ModelElement {
		Name_Att : Text;
		Inbound_Ref : KDMRelationship*;
		Outbound_Ref : KDMRelationship*;
		Owner_Ref : KDMContainer?;
		Group_Ref : KDMGroup*;
		Model_Ref : KDMModel;
	};

	type KDMContainer : KDMEntity {
		OwnedElement_ContRef : KDMEntity*;
	};

	type KDMGroup : KDMEntity {
		GroupedElement_Ref : KDMEntity*;
	};

	type KDMRelationship : ModelElement {
		To_Ref : KDMEntity;
		From_Ref : KDMEntity;
		Model_Ref : KDMModel;
	};

	type Annotation : Element {
		Note_Att : Text;
	};

	type Attribute : Element {
		Tag_Att : Text;
		Value_Att : Text;
	};

	type KDMExtensionFamily : Element {
		Name_Att : Text;
		Stereotype_ContRef : Stereotype*;
	};

	type Stereotype : Element {
		BaseClass_Att : Text;
		Name_Att : Text;
		Family_Ref : KDMExtensionFamily;
		ExtendedElement_Ref : ModelElement;
		Tag_ContRef : TagDefinition*;
	};

	type TagDefinition : Element {
		Tag_Att : Text;
		Type_Att : Text;
	};

	type TaggedValue : Element {
		Value_Att : Text;
		Tag_Ref : TagDefinition;
	};

	type KDMFramework : Element {
		Name_Att : Text;
		Extension_ContRef : KDMExtensionFamily*;
	};

	type KDMModel : KDMFramework {
		OwnedElement_ContRef : KDMEntity*;
		OwnedRelation_ContRef : KDMRelationship*;
	};
}