( declare OCLValues_Value )
( declare OCLValues_Type )
( declare OCLValues_BasicValue )
( declare OCLValues_IntegerValue )
( declare OCLValues_RealValue )
( declare OCLValues_StringValue )
( declare OCLValues_BooleanValue )
( declare OCLValues_ObjectValue )
( declare OCLValues_Object )
( declare OCLValues_EnumValue )
( declare OCLValues_EnumLiteral )
( declare OCLValues_UndefinedValue )
( declare OCLValues_CollectionValue )
( declare OCLValues_BagValue )
( declare OCLValues_SequenceValue )
( declare OCLValues_SetValue )
( declare OCLValues_Count )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def OCLValues ( struct-map
	KM3_Package
	:contents[( def OCLValues_Value ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_Value
			:type OCLValues_Type
			:location "16:3-16:52"
			:isContainer true
			:opposite value
		) ( struct-map
			KM3_Reference
			:name "bagValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_Value
			:type OCLValues_BagValue
			:location "17:3-17:57"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "sequenceValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_Value
			:type OCLValues_SequenceValue
			:location "18:3-18:67"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "setValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_Value
			:type OCLValues_SetValue
			:location "19:3-19:57"
			:isContainer false
			:opposite elements
		)]
	) ) ( def OCLValues_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_Type
			:type OCLValues_Value
			:location "23:3-23:47"
			:isContainer false
			:opposite type
		)]
	) ) ( def OCLValues_BasicValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLValues_Value]
		:structuralFeatures[]
	) ) ( def OCLValues_IntegerValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_BasicValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_IntegerValue
			:type Integer
			:location "29:3-29:27"
		)]
	) ) ( def OCLValues_RealValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_BasicValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_RealValue
			:type Double
			:location "33:3-33:26"
		)]
	) ) ( def OCLValues_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_BasicValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_StringValue
			:type String
			:location "37:3-37:26"
		)]
	) ) ( def OCLValues_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_BasicValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_BooleanValue
			:type Boolean
			:location "41:3-41:27"
		)]
	) ) ( def OCLValues_ObjectValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_Value]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_ObjectValue
			:type OCLValues_Object
			:location "45:3-45:62"
			:isContainer true
			:opposite objectValue
		)]
	) ) ( def OCLValues_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLValues_Object
			:type OCLValues_ObjectValue
			:location "49:3-49:63"
			:isContainer false
			:opposite object
		)]
	) ) ( def OCLValues_EnumValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_Value]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumLiteral"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_EnumValue
			:type OCLValues_EnumLiteral
			:location "53:3-53:70"
			:isContainer true
			:opposite enumValue
		)]
	) ) ( def OCLValues_EnumLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLValues_EnumLiteral
			:type OCLValues_EnumValue
			:location "57:3-57:64"
			:isContainer false
			:opposite enumLiteral
		)]
	) ) ( def OCLValues_UndefinedValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLValues_Value]
		:structuralFeatures[]
	) ) ( def OCLValues_CollectionValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLValues_Value]
		:structuralFeatures[]
	) ) ( def OCLValues_BagValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_BagValue
			:type OCLValues_Value
			:location "66:3-66:64"
			:isContainer true
			:opposite bagValue
		)]
	) ) ( def OCLValues_SequenceValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCLValues_SequenceValue
			:type OCLValues_Value
			:location "70:3-70:77"
			:isContainer true
			:opposite sequenceValue
		)]
	) ) ( def OCLValues_SetValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLValues_SetValue
			:type OCLValues_Value
			:location "74:3-74:64"
			:isContainer true
			:opposite setValue
		)]
	) ) ( def OCLValues_Count ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "num"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLValues_Count
			:type Integer
			:location "78:3-78:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "83:2-83:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "84:2-84:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "85:2-85:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "86:2-86:18"
	) )]
) )
