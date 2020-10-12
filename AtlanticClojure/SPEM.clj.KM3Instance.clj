( declare SPEM_ArtifactUsageName )
( declare SPEM_ProcessDefinitionElement )
( declare SPEM_Guidance )
( declare SPEM_ArtifactKind )
( declare SPEM_WorkItem )
( declare SPEM_RoleKind )
( declare SPEM_Condition )
( declare SPEM_ProcessComponent )
( declare SPEM_Goal )
( declare SPEM_Precondition )
( declare SPEM_WorkDefinition )
( declare SPEM_ActivityKind )
( declare SPEM_Iteration )
( declare SPEM_Phase )
( declare SPEM_Lifecycle )
( declare PrimitiveTypes_Boolean )
( def SPEM ( struct-map
	KM3_Package
	:contents[( def SPEM_ArtifactUsageName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_ArtifactUsageName
			:type Boolean
			:location "12:3-12:31"
		) ( struct-map
			KM3_Attribute
			:name "isOutput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_ArtifactUsageName
			:type Boolean
			:location "13:3-13:32"
		) ( struct-map
			KM3_Attribute
			:name "hasWorkPerArtifact"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_ArtifactUsageName
			:type Boolean
			:location "14:3-14:42"
		) ( struct-map
			KM3_Reference
			:name "artifactKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_ArtifactUsageName
			:type SPEM_ArtifactKind
			:location "15:3-15:71"
			:isContainer false
			:opposite artifactUsageNames
		) ( struct-map
			KM3_Reference
			:name "workDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_ArtifactUsageName
			:type SPEM_WorkDefinition
			:location "16:3-16:75"
			:isContainer false
			:opposite artifactUsageNames
		)]
	) ) ( def SPEM_ProcessDefinitionElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guidances"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_ProcessDefinitionElement
			:type SPEM_Guidance
			:location "20:3-20:74"
			:isContainer false
			:opposite processDefinitionElements
		) ( struct-map
			KM3_Reference
			:name "processComponents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_ProcessDefinitionElement
			:type SPEM_ProcessComponent
			:location "21:3-21:90"
			:isContainer false
			:opposite processDefinitionElements
		)]
	) ) ( def SPEM_Guidance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinitionElements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SPEM_Guidance
			:type SPEM_ProcessDefinitionElement
			:location "25:3-25:92"
			:isContainer false
			:opposite guidances
		)]
	) ) ( def SPEM_ArtifactKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "artifactUsageNames"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_ArtifactKind
			:type SPEM_ArtifactUsageName
			:location "29:3-29:79"
			:isContainer false
			:opposite artifactKind
		) ( struct-map
			KM3_Reference
			:name "responsible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPEM_ArtifactKind
			:type SPEM_RoleKind
			:location "30:3-30:66"
			:isContainer false
			:opposite artifactKinds
		)]
	) ) ( def SPEM_WorkItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[]
	) ) ( def SPEM_RoleKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "artifactKinds"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_RoleKind
			:type SPEM_ArtifactKind
			:location "36:3-36:68"
			:isContainer false
			:opposite responsible
		)]
	) ) ( def SPEM_Condition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[]
	) ) ( def SPEM_ProcessComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_ProcessDefinitionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDefinitionElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_ProcessComponent
			:type SPEM_ProcessDefinitionElement
			:location "42:3-42:98"
			:isContainer false
			:opposite processComponents
		)]
	) ) ( def SPEM_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "workDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_Goal
			:type SPEM_WorkDefinition
			:location "46:3-46:61"
			:isContainer false
			:opposite goal
		)]
	) ) ( def SPEM_Precondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "workDefinition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SPEM_Precondition
			:type SPEM_WorkDefinition
			:location "50:3-50:69"
			:isContainer false
			:opposite precondition
		)]
	) ) ( def SPEM_WorkDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_WorkItem]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "artifactUsageNames"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_WorkDefinition
			:type SPEM_ArtifactUsageName
			:location "54:3-54:91"
			:isContainer true
			:opposite workDefinition
		) ( struct-map
			KM3_Reference
			:name "goal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPEM_WorkDefinition
			:type SPEM_Goal
			:location "55:3-55:66"
			:isContainer true
			:opposite workDefinition
		) ( struct-map
			KM3_Reference
			:name "precondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SPEM_WorkDefinition
			:type SPEM_Precondition
			:location "56:3-56:82"
			:isContainer true
			:opposite workDefinition
		)]
	) ) ( def SPEM_ActivityKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_WorkDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "performer"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SPEM_ActivityKind
			:type SPEM_RoleKind
			:location "60:3-60:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assistant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SPEM_ActivityKind
			:type SPEM_RoleKind
			:location "61:3-61:37"
			:isContainer false
		)]
	) ) ( def SPEM_Iteration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_WorkDefinition]
		:structuralFeatures[]
	) ) ( def SPEM_Phase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_WorkDefinition]
		:structuralFeatures[]
	) ) ( def SPEM_Lifecycle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SPEM_WorkDefinition]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "73:2-73:19"
	) )]
) )
