( declare SEEDesign_LogFile )
( declare SEEDesign_Logger )
( declare SEEDesign_Expression )
( declare SEEDesign_Literal )
( declare SEEDesign_VariableExpression )
( declare SEEDesign_NumberExpression )
( declare SEEDesign_UnaryOperator )
( declare SEEDesign_UnaryPlusOp )
( declare SEEDesign_UnaryMinusOp )
( declare SEEDesign_BinaryOperator )
( declare SEEDesign_PlusOperator )
( declare SEEDesign_MinusOperator )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SEEDesign ( struct-map
	KM3_Package
	:contents[( def SEEDesign_LogFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_LogFile
			:type String
			:location "16:3-16:27"
		) ( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_LogFile
			:type SEEDesign_LogFile
			:location "17:3-17:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "logger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_LogFile
			:type SEEDesign_Logger
			:location "18:3-18:48"
			:isContainer false
			:opposite logFile
		)]
	) ) ( def SEEDesign_Logger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Logger
			:type SEEDesign_Logger
			:location "22:3-22:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Logger
			:type SEEDesign_Expression
			:location "23:3-23:55"
			:isContainer false
			:opposite logger
		) ( struct-map
			KM3_Reference
			:name "logFile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Logger
			:type SEEDesign_LogFile
			:location "24:3-24:49"
			:isContainer false
			:opposite logger
		)]
	) ) ( def SEEDesign_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "loggingOn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Expression
			:type Boolean
			:location "28:3-28:33"
		) ( struct-map
			KM3_Reference
			:name "logger"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Expression
			:type SEEDesign_Logger
			:location "29:3-29:51"
			:isContainer false
			:opposite expression
		)]
	) ) ( def SEEDesign_Literal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_Literal
			:type Integer
			:location "33:3-33:29"
		)]
	) ) ( def SEEDesign_VariableExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_Literal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_VariableExpression
			:type String
			:location "37:3-37:27"
		)]
	) ) ( def SEEDesign_NumberExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_Literal]
		:structuralFeatures[]
	) ) ( def SEEDesign_UnaryOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_UnaryOperator
			:type SEEDesign_Expression
			:location "43:3-43:44"
			:isContainer true
		)]
	) ) ( def SEEDesign_UnaryPlusOp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_UnaryOperator]
		:structuralFeatures[]
	) ) ( def SEEDesign_UnaryMinusOp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_UnaryOperator]
		:structuralFeatures[]
	) ) ( def SEEDesign_BinaryOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operand1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_BinaryOperator
			:type SEEDesign_Expression
			:location "51:3-51:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "operand2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SEEDesign_BinaryOperator
			:type SEEDesign_Expression
			:location "52:3-52:45"
			:isContainer true
		)]
	) ) ( def SEEDesign_PlusOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_BinaryOperator]
		:structuralFeatures[]
	) ) ( def SEEDesign_MinusOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SEEDesign_BinaryOperator]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "61:2-61:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "62:2-62:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "63:2-63:18"
	) )]
) )
