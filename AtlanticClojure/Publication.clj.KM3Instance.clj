( declare Publication_Publication )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Publication ( struct-map
	KM3_Package
	:contents[( def Publication_Publication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Publication_Publication
			:type String
			:location "11:10-11:34"
		) ( struct-map
			KM3_Attribute
			:name "authors"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Publication_Publication
			:type String
			:location "12:3-12:29"
		) ( struct-map
			KM3_Attribute
			:name "nbPages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Publication_Publication
			:type Integer
			:location "13:3-13:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "18:2-18:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "19:2-19:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "20:2-20:19"
	) )]
) )
