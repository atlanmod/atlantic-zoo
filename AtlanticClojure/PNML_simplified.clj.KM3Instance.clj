( declare PNML_LocatedElement )
( declare PNML_IdedElement )
( declare PNML_URI )
( declare PNML_PNMLDocument )
( declare PNML_NetElement )
( declare PNML_NetContent )
( declare PNML_LabeledElement )
( declare PNML_Label )
( declare PNML_Name )
( declare PNML_NetContentElement )
( declare PNML_Arc )
( declare PNML_Place )
( declare PNML_Transition )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def PNML ( struct-map
	KM3_Package
	:contents[( def PNML_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_LocatedElement
			:type String
			:location "12:3-12:31"
		)]
	) ) ( def PNML_IdedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_IdedElement
			:type String
			:location "16:3-16:25"
		)]
	) ) ( def PNML_URI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_URI
			:type String
			:location "23:3-23:28"
		)]
	) ) ( def PNML_PNMLDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xmlns"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_URI
			:location "31:3-31:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nets"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_NetElement
			:location "32:3-32:66"
			:isContainer true
			:opposite document
		)]
	) ) ( def PNML_NetElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_URI
			:location "38:3-38:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_PNMLDocument
			:location "39:3-39:53"
			:isContainer false
			:opposite nets
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_NetContent
			:location "40:3-40:63"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_Name
			:location "41:3-41:55"
			:isContainer true
			:opposite net
		)]
	) ) ( def PNML_NetContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_NetElement
			:location "46:3-46:50"
			:isContainer false
			:opposite contents
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_Name
			:location "47:3-47:62"
			:isContainer true
			:opposite netContent
		)]
	) ) ( def PNML_LabeledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "labels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_LabeledElement
			:type PNML_Label
			:location "52:3-52:67"
			:isContainer true
			:opposite labeledElement
		)]
	) ) ( def PNML_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type String
			:location "57:3-57:27"
		) ( struct-map
			KM3_Reference
			:name "labeledElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type PNML_LabeledElement
			:location "58:3-58:63"
			:isContainer false
			:opposite labels
		)]
	) ) ( def PNML_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LabeledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Name
			:type PNML_NetElement
			:location "62:3-62:51"
			:isContainer false
			:opposite name
		) ( struct-map
			KM3_Reference
			:name "netContent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Name
			:type PNML_NetContent
			:location "63:3-63:58"
			:isContainer false
			:opposite name
		)]
	) ) ( def PNML_NetContentElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_NetContent PNML_IdedElement]
		:structuralFeatures[]
	) ) ( def PNML_Arc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "73:3-73:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "74:3-74:40"
			:isContainer false
		)]
	) ) ( def PNML_Place ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContentElement]
		:structuralFeatures[]
	) ) ( def PNML_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContentElement]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "88:2-88:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "89:2-89:18"
	) )]
) )
