CREATE TABLE BossaProgramm (
	__IDBossaProgramm__ Integer NOT NULL,
	FOREIGN KEY scheduler (__FKscheduler__) REFERENCES Scheduler (__IDScheduler__),
	PRIMARY KEY BossaProgramm (__IDBossaProgramm__),
	__FKscheduler__ Integer
) ;

CREATE TABLE Scheduler (
	__IDScheduler__ Integer NOT NULL,
	defaultAtt Boolean,
	high_Res Boolean,
	low_Res Boolean,
	id text,
	FOREIGN KEY handlerDef (__FKhandlerDef__) REFERENCES HandlerDef (__IDHandlerDef__),
	FOREIGN KEY interfaceDef (__FKinterfaceDef__) REFERENCES InterfaceDef (__IDInterfaceDef__),
	FOREIGN KEY functionDef (__FKfunctionDef__) REFERENCES FunctionDef (__IDFunctionDef__),
	PRIMARY KEY Scheduler (__IDScheduler__),
	__FKinterfaceDef__ Integer,
	__FKfunctionDef__ Integer,
	__FKhandlerDef__ Integer
) ;

CREATE TABLE NormalScheduler (
	__IDNormalScheduler__ Integer NOT NULL,
	FOREIGN KEY schedulerDecl (__FKschedulerDecl__) REFERENCES SchedulerDecl (__IDSchedulerDecl__),
	PRIMARY KEY NormalScheduler (__IDNormalScheduler__),
	__FKschedulerDecl__ Integer
) ;

CREATE TABLE VirtualScheduler (
	__IDVirtualScheduler__ Integer NOT NULL,
	FOREIGN KEY vschedulerDecl (__FKvschedulerDecl__) REFERENCES VSchdulerDecl (__IDVSchdulerDecl__),
	PRIMARY KEY VirtualScheduler (__IDVirtualScheduler__),
	__FKvschedulerDecl__ Integer
) ;

CREATE TABLE AbstractSchedulerDecl (
	__IDAbstractSchedulerDecl__ Integer NOT NULL,
	FOREIGN KEY stateDef (__FKstateDef__) REFERENCES StateDef (__IDStateDef__),
	FOREIGN KEY orderDef (__FKorderDef__) REFERENCES OrderDef (__IDOrderDef__),
	FOREIGN KEY admissionDef (__FKadmissionDef__) REFERENCES AdmissionDef (__IDAdmissionDef__),
	FOREIGN KEY traceDef (__FKtraceDef__) REFERENCES TraceDef (__IDTraceDef__),
	PRIMARY KEY AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	__FKadmissionDef__ Integer,
	__FKorderDef__ Integer,
	__FKtraceDef__ Integer,
	__FKstateDef__ Integer
) ;

CREATE TABLE SchedulerDecl (
	__IDSchedulerDecl__ Integer NOT NULL,
	FOREIGN KEY processDef (__FKprocessDef__) REFERENCES ProcessDef (__IDProcessDef__),
	PRIMARY KEY SchedulerDecl (__IDSchedulerDecl__),
	__FKprocessDef__ Integer
) ;

CREATE TABLE VSchdulerDecl (
	__IDVSchdulerDecl__ Integer NOT NULL,
	FOREIGN KEY schedulerDef (__FKschedulerDef__) REFERENCES SchedulerDef (__IDSchedulerDef__),
	PRIMARY KEY VSchdulerDecl (__IDVSchdulerDecl__),
	__FKschedulerDef__ Integer
) ;

CREATE TABLE ConstDef (
	__IDConstDef__ Integer NOT NULL,
	id text,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY bossaTypeExpr (__FKbossaTypeExpr__) REFERENCES BossaTypeExpr (__IDBossaTypeExpr__),
	PRIMARY KEY ConstDef (__IDConstDef__),
	__FKexpr__ Integer,
	__FKbossaTypeExpr__ Integer
) ;

CREATE TABLE TypeDef (
	__IDTypeDef__ Integer NOT NULL,
	FOREIGN KEY enumRang (__FKenumRang__) REFERENCES EnumRange (__IDEnumRange__),
	PRIMARY KEY TypeDef (__IDTypeDef__),
	__FKenumRang__ Integer
) ;

CREATE TABLE EnumRange (
	__IDEnumRange__ Integer NOT NULL,
	FOREIGN KEY enumDef (__FKenumDef__) REFERENCES EnumDef (__IDEnumDef__),
	FOREIGN KEY rangeDef (__FKrangeDef__) REFERENCES RangeDef (__IDRangeDef__),
	PRIMARY KEY EnumRange (__IDEnumRange__),
	__FKrangeDef__ Integer,
	__FKenumDef__ Integer
) ;

CREATE TABLE EnumDef (
	__IDEnumDef__ Integer NOT NULL,
	PRIMARY KEY EnumDef (__IDEnumDef__)
) ;

CREATE TABLE BagId (
	__IDBagId__ Integer NOT NULL,
	theValue text,
	PRIMARY KEY BagId (__IDBagId__)
) ;

