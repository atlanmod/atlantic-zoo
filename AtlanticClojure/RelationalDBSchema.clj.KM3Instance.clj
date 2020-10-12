( declare RelationalDBSchema_NamedElement )
( declare RelationalDBSchema_DataBase )
( declare RelationalDBSchema_Table )
( declare RelationalDBSchema_Column )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def RelationalDBSchema ( struct-map
	KM3_Package
	:contents[( def RelationalDBSchema_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_NamedElement
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def RelationalDBSchema_DataBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RelationalDBSchema_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "SGBDname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_DataBase
			:type String
			:location "16:3-16:30"
		) ( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RelationalDBSchema_DataBase
			:type RelationalDBSchema_Table
			:location "17:3-17:61"
			:isContainer true
			:opposite database
		)]
	) ) ( def RelationalDBSchema_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RelationalDBSchema_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "database"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_Table
			:type RelationalDBSchema_DataBase
			:location "21:3-21:50"
			:isContainer false
			:opposite tables
		) ( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 0
			:isOrdered true
			:owner RelationalDBSchema_Table
			:type RelationalDBSchema_Column
			:location "22:3-22:68"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RelationalDBSchema_Table
			:type RelationalDBSchema_Column
			:location "23:3-23:46"
			:isContainer false
			:opposite keyOf
		)]
	) ) ( def RelationalDBSchema_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RelationalDBSchema_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_Column
			:type String
			:location "27:3-27:30"
		) ( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_Column
			:type Boolean
			:location "28:3-28:28"
		) ( struct-map
			KM3_Attribute
			:name "defaultValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RelationalDBSchema_Column
			:type String
			:location "29:3-29:40"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBSchema_Column
			:type RelationalDBSchema_Table
			:location "30:3-30:47"
			:isContainer false
			:opposite columns
		) ( struct-map
			KM3_Reference
			:name "keyOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RelationalDBSchema_Column
			:type RelationalDBSchema_Table
			:location "31:3-31:47"
			:isContainer false
			:opposite key
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "38:2-38:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "39:2-39:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "40:2-40:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "41:2-41:18"
	) )]
) )
