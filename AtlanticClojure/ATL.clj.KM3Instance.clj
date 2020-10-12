( declare ATL_LocatedElement )
( declare ATL_Unit )
( declare ATL_Library )
( declare ATL_Query )
( declare ATL_Module )
( declare ATL_ModuleElement )
( declare ATL_Helper )
( declare ATL_Rule )
( declare ATL_MatchedRule )
( declare ATL_LazyMatchedRule )
( declare ATL_CalledRule )
( declare ATL_InPattern )
( declare ATL_OutPattern )
( declare ATL_PatternElement )
( declare ATL_InPatternElement )
( declare ATL_SimpleInPatternElement )
( declare ATL_OutPatternElement )
( declare ATL_SimpleOutPatternElement )
( declare ATL_ForEachOutPatternElement )
( declare ATL_Binding )
( declare ATL_RuleVariableDeclaration )
( declare ATL_LibraryRef )
( declare ATL_ActionBlock )
( declare ATL_Statement )
( declare ATL_ExpressionStat )
( declare ATL_BindingStat )
( declare ATL_IfStat )
( declare ATL_ForStat )
( declare OCL_OclExpression )
( declare OCL_VariableExp )
( declare OCL_SuperExp )
( declare OCL_PrimitiveExp )
( declare OCL_StringExp )
( declare OCL_BooleanExp )
( declare OCL_NumericExp )
( declare OCL_RealExp )
( declare OCL_IntegerExp )
( declare OCL_CollectionExp )
( declare OCL_BagExp )
( declare OCL_OrderedSetExp )
( declare OCL_SequenceExp )
( declare OCL_SetExp )
( declare OCL_TupleExp )
( declare OCL_TuplePart )
( declare OCL_MapExp )
( declare OCL_MapElement )
( declare OCL_EnumLiteralExp )
( declare OCL_OclUndefinedExp )
( declare OCL_PropertyCallExp )
( declare OCL_NavigationOrAttributeCallExp )
( declare OCL_OperationCallExp )
( declare OCL_OperatorCallExp )
( declare OCL_CollectionOperationCallExp )
( declare OCL_LoopExp )
( declare OCL_IterateExp )
( declare OCL_IteratorExp )
( declare OCL_LetExp )
( declare OCL_IfExp )
( declare OCL_VariableDeclaration )
( declare OCL_Iterator )
( declare OCL_Parameter )
( declare OCL_CollectionType )
( declare OCL_OclType )
( declare OCL_Primitive )
( declare OCL_StringType )
( declare OCL_BooleanType )
( declare OCL_NumericType )
( declare OCL_IntegerType )
( declare OCL_RealType )
( declare OCL_BagType )
( declare OCL_OrderedSetType )
( declare OCL_SequenceType )
( declare OCL_SetType )
( declare OCL_OclAnyType )
( declare OCL_TupleType )
( declare OCL_TupleTypeAttribute )
( declare OCL_OclModelElement )
( declare OCL_MapType )
( declare OCL_OclFeatureDefinition )
( declare OCL_OclContextDefinition )
( declare OCL_OclFeature )
( declare OCL_Attribute )
( declare OCL_Operation )
( declare OCL_OclModel )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ATL ( struct-map
	KM3_Package
	:contents[( def ATL_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_LocatedElement
			:type String
			:location "13:3-13:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_LocatedElement
			:type String
			:location "14:3-14:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_LocatedElement
			:type String
			:location "15:3-15:47"
		)]
	) ) ( def ATL_Unit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Unit
			:type String
			:location "21:3-21:27"
		) ( struct-map
			KM3_Reference
			:name "libraries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATL_Unit
			:type ATL_LibraryRef
			:location "20:3-20:65"
			:isContainer true
			:opposite unit
		)]
	) ) ( def ATL_Library ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Unit]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "helpers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_Library
			:type ATL_Helper
			:location "25:3-25:70"
			:isContainer true
			:opposite library
		)]
	) ) ( def ATL_Query ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Unit]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Query
			:type OCL_OclExpression
			:location "29:3-29:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "helpers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_Query
			:type ATL_Helper
			:location "30:3-30:68"
			:isContainer true
			:opposite query
		)]
	) ) ( def ATL_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Unit]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRefining"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Module
			:type Boolean
			:location "34:3-34:34"
		) ( struct-map
			KM3_Reference
			:name "inModels"
			:upper -1
			:lower 1
			:isOrdered true
			:owner ATL_Module
			:type OCL_OclModel
			:location "35:3-35:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "outModels"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATL_Module
			:type OCL_OclModel
			:location "36:3-36:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_Module
			:type ATL_ModuleElement
			:location "37:3-37:77"
			:isContainer true
			:opposite module
		)]
	) ) ( def ATL_ModuleElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ModuleElement
			:type ATL_Module
			:location "43:3-43:49"
			:isContainer false
			:opposite elements
		)]
	) ) ( def ATL_Helper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_ModuleElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_Helper
			:type ATL_Query
			:location "47:3-47:51"
			:isContainer false
			:opposite helpers
		) ( struct-map
			KM3_Reference
			:name "library"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_Helper
			:type ATL_Library
			:location "48:3-48:55"
			:isContainer false
			:opposite helpers
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Helper
			:type OCL_OclFeatureDefinition
			:location "49:3-49:57"
			:isContainer true
		)]
	) ) ( def ATL_Rule ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_ModuleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Rule
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Reference
			:name "outPattern"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_Rule
			:type ATL_OutPattern
			:location "53:3-53:68"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "actionBlock"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_Rule
			:type ATL_ActionBlock
			:location "54:3-54:70"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_Rule
			:type ATL_RuleVariableDeclaration
			:location "55:3-55:86"
			:isContainer true
			:opposite rule
		)]
	) ) ( def ATL_MatchedRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Rule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_MatchedRule
			:type Boolean
			:location "63:3-63:34"
		) ( struct-map
			KM3_Attribute
			:name "isRefining"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_MatchedRule
			:type Boolean
			:location "64:3-64:34"
		) ( struct-map
			KM3_Attribute
			:name "isNoDefault"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_MatchedRule
			:type Boolean
			:location "65:3-65:35"
		) ( struct-map
			KM3_Reference
			:name "inPattern"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_MatchedRule
			:type ATL_InPattern
			:location "60:3-60:66"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATL_MatchedRule
			:type ATL_MatchedRule
			:location "61:3-61:60"
			:isContainer false
			:opposite superRule
		) ( struct-map
			KM3_Reference
			:name "superRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_MatchedRule
			:type ATL_MatchedRule
			:location "62:3-62:62"
			:isContainer false
			:opposite children
		)]
	) ) ( def ATL_LazyMatchedRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_MatchedRule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_LazyMatchedRule
			:type Boolean
			:location "69:3-69:32"
		)]
	) ) ( def ATL_CalledRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Rule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isEntrypoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_CalledRule
			:type Boolean
			:location "74:3-74:36"
		) ( struct-map
			KM3_Attribute
			:name "isEndpoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_CalledRule
			:type Boolean
			:location "75:3-75:34"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATL_CalledRule
			:type OCL_Parameter
			:location "73:3-73:49"
			:isContainer true
		)]
	) ) ( def ATL_InPattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ATL_InPattern
			:type ATL_InPatternElement
			:location "81:3-81:77"
			:isContainer true
			:opposite inPattern
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_InPattern
			:type ATL_MatchedRule
			:location "82:3-82:53"
			:isContainer false
			:opposite inPattern
		) ( struct-map
			KM3_Reference
			:name "filter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_InPattern
			:type OCL_OclExpression
			:location "83:3-83:51"
			:isContainer true
		)]
	) ) ( def ATL_OutPattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_OutPattern
			:type ATL_Rule
			:location "87:3-87:47"
			:isContainer false
			:opposite outPattern
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner ATL_OutPattern
			:type ATL_OutPatternElement
			:location "88:3-88:87"
			:isContainer true
			:opposite outPattern
		)]
	) ) ( def ATL_PatternElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_VariableDeclaration]
		:structuralFeatures[]
	) ) ( def ATL_InPatternElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_PatternElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mapsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_InPatternElement
			:type ATL_OutPatternElement
			:location "96:3-96:65"
			:isContainer false
			:opposite sourceElement
		) ( struct-map
			KM3_Reference
			:name "inPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_InPatternElement
			:type ATL_InPattern
			:location "97:3-97:55"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "models"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ATL_InPatternElement
			:type OCL_OclModel
			:location "98:3-98:36"
			:isContainer false
		)]
	) ) ( def ATL_SimpleInPatternElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_InPatternElement]
		:structuralFeatures[]
	) ) ( def ATL_OutPatternElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_PatternElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "outPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_OutPatternElement
			:type ATL_OutPattern
			:location "106:3-106:57"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "sourceElement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_OutPatternElement
			:type ATL_InPatternElement
			:location "107:3-107:69"
			:isContainer false
			:opposite mapsTo
		) ( struct-map
			KM3_Reference
			:name "bindings"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_OutPatternElement
			:type ATL_Binding
			:location "108:3-108:82"
			:isContainer true
			:opposite outPatternElement
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ATL_OutPatternElement
			:type OCL_OclModel
			:location "109:3-109:35"
			:isContainer false
		)]
	) ) ( def ATL_SimpleOutPatternElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_OutPatternElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "reverseBindings"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_SimpleOutPatternElement
			:type OCL_OclExpression
			:location "113:3-113:66"
			:isContainer true
		)]
	) ) ( def ATL_ForEachOutPatternElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_OutPatternElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "collection"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ForEachOutPatternElement
			:type OCL_OclExpression
			:location "117:3-117:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ForEachOutPatternElement
			:type OCL_Iterator
			:location "118:3-118:43"
			:isContainer true
		)]
	) ) ( def ATL_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "propertyName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Binding
			:type String
			:location "126:3-126:35"
		) ( struct-map
			KM3_Attribute
			:name "isAssignment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Binding
			:type Boolean
			:location "127:3-127:36"
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Binding
			:type OCL_OclExpression
			:location "124:3-124:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "outPatternElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_Binding
			:type ATL_OutPatternElement
			:location "125:3-125:71"
			:isContainer false
			:opposite bindings
		)]
	) ) ( def ATL_RuleVariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_RuleVariableDeclaration
			:type ATL_Rule
			:location "131:3-131:46"
			:isContainer false
			:opposite variables
		)]
	) ) ( def ATL_LibraryRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_LibraryRef
			:type String
			:location "136:3-136:27"
		) ( struct-map
			KM3_Reference
			:name "unit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_LibraryRef
			:type ATL_Unit
			:location "135:3-135:46"
			:isContainer false
			:opposite libraries
		)]
	) ) ( def ATL_ActionBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ActionBlock
			:type ATL_Rule
			:location "140:3-140:48"
			:isContainer false
			:opposite actionBlock
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_ActionBlock
			:type ATL_Statement
			:location "141:3-141:57"
			:isContainer true
		)]
	) ) ( def ATL_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[]
	) ) ( def ATL_ExpressionStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ExpressionStat
			:type OCL_OclExpression
			:location "148:3-148:50"
			:isContainer true
		)]
	) ) ( def ATL_BindingStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "propertyName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_BindingStat
			:type String
			:location "153:3-153:35"
		) ( struct-map
			KM3_Attribute
			:name "isAssignment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_BindingStat
			:type Boolean
			:location "154:3-154:36"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_BindingStat
			:type OCL_OclExpression
			:location "152:3-152:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_BindingStat
			:type OCL_OclExpression
			:location "155:3-155:45"
			:isContainer true
		)]
	) ) ( def ATL_IfStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_IfStat
			:type OCL_OclExpression
			:location "159:3-159:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStatements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_IfStat
			:type ATL_Statement
			:location "160:3-160:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStatements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_IfStat
			:type ATL_Statement
			:location "161:3-161:61"
			:isContainer true
		)]
	) ) ( def ATL_ForStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ForStat
			:type OCL_Iterator
			:location "165:3-165:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "collection"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ATL_ForStat
			:type OCL_OclExpression
			:location "166:3-166:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ATL_ForStat
			:type ATL_Statement
			:location "167:3-167:57"
			:isContainer true
		)]
	) )]
) )
( def OCL ( struct-map
	KM3_Package
	:contents[( def OCL_OclExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_OclType
			:location "178:3-178:68"
			:isContainer true
			:opposite oclExpression
		) ( struct-map
			KM3_Reference
			:name "ifExp3"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_IfExp
			:location "181:3-181:59"
			:isContainer false
			:opposite elseExpression
		) ( struct-map
			KM3_Reference
			:name "appliedProperty"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_PropertyCallExp
			:location "182:3-182:70"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "collection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_CollectionExp
			:location "183:3-183:65"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "letExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_LetExp
			:location "184:3-184:49"
			:isContainer false
			:opposite in_
		) ( struct-map
			KM3_Reference
			:name "loopExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_LoopExp
			:location "185:3-185:52"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "parentOperation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_OperationCallExp
			:location "186:3-186:74"
			:isContainer false
			:opposite arguments
		) ( struct-map
			KM3_Reference
			:name "initializedVariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_VariableDeclaration
			:location "187:3-187:86"
			:isContainer false
			:opposite initExpression
		) ( struct-map
			KM3_Reference
			:name "ifExp2"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_IfExp
			:location "188:3-188:59"
			:isContainer false
			:opposite thenExpression
		) ( struct-map
			KM3_Reference
			:name "owningOperation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_Operation
			:location "189:3-189:62"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "ifExp1"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_IfExp
			:location "190:3-190:54"
			:isContainer false
			:opposite condition
		) ( struct-map
			KM3_Reference
			:name "owningAttribute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclExpression
			:type OCL_Attribute
			:location "191:3-191:72"
			:isContainer false
			:opposite initExpression
		)]
	) ) ( def OCL_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredVariable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_VariableExp
			:type OCL_VariableDeclaration
			:location "195:3-195:75"
			:isContainer false
			:opposite variableExp
		)]
	) ) ( def OCL_SuperExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[]
	) ) ( def OCL_PrimitiveExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_OclExpression]
		:structuralFeatures[]
	) ) ( def OCL_StringExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_PrimitiveExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stringSymbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_StringExp
			:type String
			:location "205:3-205:35"
		)]
	) ) ( def OCL_BooleanExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_PrimitiveExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "booleanSymbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_BooleanExp
			:type Boolean
			:location "209:3-209:37"
		)]
	) ) ( def OCL_NumericExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_PrimitiveExp]
		:structuralFeatures[]
	) ) ( def OCL_RealExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_NumericExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "realSymbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_RealExp
			:type Double
			:location "215:3-215:33"
		)]
	) ) ( def OCL_IntegerExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_NumericExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "integerSymbol"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IntegerExp
			:type Integer
			:location "219:3-219:37"
		)]
	) ) ( def OCL_CollectionExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_CollectionExp
			:type OCL_OclExpression
			:location "226:3-226:81"
			:isContainer true
			:opposite collection
		)]
	) ) ( def OCL_BagExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionExp]
		:structuralFeatures[]
	) ) ( def OCL_OrderedSetExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionExp]
		:structuralFeatures[]
	) ) ( def OCL_SequenceExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionExp]
		:structuralFeatures[]
	) ) ( def OCL_SetExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionExp]
		:structuralFeatures[]
	) ) ( def OCL_TupleExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tuplePart"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_TupleExp
			:type OCL_TuplePart
			:location "240:3-240:73"
			:isContainer true
			:opposite tuple
		)]
	) ) ( def OCL_TuplePart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tuple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_TuplePart
			:type OCL_TupleExp
			:location "244:3-244:51"
			:isContainer false
			:opposite tuplePart
		)]
	) ) ( def OCL_MapExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_MapExp
			:type OCL_MapElement
			:location "248:3-248:71"
			:isContainer true
			:opposite map
		)]
	) ) ( def OCL_MapElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "map"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_MapElement
			:type OCL_MapExp
			:location "252:3-252:46"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_MapElement
			:type OCL_OclExpression
			:location "253:3-253:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_MapElement
			:type OCL_OclExpression
			:location "254:3-254:45"
			:isContainer true
		)]
	) ) ( def OCL_EnumLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_EnumLiteralExp
			:type String
			:location "258:3-258:27"
		)]
	) ) ( def OCL_OclUndefinedExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[]
	) ) ( def OCL_PropertyCallExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_PropertyCallExp
			:type OCL_OclExpression
			:location "267:3-267:73"
			:isContainer true
			:opposite appliedProperty
		)]
	) ) ( def OCL_NavigationOrAttributeCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_NavigationOrAttributeCallExp
			:type String
			:location "271:3-271:27"
		)]
	) ) ( def OCL_OperationCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operationName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OperationCallExp
			:type String
			:location "277:3-277:36"
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_OperationCallExp
			:type OCL_OclExpression
			:location "276:3-276:87"
			:isContainer true
			:opposite parentOperation
		)]
	) ) ( def OCL_OperatorCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OperationCallExp]
		:structuralFeatures[]
	) ) ( def OCL_CollectionOperationCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OperationCallExp]
		:structuralFeatures[]
	) ) ( def OCL_LoopExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_LoopExp
			:type OCL_OclExpression
			:location "288:3-288:63"
			:isContainer true
			:opposite loopExp
		) ( struct-map
			KM3_Reference
			:name "iterators"
			:upper -1
			:lower 1
			:isOrdered false
			:owner OCL_LoopExp
			:type OCL_Iterator
			:location "289:3-289:69"
			:isContainer true
			:opposite loopExpr
		)]
	) ) ( def OCL_IterateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_LoopExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "result"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IterateExp
			:type OCL_VariableDeclaration
			:location "293:3-293:71"
			:isContainer true
			:opposite baseExp
		)]
	) ) ( def OCL_IteratorExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_LoopExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IteratorExp
			:type String
			:location "297:3-297:27"
		)]
	) ) ( def OCL_LetExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_LetExp
			:type OCL_VariableDeclaration
			:location "303:3-303:72"
			:isContainer true
			:opposite letExp
		) ( struct-map
			KM3_Reference
			:name "in_"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_LetExp
			:type OCL_OclExpression
			:location "304:3-304:61"
			:isContainer true
			:opposite letExp
		)]
	) ) ( def OCL_IfExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "thenExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IfExp
			:type OCL_OclExpression
			:location "308:3-308:72"
			:isContainer true
			:opposite ifExp2
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IfExp
			:type OCL_OclExpression
			:location "309:3-309:67"
			:isContainer true
			:opposite ifExp1
		) ( struct-map
			KM3_Reference
			:name "elseExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_IfExp
			:type OCL_OclExpression
			:location "310:3-310:72"
			:isContainer true
			:opposite ifExp3
		)]
	) ) ( def OCL_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type String
			:location "318:3-318:30"
		) ( struct-map
			KM3_Attribute
			:name "varName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type String
			:location "320:3-320:30"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type OCL_OclType
			:location "321:3-321:74"
			:isContainer true
			:opposite variableDeclaration
		) ( struct-map
			KM3_Reference
			:name "initExpression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type OCL_OclExpression
			:location "322:3-322:90"
			:isContainer true
			:opposite initializedVariable
		) ( struct-map
			KM3_Reference
			:name "letExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type OCL_LetExp
			:location "325:3-325:54"
			:isContainer false
			:opposite variable
		) ( struct-map
			KM3_Reference
			:name "baseExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type OCL_IterateExp
			:location "326:3-326:57"
			:isContainer false
			:opposite result
		) ( struct-map
			KM3_Reference
			:name "variableExp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCL_VariableDeclaration
			:type OCL_VariableExp
			:location "327:3-327:70"
			:isContainer false
			:opposite referredVariable
		)]
	) ) ( def OCL_Iterator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "loopExpr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_Iterator
			:type OCL_LoopExp
			:location "331:3-331:58"
			:isContainer false
			:opposite iterators
		)]
	) ) ( def OCL_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Parameter
			:type OCL_Operation
			:location "335:3-335:59"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def OCL_CollectionType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_CollectionType
			:type OCL_OclType
			:location "343:3-343:72"
			:isContainer true
			:opposite collectionTypes
		)]
	) ) ( def OCL_OclType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclType
			:type String
			:location "347:3-347:27"
		) ( struct-map
			KM3_Reference
			:name "definitions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_OclContextDefinition
			:location "350:3-350:73"
			:isContainer false
			:opposite context_
		) ( struct-map
			KM3_Reference
			:name "oclExpression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_OclExpression
			:location "351:3-351:64"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_Operation
			:location "352:3-352:64"
			:isContainer false
			:opposite returnType
		) ( struct-map
			KM3_Reference
			:name "mapType2"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_MapType
			:location "353:3-353:58"
			:isContainer false
			:opposite valueType
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_Attribute
			:location "354:3-354:58"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "mapType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_MapType
			:location "355:3-355:55"
			:isContainer false
			:opposite keyType
		) ( struct-map
			KM3_Reference
			:name "collectionTypes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_CollectionType
			:location "356:3-356:74"
			:isContainer false
			:opposite elementType
		) ( struct-map
			KM3_Reference
			:name "tupleTypeAttribute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_TupleTypeAttribute
			:location "357:3-357:74"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "variableDeclaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclType
			:type OCL_VariableDeclaration
			:location "358:3-358:76"
			:isContainer false
			:opposite type
		)]
	) ) ( def OCL_Primitive ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_OclType]
		:structuralFeatures[]
	) ) ( def OCL_StringType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_Primitive]
		:structuralFeatures[]
	) ) ( def OCL_BooleanType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_Primitive]
		:structuralFeatures[]
	) ) ( def OCL_NumericType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[OCL_Primitive]
		:structuralFeatures[]
	) ) ( def OCL_IntegerType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_NumericType]
		:structuralFeatures[]
	) ) ( def OCL_RealType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_NumericType]
		:structuralFeatures[]
	) ) ( def OCL_BagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionType]
		:structuralFeatures[]
	) ) ( def OCL_OrderedSetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionType]
		:structuralFeatures[]
	) ) ( def OCL_SequenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionType]
		:structuralFeatures[]
	) ) ( def OCL_SetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_CollectionType]
		:structuralFeatures[]
	) ) ( def OCL_OclAnyType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclType]
		:structuralFeatures[]
	) ) ( def OCL_TupleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_TupleType
			:type OCL_TupleTypeAttribute
			:location "391:3-391:87"
			:isContainer true
			:opposite tupleType
		)]
	) ) ( def OCL_TupleTypeAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_TupleTypeAttribute
			:type String
			:location "397:3-397:27"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_TupleTypeAttribute
			:type OCL_OclType
			:location "395:3-395:68"
			:isContainer true
			:opposite tupleTypeAttribute
		) ( struct-map
			KM3_Reference
			:name "tupleType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_TupleTypeAttribute
			:type OCL_TupleType
			:location "396:3-396:57"
			:isContainer false
			:opposite attributes
		)]
	) ) ( def OCL_OclModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclModelElement
			:type OCL_OclModel
			:location "401:3-401:50"
			:isContainer false
			:opposite elements
		)]
	) ) ( def OCL_MapType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "valueType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_MapType
			:type OCL_OclType
			:location "405:3-405:63"
			:isContainer true
			:opposite mapType2
		) ( struct-map
			KM3_Reference
			:name "keyType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_MapType
			:type OCL_OclType
			:location "406:3-406:60"
			:isContainer true
			:opposite mapType
		)]
	) ) ( def OCL_OclFeatureDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "feature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclFeatureDefinition
			:type OCL_OclFeature
			:location "411:3-411:66"
			:isContainer true
			:opposite definition
		) ( struct-map
			KM3_Reference
			:name "context_"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclFeatureDefinition
			:type OCL_OclContextDefinition
			:location "412:3-412:82"
			:isContainer true
			:opposite definition
		)]
	) ) ( def OCL_OclContextDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclContextDefinition
			:type OCL_OclFeatureDefinition
			:location "416:3-416:67"
			:isContainer false
			:opposite context_
		) ( struct-map
			KM3_Reference
			:name "context_"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclContextDefinition
			:type OCL_OclType
			:location "417:3-417:65"
			:isContainer true
			:opposite definitions
		)]
	) ) ( def OCL_OclFeature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCL_OclFeature
			:type OCL_OclFeatureDefinition
			:location "422:3-422:71"
			:isContainer false
			:opposite feature
		)]
	) ) ( def OCL_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Attribute
			:type String
			:location "426:3-426:27"
		) ( struct-map
			KM3_Reference
			:name "initExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Attribute
			:type OCL_OclExpression
			:location "427:3-427:81"
			:isContainer true
			:opposite owningAttribute
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Attribute
			:type OCL_OclType
			:location "428:3-428:61"
			:isContainer true
			:opposite attribute
		)]
	) ) ( def OCL_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCL_OclFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Operation
			:type String
			:location "432:3-432:27"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner OCL_Operation
			:type OCL_Parameter
			:location "433:3-433:80"
			:isContainer true
			:opposite operation
		) ( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Operation
			:type OCL_OclType
			:location "434:3-434:67"
			:isContainer true
			:opposite operation
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_Operation
			:type OCL_OclExpression
			:location "435:3-435:71"
			:isContainer true
			:opposite owningOperation
		)]
	) ) ( def OCL_OclModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ATL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclModel
			:type String
			:location "440:3-440:27"
		) ( struct-map
			KM3_Reference
			:name "metamodel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCL_OclModel
			:type OCL_OclModel
			:location "441:3-441:51"
			:isContainer false
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCL_OclModel
			:type OCL_OclModelElement
			:location "444:3-444:60"
			:isContainer false
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCL_OclModel
			:type OCL_OclModel
			:location "445:3-445:54"
			:isContainer false
			:opposite metamodel
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "452:2-452:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "453:2-453:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "454:2-454:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "455:2-455:18"
	) )]
) )
