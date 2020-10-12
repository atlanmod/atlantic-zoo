( declare DoDAF_Element )
( declare DoDAF_DoDAFModel )
( declare DoDAF_Document )
( declare DoDAF_SystemFunctionTraceabilityMatrix )
( declare DoDAF_SystemFunctionTraceabilityElement )
( declare DoDAF_SystemDocument )
( declare DoDAF_ArchitectureDocument )
( declare DoDAF_PA )
( declare DoDAF_SystemFunction )
( declare DoDAF_SystemPA )
( declare DoDAF_SoftwareApplicationProcedurePA )
( declare DoDAF_AM )
( declare DoDAF_InformationAsset )
( declare DoDAF_AMPA )
( declare DoDAF_System )
( declare DoDAF_Task )
( declare DoDAF_ArchitectureTask )
( declare DoDAF_OperationalCapabilityTask )
( declare DoDAF_SystemOperationalCapabilityTask )
( declare DoDAF_PATask )
( declare DoDAF_Capability )
( declare DoDAF_CapabilityDocument )
( declare DoDAF_SystemCapability )
( declare DoDAF_NetworkCapability )
( declare DoDAF_NodeLinkCapability )
( declare DoDAF_MaterielItemCapabilityNorm )
( declare DoDAF_OrganizationTypeCapabilityNorm )
( declare DoDAF_RequiredInformationTechnologyCapability )
( declare DoDAF_InformationTechnologyRequirement )
( declare DoDAF_InformationExchangeRequirement )
( declare DoDAF_PAExchangeRequirement )
( declare DoDAF_SupportStatusCode )
( declare PrimitiveTypes_String )
( def DoDAF ( struct-map
	KM3_Package
	:contents[( def SupportStatusCode ( :literals[( struct-map
		KM3_EnumLiteral
		:name "red"
		:location "259:3-259:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "yellow"
		:location "260:3-260:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "green"
		:location "261:3-261:19"
	)] ) ) ( def DoDAF_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "26:3-26:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "27:3-27:34"
		) ( struct-map
			KM3_Attribute
			:name "view"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "28:3-28:27"
		)]
	) ) ( def DoDAF_DoDAFModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "document"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Document
			:location "35:3-35:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sftm"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemFunctionTraceabilityMatrix
			:location "36:3-36:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemDocument
			:location "37:3-37:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "am"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_AM
			:location "38:3-38:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_System
			:location "39:3-39:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Task
			:location "40:3-40:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "capability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Capability
			:location "41:3-41:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "capabilityDocument"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_CapabilityDocument
			:location "42:3-42:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "systemCapability"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemCapability
			:location "43:3-43:62"
			:isContainer true
		)]
	) ) ( def DoDAF_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Document
			:type String
			:location "51:3-51:27"
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_CapabilityDocument
			:location "52:3-52:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_SystemDocument
			:location "53:3-53:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "records"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_ArchitectureDocument
			:location "54:3-54:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isThePrimaryReferenceFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_PA
			:location "55:3-55:56"
			:isContainer true
		)]
	) ) ( def DoDAF_SystemFunctionTraceabilityMatrix ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isDefinedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityMatrix
			:type DoDAF_SystemFunctionTraceabilityElement
			:location "61:3-61:74"
			:isContainer true
		)]
	) ) ( def DoDAF_SystemFunctionTraceabilityElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "supportStatusCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type SupportStatusCode
			:location "74:3-74:51"
		) ( struct-map
			KM3_Reference
			:name "systemFunction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type DoDAF_SystemFunction
			:location "69:3-69:72"
			:isContainer false
			:opposite isCitedFor
		) ( struct-map
			KM3_Reference
			:name "operationalActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type DoDAF_Task
			:location "70:3-70:67"
			:isContainer false
			:opposite isCitedFor
		) ( struct-map
			KM3_Reference
			:name "systemProcessActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type DoDAF_SystemPA
			:location "71:3-71:76"
			:isContainer false
			:opposite mayBeCitedFor
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type DoDAF_System
			:location "72:3-72:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "capability"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunctionTraceabilityElement
			:type DoDAF_Capability
			:location "73:3-73:42"
			:isContainer false
		)]
	) ) ( def DoDAF_SystemDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_ArchitectureDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_PA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isParentFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PA
			:location "89:3-89:55"
			:isContainer false
			:opposite isChildFor
		) ( struct-map
			KM3_Reference
			:name "isChildFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PA
			:location "90:3-90:55"
			:isContainer false
			:opposite isParentFor
		) ( struct-map
			KM3_Reference
			:name "correspondsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PATask
			:location "91:3-91:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isIncludedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_AMPA
			:location "92:3-92:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAssignedTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_SystemPA
			:location "93:3-93:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSupportedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_SoftwareApplicationProcedurePA
			:location "94:3-94:73"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheConsumerFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PAExchangeRequirement
			:location "95:3-95:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheProducerFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PAExchangeRequirement
			:location "96:3-96:67"
			:isContainer true
		)]
	) ) ( def DoDAF_SystemFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_PA]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemFunction
			:type DoDAF_SystemFunctionTraceabilityElement
			:location "102:3-102:89"
			:isContainer false
			:opposite systemFunction
		)]
	) ) ( def DoDAF_SystemPA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemPA
			:type DoDAF_SystemFunctionTraceabilityElement
			:location "108:3-108:99"
			:isContainer false
			:opposite systemProcessActivity
		) ( struct-map
			KM3_Reference
			:name "provides"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemPA
			:type DoDAF_SystemCapability
			:location "109:3-109:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "enables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemPA
			:type DoDAF_SystemOperationalCapabilityTask
			:location "110:3-110:68"
			:isContainer true
		)]
	) ) ( def DoDAF_SoftwareApplicationProcedurePA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_AM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_InformationAsset]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_AM
			:type String
			:location "122:3-122:27"
		) ( struct-map
			KM3_Reference
			:name "isCitedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_PATask
			:location "123:3-123:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "includes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_AMPA
			:location "124:3-124:42"
			:isContainer true
		)]
	) ) ( def DoDAF_InformationAsset ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_AMPA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isOrdinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMPA
			:location "137:3-137:63"
			:isContainer false
			:opposite isSubordinateOf
		) ( struct-map
			KM3_Reference
			:name "isSubordinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMPA
			:location "138:3-138:63"
			:isContainer false
			:opposite isOrdinateOf
		)]
	) ) ( def DoDAF_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isDesignedToProvide"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemPA
			:location "144:3-144:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isDescribedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemDocument
			:location "145:3-145:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "performs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemCapability
			:location "146:3-146:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isUsedToAccomplish"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemOperationalCapabilityTask
			:location "147:3-147:69"
			:isContainer false
		)]
	) ) ( def DoDAF_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "levelIdentifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "154:3-154:38"
		) ( struct-map
			KM3_Attribute
			:name "references"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "155:3-155:33"
		) ( struct-map
			KM3_Attribute
			:name "cost"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "156:3-156:27"
		) ( struct-map
			KM3_Reference
			:name "correspondsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_PATask
			:location "157:3-157:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSupportedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_ArchitectureTask
			:location "158:3-158:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isTheSourceOfNeedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_InformationExchangeRequirement
			:location "159:3-159:80"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheDestinationOfNeedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_InformationExchangeRequirement
			:location "160:3-160:85"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_SystemFunctionTraceabilityElement
			:location "161:3-161:94"
			:isContainer false
			:opposite operationalActivity
		)]
	) ) ( def DoDAF_ArchitectureTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_OperationalCapabilityTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAccomplishedA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_OperationalCapabilityTask
			:type DoDAF_SystemOperationalCapabilityTask
			:location "171:3-171:63"
			:isContainer false
		)]
	) ) ( def DoDAF_SystemOperationalCapabilityTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[]
	) ) ( def DoDAF_PATask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[]
	) ) ( def DoDAF_Capability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isPerformedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_SystemCapability
			:location "187:3-187:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isOrdinateFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_Capability
			:location "188:3-188:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSubordinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_Capability
			:location "189:3-189:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isPerformedByNC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_NetworkCapability
			:location "190:3-190:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isPerformedByNLC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_NodeLinkCapability
			:location "191:3-191:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isPerformedBySC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_SystemCapability
			:location "192:3-192:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCitedInCD"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_CapabilityDocument
			:location "193:3-193:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isUsedInMICN"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_MaterielItemCapabilityNorm
			:location "194:3-194:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isUsedInOTCN"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_OrganizationTypeCapabilityNorm
			:location "195:3-195:62"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAttainedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Capability
			:type DoDAF_RequiredInformationTechnologyCapability
			:location "196:3-196:72"
			:isContainer false
		)]
	) ) ( def DoDAF_CapabilityDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_CapabilityDocument
			:type DoDAF_Capability
			:location "202:3-202:39"
			:isContainer false
		)]
	) ) ( def DoDAF_SystemCapability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemCapability
			:type DoDAF_Capability
			:location "208:3-208:39"
			:isContainer false
		)]
	) ) ( def DoDAF_NetworkCapability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Capability]
		:structuralFeatures[]
	) ) ( def DoDAF_NodeLinkCapability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Capability]
		:structuralFeatures[]
	) ) ( def DoDAF_MaterielItemCapabilityNorm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Capability]
		:structuralFeatures[]
	) ) ( def DoDAF_OrganizationTypeCapabilityNorm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Capability]
		:structuralFeatures[]
	) ) ( def DoDAF_RequiredInformationTechnologyCapability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Capability]
		:structuralFeatures[]
	) ) ( def DoDAF_InformationTechnologyRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationTechnologyRequirement
			:type DoDAF_RequiredInformationTechnologyCapability
			:location "236:3-236:68"
			:isContainer false
		)]
	) ) ( def DoDAF_InformationExchangeRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_InformationTechnologyRequirement]
		:structuralFeatures[]
	) ) ( def DoDAF_PAExchangeRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_InformationTechnologyRequirement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PAExchangeRequirement
			:type DoDAF_InformationExchangeRequirement
			:location "246:3-246:69"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "269:2-269:18"
	) )]
) )
