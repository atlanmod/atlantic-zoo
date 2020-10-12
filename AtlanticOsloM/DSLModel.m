module DSLModel {

	type Model {
		DomainModel_Att : Text;
		Contents_ContRef : ModelElement*;
	};

	type Element {
		Type_Att : Text;
		Id_Att : Text;
	};

	type ModelElement : Element {
		ParentLink_Ref : EmbeddingLink;
		Properties_ContRef : Property*;
		Embeddinglinks_ContRef : EmbeddingLink*;
		Referencelinks_ContRef : ReferenceLink*;
	};

	type ModelElementLink : ModelElement {
		Links_Ref : ReferenceLink*;
	};

	type EmbeddingLink : NamedElement {
		Owner_Ref : ModelElement?;
		Elements_ContRef : ModelElement*;
	};

	type ReferenceLink : Element {
		Owner_Ref : ModelElement?;
		ModelElement_Ref : ModelElementLink;
		Roles_ContRef : Role#2 .. 2;
	};

	type NamedElement {
		Name_Att : Text;
	};

	type Property : NamedElement {
		Owner_Ref : ModelElement;
		Value_ContRef : Value;
	};

	type Role : NamedElement {
		Element_Ref : ModelElement;
		Owner_Ref : ReferenceLink;
	};

	type Value;

	type IntegerValue : Value {
		Value_Att : Integer32;
	};

	type DoubleValue : Value {
		Value_Att : Double;
	};

	type BooleanValue : Value {
		Value_Att : Logical;
	};

	type StringValue : Value {
		Value_Att : Text;
	};
}