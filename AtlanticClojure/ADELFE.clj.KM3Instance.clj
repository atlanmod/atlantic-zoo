( declare ADELFE_Classifier )
( declare ADELFE_Environnement )
( declare ADELFE_Element )
( declare ADELFE_CooperativeAgent )
( declare ADELFE_Representation )
( declare ADELFE_Skill )
( declare ADELFE_Aptitude )
( declare ADELFE_Characteristic )
( declare ADELFE_Communication )
( declare ADELFE_AIP )
( declare ADELFE_CooperationRules )
( declare ADELFE_NCS )
( declare ADELFE_Incomprehension )
( declare ADELFE_Ambiguity )
( declare ADELFE_Incompetence )
( declare ADELFE_Unproductiveness )
( declare ADELFE_Concurrency )
( declare ADELFE_Conflict )
( declare ADELFE_Uselessness )
( def ADELFE ( struct-map
	KM3_Package
	:contents[( def ADELFE_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ADELFE_Environnement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Environnement
			:type ADELFE_Element
			:location "16:3-16:66"
			:isContainer true
			:opposite environnement
		)]
	) ) ( def ADELFE_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "environnement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Element
			:type ADELFE_Environnement
			:location "20:3-20:64"
			:isContainer false
			:opposite element
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Element
			:type ADELFE_CooperativeAgent
			:location "21:3-21:62"
			:isContainer false
			:opposite elementA
		) ( struct-map
			KM3_Reference
			:name "perception"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Element
			:type ADELFE_CooperativeAgent
			:location "22:3-22:64"
			:isContainer false
			:opposite elementP
		)]
	) ) ( def ADELFE_CooperativeAgent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Element
			:location "26:3-26:58"
			:isContainer false
			:opposite action
		) ( struct-map
			KM3_Reference
			:name "elementP"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Element
			:location "27:2-27:61"
			:isContainer false
			:opposite perception
		) ( struct-map
			KM3_Reference
			:name "representation"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Representation
			:location "28:3-28:89"
			:isContainer true
			:opposite cooperativeAgentR
		) ( struct-map
			KM3_Reference
			:name "skill"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Skill
			:location "29:3-29:76"
			:isContainer true
			:opposite cooperativeAgentS
		) ( struct-map
			KM3_Reference
			:name "aptitude"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Aptitude
			:location "30:3-30:79"
			:isContainer true
			:opposite cooperativeAgentA
		) ( struct-map
			KM3_Reference
			:name "characteristic"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Characteristic
			:location "31:3-31:90"
			:isContainer true
			:opposite cooperativeAgentCha
		) ( struct-map
			KM3_Reference
			:name "communication"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_Communication
			:location "32:3-32:89"
			:isContainer true
			:opposite cooperativeAgentCom
		) ( struct-map
			KM3_Reference
			:name "observes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperativeAgent
			:type ADELFE_CooperationRules
			:location "33:3-33:51"
			:isContainer false
		)]
	) ) ( def ADELFE_Representation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperativeAgentR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Representation
			:type ADELFE_CooperativeAgent
			:location "37:3-37:78"
			:isContainer false
			:opposite representation
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Representation
			:type ADELFE_Element
			:location "38:3-38:34"
			:isContainer false
		)]
	) ) ( def ADELFE_Skill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperativeAgentS"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Skill
			:type ADELFE_CooperativeAgent
			:location "42:3-42:69"
			:isContainer false
			:opposite skill
		)]
	) ) ( def ADELFE_Aptitude ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperativeAgentA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Aptitude
			:type ADELFE_CooperativeAgent
			:location "46:3-46:72"
			:isContainer false
			:opposite aptitude
		)]
	) ) ( def ADELFE_Characteristic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperativeAgentCha"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Characteristic
			:type ADELFE_CooperativeAgent
			:location "50:3-50:80"
			:isContainer false
			:opposite characteristic
		)]
	) ) ( def ADELFE_Communication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperativeAgentCom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_Communication
			:type ADELFE_CooperativeAgent
			:location "54:3-54:79"
			:isContainer false
			:opposite communication
		) ( struct-map
			KM3_Reference
			:name "aip"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ADELFE_Communication
			:type ADELFE_AIP
			:location "55:3-55:30"
			:isContainer false
		)]
	) ) ( def ADELFE_AIP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ADELFE_CooperationRules ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "detects"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ADELFE_CooperationRules
			:type ADELFE_NCS
			:location "61:3-61:67"
			:isContainer false
			:opposite cooperationRules
		)]
	) ) ( def ADELFE_NCS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperationRules"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ADELFE_NCS
			:type ADELFE_CooperationRules
			:location "66:3-66:70"
			:isContainer false
			:opposite detects
		)]
	) ) ( def ADELFE_Incomprehension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Ambiguity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Incompetence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Unproductiveness ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Concurrency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Conflict ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) ) ( def ADELFE_Uselessness ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ADELFE_NCS]
		:structuralFeatures[]
	) )]
) )
