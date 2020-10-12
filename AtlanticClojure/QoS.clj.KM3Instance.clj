( declare QoSConceptualModel_QoSComponent )
( declare QoSConceptualModel_QoSProfile )
( declare QoSConceptualModel_QoSContraints )
( declare QoSConceptualModel_Operation )
( declare QoSConceptualModel_CompoundProfile )
( declare QoSConceptualModel_SimpleProfile )
( declare QoSConceptualModel_ProfileTransition )
( declare QoSConceptualModel_QoSStatement )
( declare QoSConceptualModel_SingleQoSStatement )
( declare QoSConceptualModel_CoumpoundQoSStatement )
( declare QoSConceptualModel_QoSContraint )
( declare QoSConceptualModel_QualificationKind )
( declare QoSConceptualModel_QoSCharacteristic )
( declare QoSConceptualModel_BooleanExpression )
( declare QoSConceptualModel_MappingExpression )
( declare QoSConceptualModel_StatisticalAttributekindKind )
( declare QoSConceptualModel_Parameter )
( declare QoSConceptualModel_DataType )
( declare QoSConceptualModel_Domain )
( declare QoSConceptualModel_DirectionKind )
( declare QoSConceptualModel_Numeric )
( declare QoSConceptualModel_Set )
( declare QoSConceptualModel_Enumeration )
( declare QoSConceptualModel_StringSet )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def QoSConceptualModel ( struct-map
	KM3_Package
	:contents[( def QoSConceptualModel_QoSComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "profile"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSConceptualModel_QoSComponent
			:type QoSConceptualModel_QoSProfile
			:location "20:3-20:53"
			:isContainer false
			:opposite for
		) ( struct-map
			KM3_Reference
			:name "operations"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSComponent
			:type QoSConceptualModel_Operation
			:location "21:3-21:46"
			:isContainer true
		)]
	) ) ( def QoSConceptualModel_QoSProfile ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSProfile
			:type QoSConceptualModel_QoSComponent
			:location "25:3-25:52"
			:isContainer false
			:opposite profile
		) ( struct-map
			KM3_Reference
			:name "provide"
			:upper -1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSProfile
			:type QoSConceptualModel_QoSStatement
			:location "26:3-26:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSProfile
			:type QoSConceptualModel_QoSStatement
			:location "27:3-27:40"
			:isContainer false
		)]
	) ) ( def QoSConceptualModel_QoSContraints ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSCharacteristic]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_CompoundProfile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSProfile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "profileTransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSConceptualModel_CompoundProfile
			:type QoSConceptualModel_ProfileTransition
			:location "35:3-35:82"
			:isContainer false
			:opposite compoundProfile
		) ( struct-map
			KM3_Reference
			:name "simpleProfile"
			:upper -1
			:lower 1
			:isOrdered true
			:owner QoSConceptualModel_CompoundProfile
			:type QoSConceptualModel_SimpleProfile
			:location "36:3-36:94"
			:isContainer true
			:opposite compoundProfile
		)]
	) ) ( def QoSConceptualModel_SimpleProfile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSProfile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoundProfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_SimpleProfile
			:type QoSConceptualModel_CompoundProfile
			:location "40:3-40:72"
			:isContainer false
			:opposite simpleProfile
		) ( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_SimpleProfile
			:type QoSConceptualModel_QoSStatement
			:location "41:3-41:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "provides"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_SimpleProfile
			:type QoSConceptualModel_QoSStatement
			:location "42:3-42:37"
			:isContainer false
		)]
	) ) ( def QoSConceptualModel_ProfileTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner QoSConceptualModel_ProfileTransition
			:type QoSConceptualModel_Operation
			:location "46:3-46:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_ProfileTransition
			:type QoSConceptualModel_SimpleProfile
			:location "47:3-47:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_ProfileTransition
			:type QoSConceptualModel_SimpleProfile
			:location "48:3-48:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "compoundProfile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_ProfileTransition
			:type QoSConceptualModel_CompoundProfile
			:location "49:3-49:86"
			:isContainer true
			:opposite profileTransition
		)]
	) ) ( def QoSConceptualModel_QoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contraints"
			:upper -1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSStatement
			:type QoSConceptualModel_QoSContraints
			:location "53:3-53:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSStatement
			:type QoSConceptualModel_CoumpoundQoSStatement
			:location "54:3-54:67"
			:isContainer false
			:opposite statement
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner QoSConceptualModel_QoSStatement
			:type QoSConceptualModel_Parameter
			:location "55:3-55:57"
			:isContainer true
		)]
	) ) ( def QoSConceptualModel_SingleQoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSStatement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contraint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_SingleQoSStatement
			:type QoSConceptualModel_QoSContraint
			:location "59:3-59:48"
			:isContainer true
		)]
	) ) ( def QoSConceptualModel_CoumpoundQoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSStatement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statement"
			:upper -1
			:lower 2
			:isOrdered false
			:owner QoSConceptualModel_CoumpoundQoSStatement
			:type QoSConceptualModel_QoSStatement
			:location "63:3-63:74"
			:isContainer true
			:opposite relation
		)]
	) ) ( def QoSConceptualModel_QoSContraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSContraint
			:type QoSConceptualModel_QualificationKind
			:location "67:3-67:47"
			:isContainer false
		)]
	) ) ( def QoSConceptualModel_QualificationKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_QoSCharacteristic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QualificationKind
			:type String
			:location "71:3-71:28"
		)]
	) ) ( def QoSConceptualModel_QoSCharacteristic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "invariant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_BooleanExpression
			:location "75:3-75:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parallel_and_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_MappingExpression
			:location "76:3-76:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parallel_or_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_MappingExpression
			:location "77:3-77:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sequential_composition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_MappingExpression
			:location "78:3-78:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_MappingExpression
			:location "79:3-79:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "statisticalAttribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_StatisticalAttributekindKind
			:location "80:3-80:79"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_Parameter
			:location "81:3-81:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_QoSCharacteristic
			:type QoSConceptualModel_Domain
			:location "82:3-82:29"
			:isContainer false
		)]
	) ) ( def QoSConceptualModel_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_BooleanExpression
			:type String
			:location "86:3-86:28"
		)]
	) ) ( def QoSConceptualModel_MappingExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_MappingExpression
			:type String
			:location "90:3-90:28"
		)]
	) ) ( def QoSConceptualModel_StatisticalAttributekindKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_Domain
			:type QoSConceptualModel_DirectionKind
			:location "101:3-101:39"
			:isContainer false
		)]
	) ) ( def QoSConceptualModel_DirectionKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_DirectionKind
			:type String
			:location "105:3-105:28"
		)]
	) ) ( def QoSConceptualModel_Numeric ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_Domain]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_Set ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_Domain]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stringSet"
			:upper -1
			:lower 1
			:isOrdered true
			:owner QoSConceptualModel_Set
			:type QoSConceptualModel_StringSet
			:location "111:3-111:59"
			:isContainer true
		)]
	) ) ( def QoSConceptualModel_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSConceptualModel_Domain]
		:structuralFeatures[]
	) ) ( def QoSConceptualModel_StringSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "string"
			:upper -1
			:lower 1
			:isOrdered false
			:owner QoSConceptualModel_StringSet
			:type String
			:location "117:3-117:35"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "122:2-122:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "123:2-123:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "124:2-124:18"
	) )]
) )
