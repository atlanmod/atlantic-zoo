( declare IntegratingTroposActorConcept_Actor )
( declare IntegratingTroposActorConcept_Agent )
( declare IntegratingTroposActorConcept_Position )
( declare IntegratingTroposActorConcept_Role )
( def IntegratingTroposActorConcept ( struct-map
	KM3_Package
	:contents[( def IntegratingTroposActorConcept_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def IntegratingTroposActorConcept_Agent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IntegratingTroposActorConcept_Actor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "occupy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IntegratingTroposActorConcept_Agent
			:type IntegratingTroposActorConcept_Position
			:location "16:3-16:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "play"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IntegratingTroposActorConcept_Agent
			:type IntegratingTroposActorConcept_Role
			:location "17:3-17:28"
			:isContainer false
		)]
	) ) ( def IntegratingTroposActorConcept_Position ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IntegratingTroposActorConcept_Actor]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cover"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IntegratingTroposActorConcept_Position
			:type IntegratingTroposActorConcept_Role
			:location "21:3-21:39"
			:isContainer true
		)]
	) ) ( def IntegratingTroposActorConcept_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IntegratingTroposActorConcept_Actor]
		:structuralFeatures[]
	) )]
) )
