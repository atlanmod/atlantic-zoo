( declare UnifiedOntologyLanguage_Node )
( declare UnifiedOntologyLanguage_Resource )
( declare UnifiedOntologyLanguage_Literal )
( declare UnifiedOntologyLanguage_Fact )
( declare UnifiedOntologyLanguage_Package )
( declare UnifiedOntologyLanguage_Ontology )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def UnifiedOntologyLanguage ( struct-map
	KM3_Package
	:contents[( def UnifiedOntologyLanguage_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UnifiedOntologyLanguage_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnifiedOntologyLanguage_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnifiedOntologyLanguage_Resource
			:type UnifiedOntologyLanguage_Package
			:location "16:3-16:31"
			:isContainer false
		)]
	) ) ( def UnifiedOntologyLanguage_Literal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnifiedOntologyLanguage_Node]
		:structuralFeatures[]
	) ) ( def UnifiedOntologyLanguage_Fact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnifiedOntologyLanguage_Fact
			:type UnifiedOntologyLanguage_Node
			:location "22:3-22:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "subject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnifiedOntologyLanguage_Fact
			:type UnifiedOntologyLanguage_Resource
			:location "23:3-23:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "predicate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnifiedOntologyLanguage_Fact
			:type UnifiedOntologyLanguage_Resource
			:location "24:3-24:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UnifiedOntologyLanguage_Fact
			:type UnifiedOntologyLanguage_Package
			:location "25:3-25:31"
			:isContainer false
		)]
	) ) ( def UnifiedOntologyLanguage_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnifiedOntologyLanguage_Resource]
		:structuralFeatures[]
	) ) ( def UnifiedOntologyLanguage_Ontology ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UnifiedOntologyLanguage_Package]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "imports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UnifiedOntologyLanguage_Ontology
			:type UnifiedOntologyLanguage_Package
			:location "31:3-31:34"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "41:2-41:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "42:2-42:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "43:2-43:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "44:2-44:18"
	) )]
) )
