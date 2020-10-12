( declare Parameters_ParametersList )
( declare Parameters_Parameter )
( declare PrimitiveTypes_String )
( def Parameters ( struct-map
	KM3_Package
	:contents[( def Parameters_ParametersList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Parameters_ParametersList
			:type Parameters_Parameter
			:location "12:3-12:39"
			:isContainer false
		)]
	) ) ( def Parameters_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Parameters_Parameter
			:type String
			:location "16:3-16:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Parameters_Parameter
			:type String
			:location "17:3-17:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "23:2-23:18"
	) )]
) )
