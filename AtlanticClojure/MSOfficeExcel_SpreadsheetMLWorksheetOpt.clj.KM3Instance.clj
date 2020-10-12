( declare SpreadsheetMLWorksheetOpt_DateTimeType )
( declare SpreadsheetMLWorksheetOpt_VersionType )
( declare SpreadsheetMLWorksheetOpt_ValueType )
( declare SpreadsheetMLWorksheetOpt_StringValue )
( declare SpreadsheetMLWorksheetOpt_NumberValue )
( declare SpreadsheetMLWorksheetOpt_DateTimeTypeValue )
( declare SpreadsheetMLWorksheetOpt_BooleanValue )
( declare SpreadsheetMLWorksheetOpt_ErrorValue )
( declare SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection )
( declare SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection )
( declare SpreadsheetMLWorksheetOpt_CustomDocumentProperty )
( declare SpreadsheetMLWorksheetOpt_SmartTagType )
( declare SpreadsheetMLWorksheetOpt_SmartTagsCollection )
( declare SpreadsheetMLWorksheetOpt_Workbook )
( declare SpreadsheetMLWorksheetOpt_Worksheet )
( declare SpreadsheetMLWorksheetOpt_StyledElement )
( declare SpreadsheetMLWorksheetOpt_Table )
( declare SpreadsheetMLWorksheetOpt_TableElement )
( declare SpreadsheetMLWorksheetOpt_ColOrRowElement )
( declare SpreadsheetMLWorksheetOpt_Column )
( declare SpreadsheetMLWorksheetOpt_Row )
( declare SpreadsheetMLWorksheetOpt_Cell )
( declare SpreadsheetMLWorksheetOpt_Comment )
( declare SpreadsheetMLWorksheetOpt_Data )
( declare SpreadsheetMLWorksheetOpt_ExcelWorkbook )
( declare SpreadsheetMLWorksheetOpt_DisplayDrawingObjectsType )
( declare SpreadsheetMLWorksheetOpt_CalculationWorkbookType )
( declare SpreadsheetMLWorksheetOpt_WorksheetOptionsElt )
( declare SpreadsheetMLWorksheetOpt_ExcelWorksheetTypeType )
( declare SpreadsheetMLWorksheetOpt_VisibleType )
( declare SpreadsheetMLWorksheetOpt_EnableSelectionType )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SpreadsheetMLWorksheetOpt ( struct-map
	KM3_Package
	:contents[( def DisplayDrawingObjectsType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ddot_displayShapes"
		:location "390:3-390:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_placeHolders"
		:location "391:3-391:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_hideAll"
		:location "392:3-392:24"
	)] ) ) ( def CalculationWorkbookType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cwt_automaticCalculation"
		:location "397:3-397:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_manualCalculation"
		:location "398:3-398:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_semiAutomaticCalculation"
		:location "399:3-399:40"
	)] ) ) ( def ExcelWorksheetTypeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ewt_Worksheet"
		:location "537:3-537:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Chart"
		:location "538:3-538:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Macro"
		:location "539:3-539:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ewt_Dialog"
		:location "540:3-540:22"
	)] ) ) ( def VisibleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vt_SheetVisible"
		:location "545:3-545:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "vt_SheetHidden"
		:location "546:3-546:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "vt_SheetVeryHidden"
		:location "547:3-547:30"
	)] ) ) ( def EnableSelectionType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "est_UnlockedCells"
		:location "553:3-553:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "est_NoSelection"
		:location "554:3-554:27"
	)] ) ) ( def SpreadsheetMLWorksheetOpt_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vt_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ValueType
			:type SpreadsheetMLWorksheetOpt_Data
			:location "32:3-32:45"
			:isContainer false
			:opposite value
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_StringValue
			:type String
			:location "36:3-36:28"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_NumberValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_NumberValue
			:type Double
			:location "40:3-40:28"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DateTimeTypeValue
			:type SpreadsheetMLWorksheetOpt_DateTimeType
			:location "44:3-44:44"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_BooleanValue
			:type Boolean
			:location "48:3-48:29"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_ErrorValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ValueType]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "64:3-64:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "66:3-66:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "70:3-70:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "72:3-72:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "74:3-74:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "76:3-76:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "80:3-80:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "82:3-82:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "84:3-84:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "86:3-86:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "88:3-88:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type String
			:location "90:3-90:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "94:3-94:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "112:3-112:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type Integer
			:location "114:3-114:39"
		) ( struct-map
			KM3_Reference
			:name "dp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_Workbook
			:location "61:3-61:64"
			:isContainer false
			:opposite wb_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_VersionType
			:location "92:3-92:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_DateTimeType
			:location "96:3-96:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_DateTimeType
			:location "98:3-98:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_DateTimeType
			:location "100:3-100:53"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_Workbook
			:location "119:3-119:71"
			:isContainer false
			:opposite wb_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection
			:type SpreadsheetMLWorksheetOpt_CustomDocumentProperty
			:location "121:3-121:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_CustomDocumentProperty
			:type String
			:location "127:3-127:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_CustomDocumentProperty
			:type SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection
			:location "126:3-126:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_CustomDocumentProperty
			:type SpreadsheetMLWorksheetOpt_ValueType
			:location "129:3-129:41"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagType
			:type String
			:location "137:3-137:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagType
			:type String
			:location "139:3-139:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagType
			:type String
			:location "141:3-141:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagType
			:type SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:location "134:3-134:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:type SpreadsheetMLWorksheetOpt_Workbook
			:location "146:3-146:60"
			:isContainer false
			:opposite wb_smartTags
		) ( struct-map
			KM3_Reference
			:name "st_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:type SpreadsheetMLWorksheetOpt_Cell
			:location "147:3-147:51"
			:isContainer false
			:opposite c_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:type SpreadsheetMLWorksheetOpt_SmartTagType
			:location "149:3-149:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Workbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wb_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Workbook
			:type SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:location "160:3-160:86"
			:isContainer true
			:opposite st_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Workbook
			:type SpreadsheetMLWorksheetOpt_DocumentPropertiesCollection
			:location "161:3-161:99"
			:isContainer true
			:opposite dp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Workbook
			:type SpreadsheetMLWorksheetOpt_CustomDocumentPropertiesCollection
			:location "162:3-162:112"
			:isContainer true
			:opposite cdp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_excelWorkbook"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Workbook
			:type SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:location "165:3-165:84"
			:isContainer true
			:opposite ew_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_worksheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorksheetOpt_Workbook
			:type SpreadsheetMLWorksheetOpt_Worksheet
			:location "168:3-168:83"
			:isContainer true
			:opposite ws_workbook
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Worksheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type String
			:location "179:3-179:27"
		) ( struct-map
			KM3_Attribute
			:name "protected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type Boolean
			:location "181:3-181:38"
		) ( struct-map
			KM3_Attribute
			:name "rightToLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type Boolean
			:location "183:3-183:40"
		) ( struct-map
			KM3_Reference
			:name "ws_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type SpreadsheetMLWorksheetOpt_Workbook
			:location "173:3-173:61"
			:isContainer false
			:opposite wb_worksheets
		) ( struct-map
			KM3_Reference
			:name "ws_table"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type SpreadsheetMLWorksheetOpt_Table
			:location "176:3-176:68"
			:isContainer true
			:opposite t_worksheet
		) ( struct-map
			KM3_Reference
			:name "w_worksheetOptions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Worksheet
			:type SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:location "186:3-186:93"
			:isContainer true
			:opposite wo_worksheet
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_StyledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLWorksheetOpt_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Double
			:location "207:3-207:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Double
			:location "209:3-209:44"
		) ( struct-map
			KM3_Attribute
			:name "expandedColumnCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Integer
			:location "211:3-211:48"
		) ( struct-map
			KM3_Attribute
			:name "expandedRowCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Integer
			:location "213:3-213:45"
		) ( struct-map
			KM3_Attribute
			:name "leftCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Integer
			:location "215:3-215:37"
		) ( struct-map
			KM3_Attribute
			:name "topCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Integer
			:location "217:3-217:36"
		) ( struct-map
			KM3_Attribute
			:name "fullColumns"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Boolean
			:location "219:3-219:40"
		) ( struct-map
			KM3_Attribute
			:name "fullRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type Boolean
			:location "221:3-221:37"
		) ( struct-map
			KM3_Reference
			:name "t_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Table
			:type SpreadsheetMLWorksheetOpt_Worksheet
			:location "200:3-200:58"
			:isContainer false
			:opposite ws_table
		) ( struct-map
			KM3_Reference
			:name "t_cols"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorksheetOpt_Table
			:type SpreadsheetMLWorksheetOpt_Column
			:location "203:3-203:69"
			:isContainer true
			:opposite c_table
		) ( struct-map
			KM3_Reference
			:name "t_rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorksheetOpt_Table
			:type SpreadsheetMLWorksheetOpt_Row
			:location "204:3-204:66"
			:isContainer true
			:opposite r_table
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLWorksheetOpt_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_TableElement
			:type Integer
			:location "227:3-227:34"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_ColOrRowElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLWorksheetOpt_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ColOrRowElement
			:type Boolean
			:location "233:3-233:35"
		) ( struct-map
			KM3_Attribute
			:name "span"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ColOrRowElement
			:type Integer
			:location "235:3-235:33"
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Column
			:type Boolean
			:location "243:3-243:41"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Column
			:type Double
			:location "245:3-245:33"
		) ( struct-map
			KM3_Reference
			:name "c_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Column
			:type SpreadsheetMLWorksheetOpt_Table
			:location "240:3-240:47"
			:isContainer false
			:opposite t_cols
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Row
			:type Boolean
			:location "256:3-256:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Row
			:type Double
			:location "258:3-258:34"
		) ( struct-map
			KM3_Reference
			:name "r_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Row
			:type SpreadsheetMLWorksheetOpt_Table
			:location "250:3-250:47"
			:isContainer false
			:opposite t_rows
		) ( struct-map
			KM3_Reference
			:name "r_cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorksheetOpt_Row
			:type SpreadsheetMLWorksheetOpt_Cell
			:location "253:3-253:66"
			:isContainer true
			:opposite c_row
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorksheetOpt_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arrayRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type String
			:location "269:3-269:38"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type String
			:location "271:3-271:35"
		) ( struct-map
			KM3_Attribute
			:name "hRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type String
			:location "273:3-273:32"
		) ( struct-map
			KM3_Attribute
			:name "mergeAcross"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type Double
			:location "275:3-275:39"
		) ( struct-map
			KM3_Attribute
			:name "mergeDown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type Double
			:location "277:3-277:37"
		) ( struct-map
			KM3_Reference
			:name "c_smartTags"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type SpreadsheetMLWorksheetOpt_SmartTagsCollection
			:location "263:3-263:79"
			:isContainer true
			:opposite st_cell
		) ( struct-map
			KM3_Reference
			:name "c_row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type SpreadsheetMLWorksheetOpt_Row
			:location "266:3-266:44"
			:isContainer false
			:opposite r_cells
		) ( struct-map
			KM3_Reference
			:name "c_data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type SpreadsheetMLWorksheetOpt_Data
			:location "279:3-279:60"
			:isContainer true
			:opposite d_cell
		) ( struct-map
			KM3_Reference
			:name "c_comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Cell
			:type SpreadsheetMLWorksheetOpt_Comment
			:location "281:3-281:66"
			:isContainer true
			:opposite c_cell
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Comment
			:type String
			:location "291:3-291:34"
		) ( struct-map
			KM3_Attribute
			:name "showAlways"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Comment
			:type Boolean
			:location "293:3-293:39"
		) ( struct-map
			KM3_Reference
			:name "c_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Comment
			:type SpreadsheetMLWorksheetOpt_Cell
			:location "286:3-286:48"
			:isContainer false
			:opposite c_comment
		) ( struct-map
			KM3_Reference
			:name "com_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Comment
			:type SpreadsheetMLWorksheetOpt_Data
			:location "289:3-289:60"
			:isContainer true
			:opposite d_comment
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "d_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Data
			:type SpreadsheetMLWorksheetOpt_Cell
			:location "298:3-298:45"
			:isContainer false
			:opposite c_data
		) ( struct-map
			KM3_Reference
			:name "d_comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Data
			:type SpreadsheetMLWorksheetOpt_Comment
			:location "299:3-299:53"
			:isContainer false
			:opposite com_data
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_Data
			:type SpreadsheetMLWorksheetOpt_ValueType
			:location "302:3-302:60"
			:isContainer true
			:opposite vt_data
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_ExcelWorkbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "selectedSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Integer
			:location "318:3-318:43"
		) ( struct-map
			KM3_Attribute
			:name "windowHidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "320:3-320:41"
		) ( struct-map
			KM3_Attribute
			:name "hideHorizontalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "322:3-322:52"
		) ( struct-map
			KM3_Attribute
			:name "hideVerticalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "324:3-324:50"
		) ( struct-map
			KM3_Attribute
			:name "hideWorkbookTabs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "326:3-326:45"
		) ( struct-map
			KM3_Attribute
			:name "windowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Double
			:location "328:3-328:40"
		) ( struct-map
			KM3_Attribute
			:name "windowWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Double
			:location "330:3-330:39"
		) ( struct-map
			KM3_Attribute
			:name "windowTopX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Double
			:location "332:3-332:38"
		) ( struct-map
			KM3_Attribute
			:name "windowTopY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Double
			:location "334:3-334:38"
		) ( struct-map
			KM3_Attribute
			:name "activeSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Integer
			:location "336:3-336:40"
		) ( struct-map
			KM3_Attribute
			:name "activeChart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type String
			:location "338:3-338:39"
		) ( struct-map
			KM3_Attribute
			:name "firstVisibleSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Integer
			:location "340:3-340:46"
		) ( struct-map
			KM3_Attribute
			:name "hidePivotTableFieldList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "342:3-342:52"
		) ( struct-map
			KM3_Attribute
			:name "protectStructure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "344:3-344:45"
		) ( struct-map
			KM3_Attribute
			:name "protectWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "346:3-346:43"
		) ( struct-map
			KM3_Attribute
			:name "displayInkNotes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "348:3-348:44"
		) ( struct-map
			KM3_Attribute
			:name "embedSaveSmartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "350:3-350:47"
		) ( struct-map
			KM3_Attribute
			:name "futureVer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type String
			:location "352:3-352:37"
		) ( struct-map
			KM3_Attribute
			:name "tabRatio"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Integer
			:location "354:3-354:37"
		) ( struct-map
			KM3_Attribute
			:name "windowIconic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "356:3-356:41"
		) ( struct-map
			KM3_Attribute
			:name "displayDrawingObjects"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type DisplayDrawingObjectsType
			:location "358:3-358:68"
		) ( struct-map
			KM3_Attribute
			:name "createBackup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "360:3-360:41"
		) ( struct-map
			KM3_Attribute
			:name "calculation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type CalculationWorkbookType
			:location "362:3-362:56"
		) ( struct-map
			KM3_Attribute
			:name "doNotCalculateBeforeSave"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "364:3-364:53"
		) ( struct-map
			KM3_Attribute
			:name "date1904"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "366:3-366:37"
		) ( struct-map
			KM3_Attribute
			:name "refModeR1C1"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "368:3-368:40"
		) ( struct-map
			KM3_Attribute
			:name "iteration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "370:3-370:38"
		) ( struct-map
			KM3_Attribute
			:name "maxIterations"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Integer
			:location "372:3-372:42"
		) ( struct-map
			KM3_Attribute
			:name "maxChange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Double
			:location "374:3-374:37"
		) ( struct-map
			KM3_Attribute
			:name "precisionAsDisplayed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "376:3-376:49"
		) ( struct-map
			KM3_Attribute
			:name "doNotSaveLinkValues"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "378:3-378:48"
		) ( struct-map
			KM3_Attribute
			:name "noAutoRecover"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "380:3-380:42"
		) ( struct-map
			KM3_Attribute
			:name "acceptLabelsInFormulas"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "382:3-382:51"
		) ( struct-map
			KM3_Attribute
			:name "uncalced"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type Boolean
			:location "384:3-384:37"
		) ( struct-map
			KM3_Reference
			:name "ew_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_ExcelWorkbook
			:type SpreadsheetMLWorksheetOpt_Workbook
			:location "313:3-313:64"
			:isContainer false
			:opposite wb_excelWorkbook
		)]
	) ) ( def SpreadsheetMLWorksheetOpt_WorksheetOptionsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fitToPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "412:3-412:38"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayColHeaders"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "414:3-414:51"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayRowHeaders"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "416:3-416:51"
		) ( struct-map
			KM3_Attribute
			:name "gridlineColor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type String
			:location "418:3-418:41"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type String
			:location "420:3-420:32"
		) ( struct-map
			KM3_Attribute
			:name "excelWorksheetType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type ExcelWorksheetTypeType
			:location "422:3-422:62"
		) ( struct-map
			KM3_Attribute
			:name "intlMacro"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "424:3-424:38"
		) ( struct-map
			KM3_Attribute
			:name "unsynced"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "426:3-426:37"
		) ( struct-map
			KM3_Attribute
			:name "selected"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "428:3-428:37"
		) ( struct-map
			KM3_Attribute
			:name "codeName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type String
			:location "430:3-430:36"
		) ( struct-map
			KM3_Attribute
			:name "displayPageBreak"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "432:3-432:45"
		) ( struct-map
			KM3_Attribute
			:name "transitionExpressionEvaluation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "434:3-434:59"
		) ( struct-map
			KM3_Attribute
			:name "transitionFormulaEntry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "436:3-436:51"
		) ( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "438:3-438:33"
		) ( struct-map
			KM3_Attribute
			:name "pageBreakZoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "440:3-440:42"
		) ( struct-map
			KM3_Attribute
			:name "showPageBreakZoom"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "442:3-442:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "444:3-444:45"
		) ( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "446:3-446:47"
		) ( struct-map
			KM3_Attribute
			:name "standardWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "448:3-448:42"
		) ( struct-map
			KM3_Attribute
			:name "visible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type VisibleType
			:location "450:3-450:40"
		) ( struct-map
			KM3_Attribute
			:name "leftColumnVisible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "452:3-452:46"
		) ( struct-map
			KM3_Attribute
			:name "displayRightToLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "454:3-454:47"
		) ( struct-map
			KM3_Attribute
			:name "gridlineColorIndex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "456:3-456:47"
		) ( struct-map
			KM3_Attribute
			:name "displayFormulas"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "458:3-458:44"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayGridlines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "460:3-460:50"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayHeadings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "462:3-462:49"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayOutline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "464:3-464:48"
		) ( struct-map
			KM3_Attribute
			:name "applyAutomaticOutlineStyles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "466:3-466:56"
		) ( struct-map
			KM3_Attribute
			:name "noSummaryRowsBelowDetail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "468:3-468:53"
		) ( struct-map
			KM3_Attribute
			:name "noSummaryColumnsRightDetail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "470:3-470:56"
		) ( struct-map
			KM3_Attribute
			:name "doNotDisplayZeros"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "472:3-472:46"
		) ( struct-map
			KM3_Attribute
			:name "activeRow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "474:3-474:38"
		) ( struct-map
			KM3_Attribute
			:name "activeColumn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "476:3-476:41"
		) ( struct-map
			KM3_Attribute
			:name "filterOn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "478:3-478:37"
		) ( struct-map
			KM3_Attribute
			:name "rangeSelection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type String
			:location "480:3-480:42"
		) ( struct-map
			KM3_Attribute
			:name "topRowVisible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "482:3-482:42"
		) ( struct-map
			KM3_Attribute
			:name "topRowBottomPane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "484:3-484:45"
		) ( struct-map
			KM3_Attribute
			:name "leftColumnRightPane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "486:3-486:48"
		) ( struct-map
			KM3_Attribute
			:name "activePane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "488:3-488:39"
		) ( struct-map
			KM3_Attribute
			:name "splitHorizontal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "490:3-490:44"
		) ( struct-map
			KM3_Attribute
			:name "splitVertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "492:3-492:42"
		) ( struct-map
			KM3_Attribute
			:name "freezePanes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "494:3-494:40"
		) ( struct-map
			KM3_Attribute
			:name "frozenNoSplit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "496:3-496:42"
		) ( struct-map
			KM3_Attribute
			:name "tabColorIndex"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Integer
			:location "498:3-498:42"
		) ( struct-map
			KM3_Attribute
			:name "protectContentst"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "500:3-500:45"
		) ( struct-map
			KM3_Attribute
			:name "protectObjects"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "502:3-502:43"
		) ( struct-map
			KM3_Attribute
			:name "protectScenarios"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "504:3-504:45"
		) ( struct-map
			KM3_Attribute
			:name "enableSelection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type EnableSelectionType
			:location "506:3-506:56"
		) ( struct-map
			KM3_Attribute
			:name "allowFormatCells"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "508:3-508:45"
		) ( struct-map
			KM3_Attribute
			:name "allowSizeCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "510:3-510:42"
		) ( struct-map
			KM3_Attribute
			:name "allowSizeRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "512:3-512:42"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "514:3-514:44"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "516:3-516:44"
		) ( struct-map
			KM3_Attribute
			:name "allowInsertHyperlinks"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "518:3-518:50"
		) ( struct-map
			KM3_Attribute
			:name "allowDeleteCols"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "520:3-520:44"
		) ( struct-map
			KM3_Attribute
			:name "allowDeleteRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "522:3-522:44"
		) ( struct-map
			KM3_Attribute
			:name "allowSort"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "524:3-524:38"
		) ( struct-map
			KM3_Attribute
			:name "allowFilter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "526:3-526:40"
		) ( struct-map
			KM3_Attribute
			:name "allowUsePivotTables"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type Boolean
			:location "528:3-528:48"
		) ( struct-map
			KM3_Reference
			:name "wo_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorksheetOpt_WorksheetOptionsElt
			:type SpreadsheetMLWorksheetOpt_Worksheet
			:location "409:3-409:68"
			:isContainer false
			:opposite w_worksheetOptions
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "564:2-564:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "565:2-565:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "566:2-566:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "567:2-567:18"
	) )]
) )
