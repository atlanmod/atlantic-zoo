( declare WorkDefinitions_WorkDefinition )
( declare WorkDefinitions_ProcessPerformer )
( declare WorkDefinitions_Role )
( declare WorkDefinitions_WorkProduct )
( declare WorkDefinitions_Lifecycle )
( declare WorkDefinitions_Phase )
( declare WorkDefinitions_Iteration )
( declare WorkDefinitions_Activity )
( declare WorkDefinitions_Step )
( declare PrimitiveTypes_Boolean )
( def WorkDefinitions ( struct-map
	KM3_Package
	:contents[( def WorkDefinitions_WorkDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentWorks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WorkDefinitions_WorkDefinition
			:type WorkDefinitions_WorkDefinition
			:location "11:3-11:65"
			:isContainer false
			:opposite subWorks
		) ( struct-map
			KM3_Reference
			:name "subWorks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WorkDefinitions_WorkDefinition
			:type WorkDefinitions_WorkDefinition
			:location "12:3-12:65"
			:isContainer false
			:opposite parentWorks
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_WorkDefinition
			:type WorkDefinitions_ProcessPerformer
			:location "13:3-13:58"
			:isContainer false
			:opposite features
		)]
	) ) ( def WorkDefinitions_ProcessPerformer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "features"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WorkDefinitions_ProcessPerformer
			:type WorkDefinitions_WorkDefinition
			:location "17:3-17:69"
			:isContainer true
			:opposite owner
		)]
	) ) ( def WorkDefinitions_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WorkDefinitions_ProcessPerformer]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "products"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WorkDefinitions_Role
			:type WorkDefinitions_WorkProduct
			:location "21:3-21:62"
			:isContainer false
			:opposite responsible
		)]
	) ) ( def WorkDefinitions_WorkProduct ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "responsible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_WorkProduct
			:type WorkDefinitions_Role
			:location "25:3-25:52"
			:isContainer false
			:opposite products
		)]
	) ) ( def WorkDefinitions_Lifecycle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WorkDefinitions_WorkDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "phases"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Lifecycle
			:type WorkDefinitions_Phase
			:location "29:3-29:64"
			:isContainer true
			:opposite lifeCycle
		)]
	) ) ( def WorkDefinitions_Phase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WorkDefinitions_WorkDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lifeCycle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Phase
			:type WorkDefinitions_Lifecycle
			:location "33:3-33:53"
			:isContainer false
			:opposite phases
		) ( struct-map
			KM3_Reference
			:name "iterations"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Phase
			:type WorkDefinitions_Iteration
			:location "34:3-34:68"
			:isContainer true
			:opposite phase
		)]
	) ) ( def WorkDefinitions_Iteration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WorkDefinitions_WorkDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "phase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Iteration
			:type WorkDefinitions_Phase
			:location "38:3-38:49"
			:isContainer false
			:opposite iterations
		) ( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Iteration
			:type WorkDefinitions_Activity
			:location "39:3-39:71"
			:isContainer true
			:opposite iteration
		)]
	) ) ( def WorkDefinitions_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WorkDefinitions_WorkDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iteration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WorkDefinitions_Activity
			:type WorkDefinitions_Iteration
			:location "43:3-43:57"
			:isContainer false
			:opposite activities
		) ( struct-map
			KM3_Reference
			:name "steps"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WorkDefinitions_Activity
			:type WorkDefinitions_Step
			:location "44:3-44:39"
			:isContainer true
		)]
	) ) ( def WorkDefinitions_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "53:2-53:19"
	) )]
) )
