module ACG {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type ACG : LocatedElement {
		Metamodel_Att : Text;
		StartsWith_Att : Text;
		Elements_ContRef : ACGElement*;
	};

	type ACGElement : LocatedElement {
		Acg_Ref : ACG;
	};

	type Function : ACGElement {
		Context_Att : Text;
		Name_Att : Text;
		Parameters_ContRef : Parameter*;
		Body_ContRef : Expression;
	};

	type Attribute : ACGElement {
		Context_Att : Text;
		Name_Att : Text;
		Body_ContRef : Expression;
	};

	type Parameter : VariableDecl;

	type Node : ACGElement, StatementBlock {
		Element_Att : Text;
		Mode_Att : Text;
		Guard_ContRef : Expression?;
	};

	type ASMNode : Node {
		Name_ContRef : Expression;
	};

	type CodeNode : Node;

	type SimpleNode : Node;

	type StatementBlock : LocatedElement {
		Statements_ContRef : Statement*;
	};

	type Statement : LocatedElement;

	type CompoundStat : Statement, StatementBlock;

	type ForEachStat : CompoundStat {
		Iterator_ContRef : VariableDecl;
		Collection_ContRef : Expression;
	};

	type OnceStat : CompoundStat;

	type VariableStat : CompoundStat {
		Definition_ContRef : Expression;
		Name_ContRef : Expression;
	};

	type OperationStat : CompoundStat {
		Context_ContRef : Expression;
		Name_ContRef : Expression;
	};

	type ConditionalStat : CompoundStat {
		Condition_ContRef : Expression;
		ElseStatements_ContRef : Statement*;
	};

	type LetStat : CompoundStat {
		Variable_ContRef : VariableDecl;
		Value_ContRef : Expression;
	};

	type AnalyzeStat : CompoundStat {
		Target_ContRef : Expression;
		Mode_Att : Text;
	};

	type ReportStat : Statement {
		Severity_Att : Severity;
		Message_ContRef : Expression;
	};

	type Severity {"critic", "error", "warning"};

	type FieldStat : Statement {
		Name_ContRef : Expression;
		Type_ContRef : Expression;
	};

	type ParamStat : Statement {
		Name_ContRef : Expression;
		Type_ContRef : Expression;
	};

	type EmitStat : Statement;

	type LabelStat : EmitStat {
		Name_Att : Text;
		Id_ContRef : Expression?;
	};

	type NewStat : EmitStat;

	type DupStat : EmitStat;

	type DupX1Stat : EmitStat;

	type PopStat : EmitStat;

	type SwapStat : EmitStat;

	type IterateStat : EmitStat;

	type EndIterateStat : EmitStat;

	type GetAsmStat : EmitStat;

	type FindMEStat : EmitStat;

	type PushTStat : EmitStat;

	type PushFStat : EmitStat;

	type EmitWithOperandStat : EmitStat {
		Operand_ContRef : Expression;
	};

	type PushStat : EmitWithOperandStat;

	type PushIStat : EmitWithOperandStat;

	type PushDStat : EmitWithOperandStat;

	type LoadStat : EmitWithOperandStat;

	type StoreStat : EmitWithOperandStat;

	type CallStat : EmitWithOperandStat;

	type PCallStat : EmitWithOperandStat;

	type SuperCallStat : EmitWithOperandStat;

	type GetStat : EmitWithOperandStat;

	type SetStat : EmitWithOperandStat;

	type EmitWithLabelRefStat : EmitStat {
		Label_Ref : LabelStat;
	};

	type IfStat : EmitWithLabelRefStat;

	type GotoStat : EmitWithLabelRefStat;

	type VariableDecl : LocatedElement {
		Name_Att : Text;
	};

	type Expression : LocatedElement;

	type VariableExp : Expression {
		Variable_Ref : VariableDecl;
	};

	type SelfExp : Expression;

	type LastExp : Expression;

	type IfExp : Expression {
		Condition_ContRef : Expression;
		ThenExp_ContRef : Expression;
		ElseExp_ContRef : Expression;
	};

	type IsAExp : Expression {
		Source_ContRef : Expression;
		Type_Att : Text;
	};

	type LetExp : Expression {
		Variable_ContRef : VariableDecl;
		Value_ContRef : Expression;
		In_ContRef : Expression;
	};

	type PropertyCallExp : Expression {
		Source_ContRef : Expression;
		Name_Att : Text;
	};

	type NavigationExp : PropertyCallExp;

	type IteratorExp : PropertyCallExp {
		Iterator_ContRef : VariableDecl;
		Body_ContRef : Expression;
	};

	type OperationCallExp : PropertyCallExp {
		Arguments_ContRef : Expression*;
	};

	type OperatorCallExp : OperationCallExp;

	type LiteralExp : Expression;

	type OclUndefinedExp : LiteralExp;

	type CollectionExp : LiteralExp {
		Elements_ContRef : Expression*;
	};

	type SequenceExp : CollectionExp;

	type BooleanExp : LiteralExp {
		Value_Att : Logical;
	};

	type IntegerExp : LiteralExp {
		Value_Att : Integer32;
	};

	type StringExp : LiteralExp {
		Value_Att : Text;
	};
}