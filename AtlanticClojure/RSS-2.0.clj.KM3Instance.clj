( declare RSS_RSS )
( declare RSS_Channel )
( declare RSS_Item )
( declare RSS_Image )
( declare RSS_TextInput )
( declare RSS_Cloud )
( declare RSS_Category )
( declare RSS_Enclosure )
( declare RSS_Source )
( declare RSS_Date )
( declare RSS_DayKind )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def RSS ( struct-map
	KM3_Package
	:contents[( def DayKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Monday"
		:location "116:3-116:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Tuesday"
		:location "117:3-117:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Wednesday"
		:location "118:3-118:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Thursday"
		:location "119:3-119:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Friday"
		:location "120:3-120:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Saturday"
		:location "121:3-121:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sunday"
		:location "122:3-122:18"
	)] ) ) ( def RSS_RSS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_RSS
			:type String
			:location "12:3-12:30"
		) ( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_RSS
			:type RSS_Channel
			:location "13:3-13:56"
			:isContainer true
			:opposite rss
		)]
	) ) ( def RSS_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "17:3-17:28"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "19:3-19:34"
		) ( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "21:3-21:36"
		) ( struct-map
			KM3_Attribute
			:name "copyright"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "22:3-22:37"
		) ( struct-map
			KM3_Attribute
			:name "managingEditor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "23:3-23:42"
		) ( struct-map
			KM3_Attribute
			:name "webmaster"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "24:3-24:37"
		) ( struct-map
			KM3_Attribute
			:name "generator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "25:3-25:37"
		) ( struct-map
			KM3_Attribute
			:name "docs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "26:3-26:32"
		) ( struct-map
			KM3_Attribute
			:name "ttl"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type Integer
			:location "27:3-27:32"
		) ( struct-map
			KM3_Attribute
			:name "rating"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type String
			:location "28:3-28:34"
		) ( struct-map
			KM3_Attribute
			:name "skipHours"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type Integer
			:location "29:3-29:36"
		) ( struct-map
			KM3_Attribute
			:name "skipDays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type DayKind
			:location "30:3-30:35"
		) ( struct-map
			KM3_Reference
			:name "rss"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Channel
			:type RSS_RSS
			:location "32:3-32:42"
			:isContainer false
			:opposite channel
		) ( struct-map
			KM3_Reference
			:name "pubDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Date
			:location "33:3-33:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastBuildDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Date
			:location "34:3-34:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "image"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Image
			:location "35:3-35:61"
			:isContainer true
			:opposite channel
		) ( struct-map
			KM3_Reference
			:name "textInput"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_TextInput
			:location "36:3-36:69"
			:isContainer true
			:opposite channel
		) ( struct-map
			KM3_Reference
			:name "cloud"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Cloud
			:location "37:3-37:61"
			:isContainer true
			:opposite channel
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Category
			:location "38:3-38:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 0
			:isOrdered false
			:owner RSS_Channel
			:type RSS_Item
			:location "39:3-39:58"
			:isContainer true
			:opposite channel
		)]
	) ) ( def RSS_Item ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "43:3-43:28"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "44:3-44:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "45:3-45:34"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "47:3-47:34"
		) ( struct-map
			KM3_Attribute
			:name "comments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "48:3-48:36"
		) ( struct-map
			KM3_Attribute
			:name "guid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type String
			:location "49:3-49:32"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type RSS_Source
			:location "51:3-51:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pubDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type RSS_Date
			:location "52:3-52:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "enclosure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type RSS_Enclosure
			:location "53:3-53:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Item
			:type RSS_Category
			:location "54:3-54:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Item
			:type RSS_Channel
			:location "56:3-56:48"
			:isContainer false
			:opposite items
		)]
	) ) ( def RSS_Image ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Image
			:type String
			:location "60:3-60:26"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Image
			:type String
			:location "61:3-61:28"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Image
			:type String
			:location "62:3-62:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Image
			:type String
			:location "64:3-64:39"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Image
			:type Integer
			:location "65:3-65:34"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner RSS_Image
			:type Integer
			:location "66:3-66:35"
		) ( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Image
			:type RSS_Channel
			:location "68:3-68:48"
			:isContainer false
			:opposite image
		)]
	) ) ( def RSS_TextInput ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_TextInput
			:type String
			:location "72:3-72:28"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_TextInput
			:type String
			:location "73:3-73:34"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_TextInput
			:type String
			:location "74:3-74:27"
		) ( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_TextInput
			:type String
			:location "75:3-75:27"
		) ( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_TextInput
			:type RSS_Channel
			:location "77:3-77:52"
			:isContainer false
			:opposite textInput
		)]
	) ) ( def RSS_Cloud ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type String
			:location "81:3-81:29"
		) ( struct-map
			KM3_Attribute
			:name "port"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type Integer
			:location "82:3-82:28"
		) ( struct-map
			KM3_Attribute
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type String
			:location "83:3-83:27"
		) ( struct-map
			KM3_Attribute
			:name "registerProcedure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type String
			:location "84:3-84:40"
		) ( struct-map
			KM3_Attribute
			:name "protocol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type String
			:location "85:3-85:31"
		) ( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Cloud
			:type RSS_Channel
			:location "86:3-86:48"
			:isContainer false
			:opposite cloud
		)]
	) ) ( def RSS_Category ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Category
			:type String
			:location "90:3-90:29"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Category
			:type String
			:location "91:3-91:28"
		)]
	) ) ( def RSS_Enclosure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Enclosure
			:type String
			:location "95:3-95:26"
		) ( struct-map
			KM3_Attribute
			:name "lenght"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Enclosure
			:type Integer
			:location "96:3-96:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Enclosure
			:type String
			:location "97:3-97:27"
		)]
	) ) ( def RSS_Source ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Source
			:type String
			:location "101:3-101:26"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Source
			:type String
			:location "102:3-102:28"
		)]
	) ) ( def RSS_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "eDay"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type DayKind
			:location "106:3-106:28"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "107:3-107:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "108:3-108:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "109:3-109:28"
		) ( struct-map
			KM3_Attribute
			:name "hours"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "110:3-110:29"
		) ( struct-map
			KM3_Attribute
			:name "minutes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "111:3-111:31"
		) ( struct-map
			KM3_Attribute
			:name "seconds"
			:upper 1
			:lower 1
			:isOrdered false
			:owner RSS_Date
			:type Integer
			:location "112:3-112:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "127:2-127:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "128:2-128:19"
	) )]
) )
