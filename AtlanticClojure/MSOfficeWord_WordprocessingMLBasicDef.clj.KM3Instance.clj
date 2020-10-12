( declare WordprocessingMLBasicDef_DateTimeType )
( declare WordprocessingMLBasicDef_VersionType )
( declare WordprocessingMLBasicDef_ValueType )
( declare WordprocessingMLBasicDef_StringValue )
( declare WordprocessingMLBasicDef_FloatValue )
( declare WordprocessingMLBasicDef_DateTimeTypeValue )
( declare WordprocessingMLBasicDef_BooleanValue )
( declare WordprocessingMLBasicDef_DocumentPropertiesCollection )
( declare WordprocessingMLBasicDef_CustomDocumentPropertiesCollection )
( declare WordprocessingMLBasicDef_CustomDocumentProperty )
( declare WordprocessingMLBasicDef_SmartTagType )
( declare WordprocessingMLBasicDef_SmartTagsCollection )
( declare WordprocessingMLBasicDef_StringProperty )
( declare WordprocessingMLBasicDef_StringType )
( declare WordprocessingMLBasicDef_BreakType )
( declare WordprocessingMLBasicDef_NoteValue )
( declare WordprocessingMLBasicDef_OnOffType )
( declare WordprocessingMLBasicDef_FldCharTypeProperty )
( declare WordprocessingMLBasicDef_WordDocument )
( declare WordprocessingMLBasicDef_DocPrElt )
( declare WordprocessingMLBasicDef_BodyElt )
( declare WordprocessingMLBasicDef_BlockLevelElt )
( declare WordprocessingMLBasicDef_BlockLevelChunkElt )
( declare WordprocessingMLBasicDef_ParaElt )
( declare WordprocessingMLBasicDef_ParaPrElt )
( declare WordprocessingMLBasicDef_ParaContentElt )
( declare WordprocessingMLBasicDef_RunElt )
( declare WordprocessingMLBasicDef_RunPrElt )
( declare WordprocessingMLBasicDef_RunContentElt )
( declare WordprocessingMLBasicDef_BreakElt )
( declare WordprocessingMLBasicDef_Text )
( declare WordprocessingMLBasicDef_DelText )
( declare WordprocessingMLBasicDef_InstrText )
( declare WordprocessingMLBasicDef_DelInstrText )
( declare WordprocessingMLBasicDef_NoBreakHyphen )
( declare WordprocessingMLBasicDef_SoftHyphen )
( declare WordprocessingMLBasicDef_AnnotationRef )
( declare WordprocessingMLBasicDef_FootnoteRef )
( declare WordprocessingMLBasicDef_EndnoteRef )
( declare WordprocessingMLBasicDef_Separator )
( declare WordprocessingMLBasicDef_ContinuationSeparator )
( declare WordprocessingMLBasicDef_PgNum )
( declare WordprocessingMLBasicDef_Cr )
( declare WordprocessingMLBasicDef_Footnote )
( declare WordprocessingMLBasicDef_Endnote )
( declare WordprocessingMLBasicDef_NoteElt )
( declare WordprocessingMLBasicDef_Picture )
( declare WordprocessingMLBasicDef_Symbol )
( declare WordprocessingMLBasicDef_SymElt )
( declare WordprocessingMLBasicDef_Tab )
( declare WordprocessingMLBasicDef_FldChar )
( declare WordprocessingMLBasicDef_FldCharElt )
( declare WordprocessingMLBasicDef_FontsListElt )
( declare WordprocessingMLBasicDef_ListsElt )
( declare WordprocessingMLBasicDef_StylesElt )
( declare WordprocessingMLBasicDef_SectPrElt )
( declare WordprocessingMLBasicDef_RunLevelElt )
( declare WordprocessingMLBasicDef_CfChunk )
( declare WordprocessingMLBasicDef_SimpleFieldElt )
( declare WordprocessingMLBasicDef_HLinkElt )
( declare WordprocessingMLBasicDef_SubDocElt )
( declare WordprocessingMLBasicDef_PictureType )
( declare WordprocessingMLBasicDef_TabElt )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def WordprocessingMLBasicDef ( struct-map
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
	)] ) ) ( def WordprocessingMLBasicDef_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def WordprocessingMLBasicDef_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def WordprocessingMLBasicDef_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_StringValue
			:type String
			:location "34:3-34:28"
		)]
	) ) ( def WordprocessingMLBasicDef_FloatValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_FloatValue
			:type Double
			:location "38:3-38:28"
		)]
	) ) ( def WordprocessingMLBasicDef_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DateTimeTypeValue
			:type WordprocessingMLBasicDef_DateTimeType
			:location "42:3-42:34"
			:isContainer false
		)]
	) ) ( def WordprocessingMLBasicDef_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_BooleanValue
			:type Boolean
			:location "46:3-46:29"
		)]
	) ) ( def WordprocessingMLBasicDef_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "60:3-60:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "62:3-62:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "64:3-64:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "66:3-66:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "70:3-70:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "72:3-72:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "74:3-74:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "76:3-76:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "78:3-78:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "80:3-80:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "82:3-82:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "84:3-84:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "86:3-86:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "90:3-90:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "98:3-98:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "100:3-100:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:39"
		) ( struct-map
			KM3_Reference
			:name "dp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type WordprocessingMLBasicDef_WordDocument
			:location "57:3-57:72"
			:isContainer false
			:opposite wd_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type WordprocessingMLBasicDef_VersionType
			:location "88:3-88:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type WordprocessingMLBasicDef_DateTimeType
			:location "92:3-92:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type WordprocessingMLBasicDef_DateTimeType
			:location "94:3-94:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocumentPropertiesCollection
			:type WordprocessingMLBasicDef_DateTimeType
			:location "96:3-96:53"
			:isContainer true
		)]
	) ) ( def WordprocessingMLBasicDef_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_CustomDocumentPropertiesCollection
			:type WordprocessingMLBasicDef_WordDocument
			:location "115:3-115:79"
			:isContainer false
			:opposite wd_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_CustomDocumentPropertiesCollection
			:type WordprocessingMLBasicDef_CustomDocumentProperty
			:location "117:3-117:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def WordprocessingMLBasicDef_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_CustomDocumentProperty
			:type String
			:location "123:3-123:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_CustomDocumentProperty
			:type WordprocessingMLBasicDef_CustomDocumentPropertiesCollection
			:location "122:3-122:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_CustomDocumentProperty
			:type WordprocessingMLBasicDef_ValueType
			:location "125:3-125:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLBasicDef_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagType
			:type String
			:location "133:3-133:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagType
			:type String
			:location "135:3-135:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagType
			:type String
			:location "137:3-137:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagType
			:type WordprocessingMLBasicDef_SmartTagsCollection
			:location "130:3-130:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def WordprocessingMLBasicDef_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagsCollection
			:type WordprocessingMLBasicDef_WordDocument
			:location "142:3-142:68"
			:isContainer false
			:opposite wd_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_SmartTagsCollection
			:type WordprocessingMLBasicDef_SmartTagType
			:location "144:3-144:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def WordprocessingMLBasicDef_StringProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_StringType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_StringType
			:type String
			:location "158:4-158:27"
		)]
	) ) ( def WordprocessingMLBasicDef_WordDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wd_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_SmartTagsCollection
			:location "201:3-201:90"
			:isContainer true
			:opposite st_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_DocumentPropertiesCollection
			:location "202:3-202:103"
			:isContainer true
			:opposite dp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_CustomDocumentPropertiesCollection
			:location "203:3-203:116"
			:isContainer true
			:opposite cdp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "ignoreSubtree"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_StringProperty
			:location "206:3-206:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ignoreElements"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_StringProperty
			:location "208:3-208:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_FontsListElt
			:location "211:3-211:77"
			:isContainer true
			:opposite fle_wordDocument
		) ( struct-map
			KM3_Reference
			:name "lists"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_ListsElt
			:location "213:3-213:72"
			:isContainer true
			:opposite le_wordDocument
		) ( struct-map
			KM3_Reference
			:name "styles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_StylesElt
			:location "215:3-215:74"
			:isContainer true
			:opposite se_wordDocument
		) ( struct-map
			KM3_Reference
			:name "docPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_DocPrElt
			:location "217:3-217:73"
			:isContainer true
			:opposite dpe_wordDocument
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_BodyElt
			:location "220:3-220:65"
			:isContainer true
			:opposite be_wordDocument
		)]
	) ) ( def WordprocessingMLBasicDef_DocPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dpe_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_DocPrElt
			:type WordprocessingMLBasicDef_WordDocument
			:location "227:3-227:62"
			:isContainer false
			:opposite docPr
		)]
	) ) ( def WordprocessingMLBasicDef_BodyElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "be_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_BodyElt
			:type WordprocessingMLBasicDef_WordDocument
			:location "233:3-233:60"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "blockLevelElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLBasicDef_BodyElt
			:type WordprocessingMLBasicDef_BlockLevelElt
			:location "236:3-236:88"
			:isContainer true
			:opposite ble_bodyElt
		) ( struct-map
			KM3_Reference
			:name "sectPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_BodyElt
			:type WordprocessingMLBasicDef_SectPrElt
			:location "239:3-239:70"
			:isContainer true
			:opposite spe_bodyElt
		)]
	) ) ( def WordprocessingMLBasicDef_BlockLevelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ble_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_BlockLevelElt
			:type WordprocessingMLBasicDef_BodyElt
			:location "244:3-244:61"
			:isContainer false
			:opposite blockLevelElts
		) ( struct-map
			KM3_Reference
			:name "ble_note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_BlockLevelElt
			:type WordprocessingMLBasicDef_NoteElt
			:location "245:3-245:60"
			:isContainer false
			:opposite n_blockLevelElts
		)]
	) ) ( def WordprocessingMLBasicDef_BlockLevelChunkElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[WordprocessingMLBasicDef_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_ParaElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_ParaElt
			:type WordprocessingMLBasicDef_ParaPrElt
			:location "257:3-257:64"
			:isContainer true
			:opposite ppe_pElt
		) ( struct-map
			KM3_Reference
			:name "pContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLBasicDef_ParaElt
			:type WordprocessingMLBasicDef_ParaContentElt
			:location "260:3-260:84"
			:isContainer true
			:opposite pce_pElt
		)]
	) ) ( def WordprocessingMLBasicDef_ParaPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ppe_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_ParaPrElt
			:type WordprocessingMLBasicDef_ParaElt
			:location "265:3-265:47"
			:isContainer false
			:opposite pPr
		)]
	) ) ( def WordprocessingMLBasicDef_ParaContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pce_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_ParaContentElt
			:type WordprocessingMLBasicDef_ParaElt
			:location "271:3-271:57"
			:isContainer false
			:opposite pContentElts
		)]
	) ) ( def WordprocessingMLBasicDef_RunElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ParaContentElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_RunElt
			:type WordprocessingMLBasicDef_RunPrElt
			:location "277:3-277:63"
			:isContainer true
			:opposite rpe_rElt
		) ( struct-map
			KM3_Reference
			:name "rContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLBasicDef_RunElt
			:type WordprocessingMLBasicDef_RunContentElt
			:location "280:3-280:83"
			:isContainer true
			:opposite rce_rElt
		)]
	) ) ( def WordprocessingMLBasicDef_RunPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rpe_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_RunPrElt
			:type WordprocessingMLBasicDef_RunElt
			:location "285:3-285:46"
			:isContainer false
			:opposite rPr
		)]
	) ) ( def WordprocessingMLBasicDef_RunContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rce_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_RunContentElt
			:type WordprocessingMLBasicDef_RunElt
			:location "291:3-291:56"
			:isContainer false
			:opposite rContentElts
		)]
	) ) ( def WordprocessingMLBasicDef_BreakElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_BreakElt
			:type BreakType
			:location "297:3-297:35"
		)]
	) ) ( def WordprocessingMLBasicDef_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_DelText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_InstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_DelInstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_NoBreakHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_SoftHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_AnnotationRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_FootnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_EndnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_Separator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_ContinuationSeparator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_PgNum ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_Cr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_Footnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_Endnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_NoteElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_NoteElt
			:type NoteValue
			:location "350:3-350:35"
		) ( struct-map
			KM3_Attribute
			:name "suppressRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_NoteElt
			:type OnOffType
			:location "352:3-352:42"
		) ( struct-map
			KM3_Reference
			:name "n_blockLevelElts"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLBasicDef_NoteElt
			:type WordprocessingMLBasicDef_BlockLevelElt
			:location "348:3-348:89"
			:isContainer true
			:opposite ble_note
		)]
	) ) ( def WordprocessingMLBasicDef_Picture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_PictureType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_Symbol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_SymElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_SymElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SymElt
			:type WordprocessingMLBasicDef_StringType
			:location "364:3-364:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "char"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SymElt
			:type WordprocessingMLBasicDef_StringType
			:location "366:3-366:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLBasicDef_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_TabElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_FldChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt WordprocessingMLBasicDef_FldCharElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_FldCharElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fldCharType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_FldCharElt
			:type FldCharTypeProperty
			:location "380:3-380:47"
		) ( struct-map
			KM3_Attribute
			:name "fldLock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_FldCharElt
			:type OnOffType
			:location "382:3-382:33"
		) ( struct-map
			KM3_Reference
			:name "fldData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_FldCharElt
			:type WordprocessingMLBasicDef_StringType
			:location "378:3-378:49"
			:isContainer true
		)]
	) ) ( def WordprocessingMLBasicDef_FontsListElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fle_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_FontsListElt
			:type WordprocessingMLBasicDef_WordDocument
			:location "394:3-394:62"
			:isContainer false
			:opposite fonts
		)]
	) ) ( def WordprocessingMLBasicDef_ListsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "le_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_ListsElt
			:type WordprocessingMLBasicDef_WordDocument
			:location "399:3-399:61"
			:isContainer false
			:opposite lists
		)]
	) ) ( def WordprocessingMLBasicDef_StylesElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "se_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_StylesElt
			:type WordprocessingMLBasicDef_WordDocument
			:location "404:3-404:62"
			:isContainer false
			:opposite styles
		)]
	) ) ( def WordprocessingMLBasicDef_SectPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "spe_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SectPrElt
			:type WordprocessingMLBasicDef_BodyElt
			:location "409:3-409:53"
			:isContainer false
			:opposite sectPr
		)]
	) ) ( def WordprocessingMLBasicDef_RunLevelElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_BlockLevelChunkElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_CfChunk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_SimpleFieldElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_HLinkElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_SubDocElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_PictureType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLBasicDef_TabElt ( struct-map
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
		:location "451:2-451:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "452:2-452:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "453:2-453:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "454:2-454:18"
	) )]
) )
