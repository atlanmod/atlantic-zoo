( declare HSM_MgaObject )
( declare HSM_StateBase )
( declare HSM_DataVar )
( declare HSM_Transition )
( declare HSM_StateDateRelation )
( declare HSM_RootFolder )
( declare HSM_OrState )
( declare HSM_AndState )
( declare HSM_CompoundState )
( declare HSM_PrimitiveState )
( declare HSM_Init )
( declare HSM_State )
( declare HSM_StateDataRelation )
( declare HSM_AssociationStateState )
( declare HSM_AssociationDataStateBase )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def HSM ( struct-map
	KM3_Package
	:contents[( def HSM_MgaObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HSM_MgaObject
			:type String
			:location "12:3-12:32"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HSM_MgaObject
			:type String
			:location "13:3-13:36"
		)]
	) ) ( def HSM_StateBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultTransition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateBase
			:type String
			:location "18:3-18:40"
		) ( struct-map
			KM3_Attribute
			:name "marked"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateBase
			:type Boolean
			:location "19:3-19:30"
		) ( struct-map
			KM3_Reference
			:name "associationStateStatedst"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_StateBase
			:type HSM_AssociationStateState
			:location "21:3-21:92"
			:isContainer false
			:opposite dstTransition
		) ( struct-map
			KM3_Reference
			:name "associationStateStatesrc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_StateBase
			:type HSM_AssociationStateState
			:location "22:3-22:92"
			:isContainer false
			:opposite srcTransition
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_StateBase
			:type HSM_DataVar
			:location "23:3-23:52"
			:isContainer false
			:opposite stateBase
		) ( struct-map
			KM3_Reference
			:name "associationDataStateBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateBase
			:type HSM_AssociationDataStateBase
			:location "24:3-24:86"
			:isContainer false
			:opposite stateBase
		)]
	) ) ( def HSM_DataVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateBase"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_DataVar
			:type HSM_StateBase
			:location "29:3-29:54"
			:isContainer false
			:opposite data
		) ( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_DataVar
			:type HSM_OrState
			:location "30:3-30:50"
			:isContainer false
			:opposite dataVar
		) ( struct-map
			KM3_Reference
			:name "associationDataStateBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_DataVar
			:type HSM_AssociationDataStateBase
			:location "31:3-31:84"
			:isContainer false
			:opposite dataVar
		)]
	) ) ( def HSM_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "guard"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type String
			:location "36:3-36:28"
		) ( struct-map
			KM3_Attribute
			:name "trigger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type String
			:location "37:3-37:30"
		) ( struct-map
			KM3_Attribute
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type String
			:location "38:3-38:29"
		) ( struct-map
			KM3_Attribute
			:name "isSync"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type Boolean
			:location "39:3-39:30"
		) ( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type HSM_OrState
			:location "40:3-40:53"
			:isContainer false
			:opposite transition
		) ( struct-map
			KM3_Reference
			:name "associationStateState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Transition
			:type HSM_AssociationStateState
			:location "41:3-41:81"
			:isContainer false
			:opposite transition
		)]
	) ) ( def HSM_StateDateRelation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_MgaObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDateRelation
			:type String
			:location "46:3-46:28"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDateRelation
			:type String
			:location "47:3-47:28"
		)]
	) ) ( def HSM_RootFolder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HSM_RootFolder
			:type String
			:location "52:3-52:32"
		) ( struct-map
			KM3_Reference
			:name "rootFolders"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_RootFolder
			:type HSM_RootFolder
			:location "53:3-53:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "orState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_RootFolder
			:type HSM_OrState
			:location "54:3-54:65"
			:isContainer true
			:opposite rootFolder
		)]
	) ) ( def HSM_OrState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_CompoundState]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rootFolder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_OrState
			:type HSM_RootFolder
			:location "59:3-59:56"
			:isContainer false
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_OrState
			:type HSM_State
			:location "60:3-60:60"
			:isContainer true
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "init"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_OrState
			:type HSM_Init
			:location "61:3-61:53"
			:isContainer true
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "dataVar"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_OrState
			:type HSM_DataVar
			:location "62:3-62:65"
			:isContainer true
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "stateDataRelation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_OrState
			:type HSM_StateDataRelation
			:location "63:3-63:84"
			:isContainer true
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_OrState
			:type HSM_Transition
			:location "64:3-64:70"
			:isContainer true
			:opposite orState
		) ( struct-map
			KM3_Reference
			:name "compoundState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_OrState
			:type HSM_CompoundState
			:location "65:3-65:76"
			:isContainer true
			:opposite orState
		)]
	) ) ( def HSM_AndState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_CompoundState]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoundState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HSM_AndState
			:type HSM_CompoundState
			:location "70:3-70:76"
			:isContainer true
			:opposite andState
		)]
	) ) ( def HSM_CompoundState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_StateBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "andState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_CompoundState
			:type HSM_AndState
			:location "76:3-76:58"
			:isContainer false
			:opposite compoundState
		) ( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_CompoundState
			:type HSM_OrState
			:location "77:3-77:56"
			:isContainer false
			:opposite compoundState
		)]
	) ) ( def HSM_PrimitiveState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_StateBase]
		:structuralFeatures[]
	) ) ( def HSM_Init ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_PrimitiveState]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_Init
			:type HSM_OrState
			:location "87:3-87:47"
			:isContainer false
			:opposite init
		)]
	) ) ( def HSM_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_PrimitiveState]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_State
			:type HSM_OrState
			:location "92:3-92:48"
			:isContainer false
			:opposite state
		)]
	) ) ( def HSM_StateDataRelation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HSM_PrimitiveState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDataRelation
			:type String
			:location "97:3-97:28"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDataRelation
			:type String
			:location "98:3-98:28"
		) ( struct-map
			KM3_Reference
			:name "orState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDataRelation
			:type HSM_OrState
			:location "100:3-100:60"
			:isContainer false
			:opposite stateDataRelation
		) ( struct-map
			KM3_Reference
			:name "associationDataStateBase1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_StateDataRelation
			:type HSM_AssociationDataStateBase
			:location "101:3-101:95"
			:isContainer false
			:opposite stateDataRelation
		)]
	) ) ( def HSM_AssociationStateState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationStateState
			:type HSM_Transition
			:location "106:3-106:70"
			:isContainer false
			:opposite associationStateState
		) ( struct-map
			KM3_Reference
			:name "dstTransition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationStateState
			:type HSM_StateBase
			:location "107:3-107:80"
			:isContainer false
			:opposite associationStateStatedst
		) ( struct-map
			KM3_Reference
			:name "srcTransition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationStateState
			:type HSM_StateBase
			:location "108:3-108:80"
			:isContainer false
			:opposite associationStateStatesrc
		)]
	) ) ( def HSM_AssociationDataStateBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateDataRelation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationDataStateBase
			:type HSM_StateDataRelation
			:location "113:3-113:88"
			:isContainer false
			:opposite associationDataStateBase1
		) ( struct-map
			KM3_Reference
			:name "dataVar"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationDataStateBase
			:type HSM_DataVar
			:location "114:3-114:72"
			:isContainer false
			:opposite associationDataStateBase
		) ( struct-map
			KM3_Reference
			:name "stateBase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HSM_AssociationDataStateBase
			:type HSM_StateBase
			:location "115:3-115:76"
			:isContainer false
			:opposite associationDataStateBase
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "120:2-120:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "121:2-121:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "122:2-122:19"
	) )]
) )
