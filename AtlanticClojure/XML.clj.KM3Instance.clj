( declare XML_Node )
( declare XML_Attribute )
( declare XML_Text )
( declare XML_Element )
( declare XML_Root )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def XML ( struct-map
	KM3_Package
	:contents[( def XML_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "startLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XML_Node
			:type Integer
			:location "10:3-10:38"
		) ( struct-map
			KM3_Attribute
			:name "startColumn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XML_Node
			:type Integer
			:location "11:3-11:40"
		) ( struct-map
			KM3_Attribute
			:name "endLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XML_Node
			:type Integer
			:location "12:3-12:36"
		) ( struct-map
			KM3_Attribute
			:name "endColumn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XML_Node
			:type Integer
			:location "13:3-13:38"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XML_Node
			:type String
			:location "14:3-14:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XML_Node
			:type String
			:location "15:3-15:28"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XML_Node
			:type XML_Element
			:location "16:3-16:55"
			:isContainer false
			:opposite children
		)]
	) ) ( def XML_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XML_Node]
		:structuralFeatures[]
	) ) ( def XML_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XML_Node]
		:structuralFeatures[]
	) ) ( def XML_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XML_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XML_Element
			:type XML_Node
			:location "24:3-24:68"
			:isContainer true
			:opposite parent
		)]
	) ) ( def XML_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XML_Element]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "31:2-31:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "32:2-32:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "33:2-33:18"
	) )]
) )
