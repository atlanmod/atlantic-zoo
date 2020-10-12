( declare ASM_LocatedElement )
( declare ASM_XAsmFile )
( declare ASM_XAsmSpec )
( declare ASM_Asm )
( declare ASM_Signature )
( declare ASM_Argument )
( declare ASM_Body )
( declare ASM_MetaInformation )
( declare ASM_AccessUpdateFunction )
( declare ASM_Declaration )
( declare ASM_Function )
( declare ASM_Parameter )
( declare ASM_Universe )
( declare ASM_Initialization )
( declare ASM_Term )
( declare ASM_Constant )
( declare ASM_FunctionOrVariableTerm )
( declare ASM_OperatorTerm )
( declare ASM_BooleanConstant )
( declare ASM_IntegerConstant )
( declare ASM_StringConstant )
( declare ASM_UndefConstant )
( declare ASM_Rule )
( declare ASM_SkipRule )
( declare ASM_AsmInvocation )
( declare ASM_UpdateRule )
( declare ASM_ChooseRule )
( declare ASM_DoForallRule )
( declare ASM_ConditionalRule )
( declare ASM_ElseIf )
( declare ASM_ExtendRule )
( declare ASM_ElementDecl )
( declare ASM_VariableDecl )
( declare ASM_Extension )
( declare ASM_ReturnRule )
( declare Enum_AccessUpdateType )
( declare Enum_AsmType )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def ASM ( struct-map
	KM3_Package
	:contents[( def ASM_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_LocatedElement
			:type String
			:location "13:3-13:31"
		)]
	) ) ( def ASM_XAsmFile ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[]
	) ) ( def ASM_XAsmSpec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_XAsmFile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "Asm"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_XAsmSpec
			:type ASM_Asm
			:location "19:3-19:39"
			:isContainer true
		)]
	) ) ( def ASM_Asm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_Asm
			:type String
			:location "28:3-28:39"
		) ( struct-map
			KM3_Reference
			:name "signature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Asm
			:type ASM_Signature
			:location "27:3-27:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "metaInformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Asm
			:type ASM_MetaInformation
			:location "29:4-29:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Asm
			:type ASM_Body
			:location "30:3-30:35"
			:isContainer true
		)]
	) ) ( def ASM_Signature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isMain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Signature
			:type Boolean
			:location "34:3-34:30"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Signature
			:type String
			:location "35:3-35:27"
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_Signature
			:type ASM_Argument
			:location "37:4-37:50"
			:isContainer true
		)]
	) ) ( def ASM_Argument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_VariableDecl]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Argument
			:type String
			:location "41:4-41:28"
		)]
	) ) ( def ASM_Body ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_XAsmFile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ASM_Body
			:type ASM_Declaration
			:location "45:4-45:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initialization"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_Body
			:type ASM_Initialization
			:location "46:4-46:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_Body
			:type ASM_Rule
			:location "47:4-47:42"
			:isContainer true
		)]
	) ) ( def ASM_MetaInformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "usedAs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_MetaInformation
			:type AsmType
			:location "52:3-52:30"
		) ( struct-map
			KM3_Reference
			:name "usedAsIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_MetaInformation
			:type ASM_Signature
			:location "51:3-51:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "accessUpdateFunctions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_MetaInformation
			:type ASM_AccessUpdateFunction
			:location "53:3-53:73"
			:isContainer true
		)]
	) ) ( def ASM_AccessUpdateFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_AccessUpdateFunction
			:type AccessUpdateType
			:location "57:3-57:37"
		) ( struct-map
			KM3_Reference
			:name "functions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_AccessUpdateFunction
			:type ASM_Function
			:location "58:3-58:49"
			:isContainer true
		)]
	) ) ( def ASM_Declaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[]
	) ) ( def ASM_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Declaration ASM_ElementDecl]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Function
			:type String
			:location "66:3-66:33"
		) ( struct-map
			KM3_Attribute
			:name "isExternal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Function
			:type Boolean
			:location "68:3-68:34"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_Function
			:type ASM_Parameter
			:location "65:3-65:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initTerm"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_Function
			:type ASM_Term
			:location "67:3-67:44"
			:isContainer true
		)]
	) ) ( def ASM_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Parameter
			:type String
			:location "72:3-72:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Parameter
			:type String
			:location "73:3-73:27"
		)]
	) ) ( def ASM_Universe ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Declaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Universe
			:type String
			:location "77:3-77:27"
		) ( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_Universe
			:type String
			:location "78:3-78:35"
		) ( struct-map
			KM3_Reference
			:name "superUniverses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_Universe
			:type ASM_Universe
			:location "79:3-79:42"
			:isContainer false
		)]
	) ) ( def ASM_Initialization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_Initialization
			:type ASM_Rule
			:location "90:3-90:41"
			:isContainer true
		)]
	) ) ( def ASM_Term ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[]
	) ) ( def ASM_Constant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_Term]
		:structuralFeatures[]
	) ) ( def ASM_FunctionOrVariableTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Term]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_FunctionOrVariableTerm
			:type ASM_ElementDecl
			:location "109:3-109:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "terms"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_FunctionOrVariableTerm
			:type ASM_Term
			:location "111:3-111:41"
			:isContainer true
		)]
	) ) ( def ASM_OperatorTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "opName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_OperatorTerm
			:type String
			:location "115:3-115:29"
		) ( struct-map
			KM3_Reference
			:name "leftExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_OperatorTerm
			:type ASM_Term
			:location "116:3-116:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_OperatorTerm
			:type ASM_Term
			:location "117:3-117:44"
			:isContainer true
		)]
	) ) ( def ASM_BooleanConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_BooleanConstant
			:type Boolean
			:location "122:3-122:29"
		)]
	) ) ( def ASM_IntegerConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_IntegerConstant
			:type Integer
			:location "126:3-126:29"
		)]
	) ) ( def ASM_StringConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_StringConstant
			:type String
			:location "130:3-130:28"
		)]
	) ) ( def ASM_UndefConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Constant]
		:structuralFeatures[]
	) ) ( def ASM_Rule ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "inSequence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Rule
			:type Boolean
			:location "140:3-140:34"
		)]
	) ) ( def ASM_SkipRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[]
	) ) ( def ASM_AsmInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "asmName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_AsmInvocation
			:type String
			:location "147:3-147:30"
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ASM_AsmInvocation
			:type ASM_Term
			:location "148:3-148:43"
			:isContainer true
		)]
	) ) ( def ASM_UpdateRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "function"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_UpdateRule
			:type ASM_FunctionOrVariableTerm
			:location "152:3-152:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "updateTerm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_UpdateRule
			:type ASM_Term
			:location "153:3-153:41"
			:isContainer true
		)]
	) ) ( def ASM_ChooseRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "chooseId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_ChooseRule
			:type ASM_VariableDecl
			:location "157:3-157:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "inSet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ChooseRule
			:type ASM_Universe
			:location "158:3-158:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ChooseRule
			:type ASM_Term
			:location "159:3-159:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ifChoosenRules"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_ChooseRule
			:type ASM_Rule
			:location "160:3-160:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ifNotChoosenRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ChooseRule
			:type ASM_Rule
			:location "161:3-161:51"
			:isContainer true
		)]
	) ) ( def ASM_DoForallRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_DoForallRule
			:type ASM_VariableDecl
			:location "165:3-165:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "inSet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_DoForallRule
			:type ASM_Universe
			:location "166:3-166:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_DoForallRule
			:type ASM_Term
			:location "167:3-167:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doRule"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_DoForallRule
			:type ASM_Rule
			:location "168:3-168:42"
			:isContainer true
		)]
	) ) ( def ASM_ConditionalRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_ConditionalRule
			:type ASM_Term
			:location "172:3-172:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenRule"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_ConditionalRule
			:type ASM_Rule
			:location "173:3-173:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ConditionalRule
			:type ASM_Rule
			:location "174:3-174:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseIfRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ConditionalRule
			:type ASM_ElseIf
			:location "175:3-175:49"
			:isContainer true
		)]
	) ) ( def ASM_ElseIf ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_ElseIf
			:type ASM_Term
			:location "179:3-179:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenRule"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_ElseIf
			:type ASM_Rule
			:location "180:3-180:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ElseIf
			:type ASM_Rule
			:location "181:3-181:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseIfRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ASM_ElseIf
			:type ASM_ElseIf
			:location "182:3-182:49"
			:isContainer true
		)]
	) ) ( def ASM_ExtendRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "extensions"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_ExtendRule
			:type ASM_Extension
			:location "186:3-186:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_ExtendRule
			:type ASM_Rule
			:location "187:3-187:41"
			:isContainer true
		)]
	) ) ( def ASM_ElementDecl ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_ElementDecl
			:type String
			:location "191:3-191:27"
		)]
	) ) ( def ASM_VariableDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_ElementDecl]
		:structuralFeatures[]
	) ) ( def ASM_Extension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ASM_Extension
			:type ASM_VariableDecl
			:location "199:3-199:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "universe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_Extension
			:type ASM_Universe
			:location "200:3-200:43"
			:isContainer true
		)]
	) ) ( def ASM_ReturnRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ASM_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ASM_ReturnRule
			:type ASM_Term
			:location "204:3-204:35"
			:isContainer true
		)]
	) )]
) )
( def Enum ( struct-map
	KM3_Package
	:contents[( def AccessUpdateType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "access"
		:location "214:3-214:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "update"
		:location "215:3-215:18"
	)] ) ) ( def AsmType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "function"
		:location "220:3-220:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "subasm"
		:location "221:3-221:18"
	)] ) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "227:2-227:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "228:2-228:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "229:2-229:19"
	) )]
) )
