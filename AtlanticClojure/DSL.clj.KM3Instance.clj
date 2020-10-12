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
			:location "26:3-26:74"
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
			:location "27:3-27:39"
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
			:location "32:3-32:34"
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSL_Classifier
			:type DSL_ValueProperty
			:location "33:3-33:70"
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
			:location "34:3-34:61"
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
			:location "35:3-35:59"
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
			:location "36:3-36:62"
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
			:location "40:3-40:43"
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
			:location "44:3-44:35"
		) ( struct-map
			KM3_Reference
			:name "roles"
			:upper 2
			:lower 2
			:isOrdered false
			:owner DSL_Relationship
			:type DSL_Role
			:location "45:3-45:61"
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
			:location "49:3-49:27"
		) ( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Integer
			:location "50:3-50:27"
		) ( struct-map
			KM3_Attribute
			:name "isUnbounded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "51:3-51:35"
		) ( struct-map
			KM3_Attribute
			:name "accepts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type String
			:location "52:3-52:30"
		) ( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "53:3-53:33"
		) ( struct-map
			KM3_Attribute
			:name "isNavigableFrom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "54:3-54:39"
		) ( struct-map
			KM3_Attribute
			:name "isPropertyGenerator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type Boolean
			:location "55:3-55:43"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Classifier
			:location "57:4-57:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Classifier
			:location "58:4-58:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSL_Role
			:type DSL_Relationship
			:location "59:3-59:54"
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
			:location "67:3-67:54"
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
			:location "68:3-68:25"
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
			:location "76:3-76:29"
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
			:location "80:3-80:56"
			:isContainer true
		)]
	) ) ( def PrimitiveTypes ( struct-map
		KM3_Package
		:contents[( def ptyp_Boolean ( struct-map
			KM3_DataType
			:name "Boolean"
			:location "85:3-85:20"
		) ) ( def ptyp_Integer ( struct-map
			KM3_DataType
			:name "Integer"
			:location "86:3-86:20"
		) ) ( def ptyp_String ( struct-map
			KM3_DataType
			:name "String"
			:location "87:3-87:19"
		) )]
	) )]
) )
