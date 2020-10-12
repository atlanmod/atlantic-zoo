( declare Scilab_Man )
( declare Scilab_Meta )
( declare Scilab_Short_Description )
( declare Scilab_Calling_Sequence )
( declare Scilab_Calling_Sequence_Item )
( declare Scilab_Param )
( declare Scilab_Param_Indent )
( declare Scilab_Param_Item )
( declare Scilab_Param_Name )
( declare Scilab_Param_Description )
( declare Scilab_Description )
( declare Scilab_Description_Indent )
( declare Scilab_Description_Item )
( declare Scilab_AIMG )
( declare Scilab_See_Also )
( declare Scilab_Exemple )
( declare Scilab_See_Also_Item )
( declare Scilab_A )
( declare Scilab_Img )
( declare Scilab_Biblio )
( declare Scilab_Used_Functions )
( declare Scilab_PSPPP )
( declare Scilab_P )
( declare Scilab_SP )
( declare Scilab_PP )
( declare Scilab_Itemize )
( declare Scilab_Item )
( declare Scilab_Table )
( declare Scilab_Table_New_Row )
( declare Scilab_Table_New_Column )
( declare Scilab_Link )
( declare Scilab_Authors )
( declare Scilab_Authors_Item )
( declare Scilab_Section )
( declare Scilab_InOut )
( declare Scilab_PreDef )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def Scilab ( struct-map
	KM3_Package
	:contents[( def InOut ( :literals[( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "260:4-260:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "261:4-261:16"
	)] ) ) ( def PreDef ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Preserve"
		:location "266:4-266:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Default"
		:location "267:4-267:20"
	)] ) ) ( def Scilab_Man ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "13:3-13:31"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "14:3-14:28"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "15:3-15:27"
		) ( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "16:3-16:27"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "17:3-17:32"
		) ( struct-map
			KM3_Attribute
			:name "keyword"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "18:3-18:35"
		) ( struct-map
			KM3_Attribute
			:name "exemple"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Man
			:type String
			:location "19:3-19:35"
		) ( struct-map
			KM3_Reference
			:name "meta"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Man
			:type Scilab_Meta
			:location "21:3-21:53"
			:isContainer true
			:opposite man
		)]
	) ) ( def Scilab_Meta ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "meta"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "26:3-26:27"
		) ( struct-map
			KM3_Attribute
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "27:3-27:27"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "28:3-28:31"
		) ( struct-map
			KM3_Attribute
			:name "version_CSI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "29:3-29:34"
		) ( struct-map
			KM3_Attribute
			:name "version_DOC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "30:3-30:34"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type String
			:location "31:3-31:29"
		) ( struct-map
			KM3_Reference
			:name "man"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Meta
			:type Scilab_Man
			:location "33:3-33:39"
			:isContainer false
			:opposite meta
		)]
	) ) ( def Scilab_Short_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Biblio]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Short_Description
			:type String
			:location "38:3-38:27"
		) ( struct-map
			KM3_Attribute
			:name "verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Short_Description
			:type String
			:location "39:3-39:30"
		)]
	) ) ( def Scilab_Calling_Sequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "calling_Sequence_Item"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Calling_Sequence
			:type Scilab_Calling_Sequence_Item
			:location "44:3-44:100"
			:isContainer true
			:opposite calling_Sequence
		)]
	) ) ( def Scilab_Calling_Sequence_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "calling_Sequence_Item"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Calling_Sequence_Item
			:type String
			:location "49:3-49:47"
		) ( struct-map
			KM3_Reference
			:name "calling_Sequence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Calling_Sequence_Item
			:type Scilab_Calling_Sequence
			:location "51:3-51:82"
			:isContainer false
			:opposite calling_Sequence_Item
		)]
	) ) ( def Scilab_Param ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Param
			:type InOut
			:location "56:3-56:33"
		) ( struct-map
			KM3_Reference
			:name "param_Indent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Param
			:type Scilab_Param_Indent
			:location "58:3-58:71"
			:isContainer true
			:opposite param
		)]
	) ) ( def Scilab_Param_Indent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "param"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Indent
			:type Scilab_Param
			:location "63:3-63:51"
			:isContainer false
			:opposite param_Indent
		) ( struct-map
			KM3_Reference
			:name "param_Description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Indent
			:type Scilab_Param_Description
			:location "64:3-64:75"
			:isContainer false
			:opposite param_Indent
		) ( struct-map
			KM3_Reference
			:name "param_Item"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Indent
			:type Scilab_Param_Item
			:location "65:3-65:76"
			:isContainer true
			:opposite param_Indent
		)]
	) ) ( def Scilab_Param_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Param_Item
			:type String
			:location "70:3-70:33"
		) ( struct-map
			KM3_Reference
			:name "param_Indent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Item
			:type Scilab_Param_Indent
			:location "72:3-72:63"
			:isContainer false
			:opposite param_Item
		) ( struct-map
			KM3_Reference
			:name "param_Name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Item
			:type Scilab_Param_Name
			:location "73:3-73:69"
			:isContainer true
			:opposite param_Item
		) ( struct-map
			KM3_Reference
			:name "param_Description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Item
			:type Scilab_Param_Description
			:location "74:3-74:83"
			:isContainer true
			:opposite param_Item
		)]
	) ) ( def Scilab_Param_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Param_Name
			:type String
			:location "79:3-79:30"
		) ( struct-map
			KM3_Reference
			:name "param_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Name
			:type Scilab_Param_Item
			:location "81:3-81:59"
			:isContainer false
			:opposite param_Name
		)]
	) ) ( def Scilab_Param_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Used_Functions]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "param_Indent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Param_Description
			:type Scilab_Param_Indent
			:location "86:3-86:83"
			:isContainer true
			:opposite param_Description
		) ( struct-map
			KM3_Reference
			:name "param_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Param_Description
			:type Scilab_Param_Item
			:location "87:3-87:66"
			:isContainer false
			:opposite param_Description
		)]
	) ) ( def Scilab_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Used_Functions]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "itemize"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Description
			:type Scilab_Itemize
			:location "92:3-92:67"
			:isContainer true
			:opposite description
		) ( struct-map
			KM3_Reference
			:name "description_Indent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Description
			:type Scilab_Description_Indent
			:location "93:3-93:89"
			:isContainer true
			:opposite description
		)]
	) ) ( def Scilab_Description_Indent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Description_Indent
			:type Scilab_Description
			:location "98:3-98:69"
			:isContainer false
			:opposite description_Indent
		) ( struct-map
			KM3_Reference
			:name "description_Item"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Description_Indent
			:type Scilab_Description_Item
			:location "99:3-99:94"
			:isContainer true
			:opposite description_Indent
		)]
	) ) ( def Scilab_Description_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Description_Item
			:type String
			:location "104:3-104:33"
		) ( struct-map
			KM3_Reference
			:name "description_Indent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Description_Item
			:type Scilab_Description_Indent
			:location "106:3-106:81"
			:isContainer false
			:opposite description_Item
		)]
	) ) ( def Scilab_AIMG ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_AIMG
			:type String
			:location "111:3-111:30"
		)]
	) ) ( def Scilab_See_Also ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "see_Also_Item"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_See_Also
			:type Scilab_See_Also_Item
			:location "116:3-116:76"
			:isContainer true
			:opposite see_Also
		)]
	) ) ( def Scilab_Exemple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "exemple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Exemple
			:type String
			:location "121:3-121:30"
		) ( struct-map
			KM3_Attribute
			:name "xml_space"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Exemple
			:type PreDef
			:location "122:3-122:32"
		)]
	) ) ( def Scilab_See_Also_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "see_Also"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_See_Also_Item
			:type Scilab_See_Also
			:location "127:3-127:58"
			:isContainer false
			:opposite see_Also_Item
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_See_Also_Item
			:type Scilab_Link
			:location "128:3-128:63"
			:isContainer true
			:opposite see_Also_Item
		)]
	) ) ( def Scilab_A ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_AIMG]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_A
			:type String
			:location "133:3-133:32"
		) ( struct-map
			KM3_Reference
			:name "psppp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_A
			:type Scilab_PSPPP
			:location "135:3-135:40"
			:isContainer false
			:opposite a
		) ( struct-map
			KM3_Reference
			:name "authors_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_A
			:type Scilab_Authors_Item
			:location "136:3-136:54"
			:isContainer false
			:opposite a
		)]
	) ) ( def Scilab_Img ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_AIMG]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Img
			:type String
			:location "141:3-141:31"
		) ( struct-map
			KM3_Reference
			:name "psppp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Img
			:type Scilab_PSPPP
			:location "143:3-143:42"
			:isContainer false
			:opposite img
		)]
	) ) ( def Scilab_Biblio ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "p"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Biblio
			:type Scilab_P
			:location "148:3-148:50"
			:isContainer true
			:opposite biblio
		) ( struct-map
			KM3_Reference
			:name "sp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Biblio
			:type Scilab_SP
			:location "149:3-149:52"
			:isContainer true
			:opposite biblio
		) ( struct-map
			KM3_Reference
			:name "pp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Biblio
			:type Scilab_PP
			:location "150:3-150:52"
			:isContainer true
			:opposite biblio
		)]
	) ) ( def Scilab_Used_Functions ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Biblio]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verbatim"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Used_Functions
			:type String
			:location "155:3-155:34"
		) ( struct-map
			KM3_Reference
			:name "table"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Used_Functions
			:type Scilab_Table
			:location "157:3-157:66"
			:isContainer true
			:opposite used_Functions
		)]
	) ) ( def Scilab_PSPPP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type String
			:location "162:3-162:30"
		) ( struct-map
			KM3_Attribute
			:name "em"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type String
			:location "163:3-163:28"
		) ( struct-map
			KM3_Attribute
			:name "bd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type String
			:location "164:3-164:28"
		) ( struct-map
			KM3_Attribute
			:name "tt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type String
			:location "165:3-165:28"
		) ( struct-map
			KM3_Reference
			:name "a"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type Scilab_A
			:location "167:3-167:49"
			:isContainer true
			:opposite psppp
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type Scilab_Link
			:location "168:3-168:55"
			:isContainer true
			:opposite psppp
		) ( struct-map
			KM3_Reference
			:name "img"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_PSPPP
			:type Scilab_Img
			:location "169:3-169:53"
			:isContainer true
			:opposite psppp
		)]
	) ) ( def Scilab_P ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_PSPPP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "biblio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_P
			:type Scilab_Biblio
			:location "174:3-174:42"
			:isContainer false
			:opposite p
		)]
	) ) ( def Scilab_SP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_PSPPP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "biblio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_SP
			:type Scilab_Biblio
			:location "179:3-179:43"
			:isContainer false
			:opposite sp
		)]
	) ) ( def Scilab_PP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_PSPPP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "biblio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_PP
			:type Scilab_Biblio
			:location "184:3-184:43"
			:isContainer false
			:opposite pp
		)]
	) ) ( def Scilab_Itemize ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Used_Functions]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Itemize
			:type String
			:location "189:3-189:28"
		) ( struct-map
			KM3_Reference
			:name "item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Itemize
			:type Scilab_Item
			:location "191:3-191:44"
			:isContainer false
			:opposite itemize
		) ( struct-map
			KM3_Reference
			:name "section"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Itemize
			:type Scilab_Section
			:location "192:3-192:50"
			:isContainer false
			:opposite itemize
		) ( struct-map
			KM3_Reference
			:name "authors_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Itemize
			:type Scilab_Authors_Item
			:location "193:3-193:60"
			:isContainer false
			:opposite itemize
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Itemize
			:type Scilab_Description
			:location "194:3-194:58"
			:isContainer false
			:opposite itemize
		)]
	) ) ( def Scilab_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Used_Functions Scilab_Itemize]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "itemize"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Item
			:type Scilab_Itemize
			:location "199:3-199:60"
			:isContainer true
			:opposite item
		)]
	) ) ( def Scilab_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "table_New_Row"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Table
			:type Scilab_Table_New_Row
			:location "204:3-204:75"
			:isContainer true
			:opposite table
		) ( struct-map
			KM3_Reference
			:name "used_Functions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Table
			:type Scilab_Used_Functions
			:location "205:3-205:62"
			:isContainer false
			:opposite table
		)]
	) ) ( def Scilab_Table_New_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "table_New_Column"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Table_New_Row
			:type Scilab_Table_New_Column
			:location "210:3-210:89"
			:isContainer true
			:opposite table_New_Row
		) ( struct-map
			KM3_Reference
			:name "table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Table_New_Row
			:type Scilab_Table
			:location "211:3-211:52"
			:isContainer false
			:opposite table_New_Row
		)]
	) ) ( def Scilab_Table_New_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Table_New_Column
			:type String
			:location "216:3-216:30"
		) ( struct-map
			KM3_Attribute
			:name "em"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Table_New_Column
			:type String
			:location "217:3-217:28"
		) ( struct-map
			KM3_Attribute
			:name "bd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Table_New_Column
			:type String
			:location "218:3-218:28"
		) ( struct-map
			KM3_Attribute
			:name "tt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Table_New_Column
			:type String
			:location "219:3-219:28"
		) ( struct-map
			KM3_Reference
			:name "table_New_Row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Table_New_Column
			:type Scilab_Table_New_Row
			:location "221:3-221:71"
			:isContainer false
			:opposite table_New_Column
		)]
	) ) ( def Scilab_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Link
			:type String
			:location "226:3-226:27"
		) ( struct-map
			KM3_Reference
			:name "psppp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Link
			:type Scilab_PSPPP
			:location "228:3-228:43"
			:isContainer false
			:opposite link
		) ( struct-map
			KM3_Reference
			:name "see_Also_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Link
			:type Scilab_See_Also_Item
			:location "229:3-229:59"
			:isContainer false
			:opposite link
		) ( struct-map
			KM3_Reference
			:name "authors_Item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Link
			:type Scilab_Authors_Item
			:location "230:3-230:57"
			:isContainer false
			:opposite link
		)]
	) ) ( def Scilab_Authors ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "authors_Item"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Authors
			:type Scilab_Authors_Item
			:location "235:3-235:75"
			:isContainer true
			:opposite authors
		)]
	) ) ( def Scilab_Authors_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Biblio]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Verb"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "240:3-240:30"
		) ( struct-map
			KM3_Attribute
			:name "em"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "241:3-241:28"
		) ( struct-map
			KM3_Attribute
			:name "bd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "242:3-242:28"
		) ( struct-map
			KM3_Attribute
			:name "tt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "243:3-243:28"
		) ( struct-map
			KM3_Attribute
			:name "verbatim"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "244:3-244:34"
		) ( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type String
			:location "245:3-245:33"
		) ( struct-map
			KM3_Reference
			:name "a"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type Scilab_A
			:location "247:3-247:56"
			:isContainer true
			:opposite authors_Item
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Authors_Item
			:type Scilab_Link
			:location "248:3-248:62"
			:isContainer true
			:opposite authors_Item
		) ( struct-map
			KM3_Reference
			:name "authors"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Scilab_Authors_Item
			:type Scilab_Authors
			:location "249:3-249:55"
			:isContainer false
			:opposite authors_Item
		) ( struct-map
			KM3_Reference
			:name "itemize"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Scilab_Authors_Item
			:type Scilab_Itemize
			:location "250:3-250:70"
			:isContainer true
			:opposite authors_Item
		)]
	) ) ( def Scilab_Section ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Scilab_Used_Functions Scilab_Itemize]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "itemize"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Scilab_Section
			:type Scilab_Itemize
			:location "255:3-255:63"
			:isContainer true
			:opposite section
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "272:2-272:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "273:2-273:19"
	) )]
) )
