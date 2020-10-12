( declare Perceptory_Process )
( declare Perceptory_StopProcess )
( declare Perceptory_SkipProcess )
( declare Perceptory_Action )
( declare Perceptory_Construction )
( declare Perceptory_Instance )
( declare Perceptory_Assignment )
( declare Perceptory_Input )
( declare Perceptory_Output )
( declare Perceptory_Sequence )
( declare Perceptory_NormalSequence )
( declare Perceptory_ReplicatorSequence )
( declare Perceptory_Conditional )
( declare Perceptory_NormalConditional )
( declare Perceptory_ReplicatorConditional )
( declare Perceptory_Loop )
( declare Perceptory_Parallel )
( declare Perceptory_NormalParallel )
( declare Perceptory_ReplicatorParallel )
( declare Perceptory_Alternation )
( declare Perceptory_NormalAlternation )
( declare Perceptory_ReplicatorAlternation )
( declare Perceptory_Choice )
( declare Perceptory_BooleanRef )
( declare Perceptory_Alternative )
( declare Perceptory_Guard )
( declare Perceptory_InputGuard )
( declare Perceptory_BooleanGuard )
( declare Perceptory_Replicator )
( declare Perceptory_Base )
( declare Perceptory_Count )
( declare Perceptory_Type )
( declare Perceptory_PrimitiveType )
( declare Perceptory_Literal )
( declare Perceptory_Element )
( declare Perceptory_Subscript )
( declare Perceptory_Variable )
( declare Perceptory_Channel )
( declare Perceptory_Operand )
( declare Perceptory_VariableOPerand )
( declare Perceptory_LiteralOperand )
( declare Perceptory_ExpressionOperand )
( declare Perceptory_Expression )
( declare Perceptory_MonadicExpression )
( declare Perceptory_DyadicExpression )
( declare Perceptory_SimpleExpression )
( declare Perceptory_Specification )
( declare Perceptory_Declaration )
( declare Perceptory_TypeDeclaration )
( declare Perceptory_IntDeclaration )
( declare Perceptory_ValDeclaration )
( declare Perceptory_Definition )
( declare Perceptory_Formal )
( declare Perceptory_ProcedureBody )
( declare Perceptory_Actual )
( declare Perceptory_MonadicOperator )
( declare Perceptory_DyadicOperator )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Perceptory ( struct-map
	KM3_Package
	:contents[( def Perceptory_Process ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Perceptory_StopProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Process]
		:structuralFeatures[]
	) ) ( def Perceptory_SkipProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Process]
		:structuralFeatures[]
	) ) ( def Perceptory_Action ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Process]
		:structuralFeatures[]
	) ) ( def Perceptory_Construction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Process]
		:structuralFeatures[]
	) ) ( def Perceptory_Instance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Process]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Instance
			:type String
			:location "37:3-37:27"
		)]
	) ) ( def Perceptory_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Assignment
			:type Perceptory_Variable
			:location "43:3-43:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Assignment
			:type Perceptory_Expression
			:location "44:3-44:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Input
			:type Perceptory_Channel
			:location "49:3-49:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Input
			:type Perceptory_Variable
			:location "50:3-50:43"
			:isContainer true
		)]
	) ) ( def Perceptory_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Output
			:type Perceptory_Channel
			:location "55:3-55:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Output
			:type Perceptory_Expression
			:location "56:3-56:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Sequence ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Construction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Sequence
			:type Perceptory_Process
			:location "61:3-61:41"
			:isContainer true
		)]
	) ) ( def Perceptory_NormalSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Sequence]
		:structuralFeatures[]
	) ) ( def Perceptory_ReplicatorSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Sequence]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "replicator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ReplicatorSequence
			:type Perceptory_Replicator
			:location "71:3-71:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Conditional ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Construction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "choice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Conditional
			:type Perceptory_Choice
			:location "76:3-76:39"
			:isContainer true
		)]
	) ) ( def Perceptory_NormalConditional ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Conditional]
		:structuralFeatures[]
	) ) ( def Perceptory_ReplicatorConditional ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Conditional]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "replicator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ReplicatorConditional
			:type Perceptory_Replicator
			:location "86:3-86:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Loop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Construction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "boolean"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Loop
			:type Perceptory_BooleanRef
			:location "91:3-91:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Loop
			:type Perceptory_Process
			:location "92:3-92:41"
			:isContainer true
		)]
	) ) ( def Perceptory_Parallel ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Construction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Parallel
			:type Perceptory_Process
			:location "97:3-97:41"
			:isContainer true
		)]
	) ) ( def Perceptory_NormalParallel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Parallel]
		:structuralFeatures[]
	) ) ( def Perceptory_ReplicatorParallel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Parallel]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "replicator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ReplicatorParallel
			:type Perceptory_Replicator
			:location "107:3-107:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Alternation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Construction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "alternative"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Alternation
			:type Perceptory_Alternative
			:location "112:3-112:49"
			:isContainer true
		)]
	) ) ( def Perceptory_NormalAlternation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Parallel]
		:structuralFeatures[]
	) ) ( def Perceptory_ReplicatorAlternation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Parallel]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "replicator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ReplicatorAlternation
			:type Perceptory_Replicator
			:location "122:3-122:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Choice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "boolean"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Choice
			:type Perceptory_BooleanRef
			:location "127:3-127:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Choice
			:type Perceptory_Process
			:location "128:3-128:41"
			:isContainer true
		)]
	) ) ( def Perceptory_BooleanRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_BooleanRef
			:type Perceptory_Expression
			:location "133:3-133:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Alternative ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Alternative
			:type Perceptory_Guard
			:location "138:3-138:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Alternative
			:type Perceptory_Process
			:location "139:3-139:41"
			:isContainer true
		)]
	) ) ( def Perceptory_Guard ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "input"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Guard
			:type Perceptory_Input
			:location "144:3-144:37"
			:isContainer true
		)]
	) ) ( def Perceptory_InputGuard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Guard]
		:structuralFeatures[]
	) ) ( def Perceptory_BooleanGuard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Guard]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "boolean"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_BooleanGuard
			:type Perceptory_BooleanRef
			:location "154:3-154:44"
			:isContainer true
		)]
	) ) ( def Perceptory_Replicator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Replicator
			:type String
			:location "159:3-159:27"
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Replicator
			:type Perceptory_Base
			:location "160:3-160:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "count"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Replicator
			:type Perceptory_Count
			:location "161:3-161:37"
			:isContainer true
		)]
	) ) ( def Perceptory_Base ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Base
			:type Perceptory_Expression
			:location "166:3-166:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Count ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Count
			:type Perceptory_Expression
			:location "171:3-171:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "primitiveType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Type
			:type Perceptory_PrimitiveType
			:location "176:3-176:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Type
			:type Perceptory_Expression
			:location "177:3-177:53"
			:isContainer true
		)]
	) ) ( def Perceptory_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_PrimitiveType
			:type Boolean
			:location "182:3-182:29"
		) ( struct-map
			KM3_Attribute
			:name "isChan"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_PrimitiveType
			:type Boolean
			:location "183:3-183:30"
		)]
	) ) ( def Perceptory_Literal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "integer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Literal
			:type Integer
			:location "188:3-188:31"
		)]
	) ) ( def Perceptory_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Element
			:type String
			:location "193:3-193:27"
		) ( struct-map
			KM3_Reference
			:name "subscript"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Perceptory_Element
			:type Perceptory_Subscript
			:location "194:3-194:51"
			:isContainer true
		)]
	) ) ( def Perceptory_Subscript ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Subscript
			:type Perceptory_Expression
			:location "199:3-199:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Variable
			:type Perceptory_Element
			:location "204:3-204:41"
			:isContainer true
		)]
	) ) ( def Perceptory_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Channel
			:type Perceptory_Element
			:location "209:3-209:41"
			:isContainer true
		)]
	) ) ( def Perceptory_Operand ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Perceptory_VariableOPerand ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Variable]
		:structuralFeatures[]
	) ) ( def Perceptory_LiteralOperand ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Literal]
		:structuralFeatures[]
	) ) ( def Perceptory_ExpressionOperand ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Expression]
		:structuralFeatures[]
	) ) ( def Perceptory_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Expression
			:type Perceptory_Operand
			:location "234:3-234:41"
			:isContainer true
		)]
	) ) ( def Perceptory_MonadicExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "monadicOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MonadicExpression
			:type Perceptory_MonadicOperator
			:location "239:3-239:57"
			:isContainer true
		)]
	) ) ( def Perceptory_DyadicExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operandRight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicExpression
			:type Perceptory_Operand
			:location "244:3-244:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dyadicOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicExpression
			:type Perceptory_DyadicOperator
			:location "245:3-245:55"
			:isContainer true
		)]
	) ) ( def Perceptory_SimpleExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Expression]
		:structuralFeatures[]
	) ) ( def Perceptory_Specification ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Process]
		:structuralFeatures[]
	) ) ( def Perceptory_Declaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Perceptory_Specification]
		:structuralFeatures[]
	) ) ( def Perceptory_TypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Declaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_TypeDeclaration
			:type Perceptory_Type
			:location "265:3-265:35"
			:isContainer true
		)]
	) ) ( def Perceptory_IntDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Declaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_IntDeclaration
			:type String
			:location "270:3-270:27"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_IntDeclaration
			:type Perceptory_Expression
			:location "271:3-271:47"
			:isContainer true
		)]
	) ) ( def Perceptory_ValDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Declaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ValDeclaration
			:type String
			:location "276:3-276:27"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ValDeclaration
			:type Perceptory_Expression
			:location "277:3-277:47"
			:isContainer true
		)]
	) ) ( def Perceptory_Definition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Perceptory_Specification]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Definition
			:type String
			:location "282:3-282:27"
		) ( struct-map
			KM3_Reference
			:name "procedureBody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Definition
			:type Perceptory_ProcedureBody
			:location "284:3-284:53"
			:isContainer true
		)]
	) ) ( def Perceptory_Formal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Formal
			:type String
			:location "289:3-289:27"
		) ( struct-map
			KM3_Reference
			:name "primitiveType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Formal
			:type Perceptory_PrimitiveType
			:location "290:3-290:53"
			:isContainer true
		)]
	) ) ( def Perceptory_ProcedureBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ProcedureBody
			:type String
			:location "295:3-295:27"
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_ProcedureBody
			:type Perceptory_Process
			:location "296:3-296:41"
			:isContainer true
		)]
	) ) ( def Perceptory_Actual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_Actual
			:type Perceptory_Element
			:location "301:3-301:41"
			:isContainer true
		)]
	) ) ( def Perceptory_MonadicOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "minus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MonadicOperator
			:type Boolean
			:location "306:3-306:29"
		) ( struct-map
			KM3_Attribute
			:name "not"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_MonadicOperator
			:type Boolean
			:location "307:3-307:27"
		)]
	) ) ( def Perceptory_DyadicOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "plus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "312:3-312:28"
		) ( struct-map
			KM3_Attribute
			:name "minus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "313:3-313:29"
		) ( struct-map
			KM3_Attribute
			:name "star"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "314:3-314:28"
		) ( struct-map
			KM3_Attribute
			:name "slash"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "315:3-315:29"
		) ( struct-map
			KM3_Attribute
			:name "or"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "316:3-316:26"
		) ( struct-map
			KM3_Attribute
			:name "inverseSlash"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "317:3-317:36"
		) ( struct-map
			KM3_Attribute
			:name "and"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "318:3-318:27"
		) ( struct-map
			KM3_Attribute
			:name "eq"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "319:3-319:26"
		) ( struct-map
			KM3_Attribute
			:name "ne"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "320:3-320:26"
		) ( struct-map
			KM3_Attribute
			:name "lt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "321:3-321:26"
		) ( struct-map
			KM3_Attribute
			:name "gt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "322:3-322:26"
		) ( struct-map
			KM3_Attribute
			:name "le"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "323:3-323:26"
		) ( struct-map
			KM3_Attribute
			:name "ge"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Perceptory_DyadicOperator
			:type Boolean
			:location "324:3-324:26"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "329:2-329:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "330:2-330:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "331:2-331:19"
	) )]
) )
