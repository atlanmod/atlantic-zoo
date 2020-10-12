( declare Bossa_BossaProgramm )
( declare Bossa_Scheduler )
( declare Bossa_NormalScheduler )
( declare Bossa_VirtualScheduler )
( declare Bossa_AbstractSchedulerDecl )
( declare Bossa_SchedulerDecl )
( declare Bossa_VSchdulerDecl )
( declare Bossa_ConstDef )
( declare Bossa_TypeDef )
( declare Bossa_EnumRange )
( declare Bossa_EnumDef )
( declare Bossa_BagId )
( declare Bossa_RangeDef )
( declare Bossa_ProcessDef )
( declare Bossa_SchedulerDef )
( declare Bossa_ProcessVarDecl )
( declare Bossa_Timer_ProcessVarDecl )
( declare Bossa_System_ProcessVarDecl )
( declare Bossa_Normal_ProcessVarDecl )
( declare Bossa_HandlerDef )
( declare Bossa_InterfaceDef )
( declare Bossa_FunctionDef )
( declare Bossa_Expression )
( declare Bossa_Integer_Expression )
( declare Bossa_Id_Expression )
( declare Bossa_State_Expression )
( declare Bossa_True_Expression )
( declare Bossa_False_Expression )
( declare Bossa_Unop_Expression )
( declare Bossa_Etoile_Expression )
( declare Bossa_ExpId_Expression )
( declare Bossa_Select_Expression )
( declare Bossa_FnName_Expression )
( declare Bossa_Empty_Expression )
( declare Bossa_SRCOnSched_Expression )
( declare Bossa_SchedulerOf_Expression )
( declare Bossa_In_Expression )
( declare Bossa_Parenthese_Expression )
( declare Bossa_Binop_Expression )
( declare Bossa_Compo_Binop_Expression )
( declare Bossa_ValDecl )
( declare Bossa_Normal_ValDecl )
( declare Bossa_System_ValDecl )
( declare Bossa_Timer_ValDecl )
( declare Bossa_FunDecl )
( declare Bossa_StateDef )
( declare Bossa_ClassNameStorage )
( declare Bossa_OrderDef )
( declare Bossa_AdmissionDef )
( declare Bossa_TraceDef )
( declare Bossa_TypeExpr )
( declare Bossa_TypeOrVoid )
( declare Bossa_ParameterType )
( declare Bossa_Storage )
( declare Bossa_Process_Storage )
( declare Bossa_Scheduler_Storage )
( declare Bossa_Queue_Storage )
( declare Bossa_KeyCritDecls )
( declare Bossa_CompoKeyCritDecls )
( declare Bossa_CritDecls )
( declare Bossa_CritDecl )
( declare Bossa_CritDeclWhithId )
( declare Bossa_CritDeclWhithoutId )
( declare Bossa_ValDef )
( declare Bossa_AdmCrit )
( declare Bossa_AttachDetach )
( declare Bossa_ParamVarDecl )
( declare Bossa_SeqStmt )
( declare Bossa_TraceEvent )
( declare Bossa_TraceExpr )
( declare Bossa_TraceTest )
( declare Bossa_ProcParam )
( declare Bossa_Statment )
( declare Bossa_IfStmt )
( declare Bossa_ForStmt )
( declare Bossa_ForeachForStmt )
( declare Bossa_ForEachIncreasingForStmt )
( declare Bossa_ForEachDecreasingForStmt )
( declare Bossa_ReturnStmt )
( declare Bossa_SwitchStmt )
( declare Bossa_AssignStmt )
( declare Bossa_MoveStmt )
( declare Bossa_NormalMoveStmt )
( declare Bossa_ForwardMoveStmt )
( declare Bossa_StateRef )
( declare Bossa_DeferStmt )
( declare Bossa_PrimStmt )
( declare Bossa_ErrorStmt )
( declare Bossa_BreakStmt )
( declare Bossa_LocExpr )
( declare Bossa_MoveExpr )
( declare Bossa_Select_MoveExpr )
( declare Bossa_SatateName_MoveExpr )
( declare Bossa_ID_MoveExpr )
( declare Bossa_IDSource_MoveExpr )
( declare Bossa_IDTarget_MoveExpr )
( declare Bossa_ClassState )
( declare Bossa_OnHandlerDef )
( declare Bossa_EventName )
( declare Bossa_ComposantOfSwitchStmt )
( declare Bossa_ComposantOfInterFunc )
( declare Bossa_BossaTypeExpr )
( declare Bossa_QueueType )
( declare Bossa_Normal_QueueType )
( declare Bossa_Fifo_QueueType )
( declare Bossa_Lifo_QueueType )
( declare Bossa_Critop )
( declare Bossa_StateVisibility )
( declare Bossa_ClassName )
( declare Bossa_NonProcType )
( declare Bossa_Unop )
( declare Bossa_Binop )
( declare Bossa_AssignUnop )
( declare Bossa_AssignBinop )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Bossa ( struct-map
	KM3_Package
	:contents[( def Bossa_BossaProgramm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scheduler"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_BossaProgramm
			:type Bossa_Scheduler
			:location "13:3-13:45"
			:isContainer true
		)]
	) ) ( def Bossa_Scheduler ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultAtt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Boolean
			:location "21:3-21:34"
		) ( struct-map
			KM3_Attribute
			:name "high_Res"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Boolean
			:location "22:3-22:32"
		) ( struct-map
			KM3_Attribute
			:name "low_Res"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Boolean
			:location "23:3-23:31"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type String
			:location "24:3-24:25"
		) ( struct-map
			KM3_Reference
			:name "handlerDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Bossa_HandlerDef
			:location "26:3-26:68"
			:isContainer true
			:opposite scheduler
		) ( struct-map
			KM3_Reference
			:name "interfaceDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Bossa_InterfaceDef
			:location "27:3-27:72"
			:isContainer true
			:opposite scheduler
		) ( struct-map
			KM3_Reference
			:name "functionDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Scheduler
			:type Bossa_FunctionDef
			:location "28:3-28:70"
			:isContainer true
			:opposite scheduler
		)]
	) ) ( def Bossa_NormalScheduler ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Scheduler]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "schedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NormalScheduler
			:type Bossa_SchedulerDecl
			:location "34:3-34:53"
			:isContainer true
		)]
	) ) ( def Bossa_VirtualScheduler ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Scheduler]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vschedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_VirtualScheduler
			:type Bossa_VSchdulerDecl
			:location "40:3-40:54"
			:isContainer true
		)]
	) ) ( def Bossa_AbstractSchedulerDecl ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constDef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_ConstDef
			:location "45:3-45:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeDef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_TypeDef
			:location "46:3-46:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "funDecl"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_FunDecl
			:location "47:3-47:78"
			:isContainer true
			:opposite abstractSchedulerDecl
		) ( struct-map
			KM3_Reference
			:name "valDecl"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_ValDecl
			:location "48:3-48:78"
			:isContainer true
			:opposite abstractSchedulerDecl
		) ( struct-map
			KM3_Reference
			:name "stateDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_StateDef
			:location "49:3-49:76"
			:isContainer true
			:opposite abstractSchedulerDecl
		) ( struct-map
			KM3_Reference
			:name "orderDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_OrderDef
			:location "50:3-50:82"
			:isContainer true
			:opposite abstractSchedulerDecl
		) ( struct-map
			KM3_Reference
			:name "admissionDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_AdmissionDef
			:location "51:3-51:90"
			:isContainer true
			:opposite abstractSchedulerDecl
		) ( struct-map
			KM3_Reference
			:name "traceDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AbstractSchedulerDecl
			:type Bossa_TraceDef
			:location "52:3-52:82"
			:isContainer true
			:opposite abstractSchedulerDecl
		)]
	) ) ( def Bossa_SchedulerDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_AbstractSchedulerDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_SchedulerDecl
			:type Bossa_ProcessDef
			:location "57:3-57:47"
			:isContainer true
		)]
	) ) ( def Bossa_VSchdulerDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_AbstractSchedulerDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "schedulerDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_VSchdulerDecl
			:type Bossa_SchedulerDef
			:location "62:3-62:51"
			:isContainer true
		)]
	) ) ( def Bossa_ConstDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ConstDef
			:type String
			:location "67:3-67:25"
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ConstDef
			:type Bossa_Expression
			:location "68:3-68:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bossaTypeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ConstDef
			:type Bossa_BossaTypeExpr
			:location "69:3-69:52"
			:isContainer true
		)]
	) ) ( def Bossa_TypeDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumRang"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_TypeDef
			:type Bossa_EnumRange
			:location "74:3-74:44"
			:isContainer true
		)]
	) ) ( def Bossa_EnumRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_EnumRange
			:type Bossa_EnumDef
			:location "79:3-79:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rangeDef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_EnumRange
			:type Bossa_RangeDef
			:location "80:3-80:49"
			:isContainer true
		)]
	) ) ( def Bossa_EnumDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "theIds"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_EnumDef
			:type String
			:location "85:3-85:35"
		)]
	) ) ( def Bossa_BagId ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "theValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_BagId
			:type String
			:location "91:3-91:31"
		)]
	) ) ( def Bossa_RangeDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 2
			:lower 2
			:isOrdered false
			:owner Bossa_RangeDef
			:type Bossa_Expression
			:location "96:3-96:46"
			:isContainer true
		)]
	) ) ( def Bossa_ProcessDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processVarDecl"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcessDef
			:type Bossa_ProcessVarDecl
			:location "101:3-101:83"
			:isContainer true
			:opposite processDef
		)]
	) ) ( def Bossa_SchedulerDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processVarDecl"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_SchedulerDef
			:type Bossa_ProcessVarDecl
			:location "106:3-106:85"
			:isContainer true
			:opposite schedulerDef
		)]
	) ) ( def Bossa_ProcessVarDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcessVarDecl
			:type String
			:location "111:3-111:25"
		) ( struct-map
			KM3_Reference
			:name "processDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcessVarDecl
			:type Bossa_ProcessDef
			:location "112:3-112:63"
			:isContainer false
			:opposite processVarDecl
		) ( struct-map
			KM3_Reference
			:name "schedulerDef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcessVarDecl
			:type Bossa_SchedulerDef
			:location "113:3-113:67"
			:isContainer false
			:opposite processVarDecl
		)]
	) ) ( def Bossa_Timer_ProcessVarDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ProcessVarDecl]
		:structuralFeatures[]
	) ) ( def Bossa_System_ProcessVarDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ProcessVarDecl]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_System_ProcessVarDecl
			:type Boolean
			:location "123:3-123:30"
		) ( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_System_ProcessVarDecl
			:type Bossa_TypeExpr
			:location "124:3-124:43"
			:isContainer true
		)]
	) ) ( def Bossa_Normal_ProcessVarDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ProcessVarDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Normal_ProcessVarDecl
			:type Bossa_TypeExpr
			:location "129:3-129:43"
			:isContainer true
		)]
	) ) ( def Bossa_HandlerDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_HandlerDef
			:type String
			:location "134:3-134:25"
		) ( struct-map
			KM3_Reference
			:name "scheduler"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_HandlerDef
			:type Bossa_Scheduler
			:location "135:3-135:57"
			:isContainer false
			:opposite handlerDef
		) ( struct-map
			KM3_Reference
			:name "onHandlerDef"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_HandlerDef
			:type Bossa_OnHandlerDef
			:location "136:3-136:57"
			:isContainer true
		)]
	) ) ( def Bossa_InterfaceDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composantOfInterFunc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_InterfaceDef
			:type Bossa_ComposantOfInterFunc
			:location "141:3-141:73"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "scheduler"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_InterfaceDef
			:type Bossa_Scheduler
			:location "142:3-142:59"
			:isContainer false
			:opposite interfaceDef
		)]
	) ) ( def Bossa_FunctionDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composantOfInterFunc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_FunctionDef
			:type Bossa_ComposantOfInterFunc
			:location "147:3-147:73"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "scheduler"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_FunctionDef
			:type Bossa_Scheduler
			:location "148:3-148:58"
			:isContainer false
			:opposite functionDef
		)]
	) ) ( def Bossa_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Bossa_Integer_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "theValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Integer_Expression
			:type Integer
			:location "158:3-158:32"
		)]
	) ) ( def Bossa_Id_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Id_Expression
			:type String
			:location "163:3-163:25"
		)]
	) ) ( def Bossa_State_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "theValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_State_Expression
			:type String
			:location "168:3-168:31"
		)]
	) ) ( def Bossa_True_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[]
	) ) ( def Bossa_False_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[]
	) ) ( def Bossa_Unop_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "unop"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop_Expression
			:type Bossa_Unop
			:location "183:3-183:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop_Expression
			:type Bossa_Expression
			:location "184:3-184:41"
			:isContainer true
		)]
	) ) ( def Bossa_Etoile_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Etoile_Expression
			:type Bossa_Expression
			:location "189:3-189:41"
			:isContainer true
		)]
	) ) ( def Bossa_ExpId_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ExpId_Expression
			:type String
			:location "194:3-194:25"
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ExpId_Expression
			:type Bossa_Expression
			:location "195:3-195:41"
			:isContainer true
		)]
	) ) ( def Bossa_Select_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[]
	) ) ( def Bossa_FnName_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_FnName_Expression
			:type Bossa_Expression
			:location "205:3-205:45"
			:isContainer true
		)]
	) ) ( def Bossa_Empty_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Empty_Expression
			:type Bossa_ClassState
			:location "210:3-210:47"
			:isContainer true
		)]
	) ) ( def Bossa_SRCOnSched_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[]
	) ) ( def Bossa_SchedulerOf_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_SchedulerOf_Expression
			:type Bossa_Expression
			:location "220:3-220:41"
			:isContainer true
		)]
	) ) ( def Bossa_In_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "in"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_In_Expression
			:type Boolean
			:location "225:3-225:26"
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_In_Expression
			:type Bossa_Expression
			:location "226:3-226:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "classState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_In_Expression
			:type Bossa_ClassState
			:location "227:3-227:47"
			:isContainer true
		)]
	) ) ( def Bossa_Parenthese_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Parenthese_Expression
			:type Bossa_Expression
			:location "232:3-232:41"
			:isContainer true
		)]
	) ) ( def Bossa_Binop_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "id_Expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop_Expression
			:type Bossa_Id_Expression
			:location "237:3-237:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "compo_Binop_Expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop_Expression
			:type Bossa_Compo_Binop_Expression
			:location "238:3-238:71"
			:isContainer true
		)]
	) ) ( def Bossa_Compo_Binop_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "binop"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Compo_Binop_Expression
			:type Bossa_Binop
			:location "243:3-243:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "id_Expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Compo_Binop_Expression
			:type Bossa_Id_Expression
			:location "244:3-244:53"
			:isContainer true
		)]
	) ) ( def Bossa_ValDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ValDecl
			:type String
			:location "249:3-249:25"
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ValDecl
			:type Bossa_AbstractSchedulerDecl
			:location "250:3-250:78"
			:isContainer false
			:opposite valDecl
		)]
	) ) ( def Bossa_Normal_ValDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ValDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nonProcType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_Normal_ValDecl
			:type Bossa_NonProcType
			:location "255:3-255:55"
			:isContainer true
		)]
	) ) ( def Bossa_System_ValDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ValDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nonProcType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_System_ValDecl
			:type Bossa_NonProcType
			:location "260:3-260:55"
			:isContainer true
		)]
	) ) ( def Bossa_Timer_ValDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ValDecl]
		:structuralFeatures[]
	) ) ( def Bossa_FunDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameterTypes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_FunDecl
			:type Bossa_ParameterType
			:location "270:3-270:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nonProcType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_FunDecl
			:type Bossa_NonProcType
			:location "271:3-271:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_FunDecl
			:type Bossa_AbstractSchedulerDecl
			:location "272:3-272:78"
			:isContainer false
			:opposite funDecl
		)]
	) ) ( def Bossa_StateDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classNameStorage"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_StateDef
			:type Bossa_ClassNameStorage
			:location "277:3-277:65"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_StateDef
			:type Bossa_AbstractSchedulerDecl
			:location "278:3-278:79"
			:isContainer false
			:opposite stateDef
		)]
	) ) ( def Bossa_ClassNameStorage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ClassNameStorage
			:type String
			:location "283:3-283:25"
		) ( struct-map
			KM3_Reference
			:name "className"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ClassNameStorage
			:type Bossa_ClassName
			:location "284:3-284:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "storage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_ClassNameStorage
			:type Bossa_Storage
			:location "285:3-285:47"
			:isContainer true
		)]
	) ) ( def Bossa_OrderDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "keyCritDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_OrderDef
			:type Bossa_KeyCritDecls
			:location "290:3-290:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "critDecls"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_OrderDef
			:type Bossa_CritDecls
			:location "291:3-291:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_OrderDef
			:type Bossa_AbstractSchedulerDecl
			:location "292:3-292:79"
			:isContainer false
			:opposite orderDef
		)]
	) ) ( def Bossa_AdmissionDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "valDef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AdmissionDef
			:type Bossa_ValDef
			:location "297:3-297:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "admCrit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AdmissionDef
			:type Bossa_AdmCrit
			:location "298:3-298:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attachDetach"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AdmissionDef
			:type Bossa_AttachDetach
			:location "299:3-299:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AdmissionDef
			:type Bossa_AbstractSchedulerDecl
			:location "300:3-300:83"
			:isContainer false
			:opposite admissionDef
		)]
	) ) ( def Bossa_TraceDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "traceEvent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TraceDef
			:type Bossa_TraceEvent
			:location "305:3-305:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "traceExpr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TraceDef
			:type Bossa_TraceExpr
			:location "306:3-306:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "traceTest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TraceDef
			:type Bossa_TraceTest
			:location "307:3-307:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "abstractSchedulerDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_TraceDef
			:type Bossa_AbstractSchedulerDecl
			:location "308:3-308:79"
			:isContainer false
			:opposite traceDef
		)]
	) ) ( def Bossa_TypeExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TypeExpr
			:type String
			:location "313:3-313:31"
		) ( struct-map
			KM3_Reference
			:name "bossaTypeExpr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TypeExpr
			:type Bossa_BossaTypeExpr
			:location "314:3-314:59"
			:isContainer true
		)]
	) ) ( def Bossa_TypeOrVoid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVoid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_TypeOrVoid
			:type Boolean
			:location "319:3-319:30"
		) ( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_TypeOrVoid
			:type Bossa_TypeExpr
			:location "320:3-320:49"
			:isContainer true
		)]
	) ) ( def Bossa_ParameterType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_ParameterType
			:type Bossa_TypeExpr
			:location "325:3-325:49"
			:isContainer true
		)]
	) ) ( def Bossa_Storage ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Bossa_Process_Storage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Storage]
		:structuralFeatures[]
	) ) ( def Bossa_Scheduler_Storage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Storage]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateVisibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_Scheduler_Storage
			:type Bossa_StateVisibility
			:location "340:3-340:63"
			:isContainer true
		)]
	) ) ( def Bossa_Queue_Storage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Storage]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateVisibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_Queue_Storage
			:type Bossa_StateVisibility
			:location "345:3-345:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "queueType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_Queue_Storage
			:type Bossa_QueueType
			:location "346:3-346:50"
			:isContainer true
		)]
	) ) ( def Bossa_KeyCritDecls ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compoKeyCritDecls"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_KeyCritDecls
			:type Bossa_CompoKeyCritDecls
			:location "351:3-351:67"
			:isContainer true
		)]
	) ) ( def Bossa_CompoKeyCritDecls ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "critDecl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_CompoKeyCritDecls
			:type Bossa_CritDecl
			:location "356:3-356:43"
			:isContainer true
		)]
	) ) ( def Bossa_CritDecls ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "critDecl"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_CritDecls
			:type Bossa_CritDecl
			:location "361:3-361:49"
			:isContainer true
		)]
	) ) ( def Bossa_CritDecl ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "critop"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_CritDecl
			:type Bossa_Critop
			:location "366:3-366:39"
			:isContainer true
		)]
	) ) ( def Bossa_CritDeclWhithId ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_CritDecl]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_CritDeclWhithId
			:type String
			:location "371:3-371:24"
		)]
	) ) ( def Bossa_CritDeclWhithoutId ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_CritDecl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 3
			:lower 2
			:isOrdered false
			:owner Bossa_CritDeclWhithoutId
			:type Bossa_Expression
			:location "377:3-377:47"
			:isContainer true
		)]
	) ) ( def Bossa_ValDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ValDef
			:type String
			:location "382:3-382:25"
		) ( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ValDef
			:type Bossa_TypeExpr
			:location "383:3-383:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ValDef
			:type Bossa_Expression
			:location "384:3-384:41"
			:isContainer true
		)]
	) ) ( def Bossa_AdmCrit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "paramVarDecl"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_AdmCrit
			:type Bossa_ParamVarDecl
			:location "389:3-389:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AdmCrit
			:type Bossa_Expression
			:location "390:3-390:41"
			:isContainer true
		)]
	) ) ( def Bossa_AttachDetach ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "procParam1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AttachDetach
			:type Bossa_ProcParam
			:location "395:3-395:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "procParam2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AttachDetach
			:type Bossa_ProcParam
			:location "396:3-396:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AttachDetach
			:type Bossa_SeqStmt
			:location "397:3-397:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AttachDetach
			:type Bossa_SeqStmt
			:location "398:3-398:42"
			:isContainer true
		)]
	) ) ( def Bossa_ParamVarDecl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ParamVarDecl
			:type String
			:location "403:3-403:25"
		) ( struct-map
			KM3_Reference
			:name "typeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ParamVarDecl
			:type Bossa_TypeExpr
			:location "404:3-404:43"
			:isContainer true
		)]
	) ) ( def Bossa_SeqStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "valDef"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_SeqStmt
			:type Bossa_ValDef
			:location "409:3-409:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stmt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_SeqStmt
			:type Bossa_Statment
			:location "410:3-410:43"
			:isContainer true
		)]
	) ) ( def Bossa_TraceEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eventName"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_TraceEvent
			:type Bossa_EventName
			:location "415:3-415:51"
			:isContainer true
		)]
	) ) ( def Bossa_TraceExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_TraceExpr
			:type String
			:location "420:3-420:31"
		)]
	) ) ( def Bossa_TraceTest ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_TraceTest
			:type Bossa_Expression
			:location "425:3-425:41"
			:isContainer true
		)]
	) ) ( def Bossa_ProcParam ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcParam
			:type String
			:location "430:3-430:25"
		) ( struct-map
			KM3_Attribute
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcParam
			:type Boolean
			:location "431:3-431:31"
		) ( struct-map
			KM3_Attribute
			:name "scheduler"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ProcParam
			:type Boolean
			:location "432:3-432:33"
		)]
	) ) ( def Bossa_Statment ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Bossa_IfStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_IfStmt
			:type Bossa_Expression
			:location "442:3-442:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 2
			:lower 1
			:isOrdered false
			:owner Bossa_IfStmt
			:type Bossa_SeqStmt
			:location "443:3-443:47"
			:isContainer true
		)]
	) ) ( def Bossa_ForStmt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Bossa_Statment]
		:structuralFeatures[]
	) ) ( def Bossa_ForeachForStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ForStmt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForeachForStmt
			:type String
			:location "453:3-453:25"
		) ( struct-map
			KM3_Attribute
			:name "isIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForeachForStmt
			:type Boolean
			:location "454:3-454:28"
		) ( struct-map
			KM3_Reference
			:name "classState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_ForeachForStmt
			:type Bossa_ClassState
			:location "455:3-455:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForeachForStmt
			:type Bossa_SeqStmt
			:location "456:3-456:41"
			:isContainer true
		)]
	) ) ( def Bossa_ForEachIncreasingForStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ForStmt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForEachIncreasingForStmt
			:type String
			:location "461:3-461:25"
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForEachIncreasingForStmt
			:type Bossa_SeqStmt
			:location "462:3-462:41"
			:isContainer true
		)]
	) ) ( def Bossa_ForEachDecreasingForStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_ForStmt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForEachDecreasingForStmt
			:type String
			:location "467:3-467:25"
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ForEachDecreasingForStmt
			:type Bossa_SeqStmt
			:location "468:3-468:41"
			:isContainer true
		)]
	) ) ( def Bossa_ReturnStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_ReturnStmt
			:type Bossa_Expression
			:location "473:3-473:47"
			:isContainer true
		)]
	) ) ( def Bossa_SwitchStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "locExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_SwitchStmt
			:type Bossa_LocExpr
			:location "478:3-478:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "composantOfSwitchStmt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_SwitchStmt
			:type Bossa_ComposantOfSwitchStmt
			:location "479:3-479:73"
			:isContainer true
		)]
	) ) ( def Bossa_AssignStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "locExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignStmt
			:type Bossa_LocExpr
			:location "484:3-484:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "assignUnop"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AssignStmt
			:type Bossa_AssignUnop
			:location "485:3-485:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "assignBinop"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AssignStmt
			:type Bossa_AssignBinop
			:location "486:3-486:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_AssignStmt
			:type Bossa_Expression
			:location "487:3-487:47"
			:isContainer true
		)]
	) ) ( def Bossa_MoveStmt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isHead"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_MoveStmt
			:type Boolean
			:location "493:3-493:30"
		) ( struct-map
			KM3_Attribute
			:name "isTail"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_MoveStmt
			:type Boolean
			:location "494:3-494:30"
		) ( struct-map
			KM3_Reference
			:name "moveExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_MoveStmt
			:type Bossa_MoveExpr
			:location "495:3-495:43"
			:isContainer true
		)]
	) ) ( def Bossa_NormalMoveStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveStmt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stateRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NormalMoveStmt
			:type Bossa_StateRef
			:location "500:3-500:43"
			:isContainer true
		)]
	) ) ( def Bossa_ForwardMoveStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveStmt]
		:structuralFeatures[]
	) ) ( def Bossa_StateRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stateRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_StateRef
			:type String
			:location "510:3-510:31"
		)]
	) ) ( def Bossa_DeferStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "deferStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_DeferStmt
			:type String
			:location "515:3-515:32"
		)]
	) ) ( def Bossa_PrimStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_PrimStmt
			:type Bossa_Expression
			:location "520:3-520:45"
			:isContainer true
		)]
	) ) ( def Bossa_ErrorStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ErrorStmt
			:type String
			:location "525:3-525:32"
		)]
	) ) ( def Bossa_BreakStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_Statment]
		:structuralFeatures[]
	) ) ( def Bossa_LocExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stateName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_LocExpr
			:type String
			:location "535:3-535:32"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_LocExpr
			:type String
			:location "536:3-536:29"
		)]
	) ) ( def Bossa_MoveExpr ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Bossa_Select_MoveExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveExpr]
		:structuralFeatures[]
	) ) ( def Bossa_SatateName_MoveExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveExpr]
		:structuralFeatures[]
	) ) ( def Bossa_ID_MoveExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ID_MoveExpr
			:type String
			:location "556:3-556:25"
		)]
	) ) ( def Bossa_IDSource_MoveExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_IDSource_MoveExpr
			:type String
			:location "561:3-561:25"
		)]
	) ) ( def Bossa_IDTarget_MoveExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_MoveExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_IDTarget_MoveExpr
			:type String
			:location "566:3-566:25"
		)]
	) ) ( def Bossa_ClassState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ClassState
			:type Boolean
			:location "571:3-571:29"
		) ( struct-map
			KM3_Reference
			:name "className"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_ClassState
			:type Bossa_ClassName
			:location "572:3-572:51"
			:isContainer true
		)]
	) ) ( def Bossa_OnHandlerDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eventName"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_OnHandlerDef
			:type Bossa_EventName
			:location "577:3-577:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_OnHandlerDef
			:type Bossa_SeqStmt
			:location "578:3-578:41"
			:isContainer true
		)]
	) ) ( def Bossa_EventName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "eventNameLeft"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_EventName
			:type String
			:location "583:3-583:36"
		) ( struct-map
			KM3_Attribute
			:name "eventNameRight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_EventName
			:type String
			:location "584:3-584:37"
		)]
	) ) ( def Bossa_ComposantOfSwitchStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classState"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Bossa_ComposantOfSwitchStmt
			:type Bossa_ClassState
			:location "590:3-590:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ComposantOfSwitchStmt
			:type Bossa_SeqStmt
			:location "591:3-591:41"
			:isContainer true
		)]
	) ) ( def Bossa_ComposantOfInterFunc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ComposantOfInterFunc
			:type String
			:location "596:3-596:25"
		) ( struct-map
			KM3_Reference
			:name "typeOrVoid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ComposantOfInterFunc
			:type Bossa_TypeOrVoid
			:location "597:3-597:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "paramVarDecl"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Bossa_ComposantOfInterFunc
			:type Bossa_ParamVarDecl
			:location "598:3-598:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "seqStmt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ComposantOfInterFunc
			:type Bossa_SeqStmt
			:location "599:3-599:41"
			:isContainer true
		)]
	) ) ( def Bossa_BossaTypeExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bossaTypeExpr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_BossaTypeExpr
			:type String
			:location "604:3-604:36"
		)]
	) ) ( def Bossa_QueueType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Bossa_Normal_QueueType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_QueueType]
		:structuralFeatures[]
	) ) ( def Bossa_Fifo_QueueType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_QueueType]
		:structuralFeatures[]
	) ) ( def Bossa_Lifo_QueueType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Bossa_QueueType]
		:structuralFeatures[]
	) ) ( def Bossa_Critop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lowest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Critop
			:type Boolean
			:location "629:3-629:30"
		) ( struct-map
			KM3_Attribute
			:name "highest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Critop
			:type Boolean
			:location "630:3-630:31"
		)]
	) ) ( def Bossa_StateVisibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "public"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_StateVisibility
			:type Boolean
			:location "635:3-635:36"
		) ( struct-map
			KM3_Attribute
			:name "private"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Bossa_StateVisibility
			:type Boolean
			:location "636:3-636:37"
		)]
	) ) ( def Bossa_ClassName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "className"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_ClassName
			:type String
			:location "641:3-641:32"
		)]
	) ) ( def Bossa_NonProcType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NonProcType
			:type Boolean
			:location "646:3-646:30"
		) ( struct-map
			KM3_Attribute
			:name "struct"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NonProcType
			:type Boolean
			:location "647:3-647:30"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NonProcType
			:type Boolean
			:location "648:3-648:26"
		) ( struct-map
			KM3_Attribute
			:name "nonProcType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_NonProcType
			:type String
			:location "649:3-649:34"
		)]
	) ) ( def Bossa_Unop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "plus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop
			:type Boolean
			:location "654:3-654:28"
		) ( struct-map
			KM3_Attribute
			:name "minus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop
			:type Boolean
			:location "655:3-655:29"
		) ( struct-map
			KM3_Attribute
			:name "excl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop
			:type Boolean
			:location "656:3-656:28"
		) ( struct-map
			KM3_Attribute
			:name "tild"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Unop
			:type Boolean
			:location "657:3-657:28"
		)]
	) ) ( def Bossa_Binop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "plus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "662:3-662:28"
		) ( struct-map
			KM3_Attribute
			:name "minus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "663:3-663:29"
		) ( struct-map
			KM3_Attribute
			:name "star"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "664:3-664:28"
		) ( struct-map
			KM3_Attribute
			:name "slash"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "665:3-665:29"
		) ( struct-map
			KM3_Attribute
			:name "percentage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "666:3-666:34"
		) ( struct-map
			KM3_Attribute
			:name "doubleAnd"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "667:3-667:33"
		) ( struct-map
			KM3_Attribute
			:name "doubleVerticalBar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "668:3-668:41"
		) ( struct-map
			KM3_Attribute
			:name "and"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "669:3-669:27"
		) ( struct-map
			KM3_Attribute
			:name "eq"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "670:3-670:26"
		) ( struct-map
			KM3_Attribute
			:name "ne"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "671:3-671:26"
		) ( struct-map
			KM3_Attribute
			:name "lt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "672:3-672:26"
		) ( struct-map
			KM3_Attribute
			:name "gt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "673:3-673:26"
		) ( struct-map
			KM3_Attribute
			:name "le"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "674:3-674:26"
		) ( struct-map
			KM3_Attribute
			:name "ge"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "675:3-675:26"
		) ( struct-map
			KM3_Attribute
			:name "doubleLt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "676:3-676:32"
		) ( struct-map
			KM3_Attribute
			:name "doubleGt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_Binop
			:type Boolean
			:location "677:3-677:32"
		)]
	) ) ( def Bossa_AssignUnop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "doublePlus"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignUnop
			:type Boolean
			:location "682:3-682:34"
		) ( struct-map
			KM3_Attribute
			:name "doubleMoins"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignUnop
			:type Boolean
			:location "683:3-683:35"
		)]
	) ) ( def Bossa_AssignBinop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "affect"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "688:3-688:30"
		) ( struct-map
			KM3_Attribute
			:name "plusEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "689:3-689:33"
		) ( struct-map
			KM3_Attribute
			:name "moinsEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "690:3-690:34"
		) ( struct-map
			KM3_Attribute
			:name "starEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "691:3-691:33"
		) ( struct-map
			KM3_Attribute
			:name "slashEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "692:3-692:34"
		) ( struct-map
			KM3_Attribute
			:name "percentageEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "693:3-693:39"
		) ( struct-map
			KM3_Attribute
			:name "andEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "694:3-694:32"
		) ( struct-map
			KM3_Attribute
			:name "orEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "695:3-695:31"
		) ( struct-map
			KM3_Attribute
			:name "doubleLtEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "696:3-696:37"
		) ( struct-map
			KM3_Attribute
			:name "doubleGtEqual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Bossa_AssignBinop
			:type Boolean
			:location "697:3-697:37"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "702:2-702:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "703:2-703:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "704:2-704:19"
	) )]
) )
