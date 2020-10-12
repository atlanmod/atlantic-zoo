( declare WordprocessingMLBasicDef_StringProperty )
( declare WordprocessingMLBasicDef_StringType )
( declare WordprocessingMLBasicDef_BreakType )
( declare WordprocessingMLBasicDef_NoteValue )
( declare WordprocessingMLBasicDef_OnOffType )
( declare WordprocessingMLBasicDef_FldCharTypeProperty )
( declare WordprocessingMLBasicDef_WordDocument )
( declare WordprocessingMLBasicDef_BodyElt )
( declare WordprocessingMLBasicDef_BlockLevelElt )
( declare WordprocessingMLBasicDef_BlockLevelChunkElt )
( declare WordprocessingMLBasicDef_ParaElt )
( declare WordprocessingMLBasicDef_ParaContentElt )
( declare WordprocessingMLBasicDef_RunElt )
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
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def WordprocessingMLBasicDef ( struct-map
	KM3_Package
	:contents[( def BreakType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "bt_page"
		:location "24:4-24:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "bt_column"
		:location "25:4-25:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "bt_text_wrapping"
		:location "26:4-26:29"
	)] ) ) ( def NoteValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ftn_normal"
		:location "32:4-32:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_separator"
		:location "34:4-34:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_continuation_separator"
		:location "36:4-36:39"
	) ( struct-map
		KM3_EnumLiteral
		:name "ftn_continuation_notice"
		:location "38:4-38:36"
	)] ) ) ( def OnOffType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "oot_on"
		:location "43:4-43:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "oot_off"
		:location "44:4-44:20"
	)] ) ) ( def FldCharTypeProperty ( :literals[( struct-map
		KM3_EnumLiteral
		:name "fctp_begin"
		:location "49:4-49:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "fctp_separate"
		:location "50:4-50:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "fctp_end"
		:location "51:4-51:21"
	)] ) ) ( def WordprocessingMLBasicDef_StringProperty ( struct-map
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
			:location "19:4-19:27"
		)]
	) ) ( def WordprocessingMLBasicDef_WordDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ignoreSubtree"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_StringProperty
			:location "62:3-62:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ignoreElements"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_StringProperty
			:location "64:3-64:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_WordDocument
			:type WordprocessingMLBasicDef_BodyElt
			:location "67:3-67:65"
			:isContainer true
			:opposite be_wordDocument
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
			:location "74:3-74:60"
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
			:location "77:3-77:88"
			:isContainer true
			:opposite ble_bodyElt
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
			:location "82:3-82:61"
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
			:location "83:3-83:60"
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
			:name "pContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLBasicDef_ParaElt
			:type WordprocessingMLBasicDef_ParaContentElt
			:location "95:3-95:84"
			:isContainer true
			:opposite pce_pElt
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
			:location "100:3-100:57"
			:isContainer false
			:opposite pContentElts
		)]
	) ) ( def WordprocessingMLBasicDef_RunElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_ParaContentElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rContentElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WordprocessingMLBasicDef_RunElt
			:type WordprocessingMLBasicDef_RunContentElt
			:location "106:3-106:83"
			:isContainer true
			:opposite rce_rElt
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
			:location "111:3-111:56"
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
			:location "117:3-117:35"
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
			:location "170:3-170:35"
		) ( struct-map
			KM3_Attribute
			:name "suppressRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_NoteElt
			:type OnOffType
			:location "172:3-172:42"
		) ( struct-map
			KM3_Reference
			:name "n_blockLevelElts"
			:upper -1
			:lower 1
			:isOrdered true
			:owner WordprocessingMLBasicDef_NoteElt
			:type WordprocessingMLBasicDef_BlockLevelElt
			:location "168:3-168:89"
			:isContainer true
			:opposite ble_note
		)]
	) ) ( def WordprocessingMLBasicDef_Picture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
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
			:location "184:3-184:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "char"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_SymElt
			:type WordprocessingMLBasicDef_StringType
			:location "186:3-186:41"
			:isContainer true
		)]
	) ) ( def WordprocessingMLBasicDef_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WordprocessingMLBasicDef_RunContentElt]
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
			:location "200:3-200:47"
		) ( struct-map
			KM3_Attribute
			:name "fldLock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WordprocessingMLBasicDef_FldCharElt
			:type OnOffType
			:location "202:3-202:33"
		) ( struct-map
			KM3_Reference
			:name "fldData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WordprocessingMLBasicDef_FldCharElt
			:type WordprocessingMLBasicDef_StringType
			:location "198:3-198:49"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "214:2-214:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "215:2-215:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "216:2-216:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "217:2-217:18"
	) )]
) )
