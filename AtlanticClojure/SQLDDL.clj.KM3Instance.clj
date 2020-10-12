( declare SQLDDL_LocatedElement )
( declare SQLDDL_NamedElement )
( declare SQLDDL_Database )
( declare SQLDDL_Table )
( declare SQLDDL_TableElement )
( declare SQLDDL_Column )
( declare SQLDDL_Key )
( declare SQLDDL_SimpleKey )
( declare SQLDDL_PrimaryKey )
( declare SQLDDL_ForeignKey )
( declare SQLDDL_Type )
( declare SQLDDL_Parameter )
( declare SQLDDL_Value )
( declare SQLDDL_IntegerVal )
( declare SQLDDL_NullVal )
( declare SQLDDL_StringVal )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SQLDDL ( struct-map
	KM3_Package
	:contents[( def SQLDDL_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_LocatedElement
			:type String
			:location "12:3-12:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDDL_LocatedElement
			:type String
			:location "13:3-13:40"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDDL_LocatedElement
			:type String
			:location "14:3-14:39"
		)]
	) ) ( def SQLDDL_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDDL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_NamedElement
			:type String
			:location "18:3-18:27"
		)]
	) ) ( def SQLDDL_Database ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SQLDDL_Database
			:type SQLDDL_Table
			:location "22:3-22:69"
			:isContainer true
			:opposite database
		)]
	) ) ( def SQLDDL_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "database"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Table
			:type SQLDDL_Database
			:location "26:3-26:51"
			:isContainer false
			:opposite tables
		) ( struct-map
			KM3_Reference
			:name "referencedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Table
			:type SQLDDL_ForeignKey
			:location "27:3-27:69"
			:isContainer false
			:opposite referencedTable
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SQLDDL_Table
			:type SQLDDL_TableElement
			:location "29:3-29:75"
			:isContainer true
			:opposite table
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SQLDDL_Table
			:type SQLDDL_Parameter
			:location "30:3-30:74"
			:isContainer true
			:opposite table
		)]
	) ) ( def SQLDDL_TableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDDL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_TableElement
			:type SQLDDL_Table
			:location "35:3-35:47"
			:isContainer false
			:opposite elements
		)]
	) ) ( def SQLDDL_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Column
			:type String
			:location "41:3-41:27"
		) ( struct-map
			KM3_Attribute
			:name "canBeNull"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Column
			:type Boolean
			:location "44:3-44:33"
		) ( struct-map
			KM3_Reference
			:name "referencedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Column
			:type SQLDDL_ForeignKey
			:location "39:3-39:71"
			:isContainer false
			:opposite referencedColumns
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Column
			:type SQLDDL_Type
			:location "43:3-43:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Column
			:type SQLDDL_Value
			:location "45:3-45:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "keys"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Column
			:type SQLDDL_Key
			:location "47:3-47:46"
			:isContainer false
			:opposite columns
		)]
	) ) ( def SQLDDL_Key ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDDL_TableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Key
			:type Boolean
			:location "51:3-51:32"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Key
			:type String
			:location "52:3-52:32"
		) ( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SQLDDL_Key
			:type SQLDDL_Column
			:location "53:3-53:59"
			:isContainer false
			:opposite keys
		)]
	) ) ( def SQLDDL_SimpleKey ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Key]
		:structuralFeatures[]
	) ) ( def SQLDDL_PrimaryKey ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Key]
		:structuralFeatures[]
	) ) ( def SQLDDL_ForeignKey ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Key]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referencedTable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_ForeignKey
			:type SQLDDL_Table
			:location "63:3-63:61"
			:isContainer false
			:opposite referencedBy
		) ( struct-map
			KM3_Reference
			:name "referencedColumns"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SQLDDL_ForeignKey
			:type SQLDDL_Column
			:location "64:3-64:69"
			:isContainer false
			:opposite referencedBy
		)]
	) ) ( def SQLDDL_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "length"
			:upper 2
			:lower 0
			:isOrdered false
			:owner SQLDDL_Type
			:type Integer
			:location "69:3-69:35"
		) ( struct-map
			KM3_Attribute
			:name "isUnsigned"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Type
			:type Boolean
			:location "70:3-70:34"
		)]
	) ) ( def SQLDDL_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_Parameter
			:type SQLDDL_Table
			:location "74:3-74:49"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDDL_Parameter
			:type SQLDDL_Value
			:location "76:3-76:42"
			:isContainer true
		)]
	) ) ( def SQLDDL_Value ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDDL_LocatedElement]
		:structuralFeatures[]
	) ) ( def SQLDDL_IntegerVal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_IntegerVal
			:type Integer
			:location "84:3-84:29"
		)]
	) ) ( def SQLDDL_NullVal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Value]
		:structuralFeatures[]
	) ) ( def SQLDDL_StringVal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDDL_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDDL_StringVal
			:type String
			:location "91:3-91:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "97:2-97:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "98:2-98:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "99:2-99:18"
	) )]
) )
