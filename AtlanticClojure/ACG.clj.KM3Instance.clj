( declare ACG_LocatedElement )
( declare ACG_ACG )
( declare ACG_ACGElement )
( declare ACG_Function )
( declare ACG_Attribute )
( declare ACG_Parameter )
( declare ACG_Node )
( declare ACG_ASMNode )
( declare ACG_CodeNode )
( declare ACG_SimpleNode )
( declare ACG_StatementBlock )
( declare ACG_Statement )
( declare ACG_CompoundStat )
( declare ACG_ForEachStat )
( declare ACG_OnceStat )
( declare ACG_VariableStat )
( declare ACG_OperationStat )
( declare ACG_ConditionalStat )
( declare ACG_LetStat )
( declare ACG_AnalyzeStat )
( declare ACG_ReportStat )
( declare ACG_Severity )
( declare ACG_FieldStat )
( declare ACG_ParamStat )
( declare ACG_EmitStat )
( declare ACG_LabelStat )
( declare ACG_NewStat )
( declare ACG_DupStat )
( declare ACG_DupX1Stat )
( declare ACG_PopStat )
( declare ACG_SwapStat )
( declare ACG_IterateStat )
( declare ACG_EndIterateStat )
( declare ACG_GetAsmStat )
( declare ACG_FindMEStat )
( declare ACG_PushTStat )
( declare ACG_PushFStat )
( declare ACG_EmitWithOperandStat )
( declare ACG_PushStat )
( declare ACG_PushIStat )
( declare ACG_PushDStat )
( declare ACG_LoadStat )
( declare ACG_StoreStat )
( declare ACG_CallStat )
( declare ACG_PCallStat )
( declare ACG_SuperCallStat )
( declare ACG_GetStat )
( declare ACG_SetStat )
( declare ACG_EmitWithLabelRefStat )
( declare ACG_IfStat )
( declare ACG_GotoStat )
( declare ACG_VariableDecl )
( declare ACG_Expression )
( declare ACG_VariableExp )
( declare ACG_SelfExp )
( declare ACG_LastExp )
( declare ACG_IfExp )
( declare ACG_IsAExp )
( declare ACG_LetExp )
( declare ACG_PropertyCallExp )
( declare ACG_NavigationExp )
( declare ACG_IteratorExp )
( declare ACG_OperationCallExp )
( declare ACG_OperatorCallExp )
( declare ACG_LiteralExp )
( declare ACG_OclUndefinedExp )
( declare ACG_CollectionExp )
( declare ACG_SequenceExp )
( declare ACG_BooleanExp )
( declare ACG_IntegerExp )
( declare ACG_StringExp )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ACG ( struct-map
	KM3_Package
	:contents[( def Severity ( :literals[( struct-map
		KM3_EnumLiteral
		:name "critic"
		:location "107:3-107:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "error"
		:location "108:3-108:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "warning"
		:location "109:3-109:19"
	)] ) ) ( def ACG_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LocatedElement
			:type String
			:location "10:3-10:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_LocatedElement
			:type String
			:location "11:3-11:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_LocatedElement
			:type String
			:location "12:3-12:47"
		)]
	) ) ( def ACG_ACG ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "metamodel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ACG
			:type String
			:location "16:3-16:32"
		) ( struct-map
			KM3_Attribute
			:name "startsWith"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ACG
			:type String
			:location "17:3-17:33"
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_ACG
			:type ACG_ACGElement
			:location "18:3-18:71"
			:isContainer true
			:opposite acg
		)]
	) ) ( def ACG_ACGElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "acg"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ACGElement
			:type ACG_ACG
			:location "22:3-22:43"
			:isContainer false
			:opposite elements
		)]
	) ) ( def ACG_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_ACGElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Function
			:type String
			:location "26:3-26:30"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Function
			:type String
			:location "27:3-27:27"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_Function
			:type ACG_Parameter
			:location "28:3-28:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Function
			:type ACG_Expression
			:location "29:3-29:41"
			:isContainer true
		)]
	) ) ( def ACG_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_ACGElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Attribute
			:type String
			:location "33:3-33:30"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Attribute
			:type String
			:location "34:3-34:27"
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Attribute
			:type ACG_Expression
			:location "35:3-35:41"
			:isContainer true
		)]
	) ) ( def ACG_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_VariableDecl]
		:structuralFeatures[]
	) ) ( def ACG_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_ACGElement ACG_StatementBlock]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_Node
			:type String
			:location "42:3-42:30"
		) ( struct-map
			KM3_Attribute
			:name "mode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ACG_Node
			:type String
			:location "43:3-43:32"
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ACG_Node
			:type ACG_Expression
			:location "44:3-44:47"
			:isContainer true
		)]
	) ) ( def ACG_ASMNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ASMNode
			:type ACG_Expression
			:location "48:3-48:41"
			:isContainer true
		)]
	) ) ( def ACG_CodeNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Node]
		:structuralFeatures[]
	) ) ( def ACG_SimpleNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Node]
		:structuralFeatures[]
	) ) ( def ACG_StatementBlock ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_StatementBlock
			:type ACG_Statement
			:location "58:3-58:57"
			:isContainer true
		)]
	) ) ( def ACG_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[]
	) ) ( def ACG_CompoundStat ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_Statement ACG_StatementBlock]
		:structuralFeatures[]
	) ) ( def ACG_ForEachStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ForEachStat
			:type ACG_VariableDecl
			:location "69:3-69:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "collection"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ForEachStat
			:type ACG_Expression
			:location "70:3-70:47"
			:isContainer true
		)]
	) ) ( def ACG_OnceStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[]
	) ) ( def ACG_VariableStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_VariableStat
			:type ACG_Expression
			:location "76:3-76:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_VariableStat
			:type ACG_Expression
			:location "77:3-77:41"
			:isContainer true
		)]
	) ) ( def ACG_OperationStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_OperationStat
			:type ACG_Expression
			:location "81:3-81:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_OperationStat
			:type ACG_Expression
			:location "82:3-82:41"
			:isContainer true
		)]
	) ) ( def ACG_ConditionalStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ConditionalStat
			:type ACG_Expression
			:location "86:3-86:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStatements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_ConditionalStat
			:type ACG_Statement
			:location "87:3-87:61"
			:isContainer true
		)]
	) ) ( def ACG_LetStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LetStat
			:type ACG_VariableDecl
			:location "91:3-91:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LetStat
			:type ACG_Expression
			:location "92:3-92:42"
			:isContainer true
		)]
	) ) ( def ACG_AnalyzeStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CompoundStat]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ACG_AnalyzeStat
			:type String
			:location "97:3-97:32"
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_AnalyzeStat
			:type ACG_Expression
			:location "96:3-96:43"
			:isContainer true
		)]
	) ) ( def ACG_ReportStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "severity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ReportStat
			:type Severity
			:location "102:3-102:33"
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ReportStat
			:type ACG_Expression
			:location "103:3-103:44"
			:isContainer true
		)]
	) ) ( def ACG_FieldStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_FieldStat
			:type ACG_Expression
			:location "113:3-113:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_FieldStat
			:type ACG_Expression
			:location "114:3-114:41"
			:isContainer true
		)]
	) ) ( def ACG_ParamStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ParamStat
			:type ACG_Expression
			:location "118:3-118:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_ParamStat
			:type ACG_Expression
			:location "119:3-119:41"
			:isContainer true
		)]
	) ) ( def ACG_EmitStat ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_Statement]
		:structuralFeatures[]
	) ) ( def ACG_LabelStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LabelStat
			:type String
			:location "126:3-126:27"
		) ( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ACG_LabelStat
			:type ACG_Expression
			:location "127:3-127:44"
			:isContainer true
		)]
	) ) ( def ACG_NewStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_DupStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_DupX1Stat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_PopStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_SwapStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_IterateStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_EndIterateStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_GetAsmStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_FindMEStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_PushTStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_PushFStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitStat]
		:structuralFeatures[]
	) ) ( def ACG_EmitWithOperandStat ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_EmitStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_EmitWithOperandStat
			:type ACG_Expression
			:location "154:3-154:44"
			:isContainer true
		)]
	) ) ( def ACG_PushStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_PushIStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_PushDStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_LoadStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_StoreStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_CallStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_PCallStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_SuperCallStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_GetStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_SetStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithOperandStat]
		:structuralFeatures[]
	) ) ( def ACG_EmitWithLabelRefStat ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_EmitStat]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_EmitWithLabelRefStat
			:type ACG_LabelStat
			:location "180:3-180:31"
			:isContainer false
		)]
	) ) ( def ACG_IfStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithLabelRefStat]
		:structuralFeatures[]
	) ) ( def ACG_GotoStat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_EmitWithLabelRefStat]
		:structuralFeatures[]
	) ) ( def ACG_VariableDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_VariableDecl
			:type String
			:location "191:3-191:27"
		)]
	) ) ( def ACG_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_LocatedElement]
		:structuralFeatures[]
	) ) ( def ACG_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_VariableExp
			:type ACG_VariableDecl
			:location "199:3-199:37"
			:isContainer false
		)]
	) ) ( def ACG_SelfExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[]
	) ) ( def ACG_LastExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[]
	) ) ( def ACG_IfExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IfExp
			:type ACG_Expression
			:location "207:3-207:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IfExp
			:type ACG_Expression
			:location "208:3-208:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IfExp
			:type ACG_Expression
			:location "209:3-209:44"
			:isContainer true
		)]
	) ) ( def ACG_IsAExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IsAExp
			:type String
			:location "214:3-214:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IsAExp
			:type ACG_Expression
			:location "213:3-213:43"
			:isContainer true
		)]
	) ) ( def ACG_LetExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LetExp
			:type ACG_VariableDecl
			:location "218:3-218:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LetExp
			:type ACG_Expression
			:location "219:3-219:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "in"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_LetExp
			:type ACG_Expression
			:location "220:3-220:39"
			:isContainer true
		)]
	) ) ( def ACG_PropertyCallExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_PropertyCallExp
			:type String
			:location "226:3-226:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_PropertyCallExp
			:type ACG_Expression
			:location "225:3-225:43"
			:isContainer true
		)]
	) ) ( def ACG_NavigationExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_PropertyCallExp]
		:structuralFeatures[]
	) ) ( def ACG_IteratorExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IteratorExp
			:type ACG_VariableDecl
			:location "232:3-232:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IteratorExp
			:type ACG_Expression
			:location "233:3-233:41"
			:isContainer true
		)]
	) ) ( def ACG_OperationCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_PropertyCallExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_OperationCallExp
			:type ACG_Expression
			:location "237:3-237:57"
			:isContainer true
		)]
	) ) ( def ACG_OperatorCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_OperationCallExp]
		:structuralFeatures[]
	) ) ( def ACG_LiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_Expression]
		:structuralFeatures[]
	) ) ( def ACG_OclUndefinedExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LiteralExp]
		:structuralFeatures[]
	) ) ( def ACG_CollectionExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ACG_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ACG_CollectionExp
			:type ACG_Expression
			:location "250:3-250:56"
			:isContainer true
		)]
	) ) ( def ACG_SequenceExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_CollectionExp]
		:structuralFeatures[]
	) ) ( def ACG_BooleanExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_BooleanExp
			:type Boolean
			:location "258:3-258:29"
		)]
	) ) ( def ACG_IntegerExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_IntegerExp
			:type Integer
			:location "262:3-262:29"
		)]
	) ) ( def ACG_StringExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ACG_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ACG_StringExp
			:type String
			:location "266:3-266:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "274:2-274:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "275:2-275:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "276:2-276:18"
	) )]
) )
