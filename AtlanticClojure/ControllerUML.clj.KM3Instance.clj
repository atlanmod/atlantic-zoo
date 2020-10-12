( declare ControllerUML_ControllerAttribute )
( declare ControllerUML_Controller )
( declare ControllerUML_StateMachine )
( declare ControllerUML_State )
( declare ControllerUML_SubControllerState )
( declare ControllerUML_ViewState )
( declare ControllerUML_StateTransition )
( declare ControllerUML_StateMachineAction )
( declare ControllerUML_Event )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def ControllerUML ( struct-map
	KM3_Package
	:contents[( def ControllerUML_ControllerAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controller"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_ControllerAttribute
			:type ControllerUML_Controller
			:location "12:3-12:68"
			:isContainer false
			:opposite controllerAttribute
		)]
	) ) ( def ControllerUML_Controller ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controllerAttribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ControllerUML_Controller
			:type ControllerUML_ControllerAttribute
			:location "17:3-17:81"
			:isContainer false
			:opposite controller
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_Controller
			:type ControllerUML_StateMachine
			:location "18:3-18:47"
			:isContainer true
		)]
	) ) ( def ControllerUML_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ControllerUML_StateMachine
			:type ControllerUML_State
			:location "23:3-23:42"
			:isContainer true
		)]
	) ) ( def ControllerUML_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "substates"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ControllerUML_State
			:type ControllerUML_State
			:location "28:3-28:69"
			:isContainer true
			:opposite theContainer
		) ( struct-map
			KM3_Reference
			:name "theContainer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ControllerUML_State
			:type ControllerUML_State
			:location "29:3-29:61"
			:isContainer false
			:opposite substates
		) ( struct-map
			KM3_Reference
			:name "outGoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ControllerUML_State
			:type ControllerUML_StateTransition
			:location "30:3-30:72"
			:isContainer true
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ControllerUML_State
			:type ControllerUML_StateTransition
			:location "31:3-31:62"
			:isContainer false
			:opposite target
		)]
	) ) ( def ControllerUML_SubControllerState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ControllerUML_State]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controller"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_SubControllerState
			:type ControllerUML_Controller
			:location "37:3-37:37"
			:isContainer false
		)]
	) ) ( def ControllerUML_ViewState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ControllerUML_State]
		:structuralFeatures[]
	) ) ( def ControllerUML_StateTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_StateTransition
			:type ControllerUML_State
			:location "47:3-47:48"
			:isContainer false
			:opposite outGoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_StateTransition
			:type ControllerUML_State
			:location "48:3-48:48"
			:isContainer false
			:opposite incoming
		) ( struct-map
			KM3_Reference
			:name "trigger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ControllerUML_StateTransition
			:type ControllerUML_Event
			:location "49:3-49:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "effect"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ControllerUML_StateTransition
			:type ControllerUML_StateMachineAction
			:location "50:3-50:57"
			:isContainer true
		)]
	) ) ( def ControllerUML_StateMachineAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ControllerUML_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "65:2-65:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "66:2-66:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "67:2-67:19"
	) )]
) )
