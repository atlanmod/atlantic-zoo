( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare IRL_Element )
( declare IRL_NamedElement )
( declare IRL_ExtendedIdentifier )
( declare IRL_Extended )
( declare IRL_Definition )
( declare IRL_RuleSet )
( declare IRL_ImportDefinition )
( declare IRLExpressions_Expression )
( declare IRLExpressions_PropertyCallExpression )
( declare IRLExpressions_IteratorExp )
( declare IRLExpressions_LoopExpression )
( declare IRLExpressions_OperatorCallExpression )
( declare IRLExpressions_OperationCallExpression )
( declare IRLExpressions_PrimitiveExpression )
( declare IRLExpressions_Iterator )
( declare IRLExpressions_NumericExpression )
( declare IRLExpressions_IntegerExpression )
( declare IRLExpressions_RealExpression )
( declare IRLExpressions_BooleanExpression )
( declare IRLExpressions_NavigationOrAttributeCallExpression )
( declare IRLExpressions_VariableExpression )
( declare IRLExpressions_StringExpression )
( declare IRLTypes_Type )
( declare IRLTypes_Typed )
( declare IRLTypes_Primitive )
( declare IRLTypes_StringType )
( declare IRLTypes_NumericType )
( declare IRLTypes_IntegerType )
( declare IRLTypes_RealType )
( declare IRLTypes_BooleanType )
( declare IRLTypes_ClassType )
( declare IRLDeclarations_PropertyDefinition )
( declare IRLDeclarations_RuleSetDeclaration )
( declare IRLDeclarations_ClassInstancesDeclaration )
( declare IRLDeclarations_PropertyDeclaration )
( declare IRLDeclarations_VariableDeclaration )
( declare IRLRules_RulesetElementDefinition )
( declare IRLRules_RuleDefinition )
( declare IRLRules_Binding )
( declare IRLRules_RuleVariable )
( declare IRLRules_CollectionOperationRuleVariable )
( declare IRLRules_SimpleRuleVariable )
( declare IRLRules_RuleCondition )
( declare IRLRules_RuleAction )
( declare PRRActions_DeleteAction )
( declare PRRActions_CreateAction )
( declare PRRActions_ModifyAction )
( declare PRRActions_UpdateAction )
( declare PRRActions_InvokeAction )
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
( def IRL ( struct-map
	KM3_Package
	:contents[( def IRL_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_Element
			:type String
			:location "19:3-19:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner IRL_Element
			:type String
			:location "20:3-20:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner IRL_Element
			:type String
			:location "21:3-21:47"
		)]
	) ) ( def IRL_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[IRL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_NamedElement
			:type String
			:location "25:3-25:27"
		)]
	) ) ( def IRL_ExtendedIdentifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IRL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentIdentifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IRL_ExtendedIdentifier
			:type IRL_ExtendedIdentifier
			:location "29:3-29:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extendedIdentifierOwner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_ExtendedIdentifier
			:type IRL_Extended
			:location "30:3-30:78"
			:isContainer false
			:opposite extendedIdentifier
		)]
	) ) ( def IRL_Extended ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[IRL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "extendedIdentifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_Extended
			:type IRL_ExtendedIdentifier
			:location "34:3-34:97"
			:isContainer true
			:opposite extendedIdentifierOwner
		)]
	) ) ( def IRL_Definition ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[IRL_Extended]
		:structuralFeatures[]
	) ) ( def IRL_RuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IRL_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "importDefinitions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner IRL_RuleSet
			:type IRL_ImportDefinition
			:location "41:3-41:105"
			:isContainer true
			:opposite importDefinitionOwners
		) ( struct-map
			KM3_Reference
			:name "propertyDefinitions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner IRL_RuleSet
			:type IRLDeclarations_PropertyDefinition
			:location "42:3-42:105"
			:isContainer true
			:opposite propertyDefinitionOwner
		) ( struct-map
			KM3_Reference
			:name "rulesetElementDefinitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner IRL_RuleSet
			:type IRLRules_RulesetElementDefinition
			:location "44:3-44:120"
			:isContainer true
			:opposite rulesetElementDefinitionOwner
		)]
	) ) ( def IRL_ImportDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[IRL_Definition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dotStar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_ImportDefinition
			:type Boolean
			:location "49:3-49:31"
		) ( struct-map
			KM3_Reference
			:name "importDefinitionOwners"
			:upper 1
			:lower 1
			:isOrdered false
			:owner IRL_ImportDefinition
			:type IRL_RuleSet
			:location "48:3-48:76"
			:isContainer false
			:opposite importDefinitions
		)]
	) ) ( def IRLExpressions ( struct-map
		KM3_Package
		:contents[( def IRLExpressions_Expression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLTypes_Typed]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "appliedProperty"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Expression
				:type IRLExpressions_PropertyCallExpression
				:location "56:3-56:77"
				:isContainer false
				:opposite source
			) ( struct-map
				KM3_Reference
				:name "expressionOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_Expression
				:type IRLDeclarations_RuleSetDeclaration
				:location "57:3-57:72"
				:isContainer false
				:opposite expression
			) ( struct-map
				KM3_Reference
				:name "loopExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Expression
				:type IRLExpressions_LoopExpression
				:location "60:3-60:66"
				:isContainer false
				:opposite body
			) ( struct-map
				KM3_Reference
				:name "parentOperation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Expression
				:type IRLExpressions_OperationCallExpression
				:location "61:3-61:81"
				:isContainer false
				:opposite arguments
			) ( struct-map
				KM3_Reference
				:name "ruleConditionExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_Expression
				:type IRLRules_RuleCondition
				:location "62:3-62:84"
				:isContainer false
				:opposite conditionExpression
			) ( struct-map
				KM3_Reference
				:name "parentInsert"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Expression
				:type PRRActions_CreateAction
				:location "63:3-63:74"
				:isContainer false
				:opposite insertArguments
			) ( struct-map
				KM3_Reference
				:name "parentModifying"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Expression
				:type PRRActions_ModifyAction
				:location "64:3-64:79"
				:isContainer false
				:opposite modifiedArguments
			)]
		) ) ( def IRLExpressions_PropertyCallExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLExpressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "source"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_PropertyCallExpression
				:type IRLExpressions_Expression
				:location "68:3-68:76"
				:isContainer true
				:opposite appliedProperty
			)]
		) ) ( def IRLExpressions_IteratorExp ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_LoopExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_IteratorExp
				:type String
				:location "90:3-90:26"
			)]
		) ) ( def IRLExpressions_LoopExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_PropertyCallExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_LoopExpression
				:type IRLExpressions_Expression
				:location "95:3-95:67"
				:isContainer true
				:opposite loopExpression
			) ( struct-map
				KM3_Reference
				:name "iterators"
				:upper -1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_LoopExpression
				:type IRLExpressions_Iterator
				:location "96:3-96:75"
				:isContainer true
				:opposite loopExpression
			)]
		) ) ( def IRLExpressions_OperatorCallExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_OperationCallExpression]
			:structuralFeatures[]
		) ) ( def IRLExpressions_OperationCallExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_PropertyCallExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "operationName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_OperationCallExpression
				:type String
				:location "106:3-106:36"
			) ( struct-map
				KM3_Attribute
				:name "signature"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_OperationCallExpression
				:type String
				:location "107:3-107:37"
			) ( struct-map
				KM3_Reference
				:name "arguments"
				:upper -1
				:lower 0
				:isOrdered true
				:owner IRLExpressions_OperationCallExpression
				:type IRLExpressions_Expression
				:location "105:3-105:84"
				:isContainer true
				:opposite parentOperation
			)]
		) ) ( def IRLExpressions_PrimitiveExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLExpressions_Expression]
			:structuralFeatures[]
		) ) ( def IRLExpressions_Iterator ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLDeclarations_VariableDeclaration]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "loopExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLExpressions_Iterator
				:type IRLExpressions_LoopExpression
				:location "116:3-116:71"
				:isContainer false
				:opposite iterators
			)]
		) ) ( def IRLExpressions_NumericExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLExpressions_PrimitiveExpression]
			:structuralFeatures[]
		) ) ( def IRLExpressions_IntegerExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_NumericExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "integerSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_IntegerExpression
				:type Integer
				:location "124:3-124:37"
			)]
		) ) ( def IRLExpressions_RealExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_NumericExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "realSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_RealExpression
				:type Double
				:location "129:3-129:33"
			)]
		) ) ( def IRLExpressions_BooleanExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_PrimitiveExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "booleanSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_BooleanExpression
				:type Boolean
				:location "134:3-134:37"
			)]
		) ) ( def IRLExpressions_NavigationOrAttributeCallExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_PropertyCallExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_NavigationOrAttributeCallExpression
				:type String
				:location "139:3-139:27"
			)]
		) ) ( def IRLExpressions_VariableExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_VariableExpression
				:type String
				:location "145:3-145:27"
			) ( struct-map
				KM3_Reference
				:name "referredVariable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_VariableExpression
				:type IRLDeclarations_VariableDeclaration
				:location "144:3-144:75"
				:isContainer false
				:opposite variableExp
			)]
		) ) ( def IRLExpressions_StringExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLExpressions_PrimitiveExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "stringSymbol"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLExpressions_StringExpression
				:type String
				:location "150:3-150:35"
			)]
		) )]
	) ) ( def IRLTypes ( struct-map
		KM3_Package
		:contents[( def IRLTypes_Type ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRL_NamedElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "typeOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLTypes_Type
				:type IRLTypes_Typed
				:location "178:3-178:47"
				:isContainer false
				:opposite type
			)]
		) ) ( def IRLTypes_Typed ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRL_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLTypes_Typed
				:type IRLTypes_Type
				:location "182:3-182:55"
				:isContainer true
				:opposite typeOwner
			)]
		) ) ( def IRLTypes_Primitive ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLTypes_Type]
			:structuralFeatures[]
		) ) ( def IRLTypes_StringType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_Primitive]
			:structuralFeatures[]
		) ) ( def IRLTypes_NumericType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLTypes_Primitive]
			:structuralFeatures[]
		) ) ( def IRLTypes_IntegerType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_NumericType]
			:structuralFeatures[]
		) ) ( def IRLTypes_RealType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_NumericType]
			:structuralFeatures[]
		) ) ( def IRLTypes_BooleanType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_Primitive]
			:structuralFeatures[]
		) ) ( def IRLTypes_ClassType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_Type]
			:structuralFeatures[]
		) )]
	) ) ( def IRLDeclarations ( struct-map
		KM3_Package
		:contents[( def IRLDeclarations_PropertyDefinition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRL_Definition]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "semicoloneOpt"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLDeclarations_PropertyDefinition
				:type Boolean
				:location "229:3-229:37"
			) ( struct-map
				KM3_Reference
				:name "propertyDefinitionOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLDeclarations_PropertyDefinition
				:type IRL_RuleSet
				:location "227:3-227:78"
				:isContainer false
				:opposite propertyDefinitions
			) ( struct-map
				KM3_Reference
				:name "ruleSetDeclarations"
				:upper -1
				:lower 0
				:isOrdered true
				:owner IRLDeclarations_PropertyDefinition
				:type IRLDeclarations_RuleSetDeclaration
				:location "228:3-228:110"
				:isContainer true
				:opposite ruleSetDeclarationOwner
			)]
		) ) ( def IRLDeclarations_RuleSetDeclaration ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRL_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "ruleSetDeclarationOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLDeclarations_RuleSetDeclaration
				:type IRLDeclarations_PropertyDefinition
				:location "233:3-233:89"
				:isContainer false
				:opposite ruleSetDeclarations
			) ( struct-map
				KM3_Reference
				:name "expression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLDeclarations_RuleSetDeclaration
				:type IRLExpressions_Expression
				:location "234:3-234:79"
				:isContainer true
				:opposite expressionOwner
			)]
		) ) ( def IRLDeclarations_ClassInstancesDeclaration ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLDeclarations_RuleSetDeclaration IRL_Extended]
			:structuralFeatures[]
		) ) ( def IRLDeclarations_PropertyDeclaration ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLDeclarations_RuleSetDeclaration]
			:structuralFeatures[]
		) ) ( def IRLDeclarations_VariableDeclaration ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLTypes_Typed]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "varName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLDeclarations_VariableDeclaration
				:type String
				:location "256:3-256:30"
			) ( struct-map
				KM3_Reference
				:name "variableExp"
				:upper -1
				:lower 0
				:isOrdered false
				:owner IRLDeclarations_VariableDeclaration
				:type IRLExpressions_VariableExpression
				:location "257:3-257:77"
				:isContainer false
				:opposite referredVariable
			)]
		) )]
	) ) ( def IRLRules ( struct-map
		KM3_Package
		:contents[( def IRLRules_RulesetElementDefinition ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRL_NamedElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "rulesetElementDefinitionOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLRules_RulesetElementDefinition
				:type IRL_RuleSet
				:location "268:3-268:91"
				:isContainer false
				:opposite rulesetElementDefinitions
			)]
		) ) ( def IRLRules_RuleDefinition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLRules_RulesetElementDefinition]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "binding"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_RuleDefinition
				:type IRLRules_Binding
				:location "272:3-272:71"
				:isContainer true
				:opposite bindingOwner
			) ( struct-map
				KM3_Reference
				:name "condition"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_RuleDefinition
				:type IRLRules_RuleCondition
				:location "273:3-273:89"
				:isContainer true
				:opposite ruleDefinitionCondition
			) ( struct-map
				KM3_Reference
				:name "actions"
				:upper -1
				:lower 0
				:isOrdered true
				:owner IRLRules_RuleDefinition
				:type IRLRules_RuleAction
				:location "274:3-274:78"
				:isContainer true
				:opposite actionOwner
			)]
		) ) ( def IRLRules_Binding ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRL_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "bindingOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLRules_Binding
				:type IRLRules_RuleDefinition
				:location "280:3-280:62"
				:isContainer false
				:opposite binding
			) ( struct-map
				KM3_Reference
				:name "ruleVariable"
				:upper -1
				:lower 0
				:isOrdered false
				:owner IRLRules_Binding
				:type IRLRules_RuleVariable
				:location "281:3-281:84"
				:isContainer true
				:opposite ruleVariableOwner
			)]
		) ) ( def IRLRules_RuleVariable ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[IRLDeclarations_VariableDeclaration]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "ruleVariableOwner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLRules_RuleVariable
				:type IRLRules_Binding
				:location "285:3-285:65"
				:isContainer false
				:opposite ruleVariable
			) ( struct-map
				KM3_Reference
				:name "filter"
				:upper -1
				:lower 0
				:isOrdered true
				:owner IRLRules_RuleVariable
				:type IRLExpressions_Expression
				:location "286:3-286:53"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "collectIn"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_RuleVariable
				:type IRLExpressions_Expression
				:location "287:3-287:52"
				:isContainer true
			)]
		) ) ( def IRLRules_CollectionOperationRuleVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLRules_RuleVariable]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "operationName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLRules_CollectionOperationRuleVariable
				:type String
				:location "291:3-291:36"
			) ( struct-map
				KM3_Reference
				:name "collectWhere"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_CollectionOperationRuleVariable
				:type IRLExpressions_Expression
				:location "292:3-292:55"
				:isContainer true
			)]
		) ) ( def IRLRules_SimpleRuleVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRLRules_RuleVariable]
			:structuralFeatures[]
		) ) ( def IRLRules_RuleCondition ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRL_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "conditionExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_RuleCondition
				:type IRLExpressions_Expression
				:location "302:3-302:96"
				:isContainer true
				:opposite ruleConditionExpression
			) ( struct-map
				KM3_Reference
				:name "ruleDefinitionCondition"
				:upper 1
				:lower 1
				:isOrdered false
				:owner IRLRules_RuleCondition
				:type IRLRules_RuleDefinition
				:location "303:3-303:75"
				:isContainer false
				:opposite condition
			)]
		) ) ( def IRLRules_RuleAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[IRL_Element]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "actionOwner"
				:upper 1
				:lower 0
				:isOrdered false
				:owner IRLRules_RuleAction
				:type IRLRules_RuleDefinition
				:location "308:3-308:67"
				:isContainer false
				:opposite actions
			)]
		) ) ( def PRRActions ( struct-map
			KM3_Package
			:contents[( def PRRActions_DeleteAction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[IRLRules_RuleAction]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "objValue"
					:upper 1
					:lower 1
					:isOrdered false
					:owner PRRActions_DeleteAction
					:type IRLExpressions_Expression
					:location "314:3-314:45"
					:isContainer true
				)]
			) ) ( def PRRActions_CreateAction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[IRLRules_RuleAction IRLDeclarations_VariableDeclaration]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "insertArguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner PRRActions_CreateAction
					:type IRLExpressions_Expression
					:location "318:3-318:88"
					:isContainer true
					:opposite parentInsert
				)]
			) ) ( def PRRActions_ModifyAction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[IRLRules_RuleAction]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "objValue"
					:upper 1
					:lower 1
					:isOrdered false
					:owner PRRActions_ModifyAction
					:type IRLExpressions_Expression
					:location "322:3-322:44"
					:isContainer true
				) ( struct-map
					KM3_Reference
					:name "modifiedArguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner PRRActions_ModifyAction
					:type IRLExpressions_Expression
					:location "323:3-323:93"
					:isContainer true
					:opposite parentModifying
				)]
			) ) ( def PRRActions_UpdateAction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[IRLRules_RuleAction]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "objValue"
					:upper 1
					:lower 1
					:isOrdered false
					:owner PRRActions_UpdateAction
					:type IRLExpressions_Expression
					:location "328:3-328:45"
					:isContainer true
				)]
			) ) ( def PRRActions_InvokeAction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[IRLRules_RuleAction]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "invocation"
					:upper 1
					:lower 1
					:isOrdered false
					:owner PRRActions_InvokeAction
					:type IRLExpressions_Expression
					:location "337:3-337:47"
					:isContainer true
				)]
			) )]
		) )]
	) )]
) )
