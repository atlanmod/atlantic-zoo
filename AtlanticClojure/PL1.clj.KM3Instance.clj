( declare PL/I_PLIClassifier )
( declare PL/I_PLISimpleType )
( declare PL/I_PLINamedType )
( declare PL/I_PLIComposedType )
( declare PL/I_PLIAlias )
( declare PL/I_PLIAttribute )
( declare PL/I_PLIComputationalType )
( declare PL/I_PLINonComputationalType )
( declare PL/I_PLIElement )
( declare PL/I_PLIElementInitialValue )
( declare PL/I_PLISourceText )
( declare PL/I_PLIArray )
( declare PL/I_PLIFixedBoundArray )
( declare PL/I_PLIFixedLboundArray )
( declare PL/I_PLIHBoundArray )
( declare PL/I_PLIVariableBoundArray )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def PL/I ( struct-map
	KM3_Package
	:contents[( def PL/I_PLIClassifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIClassifier
			:type String
			:location "11:3-11:27"
		) ( struct-map
			KM3_Reference
			:name "typedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIClassifier
			:type PL/I_PLIElement
			:location "12:3-12:65"
			:isContainer false
			:opposite sharedType
		)]
	) ) ( def PL/I_PLISimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIClassifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "alias"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLISimpleType
			:type PL/I_PLIAlias
			:location "16:3-16:46"
			:isContainer false
			:opposite type
		)]
	) ) ( def PL/I_PLINamedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIClassifier]
		:structuralFeatures[]
	) ) ( def PL/I_PLIComposedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIClassifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIComposedType
			:type PL/I_PLIElement
			:location "22:3-22:65"
			:isContainer true
			:opposite group
		)]
	) ) ( def PL/I_PLIAlias ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIAlias
			:type PL/I_PLISimpleType
			:location "26:3-26:61"
			:isContainer true
			:opposite alias
		) ( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIAlias
			:type PL/I_PLIAttribute
			:location "27:3-27:52"
			:isContainer true
		)]
	) ) ( def PL/I_PLIAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PL/I_PLIComputationalType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLISimpleType]
		:structuralFeatures[]
	) ) ( def PL/I_PLINonComputationalType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLISimpleType]
		:structuralFeatures[]
	) ) ( def PL/I_PLIElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIElement
			:type String
			:location "37:3-37:28"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIElement
			:type String
			:location "38:3-38:27"
		) ( struct-map
			KM3_Reference
			:name "sharedType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIElement
			:type PL/I_PLIClassifier
			:location "39:3-39:70"
			:isContainer false
			:opposite typedElements
		) ( struct-map
			KM3_Reference
			:name "group"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIElement
			:type PL/I_PLIComposedType
			:location "40:3-40:62"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "initial"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIElement
			:type PL/I_PLIElementInitialValue
			:location "41:3-41:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIElement
			:type PL/I_PLISourceText
			:location "42:3-42:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "array"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIElement
			:type PL/I_PLIArray
			:location "43:3-43:64"
			:isContainer true
			:opposite arrayOf
		)]
	) ) ( def PL/I_PLIElementInitialValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "initialValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIElementInitialValue
			:type String
			:location "47:3-47:35"
		)]
	) ) ( def PL/I_PLISourceText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLISourceText
			:type String
			:location "51:3-51:29"
		) ( struct-map
			KM3_Attribute
			:name "fileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLISourceText
			:type String
			:location "52:3-52:31"
		)]
	) ) ( def PL/I_PLIArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arrayOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PL/I_PLIArray
			:type PL/I_PLIElement
			:location "56:3-56:56"
			:isContainer false
			:opposite array
		)]
	) ) ( def PL/I_PLIFixedBoundArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIArray]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "IBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedBoundArray
			:type Integer
			:location "60:3-60:30"
		) ( struct-map
			KM3_Attribute
			:name "uBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedBoundArray
			:type Integer
			:location "61:3-61:30"
		) ( struct-map
			KM3_Reference
			:name "referredTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedBoundArray
			:type PL/I_PLIElement
			:location "62:3-62:37"
			:isContainer false
		)]
	) ) ( def PL/I_PLIFixedLboundArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIArray]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "IBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedLboundArray
			:type Integer
			:location "66:3-66:30"
		) ( struct-map
			KM3_Attribute
			:name "uBoundToAllocate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedLboundArray
			:type String
			:location "67:3-67:39"
		) ( struct-map
			KM3_Reference
			:name "referredTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIFixedLboundArray
			:type PL/I_PLIElement
			:location "68:3-68:37"
			:isContainer false
		)]
	) ) ( def PL/I_PLIHBoundArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIArray]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIHBoundArray
			:type Integer
			:location "72:3-72:30"
		) ( struct-map
			KM3_Attribute
			:name "IBoundToAllocate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIHBoundArray
			:type String
			:location "73:3-73:39"
		) ( struct-map
			KM3_Reference
			:name "referredTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIHBoundArray
			:type PL/I_PLIElement
			:location "74:3-74:37"
			:isContainer false
		)]
	) ) ( def PL/I_PLIVariableBoundArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PL/I_PLIArray]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "IBoundToAllocate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIVariableBoundArray
			:type String
			:location "78:3-78:39"
		) ( struct-map
			KM3_Attribute
			:name "hBoundToAllocate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIVariableBoundArray
			:type String
			:location "79:3-79:39"
		) ( struct-map
			KM3_Reference
			:name "referredTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PL/I_PLIVariableBoundArray
			:type PL/I_PLIElement
			:location "80:3-80:37"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "86:2-86:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "87:2-87:19"
	) )]
) )
