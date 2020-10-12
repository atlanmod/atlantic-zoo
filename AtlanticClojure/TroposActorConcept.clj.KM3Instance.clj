( declare ActorConcept_Actor )
( declare ActorConcept_Goal )
( declare ActorConcept_SoftGoal )
( declare ActorConcept_HardGoal )
( declare ActorConcept_Dependency )
( declare ActorConcept_Plan )
( declare ActorConcept_Resource )
( def ActorConcept ( struct-map
	KM3_Package
	:contents[( def ActorConcept_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependencyE"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Actor
			:type ActorConcept_Dependency
			:location "14:3-14:61"
			:isContainer false
			:opposite dependee
		) ( struct-map
			KM3_Reference
			:name "dependencyR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Actor
			:type ActorConcept_Dependency
			:location "15:3-15:61"
			:isContainer false
			:opposite depender
		) ( struct-map
			KM3_Reference
			:name "goal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Actor
			:type ActorConcept_Goal
			:location "16:3-16:46"
			:isContainer false
			:opposite wanter
		) ( struct-map
			KM3_Reference
			:name "plan"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Actor
			:type ActorConcept_Plan
			:location "17:3-17:49"
			:isContainer false
			:opposite capableOf
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Actor
			:type ActorConcept_Resource
			:location "18:3-18:51"
			:isContainer false
			:opposite use
		)]
	) ) ( def ActorConcept_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "wanter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Goal
			:type ActorConcept_Actor
			:location "22:3-22:44"
			:isContainer false
			:opposite goal
		) ( struct-map
			KM3_Reference
			:name "plan"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Goal
			:type ActorConcept_Plan
			:location "23:3-23:54"
			:isContainer false
			:opposite isFulfilled
		) ( struct-map
			KM3_Reference
			:name "dependencyWG"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Goal
			:type ActorConcept_Dependency
			:location "24:3-24:58"
			:isContainer false
			:opposite WhyG
		) ( struct-map
			KM3_Reference
			:name "dependencyG"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Goal
			:type ActorConcept_Dependency
			:location "25:3-25:57"
			:isContainer false
			:opposite goal
		)]
	) ) ( def ActorConcept_SoftGoal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ActorConcept_Goal]
		:structuralFeatures[]
	) ) ( def ActorConcept_HardGoal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ActorConcept_Goal]
		:structuralFeatures[]
	) ) ( def ActorConcept_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependee"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Actor
			:location "32:3-32:53"
			:isContainer false
			:opposite dependencyE
		) ( struct-map
			KM3_Reference
			:name "depender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Actor
			:location "33:3-33:53"
			:isContainer false
			:opposite dependencyR
		) ( struct-map
			KM3_Reference
			:name "goal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Goal
			:location "34:3-34:53"
			:isContainer false
			:opposite dependencyG
		) ( struct-map
			KM3_Reference
			:name "WhyG"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Goal
			:location "35:3-35:54"
			:isContainer false
			:opposite dependencyWG
		) ( struct-map
			KM3_Reference
			:name "WhyR"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Resource
			:location "36:3-36:58"
			:isContainer false
			:opposite dependencyWR
		) ( struct-map
			KM3_Reference
			:name "resourceD"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Resource
			:location "37:3-37:62"
			:isContainer false
			:opposite dependencyR
		) ( struct-map
			KM3_Reference
			:name "WhyP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Plan
			:location "38:3-38:54"
			:isContainer false
			:opposite dependencyWP
		) ( struct-map
			KM3_Reference
			:name "plan"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Dependency
			:type ActorConcept_Plan
			:location "39:3-39:53"
			:isContainer false
			:opposite dependencyP
		)]
	) ) ( def ActorConcept_Plan ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isFulfilled"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Plan
			:type ActorConcept_Goal
			:location "43:3-43:48"
			:isContainer false
			:opposite plan
		) ( struct-map
			KM3_Reference
			:name "capableOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Plan
			:type ActorConcept_Actor
			:location "44:3-44:47"
			:isContainer false
			:opposite plan
		) ( struct-map
			KM3_Reference
			:name "dependencyWP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Plan
			:type ActorConcept_Dependency
			:location "45:3-45:58"
			:isContainer false
			:opposite WhyP
		) ( struct-map
			KM3_Reference
			:name "dependencyP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ActorConcept_Plan
			:type ActorConcept_Dependency
			:location "46:3-46:57"
			:isContainer false
			:opposite plan
		)]
	) ) ( def ActorConcept_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Resource
			:type ActorConcept_Actor
			:location "50:3-50:45"
			:isContainer false
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "dependencyWR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Resource
			:type ActorConcept_Dependency
			:location "51:3-51:55"
			:isContainer false
			:opposite WhyR
		) ( struct-map
			KM3_Reference
			:name "dependencyR"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ActorConcept_Resource
			:type ActorConcept_Dependency
			:location "52:3-52:59"
			:isContainer false
			:opposite resourceD
		)]
	) )]
) )
