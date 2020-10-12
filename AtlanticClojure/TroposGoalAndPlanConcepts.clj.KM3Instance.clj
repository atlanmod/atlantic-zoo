( declare GoalAndPlanConcepts_Actor )
( declare GoalAndPlanConcepts_Decomposition )
( declare GoalAndPlanConcepts_Contribution )
( declare GoalAndPlanConcepts_Goal )
( declare GoalAndPlanConcepts_MeansEnd )
( declare GoalAndPlanConcepts_Resource )
( declare GoalAndPlanConcepts_Plan )
( declare GoalAndPlanConcepts_BooleanDecomposition )
( declare GoalAndPlanConcepts_BooleanDecLink )
( declare GoalAndPlanConcepts_AndDecLink )
( declare GoalAndPlanConcepts_OrDecLink )
( declare PrimitiveTypes_String )
( def GoalAndPlanConcepts ( struct-map
	KM3_Package
	:contents[( def GoalAndPlanConcepts_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "decomposition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Actor
			:type GoalAndPlanConcepts_Decomposition
			:location "14:2-14:68"
			:isContainer false
			:opposite PointOfView
		) ( struct-map
			KM3_Reference
			:name "contribution"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Actor
			:type GoalAndPlanConcepts_Contribution
			:location "15:2-15:66"
			:isContainer false
			:opposite PointOfView
		) ( struct-map
			KM3_Reference
			:name "meansEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Actor
			:type GoalAndPlanConcepts_MeansEnd
			:location "16:2-16:58"
			:isContainer false
			:opposite PointOfView
		)]
	) ) ( def GoalAndPlanConcepts_Decomposition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "PointOfView"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_Decomposition
			:type GoalAndPlanConcepts_Actor
			:location "20:3-20:58"
			:isContainer false
			:opposite decomposition
		)]
	) ) ( def GoalAndPlanConcepts_Contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "metric"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_Contribution
			:type String
			:location "24:3-24:29"
		) ( struct-map
			KM3_Reference
			:name "contributer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_Contribution
			:type GoalAndPlanConcepts_Goal
			:location "25:3-25:57"
			:isContainer false
			:opposite contributionR
		) ( struct-map
			KM3_Reference
			:name "contributed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_Contribution
			:type GoalAndPlanConcepts_Goal
			:location "26:3-26:57"
			:isContainer false
			:opposite contributionD
		) ( struct-map
			KM3_Reference
			:name "PointOfView"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_Contribution
			:type GoalAndPlanConcepts_Actor
			:location "27:3-27:57"
			:isContainer false
			:opposite contribution
		)]
	) ) ( def GoalAndPlanConcepts_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contributionR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_Contribution
			:location "31:3-31:68"
			:isContainer false
			:opposite contributer
		) ( struct-map
			KM3_Reference
			:name "contributionD"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_Contribution
			:location "32:3-32:68"
			:isContainer false
			:opposite contributed
		) ( struct-map
			KM3_Reference
			:name "meansEndS"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_MeansEnd
			:location "33:3-33:54"
			:isContainer false
			:opposite means
		) ( struct-map
			KM3_Reference
			:name "meansEndD"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_MeansEnd
			:location "34:3-34:52"
			:isContainer false
			:opposite end
		) ( struct-map
			KM3_Reference
			:name "booleanDecomposition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_BooleanDecomposition
			:location "35:3-35:78"
			:isContainer false
			:opposite root
		) ( struct-map
			KM3_Reference
			:name "booleanDecLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Goal
			:type GoalAndPlanConcepts_BooleanDecLink
			:location "36:3-36:66"
			:isContainer false
			:opposite target
		)]
	) ) ( def GoalAndPlanConcepts_MeansEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "meansR"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_MeansEnd
			:type GoalAndPlanConcepts_Resource
			:location "40:3-40:57"
			:isContainer false
			:opposite meansEndR
		) ( struct-map
			KM3_Reference
			:name "means"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_MeansEnd
			:type GoalAndPlanConcepts_Goal
			:location "41:3-41:52"
			:isContainer false
			:opposite meansEndS
		) ( struct-map
			KM3_Reference
			:name "end"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_MeansEnd
			:type GoalAndPlanConcepts_Goal
			:location "42:3-42:45"
			:isContainer false
			:opposite meansEndD
		) ( struct-map
			KM3_Reference
			:name "PointOfView"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_MeansEnd
			:type GoalAndPlanConcepts_Actor
			:location "43:3-43:53"
			:isContainer false
			:opposite meansEnd
		) ( struct-map
			KM3_Reference
			:name "meansP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_MeansEnd
			:type GoalAndPlanConcepts_Plan
			:location "44:3-44:53"
			:isContainer false
			:opposite meansEndP
		)]
	) ) ( def GoalAndPlanConcepts_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "meansEndR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Resource
			:type GoalAndPlanConcepts_MeansEnd
			:location "48:3-48:55"
			:isContainer false
			:opposite meansR
		)]
	) ) ( def GoalAndPlanConcepts_Plan ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "meansEndP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Plan
			:type GoalAndPlanConcepts_MeansEnd
			:location "52:3-52:55"
			:isContainer false
			:opposite meansP
		) ( struct-map
			KM3_Reference
			:name "booleanDecompositionP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Plan
			:type GoalAndPlanConcepts_BooleanDecomposition
			:location "53:3-53:80"
			:isContainer false
			:opposite rootP
		) ( struct-map
			KM3_Reference
			:name "booleanDecLinkP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_Plan
			:type GoalAndPlanConcepts_BooleanDecLink
			:location "54:3-54:68"
			:isContainer false
			:opposite targetP
		)]
	) ) ( def GoalAndPlanConcepts_BooleanDecomposition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GoalAndPlanConcepts_Decomposition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecomposition
			:type String
			:location "58:3-58:27"
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecomposition
			:type GoalAndPlanConcepts_Goal
			:location "59:3-59:62"
			:isContainer false
			:opposite booleanDecomposition
		) ( struct-map
			KM3_Reference
			:name "rootP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecomposition
			:type GoalAndPlanConcepts_Plan
			:location "60:3-60:64"
			:isContainer false
			:opposite booleanDecompositionP
		) ( struct-map
			KM3_Reference
			:name "booleanDecLinkD"
			:upper -1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecomposition
			:type GoalAndPlanConcepts_BooleanDecLink
			:location "61:3-61:94"
			:isContainer true
			:opposite booleanDecompositionB
		)]
	) ) ( def GoalAndPlanConcepts_BooleanDecLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "booleanDecompositionB"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecLink
			:type GoalAndPlanConcepts_BooleanDecomposition
			:location "65:3-65:85"
			:isContainer false
			:opposite booleanDecLinkD
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecLink
			:type GoalAndPlanConcepts_Goal
			:location "66:3-66:58"
			:isContainer false
			:opposite booleanDecLink
		) ( struct-map
			KM3_Reference
			:name "targetP"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GoalAndPlanConcepts_BooleanDecLink
			:type GoalAndPlanConcepts_Plan
			:location "67:3-67:60"
			:isContainer false
			:opposite booleanDecLinkP
		)]
	) ) ( def GoalAndPlanConcepts_AndDecLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GoalAndPlanConcepts_BooleanDecLink]
		:structuralFeatures[]
	) ) ( def GoalAndPlanConcepts_OrDecLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GoalAndPlanConcepts_BooleanDecLink]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "76:1-76:17"
	) )]
) )
