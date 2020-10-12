( declare OCLOperations_OperationExp )
( declare OCLOperations_PropertyOperation )
( declare OCLOperations_OclOperation )
( declare OCLOperations_ConstExp )
( declare OCLOperations_IntegerConstExp )
( declare OCLOperations_StringConstExp )
( declare OCLOperations_RealConstExp )
( declare OCLOperations_AttributeExp )
( declare OCLOperations_Attribute )
( declare OCLOperations_NaviguationExp )
( declare OCLOperations_AssocationEnd )
( declare OCLOperations_ClassifierOperation )
( declare OCLOperations_Operation )
( declare OCLOperations_OclExpression )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def OCLOperations ( struct-map
	KM3_Package
	:contents[( def OCLOperations_OperationExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def OCLOperations_PropertyOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_OperationExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isMarkedPre"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_PropertyOperation
			:type Boolean
			:location "18:3-18:35"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_PropertyOperation
			:type OCLOperations_OclExpression
			:location "19:3-19:76"
			:isContainer true
			:opposite propertyOperations
		)]
	) ) ( def OCLOperations_OclOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_OperationExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_OclOperation
			:type OCLOperations_OclExpression
			:location "23:3-23:74"
			:isContainer true
			:opposite oclOperations
		)]
	) ) ( def OCLOperations_ConstExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_OperationExp]
		:structuralFeatures[]
	) ) ( def OCLOperations_IntegerConstExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_ConstExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_IntegerConstExp
			:type Integer
			:location "29:3-29:29"
		)]
	) ) ( def OCLOperations_StringConstExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_ConstExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_StringConstExp
			:type String
			:location "33:3-33:28"
		)]
	) ) ( def OCLOperations_RealConstExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_ConstExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_RealConstExp
			:type Double
			:location "37:3-37:28"
		)]
	) ) ( def OCLOperations_AttributeExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_PropertyOperation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_AttributeExp
			:type OCLOperations_Attribute
			:location "41:3-41:59"
			:isContainer true
			:opposite attrExp
		)]
	) ) ( def OCLOperations_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attrExp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLOperations_Attribute
			:type OCLOperations_AttributeExp
			:location "45:3-45:56"
			:isContainer false
			:opposite attr
		)]
	) ) ( def OCLOperations_NaviguationExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_PropertyOperation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assEnd"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_NaviguationExp
			:type OCLOperations_AssocationEnd
			:location "49:3-49:64"
			:isContainer true
			:opposite navExp
		) ( struct-map
			KM3_Reference
			:name "qualifierValues"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_NaviguationExp
			:type OCLOperations_OclExpression
			:location "50:3-50:82"
			:isContainer true
			:opposite naviguationExps
		)]
	) ) ( def OCLOperations_AssocationEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "navExp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLOperations_AssocationEnd
			:type OCLOperations_NaviguationExp
			:location "54:3-54:59"
			:isContainer false
			:opposite assEnd
		)]
	) ) ( def OCLOperations_ClassifierOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCLOperations_PropertyOperation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_ClassifierOperation
			:type OCLOperations_Operation
			:location "58:3-58:57"
			:isContainer true
			:opposite classOp
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCLOperations_ClassifierOperation
			:type OCLOperations_OclExpression
			:location "59:3-59:81"
			:isContainer true
			:opposite classifierOperations
		)]
	) ) ( def OCLOperations_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classOp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLOperations_Operation
			:type OCLOperations_ClassifierOperation
			:location "63:3-63:61"
			:isContainer false
			:opposite op
		)]
	) ) ( def OCLOperations_OclExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "propertyOperations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLOperations_OclExpression
			:type OCLOperations_PropertyOperation
			:location "67:3-67:74"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "naviguationExps"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCLOperations_OclExpression
			:type OCLOperations_NaviguationExp
			:location "68:3-68:77"
			:isContainer false
			:opposite qualifierValues
		) ( struct-map
			KM3_Reference
			:name "classifierOperations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCLOperations_OclExpression
			:type OCLOperations_ClassifierOperation
			:location "69:3-69:89"
			:isContainer false
			:opposite arguments
		) ( struct-map
			KM3_Reference
			:name "oclOperations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCLOperations_OclExpression
			:type OCLOperations_OclOperation
			:location "70:3-70:75"
			:isContainer false
			:opposite arguments
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "75:2-75:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "76:2-76:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "77:2-77:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "78:2-78:18"
	) )]
) )
