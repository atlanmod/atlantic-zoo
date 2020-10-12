( declare MAS_Agent )
( declare MAS_Service )
( declare MAS_Non Functionnal Requirement )
( declare MAS_Requirement )
( declare MAS_Organization )
( declare MAS_Organizational Structure )
( declare MAS_SafetyRule )
( declare MAS_LivenessRule )
( declare MAS_CooperationRules )
( declare MAS_NCS )
( declare MAS_FIPA-Platform Agent )
( declare MAS_FIPA-Platform Task )
( declare MAS_Task )
( declare MAS_Role )
( declare MAS_Representation )
( declare MAS_Characteristic )
( declare MAS_Skill )
( declare MAS_Aptitude )
( declare MAS_Ontology )
( declare MAS_Concept )
( declare MAS_Predicat )
( declare MAS_Action )
( declare MAS_Environnement )
( declare MAS_Responsibility )
( declare MAS_LivenessProperty )
( declare MAS_SafetyProperty )
( declare MAS_Resource )
( declare MAS_Communication )
( declare MAS_AIP )
( declare MAS_Performative )
( declare MAS_Message )
( declare MAS_Scenario )
( declare PrimitiveTypes_String )
( def MAS ( struct-map
	KM3_Package
	:contents[( def MAS_Agent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Service
			:location "14:3-14:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "non_Functionnal_Requirement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Non Functionnal Requirement
			:location "15:3-15:76"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "requirement"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Requirement
			:location "16:3-16:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "belongs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Organization
			:location "17:3-17:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cooperationRules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_CooperationRules
			:location "18:3-18:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "fipa_Platform_Agent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Agent
			:type MAS_FIPA-Platform Agent
			:location "19:3-19:76"
			:isContainer false
			:opposite agentF
		) ( struct-map
			KM3_Reference
			:name "role"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Role
			:location "20:3-20:53"
			:isContainer true
			:opposite agentR
		) ( struct-map
			KM3_Reference
			:name "representation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Representation
			:location "21:3-21:80"
			:isContainer true
			:opposite agentRep
		) ( struct-map
			KM3_Reference
			:name "characteristic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Characteristic
			:location "22:3-22:78"
			:isContainer true
			:opposite agentC
		) ( struct-map
			KM3_Reference
			:name "skill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Skill
			:location "23:3-23:60"
			:isContainer true
			:opposite agentS
		) ( struct-map
			KM3_Reference
			:name "aptitude"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Agent
			:type MAS_Aptitude
			:location "24:3-24:66"
			:isContainer true
			:opposite agentA
		)]
	) ) ( def MAS_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "inputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Service
			:type String
			:location "28:3-28:29"
		) ( struct-map
			KM3_Attribute
			:name "outputs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Service
			:type String
			:location "29:3-29:30"
		) ( struct-map
			KM3_Attribute
			:name "pre-conditions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Service
			:type String
			:location "30:3-30:39"
		) ( struct-map
			KM3_Attribute
			:name "post-conditions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Service
			:type String
			:location "31:3-31:40"
		)]
	) ) ( def MAS_Non Functionnal Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MAS_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MAS_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "observes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Organization
			:type MAS_Organizational Structure
			:location "38:3-38:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizational_Structure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Organization
			:type MAS_Organizational Structure
			:location "39:3-39:90"
			:isContainer false
			:opposite organization
		)]
	) ) ( def MAS_Organizational Structure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "organization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Organizational Structure
			:type MAS_Organization
			:location "43:3-43:90"
			:isContainer true
			:opposite organizational_Structure
		)]
	) ) ( def MAS_SafetyRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Organizational Structure]
		:structuralFeatures[]
	) ) ( def MAS_LivenessRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Organizational Structure]
		:structuralFeatures[]
	) ) ( def MAS_CooperationRules ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ncs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_CooperationRules
			:type MAS_NCS
			:location "50:3-50:61"
			:isContainer true
			:opposite cooperationRules
		)]
	) ) ( def MAS_NCS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperationRules"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_NCS
			:type MAS_CooperationRules
			:location "54:3-54:64"
			:isContainer false
			:opposite ncs
		)]
	) ) ( def MAS_FIPA-Platform Agent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentF"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_FIPA-Platform Agent
			:type MAS_Agent
			:location "58:3-58:61"
			:isContainer false
			:opposite fipa_Platform_Agent
		) ( struct-map
			KM3_Reference
			:name "fipa_Platform_Task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_FIPA-Platform Agent
			:type MAS_FIPA-Platform Task
			:location "59:3-59:100"
			:isContainer true
			:opposite fipa_Platform_AgentF
		)]
	) ) ( def MAS_FIPA-Platform Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fipa_Platform_AgentF"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_FIPA-Platform Task
			:type MAS_FIPA-Platform Agent
			:location "63:3-63:89"
			:isContainer false
			:opposite fipa_Platform_Task
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_FIPA-Platform Task
			:type MAS_Task
			:location "64:3-64:56"
			:isContainer false
			:opposite fipa_Platform_TaskT
		)]
	) ) ( def MAS_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Task
			:type String
			:location "68:3-68:27"
		) ( struct-map
			KM3_Reference
			:name "fipa_Platform_TaskT"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Task
			:type MAS_FIPA-Platform Task
			:location "69:3-69:73"
			:isContainer false
			:opposite task
		)]
	) ) ( def MAS_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Role
			:type MAS_Agent
			:location "73:3-73:47"
			:isContainer false
			:opposite role
		) ( struct-map
			KM3_Reference
			:name "activity"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MAS_Role
			:type MAS_Task
			:location "74:3-74:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "actsOn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Role
			:type MAS_Resource
			:location "75:3-75:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "scenario"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MAS_Role
			:type MAS_Scenario
			:location "76:3-76:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Role
			:type MAS_Communication
			:location "77:3-77:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MAS_Role
			:type MAS_Responsibility
			:location "78:3-78:41"
			:isContainer false
		)]
	) ) ( def MAS_Representation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentRep"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Representation
			:type MAS_Agent
			:location "82:3-82:56"
			:isContainer false
			:opposite representation
		) ( struct-map
			KM3_Reference
			:name "ontology"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MAS_Representation
			:type MAS_Ontology
			:location "83:3-83:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "environnement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Representation
			:type MAS_Environnement
			:location "84:3-84:42"
			:isContainer false
		)]
	) ) ( def MAS_Characteristic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Characteristic
			:type MAS_Agent
			:location "88:3-88:54"
			:isContainer false
			:opposite characteristic
		)]
	) ) ( def MAS_Skill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentS"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Skill
			:type MAS_Agent
			:location "91:3-91:45"
			:isContainer false
			:opposite skill
		)]
	) ) ( def MAS_Aptitude ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "agentA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Aptitude
			:type MAS_Agent
			:location "94:3-94:48"
			:isContainer false
			:opposite aptitude
		)]
	) ) ( def MAS_Ontology ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "environnement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Ontology
			:type MAS_Environnement
			:location "98:3-98:43"
			:isContainer false
		)]
	) ) ( def MAS_Concept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Ontology]
		:structuralFeatures[]
	) ) ( def MAS_Predicat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Ontology]
		:structuralFeatures[]
	) ) ( def MAS_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Ontology]
		:structuralFeatures[]
	) ) ( def MAS_Environnement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Environnement
			:type MAS_Resource
			:location "106:3-106:68"
			:isContainer true
			:opposite environnement
		)]
	) ) ( def MAS_Responsibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MAS_LivenessProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Responsibility]
		:structuralFeatures[]
	) ) ( def MAS_SafetyProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MAS_Responsibility]
		:structuralFeatures[]
	) ) ( def MAS_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Resource
			:type String
			:location "114:3-114:27"
		) ( struct-map
			KM3_Reference
			:name "environnement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Resource
			:type MAS_Environnement
			:location "115:3-115:63"
			:isContainer false
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Resource
			:type MAS_Action
			:location "116:3-116:29"
			:isContainer false
		)]
	) ) ( def MAS_Communication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Communication
			:type String
			:location "120:3-120:27"
		) ( struct-map
			KM3_Reference
			:name "Exchanged Knoledge"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Communication
			:type MAS_Ontology
			:location "121:3-121:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "scenario"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MAS_Communication
			:type MAS_Scenario
			:location "122:3-122:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "aip"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Communication
			:type MAS_AIP
			:location "123:3-123:22"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MAS_Communication
			:type MAS_Message
			:location "124:3-124:69"
			:isContainer true
			:opposite communication
		)]
	) ) ( def MAS_AIP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_AIP
			:type String
			:location "128:3-128:27"
		) ( struct-map
			KM3_Reference
			:name "performative"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_AIP
			:type MAS_Performative
			:location "129:3-129:66"
			:isContainer true
			:opposite aip
		)]
	) ) ( def MAS_Performative ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "aip"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Performative
			:type MAS_AIP
			:location "133:3-133:47"
			:isContainer false
			:opposite performative
		)]
	) ) ( def MAS_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "communication"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Message
			:type MAS_Communication
			:location "137:3-137:62"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "Comm_Act"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MAS_Message
			:type MAS_Performative
			:location "138:3-138:37"
			:isContainer false
		)]
	) ) ( def MAS_Scenario ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "147:2-147:18"
	) )]
) )
