( declare EAI_FCMSource )
( declare EAI_EAISource )
( declare EAI_FCMSink )
( declare EAI_EAISink )
( declare EAI_EAIResource )
( declare EAI_EAIQueue )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def EAI ( struct-map
	KM3_Package
	:contents[( def EAI_FCMSource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def EAI_EAISource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EAI_FCMSource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resources"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EAI_EAISource
			:type EAI_EAIResource
			:location "15:3-15:40"
			:isContainer false
		)]
	) ) ( def EAI_FCMSink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def EAI_EAISink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EAI_FCMSink]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resources"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EAI_EAISink
			:type EAI_EAIResource
			:location "21:3-21:40"
			:isContainer false
		)]
	) ) ( def EAI_EAIResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def EAI_EAIQueue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EAI_EAIResource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxLength"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EAI_EAIQueue
			:type Integer
			:location "27:3-27:33"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EAI_EAIQueue
			:type String
			:location "28:3-28:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "35:2-35:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "36:2-36:18"
	) )]
) )
