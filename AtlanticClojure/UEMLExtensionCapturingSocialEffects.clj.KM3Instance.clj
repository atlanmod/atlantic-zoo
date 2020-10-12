( declare UEML_UEMLObject )
( declare UEML_UEMLModel )
( declare UEML_Geometry )
( declare UEML_Port )
( declare UEML_Flow )
( declare UEML_Activity )
( declare UEML_Object )
( declare UEML_InformationObject )
( declare UEML_Resource )
( declare UEML_MaterialResource )
( declare UEML_HumanResource )
( declare UEML_ResourceFlow )
( declare UEML_IOFlow )
( declare UEML_ControlFlow )
( declare UEML_TriggerFlow )
( declare UEML_ConstraintFlow )
( declare UEML_ResourceRole )
( declare UEML_RoleType )
( declare UEML_Anchor )
( declare UEML_OutputPort )
( declare UEML_InputPort )
( declare UEML_ConnectionOperator )
( declare UEML_AssociationConnector )
( declare UEML_Process )
( declare UEML_Service )
( declare UEML_Agent )
( declare UEML_Contract )
( declare UEML_Task )
( declare UEML_Commitment )
( def UEML ( struct-map
	KM3_Package
	:contents[( def UEML_UEMLObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLObject
			:type UEML_Geometry
			:location "17:3-17:51"
			:isContainer false
			:opposite object
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLObject
			:type UEML_UEMLModel
			:location "18:3-18:56"
			:isContainer false
			:opposite contains
		)]
	) ) ( def UEML_UEMLModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contains"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_UEMLModel
			:type UEML_UEMLObject
			:location "22:3-22:65"
			:isContainer true
			:opposite model
		)]
	) ) ( def UEML_Geometry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Geometry
			:type UEML_UEMLObject
			:location "26:3-26:48"
			:isContainer false
			:opposite has
		)]
	) ) ( def UEML_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[]
	) ) ( def UEML_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationConnector"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Flow
			:type UEML_AssociationConnector
			:location "32:3-32:85"
			:isContainer false
			:opposite classAssociation
		)]
	) ) ( def UEML_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Activity
			:type UEML_ResourceRole
			:location "37:3-37:58"
			:isContainer false
			:opposite in
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Activity
			:type UEML_Process
			:location "38:3-38:52"
			:isContainer false
			:opposite child
		) ( struct-map
			KM3_Reference
			:name "hasOutput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Activity
			:type UEML_OutputPort
			:location "39:3-39:56"
			:isContainer false
			:opposite activity
		)]
	) ) ( def UEML_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_UEMLObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ioFlow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Object
			:type UEML_IOFlow
			:location "43:3-43:53"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_InformationObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controlFlow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_InformationObject
			:type UEML_ControlFlow
			:location "47:3-47:63"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_Resource
			:type UEML_ResourceFlow
			:location "51:3-51:68"
			:isContainer false
			:opposite resourceCarries
		) ( struct-map
			KM3_Reference
			:name "plays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Resource
			:type UEML_ResourceRole
			:location "52:3-52:62"
			:isContainer false
			:opposite resourcePlays
		)]
	) ) ( def UEML_MaterialResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[]
	) ) ( def UEML_HumanResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[]
	) ) ( def UEML_ResourceFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourceCarries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceFlow
			:type UEML_Resource
			:location "59:3-59:62"
			:isContainer false
			:opposite carries
		)]
	) ) ( def UEML_IOFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_IOFlow
			:type UEML_Object
			:location "63:3-63:51"
			:isContainer false
			:opposite ioFlow
		)]
	) ) ( def UEML_ControlFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Flow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "carries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ControlFlow
			:type UEML_InformationObject
			:location "67:3-67:67"
			:isContainer false
			:opposite controlFlow
		)]
	) ) ( def UEML_TriggerFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_ControlFlow]
		:structuralFeatures[]
	) ) ( def UEML_ConstraintFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_ControlFlow]
		:structuralFeatures[]
	) ) ( def UEML_ResourceRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resourcePlays"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_Resource
			:location "76:3-76:58"
			:isContainer false
			:opposite plays
		) ( struct-map
			KM3_Reference
			:name "roleQualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_RoleType
			:location "77:3-77:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "in"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_ResourceRole
			:type UEML_Activity
			:location "78:3-78:51"
			:isContainer false
			:opposite resourceRole
		)]
	) ) ( def UEML_RoleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UEML_Anchor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Port]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Anchor
			:type UEML_AssociationConnector
			:location "84:3-84:61"
			:isContainer false
			:opposite origin
		) ( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Anchor
			:type UEML_AssociationConnector
			:location "85:3-85:61"
			:isContainer false
			:opposite target
		)]
	) ) ( def UEML_OutputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_OutputPort
			:type UEML_Activity
			:location "89:3-89:54"
			:isContainer false
			:opposite hasOutput
		)]
	) ) ( def UEML_InputPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[]
	) ) ( def UEML_ConnectionOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Anchor]
		:structuralFeatures[]
	) ) ( def UEML_AssociationConnector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "origin"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Anchor
			:location "98:3-98:50"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Anchor
			:location "99:3-99:50"
			:isContainer false
			:opposite origin
		) ( struct-map
			KM3_Reference
			:name "classAssociation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_AssociationConnector
			:type UEML_Flow
			:location "100:3-100:69"
			:isContainer false
			:opposite associationConnector
		)]
	) ) ( def UEML_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Activity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "child"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Process
			:type UEML_Activity
			:location "106:3-106:58"
			:isContainer true
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Process
			:type UEML_Contract
			:location "107:3-107:55"
			:isContainer false
			:opposite process
		) ( struct-map
			KM3_Reference
			:name "realises"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Process
			:type UEML_Service
			:location "108:3-108:51"
			:isContainer false
			:opposite process
		)]
	) ) ( def UEML_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Service
			:type UEML_Process
			:location "112:3-112:51"
			:isContainer false
			:opposite realises
		)]
	) ) ( def UEML_Agent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "obliger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Agent
			:type UEML_Commitment
			:location "116:3-116:52"
			:isContainer false
			:opposite agentO
		) ( struct-map
			KM3_Reference
			:name "claimer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Agent
			:type UEML_Commitment
			:location "117:3-117:52"
			:isContainer false
			:opposite agentC
		) ( struct-map
			KM3_Reference
			:name "has_parties"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Agent
			:type UEML_Contract
			:location "118:3-118:53"
			:isContainer false
			:opposite agent
		)]
	) ) ( def UEML_Contract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper -1
			:lower 1
			:isOrdered false
			:owner UEML_Contract
			:type UEML_Process
			:location "122:3-122:56"
			:isContainer false
			:opposite fulfills
		) ( struct-map
			KM3_Reference
			:name "agent"
			:upper -1
			:lower 2
			:isOrdered false
			:owner UEML_Contract
			:type UEML_Agent
			:location "123:3-123:55"
			:isContainer false
			:opposite has_parties
		) ( struct-map
			KM3_Reference
			:name "collection_of"
			:upper -1
			:lower 1
			:isOrdered false
			:owner UEML_Contract
			:type UEML_Commitment
			:location "124:3-124:75"
			:isContainer true
			:opposite contract
		)]
	) ) ( def UEML_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UEML_Activity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fulfills"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UEML_Task
			:type UEML_Commitment
			:location "128:3-128:54"
			:isContainer false
			:opposite task
		)]
	) ) ( def UEML_Commitment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Commitment
			:type UEML_Task
			:location "132:3-132:45"
			:isContainer false
			:opposite fulfills
		) ( struct-map
			KM3_Reference
			:name "agentO"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Commitment
			:type UEML_Agent
			:location "133:3-133:47"
			:isContainer false
			:opposite obliger
		) ( struct-map
			KM3_Reference
			:name "agentC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Commitment
			:type UEML_Agent
			:location "134:3-134:48"
			:isContainer false
			:opposite claimer
		) ( struct-map
			KM3_Reference
			:name "contract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UEML_Commitment
			:type UEML_Contract
			:location "135:3-135:58"
			:isContainer false
			:opposite collection_of
		)]
	) )]
) )
