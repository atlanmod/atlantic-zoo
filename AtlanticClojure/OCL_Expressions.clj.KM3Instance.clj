( declare OCLExpressions_OclExpression )
( declare OCLExpressions_SelfExp )
( declare OCLExpressions_ResultExp )
( declare OCLExpressions_VariableExp )
( declare OCLExpressions_OperationExp )
( declare OCLExpressions_QueryExp )
( declare OCLExpressions_Type )
( declare OCLExpressions_VariableDeclaration )
( declare OCLExpressions_VariableInitialisation )
( declare OCLExpressions_ForAllExp )
( declare OCLExpressions_ExistsExp )
( declare OCLExpressions_SelectExp )
( declare OCLExpressions_RejectExp )
( declare OCLExpressions_CollectExp )
( declare OCLExpressions_IterateExp )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def OCLExpressions ( struct-map
	KM3_Package
	:contents[( def OCLExpressions_OclExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "queryArg"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_OclExpression
			:type OCLExpressions_QueryExp
			:location "16:3-16:57"
			:isContainer false
			:opposite argument
		) ( struct-map
			KM3_Reference
			:name "querySrc"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_OclExpression
			:type OCLExpressions_QueryExp
			:location "17:3-17:55"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "resultType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_OclExpression
			:type OCLExpressions_Type
			:location "18:3-18:66"
			:isContainer true
			:opposite oclExpression
		) ( struct-map
			KM3_Reference
			:name "varDec"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_OclExpression
			:type OCLExpressions_VariableDeclaration
			:location "19:3-19:73"
			:isContainer false
			:opposite oclExpression
		) ( struct-map
			KM3_Reference
			:name "varInit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_OclExpression
			:type OCLExpressions_VariableInitialisation
			:location "20:3-20:76"
			:isContainer false
			:opposite initExpression
		)]
	) ) ( def OCLExpressions_SelfExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpressions_OclExpression]
		:structuralFeatures[]
	) ) ( def OCLExpressions_ResultExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpressions_OclExpression]
		:structuralFeatures[]
	) ) ( def OCLExpressions_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLExpressions_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableExp
			:type String
			:location "30:3-30:26"
		)]
	) ) ( def OCLExpressions_OperationExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLExpressions_OclExpression]
		:structuralFeatures[]
	) ) ( def OCLExpressions_QueryExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCLExpressions_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "argument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_QueryExp
			:type OCLExpressions_OclExpression
			:location "37:3-37:68"
			:isContainer true
			:opposite queryArg
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_QueryExp
			:type OCLExpressions_OclExpression
			:location "38:3-38:66"
			:isContainer true
			:opposite querySrc
		) ( struct-map
			KM3_Reference
			:name "varDeclaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_QueryExp
			:type OCLExpressions_VariableDeclaration
			:location "39:3-39:86"
			:isContainer true
			:opposite queryExp
		)]
	) ) ( def OCLExpressions_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "oclExpression"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_Type
			:type OCLExpressions_OclExpression
			:location "43:3-43:69"
			:isContainer false
			:opposite resultType
		) ( struct-map
			KM3_Reference
			:name "varDec"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_Type
			:type OCLExpressions_VariableDeclaration
			:location "44:3-44:75"
			:isContainer true
			:opposite varType
		)]
	) ) ( def OCLExpressions_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableDeclaration
			:type String
			:location "48:3-48:26"
		) ( struct-map
			KM3_Reference
			:name "varType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableDeclaration
			:type OCLExpressions_Type
			:location "49:3-49:46"
			:isContainer false
			:opposite varDec
		) ( struct-map
			KM3_Reference
			:name "oclExpression"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_VariableDeclaration
			:type OCLExpressions_OclExpression
			:location "50:3-50:65"
			:isContainer false
			:opposite varDec
		) ( struct-map
			KM3_Reference
			:name "queryExp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_VariableDeclaration
			:type OCLExpressions_QueryExp
			:location "51:3-51:64"
			:isContainer false
			:opposite varDeclaration
		) ( struct-map
			KM3_Reference
			:name "varInit"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLExpressions_VariableDeclaration
			:type OCLExpressions_VariableInitialisation
			:location "52:3-52:68"
			:isContainer false
			:opposite varDec
		)]
	) ) ( def OCLExpressions_VariableInitialisation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableInitialisation
			:type OCLExpressions_OclExpression
			:location "56:3-56:73"
			:isContainer true
			:opposite varInit
		) ( struct-map
			KM3_Reference
			:name "varDec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableInitialisation
			:type OCLExpressions_VariableDeclaration
			:location "57:3-57:71"
			:isContainer true
			:opposite varInit
		) ( struct-map
			KM3_Reference
			:name "iterateExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_VariableInitialisation
			:type OCLExpressions_IterateExp
			:location "58:3-58:66"
			:isContainer true
			:opposite varInit
		)]
	) ) ( def OCLExpressions_ForAllExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpressions_ExistsExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpressions_SelectExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpressions_RejectExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpressions_CollectExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLExpressions_IterateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "varInit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLExpressions_IterateExp
			:type OCLExpressions_VariableInitialisation
			:location "72:3-72:78"
			:isContainer true
			:opposite iterateExp
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "77:2-77:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "78:2-78:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "79:2-79:18"
	) )]
) )
