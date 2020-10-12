( declare SpreadsheetMLSimplified_DateTimeType )
( declare SpreadsheetMLSimplified_ValueType )
( declare SpreadsheetMLSimplified_StringValue )
( declare SpreadsheetMLSimplified_NumberValue )
( declare SpreadsheetMLSimplified_DateTimeTypeValue )
( declare SpreadsheetMLSimplified_BooleanValue )
( declare SpreadsheetMLSimplified_ErrorValue )
( declare SpreadsheetMLSimplified_Workbook )
( declare SpreadsheetMLSimplified_Worksheet )
( declare SpreadsheetMLSimplified_Table )
( declare SpreadsheetMLSimplified_TableElement )
( declare SpreadsheetMLSimplified_ColOrRowElement )
( declare SpreadsheetMLSimplified_Column )
( declare SpreadsheetMLSimplified_Row )
( declare SpreadsheetMLSimplified_Cell )
( declare SpreadsheetMLSimplified_Data )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SpreadsheetMLSimplified ( struct-map
	KM3_Package
	:contents[( def SpreadsheetMLSimplified_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "15:3-15:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "16:3-16:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "18:3-18:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "19:3-19:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeType
			:type Integer
			:location "20:3-20:30"
		)]
	) ) ( def SpreadsheetMLSimplified_ValueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vt_data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_ValueType
			:type SpreadsheetMLSimplified_Data
			:location "25:3-25:45"
			:isContainer false
			:opposite value
		)]
	) ) ( def SpreadsheetMLSimplified_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_StringValue
			:type String
			:location "29:3-29:28"
		)]
	) ) ( def SpreadsheetMLSimplified_NumberValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_NumberValue
			:type Double
			:location "33:3-33:28"
		)]
	) ) ( def SpreadsheetMLSimplified_DateTimeTypeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ValueType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_DateTimeTypeValue
			:type SpreadsheetMLSimplified_DateTimeType
			:location "37:3-37:44"
			:isContainer true
		)]
	) ) ( def SpreadsheetMLSimplified_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ValueType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_BooleanValue
			:type Boolean
			:location "41:3-41:29"
		)]
	) ) ( def SpreadsheetMLSimplified_ErrorValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ValueType]
		:structuralFeatures[]
	) ) ( def SpreadsheetMLSimplified_Workbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wb_worksheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLSimplified_Workbook
			:type SpreadsheetMLSimplified_Worksheet
			:location "53:3-53:83"
			:isContainer true
			:opposite ws_workbook
		)]
	) ) ( def SpreadsheetMLSimplified_Worksheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Worksheet
			:type String
			:location "64:3-64:27"
		) ( struct-map
			KM3_Reference
			:name "ws_workbook"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Worksheet
			:type SpreadsheetMLSimplified_Workbook
			:location "58:3-58:61"
			:isContainer false
			:opposite wb_worksheets
		) ( struct-map
			KM3_Reference
			:name "ws_table"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Worksheet
			:type SpreadsheetMLSimplified_Table
			:location "61:3-61:68"
			:isContainer true
			:opposite t_worksheet
		)]
	) ) ( def SpreadsheetMLSimplified_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "t_worksheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Table
			:type SpreadsheetMLSimplified_Worksheet
			:location "69:3-69:58"
			:isContainer false
			:opposite ws_table
		) ( struct-map
			KM3_Reference
			:name "t_cols"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLSimplified_Table
			:type SpreadsheetMLSimplified_Column
			:location "72:3-72:69"
			:isContainer true
			:opposite c_table
		) ( struct-map
			KM3_Reference
			:name "t_rows"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLSimplified_Table
			:type SpreadsheetMLSimplified_Row
			:location "73:3-73:66"
			:isContainer true
			:opposite r_table
		)]
	) ) ( def SpreadsheetMLSimplified_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "index"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_TableElement
			:type Integer
			:location "79:3-79:34"
		)]
	) ) ( def SpreadsheetMLSimplified_ColOrRowElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SpreadsheetMLSimplified_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_ColOrRowElement
			:type Boolean
			:location "85:3-85:35"
		) ( struct-map
			KM3_Attribute
			:name "span"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_ColOrRowElement
			:type Integer
			:location "87:3-87:33"
		)]
	) ) ( def SpreadsheetMLSimplified_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Column
			:type Boolean
			:location "95:3-95:41"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Column
			:type Double
			:location "97:3-97:33"
		) ( struct-map
			KM3_Reference
			:name "c_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Column
			:type SpreadsheetMLSimplified_Table
			:location "92:3-92:47"
			:isContainer false
			:opposite t_cols
		)]
	) ) ( def SpreadsheetMLSimplified_Row ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_ColOrRowElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "autoFitHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Row
			:type Boolean
			:location "108:3-108:42"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Row
			:type Double
			:location "110:3-110:34"
		) ( struct-map
			KM3_Reference
			:name "r_table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Row
			:type SpreadsheetMLSimplified_Table
			:location "102:3-102:47"
			:isContainer false
			:opposite t_rows
		) ( struct-map
			KM3_Reference
			:name "r_cells"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SpreadsheetMLSimplified_Row
			:type SpreadsheetMLSimplified_Cell
			:location "105:3-105:66"
			:isContainer true
			:opposite c_row
		)]
	) ) ( def SpreadsheetMLSimplified_Cell ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SpreadsheetMLSimplified_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arrayRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type String
			:location "119:3-119:38"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type String
			:location "121:3-121:35"
		) ( struct-map
			KM3_Attribute
			:name "hRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type String
			:location "123:3-123:32"
		) ( struct-map
			KM3_Attribute
			:name "mergeAcross"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type Double
			:location "125:3-125:39"
		) ( struct-map
			KM3_Attribute
			:name "mergeDown"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type Double
			:location "127:3-127:37"
		) ( struct-map
			KM3_Reference
			:name "c_row"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type SpreadsheetMLSimplified_Row
			:location "116:3-116:44"
			:isContainer false
			:opposite r_cells
		) ( struct-map
			KM3_Reference
			:name "c_data"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SpreadsheetMLSimplified_Cell
			:type SpreadsheetMLSimplified_Data
			:location "129:3-129:60"
			:isContainer true
			:opposite d_cell
		)]
	) ) ( def SpreadsheetMLSimplified_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "d_cell"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Data
			:type SpreadsheetMLSimplified_Cell
			:location "134:3-134:45"
			:isContainer false
			:opposite c_data
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SpreadsheetMLSimplified_Data
			:type SpreadsheetMLSimplified_ValueType
			:location "137:3-137:60"
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
		:location "147:2-147:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "148:2-148:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "149:2-149:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "150:2-150:18"
	) )]
) )
