( declare DTMP_State )
( declare DTMP_Transition )
( declare DTMP_Parameter )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def DTMP ( struct-map
	KM3_Package
	:contents[( def DTMP_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DTMP_State
			:type String
			:location "12:3-12:32"
		) ( struct-map
			KM3_Attribute
			:name "isStart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_State
			:type Boolean
			:location "13:3-13:31"
		) ( struct-map
			KM3_Attribute
			:name "isEnd"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_State
			:type Boolean
			:location "14:3-14:29"
		) ( struct-map
			KM3_Attribute
			:name "isFail"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_State
			:type Boolean
			:location "15:3-15:30"
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DTMP_State
			:type DTMP_Transition
			:location "16:3-16:55"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outGoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DTMP_State
			:type DTMP_Transition
			:location "17:3-17:57"
			:isContainer false
			:opposite from
		) ( struct-map
			KM3_Reference
			:name "formalParam"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DTMP_State
			:type DTMP_Parameter
			:location "18:3-18:68"
			:isContainer false
			:opposite state
		)]
	) ) ( def DTMP_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "transProb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DTMP_Transition
			:type String
			:location "23:3-23:36"
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_Transition
			:type DTMP_State
			:location "24:3-24:46"
			:isContainer false
			:opposite incoming
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_Transition
			:type DTMP_State
			:location "25:3-25:48"
			:isContainer false
			:opposite outGoing
		)]
	) ) ( def DTMP_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DTMP_Parameter
			:type String
			:location "30:3-30:31"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DTMP_Parameter
			:type String
			:location "31:3-31:31"
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTMP_Parameter
			:type DTMP_State
			:location "32:3-32:50"
			:isContainer false
			:opposite formalParam
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "37:2-37:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "38:2-38:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "39:2-39:19"
	) )]
) )
