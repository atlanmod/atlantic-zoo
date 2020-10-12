( declare HPROF_LocatedElement )
( declare HPROF_Profile )
( declare HPROF_Method )
( declare HPROF_ThreadAction )
( declare HPROF_ThreadStart )
( declare HPROF_ThreadEnd )
( declare HPROF_Trace )
( declare HPROF_StackTraceElement )
( declare HPROF_Times )
( declare HPROF_Time )
( declare HPROF_Date )
( declare HPROF_Day )
( declare HPROF_Month )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def HPROF ( struct-map
	KM3_Package
	:contents[( def Day ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Monday"
		:location "88:3-88:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Tuesday"
		:location "89:3-89:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Wednesday"
		:location "90:3-90:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Thursday"
		:location "91:3-91:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Friday"
		:location "92:3-92:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Saturday"
		:location "93:3-93:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sunday"
		:location "94:3-94:18"
	)] ) ) ( def Month ( :literals[( struct-map
		KM3_EnumLiteral
		:name "January"
		:location "98:3-98:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "February"
		:location "99:3-99:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "March"
		:location "100:3-100:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "April"
		:location "101:3-101:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "May"
		:location "102:3-102:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "June"
		:location "103:3-103:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "July"
		:location "104:3-104:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "August"
		:location "105:3-105:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "September"
		:location "106:3-106:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "October"
		:location "107:3-107:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "November"
		:location "108:3-108:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "December"
		:location "109:3-109:20"
	)] ) ) ( def HPROF_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HPROF_LocatedElement
			:type String
			:location "12:3-12:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def HPROF_Profile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "header"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Profile
			:type String
			:location "19:3-19:29"
		) ( struct-map
			KM3_Reference
			:name "threadActions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_Profile
			:type HPROF_ThreadAction
			:location "20:3-20:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "traces"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_Profile
			:type HPROF_Trace
			:location "21:3-21:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "times"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Profile
			:type HPROF_Times
			:location "22:3-22:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_Profile
			:type HPROF_Method
			:location "24:3-24:51"
			:isContainer true
		)]
	) ) ( def HPROF_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fullyQualifiedName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Method
			:type String
			:location "28:3-28:41"
		) ( struct-map
			KM3_Reference
			:name "stackTraceElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HPROF_Method
			:type HPROF_StackTraceElement
			:location "30:3-30:73"
			:isContainer false
			:opposite method
		)]
	) ) ( def HPROF_ThreadAction ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_ThreadAction
			:type Integer
			:location "34:3-34:26"
		)]
	) ) ( def HPROF_ThreadStart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_ThreadAction]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "obj"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_ThreadStart
			:type Integer
			:location "38:3-38:27"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_ThreadStart
			:type String
			:location "39:3-39:27"
		) ( struct-map
			KM3_Attribute
			:name "group"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_ThreadStart
			:type String
			:location "40:3-40:28"
		)]
	) ) ( def HPROF_ThreadEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_ThreadAction]
		:structuralFeatures[]
	) ) ( def HPROF_Trace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Trace
			:type Integer
			:location "46:3-46:26"
		) ( struct-map
			KM3_Attribute
			:name "threadId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Trace
			:type Integer
			:location "47:3-47:32"
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner HPROF_Trace
			:type HPROF_StackTraceElement
			:location "48:3-48:80"
			:isContainer true
			:opposite trace
		) ( struct-map
			KM3_Reference
			:name "times"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HPROF_Trace
			:type HPROF_Time
			:location "50:3-50:46"
			:isContainer false
			:opposite trace
		)]
	) ) ( def HPROF_StackTraceElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fileName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner HPROF_StackTraceElement
			:type String
			:location "55:3-55:36"
		) ( struct-map
			KM3_Attribute
			:name "line"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_StackTraceElement
			:type Integer
			:location "56:3-56:28"
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_StackTraceElement
			:type HPROF_Method
			:location "54:3-54:59"
			:isContainer false
			:opposite stackTraceElements
		) ( struct-map
			KM3_Reference
			:name "trace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_StackTraceElement
			:type HPROF_Trace
			:location "58:3-58:47"
			:isContainer false
			:opposite elements
		)]
	) ) ( def HPROF_Times ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Times
			:type String
			:location "62:3-62:27"
		) ( struct-map
			KM3_Attribute
			:name "total"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Times
			:type Integer
			:location "63:3-63:29"
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Times
			:type HPROF_Date
			:location "64:3-64:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner HPROF_Times
			:type HPROF_Time
			:location "65:3-65:42"
			:isContainer true
		)]
	) ) ( def HPROF_Time ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rank"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type Integer
			:location "69:3-69:28"
		) ( struct-map
			KM3_Attribute
			:name "self"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type Double
			:location "70:3-70:27"
		) ( struct-map
			KM3_Attribute
			:name "accum"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type Double
			:location "71:3-71:28"
		) ( struct-map
			KM3_Attribute
			:name "count"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type Integer
			:location "72:3-72:29"
		) ( struct-map
			KM3_Reference
			:name "trace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type HPROF_Trace
			:location "73:3-73:44"
			:isContainer false
			:opposite times
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Time
			:type HPROF_Method
			:location "74:3-74:29"
			:isContainer false
		)]
	) ) ( def HPROF_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[HPROF_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Day
			:location "78:3-78:23"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Month
			:location "79:3-79:27"
		) ( struct-map
			KM3_Attribute
			:name "dayOfMonth"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Integer
			:location "80:3-80:34"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Integer
			:location "81:3-81:28"
		) ( struct-map
			KM3_Attribute
			:name "minutes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Integer
			:location "82:3-82:31"
		) ( struct-map
			KM3_Attribute
			:name "seconds"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Integer
			:location "83:3-83:31"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner HPROF_Date
			:type Integer
			:location "84:3-84:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "115:2-115:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "116:2-116:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "117:2-117:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "118:2-118:18"
	) )]
) )
