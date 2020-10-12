( declare Trace_Trace )
( declare Trace_Level )
( declare Trace_Call )
( declare Trace_Index )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Trace ( struct-map
	KM3_Package
	:contents[( def Trace_Trace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Trace
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Reference
			:name "levels"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Trace_Trace
			:type Trace_Level
			:location "11:3-11:65"
			:isContainer true
			:opposite trace
		)]
	) ) ( def Trace_Level ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "trace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Level
			:type Trace_Trace
			:location "16:3-16:45"
			:isContainer false
			:opposite levels
		) ( struct-map
			KM3_Reference
			:name "calls"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Trace_Level
			:type Trace_Call
			:location "17:3-17:63"
			:isContainer true
			:opposite level
		)]
	) ) ( def Trace_Call ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "methodName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Call
			:type String
			:location "23:3-23:32"
		) ( struct-map
			KM3_Attribute
			:name "DBAccessesNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Call
			:type Integer
			:location "24:3-24:39"
		) ( struct-map
			KM3_Attribute
			:name "DBRowsNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Call
			:type Integer
			:location "25:3-25:35"
		) ( struct-map
			KM3_Attribute
			:name "CPUTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Call
			:type Integer
			:location "26:3-26:30"
		) ( struct-map
			KM3_Reference
			:name "level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Call
			:type Trace_Level
			:location "21:3-21:44"
			:isContainer false
			:opposite calls
		) ( struct-map
			KM3_Reference
			:name "indexes"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Trace_Call
			:type Trace_Index
			:location "22:3-22:51"
			:isContainer true
		)]
	) ) ( def Trace_Index ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Trace_Index
			:type Integer
			:location "30:3-30:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "36:2-36:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "37:2-37:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "38:2-38:18"
	) )]
) )
