( declare SpreadsheetMLStyles_DateTimeType )
( declare SpreadsheetMLStyles_VersionType )
( declare SpreadsheetMLStyles_ValueType )
( declare SpreadsheetMLStyles_StringValue )
( declare SpreadsheetMLStyles_NumberValue )
( declare SpreadsheetMLStyles_DateTimeTypeValue )
( declare SpreadsheetMLStyles_BooleanValue )
( declare SpreadsheetMLStyles_ErrorValue )
( declare SpreadsheetMLStyles_DocumentPropertiesCollection )
( declare SpreadsheetMLStyles_CustomDocumentPropertiesCollection )
( declare SpreadsheetMLStyles_CustomDocumentProperty )
( declare SpreadsheetMLStyles_SmartTagType )
( declare SpreadsheetMLStyles_SmartTagsCollection )
( declare SpreadsheetMLStyles_Workbook )
( declare SpreadsheetMLStyles_Worksheet )
( declare SpreadsheetMLStyles_StyledElement )
( declare SpreadsheetMLStyles_Table )
( declare SpreadsheetMLStyles_TableElement )
( declare SpreadsheetMLStyles_ColOrRowElement )
( declare SpreadsheetMLStyles_Column )
( declare SpreadsheetMLStyles_Row )
( declare SpreadsheetMLStyles_Cell )
( declare SpreadsheetMLStyles_Comment )
( declare SpreadsheetMLStyles_Data )
( declare SpreadsheetMLStyles_ExcelWorkbook )
( declare SpreadsheetMLStyles_DisplayDrawingObjectsType )
( declare SpreadsheetMLStyles_CalculationWorkbookType )
( declare SpreadsheetMLStyles_WorksheetOptionsElt )
( declare SpreadsheetMLStyles_ExcelWorksheetTypeType )
( declare SpreadsheetMLStyles_VisibleType )
( declare SpreadsheetMLStyles_EnableSelectionType )
( declare SpreadsheetMLStyles_PageSetup )
( declare SpreadsheetMLStyles_Layout )
( declare SpreadsheetMLStyles_OrientationType )
( declare SpreadsheetMLStyles_HeaderOrFooterElt )
( declare SpreadsheetMLStyles_Header )
( declare SpreadsheetMLStyles_Footer )
( declare SpreadsheetMLStyles_PageMarginsInfo )
( declare SpreadsheetMLStyles_Print )
( declare SpreadsheetMLStyles_CommentsLayoutType )
( declare SpreadsheetMLStyles_StylesCollection )
( declare SpreadsheetMLStyles_StyleType )
( declare SpreadsheetMLStyles_ProtectionType )
( declare SpreadsheetMLStyles_AlignmentType )
( declare SpreadsheetMLStyles_HorizontalAlignementType )
( declare SpreadsheetMLStyles_ReadingOrderType )
( declare SpreadsheetMLStyles_VerticalAlignementType )
( declare SpreadsheetMLStyles_BordersType )
( declare SpreadsheetMLStyles_BorderType )
( declare SpreadsheetMLStyles_PositionType )
( declare SpreadsheetMLStyles_LineStyleType )
( declare SpreadsheetMLStyles_FontType )
( declare SpreadsheetMLStyles_UnderlineType )
( declare SpreadsheetMLStyles_VerticalAlignType )
( declare SpreadsheetMLStyles_InteriorType )
( declare SpreadsheetMLStyles_PatternType )
( declare SpreadsheetMLStyles_NumberFormatType )
( declare SpreadsheetMLStyles_ExcelNumberFormatType )
( declare SpreadsheetMLStyles_NamesType )
( declare SpreadsheetMLStyles_NamedRange )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SpreadsheetMLStyles ( struct-map
	KM3_Package
	:contents[( def DisplayDrawingObjectsType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ddot_displayShapes"
		:location "396:3-396:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_placeHolders"
		:location "397:3-397:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_hideAll"
		:location "398:3-398:24"
	)] ) ) ( def CalculationWorkbookType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cwt_automaticCalculation"
		:location "403:3-403:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_manualCalculation"
		:location "404:3-404:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_semiAutomaticCalculation"
		:location "405:3-405:40"
	)] ) ) ( def ExcelWorksheetTypeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ewt_Worksheet"
		:location "548:3-548:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Chart"
		:location "549:3-549:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Macro"
		:location "550:3-550:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Dialog"
		:location "551:3-551:22"
	)] ) ) ( def VisibleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vt_SheetVisible"
		:location "556:3-556:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "vt_SheetHidden"
		:location "557:3-557:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "vt_SheetVeryHidden"
		:location "558:3-558:30"
	)] ) ) ( def EnableSelectionType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "est_UnlockedCells"
		:location "564:3-564:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "est_NoSelection"
		:location "565:3-565:27"
	)] ) ) ( def OrientationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ot_Landscape"
		:location "603:3-603:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ot_Portrait"
		:location "604:3-604:23"
	)] ) ) ( def CommentsLayoutType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "clt_InPlace"
		:location "676:3-676:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "clt_PrintNone"
		:location "677:3-677:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "clt_SheetEnd"
		:location "678:3-678:24"
	)] ) ) ( def HorizontalAlignementType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "hat_CenterAcrossSelection"
		:location "754:3-754:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Fill"
		:location "755:3-755:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Left"
		:location "756:3-756:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Right"
		:location "757:3-757:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Justify"
		:location "758:3-758:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Distributed"
		:location "759:3-759:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Center"
		:location "760:3-760:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_Automatic"
		:location "761:3-761:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "hat_JustifyDistributed"
		:location "762:3-762:34"
	)] ) ) ( def ReadingOrderType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rot_RightToLeft"
		:location "767:3-767:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "rot_LeftToRight"
		:location "768:3-768:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "rot_Context"
		:location "769:3-769:23"
	)] ) ) ( def VerticalAlignementType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vat_Top"
		:location "774:3-774:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Bottom"
		:location "775:3-775:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Justify"
		:location "776:3-776:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Distributed"
		:location "777:3-777:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Center"
		:location "778:3-778:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Automatic"
		:location "779:3-779:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_JustifyDistributed"
		:location "780:3-780:34"
	)] ) ) ( def PositionType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pt_Left"
		:location "811:3-811:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Top"
		:location "812:3-812:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Right"
		:location "813:3-813:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Bottom"
		:location "814:3-814:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_DiagonalLeft"
		:location "815:3-815:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_DiagonalRight"
		:location "816:3-816:28"
	)] ) ) ( def LineStyleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "lst_None"
		:location "821:3-821:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_Continuous"
		:location "822:3-822:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_Dash"
		:location "823:3-823:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_Dot"
		:location "824:3-824:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_DashDot"
		:location "825:3-825:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_DashDotDot"
		:location "826:3-826:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_SlantDashDot"
		:location "827:3-827:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "lst_Double"
		:location "828:3-828:22"
	)] ) ) ( def UnderlineType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ut_None"
		:location "863:3-863:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ut_Single"
		:location "864:3-864:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ut_Double"
		:location "865:3-865:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ut_SingleAccounting"
		:location "866:3-866:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ut_DoubleAccounting"
		:location "867:3-867:31"
	)] ) ) ( def VerticalAlignType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vat_None"
		:location "872:3-872:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Subscript"
		:location "873:3-873:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "vat_Superscript"
		:location "874:3-874:27"
	)] ) ) ( def PatternType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pt_None"
		:location "895:3-895:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Solid"
		:location "896:3-896:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Gray75"
		:location "897:3-897:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Gray50"
		:location "898:3-898:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Gray25"
		:location "899:3-899:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Gray125"
		:location "900:3-900:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_Gray0625"
		:location "901:3-901:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_HorzStripe"
		:location "902:3-902:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_VertStripe"
		:location "903:3-903:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ReverseDiagStripe"
		:location "904:3-904:32"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_DiagStripe"
		:location "905:3-905:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_DiagCross"
		:location "906:3-906:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThickDiagCross"
		:location "907:3-907:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinHorzStripe"
		:location "908:3-908:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinVertStripe"
		:location "909:3-909:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinReverseDiagStripe"
		:location "910:3-910:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinDiagStripe"
		:location "911:3-911:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinHorzCross"
		:location "912:3-912:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_ThinDiagCross"
		:location "913:3-913:28"
	)] ) ) ( def ExcelNumberFormatType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "enft_General"
		:location "930:3-930:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_General_Number"
		:location "931:3-931:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_General_Date"
		:location "932:3-932:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Long_Date"
		:location "933:3-933:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Medium_Date"
		:location "934:3-934:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Short_Date"
		:location "935:3-935:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Long_Time"
		:location "936:3-936:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Medium_Time"
		:location "937:3-937:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Short_Time"
		:location "938:3-938:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Currency"
		:location "939:3-939:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Euro_Currency"
		:location "940:3-940:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Fixed"
		:location "941:3-941:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Standard"
		:location "942:3-942:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Percent"
		:location "943:3-943:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Scientific"
		:location "944:3-944:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_Yes_No"
		:location "945:3-945:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_True_False"
		:location "946:3-946:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "enft_On_Off"
		:location "947:3-947:23"
	)] ) ) ( def SpreadsheetMLStyles_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def SpreadsheetMLStyles_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def SpreadsheetMLStyles_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vt_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_ValueType
			:type SpreadsheetMLStyles_Data
			:location "32:3-32:45"
			:isContainer false
			:opposite value
		)]
	) ) ( def SpreadsheetMLStyles_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StringValue
			:type String
			:location "36:3-36:28"
		)]
	) ) ( def SpreadsheetMLStyles_NumberValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_NumberValue
			:type Double
			:location "40:3-40:28"
		)]
	) ) ( def SpreadsheetMLStyles_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DateTimeTypeValue
			:type SpreadsheetMLStyles_DateTimeType
			:location "44:3-44:44"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLStyles_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_BooleanValue
			:type Boolean
			:location "48:3-48:29"
		)]
	) ) ( def SpreadsheetMLStyles_ErrorValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ValueType]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLStyles_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "64:3-64:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "66:3-66:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "70:3-70:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "72:3-72:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "74:3-74:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "76:3-76:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "80:3-80:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "82:3-82:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "84:3-84:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "86:3-86:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "88:3-88:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type String
			:location "90:3-90:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "94:3-94:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "112:3-112:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type Integer
			:location "114:3-114:39"
		) ( struct-map
			KM3_Reference
			:name "dp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type SpreadsheetMLStyles_Workbook
			:location "61:3-61:64"
			:isContainer false
			:opposite wb_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type SpreadsheetMLStyles_VersionType
			:location "92:3-92:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type SpreadsheetMLStyles_DateTimeType
			:location "96:3-96:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type SpreadsheetMLStyles_DateTimeType
			:location "98:3-98:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_DocumentPropertiesCollection
			:type SpreadsheetMLStyles_DateTimeType
			:location "100:3-100:53"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLStyles_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_CustomDocumentPropertiesCollection
			:type SpreadsheetMLStyles_Workbook
			:location "119:3-119:71"
			:isContainer false
			:opposite wb_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_CustomDocumentPropertiesCollection
			:type SpreadsheetMLStyles_CustomDocumentProperty
			:location "121:3-121:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def SpreadsheetMLStyles_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_CustomDocumentProperty
			:type String
			:location "127:3-127:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_CustomDocumentProperty
			:type SpreadsheetMLStyles_CustomDocumentPropertiesCollection
			:location "126:3-126:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_CustomDocumentProperty
			:type SpreadsheetMLStyles_ValueType
			:location "129:3-129:41"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLStyles_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagType
			:type String
			:location "137:3-137:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagType
			:type String
			:location "139:3-139:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagType
			:type String
			:location "141:3-141:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagType
			:type SpreadsheetMLStyles_SmartTagsCollection
			:location "134:3-134:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def SpreadsheetMLStyles_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagsCollection
			:type SpreadsheetMLStyles_Workbook
			:location "146:3-146:60"
			:isContainer false
			:opposite wb_smartTags
		) ( struct-map
			KM3_Reference
			:name "st_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagsCollection
			:type SpreadsheetMLStyles_Cell
			:location "147:3-147:51"
			:isContainer false
			:opposite c_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_SmartTagsCollection
			:type SpreadsheetMLStyles_SmartTagType
			:location "149:3-149:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def SpreadsheetMLStyles_Workbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wb_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_SmartTagsCollection
			:location "160:3-160:86"
			:isContainer true
			:opposite st_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_DocumentPropertiesCollection
			:location "161:3-161:99"
			:isContainer true
			:opposite dp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_CustomDocumentPropertiesCollection
			:location "162:3-162:112"
			:isContainer true
			:opposite cdp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_excelWorkbook"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_ExcelWorkbook
			:location "165:3-165:84"
			:isContainer true
			:opposite ew_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_styles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_StylesCollection
			:location "168:3-168:79"
			:isContainer true
			:opposite s_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_names"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_NamesType
			:location "171:3-171:72"
			:isContainer true
			:opposite nt_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_worksheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_Workbook
			:type SpreadsheetMLStyles_Worksheet
			:location "174:3-174:83"
			:isContainer true
			:opposite ws_workbook
		)]
	) ) ( def SpreadsheetMLStyles_Worksheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type String
			:location "185:3-185:27"
		) ( struct-map
			KM3_Attribute
			:name "protected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type Boolean
			:location "187:3-187:38"
		) ( struct-map
			KM3_Attribute
			:name "rightToLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type Boolean
			:location "189:3-189:40"
		) ( struct-map
			KM3_Reference
			:name "ws_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type SpreadsheetMLStyles_Workbook
			:location "179:3-179:61"
			:isContainer false
			:opposite wb_worksheets
		) ( struct-map
			KM3_Reference
			:name "ws_table"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type SpreadsheetMLStyles_Table
			:location "182:3-182:68"
			:isContainer true
			:opposite t_worksheet
		) ( struct-map
			KM3_Reference
			:name "w_worksheetOptions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Worksheet
			:type SpreadsheetMLStyles_WorksheetOptionsElt
			:location "192:3-192:93"
			:isContainer true
			:opposite wo_worksheet
		)]
	) ) ( def SpreadsheetMLStyles_StyledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "styleID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyledElement
			:type SpreadsheetMLStyles_StyleType
			:location "201:3-201:66"
			:isContainer false
			:opposite st_styledElement
		)]
	) ) ( def SpreadsheetMLStyles_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Double
			:location "213:3-213:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Double
			:location "215:3-215:44"
		) ( struct-map
			KM3_Attribute
			:name "expandedColumnCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Integer
			:location "217:3-217:48"
		) ( struct-map
			KM3_Attribute
			:name "expandedRowCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Integer
			:location "219:3-219:45"
		) ( struct-map
			KM3_Attribute
			:name "leftCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Integer
			:location "221:3-221:37"
		) ( struct-map
			KM3_Attribute
			:name "topCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Integer
			:location "223:3-223:36"
		) ( struct-map
			KM3_Attribute
			:name "fullColumns"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Boolean
			:location "225:3-225:40"
		) ( struct-map
			KM3_Attribute
			:name "fullRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type Boolean
			:location "227:3-227:37"
		) ( struct-map
			KM3_Reference
			:name "t_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Table
			:type SpreadsheetMLStyles_Worksheet
			:location "206:3-206:58"
			:isContainer false
			:opposite ws_table
		) ( struct-map
			KM3_Reference
			:name "t_cols"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_Table
			:type SpreadsheetMLStyles_Column
			:location "209:3-209:69"
			:isContainer true
			:opposite c_table
		) ( struct-map
			KM3_Reference
			:name "t_rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_Table
			:type SpreadsheetMLStyles_Row
			:location "210:3-210:66"
			:isContainer true
			:opposite r_table
		)]
	) ) ( def SpreadsheetMLStyles_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLStyles_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_TableElement
			:type Integer
			:location "233:3-233:34"
		)]
	) ) ( def SpreadsheetMLStyles_ColOrRowElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLStyles_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ColOrRowElement
			:type Boolean
			:location "239:3-239:35"
		) ( struct-map
			KM3_Attribute
			:name "span"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ColOrRowElement
			:type Integer
			:location "241:3-241:33"
		)]
	) ) ( def SpreadsheetMLStyles_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Column
			:type Boolean
			:location "249:3-249:41"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Column
			:type Double
			:location "251:3-251:33"
		) ( struct-map
			KM3_Reference
			:name "c_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Column
			:type SpreadsheetMLStyles_Table
			:location "246:3-246:47"
			:isContainer false
			:opposite t_cols
		)]
	) ) ( def SpreadsheetMLStyles_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Row
			:type Boolean
			:location "262:3-262:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Row
			:type Double
			:location "264:3-264:34"
		) ( struct-map
			KM3_Reference
			:name "r_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Row
			:type SpreadsheetMLStyles_Table
			:location "256:3-256:47"
			:isContainer false
			:opposite t_rows
		) ( struct-map
			KM3_Reference
			:name "r_cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_Row
			:type SpreadsheetMLStyles_Cell
			:location "259:3-259:66"
			:isContainer true
			:opposite c_row
		)]
	) ) ( def SpreadsheetMLStyles_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arrayRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type String
			:location "275:3-275:38"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type String
			:location "277:3-277:35"
		) ( struct-map
			KM3_Attribute
			:name "hRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type String
			:location "279:3-279:32"
		) ( struct-map
			KM3_Attribute
			:name "mergeAcross"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type Double
			:location "281:3-281:39"
		) ( struct-map
			KM3_Attribute
			:name "mergeDown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type Double
			:location "283:3-283:37"
		) ( struct-map
			KM3_Reference
			:name "c_smartTags"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type SpreadsheetMLStyles_SmartTagsCollection
			:location "269:3-269:79"
			:isContainer true
			:opposite st_cell
		) ( struct-map
			KM3_Reference
			:name "c_row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type SpreadsheetMLStyles_Row
			:location "272:3-272:44"
			:isContainer false
			:opposite r_cells
		) ( struct-map
			KM3_Reference
			:name "c_data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type SpreadsheetMLStyles_Data
			:location "285:3-285:60"
			:isContainer true
			:opposite d_cell
		) ( struct-map
			KM3_Reference
			:name "c_comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Cell
			:type SpreadsheetMLStyles_Comment
			:location "287:3-287:66"
			:isContainer true
			:opposite c_cell
		)]
	) ) ( def SpreadsheetMLStyles_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Comment
			:type String
			:location "297:3-297:34"
		) ( struct-map
			KM3_Attribute
			:name "showAlways"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Comment
			:type Boolean
			:location "299:3-299:39"
		) ( struct-map
			KM3_Reference
			:name "c_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Comment
			:type SpreadsheetMLStyles_Cell
			:location "292:3-292:48"
			:isContainer false
			:opposite c_comment
		) ( struct-map
			KM3_Reference
			:name "com_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Comment
			:type SpreadsheetMLStyles_Data
			:location "295:3-295:60"
			:isContainer true
			:opposite d_comment
		)]
	) ) ( def SpreadsheetMLStyles_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "d_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Data
			:type SpreadsheetMLStyles_Cell
			:location "304:3-304:45"
			:isContainer false
			:opposite c_data
		) ( struct-map
			KM3_Reference
			:name "d_comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Data
			:type SpreadsheetMLStyles_Comment
			:location "305:3-305:53"
			:isContainer false
			:opposite com_data
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Data
			:type SpreadsheetMLStyles_ValueType
			:location "308:3-308:60"
			:isContainer true
			:opposite vt_data
		)]
	) ) ( def SpreadsheetMLStyles_ExcelWorkbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "selectedSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Integer
			:location "324:3-324:43"
		) ( struct-map
			KM3_Attribute
			:name "windowHidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "326:3-326:41"
		) ( struct-map
			KM3_Attribute
			:name "hideHorizontalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "328:3-328:52"
		) ( struct-map
			KM3_Attribute
			:name "hideVerticalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "330:3-330:50"
		) ( struct-map
			KM3_Attribute
			:name "hideWorkbookTabs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "332:3-332:45"
		) ( struct-map
			KM3_Attribute
			:name "windowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Double
			:location "334:3-334:40"
		) ( struct-map
			KM3_Attribute
			:name "windowWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Double
			:location "336:3-336:39"
		) ( struct-map
			KM3_Attribute
			:name "windowTopX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Double
			:location "338:3-338:38"
		) ( struct-map
			KM3_Attribute
			:name "windowTopY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Double
			:location "340:3-340:38"
		) ( struct-map
			KM3_Attribute
			:name "activeSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Integer
			:location "342:3-342:40"
		) ( struct-map
			KM3_Attribute
			:name "activeChart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type String
			:location "344:3-344:39"
		) ( struct-map
			KM3_Attribute
			:name "firstVisibleSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Integer
			:location "346:3-346:46"
		) ( struct-map
			KM3_Attribute
			:name "hidePivotTableFieldList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "348:3-348:52"
		) ( struct-map
			KM3_Attribute
			:name "protectStructure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "350:3-350:45"
		) ( struct-map
			KM3_Attribute
			:name "protectWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "352:3-352:43"
		) ( struct-map
			KM3_Attribute
			:name "displayInkNotes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "354:3-354:44"
		) ( struct-map
			KM3_Attribute
			:name "embedSaveSmartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "356:3-356:47"
		) ( struct-map
			KM3_Attribute
			:name "futureVer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type String
			:location "358:3-358:37"
		) ( struct-map
			KM3_Attribute
			:name "tabRatio"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Integer
			:location "360:3-360:37"
		) ( struct-map
			KM3_Attribute
			:name "windowIconic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "362:3-362:41"
		) ( struct-map
			KM3_Attribute
			:name "displayDrawingObjects"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type DisplayDrawingObjectsType
			:location "364:3-364:68"
		) ( struct-map
			KM3_Attribute
			:name "createBackup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "366:3-366:41"
		) ( struct-map
			KM3_Attribute
			:name "calculation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type CalculationWorkbookType
			:location "368:3-368:56"
		) ( struct-map
			KM3_Attribute
			:name "doNotCalculateBeforeSave"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "370:3-370:53"
		) ( struct-map
			KM3_Attribute
			:name "date1904"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "372:3-372:37"
		) ( struct-map
			KM3_Attribute
			:name "refModeR1C1"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "374:3-374:40"
		) ( struct-map
			KM3_Attribute
			:name "iteration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "376:3-376:38"
		) ( struct-map
			KM3_Attribute
			:name "maxIterations"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Integer
			:location "378:3-378:42"
		) ( struct-map
			KM3_Attribute
			:name "maxChange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Double
			:location "380:3-380:37"
		) ( struct-map
			KM3_Attribute
			:name "precisionAsDisplayed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "382:3-382:49"
		) ( struct-map
			KM3_Attribute
			:name "doNotSaveLinkValues"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "384:3-384:48"
		) ( struct-map
			KM3_Attribute
			:name "noAutoRecover"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "386:3-386:42"
		) ( struct-map
			KM3_Attribute
			:name "acceptLabelsInFormulas"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "388:3-388:51"
		) ( struct-map
			KM3_Attribute
			:name "uncalced"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type Boolean
			:location "390:3-390:37"
		) ( struct-map
			KM3_Reference
			:name "ew_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_ExcelWorkbook
			:type SpreadsheetMLStyles_Workbook
			:location "319:3-319:64"
			:isContainer false
			:opposite wb_excelWorkbook
		)]
	) ) ( def SpreadsheetMLStyles_WorksheetOptionsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fitToPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "418:3-418:38"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayColHeaders"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "420:3-420:51"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayRowHeaders"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "422:3-422:51"
		) ( struct-map
			KM3_Attribute
			:name "gridlineColor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type String
			:location "424:3-424:41"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type String
			:location "426:3-426:32"
		) ( struct-map
			KM3_Attribute
			:name "excelWorksheetType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type ExcelWorksheetTypeType
			:location "428:3-428:62"
		) ( struct-map
			KM3_Attribute
			:name "intlMacro"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "430:3-430:38"
		) ( struct-map
			KM3_Attribute
			:name "unsynced"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "432:3-432:37"
		) ( struct-map
			KM3_Attribute
			:name "selected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "434:3-434:37"
		) ( struct-map
			KM3_Attribute
			:name "codeName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type String
			:location "436:3-436:36"
		) ( struct-map
			KM3_Attribute
			:name "displayPageBreak"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "438:3-438:45"
		) ( struct-map
			KM3_Attribute
			:name "transitionExpressionEvaluation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "440:3-440:59"
		) ( struct-map
			KM3_Attribute
			:name "transitionFormulaEntry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "442:3-442:51"
		) ( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "444:3-444:33"
		) ( struct-map
			KM3_Attribute
			:name "pageBreakZoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "446:3-446:42"
		) ( struct-map
			KM3_Attribute
			:name "showPageBreakZoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "448:3-448:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "450:3-450:45"
		) ( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "452:3-452:47"
		) ( struct-map
			KM3_Attribute
			:name "standardWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "454:3-454:42"
		) ( struct-map
			KM3_Attribute
			:name "visible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type VisibleType
			:location "456:3-456:40"
		) ( struct-map
			KM3_Attribute
			:name "leftColumnVisible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "458:3-458:46"
		) ( struct-map
			KM3_Attribute
			:name "displayRightToLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "460:3-460:47"
		) ( struct-map
			KM3_Attribute
			:name "gridlineColorIndex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "462:3-462:47"
		) ( struct-map
			KM3_Attribute
			:name "displayFormulas"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "464:3-464:44"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayGridlines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "466:3-466:50"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayHeadings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "468:3-468:49"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayOutline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "470:3-470:48"
		) ( struct-map
			KM3_Attribute
			:name "applyAutomaticOutlineStyles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "472:3-472:56"
		) ( struct-map
			KM3_Attribute
			:name "noSummaryRowsBelowDetail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "474:3-474:53"
		) ( struct-map
			KM3_Attribute
			:name "noSummaryColumnsRightDetail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "476:3-476:56"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayZeros"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "478:3-478:46"
		) ( struct-map
			KM3_Attribute
			:name "activeRow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "480:3-480:38"
		) ( struct-map
			KM3_Attribute
			:name "activeColumn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "482:3-482:41"
		) ( struct-map
			KM3_Attribute
			:name "filterOn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "484:3-484:37"
		) ( struct-map
			KM3_Attribute
			:name "rangeSelection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type String
			:location "486:3-486:42"
		) ( struct-map
			KM3_Attribute
			:name "topRowVisible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "488:3-488:42"
		) ( struct-map
			KM3_Attribute
			:name "topRowBottomPane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "490:3-490:45"
		) ( struct-map
			KM3_Attribute
			:name "leftColumnRightPane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "492:3-492:48"
		) ( struct-map
			KM3_Attribute
			:name "activePane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "494:3-494:39"
		) ( struct-map
			KM3_Attribute
			:name "splitHorizontal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "496:3-496:44"
		) ( struct-map
			KM3_Attribute
			:name "splitVertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "498:3-498:42"
		) ( struct-map
			KM3_Attribute
			:name "freezePanes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "500:3-500:40"
		) ( struct-map
			KM3_Attribute
			:name "frozenNoSplit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "502:3-502:42"
		) ( struct-map
			KM3_Attribute
			:name "tabColorIndex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Integer
			:location "504:3-504:42"
		) ( struct-map
			KM3_Attribute
			:name "protectContentst"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "506:3-506:45"
		) ( struct-map
			KM3_Attribute
			:name "protectObjects"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "508:3-508:43"
		) ( struct-map
			KM3_Attribute
			:name "protectScenarios"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "510:3-510:45"
		) ( struct-map
			KM3_Attribute
			:name "enableSelection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type EnableSelectionType
			:location "512:3-512:56"
		) ( struct-map
			KM3_Attribute
			:name "allowFormatCells"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "514:3-514:45"
		) ( struct-map
			KM3_Attribute
			:name "allowSizeCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "516:3-516:42"
		) ( struct-map
			KM3_Attribute
			:name "allowSizeRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "518:3-518:42"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "520:3-520:44"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "522:3-522:44"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertHyperlinks"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "524:3-524:50"
		) ( struct-map
			KM3_Attribute
			:name "allowDeleteCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "526:3-526:44"
		) ( struct-map
			KM3_Attribute
			:name "allowDeleteRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "528:3-528:44"
		) ( struct-map
			KM3_Attribute
			:name "allowSort"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "530:3-530:38"
		) ( struct-map
			KM3_Attribute
			:name "allowFilter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "532:3-532:40"
		) ( struct-map
			KM3_Attribute
			:name "allowUsePivotTables"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type Boolean
			:location "534:3-534:48"
		) ( struct-map
			KM3_Reference
			:name "wo_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type SpreadsheetMLStyles_Worksheet
			:location "415:3-415:68"
			:isContainer false
			:opposite w_worksheetOptions
		) ( struct-map
			KM3_Reference
			:name "wo_pageSetup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type SpreadsheetMLStyles_PageSetup
			:location "537:3-537:84"
			:isContainer true
			:opposite ps_worksheetOptions
		) ( struct-map
			KM3_Reference
			:name "wo_print"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_WorksheetOptionsElt
			:type SpreadsheetMLStyles_Print
			:location "539:3-539:75"
			:isContainer true
			:opposite p_worksheetOptions
		)]
	) ) ( def SpreadsheetMLStyles_PageSetup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_worksheetOptions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_PageSetup
			:type SpreadsheetMLStyles_WorksheetOptionsElt
			:location "575:3-575:79"
			:isContainer false
			:opposite wo_pageSetup
		) ( struct-map
			KM3_Reference
			:name "ps_layout"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageSetup
			:type SpreadsheetMLStyles_Layout
			:location "578:3-578:70"
			:isContainer true
			:opposite l_pageSetup
		) ( struct-map
			KM3_Reference
			:name "ps_header"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageSetup
			:type SpreadsheetMLStyles_Header
			:location "580:3-580:70"
			:isContainer true
			:opposite h_pageSetup
		) ( struct-map
			KM3_Reference
			:name "ps_footer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageSetup
			:type SpreadsheetMLStyles_Footer
			:location "582:3-582:70"
			:isContainer true
			:opposite f_pageSetup
		) ( struct-map
			KM3_Reference
			:name "ps_pageMargins"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageSetup
			:type SpreadsheetMLStyles_PageMarginsInfo
			:location "584:3-584:85"
			:isContainer true
			:opposite pm_pageSetup
		)]
	) ) ( def SpreadsheetMLStyles_Layout ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "orientation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Layout
			:type OrientationType
			:location "592:3-592:48"
		) ( struct-map
			KM3_Attribute
			:name "centerHorizontal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Layout
			:type Boolean
			:location "594:3-594:45"
		) ( struct-map
			KM3_Attribute
			:name "centerVertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Layout
			:type Boolean
			:location "596:3-596:43"
		) ( struct-map
			KM3_Attribute
			:name "startPageNumber"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Layout
			:type String
			:location "598:3-598:43"
		) ( struct-map
			KM3_Reference
			:name "l_pageSetup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Layout
			:type SpreadsheetMLStyles_PageSetup
			:location "589:3-589:58"
			:isContainer false
			:opposite ps_layout
		)]
	) ) ( def SpreadsheetMLStyles_HeaderOrFooterElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "margin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_HeaderOrFooterElt
			:type Double
			:location "610:3-610:34"
		) ( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_HeaderOrFooterElt
			:type String
			:location "612:3-612:32"
		)]
	) ) ( def SpreadsheetMLStyles_Header ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_HeaderOrFooterElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "h_pageSetup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Header
			:type SpreadsheetMLStyles_PageSetup
			:location "617:3-617:58"
			:isContainer false
			:opposite ps_header
		)]
	) ) ( def SpreadsheetMLStyles_Footer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLStyles_HeaderOrFooterElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "f_pageSetup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Footer
			:type SpreadsheetMLStyles_PageSetup
			:location "622:3-622:58"
			:isContainer false
			:opposite ps_footer
		)]
	) ) ( def SpreadsheetMLStyles_PageMarginsInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "left"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageMarginsInfo
			:type Double
			:location "630:3-630:32"
		) ( struct-map
			KM3_Attribute
			:name "right"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageMarginsInfo
			:type Double
			:location "632:3-632:33"
		) ( struct-map
			KM3_Attribute
			:name "top"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageMarginsInfo
			:type Double
			:location "634:3-634:31"
		) ( struct-map
			KM3_Attribute
			:name "bottom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_PageMarginsInfo
			:type Double
			:location "636:3-636:34"
		) ( struct-map
			KM3_Reference
			:name "pm_pageSetup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_PageMarginsInfo
			:type SpreadsheetMLStyles_PageSetup
			:location "627:3-627:64"
			:isContainer false
			:opposite ps_pageMargins
		)]
	) ) ( def SpreadsheetMLStyles_Print ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "644:3-644:37"
		) ( struct-map
			KM3_Attribute
			:name "fitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "646:3-646:38"
		) ( struct-map
			KM3_Attribute
			:name "leftToRight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "648:3-648:40"
		) ( struct-map
			KM3_Attribute
			:name "blackAndWhite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "650:3-650:42"
		) ( struct-map
			KM3_Attribute
			:name "draftQuality"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "652:3-652:41"
		) ( struct-map
			KM3_Attribute
			:name "commentsLayout"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type CommentsLayoutType
			:location "654:3-654:54"
		) ( struct-map
			KM3_Attribute
			:name "scale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "656:3-656:34"
		) ( struct-map
			KM3_Attribute
			:name "printErrors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type String
			:location "658:3-658:39"
		) ( struct-map
			KM3_Attribute
			:name "validPrinterInfo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "660:3-660:45"
		) ( struct-map
			KM3_Attribute
			:name "paperSizeIndex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "662:3-662:43"
		) ( struct-map
			KM3_Attribute
			:name "horizontalResolution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "664:3-664:49"
		) ( struct-map
			KM3_Attribute
			:name "verticalResolution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "666:3-666:47"
		) ( struct-map
			KM3_Attribute
			:name "gridlines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "668:3-668:38"
		) ( struct-map
			KM3_Attribute
			:name "numberOfCopies"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Integer
			:location "670:3-670:43"
		) ( struct-map
			KM3_Attribute
			:name "rowColHeadings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type Boolean
			:location "672:3-672:43"
		) ( struct-map
			KM3_Reference
			:name "p_worksheetOptions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_Print
			:type SpreadsheetMLStyles_WorksheetOptionsElt
			:location "641:3-641:74"
			:isContainer false
			:opposite wo_print
		)]
	) ) ( def SpreadsheetMLStyles_StylesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "s_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StylesCollection
			:type SpreadsheetMLStyles_Workbook
			:location "688:3-688:56"
			:isContainer false
			:opposite wb_styles
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StylesCollection
			:type SpreadsheetMLStyles_StyleType
			:location "691:3-691:65"
			:isContainer true
			:opposite st_styles
		)]
	) ) ( def SpreadsheetMLStyles_StyleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type String
			:location "700:3-700:25"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type String
			:location "702:3-702:32"
		) ( struct-map
			KM3_Reference
			:name "st_styles"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_StylesCollection
			:location "696:3-696:59"
			:isContainer false
			:opposite style
		) ( struct-map
			KM3_Reference
			:name "st_styledElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_StyledElement
			:location "697:3-697:65"
			:isContainer false
			:opposite styleID
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_StyleType
			:location "704:3-704:58"
			:isContainer false
			:opposite st_parent
		) ( struct-map
			KM3_Reference
			:name "st_parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_StyleType
			:location "705:3-705:53"
			:isContainer false
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "alignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_AlignmentType
			:location "707:3-707:78"
			:isContainer true
			:opposite at_styleType
		) ( struct-map
			KM3_Reference
			:name "borders"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_BordersType
			:location "709:3-709:74"
			:isContainer true
			:opposite bt_styleType
		) ( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_FontType
			:location "711:3-711:68"
			:isContainer true
			:opposite ft_styleType
		) ( struct-map
			KM3_Reference
			:name "interior"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_InteriorType
			:location "713:3-713:76"
			:isContainer true
			:opposite it_styleType
		) ( struct-map
			KM3_Reference
			:name "numberFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_NumberFormatType
			:location "715:3-715:85"
			:isContainer true
			:opposite nft_styleType
		) ( struct-map
			KM3_Reference
			:name "protection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_StyleType
			:type SpreadsheetMLStyles_ProtectionType
			:location "717:3-717:80"
			:isContainer true
			:opposite pt_styleType
		)]
	) ) ( def SpreadsheetMLStyles_ProtectionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "protected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_ProtectionType
			:type Boolean
			:location "725:3-725:38"
		) ( struct-map
			KM3_Reference
			:name "pt_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_ProtectionType
			:type SpreadsheetMLStyles_StyleType
			:location "722:3-722:60"
			:isContainer false
			:opposite protection
		)]
	) ) ( def SpreadsheetMLStyles_AlignmentType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "horizontal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type HorizontalAlignementType
			:location "735:3-735:56"
		) ( struct-map
			KM3_Attribute
			:name "readingOrder"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type ReadingOrderType
			:location "737:3-737:50"
		) ( struct-map
			KM3_Attribute
			:name "indent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type Double
			:location "739:3-739:34"
		) ( struct-map
			KM3_Attribute
			:name "rotate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type Double
			:location "741:3-741:34"
		) ( struct-map
			KM3_Attribute
			:name "shrinkToFit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type Boolean
			:location "743:3-743:40"
		) ( struct-map
			KM3_Attribute
			:name "vertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type VerticalAlignementType
			:location "745:3-745:52"
		) ( struct-map
			KM3_Attribute
			:name "verticalText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type Boolean
			:location "747:3-747:41"
		) ( struct-map
			KM3_Attribute
			:name "wrapText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type Boolean
			:location "749:3-749:37"
		) ( struct-map
			KM3_Reference
			:name "at_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_AlignmentType
			:type SpreadsheetMLStyles_StyleType
			:location "732:3-732:59"
			:isContainer false
			:opposite alignment
		)]
	) ) ( def SpreadsheetMLStyles_BordersType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bt_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_BordersType
			:type SpreadsheetMLStyles_StyleType
			:location "789:3-789:57"
			:isContainer false
			:opposite borders
		) ( struct-map
			KM3_Reference
			:name "border"
			:upper 6
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_BordersType
			:type SpreadsheetMLStyles_BorderType
			:location "792:3-792:82"
			:isContainer true
			:opposite bt_bordersType
		)]
	) ) ( def SpreadsheetMLStyles_BorderType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_BorderType
			:type PositionType
			:location "800:3-800:37"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_BorderType
			:type String
			:location "802:3-802:33"
		) ( struct-map
			KM3_Attribute
			:name "lineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_BorderType
			:type LineStyleType
			:location "804:3-804:44"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_BorderType
			:type Double
			:location "806:3-806:34"
		) ( struct-map
			KM3_Reference
			:name "bt_bordersType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_BorderType
			:type SpreadsheetMLStyles_BordersType
			:location "797:3-797:60"
			:isContainer false
			:opposite border
		)]
	) ) ( def SpreadsheetMLStyles_FontType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bold"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Boolean
			:location "840:3-840:33"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type String
			:location "842:3-842:33"
		) ( struct-map
			KM3_Attribute
			:name "fontName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type String
			:location "844:3-844:36"
		) ( struct-map
			KM3_Attribute
			:name "italic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Boolean
			:location "846:3-846:35"
		) ( struct-map
			KM3_Attribute
			:name "outline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Boolean
			:location "848:3-848:36"
		) ( struct-map
			KM3_Attribute
			:name "shadow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Boolean
			:location "850:3-850:35"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Double
			:location "852:3-852:32"
		) ( struct-map
			KM3_Attribute
			:name "strikeThrough"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type Boolean
			:location "854:3-854:42"
		) ( struct-map
			KM3_Attribute
			:name "underline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type UnderlineType
			:location "856:3-856:44"
		) ( struct-map
			KM3_Attribute
			:name "verticalAlign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type VerticalAlignType
			:location "858:3-858:52"
		) ( struct-map
			KM3_Reference
			:name "ft_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_FontType
			:type SpreadsheetMLStyles_StyleType
			:location "837:3-837:54"
			:isContainer false
			:opposite font
		)]
	) ) ( def SpreadsheetMLStyles_InteriorType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_InteriorType
			:type String
			:location "886:3-886:33"
		) ( struct-map
			KM3_Attribute
			:name "pattern"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_InteriorType
			:type PatternType
			:location "888:3-888:40"
		) ( struct-map
			KM3_Attribute
			:name "patternColor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_InteriorType
			:type String
			:location "890:3-890:40"
		) ( struct-map
			KM3_Reference
			:name "it_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_InteriorType
			:type SpreadsheetMLStyles_StyleType
			:location "883:3-883:58"
			:isContainer false
			:opposite interior
		)]
	) ) ( def SpreadsheetMLStyles_NumberFormatType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "format"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_NumberFormatType
			:type ExcelNumberFormatType
			:location "925:3-925:49"
		) ( struct-map
			KM3_Reference
			:name "nft_styleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_NumberFormatType
			:type SpreadsheetMLStyles_StyleType
			:location "922:3-922:63"
			:isContainer false
			:opposite numberFormat
		)]
	) ) ( def SpreadsheetMLStyles_NamesType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nt_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_NamesType
			:type SpreadsheetMLStyles_Workbook
			:location "959:3-959:56"
			:isContainer false
			:opposite wb_names
		) ( struct-map
			KM3_Reference
			:name "namedRanges"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLStyles_NamesType
			:type SpreadsheetMLStyles_NamedRange
			:location "961:3-961:83"
			:isContainer true
			:opposite nr_namesType
		)]
	) ) ( def SpreadsheetMLStyles_NamedRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_NamedRange
			:type String
			:location "969:3-969:27"
		) ( struct-map
			KM3_Attribute
			:name "refersTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_NamedRange
			:type String
			:location "971:3-971:36"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLStyles_NamedRange
			:type Boolean
			:location "973:3-973:35"
		) ( struct-map
			KM3_Reference
			:name "nr_namesType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLStyles_NamedRange
			:type SpreadsheetMLStyles_NamesType
			:location "966:3-966:61"
			:isContainer false
			:opposite namedRanges
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "983:2-983:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "984:2-984:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "985:2-985:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "986:2-986:18"
	) )]
) )
