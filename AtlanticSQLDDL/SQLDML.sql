CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE SQLRoot (
	__IDSQLRoot__ Integer NOT NULL,
	PRIMARY KEY SQLRoot (__IDSQLRoot__)
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE ViewStatement (
	__IDViewStatement__ Integer NOT NULL,
	name text,
	FOREIGN KEY query (__FKquery__) REFERENCES QueryStmt (__IDQueryStmt__),
	PRIMARY KEY ViewStatement (__IDViewStatement__),
	__FKquery__ Integer
) ;

CREATE TABLE InsertStmt (
	__IDInsertStmt__ Integer NOT NULL,
	tableName text,
	PRIMARY KEY InsertStmt (__IDInsertStmt__)
) ;

CREATE TABLE QueryStmt (
	__IDQueryStmt__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES WhereClause (__IDWhereClause__),
	PRIMARY KEY QueryStmt (__IDQueryStmt__),
	__FKcondition__ Integer
) ;

CREATE TABLE QueryStmtCol (
	__IDQueryStmtCol__ Integer NOT NULL,
	PRIMARY KEY QueryStmtCol (__IDQueryStmtCol__)
) ;

CREATE TABLE QueryStmtAllCol (
	__IDQueryStmtAllCol__ Integer NOT NULL,
	PRIMARY KEY QueryStmtAllCol (__IDQueryStmtAllCol__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	alias text,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE WhereClause (
	__IDWhereClause__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY WhereClause (__IDWhereClause__),
	__FKexpression__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE BinaryExp (
	__IDBinaryExp__ Integer NOT NULL,
	opName text,
	FOREIGN KEY leftExp (__FKleftExp__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY rightExp (__FKrightExp__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY BinaryExp (__IDBinaryExp__),
	__FKrightExp__ Integer,
	__FKleftExp__ Integer
) ;

CREATE TABLE OrExp (
	__IDOrExp__ Integer NOT NULL,
	PRIMARY KEY OrExp (__IDOrExp__)
) ;

CREATE TABLE AndExp (
	__IDAndExp__ Integer NOT NULL,
	PRIMARY KEY AndExp (__IDAndExp__)
) ;

CREATE TABLE NotExp (
	__IDNotExp__ Integer NOT NULL,
	opName text,
	FOREIGN KEY valueExp (__FKvalueExp__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY unused (__FKunused__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY NotExp (__IDNotExp__),
	__FKvalueExp__ Integer,
	__FKunused__ Integer
) ;

CREATE TABLE LikeExp (
	__IDLikeExp__ Integer NOT NULL,
	columnName text,
	FOREIGN KEY expression (__FKexpression__) REFERENCES StringValueExp (__IDStringValueExp__),
	PRIMARY KEY LikeExp (__IDLikeExp__),
	__FKexpression__ Integer
) ;

CREATE TABLE InExp (
	__IDInExp__ Integer NOT NULL,
	columnName text,
	PRIMARY KEY InExp (__IDInExp__)
) ;

CREATE TABLE OperationExp (
	__IDOperationExp__ Integer NOT NULL,
	optName text,
	PRIMARY KEY OperationExp (__IDOperationExp__)
) ;

CREATE TABLE Predicate (
	__IDPredicate__ Integer NOT NULL,
	PRIMARY KEY Predicate (__IDPredicate__)
) ;

CREATE TABLE QueryPredicate (
	__IDQueryPredicate__ Integer NOT NULL,
	FOREIGN KEY query (__FKquery__) REFERENCES QueryStmt (__IDQueryStmt__),
	PRIMARY KEY QueryPredicate (__IDQueryPredicate__),
	__FKquery__ Integer
) ;

CREATE TABLE ColumnExp (
	__IDColumnExp__ Integer NOT NULL,
	alias text,
	FOREIGN KEY type (__FKtype__) REFERENCES DataType (__IDDataType__),
	PRIMARY KEY ColumnExp (__IDColumnExp__),
	__FKtype__ Integer
) ;

CREATE TABLE ValueExp (
	__IDValueExp__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES DataType (__IDDataType__),
	PRIMARY KEY ValueExp (__IDValueExp__),
	__FKtype__ Integer
) ;

CREATE TABLE StringValueExp (
	__IDStringValueExp__ Integer NOT NULL,
	aValue text,
	PRIMARY KEY StringValueExp (__IDStringValueExp__)
) ;

CREATE TABLE IntegerValueExp (
	__IDIntegerValueExp__ Integer NOT NULL,
	aValue Integer,
	PRIMARY KEY IntegerValueExp (__IDIntegerValueExp__)
) ;

CREATE TABLE ListExp (
	__IDListExp__ Integer NOT NULL,
	PRIMARY KEY ListExp (__IDListExp__)
) ;

CREATE TABLE FunctionExp (
	__IDFunctionExp__ Integer NOT NULL,
	name text,
	PRIMARY KEY FunctionExp (__IDFunctionExp__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE InsertStmt_values_Expression (
	__IDInsertStmt__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE FunctionExp_arguments_Expression (
	__IDFunctionExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE InExp_elements_Predicate (
	__IDInExp__ Integer NOT NULL,
	__IDPredicate__ Integer NOT NULL
) ;

CREATE TABLE ViewStatement_columns_ColumnExp (
	__IDViewStatement__ Integer NOT NULL,
	__IDColumnExp__ Integer NOT NULL
) ;

CREATE TABLE SQLRoot_statements_Statement (
	__IDSQLRoot__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE QueryStmtCol_columns_Expression (
	__IDQueryStmtCol__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE QueryStmt_tables_Table (
	__IDQueryStmt__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE ListExp_elements_Expression (
	__IDListExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;
