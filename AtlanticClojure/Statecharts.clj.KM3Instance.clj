( declare Statecharts_BooleanExpression )
( declare Statecharts_StateMachine )
( declare Statecharts_State )
( declare Statecharts_CompositeState )
( declare Statecharts_Transition )
( declare Statecharts_StateVertex )
( declare Statecharts_Guard )
( declare Statecharts_Event )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def Statecharts ( struct-map
	KM3_Package
	:contents[( def Statecharts_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_BooleanExpression
			:type String
			:location "15:3-15:28"
		)]
	) ) ( def Statecharts_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_StateMachine
			:type Statecharts_Transition
			:location "24:3-24:80"
			:isContainer true
			:opposite transSM_container
		) ( struct-map
			KM3_Reference
			:name "top"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_StateMachine
			:type Statecharts_State
			:location "25:3-25:65"
			:isContainer true
			:opposite state_container
		)]
	) ) ( def Statecharts_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Statecharts_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "state_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_State
			:type Statecharts_StateMachine
			:location "29:3-29:59"
			:isContainer false
			:opposite top
		) ( struct-map
			KM3_Reference
			:name "internalTransitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_State
			:type Statecharts_Transition
			:location "30:3-30:87"
			:isContainer true
			:opposite transS_container
		) ( struct-map
			KM3_Reference
			:name "deferrableEvents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_State
			:type Statecharts_Event
			:location "31:3-31:60"
			:isContainer false
			:opposite targets
		)]
	) ) ( def Statecharts_CompositeState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Statecharts_State]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isConcurrent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_CompositeState
			:type Boolean
			:location "36:3-36:36"
		) ( struct-map
			KM3_Reference
			:name "subVertexes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_CompositeState
			:type Statecharts_StateVertex
			:location "35:3-35:76"
			:isContainer true
			:opposite sv_container
		)]
	) ) ( def Statecharts_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transSM_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_StateMachine
			:location "40:3-40:74"
			:isContainer false
			:opposite transitions
		) ( struct-map
			KM3_Reference
			:name "transS_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_State
			:location "41:3-41:74"
			:isContainer false
			:opposite internalTransitions
		) ( struct-map
			KM3_Reference
			:name "trigger"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_Event
			:location "42:3-42:69"
			:isContainer true
			:opposite evt_container
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_Guard
			:location "43:3-43:67"
			:isContainer true
			:opposite gua_container
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_StateVertex
			:location "44:3-44:54"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_Transition
			:type Statecharts_StateVertex
			:location "45:3-45:54"
			:isContainer false
			:opposite incoming
		)]
	) ) ( def Statecharts_StateVertex ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sv_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Statecharts_StateVertex
			:type Statecharts_CompositeState
			:location "49:3-49:71"
			:isContainer false
			:opposite subVertexes
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_StateVertex
			:type Statecharts_Transition
			:location "50:3-50:56"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_StateVertex
			:type Statecharts_Transition
			:location "51:3-51:56"
			:isContainer false
			:opposite target
		)]
	) ) ( def Statecharts_Guard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "gua_container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_Guard
			:type Statecharts_Transition
			:location "55:3-55:57"
			:isContainer false
			:opposite guard
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Statecharts_Guard
			:type Statecharts_BooleanExpression
			:location "56:3-56:44"
			:isContainer false
		)]
	) ) ( def Statecharts_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "evt_container"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_Event
			:type Statecharts_Transition
			:location "60:3-60:62"
			:isContainer false
			:opposite trigger
		) ( struct-map
			KM3_Reference
			:name "targets"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Statecharts_Event
			:type Statecharts_State
			:location "61:3-61:60"
			:isContainer false
			:opposite deferrableEvents
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "71:2-71:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "72:2-72:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "73:2-73:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "74:2-74:18"
	) )]
) )
