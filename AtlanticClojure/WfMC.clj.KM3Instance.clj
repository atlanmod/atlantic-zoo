( declare WfMC_WorkflowProcessDefinition )
( declare WfMC_WorkflowApplicationDeclaration )
( declare WfMC_WorkflowRelevantData )
( declare WfMC_WorkflowParticipantSpecification )
( declare WfMC_WorkflowProcessActivity )
( declare WfMC_TransitionInformation )
( declare PrimitiveTypes_String )
( def WfMC ( struct-map
	KM3_Package
	:contents[( def WfMC_WorkflowProcessDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "participantSpecificatons"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessDefinition
			:type WfMC_WorkflowParticipantSpecification
			:location "11:3-11:115"
			:isContainer true
			:opposite processDefinition
		) ( struct-map
			KM3_Reference
			:name "revelantDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessDefinition
			:type WfMC_WorkflowRelevantData
			:location "12:3-12:92"
			:isContainer true
			:opposite processDefinition
		) ( struct-map
			KM3_Reference
			:name "applicationDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessDefinition
			:type WfMC_WorkflowApplicationDeclaration
			:location "13:3-13:112"
			:isContainer true
			:opposite processDefinition
		) ( struct-map
			KM3_Reference
			:name "processActivities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessDefinition
			:type WfMC_WorkflowProcessActivity
			:location "14:3-14:99"
			:isContainer true
			:opposite processDefinition
		) ( struct-map
			KM3_Reference
			:name "transitionInformations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessDefinition
			:type WfMC_TransitionInformation
			:location "15:3-15:102"
			:isContainer true
			:opposite processDefinition
		)]
	) ) ( def WfMC_WorkflowApplicationDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowApplicationDeclaration
			:type WfMC_WorkflowProcessDefinition
			:location "19:3-19:94"
			:isContainer false
			:opposite applicationDeclarations
		) ( struct-map
			KM3_Reference
			:name "processActivities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowApplicationDeclaration
			:type WfMC_WorkflowProcessActivity
			:location "20:3-20:95"
			:isContainer false
			:opposite applicationDeclarations
		) ( struct-map
			KM3_Reference
			:name "revelantDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowApplicationDeclaration
			:type WfMC_WorkflowRelevantData
			:location "21:3-21:88"
			:isContainer false
			:opposite applicationDeclarations
		)]
	) ) ( def WfMC_WorkflowRelevantData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowRelevantData
			:type WfMC_WorkflowProcessDefinition
			:location "25:3-25:84"
			:isContainer false
			:opposite revelantDatas
		) ( struct-map
			KM3_Reference
			:name "applicationDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowRelevantData
			:type WfMC_WorkflowApplicationDeclaration
			:location "26:3-26:98"
			:isContainer false
			:opposite revelantDatas
		) ( struct-map
			KM3_Reference
			:name "processActivities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowRelevantData
			:type WfMC_WorkflowProcessActivity
			:location "27:3-27:85"
			:isContainer false
			:opposite revelantDatas
		) ( struct-map
			KM3_Reference
			:name "participantSpecifications"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowRelevantData
			:type WfMC_WorkflowParticipantSpecification
			:location "28:3-28:102"
			:isContainer false
			:opposite revelantDatas
		) ( struct-map
			KM3_Reference
			:name "transitionInformations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowRelevantData
			:type WfMC_TransitionInformation
			:location "29:3-29:88"
			:isContainer false
			:opposite revelantDatas
		)]
	) ) ( def WfMC_WorkflowParticipantSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowParticipantSpecification
			:type WfMC_WorkflowProcessDefinition
			:location "33:3-33:95"
			:isContainer false
			:opposite participantSpecificatons
		) ( struct-map
			KM3_Reference
			:name "revelantDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowParticipantSpecification
			:type WfMC_WorkflowRelevantData
			:location "34:3-34:90"
			:isContainer false
			:opposite participantSpecifications
		) ( struct-map
			KM3_Reference
			:name "processActivities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowParticipantSpecification
			:type WfMC_WorkflowProcessActivity
			:location "35:3-35:98"
			:isContainer false
			:opposite participantSpecifications
		)]
	) ) ( def WfMC_WorkflowProcessActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_WorkflowProcessDefinition
			:location "39:3-39:88"
			:isContainer false
			:opposite processActivities
		) ( struct-map
			KM3_Reference
			:name "applicationDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_WorkflowApplicationDeclaration
			:location "40:3-40:102"
			:isContainer false
			:opposite processActivities
		) ( struct-map
			KM3_Reference
			:name "revelantDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_WorkflowRelevantData
			:location "41:3-41:82"
			:isContainer false
			:opposite processActivities
		) ( struct-map
			KM3_Reference
			:name "participantSpecifications"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_WorkflowParticipantSpecification
			:location "42:3-42:106"
			:isContainer false
			:opposite processActivities
		) ( struct-map
			KM3_Reference
			:name "to_transitionInformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_TransitionInformation
			:location "43:3-43:92"
			:isContainer false
			:opposite to_processActivity
		) ( struct-map
			KM3_Reference
			:name "from_transitionInformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_WorkflowProcessActivity
			:type WfMC_TransitionInformation
			:location "44:3-44:96"
			:isContainer false
			:opposite from_processActivity
		)]
	) ) ( def WfMC_TransitionInformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_TransitionInformation
			:type WfMC_WorkflowProcessDefinition
			:location "48:3-48:93"
			:isContainer false
			:opposite transitionInformations
		) ( struct-map
			KM3_Reference
			:name "revelantDatas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WfMC_TransitionInformation
			:type WfMC_WorkflowRelevantData
			:location "49:3-49:87"
			:isContainer false
			:opposite transitionInformations
		) ( struct-map
			KM3_Reference
			:name "to_processActivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_TransitionInformation
			:type WfMC_WorkflowProcessActivity
			:location "50:3-50:94"
			:isContainer false
			:opposite to_transitionInformation
		) ( struct-map
			KM3_Reference
			:name "from_processActivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WfMC_TransitionInformation
			:type WfMC_WorkflowProcessActivity
			:location "51:3-51:98"
			:isContainer false
			:opposite from_transitionInformation
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "57:2-57:18"
	) )]
) )
