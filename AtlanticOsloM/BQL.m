module BQL {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Query {
		Entries_ContRef : Entry*;
		Predicates_ContRef : Predicate*;
	};

	type Entry : LocatedElement {
		Name_Att : Text;
		Type_Att : Text;
		AllFields_Att : Logical;
		Fields_ContRef : Field+;
		Predicate_Ref : Predicate?;
	};

	type Field {
		Name_Att : Text;
		Entry_Ref : Entry;
	};

	type Predicate {
		Entry_Ref : Entry;
		Expression_ContRef : Expression+;
	};

	type Expression {
		Field_Att : Text;
		Value_Att : Text;
	};
}