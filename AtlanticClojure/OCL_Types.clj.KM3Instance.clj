( declare OCLTypes_Type )
( declare OCLTypes_BasicType )
( declare OCLTypes_InstanceType )
( declare OCLTypes_EnumType )
( declare OCLTypes_OclAnyType )
( declare OCLTypes_OclTypeType )
( declare OCLTypes_CollectionType )
( declare OCLTypes_IntegerType )
( declare OCLTypes_RealType )
( declare OCLTypes_StringType )
( declare OCLTypes_BooleanType )
( declare OCLTypes_Classifier )
( declare OCLTypes_EnumLiteral )
( declare OCLTypes_SetType )
( declare OCLTypes_SequenceType )
( declare OCLTypes_BagType )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def OCLTypes ( struct-map
	KM3_Package
	:contents[( def OCLTypes_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supertype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLTypes_Type
			:type OCLTypes_Type
			:location "16:3-16:53"
			:isContainer false
			:opposite subtype
		) ( struct-map
			KM3_Reference
			:name "subtype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLTypes_Type
			:type OCLTypes_Type
			:location "17:3-17:54"
			:isContainer false
			:opposite supertype
		) ( struct-map
			KM3_Reference
			:name "collectionType"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLTypes_Type
			:type OCLTypes_CollectionType
			:location "18:3-18:82"
			:isContainer true
			:opposite elementType
		)]
	) ) ( def OCLTypes_BasicType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLTypes_Type]
		:structuralFeatures[]
	) ) ( def OCLTypes_InstanceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLTypes_InstanceType
			:type OCLTypes_Classifier
			:location "25:3-25:77"
			:isContainer true
			:opposite instanceType
		)]
	) ) ( def OCLTypes_EnumType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumLiteral"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OCLTypes_EnumType
			:type OCLTypes_EnumLiteral
			:location "29:3-29:75"
			:isContainer true
			:opposite enumType
		)]
	) ) ( def OCLTypes_OclAnyType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_Type]
		:structuralFeatures[]
	) ) ( def OCLTypes_OclTypeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_Type]
		:structuralFeatures[]
	) ) ( def OCLTypes_CollectionType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLTypes_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLTypes_CollectionType
			:type OCLTypes_Type
			:location "37:3-37:58"
			:isContainer false
			:opposite collectionType
		)]
	) ) ( def OCLTypes_IntegerType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_BasicType]
		:structuralFeatures[]
	) ) ( def OCLTypes_RealType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_BasicType]
		:structuralFeatures[]
	) ) ( def OCLTypes_StringType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_BasicType]
		:structuralFeatures[]
	) ) ( def OCLTypes_BooleanType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_BasicType]
		:structuralFeatures[]
	) ) ( def OCLTypes_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instanceType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLTypes_Classifier
			:type OCLTypes_InstanceType
			:location "49:3-49:69"
			:isContainer false
			:opposite classifier
		)]
	) ) ( def OCLTypes_EnumLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLTypes_EnumLiteral
			:type OCLTypes_EnumType
			:location "53:3-53:62"
			:isContainer false
			:opposite enumLiteral
		)]
	) ) ( def OCLTypes_SetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_CollectionType]
		:structuralFeatures[]
	) ) ( def OCLTypes_SequenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_CollectionType]
		:structuralFeatures[]
	) ) ( def OCLTypes_BagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLTypes_CollectionType]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "64:2-64:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "65:2-65:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "66:2-66:18"
	) )]
) )
