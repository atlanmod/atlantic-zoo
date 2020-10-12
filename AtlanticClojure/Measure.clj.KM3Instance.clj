( declare Measure_ModelKind )
( declare Measure_RootMeasureSet )
( declare Measure_Category )
( declare Measure_Metric )
( declare Measure_ElementKind )
( declare Measure_MeasureSet )
( declare Measure_Measure )
( declare Measure_IntegerMeasure )
( declare Measure_DoubleMeasure )
( declare Measure_PercentageMeasure )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( def Measure ( struct-map
	KM3_Package
	:contents[( def ModelKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "KM3"
		:location "13:6-13:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "UML2"
		:location "14:6-14:19"
	)] ) ) ( def ElementKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "metamodel"
		:location "50:6-50:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "model"
		:location "51:6-51:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "package"
		:location "52:6-52:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "interface"
		:location "53:6-53:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "class"
		:location "54:6-54:22"
	)] ) ) ( def Measure_RootMeasureSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modelType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_RootMeasureSet
			:type ModelKind
			:location "21:6-21:38"
		) ( struct-map
			KM3_Reference
			:name "categories"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Measure_RootMeasureSet
			:type Measure_Category
			:location "22:6-22:78"
			:isContainer true
			:opposite root
		) ( struct-map
			KM3_Reference
			:name "measureSets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Measure_RootMeasureSet
			:type Measure_MeasureSet
			:location "23:6-23:79"
			:isContainer true
			:opposite root
		)]
	) ) ( def Measure_Category ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Category
			:type String
			:location "30:6-30:30"
		) ( struct-map
			KM3_Attribute
			:name "desc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Category
			:type String
			:location "31:6-31:30"
		) ( struct-map
			KM3_Reference
			:name "metrics"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Measure_Category
			:type Measure_Metric
			:location "32:6-32:77"
			:isContainer true
			:opposite category
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Category
			:type Measure_RootMeasureSet
			:location "33:6-33:60"
			:isContainer false
			:opposite categories
		)]
	) ) ( def Measure_Metric ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Metric
			:type String
			:location "40:6-40:30"
		) ( struct-map
			KM3_Attribute
			:name "desc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Metric
			:type String
			:location "41:6-41:30"
		) ( struct-map
			KM3_Attribute
			:name "preferredValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Metric
			:type String
			:location "42:6-42:40"
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Metric
			:type Measure_Category
			:location "43:6-43:55"
			:isContainer false
			:opposite metrics
		)]
	) ) ( def Measure_MeasureSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elementName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_MeasureSet
			:type String
			:location "61:6-61:37"
		) ( struct-map
			KM3_Attribute
			:name "elementType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_MeasureSet
			:type ElementKind
			:location "62:6-62:42"
		) ( struct-map
			KM3_Reference
			:name "measures"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Measure_MeasureSet
			:type Measure_Measure
			:location "63:3-63:71"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Measure_MeasureSet
			:type Measure_RootMeasureSet
			:location "64:3-64:64"
			:isContainer false
			:opposite measureSets
		) ( struct-map
			KM3_Reference
			:name "subsets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Measure_MeasureSet
			:type Measure_MeasureSet
			:location "65:3-65:76"
			:isContainer true
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Measure_MeasureSet
			:type Measure_MeasureSet
			:location "66:3-66:60"
			:isContainer false
			:opposite subsets
		)]
	) ) ( def Measure_Measure ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "metric"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Measure
			:type Measure_Metric
			:location "73:6-73:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_Measure
			:type Measure_MeasureSet
			:location "74:6-74:55"
			:isContainer false
			:opposite measures
		)]
	) ) ( def Measure_IntegerMeasure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Measure_Measure]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_IntegerMeasure
			:type Integer
			:location "81:6-81:32"
		)]
	) ) ( def Measure_DoubleMeasure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Measure_Measure]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_DoubleMeasure
			:type Double
			:location "88:6-88:31"
		)]
	) ) ( def Measure_PercentageMeasure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Measure_Measure]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Measure_PercentageMeasure
			:type Double
			:location "95:6-95:31"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "103:2-103:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "104:2-104:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "105:2-105:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "106:2-106:18"
	) )]
) )
