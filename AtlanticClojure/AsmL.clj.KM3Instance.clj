( declare AsmL_LocatedElement )
( declare AsmL_Body )
( declare AsmL_InWhereHolds )
( declare AsmL_AsmLFile )
( declare AsmL_AsmLElement )
( declare AsmL_VarDeclaration )
( declare AsmL_Namespace )
( declare AsmL_Structure )
( declare AsmL_VarOrCase )
( declare AsmL_Case )
( declare AsmL_Class )
( declare AsmL_VarOrMethod )
( declare AsmL_Enumeration )
( declare AsmL_Enumerator )
( declare AsmL_Function )
( declare AsmL_Method )
( declare AsmL_Parameter )
( declare AsmL_Main )
( declare AsmL_Initially )
( declare AsmL_Rule )
( declare AsmL_SkipRule )
( declare AsmL_Step )
( declare AsmL_StepUntilFixPoint )
( declare AsmL_StepExpression )
( declare AsmL_StepWhile )
( declare AsmL_StepUntil )
( declare AsmL_StepForEach )
( declare AsmL_MethodInvocation )
( declare AsmL_UpdateRule )
( declare AsmL_UpdateVarRule )
( declare AsmL_UpdateFieldRule )
( declare AsmL_UpdateMapRule )
( declare AsmL_ChooseRule )
( declare AsmL_ForallRule )
( declare AsmL_ConditionalRule )
( declare AsmL_ElseIf )
( declare AsmL_ReturnRule )
( declare AsmL_AddRule )
( declare AsmL_RemoveRule )
( declare AsmL_Type )
( declare AsmL_NamedType )
( declare AsmL_MapType )
( declare AsmL_TupletType )
( declare AsmL_SetType )
( declare AsmL_SequenceType )
( declare AsmL_Term )
( declare AsmL_VarTerm )
( declare AsmL_Operator )
( declare AsmL_MapTerm )
( declare AsmL_TulpletTerm )
( declare AsmL_MethodCallTerm )
( declare AsmL_NewInstance )
( declare AsmL_PredicateTerm )
( declare AsmL_ForAllTerm )
( declare AsmL_ExistsTerm )
( declare AsmL_AnyIn )
( declare AsmL_SetTerm )
( declare AsmL_EnumerateSet )
( declare AsmL_RangeSet )
( declare AsmL_AlgorithmSet )
( declare AsmL_SequenceTerm )
( declare AsmL_EnumerateSequence )
( declare AsmL_RangeSequence )
( declare AsmL_Constant )
( declare AsmL_BooleanConstant )
( declare AsmL_IntegerConstant )
( declare AsmL_StringConstant )
( declare AsmL_NullConstant )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def AsmL ( struct-map
	KM3_Package
	:contents[( def AsmL_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_LocatedElement
			:type String
			:location "12:3-12:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def AsmL_Body ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Body
			:type AsmL_Rule
			:location "18:4-18:69"
			:isContainer true
			:opposite ownerBody
		)]
	) ) ( def AsmL_InWhereHolds ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_InWhereHolds
			:type AsmL_Term
			:location "22:3-22:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "in"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_InWhereHolds
			:type AsmL_Term
			:location "23:3-23:33"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "where"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_InWhereHolds
			:type AsmL_Term
			:location "24:3-24:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "holds"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_InWhereHolds
			:type AsmL_Term
			:location "25:3-25:41"
			:isContainer true
		)]
	) ) ( def AsmL_AsmLFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_AsmLFile
			:type AsmL_AsmLElement
			:location "31:3-31:73"
			:isContainer true
			:opposite file
		) ( struct-map
			KM3_Reference
			:name "main"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_AsmLFile
			:type AsmL_Main
			:location "32:3-32:55"
			:isContainer true
			:opposite mainFile
		)]
	) ) ( def AsmL_AsmLElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_AsmLElement
			:type AsmL_AsmLFile
			:location "36:3-36:49"
			:isContainer false
			:opposite elements
		)]
	) ) ( def AsmL_VarDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_AsmLElement AsmL_VarOrCase AsmL_VarOrMethod]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isConstant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarDeclaration
			:type Boolean
			:location "43:3-43:34"
		) ( struct-map
			KM3_Attribute
			:name "isDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarDeclaration
			:type Boolean
			:location "44:3-44:37"
		) ( struct-map
			KM3_Attribute
			:name "isLocal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarDeclaration
			:type Boolean
			:location "45:3-45:31"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarDeclaration
			:type String
			:location "46:3-46:27"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarDeclaration
			:type AsmL_Type
			:location "47:3-47:63"
			:isContainer true
			:opposite ownerDeclaration
		)]
	) ) ( def AsmL_Namespace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Namespace
			:type String
			:location "54:3-54:27"
		)]
	) ) ( def AsmL_Structure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Structure
			:type String
			:location "60:3-60:27"
		) ( struct-map
			KM3_Attribute
			:name "superStructureName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Structure
			:type String
			:location "62:3-62:46"
		) ( struct-map
			KM3_Reference
			:name "varOrCase"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Structure
			:type AsmL_VarOrCase
			:location "61:3-61:82"
			:isContainer true
			:opposite ownerStructure
		)]
	) ) ( def AsmL_VarOrCase ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownerStructure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarOrCase
			:type AsmL_Structure
			:location "66:3-66:61"
			:isContainer false
			:opposite varOrCase
		)]
	) ) ( def AsmL_Case ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_VarOrCase]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Case
			:type String
			:location "70:3-70:27"
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Case
			:type AsmL_VarDeclaration
			:location "71:3-71:61"
			:isContainer true
		)]
	) ) ( def AsmL_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Class
			:type String
			:location "77:3-77:27"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Class
			:type Boolean
			:location "78:3-78:34"
		) ( struct-map
			KM3_Attribute
			:name "superClassName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Class
			:type String
			:location "79:3-79:42"
		) ( struct-map
			KM3_Reference
			:name "varOrMethod"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Class
			:type AsmL_VarOrMethod
			:location "80:3-80:82"
			:isContainer true
			:opposite ownerClass
		)]
	) ) ( def AsmL_VarOrMethod ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownerClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarOrMethod
			:type AsmL_Class
			:location "84:3-84:55"
			:isContainer false
			:opposite varOrMethod
		)]
	) ) ( def AsmL_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Enumeration
			:type String
			:location "90:3-90:27"
		) ( struct-map
			KM3_Reference
			:name "enumerators"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Enumeration
			:type AsmL_Enumerator
			:location "91:3-91:59"
			:isContainer true
		)]
	) ) ( def AsmL_Enumerator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Enumerator
			:type String
			:location "95:3-95:27"
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Enumerator
			:type AsmL_Term
			:location "96:3-96:41"
			:isContainer true
		)]
	) ) ( def AsmL_Function ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Function
			:type String
			:location "103:3-103:27"
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Function
			:type AsmL_Body
			:location "104:3-104:35"
			:isContainer true
		)]
	) ) ( def AsmL_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Function AsmL_VarOrMethod]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Method
			:type Boolean
			:location "109:3-109:39"
		) ( struct-map
			KM3_Attribute
			:name "isShared"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Method
			:type Boolean
			:location "110:3-110:37"
		) ( struct-map
			KM3_Attribute
			:name "isEntryPoint"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Method
			:type Boolean
			:location "111:3-111:41"
		) ( struct-map
			KM3_Attribute
			:name "isOverride"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Method
			:type Boolean
			:location "112:3-112:39"
		) ( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Method
			:type AsmL_Type
			:location "113:3-113:69"
			:isContainer true
			:opposite ownerMethod
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Method
			:type AsmL_Parameter
			:location "114:3-114:80"
			:isContainer true
			:opposite ownerMethod
		)]
	) ) ( def AsmL_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Parameter
			:type String
			:location "118:3-118:27"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Parameter
			:type AsmL_Type
			:location "119:3-119:61"
			:isContainer true
			:opposite ownerParameter
		) ( struct-map
			KM3_Reference
			:name "ownerMethod"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Parameter
			:type AsmL_Method
			:location "120:3-120:56"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def AsmL_Main ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Function]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mainFile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Main
			:type AsmL_AsmLFile
			:location "126:3-126:49"
			:isContainer false
			:opposite main
		) ( struct-map
			KM3_Reference
			:name "initialisations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_Main
			:type AsmL_Initially
			:location "127:3-127:62"
			:isContainer true
		)]
	) ) ( def AsmL_Initially ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Initially
			:type AsmL_VarTerm
			:location "131:3-131:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Initially
			:type AsmL_Term
			:location "132:3-132:34"
			:isContainer true
		)]
	) ) ( def AsmL_Rule ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownerBody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Rule
			:type AsmL_Body
			:location "139:3-139:47"
			:isContainer false
			:opposite rules
		)]
	) ) ( def AsmL_SkipRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[]
	) ) ( def AsmL_Step ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Step
			:type String
			:location "146:3-146:32"
		)]
	) ) ( def AsmL_StepUntilFixPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Step]
		:structuralFeatures[]
	) ) ( def AsmL_StepExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_StepExpression
			:type AsmL_Term
			:location "152:3-152:41"
			:isContainer true
		)]
	) ) ( def AsmL_StepWhile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_StepExpression]
		:structuralFeatures[]
	) ) ( def AsmL_StepUntil ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_StepExpression]
		:structuralFeatures[]
	) ) ( def AsmL_StepForEach ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Step]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_StepForEach
			:type AsmL_InWhereHolds
			:location "160:3-160:53"
			:isContainer true
		)]
	) ) ( def AsmL_MethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "called"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MethodInvocation
			:type AsmL_MethodCallTerm
			:location "165:3-165:47"
			:isContainer true
		)]
	) ) ( def AsmL_UpdateRule ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_UpdateRule
			:type AsmL_Term
			:location "170:3-170:35"
			:isContainer true
		)]
	) ) ( def AsmL_UpdateVarRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_UpdateRule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "updateVar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_UpdateVarRule
			:type AsmL_Term
			:location "174:3-174:40"
			:isContainer true
		)]
	) ) ( def AsmL_UpdateFieldRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_UpdateRule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "path"
			:upper -1
			:lower 2
			:isOrdered true
			:owner AsmL_UpdateFieldRule
			:type AsmL_VarTerm
			:location "178:3-178:51"
			:isContainer true
		)]
	) ) ( def AsmL_UpdateMapRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_UpdateRule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "updateMap"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_UpdateMapRule
			:type AsmL_VarTerm
			:location "183:3-183:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 1
			:isOrdered true
			:owner AsmL_UpdateMapRule
			:type AsmL_Term
			:location "184:3-184:54"
			:isContainer true
		)]
	) ) ( def AsmL_ChooseRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_ChooseRule
			:type AsmL_InWhereHolds
			:location "189:3-189:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ifChoosenRules"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ChooseRule
			:type AsmL_Body
			:location "190:3-190:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ifNotChoosenRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_ChooseRule
			:type AsmL_Body
			:location "191:3-191:51"
			:isContainer true
		)]
	) ) ( def AsmL_ForallRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_ForallRule
			:type AsmL_InWhereHolds
			:location "195:3-195:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ForallRule
			:type AsmL_Body
			:location "196:3-196:37"
			:isContainer true
		)]
	) ) ( def AsmL_ConditionalRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ConditionalRule
			:type AsmL_Term
			:location "201:3-201:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenRule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ConditionalRule
			:type AsmL_Body
			:location "202:3-202:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_ConditionalRule
			:type AsmL_Body
			:location "203:3-203:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseIfRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_ConditionalRule
			:type AsmL_ElseIf
			:location "204:3-204:48"
			:isContainer true
		)]
	) ) ( def AsmL_ElseIf ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_ConditionalRule]
		:structuralFeatures[]
	) ) ( def AsmL_ReturnRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ReturnRule
			:type AsmL_Term
			:location "211:3-211:35"
			:isContainer true
		)]
	) ) ( def AsmL_AddRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_AddRule
			:type AsmL_Term
			:location "215:3-215:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "set"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_AddRule
			:type AsmL_VarTerm
			:location "216:3-216:37"
			:isContainer true
		)]
	) ) ( def AsmL_RemoveRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Rule]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RemoveRule
			:type AsmL_Term
			:location "220:3-220:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "set"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RemoveRule
			:type AsmL_VarTerm
			:location "221:3-221:37"
			:isContainer true
		)]
	) ) ( def AsmL_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_AsmLElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "withNull"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Type
			:type Boolean
			:location "227:3-227:32"
		) ( struct-map
			KM3_Reference
			:name "ownerDeclaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Type
			:type AsmL_VarDeclaration
			:location "228:3-228:69"
			:isContainer false
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "ownerMethod"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Type
			:type AsmL_Method
			:location "229:3-229:62"
			:isContainer false
			:opposite returnType
		) ( struct-map
			KM3_Reference
			:name "ownerParameter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Type
			:type AsmL_Parameter
			:location "230:3-230:62"
			:isContainer false
			:opposite type
		)]
	) ) ( def AsmL_NamedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_NamedType
			:type String
			:location "234:3-234:27"
		)]
	) ) ( def AsmL_MapType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ofType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MapType
			:type AsmL_Type
			:location "238:3-238:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "toType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MapType
			:type AsmL_Type
			:location "239:3-239:37"
			:isContainer true
		)]
	) ) ( def AsmL_TupletType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "types"
			:upper -1
			:lower 2
			:isOrdered true
			:owner AsmL_TupletType
			:type AsmL_Type
			:location "243:3-243:49"
			:isContainer true
		)]
	) ) ( def AsmL_SetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "of"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_SetType
			:type AsmL_Type
			:location "247:3-247:33"
			:isContainer true
		)]
	) ) ( def AsmL_SequenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "of"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_SequenceType
			:type AsmL_Type
			:location "251:3-251:33"
			:isContainer true
		)]
	) ) ( def AsmL_Term ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_LocatedElement]
		:structuralFeatures[]
	) ) ( def AsmL_VarTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_VarTerm
			:type String
			:location "259:3-259:27"
		)]
	) ) ( def AsmL_Operator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "opName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Operator
			:type String
			:location "263:3-263:29"
		) ( struct-map
			KM3_Reference
			:name "leftExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_Operator
			:type AsmL_Term
			:location "264:3-264:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner AsmL_Operator
			:type AsmL_Term
			:location "265:3-265:44"
			:isContainer true
		)]
	) ) ( def AsmL_MapTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "separator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MapTerm
			:type String
			:location "271:3-271:31"
		) ( struct-map
			KM3_Reference
			:name "ofTerm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MapTerm
			:type AsmL_Term
			:location "269:3-269:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "toTerm"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MapTerm
			:type AsmL_Term
			:location "270:3-270:37"
			:isContainer true
		)]
	) ) ( def AsmL_TulpletTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "terms"
			:upper -1
			:lower 2
			:isOrdered true
			:owner AsmL_TulpletTerm
			:type AsmL_Term
			:location "275:3-275:49"
			:isContainer true
		)]
	) ) ( def AsmL_MethodCallTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_MethodCallTerm
			:type String
			:location "280:3-280:27"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_MethodCallTerm
			:type AsmL_Term
			:location "281:3-281:52"
			:isContainer true
		)]
	) ) ( def AsmL_NewInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_MethodCallTerm]
		:structuralFeatures[]
	) ) ( def AsmL_PredicateTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Term]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_PredicateTerm
			:type AsmL_InWhereHolds
			:location "289:3-289:53"
			:isContainer true
		)]
	) ) ( def AsmL_ForAllTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_PredicateTerm]
		:structuralFeatures[]
	) ) ( def AsmL_ExistsTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_PredicateTerm]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_ExistsTerm
			:type Boolean
			:location "295:3-295:32"
		)]
	) ) ( def AsmL_AnyIn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_PredicateTerm]
		:structuralFeatures[]
	) ) ( def AsmL_SetTerm ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Term]
		:structuralFeatures[]
	) ) ( def AsmL_EnumerateSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_SetTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vals"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_EnumerateSet
			:type AsmL_Term
			:location "305:3-305:38"
			:isContainer true
		)]
	) ) ( def AsmL_RangeSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_SetTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "minval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RangeSet
			:type AsmL_Term
			:location "309:3-309:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "maxval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RangeSet
			:type AsmL_Term
			:location "310:3-310:37"
			:isContainer true
		)]
	) ) ( def AsmL_AlgorithmSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_SetTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner AsmL_AlgorithmSet
			:type AsmL_InWhereHolds
			:location "314:3-314:53"
			:isContainer true
		)]
	) ) ( def AsmL_SequenceTerm ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Term]
		:structuralFeatures[]
	) ) ( def AsmL_EnumerateSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_SequenceTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vals"
			:upper -1
			:lower 0
			:isOrdered true
			:owner AsmL_EnumerateSequence
			:type AsmL_Term
			:location "322:3-322:46"
			:isContainer true
		)]
	) ) ( def AsmL_RangeSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_SequenceTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "minval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RangeSequence
			:type AsmL_Term
			:location "326:3-326:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "maxval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_RangeSequence
			:type AsmL_Term
			:location "327:3-327:37"
			:isContainer true
		)]
	) ) ( def AsmL_Constant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[AsmL_Term]
		:structuralFeatures[]
	) ) ( def AsmL_BooleanConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_BooleanConstant
			:type Boolean
			:location "335:3-335:27"
		)]
	) ) ( def AsmL_IntegerConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_IntegerConstant
			:type Integer
			:location "339:3-339:27"
		)]
	) ) ( def AsmL_StringConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Constant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner AsmL_StringConstant
			:type String
			:location "343:3-343:26"
		)]
	) ) ( def AsmL_NullConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[AsmL_Constant]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "354:2-354:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "355:2-355:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "356:2-356:19"
	) )]
) )
