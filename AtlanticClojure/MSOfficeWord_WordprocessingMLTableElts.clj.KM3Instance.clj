( declare WordprocessingMLTableElts_DateTimeType )
( declare WordprocessingMLTableElts_VersionType )
( declare WordprocessingMLTableElts_ValueType )
( declare WordprocessingMLTableElts_StringValue )
( declare WordprocessingMLTableElts_FloatValue )
( declare WordprocessingMLTableElts_DateTimeTypeValue )
( declare WordprocessingMLTableElts_BooleanValue )
( declare WordprocessingMLTableElts_DocumentPropertiesCollection )
( declare WordprocessingMLTableElts_CustomDocumentPropertiesCollection )
( declare WordprocessingMLTableElts_CustomDocumentProperty )
( declare WordprocessingMLTableElts_SmartTagType )
( declare WordprocessingMLTableElts_SmartTagsCollection )
( declare WordprocessingMLTableElts_StringProperty )
( declare WordprocessingMLTableElts_StringType )
( declare WordprocessingMLTableElts_BreakType )
( declare WordprocessingMLTableElts_NoteValue )
( declare WordprocessingMLTableElts_OnOffType )
( declare WordprocessingMLTableElts_FldCharTypeProperty )
( declare WordprocessingMLTableElts_WordDocument )
( declare WordprocessingMLTableElts_DocPrElt )
( declare WordprocessingMLTableElts_BodyElt )
( declare WordprocessingMLTableElts_BlockLevelElt )
( declare WordprocessingMLTableElts_BlockLevelChunkElt )
( declare WordprocessingMLTableElts_ParaElt )
( declare WordprocessingMLTableElts_ParaPrElt )
( declare WordprocessingMLTableElts_ParaContentElt )
( declare WordprocessingMLTableElts_RunElt )
( declare WordprocessingMLTableElts_RunPrElt )
( declare WordprocessingMLTableElts_RunContentElt )
( declare WordprocessingMLTableElts_BreakElt )
( declare WordprocessingMLTableElts_Text )
( declare WordprocessingMLTableElts_DelText )
( declare WordprocessingMLTableElts_InstrText )
( declare WordprocessingMLTableElts_DelInstrText )
( declare WordprocessingMLTableElts_NoBreakHyphen )
( declare WordprocessingMLTableElts_SoftHyphen )
( declare WordprocessingMLTableElts_AnnotationRef )
( declare WordprocessingMLTableElts_FootnoteRef )
( declare WordprocessingMLTableElts_EndnoteRef )
( declare WordprocessingMLTableElts_Separator )
( declare WordprocessingMLTableElts_ContinuationSeparator )
( declare WordprocessingMLTableElts_PgNum )
( declare WordprocessingMLTableElts_Cr )
( declare WordprocessingMLTableElts_Footnote )
( declare WordprocessingMLTableElts_Endnote )
( declare WordprocessingMLTableElts_NoteElt )
( declare WordprocessingMLTableElts_Picture )
( declare WordprocessingMLTableElts_Symbol )
( declare WordprocessingMLTableElts_SymElt )
( declare WordprocessingMLTableElts_Tab )
( declare WordprocessingMLTableElts_FldChar )
( declare WordprocessingMLTableElts_FldCharElt )
( declare WordprocessingMLTableElts_TableElt )
( declare WordprocessingMLTableElts_TablePrElt )
( declare WordprocessingMLTableElts_TableGridElt )
( declare WordprocessingMLTableElts_TableContentElt )
( declare WordprocessingMLTableElts_RowElt )
( declare WordprocessingMLTableElts_TablePrExElt )
( declare WordprocessingMLTableElts_TableRowPrElt )
( declare WordprocessingMLTableElts_RowContentElt )
( declare WordprocessingMLTableElts_TableCellElt )
( declare WordprocessingMLTableElts_TableCellPrElt )
( declare WordprocessingMLTableElts_FontsListElt )
( declare WordprocessingMLTableElts_ListsElt )
( declare WordprocessingMLTableElts_StylesElt )
( declare WordprocessingMLTableElts_SectPrElt )
( declare WordprocessingMLTableElts_RunLevelElt )
( declare WordprocessingMLTableElts_CfChunk )
( declare WordprocessingMLTableElts_SimpleFieldElt )
( declare WordprocessingMLTableElts_HLinkElt )
( declare WordprocessingMLTableElts_SubDocElt )
( declare WordprocessingMLTableElts_PictureType )
( declare WordprocessingMLTableElts_TabElt )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def WordprocessingMLTableElts ( struct-map
	KM3_Package
	:contents[( def BreakType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "bt_page"
		:location "163:4-163:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "bt_column"
		:location "164:4-164:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "bt_text_wrapping"
		:location "165:4-165:29"
	)] ) ) ( def NoteValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ftn_normal"
		:location "171:4-171:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_separator"
		:location "173:4-173:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_continuation_separator"
		:location "175:4-175:39"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_continuation_notice"
		:location "177:4-177:36"
	)] ) ) ( def OnOffType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "oot_on"
		:location "182:4-182:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "oot_off"
		:location "183:4-183:20"
	)] ) ) ( def FldCharTypeProperty ( :literals[( struct-map
		KM3_EnumLiteral
		:name "fctp_begin"
		:location "188:4-188:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "fctp_separate"
		:location "189:4-189:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "fctp_end"
		:location "190:4-190:21"
	)] ) ) ( def WordprocessingMLTableElts_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def WordprocessingMLTableElts_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def WordprocessingMLTableElts_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_StringValue
			:type String
			:location "34:3-34:28"
		)]
	) ) ( def WordprocessingMLTableElts_FloatValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_FloatValue
			:type Double
			:location "38:3-38:28"
		)]
	) ) ( def WordprocessingMLTableElts_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DateTimeTypeValue
			:type WordprocessingMLTableElts_DateTimeType
			:location "42:3-42:34"
			:isContainer false
		)]
	) ) ( def WordprocessingMLTableElts_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_BooleanValue
			:type Boolean
			:location "46:3-46:29"
		)]
	) ) ( def WordprocessingMLTableElts_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "60:3-60:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "62:3-62:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "64:3-64:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "66:3-66:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "70:3-70:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "72:3-72:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "74:3-74:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "76:3-76:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "78:3-78:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "80:3-80:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "82:3-82:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "84:3-84:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type String
			:location "86:3-86:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "90:3-90:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "98:3-98:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "100:3-100:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:39"
		) ( struct-map
			KM3_Reference
			:name "dp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type WordprocessingMLTableElts_WordDocument
			:location "57:3-57:72"
			:isContainer false
			:opposite wd_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type WordprocessingMLTableElts_VersionType
			:location "88:3-88:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type WordprocessingMLTableElts_DateTimeType
			:location "92:3-92:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type WordprocessingMLTableElts_DateTimeType
			:location "94:3-94:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_DocumentPropertiesCollection
			:type WordprocessingMLTableElts_DateTimeType
			:location "96:3-96:53"
			:isContainer true
		)]
	) ) ( def WordprocessingMLTableElts_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_CustomDocumentPropertiesCollection
			:type WordprocessingMLTableElts_WordDocument
			:location "115:3-115:79"
			:isContainer false
			:opposite wd_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_CustomDocumentPropertiesCollection
			:type WordprocessingMLTableElts_CustomDocumentProperty
			:location "117:3-117:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def WordprocessingMLTableElts_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_CustomDocumentProperty
			:type String
			:location "123:3-123:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_CustomDocumentProperty
			:type WordprocessingMLTableElts_CustomDocumentPropertiesCollection
			:location "122:3-122:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_CustomDocumentProperty
			:type WordprocessingMLTableElts_ValueType
			:location "125:3-125:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLTableElts_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagType
			:type String
			:location "133:3-133:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagType
			:type String
			:location "135:3-135:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagType
			:type String
			:location "137:3-137:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagType
			:type WordprocessingMLTableElts_SmartTagsCollection
			:location "130:3-130:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def WordprocessingMLTableElts_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagsCollection
			:type WordprocessingMLTableElts_WordDocument
			:location "142:3-142:68"
			:isContainer false
			:opposite wd_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_SmartTagsCollection
			:type WordprocessingMLTableElts_SmartTagType
			:location "144:3-144:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def WordprocessingMLTableElts_StringProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_StringType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_StringType
			:type String
			:location "158:4-158:27"
		)]
	) ) ( def WordprocessingMLTableElts_WordDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wd_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_SmartTagsCollection
			:location "201:3-201:90"
			:isContainer true
			:opposite st_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_DocumentPropertiesCollection
			:location "202:3-202:103"
			:isContainer true
			:opposite dp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_CustomDocumentPropertiesCollection
			:location "203:3-203:116"
			:isContainer true
			:opposite cdp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "ignoreSubtree"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_StringProperty
			:location "206:3-206:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ignoreElements"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_StringProperty
			:location "208:3-208:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_FontsListElt
			:location "211:3-211:77"
			:isContainer true
			:opposite fle_wordDocument
		) ( struct-map
			KM3_Reference
			:name "lists"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_ListsElt
			:location "213:3-213:72"
			:isContainer true
			:opposite le_wordDocument
		) ( struct-map
			KM3_Reference
			:name "styles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_StylesElt
			:location "215:3-215:74"
			:isContainer true
			:opposite se_wordDocument
		) ( struct-map
			KM3_Reference
			:name "docPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_DocPrElt
			:location "217:3-217:73"
			:isContainer true
			:opposite dpe_wordDocument
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_WordDocument
			:type WordprocessingMLTableElts_BodyElt
			:location "220:3-220:65"
			:isContainer true
			:opposite be_wordDocument
		)]
	) ) ( def WordprocessingMLTableElts_DocPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dpe_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_DocPrElt
			:type WordprocessingMLTableElts_WordDocument
			:location "227:3-227:62"
			:isContainer false
			:opposite docPr
		)]
	) ) ( def WordprocessingMLTableElts_BodyElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "be_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_BodyElt
			:type WordprocessingMLTableElts_WordDocument
			:location "233:3-233:60"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "blockLevelElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLTableElts_BodyElt
			:type WordprocessingMLTableElts_BlockLevelElt
			:location "236:3-236:88"
			:isContainer true
			:opposite ble_bodyElt
		) ( struct-map
			KM3_Reference
			:name "sectPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_BodyElt
			:type WordprocessingMLTableElts_SectPrElt
			:location "239:3-239:70"
			:isContainer true
			:opposite spe_bodyElt
		)]
	) ) ( def WordprocessingMLTableElts_BlockLevelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ble_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_BlockLevelElt
			:type WordprocessingMLTableElts_BodyElt
			:location "244:3-244:61"
			:isContainer false
			:opposite blockLevelElts
		) ( struct-map
			KM3_Reference
			:name "ble_note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_BlockLevelElt
			:type WordprocessingMLTableElts_NoteElt
			:location "245:3-245:60"
			:isContainer false
			:opposite n_blockLevelElts
		) ( struct-map
			KM3_Reference
			:name "ble_tableCellElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_BlockLevelElt
			:type WordprocessingMLTableElts_TableCellElt
			:location "246:3-246:68"
			:isContainer false
			:opposite tce_content
		)]
	) ) ( def WordprocessingMLTableElts_BlockLevelChunkElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[WordprocessingMLTableElts_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_ParaElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_ParaElt
			:type WordprocessingMLTableElts_ParaPrElt
			:location "258:3-258:64"
			:isContainer true
			:opposite ppe_pElt
		) ( struct-map
			KM3_Reference
			:name "pContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLTableElts_ParaElt
			:type WordprocessingMLTableElts_ParaContentElt
			:location "261:3-261:84"
			:isContainer true
			:opposite pce_pElt
		)]
	) ) ( def WordprocessingMLTableElts_ParaPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ppe_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_ParaPrElt
			:type WordprocessingMLTableElts_ParaElt
			:location "266:3-266:47"
			:isContainer false
			:opposite pPr
		)]
	) ) ( def WordprocessingMLTableElts_ParaContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pce_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_ParaContentElt
			:type WordprocessingMLTableElts_ParaElt
			:location "272:3-272:57"
			:isContainer false
			:opposite pContentElts
		)]
	) ) ( def WordprocessingMLTableElts_RunElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ParaContentElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_RunElt
			:type WordprocessingMLTableElts_RunPrElt
			:location "278:3-278:63"
			:isContainer true
			:opposite rpe_rElt
		) ( struct-map
			KM3_Reference
			:name "rContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLTableElts_RunElt
			:type WordprocessingMLTableElts_RunContentElt
			:location "281:3-281:83"
			:isContainer true
			:opposite rce_rElt
		)]
	) ) ( def WordprocessingMLTableElts_RunPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rpe_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RunPrElt
			:type WordprocessingMLTableElts_RunElt
			:location "286:3-286:46"
			:isContainer false
			:opposite rPr
		)]
	) ) ( def WordprocessingMLTableElts_RunContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rce_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RunContentElt
			:type WordprocessingMLTableElts_RunElt
			:location "292:3-292:56"
			:isContainer false
			:opposite rContentElts
		)]
	) ) ( def WordprocessingMLTableElts_BreakElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_BreakElt
			:type BreakType
			:location "298:3-298:35"
		)]
	) ) ( def WordprocessingMLTableElts_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_DelText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_InstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_DelInstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_NoBreakHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_SoftHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_AnnotationRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_FootnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_EndnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_Separator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_ContinuationSeparator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_PgNum ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_Cr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_Footnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_Endnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_NoteElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_NoteElt
			:type NoteValue
			:location "351:3-351:35"
		) ( struct-map
			KM3_Attribute
			:name "suppressRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_NoteElt
			:type OnOffType
			:location "353:3-353:42"
		) ( struct-map
			KM3_Reference
			:name "n_blockLevelElts"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLTableElts_NoteElt
			:type WordprocessingMLTableElts_BlockLevelElt
			:location "349:3-349:89"
			:isContainer true
			:opposite ble_note
		)]
	) ) ( def WordprocessingMLTableElts_Picture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_PictureType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_Symbol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_SymElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_SymElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SymElt
			:type WordprocessingMLTableElts_StringType
			:location "365:3-365:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "char"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SymElt
			:type WordprocessingMLTableElts_StringType
			:location "367:3-367:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLTableElts_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_TabElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_FldChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_RunContentElt WordprocessingMLTableElts_FldCharElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_FldCharElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fldCharType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_FldCharElt
			:type FldCharTypeProperty
			:location "381:3-381:47"
		) ( struct-map
			KM3_Attribute
			:name "fldLock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_FldCharElt
			:type OnOffType
			:location "383:3-383:33"
		) ( struct-map
			KM3_Reference
			:name "fldData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_FldCharElt
			:type WordprocessingMLTableElts_StringType
			:location "379:3-379:49"
			:isContainer true
		)]
	) ) ( def WordprocessingMLTableElts_TableElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tblPr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableElt
			:type WordprocessingMLTableElts_TablePrElt
			:location "394:3-394:64"
			:isContainer true
			:opposite tpe_tblElt
		) ( struct-map
			KM3_Reference
			:name "tblGrid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableElt
			:type WordprocessingMLTableElts_TableGridElt
			:location "396:3-396:68"
			:isContainer true
			:opposite tge_tblElt
		) ( struct-map
			KM3_Reference
			:name "tblContent"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLTableElts_TableElt
			:type WordprocessingMLTableElts_TableContentElt
			:location "398:3-398:87"
			:isContainer true
			:opposite tce_tblElt
		)]
	) ) ( def WordprocessingMLTableElts_TablePrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpe_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TablePrElt
			:type WordprocessingMLTableElts_TableElt
			:location "403:3-403:52"
			:isContainer false
			:opposite tblPr
		)]
	) ) ( def WordprocessingMLTableElts_TableGridElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tge_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableGridElt
			:type WordprocessingMLTableElts_TableElt
			:location "409:3-409:54"
			:isContainer false
			:opposite tblGrid
		)]
	) ) ( def WordprocessingMLTableElts_TableContentElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tce_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableContentElt
			:type WordprocessingMLTableElts_TableElt
			:location "415:3-415:57"
			:isContainer false
			:opposite tblContent
		) ( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLTableElts_TableContentElt
			:type WordprocessingMLTableElts_RowElt
			:location "418:3-418:76"
			:isContainer true
			:opposite re_tblContentElt
		) ( struct-map
			KM3_Reference
			:name "tce_runLevelElts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_TableContentElt
			:type WordprocessingMLTableElts_RunLevelElt
			:location "420:3-420:88"
			:isContainer true
			:opposite rle_tblContentElt
		)]
	) ) ( def WordprocessingMLTableElts_RowElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "re_tblContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RowElt
			:type WordprocessingMLTableElts_TableContentElt
			:location "425:3-425:62"
			:isContainer false
			:opposite tr
		) ( struct-map
			KM3_Reference
			:name "tblPrEx"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_RowElt
			:type WordprocessingMLTableElts_TablePrExElt
			:location "428:3-428:74"
			:isContainer true
			:opposite tpee_rowElt
		) ( struct-map
			KM3_Reference
			:name "trPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_RowElt
			:type WordprocessingMLTableElts_TableRowPrElt
			:location "431:3-431:71"
			:isContainer true
			:opposite tpe_rowElt
		) ( struct-map
			KM3_Reference
			:name "rowContent"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLTableElts_RowElt
			:type WordprocessingMLTableElts_RowContentElt
			:location "434:3-434:85"
			:isContainer true
			:opposite rce_rowElt
		)]
	) ) ( def WordprocessingMLTableElts_TablePrExElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpee_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TablePrExElt
			:type WordprocessingMLTableElts_RowElt
			:location "439:3-439:53"
			:isContainer false
			:opposite tblPrEx
		)]
	) ) ( def WordprocessingMLTableElts_TableRowPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpe_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableRowPrElt
			:type WordprocessingMLTableElts_RowElt
			:location "445:3-445:49"
			:isContainer false
			:opposite trPr
		)]
	) ) ( def WordprocessingMLTableElts_RowContentElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rce_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RowContentElt
			:type WordprocessingMLTableElts_RowElt
			:location "451:3-451:55"
			:isContainer false
			:opposite rowContent
		) ( struct-map
			KM3_Reference
			:name "tc"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLTableElts_RowContentElt
			:type WordprocessingMLTableElts_TableCellElt
			:location "454:3-454:81"
			:isContainer true
			:opposite tce_rowContentElt
		) ( struct-map
			KM3_Reference
			:name "rce_runLevelElts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_RowContentElt
			:type WordprocessingMLTableElts_RunLevelElt
			:location "456:3-456:88"
			:isContainer true
			:opposite rle_rowContentElt
		)]
	) ) ( def WordprocessingMLTableElts_TableCellElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tce_rowContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableCellElt
			:type WordprocessingMLTableElts_RowContentElt
			:location "461:3-461:61"
			:isContainer false
			:opposite tc
		) ( struct-map
			KM3_Reference
			:name "tcPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLTableElts_TableCellElt
			:type WordprocessingMLTableElts_TableCellPrElt
			:location "464:3-464:79"
			:isContainer true
			:opposite tcpe_tableCellElt
		) ( struct-map
			KM3_Reference
			:name "tce_content"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLTableElts_TableCellElt
			:type WordprocessingMLTableElts_BlockLevelElt
			:location "467:3-467:92"
			:isContainer true
			:opposite ble_tableCellElt
		)]
	) ) ( def WordprocessingMLTableElts_TableCellPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tcpe_tableCellElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_TableCellPrElt
			:type WordprocessingMLTableElts_TableCellElt
			:location "472:3-472:62"
			:isContainer false
			:opposite tcPr
		)]
	) ) ( def WordprocessingMLTableElts_FontsListElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fle_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_FontsListElt
			:type WordprocessingMLTableElts_WordDocument
			:location "485:3-485:62"
			:isContainer false
			:opposite fonts
		)]
	) ) ( def WordprocessingMLTableElts_ListsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "le_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_ListsElt
			:type WordprocessingMLTableElts_WordDocument
			:location "490:3-490:61"
			:isContainer false
			:opposite lists
		)]
	) ) ( def WordprocessingMLTableElts_StylesElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "se_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_StylesElt
			:type WordprocessingMLTableElts_WordDocument
			:location "495:3-495:62"
			:isContainer false
			:opposite styles
		)]
	) ) ( def WordprocessingMLTableElts_SectPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "spe_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_SectPrElt
			:type WordprocessingMLTableElts_BodyElt
			:location "500:3-500:53"
			:isContainer false
			:opposite sectPr
		)]
	) ) ( def WordprocessingMLTableElts_RunLevelElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rle_tblContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RunLevelElt
			:type WordprocessingMLTableElts_TableContentElt
			:location "506:3-506:77"
			:isContainer false
			:opposite tce_runLevelElts
		) ( struct-map
			KM3_Reference
			:name "rle_rowContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLTableElts_RunLevelElt
			:type WordprocessingMLTableElts_RowContentElt
			:location "507:3-507:75"
			:isContainer false
			:opposite rce_runLevelElts
		)]
	) ) ( def WordprocessingMLTableElts_CfChunk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_SimpleFieldElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_HLinkElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_SubDocElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLTableElts_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_PictureType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLTableElts_TabElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "545:2-545:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "546:2-546:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "547:2-547:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "548:2-548:18"
	) )]
) )
