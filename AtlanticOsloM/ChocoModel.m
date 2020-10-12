module ChocoModel {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type OpConstraint {"eq", "and2", "or2", "gt", "ge", "lt", "le", "plus"};

	type Package : LocatedElement {
		Name_Att : Text;
		Import_ContRef : Import*;
		Problem_ContRef : ChocoProblem;
	};

	type Import : LocatedElement {
		Fqn_Att : Text;
	};

	type ChocoProblem : LocatedElement {
		Name_Att : Text;
		Elements_ContRef : Element*;
	};

	type Element : LocatedElement {
		Label_Att : Text;
	};

	type Expression : Element;

	type ConstraintDef : Expression {
		Op_Att : OpConstraint;
		Left_ContRef : Expression;
		Right_ContRef : Expression;
	};

	type IntVar : Expression {
		Domain_ContRef : Domain;
	};

	type Domain : LocatedElement {
		Lower_Att : Integer32;
		Upper_Att : Integer32;
	};

	type IntConstant : Expression {
		Val_Att : Integer32;
	};

	type SymbolicTerm : Expression {
		Term_Ref : Expression;
	};

	type IntValue : Expression {
		Val_Att : Integer32;
	};

	type IntExp : Expression {
		Op_Att : OpConstraint;
		Left_ContRef : Expression;
		Right_ContRef : Expression;
	};

	type Constraint : Expression {
		Op_Att : OpConstraint;
		Left_ContRef : Expression;
		Right_ContRef : Expression;
	};

	type PostConstraint : Element {
		Op_Att : OpConstraint;
		Constraint_Ref : ConstraintDef;
	};
}