( declare SimplifiedMiningMart_ModelElement )
( declare SimplifiedMiningMart_Classifier )
( declare SimplifiedMiningMart_StructuralFeature )
( declare SimplifiedMiningMart_Class )
( declare SimplifiedMiningMart_DataType )
( declare SimplifiedMiningMart_Attribute )
( declare SimplifiedMiningMart_Concept )
( declare SimplifiedMiningMart_ColumnSet )
( declare SimplifiedMiningMart_Column )
( declare SimplifiedMiningMart_FeatureAttribute )
( declare SimplifiedMiningMart_Value )
( declare SimplifiedMiningMart_RoleRestriction )
( declare SimplifiedMiningMart_Integer )
( declare SimplifiedMiningMart_String )
( declare SimplifiedMiningMart_DomainDataType )
( def SimplifiedMiningMart ( struct-map
	KM3_Package
	:contents[( def SimplifiedMiningMart_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_ModelElement]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_ModelElement]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplifiedMiningMart_Class
			:type SimplifiedMiningMart_String
			:location "22:3-22:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SimplifiedMiningMart_Class
			:type SimplifiedMiningMart_Attribute
			:location "23:3-23:70"
			:isContainer true
			:opposite class
		)]
	) ) ( def SimplifiedMiningMart_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplifiedMiningMart_DataType
			:type SimplifiedMiningMart_Attribute
			:location "27:3-27:52"
			:isContainer false
			:opposite has
		)]
	) ) ( def SimplifiedMiningMart_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplifiedMiningMart_Attribute
			:type SimplifiedMiningMart_Class
			:location "31:3-31:51"
			:isContainer false
			:opposite attributes
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplifiedMiningMart_Attribute
			:type SimplifiedMiningMart_DataType
			:location "32:3-32:51"
			:isContainer false
			:opposite attribute
		)]
	) ) ( def SimplifiedMiningMart_Concept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Class]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_ColumnSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Class]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Attribute]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_FeatureAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Attribute]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Attribute]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_RoleRestriction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_Attribute]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_Integer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_DataType]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_String ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_DataType]
		:structuralFeatures[]
	) ) ( def SimplifiedMiningMart_DomainDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplifiedMiningMart_DataType]
		:structuralFeatures[]
	) )]
) )