CREATE TABLE RangeDef (
	__IDRangeDef__ Integer NOT NULL,
	PRIMARY KEY RangeDef (__IDRangeDef__)
) ;

CREATE TABLE ProcessDef (
	__IDProcessDef__ Integer NOT NULL,
	PRIMARY KEY ProcessDef (__IDProcessDef__)
) ;

CREATE TABLE SchedulerDef (
	__IDSchedulerDef__ Integer NOT NULL,
	PRIMARY KEY SchedulerDef (__IDSchedulerDef__)
) ;

CREATE TABLE ProcessVarDecl (
	__IDProcessVarDecl__ Integer NOT NULL,
	id text,
	FOREIGN KEY processDef (__FKprocessDef__) REFERENCES ProcessDef (__IDProcessDef__),
	FOREIGN KEY schedulerDef (__FKschedulerDef__) REFERENCES SchedulerDef (__IDSchedulerDef__),
	PRIMARY KEY ProcessVarDecl (__IDProcessVarDecl__),
	__FKschedulerDef__ Integer,
	__FKprocessDef__ Integer
) ;

CREATE TABLE Timer_ProcessVarDecl (
	__IDTimer_ProcessVarDecl__ Integer NOT NULL,
	PRIMARY KEY Timer_ProcessVarDecl (__IDTimer_ProcessVarDecl__)
) ;

CREATE TABLE System_ProcessVarDecl (
	__IDSystem_ProcessVarDecl__ Integer NOT NULL,
	system Boolean,
	FOREIGN KEY typeExpr (__FKtypeExpr__) REFERENCES TypeExpr (__IDTypeExpr__),
	PRIMARY KEY System_ProcessVarDecl (__IDSystem_ProcessVarDecl__),
	__FKtypeExpr__ Integer
) ;

CREATE TABLE Normal_ProcessVarDecl (
	__IDNormal_ProcessVarDecl__ Integer NOT NULL,
	FOREIGN KEY typeExpr (__FKtypeExpr__) REFERENCES TypeExpr (__IDTypeExpr__),
	PRIMARY KEY Normal_ProcessVarDecl (__IDNormal_ProcessVarDecl__),
	__FKtypeExpr__ Integer
) ;

CREATE TABLE HandlerDef (
	__IDHandlerDef__ Integer NOT NULL,
	id text,
	FOREIGN KEY scheduler (__FKscheduler__) REFERENCES Scheduler (__IDScheduler__),
	PRIMARY KEY HandlerDef (__IDHandlerDef__),
	__FKscheduler__ Integer
) ;

CREATE TABLE InterfaceDef (
	__IDInterfaceDef__ Integer NOT NULL,
	FOREIGN KEY scheduler (__FKscheduler__) REFERENCES Scheduler (__IDScheduler__),
	PRIMARY KEY InterfaceDef (__IDInterfaceDef__),
	__FKscheduler__ Integer
) ;

