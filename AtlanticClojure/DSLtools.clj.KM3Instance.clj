( declare DSL_NamedElement )
( declare DSL_LoadedElement )
( declare DSL_Namespace )
( declare DSL_DomainModel )
( declare DSL_Classifier )
( declare DSL_Class )
( declare DSL_Relationship )
( declare DSL_Role )
( declare DSL_ValueProperty )
( declare DSL_Type )
( declare DSL_SimpleType )
( declare DSL_EnumerationLiteral )
( declare DSL_Enumeration )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def DSL ( struct-map
	KM3_Package
	:contents[( def DSL_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_NamedElement
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "identity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_NamedElement
			:type String
			:location "13:3-13:31"
		)]
	) ) ( def DSL_LoadedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DSL_Namespace]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isLoaded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_LoadedElement
			:type Boolean
			:location "17:3-17:32"
		)]
	) ) ( def DSL_Namespace ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DSL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Namespace
			:type String
			:location "21:3-21:32"
		)]
	) ) ( def DSL_DomainModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_LoadedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classifiers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_DomainModel
			:type DSL_Classifier
			:location "25:3-25:74"
			:isContainer true
			:opposite domainModel
		) ( struct-map
			KM3_Reference
			:name "types"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_DomainModel
			:type DSL_Type
			:location "26:3-26:39"
			:isContainer true
		)]
	) ) ( def DSL_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DSL_LoadedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Classifier
			:type Boolean
			:location "30:3-30:34"
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_Classifier
			:type DSL_ValueProperty
			:location "31:3-31:70"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "superType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DSL_Classifier
			:type DSL_Classifier
			:location "32:3-32:61"
			:isContainer false
			:opposite subTypes
		) ( struct-map
			KM3_Reference
			:name "subTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_Classifier
			:type DSL_Classifier
			:location "33:3-33:59"
			:isContainer false
			:opposite superType
		) ( struct-map
			KM3_Reference
			:name "domainModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Classifier
			:type DSL_DomainModel
			:location "34:3-34:62"
			:isContainer false
			:opposite classifiers
		)]
	) ) ( def DSL_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isSerializationRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Class
			:type Boolean
			:location "38:3-38:43"
		)]
	) ) ( def DSL_Relationship ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isEmbedding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Relationship
			:type Boolean
			:location "42:3-42:35"
		) ( struct-map
			KM3_Reference
			:name "roles"
			:upper 2
			:lower 2
			:isOrdered false
			:owner DSL_Relationship
			:type DSL_Role
			:location "43:3-43:61"
			:isContainer true
			:opposite relation
		)]
	) ) ( def DSL_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "min"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Integer
			:location "47:3-47:27"
		) ( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Integer
			:location "48:3-48:27"
		) ( struct-map
			KM3_Attribute
			:name "isUnbounded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "49:3-49:35"
		) ( struct-map
			KM3_Attribute
			:name "accepts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type String
			:location "50:3-50:30"
		) ( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "51:3-51:33"
		) ( struct-map
			KM3_Attribute
			:name "isNavigableFrom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "52:3-52:39"
		) ( struct-map
			KM3_Attribute
			:name "isPropertyGenerator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "53:3-53:43"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Classifier
			:location "54:3-54:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Classifier
			:location "55:3-55:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Relationship
			:location "56:3-56:54"
			:isContainer false
			:opposite roles
		)]
	) ) ( def DSL_ValueProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_ValueProperty
			:type DSL_Classifier
			:location "60:3-60:54"
			:isContainer false
			:opposite properties
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_ValueProperty
			:type DSL_Type
			:location "61:3-61:25"
			:isContainer false
		)]
	) ) ( def DSL_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DSL_Namespace]
		:structuralFeatures[]
	) ) ( def DSL_SimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_Type]
		:structuralFeatures[]
	) ) ( def DSL_EnumerationLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_EnumerationLiteral
			:type Integer
			:location "73:3-73:29"
		)]
	) ) ( def DSL_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSL_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "literals"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_Enumeration
			:type DSL_EnumerationLiteral
			:location "77:3-77:56"
			:isContainer true
		)]
	) ) ( def PrimitiveTypes ( struct-map
		KM3_Package
		:contents[( def ptyp_Boolean ( struct-map
			KM3_DataType
			:name "Boolean"
			:location "82:3-82:20"
		) ) ( def ptyp_Integer ( struct-map
			KM3_DataType
			:name "Integer"
			:location "84:3-84:20"
		) ) ( def ptyp_String ( struct-map
			KM3_DataType
			:name "String"
			:location "86:3-86:19"
		) )]
	) )]
) )
