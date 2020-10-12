( declare COBOL_COBOLUsageValue )
( declare COBOL_COBOLInitialValueKind )
( declare COBOL_COBOLElement )
( declare COBOL_COBOLClassifier )
( declare COBOL_COBOLSimpleType )
( declare COBOL_COBOLComposedType )
( declare COBOL_COBOLElementInitialValue )
( declare COBOL_COBOL88Element )
( declare COBOL_COBOL88ElementValue )
( declare COBOL_COBOLRedefiningElement )
( declare COBOL_COBOL66Element )
( declare COBOL_COBOLSourceText )
( declare COBOL_COBOLFixedLengthArray )
( declare COBOL_COBOLVariableLengthArray )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def COBOL ( struct-map
	KM3_Package
	:contents[( def COBOLUsageValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cuv_binary"
		:location "14:3-14:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_dbcs"
		:location "15:3-15:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_double"
		:location "16:3-16:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_display"
		:location "17:3-17:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_float"
		:location "18:3-18:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_index"
		:location "19:3-19:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_objectReference"
		:location "20:3-20:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_packedDecimal"
		:location "21:3-21:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_pointer"
		:location "22:3-22:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cuv_procedurePointer"
		:location "23:3-23:32"
	)] ) ) ( def COBOLInitialValueKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "civk_string_value"
		:location "27:3-27:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_low_value"
		:location "28:3-28:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_high_value"
		:location "29:3-29:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_zero_value"
		:location "30:3-30:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_quotes"
		:location "31:3-31:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_null"
		:location "32:3-32:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "civk_all_literal"
		:location "33:3-33:28"
	)] ) ) ( def COBOL_COBOLElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElement
			:type String
			:location "42:3-42:28"
		) ( struct-map
			KM3_Attribute
			:name "refined"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElement
			:type Boolean
			:location "44:3-44:31"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElement
			:type String
			:location "45:3-45:27"
		) ( struct-map
			KM3_Reference
			:name "sharedType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOLClassifier
			:location "46:3-46:67"
			:isContainer false
			:opposite typedElements
		) ( struct-map
			KM3_Reference
			:name "group"
			:upper 1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOLComposedType
			:location "47:3-47:64"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "initial"
			:upper -1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOLElementInitialValue
			:location "48:3-48:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOL88Element
			:location "49:3-49:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOLSourceText
			:location "50:3-50:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "array"
			:upper 1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLElement
			:type COBOL_COBOLFixedLengthArray
			:location "51:3-51:58"
			:isContainer true
		)]
	) ) ( def COBOL_COBOLClassifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "typeded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLClassifier
			:type Boolean
			:location "55:3-55:31"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLClassifier
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Reference
			:name "typedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLClassifier
			:type COBOL_COBOLElement
			:location "57:3-57:67"
			:isContainer false
			:opposite sharedType
		)]
	) ) ( def COBOL_COBOLSimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[COBOL_COBOLClassifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "usageValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLSimpleType
			:type COBOLUsageValue
			:location "61:3-61:42"
		) ( struct-map
			KM3_Attribute
			:name "pictureString"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLSimpleType
			:type String
			:location "62:3-62:36"
		) ( struct-map
			KM3_Attribute
			:name "usage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLSimpleType
			:type Boolean
			:location "64:3-64:29"
		)]
	) ) ( def COBOL_COBOLComposedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[COBOL_COBOLClassifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOLComposedType
			:type COBOL_COBOLElement
			:location "68:3-68:67"
			:isContainer true
			:opposite group
		)]
	) ) ( def COBOL_COBOLElementInitialValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "initVal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElementInitialValue
			:type String
			:location "72:3-72:30"
		) ( struct-map
			KM3_Attribute
			:name "valueKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLElementInitialValue
			:type COBOLInitialValueKind
			:location "74:3-74:47"
		)]
	) ) ( def COBOL_COBOL88Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL88Element
			:type String
			:location "78:3-78:27"
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL88Element
			:type COBOL_COBOL88ElementValue
			:location "79:3-79:54"
			:isContainer true
		)]
	) ) ( def COBOL_COBOL88ElementValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lowerLimit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL88ElementValue
			:type String
			:location "83:3-83:33"
		) ( struct-map
			KM3_Attribute
			:name "upperLimit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL88ElementValue
			:type String
			:location "84:3-84:33"
		) ( struct-map
			KM3_Attribute
			:name "range"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL88ElementValue
			:type Boolean
			:location "85:3-85:29"
		)]
	) ) ( def COBOL_COBOLRedefiningElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[COBOL_COBOLElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "redefines"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLRedefiningElement
			:type COBOL_COBOLElement
			:location "89:3-89:38"
			:isContainer false
		)]
	) ) ( def COBOL_COBOL66Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL66Element
			:type String
			:location "93:3-93:27"
		) ( struct-map
			KM3_Reference
			:name "end"
			:upper 1
			:lower 0
			:isOrdered false
			:owner COBOL_COBOL66Element
			:type COBOL_COBOLElement
			:location "94:3-94:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOL66Element
			:type COBOL_COBOLElement
			:location "95:3-95:34"
			:isContainer false
		)]
	) ) ( def COBOL_COBOLSourceText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLSourceText
			:type String
			:location "99:3-99:29"
		) ( struct-map
			KM3_Attribute
			:name "fileName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLSourceText
			:type String
			:location "100:3-100:31"
		)]
	) ) ( def COBOL_COBOLFixedLengthArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxUpper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLFixedLengthArray
			:type Integer
			:location "104:3-104:32"
		)]
	) ) ( def COBOL_COBOLVariableLengthArray ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[COBOL_COBOLFixedLengthArray]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "minUpper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLVariableLengthArray
			:type Integer
			:location "108:3-108:32"
		) ( struct-map
			KM3_Reference
			:name "dependingOn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner COBOL_COBOLVariableLengthArray
			:type COBOL_COBOLElement
			:location "109:3-109:40"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "119:2-119:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "120:2-120:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "121:2-121:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "122:2-122:18"
	) )]
) )
