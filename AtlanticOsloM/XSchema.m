module XSchema {

	type AttributeUseType {"null", "optional", "prohibited", "required"};

	type AnnotedElement {
		Annotations_ContRef : Annotation*;
	};

	type Annotation {
		Documentations_ContRef : Documentation*;
		ApplicationInfos_ContRef : ApplicationInfo*;
		AnnotedElement_Ref : AnnotedElement;
	};

	type Documentation {
		Text_Att : Text;
	};

	type ApplicationInfo {
		Text_Att : Text;
	};

	type NamedElement : AnnotedElement {
		Name_Att : Text;
	};

	type XSchema : AnnotedElement {
		Namespace_Att : Text;
		Contents_ContRef : XSchemaContentElement*;
	};

	type XSchemaContentElement : NamedElement {
		Schema_Ref : XSchema?;
	};

	type Parameters : XSchemaContentElement {
		TypeRef_Ref : AbstractType?;
		TypeContain_ContRef : AbstractType?;
		Fixed_Att : Text;
		Default_Att : Text;
	};

	type Element : Parameters, AtomicContent {
		References_Ref : ElementRef*;
	};

	type Occurable {
		MinOccurs_Att : Text;
		MaxOccurs_Att : Text;
	};

	type AbstractContent : Occurable {
		Container_Ref : Container;
		ComplexType_Ref : ComplexType;
	};

	type Container : AbstractContent {
		Contents_ContRef : AbstractContent*;
	};

	type AtomicContent : AbstractContent;

	type ElementRef : AtomicContent {
		ReferencedElement_Ref : Element;
	};

	type GroupRef : AtomicContent {
		ReferencedGroup_Ref : Group;
	};

	type All : Container;

	type Group : XSchemaContentElement, Container {
		References_Ref : GroupRef*;
	};

	type Choice : Container;

	type Sequence : Container;

	type AbstractAttributeGroupContent : Occurable {
		Container_Ref : AttributeGroup;
		ComplexType_Ref : ComplexType;
	};

	type AttributeGroup : AbstractAttributeGroupContent, XSchemaContentElement {
		Contents_ContRef : AbstractAttributeGroupContent*;
		References_Ref : AttributeGroupRef*;
	};

	type AttributeGroupRef : AtomicAttributeGroupContent {
		ReferencedAttributeGroup_Ref : AttributeGroup;
	};

	type AtomicAttributeGroupContent : AbstractAttributeGroupContent;

	type Attribute : Parameters, AtomicAttributeGroupContent {
		Use_Att : AttributeUseType?;
		References_Ref : AttributeRef*;
	};

	type AttributeRef : AtomicAttributeGroupContent {
		ReferencedAttribute_Ref : Attribute;
	};

	type AbstractType : XSchemaContentElement {
		Container_Ref : Parameters;
	};

	type SimpleType : AbstractType {
		Extensions_Ref : ComplexTypeSimpleContent*;
	};

	type ComplexType : AbstractType {
		Extensions_Ref : ComplexTypeComplexContent*;
		Content_ContRef : AbstractContent?;
		Attributes_ContRef : AbstractAttributeGroupContent*;
	};

	type ComplexTypeSimpleContent : ComplexType {
		Base_Ref : SimpleType;
	};

	type ComplexTypeComplexContent : ComplexType {
		Base_Ref : ComplexType;
	};
}