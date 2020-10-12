module AsmL {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Body : LocatedElement {
		Rules_ContRef : Rule*;
	};

	type InWhereHolds : LocatedElement {
		Var_ContRef : Term;
		In_ContRef : Term;
		Where_ContRef : Term?;
		Holds_ContRef : Term?;
	};

	type AsmLFile : LocatedElement {
		Elements_ContRef : AsmLElement*;
		Main_ContRef : Main;
	};

	type AsmLElement : LocatedElement {
		File_Ref : AsmLFile;
	};

	type VarDeclaration : AsmLElement, VarOrCase, VarOrMethod {
		IsConstant_Att : Logical;
		IsDeclaration_Att : Logical;
		IsLocal_Att : Logical;
		Name_Att : Text;
		Type_ContRef : Type;
	};

	type Namespace : AsmLElement {
		Name_Att : Text;
	};

	type Structure : AsmLElement {
		Name_Att : Text;
		VarOrCase_ContRef : VarOrCase*;
		SuperStructureName_Att : Text;
	};

	type VarOrCase : LocatedElement {
		OwnerStructure_Ref : Structure;
	};

	type Case : VarOrCase {
		Name_Att : Text;
		Variables_ContRef : VarDeclaration*;
	};

	type Class : AsmLElement {
		Name_Att : Text;
		IsAbstract_Att : Logical;
		SuperClassName_Att : Text;
		VarOrMethod_ContRef : VarOrMethod*;
	};

	type VarOrMethod : LocatedElement {
		OwnerClass_Ref : Class;
	};

	type Enumeration : AsmLElement {
		Name_Att : Text;
		Enumerators_ContRef : Enumerator*;
	};

	type Enumerator : LocatedElement {
		Name_Att : Text;
		Value_ContRef : Term?;
	};

	type Function : AsmLElement {
		Name_Att : Text;
		Body_ContRef : Body;
	};

	type Method : Function, VarOrMethod {
		IsAbstract_Att : Logical;
		IsShared_Att : Logical;
		IsEntryPoint_Att : Logical;
		IsOverride_Att : Logical;
		ReturnType_ContRef : Type?;
		Parameters_ContRef : Parameter*;
	};

	type Parameter : LocatedElement {
		Name_Att : Text;
		Type_ContRef : Type;
		OwnerMethod_Ref : Method;
	};

	type Main : Function {
		MainFile_Ref : AsmLFile;
		Initialisations_ContRef : Initially*;
	};

	type Initially : LocatedElement {
		Id_ContRef : VarTerm;
		Val_ContRef : Term;
	};

	type Rule : LocatedElement {
		OwnerBody_Ref : Body;
	};

	type SkipRule : Rule;

	type Step : Rule {
		Name_Att : Text;
	};

	type StepUntilFixPoint : Step;

	type StepExpression : Step {
		Expression_ContRef : Term;
	};

	type StepWhile : StepExpression;

	type StepUntil : StepExpression;

	type StepForEach : Step {
		Expressions_ContRef : InWhereHolds*;
	};

	type MethodInvocation : Rule {
		Called_ContRef : MethodCallTerm;
	};

	type UpdateRule : Rule {
		Term_ContRef : Term;
	};

	type UpdateVarRule : UpdateRule {
		UpdateVar_ContRef : Term;
	};

	type UpdateFieldRule : UpdateRule {
		Path_ContRef : VarTerm#2 ..;
	};

	type UpdateMapRule : UpdateRule {
		UpdateMap_ContRef : VarTerm;
		Parameters_ContRef : Term+;
	};

	type ChooseRule : Rule {
		Expressions_ContRef : InWhereHolds*;
		IfChoosenRules_ContRef : Body;
		IfNotChoosenRule_ContRef : Body?;
	};

	type ForallRule : Rule {
		Expressions_ContRef : InWhereHolds*;
		DoRule_ContRef : Body;
	};

	type ConditionalRule : Rule {
		Condition_ContRef : Term;
		ThenRule_ContRef : Body;
		ElseRule_ContRef : Body?;
		ElseIfRule_ContRef : ElseIf?;
	};

	type ElseIf : ConditionalRule;

	type ReturnRule : Rule {
		Term_ContRef : Term;
	};

	type AddRule : Rule {
		Val_ContRef : Term;
		Set_ContRef : VarTerm;
	};

	type RemoveRule : Rule {
		Val_ContRef : Term;
		Set_ContRef : VarTerm;
	};

	type Type : AsmLElement {
		WithNull_Att : Logical;
		OwnerDeclaration_Ref : VarDeclaration?;
		OwnerMethod_Ref : Method?;
		OwnerParameter_Ref : Parameter?;
	};

	type NamedType : Type {
		Name_Att : Text;
	};

	type MapType : Type {
		OfType_ContRef : Type;
		ToType_ContRef : Type;
	};

	type TupletType : Type {
		Types_ContRef : Type#2 ..;
	};

	type SetType : Type {
		Of_ContRef : Type;
	};

	type SequenceType : Type {
		Of_ContRef : Type;
	};

	type Term : LocatedElement;

	type VarTerm : Term {
		Name_Att : Text;
	};

	type Operator : Term {
		OpName_Att : Text;
		LeftExp_ContRef : Term;
		RightExp_ContRef : Term?;
	};

	type MapTerm : Term {
		OfTerm_ContRef : Term;
		ToTerm_ContRef : Term;
		Separator_Att : Text;
	};

	type TulpletTerm : Term {
		Terms_ContRef : Term#2 ..;
	};

	type MethodCallTerm : Term {
		Name_Att : Text;
		Parameters_ContRef : Term*;
	};

	type NewInstance : MethodCallTerm;

	type PredicateTerm : Term {
		Expressions_ContRef : InWhereHolds*;
	};

	type ForAllTerm : PredicateTerm;

	type ExistsTerm : PredicateTerm {
		IsUnique_Att : Logical;
	};

	type AnyIn : PredicateTerm;

	type SetTerm : Term;

	type EnumerateSet : SetTerm {
		Vals_ContRef : Term*;
	};

	type RangeSet : SetTerm {
		Minval_ContRef : Term;
		Maxval_ContRef : Term;
	};

	type AlgorithmSet : SetTerm {
		Expressions_ContRef : InWhereHolds*;
	};

	type SequenceTerm : Term;

	type EnumerateSequence : SequenceTerm {
		Vals_ContRef : Term*;
	};

	type RangeSequence : SequenceTerm {
		Minval_ContRef : Term;
		Maxval_ContRef : Term;
	};

	type Constant : Term;

	type BooleanConstant : Constant {
		Val_Att : Logical;
	};

	type IntegerConstant : Constant {
		Val_Att : Integer32;
	};

	type StringConstant : Constant {
		Val_Att : Text;
	};

	type NullConstant : Constant;
}