( declare Outline_LocatedElement )
( declare Outline_Outline )
( declare Outline_Node )
( declare Outline_Label )
( declare Outline_LabelSuite )
( declare Outline_Map )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Outline ( struct-map
	KM3_Package
	:contents[( def Outline_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_LocatedElement
			:type String
			:location "12:3-12:31"
		)]
	) ) ( def Outline_Outline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Outline_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Outline
			:type String
			:location "16:3-16:32"
		) ( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Outline_Outline
			:type Outline_Node
			:location "17:3-17:66"
			:isContainer true
			:opposite outline
		)]
	) ) ( def Outline_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Outline_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Node
			:type String
			:location "21:3-21:27"
		) ( struct-map
			KM3_Attribute
			:name "icon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Node
			:type String
			:location "23:3-23:27"
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Node
			:type Outline_Label
			:location "22:3-22:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "outline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Outline_Node
			:type Outline_Outline
			:location "24:3-24:53"
			:isContainer false
			:opposite nodes
		) ( struct-map
			KM3_Reference
			:name "mapping"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Outline_Node
			:type Outline_Map
			:location "25:3-25:40"
			:isContainer true
		)]
	) ) ( def Outline_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Outline_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Label
			:type String
			:location "29:3-29:28"
		) ( struct-map
			KM3_Attribute
			:name "methodCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Label
			:type String
			:location "30:3-30:33"
		) ( struct-map
			KM3_Reference
			:name "labelSuite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Outline_Label
			:type Outline_LabelSuite
			:location "31:3-31:50"
			:isContainer true
		)]
	) ) ( def Outline_LabelSuite ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Outline_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_LabelSuite
			:type String
			:location "35:3-35:28"
		) ( struct-map
			KM3_Attribute
			:name "methodCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_LabelSuite
			:type String
			:location "36:3-36:33"
		)]
	) ) ( def Outline_Map ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Outline_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mapString"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Outline_Map
			:type String
			:location "40:3-40:32"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "45:2-45:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "46:2-46:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "47:2-47:18"
	) )]
) )