CREATE TABLE FunctionDef (
	__IDFunctionDef__ Integer NOT NULL,
	FOREIGN KEY scheduler (__FKscheduler__) REFERENCES Scheduler (__IDScheduler__),
	PRIMARY KEY FunctionDef (__IDFunctionDef__),
	__FKscheduler__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE Integer_Expression (
	__IDInteger_Expression__ Integer NOT NULL,
	theValue Integer,
	PRIMARY KEY Integer_Expression (__IDInteger_Expression__)
) ;

CREATE TABLE Id_Expression (
	__IDId_Expression__ Integer NOT NULL,
	id text,
	PRIMARY KEY Id_Expression (__IDId_Expression__)
) ;

CREATE TABLE State_Expression (
	__IDState_Expression__ Integer NOT NULL,
	theValue text,
	PRIMARY KEY State_Expression (__IDState_Expression__)
) ;

CREATE TABLE True_Expression (
	__IDTrue_Expression__ Integer NOT NULL,
	PRIMARY KEY True_Expression (__IDTrue_Expression__)
) ;

CREATE TABLE False_Expression (
	__IDFalse_Expression__ Integer NOT NULL,
	PRIMARY KEY False_Expression (__IDFalse_Expression__)
) ;

CREATE TABLE Unop_Expression (
	__IDUnop_Expression__ Integer NOT NULL,
	FOREIGN KEY unop (__FKunop__) REFERENCES Unop (__IDUnop__),
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Unop_Expression (__IDUnop_Expression__),
	__FKexpr__ Integer,
	__FKunop__ Integer
) ;

CREATE TABLE Etoile_Expression (
	__IDEtoile_Expression__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Etoile_Expression (__IDEtoile_Expression__),
	__FKexpr__ Integer
) ;

CREATE TABLE ExpId_Expression (
	__IDExpId_Expression__ Integer NOT NULL,
	id text,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ExpId_Expression (__IDExpId_Expression__),
	__FKexpr__ Integer
) ;

CREATE TABLE Select_Expression (
	__IDSelect_Expression__ Integer NOT NULL,
	PRIMARY KEY Select_Expression (__IDSelect_Expression__)
) ;

CREATE TABLE FnName_Expression (
	__IDFnName_Expression__ Integer NOT NULL,
	PRIMARY KEY FnName_Expression (__IDFnName_Expression__)
) ;

CREATE TABLE Empty_Expression (
	__IDEmpty_Expression__ Integer NOT NULL,
	FOREIGN KEY classState (__FKclassState__) REFERENCES ClassState (__IDClassState__),
	PRIMARY KEY Empty_Expression (__IDEmpty_Expression__),
	__FKclassState__ Integer
) ;

CREATE TABLE SRCOnSched_Expression (
	__IDSRCOnSched_Expression__ Integer NOT NULL,
	PRIMARY KEY SRCOnSched_Expression (__IDSRCOnSched_Expression__)
) ;

CREATE TABLE SchedulerOf_Expression (
	__IDSchedulerOf_Expression__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SchedulerOf_Expression (__IDSchedulerOf_Expression__),
	__FKexpr__ Integer
) ;

CREATE TABLE In_Expression (
	__IDIn_Expression__ Integer NOT NULL,
	"in" Boolean,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY classState (__FKclassState__) REFERENCES ClassState (__IDClassState__),
	PRIMARY KEY In_Expression (__IDIn_Expression__),
	__FKclassState__ Integer,
	__FKexpr__ Integer
) ;

CREATE TABLE Parenthese_Expression (
	__IDParenthese_Expression__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Parenthese_Expression (__IDParenthese_Expression__),
	__FKexpr__ Integer
) ;

CREATE TABLE Binop_Expression (
	__IDBinop_Expression__ Integer NOT NULL,
	FOREIGN KEY id_Expression (__FKid_Expression__) REFERENCES Id_Expression (__IDId_Expression__),
	FOREIGN KEY compo_Binop_Expression (__FKcompo_Binop_Expression__) REFERENCES Compo_Binop_Expression (__IDCompo_Binop_Expression__),
	PRIMARY KEY Binop_Expression (__IDBinop_Expression__),
	__FKcompo_Binop_Expression__ Integer,
	__FKid_Expression__ Integer
) ;

CREATE TABLE Compo_Binop_Expression (
	__IDCompo_Binop_Expression__ Integer NOT NULL,
	FOREIGN KEY binop (__FKbinop__) REFERENCES Binop (__IDBinop__),
	FOREIGN KEY id_Expression (__FKid_Expression__) REFERENCES Id_Expression (__IDId_Expression__),
	PRIMARY KEY Compo_Binop_Expression (__IDCompo_Binop_Expression__),
	__FKid_Expression__ Integer,
	__FKbinop__ Integer
) ;

CREATE TABLE ValDecl (
	__IDValDecl__ Integer NOT NULL,
	id text,
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY ValDecl (__IDValDecl__),
	__FKabstractSchedulerDecl__ Integer
) ;

CREATE TABLE Normal_ValDecl (
	__IDNormal_ValDecl__ Integer NOT NULL,
	FOREIGN KEY nonProcType (__FKnonProcType__) REFERENCES NonProcType (__IDNonProcType__),
	PRIMARY KEY Normal_ValDecl (__IDNormal_ValDecl__),
	__FKnonProcType__ Integer
) ;

CREATE TABLE System_ValDecl (
	__IDSystem_ValDecl__ Integer NOT NULL,
	FOREIGN KEY nonProcType (__FKnonProcType__) REFERENCES NonProcType (__IDNonProcType__),
	PRIMARY KEY System_ValDecl (__IDSystem_ValDecl__),
	__FKnonProcType__ Integer
) ;

CREATE TABLE Timer_ValDecl (
	__IDTimer_ValDecl__ Integer NOT NULL,
	PRIMARY KEY Timer_ValDecl (__IDTimer_ValDecl__)
) ;

CREATE TABLE FunDecl (
	__IDFunDecl__ Integer NOT NULL,
	FOREIGN KEY parameterTypes (__FKparameterTypes__) REFERENCES ParameterType (__IDParameterType__),
	FOREIGN KEY nonProcType (__FKnonProcType__) REFERENCES NonProcType (__IDNonProcType__),
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY FunDecl (__IDFunDecl__),
	__FKparameterTypes__ Integer,
	__FKnonProcType__ Integer,
	__FKabstractSchedulerDecl__ Integer
) ;

CREATE TABLE StateDef (
	__IDStateDef__ Integer NOT NULL,
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY StateDef (__IDStateDef__),
	__FKabstractSchedulerDecl__ Integer
) ;

CREATE TABLE ClassNameStorage (
	__IDClassNameStorage__ Integer NOT NULL,
	id text,
	FOREIGN KEY className (__FKclassName__) REFERENCES ClassName (__IDClassName__),
	FOREIGN KEY storage (__FKstorage__) REFERENCES Storage (__IDStorage__),
	PRIMARY KEY ClassNameStorage (__IDClassNameStorage__),
	__FKstorage__ Integer,
	__FKclassName__ Integer
) ;

CREATE TABLE OrderDef (
	__IDOrderDef__ Integer NOT NULL,
	FOREIGN KEY keyCritDecl (__FKkeyCritDecl__) REFERENCES KeyCritDecls (__IDKeyCritDecls__),
	FOREIGN KEY critDecls (__FKcritDecls__) REFERENCES CritDecls (__IDCritDecls__),
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY OrderDef (__IDOrderDef__),
	__FKabstractSchedulerDecl__ Integer,
	__FKkeyCritDecl__ Integer,
	__FKcritDecls__ Integer
) ;

CREATE TABLE AdmissionDef (
	__IDAdmissionDef__ Integer NOT NULL,
	FOREIGN KEY admCrit (__FKadmCrit__) REFERENCES AdmCrit (__IDAdmCrit__),
	FOREIGN KEY attachDetach (__FKattachDetach__) REFERENCES AttachDetach (__IDAttachDetach__),
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY AdmissionDef (__IDAdmissionDef__),
	__FKattachDetach__ Integer,
	__FKabstractSchedulerDecl__ Integer,
	__FKadmCrit__ Integer
) ;

CREATE TABLE TraceDef (
	__IDTraceDef__ Integer NOT NULL,
	FOREIGN KEY traceEvent (__FKtraceEvent__) REFERENCES TraceEvent (__IDTraceEvent__),
	FOREIGN KEY traceExpr (__FKtraceExpr__) REFERENCES TraceExpr (__IDTraceExpr__),
	FOREIGN KEY traceTest (__FKtraceTest__) REFERENCES TraceTest (__IDTraceTest__),
	FOREIGN KEY abstractSchedulerDecl (__FKabstractSchedulerDecl__) REFERENCES AbstractSchedulerDecl (__IDAbstractSchedulerDecl__),
	PRIMARY KEY TraceDef (__IDTraceDef__),
	__FKtraceExpr__ Integer,
	__FKtraceTest__ Integer,
	__FKabstractSchedulerDecl__ Integer,
	__FKtraceEvent__ Integer
) ;

CREATE TABLE TypeExpr (
	__IDTypeExpr__ Integer NOT NULL,
	id text,
	FOREIGN KEY bossaTypeExpr (__FKbossaTypeExpr__) REFERENCES BossaTypeExpr (__IDBossaTypeExpr__),
	PRIMARY KEY TypeExpr (__IDTypeExpr__),
	__FKbossaTypeExpr__ Integer
) ;

CREATE TABLE TypeOrVoid (
	__IDTypeOrVoid__ Integer NOT NULL,
	isVoid Boolean,
	FOREIGN KEY typeExpr (__FKtypeExpr__) REFERENCES TypeExpr (__IDTypeExpr__),
	PRIMARY KEY TypeOrVoid (__IDTypeOrVoid__),
	__FKtypeExpr__ Integer
) ;

CREATE TABLE ParameterType (
	__IDParameterType__ Integer NOT NULL,
	PRIMARY KEY ParameterType (__IDParameterType__)
) ;

CREATE TABLE Storage (
	__IDStorage__ Integer NOT NULL,
	PRIMARY KEY Storage (__IDStorage__)
) ;

CREATE TABLE Process_Storage (
	__IDProcess_Storage__ Integer NOT NULL,
	PRIMARY KEY Process_Storage (__IDProcess_Storage__)
) ;

CREATE TABLE Scheduler_Storage (
	__IDScheduler_Storage__ Integer NOT NULL,
	FOREIGN KEY stateVisibility (__FKstateVisibility__) REFERENCES StateVisibility (__IDStateVisibility__),
	PRIMARY KEY Scheduler_Storage (__IDScheduler_Storage__),
	__FKstateVisibility__ Integer
) ;

CREATE TABLE Queue_Storage (
	__IDQueue_Storage__ Integer NOT NULL,
	FOREIGN KEY stateVisibility (__FKstateVisibility__) REFERENCES StateVisibility (__IDStateVisibility__),
	FOREIGN KEY queueType (__FKqueueType__) REFERENCES QueueType (__IDQueueType__),
	PRIMARY KEY Queue_Storage (__IDQueue_Storage__),
	__FKqueueType__ Integer,
	__FKstateVisibility__ Integer
) ;

CREATE TABLE KeyCritDecls (
	__IDKeyCritDecls__ Integer NOT NULL,
	PRIMARY KEY KeyCritDecls (__IDKeyCritDecls__)
) ;

CREATE TABLE CompoKeyCritDecls (
	__IDCompoKeyCritDecls__ Integer NOT NULL,
	FOREIGN KEY critDecl (__FKcritDecl__) REFERENCES CritDecl (__IDCritDecl__),
	PRIMARY KEY CompoKeyCritDecls (__IDCompoKeyCritDecls__),
	__FKcritDecl__ Integer
) ;

CREATE TABLE CritDecls (
	__IDCritDecls__ Integer NOT NULL,
	PRIMARY KEY CritDecls (__IDCritDecls__)
) ;

CREATE TABLE CritDecl (
	__IDCritDecl__ Integer NOT NULL,
	FOREIGN KEY critop (__FKcritop__) REFERENCES Critop (__IDCritop__),
	PRIMARY KEY CritDecl (__IDCritDecl__),
	__FKcritop__ Integer
) ;

CREATE TABLE CritDeclWhithId (
	__IDCritDeclWhithId__ Integer NOT NULL,
	id text,
	PRIMARY KEY CritDeclWhithId (__IDCritDeclWhithId__)
) ;

CREATE TABLE CritDeclWhithoutId (
	__IDCritDeclWhithoutId__ Integer NOT NULL,
	PRIMARY KEY CritDeclWhithoutId (__IDCritDeclWhithoutId__)
) ;

CREATE TABLE ValDef (
	__IDValDef__ Integer NOT NULL,
	id text,
	FOREIGN KEY typeExpr (__FKtypeExpr__) REFERENCES TypeExpr (__IDTypeExpr__),
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ValDef (__IDValDef__),
	__FKtypeExpr__ Integer,
	__FKexpr__ Integer
) ;

CREATE TABLE AdmCrit (
	__IDAdmCrit__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AdmCrit (__IDAdmCrit__),
	__FKexpr__ Integer
) ;

CREATE TABLE AttachDetach (
	__IDAttachDetach__ Integer NOT NULL,
	FOREIGN KEY procParam1 (__FKprocParam1__) REFERENCES ProcParam (__IDProcParam__),
	FOREIGN KEY procParam2 (__FKprocParam2__) REFERENCES ProcParam (__IDProcParam__),
	FOREIGN KEY seqStmt1 (__FKseqStmt1__) REFERENCES SeqStmt (__IDSeqStmt__),
	FOREIGN KEY seqStmt2 (__FKseqStmt2__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY AttachDetach (__IDAttachDetach__),
	__FKseqStmt2__ Integer,
	__FKseqStmt1__ Integer,
	__FKprocParam1__ Integer,
	__FKprocParam2__ Integer
) ;

CREATE TABLE ParamVarDecl (
	__IDParamVarDecl__ Integer NOT NULL,
	id text,
	FOREIGN KEY typeExpr (__FKtypeExpr__) REFERENCES TypeExpr (__IDTypeExpr__),
	PRIMARY KEY ParamVarDecl (__IDParamVarDecl__),
	__FKtypeExpr__ Integer
) ;

CREATE TABLE SeqStmt (
	__IDSeqStmt__ Integer NOT NULL,
	PRIMARY KEY SeqStmt (__IDSeqStmt__)
) ;

CREATE TABLE TraceEvent (
	__IDTraceEvent__ Integer NOT NULL,
	PRIMARY KEY TraceEvent (__IDTraceEvent__)
) ;

CREATE TABLE TraceExpr (
	__IDTraceExpr__ Integer NOT NULL,
	PRIMARY KEY TraceExpr (__IDTraceExpr__)
) ;

CREATE TABLE TraceTest (
	__IDTraceTest__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY TraceTest (__IDTraceTest__),
	__FKexpr__ Integer
) ;

CREATE TABLE ProcParam (
	__IDProcParam__ Integer NOT NULL,
	id text,
	process Boolean,
	scheduler Boolean,
	PRIMARY KEY ProcParam (__IDProcParam__)
) ;

CREATE TABLE Statment (
	__IDStatment__ Integer NOT NULL,
	PRIMARY KEY Statment (__IDStatment__)
) ;

CREATE TABLE IfStmt (
	__IDIfStmt__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY IfStmt (__IDIfStmt__),
	__FKexpr__ Integer
) ;

CREATE TABLE ForStmt (
	__IDForStmt__ Integer NOT NULL,
	PRIMARY KEY ForStmt (__IDForStmt__)
) ;

CREATE TABLE ForeachForStmt (
	__IDForeachForStmt__ Integer NOT NULL,
	id text,
	isIn Boolean,
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY ForeachForStmt (__IDForeachForStmt__),
	__FKseqStmt__ Integer
) ;

CREATE TABLE ForEachIncreasingForStmt (
	__IDForEachIncreasingForStmt__ Integer NOT NULL,
	id text,
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY ForEachIncreasingForStmt (__IDForEachIncreasingForStmt__),
	__FKseqStmt__ Integer
) ;

CREATE TABLE ForEachDecreasingForStmt (
	__IDForEachDecreasingForStmt__ Integer NOT NULL,
	id text,
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY ForEachDecreasingForStmt (__IDForEachDecreasingForStmt__),
	__FKseqStmt__ Integer
) ;

CREATE TABLE ReturnStmt (
	__IDReturnStmt__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ReturnStmt (__IDReturnStmt__),
	__FKexpr__ Integer
) ;

CREATE TABLE SwitchStmt (
	__IDSwitchStmt__ Integer NOT NULL,
	FOREIGN KEY locExpr (__FKlocExpr__) REFERENCES LocExpr (__IDLocExpr__),
	PRIMARY KEY SwitchStmt (__IDSwitchStmt__),
	__FKlocExpr__ Integer
) ;

CREATE TABLE AssignStmt (
	__IDAssignStmt__ Integer NOT NULL,
	FOREIGN KEY locExpr (__FKlocExpr__) REFERENCES LocExpr (__IDLocExpr__),
	FOREIGN KEY assignUnop (__FKassignUnop__) REFERENCES AssignUnop (__IDAssignUnop__),
	FOREIGN KEY assignBinop (__FKassignBinop__) REFERENCES AssignBinop (__IDAssignBinop__),
	FOREIGN KEY expr (__FKexpr__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AssignStmt (__IDAssignStmt__),
	__FKlocExpr__ Integer,
	__FKassignUnop__ Integer,
	__FKassignBinop__ Integer,
	__FKexpr__ Integer
) ;

CREATE TABLE MoveStmt (
	__IDMoveStmt__ Integer NOT NULL,
	isHead Boolean,
	isTail Boolean,
	FOREIGN KEY moveExpr (__FKmoveExpr__) REFERENCES MoveExpr (__IDMoveExpr__),
	PRIMARY KEY MoveStmt (__IDMoveStmt__),
	__FKmoveExpr__ Integer
) ;

CREATE TABLE NormalMoveStmt (
	__IDNormalMoveStmt__ Integer NOT NULL,
	FOREIGN KEY stateRef (__FKstateRef__) REFERENCES StateRef (__IDStateRef__),
	PRIMARY KEY NormalMoveStmt (__IDNormalMoveStmt__),
	__FKstateRef__ Integer
) ;

CREATE TABLE ForwardMoveStmt (
	__IDForwardMoveStmt__ Integer NOT NULL,
	PRIMARY KEY ForwardMoveStmt (__IDForwardMoveStmt__)
) ;

CREATE TABLE StateRef (
	__IDStateRef__ Integer NOT NULL,
	stateRef text,
	PRIMARY KEY StateRef (__IDStateRef__)
) ;

CREATE TABLE DeferStmt (
	__IDDeferStmt__ Integer NOT NULL,
	deferStmt text,
	PRIMARY KEY DeferStmt (__IDDeferStmt__)
) ;

CREATE TABLE PrimStmt (
	__IDPrimStmt__ Integer NOT NULL,
	PRIMARY KEY PrimStmt (__IDPrimStmt__)
) ;

CREATE TABLE ErrorStmt (
	__IDErrorStmt__ Integer NOT NULL,
	errorType text,
	PRIMARY KEY ErrorStmt (__IDErrorStmt__)
) ;

CREATE TABLE BreakStmt (
	__IDBreakStmt__ Integer NOT NULL,
	PRIMARY KEY BreakStmt (__IDBreakStmt__)
) ;

CREATE TABLE LocExpr (
	__IDLocExpr__ Integer NOT NULL,
	stateName text,
	PRIMARY KEY LocExpr (__IDLocExpr__)
) ;

CREATE TABLE MoveExpr (
	__IDMoveExpr__ Integer NOT NULL,
	PRIMARY KEY MoveExpr (__IDMoveExpr__)
) ;

CREATE TABLE Select_MoveExpr (
	__IDSelect_MoveExpr__ Integer NOT NULL,
	PRIMARY KEY Select_MoveExpr (__IDSelect_MoveExpr__)
) ;

CREATE TABLE SatateName_MoveExpr (
	__IDSatateName_MoveExpr__ Integer NOT NULL,
	PRIMARY KEY SatateName_MoveExpr (__IDSatateName_MoveExpr__)
) ;

CREATE TABLE ID_MoveExpr (
	__IDID_MoveExpr__ Integer NOT NULL,
	id text,
	PRIMARY KEY ID_MoveExpr (__IDID_MoveExpr__)
) ;

CREATE TABLE IDSource_MoveExpr (
	__IDIDSource_MoveExpr__ Integer NOT NULL,
	id text,
	PRIMARY KEY IDSource_MoveExpr (__IDIDSource_MoveExpr__)
) ;

CREATE TABLE IDTarget_MoveExpr (
	__IDIDTarget_MoveExpr__ Integer NOT NULL,
	id text,
	PRIMARY KEY IDTarget_MoveExpr (__IDIDTarget_MoveExpr__)
) ;

CREATE TABLE ClassState (
	__IDClassState__ Integer NOT NULL,
	state Boolean,
	FOREIGN KEY className (__FKclassName__) REFERENCES ClassName (__IDClassName__),
	PRIMARY KEY ClassState (__IDClassState__),
	__FKclassName__ Integer
) ;

CREATE TABLE OnHandlerDef (
	__IDOnHandlerDef__ Integer NOT NULL,
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY OnHandlerDef (__IDOnHandlerDef__),
	__FKseqStmt__ Integer
) ;

CREATE TABLE EventName (
	__IDEventName__ Integer NOT NULL,
	eventNameLeft text,
	eventNameRight text,
	PRIMARY KEY EventName (__IDEventName__)
) ;

CREATE TABLE ComposantOfSwitchStmt (
	__IDComposantOfSwitchStmt__ Integer NOT NULL,
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY ComposantOfSwitchStmt (__IDComposantOfSwitchStmt__),
	__FKseqStmt__ Integer
) ;

CREATE TABLE ComposantOfInterFunc (
	__IDComposantOfInterFunc__ Integer NOT NULL,
	id text,
	FOREIGN KEY typeOrVoid (__FKtypeOrVoid__) REFERENCES TypeOrVoid (__IDTypeOrVoid__),
	FOREIGN KEY seqStmt (__FKseqStmt__) REFERENCES SeqStmt (__IDSeqStmt__),
	PRIMARY KEY ComposantOfInterFunc (__IDComposantOfInterFunc__),
	__FKseqStmt__ Integer,
	__FKtypeOrVoid__ Integer
) ;

CREATE TABLE BossaTypeExpr (
	__IDBossaTypeExpr__ Integer NOT NULL,
	bossaTypeExpr text,
	PRIMARY KEY BossaTypeExpr (__IDBossaTypeExpr__)
) ;

CREATE TABLE QueueType (
	__IDQueueType__ Integer NOT NULL,
	PRIMARY KEY QueueType (__IDQueueType__)
) ;

CREATE TABLE Normal_QueueType (
	__IDNormal_QueueType__ Integer NOT NULL,
	PRIMARY KEY Normal_QueueType (__IDNormal_QueueType__)
) ;

CREATE TABLE Fifo_QueueType (
	__IDFifo_QueueType__ Integer NOT NULL,
	PRIMARY KEY Fifo_QueueType (__IDFifo_QueueType__)
) ;

CREATE TABLE Lifo_QueueType (
	__IDLifo_QueueType__ Integer NOT NULL,
	PRIMARY KEY Lifo_QueueType (__IDLifo_QueueType__)
) ;

CREATE TABLE Critop (
	__IDCritop__ Integer NOT NULL,
	lowest Boolean,
	highest Boolean,
	PRIMARY KEY Critop (__IDCritop__)
) ;

CREATE TABLE StateVisibility (
	__IDStateVisibility__ Integer NOT NULL,
	public Boolean,
	private Boolean,
	PRIMARY KEY StateVisibility (__IDStateVisibility__)
) ;

CREATE TABLE ClassName (
	__IDClassName__ Integer NOT NULL,
	className text,
	PRIMARY KEY ClassName (__IDClassName__)
) ;

CREATE TABLE NonProcType (
	__IDNonProcType__ Integer NOT NULL,
	system Boolean,
	struct Boolean,
	id Boolean,
	nonProcType text,
	PRIMARY KEY NonProcType (__IDNonProcType__)
) ;

CREATE TABLE Unop (
	__IDUnop__ Integer NOT NULL,
	plus Boolean,
	minus Boolean,
	excl Boolean,
	tild Boolean,
	PRIMARY KEY Unop (__IDUnop__)
) ;

CREATE TABLE Binop (
	__IDBinop__ Integer NOT NULL,
	plus Boolean,
	minus Boolean,
	star Boolean,
	slash Boolean,
	percentage Boolean,
	doubleAnd Boolean,
	doubleVerticalBar Boolean,
	"and" Boolean,
	eq Boolean,
	ne Boolean,
	lt Boolean,
	gt Boolean,
	le Boolean,
	ge Boolean,
	doubleLt Boolean,
	doubleGt Boolean,
	PRIMARY KEY Binop (__IDBinop__)
) ;

CREATE TABLE AssignUnop (
	__IDAssignUnop__ Integer NOT NULL,
	doublePlus Boolean,
	doubleMoins Boolean,
	PRIMARY KEY AssignUnop (__IDAssignUnop__)
) ;

CREATE TABLE AssignBinop (
	__IDAssignBinop__ Integer NOT NULL,
	affect Boolean,
	plusEqual Boolean,
	moinsEqual Boolean,
	starEqual Boolean,
	slashEqual Boolean,
	percentageEqual Boolean,
	andEqual Boolean,
	orEqual Boolean,
	doubleLtEqual Boolean,
	doubleGtEqual Boolean,
	PRIMARY KEY AssignBinop (__IDAssignBinop__)
) ;

CREATE TABLE StateDef_classNameStorage_ClassNameStorage (
	__IDStateDef__ Integer NOT NULL,
	__IDClassNameStorage__ Integer NOT NULL
) ;

CREATE TABLE AdmissionDef_valDef_ValDef (
	__IDAdmissionDef__ Integer NOT NULL,
	__IDValDef__ Integer NOT NULL
) ;

CREATE TABLE FnName_Expression_expr_Expression (
	__IDFnName_Expression__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE CritDecls_critDecl_CritDecl (
	__IDCritDecls__ Integer NOT NULL,
	__IDCritDecl__ Integer NOT NULL
) ;

CREATE TABLE ProcessDef_processVarDecl_ProcessVarDecl (
	__IDProcessDef__ Integer NOT NULL,
	__IDProcessVarDecl__ Integer NOT NULL
) ;

CREATE TABLE AdmCrit_paramVarDecl_ParamVarDecl (
	__IDAdmCrit__ Integer NOT NULL,
	__IDParamVarDecl__ Integer NOT NULL
) ;

CREATE TABLE RangeDef_expr_Expression (
	__IDRangeDef__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE FunctionDef_composantOfInterFunc_ComposantOfInterFunc (
	__IDFunctionDef__ Integer NOT NULL,
	__IDComposantOfInterFunc__ Integer NOT NULL
) ;

CREATE TABLE IfStmt_seqStmt_SeqStmt (
	__IDIfStmt__ Integer NOT NULL,
	__IDSeqStmt__ Integer NOT NULL
) ;

CREATE TABLE OnHandlerDef_eventName_EventName (
	__IDOnHandlerDef__ Integer NOT NULL,
	__IDEventName__ Integer NOT NULL
) ;

CREATE TABLE SchedulerDef_processVarDecl_ProcessVarDecl (
	__IDSchedulerDef__ Integer NOT NULL,
	__IDProcessVarDecl__ Integer NOT NULL
) ;

CREATE TABLE ComposantOfSwitchStmt_classState_ClassState (
	__IDComposantOfSwitchStmt__ Integer NOT NULL,
	__IDClassState__ Integer NOT NULL
) ;

CREATE TABLE ParameterType_typeExpr_TypeExpr (
	__IDParameterType__ Integer NOT NULL,
	__IDTypeExpr__ Integer NOT NULL
) ;

CREATE TABLE AbstractSchedulerDecl_valDecl_ValDecl (
	__IDAbstractSchedulerDecl__ Integer NOT NULL,
	__IDValDecl__ Integer NOT NULL
) ;

CREATE TABLE InterfaceDef_composantOfInterFunc_ComposantOfInterFunc (
	__IDInterfaceDef__ Integer NOT NULL,
	__IDComposantOfInterFunc__ Integer NOT NULL
) ;

CREATE TABLE AbstractSchedulerDecl_funDecl_FunDecl (
	__IDAbstractSchedulerDecl__ Integer NOT NULL,
	__IDFunDecl__ Integer NOT NULL
) ;

CREATE TABLE KeyCritDecls_compoKeyCritDecls_CompoKeyCritDecls (
	__IDKeyCritDecls__ Integer NOT NULL,
	__IDCompoKeyCritDecls__ Integer NOT NULL
) ;

CREATE TABLE PrimStmt_expr_Expression (
	__IDPrimStmt__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ForeachForStmt_classState_ClassState (
	__IDForeachForStmt__ Integer NOT NULL,
	__IDClassState__ Integer NOT NULL
) ;

CREATE TABLE SwitchStmt_composantOfSwitchStmt_ComposantOfSwitchStmt (
	__IDSwitchStmt__ Integer NOT NULL,
	__IDComposantOfSwitchStmt__ Integer NOT NULL
) ;

CREATE TABLE AbstractSchedulerDecl_typeDef_TypeDef (
	__IDAbstractSchedulerDecl__ Integer NOT NULL,
	__IDTypeDef__ Integer NOT NULL
) ;

CREATE TABLE HandlerDef_onHandlerDef_OnHandlerDef (
	__IDHandlerDef__ Integer NOT NULL,
	__IDOnHandlerDef__ Integer NOT NULL
) ;

CREATE TABLE AbstractSchedulerDecl_constDef_ConstDef (
	__IDAbstractSchedulerDecl__ Integer NOT NULL,
	__IDConstDef__ Integer NOT NULL
) ;

CREATE TABLE CritDeclWhithoutId_expr_Expression (
	__IDCritDeclWhithoutId__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SeqStmt_stmt_Statment (
	__IDSeqStmt__ Integer NOT NULL,
	__IDStatment__ Integer NOT NULL
) ;

CREATE TABLE SeqStmt_valDef_ValDef (
	__IDSeqStmt__ Integer NOT NULL,
	__IDValDef__ Integer NOT NULL
) ;

CREATE TABLE TraceEvent_eventName_EventName (
	__IDTraceEvent__ Integer NOT NULL,
	__IDEventName__ Integer NOT NULL
) ;

CREATE TABLE ComposantOfInterFunc_paramVarDecl_ParamVarDecl (
	__IDComposantOfInterFunc__ Integer NOT NULL,
	__IDParamVarDecl__ Integer NOT NULL
) ;
