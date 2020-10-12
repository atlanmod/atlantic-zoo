( declare FSM_MgaObject )
( declare FSM_Transition )
( declare FSM_State )
( declare FSM_StateMachine )
( declare FSM_RootFolder )
( declare FSM_AssociationStateState )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def FSM ( struct-map
	KM3_Package
	:contents[( def FSM_MgaObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FSM_MgaObject
			:type String
			:location "12:3-12:32"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FSM_MgaObject
			:type String
			:location "13:3-13:36"
		)]
	) ) ( def FSM_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[FSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FSM_Transition
			:type FSM_StateMachine
			:location "18:3-18:63"
			:isContainer false
			:opposite transition
		) ( struct-map
			KM3_Reference
			:name "associationStateState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FSM_Transition
			:type FSM_AssociationStateState
			:location "19:3-19:81"
			:isContainer false
			:opposite transition
		)]
	) ) ( def FSM_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[FSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FSM_State
			:type FSM_StateMachine
			:location "24:3-24:58"
			:isContainer false
			:opposite state
		) ( struct-map
			KM3_Reference
			:name "associationStateStatedst"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FSM_State
			:type FSM_AssociationStateState
			:location "25:3-25:92"
			:isContainer false
			:opposite dstTransition
		) ( struct-map
			KM3_Reference
			:name "associationStateStatesrc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FSM_State
			:type FSM_AssociationStateState
			:location "26:3-26:92"
			:isContainer false
			:opposite srcTransition
		)]
	) ) ( def FSM_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[FSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rootFolder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FSM_StateMachine
			:type FSM_RootFolder
			:location "31:3-31:61"
			:isContainer false
			:opposite stateMachine
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FSM_StateMachine
			:type FSM_State
			:location "32:3-32:63"
			:isContainer true
			:opposite stateMachine
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FSM_StateMachine
			:type FSM_Transition
			:location "33:3-33:73"
			:isContainer true
			:opposite stateMachine
		)]
	) ) ( def FSM_RootFolder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner FSM_RootFolder
			:type String
			:location "38:3-38:32"
		) ( struct-map
			KM3_Reference
			:name "rootFolders"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FSM_RootFolder
			:type FSM_RootFolder
			:location "40:3-40:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FSM_RootFolder
			:type FSM_StateMachine
			:location "41:3-41:75"
			:isContainer true
			:opposite rootFolder
		)]
	) ) ( def FSM_AssociationStateState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FSM_AssociationStateState
			:type FSM_Transition
			:location "46:3-46:70"
			:isContainer false
			:opposite associationStateState
		) ( struct-map
			KM3_Reference
			:name "dstTransition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FSM_AssociationStateState
			:type FSM_State
			:location "47:3-47:76"
			:isContainer false
			:opposite associationStateStatedst
		) ( struct-map
			KM3_Reference
			:name "srcTransition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner FSM_AssociationStateState
			:type FSM_State
			:location "48:3-48:76"
			:isContainer false
			:opposite associationStateStatesrc
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "53:2-53:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "54:2-54:19"
	) )]
) )
