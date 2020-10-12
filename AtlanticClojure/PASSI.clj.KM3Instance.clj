( declare Solution Domain_FIPA-Platform Agent )
( declare Solution Domain_FIPA-platform Task )
( declare Solution Domain_Service )
( declare Agency Domain_Agent )
( declare Agency Domain_Role )
( declare Agency Domain_Task )
( declare Agency Domain_Communication )
( declare Agency Domain_Message )
( declare Agency Domain_AIP )
( declare Agency Domain_Performative )
( declare Problem Domain_Ressource )
( declare Problem Domain_Non functionnal Requirement )
( declare Problem Domain_Requirement )
( declare Problem Domain_Scenario )
( declare Problem Domain_Ontology )
( declare Problem Domain_Concept )
( declare Problem Domain_Action )
( declare Problem Domain_Predicate )
( declare PrimitiveTypes_String )
( def PASSI ( struct-map
	KM3_Package
	:contents[( def Solution Domain ( struct-map
		KM3_Package
		:contents[( def Solution Domain_FIPA-Platform Agent ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "fipa_platform_Task"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Solution Domain_FIPA-Platform Agent
				:type Solution Domain_FIPA-platform Task
				:location "17:4-17:102"
				:isContainer true
				:opposite fipa_platform_Agent
			) ( struct-map
				KM3_Reference
				:name "agent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Solution Domain_FIPA-Platform Agent
				:type Agency Domain_Agent
				:location "18:4-18:71"
				:isContainer false
				:opposite fipa_platform_AgentA
			)]
		) ) ( def Solution Domain_FIPA-platform Task ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "fipa_platform_Agent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Solution Domain_FIPA-platform Task
				:type Solution Domain_FIPA-Platform Agent
				:location "22:3-22:90"
				:isContainer false
				:opposite fipa_platform_Task
			) ( struct-map
				KM3_Reference
				:name "task"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Solution Domain_FIPA-platform Task
				:type Agency Domain_Task
				:location "23:3-23:67"
				:isContainer false
				:opposite fipa_platform_TaskT
			)]
		) ) ( def Solution Domain_Service ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) )]
	) ) ( def Agency Domain ( struct-map
		KM3_Package
		:contents[( def Agency Domain_Agent ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "Name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Agent
				:type String
				:location "35:3-35:27"
			) ( struct-map
				KM3_Reference
				:name "Knowledge"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Agent
				:type Problem Domain_Ontology
				:location "36:3-36:37"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "fipa_platform_AgentA"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Agent
				:type Solution Domain_FIPA-Platform Agent
				:location "37:3-37:76"
				:isContainer false
				:opposite agent
			) ( struct-map
				KM3_Reference
				:name "role"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Agent
				:type Agency Domain_Role
				:location "38:3-38:59"
				:isContainer true
				:opposite agentR
			) ( struct-map
				KM3_Reference
				:name "resource"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Agency Domain_Agent
				:type Problem Domain_Ressource
				:location "39:3-39:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "non_functionnal_Requirement"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Agency Domain_Agent
				:type Problem Domain_Non functionnal Requirement
				:location "40:3-40:78"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "requirement"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Agent
				:type Problem Domain_Requirement
				:location "41:3-41:45"
				:isContainer false
			)]
		) ) ( def Agency Domain_Role ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "agentR"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Role
				:type Agency Domain_Agent
				:location "45:4-45:47"
				:isContainer false
				:opposite role
			) ( struct-map
				KM3_Reference
				:name "service"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Agency Domain_Role
				:type Solution Domain_Service
				:location "46:4-46:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "task"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Role
				:type Agency Domain_Task
				:location "47:4-47:33"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "scenario"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Role
				:type Problem Domain_Scenario
				:location "48:4-48:40"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "communication"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Agency Domain_Role
				:type Agency Domain_Communication
				:location "49:4-49:47"
				:isContainer false
			)]
		) ) ( def Agency Domain_Task ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "Name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Task
				:type String
				:location "53:4-53:28"
			) ( struct-map
				KM3_Reference
				:name "fipa_platform_TaskT"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Task
				:type Solution Domain_FIPA-platform Task
				:location "54:4-54:73"
				:isContainer false
				:opposite task
			)]
		) ) ( def Agency Domain_Communication ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "Name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Communication
				:type String
				:location "58:4-58:29"
			) ( struct-map
				KM3_Reference
				:name "Exchanged Knowledge"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Communication
				:type Problem Domain_Ontology
				:location "59:4-59:47"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "message"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Communication
				:type Agency Domain_Message
				:location "60:4-60:68"
				:isContainer true
				:opposite communication
			) ( struct-map
				KM3_Reference
				:name "aip"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Communication
				:type Agency Domain_AIP
				:location "61:4-61:28"
				:isContainer false
			)]
		) ) ( def Agency Domain_Message ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "communication"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Message
				:type Agency Domain_Communication
				:location "65:4-65:64"
				:isContainer false
				:opposite message
			) ( struct-map
				KM3_Reference
				:name "Comm_Act"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Message
				:type Agency Domain_Performative
				:location "66:4-66:38"
				:isContainer false
			)]
		) ) ( def Agency Domain_AIP ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "Name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_AIP
				:type String
				:location "70:4-70:28"
			) ( struct-map
				KM3_Reference
				:name "performative"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_AIP
				:type Agency Domain_Performative
				:location "71:4-71:67"
				:isContainer true
				:opposite aip
			)]
		) ) ( def Agency Domain_Performative ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "aip"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Agency Domain_Performative
				:type Agency Domain_AIP
				:location "75:4-75:48"
				:isContainer false
				:opposite performative
			)]
		) )]
	) ) ( def Problem Domain ( struct-map
		KM3_Package
		:contents[( def Problem Domain_Ressource ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "Name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Problem Domain_Ressource
				:type String
				:location "84:4-84:28"
			)]
		) ) ( def Problem Domain_Non functionnal Requirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Problem Domain_Requirement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Problem Domain_Scenario ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Problem Domain_Ontology ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Problem Domain_Concept ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Problem Domain_Ontology]
			:structuralFeatures[]
		) ) ( def Problem Domain_Action ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Problem Domain_Ontology]
			:structuralFeatures[]
		) ) ( def Problem Domain_Predicate ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Problem Domain_Ontology]
			:structuralFeatures[]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "104:2-104:18"
	) )]
) )
