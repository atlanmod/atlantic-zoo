( declare PetriNet_Place )
( declare PetriNet_Transition )
( declare PetriNet_Net )
( declare PetriNet_Arc )
( declare PetriNet_PTArc )
( declare PetriNet_TPArc )
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
			:name "out"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PetriNet_Place
			:type PetriNet_PTArc
			:location "14:3-14:51"
			:isContainer false
			:opposite src
		) ( struct-map
			KM3_Reference
			:name "in"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PetriNet_Place
			:type PetriNet_TPArc
			:location "15:3-15:50"
			:isContainer false
			:opposite dst
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
			:name "in"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Transition
			:type PetriNet_PTArc
			:location "20:3-20:52"
			:isContainer false
			:opposite dst
		) ( struct-map
			KM3_Reference
			:name "out"
			:upper -1
			:lower 1
			:isOrdered true
			:owner PetriNet_Transition
			:type PetriNet_TPArc
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
	) ) ( def PetriNet_Arc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PetriNet_PTArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dst"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PTArc
			:type PetriNet_Transition
			:location "33:3-33:44"
			:isContainer false
			:opposite in
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_PTArc
			:type PetriNet_Place
			:location "34:3-34:40"
			:isContainer false
			:opposite out
		)]
	) ) ( def PetriNet_TPArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PetriNet_Arc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TPArc
			:type PetriNet_Transition
			:location "38:3-38:45"
			:isContainer false
			:opposite out
		) ( struct-map
			KM3_Reference
			:name "dst"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_TPArc
			:type PetriNet_Place
			:location "39:3-39:39"
			:isContainer false
			:opposite in
		)]
	) )]
) )
