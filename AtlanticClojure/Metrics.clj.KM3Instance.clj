( declare Metrics_Metric )
( declare Metrics_MetricValue )
( declare Metrics_StringMetricValue )
( declare Metrics_BooleanMetricValue )
( declare Metrics_IntegerMetricValue )
( declare Metrics_DoubleMetricValue )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def Metrics ( struct-map
	KM3_Package
	:contents[( def Metrics_Metric ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_Metric
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Metrics_Metric
			:type Metrics_MetricValue
			:location "13:3-13:55"
			:isContainer true
		)]
	) ) ( def Metrics_MetricValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_MetricValue
			:type String
			:location "17:3-17:26"
		)]
	) ) ( def Metrics_StringMetricValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Metrics_MetricValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_StringMetricValue
			:type String
			:location "21:3-21:28"
		)]
	) ) ( def Metrics_BooleanMetricValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Metrics_MetricValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_BooleanMetricValue
			:type Boolean
			:location "25:3-25:29"
		)]
	) ) ( def Metrics_IntegerMetricValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Metrics_MetricValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_IntegerMetricValue
			:type Integer
			:location "29:3-29:29"
		)]
	) ) ( def Metrics_DoubleMetricValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Metrics_MetricValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Metrics_DoubleMetricValue
			:type Double
			:location "33:3-33:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "39:2-39:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "40:2-40:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "41:2-41:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "42:2-42:18"
	) )]
) )
