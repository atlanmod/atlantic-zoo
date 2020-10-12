( declare Relational_Named )
( declare Relational_Table )
( declare Relational_Column )
( declare Relational_Type )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Relational ( struct-map
	KM3_Package
	:contents[( def Relational_Named ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Relational_Named
			:type String
			:location "11:3-11:27"
		)]
	) ) ( def Relational_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Relational_Named]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "col"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Relational_Table
			:type Relational_Column
			:location "15:3-15:64"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Relational_Table
			:type Relational_Column
			:location "16:3-16:46"
			:isContainer false
			:opposite keyOf
		)]
	) ) ( def Relational_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Relational_Named]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Relational_Column
			:type Relational_Table
			:location "20:3-20:42"
			:isContainer false
			:opposite col
		) ( struct-map
			KM3_Reference
			:name "keyOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Relational_Column
			:type Relational_Table
			:location "21:3-21:47"
			:isContainer false
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Relational_Column
			:type Relational_Type
			:location "22:3-22:25"
			:isContainer false
		)]
	) ) ( def Relational_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Relational_Named]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "31:2-31:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "32:2-32:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "33:2-33:18"
	) )]
) )
