( declare PetriNet_Element )
( declare PetriNet_PetriNet )
( declare PetriNet_Place )
( declare PetriNet_Transition )
( declare PetriNet_Arc )
( declare PetriNet_PlaceToTransArc )
( declare PetriNet_TransToPlaceArc )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def PetriNet ( struct-map
	KM3_Package
	:contents[( def PetriNet_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Element
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def PetriNet_PetriNet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "places"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Place
			:location "16:3-16:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Transition
			:location "17:3-17:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "arcs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_PetriNet
			:type PetriNet_Arc
			:location "18:3-18:38"
			:isContainer true
		)]
	) ) ( def PetriNet_Place ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Place
			:type PetriNet_TransToPlaceArc
			:location "22:3-22:62"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PetriNet_Place
			:type PetriNet_PlaceToTransArc
			:location "23:3-23:62"
			:isContainer false
			:opposite source
		)]
	) ) ( def PetriNet_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PetriNet_Transition
			:type PetriNet_PlaceToTransArc
			:location "27:3-27:64"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PetriNet_Transition
			:type PetriNet_TransToPlaceArc
			:location "28:3-28:64"
			:isContainer false
			:opposite source
		)]
	) ) ( def PetriNet_Arc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Arc
			:type Integer
			:location "32:3-32:30"
		)]
	) ) ( def PetriNet_PlaceToTransArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PlaceToTransArc
			:type PetriNet_Place
			:location "36:3-36:48"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PlaceToTransArc
			:type PetriNet_Transition
			:location "37:3-37:53"
			:isContainer false
			:opposite incoming
		)]
	) ) ( def PetriNet_TransToPlaceArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TransToPlaceArc
			:type PetriNet_Transition
			:location "41:3-41:53"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TransToPlaceArc
			:type PetriNet_Place
			:location "42:3-42:48"
			:isContainer false
			:opposite incoming
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "47:2-47:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "48:2-48:19"
	) )]
) )
