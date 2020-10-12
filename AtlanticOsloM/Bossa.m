module Bossa {

	type BossaProgramm {
		Scheduler_ContRef : Scheduler;
	};

	type Scheduler {
		DefaultAtt_Att : Logical;
		High_Res_Att : Logical;
		Low_Res_Att : Logical;
		Id_Att : Text;
		HandlerDef_ContRef : HandlerDef;
		InterfaceDef_ContRef : InterfaceDef;
		FunctionDef_ContRef : FunctionDef;
	};

	type NormalScheduler : Scheduler {
		SchedulerDecl_ContRef : SchedulerDecl;
	};

	type VirtualScheduler : Scheduler {
		VschedulerDecl_ContRef : VSchdulerDecl;
	};

	type AbstractSchedulerDecl {
		ConstDef_ContRef : ConstDef*;
		TypeDef_ContRef : TypeDef*;
		FunDecl_ContRef : FunDecl*;
		ValDecl_ContRef : ValDecl*;
		StateDef_ContRef : StateDef;
		OrderDef_ContRef : OrderDef?;
		AdmissionDef_ContRef : AdmissionDef?;
		TraceDef_ContRef : TraceDef?;
	};

	type SchedulerDecl : AbstractSchedulerDecl {
		ProcessDef_ContRef : ProcessDef;
	};

	type VSchdulerDecl : AbstractSchedulerDecl {
		SchedulerDef_ContRef : SchedulerDef;
	};

	type ConstDef {
		Id_Att : Text;
		Expr_ContRef : Expression;
		BossaTypeExpr_ContRef : BossaTypeExpr;
	};

	type TypeDef {
		EnumRang_ContRef : EnumRange;
	};

	type EnumRange {
		EnumDef_ContRef : EnumDef?;
		RangeDef_ContRef : RangeDef?;
	};

	type EnumDef {
		TheIds_Att : Text;
	};

	type BagId {
		TheValue_Att : Text;
	};

	type RangeDef {
		Expr_ContRef : Expression#2 .. 2;
	};

	type ProcessDef {
		ProcessVarDecl_ContRef : ProcessVarDecl+;
	};

	type SchedulerDef {
		ProcessVarDecl_ContRef : ProcessVarDecl+;
	};

	type ProcessVarDecl {
		Id_Att : Text;
		ProcessDef_Ref : ProcessDef;
		SchedulerDef_Ref : SchedulerDef;
	};

	type Timer_ProcessVarDecl : ProcessVarDecl;

	type System_ProcessVarDecl : ProcessVarDecl {
		System_Att : Logical;
		TypeExpr_ContRef : TypeExpr;
	};

	type Normal_ProcessVarDecl : ProcessVarDecl {
		TypeExpr_ContRef : TypeExpr;
	};

	type HandlerDef {
		Id_Att : Text;
		Scheduler_Ref : Scheduler;
		OnHandlerDef_ContRef : OnHandlerDef+;
	};

	type InterfaceDef {
		ComposantOfInterFunc_ContRef : ComposantOfInterFunc+;
		Scheduler_Ref : Scheduler;
	};

	type FunctionDef {
		ComposantOfInterFunc_ContRef : ComposantOfInterFunc+;
		Scheduler_Ref : Scheduler;
	};

	type Expression;

	type Integer_Expression : Expression {
		TheValue_Att : Integer32;
	};

	type Id_Expression : Expression {
		Id_Att : Text;
	};

	type State_Expression : Expression {
		TheValue_Att : Text;
	};

	type True_Expression : Expression;

	type False_Expression : Expression;

	type Unop_Expression : Expression {
		Unop_ContRef : Unop;
		Expr_ContRef : Expression;
	};

	type Etoile_Expression : Expression {
		Expr_ContRef : Expression;
	};

	type ExpId_Expression : Expression {
		Id_Att : Text;
		Expr_ContRef : Expression;
	};

	type Select_Expression : Expression;

	type FnName_Expression : Expression {
		Expr_ContRef : Expression*;
	};

	type Empty_Expression : Expression {
		ClassState_ContRef : ClassState;
	};

	type SRCOnSched_Expression : Expression;

	type SchedulerOf_Expression : Expression {
		Expr_ContRef : Expression;
	};

	type In_Expression : Expression {
		In_Att : Logical;
		Expr_ContRef : Expression;
		ClassState_ContRef : ClassState;
	};

	type Parenthese_Expression : Expression {
		Expr_ContRef : Expression;
	};

	type Binop_Expression : Expression {
		Id_Expression_ContRef : Id_Expression;
		Compo_Binop_Expression_ContRef : Compo_Binop_Expression;
	};

	type Compo_Binop_Expression {
		Binop_ContRef : Binop;
		Id_Expression_ContRef : Id_Expression;
	};

	type ValDecl {
		Id_Att : Text;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type Normal_ValDecl : ValDecl {
		NonProcType_ContRef : NonProcType?;
	};

	type System_ValDecl : ValDecl {
		NonProcType_ContRef : NonProcType?;
	};

	type Timer_ValDecl : ValDecl;

	type FunDecl {
		ParameterTypes_ContRef : ParameterType?;
		NonProcType_ContRef : NonProcType?;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type StateDef {
		ClassNameStorage_ContRef : ClassNameStorage+;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type ClassNameStorage {
		Id_Att : Text;
		ClassName_ContRef : ClassName;
		Storage_ContRef : Storage?;
	};

	type OrderDef {
		KeyCritDecl_ContRef : KeyCritDecls;
		CritDecls_ContRef : CritDecls;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type AdmissionDef {
		ValDef_ContRef : ValDef*;
		AdmCrit_ContRef : AdmCrit;
		AttachDetach_ContRef : AttachDetach?;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type TraceDef {
		TraceEvent_ContRef : TraceEvent?;
		TraceExpr_ContRef : TraceExpr?;
		TraceTest_ContRef : TraceTest?;
		AbstractSchedulerDecl_Ref : AbstractSchedulerDecl;
	};

	type TypeExpr {
		Id_Att : Text;
		BossaTypeExpr_ContRef : BossaTypeExpr?;
	};

	type TypeOrVoid {
		IsVoid_Att : Logical;
		TypeExpr_ContRef : TypeExpr?;
	};

	type ParameterType {
		TypeExpr_ContRef : TypeExpr+;
	};

	type Storage;

	type Process_Storage : Storage;

	type Scheduler_Storage : Storage {
		StateVisibility_ContRef : StateVisibility?;
	};

	type Queue_Storage : Storage {
		StateVisibility_ContRef : StateVisibility?;
		QueueType_ContRef : QueueType?;
	};

	type KeyCritDecls {
		CompoKeyCritDecls_ContRef : CompoKeyCritDecls+;
	};

	type CompoKeyCritDecls {
		CritDecl_ContRef : CritDecl;
	};

	type CritDecls {
		CritDecl_ContRef : CritDecl+;
	};

	type CritDecl {
		Critop_ContRef : Critop;
	};

	type CritDeclWhithId : CritDecl {
		Id_Att : Text;
	};

	type CritDeclWhithoutId : CritDecl {
		Expr_ContRef : Expression#2 .. 3;
	};

	type ValDef {
		Id_Att : Text;
		TypeExpr_ContRef : TypeExpr;
		Expr_ContRef : Expression;
	};

	type AdmCrit {
		ParamVarDecl_ContRef : ParamVarDecl*;
		Expr_ContRef : Expression;
	};

	type AttachDetach {
		ProcParam1_ContRef : ProcParam;
		ProcParam2_ContRef : ProcParam;
		SeqStmt1_ContRef : SeqStmt;
		SeqStmt2_ContRef : SeqStmt;
	};

	type ParamVarDecl {
		Id_Att : Text;
		TypeExpr_ContRef : TypeExpr;
	};

	type SeqStmt {
		ValDef_ContRef : ValDef*;
		Stmt_ContRef : Statment*;
	};

	type TraceEvent {
		EventName_ContRef : EventName+;
	};

	type TraceExpr {
		Id_Att : Text;
	};

	type TraceTest {
		Expr_ContRef : Expression;
	};

	type ProcParam {
		Id_Att : Text;
		Process_Att : Logical;
		Scheduler_Att : Logical;
	};

	type Statment;

	type IfStmt : Statment {
		Expr_ContRef : Expression;
		SeqStmt_ContRef : SeqStmt#1 .. 2;
	};

	type ForStmt : Statment;

	type ForeachForStmt : ForStmt {
		Id_Att : Text;
		IsIn_Att : Logical;
		ClassState_ContRef : ClassState*;
		SeqStmt_ContRef : SeqStmt;
	};

	type ForEachIncreasingForStmt : ForStmt {
		Id_Att : Text;
		SeqStmt_ContRef : SeqStmt;
	};

	type ForEachDecreasingForStmt : ForStmt {
		Id_Att : Text;
		SeqStmt_ContRef : SeqStmt;
	};

	type ReturnStmt : Statment {
		Expr_ContRef : Expression?;
	};

	type SwitchStmt : Statment {
		LocExpr_ContRef : LocExpr;
		ComposantOfSwitchStmt_ContRef : ComposantOfSwitchStmt*;
	};

	type AssignStmt : Statment {
		LocExpr_ContRef : LocExpr;
		AssignUnop_ContRef : AssignUnop?;
		AssignBinop_ContRef : AssignBinop?;
		Expr_ContRef : Expression?;
	};

	type MoveStmt : Statment {
		IsHead_Att : Logical;
		IsTail_Att : Logical;
		MoveExpr_ContRef : MoveExpr;
	};

	type NormalMoveStmt : MoveStmt {
		StateRef_ContRef : StateRef;
	};

	type ForwardMoveStmt : MoveStmt;

	type StateRef {
		StateRef_Att : Text;
	};

	type DeferStmt : Statment {
		DeferStmt_Att : Text;
	};

	type PrimStmt : Statment {
		Expr_ContRef : Expression*;
	};

	type ErrorStmt : Statment {
		ErrorType_Att : Text;
	};

	type BreakStmt : Statment;

	type LocExpr {
		StateName_Att : Text;
		Id_Att : Text;
	};

	type MoveExpr;

	type Select_MoveExpr : MoveExpr;

	type SatateName_MoveExpr : MoveExpr;

	type ID_MoveExpr : MoveExpr {
		Id_Att : Text;
	};

	type IDSource_MoveExpr : MoveExpr {
		Id_Att : Text;
	};

	type IDTarget_MoveExpr : MoveExpr {
		Id_Att : Text;
	};

	type ClassState {
		State_Att : Logical;
		ClassName_ContRef : ClassName?;
	};

	type OnHandlerDef {
		EventName_ContRef : EventName*;
		SeqStmt_ContRef : SeqStmt;
	};

	type EventName {
		EventNameLeft_Att : Text;
		EventNameRight_Att : Text;
	};

	type ComposantOfSwitchStmt {
		ClassState_ContRef : ClassState+;
		SeqStmt_ContRef : SeqStmt;
	};

	type ComposantOfInterFunc {
		Id_Att : Text;
		TypeOrVoid_ContRef : TypeOrVoid;
		ParamVarDecl_ContRef : ParamVarDecl*;
		SeqStmt_ContRef : SeqStmt;
	};

	type BossaTypeExpr {
		BossaTypeExpr_Att : Text;
	};

	type QueueType;

	type Normal_QueueType : QueueType;

	type Fifo_QueueType : QueueType;

	type Lifo_QueueType : QueueType;

	type Critop {
		Lowest_Att : Logical;
		Highest_Att : Logical;
	};

	type StateVisibility {
		Public_Att : Logical;
		Private_Att : Logical;
	};

	type ClassName {
		ClassName_Att : Text;
	};

	type NonProcType {
		System_Att : Logical;
		Struct_Att : Logical;
		Id_Att : Logical;
		NonProcType_Att : Text;
	};

	type Unop {
		Plus_Att : Logical;
		Minus_Att : Logical;
		Excl_Att : Logical;
		Tild_Att : Logical;
	};

	type Binop {
		Plus_Att : Logical;
		Minus_Att : Logical;
		Star_Att : Logical;
		Slash_Att : Logical;
		Percentage_Att : Logical;
		DoubleAnd_Att : Logical;
		DoubleVerticalBar_Att : Logical;
		And_Att : Logical;
		Eq_Att : Logical;
		Ne_Att : Logical;
		Lt_Att : Logical;
		Gt_Att : Logical;
		Le_Att : Logical;
		Ge_Att : Logical;
		DoubleLt_Att : Logical;
		DoubleGt_Att : Logical;
	};

	type AssignUnop {
		DoublePlus_Att : Logical;
		DoubleMoins_Att : Logical;
	};

	type AssignBinop {
		Affect_Att : Logical;
		PlusEqual_Att : Logical;
		MoinsEqual_Att : Logical;
		StarEqual_Att : Logical;
		SlashEqual_Att : Logical;
		PercentageEqual_Att : Logical;
		AndEqual_Att : Logical;
		OrEqual_Att : Logical;
		DoubleLtEqual_Att : Logical;
		DoubleGtEqual_Att : Logical;
	};
}