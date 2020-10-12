( declare CPL_Element )
( declare CPL_CPL )
( declare CPL_NodeContainer )
( declare CPL_SubAction )
( declare CPL_Outgoing )
( declare CPL_Incoming )
( declare CPL_NotPresent )
( declare CPL_Otherwise )
( declare CPL_SwitchedAddress )
( declare CPL_SwitchedString )
( declare CPL_SwitchedLanguage )
( declare CPL_SwitchedTime )
( declare CPL_SwitchedPriority )
( declare CPL_Busy )
( declare CPL_NoAnswer )
( declare CPL_Redirection )
( declare CPL_Failure )
( declare CPL_Default )
( declare CPL_Node )
( declare CPL_Switch )
( declare CPL_AddressSwitch )
( declare CPL_StringSwitch )
( declare CPL_LanguageSwitch )
( declare CPL_TimeSwitch )
( declare CPL_PrioritySwitch )
( declare CPL_Location )
( declare CPL_SubCall )
( declare CPL_Action )
( declare CPL_SignallingAction )
( declare CPL_Proxy )
( declare CPL_Redirect )
( declare CPL_Reject )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def CPL ( struct-map
	KM3_Package
	:contents[( def CPL_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPL_CPL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subActions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_CPL
			:type CPL_SubAction
			:location "17:3-17:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_CPL
			:type CPL_Outgoing
			:location "18:3-18:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_CPL
			:type CPL_Incoming
			:location "19:3-19:48"
			:isContainer true
		)]
	) ) ( def CPL_NodeContainer ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CPL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_NodeContainer
			:type CPL_Node
			:location "24:3-24:44"
			:isContainer true
		)]
	) ) ( def CPL_SubAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SubAction
			:type String
			:location "28:3-28:25"
		)]
	) ) ( def CPL_Outgoing ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Incoming ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_NotPresent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Otherwise ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_SwitchedAddress ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "is"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedAddress
			:type String
			:location "47:3-47:30"
		) ( struct-map
			KM3_Attribute
			:name "contains"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedAddress
			:type String
			:location "49:3-49:36"
		) ( struct-map
			KM3_Attribute
			:name "subDomainOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedAddress
			:type String
			:location "51:3-51:39"
		)]
	) ) ( def CPL_SwitchedString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "is"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedString
			:type String
			:location "55:3-55:30"
		) ( struct-map
			KM3_Attribute
			:name "contains"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedString
			:type String
			:location "56:3-56:36"
		)]
	) ) ( def CPL_SwitchedLanguage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "matches"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SwitchedLanguage
			:type String
			:location "60:3-60:30"
		)]
	) ) ( def CPL_SwitchedTime ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dtstart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "64:3-64:30"
		) ( struct-map
			KM3_Attribute
			:name "dtend"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "65:3-65:33"
		) ( struct-map
			KM3_Attribute
			:name "duration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "66:3-66:36"
		) ( struct-map
			KM3_Attribute
			:name "freq"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "67:3-67:32"
		) ( struct-map
			KM3_Attribute
			:name "until"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "68:3-68:33"
		) ( struct-map
			KM3_Attribute
			:name "count"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "69:3-69:33"
		) ( struct-map
			KM3_Attribute
			:name "interval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "70:3-70:31"
		) ( struct-map
			KM3_Attribute
			:name "bySecond"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "71:3-71:36"
		) ( struct-map
			KM3_Attribute
			:name "byMinute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "72:3-72:36"
		) ( struct-map
			KM3_Attribute
			:name "byHour"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "73:3-73:34"
		) ( struct-map
			KM3_Attribute
			:name "byDay"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "74:3-74:33"
		) ( struct-map
			KM3_Attribute
			:name "byMonthDay"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "75:3-75:38"
		) ( struct-map
			KM3_Attribute
			:name "byYearDay"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "76:3-76:37"
		) ( struct-map
			KM3_Attribute
			:name "byWeekNo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "77:3-77:36"
		) ( struct-map
			KM3_Attribute
			:name "byMonth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Attribute
			:name "wkst"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "79:3-79:27"
		) ( struct-map
			KM3_Attribute
			:name "bySetPos"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedTime
			:type String
			:location "80:3-80:36"
		)]
	) ) ( def CPL_SwitchedPriority ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "less"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedPriority
			:type String
			:location "85:3-85:32"
		) ( struct-map
			KM3_Attribute
			:name "greater"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedPriority
			:type String
			:location "86:3-86:35"
		) ( struct-map
			KM3_Attribute
			:name "equal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_SwitchedPriority
			:type String
			:location "87:3-87:33"
		)]
	) ) ( def CPL_Busy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_NoAnswer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Redirection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Failure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Default ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_NodeContainer]
		:structuralFeatures[]
	) ) ( def CPL_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CPL_Element]
		:structuralFeatures[]
	) ) ( def CPL_Switch ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CPL_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "notPresent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Switch
			:type CPL_NotPresent
			:location "117:3-117:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "otherwise"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Switch
			:type CPL_Otherwise
			:location "119:3-119:50"
			:isContainer true
		)]
	) ) ( def CPL_AddressSwitch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Switch]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "field"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_AddressSwitch
			:type String
			:location "124:3-124:28"
		) ( struct-map
			KM3_Attribute
			:name "subField"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_AddressSwitch
			:type String
			:location "126:3-126:36"
		) ( struct-map
			KM3_Reference
			:name "addresses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_AddressSwitch
			:type CPL_SwitchedAddress
			:location "127:3-127:62"
			:isContainer true
		)]
	) ) ( def CPL_StringSwitch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Switch]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "field"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_StringSwitch
			:type String
			:location "132:3-132:28"
		) ( struct-map
			KM3_Reference
			:name "strings"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_StringSwitch
			:type CPL_SwitchedString
			:location "133:3-133:59"
			:isContainer true
		)]
	) ) ( def CPL_LanguageSwitch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Switch]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "languages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_LanguageSwitch
			:type CPL_SwitchedLanguage
			:location "137:3-137:63"
			:isContainer true
		)]
	) ) ( def CPL_TimeSwitch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Switch]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tzid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_TimeSwitch
			:type String
			:location "141:3-141:32"
		) ( struct-map
			KM3_Attribute
			:name "tzurl"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_TimeSwitch
			:type String
			:location "142:3-142:33"
		) ( struct-map
			KM3_Reference
			:name "times"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_TimeSwitch
			:type CPL_SwitchedTime
			:location "143:3-143:55"
			:isContainer true
		)]
	) ) ( def CPL_PrioritySwitch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Switch]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "priorities"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPL_PrioritySwitch
			:type CPL_SwitchedPriority
			:location "147:3-147:64"
			:isContainer true
		)]
	) ) ( def CPL_Location ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Node CPL_NodeContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Location
			:type String
			:location "153:3-153:26"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Location
			:type String
			:location "154:3-154:36"
		) ( struct-map
			KM3_Attribute
			:name "clear"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Location
			:type String
			:location "155:3-155:28"
		)]
	) ) ( def CPL_SubCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_Node]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_SubCall
			:type String
			:location "162:3-162:26"
		)]
	) ) ( def CPL_Action ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CPL_Node]
		:structuralFeatures[]
	) ) ( def CPL_SignallingAction ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[CPL_Action]
		:structuralFeatures[]
	) ) ( def CPL_Proxy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_SignallingAction]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timeout"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type String
			:location "173:3-173:35"
		) ( struct-map
			KM3_Attribute
			:name "recurse"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Proxy
			:type String
			:location "174:3-174:30"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Proxy
			:type String
			:location "176:3-176:31"
		) ( struct-map
			KM3_Reference
			:name "busy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type CPL_Busy
			:location "178:3-178:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noAnswer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type CPL_NoAnswer
			:location "179:3-179:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "redirection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type CPL_Redirection
			:location "180:3-180:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "failure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type CPL_Failure
			:location "181:3-181:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Proxy
			:type CPL_Default
			:location "182:3-182:46"
			:isContainer true
		)]
	) ) ( def CPL_Redirect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_SignallingAction]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "permanent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Redirect
			:type String
			:location "186:3-186:32"
		)]
	) ) ( def CPL_Reject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPL_SignallingAction]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "status"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPL_Reject
			:type String
			:location "191:3-191:29"
		) ( struct-map
			KM3_Attribute
			:name "reason"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CPL_Reject
			:type String
			:location "192:3-192:34"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "199:2-199:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "200:2-200:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "201:2-201:18"
	) )]
) )
