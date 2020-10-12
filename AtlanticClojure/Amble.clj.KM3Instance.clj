( declare Amble_Element )
( declare Amble_Program )
( declare Amble_Process )
( declare Amble_State )
( declare Amble_Transition )
( declare Amble_Trans )
( declare Amble_Strans )
( declare Amble_Transall )
( declare Amble_Guard )
( declare Amble_Action )
( declare Amble_Network )
( declare Amble_Channel )
( declare Amble_Message )
( declare Amble_Variable )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def Amble ( struct-map
	KM3_Package
	:contents[( def Amble_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Element
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def Amble_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Program
			:type Amble_Process
			:location "16:3-16:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "networks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Program
			:type Amble_Network
			:location "17:3-17:46"
			:isContainer true
		)]
	) ) ( def Amble_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "minId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Process
			:type Integer
			:location "21:3-21:29"
		) ( struct-map
			KM3_Attribute
			:name "maxId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Process
			:type Integer
			:location "22:3-22:29"
		) ( struct-map
			KM3_Attribute
			:name "instancesNb"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Process
			:type Integer
			:location "23:3-23:35"
		) ( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Process
			:type Amble_State
			:location "24:3-24:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Process
			:type Amble_Transition
			:location "25:3-25:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initial"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Amble_Process
			:type Amble_Action
			:location "26:3-26:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Process
			:type Amble_Variable
			:location "27:3-27:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "connectedTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Process
			:type Amble_Network
			:location "28:3-28:39"
			:isContainer false
		)]
	) ) ( def Amble_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInitial"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_State
			:type Boolean
			:location "32:3-32:33"
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_State
			:type Amble_Transition
			:location "33:3-33:57"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_State
			:type Amble_Transition
			:location "34:3-34:57"
			:isContainer false
			:opposite source
		)]
	) ) ( def Amble_Transition ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Amble_Transition
			:type Amble_Guard
			:location "38:3-38:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Amble_Transition
			:type Amble_Action
			:location "39:3-39:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Transition
			:type Amble_State
			:location "40:3-40:48"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Transition
			:type Amble_State
			:location "41:3-41:48"
			:isContainer false
			:opposite incoming
		)]
	) ) ( def Amble_Trans ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Transition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "waitFor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Trans
			:type Amble_Message
			:location "45:3-45:31"
			:isContainer false
		)]
	) ) ( def Amble_Strans ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Transition]
		:structuralFeatures[]
	) ) ( def Amble_Transall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Transition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "waitFor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Transall
			:type Amble_Message
			:location "52:3-52:31"
			:isContainer false
		)]
	) ) ( def Amble_Guard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[]
	) ) ( def Amble_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[]
	) ) ( def Amble_Network ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "channels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Network
			:type Amble_Channel
			:location "62:3-62:46"
			:isContainer true
		)]
	) ) ( def Amble_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "messages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Amble_Channel
			:type Amble_Message
			:location "66:3-66:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Channel
			:type Amble_Process
			:location "67:3-67:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Channel
			:type Amble_Process
			:location "68:3-68:30"
			:isContainer false
		)]
	) ) ( def Amble_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[]
	) ) ( def Amble_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Amble_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Variable
			:type String
			:location "75:3-75:27"
		) ( struct-map
			KM3_Attribute
			:name "initValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Amble_Variable
			:type String
			:location "76:3-76:32"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "82:2-82:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "83:2-83:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "84:2-84:19"
	) )]
) )
