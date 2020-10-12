( declare Jess_LocatedElement )
( declare Jess_Root )
( declare Jess_Expression )
( declare Jess_Integ )
( declare Jess_Floa )
( declare Jess_Str )
( declare Jess_Ident )
( declare Jess_ValidIdentifier )
( declare Jess_SlotName )
( declare Jess_JessVariable )
( declare Jess_TemplateExpression )
( declare Jess_SlotOp )
( declare Jess_DefinitionExp )
( declare Jess_GlobalDefinition )
( declare Jess_VarDefinition )
( declare Jess_FunctionDefinition )
( declare Jess_AdviceDefinition )
( declare Jess_UnDefAdvice )
( declare Jess_FactDefinition )
( declare Jess_RuleDefinition )
( declare Jess_DeclareRule )
( declare Jess_ModuleDefinition )
( declare Jess_QueryDefinition )
( declare Jess_DeclareVar )
( declare Jess_TemplateDefinition )
( declare Jess_DeclareBloc )
( declare Jess_ASlotDef )
( declare Jess_SlotDef )
( declare Jess_MultiSlotDef )
( declare Jess_SlotOptions )
( declare Jess_UseFuncExp )
( declare Jess_WhileExp )
( declare Jess_ForExp )
( declare Jess_ForeachExp )
( declare Jess_FuncCall )
( declare Jess_EngineExp )
( declare Jess_ExitExp )
( declare Jess_IfExpression )
( declare Jess_ConditionAction )
( declare Jess_ElifConditionAction )
( declare Jess_Advice )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def Jess ( struct-map
	KM3_Package
	:contents[( def Advice ( :literals[( struct-map
		KM3_EnumLiteral
		:name "before"
		:location "225:3-225:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "after"
		:location "226:3-226:17"
	)] ) ) ( def Jess_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_LocatedElement
			:type String
			:location "12:3-12:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def Jess_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_Root
			:type Jess_Expression
			:location "19:3-19:59"
			:isContainer true
		)]
	) ) ( def Jess_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[]
	) ) ( def Jess_Integ ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_Integ
			:type Integer
			:location "27:3-27:26"
		)]
	) ) ( def Jess_Floa ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_Floa
			:type Double
			:location "31:3-31:26"
		)]
	) ) ( def Jess_Str ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_Str
			:type String
			:location "35:3-35:26"
		)]
	) ) ( def Jess_Ident ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Jess_Expression]
		:structuralFeatures[]
	) ) ( def Jess_ValidIdentifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Ident]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ValidIdentifier
			:type String
			:location "43:3-43:26"
		)]
	) ) ( def Jess_SlotName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Ident]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotName
			:type String
			:location "47:3-47:26"
		)]
	) ) ( def Jess_JessVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Ident]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_JessVariable
			:type String
			:location "51:3-51:26"
		)]
	) ) ( def Jess_TemplateExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "templateName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_TemplateExpression
			:type Jess_ValidIdentifier
			:location "55:3-55:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "firstSlot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_TemplateExpression
			:type Jess_SlotOp
			:location "56:3-56:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "slotOp"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_TemplateExpression
			:type Jess_SlotOp
			:location "57:3-57:50"
			:isContainer true
		)]
	) ) ( def Jess_SlotOp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "slotIdent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOp
			:type Jess_SlotName
			:location "61:3-61:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOp
			:type Jess_ValidIdentifier
			:location "62:3-62:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOp
			:type Jess_Expression
			:location "63:3-63:39"
			:isContainer true
		)]
	) ) ( def Jess_DefinitionExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Jess_Expression]
		:structuralFeatures[]
	) ) ( def Jess_GlobalDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "varDef"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_GlobalDefinition
			:type Jess_VarDefinition
			:location "75:3-75:57"
			:isContainer true
		)]
	) ) ( def Jess_VarDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "jessVar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_VarDefinition
			:type Jess_JessVariable
			:location "79:3-79:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "eq"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_VarDefinition
			:type Jess_ValidIdentifier
			:location "80:3-80:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_VarDefinition
			:type Jess_Expression
			:location "81:3-81:47"
			:isContainer true
		)]
	) ) ( def Jess_FunctionDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "funcName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_FunctionDefinition
			:type Jess_ValidIdentifier
			:location "85:3-85:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_FunctionDefinition
			:type Jess_JessVariable
			:location "86:3-86:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_FunctionDefinition
			:type Jess_Expression
			:location "87:3-87:59"
			:isContainer true
		)]
	) ) ( def Jess_AdviceDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_AdviceDefinition
			:type Advice
			:location "91:3-91:32"
		) ( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_AdviceDefinition
			:type Jess_Ident
			:location "92:3-92:33"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "advice"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_AdviceDefinition
			:type Jess_Expression
			:location "93:3-93:53"
			:isContainer true
		)]
	) ) ( def Jess_UnDefAdvice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_UnDefAdvice
			:type Jess_Expression
			:location "97:3-97:38"
			:isContainer true
		)]
	) ) ( def Jess_FactDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "factName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_FactDefinition
			:type Jess_ValidIdentifier
			:location "101:3-101:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_FactDefinition
			:type Jess_Str
			:location "102:3-102:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fact"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_FactDefinition
			:type Jess_Expression
			:location "103:3-103:51"
			:isContainer true
		)]
	) ) ( def Jess_RuleDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ruleName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_RuleDefinition
			:type Jess_ValidIdentifier
			:location "107:3-107:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_RuleDefinition
			:type Jess_Str
			:location "108:3-108:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "declare"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_RuleDefinition
			:type Jess_DeclareRule
			:location "109:3-109:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "conditions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_RuleDefinition
			:type Jess_Expression
			:location "110:3-110:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "functionCall"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_RuleDefinition
			:type Jess_UseFuncExp
			:location "111:3-111:59"
			:isContainer true
		)]
	) ) ( def Jess_DeclareRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "salience"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareRule
			:type Jess_Expression
			:location "115:3-115:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodeIndexHash"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareRule
			:type Jess_Expression
			:location "116:3-116:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "autoFocus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareRule
			:type Jess_ValidIdentifier
			:location "117:3-117:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noLoop"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareRule
			:type Jess_ValidIdentifier
			:location "118:3-118:52"
			:isContainer true
		)]
	) ) ( def Jess_ModuleDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "moduleName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ModuleDefinition
			:type Jess_ValidIdentifier
			:location "122:3-122:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_ModuleDefinition
			:type Jess_Str
			:location "123:3-123:47"
			:isContainer true
		)]
	) ) ( def Jess_QueryDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "queryName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_QueryDefinition
			:type Jess_ValidIdentifier
			:location "127:3-127:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_QueryDefinition
			:type Jess_Str
			:location "128:3-128:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "declare"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_QueryDefinition
			:type Jess_DeclareVar
			:location "129:3-129:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_QueryDefinition
			:type Jess_Expression
			:location "130:3-130:58"
			:isContainer true
		)]
	) ) ( def Jess_DeclareVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "var"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_DeclareVar
			:type Jess_JessVariable
			:location "134:3-134:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_DeclareVar
			:type Jess_Expression
			:location "135:3-135:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_DeclareVar
			:type Jess_Expression
			:location "136:3-136:39"
			:isContainer true
		)]
	) ) ( def Jess_TemplateDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_DefinitionExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "templateName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_TemplateDefinition
			:type Jess_ValidIdentifier
			:location "140:3-140:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "inherits"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_TemplateDefinition
			:type Jess_ValidIdentifier
			:location "141:3-141:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_TemplateDefinition
			:type Jess_Str
			:location "142:3-142:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "declareBloc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_TemplateDefinition
			:type Jess_DeclareBloc
			:location "143:3-143:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "slotDef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Jess_TemplateDefinition
			:type Jess_ASlotDef
			:location "144:3-144:44"
			:isContainer true
		)]
	) ) ( def Jess_DeclareBloc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "slotSpecific"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareBloc
			:type Jess_ValidIdentifier
			:location "148:3-148:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "backchainReaction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareBloc
			:type Jess_ValidIdentifier
			:location "149:3-149:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fromClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareBloc
			:type Jess_ValidIdentifier
			:location "150:3-150:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "includeVariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareBloc
			:type Jess_ValidIdentifier
			:location "151:3-151:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "order"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Jess_DeclareBloc
			:type Jess_ValidIdentifier
			:location "152:3-152:51"
			:isContainer true
		)]
	) ) ( def Jess_ASlotDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "slotName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ASlotDef
			:type Jess_SlotName
			:location "156:3-156:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "optionals"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_ASlotDef
			:type Jess_SlotOptions
			:location "157:3-157:57"
			:isContainer true
		)]
	) ) ( def Jess_SlotDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_ASlotDef]
		:structuralFeatures[]
	) ) ( def Jess_MultiSlotDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_ASlotDef]
		:structuralFeatures[]
	) ) ( def Jess_SlotOptions ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOptions
			:type Jess_ValidIdentifier
			:location "167:3-167:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "def"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOptions
			:type Jess_Expression
			:location "168:3-168:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultDyn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_SlotOptions
			:type Jess_Expression
			:location "169:3-169:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "allowedValues"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_SlotOptions
			:type Jess_Expression
			:location "170:3-170:60"
			:isContainer true
		)]
	) ) ( def Jess_UseFuncExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Jess_Expression]
		:structuralFeatures[]
	) ) ( def Jess_WhileExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hasDo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_WhileExp
			:type Boolean
			:location "178:3-178:29"
		) ( struct-map
			KM3_Reference
			:name "boolExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_WhileExp
			:type Jess_Expression
			:location "179:3-179:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_WhileExp
			:type Jess_Expression
			:location "180:3-180:54"
			:isContainer true
		)]
	) ) ( def Jess_ForExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initializer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ForExp
			:type Jess_Expression
			:location "184:3-184:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ForExp
			:type Jess_Expression
			:location "185:3-185:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "increment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ForExp
			:type Jess_Expression
			:location "186:3-186:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_ForExp
			:type Jess_Expression
			:location "187:3-187:58"
			:isContainer true
		)]
	) ) ( def Jess_ForeachExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ForeachExp
			:type Jess_JessVariable
			:location "191:3-191:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "list"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ForeachExp
			:type Jess_Expression
			:location "192:3-192:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_ForeachExp
			:type Jess_Expression
			:location "193:3-193:58"
			:isContainer true
		)]
	) ) ( def Jess_FuncCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "funcName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_FuncCall
			:type Jess_ValidIdentifier
			:location "197:3-197:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "funcParam"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_FuncCall
			:type Jess_Expression
			:location "198:3-198:57"
			:isContainer true
		)]
	) ) ( def Jess_EngineExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[]
	) ) ( def Jess_ExitExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[]
	) ) ( def Jess_IfExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_UseFuncExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ifthen"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_IfExpression
			:type Jess_ConditionAction
			:location "208:3-208:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elifthen"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_IfExpression
			:type Jess_ElifConditionAction
			:location "209:3-209:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "else"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Jess_IfExpression
			:type Jess_Expression
			:location "210:3-210:43"
			:isContainer true
		)]
	) ) ( def Jess_ConditionAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ConditionAction
			:type Jess_Expression
			:location "215:3-215:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Jess_ConditionAction
			:type Jess_Expression
			:location "216:3-216:54"
			:isContainer true
		)]
	) ) ( def Jess_ElifConditionAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Jess_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condAct"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Jess_ElifConditionAction
			:type Jess_ConditionAction
			:location "220:3-220:48"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "234:2-234:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "235:2-235:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "236:2-236:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "237:2-237:18"
	) )]
) )
