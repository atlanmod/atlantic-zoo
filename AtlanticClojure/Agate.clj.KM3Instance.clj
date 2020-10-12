( declare AGATE_Entity )
( declare AGATE_Object )
( declare AGATE_AGATEObject )
( declare AGATE_Objective )
( declare AGATE_OperationalContext )
( declare AGATE_Project )
( declare AGATE_Standard )
( declare AGATE_GenericStandard )
( declare AGATE_Threat )
( declare AGATE_GenericThreat )
( declare AGATE_Vulnerability )
( declare AGATE_TrafficClass )
( declare AGATE_InterfaceCharacteristic )
( declare AGATE_ConfidentialityLevel )
( declare AGATE_Protocol )
( declare AGATE_Flow )
( declare AGATE_Other )
( declare AGATE_ProjectContextElement )
( declare AGATE_DataClass )
( declare AGATE_Event )
( declare AGATE_Risk )
( declare AGATE_Stake )
( declare AGATE_Requirement )
( declare AGATE_CountermeasureRequirement )
( declare AGATE_TechnicalRequirement )
( declare AGATE_PerformanceRequirement )
( declare AGATE_InteroperabilityRequirement )
( declare AGATE_OperationalRequirement )
( declare AGATE_SecurityRequirement )
( declare AGATE_Means )
( declare AGATE_DomainRelation )
( declare AGATE_HierarchicalRelation )
( declare AGATE_FunctionalRelation )
( declare AGATE_Dependence )
( declare AGATE_ArchitectureObject )
( declare AGATE_ReusableObject )
( declare AGATE_Site )
( declare AGATE_GenericSite )
( declare AGATE_Package )
( declare AGATE_Service )
( declare AGATE_TechnicalComponent )
( declare AGATE_LogicalComponent )
( declare AGATE_OperationalFunction )
( declare AGATE_OrganizationObject )
( declare AGATE_Center )
( declare AGATE_GenericCenter )
( declare AGATE_InformationSystem )
( declare AGATE_Role )
( declare AGATE_GenericRole )
( declare AGATE_Actor )
( declare AGATE_GenericActor )
( declare AGATE_TelecomOperator )
( declare AGATE_CommunicationObject )
( declare AGATE_Interface )
( declare AGATE_Interconnection )
( declare AGATE_InformationFlow )
( declare AGATE_Traffic )
( declare AGATE_Information )
( declare AGATE_ReferenceObject )
( declare AGATE_ReferenceTechnicalComponent )
( declare AGATE_TechnicalComponentReferenceFrame )
( declare AGATE_ReferenceLogicalComponent )
( declare AGATE_ReferenceService )
( declare AGATE_ServiceReferenceFrame )
( declare AGATE_MADIOSObject )
( declare AGATE_Process )
( declare AGATE_Procedure )
( declare AGATE_Operation )
( declare AGATE_Activity )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def AGATE ( struct-map
	KM3_Package
	:contents[( def AGATE_Entity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def AGATE_Object ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_Entity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Object
			:type String
			:location "19:3-19:25"
		)]
	) ) ( def AGATE_AGATEObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "notice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type String
			:location "25:3-25:29"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type String
			:location "26:3-26:34"
		) ( struct-map
			KM3_Attribute
			:name "sensitivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type Integer
			:location "27:3-27:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type String
			:location "28:3-28:27"
		) ( struct-map
			KM3_Attribute
			:name "comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type String
			:location "29:3-29:30"
		) ( struct-map
			KM3_Reference
			:name "isValidIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type AGATE_OperationalContext
			:location "30:3-30:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_AGATEObject
			:type AGATE_Stake
			:location "31:3-31:38"
			:isContainer false
		)]
	) ) ( def AGATE_Objective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Objective
			:type String
			:location "37:3-37:27"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Objective
			:type Integer
			:location "38:3-38:32"
		) ( struct-map
			KM3_Attribute
			:name "indicator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Objective
			:type String
			:location "39:3-39:32"
		) ( struct-map
			KM3_Attribute
			:name "traceability"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Objective
			:type String
			:location "40:3-40:35"
		)]
	) ) ( def AGATE_OperationalContext ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[]
	) ) ( def AGATE_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "moi"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Project
			:type AGATE_Role
			:location "50:3-50:24"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "moa"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Project
			:type AGATE_Role
			:location "51:3-51:24"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "director"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Project
			:type AGATE_Role
			:location "52:3-52:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Project
			:type AGATE_ProjectContextElement
			:location "53:3-53:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "associatedISs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Project
			:type AGATE_InformationSystem
			:location "54:3-54:80"
			:isContainer false
			:opposite associatedProjects
		)]
	) ) ( def AGATE_Standard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericStandard]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "caracterizeIC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Standard
			:type AGATE_InterfaceCharacteristic
			:location "60:3-60:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "caracterizeTC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Standard
			:type AGATE_TechnicalComponent
			:location "61:3-61:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "caracterizeLC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Standard
			:type AGATE_LogicalComponent
			:location "62:3-62:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "caracterizeP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Standard
			:type AGATE_Package
			:location "63:3-63:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "caracterizeR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Standard
			:type AGATE_Requirement
			:location "64:3-64:43"
			:isContainer false
		)]
	) ) ( def AGATE_GenericStandard ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericStandard
			:type AGATE_Standard
			:location "70:3-70:48"
			:isContainer true
		)]
	) ) ( def AGATE_Threat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericThreat]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Threat
			:type String
			:location "76:3-76:29"
		) ( struct-map
			KM3_Attribute
			:name "DCSSI"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Threat
			:type String
			:location "77:3-77:28"
		) ( struct-map
			KM3_Reference
			:name "clarifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Threat
			:type AGATE_Vulnerability
			:location "78:3-78:42"
			:isContainer false
		)]
	) ) ( def AGATE_GenericThreat ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericThreat
			:type AGATE_Threat
			:location "84:3-84:46"
			:isContainer true
		)]
	) ) ( def AGATE_Vulnerability ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Vulnerability
			:type Integer
			:location "90:3-90:29"
		) ( struct-map
			KM3_Reference
			:name "relatesTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Vulnerability
			:type AGATE_Entity
			:location "91:3-91:32"
			:isContainer false
		)]
	) ) ( def AGATE_TrafficClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "traffic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_TrafficClass
			:type AGATE_Traffic
			:location "99:3-99:58"
			:isContainer false
			:opposite trafficClass
		)]
	) ) ( def AGATE_InterfaceCharacteristic ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InterfaceCharacteristic
			:type String
			:location "105:3-105:27"
		)]
	) ) ( def AGATE_ConfidentialityLevel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_InterfaceCharacteristic]
		:structuralFeatures[]
	) ) ( def AGATE_Protocol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_InterfaceCharacteristic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isoLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Protocol
			:type Integer
			:location "115:3-115:32"
		)]
	) ) ( def AGATE_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_InterfaceCharacteristic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Flow
			:type String
			:location "121:3-121:27"
		)]
	) ) ( def AGATE_Other ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_InterfaceCharacteristic]
		:structuralFeatures[]
	) ) ( def AGATE_ProjectContextElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_ProjectContextElement
			:type String
			:location "131:3-131:27"
		)]
	) ) ( def AGATE_DataClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[]
	) ) ( def AGATE_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[]
	) ) ( def AGATE_Risk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "disponibilityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type Integer
			:location "146:3-146:42"
		) ( struct-map
			KM3_Attribute
			:name "integrityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type Integer
			:location "147:3-147:37"
		) ( struct-map
			KM3_Attribute
			:name "confidencialityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type Integer
			:location "148:3-148:44"
		) ( struct-map
			KM3_Reference
			:name "isCoveredByCR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_CountermeasureRequirement
			:location "149:3-149:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByAO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_ArchitectureObject
			:location "150:3-150:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByMO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_MADIOSObject
			:location "151:3-151:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByDR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_DomainRelation
			:location "152:3-152:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relatesToRO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_ReusableObject
			:location "153:3-153:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relatesToCO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_CommunicationObject
			:location "154:3-154:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isGeneratedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Risk
			:type AGATE_Threat
			:location "155:3-155:36"
			:isContainer false
		)]
	) ) ( def AGATE_Stake ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Stake
			:type String
			:location "161:3-161:27"
		) ( struct-map
			KM3_Attribute
			:name "relativeDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Stake
			:type String
			:location "162:3-162:35"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Stake
			:type String
			:location "163:3-163:27"
		) ( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Stake
			:type String
			:location "164:3-164:27"
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Stake
			:type AGATE_Event
			:location "165:3-165:41"
			:isContainer true
		)]
	) ) ( def AGATE_Requirement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "criticality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Requirement
			:type Integer
			:location "171:3-171:35"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Requirement
			:type String
			:location "172:3-172:31"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Requirement
			:type String
			:location "173:3-173:28"
		) ( struct-map
			KM3_Reference
			:name "isCoveredBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Requirement
			:type AGATE_ArchitectureObject
			:location "174:3-174:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "characterizes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Requirement
			:type AGATE_ArchitectureObject
			:location "175:3-175:51"
			:isContainer false
		)]
	) ) ( def AGATE_CountermeasureRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_CountermeasureRequirement
			:type String
			:location "181:3-181:27"
		) ( struct-map
			KM3_Attribute
			:name "residualVulnerability"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_CountermeasureRequirement
			:type String
			:location "182:3-182:44"
		)]
	) ) ( def AGATE_TechnicalRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[]
	) ) ( def AGATE_PerformanceRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[]
	) ) ( def AGATE_InteroperabilityRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[]
	) ) ( def AGATE_OperationalRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[]
	) ) ( def AGATE_SecurityRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Requirement]
		:structuralFeatures[]
	) ) ( def AGATE_Means ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isProvidedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Means
			:type AGATE_OrganizationObject
			:location "208:3-208:47"
			:isContainer false
		)]
	) ) ( def AGATE_DomainRelation ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[]
	) ) ( def AGATE_HierarchicalRelation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_DomainRelation]
		:structuralFeatures[]
	) ) ( def AGATE_FunctionalRelation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_DomainRelation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "necessaryObjectOF"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_OperationalFunction
			:location "223:3-223:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectOF"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_OperationalFunction
			:location "224:3-224:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectOO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_OrganizationObject
			:location "225:3-225:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectOO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_OrganizationObject
			:location "226:3-226:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_Package
			:location "227:3-227:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_FunctionalRelation
			:type AGATE_Package
			:location "228:3-228:40"
			:isContainer false
		)]
	) ) ( def AGATE_Dependence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_DomainRelation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Dependence
			:type String
			:location "234:3-234:27"
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Service
			:location "235:3-235:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Service
			:location "236:3-236:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectLC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_LogicalComponent
			:location "237:3-237:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectLC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_LogicalComponent
			:location "238:3-238:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Package
			:location "239:3-239:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Package
			:location "240:3-240:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Center
			:location "241:3-241:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_Center
			:location "242:3-242:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "necessaryObjectIS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_InformationSystem
			:location "243:3-243:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependentObjectIS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Dependence
			:type AGATE_InformationSystem
			:location "244:3-244:56"
			:isContainer false
		)]
	) ) ( def AGATE_ArchitectureObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_AGATEObject]
		:structuralFeatures[]
	) ) ( def AGATE_ReusableObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_ArchitectureObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "membership"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_ReusableObject
			:type String
			:location "254:3-254:33"
		) ( struct-map
			KM3_Attribute
			:name "confidentialityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_ReusableObject
			:type Integer
			:location "255:3-255:44"
		) ( struct-map
			KM3_Reference
			:name "belongsTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_ReusableObject
			:type AGATE_Entity
			:location "256:3-256:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAttachedToIS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_ReusableObject
			:type AGATE_InformationSystem
			:location "257:3-257:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAttachedToA"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_ReusableObject
			:type AGATE_Actor
			:location "258:3-258:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isA"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_ReusableObject
			:type AGATE_Means
			:location "259:3-259:30"
			:isContainer false
		)]
	) ) ( def AGATE_Site ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericSite]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Site
			:type String
			:location "266:3-266:27"
		) ( struct-map
			KM3_Attribute
			:name "localization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Site
			:type String
			:location "267:3-267:35"
		) ( struct-map
			KM3_Reference
			:name "deployedObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Site
			:type AGATE_ReusableObject
			:location "268:3-268:59"
			:isContainer true
		)]
	) ) ( def AGATE_GenericSite ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericSite
			:type AGATE_Site
			:location "274:3-274:44"
			:isContainer true
		)]
	) ) ( def AGATE_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subPackage"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_Package
			:location "280:3-280:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "time"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_Role
			:location "281:3-281:28"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "groupedObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_ReusableObject
			:location "282:3-282:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCoveredByLC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_LogicalComponent
			:location "283:3-283:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByTC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_TechnicalComponent
			:location "284:3-284:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Package
			:type AGATE_Interface
			:location "285:3-285:39"
			:isContainer false
		)]
	) ) ( def AGATE_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Statut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Service
			:type String
			:location "291:3-291:29"
		) ( struct-map
			KM3_Reference
			:name "isASpecializationOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Service
			:type AGATE_ReferenceService
			:location "292:3-292:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Service
			:type AGATE_LogicalComponent
			:location "293:3-293:44"
			:isContainer false
		)]
	) ) ( def AGATE_TechnicalComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type String
			:location "299:3-299:27"
		) ( struct-map
			KM3_Attribute
			:name "cots"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type Boolean
			:location "300:3-300:28"
		) ( struct-map
			KM3_Attribute
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type Boolean
			:location "301:3-301:30"
		) ( struct-map
			KM3_Attribute
			:name "constructor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type Boolean
			:location "302:3-302:35"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type String
			:location "303:3-303:30"
		) ( struct-map
			KM3_Attribute
			:name "technology"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type String
			:location "304:3-304:33"
		) ( struct-map
			KM3_Attribute
			:name "definedExtension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type String
			:location "305:3-305:39"
		) ( struct-map
			KM3_Attribute
			:name "statut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type String
			:location "306:3-306:29"
		) ( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type AGATE_TechnicalComponent
			:location "307:3-307:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isASpecializationOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type AGATE_ReferenceTechnicalComponent
			:location "308:3-308:63"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_TechnicalComponent
			:type AGATE_Interface
			:location "309:3-309:49"
			:isContainer true
		)]
	) ) ( def AGATE_LogicalComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type String
			:location "315:3-315:27"
		) ( struct-map
			KM3_Attribute
			:name "statut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type String
			:location "316:3-316:29"
		) ( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type AGATE_LogicalComponent
			:location "317:3-317:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isASpecializationOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type AGATE_ReferenceLogicalComponent
			:location "318:3-318:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type AGATE_Interface
			:location "319:3-319:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCoveredBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_LogicalComponent
			:type AGATE_TechnicalComponent
			:location "320:3-320:46"
			:isContainer false
		)]
	) ) ( def AGATE_OperationalFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_OperationalFunction
			:type AGATE_OperationalFunction
			:location "326:3-326:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCoveredByP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_OperationalFunction
			:type AGATE_Package
			:location "327:3-327:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_OperationalFunction
			:type AGATE_Service
			:location "328:3-328:40"
			:isContainer false
		)]
	) ) ( def AGATE_OrganizationObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_ReusableObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "time"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_OrganizationObject
			:type AGATE_Role
			:location "334:3-334:28"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "subordinate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_OrganizationObject
			:type AGATE_HierarchicalRelation
			:location "335:3-335:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "superior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_OrganizationObject
			:type AGATE_HierarchicalRelation
			:location "336:3-336:46"
			:isContainer false
		)]
	) ) ( def AGATE_Center ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericCenter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deployedObjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Center
			:type AGATE_ReusableObject
			:location "342:3-342:59"
			:isContainer true
		)]
	) ) ( def AGATE_GenericCenter ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_OrganizationObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "centers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericCenter
			:type AGATE_Center
			:location "348:3-348:43"
			:isContainer true
		)]
	) ) ( def AGATE_InformationSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_OrganizationObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "354:3-354:29"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "355:3-355:30"
		) ( struct-map
			KM3_Attribute
			:name "membershipCountry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "356:3-356:40"
		) ( struct-map
			KM3_Attribute
			:name "currentLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "357:3-357:38"
		) ( struct-map
			KM3_Attribute
			:name "startServiceDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "358:3-358:39"
		) ( struct-map
			KM3_Attribute
			:name "stopServiceDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "359:3-359:38"
		) ( struct-map
			KM3_Attribute
			:name "isGeneric"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type Boolean
			:location "360:3-360:33"
		) ( struct-map
			KM3_Attribute
			:name "functionalDomain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "361:3-361:39"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationSystem
			:type String
			:location "362:3-362:27"
		) ( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_InformationSystem
			:location "363:3-363:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "associatedProjects"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_Project
			:location "364:3-364:70"
			:isContainer false
			:opposite associatedISs
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_Objective
			:location "365:3-365:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_Role
			:location "366:3-366:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "fixes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_OperationalContext
			:location "367:3-367:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "usedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_Actor
			:location "368:3-368:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_InformationSystem
			:type AGATE_Interface
			:location "369:3-369:49"
			:isContainer true
		)]
	) ) ( def AGATE_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericRole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Role
			:type String
			:location "375:3-375:27"
		)]
	) ) ( def AGATE_GenericRole ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_OrganizationObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "roles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericRole
			:type AGATE_Role
			:location "381:3-381:39"
			:isContainer true
		)]
	) ) ( def AGATE_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_GenericActor]
		:structuralFeatures[]
	) ) ( def AGATE_GenericActor ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_OrganizationObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_GenericActor
			:type AGATE_Actor
			:location "391:3-391:41"
			:isContainer true
		)]
	) ) ( def AGATE_TelecomOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_Actor]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contractType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_TelecomOperator
			:type String
			:location "397:3-397:35"
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_TelecomOperator
			:type AGATE_Interface
			:location "398:3-398:49"
			:isContainer true
		)]
	) ) ( def AGATE_CommunicationObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_ArchitectureObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "confidentialityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_CommunicationObject
			:type Integer
			:location "404:3-404:44"
		) ( struct-map
			KM3_Reference
			:name "belongsTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_CommunicationObject
			:type AGATE_Entity
			:location "405:3-405:37"
			:isContainer false
		)]
	) ) ( def AGATE_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_CommunicationObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "characteristics"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Interface
			:type AGATE_InterfaceCharacteristic
			:location "411:3-411:68"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Interface
			:type AGATE_Interface
			:location "412:3-412:49"
			:isContainer true
		)]
	) ) ( def AGATE_Interconnection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_CommunicationObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "linkType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Interconnection
			:type String
			:location "418:3-418:31"
		) ( struct-map
			KM3_Reference
			:name "between"
			:upper 2
			:lower 2
			:isOrdered false
			:owner AGATE_Interconnection
			:type AGATE_Interface
			:location "419:3-419:38"
			:isContainer false
		)]
	) ) ( def AGATE_InformationFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_CommunicationObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type Integer
			:location "425:3-425:32"
		) ( struct-map
			KM3_Attribute
			:name "frequency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "426:3-426:32"
		) ( struct-map
			KM3_Attribute
			:name "media"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "427:3-427:28"
		) ( struct-map
			KM3_Attribute
			:name "continuity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "428:3-428:33"
		) ( struct-map
			KM3_Attribute
			:name "myContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "429:3-429:34"
		) ( struct-map
			KM3_Attribute
			:name "time"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "430:3-430:27"
		) ( struct-map
			KM3_Attribute
			:name "availabilityRatio"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "431:3-431:40"
		) ( struct-map
			KM3_Attribute
			:name "integrity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type Integer
			:location "432:3-432:33"
		) ( struct-map
			KM3_Attribute
			:name "interoperabilityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type Integer
			:location "433:3-433:45"
		) ( struct-map
			KM3_Attribute
			:name "mediumFlow"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "434:3-434:33"
		) ( struct-map
			KM3_Attribute
			:name "maximumFlow"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "435:3-435:34"
		) ( struct-map
			KM3_Attribute
			:name "duration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "436:3-436:31"
		) ( struct-map
			KM3_Attribute
			:name "unitMediumFlow"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "437:3-437:37"
		) ( struct-map
			KM3_Attribute
			:name "averageEvent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "438:3-438:35"
		) ( struct-map
			KM3_Attribute
			:name "maximumFlowOverOneDuration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type String
			:location "439:3-439:49"
		) ( struct-map
			KM3_Reference
			:name "transports"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_Information
			:location "440:3-440:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_Package
			:location "441:3-441:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_Package
			:location "442:3-442:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverOO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_OrganizationObject
			:location "443:3-443:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterOO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_OrganizationObject
			:location "444:3-444:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverOF"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_OperationalFunction
			:location "445:3-445:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterOF"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_InformationFlow
			:type AGATE_OperationalFunction
			:location "446:3-446:49"
			:isContainer false
		)]
	) ) ( def AGATE_Traffic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_CommunicationObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sequence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Traffic
			:type String
			:location "452:3-452:31"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Traffic
			:type String
			:location "453:3-453:27"
		) ( struct-map
			KM3_Attribute
			:name "interoperabilityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Traffic
			:type Integer
			:location "454:3-454:45"
		) ( struct-map
			KM3_Reference
			:name "trafficClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_TrafficClass
			:location "455:3-455:60"
			:isContainer false
			:opposite traffic
		) ( struct-map
			KM3_Reference
			:name "dataClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_DataClass
			:location "456:3-456:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_Package
			:location "457:3-457:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_Package
			:location "458:3-458:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverIS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_InformationSystem
			:location "459:3-459:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterIS"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_InformationSystem
			:location "460:3-460:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_Center
			:location "461:3-461:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_Center
			:location "462:3-462:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverTO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_TelecomOperator
			:location "463:3-463:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterTO"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_TelecomOperator
			:location "464:3-464:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverLC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_LogicalComponent
			:location "465:3-465:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterLC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_LogicalComponent
			:location "466:3-466:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiverTC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_TechnicalComponent
			:location "467:3-467:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transmitterTC"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Traffic
			:type AGATE_TechnicalComponent
			:location "468:3-468:53"
			:isContainer false
		)]
	) ) ( def AGATE_Information ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_CommunicationObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "format"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Information
			:type String
			:location "475:3-475:29"
		) ( struct-map
			KM3_Attribute
			:name "storageSupport"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Information
			:type String
			:location "476:3-476:37"
		) ( struct-map
			KM3_Attribute
			:name "persistence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_Information
			:type String
			:location "477:3-477:34"
		) ( struct-map
			KM3_Reference
			:name "DataType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AGATE_Information
			:type AGATE_DataClass
			:location "478:3-478:39"
			:isContainer false
		)]
	) ) ( def AGATE_ReferenceObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_Object]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_ReferenceObject
			:type String
			:location "484:3-484:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AGATE_ReferenceObject
			:type String
			:location "485:3-485:34"
		)]
	) ) ( def AGATE_ReferenceTechnicalComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReferenceObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_ReferenceTechnicalComponent
			:type AGATE_ReferenceTechnicalComponent
			:location "491:3-491:58"
			:isContainer false
		)]
	) ) ( def AGATE_TechnicalComponentReferenceFrame ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReferenceObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_TechnicalComponentReferenceFrame
			:type AGATE_ReferenceTechnicalComponent
			:location "497:3-497:58"
			:isContainer false
		)]
	) ) ( def AGATE_ReferenceLogicalComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReferenceObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_ReferenceLogicalComponent
			:type AGATE_ReferenceLogicalComponent
			:location "503:3-503:65"
			:isContainer true
		)]
	) ) ( def AGATE_ReferenceService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_ReferenceObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_ReferenceService
			:type AGATE_ReferenceObject
			:location "509:3-509:55"
			:isContainer true
		)]
	) ) ( def AGATE_ServiceReferenceFrame ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOfRS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_ServiceReferenceFrame
			:type AGATE_ReferenceService
			:location "515:3-515:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "composedOfRLC"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_ServiceReferenceFrame
			:type AGATE_ReferenceLogicalComponent
			:location "516:3-516:68"
			:isContainer true
		)]
	) ) ( def AGATE_MADIOSObject ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AGATE_Object]
		:structuralFeatures[]
	) ) ( def AGATE_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_MADIOSObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCoveredByP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Process
			:type AGATE_Package
			:location "527:3-527:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Process
			:type AGATE_Service
			:location "528:3-528:40"
			:isContainer false
		)]
	) ) ( def AGATE_Procedure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_MADIOSObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCoveredByP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Procedure
			:type AGATE_Package
			:location "534:3-534:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Procedure
			:type AGATE_Service
			:location "535:3-535:40"
			:isContainer false
		)]
	) ) ( def AGATE_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_MADIOSObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCoveredByP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Operation
			:type AGATE_Package
			:location "541:3-541:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCoveredByS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Operation
			:type AGATE_Service
			:location "542:3-542:40"
			:isContainer false
		)]
	) ) ( def AGATE_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AGATE_MADIOSObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCoveredByP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Activity
			:type AGATE_Package
			:location "548:3-548:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isisCoveredByS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AGATE_Activity
			:type AGATE_Service
			:location "549:3-549:42"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "558:2-558:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "559:2-559:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "560:2-560:19"
	) )]
) )
