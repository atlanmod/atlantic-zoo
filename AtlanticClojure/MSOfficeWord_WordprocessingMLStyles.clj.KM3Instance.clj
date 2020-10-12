( declare WordprocessingMLStyles_DateTimeType )
( declare WordprocessingMLStyles_VersionType )
( declare WordprocessingMLStyles_ValueType )
( declare WordprocessingMLStyles_StringValue )
( declare WordprocessingMLStyles_FloatValue )
( declare WordprocessingMLStyles_DateTimeTypeValue )
( declare WordprocessingMLStyles_BooleanValue )
( declare WordprocessingMLStyles_DocumentPropertiesCollection )
( declare WordprocessingMLStyles_CustomDocumentPropertiesCollection )
( declare WordprocessingMLStyles_CustomDocumentProperty )
( declare WordprocessingMLStyles_SmartTagType )
( declare WordprocessingMLStyles_SmartTagsCollection )
( declare WordprocessingMLStyles_StringProperty )
( declare WordprocessingMLStyles_StringType )
( declare WordprocessingMLStyles_BreakType )
( declare WordprocessingMLStyles_NoteValue )
( declare WordprocessingMLStyles_OnOffType )
( declare WordprocessingMLStyles_FldCharTypeProperty )
( declare WordprocessingMLStyles_HintType )
( declare WordprocessingMLStyles_StyleKindValue )
( declare WordprocessingMLStyles_UnderlineProperty )
( declare WordprocessingMLStyles_UnderlineValues )
( declare WordprocessingMLStyles_HighlightColorValues )
( declare WordprocessingMLStyles_VerticalAlignRunType )
( declare WordprocessingMLStyles_JustificationValue )
( declare WordprocessingMLStyles_WordDocument )
( declare WordprocessingMLStyles_DocPrElt )
( declare WordprocessingMLStyles_BodyElt )
( declare WordprocessingMLStyles_BlockLevelElt )
( declare WordprocessingMLStyles_BlockLevelChunkElt )
( declare WordprocessingMLStyles_ParaElt )
( declare WordprocessingMLStyles_ParaPrElt )
( declare WordprocessingMLStyles_ParaContentElt )
( declare WordprocessingMLStyles_RunElt )
( declare WordprocessingMLStyles_RunPrElt )
( declare WordprocessingMLStyles_LangElt )
( declare WordprocessingMLStyles_RunContentElt )
( declare WordprocessingMLStyles_BreakElt )
( declare WordprocessingMLStyles_Text )
( declare WordprocessingMLStyles_DelText )
( declare WordprocessingMLStyles_InstrText )
( declare WordprocessingMLStyles_DelInstrText )
( declare WordprocessingMLStyles_NoBreakHyphen )
( declare WordprocessingMLStyles_SoftHyphen )
( declare WordprocessingMLStyles_AnnotationRef )
( declare WordprocessingMLStyles_FootnoteRef )
( declare WordprocessingMLStyles_EndnoteRef )
( declare WordprocessingMLStyles_Separator )
( declare WordprocessingMLStyles_ContinuationSeparator )
( declare WordprocessingMLStyles_PgNum )
( declare WordprocessingMLStyles_Cr )
( declare WordprocessingMLStyles_Footnote )
( declare WordprocessingMLStyles_Endnote )
( declare WordprocessingMLStyles_NoteElt )
( declare WordprocessingMLStyles_Picture )
( declare WordprocessingMLStyles_Symbol )
( declare WordprocessingMLStyles_SymElt )
( declare WordprocessingMLStyles_Tab )
( declare WordprocessingMLStyles_FldChar )
( declare WordprocessingMLStyles_FldCharElt )
( declare WordprocessingMLStyles_TableElt )
( declare WordprocessingMLStyles_TablePrElt )
( declare WordprocessingMLStyles_TableGridElt )
( declare WordprocessingMLStyles_TableContentElt )
( declare WordprocessingMLStyles_RowElt )
( declare WordprocessingMLStyles_TablePrExElt )
( declare WordprocessingMLStyles_TableRowPrElt )
( declare WordprocessingMLStyles_RowContentElt )
( declare WordprocessingMLStyles_TableCellElt )
( declare WordprocessingMLStyles_TableCellPrElt )
( declare WordprocessingMLStyles_FontsListElt )
( declare WordprocessingMLStyles_FontsElt )
( declare WordprocessingMLStyles_FontElt )
( declare WordprocessingMLStyles_StylesElt )
( declare WordprocessingMLStyles_StyleElt )
( declare WordprocessingMLStyles_ListsElt )
( declare WordprocessingMLStyles_SectPrElt )
( declare WordprocessingMLStyles_RunLevelElt )
( declare WordprocessingMLStyles_CfChunk )
( declare WordprocessingMLStyles_SimpleFieldElt )
( declare WordprocessingMLStyles_HLinkElt )
( declare WordprocessingMLStyles_SubDocElt )
( declare WordprocessingMLStyles_PictureType )
( declare WordprocessingMLStyles_TabElt )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def WordprocessingMLStyles ( struct-map
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
	)] ) ) ( def HintType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ht_default"
		:location "195:4-195:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ht_fareast"
		:location "196:4-196:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ht_cs"
		:location "197:4-197:18"
	)] ) ) ( def StyleKindValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "skv_paragraph"
		:location "202:4-202:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "skv_character"
		:location "203:4-203:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "skv_table"
		:location "204:4-204:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "skv_list"
		:location "205:4-205:21"
	)] ) ) ( def UnderlineValues ( :literals[( struct-map
		KM3_EnumLiteral
		:name "uv_single"
		:location "218:4-218:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_words"
		:location "219:4-219:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_double"
		:location "220:4-220:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_thick"
		:location "221:4-221:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dotted"
		:location "222:4-222:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dotted_heavy"
		:location "223:4-223:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dash"
		:location "224:4-224:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dashed_heavy"
		:location "225:4-225:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dash_long"
		:location "226:4-226:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dash_long_heavy"
		:location "227:4-227:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dot_dash"
		:location "228:4-228:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dash_dot_heavy"
		:location "229:4-229:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dot_dot_dash"
		:location "230:4-230:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_dash_dot_dot_heavy"
		:location "231:4-231:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_wave"
		:location "232:4-232:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_wavy_heavy"
		:location "233:4-233:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_wavy_double"
		:location "234:4-234:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "uv_none"
		:location "235:4-235:20"
	)] ) ) ( def HighlightColorValues ( :literals[( struct-map
		KM3_EnumLiteral
		:name "hcv_black"
		:location "240:4-240:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_blue"
		:location "241:4-241:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_cyan"
		:location "242:4-242:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_green"
		:location "243:4-243:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_magenta"
		:location "244:4-244:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_red"
		:location "245:4-245:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_yellow"
		:location "246:4-246:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_white"
		:location "247:4-247:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_blue"
		:location "248:4-248:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_cyan"
		:location "249:4-249:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_green"
		:location "250:4-250:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_magenta"
		:location "251:4-251:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_red"
		:location "252:4-252:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_yellow"
		:location "253:4-253:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_dark_gray"
		:location "254:4-254:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_light_gray"
		:location "255:4-255:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "hcv_none"
		:location "256:4-256:21"
	)] ) ) ( def VerticalAlignRunType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vart_baseline"
		:location "262:4-262:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "vart_superscript"
		:location "264:4-264:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "vart_subscript"
		:location "266:4-266:27"
	)] ) ) ( def JustificationValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "jv_left"
		:location "271:4-271:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "jv_center"
		:location "272:4-272:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "jv_right"
		:location "273:4-273:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "jv_both"
		:location "275:4-275:20"
	)] ) ) ( def WordprocessingMLStyles_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def WordprocessingMLStyles_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def WordprocessingMLStyles_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_StringValue
			:type String
			:location "34:3-34:28"
		)]
	) ) ( def WordprocessingMLStyles_FloatValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FloatValue
			:type Double
			:location "38:3-38:28"
		)]
	) ) ( def WordprocessingMLStyles_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DateTimeTypeValue
			:type WordprocessingMLStyles_DateTimeType
			:location "42:3-42:34"
			:isContainer false
		)]
	) ) ( def WordprocessingMLStyles_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_BooleanValue
			:type Boolean
			:location "46:3-46:29"
		)]
	) ) ( def WordprocessingMLStyles_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "60:3-60:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "62:3-62:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "64:3-64:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "66:3-66:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "70:3-70:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "72:3-72:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "74:3-74:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "76:3-76:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "78:3-78:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "80:3-80:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "82:3-82:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "84:3-84:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type String
			:location "86:3-86:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "90:3-90:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "98:3-98:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "100:3-100:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:39"
		) ( struct-map
			KM3_Reference
			:name "dp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type WordprocessingMLStyles_WordDocument
			:location "57:3-57:72"
			:isContainer false
			:opposite wd_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type WordprocessingMLStyles_VersionType
			:location "88:3-88:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type WordprocessingMLStyles_DateTimeType
			:location "92:3-92:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type WordprocessingMLStyles_DateTimeType
			:location "94:3-94:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_DocumentPropertiesCollection
			:type WordprocessingMLStyles_DateTimeType
			:location "96:3-96:53"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_CustomDocumentPropertiesCollection
			:type WordprocessingMLStyles_WordDocument
			:location "115:3-115:79"
			:isContainer false
			:opposite wd_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_CustomDocumentPropertiesCollection
			:type WordprocessingMLStyles_CustomDocumentProperty
			:location "117:3-117:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def WordprocessingMLStyles_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_CustomDocumentProperty
			:type String
			:location "123:3-123:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_CustomDocumentProperty
			:type WordprocessingMLStyles_CustomDocumentPropertiesCollection
			:location "122:3-122:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_CustomDocumentProperty
			:type WordprocessingMLStyles_ValueType
			:location "125:3-125:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagType
			:type String
			:location "133:3-133:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagType
			:type String
			:location "135:3-135:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagType
			:type String
			:location "137:3-137:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagType
			:type WordprocessingMLStyles_SmartTagsCollection
			:location "130:3-130:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def WordprocessingMLStyles_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagsCollection
			:type WordprocessingMLStyles_WordDocument
			:location "142:3-142:68"
			:isContainer false
			:opposite wd_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_SmartTagsCollection
			:type WordprocessingMLStyles_SmartTagType
			:location "144:3-144:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def WordprocessingMLStyles_StringProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_StringType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_StringType
			:type String
			:location "158:4-158:27"
		)]
	) ) ( def WordprocessingMLStyles_UnderlineProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_UnderlineProperty
			:type UnderlineValues
			:location "211:4-211:41"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_UnderlineProperty
			:type String
			:location "213:4-213:34"
		)]
	) ) ( def WordprocessingMLStyles_WordDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wd_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_SmartTagsCollection
			:location "286:3-286:90"
			:isContainer true
			:opposite st_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_DocumentPropertiesCollection
			:location "287:3-287:103"
			:isContainer true
			:opposite dp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "wd_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_CustomDocumentPropertiesCollection
			:location "288:3-288:116"
			:isContainer true
			:opposite cdp_wordDocument
		) ( struct-map
			KM3_Reference
			:name "ignoreSubtree"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_StringProperty
			:location "291:3-291:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ignoreElements"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_StringProperty
			:location "293:3-293:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_FontsListElt
			:location "296:3-296:77"
			:isContainer true
			:opposite fle_wordDocument
		) ( struct-map
			KM3_Reference
			:name "lists"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_ListsElt
			:location "298:3-298:72"
			:isContainer true
			:opposite le_wordDocument
		) ( struct-map
			KM3_Reference
			:name "styles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_StylesElt
			:location "300:3-300:74"
			:isContainer true
			:opposite se_wordDocument
		) ( struct-map
			KM3_Reference
			:name "docPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_DocPrElt
			:location "302:3-302:73"
			:isContainer true
			:opposite dpe_wordDocument
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_WordDocument
			:type WordprocessingMLStyles_BodyElt
			:location "305:3-305:65"
			:isContainer true
			:opposite be_wordDocument
		)]
	) ) ( def WordprocessingMLStyles_DocPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dpe_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_DocPrElt
			:type WordprocessingMLStyles_WordDocument
			:location "312:3-312:62"
			:isContainer false
			:opposite docPr
		)]
	) ) ( def WordprocessingMLStyles_BodyElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "be_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_BodyElt
			:type WordprocessingMLStyles_WordDocument
			:location "318:3-318:60"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "blockLevelElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_BodyElt
			:type WordprocessingMLStyles_BlockLevelElt
			:location "321:3-321:88"
			:isContainer true
			:opposite ble_bodyElt
		) ( struct-map
			KM3_Reference
			:name "sectPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_BodyElt
			:type WordprocessingMLStyles_SectPrElt
			:location "324:3-324:70"
			:isContainer true
			:opposite spe_bodyElt
		)]
	) ) ( def WordprocessingMLStyles_BlockLevelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ble_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_BlockLevelElt
			:type WordprocessingMLStyles_BodyElt
			:location "329:3-329:61"
			:isContainer false
			:opposite blockLevelElts
		) ( struct-map
			KM3_Reference
			:name "ble_note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_BlockLevelElt
			:type WordprocessingMLStyles_NoteElt
			:location "330:3-330:60"
			:isContainer false
			:opposite n_blockLevelElts
		) ( struct-map
			KM3_Reference
			:name "ble_tableCellElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_BlockLevelElt
			:type WordprocessingMLStyles_TableCellElt
			:location "331:3-331:68"
			:isContainer false
			:opposite tce_content
		)]
	) ) ( def WordprocessingMLStyles_BlockLevelChunkElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[WordprocessingMLStyles_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_ParaElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaElt
			:type WordprocessingMLStyles_ParaPrElt
			:location "343:3-343:64"
			:isContainer true
			:opposite ppe_pElt
		) ( struct-map
			KM3_Reference
			:name "pContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_ParaElt
			:type WordprocessingMLStyles_ParaContentElt
			:location "346:3-346:84"
			:isContainer true
			:opposite pce_pElt
		)]
	) ) ( def WordprocessingMLStyles_ParaPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "keepNext"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "357:3-357:39"
		) ( struct-map
			KM3_Attribute
			:name "keepLines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "359:3-359:40"
		) ( struct-map
			KM3_Attribute
			:name "pageBreakBefore"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "361:3-361:46"
		) ( struct-map
			KM3_Attribute
			:name "supressLineNumbers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "363:3-363:49"
		) ( struct-map
			KM3_Attribute
			:name "suppressAutoHyphens"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "365:3-365:50"
		) ( struct-map
			KM3_Attribute
			:name "contextualSpacing"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "367:3-367:48"
		) ( struct-map
			KM3_Attribute
			:name "bidi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type OnOffType
			:location "369:3-369:35"
		) ( struct-map
			KM3_Attribute
			:name "justification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type JustificationValue
			:location "371:3-371:53"
		) ( struct-map
			KM3_Reference
			:name "ppe_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type WordprocessingMLStyles_ParaElt
			:location "351:3-351:47"
			:isContainer false
			:opposite pPr
		) ( struct-map
			KM3_Reference
			:name "ppe_styleElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type WordprocessingMLStyles_StyleElt
			:location "352:3-352:55"
			:isContainer false
			:opposite se_pPr
		) ( struct-map
			KM3_Reference
			:name "pStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_ParaPrElt
			:type WordprocessingMLStyles_StringProperty
			:location "355:3-355:52"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_ParaContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pce_pElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_ParaContentElt
			:type WordprocessingMLStyles_ParaElt
			:location "378:3-378:57"
			:isContainer false
			:opposite pContentElts
		)]
	) ) ( def WordprocessingMLStyles_RunElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ParaContentElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunElt
			:type WordprocessingMLStyles_RunPrElt
			:location "384:3-384:63"
			:isContainer true
			:opposite rpe_rElt
		) ( struct-map
			KM3_Reference
			:name "rContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_RunElt
			:type WordprocessingMLStyles_RunContentElt
			:location "387:3-387:83"
			:isContainer true
			:opposite rce_rElt
		)]
	) ) ( def WordprocessingMLStyles_RunPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bold"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "400:3-400:35"
		) ( struct-map
			KM3_Attribute
			:name "bold_cs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "402:3-402:38"
		) ( struct-map
			KM3_Attribute
			:name "italic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "404:3-404:37"
		) ( struct-map
			KM3_Attribute
			:name "italic_cs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "406:3-406:40"
		) ( struct-map
			KM3_Attribute
			:name "capitals"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "408:3-408:39"
		) ( struct-map
			KM3_Attribute
			:name "smallCapitals"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "410:3-410:44"
		) ( struct-map
			KM3_Attribute
			:name "strike"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "412:3-412:37"
		) ( struct-map
			KM3_Attribute
			:name "doubleStrike"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "414:3-414:43"
		) ( struct-map
			KM3_Attribute
			:name "outline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "416:3-416:38"
		) ( struct-map
			KM3_Attribute
			:name "shadow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "418:3-418:37"
		) ( struct-map
			KM3_Attribute
			:name "emboss"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "420:3-420:37"
		) ( struct-map
			KM3_Attribute
			:name "imprint"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "422:3-422:38"
		) ( struct-map
			KM3_Attribute
			:name "noProof"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "424:3-424:38"
		) ( struct-map
			KM3_Attribute
			:name "vanish"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "426:3-426:37"
		) ( struct-map
			KM3_Attribute
			:name "specVanish"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "428:3-428:41"
		) ( struct-map
			KM3_Attribute
			:name "rtl"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "430:3-430:34"
		) ( struct-map
			KM3_Attribute
			:name "cs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type OnOffType
			:location "432:3-432:33"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type String
			:location "436:3-436:33"
		) ( struct-map
			KM3_Attribute
			:name "highlight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type HighlightColorValues
			:location "438:3-438:51"
		) ( struct-map
			KM3_Attribute
			:name "verticalAlign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type VerticalAlignRunType
			:location "440:3-440:55"
		) ( struct-map
			KM3_Reference
			:name "rpe_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_RunElt
			:location "392:3-392:46"
			:isContainer false
			:opposite rPr
		) ( struct-map
			KM3_Reference
			:name "rpe_styleElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_StyleElt
			:location "393:3-393:55"
			:isContainer false
			:opposite se_rPr
		) ( struct-map
			KM3_Reference
			:name "rStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_StringProperty
			:location "396:3-396:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rFonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_FontsElt
			:location "398:3-398:70"
			:isContainer true
			:opposite fse_runPrElt
		) ( struct-map
			KM3_Reference
			:name "underline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_UnderlineProperty
			:location "434:3-434:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RunPrElt
			:type WordprocessingMLStyles_LangElt
			:location "442:3-442:60"
			:isContainer false
			:opposite le_runPrElt
		)]
	) ) ( def WordprocessingMLStyles_LangElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_LangElt
			:type String
			:location "453:3-453:31"
		) ( struct-map
			KM3_Attribute
			:name "bidi"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_LangElt
			:type String
			:location "455:3-455:32"
		) ( struct-map
			KM3_Reference
			:name "le_runPrElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_LangElt
			:type WordprocessingMLStyles_RunPrElt
			:location "449:3-449:56"
			:isContainer false
			:opposite language
		)]
	) ) ( def WordprocessingMLStyles_RunContentElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rce_rElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RunContentElt
			:type WordprocessingMLStyles_RunElt
			:location "460:3-460:56"
			:isContainer false
			:opposite rContentElts
		)]
	) ) ( def WordprocessingMLStyles_BreakElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_BreakElt
			:type BreakType
			:location "466:3-466:35"
		)]
	) ) ( def WordprocessingMLStyles_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_DelText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_InstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_DelInstrText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_StringType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_NoBreakHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_SoftHyphen ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_AnnotationRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_FootnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_EndnoteRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_Separator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_ContinuationSeparator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_PgNum ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_Cr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_Footnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_Endnote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_NoteElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_NoteElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_NoteElt
			:type NoteValue
			:location "519:3-519:35"
		) ( struct-map
			KM3_Attribute
			:name "suppressRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_NoteElt
			:type OnOffType
			:location "521:3-521:42"
		) ( struct-map
			KM3_Reference
			:name "n_blockLevelElts"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLStyles_NoteElt
			:type WordprocessingMLStyles_BlockLevelElt
			:location "517:3-517:89"
			:isContainer true
			:opposite ble_note
		)]
	) ) ( def WordprocessingMLStyles_Picture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_PictureType]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_Symbol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_SymElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_SymElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SymElt
			:type WordprocessingMLStyles_StringType
			:location "533:3-533:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "char"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SymElt
			:type WordprocessingMLStyles_StringType
			:location "535:3-535:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_TabElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_FldChar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_RunContentElt WordprocessingMLStyles_FldCharElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_FldCharElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fldCharType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FldCharElt
			:type FldCharTypeProperty
			:location "549:3-549:47"
		) ( struct-map
			KM3_Attribute
			:name "fldLock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FldCharElt
			:type OnOffType
			:location "551:3-551:33"
		) ( struct-map
			KM3_Reference
			:name "fldData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_FldCharElt
			:type WordprocessingMLStyles_StringType
			:location "547:3-547:49"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_TableElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tblPr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableElt
			:type WordprocessingMLStyles_TablePrElt
			:location "562:3-562:64"
			:isContainer true
			:opposite tpe_tblElt
		) ( struct-map
			KM3_Reference
			:name "tblGrid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableElt
			:type WordprocessingMLStyles_TableGridElt
			:location "564:3-564:68"
			:isContainer true
			:opposite tge_tblElt
		) ( struct-map
			KM3_Reference
			:name "tblContent"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLStyles_TableElt
			:type WordprocessingMLStyles_TableContentElt
			:location "566:3-566:87"
			:isContainer true
			:opposite tce_tblElt
		)]
	) ) ( def WordprocessingMLStyles_TablePrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpe_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TablePrElt
			:type WordprocessingMLStyles_TableElt
			:location "571:3-571:52"
			:isContainer false
			:opposite tblPr
		) ( struct-map
			KM3_Reference
			:name "tpe_styleElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TablePrElt
			:type WordprocessingMLStyles_StyleElt
			:location "572:3-572:57"
			:isContainer false
			:opposite se_tblPr
		)]
	) ) ( def WordprocessingMLStyles_TableGridElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tge_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableGridElt
			:type WordprocessingMLStyles_TableElt
			:location "578:3-578:54"
			:isContainer false
			:opposite tblGrid
		)]
	) ) ( def WordprocessingMLStyles_TableContentElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tce_tblElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableContentElt
			:type WordprocessingMLStyles_TableElt
			:location "584:3-584:57"
			:isContainer false
			:opposite tblContent
		) ( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_TableContentElt
			:type WordprocessingMLStyles_RowElt
			:location "587:3-587:76"
			:isContainer true
			:opposite re_tblContentElt
		) ( struct-map
			KM3_Reference
			:name "tce_runLevelElts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_TableContentElt
			:type WordprocessingMLStyles_RunLevelElt
			:location "589:3-589:88"
			:isContainer true
			:opposite rle_tblContentElt
		)]
	) ) ( def WordprocessingMLStyles_RowElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "re_tblContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RowElt
			:type WordprocessingMLStyles_TableContentElt
			:location "594:3-594:62"
			:isContainer false
			:opposite tr
		) ( struct-map
			KM3_Reference
			:name "tblPrEx"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RowElt
			:type WordprocessingMLStyles_TablePrExElt
			:location "597:3-597:74"
			:isContainer true
			:opposite tpee_rowElt
		) ( struct-map
			KM3_Reference
			:name "trPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RowElt
			:type WordprocessingMLStyles_TableRowPrElt
			:location "600:3-600:71"
			:isContainer true
			:opposite tpe_rowElt
		) ( struct-map
			KM3_Reference
			:name "rowContent"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLStyles_RowElt
			:type WordprocessingMLStyles_RowContentElt
			:location "603:3-603:85"
			:isContainer true
			:opposite rce_rowElt
		)]
	) ) ( def WordprocessingMLStyles_TablePrExElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpee_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TablePrExElt
			:type WordprocessingMLStyles_RowElt
			:location "608:3-608:53"
			:isContainer false
			:opposite tblPrEx
		)]
	) ) ( def WordprocessingMLStyles_TableRowPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tpe_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableRowPrElt
			:type WordprocessingMLStyles_RowElt
			:location "614:3-614:49"
			:isContainer false
			:opposite trPr
		) ( struct-map
			KM3_Reference
			:name "trpe_styleElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableRowPrElt
			:type WordprocessingMLStyles_StyleElt
			:location "615:3-615:57"
			:isContainer false
			:opposite se_trPr
		)]
	) ) ( def WordprocessingMLStyles_RowContentElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rce_rowElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RowContentElt
			:type WordprocessingMLStyles_RowElt
			:location "621:3-621:55"
			:isContainer false
			:opposite rowContent
		) ( struct-map
			KM3_Reference
			:name "tc"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_RowContentElt
			:type WordprocessingMLStyles_TableCellElt
			:location "624:3-624:81"
			:isContainer true
			:opposite tce_rowContentElt
		) ( struct-map
			KM3_Reference
			:name "rce_runLevelElts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_RowContentElt
			:type WordprocessingMLStyles_RunLevelElt
			:location "626:3-626:88"
			:isContainer true
			:opposite rle_rowContentElt
		)]
	) ) ( def WordprocessingMLStyles_TableCellElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tce_rowContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableCellElt
			:type WordprocessingMLStyles_RowContentElt
			:location "631:3-631:61"
			:isContainer false
			:opposite tc
		) ( struct-map
			KM3_Reference
			:name "tcPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_TableCellElt
			:type WordprocessingMLStyles_TableCellPrElt
			:location "634:3-634:79"
			:isContainer true
			:opposite tcpe_tableCellElt
		) ( struct-map
			KM3_Reference
			:name "tce_content"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLStyles_TableCellElt
			:type WordprocessingMLStyles_BlockLevelElt
			:location "637:3-637:92"
			:isContainer true
			:opposite ble_tableCellElt
		)]
	) ) ( def WordprocessingMLStyles_TableCellPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tcpe_tableCellElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableCellPrElt
			:type WordprocessingMLStyles_TableCellElt
			:location "642:3-642:62"
			:isContainer false
			:opposite tcPr
		) ( struct-map
			KM3_Reference
			:name "tcpe_styleElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_TableCellPrElt
			:type WordprocessingMLStyles_StyleElt
			:location "643:3-643:57"
			:isContainer false
			:opposite se_tcPr
		)]
	) ) ( def WordprocessingMLStyles_FontsListElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fle_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsListElt
			:type WordprocessingMLStyles_WordDocument
			:location "658:3-658:62"
			:isContainer false
			:opposite fonts
		) ( struct-map
			KM3_Reference
			:name "defaultFonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_FontsListElt
			:type WordprocessingMLStyles_FontsElt
			:location "661:3-661:80"
			:isContainer true
			:opposite fse_fontsListElt
		) ( struct-map
			KM3_Reference
			:name "fonts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLStyles_FontsListElt
			:type WordprocessingMLStyles_FontElt
			:location "663:3-663:77"
			:isContainer true
			:opposite fe_fontsListElt
		)]
	) ) ( def WordprocessingMLStyles_FontsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type HintType
			:location "672:3-672:29"
		) ( struct-map
			KM3_Reference
			:name "fse_fontsListElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_FontsListElt
			:location "668:3-668:69"
			:isContainer false
			:opposite defaultFonts
		) ( struct-map
			KM3_Reference
			:name "fse_runPrElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_RunPrElt
			:location "669:3-669:55"
			:isContainer false
			:opposite rFonts
		) ( struct-map
			KM3_Reference
			:name "ascii"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_StringType
			:location "674:3-674:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "h_ansi"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_StringType
			:location "676:3-676:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fareast"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_StringType
			:location "678:3-678:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontsElt
			:type WordprocessingMLStyles_StringType
			:location "680:3-680:39"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_FontElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fe_fontsListElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontElt
			:type WordprocessingMLStyles_FontsListElt
			:location "685:3-685:61"
			:isContainer false
			:opposite fonts
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_FontElt
			:type WordprocessingMLStyles_StringType
			:location "688:3-688:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "altName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_FontElt
			:type WordprocessingMLStyles_StringProperty
			:location "690:3-690:53"
			:isContainer true
		)]
	) ) ( def WordprocessingMLStyles_StylesElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "versionOfBuiltInStylenames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StylesElt
			:type Double
			:location "704:3-704:54"
		) ( struct-map
			KM3_Reference
			:name "se_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_StylesElt
			:type WordprocessingMLStyles_WordDocument
			:location "701:3-701:62"
			:isContainer false
			:opposite styles
		) ( struct-map
			KM3_Reference
			:name "styles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StylesElt
			:type WordprocessingMLStyles_StyleElt
			:location "706:3-706:58"
			:isContainer false
			:opposite se_stylesElt
		)]
	) ) ( def WordprocessingMLStyles_StyleElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type StyleKindValue
			:location "714:3-714:40"
		) ( struct-map
			KM3_Attribute
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "718:3-718:38"
		) ( struct-map
			KM3_Attribute
			:name "sti"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type Double
			:location "724:3-724:31"
		) ( struct-map
			KM3_Attribute
			:name "autoRedefine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "732:3-732:43"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "734:3-734:37"
		) ( struct-map
			KM3_Attribute
			:name "semiHidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "736:3-736:41"
		) ( struct-map
			KM3_Attribute
			:name "locked"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "738:3-738:37"
		) ( struct-map
			KM3_Attribute
			:name "personal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "740:3-740:39"
		) ( struct-map
			KM3_Attribute
			:name "personalCompose"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "742:3-742:46"
		) ( struct-map
			KM3_Attribute
			:name "personalReply"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type OnOffType
			:location "744:3-744:44"
		) ( struct-map
			KM3_Reference
			:name "se_stylesElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StylesElt
			:location "711:3-711:56"
			:isContainer false
			:opposite styles
		) ( struct-map
			KM3_Reference
			:name "styleId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringType
			:location "716:3-716:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringProperty
			:location "720:3-720:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "aliases"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringProperty
			:location "722:3-722:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "basedOn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringProperty
			:location "726:3-726:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "next"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringProperty
			:location "728:3-728:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringProperty
			:location "730:3-730:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rsid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_StringType
			:location "746:3-746:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "se_pPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_ParaPrElt
			:location "749:3-749:61"
			:isContainer false
			:opposite ppe_styleElt
		) ( struct-map
			KM3_Reference
			:name "se_rPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_RunPrElt
			:location "751:3-751:60"
			:isContainer false
			:opposite rpe_styleElt
		) ( struct-map
			KM3_Reference
			:name "se_tblPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_TablePrElt
			:location "753:3-753:64"
			:isContainer false
			:opposite tpe_styleElt
		) ( struct-map
			KM3_Reference
			:name "se_trPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_TableRowPrElt
			:location "755:3-755:67"
			:isContainer false
			:opposite trpe_styleElt
		) ( struct-map
			KM3_Reference
			:name "se_tcPr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLStyles_StyleElt
			:type WordprocessingMLStyles_TableCellPrElt
			:location "757:3-757:68"
			:isContainer false
			:opposite tcpe_styleElt
		)]
	) ) ( def WordprocessingMLStyles_ListsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "le_wordDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_ListsElt
			:type WordprocessingMLStyles_WordDocument
			:location "771:3-771:61"
			:isContainer false
			:opposite lists
		)]
	) ) ( def WordprocessingMLStyles_SectPrElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "spe_bodyElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_SectPrElt
			:type WordprocessingMLStyles_BodyElt
			:location "776:3-776:53"
			:isContainer false
			:opposite sectPr
		)]
	) ) ( def WordprocessingMLStyles_RunLevelElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_BlockLevelChunkElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rle_tblContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RunLevelElt
			:type WordprocessingMLStyles_TableContentElt
			:location "782:3-782:77"
			:isContainer false
			:opposite tce_runLevelElts
		) ( struct-map
			KM3_Reference
			:name "rle_rowContentElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLStyles_RunLevelElt
			:type WordprocessingMLStyles_RowContentElt
			:location "783:3-783:75"
			:isContainer false
			:opposite rce_runLevelElts
		)]
	) ) ( def WordprocessingMLStyles_CfChunk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_BlockLevelElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_SimpleFieldElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_HLinkElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_SubDocElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLStyles_ParaContentElt]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_PictureType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def WordprocessingMLStyles_TabElt ( struct-map
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
		:location "821:2-821:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "822:2-822:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "823:2-823:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "824:2-824:18"
	) )]
) )
