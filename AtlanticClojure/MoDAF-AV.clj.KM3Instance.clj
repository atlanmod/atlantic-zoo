( declare MoDAF_Element )
( declare MoDAF_MoDAFModel )
( declare MoDAF_Enterprise )
( declare MoDAF_Environment )
( declare MoDAF_OperationalMission )
( declare MoDAF_Architecture )
( declare MoDAF_ArchitecturalDescription )
( declare MoDAF_ArchitecturalReference )
( declare MoDAF_ArchitecturalProduct )
( declare MoDAF_Elements )
( declare MoDAF_ArchitecturalFramework )
( declare MoDAF_View )
( declare MoDAF_Concern )
( declare MoDAF_StakeholderHasConcern )
( declare MoDAF_Stakeholder )
( declare MoDAF_MetaData )
( declare MoDAF_ArchitectureMetaData )
( declare MoDAF_Taxonomy )
( declare MoDAF_ClassifiedElement )
( declare MoDAF_Standard )
( declare MoDAF_MeasurableProperty )
( declare MoDAF_CapabilityRequirement )
( declare MoDAF_Effect )
( declare MoDAF_EnduringTask )
( declare MoDAF_OperationalConstraint )
( declare MoDAF_PostType )
( declare MoDAF_OrganisationType )
( declare MoDAF_RoleInOrganisation )
( declare MoDAF_LocationType )
( declare MoDAF_OperationalActivity )
( declare MoDAF_Node )
( declare MoDAF_InformationExchange )
( declare MoDAF_Competence )
( declare MoDAF_InformationElement )
( declare MoDAF_NodeConnectionType )
( declare MoDAF_System )
( declare MoDAF_DataElement )
( declare MoDAF_SystemFunction )
( declare MoDAF_SystemConnectionSpecification )
( declare MoDAF_ProjectType )
( declare MoDAF_Service )
( declare MoDAF_Unit )
( declare MoDAF_Dimension )
( declare MoDAF_OrganisationProjectRelationship )
( declare MoDAF_ProjectThreadType )
( declare MoDAF_TimeExpression )
( declare MoDAF_LiteralSpecification )
( declare MoDAF_Property )
( declare PrimitiveTypes_String )
( def MoDAF ( struct-map
	KM3_Package
	:contents[( def MoDAF_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Element
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MoDAF_Element
			:type String
			:location "18:3-18:35"
		)]
	) ) ( def MoDAF_MoDAFModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enterprise"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_Enterprise
			:location "26:3-26:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "environment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_Environment
			:location "27:3-27:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "operationalMissions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_OperationalMission
			:location "28:3-28:69"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architectures"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_Architecture
			:location "29:3-29:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architecturalDescription"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_ArchitecturalDescription
			:location "30:3-30:80"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architecturalReferences"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_ArchitecturalReference
			:location "31:3-31:77"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architecturalFrameworks"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_ArchitecturalFramework
			:location "32:3-32:77"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "architectureMetadatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_ArchitectureMetaData
			:location "33:3-33:71"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "metaDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_MetaData
			:location "34:3-34:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stakeholders"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_Stakeholder
			:location "35:3-35:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stakeholderHasConcerns"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_MoDAFModel
			:type MoDAF_StakeholderHasConcern
			:location "36:3-36:92"
			:isContainer true
			:opposite owner
		)]
	) ) ( def MoDAF_Enterprise ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inhabits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Enterprise
			:type MoDAF_Environment
			:location "45:3-45:58"
			:isContainer false
			:opposite influences
		) ( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_Enterprise
			:type MoDAF_OperationalMission
			:location "46:3-46:49"
			:isContainer false
		)]
	) ) ( def MoDAF_Environment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "influences"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Environment
			:type MoDAF_Enterprise
			:location "53:3-53:57"
			:isContainer false
			:opposite inhabits
		)]
	) ) ( def MoDAF_OperationalMission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[]
	) ) ( def MoDAF_Architecture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enterprise"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Architecture
			:type MoDAF_Enterprise
			:location "65:3-65:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "describedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Architecture
			:type MoDAF_ArchitecturalDescription
			:location "66:3-66:52"
			:isContainer false
		)]
	) ) ( def MoDAF_ArchitecturalDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "approvialAuthority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "73:3-73:41"
		) ( struct-map
			KM3_Attribute
			:name "architect"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "74:3-74:32"
		) ( struct-map
			KM3_Attribute
			:name "assumptionAndConstraints"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "75:3-75:47"
		) ( struct-map
			KM3_Attribute
			:name "creatingOrganisation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "76:3-76:43"
		) ( struct-map
			KM3_Attribute
			:name "dateCompleted"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "77:3-77:36"
		) ( struct-map
			KM3_Attribute
			:name "purpose"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "78:3-78:30"
		) ( struct-map
			KM3_Attribute
			:name "recommendations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "79:3-79:38"
		) ( struct-map
			KM3_Attribute
			:name "summaryOfFindings"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "80:3-80:40"
		) ( struct-map
			KM3_Attribute
			:name "tollsUsed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type String
			:location "81:3-81:32"
		) ( struct-map
			KM3_Reference
			:name "viewpoints"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type MoDAF_View
			:location "82:3-82:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "products"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type MoDAF_ArchitecturalProduct
			:location "83:3-83:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "taxonomy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalDescription
			:type MoDAF_Taxonomy
			:location "84:3-84:33"
			:isContainer false
		)]
	) ) ( def MoDAF_ArchitecturalReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referred"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalReference
			:type MoDAF_ArchitecturalDescription
			:location "91:3-91:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "referrer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalReference
			:type MoDAF_ArchitecturalDescription
			:location "92:3-92:49"
			:isContainer false
		)]
	) ) ( def MoDAF_ArchitecturalProduct ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalProduct
			:type String
			:location "100:3-100:34"
		) ( struct-map
			KM3_Reference
			:name "architecturalElements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalProduct
			:type MoDAF_Elements
			:location "101:3-101:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "definingView"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalProduct
			:type MoDAF_View
			:location "102:3-102:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "addresses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_ArchitecturalProduct
			:type MoDAF_Concern
			:location "103:3-103:61"
			:isContainer false
			:opposite adressedBy
		)]
	) ) ( def MoDAF_Elements ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[]
	) ) ( def MoDAF_ArchitecturalFramework ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedMember"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitecturalFramework
			:type MoDAF_View
			:location "113:3-113:77"
			:isContainer true
			:opposite definingFramework
		)]
	) ) ( def MoDAF_View ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "framework"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type String
			:location "121:3-121:32"
		) ( struct-map
			KM3_Attribute
			:name "frameworkWebsite"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type String
			:location "122:3-122:39"
		) ( struct-map
			KM3_Attribute
			:name "viewCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type String
			:location "123:3-123:31"
		) ( struct-map
			KM3_Attribute
			:name "viewDescription"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type String
			:location "124:3-124:38"
		) ( struct-map
			KM3_Attribute
			:name "viewName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type String
			:location "125:3-125:31"
		) ( struct-map
			KM3_Reference
			:name "definingFramework"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_View
			:type MoDAF_ArchitecturalFramework
			:location "126:3-126:79"
			:isContainer false
			:opposite ownedMember
		) ( struct-map
			KM3_Reference
			:name "usedToCover"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_View
			:type MoDAF_Concern
			:location "127:3-127:51"
			:isContainer true
		)]
	) ) ( def MoDAF_Concern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "adressedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_Concern
			:type MoDAF_ArchitecturalProduct
			:location "134:3-134:74"
			:isContainer false
			:opposite addresses
		)]
	) ) ( def MoDAF_StakeholderHasConcern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "client"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_StakeholderHasConcern
			:type MoDAF_Stakeholder
			:location "141:3-141:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supplier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_StakeholderHasConcern
			:type MoDAF_Concern
			:location "142:3-142:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_StakeholderHasConcern
			:type MoDAF_MoDAFModel
			:location "143:3-143:66"
			:isContainer false
			:opposite stakeholderHasConcerns
		)]
	) ) ( def MoDAF_Stakeholder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[]
	) ) ( def MoDAF_MetaData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dublinCoreElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MetaData
			:type String
			:location "156:3-156:40"
		) ( struct-map
			KM3_Attribute
			:name "modMetaDataElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MetaData
			:type String
			:location "157:3-157:41"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MetaData
			:type String
			:location "158:3-158:27"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_MetaData
			:type String
			:location "159:3-159:27"
		)]
	) ) ( def MoDAF_ArchitectureMetaData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_MetaData]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotatedArchitecture"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ArchitectureMetaData
			:type MoDAF_ArchitecturalDescription
			:location "165:3-165:62"
			:isContainer false
		)]
	) ) ( def MoDAF_Taxonomy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Taxonomy
			:type String
			:location "174:3-174:27"
		) ( struct-map
			KM3_Attribute
			:name "url"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Taxonomy
			:type String
			:location "175:3-175:26"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Taxonomy
			:type String
			:location "176:3-176:30"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoDAF_Taxonomy
			:type MoDAF_ClassifiedElement
			:location "177:3-177:78"
			:isContainer true
			:opposite taxonomy
		)]
	) ) ( def MoDAF_ClassifiedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "taxonomy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_ClassifiedElement
			:type MoDAF_Taxonomy
			:location "184:3-184:53"
			:isContainer false
			:opposite contents
		)]
	) ) ( def MoDAF_Standard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type String
			:location "190:3-190:33"
		) ( struct-map
			KM3_Attribute
			:name "publishedWebsite"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type String
			:location "191:3-191:39"
		) ( struct-map
			KM3_Attribute
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type String
			:location "192:3-192:32"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type String
			:location "194:3-194:30"
		) ( struct-map
			KM3_Reference
			:name "ratificationDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type MoDAF_TimeExpression
			:location "193:3-193:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "withdrawalDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Standard
			:type MoDAF_TimeExpression
			:location "195:3-195:55"
			:isContainer true
		)]
	) ) ( def MoDAF_MeasurableProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "maxValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MoDAF_MeasurableProperty
			:type MoDAF_LiteralSpecification
			:location "201:3-201:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "minValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MoDAF_MeasurableProperty
			:type MoDAF_LiteralSpecification
			:location "202:3-202:61"
			:isContainer true
		)]
	) ) ( def MoDAF_CapabilityRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_Effect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_EnduringTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_OperationalConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodeUsageContext"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MoDAF_OperationalConstraint
			:type MoDAF_Property
			:location "221:3-221:57"
			:isContainer true
		)]
	) ) ( def MoDAF_PostType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_OrganisationType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_RoleInOrganisation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_LocationType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_OperationalActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_InformationExchange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_InformationExchange
			:type String
			:location "251:3-251:33"
		) ( struct-map
			KM3_Attribute
			:name "requirementText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MoDAF_InformationExchange
			:type String
			:location "252:3-252:44"
		)]
	) ) ( def MoDAF_Competence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_InformationElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_NodeConnectionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_DataElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_SystemFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "systemUsageContext"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_SystemFunction
			:type MoDAF_Property
			:location "278:3-278:53"
			:isContainer true
		)]
	) ) ( def MoDAF_SystemConnectionSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_ProjectType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_Unit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_OrganisationProjectRelationship ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_ProjectThreadType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoDAF_ClassifiedElement]
		:structuralFeatures[]
	) ) ( def MoDAF_TimeExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_TimeExpression
			:type String
			:location "313:3-313:28"
		)]
	) ) ( def MoDAF_LiteralSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_LiteralSpecification
			:type String
			:location "316:3-316:28"
		)]
	) ) ( def MoDAF_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoDAF_Property
			:type String
			:location "319:3-319:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "327:2-327:18"
	) )]
) )
