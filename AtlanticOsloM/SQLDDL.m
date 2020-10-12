module SQLDDL {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type Database : NamedElement {
		Tables_ContRef : Table*;
	};

	type Table : NamedElement {
		Database_Ref : Database;
		ReferencedBy_Ref : ForeignKey*;
		Elements_ContRef : TableElement*;
		Parameters_ContRef : Parameter*;
	};

	type TableElement : LocatedElement {
		Table_Ref : Table;
	};

	type Column : TableElement {
		ReferencedBy_Ref : ForeignKey*;
		Name_Att : Text;
		Type_ContRef : Type;
		CanBeNull_Att : Logical;
		Default_ContRef : Value?;
		Keys_Ref : Key*;
	};

	type Key : TableElement {
		IsUnique_Att : Logical;
		Name_Att : Text;
		Columns_Ref : Column+;
	};

	type SimpleKey : Key;

	type PrimaryKey : Key;

	type ForeignKey : Key {
		ReferencedTable_Ref : Table;
		ReferencedColumns_Ref : Column+;
	};

	type Type : NamedElement {
		Length_Att : Integer32;
		IsUnsigned_Att : Logical;
	};

	type Parameter : NamedElement {
		Table_Ref : Table;
		Value_ContRef : Value?;
	};

	type Value : LocatedElement;

	type IntegerVal : Value {
		Value_Att : Integer32;
	};

	type NullVal : Value;

	type StringVal : Value {
		Value_Att : Text;
	};
}