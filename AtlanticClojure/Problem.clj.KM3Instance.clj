( declare Diagnostic_Severity )
( declare Diagnostic_Problem )
( declare PrimitiveTypes_String )
( def Diagnostic ( struct-map
	KM3_Package
	:contents[( def Severity ( :literals[( struct-map
		KM3_EnumLiteral
		:name "error"
		:location "12:3-12:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "warning"
		:location "13:3-13:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "critic"
		:location "14:3-14:18"
	)] ) ) ( def Diagnostic_Problem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "severity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagnostic_Problem
			:type Severity
			:location "18:3-18:32"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagnostic_Problem
			:type String
			:location "19:3-19:30"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagnostic_Problem
			:type String
			:location "20:3-20:33"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "25:2-25:18"
	) )]
) )
