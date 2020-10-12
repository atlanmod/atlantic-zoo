( declare Bugzilla_ErrorType )
( declare Bugzilla_SeverityType )
( declare Bugzilla_StatusType )
( declare Bugzilla_OperatingSystemType )
( declare Bugzilla_PriorityType )
( declare Bugzilla_ReportedPlatformType )
( declare Bugzilla_ResolutionType )
( declare Bugzilla_BugzillaRoot )
( declare Bugzilla_Bug )
( declare Bugzilla_StringElt )
( declare Bugzilla_Keywords )
( declare Bugzilla_Dependson )
( declare Bugzilla_Blocks )
( declare Bugzilla_Cc )
( declare Bugzilla_LongDesc )
( declare Bugzilla_Attachment )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def Bugzilla ( struct-map
	KM3_Package
	:contents[( def ErrorType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "et_null"
		:location "15:3-15:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "et_NotFound"
		:location "16:3-16:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "et_NotPermitted"
		:location "17:3-17:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "et_InvalidBugId"
		:location "18:3-18:27"
	)] ) ) ( def SeverityType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "st_null"
		:location "23:3-23:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_blocker"
		:location "25:3-25:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_critical"
		:location "27:3-27:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_major"
		:location "29:3-29:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_normal"
		:location "31:3-31:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_minor"
		:location "33:3-33:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_trivial"
		:location "35:3-35:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_enhancement"
		:location "37:3-37:26"
	)] ) ) ( def StatusType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "st_null"
		:location "42:3-42:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_UNCONFIRMED"
		:location "44:3-44:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_NEW"
		:location "46:3-46:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_ASSIGNED"
		:location "48:3-48:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_REOPENED"
		:location "50:3-50:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_RESOLVED"
		:location "52:3-52:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_VERIFIED"
		:location "54:3-54:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "st_CLOSED"
		:location "56:3-56:21"
	)] ) ) ( def OperatingSystemType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ost_null"
		:location "61:3-61:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_all"
		:location "62:3-62:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows 3.1"
		:location "63:3-63:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows 95"
		:location "64:3-64:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows 98"
		:location "65:3-65:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows ME"
		:location "66:3-66:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows 2000"
		:location "67:3-67:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows NT"
		:location "68:3-68:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows XP"
		:location "69:3-69:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows Vista"
		:location "70:3-70:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Windows Server 2003"
		:location "71:3-71:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 7"
		:location "72:3-72:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 7.5"
		:location "73:3-73:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 7.6.1"
		:location "74:3-74:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 8.0"
		:location "75:3-75:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 8.5"
		:location "76:3-76:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 8.6"
		:location "77:3-77:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_MacSystem 9.x"
		:location "78:3-78:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Mac OS X 10.0"
		:location "79:3-79:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Mac OS X 10.1"
		:location "80:3-80:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Mac OS X 10.2"
		:location "81:3-81:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Mac OS X 10.3"
		:location "82:3-82:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Linux"
		:location "83:3-83:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_BDS/OS"
		:location "84:3-84:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_FreeBSD"
		:location "85:3-85:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_NetBSD"
		:location "86:3-86:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_OpenBSD"
		:location "87:3-87:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_AIX"
		:location "88:3-88:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_BeOS"
		:location "89:3-89:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_HP-UX"
		:location "90:3-90:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_IRIX"
		:location "91:3-91:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Neutrino"
		:location "92:3-92:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_OpenVMS"
		:location "93:3-93:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_OS/2"
		:location "94:3-94:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_OSF/1"
		:location "95:3-95:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_Solaris"
		:location "96:3-96:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_SunOS"
		:location "97:3-97:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ost_other"
		:location "98:3-98:21"
	)] ) ) ( def PriorityType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pt_null"
		:location "103:3-103:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_P1"
		:location "105:3-105:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_P2"
		:location "106:3-106:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_P3"
		:location "107:3-107:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_P4"
		:location "108:3-108:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "pt_P5"
		:location "110:3-110:17"
	)] ) ) ( def ReportedPlatformType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rpt_null"
		:location "115:3-115:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_all"
		:location "116:3-116:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_DEC"
		:location "117:3-117:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_HP"
		:location "118:3-118:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_Macintosh"
		:location "119:3-119:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_PC"
		:location "120:3-120:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_SGI"
		:location "121:3-121:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_Sun"
		:location "122:3-122:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "rpt_other"
		:location "123:3-123:21"
	)] ) ) ( def ResolutionType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rt_null"
		:location "128:3-128:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_FIXED"
		:location "130:3-130:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_INVALID"
		:location "132:3-132:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_WONTFIX"
		:location "134:3-134:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_LATER"
		:location "136:3-136:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_REMIND"
		:location "138:3-138:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_DUPLICATE"
		:location "140:3-140:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_WORKSFORME"
		:location "142:3-142:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_MOVED"
		:location "144:3-144:20"
	)] ) ) ( def Bugzilla_BugzillaRoot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_BugzillaRoot
			:type String
			:location "153:3-153:30"
		) ( struct-map
			KM3_Attribute
			:name "urlbase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_BugzillaRoot
			:type String
			:location "154:3-154:30"
		) ( struct-map
			KM3_Attribute
			:name "maintainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_BugzillaRoot
			:type String
			:location "155:3-155:33"
		) ( struct-map
			KM3_Attribute
			:name "exporter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_BugzillaRoot
			:type String
			:location "156:3-156:36"
		) ( struct-map
			KM3_Reference
			:name "bugs"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Bugzilla_BugzillaRoot
			:type Bugzilla_Bug
			:location "158:3-158:75"
			:isContainer true
			:opposite bug_bugzillaRoot
		)]
	) ) ( def Bugzilla_Bug ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "error"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type ErrorType
			:location "164:3-164:36"
		) ( struct-map
			KM3_Attribute
			:name "bug_id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "167:3-167:29"
		) ( struct-map
			KM3_Attribute
			:name "exporter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "169:3-169:31"
		) ( struct-map
			KM3_Attribute
			:name "urlbase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "170:3-170:30"
		) ( struct-map
			KM3_Attribute
			:name "bug_status"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type StatusType
			:location "173:3-173:37"
		) ( struct-map
			KM3_Attribute
			:name "resolution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type ResolutionType
			:location "175:3-175:46"
		) ( struct-map
			KM3_Attribute
			:name "product"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "177:3-177:30"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type PriorityType
			:location "179:3-179:37"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "181:3-181:30"
		) ( struct-map
			KM3_Attribute
			:name "rep_platform"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type ReportedPlatformType
			:location "183:3-183:49"
		) ( struct-map
			KM3_Attribute
			:name "assigned_to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "185:3-185:34"
		) ( struct-map
			KM3_Attribute
			:name "delta_ts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "187:3-187:31"
		) ( struct-map
			KM3_Attribute
			:name "component"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "189:3-189:32"
		) ( struct-map
			KM3_Attribute
			:name "reporter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "191:3-191:31"
		) ( struct-map
			KM3_Attribute
			:name "target_milestone"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "193:3-193:44"
		) ( struct-map
			KM3_Attribute
			:name "bug_severity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type SeverityType
			:location "195:3-195:41"
		) ( struct-map
			KM3_Attribute
			:name "creation_ts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "197:3-197:34"
		) ( struct-map
			KM3_Attribute
			:name "qa_contact"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "199:3-199:38"
		) ( struct-map
			KM3_Attribute
			:name "status_whiteboard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "201:3-201:45"
		) ( struct-map
			KM3_Attribute
			:name "op_sys"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type OperatingSystemType
			:location "203:3-203:42"
		) ( struct-map
			KM3_Attribute
			:name "bug_file_loc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "205:3-205:40"
		) ( struct-map
			KM3_Attribute
			:name "short_desc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bugzilla_Bug
			:type String
			:location "207:3-207:38"
		) ( struct-map
			KM3_Reference
			:name "bug_bugzillaRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Bug
			:type Bugzilla_BugzillaRoot
			:location "162:3-162:61"
			:isContainer false
			:opposite bugs
		) ( struct-map
			KM3_Reference
			:name "keywords"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_Keywords
			:location "209:3-209:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dependson"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_Dependson
			:location "211:3-211:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "blocks"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_Blocks
			:location "213:3-213:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cc"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_Cc
			:location "215:3-215:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "long_desc"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_LongDesc
			:location "217:3-217:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attachment"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Bugzilla_Bug
			:type Bugzilla_Attachment
			:location "219:3-219:58"
			:isContainer true
		)]
	) ) ( def Bugzilla_StringElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_StringElt
			:type String
			:location "224:3-224:28"
		)]
	) ) ( def Bugzilla_Keywords ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bugzilla_StringElt]
		:structuralFeatures[]
	) ) ( def Bugzilla_Dependson ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bugzilla_StringElt]
		:structuralFeatures[]
	) ) ( def Bugzilla_Blocks ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bugzilla_StringElt]
		:structuralFeatures[]
	) ) ( def Bugzilla_Cc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bugzilla_StringElt]
		:structuralFeatures[]
	) ) ( def Bugzilla_LongDesc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isPrivate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_LongDesc
			:type Boolean
			:location "241:3-241:33"
		) ( struct-map
			KM3_Attribute
			:name "who"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_LongDesc
			:type String
			:location "242:3-242:26"
		) ( struct-map
			KM3_Attribute
			:name "bug_when"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_LongDesc
			:type String
			:location "243:3-243:31"
		) ( struct-map
			KM3_Attribute
			:name "thetext"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_LongDesc
			:type String
			:location "244:3-244:30"
		)]
	) ) ( def Bugzilla_Attachment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isObsolete"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type Boolean
			:location "249:3-249:34"
		) ( struct-map
			KM3_Attribute
			:name "isPatch"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type Boolean
			:location "250:3-250:31"
		) ( struct-map
			KM3_Attribute
			:name "isPrivate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type Boolean
			:location "251:3-251:33"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type String
			:location "252:3-252:25"
		) ( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type String
			:location "253:3-253:27"
		) ( struct-map
			KM3_Attribute
			:name "desc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type String
			:location "254:3-254:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type String
			:location "255:3-255:27"
		) ( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bugzilla_Attachment
			:type String
			:location "256:3-256:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "265:2-265:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "266:2-266:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "267:2-267:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "268:2-268:18"
	) )]
) )
