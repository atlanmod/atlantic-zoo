( declare Person_Person )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Person ( struct-map
	KM3_Package
	:contents[( def Person_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Person_Person
			:type String
			:location "9:10-9:34"
		) ( struct-map
			KM3_Attribute
			:name "firstName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Person_Person
			:type String
			:location "10:10-10:38"
		) ( struct-map
			KM3_Attribute
			:name "phone"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Person_Person
			:type String
			:location "11:10-11:34"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "16:6-16:23"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "17:6-17:22"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "18:6-18:23"
	) )]
) )
