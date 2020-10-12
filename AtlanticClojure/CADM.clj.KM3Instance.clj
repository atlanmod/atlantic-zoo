( declare CADM_Element )
( declare CADM_Architecture )
( declare CADM_Organization )
( declare CADM_Guidance )
( declare CADM_Document )
( declare CADM_Action )
( declare CADM_Agreement )
( declare CADM_Standard )
( declare CADM_Task )
( declare CADM_InformationAsset )
( declare CADM_ConceptualDataModel )
( declare CADM_ActivityModel )
( declare CADM_Node )
( declare CADM_Network )
( declare CADM_Requirement )
( declare CADM_InfoExchRequirement )
( declare CADM_ExchangeNeedLineReq )
( declare CADM_MissionArea )
( declare CADM_System )
( declare CADM_Mission )
( declare CADM_FunctionalArea )
( declare CADM_Capability )
( declare CADM_MaterielItem )
( declare CADM_EquipmentType )
( declare CADM_SoftwareItem )
( declare CADM_Facility )
( declare PrimitiveTypes_String )
( def CADM ( struct-map
	KM3_Package
	:contents[( def CADM_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_Element
			:type String
			:location "20:3-20:27"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_Element
			:type String
			:location "21:3-21:30"
		)]
	) ) ( def CADM_Architecture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Architecture
			:type CADM_Architecture
			:location "27:3-27:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "missions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Architecture
			:type CADM_Mission
			:location "28:3-28:68"
			:isContainer true
			:opposite isCitedBy
		) ( struct-map
			KM3_Reference
			:name "isFocusOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Architecture
			:type CADM_FunctionalArea
			:location "29:3-29:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Architecture
			:type CADM_Organization
			:location "30:3-30:38"
			:isContainer false
		)]
	) ) ( def CADM_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_Organization
			:location "37:3-37:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "softwareItems"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_SoftwareItem
			:location "38:3-38:80"
			:isContainer true
			:opposite isSourceFor
		) ( struct-map
			KM3_Reference
			:name "owns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_InformationAsset
			:location "39:3-39:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "includes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_Node
			:location "40:3-40:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "performsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_Capability
			:location "41:3-41:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasRequirement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_Requirement
			:location "42:3-42:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasMissionArea"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_MissionArea
			:location "43:3-43:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "associatedSystems"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_System
			:location "44:3-44:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isProponentOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Organization
			:type CADM_FunctionalArea
			:location "45:3-45:49"
			:isContainer false
		)]
	) ) ( def CADM_Guidance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssocitatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Guidance
			:type CADM_Guidance
			:location "52:3-52:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isImplementedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Guidance
			:type CADM_Architecture
			:location "53:3-53:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSpecifiedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Guidance
			:type CADM_Document
			:location "54:3-54:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "providesAuthorityFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Guidance
			:type CADM_InformationAsset
			:location "55:3-55:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Guidance
			:type CADM_MissionArea
			:location "56:3-56:40"
			:isContainer false
		)]
	) ) ( def CADM_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Document
			:type CADM_Document
			:location "63:3-63:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "describesArchitecture"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_Document
			:type CADM_Architecture
			:location "64:3-64:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describesSystem"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Document
			:type CADM_System
			:location "65:3-65:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSpecifiedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Document
			:type CADM_Agreement
			:location "66:3-66:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Document
			:type CADM_InformationAsset
			:location "67:3-67:43"
			:isContainer false
		)]
	) ) ( def CADM_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_Action
			:type CADM_Task
			:location "74:3-74:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Action
			:type CADM_Action
			:location "75:3-75:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "involvedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Action
			:type CADM_ActivityModel
			:location "76:3-76:45"
			:isContainer false
		)]
	) ) ( def CADM_Agreement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Agreement
			:type CADM_Agreement
			:location "83:3-83:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCitedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Agreement
			:type CADM_Agreement
			:location "84:3-84:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "appliesTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Agreement
			:type CADM_InformationAsset
			:location "85:3-85:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "implements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Agreement
			:type CADM_Guidance
			:location "86:3-86:40"
			:isContainer false
		)]
	) ) ( def CADM_Standard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Agreement]
		:structuralFeatures[]
	) ) ( def CADM_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Task
			:type CADM_Task
			:location "97:3-97:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPerformedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Task
			:type CADM_Node
			:location "98:3-98:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isPerformedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Task
			:type CADM_System
			:location "99:3-99:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "specifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Task
			:type CADM_Requirement
			:location "100:3-100:42"
			:isContainer false
		)]
	) ) ( def CADM_InformationAsset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_InformationAsset
			:type CADM_InformationAsset
			:location "107:3-107:64"
			:isContainer true
		)]
	) ) ( def CADM_ConceptualDataModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_InformationAsset]
		:structuralFeatures[]
	) ) ( def CADM_ActivityModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_InformationAsset]
		:structuralFeatures[]
	) ) ( def CADM_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_Node
			:location "123:3-123:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_Architecture
			:location "124:3-124:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasServicesProvidedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_Facility
			:location "125:3-125:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "involvedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_ActivityModel
			:location "126:3-126:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_InformationAsset
			:location "127:3-127:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "involves"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_InfoExchRequirement
			:location "128:3-128:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isParticipedInBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_Network
			:location "129:3-129:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Node
			:type CADM_System
			:location "130:3-130:36"
			:isContainer false
		)]
	) ) ( def CADM_Network ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Network
			:type CADM_Network
			:location "136:3-136:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isDescribedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Network
			:type CADM_Document
			:location "137:3-137:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compliesWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Network
			:type CADM_Standard
			:location "138:3-138:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Network
			:type CADM_Organization
			:location "139:3-139:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "performsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Network
			:type CADM_Capability
			:location "140:3-140:42"
			:isContainer false
		)]
	) ) ( def CADM_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Guidance]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeSatifiedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Requirement
			:type CADM_Architecture
			:location "146:3-146:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSpecifiedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Requirement
			:type CADM_InformationAsset
			:location "147:3-147:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "specifiesNeedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Requirement
			:type CADM_MaterielItem
			:location "148:3-148:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Requirement
			:type CADM_MissionArea
			:location "149:3-149:38"
			:isContainer false
		)]
	) ) ( def CADM_InfoExchRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Requirement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_InfoExchRequirement
			:type CADM_Document
			:location "155:3-155:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSpecifiedInInfos"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_InfoExchRequirement
			:type CADM_InformationAsset
			:location "156:3-156:56"
			:isContainer false
		)]
	) ) ( def CADM_ExchangeNeedLineReq ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Requirement]
		:structuralFeatures[]
	) ) ( def CADM_MissionArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_MissionArea
			:type CADM_Task
			:location "167:3-167:34"
			:isContainer false
		)]
	) ) ( def CADM_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_System
			:location "173:3-173:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "citedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Architecture
			:location "174:3-174:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compliesWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Standard
			:location "175:3-175:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isDescribedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_InformationAsset
			:location "176:3-176:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_MaterielItem
			:location "177:3-177:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "operatesUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Network
			:location "178:3-178:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "performsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Capability
			:location "179:3-179:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "associatedOrganization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Organization
			:location "180:3-180:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "appliesTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_System
			:type CADM_Requirement
			:location "181:3-181:42"
			:isContainer false
		)]
	) ) ( def CADM_Mission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_Mission
			:type CADM_Architecture
			:location "188:3-188:58"
			:isContainer false
			:opposite missions
		) ( struct-map
			KM3_Reference
			:name "requires"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Mission
			:type CADM_Task
			:location "189:3-189:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isAssigned"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Mission
			:type CADM_Organization
			:location "190:3-190:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "mayCite"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Mission
			:type CADM_FunctionalArea
			:location "191:3-191:43"
			:isContainer false
		)]
	) ) ( def CADM_FunctionalArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isPartOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_FunctionalArea
			:type CADM_FunctionalArea
			:location "198:3-198:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_FunctionalArea
			:type CADM_System
			:location "199:3-199:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_FunctionalArea
			:type CADM_MissionArea
			:location "200:3-200:38"
			:isContainer false
		)]
	) ) ( def CADM_Capability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specifiesRequired"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_Capability
			:type CADM_Requirement
			:location "207:3-207:50"
			:isContainer false
		)]
	) ) ( def CADM_MaterielItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "establishedAs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_MaterielItem
			:type CADM_MaterielItem
			:location "214:3-214:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "conformsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_MaterielItem
			:type CADM_Standard
			:location "215:3-215:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "performsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_MaterielItem
			:type CADM_Capability
			:location "216:3-216:42"
			:isContainer false
		)]
	) ) ( def CADM_EquipmentType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_MaterielItem]
		:structuralFeatures[]
	) ) ( def CADM_SoftwareItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_MaterielItem]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CADM_SoftwareItem
			:type CADM_EquipmentType
			:location "227:3-227:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isSourceFor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CADM_SoftwareItem
			:type CADM_Organization
			:location "228:3-228:65"
			:isContainer false
			:opposite softwareItems
		)]
	) ) ( def CADM_Facility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CADM_Element]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "243:2-243:18"
	) )]
) )
