module DTD {

	type Occurence {"zeroOrOne", "zeroOrMore", "oneOrMore", "one"};

	type OtherAttributeTypeEnum {"cdata", "id", "idref", "entityType", "entities", "nmtoken", "nmtakens"};

	type TypeDescription {
		Name_Att : Text;
	};

	type Notation : TypeDescription {
		Content_Att : Text;
	};

	type Entity : TypeDescription {
		Content_Att : Text;
		IsInternal_Att : Logical;
	};

	type Element : TypeDescription;

	type AnyElement : Element;

	type RestrictedElement : Element {
		Content_ContRef : ElementContent?;
	};

	type ElementContent;

	type Mixed : ElementContent {
		Elements_Att : Text;
	};

	type Children : ElementContent {
		Occ_Att : Occurence;
	};

	type Sequence : Children {
		Children_Ref : Children#2 ..;
	};

	type Leaf : Children {
		ElementName_Att : Text;
	};

	type Choice : Children {
		ChildrenChoice_Ref : Children#2 ..;
	};

	type AttributeList : TypeDescription {
		ContainsAttributes_Ref : AttributeDescription+;
	};

	type AttributeDescription : TypeDescription {
		AttributeList_Ref : AttributeList;
		Type_ContRef : AttributeType;
	};

	type NoDefaultValue : AttributeDescription {
		IsRequired_Att : Logical;
	};

	type DefaultValue : AttributeDescription {
		Value_Att : Text;
		IsFixed_Att : Logical;
	};

	type AttributeType;

	type Enumeration : AttributeType {
		Values_Att : Text;
	};

	type OtherAttributeType {
		Type_Att : OtherAttributeTypeEnum;
	};
}