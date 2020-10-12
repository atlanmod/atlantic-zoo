( declare Book_Book )
( declare Book_Chapter )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Book ( struct-map
	KM3_Package
	:contents[( def Book_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Book_Book
			:type String
			:location "11:10-11:35"
		) ( struct-map
			KM3_Reference
			:name "chapters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Book_Book
			:type Book_Chapter
			:location "12:3-12:69"
			:isContainer true
			:opposite book
		)]
	) ) ( def Book_Chapter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Book_Chapter
			:type String
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "nbPages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Book_Chapter
			:type Integer
			:location "17:3-17:31"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Book_Chapter
			:type String
			:location "18:3-18:29"
		) ( struct-map
			KM3_Reference
			:name "book"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Book_Chapter
			:type Book_Book
			:location "19:3-19:45"
			:isContainer false
			:opposite chapters
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "24:2-24:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "25:2-25:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "26:2-26:19"
	) )]
) )
