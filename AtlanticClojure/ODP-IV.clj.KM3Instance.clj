( declare ODPIV_InvariantSchema )
( declare ODPIV_InformationObjectTemplate )
( declare ODPIV_InformationObjectType )
( declare ODPIV_InformationObject )
( declare ODPIV_State )
( declare ODPIV_StateChange )
( declare ODPIV_DynamicSchema )
( declare ODPIV_StaticSchema )
( declare ODPIV_Action )
( declare ODPIV_ActionType )
( declare ODPIV_ActionTemplate )
( declare PrimitiveTypes_Double )
( def ODPIV ( struct-map
	KM3_Package
	:contents[( def ODPIV_InvariantSchema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrainer_AT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_ActionTemplate
			:location "12:3-12:74"
			:isContainer false
			:opposite AT_constrainer
		) ( struct-map
			KM3_Reference
			:name "constrainer_ATy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_ActionType
			:location "14:3-14:72"
			:isContainer false
			:opposite ATy_constrainer
		) ( struct-map
			KM3_Reference
			:name "constrainer_SC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_StateChange
			:location "16:3-16:71"
			:isContainer false
			:opposite SC_constrainer
		) ( struct-map
			KM3_Reference
			:name "constrainer_S"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_State
			:location "18:3-18:63"
			:isContainer false
			:opposite S_constrainer
		) ( struct-map
			KM3_Reference
			:name "constrainer_IOT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_InformationObjectTemplate
			:location "20:3-20:87"
			:isContainer false
			:opposite IOT_constrainer
		) ( struct-map
			KM3_Reference
			:name "constrainer_IOTy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InvariantSchema
			:type ODPIV_InformationObjectType
			:location "22:3-22:85"
			:isContainer false
			:opposite IOTy_constrainer
		)]
	) ) ( def ODPIV_InformationObjectTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "IOT_IO"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObjectTemplate
			:type ODPIV_InformationObject
			:location "27:3-27:61"
			:isContainer false
			:opposite IO_IOT
		) ( struct-map
			KM3_Reference
			:name "IOT_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObjectTemplate
			:type ODPIV_InvariantSchema
			:location "29:3-29:77"
			:isContainer false
			:opposite constrainer_IOT
		)]
	) ) ( def ODPIV_InformationObjectType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "IOTy_IO"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObjectType
			:type ODPIV_InformationObject
			:location "34:3-34:63"
			:isContainer false
			:opposite IO_IOTy
		) ( struct-map
			KM3_Reference
			:name "IOTy_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObjectType
			:type ODPIV_InvariantSchema
			:location "36:3-36:79"
			:isContainer false
			:opposite constrainer_IOTy
		)]
	) ) ( def ODPIV_InformationObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "describer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObject
			:type ODPIV_StaticSchema
			:location "41:3-41:59"
			:isContainer false
			:opposite SS_IO
		) ( struct-map
			KM3_Reference
			:name "IO_IOT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObject
			:type ODPIV_InformationObjectTemplate
			:location "43:3-43:69"
			:isContainer false
			:opposite IOT_IO
		) ( struct-map
			KM3_Reference
			:name "IO_IOTy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObject
			:type ODPIV_InformationObjectType
			:location "45:3-45:67"
			:isContainer false
			:opposite IOTy_IO
		) ( struct-map
			KM3_Reference
			:name "IO_A"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_InformationObject
			:type ODPIV_Action
			:location "47:3-47:53"
			:isContainer false
			:opposite participant
		) ( struct-map
			KM3_Reference
			:name "IO_S"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_InformationObject
			:type ODPIV_State
			:location "49:3-49:42"
			:isContainer false
			:opposite S_IO
		)]
	) ) ( def ODPIV_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "change"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_State
			:type ODPIV_StateChange
			:location "54:3-54:56"
			:isContainer false
			:opposite startState
		) ( struct-map
			KM3_Reference
			:name "causeSC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_State
			:type ODPIV_StateChange
			:location "56:3-56:55"
			:isContainer false
			:opposite endState
		) ( struct-map
			KM3_Reference
			:name "S_IO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_State
			:type ODPIV_InformationObject
			:location "58:3-58:64"
			:isContainer true
			:opposite IO_S
		) ( struct-map
			KM3_Reference
			:name "S_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_State
			:type ODPIV_InvariantSchema
			:location "60:3-60:73"
			:isContainer false
			:opposite constrainer_S
		)]
	) ) ( def ODPIV_StateChange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "startState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_StateChange
			:type ODPIV_State
			:location "65:3-65:50"
			:isContainer false
			:opposite change
		) ( struct-map
			KM3_Reference
			:name "endState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_StateChange
			:type ODPIV_State
			:location "67:3-67:49"
			:isContainer false
			:opposite causeSC
		) ( struct-map
			KM3_Reference
			:name "specifier"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPIV_StateChange
			:type ODPIV_DynamicSchema
			:location "69:3-69:69"
			:isContainer false
			:opposite dsStateChange
		) ( struct-map
			KM3_Reference
			:name "cause"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_StateChange
			:type ODPIV_Action
			:location "71:3-71:49"
			:isContainer false
			:opposite effect
		) ( struct-map
			KM3_Reference
			:name "SC_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_StateChange
			:type ODPIV_InvariantSchema
			:location "73:3-73:75"
			:isContainer false
			:opposite constrainer_SC
		)]
	) ) ( def ODPIV_DynamicSchema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dsStateChange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_DynamicSchema
			:type ODPIV_StateChange
			:location "78:3-78:65"
			:isContainer false
			:opposite specifier
		)]
	) ) ( def ODPIV_StaticSchema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "locationTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPIV_StaticSchema
			:type Double
			:location "82:3-82:35"
		) ( struct-map
			KM3_Reference
			:name "SS_IO"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPIV_StaticSchema
			:type ODPIV_InformationObject
			:location "85:3-85:66"
			:isContainer false
			:opposite describer
		)]
	) ) ( def ODPIV_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "effect"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_Action
			:type ODPIV_StateChange
			:location "90:3-90:54"
			:isContainer false
			:opposite cause
		) ( struct-map
			KM3_Reference
			:name "A_AT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_Action
			:type ODPIV_ActionTemplate
			:location "92:3-92:54"
			:isContainer false
			:opposite AT_A
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_Action
			:type ODPIV_InformationObject
			:location "94:3-94:64"
			:isContainer false
			:opposite IO_A
		) ( struct-map
			KM3_Reference
			:name "A_ATy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_Action
			:type ODPIV_ActionType
			:location "96:3-96:52"
			:isContainer false
			:opposite ATy_A
		)]
	) ) ( def ODPIV_ActionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ATy_A"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_ActionType
			:type ODPIV_Action
			:location "101:3-101:48"
			:isContainer false
			:opposite A_ATy
		) ( struct-map
			KM3_Reference
			:name "ATy_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_ActionType
			:type ODPIV_InvariantSchema
			:location "103:3-103:77"
			:isContainer false
			:opposite constrainer_ATy
		)]
	) ) ( def ODPIV_ActionTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "AT_A"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_ActionTemplate
			:type ODPIV_Action
			:location "108:3-108:46"
			:isContainer false
			:opposite A_AT
		) ( struct-map
			KM3_Reference
			:name "AT_constrainer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPIV_ActionTemplate
			:type ODPIV_InvariantSchema
			:location "110:3-110:75"
			:isContainer false
			:opposite constrainer_AT
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "115:2-115:18"
	) )]
) )
