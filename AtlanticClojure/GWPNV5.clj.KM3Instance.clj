( declare PetriNet_Place )
( declare PetriNet_Transition )
( declare PetriNet_Net )
( declare PetriNet_Arc )
( declare PetriNet_PTArc )
( declare PetriNet_TPArc )
( declare PetriNet_Token )
( declare PrimitiveTypes_Integer )
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
		) ( struct-map
			KM3_Reference
			:name "token"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PetriNet_Place
			:type PetriNet_Token
			:location "16:3-16:65"
			:isContainer true
			:opposite place
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
			:location "20:3-20:45"
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
			:location "21:3-21:52"
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
			:location "22:3-22:53"
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
			:location "26:3-26:65"
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
			:location "27:3-27:75"
			:isContainer true
			:opposite net
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
			:location "31:3-31:30"
		)]
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
			:location "35:3-35:44"
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
			:location "36:3-36:40"
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
			:location "40:3-40:45"
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
			:location "41:3-41:39"
			:isContainer false
			:opposite in
		)]
	) ) ( def PetriNet_Token ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "place"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PetriNet_Token
			:type PetriNet_Place
			:location "45:3-45:44"
			:isContainer false
			:opposite token
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "51:2-51:19"
	) )]
) )
