( declare SpreadsheetMLWorkbookProp_DateTimeType )
( declare SpreadsheetMLWorkbookProp_VersionType )
( declare SpreadsheetMLWorkbookProp_ValueType )
( declare SpreadsheetMLWorkbookProp_StringValue )
( declare SpreadsheetMLWorkbookProp_NumberValue )
( declare SpreadsheetMLWorkbookProp_DateTimeTypeValue )
( declare SpreadsheetMLWorkbookProp_BooleanValue )
( declare SpreadsheetMLWorkbookProp_ErrorValue )
( declare SpreadsheetMLWorkbookProp_DocumentPropertiesCollection )
( declare SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection )
( declare SpreadsheetMLWorkbookProp_CustomDocumentProperty )
( declare SpreadsheetMLWorkbookProp_SmartTagType )
( declare SpreadsheetMLWorkbookProp_SmartTagsCollection )
( declare SpreadsheetMLWorkbookProp_Workbook )
( declare SpreadsheetMLWorkbookProp_Worksheet )
( declare SpreadsheetMLWorkbookProp_StyledElement )
( declare SpreadsheetMLWorkbookProp_Table )
( declare SpreadsheetMLWorkbookProp_TableElement )
( declare SpreadsheetMLWorkbookProp_ColOrRowElement )
( declare SpreadsheetMLWorkbookProp_Column )
( declare SpreadsheetMLWorkbookProp_Row )
( declare SpreadsheetMLWorkbookProp_Cell )
( declare SpreadsheetMLWorkbookProp_Comment )
( declare SpreadsheetMLWorkbookProp_Data )
( declare SpreadsheetMLWorkbookProp_ExcelWorkbook )
( declare SpreadsheetMLWorkbookProp_DisplayDrawingObjectsType )
( declare SpreadsheetMLWorkbookProp_CalculationWorkbookType )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SpreadsheetMLWorkbookProp ( struct-map
	KM3_Package
	:contents[( def DisplayDrawingObjectsType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ddot_displayShapes"
		:location "381:3-381:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_placeHolders"
		:location "382:3-382:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "ddot_hideAll"
		:location "383:3-383:24"
	)] ) ) ( def CalculationWorkbookType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cwt_automaticCalculation"
		:location "388:3-388:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_manualCalculation"
		:location "389:3-389:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "cwt_semiAutomaticCalculation"
		:location "390:3-390:40"
	)] ) ) ( def SpreadsheetMLWorkbookProp_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vt_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ValueType
			:type SpreadsheetMLWorkbookProp_Data
			:location "32:3-32:45"
			:isContainer false
			:opposite value
		)]
	) ) ( def SpreadsheetMLWorkbookProp_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_StringValue
			:type String
			:location "36:3-36:28"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_NumberValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_NumberValue
			:type Double
			:location "40:3-40:28"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DateTimeTypeValue
			:type SpreadsheetMLWorkbookProp_DateTimeType
			:location "44:3-44:44"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorkbookProp_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_BooleanValue
			:type Boolean
			:location "48:3-48:29"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_ErrorValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ValueType]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLWorkbookProp_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "64:3-64:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "66:3-66:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "70:3-70:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "72:3-72:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "74:3-74:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "76:3-76:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "80:3-80:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "82:3-82:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "84:3-84:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "86:3-86:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "88:3-88:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type String
			:location "90:3-90:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "94:3-94:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "112:3-112:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type Integer
			:location "114:3-114:39"
		) ( struct-map
			KM3_Reference
			:name "dp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_Workbook
			:location "61:3-61:64"
			:isContainer false
			:opposite wb_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_VersionType
			:location "92:3-92:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_DateTimeType
			:location "96:3-96:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_DateTimeType
			:location "98:3-98:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_DateTimeType
			:location "100:3-100:53"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_Workbook
			:location "119:3-119:71"
			:isContainer false
			:opposite wb_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection
			:type SpreadsheetMLWorkbookProp_CustomDocumentProperty
			:location "121:3-121:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def SpreadsheetMLWorkbookProp_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_CustomDocumentProperty
			:type String
			:location "127:3-127:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_CustomDocumentProperty
			:type SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection
			:location "126:3-126:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_CustomDocumentProperty
			:type SpreadsheetMLWorkbookProp_ValueType
			:location "129:3-129:41"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLWorkbookProp_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagType
			:type String
			:location "137:3-137:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagType
			:type String
			:location "139:3-139:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagType
			:type String
			:location "141:3-141:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagType
			:type SpreadsheetMLWorkbookProp_SmartTagsCollection
			:location "134:3-134:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def SpreadsheetMLWorkbookProp_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagsCollection
			:type SpreadsheetMLWorkbookProp_Workbook
			:location "146:3-146:60"
			:isContainer false
			:opposite wb_smartTags
		) ( struct-map
			KM3_Reference
			:name "st_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagsCollection
			:type SpreadsheetMLWorkbookProp_Cell
			:location "147:3-147:51"
			:isContainer false
			:opposite c_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_SmartTagsCollection
			:type SpreadsheetMLWorkbookProp_SmartTagType
			:location "149:3-149:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Workbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wb_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Workbook
			:type SpreadsheetMLWorkbookProp_SmartTagsCollection
			:location "160:3-160:86"
			:isContainer true
			:opposite st_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Workbook
			:type SpreadsheetMLWorkbookProp_DocumentPropertiesCollection
			:location "161:3-161:99"
			:isContainer true
			:opposite dp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Workbook
			:type SpreadsheetMLWorkbookProp_CustomDocumentPropertiesCollection
			:location "162:3-162:112"
			:isContainer true
			:opposite cdp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_excelWorkbook"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Workbook
			:type SpreadsheetMLWorkbookProp_ExcelWorkbook
			:location "165:3-165:84"
			:isContainer true
			:opposite ew_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_worksheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorkbookProp_Workbook
			:type SpreadsheetMLWorkbookProp_Worksheet
			:location "168:3-168:83"
			:isContainer true
			:opposite ws_workbook
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Worksheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Worksheet
			:type String
			:location "179:3-179:27"
		) ( struct-map
			KM3_Reference
			:name "ws_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Worksheet
			:type SpreadsheetMLWorkbookProp_Workbook
			:location "173:3-173:61"
			:isContainer false
			:opposite wb_worksheets
		) ( struct-map
			KM3_Reference
			:name "ws_table"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Worksheet
			:type SpreadsheetMLWorkbookProp_Table
			:location "176:3-176:68"
			:isContainer true
			:opposite t_worksheet
		)]
	) ) ( def SpreadsheetMLWorkbookProp_StyledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLWorkbookProp_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Double
			:location "199:3-199:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Double
			:location "201:3-201:44"
		) ( struct-map
			KM3_Attribute
			:name "expandedColumnCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Integer
			:location "203:3-203:48"
		) ( struct-map
			KM3_Attribute
			:name "expandedRowCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Integer
			:location "205:3-205:45"
		) ( struct-map
			KM3_Attribute
			:name "leftCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Integer
			:location "207:3-207:37"
		) ( struct-map
			KM3_Attribute
			:name "topCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Integer
			:location "209:3-209:36"
		) ( struct-map
			KM3_Attribute
			:name "fullColumns"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Boolean
			:location "211:3-211:40"
		) ( struct-map
			KM3_Attribute
			:name "fullRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type Boolean
			:location "213:3-213:37"
		) ( struct-map
			KM3_Reference
			:name "t_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Table
			:type SpreadsheetMLWorkbookProp_Worksheet
			:location "192:3-192:58"
			:isContainer false
			:opposite ws_table
		) ( struct-map
			KM3_Reference
			:name "t_cols"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorkbookProp_Table
			:type SpreadsheetMLWorkbookProp_Column
			:location "195:3-195:69"
			:isContainer true
			:opposite c_table
		) ( struct-map
			KM3_Reference
			:name "t_rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorkbookProp_Table
			:type SpreadsheetMLWorkbookProp_Row
			:location "196:3-196:66"
			:isContainer true
			:opposite r_table
		)]
	) ) ( def SpreadsheetMLWorkbookProp_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLWorkbookProp_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_TableElement
			:type Integer
			:location "219:3-219:34"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_ColOrRowElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLWorkbookProp_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ColOrRowElement
			:type Boolean
			:location "225:3-225:35"
		) ( struct-map
			KM3_Attribute
			:name "span"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ColOrRowElement
			:type Integer
			:location "227:3-227:33"
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Column
			:type Boolean
			:location "235:3-235:41"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Column
			:type Double
			:location "237:3-237:33"
		) ( struct-map
			KM3_Reference
			:name "c_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Column
			:type SpreadsheetMLWorkbookProp_Table
			:location "232:3-232:47"
			:isContainer false
			:opposite t_cols
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Row
			:type Boolean
			:location "248:3-248:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Row
			:type Double
			:location "250:3-250:34"
		) ( struct-map
			KM3_Reference
			:name "r_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Row
			:type SpreadsheetMLWorkbookProp_Table
			:location "242:3-242:47"
			:isContainer false
			:opposite t_rows
		) ( struct-map
			KM3_Reference
			:name "r_cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLWorkbookProp_Row
			:type SpreadsheetMLWorkbookProp_Cell
			:location "245:3-245:66"
			:isContainer true
			:opposite c_row
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLWorkbookProp_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arrayRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type String
			:location "260:3-260:38"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type String
			:location "262:3-262:35"
		) ( struct-map
			KM3_Attribute
			:name "hRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type String
			:location "264:3-264:32"
		) ( struct-map
			KM3_Attribute
			:name "mergeAcross"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type Double
			:location "266:3-266:39"
		) ( struct-map
			KM3_Attribute
			:name "mergeDown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type Double
			:location "268:3-268:37"
		) ( struct-map
			KM3_Reference
			:name "c_smartTags"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type SpreadsheetMLWorkbookProp_SmartTagsCollection
			:location "255:3-255:79"
			:isContainer true
			:opposite st_cell
		) ( struct-map
			KM3_Reference
			:name "c_row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type SpreadsheetMLWorkbookProp_Row
			:location "257:3-257:44"
			:isContainer false
			:opposite r_cells
		) ( struct-map
			KM3_Reference
			:name "c_data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type SpreadsheetMLWorkbookProp_Data
			:location "270:3-270:60"
			:isContainer true
			:opposite d_cell
		) ( struct-map
			KM3_Reference
			:name "c_comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Cell
			:type SpreadsheetMLWorkbookProp_Comment
			:location "272:3-272:66"
			:isContainer true
			:opposite c_cell
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Comment
			:type String
			:location "282:3-282:34"
		) ( struct-map
			KM3_Attribute
			:name "showAlways"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Comment
			:type Boolean
			:location "284:3-284:39"
		) ( struct-map
			KM3_Reference
			:name "c_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Comment
			:type SpreadsheetMLWorkbookProp_Cell
			:location "277:3-277:48"
			:isContainer false
			:opposite c_comment
		) ( struct-map
			KM3_Reference
			:name "com_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Comment
			:type SpreadsheetMLWorkbookProp_Data
			:location "280:3-280:60"
			:isContainer true
			:opposite d_comment
		)]
	) ) ( def SpreadsheetMLWorkbookProp_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "d_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Data
			:type SpreadsheetMLWorkbookProp_Cell
			:location "289:3-289:45"
			:isContainer false
			:opposite c_data
		) ( struct-map
			KM3_Reference
			:name "d_comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Data
			:type SpreadsheetMLWorkbookProp_Comment
			:location "290:3-290:53"
			:isContainer false
			:opposite com_data
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_Data
			:type SpreadsheetMLWorkbookProp_ValueType
			:location "293:3-293:60"
			:isContainer true
			:opposite vt_data
		)]
	) ) ( def SpreadsheetMLWorkbookProp_ExcelWorkbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "selectedSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Integer
			:location "309:3-309:43"
		) ( struct-map
			KM3_Attribute
			:name "windowHidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "311:3-311:41"
		) ( struct-map
			KM3_Attribute
			:name "hideHorizontalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "313:3-313:52"
		) ( struct-map
			KM3_Attribute
			:name "hideVerticalScrollBar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "315:3-315:50"
		) ( struct-map
			KM3_Attribute
			:name "hideWorkbookTabs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "317:3-317:45"
		) ( struct-map
			KM3_Attribute
			:name "windowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Double
			:location "319:3-319:40"
		) ( struct-map
			KM3_Attribute
			:name "windowWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Double
			:location "321:3-321:39"
		) ( struct-map
			KM3_Attribute
			:name "windowTopX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Double
			:location "323:3-323:38"
		) ( struct-map
			KM3_Attribute
			:name "windowTopY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Double
			:location "325:3-325:38"
		) ( struct-map
			KM3_Attribute
			:name "activeSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Integer
			:location "327:3-327:40"
		) ( struct-map
			KM3_Attribute
			:name "activeChart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type String
			:location "329:3-329:39"
		) ( struct-map
			KM3_Attribute
			:name "firstVisibleSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Integer
			:location "331:3-331:46"
		) ( struct-map
			KM3_Attribute
			:name "hidePivotTableFieldList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "333:3-333:52"
		) ( struct-map
			KM3_Attribute
			:name "protectStructure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "335:3-335:45"
		) ( struct-map
			KM3_Attribute
			:name "protectWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "337:3-337:43"
		) ( struct-map
			KM3_Attribute
			:name "displayInkNotes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "339:3-339:44"
		) ( struct-map
			KM3_Attribute
			:name "embedSaveSmartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "341:3-341:47"
		) ( struct-map
			KM3_Attribute
			:name "futureVer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type String
			:location "343:3-343:37"
		) ( struct-map
			KM3_Attribute
			:name "tabRatio"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Integer
			:location "345:3-345:37"
		) ( struct-map
			KM3_Attribute
			:name "windowIconic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "347:3-347:41"
		) ( struct-map
			KM3_Attribute
			:name "displayDrawingObjects"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type DisplayDrawingObjectsType
			:location "349:3-349:68"
		) ( struct-map
			KM3_Attribute
			:name "createBackup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "351:3-351:41"
		) ( struct-map
			KM3_Attribute
			:name "calculation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type CalculationWorkbookType
			:location "353:3-353:56"
		) ( struct-map
			KM3_Attribute
			:name "doNotCalculateBeforeSave"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "355:3-355:53"
		) ( struct-map
			KM3_Attribute
			:name "date1904"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "357:3-357:37"
		) ( struct-map
			KM3_Attribute
			:name "refModeR1C1"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "359:3-359:40"
		) ( struct-map
			KM3_Attribute
			:name "iteration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "361:3-361:38"
		) ( struct-map
			KM3_Attribute
			:name "maxIterations"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Integer
			:location "363:3-363:42"
		) ( struct-map
			KM3_Attribute
			:name "maxChange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Double
			:location "365:3-365:37"
		) ( struct-map
			KM3_Attribute
			:name "precisionAsDisplayed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "367:3-367:49"
		) ( struct-map
			KM3_Attribute
			:name "doNotSaveLinkValues"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "369:3-369:48"
		) ( struct-map
			KM3_Attribute
			:name "noAutoRecover"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "371:3-371:42"
		) ( struct-map
			KM3_Attribute
			:name "acceptLabelsInFormulas"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "373:3-373:51"
		) ( struct-map
			KM3_Attribute
			:name "uncalced"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type Boolean
			:location "375:3-375:37"
		) ( struct-map
			KM3_Reference
			:name "ew_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLWorkbookProp_ExcelWorkbook
			:type SpreadsheetMLWorkbookProp_Workbook
			:location "304:3-304:64"
			:isContainer false
			:opposite wb_excelWorkbook
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "400:2-400:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "401:2-401:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "402:2-402:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "403:2-403:18"
	) )]
) )
