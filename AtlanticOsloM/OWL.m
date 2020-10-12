module MetamodelRoot {

	type @[RDFS.Document] : @[RDFS.RDFSResource] {
		LocalName_ContRef : @[RDFS.LocalName]*;
		XmlBase_Ref : @[RDFS.Namespace]*;
		NamespaceDefinition_ContRef : @[RDFS.NamespaceDefinition]*;
		Statement_Ref : @[RDFS.RDFStatement]+;
	};

	type @[RDFS.LocalName] {
		Name_Att : Text;
		Document_Ref : @[RDFS.Document];
		UriRef_Ref : @[RDFS.URIReference]*;
	};

	type @[RDFS.Namespace] {
		Document_Ref : @[RDFS.Document]+;
		NamespaceURIRef_Ref : @[RDFS.URIReference];
		NamespaceDefinition_Ref : @[RDFS.NamespaceDefinition]*;
	};

	type @[RDFS.NamespaceDefinition] {
		NamespacePrefix_Att : Text;
		Document_Ref : @[RDFS.Document];
		Namespace_Ref : @[RDFS.Namespace];
	};

	type @[RDFS.RDFSResource] {
		UriRef_ContRef : @[RDFS.URIReference]*;
		SubjectStatement_Ref : @[RDFS.RDFStatement]*;
		ObjectStatement_Ref : @[RDFS.RDFStatement]*;
		Label_ContRef : @[RDFS.PlainLiteral]*;
		Type_Ref : @[RDFS.RDFSClass]+;
		Comment_ContRef : @[RDFS.PlainLiteral]*;
		SeeAlso_Ref : @[RDFS.RDFSResource]*;
		ReferringResource_Ref : @[RDFS.RDFSResource]*;
		IsDefinedBy_Ref : @[RDFS.RDFSResource]*;
		DefinedResource_Ref : @[RDFS.RDFSResource]*;
		Member_Ref : @[RDFS.RDFSResource]*;
		Container_Ref : @[RDFS.RDFSResource]*;
		List_Ref : @[RDFS.List]*;
	};

	type @[RDFS.RDFGraph] : @[RDFS.RDFSResource] {
		GraphName_ContRef : @[RDFS.URIReference]?;
		Statement_Ref : @[RDFS.RDFStatement]+;
	};

	type @[RDFS.List] : @[RDFS.RDFSResource] {
		First_Ref : @[RDFS.RDFSResource]?;
		Rest_Ref : @[RDFS.List]?;
		OriginalList_Ref : @[RDFS.List]*;
	};

	type @[RDFS.Container] : @[RDFS.RDFSResource];

	type @[RDFS.Alt] : @[RDFS.Container];

	type @[RDFS.Bag] : @[RDFS.Container];

	type @[RDFS.Seq] : @[RDFS.Container];

	type @[RDFS.RDFProperty] : @[RDFS.RDFSResource] {
		PredicateStatement_Ref : @[RDFS.RDFStatement]*;
		SubPropertyOf_Ref : @[RDFS.RDFProperty]*;
		SuperProperty_Ref : @[RDFS.RDFProperty]*;
		Domain_Ref : @[RDFS.RDFSClass]*;
		Range_Ref : @[RDFS.RDFSClass]*;
		PropertyRestriction_Ref : @[OWL.OWLRestriction]*;
	};

	type @[RDFS.ContainerMembershipProperty];

	type @[RDFS.RDFStatement] : @[RDFS.RDFSResource] {
		ReificationKind_Att : @[RDFS.ReificationKind];
		Graph_Ref : @[RDFS.RDFGraph]+;
		RDFpredicate_Ref : @[RDFS.RDFProperty]?;
		RDFobject_Ref : @[RDFS.RDFSResource];
		RDFsubject_Ref : @[RDFS.RDFSResource];
		NameForReification_Ref : @[RDFS.URIReference]*;
		Document_Ref : @[RDFS.Document]+;
	};

	type @[RDFS.ReificationKind] {"none", "reifiedOnly", "reified"};

	type @[RDFS.URIReferenceNode] : @[RDFS.RDFSResource];

	type @[RDFS.BlankNode] : @[RDFS.RDFSResource] {
		NodeId_Att : Text;
	};

	type @[RDFS.RDFSClass] : @[RDFS.RDFSResource] {
		SubClassOf_Ref : @[RDFS.RDFSClass]*;
		SuperClass_Ref : @[RDFS.RDFSClass]*;
		TypedResource_Ref : @[RDFS.RDFSResource]*;
		PropertyForDomain_Ref : @[RDFS.RDFProperty]*;
		PropertyForRange_Ref : @[RDFS.RDFProperty]*;
	};

	type @[RDFS.RDFSDataType] : @[RDFS.RDFSClass] {
		DataRange_Ref : @[OWL.OWLDataRange]*;
	};

	type @[RDFS.RDFSLiteral] : @[RDFS.RDFSResource] {
		LexicalForm_Att : Text;
		RestrictionClass_Ref : @[OWL.HasValueRestriction]*;
		DataRange_Ref : @[OWL.OWLDataRange]*;
	};

	type @[RDFS.PlainLiteral] : @[RDFS.RDFSLiteral] {
		Language_Att : Text;
		LabeledResource_Ref : @[RDFS.RDFSResource];
		CommentedResource_Ref : @[RDFS.RDFSResource];
	};

	type @[RDFS.TypedLiteral] : @[RDFS.RDFSLiteral] {
		DatatypeURI_Ref : @[RDFS.URIReference];
		CardinalityRestriction_Ref : @[OWL.CardinalityRestriction]*;
		MinCardinalityRestriction_Ref : @[OWL.MinCardinalityRestriction]*;
		MaxCardinalityRestriction_Ref : @[OWL.MaxCardinalityRestriction]*;
	};

	type @[RDFS.XMLLiteral] : @[RDFS.TypedLiteral];

	type @[RDFS.URIReference] {
		Uri_Ref : @[RDFS.UniformResourceIdentifier]?;
		Resource_Ref : @[RDFS.RDFSResource]?;
		Literal_Ref : @[RDFS.TypedLiteral]*;
		NamedGraph_Ref : @[RDFS.RDFGraph]?;
		ReifiedStatement_Ref : @[RDFS.RDFStatement]*;
		FragmentIdentifier_Ref : @[RDFS.LocalName]?;
		Namespace_Ref : @[RDFS.Namespace]?;
	};

	type @[RDFS.UniformResourceIdentifier] : @[RDFS.URIReference] {
		Name_Att : Text;
		UriRef_Ref : @[RDFS.URIReference]*;
	};

	type @[OWL.OWLOntology] : @[RDFS.RDFSResource] {
		OwlUniverse_Ref : @[OWL.OWLUniverse]*;
		OWLPriorVersion_Ref : @[OWL.OWLOntology]*;
		NewerOntology_Ref : @[OWL.OWLOntology]*;
		OWLIncompatibleWith_Ref : @[OWL.OWLOntology]*;
		IncompatibleOntology_Ref : @[OWL.OWLOntology]*;
		OWLImports_Ref : @[OWL.OWLOntology]*;
		ImportingOntology_Ref : @[OWL.OWLOntology]*;
		OwlGraph_Ref : @[OWL.OWLGraph]+;
		OwlStatement_Ref : @[OWL.OWLStatement]+;
		VersionInfo_ContRef : @[RDFS.RDFSLiteral]*;
	};

	type @[OWL.OWLGraph] : @[RDFS.RDFGraph] {
		Ontology_Ref : @[OWL.OWLOntology]*;
		OwlStatement_Ref : @[OWL.OWLStatement]+;
	};

	type @[OWL.OWLStatement] : @[RDFS.RDFStatement] {
		Ontology_Ref : @[OWL.OWLOntology]*;
		OwlGraph_Ref : @[OWL.OWLGraph]+;
	};

	type @[OWL.OWLUniverse] : @[RDFS.RDFSResource] {
		Ontology_Ref : @[OWL.OWLOntology]+;
	};

	type @[OWL.OWLClass] : @[RDFS.RDFSClass], @[OWL.OWLUniverse] {
		IsDeprecated_Att : Logical;
		OWLequivalentClass_Ref : @[OWL.OWLClass]*;
		EquivalentClass_Ref : @[OWL.OWLClass]*;
		OWLdisjointWith_Ref : @[OWL.OWLClass]*;
		DisjointClass_Ref : @[OWL.OWLClass]*;
		IntersectionClass_Ref : @[OWL.IntersectionClass]*;
		UnionClass_Ref : @[OWL.UnionClass]*;
		ComplementClass_Ref : @[OWL.ComplementClass]*;
		AllValuesFromRestrictionClass_Ref : @[OWL.AllValuesFromRestriction]*;
		SomeValuesFromRestrictionClass_Ref : @[OWL.SomeValuesFromRestriction]*;
	};

	type @[OWL.IntersectionClass] : @[OWL.OWLClass] {
		OWLIntersectionOf_Ref : @[OWL.OWLClass]*;
	};

	type @[OWL.UnionClass] : @[OWL.OWLClass] {
		OWLUnionOf_Ref : @[OWL.OWLClass]*;
	};

	type @[OWL.ComplementClass] : @[OWL.OWLClass] {
		OWLComplementOf_Ref : @[OWL.OWLClass]*;
	};

	type @[OWL.EnumeratedClass] : @[OWL.OWLClass] {
		OWLOneOf_Ref : @[OWL.Individual]*;
	};

	type @[OWL.OWLRestriction] : @[OWL.OWLClass] {
		OWLOnProperty_Ref : @[RDFS.RDFProperty];
	};

	type @[OWL.HasValueRestriction] : @[OWL.OWLRestriction] {
		OWLHasLiteralValue_Ref : @[RDFS.RDFSLiteral]?;
		OWLHasIndividualValue_Ref : @[OWL.Individual]?;
	};

	type @[OWL.AllValuesFromRestriction] : @[OWL.OWLRestriction] {
		OWLAllValuesFromDataRange_Ref : @[OWL.OWLDataRange]?;
		OWLAllValuesFromClass_Ref : @[OWL.OWLClass]?;
	};

	type @[OWL.SomeValuesFromRestriction] : @[OWL.OWLRestriction] {
		OWLSomeValuesFromClass_Ref : @[OWL.OWLClass]?;
		OWLSomeValuesFromDataRange_Ref : @[OWL.OWLDataRange]?;
	};

	type @[OWL.CardinalityRestriction] : @[OWL.OWLRestriction] {
		OWLCardinality_Ref : @[RDFS.TypedLiteral];
	};

	type @[OWL.MaxCardinalityRestriction] : @[OWL.OWLRestriction] {
		OWLMaxCardinality_Ref : @[RDFS.TypedLiteral];
	};

	type @[OWL.MinCardinalityRestriction] : @[OWL.OWLRestriction] {
		OWLMinCardinality_Ref : @[RDFS.TypedLiteral];
	};

	type @[OWL.OWLAnnotationProperty] : @[RDFS.RDFProperty], @[OWL.OWLUniverse];

	type @[OWL.OWLOntologyProperty] : @[RDFS.RDFProperty], @[OWL.OWLUniverse];

	type @[OWL.Property] : @[RDFS.RDFProperty], @[OWL.OWLUniverse] {
		IsDeprecated_Att : Logical;
		OWLEquivalentProperty_Ref : @[OWL.Property]*;
		EquivalentProperty_Ref : @[OWL.Property]*;
	};

	type @[OWL.FunctionalProperty] : @[OWL.Property];

	type @[OWL.OWLDatatypeProperty] : @[OWL.Property];

	type @[OWL.OWLObjectProperty] : @[OWL.Property] {
		OWLInverseOf_Ref : @[OWL.OWLObjectProperty]?;
		InverseProperty_Ref : @[OWL.OWLObjectProperty]*;
	};

	type @[OWL.InverseFunctionalProperty] : @[OWL.OWLObjectProperty];

	type @[OWL.SymmetricProperty] : @[OWL.OWLObjectProperty];

	type @[OWL.TransitiveProperty] : @[OWL.OWLObjectProperty];

	type @[OWL.Individual] : @[RDFS.RDFSResource], @[OWL.OWLUniverse] {
		OWLDifferentFrom_Ref : @[OWL.Individual]*;
		DifferentIndividual_Ref : @[OWL.Individual]*;
		OWLSameAs_Ref : @[OWL.Individual]*;
		SameIndividual_Ref : @[OWL.Individual]*;
		AllDifferent_Ref : @[OWL.OWLAllDifferent]*;
		EnumeratedClass_Ref : @[OWL.EnumeratedClass]*;
		RestrictionClass_Ref : @[OWL.HasValueRestriction]*;
	};

	type @[OWL.OWLAllDifferent] : @[OWL.OWLClass] {
		OWLDistinctMembers_Ref : @[OWL.Individual]#2 ..;
	};

	type @[OWL.OWLDataRange] : @[RDFS.RDFSClass], @[OWL.OWLUniverse] {
		Datatype_Ref : @[RDFS.RDFSDataType]?;
		OWLOneOf_Ref : @[RDFS.RDFSLiteral]*;
		SomeValuesFromRestrictionClass_Ref : @[OWL.SomeValuesFromRestriction]?;
		AllValuesFromRestrictionClass_Ref : @[OWL.AllValuesFromRestriction]?;
	};
}