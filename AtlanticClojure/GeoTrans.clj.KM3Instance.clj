( declare GeoTrans_GeoTransfos )
( declare GeoTrans_GeoTransfo )
( declare GeoTrans_Param )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def GeoTrans ( struct-map
	KM3_Package
	:contents[( def GeoTrans_GeoTransfos ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_GeoTransfos
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Reference
			:name "transfos"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GeoTrans_GeoTransfos
			:type GeoTrans_GeoTransfo
			:location "13:3-13:56"
			:isContainer true
		)]
	) ) ( def GeoTrans_GeoTransfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_GeoTransfo
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "freeze"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_GeoTransfo
			:type Boolean
			:location "18:3-18:30"
		) ( struct-map
			KM3_Reference
			:name "subGeoTransfos"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GeoTrans_GeoTransfo
			:type GeoTrans_GeoTransfo
			:location "19:3-19:89"
			:isContainer true
			:opposite superGeoTransfo
		) ( struct-map
			KM3_Reference
			:name "superGeoTransfo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_GeoTransfo
			:type GeoTrans_GeoTransfo
			:location "20:3-20:68"
			:isContainer false
			:opposite subGeoTransfos
		) ( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GeoTrans_GeoTransfo
			:type GeoTrans_Param
			:location "21:3-21:71"
			:isContainer true
			:opposite geoTransfo
		)]
	) ) ( def GeoTrans_Param ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_Param
			:type String
			:location "25:3-25:27"
		) ( struct-map
			KM3_Attribute
			:name "param"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_Param
			:type Double
			:location "26:3-26:28"
		) ( struct-map
			KM3_Reference
			:name "geoTransfo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GeoTrans_Param
			:type GeoTrans_GeoTransfo
			:location "27:3-27:55"
			:isContainer false
			:opposite params
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "32:2-32:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "33:2-33:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "34:2-34:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "35:2-35:18"
	) )]
) )
