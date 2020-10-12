( declare HybridAutomata_FiniteTransition )
( declare HybridAutomata_FiniteState )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def HybridAutomata ( struct-map
	KM3_Package
	:contents[( def HybridAutomata_FiniteTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "trigger"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HybridAutomata_FiniteTransition
			:type String
			:location "12:3-12:35"
		) ( struct-map
			KM3_Attribute
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HybridAutomata_FiniteTransition
			:type String
			:location "13:3-13:33"
		) ( struct-map
			KM3_Attribute
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HybridAutomata_FiniteTransition
			:type String
			:location "14:3-14:34"
		)]
	) ) ( def HybridAutomata_FiniteState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HybridAutomata_FiniteState
			:type String
			:location "19:3-19:32"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HybridAutomata_FiniteState
			:type String
			:location "20:3-20:36"
		) ( struct-map
			KM3_Attribute
			:name "isInit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HybridAutomata_FiniteState
			:type Boolean
			:location "21:3-21:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "26:2-26:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "27:2-27:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "28:2-28:19"
	) )]
) )
