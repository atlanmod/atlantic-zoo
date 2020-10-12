module RDFS {

	type Resource {
		Graph_Ref : Graph;
		UriRef_ContRef : URIReference*;
		SubjectStatement_Ref : Statement*;
		ObjectStatement_Ref : Statement*;
		Label_ContRef : PlainLiteral*;
		Type_Ref : Class+;
		SeeAlso_Ref : Resource*;
		ReferringResource_Ref : Resource*;
		Member_Ref : Resource*;
		Container_Ref : Resource*;
		List_Ref : List*;
	};

	type Graph : Resource {
		GraphName_ContRef : URIReference?;
		Resources_ContRef : Resource*;
	};

	type List : Resource {
		First_Ref : Resource?;
		Rest_Ref : List?;
		OriginalList_Ref : List*;
	};

	type Container : Resource;

	type Alt : Container;

	type Bag : Container;

	type Seq : Container;

	type Property : Resource {
		PredicateStatement_Ref : Statement*;
		SubPropertyOf_Ref : Property*;
		SuperProperty_Ref : Property*;
		Domain_Ref : Class*;
		Range_Ref : Class*;
	};

	type ContainerMembershipProperty;

	type Statement : Resource {
		Predicate_Ref : Property?;
		Object_Ref : Resource;
		Subject_Ref : Resource;
		IsReifiedOnly_Att : Logical;
		IsReified_Att : Logical;
		NameForReification_Ref : URIReference*;
	};

	type URIReferenceNode : Resource;

	type BlankNode : Resource {
		NodeId_Att : Text;
	};

	type Class : Resource {
		SubClassOf_Ref : Class*;
		SuperClass_Ref : Class*;
		TypedResource_Ref : Resource*;
		PropertyForDomain_Ref : Property*;
		PropertyForRange_Ref : Property*;
	};

	type Datatype : Class;

	type Literal : Resource {
		LexicalForm_Att : Text;
	};

	type PlainLiteral : Literal {
		Language_Att : Text;
		LabeledResource_Ref : Resource;
	};

	type TypedLiteral : Literal {
		DatatypeURI_Ref : URIReference;
	};

	type RDFXMLLiteral : TypedLiteral;

	type URIReference {
		Uri_Ref : UniformResourceIdentifier?;
		Resource_Ref : Resource?;
		Literal_Ref : TypedLiteral?;
		NamedGraph_Ref : Graph?;
		ReifiedStatement_Ref : Statement*;
	};

	type UniformResourceIdentifier : URIReference {
		Name_Att : Text;
		UriRef_Ref : URIReference*;
	};
}