( declare CPR_Plan )
( declare CPR_Objective )
( declare CPR_EvaluationCriteria )
( declare CPR_Action )
( declare CPR_Actor )
( declare CPR_Resource )
( declare CPR_TimeSpec )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CPR ( struct-map
	KM3_Package
	:contents[( def CPR_Plan ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sub_plans"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Plan
			:type CPR_Plan
			:location "14:3-14:65"
			:isContainer true
			:opposite super_plan
		) ( struct-map
			KM3_Reference
			:name "super_plan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Plan
			:type CPR_Plan
			:location "15:3-15:52"
			:isContainer false
			:opposite sub_plans
		) ( struct-map
			KM3_Reference
			:name "objectives"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Plan
			:type CPR_Objective
			:location "16:3-16:75"
			:isContainer true
			:opposite objective_plan
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPR_Plan
			:type CPR_Action
			:location "17:3-17:74"
			:isContainer true
			:opposite action_plan
		)]
	) ) ( def CPR_Objective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objective_plan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Objective
			:type CPR_Plan
			:location "21:3-21:57"
			:isContainer false
			:opposite objectives
		) ( struct-map
			KM3_Reference
			:name "criterias"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Objective
			:type CPR_EvaluationCriteria
			:location "22:3-22:87"
			:isContainer true
			:opposite criteria_objective
		)]
	) ) ( def CPR_EvaluationCriteria ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "criteria_objective"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_EvaluationCriteria
			:type CPR_Objective
			:location "26:3-26:65"
			:isContainer false
			:opposite criterias
		)]
	) ) ( def CPR_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "action_plan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Action
			:type CPR_Plan
			:location "30:3-30:51"
			:isContainer false
			:opposite actions
		) ( struct-map
			KM3_Reference
			:name "sub_actions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner CPR_Action
			:type CPR_Action
			:location "31:3-31:79"
			:isContainer true
			:opposite super_action
		) ( struct-map
			KM3_Reference
			:name "super_action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Action
			:type CPR_Action
			:location "32:3-32:58"
			:isContainer false
			:opposite sub_actions
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Action
			:type CPR_Actor
			:location "33:3-33:61"
			:isContainer true
			:opposite actor_action
		) ( struct-map
			KM3_Reference
			:name "resources"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Action
			:type CPR_Resource
			:location "34:3-34:74"
			:isContainer true
			:opposite resource_action
		) ( struct-map
			KM3_Reference
			:name "timeSpecs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Action
			:type CPR_TimeSpec
			:location "35:3-35:74"
			:isContainer true
			:opposite timeSpec_action
		)]
	) ) ( def CPR_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actor_action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Actor
			:type CPR_Action
			:location "39:3-39:52"
			:isContainer false
			:opposite actor
		) ( struct-map
			KM3_Reference
			:name "sub_actors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPR_Actor
			:type CPR_Actor
			:location "40:3-40:68"
			:isContainer true
			:opposite super_actor
		) ( struct-map
			KM3_Reference
			:name "super_actor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Actor
			:type CPR_Actor
			:location "41:3-41:55"
			:isContainer false
			:opposite sub_actors
		)]
	) ) ( def CPR_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resource_action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_Resource
			:type CPR_Action
			:location "45:3-45:59"
			:isContainer false
			:opposite resources
		)]
	) ) ( def CPR_TimeSpec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "timeSpec_action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPR_TimeSpec
			:type CPR_Action
			:location "49:3-49:59"
			:isContainer false
			:opposite timeSpecs
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "59:2-59:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "60:2-60:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "61:2-61:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "62:2-62:18"
	) )]
) )
