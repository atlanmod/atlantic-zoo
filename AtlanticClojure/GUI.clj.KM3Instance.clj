( declare GUI_LocatedElement )
( declare GUI_Named )
( declare GUI_GUI )
( declare GUI_Tab )
( declare GUI_Composant )
( declare GUI_Layout )
( declare GUI_Group )
( declare GUI_Label )
( declare GUI_TextArea )
( declare GUI_Table )
( declare GUI_Column )
( declare GUI_ComboBox )
( declare GUI_Row )
( declare GUI_Item )
( declare GUI_Button )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def GUI ( struct-map
	KM3_Package
	:contents[( def Layout ( :literals[( struct-map
		KM3_EnumLiteral
		:name "default"
		:location "34:9-34:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "horizontal"
		:location "35:3-35:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vertical"
		:location "36:9-36:26"
	)] ) ) ( def GUI_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_LocatedElement
			:type String
			:location "12:3-12:32"
		)]
	) ) ( def GUI_Named ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[GUI_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Named
			:type String
			:location "16:3-16:28"
		)]
	) ) ( def GUI_GUI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Named]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guiTabs"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GUI_GUI
			:type GUI_Tab
			:location "20:3-20:63"
			:isContainer true
			:opposite gui
		)]
	) ) ( def GUI_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Named]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Tab
			:type String
			:location "24:3-24:29"
		) ( struct-map
			KM3_Reference
			:name "gui"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Tab
			:type GUI_GUI
			:location "25:3-25:42"
			:isContainer false
			:opposite guiTabs
		) ( struct-map
			KM3_Reference
			:name "group"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Tab
			:type GUI_Group
			:location "26:3-26:47"
			:isContainer false
			:opposite tabGroup
		)]
	) ) ( def GUI_Composant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[GUI_Named]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composantGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Composant
			:type GUI_Group
			:location "30:3-30:58"
			:isContainer false
			:opposite composants
		)]
	) ) ( def GUI_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Group
			:type String
			:location "40:3-40:28"
		) ( struct-map
			KM3_Attribute
			:name "layout"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Group
			:type Layout
			:location "41:3-41:29"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Group
			:type String
			:location "42:3-42:34"
		) ( struct-map
			KM3_Reference
			:name "tabGroup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GUI_Group
			:type GUI_Tab
			:location "43:3-43:50"
			:isContainer false
			:opposite group
		) ( struct-map
			KM3_Reference
			:name "composants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GUI_Group
			:type GUI_Composant
			:location "44:3-44:83"
			:isContainer true
			:opposite composantGroup
		)]
	) ) ( def GUI_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Label
			:type String
			:location "48:3-48:27"
		)]
	) ) ( def GUI_TextArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_TextArea
			:type String
			:location "52:3-52:27"
		) ( struct-map
			KM3_Attribute
			:name "nbRows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_TextArea
			:type Integer
			:location "53:3-53:30"
		)]
	) ) ( def GUI_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tabColumns"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GUI_Table
			:type GUI_Column
			:location "57:3-57:75"
			:isContainer true
			:opposite columnTab
		)]
	) ) ( def GUI_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Column
			:type String
			:location "61:3-61:28"
		) ( struct-map
			KM3_Reference
			:name "columnTab"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Column
			:type GUI_Table
			:location "62:3-62:53"
			:isContainer false
			:opposite tabColumns
		)]
	) ) ( def GUI_ComboBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "listRows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GUI_ComboBox
			:type GUI_Row
			:location "66:3-66:68"
			:isContainer true
			:opposite rowList
		)]
	) ) ( def GUI_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Row
			:type String
			:location "71:3-71:27"
		) ( struct-map
			KM3_Reference
			:name "rowList"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Row
			:type GUI_ComboBox
			:location "70:3-70:52"
			:isContainer false
			:opposite listRows
		) ( struct-map
			KM3_Reference
			:name "listItems"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GUI_Row
			:type GUI_Item
			:location "72:3-72:71"
			:isContainer true
			:opposite itemList
		)]
	) ) ( def GUI_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Item
			:type String
			:location "77:3-77:27"
		) ( struct-map
			KM3_Reference
			:name "itemList"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Item
			:type GUI_Row
			:location "76:3-76:49"
			:isContainer false
			:opposite listItems
		)]
	) ) ( def GUI_Button ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GUI_Composant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GUI_Button
			:type String
			:location "81:3-81:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "88:2-88:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "89:2-89:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "90:2-90:18"
	) )]
) )
