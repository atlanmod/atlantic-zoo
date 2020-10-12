( declare XULInteractorMetaModel_UIModel )
( declare XULInteractorMetaModel_Windows )
( declare XULInteractorMetaModel_Button )
( declare XULInteractorMetaModel_Orients )
( declare XULInteractorMetaModel_Image )
( declare XULInteractorMetaModel_RadioGroup )
( declare XULInteractorMetaModel_Radio )
( declare XULInteractorMetaModel_ListBox )
( declare XULInteractorMetaModel_ListItem )
( declare XULInteractorMetaModel_MenuList )
( declare XULInteractorMetaModel_MenuItem )
( declare XULInteractorMetaModel_vbox )
( declare XULInteractorMetaModel_hbox )
( declare XULInteractorMetaModel_Containement )
( declare XULInteractorMetaModel_GroupBox )
( declare XULInteractorMetaModel_Container )
( declare XULInteractorMetaModel_Interactor )
( declare XULInteractorMetaModel_TabBox )
( declare XULInteractorMetaModel_TextBox )
( declare XULInteractorMetaModel_Spacer )
( declare XULInteractorMetaModel_Label )
( declare XULInteractorMetaModel_Grid )
( declare XULInteractorMetaModel_row )
( declare XULInteractorMetaModel_column )
( declare XULInteractorMetaModel_CheckBox )
( declare XULInteractorMetaModel_Caption )
( declare XULInteractorMetaModel_Description )
( declare XULInteractorMetaModel_HeaderCss )
( declare XULInteractorMetaModel_HeaderJScript )
( declare XULInteractorMetaModel_TabPanel )
( declare XULInteractorMetaModel_Event )
( declare XULInteractorMetaModel_Parameter )
( declare XULInteractorMetaModel_onClick )
( declare XULInteractorMetaModel_Function )
( declare primitivetype_String )
( declare primitivetype_Integer )
( declare primitivetype_Boolean )
( def XULInteractorMetaModel ( struct-map
	KM3_Package
	:contents[( def Orients ( :literals[( struct-map
		KM3_EnumLiteral
		:name "horizontal"
		:location "46:3-46:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vertical"
		:location "47:3-47:20"
	)] ) ) ( def XULInteractorMetaModel_UIModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "windows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_UIModel
			:type XULInteractorMetaModel_Windows
			:location "27:3-27:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "functions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_UIModel
			:type XULInteractorMetaModel_Function
			:location "28:3-28:82"
			:isContainer true
			:opposite functionUIModel
		)]
	) ) ( def XULInteractorMetaModel_Windows ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Windows
			:type String
			:location "32:3-32:30"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Windows
			:type String
			:location "33:3-33:33"
		) ( struct-map
			KM3_Attribute
			:name "orient"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Windows
			:type Orients
			:location "34:3-34:35"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Windows
			:type String
			:location "35:3-35:33"
		) ( struct-map
			KM3_Reference
			:name "headers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Windows
			:type XULInteractorMetaModel_HeaderCss
			:location "36:3-36:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headersJScript"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Windows
			:type XULInteractorMetaModel_HeaderJScript
			:location "37:3-37:55"
			:isContainer false
		)]
	) ) ( def XULInteractorMetaModel_Button ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tooltiptext"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Button
			:type String
			:location "41:3-41:39"
		) ( struct-map
			KM3_Attribute
			:name "image"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Button
			:type String
			:location "42:3-42:33"
		)]
	) ) ( def XULInteractorMetaModel_Image ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Image
			:type String
			:location "51:3-51:31"
		)]
	) ) ( def XULInteractorMetaModel_RadioGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "radiobuttons"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_RadioGroup
			:type XULInteractorMetaModel_Radio
			:location "55:3-55:55"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_Radio ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Interactor]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Radio
			:type String
			:location "59:3-59:30"
		) ( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Radio
			:type String
			:location "60:3-60:33"
		) ( struct-map
			KM3_Attribute
			:name "selected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Radio
			:type Boolean
			:location "61:3-61:37"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Radio
			:type Boolean
			:location "62:3-62:37"
		)]
	) ) ( def XULInteractorMetaModel_ListBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_ListBox
			:type Integer
			:location "66:3-66:33"
		) ( struct-map
			KM3_Reference
			:name "listitems"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_ListBox
			:type XULInteractorMetaModel_ListItem
			:location "67:3-67:55"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_ListItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Interactor]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_ListItem
			:type String
			:location "71:3-71:33"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_ListItem
			:type String
			:location "72:3-72:33"
		)]
	) ) ( def XULInteractorMetaModel_MenuList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "menuitems"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_MenuList
			:type XULInteractorMetaModel_MenuItem
			:location "76:3-76:55"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_MenuItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Interactor]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_MenuItem
			:type String
			:location "80:3-80:33"
		)]
	) ) ( def XULInteractorMetaModel_vbox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_hbox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_Containement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Interactor]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "92:3-92:33"
		) ( struct-map
			KM3_Attribute
			:name "accesskey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "93:3-93:37"
		) ( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "94:3-94:35"
		) ( struct-map
			KM3_Attribute
			:name "maxlength"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type Integer
			:location "95:3-95:38"
		) ( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "96:3-96:33"
		) ( struct-map
			KM3_Attribute
			:name "orient"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type Orients
			:location "97:3-97:35"
		) ( struct-map
			KM3_Attribute
			:name "minlength"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "98:3-98:37"
		) ( struct-map
			KM3_Attribute
			:name "onclick"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "99:3-99:35"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Containement
			:type String
			:location "100:3-100:36"
		)]
	) ) ( def XULInteractorMetaModel_GroupBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_Container ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Interactor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xulInteractors"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Container
			:type XULInteractorMetaModel_Interactor
			:location "108:3-108:62"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_Interactor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "flex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Interactor
			:type Integer
			:location "112:3-112:33"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Interactor
			:type String
			:location "113:3-113:30"
		) ( struct-map
			KM3_Attribute
			:name "stat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Interactor
			:type String
			:location "114:3-114:32"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Interactor
			:type String
			:location "115:3-115:33"
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Interactor
			:type XULInteractorMetaModel_Event
			:location "116:3-116:49"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_TabBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tabPanels"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_TabBox
			:type XULInteractorMetaModel_Interactor
			:location "120:3-120:57"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_TextBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_TextBox
			:type Boolean
			:location "124:3-124:38"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_TextBox
			:type String
			:location "125:3-125:33"
		)]
	) ) ( def XULInteractorMetaModel_Spacer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Label
			:type String
			:location "133:3-133:33"
		) ( struct-map
			KM3_Attribute
			:name "control"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Label
			:type String
			:location "134:3-134:35"
		)]
	) ) ( def XULInteractorMetaModel_Grid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Grid
			:type XULInteractorMetaModel_column
			:location "138:3-138:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Grid
			:type XULInteractorMetaModel_row
			:location "139:3-139:45"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_CheckBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "checked"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_CheckBox
			:type Boolean
			:location "151:3-151:36"
		)]
	) ) ( def XULInteractorMetaModel_Caption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Caption
			:type String
			:location "155:3-155:34"
		)]
	) ) ( def XULInteractorMetaModel_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Containement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Description
			:type String
			:location "159:3-159:33"
		)]
	) ) ( def XULInteractorMetaModel_HeaderCss ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_HeaderCss
			:type String
			:location "163:3-163:31"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_HeaderCss
			:type String
			:location "164:3-164:32"
		)]
	) ) ( def XULInteractorMetaModel_HeaderJScript ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_HeaderJScript
			:type String
			:location "168:3-168:31"
		)]
	) ) ( def XULInteractorMetaModel_TabPanel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Container]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_TabPanel
			:type String
			:location "172:3-172:30"
		) ( struct-map
			KM3_Attribute
			:name "orient"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_TabPanel
			:type Orients
			:location "173:3-173:35"
		)]
	) ) ( def XULInteractorMetaModel_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "functionCalledName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Event
			:type String
			:location "178:3-178:46"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Event
			:type String
			:location "179:3-179:32"
		) ( struct-map
			KM3_Reference
			:name "functionCallParameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XULInteractorMetaModel_Event
			:type XULInteractorMetaModel_Parameter
			:location "177:3-177:69"
			:isContainer true
		)]
	) ) ( def XULInteractorMetaModel_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Parameter
			:type String
			:location "183:3-183:33"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Parameter
			:type String
			:location "184:3-184:32"
		)]
	) ) ( def XULInteractorMetaModel_onClick ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XULInteractorMetaModel_Event]
		:structuralFeatures[]
	) ) ( def XULInteractorMetaModel_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Function
			:type String
			:location "192:3-192:32"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XULInteractorMetaModel_Function
			:type String
			:location "194:3-194:32"
		) ( struct-map
			KM3_Reference
			:name "functionUIModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XULInteractorMetaModel_Function
			:type XULInteractorMetaModel_UIModel
			:location "193:3-193:60"
			:isContainer false
			:opposite functions
		)]
	) )]
) )
( def primitivetype ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "199:2-199:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "200:2-200:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "201:2-201:19"
	) )]
) )
