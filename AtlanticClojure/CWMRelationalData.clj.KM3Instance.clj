( declare CWMRelationalData_QueryExpression )
( declare CWMRelationalData_CheckConstraint )
( declare CWMRelationalData_Column )
( declare CWMRelationalData_ColumnSet )
( declare CWMRelationalData_NamedColumnSet )
( declare CWMRelationalData_QueryColumnSet )
( declare CWMRelationalData_Table )
( declare CWMRelationalData_View )
( declare CWMRelationalData_Trigger )
( declare CWMRelationalData_SQLDataType )
( declare CWMRelationalData_SQLDistinctType )
( declare CWMRelationalData_SQLSimpleType )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CWMRelationalData ( struct-map
	KM3_Package
	:contents[( def CWMRelationalData_QueryExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expresssion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_QueryExpression
			:type String
			:location "15:3-15:34"
		)]
	) ) ( def CWMRelationalData_CheckConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_CheckConstraint
			:type CWMRelationalData_Column
			:location "24:3-24:74"
			:isContainer false
			:opposite column_constraints
		) ( struct-map
			KM3_Reference
			:name "constrainedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_CheckConstraint
			:type CWMRelationalData_Table
			:location "25:3-25:73"
			:isContainer false
			:opposite table_constraints
		)]
	) ) ( def CWMRelationalData_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "precision"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type Integer
			:location "29:3-29:33"
		) ( struct-map
			KM3_Attribute
			:name "scale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type Integer
			:location "30:3-30:29"
		) ( struct-map
			KM3_Attribute
			:name "isNullable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type Boolean
			:location "31:3-31:34"
		) ( struct-map
			KM3_Attribute
			:name "length"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type Integer
			:location "32:3-32:30"
		) ( struct-map
			KM3_Attribute
			:name "collectionName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type String
			:location "33:3-33:37"
		) ( struct-map
			KM3_Attribute
			:name "characterSetName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type String
			:location "34:3-34:39"
		) ( struct-map
			KM3_Reference
			:name "column_constraints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_Column
			:type CWMRelationalData_CheckConstraint
			:location "35:3-35:83"
			:isContainer false
			:opposite constraintElements
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Column
			:type CWMRelationalData_SQLDataType
			:location "36:3-36:62"
			:isContainer false
			:opposite structuralFeatures
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_Column
			:type CWMRelationalData_ColumnSet
			:location "37:3-37:56"
			:isContainer false
			:opposite features
		) ( struct-map
			KM3_Reference
			:name "optionScopeColumnSet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_Column
			:type CWMRelationalData_NamedColumnSet
			:location "38:3-38:85"
			:isContainer false
			:opposite optionScopeColumn
		)]
	) ) ( def CWMRelationalData_ColumnSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "features"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_ColumnSet
			:type CWMRelationalData_Column
			:location "42:3-42:61"
			:isContainer true
			:opposite owner
		)]
	) ) ( def CWMRelationalData_NamedColumnSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_ColumnSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "optionScopeColumn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_NamedColumnSet
			:type CWMRelationalData_Column
			:location "46:3-46:72"
			:isContainer false
			:opposite optionScopeColumnSet
		) ( struct-map
			KM3_Reference
			:name "triggers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_NamedColumnSet
			:type CWMRelationalData_Trigger
			:location "47:3-47:61"
			:isContainer false
			:opposite namedColumnSet
		)]
	) ) ( def CWMRelationalData_QueryColumnSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_ColumnSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_QueryColumnSet
			:type CWMRelationalData_QueryExpression
			:location "51:3-51:47"
			:isContainer true
		)]
	) ) ( def CWMRelationalData_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_NamedColumnSet]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isTemporary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Table
			:type Boolean
			:location "55:3-55:35"
		) ( struct-map
			KM3_Attribute
			:name "temporaryScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Table
			:type String
			:location "56:3-56:37"
		) ( struct-map
			KM3_Attribute
			:name "isSystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Table
			:type Boolean
			:location "57:3-57:32"
		) ( struct-map
			KM3_Reference
			:name "table_constraints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_Table
			:type CWMRelationalData_CheckConstraint
			:location "58:3-58:83"
			:isContainer false
			:opposite constrainedElements
		)]
	) ) ( def CWMRelationalData_View ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_NamedColumnSet]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isReadOnly"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_View
			:type Boolean
			:location "62:3-62:34"
		) ( struct-map
			KM3_Attribute
			:name "checkOption"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_View
			:type Boolean
			:location "63:3-63:35"
		) ( struct-map
			KM3_Reference
			:name "queryExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_View
			:type CWMRelationalData_QueryExpression
			:location "64:3-64:57"
			:isContainer true
		)]
	) ) ( def CWMRelationalData_Trigger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namedColumnSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_Trigger
			:type CWMRelationalData_NamedColumnSet
			:location "68:3-68:65"
			:isContainer false
			:opposite triggers
		)]
	) ) ( def CWMRelationalData_SQLDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "typeNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLDataType
			:type Integer
			:location "72:3-72:34"
		) ( struct-map
			KM3_Reference
			:name "structuralFeatures"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_SQLDataType
			:type CWMRelationalData_Column
			:location "73:3-73:60"
			:isContainer false
			:opposite type
		)]
	) ) ( def CWMRelationalData_SQLDistinctType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_SQLDataType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "length"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLDistinctType
			:type Integer
			:location "77:3-77:30"
		) ( struct-map
			KM3_Attribute
			:name "precision"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLDistinctType
			:type Integer
			:location "78:3-78:33"
		) ( struct-map
			KM3_Attribute
			:name "scale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLDistinctType
			:type Integer
			:location "79:3-79:29"
		) ( struct-map
			KM3_Reference
			:name "sqlSimpleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLDistinctType
			:type CWMRelationalData_SQLSimpleType
			:location "80:3-80:71"
			:isContainer false
			:opposite sqlDistinctTypes
		)]
	) ) ( def CWMRelationalData_SQLSimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CWMRelationalData_SQLDataType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "characterMaximumLength"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "84:3-84:46"
		) ( struct-map
			KM3_Attribute
			:name "characterOctetLength"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "85:3-85:44"
		) ( struct-map
			KM3_Attribute
			:name "numericPrecision"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "86:3-86:40"
		) ( struct-map
			KM3_Attribute
			:name "numericPrecisionRadix"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "87:3-87:45"
		) ( struct-map
			KM3_Attribute
			:name "numericScale"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "88:3-88:36"
		) ( struct-map
			KM3_Attribute
			:name "dateTimePrecision"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type Integer
			:location "89:3-89:40"
		) ( struct-map
			KM3_Reference
			:name "sqlDistinctTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CWMRelationalData_SQLSimpleType
			:type CWMRelationalData_SQLDistinctType
			:location "90:3-90:76"
			:isContainer false
			:opposite sqlSimpleType
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "100:2-100:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "101:2-101:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "102:2-102:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "103:2-103:18"
	) )]
) )
