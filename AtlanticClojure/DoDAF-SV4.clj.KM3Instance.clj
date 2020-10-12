( declare DoDAF_Element )
( declare DoDAF_DoDAFModel )
( declare DoDAF_Document )
( declare DoDAF_SystemFunctionalityDescription )
( declare DoDAF_FunctionalSpecification )
( declare DoDAF_AMSpecification )
( declare DoDAF_SystemDocument )
( declare DoDAF_ArchitectureDocument )
( declare DoDAF_System )
( declare DoDAF_SystemPA )
( declare DoDAF_IE )
( declare DoDAF_AMIERole )
( declare DoDAF_AMIERoleGraphic )
( declare DoDAF_Input )
( declare DoDAF_Output )
( declare DoDAF_InformationAssetDocument )
( declare DoDAF_AMPA )
( declare DoDAF_AMPAGraphic )
( declare DoDAF_PA )
( declare DoDAF_PACapability )
( declare DoDAF_AM )
( declare DoDAF_InformationAsset )
( declare DoDAF_DataStore )
( declare DoDAF_SystemFunction )
( declare DoDAF_SystemPAStandard )
( declare DoDAF_InformationTechnologyStandard )
( declare DoDAF_LineOfBusiness )
( declare DoDAF_Task )
( declare DoDAF_HumanBehaviourTask )
( declare DoDAF_OperationalCapabilityTask )
( declare DoDAF_TaskMissionArea )
( declare DoDAF_PATask )
( declare DoDAF_BusinessSubfunction )
( declare DoDAF_ArchitectureBusinessSubFunction )
( declare DoDAF_OperationalRolePA )
( declare DoDAF_OperationalRole )
( declare DoDAF_OrganizationTypeOperationalRole )
( declare DoDAF_OrganizationOperationalRole )
( declare DoDAF_Occupation )
( declare DoDAF_PersonType )
( declare DoDAF_PersonTypeCapabilityNorm )
( declare DoDAF_Skill )
( declare DoDAF_Position )
( declare PrimitiveTypes_String )
( def DoDAF ( struct-map
	KM3_Package
	:contents[( def DoDAF_Element ( struct-map
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
			:name "sfd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemFunctionalityDescription
			:location "36:3-36:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "amSpecification"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_AMSpecification
			:location "37:3-37:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemDocument
			:location "38:3-38:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Task
			:location "39:3-39:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "iaDocument"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_InformationAssetDocument
			:location "40:3-40:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Position
			:location "41:3-41:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "occupation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Occupation
			:location "42:3-42:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ad"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_ArchitectureDocument
			:location "43:3-43:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_System
			:location "44:3-44:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "am"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_AM
			:location "45:3-45:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_SystemPAStandard
			:location "46:3-46:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "its"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_InformationTechnologyStandard
			:location "47:3-47:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "orpa"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_OperationalRolePA
			:location "48:3-48:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ptcn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_PersonTypeCapabilityNorm
			:location "49:3-49:58"
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
			:location "58:3-58:27"
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_InformationAssetDocument
			:location "59:3-59:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_SystemDocument
			:location "60:3-60:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "records"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_ArchitectureDocument
			:location "61:3-61:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheReferenceFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_IE
			:location "62:3-62:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isThePrimaryReferenceFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_PA
			:location "63:3-63:56"
			:isContainer true
		)]
	) ) ( def DoDAF_SystemFunctionalityDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Document]
		:structuralFeatures[]
	) ) ( def DoDAF_FunctionalSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_FunctionalSpecification
			:type DoDAF_SystemDocument
			:location "73:3-73:47"
			:isContainer true
		)]
	) ) ( def DoDAF_AMSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isUsedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMSpecification
			:type DoDAF_FunctionalSpecification
			:location "79:3-79:61"
			:isContainer true
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
			:location "93:3-93:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isDescribedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_System
			:type DoDAF_SystemDocument
			:location "94:3-94:47"
			:isContainer false
		)]
	) ) ( def DoDAF_SystemPA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isDefinedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemPA
			:type DoDAF_SystemPAStandard
			:location "100:3-100:50"
			:isContainer false
		)]
	) ) ( def DoDAF_IE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_AMIERole
			:location "106:3-106:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isOrdinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_IE
			:location "107:3-107:61"
			:isContainer false
			:opposite isSubordinateOf
		) ( struct-map
			KM3_Reference
			:name "isSubordinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_IE
			:location "108:3-108:61"
			:isContainer false
			:opposite isOrdinateOf
		)]
	) ) ( def DoDAF_AMIERole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMIERole
			:type DoDAF_AMPA
			:location "115:3-115:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isRepresentedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMIERole
			:type DoDAF_AMIERoleGraphic
			:location "116:3-116:60"
			:isContainer true
		)]
	) ) ( def DoDAF_AMIERoleGraphic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "127:3-127:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "128:3-128:34"
		) ( struct-map
			KM3_Attribute
			:name "information"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "129:3-129:34"
		) ( struct-map
			KM3_Reference
			:name "isTheInputThatIsDefinedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Input
			:type DoDAF_Output
			:location "126:3-126:61"
			:isContainer true
		)]
	) ) ( def DoDAF_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "135:3-135:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "136:3-136:34"
		) ( struct-map
			KM3_Attribute
			:name "information"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "137:3-137:34"
		)]
	) ) ( def DoDAF_InformationAssetDocument ( struct-map
		KM3_Class
		:isAbstract false
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
			:location "148:3-148:63"
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
			:location "149:3-149:63"
			:isContainer false
			:opposite isOrdinateOf
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMIERole
			:location "150:3-150:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isRepresentedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMPAGraphic
			:location "151:3-151:56"
			:isContainer true
		)]
	) ) ( def DoDAF_AMPAGraphic ( struct-map
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
			:location "161:3-161:55"
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
			:location "162:3-162:55"
			:isContainer false
			:opposite isParentFor
		) ( struct-map
			KM3_Reference
			:name "isIncludedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_AMPA
			:location "163:3-163:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAssignedTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_SystemPA
			:location "164:3-164:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "represents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_ArchitectureBusinessSubFunction
			:location "165:3-165:71"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "correspondsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PATask
			:location "166:3-166:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PACapability
			:location "167:3-167:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPerformedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_OperationalRolePA
			:location "168:3-168:50"
			:isContainer false
		)]
	) ) ( def DoDAF_PACapability ( struct-map
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
			:location "178:3-178:27"
		) ( struct-map
			KM3_Reference
			:name "isCitedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_PATask
			:location "179:3-179:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "specifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_AMSpecification
			:location "180:3-180:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "includes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_AMPA
			:location "181:3-181:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isUsedToDescribe"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_SystemFunctionalityDescription
			:location "182:3-182:66"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_LineOfBusiness
			:location "183:3-183:51"
			:isContainer true
		)]
	) ) ( def DoDAF_InformationAsset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationAsset
			:type DoDAF_InformationAssetDocument
			:location "189:3-189:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationAsset
			:type DoDAF_DataStore
			:location "190:3-190:48"
			:isContainer true
		)]
	) ) ( def DoDAF_DataStore ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_PA]
		:structuralFeatures[]
	) ) ( def DoDAF_SystemFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_PA]
		:structuralFeatures[]
	) ) ( def DoDAF_SystemPAStandard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isUsedToDefine"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_SystemPAStandard
			:type DoDAF_InformationTechnologyStandard
			:location "204:3-204:63"
			:isContainer false
		)]
	) ) ( def DoDAF_InformationTechnologyStandard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isUsedToDefine"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationTechnologyStandard
			:type DoDAF_SystemPAStandard
			:location "210:3-210:50"
			:isContainer false
		)]
	) ) ( def DoDAF_LineOfBusiness ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "appliesToTask"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_LineOfBusiness
			:type DoDAF_Task
			:location "217:3-217:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "appliesToBS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_LineOfBusiness
			:type DoDAF_BusinessSubfunction
			:location "218:3-218:60"
			:isContainer true
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
			:location "224:3-224:38"
		) ( struct-map
			KM3_Attribute
			:name "references"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "225:3-225:33"
		) ( struct-map
			KM3_Attribute
			:name "cost"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "226:3-226:27"
		) ( struct-map
			KM3_Reference
			:name "correspondsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_PATask
			:location "227:3-227:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Task
			:type DoDAF_TaskMissionArea
			:location "228:3-228:43"
			:isContainer false
		)]
	) ) ( def DoDAF_HumanBehaviourTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[]
	) ) ( def DoDAF_OperationalCapabilityTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[]
	) ) ( def DoDAF_TaskMissionArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasContributionFrom"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_TaskMissionArea
			:type DoDAF_OperationalCapabilityTask
			:location "242:3-242:74"
			:isContainer true
		)]
	) ) ( def DoDAF_PATask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[]
	) ) ( def DoDAF_BusinessSubfunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "appliesTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_BusinessSubfunction
			:type DoDAF_ArchitectureBusinessSubFunction
			:location "252:3-252:60"
			:isContainer false
		)]
	) ) ( def DoDAF_ArchitectureBusinessSubFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_OperationalRolePA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_OperationalRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "performs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_OperationalRolePA
			:location "266:3-266:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPerformedByOTOR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_OrganizationTypeOperationalRole
			:location "267:3-267:78"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPerformedByOOR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_OrganizationOperationalRole
			:location "268:3-268:73"
			:isContainer true
		)]
	) ) ( def DoDAF_OrganizationTypeOperationalRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_OrganizationOperationalRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_Occupation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedForOR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Occupation
			:type DoDAF_OperationalRole
			:location "282:3-282:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mayBeCitedForPT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Occupation
			:type DoDAF_PersonType
			:location "283:3-283:55"
			:isContainer true
		)]
	) ) ( def DoDAF_PersonType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PersonType
			:type DoDAF_OperationalRole
			:location "289:3-289:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "performsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PersonType
			:type DoDAF_PersonTypeCapabilityNorm
			:location "290:3-290:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "can"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PersonType
			:type DoDAF_Skill
			:location "291:3-291:38"
			:isContainer true
		)]
	) ) ( def DoDAF_PersonTypeCapabilityNorm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_Skill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Skill
			:type DoDAF_OperationalRole
			:location "301:3-301:58"
			:isContainer true
		)]
	) ) ( def DoDAF_Position ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Position
			:type DoDAF_OperationalRole
			:location "307:3-307:58"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "318:2-318:18"
	) )]
) )
