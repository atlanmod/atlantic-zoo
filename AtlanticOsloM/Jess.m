module Jess {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Root : LocatedElement {
		Expressions_ContRef : Expression*;
	};

	type Expression : LocatedElement;

	type Integ : Expression {
		Val_Att : Integer32;
	};

	type Floa : Expression {
		Val_Att : Double;
	};

	type Str : Expression {
		Val_Att : Text;
	};

	type Ident : Expression;

	type ValidIdentifier : Ident {
		Val_Att : Text;
	};

	type SlotName : Ident {
		Val_Att : Text;
	};

	type JessVariable : Ident {
		Val_Att : Text;
	};

	type TemplateExpression : Expression {
		TemplateName_ContRef : ValidIdentifier;
		FirstSlot_ContRef : SlotOp;
		SlotOp_ContRef : SlotOp*;
	};

	type SlotOp : LocatedElement {
		SlotIdent_ContRef : SlotName;
		Operator_ContRef : ValidIdentifier;
		Exp_ContRef : Expression;
	};

	type DefinitionExp : Expression;

	type GlobalDefinition : DefinitionExp {
		VarDef_ContRef : VarDefinition*;
	};

	type VarDefinition : LocatedElement {
		JessVar_ContRef : JessVariable;
		Eq_ContRef : ValidIdentifier;
		Expression_ContRef : Expression;
	};

	type FunctionDefinition : DefinitionExp {
		FuncName_ContRef : ValidIdentifier;
		Parameters_ContRef : JessVariable*;
		Expressions_ContRef : Expression*;
	};

	type AdviceDefinition : DefinitionExp {
		Direction_Att : Advice;
		Op_ContRef : Ident;
		Advice_ContRef : Expression*;
	};

	type UnDefAdvice : DefinitionExp {
		Op_ContRef : Expression;
	};

	type FactDefinition : DefinitionExp {
		FactName_ContRef : ValidIdentifier;
		Documentation_ContRef : Str?;
		Fact_ContRef : Expression*;
	};

	type RuleDefinition : DefinitionExp {
		RuleName_ContRef : ValidIdentifier;
		Documentation_ContRef : Str?;
		Declare_ContRef : DeclareRule?;
		Conditions_ContRef : Expression*;
		FunctionCall_ContRef : UseFuncExp*;
	};

	type DeclareRule : LocatedElement {
		Salience_ContRef : Expression?;
		NodeIndexHash_ContRef : Expression?;
		AutoFocus_ContRef : ValidIdentifier?;
		NoLoop_ContRef : ValidIdentifier?;
	};

	type ModuleDefinition : DefinitionExp {
		ModuleName_ContRef : ValidIdentifier;
		Documentation_ContRef : Str?;
	};

	type QueryDefinition : DefinitionExp {
		QueryName_ContRef : ValidIdentifier;
		Documentation_ContRef : Str?;
		Declare_ContRef : DeclareVar?;
		Expressions_ContRef : Expression*;
	};

	type DeclareVar : LocatedElement {
		Var_ContRef : JessVariable*;
		Node_ContRef : Expression;
		Max_ContRef : Expression;
	};

	type TemplateDefinition : DefinitionExp {
		TemplateName_ContRef : ValidIdentifier;
		Inherits_ContRef : ValidIdentifier*;
		Documentation_ContRef : Str?;
		DeclareBloc_ContRef : DeclareBloc?;
		SlotDef_ContRef : ASlotDef*;
	};

	type DeclareBloc : LocatedElement {
		SlotSpecific_ContRef : ValidIdentifier?;
		BackchainReaction_ContRef : ValidIdentifier?;
		FromClass_ContRef : ValidIdentifier?;
		IncludeVariable_ContRef : ValidIdentifier?;
		Order_ContRef : ValidIdentifier?;
	};

	type ASlotDef : LocatedElement {
		SlotName_ContRef : SlotName;
		Optionals_ContRef : SlotOptions*;
	};

	type SlotDef : ASlotDef;

	type MultiSlotDef : ASlotDef;

	type SlotOptions : LocatedElement {
		Type_ContRef : ValidIdentifier;
		Def_ContRef : Expression;
		DefaultDyn_ContRef : Expression;
		AllowedValues_ContRef : Expression*;
	};

	type UseFuncExp : Expression;

	type WhileExp : UseFuncExp {
		HasDo_Att : Logical;
		BoolExp_ContRef : Expression;
		Actions_ContRef : Expression*;
	};

	type ForExp : UseFuncExp {
		Initializer_ContRef : Expression;
		Condition_ContRef : Expression;
		Increment_ContRef : Expression;
		Expressions_ContRef : Expression*;
	};

	type ForeachExp : UseFuncExp {
		Var_ContRef : JessVariable;
		List_ContRef : Expression;
		Expressions_ContRef : Expression*;
	};

	type FuncCall : UseFuncExp {
		FuncName_ContRef : ValidIdentifier;
		FuncParam_ContRef : Expression*;
	};

	type EngineExp : UseFuncExp;

	type ExitExp : UseFuncExp;

	type IfExpression : UseFuncExp {
		Ifthen_ContRef : ConditionAction;
		Elifthen_ContRef : ElifConditionAction*;
		Else_ContRef : Expression*;
	};

	type ConditionAction : LocatedElement {
		Condition_ContRef : Expression;
		Actions_ContRef : Expression*;
	};

	type ElifConditionAction : LocatedElement {
		CondAct_ContRef : ConditionAction;
	};

	type Advice {"before", "after"};
}