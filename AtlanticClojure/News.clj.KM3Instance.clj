( declare News_Element )
( declare News_Newspaper )
( declare News_News )
( declare News_Category )
( declare News_Date )
( declare News_DayKind )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def News ( struct-map
	KM3_Package
	:contents[( def DayKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Monday"
		:location "50:3-50:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Tuesday"
		:location "51:3-51:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Wednesday"
		:location "52:3-52:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Thursday"
		:location "53:3-53:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Friday"
		:location "54:3-54:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Saturday"
		:location "55:3-55:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sunday"
		:location "56:3-56:18"
	)] ) ) ( def News_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Element
			:type String
			:location "12:3-12:28"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Element
			:type String
			:location "13:3-13:34"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Element
			:type String
			:location "14:3-14:27"
		)]
	) ) ( def News_Newspaper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[News_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_Newspaper
			:type String
			:location "18:3-18:36"
		) ( struct-map
			KM3_Attribute
			:name "copyright"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_Newspaper
			:type String
			:location "19:3-19:37"
		) ( struct-map
			KM3_Reference
			:name "pubDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_Newspaper
			:type News_Date
			:location "21:3-21:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_Newspaper
			:type News_Category
			:location "22:3-22:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "news"
			:upper -1
			:lower 0
			:isOrdered false
			:owner News_Newspaper
			:type News_News
			:location "23:3-23:59"
			:isContainer true
			:opposite newspaper
		)]
	) ) ( def News_News ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[News_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_News
			:type String
			:location "27:3-27:34"
		) ( struct-map
			KM3_Attribute
			:name "comments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_News
			:type String
			:location "28:3-28:36"
		) ( struct-map
			KM3_Reference
			:name "pubDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_News
			:type News_Date
			:location "30:3-30:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner News_News
			:type News_Category
			:location "31:3-31:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "newspaper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_News
			:type News_Newspaper
			:location "32:3-32:51"
			:isContainer false
			:opposite news
		)]
	) ) ( def News_Category ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Category
			:type String
			:location "36:3-36:28"
		)]
	) ) ( def News_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "eDay"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type DayKind
			:location "40:3-40:28"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "41:3-41:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "42:3-42:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "43:3-43:28"
		) ( struct-map
			KM3_Attribute
			:name "hours"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "44:3-44:29"
		) ( struct-map
			KM3_Attribute
			:name "minutes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "45:3-45:31"
		) ( struct-map
			KM3_Attribute
			:name "seconds"
			:upper 1
			:lower 1
			:isOrdered false
			:owner News_Date
			:type Integer
			:location "46:3-46:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "62:2-62:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "63:2-63:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "64:2-64:19"
	) )]
) )
