( declare Requirement_Model )
( declare AbstractDocument_Purpose )
( declare AbstractDocument_IntendedAudience )
( declare AbstractDocument_READERS_KIND )
( declare AbstractDocument_Scope )
( declare AbstractDocument_Reference )
( declare AbstractDocument_Information )
( declare AbstractDocument_AbstractDocument )
( declare AbstractDocument_BusinessBackground )
( declare AbstractDocument_BusinessProblem )
( declare AbstractDocument_ProjectMission )
( declare AbstractDocument_ProjectObjective )
( declare AbstractDocument_BusinessObjective )
( declare AbstractDocument_TechnicalObjective )
( declare AbstractDocument_BusinessCase )
( declare ProductDescription_ProductDescription )
( declare ProductDescription_Perspective )
( declare ProductDescription_Characteristic )
( declare ProductDescription_Priority )
( declare ProductDescription_OperatingEnvironment )
( declare ProductDescription_HardwarePlatform )
( declare ProductDescription_OperatingSystem )
( declare ProductDescription_Constraint )
( declare ProductDescription_UserDocumentation )
( declare ProductDescription_SystemFeature )
( declare ProductDescription_EventFlow )
( declare ProductDescription_AbstractRequirement )
( declare ProductDescription_functionalRequirement )
( declare ProductDescription_Condition )
( declare ProductDescription_PreCondition )
( declare ProductDescription_PostCondition )
( declare ProductDescription_SafetyRequirement )
( declare ProductDescription_PerformanceRequirement )
( declare ProductDescription_SecurityRequirement )
( declare ProductDescription_SoftwareQuality )
( declare ProductDescription_Format )
( declare ProductDescription_Action )
( declare ProductDescription_SequentialElement )
( declare ProductDescription_Response )
( declare ProductDescription_Stimulus )
( declare ProductDescription_DesignConstraintRequirement )
( declare ProductDescription_BusinessRuleRequirement )
( declare ProductDescription_BusinessAutomationRequirement )
( declare ProductDescription_UIRequirement )
( declare ProductDescription_GeneralRequirement )
( declare ProductDescription_InstallationRequirement )
( declare ProductDescription_MigrationRequirement )
( declare ProductDescription_OperationalRequirement )
( declare ProductDescription_SimpleFeature )
( declare ProductDescription_Feature )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Date )
( declare PrimitiveTypes_Double )
( def Requirement ( struct-map
	KM3_Package
	:contents[( def Requirement_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Requirement_Model
			:type AbstractDocument_AbstractDocument
			:location "10:3-10:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Requirement_Model
			:type ProductDescription_ProductDescription
			:location "11:3-11:61"
			:isContainer true
		)]
	) ) ( def AbstractDocument ( struct-map
		KM3_Package
		:contents[( def READERS_KIND ( :literals[( struct-map
			KM3_EnumLiteral
			:name "Developer"
			:location "28:4-28:22"
		) ( struct-map
			KM3_EnumLiteral
			:name "ProjectManager"
			:location "29:4-29:27"
		) ( struct-map
			KM3_EnumLiteral
			:name "MarketingStaff"
			:location "30:4-30:27"
		) ( struct-map
			KM3_EnumLiteral
			:name "User"
			:location "31:4-31:17"
		) ( struct-map
			KM3_EnumLiteral
			:name "Tester"
			:location "32:4-32:19"
		) ( struct-map
			KM3_EnumLiteral
			:name "DocumentationWriter"
			:location "33:4-33:32"
		)] ) ) ( def AbstractDocument_Purpose ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Purpose
				:type String
				:location "17:4-17:31"
			) ( struct-map
				KM3_Attribute
				:name "version"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Purpose
				:type String
				:location "18:4-18:36"
			) ( struct-map
				KM3_Attribute
				:name "release"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Purpose
				:type String
				:location "19:4-19:36"
			) ( struct-map
				KM3_Attribute
				:name "description"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Purpose
				:type String
				:location "20:4-20:40"
			)]
		) ) ( def AbstractDocument_IntendedAudience ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "readers"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_IntendedAudience
				:type READERS_KIND
				:location "24:4-24:42"
			)]
		) ) ( def AbstractDocument_Scope ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "description"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Scope
				:type String
				:location "37:4-37:40"
			) ( struct-map
				KM3_Reference
				:name "problem"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Scope
				:type AbstractDocument_BusinessProblem
				:location "38:4-38:55"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "mission"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Scope
				:type AbstractDocument_ProjectMission
				:location "39:4-39:54"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "background"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Scope
				:type AbstractDocument_BusinessBackground
				:location "40:4-40:61"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "goals"
				:upper -1
				:lower 0
				:isOrdered true
				:owner AbstractDocument_Scope
				:type AbstractDocument_ProjectObjective
				:location "41:4-41:60"
				:isContainer true
			)]
		) ) ( def AbstractDocument_Reference ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "title"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Reference
				:type String
				:location "45:4-45:34"
			) ( struct-map
				KM3_Attribute
				:name "author"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Reference
				:type String
				:location "46:4-46:35"
			) ( struct-map
				KM3_Attribute
				:name "version"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Reference
				:type Integer
				:location "47:4-47:37"
			) ( struct-map
				KM3_Attribute
				:name "date"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Reference
				:type Date
				:location "48:4-48:31"
			) ( struct-map
				KM3_Attribute
				:name "location"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Reference
				:type String
				:location "49:4-49:37"
			)]
		) ) ( def AbstractDocument_Information ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "body"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_Information
				:type String
				:location "53:4-53:33"
			)]
		) ) ( def AbstractDocument_AbstractDocument ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "intendedAudience"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_AbstractDocument
				:type AbstractDocument_IntendedAudience
				:location "57:4-57:65"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "references"
				:upper -1
				:lower 0
				:isOrdered true
				:owner AbstractDocument_AbstractDocument
				:type AbstractDocument_Reference
				:location "58:4-58:58"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "purpose"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_AbstractDocument
				:type AbstractDocument_Purpose
				:location "59:4-59:47"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "scope"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_AbstractDocument
				:type AbstractDocument_Scope
				:location "60:4-60:43"
				:isContainer true
			)]
		) ) ( def AbstractDocument_BusinessBackground ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "overview"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_BusinessBackground
				:type String
				:location "64:4-64:37"
			)]
		) ) ( def AbstractDocument_BusinessProblem ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "problem"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_BusinessProblem
				:type String
				:location "68:4-68:36"
			)]
		) ) ( def AbstractDocument_ProjectMission ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "mission"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_ProjectMission
				:type String
				:location "72:4-72:36"
			)]
		) ) ( def AbstractDocument_ProjectObjective ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "title"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_ProjectObjective
				:type String
				:location "76:4-76:34"
			) ( struct-map
				KM3_Attribute
				:name "description"
				:upper 1
				:lower 0
				:isOrdered false
				:owner AbstractDocument_ProjectObjective
				:type String
				:location "77:4-77:40"
			)]
		) ) ( def AbstractDocument_BusinessObjective ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_ProjectObjective]
			:structuralFeatures[]
		) ) ( def AbstractDocument_TechnicalObjective ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_ProjectObjective]
			:structuralFeatures[]
		) ) ( def AbstractDocument_BusinessCase ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_ProjectObjective]
			:structuralFeatures[]
		) )]
	) ) ( def ProductDescription ( struct-map
		KM3_Package
		:contents[( def Priority ( :literals[( struct-map
			KM3_EnumLiteral
			:name "low"
			:location "113:4-113:16"
		) ( struct-map
			KM3_EnumLiteral
			:name "medium"
			:location "114:4-114:19"
		) ( struct-map
			KM3_EnumLiteral
			:name "high"
			:location "115:4-115:17"
		)] ) ) ( def Format ( :literals[( struct-map
			KM3_EnumLiteral
			:name "Word"
			:location "190:4-190:17"
		) ( struct-map
			KM3_EnumLiteral
			:name "PDF"
			:location "191:4-191:16"
		) ( struct-map
			KM3_EnumLiteral
			:name "Excel"
			:location "192:4-192:18"
		) ( struct-map
			KM3_EnumLiteral
			:name "PPT"
			:location "193:4-193:16"
		)] ) ) ( def ProductDescription_ProductDescription ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "ownedRequirement"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_ProductDescription
				:type ProductDescription_AbstractRequirement
				:location "96:4-96:74"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "constraints"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_ProductDescription
				:type ProductDescription_Constraint
				:location "97:4-97:50"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "characteristics"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_ProductDescription
				:type ProductDescription_Characteristic
				:location "98:4-98:58"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "userDocumentation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_ProductDescription
				:type ProductDescription_UserDocumentation
				:location "99:4-99:57"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "perspective"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_ProductDescription
				:type ProductDescription_Perspective
				:location "100:4-100:45"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "operatingEnvironment"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_ProductDescription
				:type ProductDescription_OperatingEnvironment
				:location "101:4-101:63"
				:isContainer false
			)]
		) ) ( def ProductDescription_Perspective ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[]
		) ) ( def ProductDescription_Characteristic ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "priority"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Characteristic
				:type Priority
				:location "109:4-109:39"
			)]
		) ) ( def ProductDescription_OperatingEnvironment ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "hardwarePlatform"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_OperatingEnvironment
				:type ProductDescription_HardwarePlatform
				:location "119:4-119:71"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "operatingSystem"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_OperatingEnvironment
				:type ProductDescription_OperatingSystem
				:location "120:4-120:69"
				:isContainer true
			)]
		) ) ( def ProductDescription_HardwarePlatform ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[]
		) ) ( def ProductDescription_OperatingSystem ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[]
		) ) ( def ProductDescription_Constraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[]
		) ) ( def ProductDescription_UserDocumentation ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "format"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_UserDocumentation
				:type Format
				:location "136:4-136:35"
			) ( struct-map
				KM3_Attribute
				:name "standard"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_UserDocumentation
				:type String
				:location "137:4-137:37"
			)]
		) ) ( def ProductDescription_SystemFeature ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_Feature]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "conditions"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_SystemFeature
				:type ProductDescription_Condition
				:location "141:4-141:58"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "flows"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_SystemFeature
				:type ProductDescription_EventFlow
				:location "142:4-142:53"
				:isContainer true
			)]
		) ) ( def ProductDescription_EventFlow ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_EventFlow
				:type String
				:location "147:4-147:33"
			) ( struct-map
				KM3_Reference
				:name "elements"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_EventFlow
				:type ProductDescription_SequentialElement
				:location "146:4-146:64"
				:isContainer true
			)]
		) ) ( def ProductDescription_AbstractRequirement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "seq_number"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_AbstractRequirement
				:type Integer
				:location "151:4-151:40"
			) ( struct-map
				KM3_Attribute
				:name "description"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_AbstractRequirement
				:type String
				:location "152:4-152:40"
			) ( struct-map
				KM3_Attribute
				:name "priority"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_AbstractRequirement
				:type Priority
				:location "153:4-153:39"
			) ( struct-map
				KM3_Reference
				:name "simpleFeatures"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_AbstractRequirement
				:type ProductDescription_SimpleFeature
				:location "154:4-154:66"
				:isContainer true
			)]
		) ) ( def ProductDescription_functionalRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_AbstractRequirement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "systemFeatures"
				:upper -1
				:lower 0
				:isOrdered true
				:owner ProductDescription_functionalRequirement
				:type ProductDescription_SystemFeature
				:location "158:4-158:66"
				:isContainer true
			)]
		) ) ( def ProductDescription_Condition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def ProductDescription_PreCondition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_Condition]
			:structuralFeatures[]
		) ) ( def ProductDescription_PostCondition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_Condition]
			:structuralFeatures[]
		) ) ( def ProductDescription_SafetyRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_AbstractRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_PerformanceRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_AbstractRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_SecurityRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_AbstractRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_SoftwareQuality ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_AbstractRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_Action ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_SequentialElement]
			:structuralFeatures[]
		) ) ( def ProductDescription_SequentialElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[AbstractDocument_Information]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "step"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_SequentialElement
				:type Integer
				:location "201:4-201:34"
			)]
		) ) ( def ProductDescription_Response ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_SequentialElement]
			:structuralFeatures[]
		) ) ( def ProductDescription_Stimulus ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_SequentialElement]
			:structuralFeatures[]
		) ) ( def ProductDescription_DesignConstraintRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_BusinessRuleRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_BusinessAutomationRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_UIRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_GeneralRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_InstallationRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_MigrationRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_OperationalRequirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_functionalRequirement]
			:structuralFeatures[]
		) ) ( def ProductDescription_SimpleFeature ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[ProductDescription_Feature]
			:structuralFeatures[]
		) ) ( def ProductDescription_Feature ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Feature
				:type String
				:location "249:4-249:33"
			) ( struct-map
				KM3_Attribute
				:name "short_description"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Feature
				:type String
				:location "250:4-250:46"
			) ( struct-map
				KM3_Attribute
				:name "priority"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Feature
				:type Priority
				:location "251:4-251:39"
			) ( struct-map
				KM3_Attribute
				:name "cost"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Feature
				:type Double
				:location "252:4-252:33"
			) ( struct-map
				KM3_Attribute
				:name "risk"
				:upper 1
				:lower 0
				:isOrdered false
				:owner ProductDescription_Feature
				:type String
				:location "253:4-253:33"
			)]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "259:5-259:21"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "260:5-260:22"
	) ) ( def ptyp_Date ( struct-map
		KM3_DataType
		:name "Date"
		:location "261:5-261:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "262:5-262:21"
	) )]
) )
