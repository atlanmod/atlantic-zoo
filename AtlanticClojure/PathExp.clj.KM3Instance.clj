( declare PathExp_Element )
( declare PathExp_PathExp )
( declare PathExp_State )
( declare PathExp_Transition )
( declare PrimitiveTypes_String )
( def PathExp ( struct-map
	KM3_Package
	:contents[( def PathExp_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PathExp_Element
			:type String
			:location "11:3-11:27"
		)]
	) ) ( def PathExp_PathExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PathExp_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PathExp_PathExp
			:type PathExp_State
			:location "15:3-15:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PathExp_PathExp
			:type PathExp_Transition
			:location "16:3-16:52"
			:isContainer true
		)]
	) ) ( def PathExp_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PathExp_State
			:type PathExp_Transition
			:location "20:3-20:57"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PathExp_State
			:type PathExp_Transition
			:location "21:3-21:57"
			:isContainer false
			:opposite source
		)]
	) ) ( def PathExp_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PathExp_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PathExp_Transition
			:type PathExp_State
			:location "25:3-25:48"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PathExp_Transition
			:type PathExp_State
			:location "26:3-26:48"
			:isContainer false
			:opposite incoming
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "31:2-31:18"
	) )]
) )
