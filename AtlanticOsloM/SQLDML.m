module SQLDML {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type SQLRoot : LocatedElement {
		Statements_ContRef : Statement*;
	};

	type Statement : LocatedElement;

	type ViewStatement : Statement {
		Name_Att : Text;
		Columns_ContRef : ColumnExp+;
		Query_ContRef : QueryStmt;
	};

	type InsertStmt : Statement {
		TableName_Att : Text;
		Values_ContRef : Expression*;
	};

	type QueryStmt : Statement {
		Tables_ContRef : Table+;
		Condition_ContRef : WhereClause?;
	};

	type QueryStmtCol : QueryStmt {
		Columns_ContRef : Expression+;
	};

	type QueryStmtAllCol : QueryStmt;

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type Table : NamedElement {
		Alias_Att : Text;
	};

	type WhereClause : LocatedElement {
		Expression_ContRef : Expression;
	};

	type Expression : LocatedElement;

	type BinaryExp : Expression {
		OpName_Att : Text;
		LeftExp_ContRef : Expression;
		RightExp_ContRef : Expression;
	};

	type OrExp : BinaryExp;

	type AndExp : BinaryExp;

	type NotExp : Expression {
		OpName_Att : Text;
		ValueExp_ContRef : Expression;
		Unused_ContRef : Expression?;
	};

	type LikeExp : Expression {
		ColumnName_Att : Text;
		Expression_ContRef : StringValueExp;
	};

	type InExp : Expression {
		ColumnName_Att : Text;
		Elements_ContRef : Predicate+;
	};

	type OperationExp : BinaryExp {
		OptName_Att : Text;
	};

	type Predicate : Expression;

	type QueryPredicate : Expression {
		Query_ContRef : QueryStmt;
	};

	type ColumnExp : Predicate, NamedElement {
		Alias_Att : Text;
		Type_ContRef : DataType;
	};

	type ValueExp : Predicate {
		Type_ContRef : DataType?;
	};

	type StringValueExp : ValueExp {
		AValue_Att : Text;
	};

	type IntegerValueExp : ValueExp {
		AValue_Att : Integer32;
	};

	type ListExp : Predicate {
		Elements_ContRef : Expression*;
	};

	type FunctionExp : Predicate {
		Arguments_ContRef : Expression*;
		Name_Att : Text;
	};

	type DataType : NamedElement;
}