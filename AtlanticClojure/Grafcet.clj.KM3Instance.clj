( declare Grafcet_LocatedElement )
( declare Grafcet_NamedElement )
( declare Grafcet_Grafcet )
( declare Grafcet_Element )
( declare Grafcet_Step )
( declare Grafcet_Transition )
( declare Grafcet_Connection )
( declare Grafcet_StepToTransition )
( declare Grafcet_TransitionToStep )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Grafcet ( struct-map
	KM3_Package
	:contents[( def Grafcet_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_LocatedElement
			:type String
			:location "13:3-13:31"
		)]
	) ) ( def Grafcet_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Grafcet_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_NamedElement
			:type String
			:location "17:3-17:27"
		)]
	) ) ( def Grafcet_Grafcet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Grafcet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Grafcet
			:type Grafcet_Element
			:location "21:3-21:64"
			:isContainer true
			:opposite grafcet
		) ( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Grafcet
			:type Grafcet_Connection
			:location "22:3-22:70"
			:isContainer true
			:opposite grafcet
		)]
	) ) ( def Grafcet_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Grafcet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "grafcet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Element
			:type Grafcet_Grafcet
			:location "28:3-28:51"
			:isContainer false
			:opposite elements
		)]
	) ) ( def Grafcet_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Grafcet_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInitial"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Step
			:type Boolean
			:location "32:3-32:33"
		) ( struct-map
			KM3_Attribute
			:name "isActive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Step
			:type Boolean
			:location "33:3-33:32"
		) ( struct-map
			KM3_Attribute
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Step
			:type String
			:location "34:3-34:29"
		) ( struct-map
			KM3_Reference
			:name "incomingConnections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Step
			:type Grafcet_TransitionToStep
			:location "35:3-35:69"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outgoingConnections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Step
			:type Grafcet_StepToTransition
			:location "36:3-36:71"
			:isContainer false
			:opposite from
		)]
	) ) ( def Grafcet_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Grafcet_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Transition
			:type String
			:location "40:3-40:32"
		) ( struct-map
			KM3_Reference
			:name "incomingConnections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Transition
			:type Grafcet_StepToTransition
			:location "41:3-41:69"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outgoingConnections"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Grafcet_Transition
			:type Grafcet_TransitionToStep
			:location "42:3-42:71"
			:isContainer false
			:opposite from
		)]
	) ) ( def Grafcet_Connection ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Grafcet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "grafcet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_Connection
			:type Grafcet_Grafcet
			:location "52:3-52:54"
			:isContainer false
			:opposite connections
		)]
	) ) ( def Grafcet_StepToTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Grafcet_Connection]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_StepToTransition
			:type Grafcet_Step
			:location "56:3-56:56"
			:isContainer false
			:opposite outgoingConnections
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_StepToTransition
			:type Grafcet_Transition
			:location "57:3-57:60"
			:isContainer false
			:opposite incomingConnections
		)]
	) ) ( def Grafcet_TransitionToStep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Grafcet_Connection]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_TransitionToStep
			:type Grafcet_Transition
			:location "61:3-61:62"
			:isContainer false
			:opposite outgoingConnections
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Grafcet_TransitionToStep
			:type Grafcet_Step
			:location "62:3-62:54"
			:isContainer false
			:opposite incomingConnections
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "70:2-70:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "71:2-71:19"
	) )]
) )
