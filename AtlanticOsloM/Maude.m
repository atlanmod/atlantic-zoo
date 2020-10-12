module Maude {

	type MaudeSpec {
		Els_ContRef : MaudeTopEl*;
		PrintableEls_Ref : MaudeTopEl*;
	};

	type MaudeTopEl {
		Name_Att : Text;
	};

	type ModExpression;

	type InstModExp : ModExpression {
		ModExp_ContRef : ModExpression;
		Views_Ref : View+;
	};

	type RenModExp : ModExpression {
		ModExp_ContRef : ModExpression;
		Renamings_ContRef : RenMapping+;
	};

	type CompModExp : ModExpression {
		ModExps_ContRef : ModExpression#2 ..;
	};

	type ModuleIdModExp : ModExpression {
		Module_Ref : Module;
	};

	type TheoryIdModExp : ModExpression {
		Theory_Ref : Theory;
	};

	type Parameter : ModExpression {
		Label_Att : Text;
		ModExp_ContRef : ModExpression;
	};

	type Theory : MaudeTopEl {
		Els_ContRef : ModElement*;
	};

	type FTheory : Theory;

	type STheory : Theory;

	type Module : MaudeTopEl {
		Els_ContRef : ModElement*;
		Params_ContRef : Parameter*;
	};

	type FModule : Module;

	type SModule : Module;

	type ModElement {
		Module_Ref : Module?;
		Theory_Ref : Theory?;
	};

	type ModImportation : ModElement {
		Imports_ContRef : ModExpression;
		Mode_Att : ImportationMode;
	};

	type ImportationMode {"protecting", "including", "extending"};

	type Type {
		Name_Att : Text;
	};

	type Sort : Type, ModElement {
		SubsortRels_Ref : SubsortRel*;
		SupersortRels_Ref : SubsortRel*;
		Kind_Ref : Kind;
	};

	type Kind : Type {
		Sorts_Ref : Sort+;
	};

	type SubsortRel : ModElement {
		Subsorts_Ref : Sort+;
		Supersorts_Ref : Sort+;
	};

	type Operation : ModElement {
		Name_Att : Text;
		Coarity_Ref : Type;
		Arity_Ref : Type*;
		Atts_Att : Text;
	};

	type Statement : ModElement {
		Label_Att : Text;
		Atts_Att : Text;
		Conds_ContRef : Condition*;
	};

	type Membership : Statement {
		Term_ContRef : Term;
		Sort_Ref : Sort;
	};

	type Equation : Statement {
		Lhs_ContRef : Term;
		Rhs_ContRef : Term;
	};

	type Rule : Statement {
		Lhs_ContRef : Term?;
		Rhs_ContRef : Term?;
	};

	type Condition {
		Lhs_ContRef : Term;
	};

	type EquationalCond : Condition;

	type RewriteCond : Condition {
		Rhs_ContRef : Term;
	};

	type MembershipCond : EquationalCond {
		Rhs_Ref : Sort;
	};

	type BooleanCond : EquationalCond;

	type MatchingCond : EquationalCond {
		Rhs_ContRef : Term;
	};

	type EqualCond : EquationalCond {
		Rhs_ContRef : Term;
	};

	type Term {
		Type_Ref : Type;
	};

	type Constant : Term {
		Op_Att : Text;
	};

	type RecTerm : Term {
		Op_Att : Text;
		Args_ContRef : Term+;
	};

	type Variable : Term {
		Name_Att : Text;
	};

	type View : MaudeTopEl {
		From_ContRef : ModExpression;
		To_ContRef : ModExpression;
		Els_ContRef : ViewMapping*;
	};

	type ViewMapping;

	type RenMapping : ViewMapping;

	type TermMapping : ViewMapping {
		From_ContRef : Term;
		To_ContRef : Term;
	};

	type SortMapping : RenMapping {
		From_Ref : Sort;
		To_Att : Text;
	};

	type OpTypedMapping : RenMapping {
		From_Ref : Operation;
		To_Att : Text;
		Atts_Att : Text;
	};

	type OpMapping : RenMapping {
		From_Ref : Operation;
		To_Att : Text;
	};

	type LabelMapping : RenMapping {
		From_Att : Text;
		To_Att : Text;
	};
}