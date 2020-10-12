( declare MySQL_NamedElement )
( declare MySQL_DataBase )
( declare MySQL_Table )
( declare MySQL_Column )
( declare MySQL_IntegerColumn )
( declare MySQL_EnumColumn )
( declare MySQL_EnumSet )
( declare MySQL_EnumItem )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def MySQL ( struct-map
	KM3_Package
	:contents[( def MySQL_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_NamedElement
			:type String
			:location "11:3-11:27"
		)]
	) ) ( def MySQL_DataBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MySQL_DataBase
			:type MySQL_Table
			:location "15:3-15:61"
			:isContainer true
			:opposite database
		)]
	) ) ( def MySQL_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MySQL_Table
			:type MySQL_Column
			:location "19:3-19:68"
			:isContainer true
			:opposite table
		) ( struct-map
			KM3_Reference
			:name "database"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Table
			:type MySQL_DataBase
			:location "20:3-20:51"
			:isContainer false
			:opposite tables
		)]
	) ) ( def MySQL_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type String
			:location "24:3-24:27"
		) ( struct-map
			KM3_Attribute
			:name "isPrimaryKey"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type Boolean
			:location "25:3-25:36"
		) ( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type Boolean
			:location "26:3-26:28"
		) ( struct-map
			KM3_Attribute
			:name "defaultValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type String
			:location "27:3-27:35"
		) ( struct-map
			KM3_Attribute
			:name "comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type String
			:location "28:3-28:30"
		) ( struct-map
			KM3_Reference
			:name "table"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_Column
			:type MySQL_Table
			:location "29:3-29:46"
			:isContainer false
			:opposite columns
		)]
	) ) ( def MySQL_IntegerColumn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_Column]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAutoIncrement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_IntegerColumn
			:type Boolean
			:location "33:3-33:39"
		)]
	) ) ( def MySQL_EnumColumn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_Column]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_EnumColumn
			:type MySQL_EnumSet
			:location "37:3-37:41"
			:isContainer true
		)]
	) ) ( def MySQL_EnumSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumItems"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MySQL_EnumSet
			:type MySQL_EnumItem
			:location "41:3-41:66"
			:isContainer true
			:opposite enumSet
		)]
	) ) ( def MySQL_EnumItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MySQL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MySQL_EnumItem
			:type MySQL_EnumSet
			:location "45:3-45:52"
			:isContainer false
			:opposite enumItems
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "51:2-51:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "52:2-52:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "53:2-53:18"
	) )]
) )
