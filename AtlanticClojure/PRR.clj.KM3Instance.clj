( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PRR_Element )
( declare PRR_NamedElement )
( declare PRR_RuleSet )
( declare PRR_Rule )
( declare PRR_RuleAction )
( declare PRR_RuleCondition )
( declare PRR_Binding )
( declare PRR_RuleVariable )
( declare PRRActions_DeleteAction )
( declare PRRActions_CreateAction )
( declare PRRActions_AssignAction )
( declare PRRActions_InvokeAction )
( declare PRRExpressions_PropertyCallExp )
( declare PRRExpressions_OclExpression )
( declare PRRExpressions_IteratorExp )
( declare PRRExpressions_LoopExp )
( declare PRRExpressions_OperatorCallExp )
( declare PRRExpressions_OperationCallExp )
( declare PRRExpressions_CollectionOperationCallExp )
( declare PRRExpressions_StringExp )
( declare PRRExpressions_BooleanExp )
( declare PRRExpressions_NumericExp )
( declare PRRExpressions_IntegerExp )
( declare PRRExpressions_RealExp )
( declare PRRExpressions_PrimitiveExp )
( declare PRRExpressions_NavigationOrAttributeCallExp )
( declare PRRExpressions_Iterator )
( declare PRRExpressions_VariableDeclaration )
( declare PRRExpressions_VariableExp )
( declare PRRExpressions_TypeExp )
( declare PRRExpressions_AllInstanceExp )
( declare PRRTypes_OclType )
( declare PRRTypes_StringType )
( declare PRRTypes_Primitive )
( declare PRRTypes_RealType )
( declare PRRTypes_BooleanType )
( declare PRRTypes_NumericType )
( declare PRRTypes_IntegerType )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "10:2-10:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "11:2-11:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "12:2-12:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "13:2-13:19"
	) )]
) )
( def PRR ( struct-map
	KM3_Package
	:contents[( def PRR_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PRR_Element
			:type String
			:location "19:3-19:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PRR_Element
			:type String
			:location "20:3-20:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PRR_Element
			:type String
			:location "21:3-21:47"
		)]
	) ) ( def PRR_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PRR_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PRR_NamedElement
			:type String
			:location "25:3-25:27"
		)]
	) ) ( def PRR_RuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PRR_RuleSet
			:type PRR_Rule
			:location "29:3-29:69"
			:isContainer true
			:opposite ruleOwner
		)]
	) ) ( def PRR_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRR_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_Rule
			:type PRR_Binding
			:location "33:3-33:71"
			:isContainer true
			:opposite bindingOwner
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_Rule
			:type PRR_RuleCondition
			:location "34:3-34:85"
			:isContainer true
			:opposite ruleConditionOwner
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PRR_Rule
			:type PRR_RuleAction
			:location "35:3-35:79"
			:isContainer true
			:opposite actionOwner
		) ( struct-map
			KM3_Reference
			:name "ruleOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_Rule
			:type PRR_RuleSet
			:location "36:3-36:56"
			:isContainer false
			:opposite rules
		)]
	) ) ( def PRR_RuleAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actionOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_RuleAction
			:type PRR_Rule
			:location "40:3-40:57"
			:isContainer false
			:opposite actions
		)]
	) ) ( def PRR_RuleCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruleConditionOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_RuleCondition
			:type PRR_Rule
			:location "44:3-44:66"
			:isContainer false
			:opposite condition
		) ( struct-map
			KM3_Reference
			:name "conditionExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_RuleCondition
			:type PRRExpressions_OclExpression
			:location "45:3-45:84"
			:isContainer true
			:opposite conditionOwner
		)]
	) ) ( def PRR_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRR_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bindingOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PRR_Binding
			:type PRR_Rule
			:location "49:3-49:52"
			:isContainer false
			:opposite binding
		) ( struct-map
			KM3_Reference
			:name "ruleVariable"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PRR_Binding
			:type PRR_RuleVariable
			:location "50:3-50:84"
			:isContainer true
			:opposite ruleVariableOwner
		)]
	) ) ( def PRR_RuleVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PRRExpressions_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruleVariableOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PRR_RuleVariable
			:type PRR_Binding
			:location "54:3-54:65"
			:isContainer false
			:opposite ruleVariable
		) ( struct-map
			KM3_Reference
			:name "filter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PRR_RuleVariable
			:type PRRExpressions_OclExpression
			:location "55:3-55:86"
			:isContainer true
			:opposite filterRuleVariableOwner
		)]
	) ) ( def PRRActions ( struct-map
		KM3_Package
		:contents[( def PRRActions_DeleteAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_RuleAction]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "objValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRActions_DeleteAction
				:type PRRExpressions_OclExpression
				:location "61:3-61:48"
				:isContainer true
			)]
		) ) ( def PRRActions_CreateAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_RuleAction PRRExpressions_VariableDeclaration]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "insertArguments"
				:upper -1
				:lower 0
				:isOrdered true
				:owner PRRActions_CreateAction
				:type PRRExpressions_OclExpression
				:location "65:3-65:91"
				:isContainer true
				:opposite parentInsert
			)]
		) ) ( def PRRActions_AssignAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_RuleAction]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "objValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRActions_AssignAction
				:type PRRExpressions_OclExpression
				:location "69:3-69:71"
				:isContainer true
				:opposite assignedObj
			) ( struct-map
				KM3_Reference
				:name "aValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRActions_AssignAction
				:type PRRExpressions_OclExpression
				:location "70:3-70:46"
				:isContainer true
			)]
		) ) ( def PRRActions_InvokeAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_RuleAction]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "invocation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRActions_InvokeAction
				:type PRRExpressions_OclExpression
				:location "74:3-74:50"
				:isContainer true
			)]
		) )]
	) ) ( def PRRExpressions ( struct-map
		KM3_Package
		:contents[( def PRRExpressions_PropertyCallExp ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRRExpressions_OclExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "source"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_PropertyCallExp
				:type PRRExpressions_OclExpression
				:location "82:3-82:79"
				:isContainer true
				:opposite appliedProperty
			)]
		) ) ( def PRRExpressions_OclExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRR_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "loopExp"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRExpressions_LoopExp
				:location "87:3-87:52"
				:isContainer false
				:opposite body
			) ( struct-map
				KM3_Reference
				:name "appliedProperty"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRExpressions_PropertyCallExp
				:location "88:3-88:70"
				:isContainer false
				:opposite source
			) ( struct-map
				KM3_Reference
				:name "parentOperation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRExpressions_OperationCallExp
				:location "89:3-89:74"
				:isContainer false
				:opposite arguments
			) ( struct-map
				KM3_Reference
				:name "parentInsert"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRActions_CreateAction
				:location "90:3-90:74"
				:isContainer false
				:opposite insertArguments
			) ( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRTypes_OclType
				:location "91:3-91:63"
				:isContainer true
				:opposite oclExpression
			) ( struct-map
				KM3_Reference
				:name "filterRuleVariableOwner"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRR_RuleVariable
				:location "92:3-92:75"
				:isContainer false
				:opposite filter
			) ( struct-map
				KM3_Reference
				:name "conditionOwner"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRR_RuleCondition
				:location "93:3-93:74"
				:isContainer false
				:opposite conditionExp
			) ( struct-map
				KM3_Reference
				:name "assignedObj"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OclExpression
				:type PRRActions_AssignAction
				:location "94:3-94:66"
				:isContainer false
				:opposite objValue
			)]
		) ) ( def PRRExpressions_IteratorExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_LoopExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_IteratorExp
				:type String
				:location "99:3-99:27"
			)]
		) ) ( def PRRExpressions_LoopExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_PropertyCallExp]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_LoopExp
				:type PRRExpressions_OclExpression
				:location "104:3-104:63"
				:isContainer true
				:opposite loopExp
			) ( struct-map
				KM3_Reference
				:name "iterators"
				:upper -1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_LoopExp
				:type PRRExpressions_Iterator
				:location "105:3-105:69"
				:isContainer true
				:opposite loopExpr
			)]
		) ) ( def PRRExpressions_OperatorCallExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_OperationCallExp]
			:structuralFeatures[]
		) ) ( def PRRExpressions_OperationCallExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_PropertyCallExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "operationName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_OperationCallExp
				:type String
				:location "115:3-115:36"
			) ( struct-map
				KM3_Attribute
				:name "signature"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_OperationCallExp
				:type String
				:location "116:3-116:37"
			) ( struct-map
				KM3_Reference
				:name "arguments"
				:upper -1
				:lower 0
				:isOrdered true
				:owner PRRExpressions_OperationCallExp
				:type PRRExpressions_OclExpression
				:location "114:3-114:87"
				:isContainer true
				:opposite parentOperation
			)]
		) ) ( def PRRExpressions_CollectionOperationCallExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_OperationCallExp]
			:structuralFeatures[]
		) ) ( def PRRExpressions_StringExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_PrimitiveExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "stringSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_StringExp
				:type String
				:location "125:3-125:35"
			)]
		) ) ( def PRRExpressions_BooleanExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_PrimitiveExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "booleanSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_BooleanExp
				:type Boolean
				:location "130:3-130:37"
			)]
		) ) ( def PRRExpressions_NumericExp ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRRExpressions_PrimitiveExp]
			:structuralFeatures[]
		) ) ( def PRRExpressions_IntegerExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_NumericExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "integerSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_IntegerExp
				:type Integer
				:location "139:3-139:37"
			)]
		) ) ( def PRRExpressions_RealExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_NumericExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "realSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_RealExp
				:type Double
				:location "144:3-144:33"
			)]
		) ) ( def PRRExpressions_PrimitiveExp ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRRExpressions_OclExpression]
			:structuralFeatures[]
		) ) ( def PRRExpressions_NavigationOrAttributeCallExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_PropertyCallExp]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_NavigationOrAttributeCallExp
				:type String
				:location "153:3-153:27"
			)]
		) ) ( def PRRExpressions_Iterator ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_VariableDeclaration]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "loopExpr"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_Iterator
				:type PRRExpressions_LoopExp
				:location "158:3-158:58"
				:isContainer false
				:opposite iterators
			)]
		) ) ( def PRRExpressions_VariableDeclaration ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_Element]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "varName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_VariableDeclaration
				:type String
				:location "164:3-164:30"
			) ( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_VariableDeclaration
				:type PRRTypes_OclType
				:location "163:3-163:69"
				:isContainer true
				:opposite variableDeclaration
			) ( struct-map
				KM3_Reference
				:name "variableExp"
				:upper -1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_VariableDeclaration
				:type PRRExpressions_VariableExp
				:location "165:3-165:70"
				:isContainer false
				:opposite referredVariable
			)]
		) ) ( def PRRExpressions_VariableExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_OclExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "referredVariable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_VariableExp
				:type PRRExpressions_VariableDeclaration
				:location "170:3-170:75"
				:isContainer false
				:opposite variableExp
			)]
		) ) ( def PRRExpressions_TypeExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_OclExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "referredType"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRExpressions_TypeExp
				:type PRRTypes_OclType
				:location "175:3-175:73"
				:isContainer true
				:opposite typeExp
			)]
		) ) ( def PRRExpressions_AllInstanceExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRExpressions_OclExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "sourceType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner PRRExpressions_AllInstanceExp
				:type PRRTypes_OclType
				:location "179:3-179:74"
				:isContainer true
				:opposite appliedAllInstance
			)]
		) )]
	) ) ( def PRRTypes ( struct-map
		KM3_Package
		:contents[( def PRRTypes_OclType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRR_NamedElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "variableDeclaration"
				:upper -1
				:lower 0
				:isOrdered false
				:owner PRRTypes_OclType
				:type PRRExpressions_VariableDeclaration
				:location "193:2-193:73"
				:isContainer false
				:opposite type
			) ( struct-map
				KM3_Reference
				:name "oclExpression"
				:upper -1
				:lower 0
				:isOrdered false
				:owner PRRTypes_OclType
				:type PRRExpressions_OclExpression
				:location "194:2-194:61"
				:isContainer false
				:opposite type
			) ( struct-map
				KM3_Reference
				:name "appliedAllInstance"
				:upper 1
				:lower 0
				:isOrdered false
				:owner PRRTypes_OclType
				:type PRRExpressions_AllInstanceExp
				:location "195:2-195:75"
				:isContainer false
				:opposite sourceType
			) ( struct-map
				KM3_Reference
				:name "typeExp"
				:upper -1
				:lower 0
				:isOrdered false
				:owner PRRTypes_OclType
				:type PRRExpressions_TypeExp
				:location "196:2-196:58"
				:isContainer false
				:opposite referredType
			)]
		) ) ( def PRRTypes_StringType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRTypes_Primitive]
			:structuralFeatures[]
		) ) ( def PRRTypes_Primitive ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRRTypes_OclType]
			:structuralFeatures[]
		) ) ( def PRRTypes_RealType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRTypes_NumericType]
			:structuralFeatures[]
		) ) ( def PRRTypes_BooleanType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRTypes_Primitive]
			:structuralFeatures[]
		) ) ( def PRRTypes_NumericType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[PRRTypes_Primitive]
			:structuralFeatures[]
		) ) ( def PRRTypes_IntegerType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[PRRTypes_NumericType]
			:structuralFeatures[]
		) )]
	) )]
) )
