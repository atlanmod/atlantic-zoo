( declare RelationalDBContent_NamedElement )
( declare RelationalDBContent_DataBase )
( declare RelationalDBContent_Table )
( declare RelationalDBContent_Tuple )
( declare RelationalDBContent_TupleElement )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def RelationalDBContent ( struct-map
	KM3_Package
	:contents[( def RelationalDBContent_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBContent_NamedElement
			:type String
			:location "12:3-12:27"
		)]
	) ) ( def RelationalDBContent_DataBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RelationalDBContent_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "SGBDname"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBContent_DataBase
			:type String
			:location "16:3-16:30"
		) ( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RelationalDBContent_DataBase
			:type RelationalDBContent_Table
			:location "17:3-17:61"
			:isContainer true
			:opposite database
		)]
	) ) ( def RelationalDBContent_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[RelationalDBContent_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "database"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBContent_Table
			:type RelationalDBContent_DataBase
			:location "21:3-21:50"
			:isContainer false
			:opposite tables
		) ( struct-map
			KM3_Reference
			:name "tuples"
			:upper -1
			:lower 0
			:isOrdered true
			:owner RelationalDBContent_Table
			:type RelationalDBContent_Tuple
			:location "22:3-22:65"
			:isContainer true
			:opposite owner
		)]
	) ) ( def RelationalDBContent_Tuple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBContent_Tuple
			:type RelationalDBContent_Table
			:location "26:3-26:45"
			:isContainer false
			:opposite tuples
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner RelationalDBContent_Tuple
			:type RelationalDBContent_TupleElement
			:location "27:3-27:74"
			:isContainer true
			:opposite tuple
		)]
	) ) ( def RelationalDBContent_TupleElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RelationalDBContent_TupleElement
			:type String
			:location "32:3-32:32"
		) ( struct-map
			KM3_Reference
			:name "tuple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RelationalDBContent_TupleElement
			:type RelationalDBContent_Tuple
			:location "31:3-31:46"
			:isContainer false
			:opposite elements
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "39:2-39:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "40:2-40:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "41:2-41:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "42:2-42:18"
	) )]
) )
