CREATE TABLE OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	PRIMARY KEY OWLOntology (__IDOWLOntology__)
) ;

CREATE TABLE OWLGraph (
	__IDOWLGraph__ Integer NOT NULL,
	PRIMARY KEY OWLGraph (__IDOWLGraph__)
) ;

CREATE TABLE OWLStatement (
	__IDOWLStatement__ Integer NOT NULL,
	PRIMARY KEY OWLStatement (__IDOWLStatement__)
) ;

CREATE TABLE OWLUniverse (
	__IDOWLUniverse__ Integer NOT NULL,
	PRIMARY KEY OWLUniverse (__IDOWLUniverse__)
) ;

CREATE TABLE OWLClass (
	__IDOWLClass__ Integer NOT NULL,
	isDeprecated Boolean,
	PRIMARY KEY OWLClass (__IDOWLClass__)
) ;

CREATE TABLE IntersectionClass (
	__IDIntersectionClass__ Integer NOT NULL,
	PRIMARY KEY IntersectionClass (__IDIntersectionClass__)
) ;

CREATE TABLE UnionClass (
	__IDUnionClass__ Integer NOT NULL,
	PRIMARY KEY UnionClass (__IDUnionClass__)
) ;

CREATE TABLE ComplementClass (
	__IDComplementClass__ Integer NOT NULL,
	PRIMARY KEY ComplementClass (__IDComplementClass__)
) ;

CREATE TABLE EnumeratedClass (
	__IDEnumeratedClass__ Integer NOT NULL,
	PRIMARY KEY EnumeratedClass (__IDEnumeratedClass__)
) ;

CREATE TABLE OWLRestriction (
	__IDOWLRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLOnProperty (__FKOWLOnProperty__) REFERENCES RDFProperty (__IDRDFProperty__),
	PRIMARY KEY OWLRestriction (__IDOWLRestriction__),
	__FKOWLOnProperty__ Integer
) ;

CREATE TABLE HasValueRestriction (
	__IDHasValueRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLHasLiteralValue (__FKOWLHasLiteralValue__) REFERENCES RDFSLiteral (__IDRDFSLiteral__),
	FOREIGN KEY OWLHasIndividualValue (__FKOWLHasIndividualValue__) REFERENCES Individual (__IDIndividual__),
	PRIMARY KEY HasValueRestriction (__IDHasValueRestriction__),
	__FKOWLHasLiteralValue__ Integer,
	__FKOWLHasIndividualValue__ Integer
) ;

CREATE TABLE AllValuesFromRestriction (
	__IDAllValuesFromRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLAllValuesFromDataRange (__FKOWLAllValuesFromDataRange__) REFERENCES OWLDataRange (__IDOWLDataRange__),
	FOREIGN KEY OWLAllValuesFromClass (__FKOWLAllValuesFromClass__) REFERENCES OWLClass (__IDOWLClass__),
	PRIMARY KEY AllValuesFromRestriction (__IDAllValuesFromRestriction__),
	__FKOWLAllValuesFromClass__ Integer,
	__FKOWLAllValuesFromDataRange__ Integer
) ;

CREATE TABLE SomeValuesFromRestriction (
	__IDSomeValuesFromRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLSomeValuesFromClass (__FKOWLSomeValuesFromClass__) REFERENCES OWLClass (__IDOWLClass__),
	FOREIGN KEY OWLSomeValuesFromDataRange (__FKOWLSomeValuesFromDataRange__) REFERENCES OWLDataRange (__IDOWLDataRange__),
	PRIMARY KEY SomeValuesFromRestriction (__IDSomeValuesFromRestriction__),
	__FKOWLSomeValuesFromClass__ Integer,
	__FKOWLSomeValuesFromDataRange__ Integer
) ;

CREATE TABLE CardinalityRestriction (
	__IDCardinalityRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLCardinality (__FKOWLCardinality__) REFERENCES TypedLiteral (__IDTypedLiteral__),
	PRIMARY KEY CardinalityRestriction (__IDCardinalityRestriction__),
	__FKOWLCardinality__ Integer
) ;

