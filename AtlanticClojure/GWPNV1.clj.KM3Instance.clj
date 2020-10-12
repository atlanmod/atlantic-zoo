( declare PetriNet_Place )
( declare PetriNet_Transition )
( declare PetriNet_Net )
( def PetriNet ( struct-map
	KM3_Package
	:contents[( def PetriNet_Place ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Place
			:type PetriNet_Net
			:location "13:3-13:40"
			:isContainer false
			:opposite place
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PetriNet_Place
			:type PetriNet_Transition
			:location "14:3-14:56"
			:isContainer false
			:opposite dst
		) ( struct-map
			KM3_Reference
			:name "dst"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PetriNet_Place
			:type PetriNet_Transition
			:location "15:3-15:56"
			:isContainer false
			:opposite src
		)]
	) ) ( def PetriNet_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Transition
			:type PetriNet_Net
			:location "19:3-19:45"
			:isContainer false
			:opposite transition
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Transition
			:type PetriNet_Place
			:location "20:3-20:53"
			:isContainer false
			:opposite dst
		) ( struct-map
			KM3_Reference
			:name "dst"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Transition
			:type PetriNet_Place
			:location "21:3-21:53"
			:isContainer false
			:opposite src
		)]
	) ) ( def PetriNet_Net ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "place"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Net
			:type PetriNet_Place
			:location "25:3-25:65"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Net
			:type PetriNet_Transition
			:location "26:3-26:75"
			:isContainer true
			:opposite net
		)]
	) )]
) )
