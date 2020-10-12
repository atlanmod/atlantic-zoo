( declare QoSCharacteristic_QoSCharacteristic )
( declare QoSCharacteristic_BooleanExpression )
( declare QoSCharacteristic_MappingExpression )
( declare QoSCharacteristic_StatisticalAttributekindKind )
( declare QoSCharacteristic_Parameter )
( declare QoSCharacteristic_DataType )
( declare QoSCharacteristic_Domain )
( declare QoSCharacteristic_DirectionKind )
( declare QoSCharacteristic_Numeric )
( declare QoSCharacteristic_Set )
( declare QoSCharacteristic_Enumeration )
( declare QoSCharacteristic_StringSet )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def QoSCharacteristic ( struct-map
	KM3_Package
	:contents[( def QoSCharacteristic_QoSCharacteristic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "invariant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_BooleanExpression
			:location "16:3-16:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parallel_and_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_MappingExpression
			:location "17:3-17:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parallel_or_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_MappingExpression
			:location "18:3-18:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sequential_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_MappingExpression
			:location "19:3-19:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_MappingExpression
			:location "20:3-20:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "statisticalAttribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_StatisticalAttributekindKind
			:location "21:3-21:79"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_Parameter
			:location "22:3-22:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_QoSCharacteristic
			:type QoSCharacteristic_Domain
			:location "23:3-23:29"
			:isContainer false
		)]
	) ) ( def QoSCharacteristic_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_BooleanExpression
			:type String
			:location "27:3-27:28"
		)]
	) ) ( def QoSCharacteristic_MappingExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_MappingExpression
			:type String
			:location "31:3-31:28"
		)]
	) ) ( def QoSCharacteristic_StatisticalAttributekindKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSCharacteristic_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSCharacteristic_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSCharacteristic_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSCharacteristic_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_Domain
			:type QoSCharacteristic_DirectionKind
			:location "42:3-42:39"
			:isContainer false
		)]
	) ) ( def QoSCharacteristic_DirectionKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_DirectionKind
			:type String
			:location "46:3-46:28"
		)]
	) ) ( def QoSCharacteristic_Numeric ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSCharacteristic_Domain]
		:structuralFeatures[]
	) ) ( def QoSCharacteristic_Set ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSCharacteristic_Domain]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stringSet"
			:upper -1
			:lower 1
			:isOrdered true
			:owner QoSCharacteristic_Set
			:type QoSCharacteristic_StringSet
			:location "52:3-52:59"
			:isContainer true
		)]
	) ) ( def QoSCharacteristic_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSCharacteristic_Domain]
		:structuralFeatures[]
	) ) ( def QoSCharacteristic_StringSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "string"
			:upper -1
			:lower 1
			:isOrdered false
			:owner QoSCharacteristic_StringSet
			:type String
			:location "58:3-58:35"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "63:2-63:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "64:2-64:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "65:2-65:18"
	) )]
) )
