( declare DeploymentReport_DeploymentReport )
( declare DeploymentReport_DeploymentImport )
( declare DeploymentReport_ImportNamespaceIdentity )
( declare DeploymentReport_NamespaceIdentity )
( declare DeploymentReport_Applications )
( declare DeploymentReport_LogicalServers )
( declare DeploymentReport_OuterSystem )
( declare DeploymentReport_Binding )
( declare DeploymentReport_Zone )
( declare DeploymentReport_ReportObject )
( declare DeploymentReport_SequenceReport )
( declare DeploymentReport_BoundLogicalServer )
( declare DeploymentReport_LogicalServer )
( declare DeploymentReport_Application )
( declare DeploymentReport_ReportSystem )
( declare DeploymentReport_ReportResource )
( declare DeploymentReport_ReportEndpoint )
( declare DeploymentReport_Setting )
( declare DeploymentReport_SettingFacet )
( declare DeploymentReport_SettingInstanceValue )
( declare DeploymentReport_SettingAttributes )
( declare DeploymentReport_SettingValue )
( declare DeploymentReport_ErrorCollection )
( declare DeploymentReport_DocumentError )
( declare DeploymentReport_DocumentResolutionError )
( declare DeploymentReport_DocumentConstraintError )
( declare DeploymentReport_FailedInput )
( declare DeploymentReport_Description )
( declare DeploymentReport_Guid )
( declare DeploymentReport_SimpleName )
( declare DeploymentReport_Path )
( declare DeploymentReport_FourPartVersionType )
( declare DeploymentReport_PublicKeyType )
( declare DeploymentReport_PublicKeyTokenType )
( declare DeploymentReport_Culture )
( declare DeploymentReport_CultureNeutral )
( declare DeploymentReport_ProcessorArchitectures )
( declare DeploymentReport_Platform )
( declare DeploymentReport_SettingState )
( declare DeploymentReport_Element )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def DeploymentReport ( struct-map
	KM3_Package
	:contents[( def ProcessorArchitectures ( :literals[( struct-map
		KM3_EnumLiteral
		:name "x86"
		:location "330:3-330:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "ia64"
		:location "331:3-331:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "amd64"
		:location "332:3-332:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "wow64"
		:location "333:3-333:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "msil"
		:location "334:3-334:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "shx"
		:location "335:3-335:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "arm"
		:location "336:3-336:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "data"
		:location "337:3-337:17"
	)] ) ) ( def Platform ( :literals[( struct-map
		KM3_EnumLiteral
		:name "x86"
		:location "344:3-344:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "ia64"
		:location "345:3-345:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "amd64"
		:location "346:3-346:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "wow64"
		:location "347:3-347:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "msil"
		:location "348:3-348:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "shx"
		:location "349:3-349:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "arm"
		:location "350:3-350:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "data"
		:location "351:3-351:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "*"
		:location "352:3-352:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "neutral"
		:location "353:3-353:20"
	)] ) ) ( def SettingState ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Set"
		:location "360:3-360:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "NotSet"
		:location "361:3-361:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Error"
		:location "362:3-362:18"
	)] ) ) ( def DeploymentReport_DeploymentReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "import"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DeploymentReport
			:type DeploymentReport_DeploymentImport
			:location "21:3-21:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "applications"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DeploymentReport
			:type DeploymentReport_Applications
			:location "22:3-22:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DeploymentReport
			:type DeploymentReport_Binding
			:location "23:3-23:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "logicalServers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DeploymentReport
			:type DeploymentReport_LogicalServers
			:location "24:3-24:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "errors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DeploymentReport
			:type DeploymentReport_ErrorCollection
			:location "25:3-25:44"
			:isContainer false
		)]
	) ) ( def DeploymentReport_DeploymentImport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "alias"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DeploymentImport
			:type DeploymentReport_SimpleName
			:location "33:3-33:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "identity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DeploymentImport
			:type DeploymentReport_ImportNamespaceIdentity
			:location "34:3-34:77"
			:isContainer true
			:opposite import
		)]
	) ) ( def DeploymentReport_ImportNamespaceIdentity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_NamespaceIdentity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "import"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_ImportNamespaceIdentity
			:type DeploymentReport_DeploymentImport
			:location "38:3-38:60"
			:isContainer false
			:opposite identity
		)]
	) ) ( def DeploymentReport_NamespaceIdentity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "platform"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type Platform
			:location "50:3-50:39"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type DeploymentReport_Path
			:location "45:3-45:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type DeploymentReport_FourPartVersionType
			:location "46:3-46:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publicKey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type DeploymentReport_PublicKeyType
			:location "47:3-47:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publicKeyToken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type DeploymentReport_PublicKeyTokenType
			:location "48:3-48:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "culture"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_NamespaceIdentity
			:type DeploymentReport_CultureNeutral
			:location "49:3-49:44"
			:isContainer false
		)]
	) ) ( def DeploymentReport_Applications ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Applications
			:type DeploymentReport_OuterSystem
			:location "58:3-58:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Applications
			:type DeploymentReport_Application
			:location "59:3-59:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_LogicalServers ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "zone"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_LogicalServers
			:type DeploymentReport_Zone
			:location "68:3-68:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "logicalServer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_LogicalServers
			:type DeploymentReport_LogicalServer
			:location "69:3-69:49"
			:isContainer false
		)]
	) ) ( def DeploymentReport_OuterSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_OuterSystem
			:type String
			:location "79:3-79:28"
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_OuterSystem
			:type DeploymentReport_OuterSystem
			:location "77:3-77:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_OuterSystem
			:type DeploymentReport_Application
			:location "78:3-78:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "zone"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Binding
			:type DeploymentReport_Zone
			:location "87:3-87:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "boundLogicalServer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Binding
			:type DeploymentReport_BoundLogicalServer
			:location "88:3-88:59"
			:isContainer false
		)]
	) ) ( def DeploymentReport_Zone ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_Zone
			:type String
			:location "98:3-98:28"
		) ( struct-map
			KM3_Reference
			:name "zone"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Zone
			:type DeploymentReport_Zone
			:location "95:3-95:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "boundLogicalServer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Zone
			:type DeploymentReport_BoundLogicalServer
			:location "96:3-96:59"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "logicalServer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Zone
			:type DeploymentReport_LogicalServer
			:location "97:3-97:49"
			:isContainer false
		)]
	) ) ( def DeploymentReport_ReportObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type String
			:location "112:3-112:28"
		) ( struct-map
			KM3_Attribute
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type String
			:location "113:3-113:34"
		) ( struct-map
			KM3_Attribute
			:name "extends"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type String
			:location "114:3-114:33"
		) ( struct-map
			KM3_Attribute
			:name "hostedOn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type String
			:location "116:3-116:37"
		) ( struct-map
			KM3_Reference
			:name "sequence"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type DeploymentReport_SequenceReport
			:location "111:3-111:74"
			:isContainer true
			:opposite report
		) ( struct-map
			KM3_Reference
			:name "instanceId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_ReportObject
			:type DeploymentReport_Guid
			:location "115:9-115:38"
			:isContainer false
		)]
	) ) ( def DeploymentReport_SequenceReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "report"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_SequenceReport
			:type DeploymentReport_ReportObject
			:location "120:3-120:56"
			:isContainer false
			:opposite sequence
		) ( struct-map
			KM3_Reference
			:name "setting"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_SequenceReport
			:type DeploymentReport_Setting
			:location "121:3-121:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SequenceReport
			:type DeploymentReport_ReportSystem
			:location "122:3-122:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SequenceReport
			:type DeploymentReport_ReportResource
			:location "123:3-123:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "endpoint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SequenceReport
			:type DeploymentReport_ReportEndpoint
			:location "124:3-124:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_BoundLogicalServer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_BoundLogicalServer
			:type String
			:location "133:3-133:28"
		) ( struct-map
			KM3_Attribute
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_BoundLogicalServer
			:type String
			:location "134:3-134:34"
		) ( struct-map
			KM3_Attribute
			:name "extends"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_BoundLogicalServer
			:type String
			:location "135:3-135:33"
		) ( struct-map
			KM3_Reference
			:name "setting"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_BoundLogicalServer
			:type DeploymentReport_Setting
			:location "131:3-131:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_BoundLogicalServer
			:type DeploymentReport_Application
			:location "132:3-132:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_LogicalServer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_ReportObject]
		:structuralFeatures[]
	) ) ( def DeploymentReport_Application ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_ReportObject]
		:structuralFeatures[]
	) ) ( def DeploymentReport_ReportSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_ReportObject]
		:structuralFeatures[]
	) ) ( def DeploymentReport_ReportResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_ReportObject]
		:structuralFeatures[]
	) ) ( def DeploymentReport_ReportEndpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_ReportObject]
		:structuralFeatures[]
	) ) ( def DeploymentReport_Setting ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Setting
			:type DeploymentReport_SettingInstanceValue
			:location "177:3-177:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "facet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Setting
			:type DeploymentReport_SettingFacet
			:location "178:3-178:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingAttributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_Setting
			:type DeploymentReport_SettingAttributes
			:location "179:3-179:52"
			:isContainer false
		)]
	) ) ( def DeploymentReport_SettingFacet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingFacet
			:type DeploymentReport_SettingInstanceValue
			:location "183:3-183:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingAttributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_SettingFacet
			:type DeploymentReport_SettingAttributes
			:location "184:3-184:52"
			:isContainer false
		)]
	) ) ( def DeploymentReport_SettingInstanceValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingInstanceValue
			:type String
			:location "188:3-188:37"
		) ( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingInstanceValue
			:type Boolean
			:location "189:3-189:34"
		)]
	) ) ( def DeploymentReport_SettingAttributes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type String
			:location "193:3-193:28"
		) ( struct-map
			KM3_Attribute
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type String
			:location "194:3-194:34"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type SettingState
			:location "195:3-195:41"
		) ( struct-map
			KM3_Attribute
			:name "fixed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type Boolean
			:location "196:3-196:36"
		) ( struct-map
			KM3_Attribute
			:name "list"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type Boolean
			:location "197:3-197:35"
		) ( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type Boolean
			:location "198:3-198:35"
		) ( struct-map
			KM3_Attribute
			:name "secure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type Boolean
			:location "199:3-199:37"
		) ( struct-map
			KM3_Attribute
			:name "failedToSerialize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingAttributes
			:type Boolean
			:location "200:3-200:48"
		)]
	) ) ( def DeploymentReport_SettingValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingValue
			:type String
			:location "207:3-207:38"
		) ( struct-map
			KM3_Attribute
			:name "Null"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingValue
			:type Boolean
			:location "208:3-208:34"
		) ( struct-map
			KM3_Attribute
			:name "Secure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_SettingValue
			:type Boolean
			:location "209:3-209:36"
		)]
	) ) ( def DeploymentReport_ErrorCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "documentError"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_ErrorCollection
			:type DeploymentReport_DocumentError
			:location "221:3-221:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "documentResolutionError"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_ErrorCollection
			:type DeploymentReport_DocumentResolutionError
			:location "222:3-222:69"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "documentConstraintError"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_ErrorCollection
			:type DeploymentReport_DocumentConstraintError
			:location "223:3-223:69"
			:isContainer false
		)]
	) ) ( def DeploymentReport_DocumentError ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Code"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DocumentError
			:type Integer
			:location "231:3-231:29"
		) ( struct-map
			KM3_Attribute
			:name "Level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DocumentError
			:type Integer
			:location "232:3-232:30"
		) ( struct-map
			KM3_Attribute
			:name "File"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentError
			:type String
			:location "233:3-233:33"
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentError
			:type DeploymentReport_Description
			:location "230:3-230:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_DocumentResolutionError ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_DocumentError]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Statement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DocumentResolutionError
			:type String
			:location "240:3-240:33"
		)]
	) ) ( def DeploymentReport_DocumentConstraintError ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_DocumentError]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "constraintMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "249:3-249:40"
		) ( struct-map
			KM3_Attribute
			:name "constraintDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "250:3-250:44"
		) ( struct-map
			KM3_Attribute
			:name "targetInstancePath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "251:3-251:47"
		) ( struct-map
			KM3_Attribute
			:name "ownerInstancePath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "252:3-252:46"
		) ( struct-map
			KM3_Attribute
			:name "constraintErrorCode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "253:3-253:48"
		) ( struct-map
			KM3_Attribute
			:name "constraintErrorMessage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type String
			:location "254:3-254:51"
		) ( struct-map
			KM3_Reference
			:name "failedInput"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_DocumentConstraintError
			:type DeploymentReport_FailedInput
			:location "248:3-248:45"
			:isContainer false
		)]
	) ) ( def DeploymentReport_FailedInput ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_FailedInput
			:type String
			:location "261:3-261:38"
		)]
	) ) ( def DeploymentReport_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DeploymentReport_Description
			:type String
			:location "268:3-268:38"
		)]
	) ) ( def DeploymentReport_Guid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_SimpleName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_FourPartVersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_PublicKeyType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_PublicKeyTokenType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_Culture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_CultureNeutral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DeploymentReport_Element]
		:structuralFeatures[]
	) ) ( def DeploymentReport_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DeploymentReport_Element
			:type String
			:location "373:3-373:29"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "379:3-379:20"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "380:3-380:21"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "381:3-381:21"
	) )]
) )
