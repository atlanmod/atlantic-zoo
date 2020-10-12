CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY Resource (__IDResource__),
	__FKgraph__ Integer
) ;

CREATE TABLE Graph (
	__IDGraph__ Integer NOT NULL,
	FOREIGN KEY graphName (__FKgraphName__) REFERENCES URIReference (__IDURIReference__),
	PRIMARY KEY Graph (__IDGraph__),
	__FKgraphName__ Integer
) ;

CREATE TABLE List (
	__IDList__ Integer NOT NULL,
	FOREIGN KEY first (__FKfirst__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY rest (__FKrest__) REFERENCES List (__IDList__),
	PRIMARY KEY List (__IDList__),
	__FKrest__ Integer,
	__FKfirst__ Integer
) ;

CREATE TABLE Container (
	__IDContainer__ Integer NOT NULL,
	PRIMARY KEY Container (__IDContainer__)
) ;

CREATE TABLE Alt (
	__IDAlt__ Integer NOT NULL,
	PRIMARY KEY Alt (__IDAlt__)
) ;

CREATE TABLE Bag (
	__IDBag__ Integer NOT NULL,
	PRIMARY KEY Bag (__IDBag__)
) ;

CREATE TABLE Seq (
	__IDSeq__ Integer NOT NULL,
	PRIMARY KEY Seq (__IDSeq__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE ContainerMembershipProperty (
	__IDContainerMembershipProperty__ Integer NOT NULL,
	PRIMARY KEY ContainerMembershipProperty (__IDContainerMembershipProperty__)
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	FOREIGN KEY predicate (__FKpredicate__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY object (__FKobject__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY subject (__FKsubject__) REFERENCES Resource (__IDResource__),
	isReifiedOnly Boolean,
	isReified Boolean,
	PRIMARY KEY Statement (__IDStatement__),
	__FKpredicate__ Integer,
	__FKsubject__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE URIReferenceNode (
	__IDURIReferenceNode__ Integer NOT NULL,
	PRIMARY KEY URIReferenceNode (__IDURIReferenceNode__)
) ;

CREATE TABLE BlankNode (
	__IDBlankNode__ Integer NOT NULL,
	nodeId text,
	PRIMARY KEY BlankNode (__IDBlankNode__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Datatype (
	__IDDatatype__ Integer NOT NULL,
	PRIMARY KEY Datatype (__IDDatatype__)
) ;

CREATE TABLE Literal (
	__IDLiteral__ Integer NOT NULL,
	lexicalForm text,
	PRIMARY KEY Literal (__IDLiteral__)
) ;

CREATE TABLE PlainLiteral (
	__IDPlainLiteral__ Integer NOT NULL,
	language text,
	FOREIGN KEY labeledResource (__FKlabeledResource__) REFERENCES Resource (__IDResource__),
	PRIMARY KEY PlainLiteral (__IDPlainLiteral__),
	__FKlabeledResource__ Integer
) ;

CREATE TABLE TypedLiteral (
	__IDTypedLiteral__ Integer NOT NULL,
	FOREIGN KEY datatypeURI (__FKdatatypeURI__) REFERENCES URIReference (__IDURIReference__),
	PRIMARY KEY TypedLiteral (__IDTypedLiteral__),
	__FKdatatypeURI__ Integer
) ;

CREATE TABLE RDFXMLLiteral (
	__IDRDFXMLLiteral__ Integer NOT NULL,
	PRIMARY KEY RDFXMLLiteral (__IDRDFXMLLiteral__)
) ;

CREATE TABLE URIReference (
	__IDURIReference__ Integer NOT NULL,
	FOREIGN KEY uri (__FKuri__) REFERENCES UniformResourceIdentifier (__IDUniformResourceIdentifier__),
	FOREIGN KEY resource (__FKresource__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY literal (__FKliteral__) REFERENCES TypedLiteral (__IDTypedLiteral__),
	FOREIGN KEY namedGraph (__FKnamedGraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY URIReference (__IDURIReference__),
	__FKliteral__ Integer,
	__FKnamedGraph__ Integer,
	__FKresource__ Integer,
	__FKuri__ Integer
) ;

CREATE TABLE UniformResourceIdentifier (
	__IDUniformResourceIdentifier__ Integer NOT NULL,
	name text,
	PRIMARY KEY UniformResourceIdentifier (__IDUniformResourceIdentifier__)
) ;

CREATE TABLE Graph_resources_Resource (
	__IDGraph__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Class_superClass_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Resource_seeAlso_Resource (
	__IDResource__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Property_superProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Resource_referringResource_Resource (
	__IDResource__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Resource_objectStatement_Statement (
	__IDResource__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Resource_label_PlainLiteral (
	__IDResource__ Integer NOT NULL,
	__IDPlainLiteral__ Integer NOT NULL
) ;

CREATE TABLE Property_predicateStatement_Statement (
	__IDProperty__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Resource_subjectStatement_Statement (
	__IDResource__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Property_range_Class (
	__IDProperty__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Statement_nameForReification_URIReference (
	__IDStatement__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE List_originalList_List (
	__IDList__ Integer NOT NULL,
	__IDList__ Integer NOT NULL
) ;

CREATE TABLE URIReference_reifiedStatement_Statement (
	__IDURIReference__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE UniformResourceIdentifier_uriRef_URIReference (
	__IDUniformResourceIdentifier__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE Property_domain_Class (
	__IDProperty__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Resource_type_Class (
	__IDResource__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Resource_uriRef_URIReference (
	__IDResource__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE Class_subClassOf_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_propertyForRange_Property (
	__IDClass__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Resource_member_Resource (
	__IDResource__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Resource_list_List (
	__IDResource__ Integer NOT NULL,
	__IDList__ Integer NOT NULL
) ;

CREATE TABLE Resource_container_Resource (
	__IDResource__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Class_typedResource_Resource (
	__IDClass__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Property_subPropertyOf_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Class_propertyForDomain_Property (
	__IDClass__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;
