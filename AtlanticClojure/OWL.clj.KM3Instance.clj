( declare OWL_OWLOntology )
( declare OWL_OWLGraph )
( declare OWL_OWLStatement )
( declare OWL_OWLUniverse )
( declare OWL_OWLClass )
( declare OWL_IntersectionClass )
( declare OWL_UnionClass )
( declare OWL_ComplementClass )
( declare OWL_EnumeratedClass )
( declare OWL_OWLRestriction )
( declare OWL_HasValueRestriction )
( declare OWL_AllValuesFromRestriction )
( declare OWL_SomeValuesFromRestriction )
( declare OWL_CardinalityRestriction )
( declare OWL_MaxCardinalityRestriction )
( declare OWL_MinCardinalityRestriction )
( declare OWL_OWLAnnotationProperty )
( declare OWL_OWLOntologyProperty )
( declare OWL_Property )
( declare OWL_FunctionalProperty )
( declare OWL_OWLDatatypeProperty )
( declare OWL_OWLObjectProperty )
( declare OWL_InverseFunctionalProperty )
( declare OWL_SymmetricProperty )
( declare OWL_TransitiveProperty )
( declare OWL_Individual )
( declare OWL_OWLAllDifferent )
( declare OWL_OWLDataRange )
( declare RDFS_Document )
( declare RDFS_LocalName )
( declare RDFS_Namespace )
( declare RDFS_NamespaceDefinition )
( declare RDFS_RDFSResource )
( declare RDFS_RDFGraph )
( declare RDFS_List )
( declare RDFS_Container )
( declare RDFS_Alt )
( declare RDFS_Bag )
( declare RDFS_Seq )
( declare RDFS_RDFProperty )
( declare RDFS_ContainerMembershipProperty )
( declare RDFS_RDFStatement )
( declare RDFS_ReificationKind )
( declare RDFS_URIReferenceNode )
( declare RDFS_BlankNode )
( declare RDFS_RDFSClass )
( declare RDFS_RDFSDataType )
( declare RDFS_RDFSLiteral )
( declare RDFS_PlainLiteral )
( declare RDFS_TypedLiteral )
( declare RDFS_XMLLiteral )
( declare RDFS_URIReference )
( declare RDFS_UniformResourceIdentifier )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def OWL ( struct-map
	KM3_Package
	:contents[( def OWL_OWLOntology ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owlUniverse"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLUniverse
			:location "13:3-13:62"
			:isContainer false
			:opposite ontology
		) ( struct-map
			KM3_Reference
			:name "OWLPriorVersion"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "14:3-14:71"
			:isContainer false
			:opposite newerOntology
		) ( struct-map
			KM3_Reference
			:name "newerOntology"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "15:3-15:71"
			:isContainer false
			:opposite OWLPriorVersion
		) ( struct-map
			KM3_Reference
			:name "OWLIncompatibleWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "16:3-16:82"
			:isContainer false
			:opposite incompatibleOntology
		) ( struct-map
			KM3_Reference
			:name "incompatibleOntology"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "17:3-17:82"
			:isContainer false
			:opposite OWLIncompatibleWith
		) ( struct-map
			KM3_Reference
			:name "OWLImports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "18:3-18:70"
			:isContainer false
			:opposite importingOntology
		) ( struct-map
			KM3_Reference
			:name "importingOntology"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLOntology
			:location "19:3-19:70"
			:isContainer false
			:opposite OWLImports
		) ( struct-map
			KM3_Reference
			:name "owlGraph"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLGraph
			:location "20:3-20:58"
			:isContainer false
			:opposite ontology
		) ( struct-map
			KM3_Reference
			:name "owlStatement"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OWL_OWLOntology
			:type OWL_OWLStatement
			:location "21:3-21:66"
			:isContainer false
			:opposite ontology
		) ( struct-map
			KM3_Reference
			:name "versionInfo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLOntology
			:type RDFS_RDFSLiteral
			:location "22:3-22:52"
			:isContainer true
		)]
	) ) ( def OWL_OWLGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFGraph]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ontology"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLGraph
			:type OWL_OWLOntology
			:location "28:3-28:59"
			:isContainer false
			:opposite owlGraph
		) ( struct-map
			KM3_Reference
			:name "owlStatement"
			:upper -1
			:lower 1
			:isOrdered true
			:owner OWL_OWLGraph
			:type OWL_OWLStatement
			:location "29:3-29:74"
			:isContainer false
			:opposite owlGraph
		)]
	) ) ( def OWL_OWLStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFStatement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ontology"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OWL_OWLStatement
			:type OWL_OWLOntology
			:location "35:3-35:71"
			:isContainer false
			:opposite owlStatement
		) ( struct-map
			KM3_Reference
			:name "owlGraph"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OWL_OWLStatement
			:type OWL_OWLGraph
			:location "36:3-36:62"
			:isContainer false
			:opposite owlStatement
		)]
	) ) ( def OWL_OWLUniverse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ontology"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OWL_OWLUniverse
			:type OWL_OWLOntology
			:location "42:3-42:64"
			:isContainer false
			:opposite owlUniverse
		)]
	) ) ( def OWL_OWLClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSClass OWL_OWLUniverse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDeprecated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type Boolean
			:location "47:3-47:41"
		) ( struct-map
			KM3_Reference
			:name "OWLequivalentClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_OWLClass
			:location "48:3-48:73"
			:isContainer false
			:opposite equivalentClass
		) ( struct-map
			KM3_Reference
			:name "equivalentClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_OWLClass
			:location "49:3-49:73"
			:isContainer false
			:opposite OWLequivalentClass
		) ( struct-map
			KM3_Reference
			:name "OWLdisjointWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_OWLClass
			:location "50:3-50:68"
			:isContainer false
			:opposite disjointClass
		) ( struct-map
			KM3_Reference
			:name "disjointClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_OWLClass
			:location "51:3-51:68"
			:isContainer false
			:opposite OWLdisjointWith
		) ( struct-map
			KM3_Reference
			:name "intersectionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_IntersectionClass
			:location "52:3-52:83"
			:isContainer false
			:opposite OWLIntersectionOf
		) ( struct-map
			KM3_Reference
			:name "unionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_UnionClass
			:location "53:3-53:62"
			:isContainer false
			:opposite OWLUnionOf
		) ( struct-map
			KM3_Reference
			:name "complementClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_ComplementClass
			:location "54:3-54:77"
			:isContainer false
			:opposite OWLComplementOf
		) ( struct-map
			KM3_Reference
			:name "allValuesFromRestrictionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_AllValuesFromRestriction
			:location "55:3-55:106"
			:isContainer false
			:opposite OWLAllValuesFromClass
		) ( struct-map
			KM3_Reference
			:name "someValuesFromRestrictionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLClass
			:type OWL_SomeValuesFromRestriction
			:location "56:3-56:109"
			:isContainer false
			:opposite OWLSomeValuesFromClass
		)]
	) ) ( def OWL_IntersectionClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLIntersectionOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_IntersectionClass
			:type OWL_OWLClass
			:location "60:3-60:74"
			:isContainer false
			:opposite intersectionClass
		)]
	) ) ( def OWL_UnionClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLUnionOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_UnionClass
			:type OWL_OWLClass
			:location "64:3-64:60"
			:isContainer false
			:opposite unionClass
		)]
	) ) ( def OWL_ComplementClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLComplementOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_ComplementClass
			:type OWL_OWLClass
			:location "68:3-68:70"
			:isContainer false
			:opposite complementClass
		)]
	) ) ( def OWL_EnumeratedClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLOneOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_EnumeratedClass
			:type OWL_Individual
			:location "72:3-72:65"
			:isContainer false
			:opposite enumeratedClass
		)]
	) ) ( def OWL_OWLRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLOnProperty"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OWL_OWLRestriction
			:type RDFS_RDFProperty
			:location "77:3-77:72"
			:isContainer false
			:opposite propertyRestriction
		)]
	) ) ( def OWL_HasValueRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLHasLiteralValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_HasValueRestriction
			:type RDFS_RDFSLiteral
			:location "81:3-81:79"
			:isContainer false
			:opposite restrictionClass
		) ( struct-map
			KM3_Reference
			:name "OWLHasIndividualValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_HasValueRestriction
			:type OWL_Individual
			:location "82:3-82:81"
			:isContainer false
			:opposite restrictionClass
		)]
	) ) ( def OWL_AllValuesFromRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLAllValuesFromDataRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_AllValuesFromRestriction
			:type OWL_OWLDataRange
			:location "86:3-86:100"
			:isContainer false
			:opposite allValuesFromRestrictionClass
		) ( struct-map
			KM3_Reference
			:name "OWLAllValuesFromClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_AllValuesFromRestriction
			:type OWL_OWLClass
			:location "87:3-87:92"
			:isContainer false
			:opposite allValuesFromRestrictionClass
		)]
	) ) ( def OWL_SomeValuesFromRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLSomeValuesFromClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_SomeValuesFromRestriction
			:type OWL_OWLClass
			:location "91:3-91:94"
			:isContainer false
			:opposite someValuesFromRestrictionClass
		) ( struct-map
			KM3_Reference
			:name "OWLSomeValuesFromDataRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_SomeValuesFromRestriction
			:type OWL_OWLDataRange
			:location "92:3-92:102"
			:isContainer false
			:opposite someValuesFromRestrictionClass
		)]
	) ) ( def OWL_CardinalityRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OWL_CardinalityRestriction
			:type RDFS_TypedLiteral
			:location "96:3-96:77"
			:isContainer false
			:opposite cardinalityRestriction
		)]
	) ) ( def OWL_MaxCardinalityRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLMaxCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OWL_MaxCardinalityRestriction
			:type RDFS_TypedLiteral
			:location "100:3-100:83"
			:isContainer false
			:opposite maxCardinalityRestriction
		)]
	) ) ( def OWL_MinCardinalityRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLRestriction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLMinCardinality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OWL_MinCardinalityRestriction
			:type RDFS_TypedLiteral
			:location "104:3-104:83"
			:isContainer false
			:opposite minCardinalityRestriction
		)]
	) ) ( def OWL_OWLAnnotationProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFProperty OWL_OWLUniverse]
		:structuralFeatures[]
	) ) ( def OWL_OWLOntologyProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFProperty OWL_OWLUniverse]
		:structuralFeatures[]
	) ) ( def OWL_Property ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[RDFS_RDFProperty OWL_OWLUniverse]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDeprecated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_Property
			:type Boolean
			:location "117:3-117:41"
		) ( struct-map
			KM3_Reference
			:name "OWLEquivalentProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Property
			:type OWL_Property
			:location "118:3-118:79"
			:isContainer false
			:opposite equivalentProperty
		) ( struct-map
			KM3_Reference
			:name "equivalentProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Property
			:type OWL_Property
			:location "119:3-119:79"
			:isContainer false
			:opposite OWLEquivalentProperty
		)]
	) ) ( def OWL_FunctionalProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_Property]
		:structuralFeatures[]
	) ) ( def OWL_OWLDatatypeProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_Property]
		:structuralFeatures[]
	) ) ( def OWL_OWLObjectProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_Property]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLInverseOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_OWLObjectProperty
			:type OWL_OWLObjectProperty
			:location "129:3-129:78"
			:isContainer false
			:opposite inverseProperty
		) ( struct-map
			KM3_Reference
			:name "inverseProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLObjectProperty
			:type OWL_OWLObjectProperty
			:location "130:3-130:76"
			:isContainer false
			:opposite OWLInverseOf
		)]
	) ) ( def OWL_InverseFunctionalProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLObjectProperty]
		:structuralFeatures[]
	) ) ( def OWL_SymmetricProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLObjectProperty]
		:structuralFeatures[]
	) ) ( def OWL_TransitiveProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLObjectProperty]
		:structuralFeatures[]
	) ) ( def OWL_Individual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource OWL_OWLUniverse]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLDifferentFrom"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_Individual
			:location "145:3-145:77"
			:isContainer false
			:opposite differentIndividual
		) ( struct-map
			KM3_Reference
			:name "differentIndividual"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_Individual
			:location "146:3-146:77"
			:isContainer false
			:opposite OWLDifferentFrom
		) ( struct-map
			KM3_Reference
			:name "OWLSameAs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_Individual
			:location "147:3-147:65"
			:isContainer false
			:opposite sameIndividual
		) ( struct-map
			KM3_Reference
			:name "sameIndividual"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_Individual
			:location "148:3-148:65"
			:isContainer false
			:opposite OWLSameAs
		) ( struct-map
			KM3_Reference
			:name "allDifferent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_OWLAllDifferent
			:location "149:3-149:77"
			:isContainer false
			:opposite OWLDistinctMembers
		) ( struct-map
			KM3_Reference
			:name "enumeratedClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_EnumeratedClass
			:location "150:3-150:70"
			:isContainer false
			:opposite OWLOneOf
		) ( struct-map
			KM3_Reference
			:name "restrictionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_Individual
			:type OWL_HasValueRestriction
			:location "151:3-151:88"
			:isContainer false
			:opposite OWLHasIndividualValue
		)]
	) ) ( def OWL_OWLAllDifferent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OWL_OWLClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "OWLDistinctMembers"
			:upper -1
			:lower 2
			:isOrdered false
			:owner OWL_OWLAllDifferent
			:type OWL_Individual
			:location "155:3-155:74"
			:isContainer false
			:opposite allDifferent
		)]
	) ) ( def OWL_OWLDataRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSClass OWL_OWLUniverse]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "datatype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_OWLDataRange
			:type RDFS_RDFSDataType
			:location "161:3-161:65"
			:isContainer false
			:opposite dataRange
		) ( struct-map
			KM3_Reference
			:name "OWLOneOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OWL_OWLDataRange
			:type RDFS_RDFSLiteral
			:location "162:3-162:60"
			:isContainer false
			:opposite dataRange
		) ( struct-map
			KM3_Reference
			:name "someValuesFromRestrictionClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_OWLDataRange
			:type OWL_SomeValuesFromRestriction
			:location "163:3-163:115"
			:isContainer false
			:opposite OWLSomeValuesFromDataRange
		) ( struct-map
			KM3_Reference
			:name "allValuesFromRestrictionClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OWL_OWLDataRange
			:type OWL_AllValuesFromRestriction
			:location "164:3-164:112"
			:isContainer false
			:opposite OWLAllValuesFromDataRange
		)]
	) )]
) )
( def RDFS ( struct-map
	KM3_Package
	:contents[( def ReificationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "none"
		:location "264:3-264:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "reifiedOnly"
		:location "265:3-265:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "reified"
		:location "266:3-266:21"
	)] ) ) ( def RDFS_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "localName"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Document
			:type RDFS_LocalName
			:location "174:3-174:68"
			:isContainer true
			:opposite document
		) ( struct-map
			KM3_Reference
			:name "xmlBase"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Document
			:type RDFS_Namespace
			:location "175:3-175:57"
			:isContainer false
			:opposite document
		) ( struct-map
			KM3_Reference
			:name "namespaceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Document
			:type RDFS_NamespaceDefinition
			:location "176:3-176:88"
			:isContainer true
			:opposite document
		) ( struct-map
			KM3_Reference
			:name "statement"
			:upper -1
			:lower 1
			:isOrdered true
			:owner RDFS_Document
			:type RDFS_RDFStatement
			:location "177:3-177:71"
			:isContainer false
			:opposite document
		)]
	) ) ( def RDFS_LocalName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_LocalName
			:type String
			:location "181:3-181:27"
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_LocalName
			:type RDFS_Document
			:location "182:3-182:54"
			:isContainer false
			:opposite localName
		) ( struct-map
			KM3_Reference
			:name "uriRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_LocalName
			:type RDFS_URIReference
			:location "183:3-183:68"
			:isContainer false
			:opposite fragmentIdentifier
		)]
	) ) ( def RDFS_Namespace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "document"
			:upper -1
			:lower 1
			:isOrdered false
			:owner RDFS_Namespace
			:type RDFS_Document
			:location "187:3-187:57"
			:isContainer false
			:opposite xmlBase
		) ( struct-map
			KM3_Reference
			:name "namespaceURIRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_Namespace
			:type RDFS_URIReference
			:location "188:3-188:65"
			:isContainer false
			:opposite namespace
		) ( struct-map
			KM3_Reference
			:name "namespaceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_Namespace
			:type RDFS_NamespaceDefinition
			:location "189:3-189:79"
			:isContainer false
			:opposite namespace
		)]
	) ) ( def RDFS_NamespaceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespacePrefix"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_NamespaceDefinition
			:type String
			:location "193:3-193:38"
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_NamespaceDefinition
			:type RDFS_Document
			:location "194:3-194:64"
			:isContainer false
			:opposite namespaceDefinition
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_NamespaceDefinition
			:type RDFS_Namespace
			:location "195:3-195:66"
			:isContainer false
			:opposite namespaceDefinition
		)]
	) ) ( def RDFS_RDFSResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "uriRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_URIReference
			:location "201:3-201:68"
			:isContainer true
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "subjectStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFStatement
			:location "203:3-203:70"
			:isContainer false
			:opposite RDFsubject
		) ( struct-map
			KM3_Reference
			:name "objectStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFStatement
			:location "204:3-204:68"
			:isContainer false
			:opposite RDFobject
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_PlainLiteral
			:location "206:3-206:74"
			:isContainer true
			:opposite labeledResource
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper -1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSClass
			:location "207:3-207:60"
			:isContainer false
			:opposite typedResource
		) ( struct-map
			KM3_Reference
			:name "comment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_PlainLiteral
			:location "209:3-209:78"
			:isContainer true
			:opposite commentedResource
		) ( struct-map
			KM3_Reference
			:name "seeAlso"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "210:3-210:68"
			:isContainer false
			:opposite referringResource
		) ( struct-map
			KM3_Reference
			:name "referringResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "211:3-211:68"
			:isContainer false
			:opposite seeAlso
		) ( struct-map
			KM3_Reference
			:name "isDefinedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "212:3-212:70"
			:isContainer false
			:opposite definedResource
		) ( struct-map
			KM3_Reference
			:name "definedResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "213:3-213:70"
			:isContainer false
			:opposite isDefinedBy
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "215:3-215:61"
			:isContainer false
			:opposite container
		) ( struct-map
			KM3_Reference
			:name "container"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_RDFSResource
			:location "216:3-216:61"
			:isContainer false
			:opposite member
		) ( struct-map
			KM3_Reference
			:name "list"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSResource
			:type RDFS_List
			:location "217:3-217:45"
			:isContainer false
			:opposite first
		)]
	) ) ( def RDFS_RDFGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "graphName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFGraph
			:type RDFS_URIReference
			:location "221:3-221:75"
			:isContainer true
			:opposite namedGraph
		) ( struct-map
			KM3_Reference
			:name "statement"
			:upper -1
			:lower 1
			:isOrdered true
			:owner RDFS_RDFGraph
			:type RDFS_RDFStatement
			:location "222:3-222:68"
			:isContainer false
			:opposite graph
		)]
	) ) ( def RDFS_List ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "first"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_RDFSResource
			:location "227:3-227:55"
			:isContainer false
			:opposite list
		) ( struct-map
			KM3_Reference
			:name "rest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_List
			:location "228:3-228:54"
			:isContainer false
			:opposite originalList
		) ( struct-map
			KM3_Reference
			:name "originalList"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_List
			:type RDFS_List
			:location "229:3-229:52"
			:isContainer false
			:opposite rest
		)]
	) ) ( def RDFS_Container ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[]
	) ) ( def RDFS_Alt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_Bag ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_Seq ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_Container]
		:structuralFeatures[]
	) ) ( def RDFS_RDFProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "predicateStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type RDFS_RDFStatement
			:location "240:3-240:74"
			:isContainer false
			:opposite RDFpredicate
		) ( struct-map
			KM3_Reference
			:name "subPropertyOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type RDFS_RDFProperty
			:location "241:3-241:69"
			:isContainer false
			:opposite superProperty
		) ( struct-map
			KM3_Reference
			:name "superProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type RDFS_RDFProperty
			:location "242:3-242:69"
			:isContainer false
			:opposite subPropertyOf
		) ( struct-map
			KM3_Reference
			:name "domain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type RDFS_RDFSClass
			:location "243:3-243:64"
			:isContainer false
			:opposite propertyForDomain
		) ( struct-map
			KM3_Reference
			:name "range"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type RDFS_RDFSClass
			:location "244:3-244:62"
			:isContainer false
			:opposite propertyForRange
		) ( struct-map
			KM3_Reference
			:name "propertyRestriction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFProperty
			:type OWL_OWLRestriction
			:location "245:3-245:78"
			:isContainer false
			:opposite OWLOnProperty
		)]
	) ) ( def RDFS_ContainerMembershipProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def RDFS_RDFStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "reificationKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFStatement
			:type ReificationKind
			:location "252:3-252:47"
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper -1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_RDFGraph
			:location "253:3-253:56"
			:isContainer false
			:opposite statement
		) ( struct-map
			KM3_Reference
			:name "RDFpredicate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_RDFProperty
			:location "255:3-255:75"
			:isContainer false
			:opposite predicateStatement
		) ( struct-map
			KM3_Reference
			:name "RDFobject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_RDFSResource
			:location "256:3-256:65"
			:isContainer false
			:opposite objectStatement
		) ( struct-map
			KM3_Reference
			:name "RDFsubject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_RDFSResource
			:location "257:3-257:67"
			:isContainer false
			:opposite subjectStatement
		) ( struct-map
			KM3_Reference
			:name "nameForReification"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_URIReference
			:location "259:3-259:78"
			:isContainer false
			:opposite reifiedStatement
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper -1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFStatement
			:type RDFS_Document
			:location "260:3-260:59"
			:isContainer false
			:opposite statement
		)]
	) ) ( def RDFS_URIReferenceNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[]
	) ) ( def RDFS_BlankNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nodeId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_BlankNode
			:type String
			:location "272:3-272:34"
		)]
	) ) ( def RDFS_RDFSClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subClassOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSClass
			:type RDFS_RDFSClass
			:location "277:3-277:61"
			:isContainer false
			:opposite superClass
		) ( struct-map
			KM3_Reference
			:name "superClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSClass
			:type RDFS_RDFSClass
			:location "278:3-278:61"
			:isContainer false
			:opposite subClassOf
		) ( struct-map
			KM3_Reference
			:name "typedResource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSClass
			:type RDFS_RDFSResource
			:location "279:3-279:61"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "propertyForDomain"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSClass
			:type RDFS_RDFProperty
			:location "280:3-280:66"
			:isContainer false
			:opposite domain
		) ( struct-map
			KM3_Reference
			:name "propertyForRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSClass
			:type RDFS_RDFProperty
			:location "281:3-281:64"
			:isContainer false
			:opposite range
		)]
	) ) ( def RDFS_RDFSDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSClass]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dataRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSDataType
			:type OWL_OWLDataRange
			:location "285:3-285:63"
			:isContainer false
			:opposite datatype
		)]
	) ) ( def RDFS_RDFSLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSResource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lexicalForm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_RDFSLiteral
			:type String
			:location "291:3-291:34"
		) ( struct-map
			KM3_Reference
			:name "restrictionClass"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSLiteral
			:type OWL_HasValueRestriction
			:location "292:3-292:85"
			:isContainer false
			:opposite OWLHasLiteralValue
		) ( struct-map
			KM3_Reference
			:name "dataRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_RDFSLiteral
			:type OWL_OWLDataRange
			:location "293:3-293:61"
			:isContainer false
			:opposite OWLOneOf
		)]
	) ) ( def RDFS_PlainLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSLiteral]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_PlainLiteral
			:type String
			:location "297:3-297:36"
		) ( struct-map
			KM3_Reference
			:name "labeledResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_PlainLiteral
			:type RDFS_RDFSResource
			:location "298:3-298:61"
			:isContainer false
			:opposite label
		) ( struct-map
			KM3_Reference
			:name "commentedResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_PlainLiteral
			:type RDFS_RDFSResource
			:location "299:3-299:65"
			:isContainer false
			:opposite comment
		)]
	) ) ( def RDFS_TypedLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_RDFSLiteral]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "datatypeURI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_TypedLiteral
			:type RDFS_URIReference
			:location "303:3-303:61"
			:isContainer false
			:opposite literal
		) ( struct-map
			KM3_Reference
			:name "cardinalityRestriction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_TypedLiteral
			:type OWL_CardinalityRestriction
			:location "304:3-304:90"
			:isContainer false
			:opposite OWLCardinality
		) ( struct-map
			KM3_Reference
			:name "minCardinalityRestriction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_TypedLiteral
			:type OWL_MinCardinalityRestriction
			:location "305:3-305:99"
			:isContainer false
			:opposite OWLMinCardinality
		) ( struct-map
			KM3_Reference
			:name "maxCardinalityRestriction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_TypedLiteral
			:type OWL_MaxCardinalityRestriction
			:location "306:3-306:99"
			:isContainer false
			:opposite OWLMaxCardinality
		)]
	) ) ( def RDFS_XMLLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_TypedLiteral]
		:structuralFeatures[]
	) ) ( def RDFS_URIReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_UniformResourceIdentifier
			:location "315:3-315:68"
			:isContainer false
			:opposite uriRef
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_RDFSResource
			:location "316:3-316:60"
			:isContainer false
			:opposite uriRef
		) ( struct-map
			KM3_Reference
			:name "literal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_TypedLiteral
			:location "317:3-317:64"
			:isContainer false
			:opposite datatypeURI
		) ( struct-map
			KM3_Reference
			:name "namedGraph"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_RDFGraph
			:location "318:3-318:61"
			:isContainer false
			:opposite graphName
		) ( struct-map
			KM3_Reference
			:name "reifiedStatement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_RDFStatement
			:location "319:3-319:78"
			:isContainer false
			:opposite nameForReification
		) ( struct-map
			KM3_Reference
			:name "fragmentIdentifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_LocalName
			:location "320:3-320:67"
			:isContainer false
			:opposite uriRef
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RDFS_URIReference
			:type RDFS_Namespace
			:location "321:3-321:67"
			:isContainer false
			:opposite namespaceURIRef
		)]
	) ) ( def RDFS_UniformResourceIdentifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RDFS_URIReference]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RDFS_UniformResourceIdentifier
			:type String
			:location "325:3-325:27"
		) ( struct-map
			KM3_Reference
			:name "uriRef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RDFS_UniformResourceIdentifier
			:type RDFS_URIReference
			:location "326:3-326:53"
			:isContainer false
			:opposite uri
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "332:2-332:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "333:2-333:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "334:2-334:18"
	) )]
) )
