( declare OCLExpression_ModelElement )
( declare OCLExpression_SyncChart )
( declare OCLExpression_ReferenceState )
( declare OCLExpression_Arc )
( declare OCLExpression_Vertex )
( declare OCLExpression_PseudoState )
( declare OCLExpression_PseudoStateKind )
( declare OCLExpression_State )
( declare OCLExpression_SimpleState )
( declare OCLExpression_CompositeState )
( declare OCLExpression_Stg )
( declare OCLExpression_Transition )
( declare OCLExpression_TransitionKind )
( declare OCLExpression_PseudoTransition )
( declare OCLExpression_PseudoTransitionKind )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def OCLExpression ( struct-map
	KM3_Package
	:contents[( def OCLExpression_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "behavior"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_ModelElement
			:type OCLExpression_SyncChart
			:location "16:3-16:57"
			:isContainer false
			:opposite context
		)]
	) ) ( def OCLExpression_SyncChart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLExpression_SyncChart
			:type OCLExpression_ModelElement
			:location "20:3-20:62"
			:isContainer false
			:opposite behavior
		) ( struct-map
			KM3_Reference
			:name "referenceState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_SyncChart
			:type OCLExpression_ReferenceState
			:location "21:3-21:73"
			:isContainer false
			:opposite subSyncChart
		)]
	) ) ( def OCLExpression_ReferenceState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subSyncChart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_ReferenceState
			:type OCLExpression_SyncChart
			:location "25:3-25:64"
			:isContainer false
			:opposite referenceState
		) ( struct-map
			KM3_Reference
			:name "containers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLExpression_ReferenceState
			:type OCLExpression_Stg
			:location "26:3-26:62"
			:isContainer false
			:opposite referenceState
		)]
	) ) ( def OCLExpression_Arc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLExpression_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isImmediate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Arc
			:type Boolean
			:location "30:3-30:35"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Arc
			:type Integer
			:location "31:3-31:32"
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Arc
			:type OCLExpression_Vertex
			:location "32:3-32:49"
			:isContainer false
			:opposite incoming
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Arc
			:type OCLExpression_Vertex
			:location "33:3-33:50"
			:isContainer false
			:opposite outcoming
		) ( struct-map
			KM3_Reference
			:name "stg"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLExpression_Arc
			:type OCLExpression_Stg
			:location "34:3-34:44"
			:isContainer false
			:opposite arc
		)]
	) ) ( def OCLExpression_Vertex ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLExpression_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_Vertex
			:type OCLExpression_Arc
			:location "38:3-38:50"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outcoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_Vertex
			:type OCLExpression_Arc
			:location "39:3-39:51"
			:isContainer false
			:opposite source
		)]
	) ) ( def OCLExpression_PseudoState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_Vertex]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_PseudoState
			:type OCLExpression_PseudoStateKind
			:location "43:3-43:36"
			:isContainer false
		)]
	) ) ( def OCLExpression_PseudoStateKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpression_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_Vertex]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isFinal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_State
			:type Boolean
			:location "49:3-49:31"
		)]
	) ) ( def OCLExpression_SimpleState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_State]
		:structuralFeatures[]
	) ) ( def OCLExpression_CompositeState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_State OCLExpression_ReferenceState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "canTerminate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_CompositeState
			:type Boolean
			:location "55:3-55:36"
		) ( struct-map
			KM3_Attribute
			:name "isSuspendable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_CompositeState
			:type Boolean
			:location "56:3-56:37"
		) ( struct-map
			KM3_Reference
			:name "stg"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OCLExpression_CompositeState
			:type OCLExpression_Stg
			:location "57:3-57:54"
			:isContainer false
			:opposite compositeState
		)]
	) ) ( def OCLExpression_Stg ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "withFinal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Stg
			:type Boolean
			:location "61:3-61:33"
		) ( struct-map
			KM3_Reference
			:name "compositeState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Stg
			:type OCLExpression_CompositeState
			:location "62:3-62:60"
			:isContainer false
			:opposite stg
		) ( struct-map
			KM3_Reference
			:name "arc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_Stg
			:type OCLExpression_Arc
			:location "63:3-63:52"
			:isContainer true
			:opposite stg
		) ( struct-map
			KM3_Reference
			:name "referenceState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpression_Stg
			:type OCLExpression_ReferenceState
			:location "64:3-64:81"
			:isContainer true
			:opposite containers
		)]
	) ) ( def OCLExpression_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_Transition
			:type OCLExpression_TransitionKind
			:location "68:3-68:35"
			:isContainer false
		)]
	) ) ( def OCLExpression_TransitionKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpression_PseudoTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpression_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpression_PseudoTransition
			:type OCLExpression_PseudoTransitionKind
			:location "74:3-74:41"
			:isContainer false
		)]
	) ) ( def OCLExpression_PseudoTransitionKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "81:2-81:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "82:2-82:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "83:2-83:18"
	) )]
) )
