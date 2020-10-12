( declare express_Dummy )
( declare rules_ONEOFConstraint )
( declare rules_SupertypeRule )
( declare rules_SubtypeConstraint )
( declare rules_Extent )
( declare rules_TOTAL_OVERConstraint )
( declare rules_ANDConstraint )
( declare rules_GlobalRule )
( declare rules_NamedRule )
( declare statements_ProcedureCall )
( declare statements_SkipStatement )
( declare statements_AliasStatement )
( declare statements_ControlVariable )
( declare statements_AliasVariable )
( declare statements_ControlStatement )
( declare statements_VARCell )
( declare statements_NullStatement )
( declare statements_VARExpression )
( declare statements_AttributeCell )
( declare statements_StatementBlock )
( declare statements_CaseAction )
( declare statements_MemberCell )
( declare statements_RepeatStatement )
( declare statements_GroupCell )
( declare statements_VariableCell )
( declare statements_CaseStatement )
( declare statements_IfStatement )
( declare statements_EscapeStatement )
( declare statements_ReturnStatement )
( declare statements_Assignment )
( declare mof_String )
( declare mof_Integer )
( declare mof_Boolean )
( declare expressions_Selector )
( declare expressions_RepeatCount )
( declare expressions_EnumItemRef )
( declare expressions_Literal )
( declare expressions_BinaryIndex )
( declare expressions_IndeterminateRef )
( declare expressions_SELFRef )
( declare expressions_IndexOperation )
( declare expressions_BinaryOperation )
( declare expressions_AggregateInitializer )
( declare expressions_StringIndex )
( declare expressions_PartialEntityConstructor )
( declare expressions_Coercion )
( declare expressions_Primary )
( declare expressions_ActualParameter )
( declare expressions_ParameterRef )
( declare expressions_AttributeRef )
( declare expressions_AggregateIndex )
( declare expressions_GroupRef )
( declare expressions_UnaryOperation )
( declare expressions_UsedInRef )
( declare expressions_ConstantRef )
( declare expressions_QueryExpression )
( declare expressions_QueryVariable )
( declare expressions_Operation )
( declare expressions_AttributeBinding )
( declare expressions_FunctionCall )
( declare expressions_MemberBinding )
( declare expressions_ExtentRef )
( declare expressions_VariableRef )
( declare expressions_UnaryOperator )
( declare expressions_BinaryOperator )
( declare core_TypeElement )
( declare core_SingleEntityType )
( declare core_AGGREGATEType )
( declare core_GeneralBAGType )
( declare core_DomainRule )
( declare core_GeneralAggregationType )
( declare core_ConcreteType )
( declare core_Expression )
( declare core_InverseAttribute )
( declare core_EnumerationType )
( declare core_VariableType )
( declare core_ArrayBound )
( declare core_GeneralSETType )
( declare core_LISTType )
( declare core_Redeclaration )
( declare core_EntityType )
( declare core_DataType )
( declare core_PartialEntityType )
( declare core_Schema )
( declare core_InvertibleAttribute )
( declare core_GeneralizedType )
( declare core_InterfacedElement )
( declare core_NumericType )
( declare core_DefinedType )
( declare core_UniqueRule )
( declare core_DomainRole )
( declare core_DomainConstraint )
( declare core_InstantiableType )
( declare core_GeneralLISTType )
( declare core_NamedElement )
( declare core_Attribute )
( declare core_BAGType )
( declare core_RealType )
( declare core_LogicType )
( declare core_GenericType )
( declare core_StringType )
( declare core_AnonymousType )
( declare core_AlgorithmScope )
( declare core_Instance )
( declare core_AttributeType )
( declare core_DerivedAttribute )
( declare core_RangeRole )
( declare core_LocalElement )
( declare core_Remark )
( declare core_SizeConstraint )
( declare core_Role )
( declare core_SETType )
( declare core_SpecializedType )
( declare core_GeneralARRAYType )
( declare core_Relationship )
( declare core_LengthConstraint )
( declare core_LocalScope )
( declare core_NamedType )
( declare core_BinaryType )
( declare core_ScopedId )
( declare core_AggregationType )
( declare core_Scope )
( declare core_ParameterType )
( declare core_SelectType )
( declare core_ActualType )
( declare core_ExplicitAttribute )
( declare core_SimpleType )
( declare core_CommonElement )
( declare core_SchemaElement )
( declare core_ConcreteAggregationType )
( declare core_ARRAYType )
( declare core_Keyword )
( declare core_ExpressText )
( declare core_Identifier )
( declare core_OrderingKind )
( declare lang_int )
( declare lang_void )
( declare algorithms_ActualTypeConstraint )
( declare algorithms_FunctionResult )
( declare algorithms_Function )
( declare algorithms_InParameter )
( declare algorithms_LocalVariable )
( declare algorithms_ActualStructure )
( declare algorithms_ActualGenericType )
( declare algorithms_Statement )
( declare algorithms_NamedVariable )
( declare algorithms_InVariable )
( declare algorithms_Procedure )
( declare algorithms_ActualARRAYType )
( declare algorithms_ActualSETType )
( declare algorithms_ActualAGGREGATEType )
( declare algorithms_Parameter )
( declare algorithms_ActualStructureConstraint )
( declare algorithms_Algorithm )
( declare algorithms_ActualAggregationType )
( declare algorithms_VARVariable )
( declare algorithms_ActualLISTType )
( declare algorithms_Variable )
( declare algorithms_GenericElement )
( declare algorithms_VARParameter )
( declare algorithms_ActualDataType )
( declare algorithms_ActualBAGType )
( declare instances_AttributeValue )
( declare instances_ARRAYValue )
( declare instances_RoleName )
( declare instances_EntityInstance )
( declare instances_IntegerValue )
( declare instances_AggregateValue )
( declare instances_Constant )
( declare instances_LogicalValue )
( declare instances_TypedInstance )
( declare instances_ListMember )
( declare instances_BagMember )
( declare instances_SingleEntityValue )
( declare instances_Indeterminate )
( declare instances_SingleLeafInstance )
( declare instances_GenericAggregate )
( declare instances_BinaryValue )
( declare instances_SpecializedValue )
( declare instances_BAGValue )
( declare instances_EnumerationItem )
( declare instances_EntityValue )
( declare instances_SETValue )
( declare instances_ArrayMember )
( declare instances_Population )
( declare instances_RealValue )
( declare instances_BooleanValue )
( declare instances_LISTValue )
( declare instances_StringValue )
( declare instances_TypeName )
( declare instances_PartialEntityValue )
( declare instances_NumberValue )
( declare instances_MultiLeafInstance )
( declare instances_SimpleValue )
( declare instances_ConcreteValue )
( declare instances_EntityName )
( def express ( struct-map
	KM3_Package
	:contents[( def ptyp_Dummy ( struct-map
		KM3_DataType
		:name "Dummy"
		:location "3:2-3:17"
	) ) ( def rules ( struct-map
		KM3_Package
		:contents[( def rules_ONEOFConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[rules_SubtypeConstraint]
			:structuralFeatures[]
		) ) ( def rules_SupertypeRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_CommonElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "assertsAbstract"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_SupertypeRule
				:type Boolean
				:location "14:4-14:40"
			) ( struct-map
				KM3_Reference
				:name "namedSupertype"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_SupertypeRule
				:type core_EntityType
				:location "12:4-12:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "constraints"
				:upper -1
				:lower 0
				:isOrdered false
				:owner rules_SupertypeRule
				:type rules_SubtypeConstraint
				:location "13:4-13:81"
				:isContainer true
				:opposite collection
			)]
		) ) ( def rules_SubtypeConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constrainedSubtypes"
				:upper -1
				:lower 1
				:isOrdered false
				:owner rules_SubtypeConstraint
				:type rules_Extent
				:location "18:4-18:71"
				:isContainer false
				:opposite constraints
			) ( struct-map
				KM3_Reference
				:name "equivalentRule"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_SubtypeConstraint
				:type core_Expression
				:location "19:4-19:52"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "collection"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_SubtypeConstraint
				:type rules_SupertypeRule
				:location "20:4-20:64"
				:isContainer false
				:opposite constraints
			)]
		) ) ( def rules_Extent ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_SETValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constraints"
				:upper -1
				:lower 0
				:isOrdered false
				:owner rules_Extent
				:type rules_SubtypeConstraint
				:location "24:4-24:80"
				:isContainer false
				:opposite constrainedSubtypes
			) ( struct-map
				KM3_Reference
				:name "content"
				:upper -1
				:lower 0
				:isOrdered false
				:owner rules_Extent
				:type instances_EntityInstance
				:location "25:4-25:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "withinPopulation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_Extent
				:type instances_Population
				:location "26:4-26:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "constraintRules"
				:upper -1
				:lower 0
				:isOrdered false
				:owner rules_Extent
				:type rules_GlobalRule
				:location "27:4-27:76"
				:isContainer false
				:opposite constrainedExtents
			) ( struct-map
				KM3_Reference
				:name "forType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_Extent
				:type core_EntityType
				:location "28:4-28:56"
				:isContainer false
				:opposite extension
			) ( struct-map
				KM3_Reference
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_Extent
				:type core_ScopedId
				:location "29:4-29:38"
				:isContainer true
			)]
		) ) ( def rules_TOTAL_OVERConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[rules_SubtypeConstraint]
			:structuralFeatures[]
		) ) ( def rules_ANDConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[rules_SubtypeConstraint]
			:structuralFeatures[]
		) ) ( def rules_GlobalRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_SchemaElement core_AlgorithmScope]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "supportingBody"
				:upper 1
				:lower 0
				:isOrdered false
				:owner rules_GlobalRule
				:type algorithms_Statement
				:location "41:4-41:56"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "constrainedExtents"
				:upper -1
				:lower 1
				:isOrdered false
				:owner rules_GlobalRule
				:type rules_Extent
				:location "42:4-42:74"
				:isContainer false
				:opposite constraintRules
			) ( struct-map
				KM3_Reference
				:name "containsRules"
				:upper -1
				:lower 1
				:isOrdered false
				:owner rules_GlobalRule
				:type rules_NamedRule
				:location "43:4-43:55"
				:isContainer true
			)]
		) ) ( def rules_NamedRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_LocalElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_NamedRule
				:type Integer
				:location "48:4-48:33"
			) ( struct-map
				KM3_Reference
				:name "assertsExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner rules_NamedRule
				:type core_Expression
				:location "47:4-47:55"
				:isContainer true
			)]
		) )]
	) ) ( def statements ( struct-map
		KM3_Package
		:contents[( def statements_ProcedureCall ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "invokes"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_ProcedureCall
				:type algorithms_Procedure
				:location "55:4-55:34"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "actualParameters"
				:upper -1
				:lower 0
				:isOrdered false
				:owner statements_ProcedureCall
				:type expressions_ActualParameter
				:location "56:4-56:89"
				:isContainer true
				:opposite inProcedureCall
			)]
		) ) ( def statements_SkipStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_ControlStatement]
			:structuralFeatures[]
		) ) ( def statements_AliasStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement core_LocalScope]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "bindsToReference"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AliasStatement
				:type statements_VARExpression
				:location "64:4-64:47"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AliasStatement
				:type algorithms_Statement
				:location "65:4-65:41"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "aliasVariable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AliasStatement
				:type statements_AliasVariable
				:location "66:4-66:54"
				:isContainer true
			)]
		) ) ( def statements_ControlVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_NamedVariable]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "boundValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_ControlVariable
				:type core_Expression
				:location "70:4-70:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "initialValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_ControlVariable
				:type core_Expression
				:location "71:4-71:40"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "increment"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_ControlVariable
				:type core_Expression
				:location "72:4-72:37"
				:isContainer false
			)]
		) ) ( def statements_AliasVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_NamedVariable algorithms_VARVariable]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "referent"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_AliasVariable
				:type statements_VARExpression
				:location "76:4-76:44"
				:isContainer false
			)]
		) ) ( def statements_ControlStatement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[algorithms_Statement]
			:structuralFeatures[]
		) ) ( def statements_VARCell ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_VARExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_VARCell
				:type Identifier
				:location "85:4-85:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_VARCell
				:type algorithms_VARVariable
				:location "84:4-84:37"
				:isContainer false
			)]
		) ) ( def statements_NullStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_ControlStatement]
			:structuralFeatures[]
		) ) ( def statements_VARExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "text"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_VARExpression
				:type ExpressText
				:location "93:4-93:38"
			)]
		) ) ( def statements_AttributeCell ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_VARExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AttributeCell
				:type Identifier
				:location "99:4-99:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AttributeCell
				:type core_ExplicitAttribute
				:location "97:4-97:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "baseEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_AttributeCell
				:type statements_VARExpression
				:location "98:4-98:51"
				:isContainer true
			)]
		) ) ( def statements_StatementBlock ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "delimited"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_StatementBlock
				:type Boolean
				:location "104:4-104:34"
			) ( struct-map
				KM3_Reference
				:name "bodyStatements_Statement"
				:upper -1
				:lower 0
				:isOrdered false
				:owner statements_StatementBlock
				:type algorithms_Statement
				:location "103:4-103:83"
				:isContainer true
				:opposite inBlock
			)]
		) ) ( def statements_CaseAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isDefault"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_CaseAction
				:type Boolean
				:location "110:4-110:34"
			) ( struct-map
				KM3_Reference
				:name "labelValue"
				:upper -1
				:lower 0
				:isOrdered false
				:owner statements_CaseAction
				:type core_Expression
				:location "108:4-108:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "action"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_CaseAction
				:type algorithms_Statement
				:location "109:4-109:48"
				:isContainer true
			)]
		) ) ( def statements_MemberCell ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_VARExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "indexValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_MemberCell
				:type core_Expression
				:location "114:4-114:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "baseAggregate"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_MemberCell
				:type statements_VARExpression
				:location "115:4-115:54"
				:isContainer true
			)]
		) ) ( def statements_RepeatStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement core_LocalScope]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "whileExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_RepeatStatement
				:type core_Expression
				:location "119:4-119:48"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_RepeatStatement
				:type algorithms_Statement
				:location "120:4-120:65"
				:isContainer true
				:opposite controlledBy
			) ( struct-map
				KM3_Reference
				:name "controlVariable"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_RepeatStatement
				:type statements_ControlVariable
				:location "121:4-121:63"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "untilExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_RepeatStatement
				:type core_Expression
				:location "122:4-122:48"
				:isContainer false
			)]
		) ) ( def statements_GroupCell ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_VARExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_GroupCell
				:type Identifier
				:location "128:4-128:30"
			) ( struct-map
				KM3_Reference
				:name "baseEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_GroupCell
				:type statements_VARExpression
				:location "126:4-126:51"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_GroupCell
				:type core_SingleEntityType
				:location "127:4-127:42"
				:isContainer false
			)]
		) ) ( def statements_VariableCell ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_VARExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_VariableCell
				:type Identifier
				:location "133:4-133:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_VariableCell
				:type algorithms_Variable
				:location "132:4-132:34"
				:isContainer false
			)]
		) ) ( def statements_CaseStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "cases"
				:upper -1
				:lower 1
				:isOrdered false
				:owner statements_CaseStatement
				:type statements_CaseAction
				:location "137:4-137:48"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "selectionExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_CaseStatement
				:type core_Expression
				:location "138:4-138:47"
				:isContainer false
			)]
		) ) ( def statements_IfStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "ifCondition"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_IfStatement
				:type core_Expression
				:location "142:4-142:49"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "elseActions"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_IfStatement
				:type algorithms_Statement
				:location "143:4-143:53"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "thenActions"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_IfStatement
				:type algorithms_Statement
				:location "144:4-144:48"
				:isContainer true
			)]
		) ) ( def statements_EscapeStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_ControlStatement]
			:structuralFeatures[]
		) ) ( def statements_ReturnStatement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[statements_ControlStatement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "returnValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner statements_ReturnStatement
				:type core_Expression
				:location "152:4-152:44"
				:isContainer false
			)]
		) ) ( def statements_Assignment ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Statement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "assignedValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_Assignment
				:type core_Expression
				:location "156:4-156:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "variable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner statements_Assignment
				:type statements_VARExpression
				:location "157:4-157:39"
				:isContainer false
			)]
		) )]
	) ) ( def mof ( struct-map
		KM3_Package
		:contents[( def ptyp_String ( struct-map
			KM3_DataType
			:name "String"
			:location "163:3-163:19"
		) ) ( def ptyp_Integer ( struct-map
			KM3_DataType
			:name "Integer"
			:location "165:3-165:20"
		) ) ( def ptyp_Boolean ( struct-map
			KM3_DataType
			:name "Boolean"
			:location "167:3-167:20"
		) )]
	) ) ( def expressions ( struct-map
		KM3_Package
		:contents[( def expressions_Selector ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "entityInstance"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_Selector
				:type core_Expression
				:location "173:4-173:42"
				:isContainer false
			)]
		) ) ( def expressions_RepeatCount ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "derivation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_RepeatCount
				:type core_Expression
				:location "177:4-177:43"
				:isContainer false
			)]
		) ) ( def expressions_EnumItemRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_EnumItemRef
				:type Identifier
				:location "182:4-182:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_EnumItemRef
				:type instances_EnumerationItem
				:location "181:4-181:41"
				:isContainer false
			)]
		) ) ( def expressions_Literal ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_Literal
				:type instances_SimpleValue
				:location "186:4-186:37"
				:isContainer false
			)]
		) ) ( def expressions_BinaryIndex ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_IndexOperation]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "firstBit"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_BinaryIndex
				:type core_Expression
				:location "190:4-190:36"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "lastBit"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_BinaryIndex
				:type core_Expression
				:location "191:4-191:40"
				:isContainer false
			)]
		) ) ( def expressions_IndeterminateRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_IndeterminateRef
				:type instances_Indeterminate
				:location "195:4-195:39"
				:isContainer false
			)]
		) ) ( def expressions_SELFRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[]
		) ) ( def expressions_IndexOperation ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "baseValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_IndexOperation
				:type core_Expression
				:location "203:4-203:37"
				:isContainer false
			)]
		) ) ( def expressions_BinaryOperation ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Operation]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "operator"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_BinaryOperation
				:type BinaryOperator
				:location "209:4-209:40"
			) ( struct-map
				KM3_Reference
				:name "leftOperand"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_BinaryOperation
				:type core_Expression
				:location "207:4-207:39"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "rightOperand"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_BinaryOperation
				:type core_Expression
				:location "208:4-208:40"
				:isContainer false
			)]
		) ) ( def expressions_AggregateInitializer ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "resultValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_AggregateInitializer
				:type instances_GenericAggregate
				:location "213:4-213:50"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "bindings"
				:upper -1
				:lower 0
				:isOrdered false
				:owner expressions_AggregateInitializer
				:type expressions_MemberBinding
				:location "214:4-214:52"
				:isContainer true
			)]
		) ) ( def expressions_StringIndex ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_IndexOperation]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "firstCode"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_StringIndex
				:type core_Expression
				:location "218:4-218:37"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "lastCode"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_StringIndex
				:type core_Expression
				:location "219:4-219:41"
				:isContainer false
			)]
		) ) ( def expressions_PartialEntityConstructor ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Expression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_PartialEntityConstructor
				:type Identifier
				:location "226:4-226:30"
			) ( struct-map
				KM3_Reference
				:name "resultValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_PartialEntityConstructor
				:type instances_PartialEntityValue
				:location "223:4-223:52"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "attributeGroup"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_PartialEntityConstructor
				:type core_SingleEntityType
				:location "224:4-224:48"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "bindings"
				:upper -1
				:lower 0
				:isOrdered false
				:owner expressions_PartialEntityConstructor
				:type expressions_AttributeBinding
				:location "225:4-225:55"
				:isContainer true
			)]
		) ) ( def expressions_Coercion ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Operation]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "operand"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_Coercion
				:type core_Expression
				:location "230:4-230:35"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "targetType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_Coercion
				:type core_VariableType
				:location "231:4-231:40"
				:isContainer false
			)]
		) ) ( def expressions_Primary ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Expression]
			:structuralFeatures[]
		) ) ( def expressions_ActualParameter ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ActualParameter
				:type Integer
				:location "244:4-244:33"
			) ( struct-map
				KM3_Reference
				:name "inProcedureCall"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_ActualParameter
				:type statements_ProcedureCall
				:location "239:4-239:79"
				:isContainer false
				:opposite actualParameters
			) ( struct-map
				KM3_Reference
				:name "inFunctionCall"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_ActualParameter
				:type expressions_FunctionCall
				:location "240:4-240:77"
				:isContainer false
				:opposite actualParameters
			) ( struct-map
				KM3_Reference
				:name "formalParameter"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ActualParameter
				:type algorithms_Parameter
				:location "241:4-241:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "actualReferent"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_ActualParameter
				:type statements_VARExpression
				:location "242:4-242:50"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "actualValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_ActualParameter
				:type core_Expression
				:location "243:4-243:44"
				:isContainer false
			)]
		) ) ( def expressions_ParameterRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ParameterRef
				:type Identifier
				:location "249:4-249:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ParameterRef
				:type algorithms_Parameter
				:location "248:4-248:35"
				:isContainer false
			)]
		) ) ( def expressions_AttributeRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Selector]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AttributeRef
				:type Identifier
				:location "254:4-254:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AttributeRef
				:type core_Attribute
				:location "253:4-253:35"
				:isContainer false
			)]
		) ) ( def expressions_AggregateIndex ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_IndexOperation]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "indexValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AggregateIndex
				:type core_Expression
				:location "258:4-258:48"
				:isContainer true
			)]
		) ) ( def expressions_GroupRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Selector]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_GroupRef
				:type Identifier
				:location "263:4-263:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_GroupRef
				:type core_SingleEntityType
				:location "262:4-262:42"
				:isContainer false
			)]
		) ) ( def expressions_UnaryOperation ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Operation]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "operator"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_UnaryOperation
				:type UnaryOperator
				:location "268:4-268:39"
			) ( struct-map
				KM3_Reference
				:name "unaryOperand"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_UnaryOperation
				:type core_Expression
				:location "267:4-267:40"
				:isContainer false
			)]
		) ) ( def expressions_UsedInRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Selector]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "inverseOf"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_UsedInRef
				:type core_Attribute
				:location "272:4-272:36"
				:isContainer false
			)]
		) ) ( def expressions_ConstantRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ConstantRef
				:type Identifier
				:location "277:4-277:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ConstantRef
				:type instances_Constant
				:location "276:4-276:34"
				:isContainer false
			)]
		) ) ( def expressions_QueryExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_LocalScope core_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "selectCondition"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_QueryExpression
				:type core_Expression
				:location "281:4-281:53"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "queryVariable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_QueryExpression
				:type expressions_QueryVariable
				:location "282:4-282:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "aggregateOperand"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_QueryExpression
				:type core_Expression
				:location "283:4-283:44"
				:isContainer false
			)]
		) ) ( def expressions_QueryVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_NamedVariable]
			:structuralFeatures[]
		) ) ( def expressions_Operation ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Expression]
			:structuralFeatures[]
		) ) ( def expressions_AttributeBinding ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AttributeBinding
				:type Integer
				:location "298:4-298:33"
			) ( struct-map
				KM3_Reference
				:name "attributeValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AttributeBinding
				:type core_Expression
				:location "295:4-295:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "toValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_AttributeBinding
				:type instances_AttributeValue
				:location "296:4-296:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "attribute"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_AttributeBinding
				:type core_ExplicitAttribute
				:location "297:4-297:46"
				:isContainer false
			)]
		) ) ( def expressions_FunctionCall ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "actualParameters"
				:upper -1
				:lower 0
				:isOrdered false
				:owner expressions_FunctionCall
				:type expressions_ActualParameter
				:location "302:4-302:88"
				:isContainer true
				:opposite inFunctionCall
			) ( struct-map
				KM3_Reference
				:name "invokesFunction"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_FunctionCall
				:type algorithms_Function
				:location "303:4-303:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "returnsResult"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_FunctionCall
				:type algorithms_FunctionResult
				:location "304:4-304:45"
				:isContainer false
			)]
		) ) ( def expressions_MemberBinding ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_MemberBinding
				:type Integer
				:location "311:4-311:33"
			) ( struct-map
				KM3_Reference
				:name "repetition"
				:upper 1
				:lower 0
				:isOrdered false
				:owner expressions_MemberBinding
				:type expressions_RepeatCount
				:location "308:4-308:54"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "toSlot"
				:upper -1
				:lower 0
				:isOrdered false
				:owner expressions_MemberBinding
				:type instances_ListMember
				:location "309:4-309:37"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "memberValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_MemberBinding
				:type core_Expression
				:location "310:4-310:39"
				:isContainer false
			)]
		) ) ( def expressions_ExtentRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ExtentRef
				:type Identifier
				:location "316:4-316:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_ExtentRef
				:type core_NamedType
				:location "315:4-315:35"
				:isContainer false
			)]
		) ) ( def expressions_VariableRef ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[expressions_Primary]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_VariableRef
				:type Identifier
				:location "321:4-321:30"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner expressions_VariableRef
				:type algorithms_NamedVariable
				:location "320:4-320:39"
				:isContainer false
			)]
		) ) ( def ptyp_UnaryOperator ( struct-map
			KM3_DataType
			:name "UnaryOperator"
			:location "324:3-324:26"
		) ) ( def ptyp_BinaryOperator ( struct-map
			KM3_DataType
			:name "BinaryOperator"
			:location "326:3-326:27"
		) )]
	) ) ( def core ( struct-map
		KM3_Package
		:contents[( def core_TypeElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_NamedElement]
			:structuralFeatures[]
		) ) ( def core_SingleEntityType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "declaresExplicitAttribute"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SingleEntityType
				:type core_ExplicitAttribute
				:location "336:4-336:63"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "declaresAttribute"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SingleEntityType
				:type core_Attribute
				:location "337:4-337:77"
				:isContainer true
				:opposite ofEntity
			) ( struct-map
				KM3_Reference
				:name "declaredIn"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SingleEntityType
				:type core_EntityType
				:location "338:4-338:58"
				:isContainer false
				:opposite declares
			) ( struct-map
				KM3_Reference
				:name "equivalent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SingleEntityType
				:type core_PartialEntityType
				:location "339:4-339:45"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SingleEntityType
				:type core_ScopedId
				:location "340:4-340:38"
				:isContainer true
			)]
		) ) ( def core_AGGREGATEType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralizedType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_AGGREGATEType
				:type core_SizeConstraint
				:location "344:4-344:57"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "memberType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_AGGREGATEType
				:type core_ParameterType
				:location "345:4-345:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "constraint"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_AGGREGATEType
				:type algorithms_ActualStructureConstraint
				:location "346:4-346:87"
				:isContainer false
				:opposite matchingStructure
			) ( struct-map
				KM3_Reference
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_AGGREGATEType
				:type core_SizeConstraint
				:location "347:4-347:57"
				:isContainer true
			)]
		) ) ( def core_GeneralBAGType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralAggregationType]
			:structuralFeatures[]
		) ) ( def core_DomainRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DomainConstraint core_TypeElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_DomainRule
				:type Integer
				:location "355:4-355:33"
			)]
		) ) ( def core_GeneralAggregationType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_GeneralizedType core_AggregationType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_GeneralAggregationType
				:type core_GeneralizedType
				:location "359:4-359:43"
				:isContainer false
			)]
		) ) ( def core_ConcreteType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_InstantiableType]
			:structuralFeatures[]
		) ) ( def core_Expression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "text"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Expression
				:type ExpressText
				:location "370:4-370:38"
			) ( struct-map
				KM3_Reference
				:name "evaluation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Expression
				:type core_Instance
				:location "367:4-367:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "interpretationContext"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Expression
				:type core_Scope
				:location "368:4-368:49"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "dataType"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Expression
				:type core_DataType
				:location "369:4-369:39"
				:isContainer false
			)]
		) ) ( def core_InverseAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Attribute]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isUnique"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InverseAttribute
				:type Boolean
				:location "376:4-376:33"
			) ( struct-map
				KM3_Reference
				:name "modelsRole"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InverseAttribute
				:type core_DomainRole
				:location "374:4-374:59"
				:isContainer false
				:opposite rangeView
			) ( struct-map
				KM3_Reference
				:name "explicit"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InverseAttribute
				:type core_InvertibleAttribute
				:location "375:4-375:64"
				:isContainer false
				:opposite inverse
			)]
		) ) ( def core_EnumerationType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DefinedType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isExtensible"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_EnumerationType
				:type Boolean
				:location "384:4-384:37"
			) ( struct-map
				KM3_Reference
				:name "values"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EnumerationType
				:type instances_EnumerationItem
				:location "380:4-380:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "declaredItems"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EnumerationType
				:type instances_EnumerationItem
				:location "381:4-381:81"
				:isContainer true
				:opposite declaredIn
			) ( struct-map
				KM3_Reference
				:name "extension"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EnumerationType
				:type core_EnumerationType
				:location "382:4-382:61"
				:isContainer false
				:opposite base
			) ( struct-map
				KM3_Reference
				:name "base"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_EnumerationType
				:type core_EnumerationType
				:location "383:4-383:58"
				:isContainer false
				:opposite extension
			)]
		) ) ( def core_VariableType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_DataType core_AttributeType]
			:structuralFeatures[]
		) ) ( def core_ArrayBound ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "bound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_ArrayBound
				:type Integer
				:location "393:4-393:35"
			) ( struct-map
				KM3_Reference
				:name "boundExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ArrayBound
				:type core_Expression
				:location "392:4-392:43"
				:isContainer false
			)]
		) ) ( def core_GeneralSETType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralAggregationType]
			:structuralFeatures[]
		) ) ( def core_LISTType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ConcreteAggregationType]
			:structuralFeatures[]
		) ) ( def core_Redeclaration ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Redeclaration
				:type Integer
				:location "413:4-413:33"
			) ( struct-map
				KM3_Attribute
				:name "isMandatory"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type Boolean
				:location "414:4-414:41"
			) ( struct-map
				KM3_Reference
				:name "derivation"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_Expression
				:location "405:4-405:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "restrictedType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Redeclaration
				:type core_AttributeType
				:location "406:4-406:45"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "refines"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_Redeclaration
				:location "407:4-407:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_SizeConstraint
				:location "408:4-408:57"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_SizeConstraint
				:location "409:4-409:57"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "scope"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Redeclaration
				:type core_EntityType
				:location "410:4-410:59"
				:isContainer false
				:opposite redeclarations
			) ( struct-map
				KM3_Reference
				:name "originalAttribute"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Redeclaration
				:type core_Attribute
				:location "411:4-411:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "refinedRole"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_Role
				:location "412:4-412:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "alias"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Redeclaration
				:type core_ScopedId
				:location "415:4-415:46"
				:isContainer true
			)]
		) ) ( def core_EntityType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_NamedType core_InstantiableType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isAbstract"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_EntityType
				:type Boolean
				:location "430:4-430:35"
			) ( struct-map
				KM3_Reference
				:name "playsRole"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_Role
				:location "419:4-419:54"
				:isContainer false
				:opposite ofEntity
			) ( struct-map
				KM3_Reference
				:name "redeclarations"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_Redeclaration
				:location "420:4-420:75"
				:isContainer true
				:opposite scope
			) ( struct-map
				KM3_Reference
				:name "attributes"
				:upper -1
				:lower 0
				:isOrdered true
				:owner core_EntityType
				:type core_Attribute
				:location "421:4-421:82"
				:isContainer true
				:opposite owningEntity
			) ( struct-map
				KM3_Reference
				:name "playsRangeRole"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_RangeRole
				:location "422:4-422:61"
				:isContainer false
				:opposite range
			) ( struct-map
				KM3_Reference
				:name "declares"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_EntityType
				:type core_SingleEntityType
				:location "423:4-423:64"
				:isContainer false
				:opposite declaredIn
			) ( struct-map
				KM3_Reference
				:name "extension"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type rules_Extent
				:location "424:4-424:55"
				:isContainer false
				:opposite forType
			) ( struct-map
				KM3_Reference
				:name "invertibleAttributes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_InvertibleAttribute
				:location "425:4-425:87"
				:isContainer false
				:opposite referencingType
			) ( struct-map
				KM3_Reference
				:name "playsDomainRole"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_DomainRole
				:location "426:4-426:64"
				:isContainer false
				:opposite domain
			) ( struct-map
				KM3_Reference
				:name "uniqueRules"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_UniqueRule
				:location "427:4-427:60"
				:isContainer false
				:opposite domain
			) ( struct-map
				KM3_Reference
				:name "usedIn"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_InvertibleAttribute
				:location "428:4-428:67"
				:isContainer false
				:opposite rangeType
			) ( struct-map
				KM3_Reference
				:name "subtypeOf"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_EntityType
				:type core_EntityType
				:location "429:4-429:40"
				:isContainer false
			)]
		) ) ( def core_DataType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "instances"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_DataType
				:type core_Instance
				:location "434:4-434:56"
				:isContainer false
				:opposite ofType
			)]
		) ) ( def core_PartialEntityType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DataType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "components"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_PartialEntityType
				:type core_SingleEntityType
				:location "438:4-438:49"
				:isContainer false
			)]
		) ) ( def core_Schema ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Scope]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Schema
				:type Identifier
				:location "446:4-446:32"
			) ( struct-map
				KM3_Attribute
				:name "version"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Schema
				:type Identifier
				:location "447:4-447:40"
			) ( struct-map
				KM3_Reference
				:name "documentation"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Schema
				:type core_Remark
				:location "442:4-442:67"
				:isContainer false
				:opposite describesSchema
			) ( struct-map
				KM3_Reference
				:name "interfaces"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Schema
				:type core_InterfacedElement
				:location "443:4-443:87"
				:isContainer true
				:opposite interfacingSchema
			) ( struct-map
				KM3_Reference
				:name "schemaElements"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Schema
				:type core_SchemaElement
				:location "444:4-444:79"
				:isContainer true
				:opposite definedIn
			) ( struct-map
				KM3_Reference
				:name "interfacedElements"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Schema
				:type core_SchemaElement
				:location "445:4-445:76"
				:isContainer false
				:opposite referencedIn
			)]
		) ) ( def core_InvertibleAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ExplicitAttribute]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "inverse"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_InvertibleAttribute
				:type core_InverseAttribute
				:location "451:4-451:64"
				:isContainer false
				:opposite explicit
			) ( struct-map
				KM3_Reference
				:name "rangeType"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_InvertibleAttribute
				:type core_EntityType
				:location "452:4-452:60"
				:isContainer false
				:opposite usedIn
			) ( struct-map
				KM3_Reference
				:name "createsRelationship"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InvertibleAttribute
				:type core_Relationship
				:location "453:4-453:68"
				:isContainer false
				:opposite basedOn
			) ( struct-map
				KM3_Reference
				:name "referencingType"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_InvertibleAttribute
				:type core_EntityType
				:location "454:4-454:80"
				:isContainer false
				:opposite invertibleAttributes
			) ( struct-map
				KM3_Reference
				:name "modelsRole"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InvertibleAttribute
				:type core_RangeRole
				:location "455:4-455:59"
				:isContainer false
				:opposite domainView
			)]
		) ) ( def core_GeneralizedType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_ParameterType core_AttributeType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "occursIn"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_GeneralizedType
				:type core_ParameterType
				:location "459:4-459:64"
				:isContainer false
				:opposite contains
			)]
		) ) ( def core_InterfacedElement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isUSE"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InterfacedElement
				:type Boolean
				:location "465:4-465:30"
			) ( struct-map
				KM3_Reference
				:name "interfacingSchema"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InterfacedElement
				:type core_Schema
				:location "463:4-463:63"
				:isContainer false
				:opposite interfaces
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InterfacedElement
				:type core_SchemaElement
				:location "464:4-464:63"
				:isContainer false
				:opposite referencedAs
			) ( struct-map
				KM3_Reference
				:name "interfacedId"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_InterfacedElement
				:type core_ScopedId
				:location "466:4-466:53"
				:isContainer true
			)]
		) ) ( def core_NumericType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_SimpleType]
			:structuralFeatures[]
		) ) ( def core_DefinedType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_NamedType core_ConcreteType]
			:structuralFeatures[]
		) ) ( def core_UniqueRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_TypeElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_UniqueRule
				:type Integer
				:location "480:4-480:33"
			) ( struct-map
				KM3_Reference
				:name "domain"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_UniqueRule
				:type core_EntityType
				:location "478:4-478:57"
				:isContainer false
				:opposite uniqueRules
			) ( struct-map
				KM3_Reference
				:name "keyComponent"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_UniqueRule
				:type core_Attribute
				:location "479:4-479:44"
				:isContainer false
			)]
		) ) ( def core_DomainRole ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Role]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "rangeView"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_DomainRole
				:type core_InverseAttribute
				:location "484:4-484:70"
				:isContainer false
				:opposite modelsRole
			) ( struct-map
				KM3_Reference
				:name "domain"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_DomainRole
				:type core_EntityType
				:location "485:4-485:61"
				:isContainer false
				:opposite playsDomainRole
			) ( struct-map
				KM3_Reference
				:name "id"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_DomainRole
				:type core_ScopedId
				:location "486:4-486:43"
				:isContainer true
			)]
		) ) ( def core_DomainConstraint ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "domain"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_DomainConstraint
				:type core_AttributeType
				:location "490:4-490:60"
				:isContainer false
				:opposite constraints
			) ( struct-map
				KM3_Reference
				:name "asserts"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_DomainConstraint
				:type core_Expression
				:location "491:4-491:50"
				:isContainer true
			)]
		) ) ( def core_InstantiableType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_ParameterType core_VariableType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "fundamentalType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_InstantiableType
				:type core_InstantiableType
				:location "495:4-495:49"
				:isContainer false
			)]
		) ) ( def core_GeneralLISTType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralAggregationType]
			:structuralFeatures[]
		) ) ( def core_NamedElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "namespace"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_NamedElement
				:type core_Scope
				:location "503:4-503:57"
				:isContainer false
				:opposite namedElements
			) ( struct-map
				KM3_Reference
				:name "documentation"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_NamedElement
				:type core_Remark
				:location "504:4-504:68"
				:isContainer false
				:opposite describesElement
			) ( struct-map
				KM3_Reference
				:name "id"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_NamedElement
				:type core_ScopedId
				:location "505:4-505:43"
				:isContainer true
			)]
		) ) ( def core_Attribute ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_TypeElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isAbstract"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Attribute
				:type Boolean
				:location "511:4-511:35"
			) ( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Attribute
				:type Integer
				:location "512:4-512:33"
			) ( struct-map
				KM3_Reference
				:name "attributeType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Attribute
				:type core_AttributeType
				:location "509:4-509:60"
				:isContainer false
				:opposite role
			) ( struct-map
				KM3_Reference
				:name "ofEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Attribute
				:type core_SingleEntityType
				:location "510:4-510:71"
				:isContainer false
				:opposite declaresAttribute
			) ( struct-map
				KM3_Reference
				:name "owningEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Attribute
				:type core_EntityType
				:location "513:4-513:62"
				:isContainer false
				:opposite attributes
			)]
		) ) ( def core_BAGType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ConcreteAggregationType]
			:structuralFeatures[]
		) ) ( def core_RealType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_NumericType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "precision"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_RealType
				:type Integer
				:location "521:4-521:39"
			)]
		) ) ( def core_LogicType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_SimpleType]
			:structuralFeatures[]
		) ) ( def core_GenericType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralizedType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_GenericType
				:type Boolean
				:location "530:4-530:33"
			) ( struct-map
				KM3_Reference
				:name "constraint"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_GenericType
				:type algorithms_ActualTypeConstraint
				:location "529:4-529:77"
				:isContainer false
				:opposite matchingType
			)]
		) ) ( def core_StringType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_SimpleType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "stringLengthConstraint"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_StringType
				:type core_LengthConstraint
				:location "534:4-534:71"
				:isContainer true
			)]
		) ) ( def core_AnonymousType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_ConcreteType core_InstantiableType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "specializes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_AnonymousType
				:type core_AnonymousType
				:location "538:4-538:45"
				:isContainer false
			)]
		) ) ( def core_AlgorithmScope ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_LocalScope]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "commonElements"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_AlgorithmScope
				:type core_CommonElement
				:location "542:4-542:70"
				:isContainer false
				:opposite localScope
			) ( struct-map
				KM3_Reference
				:name "variables"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_AlgorithmScope
				:type algorithms_Variable
				:location "543:4-543:38"
				:isContainer false
			)]
		) ) ( def core_Instance ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "appearsInPopulation"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Instance
				:type instances_Population
				:location "547:4-547:81"
				:isContainer false
				:opposite compositionInstance
			) ( struct-map
				KM3_Reference
				:name "ofType"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_Instance
				:type core_DataType
				:location "548:4-548:58"
				:isContainer false
				:opposite instances
			)]
		) ) ( def core_AttributeType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "role"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_AttributeType
				:type core_Attribute
				:location "552:4-552:59"
				:isContainer false
				:opposite attributeType
			) ( struct-map
				KM3_Reference
				:name "constraints"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_AttributeType
				:type core_DomainConstraint
				:location "553:4-553:66"
				:isContainer false
				:opposite domain
			)]
		) ) ( def core_DerivedAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Attribute]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "derivation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_DerivedAttribute
				:type core_Expression
				:location "557:4-557:38"
				:isContainer false
			)]
		) ) ( def core_RangeRole ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Role]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "domainView"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_RangeRole
				:type core_InvertibleAttribute
				:location "561:4-561:69"
				:isContainer false
				:opposite modelsRole
			) ( struct-map
				KM3_Reference
				:name "range"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_RangeRole
				:type core_EntityType
				:location "562:4-562:59"
				:isContainer false
				:opposite playsRangeRole
			) ( struct-map
				KM3_Reference
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_RangeRole
				:type core_ScopedId
				:location "563:4-563:38"
				:isContainer true
			)]
		) ) ( def core_LocalElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_NamedElement]
			:structuralFeatures[]
		) ) ( def core_Remark ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isTagged"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Remark
				:type Boolean
				:location "574:4-574:33"
			) ( struct-map
				KM3_Attribute
				:name "isTail"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Remark
				:type Boolean
				:location "575:4-575:31"
			) ( struct-map
				KM3_Attribute
				:name "text"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Remark
				:type ExpressText
				:location "576:4-576:33"
			) ( struct-map
				KM3_Reference
				:name "describesSchema"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Remark
				:type core_Schema
				:location "571:4-571:67"
				:isContainer false
				:opposite documentation
			) ( struct-map
				KM3_Reference
				:name "appearsIn"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Remark
				:type core_Scope
				:location "572:4-572:59"
				:isContainer false
				:opposite includesRemarks
			) ( struct-map
				KM3_Reference
				:name "describesElement"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Remark
				:type core_NamedElement
				:location "573:4-573:74"
				:isContainer false
				:opposite documentation
			)]
		) ) ( def core_SizeConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DomainConstraint]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "bound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_SizeConstraint
				:type Integer
				:location "580:4-580:35"
			)]
		) ) ( def core_Role ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "inRelationship"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Role
				:type core_Relationship
				:location "584:4-584:61"
				:isContainer false
				:opposite roles
			) ( struct-map
				KM3_Reference
				:name "ofEntity"
				:upper -1
				:lower 1
				:isOrdered false
				:owner core_Role
				:type core_EntityType
				:location "585:4-585:62"
				:isContainer false
				:opposite playsRole
			) ( struct-map
				KM3_Reference
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Role
				:type core_SizeConstraint
				:location "586:4-586:47"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_Role
				:type core_SizeConstraint
				:location "587:4-587:47"
				:isContainer false
			)]
		) ) ( def core_SETType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ConcreteAggregationType]
			:structuralFeatures[]
		) ) ( def core_SpecializedType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DefinedType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "underlyingType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SpecializedType
				:type core_ConcreteType
				:location "595:4-595:44"
				:isContainer false
			)]
		) ) ( def core_GeneralARRAYType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GeneralAggregationType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isOptional"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_GeneralARRAYType
				:type Boolean
				:location "601:4-601:35"
			) ( struct-map
				KM3_Reference
				:name "hiIndex"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_GeneralARRAYType
				:type core_ArrayBound
				:location "599:4-599:50"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "loIndex"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_GeneralARRAYType
				:type core_ArrayBound
				:location "600:4-600:50"
				:isContainer true
			)]
		) ) ( def core_Relationship ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "domain"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Relationship
				:type core_DomainRole
				:location "605:4-605:34"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "roles"
				:upper 2
				:lower 2
				:isOrdered false
				:owner core_Relationship
				:type core_Role
				:location "606:4-606:58"
				:isContainer false
				:opposite inRelationship
			) ( struct-map
				KM3_Reference
				:name "basedOn"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Relationship
				:type core_InvertibleAttribute
				:location "607:4-607:75"
				:isContainer false
				:opposite createsRelationship
			) ( struct-map
				KM3_Reference
				:name "range"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_Relationship
				:type core_RangeRole
				:location "608:4-608:32"
				:isContainer false
			)]
		) ) ( def core_LengthConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DomainConstraint]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "maxLength"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_LengthConstraint
				:type Integer
				:location "612:4-612:39"
			) ( struct-map
				KM3_Attribute
				:name "isFixed"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_LengthConstraint
				:type Boolean
				:location "613:4-613:32"
			)]
		) ) ( def core_LocalScope ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Scope]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "localElements"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_LocalScope
				:type core_LocalElement
				:location "617:4-617:46"
				:isContainer false
			)]
		) ) ( def core_NamedType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_InstantiableType core_Scope core_CommonElement core_AttributeType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "instantiates"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_NamedType
				:type core_SelectType
				:location "621:4-621:67"
				:isContainer false
				:opposite allowedTypes
			) ( struct-map
				KM3_Reference
				:name "domainRules"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_NamedType
				:type core_DomainRule
				:location "622:4-622:42"
				:isContainer false
			)]
		) ) ( def core_BinaryType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_SimpleType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "binaryLengthConstraint"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_BinaryType
				:type core_LengthConstraint
				:location "626:4-626:71"
				:isContainer true
			)]
		) ) ( def core_ScopedId ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "localName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ScopedId
				:type Identifier
				:location "630:4-630:37"
			) ( struct-map
				KM3_Reference
				:name "definingScope"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ScopedId
				:type core_Scope
				:location "631:4-631:36"
				:isContainer false
			)]
		) ) ( def core_AggregationType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isUnique"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_AggregationType
				:type Boolean
				:location "637:4-637:33"
			) ( struct-map
				KM3_Attribute
				:name "ordering"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_AggregationType
				:type OrderingKind
				:location "638:4-638:38"
			) ( struct-map
				KM3_Reference
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_AggregationType
				:type core_SizeConstraint
				:location "635:4-635:57"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_AggregationType
				:type core_SizeConstraint
				:location "636:4-636:57"
				:isContainer true
			)]
		) ) ( def core_Scope ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "namedElements"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Scope
				:type core_NamedElement
				:location "642:4-642:77"
				:isContainer true
				:opposite namespace
			) ( struct-map
				KM3_Reference
				:name "includesRemarks"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_Scope
				:type core_Remark
				:location "643:4-643:63"
				:isContainer false
				:opposite appearsIn
			)]
		) ) ( def core_ParameterType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "contains"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_ParameterType
				:type core_GeneralizedType
				:location "647:4-647:64"
				:isContainer false
				:opposite occursIn
			)]
		) ) ( def core_SelectType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_DefinedType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isExtensible"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SelectType
				:type Boolean
				:location "655:4-655:37"
			) ( struct-map
				KM3_Attribute
				:name "isEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SelectType
				:type Boolean
				:location "656:4-656:33"
			) ( struct-map
				KM3_Reference
				:name "allowedTypes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SelectType
				:type core_NamedType
				:location "651:4-651:66"
				:isContainer false
				:opposite instantiates
			) ( struct-map
				KM3_Reference
				:name "extension"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SelectType
				:type core_SelectType
				:location "652:4-652:56"
				:isContainer false
				:opposite base
			) ( struct-map
				KM3_Reference
				:name "base"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SelectType
				:type core_SelectType
				:location "653:4-653:53"
				:isContainer false
				:opposite extension
			) ( struct-map
				KM3_Reference
				:name "selectList"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SelectType
				:type core_NamedType
				:location "654:4-654:40"
				:isContainer false
			)]
		) ) ( def core_ActualType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_VariableType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "scope"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ActualType
				:type algorithms_Algorithm
				:location "660:4-660:32"
				:isContainer false
			)]
		) ) ( def core_ExplicitAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Attribute]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isOptional"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ExplicitAttribute
				:type Boolean
				:location "664:4-664:35"
			)]
		) ) ( def core_SimpleType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_AnonymousType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_SimpleType
				:type Keyword
				:location "668:4-668:27"
			)]
		) ) ( def core_CommonElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_SchemaElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "localScope"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_CommonElement
				:type core_AlgorithmScope
				:location "672:4-672:73"
				:isContainer false
				:opposite commonElements
			)]
		) ) ( def core_SchemaElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_NamedElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "referencedAs"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SchemaElement
				:type core_InterfacedElement
				:location "676:4-676:70"
				:isContainer false
				:opposite refersTo
			) ( struct-map
				KM3_Reference
				:name "referencedIn"
				:upper -1
				:lower 0
				:isOrdered false
				:owner core_SchemaElement
				:type core_Schema
				:location "677:4-677:69"
				:isContainer false
				:opposite interfacedElements
			) ( struct-map
				KM3_Reference
				:name "definedIn"
				:upper 1
				:lower 0
				:isOrdered false
				:owner core_SchemaElement
				:type core_Schema
				:location "678:4-678:64"
				:isContainer false
				:opposite schemaElements
			)]
		) ) ( def core_ConcreteAggregationType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_AnonymousType core_AggregationType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ConcreteAggregationType
				:type core_InstantiableType
				:location "682:4-682:44"
				:isContainer false
			)]
		) ) ( def core_ARRAYType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ConcreteAggregationType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isOptional"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ARRAYType
				:type Boolean
				:location "688:4-688:35"
			) ( struct-map
				KM3_Reference
				:name "loIndex"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ARRAYType
				:type core_ArrayBound
				:location "686:4-686:45"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "hiIndex"
				:upper 1
				:lower 1
				:isOrdered false
				:owner core_ARRAYType
				:type core_ArrayBound
				:location "687:4-687:45"
				:isContainer true
			)]
		) ) ( def ptyp_Keyword ( struct-map
			KM3_DataType
			:name "Keyword"
			:location "691:3-691:20"
		) ) ( def ptyp_ExpressText ( struct-map
			KM3_DataType
			:name "ExpressText"
			:location "693:3-693:24"
		) ) ( def ptyp_Identifier ( struct-map
			KM3_DataType
			:name "Identifier"
			:location "695:3-695:23"
		) ) ( def ptyp_OrderingKind ( struct-map
			KM3_DataType
			:name "OrderingKind"
			:location "697:3-697:25"
		) )]
	) ) ( def java ( struct-map
		KM3_Package
		:contents[( def lang ( struct-map
			KM3_Package
			:contents[( def ptyp_int ( struct-map
				KM3_DataType
				:name "int"
				:location "704:4-704:17"
			) ) ( def ptyp_void ( struct-map
				KM3_DataType
				:name "void"
				:location "706:4-706:18"
			) )]
		) )]
	) ) ( def algorithms ( struct-map
		KM3_Package
		:contents[( def algorithms_ActualTypeConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "label"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualTypeConstraint
				:type Identifier
				:location "715:4-715:33"
			) ( struct-map
				KM3_Reference
				:name "matchingType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualTypeConstraint
				:type core_GenericType
				:location "713:4-713:63"
				:isContainer false
				:opposite constraint
			) ( struct-map
				KM3_Reference
				:name "requiredType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualTypeConstraint
				:type algorithms_ActualDataType
				:location "714:4-714:44"
				:isContainer false
			)]
		) ) ( def algorithms_FunctionResult ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Variable]
			:structuralFeatures[]
		) ) ( def algorithms_Function ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Algorithm]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "result"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_Function
				:type algorithms_FunctionResult
				:location "723:4-723:48"
				:isContainer true
			)]
		) ) ( def algorithms_InParameter ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Parameter]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "variable"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_InParameter
				:type algorithms_InVariable
				:location "727:4-727:54"
				:isContainer false
				:opposite source
			)]
		) ) ( def algorithms_LocalVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Variable]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "initialValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_LocalVariable
				:type core_Expression
				:location "731:4-731:45"
				:isContainer false
			)]
		) ) ( def algorithms_ActualStructure ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_GenericElement core_AGGREGATEType]
			:structuralFeatures[]
		) ) ( def algorithms_ActualGenericType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ActualType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isEntity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualGenericType
				:type Boolean
				:location "740:4-740:33"
			) ( struct-map
				KM3_Attribute
				:name "label"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualGenericType
				:type Identifier
				:location "741:4-741:33"
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualGenericType
				:type algorithms_ActualDataType
				:location "739:4-739:40"
				:isContainer false
			)]
		) ) ( def algorithms_Statement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "text"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type ExpressText
				:location "750:4-750:38"
			) ( struct-map
				KM3_Reference
				:name "inBlock"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type statements_StatementBlock
				:location "745:4-745:80"
				:isContainer false
				:opposite bodyStatements_Statement
			) ( struct-map
				KM3_Reference
				:name "bodyStatementsSkipStatement"
				:upper -1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type statements_SkipStatement
				:location "746:4-746:71"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "bodyStatementsEscapeStatement"
				:upper -1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type statements_EscapeStatement
				:location "747:4-747:75"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "controlledBy"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type statements_RepeatStatement
				:location "748:4-748:66"
				:isContainer false
				:opposite body
			) ( struct-map
				KM3_Reference
				:name "implements"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_Statement
				:type algorithms_Algorithm
				:location "749:4-749:58"
				:isContainer false
				:opposite body
			)]
		) ) ( def algorithms_NamedVariable ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_LocalElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "variableType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_NamedVariable
				:type core_VariableType
				:location "754:4-754:42"
				:isContainer false
			)]
		) ) ( def algorithms_InVariable ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Variable]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "source"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_InVariable
				:type algorithms_InParameter
				:location "758:4-758:55"
				:isContainer false
				:opposite variable
			)]
		) ) ( def algorithms_Procedure ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Algorithm]
			:structuralFeatures[]
		) ) ( def algorithms_ActualARRAYType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_ActualAggregationType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isOptional"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualARRAYType
				:type Boolean
				:location "768:4-768:35"
			) ( struct-map
				KM3_Reference
				:name "hiIndex"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualARRAYType
				:type core_ArrayBound
				:location "766:4-766:45"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "loIndex"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualARRAYType
				:type core_ArrayBound
				:location "767:4-767:45"
				:isContainer true
			)]
		) ) ( def algorithms_ActualSETType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_ActualAggregationType]
			:structuralFeatures[]
		) ) ( def algorithms_ActualAGGREGATEType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_ActualType]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "label"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualAGGREGATEType
				:type Identifier
				:location "780:4-780:33"
			) ( struct-map
				KM3_Reference
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_ActualAGGREGATEType
				:type core_SizeConstraint
				:location "776:4-776:57"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualAGGREGATEType
				:type algorithms_ActualStructure
				:location "777:4-777:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "memberType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualAGGREGATEType
				:type core_VariableType
				:location "778:4-778:40"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_ActualAGGREGATEType
				:type core_SizeConstraint
				:location "779:4-779:57"
				:isContainer true
			)]
		) ) ( def algorithms_Parameter ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_LocalElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "inout"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_Parameter
				:type Boolean
				:location "787:4-787:30"
			) ( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_Parameter
				:type Integer
				:location "788:4-788:33"
			) ( struct-map
				KM3_Reference
				:name "structureConstraints"
				:upper -1
				:lower 0
				:isOrdered false
				:owner algorithms_Parameter
				:type algorithms_ActualStructureConstraint
				:location "784:4-784:76"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "typeConstraints"
				:upper -1
				:lower 0
				:isOrdered false
				:owner algorithms_Parameter
				:type algorithms_ActualTypeConstraint
				:location "785:4-785:66"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "formalParameterType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_Parameter
				:type core_ParameterType
				:location "786:4-786:50"
				:isContainer false
			)]
		) ) ( def algorithms_ActualStructureConstraint ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "label"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualStructureConstraint
				:type Identifier
				:location "794:4-794:33"
			) ( struct-map
				KM3_Reference
				:name "matchingStructure"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualStructureConstraint
				:type core_AGGREGATEType
				:location "792:4-792:70"
				:isContainer false
				:opposite constraint
			) ( struct-map
				KM3_Reference
				:name "requiredStructure"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualStructureConstraint
				:type algorithms_ActualStructure
				:location "793:4-793:50"
				:isContainer false
			)]
		) ) ( def algorithms_Algorithm ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_AlgorithmScope core_CommonElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 0
				:isOrdered false
				:owner algorithms_Algorithm
				:type algorithms_Statement
				:location "798:4-798:68"
				:isContainer true
				:opposite implements
			) ( struct-map
				KM3_Reference
				:name "formalParameters"
				:upper -1
				:lower 0
				:isOrdered false
				:owner algorithms_Algorithm
				:type algorithms_Parameter
				:location "799:4-799:46"
				:isContainer false
			)]
		) ) ( def algorithms_ActualAggregationType ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_ActualType core_AggregationType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_ActualAggregationType
				:type core_ActualType
				:location "803:4-803:38"
				:isContainer false
			)]
		) ) ( def algorithms_VARVariable ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[]
		) ) ( def algorithms_ActualLISTType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_ActualAggregationType]
			:structuralFeatures[]
		) ) ( def algorithms_Variable ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[algorithms_NamedVariable]
			:structuralFeatures[]
		) ) ( def algorithms_GenericElement ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_LocalElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "source"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_GenericElement
				:type algorithms_Parameter
				:location "819:4-819:33"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "label"
				:upper 1
				:lower 1
				:isOrdered false
				:owner algorithms_GenericElement
				:type core_ScopedId
				:location "820:4-820:41"
				:isContainer true
			)]
		) ) ( def algorithms_VARParameter ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_Parameter algorithms_VARVariable]
			:structuralFeatures[]
		) ) ( def algorithms_ActualDataType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_GenericType algorithms_GenericElement]
			:structuralFeatures[]
		) ) ( def algorithms_ActualBAGType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[algorithms_ActualAggregationType]
			:structuralFeatures[]
		) )]
	) ) ( def instances ( struct-map
		KM3_Package
		:contents[( def instances_AttributeValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "actualValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner instances_AttributeValue
				:type core_Instance
				:location "839:4-839:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "attribute"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_AttributeValue
				:type core_ExplicitAttribute
				:location "840:4-840:46"
				:isContainer false
			)]
		) ) ( def instances_ARRAYValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_AggregateValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberSlot"
				:upper -1
				:lower 1
				:isOrdered false
				:owner instances_ARRAYValue
				:type instances_ArrayMember
				:location "844:4-844:54"
				:isContainer true
			)]
		) ) ( def instances_RoleName ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_StringValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_RoleName
				:type core_Attribute
				:location "848:4-848:35"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "represents"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_RoleName
				:type core_ScopedId
				:location "849:4-849:46"
				:isContainer true
			)]
		) ) ( def instances_EntityInstance ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_TypedInstance]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "id"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_EntityInstance
				:type EntityName
				:location "855:4-855:30"
			) ( struct-map
				KM3_Reference
				:name "state"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_EntityInstance
				:type instances_EntityValue
				:location "853:4-853:55"
				:isContainer false
				:opposite describes
			) ( struct-map
				KM3_Reference
				:name "instanceOf"
				:upper -1
				:lower 1
				:isOrdered false
				:owner instances_EntityInstance
				:type core_EntityType
				:location "854:4-854:43"
				:isContainer false
			)]
		) ) ( def instances_IntegerValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_RealValue]
			:structuralFeatures[]
		) ) ( def instances_AggregateValue ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[instances_ConcreteValue]
			:structuralFeatures[]
		) ) ( def instances_Constant ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_CommonElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "valueExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_Constant
				:type core_Expression
				:location "867:4-867:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "actualValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner instances_Constant
				:type core_Instance
				:location "868:4-868:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "dataType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_Constant
				:type core_InstantiableType
				:location "869:4-869:42"
				:isContainer false
			)]
		) ) ( def instances_LogicalValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_SimpleValue]
			:structuralFeatures[]
		) ) ( def instances_TypedInstance ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Instance]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "satisfiesType"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_TypedInstance
				:type core_SelectType
				:location "877:4-877:44"
				:isContainer false
			)]
		) ) ( def instances_ListMember ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_ListMember
				:type Integer
				:location "882:4-882:33"
			) ( struct-map
				KM3_Reference
				:name "memberValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_ListMember
				:type core_Instance
				:location "881:4-881:37"
				:isContainer false
			)]
		) ) ( def instances_BagMember ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "count"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_BagMember
				:type Integer
				:location "887:4-887:30"
			) ( struct-map
				KM3_Reference
				:name "memberValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_BagMember
				:type core_Instance
				:location "886:4-886:37"
				:isContainer false
			)]
		) ) ( def instances_SingleEntityValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "equivalent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_SingleEntityValue
				:type instances_PartialEntityValue
				:location "891:4-891:46"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "ofType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_SingleEntityValue
				:type core_SingleEntityType
				:location "892:4-892:40"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "properties"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_SingleEntityValue
				:type instances_AttributeValue
				:location "893:4-893:55"
				:isContainer true
			)]
		) ) ( def instances_Indeterminate ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Instance]
			:structuralFeatures[]
		) ) ( def instances_SingleLeafInstance ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_EntityInstance]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "characterizingType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_SingleLeafInstance
				:type core_EntityType
				:location "901:4-901:46"
				:isContainer false
			)]
		) ) ( def instances_GenericAggregate ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_LISTValue]
			:structuralFeatures[]
		) ) ( def instances_BinaryValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_SimpleValue]
			:structuralFeatures[]
		) ) ( def instances_SpecializedValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_TypedInstance]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "fundamentalValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_SpecializedValue
				:type instances_ConcreteValue
				:location "913:4-913:47"
				:isContainer false
			)]
		) ) ( def instances_BAGValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_AggregateValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberSlot"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_BAGValue
				:type instances_BagMember
				:location "917:4-917:50"
				:isContainer true
			)]
		) ) ( def instances_EnumerationItem ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_TypeElement instances_TypedInstance instances_ConcreteValue]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "position"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_EnumerationItem
				:type Integer
				:location "922:4-922:33"
			) ( struct-map
				KM3_Reference
				:name "declaredIn"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_EnumerationItem
				:type core_EnumerationType
				:location "921:4-921:68"
				:isContainer false
				:opposite declaredItems
			)]
		) ) ( def instances_EntityValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_PartialEntityValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "correspondsTo"
				:upper -1
				:lower 1
				:isOrdered false
				:owner instances_EntityValue
				:type core_EntityType
				:location "926:4-926:46"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "describes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_EntityValue
				:type instances_EntityInstance
				:location "927:4-927:61"
				:isContainer false
				:opposite state
			)]
		) ) ( def instances_SETValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_AggregateValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberValue"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_SETValue
				:type core_Instance
				:location "931:4-931:40"
				:isContainer false
			)]
		) ) ( def instances_ArrayMember ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "index"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_ArrayMember
				:type Integer
				:location "936:4-936:30"
			) ( struct-map
				KM3_Reference
				:name "memberValue"
				:upper 1
				:lower 0
				:isOrdered false
				:owner instances_ArrayMember
				:type core_Instance
				:location "935:4-935:42"
				:isContainer false
			)]
		) ) ( def instances_Population ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "compositionEntityInstance"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_Population
				:type instances_EntityInstance
				:location "940:4-940:60"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "compositionInstance"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_Population
				:type core_Instance
				:location "941:4-941:79"
				:isContainer false
				:opposite appearsInPopulation
			) ( struct-map
				KM3_Reference
				:name "governingSchema"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_Population
				:type core_Schema
				:location "942:4-942:42"
				:isContainer false
			)]
		) ) ( def instances_RealValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_NumberValue]
			:structuralFeatures[]
		) ) ( def instances_BooleanValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_LogicalValue]
			:structuralFeatures[]
		) ) ( def instances_LISTValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Instance instances_AggregateValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "memberSlot"
				:upper -1
				:lower 0
				:isOrdered false
				:owner instances_LISTValue
				:type instances_ListMember
				:location "954:4-954:51"
				:isContainer true
			)]
		) ) ( def instances_StringValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_SimpleValue]
			:structuralFeatures[]
		) ) ( def instances_TypeName ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_StringValue]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "refersTo"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_TypeName
				:type core_NamedType
				:location "962:4-962:35"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "represents"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_TypeName
				:type core_ScopedId
				:location "963:4-963:46"
				:isContainer true
			)]
		) ) ( def instances_PartialEntityValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[core_Instance]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "components"
				:upper -1
				:lower 1
				:isOrdered false
				:owner instances_PartialEntityValue
				:type instances_SingleEntityValue
				:location "967:4-967:60"
				:isContainer true
			)]
		) ) ( def instances_NumberValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_SimpleValue]
			:structuralFeatures[]
		) ) ( def instances_MultiLeafInstance ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[instances_EntityInstance]
			:structuralFeatures[]
		) ) ( def instances_SimpleValue ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[instances_ConcreteValue]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner instances_SimpleValue
				:type String
				:location "979:4-979:28"
			)]
		) ) ( def instances_ConcreteValue ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[core_Instance]
			:structuralFeatures[]
		) ) ( def ptyp_EntityName ( struct-map
			KM3_DataType
			:name "EntityName"
			:location "986:3-986:23"
		) )]
	) )]
) )
