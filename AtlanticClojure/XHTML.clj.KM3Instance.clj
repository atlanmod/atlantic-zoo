( declare XHTML_ValuedElement )
( declare XHTML_CDATA )
( declare XHTML_PCDATA )
( declare XHTML_NMTOKEN )
( declare XHTML_IDREF )
( declare XHTML_IDREFS )
( declare XHTML_ID )
( declare XHTML_EMPTY )
( declare XHTML_ContentType )
( declare XHTML_ContentTypes )
( declare XHTML_Charset )
( declare XHTML_Charsets )
( declare XHTML_LanguageCode )
( declare XHTML_Character )
( declare XHTML_Number )
( declare XHTML_LinkTypes )
( declare XHTML_MediaDesc )
( declare XHTML_URI )
( declare XHTML_UriList )
( declare XHTML_Datetime )
( declare XHTML_ScriptExpression )
( declare XHTML_StyleSheet )
( declare XHTML_Text )
( declare XHTML_Length )
( declare XHTML_MultiLength )
( declare XHTML_Pixels )
( declare XHTML_Shape )
( declare XHTML_Coords )
( declare XHTML_CoreAttrs )
( declare XHTML_Direction )
( declare XHTML_I18n )
( declare XHTML_Events )
( declare XHTML_Attrs )
( declare XHTML_Focus )
( declare XHTML_Specialpre )
( declare XHTML_Special )
( declare XHTML_Fontstyle )
( declare XHTML_Phrase )
( declare XHTML_Inlineforms )
( declare XHTML_Miscinline )
( declare XHTML_Misc )
( declare XHTML_inline )
( declare XHTML_Inline )
( declare XHTML_Heading )
( declare XHTML_Lists )
( declare XHTML_Blocktext )
( declare XHTML_block )
( declare XHTML_Block )
( declare XHTML_Flow )
( declare XHTML_AContent )
( declare XHTML_PreContent )
( declare XHTML_FormContent )
( declare XHTML_ButtonContent )
( declare XHTML_Html )
( declare XHTML_HeadMisc )
( declare XHTML_Head )
( declare XHTML_HeadElement )
( declare XHTML_TitleHeadElement )
( declare XHTML_BaseTitleHeadElement )
( declare XHTML_BaseHeadElement )
( declare XHTML_TitleBaseHeadElement )
( declare XHTML_Title )
( declare XHTML_Base )
( declare XHTML_Meta )
( declare XHTML_Link )
( declare XHTML_Style )
( declare XHTML_Script )
( declare XHTML_Noscript )
( declare XHTML_Body )
( declare XHTML_Div )
( declare XHTML_P )
( declare XHTML_H1 )
( declare XHTML_H2 )
( declare XHTML_H3 )
( declare XHTML_H4 )
( declare XHTML_H5 )
( declare XHTML_H6 )
( declare XHTML_Ul )
( declare XHTML_Ol )
( declare XHTML_Li )
( declare XHTML_Dl )
( declare XHTML_DlElement )
( declare XHTML_Dt )
( declare XHTML_Dd )
( declare XHTML_Address )
( declare XHTML_Hr )
( declare XHTML_Pre )
( declare XHTML_Blockquote )
( declare XHTML_Ins )
( declare XHTML_Del )
( declare XHTML_A )
( declare XHTML_Span )
( declare XHTML_Bdo )
( declare XHTML_Br )
( declare XHTML_Em )
( declare XHTML_Strong )
( declare XHTML_Dfn )
( declare XHTML_Code )
( declare XHTML_Samp )
( declare XHTML_Kbd )
( declare XHTML_Var )
( declare XHTML_Cite )
( declare XHTML_Abbr )
( declare XHTML_Acronym )
( declare XHTML_Q )
( declare XHTML_Sub )
( declare XHTML_Sup )
( declare XHTML_Tt )
( declare XHTML_I )
( declare XHTML_B )
( declare XHTML_Big )
( declare XHTML_Small )
( declare XHTML_ObjectElement )
( declare XHTML_Object )
( declare XHTML_ValueType )
( declare XHTML_Param )
( declare XHTML_Img )
( declare XHTML_MapContent )
( declare XHTML_MapElement )
( declare XHTML_MapElementContent )
( declare XHTML_Map )
( declare XHTML_Area )
( declare XHTML_FomeMethod )
( declare XHTML_Form )
( declare XHTML_Label )
( declare XHTML_InputType )
( declare XHTML_Input )
( declare XHTML_Select )
( declare XHTML_SelectElement )
( declare XHTML_Optgroup )
( declare XHTML_Option )
( declare XHTML_Textarea )
( declare XHTML_FieldsetElement )
( declare XHTML_Fieldset )
( declare XHTML_Legend )
( declare XHTML_ButtonType )
( declare XHTML_Button )
( declare XHTML_TFrame )
( declare XHTML_TRules )
( declare XHTML_CellHAlign )
( declare XHTML_Cellhalign )
( declare XHTML_CellVAlign )
( declare XHTML_Cellvalign )
( declare XHTML_Table )
( declare XHTML_ColElement )
( declare XHTML_TableElement )
( declare XHTML_Caption )
( declare XHTML_Thead )
( declare XHTML_Tfoot )
( declare XHTML_Tbody )
( declare XHTML_Colgroup )
( declare XHTML_Col )
( declare XHTML_Tr )
( declare XHTML_TrElement )
( declare XHTML_Scope )
( declare XHTML_Th )
( declare XHTML_Td )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def XHTML ( struct-map
	KM3_Package
	:contents[( def Shape ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rect"
		:location "98:4-98:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "circle"
		:location "99:4-99:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "poly"
		:location "100:4-100:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "default"
		:location "101:4-101:22"
	)] ) ) ( def Direction ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ltr"
		:location "131:3-131:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "rtl"
		:location "133:3-133:15"
	)] ) ) ( def ValueType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "data"
		:location "704:3-704:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "ref"
		:location "705:3-705:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "object"
		:location "706:3-706:20"
	)] ) ) ( def FomeMethod ( :literals[( struct-map
		KM3_EnumLiteral
		:name "get"
		:location "778:6-778:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "post"
		:location "779:6-779:19"
	)] ) ) ( def InputType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "text"
		:location "806:5-806:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "password"
		:location "807:5-807:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "checkbox"
		:location "808:5-808:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "radio"
		:location "809:5-809:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "submit"
		:location "810:5-810:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "reset"
		:location "811:5-811:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "file"
		:location "812:7-812:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "hidden"
		:location "813:7-813:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "image"
		:location "814:6-814:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "button"
		:location "815:3-815:18"
	)] ) ) ( def ButtonType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "button"
		:location "896:3-896:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "submit"
		:location "897:3-897:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "reset"
		:location "898:3-898:17"
	)] ) ) ( def TFrame ( :literals[( struct-map
		KM3_EnumLiteral
		:name "void"
		:location "921:3-921:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "above"
		:location "922:3-922:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "below"
		:location "923:3-923:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "hsides"
		:location "924:3-924:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "lhs"
		:location "925:3-925:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "rhs"
		:location "926:3-926:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "vsides"
		:location "927:3-927:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "box"
		:location "928:3-928:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "border"
		:location "929:3-929:18"
	)] ) ) ( def TRules ( :literals[( struct-map
		KM3_EnumLiteral
		:name "none"
		:location "934:3-934:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "groups"
		:location "935:3-935:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "rows"
		:location "936:3-936:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "cols"
		:location "937:3-937:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "all"
		:location "938:3-938:15"
	)] ) ) ( def CellHAlign ( :literals[( struct-map
		KM3_EnumLiteral
		:name "left"
		:location "943:5-943:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "center"
		:location "944:5-944:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "right"
		:location "945:5-945:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "justify"
		:location "946:5-946:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "char"
		:location "947:5-947:18"
	)] ) ) ( def CellVAlign ( :literals[( struct-map
		KM3_EnumLiteral
		:name "top"
		:location "958:3-958:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "middle"
		:location "959:3-959:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "bottom"
		:location "960:3-960:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "baseline"
		:location "961:3-961:20"
	)] ) ) ( def Scope ( :literals[( struct-map
		KM3_EnumLiteral
		:name "row"
		:location "1034:3-1034:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "col"
		:location "1035:3-1035:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "rowgroup"
		:location "1036:3-1036:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "colgroup"
		:location "1037:3-1037:20"
	)] ) ) ( def XHTML_ValuedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_ValuedElement
			:type String
			:location "14:3-14:28"
		)]
	) ) ( def XHTML_CDATA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_ValuedElement]
		:structuralFeatures[]
	) ) ( def XHTML_PCDATA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_ValuedElement]
		:structuralFeatures[]
	) ) ( def XHTML_NMTOKEN ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_ValuedElement]
		:structuralFeatures[]
	) ) ( def XHTML_IDREF ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_ValuedElement]
		:structuralFeatures[]
	) ) ( def XHTML_IDREFS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "idrefs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_IDREFS
			:type XHTML_IDREF
			:location "26:3-26:31"
			:isContainer false
		)]
	) ) ( def XHTML_ID ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_ValuedElement]
		:structuralFeatures[]
	) ) ( def XHTML_EMPTY ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_ContentType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_ContentTypes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contentTypes"
			:upper -1
			:lower 2
			:isOrdered false
			:owner XHTML_ContentTypes
			:type XHTML_ContentType
			:location "40:3-40:55"
			:isContainer true
		)]
	) ) ( def XHTML_Charset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Charsets ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "charsets"
			:upper -1
			:lower 2
			:isOrdered false
			:owner XHTML_Charsets
			:type XHTML_Charset
			:location "48:3-48:47"
			:isContainer true
		)]
	) ) ( def XHTML_LanguageCode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_NMTOKEN]
		:structuralFeatures[]
	) ) ( def XHTML_Character ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Number ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_LinkTypes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_MediaDesc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_URI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_UriList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "uris"
			:upper -1
			:lower 2
			:isOrdered false
			:owner XHTML_UriList
			:type XHTML_URI
			:location "71:3-71:29"
			:isContainer false
		)]
	) ) ( def XHTML_Datetime ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_ScriptExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_StyleSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Length ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_MultiLength ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Pixels ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CDATA]
		:structuralFeatures[]
	) ) ( def XHTML_Coords ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lengths"
			:upper -1
			:lower 2
			:isOrdered false
			:owner XHTML_Coords
			:type XHTML_Length
			:location "106:4-106:46"
			:isContainer true
		)]
	) ) ( def XHTML_CoreAttrs ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_CoreAttrs
			:type XHTML_ID
			:location "119:3-119:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_CoreAttrs
			:type XHTML_CDATA
			:location "121:3-121:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_CoreAttrs
			:type XHTML_StyleSheet
			:location "123:3-123:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_CoreAttrs
			:type XHTML_Text
			:location "125:3-125:41"
			:isContainer true
		)]
	) ) ( def XHTML_I18n ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_I18n
			:type Direction
			:location "143:3-143:34"
		) ( struct-map
			KM3_Reference
			:name "lang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_I18n
			:type XHTML_LanguageCode
			:location "139:3-139:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "xml:lang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_I18n
			:type XHTML_LanguageCode
			:location "141:3-141:54"
			:isContainer true
		)]
	) ) ( def XHTML_Events ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "onclick"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "149:3-149:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ondblclick"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "151:3-151:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onmousedown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "153:3-153:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onmouseup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "155:3-155:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onmouseover"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "157:3-157:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onmousemove"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "159:3-159:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onmouseout"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "161:3-161:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onkeypress"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "163:3-163:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onkeydown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "165:3-165:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onkeyup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Events
			:type XHTML_ScriptExpression
			:location "167:3-167:55"
			:isContainer true
		)]
	) ) ( def XHTML_Attrs ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_CoreAttrs XHTML_I18n XHTML_Events]
		:structuralFeatures[]
	) ) ( def XHTML_Focus ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "accesskey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Focus
			:type XHTML_Character
			:location "175:3-175:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tabindex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Focus
			:type XHTML_Number
			:location "177:3-177:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onfocus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Focus
			:type XHTML_ScriptExpression
			:location "179:3-179:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onblur"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Focus
			:type XHTML_ScriptExpression
			:location "181:3-181:54"
			:isContainer true
		)]
	) ) ( def XHTML_Specialpre ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Special XHTML_PreContent]
		:structuralFeatures[]
	) ) ( def XHTML_Special ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_inline XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_Fontstyle ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_inline XHTML_AContent XHTML_PreContent XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_Phrase ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_inline XHTML_AContent XHTML_PreContent XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_Inlineforms ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_inline XHTML_AContent XHTML_PreContent]
		:structuralFeatures[]
	) ) ( def XHTML_Miscinline ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Misc XHTML_Inline XHTML_AContent XHTML_PreContent]
		:structuralFeatures[]
	) ) ( def XHTML_Misc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Block XHTML_Flow XHTML_FormContent XHTML_ButtonContent XHTML_ObjectElement XHTML_MapElementContent XHTML_FieldsetElement]
		:structuralFeatures[]
	) ) ( def XHTML_inline ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Inline]
		:structuralFeatures[]
	) ) ( def XHTML_Inline ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Flow XHTML_ObjectElement XHTML_FieldsetElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pcdataInline"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Inline
			:type XHTML_PCDATA
			:location "225:3-225:48"
			:isContainer true
		)]
	) ) ( def XHTML_Heading ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_block XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_Lists ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_block XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_Blocktext ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_block XHTML_ButtonContent]
		:structuralFeatures[]
	) ) ( def XHTML_block ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Block XHTML_Flow XHTML_FormContent XHTML_ObjectElement XHTML_MapElementContent XHTML_FieldsetElement]
		:structuralFeatures[]
	) ) ( def XHTML_Block ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_Flow ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pcdataFlow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Flow
			:type XHTML_PCDATA
			:location "256:3-256:46"
			:isContainer true
		)]
	) ) ( def XHTML_AContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pcdataAContent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_AContent
			:type XHTML_PCDATA
			:location "267:3-267:50"
			:isContainer true
		)]
	) ) ( def XHTML_PreContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pcdataPreContent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_PreContent
			:type XHTML_PCDATA
			:location "273:3-273:52"
			:isContainer true
		)]
	) ) ( def XHTML_FormContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_ButtonContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pcdataButtonContent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_ButtonContent
			:type XHTML_PCDATA
			:location "284:3-284:55"
			:isContainer true
		)]
	) ) ( def XHTML_Html ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "i18n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Html
			:type XHTML_I18n
			:location "294:3-294:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Html
			:type XHTML_ID
			:location "295:3-295:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "xmlns"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Html
			:type XHTML_URI
			:location "297:3-297:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Html
			:type XHTML_Head
			:location "298:3-298:51"
			:isContainer true
			:opposite html
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Html
			:type XHTML_Body
			:location "299:3-299:51"
			:isContainer true
			:opposite html
		)]
	) ) ( def XHTML_HeadMisc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_Head ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "i18n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_I18n
			:location "314:3-314:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_ID
			:location "315:3-315:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "profile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_URI
			:location "316:3-316:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headmisc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_HeadMisc
			:location "317:3-317:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_HeadElement
			:location "318:3-318:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "html"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Head
			:type XHTML_Html
			:location "319:3-319:41"
			:isContainer false
			:opposite head
		)]
	) ) ( def XHTML_HeadElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_TitleHeadElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_HeadElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_TitleHeadElement
			:type XHTML_Title
			:location "326:3-326:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headmisc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_TitleHeadElement
			:type XHTML_HeadMisc
			:location "327:3-327:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "baseTitleHeadElement"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_TitleHeadElement
			:type XHTML_BaseTitleHeadElement
			:location "328:3-328:72"
			:isContainer true
		)]
	) ) ( def XHTML_BaseTitleHeadElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_BaseTitleHeadElement
			:type XHTML_Base
			:location "332:3-332:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headmisc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_BaseTitleHeadElement
			:type XHTML_HeadMisc
			:location "333:3-333:46"
			:isContainer true
		)]
	) ) ( def XHTML_BaseHeadElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_HeadElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_BaseHeadElement
			:type XHTML_Base
			:location "337:3-337:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headmisc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_BaseHeadElement
			:type XHTML_HeadMisc
			:location "338:3-338:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "titleBaseHeadElement"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_BaseHeadElement
			:type XHTML_TitleBaseHeadElement
			:location "339:3-339:72"
			:isContainer true
		)]
	) ) ( def XHTML_TitleBaseHeadElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_TitleBaseHeadElement
			:type XHTML_Title
			:location "343:3-343:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headmisc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_TitleBaseHeadElement
			:type XHTML_HeadMisc
			:location "344:3-344:46"
			:isContainer true
		)]
	) ) ( def XHTML_Title ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_PCDATA]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "i18n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Title
			:type XHTML_I18n
			:location "349:3-349:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Title
			:type XHTML_ID
			:location "350:3-350:36"
			:isContainer true
		)]
	) ) ( def XHTML_Base ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "href"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Base
			:type XHTML_URI
			:location "355:3-355:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Base
			:type XHTML_ID
			:location "356:3-356:36"
			:isContainer true
		)]
	) ) ( def XHTML_Meta ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_HeadMisc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "i18n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_I18n
			:location "363:3-363:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_ID
			:location "364:3-364:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "httpequiv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_CDATA
			:location "365:3-365:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_CDATA
			:location "366:3-366:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_CDATA
			:location "367:3-367:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "scheme"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Meta
			:type XHTML_CDATA
			:location "368:3-368:43"
			:isContainer true
		)]
	) ) ( def XHTML_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_HeadMisc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "charset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_Charset
			:location "374:3-374:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_URI
			:location "375:3-375:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "hreflang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_LanguageCode
			:location "376:3-376:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_ContentType
			:location "377:3-377:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_LinkTypes
			:location "378:3-378:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rev"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_LinkTypes
			:location "379:3-379:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "media"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Link
			:type XHTML_MediaDesc
			:location "380:3-380:46"
			:isContainer true
		)]
	) ) ( def XHTML_Style ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_PCDATA XHTML_HeadMisc]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "xml:space"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Style
			:type String
			:location "392:3-392:34"
		) ( struct-map
			KM3_Reference
			:name "i18n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Style
			:type XHTML_I18n
			:location "386:3-386:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Style
			:type XHTML_ID
			:location "387:3-387:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Style
			:type XHTML_ContentType
			:location "388:3-388:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "media"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Style
			:type XHTML_MediaDesc
			:location "389:3-389:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Style
			:type XHTML_Text
			:location "390:3-390:40"
			:isContainer true
		)]
	) ) ( def XHTML_Script ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_PCDATA XHTML_Miscinline XHTML_HeadMisc]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Script
			:type String
			:location "402:3-402:33"
		) ( struct-map
			KM3_Attribute
			:name "xml:space"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Script
			:type String
			:location "404:3-404:34"
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Script
			:type XHTML_ID
			:location "398:3-398:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "charset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Script
			:type XHTML_Charset
			:location "399:3-399:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Script
			:type XHTML_ContentType
			:location "400:3-400:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Script
			:type XHTML_URI
			:location "401:3-401:37"
			:isContainer true
		)]
	) ) ( def XHTML_Noscript ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Misc]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "block"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Noscript
			:type XHTML_Block
			:location "409:3-409:37"
			:isContainer true
		)]
	) ) ( def XHTML_Body ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bodyElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Body
			:type XHTML_Block
			:location "418:3-418:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onload"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Body
			:type XHTML_ScriptExpression
			:location "419:3-419:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onunload"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Body
			:type XHTML_ScriptExpression
			:location "420:3-420:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "html"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Body
			:type XHTML_Html
			:location "421:3-421:41"
			:isContainer false
			:opposite body
		)]
	) ) ( def XHTML_Div ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_block XHTML_ButtonContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "divElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Div
			:type XHTML_Flow
			:location "427:3-427:45"
			:isContainer true
		)]
	) ) ( def XHTML_P ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_block XHTML_ButtonContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_P
			:type XHTML_Inline
			:location "435:5-435:47"
			:isContainer true
		)]
	) ) ( def XHTML_H1 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h1Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H1
			:type XHTML_Inline
			:location "445:3-445:46"
			:isContainer true
		)]
	) ) ( def XHTML_H2 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h2Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H2
			:type XHTML_Inline
			:location "449:3-449:46"
			:isContainer true
		)]
	) ) ( def XHTML_H3 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h3Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H3
			:type XHTML_Inline
			:location "453:3-453:46"
			:isContainer true
		)]
	) ) ( def XHTML_H4 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h4Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H4
			:type XHTML_Inline
			:location "457:3-457:46"
			:isContainer true
		)]
	) ) ( def XHTML_H5 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h5Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H5
			:type XHTML_Inline
			:location "461:3-461:46"
			:isContainer true
		)]
	) ) ( def XHTML_H6 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Heading]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h6Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_H6
			:type XHTML_Inline
			:location "465:3-465:46"
			:isContainer true
		)]
	) ) ( def XHTML_Ul ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Lists]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "li"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Ul
			:type XHTML_Li
			:location "475:3-475:36"
			:isContainer true
		)]
	) ) ( def XHTML_Ol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Lists]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "li"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Ol
			:type XHTML_Li
			:location "480:3-480:36"
			:isContainer true
		)]
	) ) ( def XHTML_Li ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "liElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Li
			:type XHTML_Flow
			:location "485:3-485:44"
			:isContainer true
		)]
	) ) ( def XHTML_Dl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Lists]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dlElements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Dl
			:type XHTML_DlElement
			:location "491:3-491:51"
			:isContainer true
		)]
	) ) ( def XHTML_DlElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XHTML_Attrs]
		:structuralFeatures[]
	) ) ( def XHTML_Dt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_DlElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dtElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Dt
			:type XHTML_Inline
			:location "498:3-498:46"
			:isContainer true
		)]
	) ) ( def XHTML_Dd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_DlElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ddElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Dd
			:type XHTML_Flow
			:location "502:3-502:44"
			:isContainer true
		)]
	) ) ( def XHTML_Address ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Blocktext]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "addressElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Address
			:type XHTML_Inline
			:location "512:3-512:51"
			:isContainer true
		)]
	) ) ( def XHTML_Hr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_Blocktext]
		:structuralFeatures[]
	) ) ( def XHTML_Pre ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Blocktext]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "xml:space"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Pre
			:type String
			:location "522:3-522:34"
		) ( struct-map
			KM3_Reference
			:name "preElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Pre
			:type XHTML_PreContent
			:location "520:3-520:51"
			:isContainer true
		)]
	) ) ( def XHTML_Blockquote ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Blocktext]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "blockquoteElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Blockquote
			:type XHTML_Block
			:location "527:3-527:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Blockquote
			:type XHTML_URI
			:location "528:3-528:39"
			:isContainer true
		)]
	) ) ( def XHTML_Ins ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Miscinline]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "flowelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Ins
			:type XHTML_Flow
			:location "537:3-537:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Ins
			:type XHTML_URI
			:location "538:3-538:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "datetime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Ins
			:type XHTML_Datetime
			:location "539:3-539:48"
			:isContainer true
		)]
	) ) ( def XHTML_Del ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Miscinline]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "flowelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Del
			:type XHTML_Flow
			:location "543:3-543:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Del
			:type XHTML_URI
			:location "544:3-544:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "datetime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Del
			:type XHTML_Datetime
			:location "545:3-545:48"
			:isContainer true
		)]
	) ) ( def XHTML_A ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Focus XHTML_inline XHTML_PreContent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_A
			:type Shape
			:location "560:3-560:27"
		) ( struct-map
			KM3_Reference
			:name "acontent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_AContent
			:location "551:3-551:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "charset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_Charset
			:location "552:3-552:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_ContentType
			:location "553:3-553:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_NMTOKEN
			:location "554:3-554:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_URI
			:location "555:3-555:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "hreflang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_LanguageCode
			:location "556:3-556:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_LinkTypes
			:location "557:3-557:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rev"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_LinkTypes
			:location "558:3-558:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "coords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_A
			:type XHTML_Coords
			:location "561:3-561:44"
			:isContainer true
		)]
	) ) ( def XHTML_Span ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Specialpre]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "spanElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Span
			:type XHTML_Inline
			:location "568:3-568:38"
			:isContainer false
		)]
	) ) ( def XHTML_Bdo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_CoreAttrs XHTML_Events XHTML_Specialpre]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dir"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Bdo
			:type Direction
			:location "576:3-576:29"
		) ( struct-map
			KM3_Reference
			:name "bdoElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Bdo
			:type XHTML_Inline
			:location "573:3-573:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Bdo
			:type XHTML_LanguageCode
			:location "574:3-574:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "xml:lang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Bdo
			:type XHTML_LanguageCode
			:location "575:3-575:54"
			:isContainer true
		)]
	) ) ( def XHTML_Br ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_CoreAttrs XHTML_Specialpre]
		:structuralFeatures[]
	) ) ( def XHTML_Em ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "emElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Em
			:type XHTML_Inline
			:location "584:3-584:46"
			:isContainer true
		)]
	) ) ( def XHTML_Strong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "strongElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Strong
			:type XHTML_Inline
			:location "589:3-589:50"
			:isContainer true
		)]
	) ) ( def XHTML_Dfn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dfnElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Dfn
			:type XHTML_Inline
			:location "594:3-594:47"
			:isContainer true
		)]
	) ) ( def XHTML_Code ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "codeElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Code
			:type XHTML_Inline
			:location "599:3-599:48"
			:isContainer true
		)]
	) ) ( def XHTML_Samp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sampElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Samp
			:type XHTML_Inline
			:location "604:3-604:48"
			:isContainer true
		)]
	) ) ( def XHTML_Kbd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "kbdElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Kbd
			:type XHTML_Inline
			:location "609:3-609:47"
			:isContainer true
		)]
	) ) ( def XHTML_Var ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "varElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Var
			:type XHTML_Inline
			:location "614:3-614:47"
			:isContainer true
		)]
	) ) ( def XHTML_Cite ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "citeElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Cite
			:type XHTML_Inline
			:location "619:3-619:48"
			:isContainer true
		)]
	) ) ( def XHTML_Abbr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "abbrElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Abbr
			:type XHTML_Inline
			:location "624:3-624:48"
			:isContainer true
		)]
	) ) ( def XHTML_Acronym ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "acronymElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Acronym
			:type XHTML_Inline
			:location "629:3-629:51"
			:isContainer true
		)]
	) ) ( def XHTML_Q ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Q
			:type XHTML_Inline
			:location "634:3-634:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Q
			:type XHTML_URI
			:location "635:3-635:39"
			:isContainer true
		)]
	) ) ( def XHTML_Sub ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Sub
			:type XHTML_Inline
			:location "640:3-640:47"
			:isContainer true
		)]
	) ) ( def XHTML_Sup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Phrase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Sup
			:type XHTML_Inline
			:location "645:3-645:47"
			:isContainer true
		)]
	) ) ( def XHTML_Tt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Fontstyle]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ttElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Tt
			:type XHTML_Inline
			:location "650:3-650:46"
			:isContainer true
		)]
	) ) ( def XHTML_I ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Fontstyle]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_I
			:type XHTML_Inline
			:location "655:3-655:45"
			:isContainer true
		)]
	) ) ( def XHTML_B ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Fontstyle]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_B
			:type XHTML_Inline
			:location "660:3-660:45"
			:isContainer true
		)]
	) ) ( def XHTML_Big ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Fontstyle]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bigElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Big
			:type XHTML_Inline
			:location "665:3-665:47"
			:isContainer true
		)]
	) ) ( def XHTML_Small ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Fontstyle]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "smallElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Small
			:type XHTML_Inline
			:location "670:3-670:49"
			:isContainer true
		)]
	) ) ( def XHTML_ObjectElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectpcdata"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_ObjectElement
			:type XHTML_PCDATA
			:location "681:3-681:49"
			:isContainer true
		)]
	) ) ( def XHTML_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Special XHTML_HeadMisc]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "declare"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type Boolean
			:location "688:5-688:38"
		) ( struct-map
			KM3_Reference
			:name "objectelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_ObjectElement
			:location "687:3-687:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "classid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_URI
			:location "689:5-689:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "codebase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_URI
			:location "690:5-690:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_URI
			:location "691:5-691:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_ContentType
			:location "692:5-692:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "codetype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_ContentType
			:location "693:5-693:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "archive"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_UriList
			:location "694:5-694:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "standby"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_Text
			:location "695:5-695:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_Length
			:location "696:5-696:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_Length
			:location "697:5-697:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "usemap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_URI
			:location "698:5-698:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_NMTOKEN
			:location "699:5-699:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tabindex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Object
			:type XHTML_Number
			:location "700:5-700:48"
			:isContainer true
		)]
	) ) ( def XHTML_Param ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_ObjectElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "valuetype"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Param
			:type ValueType
			:location "715:3-715:35"
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Param
			:type XHTML_ID
			:location "711:3-711:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Param
			:type XHTML_CDATA
			:location "712:3-712:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Param
			:type XHTML_CDATA
			:location "713:3-713:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Param
			:type XHTML_ContentType
			:location "716:3-716:48"
			:isContainer true
		)]
	) ) ( def XHTML_Img ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_Special]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ismap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Img
			:type Boolean
			:location "732:3-732:34"
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_URI
			:location "726:3-726:33"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "alt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_Text
			:location "727:3-727:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "longdesc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_URI
			:location "728:3-728:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_Length
			:location "729:3-729:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_Length
			:location "730:3-730:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "usemap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Img
			:type XHTML_URI
			:location "731:3-731:41"
			:isContainer true
		)]
	) ) ( def XHTML_MapContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mapElements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_MapContent
			:type XHTML_MapElement
			:location "742:3-742:53"
			:isContainer true
		)]
	) ) ( def XHTML_MapElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_MapElementContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_Map ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_I18n XHTML_Events XHTML_Specialpre]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mapelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_MapContent
			:location "755:3-755:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_ID
			:location "756:3-756:32"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_CDATA
			:location "757:3-757:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_StyleSheet
			:location "758:3-758:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_Text
			:location "759:3-759:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Map
			:type XHTML_NMTOKEN
			:location "760:3-760:44"
			:isContainer true
		)]
	) ) ( def XHTML_Area ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_Focus XHTML_MapElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Area
			:type Shape
			:location "765:5-765:29"
		) ( struct-map
			KM3_Attribute
			:name "nohref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Area
			:type Boolean
			:location "768:5-768:37"
		) ( struct-map
			KM3_Reference
			:name "coords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Area
			:type XHTML_Coords
			:location "766:5-766:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Area
			:type XHTML_URI
			:location "767:5-767:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "alt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Area
			:type XHTML_Text
			:location "769:5-769:36"
			:isContainer true
		)]
	) ) ( def XHTML_Form ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Block XHTML_ObjectElement XHTML_MapElementContent XHTML_FieldsetElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Form
			:type FomeMethod
			:location "787:5-787:35"
		) ( struct-map
			KM3_Reference
			:name "formelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_FormContent
			:location "784:3-784:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_URI
			:location "785:3-785:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "enctype"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_ContentType
			:location "789:3-789:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onsubmit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_ScriptExpression
			:location "790:5-790:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onreset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_ScriptExpression
			:location "791:3-791:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accept"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_ContentTypes
			:location "792:3-792:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accept-charset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Form
			:type XHTML_Charsets
			:location "793:3-793:56"
			:isContainer true
		)]
	) ) ( def XHTML_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Inlineforms]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "labelelements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Label
			:type XHTML_Inline
			:location "798:3-798:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Label
			:type XHTML_IDREF
			:location "799:3-799:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accesskey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Label
			:type XHTML_Character
			:location "800:5-800:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onfocus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Label
			:type XHTML_ScriptExpression
			:location "801:5-801:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onblur"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Label
			:type XHTML_ScriptExpression
			:location "802:5-802:56"
			:isContainer true
		)]
	) ) ( def XHTML_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_Focus XHTML_Inlineforms]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Input
			:type InputType
			:location "821:5-821:32"
		) ( struct-map
			KM3_Attribute
			:name "checked"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type Boolean
			:location "824:5-824:38"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type Boolean
			:location "825:5-825:39"
		) ( struct-map
			KM3_Attribute
			:name "readonly"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type Boolean
			:location "826:5-826:39"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_CDATA
			:location "822:5-822:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_CDATA
			:location "823:5-823:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_CDATA
			:location "827:5-827:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "maxlength"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_Number
			:location "828:5-828:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_URI
			:location "829:5-829:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "alt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_CDATA
			:location "830:5-830:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "usemap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_URI
			:location "831:5-831:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onselect"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_ScriptExpression
			:location "832:5-832:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onchange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_ScriptExpression
			:location "833:5-833:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accept"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Input
			:type XHTML_ContentTypes
			:location "834:5-834:52"
			:isContainer true
		)]
	) ) ( def XHTML_Select ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Inlineforms]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiple"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type Boolean
			:location "842:3-842:37"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type Boolean
			:location "843:5-843:39"
		) ( struct-map
			KM3_Reference
			:name "selectelement"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_SelectElement
			:location "839:3-839:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_CDATA
			:location "840:3-840:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_Number
			:location "841:5-841:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tabindex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_Number
			:location "844:3-844:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onfocus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_ScriptExpression
			:location "845:3-845:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onblur"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_ScriptExpression
			:location "846:3-846:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onchange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Select
			:type XHTML_ScriptExpression
			:location "847:3-847:56"
			:isContainer true
		)]
	) ) ( def XHTML_SelectElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_Optgroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_SelectElement XHTML_Attrs]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Optgroup
			:type Boolean
			:location "856:3-856:37"
		) ( struct-map
			KM3_Reference
			:name "options"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Optgroup
			:type XHTML_Option
			:location "855:3-855:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Optgroup
			:type XHTML_Text
			:location "857:3-857:36"
			:isContainer true
		)]
	) ) ( def XHTML_Option ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_SelectElement XHTML_PCDATA XHTML_Attrs]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "selected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Option
			:type Boolean
			:location "862:3-862:37"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Option
			:type Boolean
			:location "863:3-863:37"
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Option
			:type XHTML_Text
			:location "864:3-864:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "optionvalue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Option
			:type XHTML_CDATA
			:location "865:3-865:49"
			:isContainer true
		)]
	) ) ( def XHTML_Textarea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_PCDATA XHTML_Attrs XHTML_Focus XHTML_Inlineforms]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Textarea
			:type Boolean
			:location "873:3-873:37"
		) ( struct-map
			KM3_Attribute
			:name "readonly"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Textarea
			:type Boolean
			:location "874:3-874:37"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Textarea
			:type XHTML_CDATA
			:location "870:3-870:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Textarea
			:type XHTML_Number
			:location "871:3-871:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cols"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Textarea
			:type XHTML_Number
			:location "872:3-872:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onselect"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Textarea
			:type XHTML_ScriptExpression
			:location "875:3-875:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "onchange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Textarea
			:type XHTML_ScriptExpression
			:location "876:3-876:56"
			:isContainer true
		)]
	) ) ( def XHTML_FieldsetElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fieldsetpcdata"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_FieldsetElement
			:type XHTML_PCDATA
			:location "880:3-880:50"
			:isContainer true
		)]
	) ) ( def XHTML_Fieldset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_block]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fieldsetelements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Fieldset
			:type XHTML_FieldsetElement
			:location "886:3-886:61"
			:isContainer true
		)]
	) ) ( def XHTML_Legend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_FieldsetElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "legendelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Legend
			:type XHTML_Inline
			:location "891:3-891:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accesskey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Legend
			:type XHTML_Character
			:location "892:3-892:50"
			:isContainer true
		)]
	) ) ( def XHTML_Button ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Focus XHTML_Inlineforms]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Button
			:type ButtonType
			:location "908:3-908:31"
		) ( struct-map
			KM3_Attribute
			:name "disabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Button
			:type Boolean
			:location "909:3-909:37"
		) ( struct-map
			KM3_Reference
			:name "buttoncontent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Button
			:type XHTML_ButtonContent
			:location "904:3-904:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Button
			:type XHTML_CDATA
			:location "905:3-905:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Button
			:type XHTML_CDATA
			:location "906:3-906:42"
			:isContainer true
		)]
	) ) ( def XHTML_Cellhalign ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Cellhalign
			:type CellHAlign
			:location "952:3-952:37"
		) ( struct-map
			KM3_Reference
			:name "char"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Cellhalign
			:type XHTML_Character
			:location "953:3-953:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "charoff"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Cellhalign
			:type XHTML_Length
			:location "954:3-954:45"
			:isContainer true
		)]
	) ) ( def XHTML_Cellvalign ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "valign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Cellvalign
			:type CellVAlign
			:location "966:3-966:38"
		)]
	) ) ( def XHTML_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_block XHTML_ButtonContent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "frame"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type TFrame
			:location "978:3-978:33"
		) ( struct-map
			KM3_Attribute
			:name "rules"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type TRules
			:location "979:3-979:33"
		) ( struct-map
			KM3_Reference
			:name "caption"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Caption
			:location "970:3-970:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_ColElement
			:location "971:3-971:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thead"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Thead
			:location "972:3-972:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tfoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Tfoot
			:location "973:3-973:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tableelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_TableElement
			:location "974:3-974:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "summary"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Text
			:location "975:3-975:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Length
			:location "976:3-976:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "border"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Pixels
			:location "977:3-977:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cellspacing"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Length
			:location "980:3-980:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cellpadding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Table
			:type XHTML_Length
			:location "981:3-981:49"
			:isContainer true
		)]
	) ) ( def XHTML_ColElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cols"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_ColElement
			:type XHTML_Col
			:location "985:6-985:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colgroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_ColElement
			:type XHTML_Colgroup
			:location "986:6-986:49"
			:isContainer true
		)]
	) ) ( def XHTML_TableElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tbody"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_TableElement
			:type XHTML_Tbody
			:location "990:6-990:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_TableElement
			:type XHTML_Tr
			:location "991:6-991:39"
			:isContainer true
		)]
	) ) ( def XHTML_Caption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "captionelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Caption
			:type XHTML_Inline
			:location "995:3-995:50"
			:isContainer true
		)]
	) ) ( def XHTML_Thead ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Thead
			:type XHTML_Tr
			:location "1000:3-1000:36"
			:isContainer true
		)]
	) ) ( def XHTML_Tfoot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Tfoot
			:type XHTML_Tr
			:location "1005:3-1005:36"
			:isContainer true
		)]
	) ) ( def XHTML_Tbody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tr"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Tbody
			:type XHTML_Tr
			:location "1009:3-1009:36"
			:isContainer true
		)]
	) ) ( def XHTML_Colgroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cols"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Colgroup
			:type XHTML_Col
			:location "1014:3-1014:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "span"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Colgroup
			:type XHTML_Number
			:location "1015:3-1015:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Colgroup
			:type XHTML_MultiLength
			:location "1016:4-1016:49"
			:isContainer true
		)]
	) ) ( def XHTML_Col ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_EMPTY XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "span"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Col
			:type XHTML_Number
			:location "1021:3-1021:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Col
			:type XHTML_MultiLength
			:location "1022:4-1022:49"
			:isContainer true
		)]
	) ) ( def XHTML_Tr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_Attrs XHTML_Cellhalign XHTML_Cellvalign]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "trelements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XHTML_Tr
			:type XHTML_TrElement
			:location "1026:3-1026:51"
			:isContainer true
		)]
	) ) ( def XHTML_TrElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XHTML_Th ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_TrElement XHTML_Attrs XHTML_Cellvalign XHTML_Cellhalign]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "scope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Th
			:type Scope
			:location "1046:3-1046:32"
		) ( struct-map
			KM3_Reference
			:name "thelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_Flow
			:location "1042:3-1042:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abbr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_Text
			:location "1043:3-1043:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "axis"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_CDATA
			:location "1044:3-1044:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_IDREFS
			:location "1045:3-1045:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rowspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_Number
			:location "1048:3-1048:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Th
			:type XHTML_Number
			:location "1049:3-1049:40"
			:isContainer true
		)]
	) ) ( def XHTML_Td ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XHTML_TrElement XHTML_Attrs XHTML_Cellvalign XHTML_Cellhalign]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "scope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Td
			:type Scope
			:location "1058:3-1058:32"
		) ( struct-map
			KM3_Reference
			:name "tdelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_Flow
			:location "1054:3-1054:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abbr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_Text
			:location "1055:3-1055:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "axis"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_CDATA
			:location "1056:3-1056:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_IDREFS
			:location "1057:3-1057:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rowspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_Number
			:location "1060:3-1060:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colspan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XHTML_Td
			:type XHTML_Number
			:location "1061:3-1061:40"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "1069:2-1069:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "1070:2-1070:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "1071:2-1071:19"
	) )]
) )
