( declare SpreadsheetMLBasicDef_DateTimeType )
( declare SpreadsheetMLBasicDef_VersionType )
( declare SpreadsheetMLBasicDef_ValueType )
( declare SpreadsheetMLBasicDef_StringValue )
( declare SpreadsheetMLBasicDef_NumberValue )
( declare SpreadsheetMLBasicDef_DateTimeTypeValue )
( declare SpreadsheetMLBasicDef_BooleanValue )
( declare SpreadsheetMLBasicDef_ErrorValue )
( declare SpreadsheetMLBasicDef_DocumentPropertiesCollection )
( declare SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection )
( declare SpreadsheetMLBasicDef_CustomDocumentProperty )
( declare SpreadsheetMLBasicDef_SmartTagType )
( declare SpreadsheetMLBasicDef_SmartTagsCollection )
( declare SpreadsheetMLBasicDef_Workbook )
( declare SpreadsheetMLBasicDef_Worksheet )
( declare SpreadsheetMLBasicDef_StyledElement )
( declare SpreadsheetMLBasicDef_Table )
( declare SpreadsheetMLBasicDef_TableElement )
( declare SpreadsheetMLBasicDef_ColOrRowElement )
( declare SpreadsheetMLBasicDef_Column )
( declare SpreadsheetMLBasicDef_Row )
( declare SpreadsheetMLBasicDef_Cell )
( declare SpreadsheetMLBasicDef_Comment )
( declare SpreadsheetMLBasicDef_Data )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SpreadsheetMLBasicDef ( struct-map
	KM3_Package
	:contents[( def SpreadsheetMLBasicDef_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def SpreadsheetMLBasicDef_VersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "n"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_VersionType
			:type Integer
			:location "26:3-26:25"
		) ( struct-map
			KM3_Attribute
			:name "nn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_VersionType
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def SpreadsheetMLBasicDef_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vt_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_ValueType
			:type SpreadsheetMLBasicDef_Data
			:location "32:3-32:45"
			:isContainer false
			:opposite value
		)]
	) ) ( def SpreadsheetMLBasicDef_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_StringValue
			:type String
			:location "36:3-36:28"
		)]
	) ) ( def SpreadsheetMLBasicDef_NumberValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_NumberValue
			:type Double
			:location "40:3-40:28"
		)]
	) ) ( def SpreadsheetMLBasicDef_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DateTimeTypeValue
			:type SpreadsheetMLBasicDef_DateTimeType
			:location "44:3-44:44"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLBasicDef_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_BooleanValue
			:type Boolean
			:location "48:3-48:29"
		)]
	) ) ( def SpreadsheetMLBasicDef_ErrorValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ValueType]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLBasicDef_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "64:3-64:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "66:3-66:35"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "68:3-68:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "70:3-70:39"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "72:3-72:36"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "74:3-74:34"
		) ( struct-map
			KM3_Attribute
			:name "lastAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "76:3-76:38"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "80:3-80:35"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "82:3-82:41"
		) ( struct-map
			KM3_Attribute
			:name "revision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "84:3-84:37"
		) ( struct-map
			KM3_Attribute
			:name "presentationFormat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "86:3-86:46"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "88:3-88:32"
		) ( struct-map
			KM3_Attribute
			:name "appName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "90:3-90:35"
		) ( struct-map
			KM3_Attribute
			:name "totalTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "94:3-94:38"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "102:3-102:34"
		) ( struct-map
			KM3_Attribute
			:name "words"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "characters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "106:3-106:39"
		) ( struct-map
			KM3_Attribute
			:name "charactersWithSpaces"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "108:3-108:49"
		) ( struct-map
			KM3_Attribute
			:name "bytes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "110:3-110:34"
		) ( struct-map
			KM3_Attribute
			:name "lines"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "112:3-112:34"
		) ( struct-map
			KM3_Attribute
			:name "paragraphs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type Integer
			:location "114:3-114:39"
		) ( struct-map
			KM3_Reference
			:name "dp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_Workbook
			:location "61:3-61:64"
			:isContainer false
			:opposite wb_docProperties
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_VersionType
			:location "92:3-92:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastPrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_DateTimeType
			:location "96:3-96:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_DateTimeType
			:location "98:3-98:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_DateTimeType
			:location "100:3-100:53"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cdp_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_Workbook
			:location "119:3-119:71"
			:isContainer false
			:opposite wb_customDocProperties
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperties"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection
			:type SpreadsheetMLBasicDef_CustomDocumentProperty
			:location "121:3-121:118"
			:isContainer true
			:opposite customDocumentProperty_cdpe
		)]
	) ) ( def SpreadsheetMLBasicDef_CustomDocumentProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_CustomDocumentProperty
			:type String
			:location "127:3-127:27"
		) ( struct-map
			KM3_Reference
			:name "customDocumentProperty_cdpe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_CustomDocumentProperty
			:type SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection
			:location "126:3-126:114"
			:isContainer false
			:opposite customDocumentProperties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_CustomDocumentProperty
			:type SpreadsheetMLBasicDef_ValueType
			:location "129:3-129:41"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLBasicDef_SmartTagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespaceuri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagType
			:type String
			:location "137:3-137:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagType
			:type String
			:location "139:3-139:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagType
			:type String
			:location "141:3-141:31"
		) ( struct-map
			KM3_Reference
			:name "smartTagType_ste"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagType
			:type SpreadsheetMLBasicDef_SmartTagsCollection
			:location "134:3-134:77"
			:isContainer false
			:opposite smartTagTypes
		)]
	) ) ( def SpreadsheetMLBasicDef_SmartTagsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "st_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagsCollection
			:type SpreadsheetMLBasicDef_Workbook
			:location "146:3-146:60"
			:isContainer false
			:opposite wb_smartTags
		) ( struct-map
			KM3_Reference
			:name "st_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagsCollection
			:type SpreadsheetMLBasicDef_Cell
			:location "147:3-147:51"
			:isContainer false
			:opposite c_smartTags
		) ( struct-map
			KM3_Reference
			:name "smartTagTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_SmartTagsCollection
			:type SpreadsheetMLBasicDef_SmartTagType
			:location "149:3-149:83"
			:isContainer true
			:opposite smartTagType_ste
		)]
	) ) ( def SpreadsheetMLBasicDef_Workbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wb_smartTags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Workbook
			:type SpreadsheetMLBasicDef_SmartTagsCollection
			:location "160:3-160:86"
			:isContainer true
			:opposite st_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_docProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Workbook
			:type SpreadsheetMLBasicDef_DocumentPropertiesCollection
			:location "161:3-161:99"
			:isContainer true
			:opposite dp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_customDocProperties"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Workbook
			:type SpreadsheetMLBasicDef_CustomDocumentPropertiesCollection
			:location "162:3-162:112"
			:isContainer true
			:opposite cdp_workbook
		) ( struct-map
			KM3_Reference
			:name "wb_worksheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLBasicDef_Workbook
			:type SpreadsheetMLBasicDef_Worksheet
			:location "165:3-165:83"
			:isContainer true
			:opposite ws_workbook
		)]
	) ) ( def SpreadsheetMLBasicDef_Worksheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Worksheet
			:type String
			:location "176:3-176:27"
		) ( struct-map
			KM3_Reference
			:name "ws_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Worksheet
			:type SpreadsheetMLBasicDef_Workbook
			:location "170:3-170:61"
			:isContainer false
			:opposite wb_worksheets
		) ( struct-map
			KM3_Reference
			:name "ws_table"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Worksheet
			:type SpreadsheetMLBasicDef_Table
			:location "173:3-173:68"
			:isContainer true
			:opposite t_worksheet
		)]
	) ) ( def SpreadsheetMLBasicDef_StyledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLBasicDef_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultColumnWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Double
			:location "196:3-196:46"
		) ( struct-map
			KM3_Attribute
			:name "defaultRowHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Double
			:location "198:3-198:44"
		) ( struct-map
			KM3_Attribute
			:name "expandedColumnCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Integer
			:location "200:3-200:48"
		) ( struct-map
			KM3_Attribute
			:name "expandedRowCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Integer
			:location "202:3-202:45"
		) ( struct-map
			KM3_Attribute
			:name "leftCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Integer
			:location "204:3-204:37"
		) ( struct-map
			KM3_Attribute
			:name "topCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Integer
			:location "206:3-206:36"
		) ( struct-map
			KM3_Attribute
			:name "fullColumns"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Boolean
			:location "208:3-208:40"
		) ( struct-map
			KM3_Attribute
			:name "fullRows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type Boolean
			:location "210:3-210:37"
		) ( struct-map
			KM3_Reference
			:name "t_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Table
			:type SpreadsheetMLBasicDef_Worksheet
			:location "189:3-189:58"
			:isContainer false
			:opposite ws_table
		) ( struct-map
			KM3_Reference
			:name "t_cols"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLBasicDef_Table
			:type SpreadsheetMLBasicDef_Column
			:location "192:3-192:69"
			:isContainer true
			:opposite c_table
		) ( struct-map
			KM3_Reference
			:name "t_rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLBasicDef_Table
			:type SpreadsheetMLBasicDef_Row
			:location "193:3-193:66"
			:isContainer true
			:opposite r_table
		)]
	) ) ( def SpreadsheetMLBasicDef_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLBasicDef_StyledElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_TableElement
			:type Integer
			:location "216:3-216:34"
		)]
	) ) ( def SpreadsheetMLBasicDef_ColOrRowElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLBasicDef_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_ColOrRowElement
			:type Boolean
			:location "222:3-222:35"
		) ( struct-map
			KM3_Attribute
			:name "span"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_ColOrRowElement
			:type Integer
			:location "224:3-224:33"
		)]
	) ) ( def SpreadsheetMLBasicDef_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Column
			:type Boolean
			:location "232:3-232:41"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Column
			:type Double
			:location "234:3-234:33"
		) ( struct-map
			KM3_Reference
			:name "c_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Column
			:type SpreadsheetMLBasicDef_Table
			:location "229:3-229:47"
			:isContainer false
			:opposite t_cols
		)]
	) ) ( def SpreadsheetMLBasicDef_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Row
			:type Boolean
			:location "245:3-245:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Row
			:type Double
			:location "247:3-247:34"
		) ( struct-map
			KM3_Reference
			:name "r_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Row
			:type SpreadsheetMLBasicDef_Table
			:location "239:3-239:47"
			:isContainer false
			:opposite t_rows
		) ( struct-map
			KM3_Reference
			:name "r_cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLBasicDef_Row
			:type SpreadsheetMLBasicDef_Cell
			:location "242:3-242:66"
			:isContainer true
			:opposite c_row
		)]
	) ) ( def SpreadsheetMLBasicDef_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLBasicDef_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arrayRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type String
			:location "257:3-257:38"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type String
			:location "259:3-259:35"
		) ( struct-map
			KM3_Attribute
			:name "hRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type String
			:location "261:3-261:32"
		) ( struct-map
			KM3_Attribute
			:name "mergeAcross"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type Double
			:location "263:3-263:39"
		) ( struct-map
			KM3_Attribute
			:name "mergeDown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type Double
			:location "265:3-265:37"
		) ( struct-map
			KM3_Reference
			:name "c_row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type SpreadsheetMLBasicDef_Row
			:location "253:3-253:44"
			:isContainer false
			:opposite r_cells
		) ( struct-map
			KM3_Reference
			:name "c_smartTags"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type SpreadsheetMLBasicDef_SmartTagsCollection
			:location "254:3-254:79"
			:isContainer true
			:opposite st_cell
		) ( struct-map
			KM3_Reference
			:name "c_data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type SpreadsheetMLBasicDef_Data
			:location "267:3-267:60"
			:isContainer true
			:opposite d_cell
		) ( struct-map
			KM3_Reference
			:name "c_comment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Cell
			:type SpreadsheetMLBasicDef_Comment
			:location "269:3-269:66"
			:isContainer true
			:opposite c_cell
		)]
	) ) ( def SpreadsheetMLBasicDef_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Comment
			:type String
			:location "279:3-279:34"
		) ( struct-map
			KM3_Attribute
			:name "showAlways"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Comment
			:type Boolean
			:location "281:3-281:39"
		) ( struct-map
			KM3_Reference
			:name "c_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Comment
			:type SpreadsheetMLBasicDef_Cell
			:location "274:3-274:48"
			:isContainer false
			:opposite c_comment
		) ( struct-map
			KM3_Reference
			:name "com_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Comment
			:type SpreadsheetMLBasicDef_Data
			:location "277:3-277:60"
			:isContainer true
			:opposite d_comment
		)]
	) ) ( def SpreadsheetMLBasicDef_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "d_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Data
			:type SpreadsheetMLBasicDef_Cell
			:location "286:3-286:45"
			:isContainer false
			:opposite c_data
		) ( struct-map
			KM3_Reference
			:name "d_comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Data
			:type SpreadsheetMLBasicDef_Comment
			:location "287:3-287:53"
			:isContainer false
			:opposite com_data
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLBasicDef_Data
			:type SpreadsheetMLBasicDef_ValueType
			:location "290:3-290:60"
			:isContainer true
			:opposite vt_data
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "300:2-300:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "301:2-301:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "302:2-302:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "303:2-303:18"
	) )]
) )
