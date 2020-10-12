( declare Editor_LocatedElement )
( declare Editor_Editor )
( declare Editor_AbstractElement )
( declare Editor_Block )
( declare Editor_GroupElement )
( declare Editor_Element )
( declare Editor_Format )
( declare Editor_Color )
( declare Editor_Font )
( declare Editor_Indent )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def Editor ( struct-map
	KM3_Package
	:contents[( def Editor_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_LocatedElement
			:type String
			:location "12:3-12:31"
		)]
	) ) ( def Editor_Editor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Editor
			:type String
			:location "16:3-16:32"
		) ( struct-map
			KM3_Reference
			:name "abstractElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Editor_Editor
			:type Editor_AbstractElement
			:location "17:3-17:61"
			:isContainer true
		)]
	) ) ( def Editor_AbstractElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_AbstractElement
			:type String
			:location "21:3-21:27"
		) ( struct-map
			KM3_Reference
			:name "format"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Editor_AbstractElement
			:type Editor_Format
			:location "22:3-22:44"
			:isContainer true
		)]
	) ) ( def Editor_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_AbstractElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "blockbegin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Block
			:type String
			:location "27:3-27:33"
		) ( struct-map
			KM3_Attribute
			:name "blockend"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Block
			:type String
			:location "28:3-28:31"
		)]
	) ) ( def Editor_GroupElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_AbstractElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "indent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Editor_GroupElement
			:type Editor_Indent
			:location "34:3-34:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Editor_GroupElement
			:type Editor_Element
			:location "35:3-35:44"
			:isContainer true
		)]
	) ) ( def Editor_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Element
			:type String
			:location "40:3-40:30"
		) ( struct-map
			KM3_Reference
			:name "groupElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Element
			:type Editor_GroupElement
			:location "41:3-41:41"
			:isContainer false
		)]
	) ) ( def Editor_Format ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Editor_Format
			:type Editor_Color
			:location "45:3-45:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Editor_Format
			:type Editor_Font
			:location "46:3-46:40"
			:isContainer true
		)]
	) ) ( def Editor_Color ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "red"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Color
			:type Integer
			:location "50:3-50:27"
		) ( struct-map
			KM3_Attribute
			:name "green"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Color
			:type Integer
			:location "51:3-51:29"
		) ( struct-map
			KM3_Attribute
			:name "blue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Color
			:type Integer
			:location "52:3-52:28"
		)]
	) ) ( def Editor_Font ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Font
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Attribute
			:name "bold"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Font
			:type Boolean
			:location "57:3-57:28"
		) ( struct-map
			KM3_Attribute
			:name "italic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Font
			:type Boolean
			:location "58:3-58:30"
		)]
	) ) ( def Editor_Indent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Editor_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "retrait"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Indent
			:type String
			:location "62:3-62:30"
		) ( struct-map
			KM3_Reference
			:name "groupElementIndent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Editor_Indent
			:type Editor_GroupElement
			:location "63:3-63:47"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "68:2-68:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "69:2-69:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "70:2-70:19"
	) )]
) )
