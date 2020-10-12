( declare ATOM_ATOM )
( declare ATOM_Entry )
( declare ATOM_Source )
( declare ATOM_Content )
( declare ATOM_InLineXHTMLContent )
( declare ATOM_InLineOtherContent )
( declare ATOM_OutOfLineContent )
( declare ATOM_Generator )
( declare ATOM_Category )
( declare ATOM_Link )
( declare ATOM_Person )
( declare ATOM_Author )
( declare ATOM_Contributor )
( declare ATOM_Date )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def ATOM ( struct-map
	KM3_Package
	:contents[( def ATOM_ATOM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "13:3-13:28"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "14:3-14:25"
		) ( struct-map
			KM3_Attribute
			:name "subtitle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "15:3-15:36"
		) ( struct-map
			KM3_Attribute
			:name "rights"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "16:3-16:34"
		) ( struct-map
			KM3_Attribute
			:name "icon"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "17:3-17:32"
		) ( struct-map
			KM3_Attribute
			:name "logo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type String
			:location "18:3-18:32"
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Link
			:location "20:3-20:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastUpdate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Date
			:location "21:3-21:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "generator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Generator
			:location "22:3-22:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "categories"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Category
			:location "23:3-23:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Author
			:location "24:3-24:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "contibutors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Contributor
			:location "25:3-25:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_ATOM
			:type ATOM_Entry
			:location "26:3-26:58"
			:isContainer true
			:opposite atom
		)]
	) ) ( def ATOM_Entry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type String
			:location "30:3-30:28"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type String
			:location "31:3-31:25"
		) ( struct-map
			KM3_Attribute
			:name "rights"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type String
			:location "32:3-32:34"
		) ( struct-map
			KM3_Attribute
			:name "summary"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type String
			:location "33:3-33:35"
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Link
			:location "35:3-35:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Source
			:location "36:3-36:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "published"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Date
			:location "37:3-37:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastUpdate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Date
			:location "38:3-38:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Content
			:location "39:3-39:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "categories"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Category
			:location "40:3-40:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Author
			:location "41:3-41:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "contibutors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_Contributor
			:location "42:3-42:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "atom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Entry
			:type ATOM_ATOM
			:location "43:3-43:44"
			:isContainer false
			:opposite entries
		)]
	) ) ( def ATOM_Source ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "47:3-47:30"
		) ( struct-map
			KM3_Attribute
			:name "icon"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "48:3-48:32"
		) ( struct-map
			KM3_Attribute
			:name "logo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "49:3-49:32"
		) ( struct-map
			KM3_Attribute
			:name "rights"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "50:3-50:34"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "51:3-51:33"
		) ( struct-map
			KM3_Attribute
			:name "subtitle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type String
			:location "52:3-52:36"
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Link
			:location "54:3-54:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "lastUpdate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Date
			:location "55:3-55:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "generator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Generator
			:location "56:3-56:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "contributors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Contributor
			:location "57:3-57:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "categories"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Category
			:location "58:3-58:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Source
			:type ATOM_Author
			:location "59:3-59:44"
			:isContainer true
		)]
	) ) ( def ATOM_Content ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Content
			:type String
			:location "63:3-63:32"
		)]
	) ) ( def ATOM_InLineXHTMLContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATOM_Content]
		:structuralFeatures[]
	) ) ( def ATOM_InLineOtherContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATOM_Content]
		:structuralFeatures[]
	) ) ( def ATOM_OutOfLineContent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATOM_Content]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_OutOfLineContent
			:type String
			:location "73:3-73:26"
		)]
	) ) ( def ATOM_Generator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Generator
			:type String
			:location "77:3-77:31"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Generator
			:type String
			:location "78:3-78:35"
		)]
	) ) ( def ATOM_Category ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Category
			:type String
			:location "82:3-82:27"
		) ( struct-map
			KM3_Attribute
			:name "scheme"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Category
			:type String
			:location "83:3-83:34"
		) ( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Category
			:type String
			:location "84:3-84:33"
		)]
	) ) ( def ATOM_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "href"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Link
			:type String
			:location "88:3-88:27"
		) ( struct-map
			KM3_Attribute
			:name "rel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Link
			:type String
			:location "89:3-89:31"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Link
			:type String
			:location "90:3-90:32"
		) ( struct-map
			KM3_Attribute
			:name "hreflang"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Link
			:type String
			:location "91:3-91:36"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Link
			:type String
			:location "92:3-92:33"
		) ( struct-map
			KM3_Attribute
			:name "lenght"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Link
			:type Integer
			:location "93:3-93:35"
		)]
	) ) ( def ATOM_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Person
			:type String
			:location "97:3-97:27"
		) ( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Person
			:type String
			:location "98:3-98:31"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATOM_Person
			:type String
			:location "99:3-99:33"
		)]
	) ) ( def ATOM_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATOM_Person]
		:structuralFeatures[]
	) ) ( def ATOM_Contributor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATOM_Person]
		:structuralFeatures[]
	) ) ( def ATOM_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "109:3-109:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "110:3-110:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "111:3-111:28"
		) ( struct-map
			KM3_Attribute
			:name "hours"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "112:3-112:29"
		) ( struct-map
			KM3_Attribute
			:name "minutes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "113:3-113:31"
		) ( struct-map
			KM3_Attribute
			:name "seconds"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATOM_Date
			:type Integer
			:location "114:3-114:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "119:2-119:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "120:2-120:19"
	) )]
) )
