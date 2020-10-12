( declare SDM_SystemDefinitionModel )
( declare SDM_Information )
( declare SDM_Import )
( declare SDM_ImportNamespaceIdentity )
( declare SDM_SDMCommunicationDefinition )
( declare SDM_SDMContainmentDefinition )
( declare SDM_SDMDelegationDefinition )
( declare SDM_SDMReferenceDefinition )
( declare SDM_SDMEndpointDefinition )
( declare SDM_SDMResourceDefinition )
( declare SDM_SDMSystemDefinition )
( declare SDM_SDMConstraintDefinition )
( declare SDM_SDMManager )
( declare SDM_ManagerDeclaration )
( declare SDM_ObjectDefinition )
( declare SDM_OBFlow )
( declare SDM_OBRelationshipConstraint )
( declare SDM_OBConstraint )
( declare SDM_OBConstraintGroup )
( declare SDM_OBEndpointDefinition )
( declare SDM_OBSystemDefinition )
( declare SDM_OBResourceDefinition )
( declare SDM_OBCommunicationDefinition )
( declare SDM_OBContainmentDefinition )
( declare SDM_OBDelegationDefinition )
( declare SDM_OBReferenceDefinition )
( declare SDM_OBHostingDefinition )
( declare SDM_OBEndpoint )
( declare SDM_OBSubsystem )
( declare SDM_OBResource )
( declare SDM_OBHosting )
( declare SDM_OBContainment )
( declare SDM_OBConnection )
( declare SDM_OBDelegation )
( declare SDM_OBReference )
( declare SDM_SystemDefinition )
( declare SDM_EndpointDefinition )
( declare SDM_ResourceDefinition )
( declare SDM_RelationshipDefinition )
( declare SDM_RDObjectConstraint )
( declare SDM_RDConstraint )
( declare SDM_RDConstraintGroup )
( declare SDM_RDFlow )
( declare SDM_RDConnection )
( declare SDM_RDHosting )
( declare SDM_RDDelegation )
( declare SDM_RDReference )
( declare SDM_RDContainment )
( declare SDM_CommunicationDefinition )
( declare SDM_HostingDefinition )
( declare SDM_ContainmentDefinition )
( declare SDM_DelegationDefinition )
( declare SDM_ReferenceDefinition )
( declare SDM_Member )
( declare SDM_MembSettingValue )
( declare SDM_MembSettingValueList )
( declare SDM_ObjectMember )
( declare SDM_RelationshipMember )
( declare SDM_SystemMember )
( declare SDM_EndpointMember )
( declare SDM_ResourceMember )
( declare SDM_HostingMember )
( declare SDM_CommunicationMember )
( declare SDM_ContainmentMember )
( declare SDM_DelegationMember )
( declare SDM_ReferenceMember )
( declare SDM_DesignData )
( declare SDM_NameSpace )
( declare SDM_ObjectConstraint )
( declare SDM_OCConstraint )
( declare SDM_OCRelationshipConstraint )
( declare SDM_OCConstraintGroup )
( declare SDM_RelationshipConstraint )
( declare SDM_RCConstraint )
( declare SDM_RCRelationshipConstraint )
( declare SDM_RCObjectConstraint )
( declare SDM_RCConstraintGroup )
( declare SDM_ConstraintGroup )
( declare SDM_CGConstraint )
( declare SDM_CGRelationshipConstraint )
( declare SDM_CGObjectConstraint )
( declare SDM_StructuralConstraint )
( declare SDM_ConstraintDefinition )
( declare SDM_CDRelationshipConstraint )
( declare SDM_CDConstraintGroup )
( declare SDM_CDObjectConstraint )
( declare SDM_CDConstraint )
( declare SDM_ConstraintMember )
( declare SDM_Definition )
( declare SDM_DefSettingDeclaration )
( declare SDM_DefSettingValue )
( declare SDM_DefSettingValueList )
( declare SDM_SimpleName )
( declare SDM_QualifiedName )
( declare SDM_Path )
( declare SDM_SettingPath )
( declare SDM_NamespaceIdentity )
( declare SDM_FlowDefinition )
( declare SDM_FlowMember )
( declare SDM_ValueTransfer )
( declare SDM_Output )
( declare SDM_Input )
( declare SDM_SettingDefinitions )
( declare SDM_SettingMember )
( declare SDM_SettingsAttributes )
( declare SDM_SettingMemberAccess )
( declare SDM_SettingMemberSecure )
( declare SDM_Facet )
( declare SDM_SettingValue )
( declare SDM_SettingValueList )
( declare SDM_Value )
( declare SDM_SettingValueAttributes )
( declare SDM_Description )
( declare SDM_Entry )
( declare SDM_DescriptionEntry )
( declare SDM_Substitute )
( declare SDM_PathList )
( declare SDM_MaxOccurs )
( declare SDM_MinOccurs )
( declare SDM_FourPartVersionType )
( declare SDM_PublicKeyType )
( declare SDM_PublicKeyTokenType )
( declare SDM_CompilationHashType )
( declare SDM_RolesList )
( declare SDM_Culture )
( declare SDM_CultureNeutral )
( declare SDM_ProcessorArchitectures )
( declare SDM_Platform )
( declare SDM_ConstraintEvaluation )
( declare SDM_Element )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def SDM ( struct-map
	KM3_Package
	:contents[( def SettingMemberAccess ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ReadWrite"
		:location "811:3-811:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReadOnly"
		:location "812:3-812:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "WriteOnly"
		:location "813:3-813:22"
	)] ) ) ( def SettingMemberSecure ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Always"
		:location "821:3-821:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "PerInstance"
		:location "822:3-822:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Never"
		:location "823:3-823:18"
	)] ) ) ( def RolesList ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Host"
		:location "944:3-944:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Guest"
		:location "945:3-945:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Parent"
		:location "946:3-946:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Member"
		:location "947:3-947:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Source"
		:location "948:3-948:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Dependent"
		:location "949:3-949:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Proxy"
		:location "950:3-950:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Delegate"
		:location "951:3-951:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Client"
		:location "952:3-952:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Server"
		:location "953:3-953:19"
	)] ) ) ( def ProcessorArchitectures ( :literals[( struct-map
		KM3_EnumLiteral
		:name "x86"
		:location "973:3-973:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "ia64"
		:location "974:3-974:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "amd64"
		:location "975:3-975:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "wow64"
		:location "976:3-976:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "msil"
		:location "977:3-977:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "shx"
		:location "978:3-978:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "arm"
		:location "979:3-979:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "data"
		:location "980:3-980:17"
	)] ) ) ( def Platform ( :literals[( struct-map
		KM3_EnumLiteral
		:name "x86"
		:location "987:3-987:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "ia64"
		:location "988:3-988:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "amd64"
		:location "989:3-989:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "wow64"
		:location "990:3-990:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "msil"
		:location "991:3-991:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "shx"
		:location "992:3-992:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "arm"
		:location "993:3-993:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "data"
		:location "994:3-994:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "*"
		:location "995:3-995:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "neutral"
		:location "996:3-996:20"
	)] ) ) ( def ConstraintEvaluation ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Design"
		:location "1003:3-1003:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Never"
		:location "1004:3-1004:18"
	)] ) ) ( def SDM_SystemDefinitionModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "information"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_Information
			:location "21:3-21:71"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "import"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_Import
			:location "22:3-22:61"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "designData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_DesignData
			:location "23:3-23:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingDefinitions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SettingDefinitions
			:location "24:3-24:60"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communicationDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMCommunicationDefinition
			:location "26:3-26:98"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "containmentDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMContainmentDefinition
			:location "27:3-27:94"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "delegationDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMDelegationDefinition
			:location "28:3-28:92"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "referenceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMReferenceDefinition
			:location "29:3-29:90"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "endpointDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMEndpointDefinition
			:location "30:3-30:88"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "resourceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMResourceDefinition
			:location "31:3-31:88"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "systemDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMSystemDefinition
			:location "32:3-32:84"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "constraintDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMConstraintDefinition
			:location "33:3-33:92"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_SDMManager
			:location "34:3-34:66"
			:isContainer true
			:opposite sdm
		) ( struct-map
			KM3_Reference
			:name "nameSpace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_NameSpace
			:location "36:3-36:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "namespaceIdentity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_NamespaceIdentity
			:location "37:3-37:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "documentLanguage"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_Culture
			:location "38:3-38:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compilationHash"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinitionModel
			:type SDM_CompilationHashType
			:location "39:3-39:58"
			:isContainer false
		)]
	) ) ( def SDM_Information ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "friendlyname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type String
			:location "47:3-47:42"
		) ( struct-map
			KM3_Attribute
			:name "companyname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type String
			:location "48:3-48:41"
		) ( struct-map
			KM3_Attribute
			:name "copyright"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type String
			:location "49:3-49:39"
		) ( struct-map
			KM3_Attribute
			:name "trademark"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type String
			:location "50:3-50:39"
		) ( struct-map
			KM3_Attribute
			:name "comments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type String
			:location "52:3-52:38"
		) ( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Information
			:type SDM_SystemDefinitionModel
			:location "46:3-46:65"
			:isContainer false
			:opposite information
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type SDM_Description
			:location "51:3-51:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compilerversion"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Information
			:type SDM_FourPartVersionType
			:location "53:3-53:58"
			:isContainer false
		)]
	) ) ( def SDM_Import ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Import
			:type SDM_SystemDefinitionModel
			:location "60:3-60:60"
			:isContainer false
			:opposite import
		) ( struct-map
			KM3_Reference
			:name "alias"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Import
			:type SDM_SimpleName
			:location "61:3-61:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "identity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Import
			:type SDM_ImportNamespaceIdentity
			:location "62:3-62:77"
			:isContainer true
			:opposite import
		)]
	) ) ( def SDM_ImportNamespaceIdentity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_NamespaceIdentity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "import"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ImportNamespaceIdentity
			:type SDM_Import
			:location "66:3-66:50"
			:isContainer false
			:opposite identity
		)]
	) ) ( def SDM_SDMCommunicationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_CommunicationDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMCommunicationDefinition
			:type SDM_SystemDefinitionModel
			:location "73:3-73:77"
			:isContainer false
			:opposite communicationDefinition
		)]
	) ) ( def SDM_SDMContainmentDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ContainmentDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMContainmentDefinition
			:type SDM_SystemDefinitionModel
			:location "77:3-77:75"
			:isContainer false
			:opposite containmentDefinition
		)]
	) ) ( def SDM_SDMDelegationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_DelegationDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMDelegationDefinition
			:type SDM_SystemDefinitionModel
			:location "81:3-81:74"
			:isContainer false
			:opposite delegationDefinition
		)]
	) ) ( def SDM_SDMReferenceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ReferenceDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMReferenceDefinition
			:type SDM_SystemDefinitionModel
			:location "85:3-85:73"
			:isContainer false
			:opposite referenceDefinition
		)]
	) ) ( def SDM_SDMEndpointDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_EndpointDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMEndpointDefinition
			:type SDM_SystemDefinitionModel
			:location "89:3-89:72"
			:isContainer false
			:opposite endpointDefinition
		)]
	) ) ( def SDM_SDMResourceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ResourceDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMResourceDefinition
			:type SDM_SystemDefinitionModel
			:location "93:3-93:72"
			:isContainer false
			:opposite resourceDefinition
		)]
	) ) ( def SDM_SDMSystemDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SystemDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMSystemDefinition
			:type SDM_SystemDefinitionModel
			:location "97:3-97:70"
			:isContainer false
			:opposite systemDefinition
		)]
	) ) ( def SDM_SDMConstraintDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMConstraintDefinition
			:type SDM_SystemDefinitionModel
			:location "101:3-101:74"
			:isContainer false
			:opposite constraintDefinition
		)]
	) ) ( def SDM_SDMManager ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ManagerDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sdm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SDMManager
			:type SDM_SystemDefinitionModel
			:location "105:3-105:61"
			:isContainer false
			:opposite manager
		)]
	) ) ( def SDM_ManagerDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "assemblyName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type String
			:location "119:3-119:36"
		) ( struct-map
			KM3_Attribute
			:name "platform"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type Platform
			:location "123:3-123:40"
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_Description
			:location "117:3-117:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_SimpleName
			:location "118:3-118:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_FourPartVersionType
			:location "120:3-120:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publicKeyToken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_PublicKeyTokenType
			:location "121:3-121:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "culture"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_CultureNeutral
			:location "122:3-122:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourcePath"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ManagerDeclaration
			:type SDM_Path
			:location "124:3-124:38"
			:isContainer false
		)]
	) ) ( def SDM_ObjectDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Definition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "layer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type String
			:location "157:3-157:35"
		) ( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type Boolean
			:location "159:3-159:41"
		) ( struct-map
			KM3_Reference
			:name "flow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBFlow
			:location "136:3-136:72"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBRelationshipConstraint
			:location "137:3-137:108"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBConstraint
			:location "138:3-138:84"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBConstraintGroup
			:location "139:3-139:94"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "endpointDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBEndpointDefinition
			:location "140:3-140:100"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "systemDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBSystemDefinition
			:location "141:3-141:96"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "resourceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBResourceDefinition
			:location "142:3-142:100"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "communicationDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBCommunicationDefinition
			:location "143:3-143:110"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "containmentDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBContainmentDefinition
			:location "144:3-144:106"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "delegationDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBDelegationDefinition
			:location "145:3-145:104"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "referenceDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBReferenceDefinition
			:location "146:3-146:102"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "hostingDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBHostingDefinition
			:location "147:3-147:98"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "endpoint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBEndpoint
			:location "148:3-148:80"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "subsystem"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBSubsystem
			:location "149:3-149:82"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBResource
			:location "150:3-150:80"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "hosting"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBHosting
			:location "151:3-151:78"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "containment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBContainment
			:location "152:3-152:86"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBConnection
			:location "153:3-153:84"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "delegation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBDelegation
			:location "154:3-154:84"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "obreference"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_OBReference
			:location "155:3-155:84"
			:isContainer true
			:opposite objectDefinition
		) ( struct-map
			KM3_Reference
			:name "extends"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectDefinition
			:type SDM_QualifiedName
			:location "158:3-158:46"
			:isContainer false
		)]
	) ) ( def SDM_OBFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_FlowMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBFlow
			:type SDM_ObjectDefinition
			:location "163:3-163:66"
			:isContainer false
			:opposite flow
		)]
	) ) ( def SDM_OBRelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBRelationshipConstraint
			:type SDM_ObjectDefinition
			:location "167:3-167:84"
			:isContainer false
			:opposite relationshipConstraint
		)]
	) ) ( def SDM_OBConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBConstraint
			:type SDM_ObjectDefinition
			:location "171:3-171:72"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_OBConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBConstraintGroup
			:type SDM_ObjectDefinition
			:location "175:3-175:77"
			:isContainer false
			:opposite constraintGroup
		)]
	) ) ( def SDM_OBEndpointDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_EndpointDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBEndpointDefinition
			:type SDM_ObjectDefinition
			:location "179:3-179:80"
			:isContainer false
			:opposite endpointDefinition
		)]
	) ) ( def SDM_OBSystemDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SystemDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBSystemDefinition
			:type SDM_ObjectDefinition
			:location "183:3-183:78"
			:isContainer false
			:opposite systemDefinition
		)]
	) ) ( def SDM_OBResourceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ResourceDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBResourceDefinition
			:type SDM_ObjectDefinition
			:location "187:3-187:80"
			:isContainer false
			:opposite resourceDefinition
		)]
	) ) ( def SDM_OBCommunicationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_CommunicationDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBCommunicationDefinition
			:type SDM_ObjectDefinition
			:location "191:3-191:86"
			:isContainer false
			:opposite communicationDefinition
		)]
	) ) ( def SDM_OBContainmentDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ContainmentDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBContainmentDefinition
			:type SDM_ObjectDefinition
			:location "195:3-195:83"
			:isContainer false
			:opposite containmentDefinition
		)]
	) ) ( def SDM_OBDelegationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_DelegationDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBDelegationDefinition
			:type SDM_ObjectDefinition
			:location "199:3-199:82"
			:isContainer false
			:opposite delegationDefinition
		)]
	) ) ( def SDM_OBReferenceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ReferenceDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBReferenceDefinition
			:type SDM_ObjectDefinition
			:location "203:3-203:81"
			:isContainer false
			:opposite referenceDefinition
		)]
	) ) ( def SDM_OBHostingDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_HostingDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBHostingDefinition
			:type SDM_ObjectDefinition
			:location "207:3-207:79"
			:isContainer false
			:opposite hostingDefinition
		)]
	) ) ( def SDM_OBEndpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_EndpointMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBEndpoint
			:type SDM_ObjectDefinition
			:location "211:3-211:70"
			:isContainer false
			:opposite endpoint
		)]
	) ) ( def SDM_OBSubsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SystemMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBSubsystem
			:type SDM_ObjectDefinition
			:location "215:3-215:71"
			:isContainer false
			:opposite subsystem
		)]
	) ) ( def SDM_OBResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ResourceMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBResource
			:type SDM_ObjectDefinition
			:location "219:3-219:70"
			:isContainer false
			:opposite resource
		)]
	) ) ( def SDM_OBHosting ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_HostingMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBHosting
			:type SDM_ObjectDefinition
			:location "223:3-223:69"
			:isContainer false
			:opposite hosting
		)]
	) ) ( def SDM_OBContainment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ContainmentMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBContainment
			:type SDM_ObjectDefinition
			:location "227:3-227:73"
			:isContainer false
			:opposite containment
		)]
	) ) ( def SDM_OBConnection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_CommunicationMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBConnection
			:type SDM_ObjectDefinition
			:location "231:3-231:72"
			:isContainer false
			:opposite connection
		)]
	) ) ( def SDM_OBDelegation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_DelegationMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBDelegation
			:type SDM_ObjectDefinition
			:location "235:3-235:72"
			:isContainer false
			:opposite delegation
		)]
	) ) ( def SDM_OBReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ReferenceMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OBReference
			:type SDM_ObjectDefinition
			:location "239:3-239:73"
			:isContainer false
			:opposite obreference
		)]
	) ) ( def SDM_SystemDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectDefinition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "simulationRoot"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SystemDefinition
			:type Boolean
			:location "251:3-251:44"
		)]
	) ) ( def SDM_EndpointDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectDefinition]
		:structuralFeatures[]
	) ) ( def SDM_ResourceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectDefinition]
		:structuralFeatures[]
	) ) ( def SDM_RelationshipDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Definition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type Boolean
			:location "284:3-284:41"
		) ( struct-map
			KM3_Reference
			:name "objectConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDObjectConstraint
			:location "273:3-273:102"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDConstraint
			:location "274:3-274:90"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDConstraintGroup
			:location "275:3-275:100"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "flow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDFlow
			:location "276:3-276:78"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDConnection
			:location "277:3-277:90"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "hosting"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDHosting
			:location "278:3-278:84"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "delegation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDDelegation
			:location "279:3-279:90"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "reference"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDReference
			:location "280:3-280:90"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "containment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_RDContainment
			:location "281:3-281:92"
			:isContainer true
			:opposite relationshipDefinition
		) ( struct-map
			KM3_Reference
			:name "extends"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RelationshipDefinition
			:type SDM_QualifiedName
			:location "283:3-283:40"
			:isContainer false
		)]
	) ) ( def SDM_RDObjectConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDObjectConstraint
			:type SDM_RelationshipDefinition
			:location "288:3-288:90"
			:isContainer false
			:opposite objectConstraint
		)]
	) ) ( def SDM_RDConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDConstraint
			:type SDM_RelationshipDefinition
			:location "292:3-292:84"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_RDConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDConstraintGroup
			:type SDM_RelationshipDefinition
			:location "296:3-296:89"
			:isContainer false
			:opposite constraintGroup
		)]
	) ) ( def SDM_RDFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_FlowMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDFlow
			:type SDM_RelationshipDefinition
			:location "300:3-300:78"
			:isContainer false
			:opposite flow
		)]
	) ) ( def SDM_RDConnection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_CommunicationMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDConnection
			:type SDM_RelationshipDefinition
			:location "304:3-304:84"
			:isContainer false
			:opposite connection
		)]
	) ) ( def SDM_RDHosting ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_HostingMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDHosting
			:type SDM_RelationshipDefinition
			:location "308:3-308:81"
			:isContainer false
			:opposite hosting
		)]
	) ) ( def SDM_RDDelegation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_DelegationMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDDelegation
			:type SDM_RelationshipDefinition
			:location "312:3-312:84"
			:isContainer false
			:opposite delegation
		)]
	) ) ( def SDM_RDReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ReferenceMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDReference
			:type SDM_RelationshipDefinition
			:location "316:3-316:85"
			:isContainer false
			:opposite reference
		)]
	) ) ( def SDM_RDContainment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ContainmentMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RDContainment
			:type SDM_RelationshipDefinition
			:location "320:3-320:85"
			:isContainer false
			:opposite containment
		)]
	) ) ( def SDM_CommunicationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "clientDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CommunicationDefinition
			:type SDM_QualifiedName
			:location "327:3-327:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "serverDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CommunicationDefinition
			:type SDM_QualifiedName
			:location "328:3-328:47"
			:isContainer false
		)]
	) ) ( def SDM_HostingDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipDefinition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "simulationRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_HostingDefinition
			:type Boolean
			:location "337:3-337:39"
		) ( struct-map
			KM3_Reference
			:name "guestDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_HostingDefinition
			:type SDM_QualifiedName
			:location "335:3-335:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hostDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_HostingDefinition
			:type SDM_QualifiedName
			:location "336:3-336:45"
			:isContainer false
		)]
	) ) ( def SDM_ContainmentDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ContainmentDefinition
			:type SDM_QualifiedName
			:location "344:3-344:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "memberDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ContainmentDefinition
			:type SDM_QualifiedName
			:location "345:3-345:47"
			:isContainer false
		)]
	) ) ( def SDM_DelegationDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "proxyDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DelegationDefinition
			:type SDM_QualifiedName
			:location "352:3-352:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "delegateDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DelegationDefinition
			:type SDM_QualifiedName
			:location "353:3-353:49"
			:isContainer false
		)]
	) ) ( def SDM_ReferenceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependentDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ReferenceDefinition
			:type SDM_QualifiedName
			:location "360:3-360:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ReferenceDefinition
			:type SDM_QualifiedName
			:location "361:3-361:47"
			:isContainer false
		)]
	) ) ( def SDM_Member ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "description"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Member
			:type SDM_Description
			:location "373:3-373:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "designData"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Member
			:type SDM_DesignData
			:location "374:3-374:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Member
			:type SDM_MembSettingValue
			:location "376:3-376:80"
			:isContainer true
			:opposite member
		) ( struct-map
			KM3_Reference
			:name "settingValueList"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Member
			:type SDM_MembSettingValueList
			:location "377:3-377:88"
			:isContainer true
			:opposite member
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Member
			:type SDM_SimpleName
			:location "379:3-379:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Member
			:type SDM_QualifiedName
			:location "380:3-380:41"
			:isContainer false
		)]
	) ) ( def SDM_MembSettingValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SettingValue]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "member"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_MembSettingValue
			:type SDM_Member
			:location "384:3-384:54"
			:isContainer false
			:opposite settingValue
		)]
	) ) ( def SDM_MembSettingValueList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SettingValueList]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "member"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_MembSettingValueList
			:type SDM_Member
			:location "388:3-388:58"
			:isContainer false
			:opposite settingValueList
		)]
	) ) ( def SDM_ObjectMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Member]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ObjectMember
			:type Boolean
			:location "397:3-397:36"
		) ( struct-map
			KM3_Attribute
			:name "proxy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectMember
			:type Boolean
			:location "398:3-398:36"
		) ( struct-map
			KM3_Reference
			:name "minOccurs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectMember
			:type SDM_MinOccurs
			:location "395:3-395:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "maxOccurs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectMember
			:type SDM_MaxOccurs
			:location "396:3-396:42"
			:isContainer false
		)]
	) ) ( def SDM_RelationshipMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Member]
		:structuralFeatures[]
	) ) ( def SDM_SystemMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectMember]
		:structuralFeatures[]
	) ) ( def SDM_EndpointMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectMember]
		:structuralFeatures[]
	) ) ( def SDM_ResourceMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectMember]
		:structuralFeatures[]
	) ) ( def SDM_HostingMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guestMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_HostingMember
			:type SDM_Path
			:location "435:3-435:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hostMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_HostingMember
			:type SDM_Path
			:location "436:3-436:32"
			:isContainer false
		)]
	) ) ( def SDM_CommunicationMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "clientMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CommunicationMember
			:type SDM_Path
			:location "443:3-443:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "serverMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CommunicationMember
			:type SDM_Path
			:location "444:3-444:34"
			:isContainer false
		)]
	) ) ( def SDM_ContainmentMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "childMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ContainmentMember
			:type SDM_Path
			:location "451:3-451:33"
			:isContainer false
		)]
	) ) ( def SDM_DelegationMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "proxyMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DelegationMember
			:type SDM_Path
			:location "458:3-458:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "delegateMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DelegationMember
			:type SDM_Path
			:location "459:3-459:36"
			:isContainer false
		)]
	) ) ( def SDM_ReferenceMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependentMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ReferenceMember
			:type SDM_Path
			:location "466:3-466:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ReferenceMember
			:type SDM_Path
			:location "467:3-467:34"
			:isContainer false
		)]
	) ) ( def SDM_DesignData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nameSpace"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_DesignData
			:type SDM_NameSpace
			:location "475:3-475:74"
			:isContainer true
			:opposite designData
		)]
	) ) ( def SDM_NameSpace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "designData"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_NameSpace
			:type SDM_DesignData
			:location "479:3-479:59"
			:isContainer false
			:opposite nameSpace
		)]
	) ) ( def SDM_ObjectConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_StructuralConstraint]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "primaryRole"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type RolesList
			:location "496:3-496:38"
		) ( struct-map
			KM3_Attribute
			:name "secondaryRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type RolesList
			:location "498:3-498:46"
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_OCConstraint
			:location "492:3-492:83"
			:isContainer true
			:opposite objectConstraint
		) ( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_OCRelationshipConstraint
			:location "493:3-493:110"
			:isContainer true
			:opposite objectConstraint_OC
		) ( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_OCConstraintGroup
			:location "494:3-494:96"
			:isContainer true
			:opposite objectConstraint_OC
		) ( struct-map
			KM3_Reference
			:name "primaryObjectDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_QualifiedName
			:location "497:3-497:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "secondaryObjectDefinition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_QualifiedName
			:location "499:3-499:62"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "minOccurs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_MinOccurs
			:location "500:3-500:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "maxOccurs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ObjectConstraint
			:type SDM_MaxOccurs
			:location "501:3-501:42"
			:isContainer false
		)]
	) ) ( def SDM_OCConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectConstraint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OCConstraint
			:type SDM_ObjectConstraint
			:location "505:3-505:72"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_OCRelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectConstraint_OC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OCRelationshipConstraint
			:type SDM_ObjectConstraint
			:location "509:3-509:87"
			:isContainer false
			:opposite relationshipConstraint
		)]
	) ) ( def SDM_OCConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objectConstraint_OC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_OCConstraintGroup
			:type SDM_ObjectConstraint
			:location "513:3-513:80"
			:isContainer false
			:opposite constraintGroup
		)]
	) ) ( def SDM_RelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_StructuralConstraint]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "targetRole"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type RolesList
			:location "527:3-527:37"
		) ( struct-map
			KM3_Attribute
			:name "delegationAware"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type Boolean
			:location "531:3-531:46"
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_RCConstraint
			:location "521:3-521:89"
			:isContainer true
			:opposite relationshipConstraint
		) ( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_RCRelationshipConstraint
			:location "522:3-522:116"
			:isContainer true
			:opposite relationshipConstraint_RC
		) ( struct-map
			KM3_Reference
			:name "objectConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_RCObjectConstraint
			:location "523:3-523:104"
			:isContainer true
			:opposite relationshipConstraint_RC
		) ( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_RCConstraintGroup
			:location "524:3-524:102"
			:isContainer true
			:opposite relationshipConstraint_RC
		) ( struct-map
			KM3_Reference
			:name "relationshipDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_QualifiedName
			:location "526:3-526:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetObjectDefinition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_QualifiedName
			:location "528:3-528:59"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "minOccurs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_MinOccurs
			:location "529:3-529:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "maxOccurs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_RelationshipConstraint
			:type SDM_MaxOccurs
			:location "530:3-530:42"
			:isContainer false
		)]
	) ) ( def SDM_RCConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RCConstraint
			:type SDM_RelationshipConstraint
			:location "535:3-535:84"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_RCRelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipConstraint_RC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RCRelationshipConstraint
			:type SDM_RelationshipConstraint
			:location "539:3-539:98"
			:isContainer false
			:opposite relationshipConstraint
		)]
	) ) ( def SDM_RCObjectConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipConstraint_RC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RCObjectConstraint
			:type SDM_RelationshipConstraint
			:location "543:3-543:92"
			:isContainer false
			:opposite objectConstraint
		)]
	) ) ( def SDM_RCConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationshipConstraint_RC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_RCConstraintGroup
			:type SDM_RelationshipConstraint
			:location "547:3-547:91"
			:isContainer false
			:opposite constraintGroup
		)]
	) ) ( def SDM_ConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_StructuralConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintGroup
			:type SDM_CGConstraint
			:location "554:3-554:83"
			:isContainer true
			:opposite constraintGroup
		) ( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintGroup
			:type SDM_CGRelationshipConstraint
			:location "555:3-555:109"
			:isContainer true
			:opposite constraintGroup_CG
		) ( struct-map
			KM3_Reference
			:name "objectConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintGroup
			:type SDM_CGObjectConstraint
			:location "556:3-556:97"
			:isContainer true
			:opposite constraintGroup_CG
		)]
	) ) ( def SDM_CGConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CGConstraint
			:type SDM_ConstraintGroup
			:location "560:3-560:70"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_CGRelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintGroup_CG"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CGRelationshipConstraint
			:type SDM_ConstraintGroup
			:location "564:3-564:85"
			:isContainer false
			:opposite relationshipConstraint
		)]
	) ) ( def SDM_CGObjectConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintGroup_CG"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CGObjectConstraint
			:type SDM_ConstraintGroup
			:location "568:3-568:79"
			:isContainer false
			:opposite objectConstraint
		)]
	) ) ( def SDM_StructuralConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "evaluate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type ConstraintEvaluation
			:location "578:3-578:52"
		) ( struct-map
			KM3_Attribute
			:name "raiseError"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type Boolean
			:location "579:3-579:41"
		) ( struct-map
			KM3_Attribute
			:name "returnEarly"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type Boolean
			:location "580:3-580:42"
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type SDM_Description
			:location "575:3-575:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "designData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type SDM_DesignData
			:location "576:3-576:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_StructuralConstraint
			:type SDM_SimpleName
			:location "577:3-577:32"
			:isContainer false
		)]
	) ) ( def SDM_ConstraintDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Definition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "returnEarly"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type Boolean
			:location "598:3-598:42"
		) ( struct-map
			KM3_Reference
			:name "relationshipConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type SDM_CDRelationshipConstraint
			:location "592:3-592:112"
			:isContainer true
			:opposite constraintDefinition
		) ( struct-map
			KM3_Reference
			:name "constraintGroup"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type SDM_CDConstraintGroup
			:location "593:3-593:98"
			:isContainer true
			:opposite constraintDefinition
		) ( struct-map
			KM3_Reference
			:name "objectConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type SDM_CDObjectConstraint
			:location "594:3-594:100"
			:isContainer true
			:opposite constraintDefinition
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type SDM_CDConstraint
			:location "595:3-595:88"
			:isContainer true
			:opposite constraintDefinition
		) ( struct-map
			KM3_Reference
			:name "targetDefinition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintDefinition
			:type SDM_QualifiedName
			:location "597:3-597:53"
			:isContainer false
		)]
	) ) ( def SDM_CDRelationshipConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_RelationshipConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CDRelationshipConstraint
			:type SDM_ConstraintDefinition
			:location "602:3-602:92"
			:isContainer false
			:opposite relationshipConstraint
		)]
	) ) ( def SDM_CDConstraintGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintGroup]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CDConstraintGroup
			:type SDM_ConstraintDefinition
			:location "606:3-606:85"
			:isContainer false
			:opposite constraintGroup
		)]
	) ) ( def SDM_CDObjectConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ObjectConstraint]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CDObjectConstraint
			:type SDM_ConstraintDefinition
			:location "610:3-610:86"
			:isContainer false
			:opposite objectConstraint
		)]
	) ) ( def SDM_CDConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ConstraintMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constraintDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_CDConstraint
			:type SDM_ConstraintDefinition
			:location "614:3-614:80"
			:isContainer false
			:opposite constraint
		)]
	) ) ( def SDM_ConstraintMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Member]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "raiseError"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintMember
			:type Boolean
			:location "623:3-623:41"
		) ( struct-map
			KM3_Attribute
			:name "evaluate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintMember
			:type ConstraintEvaluation
			:location "624:3-624:52"
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_ConstraintMember
			:type SDM_Input
			:location "621:3-621:34"
			:isContainer false
		)]
	) ) ( def SDM_Definition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "className"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type String
			:location "645:3-645:39"
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_Description
			:location "636:3-636:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "designData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_DesignData
			:location "637:3-637:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingDeclaration"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_DefSettingDeclaration
			:location "639:3-639:99"
			:isContainer true
			:opposite definition_DSD
		) ( struct-map
			KM3_Reference
			:name "settingValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_DefSettingValue
			:location "640:3-640:83"
			:isContainer true
			:opposite definition
		) ( struct-map
			KM3_Reference
			:name "settingValueList"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_DefSettingValueList
			:location "641:3-641:91"
			:isContainer true
			:opposite definition
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Definition
			:type SDM_SimpleName
			:location "643:3-643:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Definition
			:type SDM_QualifiedName
			:location "644:3-644:44"
			:isContainer false
		)]
	) ) ( def SDM_DefSettingDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SettingMember]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition_DSD"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DefSettingDeclaration
			:type SDM_Definition
			:location "649:3-649:71"
			:isContainer false
			:opposite settingDeclaration
		)]
	) ) ( def SDM_DefSettingValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SettingValue]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DefSettingValue
			:type SDM_Definition
			:location "653:3-653:62"
			:isContainer false
			:opposite settingValue
		)]
	) ) ( def SDM_DefSettingValueList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_SettingValueList]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DefSettingValueList
			:type SDM_Definition
			:location "657:3-657:66"
			:isContainer false
			:opposite settingValueList
		)]
	) ) ( def SDM_SimpleName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_QualifiedName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_SettingPath ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_NamespaceIdentity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "platform"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type Platform
			:location "703:3-703:40"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type SDM_Path
			:location "698:3-698:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type SDM_FourPartVersionType
			:location "699:3-699:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publicKey"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type SDM_PublicKeyType
			:location "700:3-700:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publicKeyToken"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type SDM_PublicKeyTokenType
			:location "701:3-701:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "culture"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_NamespaceIdentity
			:type SDM_CultureNeutral
			:location "702:3-702:45"
			:isContainer false
		)]
	) ) ( def SDM_FlowDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Definition]
		:structuralFeatures[]
	) ) ( def SDM_FlowMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Member]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "input"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_FlowMember
			:type SDM_Input
			:location "720:3-720:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_FlowMember
			:type SDM_Output
			:location "721:3-721:36"
			:isContainer false
		)]
	) ) ( def SDM_ValueTransfer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "cast"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ValueTransfer
			:type Boolean
			:location "735:3-735:35"
		) ( struct-map
			KM3_Attribute
			:name "convert"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_ValueTransfer
			:type Boolean
			:location "736:3-736:38"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ValueTransfer
			:type SDM_SimpleName
			:location "733:3-733:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_ValueTransfer
			:type SDM_SettingPath
			:location "734:3-734:33"
			:isContainer false
		)]
	) ) ( def SDM_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ValueTransfer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fixed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Output
			:type Boolean
			:location "743:3-743:36"
		) ( struct-map
			KM3_Attribute
			:name "replace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Output
			:type Boolean
			:location "744:3-744:38"
		)]
	) ) ( def SDM_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_ValueTransfer]
		:structuralFeatures[]
	) ) ( def SDM_SettingDefinitions ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "clrNameSpace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingDefinitions
			:type String
			:location "763:3-763:36"
		) ( struct-map
			KM3_Reference
			:name "nameSpace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingDefinitions
			:type SDM_NameSpace
			:location "761:3-761:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingDefinitions
			:type SDM_QualifiedName
			:location "762:3-762:38"
			:isContainer false
		)]
	) ) ( def SDM_SettingMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Member]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "facet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SettingMember
			:type SDM_Facet
			:location "787:3-787:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingAttributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingMember
			:type SDM_SettingsAttributes
			:location "788:3-788:53"
			:isContainer false
		)]
	) ) ( def SDM_SettingsAttributes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "list"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type Boolean
			:location "795:3-795:29"
		) ( struct-map
			KM3_Attribute
			:name "access"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type SettingMemberAccess
			:location "796:3-796:43"
		) ( struct-map
			KM3_Attribute
			:name "secure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type SettingMemberSecure
			:location "797:3-797:43"
		) ( struct-map
			KM3_Attribute
			:name "deploymentTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type Boolean
			:location "798:3-798:39"
		) ( struct-map
			KM3_Attribute
			:name "required"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type Boolean
			:location "799:3-799:33"
		) ( struct-map
			KM3_Attribute
			:name "canBeNull"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type Boolean
			:location "800:3-800:34"
		) ( struct-map
			KM3_Attribute
			:name "elementsCanBeNull"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type Boolean
			:location "801:3-801:41"
		) ( struct-map
			KM3_Attribute
			:name "defaultRead"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type String
			:location "802:3-802:35"
		) ( struct-map
			KM3_Attribute
			:name "defaultWrite"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingsAttributes
			:type String
			:location "803:3-803:36"
		)]
	) ) ( def SDM_Facet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Facet
			:type SDM_SimpleName
			:location "830:3-830:32"
			:isContainer false
		)]
	) ) ( def SDM_SettingValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValue
			:type String
			:location "842:3-842:38"
		) ( struct-map
			KM3_Reference
			:name "settingValueAttributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingValue
			:type SDM_SettingValueAttributes
			:location "843:3-843:62"
			:isContainer false
		)]
	) ) ( def SDM_SettingValueList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueList
			:type SDM_Value
			:location "847:3-847:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "settingValueAttributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingValueList
			:type SDM_SettingValueAttributes
			:location "848:3-848:62"
			:isContainer false
		)]
	) ) ( def SDM_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Value
			:type String
			:location "852:3-852:38"
		) ( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Value
			:type Boolean
			:location "853:3-853:29"
		)]
	) ) ( def SDM_SettingValueAttributes ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "null"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "858:3-858:35"
		) ( struct-map
			KM3_Attribute
			:name "fixed"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "859:3-859:36"
		) ( struct-map
			KM3_Attribute
			:name "unset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "860:3-860:36"
		) ( struct-map
			KM3_Attribute
			:name "convert"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "862:3-862:38"
		) ( struct-map
			KM3_Attribute
			:name "secure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "863:3-863:37"
		) ( struct-map
			KM3_Attribute
			:name "reference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type Boolean
			:location "864:3-864:42"
		) ( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type SDM_SettingPath
			:location "857:3-857:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_SettingValueAttributes
			:type SDM_QualifiedName
			:location "861:3-861:47"
			:isContainer false
		)]
	) ) ( def SDM_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resourceId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Description
			:type String
			:location "877:3-877:40"
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_Description
			:type SDM_Entry
			:location "876:3-876:67"
			:isContainer true
			:opposite description
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Description
			:type SDM_QualifiedName
			:location "878:3-878:44"
			:isContainer false
		)]
	) ) ( def SDM_Entry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_DescriptionEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Entry
			:type SDM_Description
			:location "882:3-882:57"
			:isContainer false
			:opposite entry
		)]
	) ) ( def SDM_DescriptionEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_DescriptionEntry
			:type String
			:location "886:3-886:28"
		) ( struct-map
			KM3_Attribute
			:name "resourceId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_DescriptionEntry
			:type String
			:location "887:3-887:40"
		) ( struct-map
			KM3_Reference
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_DescriptionEntry
			:type SDM_QualifiedName
			:location "888:3-888:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "substitute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_DescriptionEntry
			:type SDM_Substitute
			:location "889:3-889:82"
			:isContainer true
			:opposite descriptionEntry
		)]
	) ) ( def SDM_Substitute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_PathList]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "descriptionEntry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SDM_Substitute
			:type SDM_DescriptionEntry
			:location "893:3-893:88"
			:isContainer true
			:opposite substitute
		)]
	) ) ( def SDM_PathList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "settingPath"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SDM_PathList
			:type SDM_SettingPath
			:location "897:3-897:46"
			:isContainer false
		)]
	) ) ( def SDM_MaxOccurs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_MinOccurs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_FourPartVersionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_PublicKeyType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_PublicKeyTokenType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_CompilationHashType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_Culture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_CultureNeutral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SDM_Element]
		:structuralFeatures[]
	) ) ( def SDM_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SDM_Element
			:type String
			:location "1016:3-1016:29"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "1026:3-1026:20"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "1027:3-1027:21"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "1028:3-1028:21"
	) )]
) )