CREATE TABLE MaxCardinalityRestriction (
	__IDMaxCardinalityRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLMaxCardinality (__FKOWLMaxCardinality__) REFERENCES TypedLiteral (__IDTypedLiteral__),
	PRIMARY KEY MaxCardinalityRestriction (__IDMaxCardinalityRestriction__),
	__FKOWLMaxCardinality__ Integer
) ;

CREATE TABLE MinCardinalityRestriction (
	__IDMinCardinalityRestriction__ Integer NOT NULL,
	FOREIGN KEY OWLMinCardinality (__FKOWLMinCardinality__) REFERENCES TypedLiteral (__IDTypedLiteral__),
	PRIMARY KEY MinCardinalityRestriction (__IDMinCardinalityRestriction__),
	__FKOWLMinCardinality__ Integer
) ;

CREATE TABLE OWLAnnotationProperty (
	__IDOWLAnnotationProperty__ Integer NOT NULL,
	PRIMARY KEY OWLAnnotationProperty (__IDOWLAnnotationProperty__)
) ;

CREATE TABLE OWLOntologyProperty (
	__IDOWLOntologyProperty__ Integer NOT NULL,
	PRIMARY KEY OWLOntologyProperty (__IDOWLOntologyProperty__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	isDeprecated Boolean,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE FunctionalProperty (
	__IDFunctionalProperty__ Integer NOT NULL,
	PRIMARY KEY FunctionalProperty (__IDFunctionalProperty__)
) ;

CREATE TABLE OWLDatatypeProperty (
	__IDOWLDatatypeProperty__ Integer NOT NULL,
	PRIMARY KEY OWLDatatypeProperty (__IDOWLDatatypeProperty__)
) ;

CREATE TABLE OWLObjectProperty (
	__IDOWLObjectProperty__ Integer NOT NULL,
	FOREIGN KEY OWLInverseOf (__FKOWLInverseOf__) REFERENCES OWLObjectProperty (__IDOWLObjectProperty__),
	PRIMARY KEY OWLObjectProperty (__IDOWLObjectProperty__),
	__FKOWLInverseOf__ Integer
) ;

CREATE TABLE InverseFunctionalProperty (
	__IDInverseFunctionalProperty__ Integer NOT NULL,
	PRIMARY KEY InverseFunctionalProperty (__IDInverseFunctionalProperty__)
) ;

CREATE TABLE SymmetricProperty (
	__IDSymmetricProperty__ Integer NOT NULL,
	PRIMARY KEY SymmetricProperty (__IDSymmetricProperty__)
) ;

CREATE TABLE TransitiveProperty (
	__IDTransitiveProperty__ Integer NOT NULL,
	PRIMARY KEY TransitiveProperty (__IDTransitiveProperty__)
) ;

CREATE TABLE Individual (
	__IDIndividual__ Integer NOT NULL,
	PRIMARY KEY Individual (__IDIndividual__)
) ;

CREATE TABLE OWLAllDifferent (
	__IDOWLAllDifferent__ Integer NOT NULL,
	PRIMARY KEY OWLAllDifferent (__IDOWLAllDifferent__)
) ;

CREATE TABLE OWLDataRange (
	__IDOWLDataRange__ Integer NOT NULL,
	FOREIGN KEY datatype (__FKdatatype__) REFERENCES RDFSDataType (__IDRDFSDataType__),
	FOREIGN KEY someValuesFromRestrictionClass (__FKsomeValuesFromRestrictionClass__) REFERENCES SomeValuesFromRestriction (__IDSomeValuesFromRestriction__),
	FOREIGN KEY allValuesFromRestrictionClass (__FKallValuesFromRestrictionClass__) REFERENCES AllValuesFromRestriction (__IDAllValuesFromRestriction__),
	PRIMARY KEY OWLDataRange (__IDOWLDataRange__),
	__FKsomeValuesFromRestrictionClass__ Integer,
	__FKdatatype__ Integer,
	__FKallValuesFromRestrictionClass__ Integer
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	PRIMARY KEY Document (__IDDocument__)
) ;

CREATE TABLE LocalName (
	__IDLocalName__ Integer NOT NULL,
	name text,
	FOREIGN KEY document (__FKdocument__) REFERENCES Document (__IDDocument__),
	PRIMARY KEY LocalName (__IDLocalName__),
	__FKdocument__ Integer
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	FOREIGN KEY namespaceURIRef (__FKnamespaceURIRef__) REFERENCES URIReference (__IDURIReference__),
	PRIMARY KEY Namespace (__IDNamespace__),
	__FKnamespaceURIRef__ Integer
) ;

CREATE TABLE NamespaceDefinition (
	__IDNamespaceDefinition__ Integer NOT NULL,
	namespacePrefix text,
	FOREIGN KEY document (__FKdocument__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY NamespaceDefinition (__IDNamespaceDefinition__),
	__FKdocument__ Integer,
	__FKnamespace__ Integer
) ;

CREATE TABLE RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	PRIMARY KEY RDFSResource (__IDRDFSResource__)
) ;

CREATE TABLE RDFGraph (
	__IDRDFGraph__ Integer NOT NULL,
	FOREIGN KEY graphName (__FKgraphName__) REFERENCES URIReference (__IDURIReference__),
	PRIMARY KEY RDFGraph (__IDRDFGraph__),
	__FKgraphName__ Integer
) ;

CREATE TABLE List (
	__IDList__ Integer NOT NULL,
	FOREIGN KEY first (__FKfirst__) REFERENCES RDFSResource (__IDRDFSResource__),
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

CREATE TABLE RDFProperty (
	__IDRDFProperty__ Integer NOT NULL,
	PRIMARY KEY RDFProperty (__IDRDFProperty__)
) ;

CREATE TABLE ContainerMembershipProperty (
	__IDContainerMembershipProperty__ Integer NOT NULL,
	PRIMARY KEY ContainerMembershipProperty (__IDContainerMembershipProperty__)
) ;

CREATE TABLE RDFStatement (
	__IDRDFStatement__ Integer NOT NULL,
	reificationKind text,
	FOREIGN KEY RDFpredicate (__FKRDFpredicate__) REFERENCES RDFProperty (__IDRDFProperty__),
	FOREIGN KEY RDFobject (__FKRDFobject__) REFERENCES RDFSResource (__IDRDFSResource__),
	FOREIGN KEY RDFsubject (__FKRDFsubject__) REFERENCES RDFSResource (__IDRDFSResource__),
	PRIMARY KEY RDFStatement (__IDRDFStatement__),
	__FKRDFpredicate__ Integer,
	__FKRDFsubject__ Integer,
	__FKRDFobject__ Integer
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

CREATE TABLE RDFSClass (
	__IDRDFSClass__ Integer NOT NULL,
	PRIMARY KEY RDFSClass (__IDRDFSClass__)
) ;

CREATE TABLE RDFSDataType (
	__IDRDFSDataType__ Integer NOT NULL,
	PRIMARY KEY RDFSDataType (__IDRDFSDataType__)
) ;

CREATE TABLE RDFSLiteral (
	__IDRDFSLiteral__ Integer NOT NULL,
	lexicalForm text,
	PRIMARY KEY RDFSLiteral (__IDRDFSLiteral__)
) ;

CREATE TABLE PlainLiteral (
	__IDPlainLiteral__ Integer NOT NULL,
	language text,
	FOREIGN KEY labeledResource (__FKlabeledResource__) REFERENCES RDFSResource (__IDRDFSResource__),
	FOREIGN KEY commentedResource (__FKcommentedResource__) REFERENCES RDFSResource (__IDRDFSResource__),
	PRIMARY KEY PlainLiteral (__IDPlainLiteral__),
	__FKcommentedResource__ Integer,
	__FKlabeledResource__ Integer
) ;

CREATE TABLE TypedLiteral (
	__IDTypedLiteral__ Integer NOT NULL,
	FOREIGN KEY datatypeURI (__FKdatatypeURI__) REFERENCES URIReference (__IDURIReference__),
	PRIMARY KEY TypedLiteral (__IDTypedLiteral__),
	__FKdatatypeURI__ Integer
) ;

CREATE TABLE XMLLiteral (
	__IDXMLLiteral__ Integer NOT NULL,
	PRIMARY KEY XMLLiteral (__IDXMLLiteral__)
) ;

CREATE TABLE URIReference (
	__IDURIReference__ Integer NOT NULL,
	FOREIGN KEY uri (__FKuri__) REFERENCES UniformResourceIdentifier (__IDUniformResourceIdentifier__),
	FOREIGN KEY resource (__FKresource__) REFERENCES RDFSResource (__IDRDFSResource__),
	FOREIGN KEY namedGraph (__FKnamedGraph__) REFERENCES RDFGraph (__IDRDFGraph__),
	FOREIGN KEY fragmentIdentifier (__FKfragmentIdentifier__) REFERENCES LocalName (__IDLocalName__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY URIReference (__IDURIReference__),
	__FKresource__ Integer,
	__FKuri__ Integer,
	__FKnamespace__ Integer,
	__FKnamedGraph__ Integer,
	__FKfragmentIdentifier__ Integer
) ;

CREATE TABLE UniformResourceIdentifier (
	__IDUniformResourceIdentifier__ Integer NOT NULL,
	name text,
	PRIMARY KEY UniformResourceIdentifier (__IDUniformResourceIdentifier__)
) ;

CREATE TABLE RDFSResource_comment_PlainLiteral (
	__IDRDFSResource__ Integer NOT NULL,
	__IDPlainLiteral__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_owlUniverse_OWLUniverse (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLUniverse__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_predicateStatement_RDFStatement (
	__IDRDFProperty__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE RDFSLiteral_dataRange_OWLDataRange (
	__IDRDFSLiteral__ Integer NOT NULL,
	__IDOWLDataRange__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_complementClass_ComplementClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDComplementClass__ Integer NOT NULL
) ;

CREATE TABLE RDFStatement_graph_RDFGraph (
	__IDRDFStatement__ Integer NOT NULL,
	__IDRDFGraph__ Integer NOT NULL
) ;

CREATE TABLE Property_OWLEquivalentProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE RDFGraph_statement_RDFStatement (
	__IDRDFGraph__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE TypedLiteral_maxCardinalityRestriction_MaxCardinalityRestriction (
	__IDTypedLiteral__ Integer NOT NULL,
	__IDMaxCardinalityRestriction__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_OWLImports_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_uriRef_URIReference (
	__IDRDFSResource__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_container_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE Individual_differentIndividual_Individual (
	__IDIndividual__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE LocalName_uriRef_URIReference (
	__IDLocalName__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE Individual_sameIndividual_Individual (
	__IDIndividual__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE Individual_enumeratedClass_EnumeratedClass (
	__IDIndividual__ Integer NOT NULL,
	__IDEnumeratedClass__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_objectStatement_RDFStatement (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_OWLPriorVersion_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE Individual_allDifferent_OWLAllDifferent (
	__IDIndividual__ Integer NOT NULL,
	__IDOWLAllDifferent__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_owlStatement_OWLStatement (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLStatement__ Integer NOT NULL
) ;

CREATE TABLE OWLUniverse_ontology_OWLOntology (
	__IDOWLUniverse__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_list_List (
	__IDRDFSResource__ Integer NOT NULL,
	__IDList__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_seeAlso_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_referringResource_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE Document_namespaceDefinition_NamespaceDefinition (
	__IDDocument__ Integer NOT NULL,
	__IDNamespaceDefinition__ Integer NOT NULL
) ;

CREATE TABLE Individual_OWLDifferentFrom_Individual (
	__IDIndividual__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_member_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE RDFSClass_propertyForDomain_RDFProperty (
	__IDRDFSClass__ Integer NOT NULL,
	__IDRDFProperty__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_label_PlainLiteral (
	__IDRDFSResource__ Integer NOT NULL,
	__IDPlainLiteral__ Integer NOT NULL
) ;

CREATE TABLE EnumeratedClass_OWLOneOf_Individual (
	__IDEnumeratedClass__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE Individual_OWLSameAs_Individual (
	__IDIndividual__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE ComplementClass_OWLComplementOf_OWLClass (
	__IDComplementClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_versionInfo_RDFSLiteral (
	__IDOWLOntology__ Integer NOT NULL,
	__IDRDFSLiteral__ Integer NOT NULL
) ;

CREATE TABLE Document_localName_LocalName (
	__IDDocument__ Integer NOT NULL,
	__IDLocalName__ Integer NOT NULL
) ;

CREATE TABLE RDFStatement_document_Document (
	__IDRDFStatement__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE RDFSDataType_dataRange_OWLDataRange (
	__IDRDFSDataType__ Integer NOT NULL,
	__IDOWLDataRange__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_domain_RDFSClass (
	__IDRDFProperty__ Integer NOT NULL,
	__IDRDFSClass__ Integer NOT NULL
) ;

CREATE TABLE OWLObjectProperty_inverseProperty_OWLObjectProperty (
	__IDOWLObjectProperty__ Integer NOT NULL,
	__IDOWLObjectProperty__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_subjectStatement_RDFStatement (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE OWLStatement_owlGraph_OWLGraph (
	__IDOWLStatement__ Integer NOT NULL,
	__IDOWLGraph__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_superProperty_RDFProperty (
	__IDRDFProperty__ Integer NOT NULL,
	__IDRDFProperty__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_disjointClass_OWLClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_definedResource_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE TypedLiteral_cardinalityRestriction_CardinalityRestriction (
	__IDTypedLiteral__ Integer NOT NULL,
	__IDCardinalityRestriction__ Integer NOT NULL
) ;

CREATE TABLE TypedLiteral_minCardinalityRestriction_MinCardinalityRestriction (
	__IDTypedLiteral__ Integer NOT NULL,
	__IDMinCardinalityRestriction__ Integer NOT NULL
) ;

CREATE TABLE URIReference_literal_TypedLiteral (
	__IDURIReference__ Integer NOT NULL,
	__IDTypedLiteral__ Integer NOT NULL
) ;

CREATE TABLE OWLGraph_owlStatement_OWLStatement (
	__IDOWLGraph__ Integer NOT NULL,
	__IDOWLStatement__ Integer NOT NULL
) ;

CREATE TABLE List_originalList_List (
	__IDList__ Integer NOT NULL,
	__IDList__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_equivalentClass_OWLClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_importingOntology_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE RDFSClass_superClass_RDFSClass (
	__IDRDFSClass__ Integer NOT NULL,
	__IDRDFSClass__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_OWLIncompatibleWith_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE Document_statement_RDFStatement (
	__IDDocument__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_owlGraph_OWLGraph (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLGraph__ Integer NOT NULL
) ;

CREATE TABLE UnionClass_OWLUnionOf_OWLClass (
	__IDUnionClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE Individual_restrictionClass_HasValueRestriction (
	__IDIndividual__ Integer NOT NULL,
	__IDHasValueRestriction__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_propertyRestriction_OWLRestriction (
	__IDRDFProperty__ Integer NOT NULL,
	__IDOWLRestriction__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_isDefinedBy_RDFSResource (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_subPropertyOf_RDFProperty (
	__IDRDFProperty__ Integer NOT NULL,
	__IDRDFProperty__ Integer NOT NULL
) ;

CREATE TABLE RDFSClass_typedResource_RDFSResource (
	__IDRDFSClass__ Integer NOT NULL,
	__IDRDFSResource__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_someValuesFromRestrictionClass_SomeValuesFromRestriction (
	__IDOWLClass__ Integer NOT NULL,
	__IDSomeValuesFromRestriction__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_allValuesFromRestrictionClass_AllValuesFromRestriction (
	__IDOWLClass__ Integer NOT NULL,
	__IDAllValuesFromRestriction__ Integer NOT NULL
) ;

CREATE TABLE RDFProperty_range_RDFSClass (
	__IDRDFProperty__ Integer NOT NULL,
	__IDRDFSClass__ Integer NOT NULL
) ;

CREATE TABLE OWLAllDifferent_OWLDistinctMembers_Individual (
	__IDOWLAllDifferent__ Integer NOT NULL,
	__IDIndividual__ Integer NOT NULL
) ;

CREATE TABLE IntersectionClass_OWLIntersectionOf_OWLClass (
	__IDIntersectionClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_OWLequivalentClass_OWLClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE UniformResourceIdentifier_uriRef_URIReference (
	__IDUniformResourceIdentifier__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_incompatibleOntology_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_intersectionClass_IntersectionClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDIntersectionClass__ Integer NOT NULL
) ;

CREATE TABLE Property_equivalentProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE URIReference_reifiedStatement_RDFStatement (
	__IDURIReference__ Integer NOT NULL,
	__IDRDFStatement__ Integer NOT NULL
) ;

CREATE TABLE OWLStatement_ontology_OWLOntology (
	__IDOWLStatement__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE OWLDataRange_OWLOneOf_RDFSLiteral (
	__IDOWLDataRange__ Integer NOT NULL,
	__IDRDFSLiteral__ Integer NOT NULL
) ;

CREATE TABLE RDFSResource_type_RDFSClass (
	__IDRDFSResource__ Integer NOT NULL,
	__IDRDFSClass__ Integer NOT NULL
) ;

CREATE TABLE OWLOntology_newerOntology_OWLOntology (
	__IDOWLOntology__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_OWLdisjointWith_OWLClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDOWLClass__ Integer NOT NULL
) ;

CREATE TABLE RDFStatement_nameForReification_URIReference (
	__IDRDFStatement__ Integer NOT NULL,
	__IDURIReference__ Integer NOT NULL
) ;

CREATE TABLE RDFSClass_propertyForRange_RDFProperty (
	__IDRDFSClass__ Integer NOT NULL,
	__IDRDFProperty__ Integer NOT NULL
) ;

CREATE TABLE Document_xmlBase_Namespace (
	__IDDocument__ Integer NOT NULL,
	__IDNamespace__ Integer NOT NULL
) ;

CREATE TABLE OWLGraph_ontology_OWLOntology (
	__IDOWLGraph__ Integer NOT NULL,
	__IDOWLOntology__ Integer NOT NULL
) ;

CREATE TABLE OWLClass_unionClass_UnionClass (
	__IDOWLClass__ Integer NOT NULL,
	__IDUnionClass__ Integer NOT NULL
) ;

CREATE TABLE RDFSClass_subClassOf_RDFSClass (
	__IDRDFSClass__ Integer NOT NULL,
	__IDRDFSClass__ Integer NOT NULL
) ;

CREATE TABLE Namespace_document_Document (
	__IDNamespace__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Namespace_namespaceDefinition_NamespaceDefinition (
	__IDNamespace__ Integer NOT NULL,
	__IDNamespaceDefinition__ Integer NOT NULL
) ;

CREATE TABLE RDFSLiteral_restrictionClass_HasValueRestriction (
	__IDRDFSLiteral__ Integer NOT NULL,
	__IDHasValueRestriction__ Integer NOT NULL
) ;
