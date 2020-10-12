( declare HierarchicalSignalFlow_Port )
( declare HierarchicalSignalFlow_Signal )
( declare HierarchicalSignalFlow_Base )
( declare HierarchicalSignalFlow_Compound )
( declare HierarchicalSignalFlow_InputPort )
( declare HierarchicalSignalFlow_OutputPort )
( declare HierarchicalSignalFlow_LocalPort )
( declare HierarchicalSignalFlow_Primitive )
( declare HierarchicalSignalFlow_Asso_Port_Signal )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def HierarchicalSignalFlow ( struct-map
	KM3_Package
	:contents[( def HierarchicalSignalFlow_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "asso_Port_Signalsrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Port
			:type HierarchicalSignalFlow_Asso_Port_Signal
			:location "11:3-11:68"
			:isContainer false
			:opposite src
		) ( struct-map
			KM3_Reference
			:name "asso_Port_Signaldst"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Port
			:type HierarchicalSignalFlow_Asso_Port_Signal
			:location "12:3-12:68"
			:isContainer false
			:opposite dst
		)]
	) ) ( def HierarchicalSignalFlow_Signal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Signal
			:type HierarchicalSignalFlow_Base
			:location "16:3-16:43"
			:isContainer false
			:opposite signal
		) ( struct-map
			KM3_Reference
			:name "asso_Port_Signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Signal
			:type HierarchicalSignalFlow_Asso_Port_Signal
			:location "17:3-17:68"
			:isContainer false
			:opposite signal
		)]
	) ) ( def HierarchicalSignalFlow_Base ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Base
			:type HierarchicalSignalFlow_Compound
			:location "21:3-21:49"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "inputPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HierarchicalSignalFlow_Base
			:type HierarchicalSignalFlow_InputPort
			:location "22:3-22:64"
			:isContainer true
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "outputPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HierarchicalSignalFlow_Base
			:type HierarchicalSignalFlow_OutputPort
			:location "23:3-23:66"
			:isContainer true
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HierarchicalSignalFlow_Base
			:type HierarchicalSignalFlow_Signal
			:location "24:3-24:58"
			:isContainer true
			:opposite base
		)]
	) ) ( def HierarchicalSignalFlow_Compound ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HierarchicalSignalFlow_Base]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "localPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HierarchicalSignalFlow_Compound
			:type HierarchicalSignalFlow_LocalPort
			:location "28:3-28:69"
			:isContainer true
			:opposite compound
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HierarchicalSignalFlow_Compound
			:type HierarchicalSignalFlow_Base
			:location "29:3-29:59"
			:isContainer true
			:opposite compound
		)]
	) ) ( def HierarchicalSignalFlow_InputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HierarchicalSignalFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_InputPort
			:type HierarchicalSignalFlow_Base
			:location "33:3-33:46"
			:isContainer false
			:opposite inputPort
		)]
	) ) ( def HierarchicalSignalFlow_OutputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HierarchicalSignalFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_OutputPort
			:type HierarchicalSignalFlow_Base
			:location "37:3-37:47"
			:isContainer false
			:opposite outputPort
		)]
	) ) ( def HierarchicalSignalFlow_LocalPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HierarchicalSignalFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_LocalPort
			:type HierarchicalSignalFlow_Compound
			:location "43:3-43:54"
			:isContainer false
			:opposite localPort
		)]
	) ) ( def HierarchicalSignalFlow_Primitive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HierarchicalSignalFlow_Base]
		:structuralFeatures[]
	) ) ( def HierarchicalSignalFlow_Asso_Port_Signal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "src"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Asso_Port_Signal
			:type HierarchicalSignalFlow_Port
			:location "50:3-50:61"
			:isContainer false
			:opposite asso_Port_Signalsrc
		) ( struct-map
			KM3_Reference
			:name "dst"
			:upper -1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Asso_Port_Signal
			:type HierarchicalSignalFlow_Port
			:location "51:3-51:61"
			:isContainer false
			:opposite asso_Port_Signaldst
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HierarchicalSignalFlow_Asso_Port_Signal
			:type HierarchicalSignalFlow_Signal
			:location "52:3-52:58"
			:isContainer false
			:opposite asso_Port_Signal
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "57:2-57:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "58:2-58:19"
	) )]
) )
