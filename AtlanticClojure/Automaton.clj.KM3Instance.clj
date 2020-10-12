( declare Automatoon_FiniteAutomaton )
( declare Automatoon_Transition )
( declare Automatoon_State )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def Automatoon ( struct-map
	KM3_Package
	:contents[( def Automatoon_FiniteAutomaton ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "alphabet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Automatoon_FiniteAutomaton
			:type String
			:location "12:3-12:36"
		) ( struct-map
			KM3_Reference
			:name "transitionSet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Automatoon_FiniteAutomaton
			:type Automatoon_Transition
			:location "14:3-14:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "initialState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_FiniteAutomaton
			:type Automatoon_State
			:location "15:3-15:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "finalStateSet"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Automatoon_FiniteAutomaton
			:type Automatoon_State
			:location "16:3-16:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "StateSet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Automatoon_FiniteAutomaton
			:type Automatoon_State
			:location "17:3-17:35"
			:isContainer false
		)]
	) ) ( def Automatoon_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "letter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_Transition
			:type String
			:location "22:3-22:29"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_Transition
			:type Automatoon_State
			:location "24:3-24:28"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_Transition
			:type Automatoon_State
			:location "25:3-25:28"
			:isContainer false
		)]
	) ) ( def Automatoon_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_State
			:type String
			:location "30:3-30:27"
		) ( struct-map
			KM3_Reference
			:name "combination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Automatoon_State
			:type Automatoon_State
			:location "32:3-32:33"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "38:2-38:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "39:2-39:19"
	) )]
) )
