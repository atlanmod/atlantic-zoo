( declare PetriNet_LocatedElement )
( declare PetriNet_NamedElement )
( declare PetriNet_PetriNet )
( declare PetriNet_Element )
( declare PetriNet_Place )
( declare PetriNet_Transition )
( declare PetriNet_Arc )
( declare PetriNet_PlaceToTransition )
( declare PetriNet_TransitionToPlace )
( declare PetriNet_Execution )
( declare PetriNet_Token )
( declare PetriNet_Marking )
( declare PetriNet_Movement )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def PetriNet ( struct-map
	KM3_Package
	:contents[( def PetriNet_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_LocatedElement
			:type String
			:location "12:3-12:31"
		)]
	) ) ( def PetriNet_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PetriNet_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_NamedElement
			:type String
			:location "16:3-16:27"
		)]
	) ) ( def PetriNet_PetriNet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Element
			:location "21:3-21:60"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "arcs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Arc
			:location "22:3-22:52"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "execs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Execution
			:location "23:3-23:49"
			:isContainer false
			:opposite net
		)]
	) ) ( def PetriNet_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PetriNet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Element
			:type PetriNet_PetriNet
			:location "29:3-29:48"
			:isContainer false
			:opposite elements
		)]
	) ) ( def PetriNet_Place ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incomingArc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Place
			:type PetriNet_TransitionToPlace
			:location "33:3-33:62"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outgoingArc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Place
			:type PetriNet_PlaceToTransition
			:location "34:3-34:64"
			:isContainer false
			:opposite from
		)]
	) ) ( def PetriNet_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incomingArc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PetriNet_Transition
			:type PetriNet_PlaceToTransition
			:location "38:3-38:64"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outgoingArc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PetriNet_Transition
			:type PetriNet_TransitionToPlace
			:location "39:3-39:67"
			:isContainer false
			:opposite from
		)]
	) ) ( def PetriNet_Arc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PetriNet_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Arc
			:type Integer
			:location "48:3-48:30"
		) ( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Arc
			:type PetriNet_PetriNet
			:location "49:3-49:44"
			:isContainer false
			:opposite arcs
		)]
	) ) ( def PetriNet_PlaceToTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PlaceToTransition
			:type PetriNet_Place
			:location "53:3-53:49"
			:isContainer false
			:opposite outgoingArc
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PlaceToTransition
			:type PetriNet_Transition
			:location "54:3-54:52"
			:isContainer false
			:opposite incomingArc
		)]
	) ) ( def PetriNet_TransitionToPlace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TransitionToPlace
			:type PetriNet_Transition
			:location "58:3-58:54"
			:isContainer false
			:opposite outgoingArc
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TransitionToPlace
			:type PetriNet_Place
			:location "59:3-59:47"
			:isContainer false
			:opposite incomingArc
		)]
	) ) ( def PetriNet_Execution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Execution
			:type PetriNet_PetriNet
			:location "65:3-65:45"
			:isContainer false
			:opposite execs
		) ( struct-map
			KM3_Reference
			:name "markings"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Execution
			:type PetriNet_Marking
			:location "66:3-66:61"
			:isContainer true
			:opposite exec
		) ( struct-map
			KM3_Reference
			:name "movements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Execution
			:type PetriNet_Movement
			:location "67:3-67:63"
			:isContainer true
			:opposite exec
		)]
	) ) ( def PetriNet_Token ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "placedAt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Token
			:type PetriNet_Place
			:location "71:3-71:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "marking"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Token
			:type PetriNet_Marking
			:location "72:3-72:49"
			:isContainer false
			:opposite tokens
		)]
	) ) ( def PetriNet_Marking ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Marking
			:type PetriNet_Execution
			:location "76:3-76:50"
			:isContainer false
			:opposite markings
		) ( struct-map
			KM3_Reference
			:name "tokens"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Marking
			:type PetriNet_Token
			:location "77:3-77:60"
			:isContainer true
			:opposite marking
		)]
	) ) ( def PetriNet_Movement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Movement
			:type PetriNet_Execution
			:location "81:3-81:51"
			:isContainer false
			:opposite movements
		) ( struct-map
			KM3_Reference
			:name "fire"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Movement
			:type PetriNet_Transition
			:location "82:3-82:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Movement
			:type PetriNet_Marking
			:location "83:3-83:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Movement
			:type PetriNet_Marking
			:location "84:3-84:30"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "90:2-90:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "91:2-91:19"
	) )]
) )
