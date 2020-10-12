( declare QoSStatement_QoSStatement )
( declare QoSStatement_SingleQoSStatement )
( declare QoSStatement_CoumpoundQoSStatement )
( declare QoSStatement_Parameter )
( declare QoSStatement_QoSContraint )
( declare QoSStatement_QualificationKind )
( declare QoSStatement_QoSCharacteristic )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def QoSStatement ( struct-map
	KM3_Package
	:contents[( def QoSStatement_QoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSStatement_QoSStatement
			:type QoSStatement_CoumpoundQoSStatement
			:location "16:3-16:67"
			:isContainer false
			:opposite statement
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner QoSStatement_QoSStatement
			:type QoSStatement_Parameter
			:location "17:3-17:57"
			:isContainer true
		)]
	) ) ( def QoSStatement_SingleQoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSStatement_QoSStatement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contraint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSStatement_SingleQoSStatement
			:type QoSStatement_QoSContraint
			:location "21:3-21:48"
			:isContainer true
		)]
	) ) ( def QoSStatement_CoumpoundQoSStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSStatement_QoSStatement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statement"
			:upper -1
			:lower 2
			:isOrdered false
			:owner QoSStatement_CoumpoundQoSStatement
			:type QoSStatement_QoSStatement
			:location "25:3-25:74"
			:isContainer true
			:opposite relation
		)]
	) ) ( def QoSStatement_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def QoSStatement_QoSContraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSStatement_QoSContraint
			:type QoSStatement_QualificationKind
			:location "31:3-31:47"
			:isContainer false
		)]
	) ) ( def QoSStatement_QualificationKind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[QoSStatement_QoSCharacteristic]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner QoSStatement_QualificationKind
			:type String
			:location "35:3-35:28"
		)]
	) ) ( def QoSStatement_QoSCharacteristic ( struct-map
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
		:location "43:2-43:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "44:2-44:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "45:2-45:18"
	) )]
) )
