( declare SimpleRDBMS_Table )
( declare SimpleRDBMS_Column )
( declare SimpleRDBMS_FKey )
( declare PrimitiveTypes_String )
( def SimpleRDBMS ( struct-map
	KM3_Package
	:contents[( def SimpleRDBMS_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type String
			:location "10:3-10:27"
		) ( struct-map
			KM3_Reference
			:name "fkeys"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_FKey
			:location "11:3-11:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pkey"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_Column
			:location "12:3-12:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cols"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_Table
			:type SimpleRDBMS_Column
			:location "13:3-13:40"
			:isContainer true
		)]
	) ) ( def SimpleRDBMS_Column ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_Column
			:type String
			:location "18:3-18:27"
		)]
	) ) ( def SimpleRDBMS_FKey ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "references"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleRDBMS_FKey
			:type SimpleRDBMS_Table
			:location "22:3-22:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cols"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleRDBMS_FKey
			:type SimpleRDBMS_Column
			:location "23:3-23:30"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "28:2-28:18"
	) )]
) )
