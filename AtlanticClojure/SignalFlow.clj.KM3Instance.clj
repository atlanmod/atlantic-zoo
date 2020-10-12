( declare SignalFlow_RootFolder )
( declare SignalFlow_CompoundComponent )
( declare SignalFlow_PrimitiveComponent )
( declare SignalFlow_BaseComponent )
( declare SignalFlow_InputPort )
( declare SignalFlow_LocalPort )
( declare SignalFlow_OutputPort )
( declare SignalFlow_PortBase )
( declare SignalFlow_Signal )
( declare SignalFlow_AssociationPortBase_PortBase )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def SignalFlow ( struct-map
	KM3_Package
	:contents[( def SignalFlow_RootFolder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoundComponent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_RootFolder
			:type SignalFlow_CompoundComponent
			:location "12:3-12:85"
			:isContainer true
			:opposite rootFolder
		)]
	) ) ( def SignalFlow_CompoundComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SignalFlow_BaseComponent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rootFolder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_CompoundComponent
			:type SignalFlow_RootFolder
			:location "17:3-17:66"
			:isContainer false
			:opposite compoundComponent
		) ( struct-map
			KM3_Reference
			:name "baseComponent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_CompoundComponent
			:type SignalFlow_BaseComponent
			:location "18:3-18:84"
			:isContainer true
			:opposite compoundComponent
		) ( struct-map
			KM3_Reference
			:name "localPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_CompoundComponent
			:type SignalFlow_LocalPort
			:location "19:3-19:76"
			:isContainer true
			:opposite compoundComponent
		)]
	) ) ( def SignalFlow_PrimitiveComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SignalFlow_BaseComponent]
		:structuralFeatures[]
	) ) ( def SignalFlow_BaseComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type String
			:location "29:3-29:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type String
			:location "30:3-30:36"
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type SignalFlow_Signal
			:location "32:3-32:66"
			:isContainer true
			:opposite baseComponent
		) ( struct-map
			KM3_Reference
			:name "outputPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type SignalFlow_OutputPort
			:location "33:3-33:74"
			:isContainer true
			:opposite baseComponent
		) ( struct-map
			KM3_Reference
			:name "inputPort"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type SignalFlow_InputPort
			:location "34:3-34:72"
			:isContainer true
			:opposite baseComponent
		) ( struct-map
			KM3_Reference
			:name "compoundComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_BaseComponent
			:type SignalFlow_CompoundComponent
			:location "35:3-35:76"
			:isContainer false
			:opposite baseComponent
		)]
	) ) ( def SignalFlow_InputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SignalFlow_PortBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "baseComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_InputPort
			:type SignalFlow_BaseComponent
			:location "40:3-40:64"
			:isContainer false
			:opposite inputPort
		)]
	) ) ( def SignalFlow_LocalPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SignalFlow_PortBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoundComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_LocalPort
			:type SignalFlow_CompoundComponent
			:location "46:3-46:72"
			:isContainer false
			:opposite localPort
		)]
	) ) ( def SignalFlow_OutputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SignalFlow_PortBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "baseComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_OutputPort
			:type SignalFlow_BaseComponent
			:location "51:3-51:65"
			:isContainer false
			:opposite outputPort
		)]
	) ) ( def SignalFlow_PortBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_PortBase
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SignalFlow_PortBase
			:type String
			:location "57:3-57:36"
		) ( struct-map
			KM3_Reference
			:name "associationPortBase_PortBasesrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_PortBase
			:type SignalFlow_AssociationPortBase_PortBase
			:location "59:3-59:99"
			:isContainer false
			:opposite srcPortBase
		) ( struct-map
			KM3_Reference
			:name "associationPortBase_PortBasedst"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_PortBase
			:type SignalFlow_AssociationPortBase_PortBase
			:location "60:3-60:100"
			:isContainer false
			:opposite dstPortBase
		)]
	) ) ( def SignalFlow_Signal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_Signal
			:type String
			:location "66:3-66:27"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SignalFlow_Signal
			:type String
			:location "67:3-67:36"
		) ( struct-map
			KM3_Reference
			:name "baseComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_Signal
			:type SignalFlow_BaseComponent
			:location "69:3-69:61"
			:isContainer false
			:opposite signal
		) ( struct-map
			KM3_Reference
			:name "associationPortBase_PortBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_Signal
			:type SignalFlow_AssociationPortBase_PortBase
			:location "70:3-70:92"
			:isContainer false
			:opposite signal
		)]
	) ) ( def SignalFlow_AssociationPortBase_PortBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "srcPortBase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SignalFlow_AssociationPortBase_PortBase
			:type SignalFlow_PortBase
			:location "75:3-75:84"
			:isContainer false
			:opposite associationPortBase_PortBasesrc
		) ( struct-map
			KM3_Reference
			:name "dstPortBase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SignalFlow_AssociationPortBase_PortBase
			:type SignalFlow_PortBase
			:location "76:3-76:84"
			:isContainer false
			:opposite associationPortBase_PortBasedst
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SignalFlow_AssociationPortBase_PortBase
			:type SignalFlow_Signal
			:location "77:3-77:69"
			:isContainer false
			:opposite associationPortBase_PortBase
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "83:2-83:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "84:2-84:19"
	) )]
) )
