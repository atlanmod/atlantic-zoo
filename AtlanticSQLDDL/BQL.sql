CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Query (
	__IDQuery__ Integer NOT NULL,
	PRIMARY KEY Query (__IDQuery__)
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	name text,
	type text,
	allFields Boolean,
	FOREIGN KEY predicate (__FKpredicate__) REFERENCES Predicate (__IDPredicate__),
	PRIMARY KEY Entry (__IDEntry__),
	__FKpredicate__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	name text,
	FOREIGN KEY entry (__FKentry__) REFERENCES Entry (__IDEntry__),
	PRIMARY KEY Field (__IDField__),
	__FKentry__ Integer
) ;

CREATE TABLE Predicate (
	__IDPredicate__ Integer NOT NULL,
	FOREIGN KEY entry (__FKentry__) REFERENCES Entry (__IDEntry__),
	PRIMARY KEY Predicate (__IDPredicate__),
	__FKentry__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	field text,
	value text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE Query_entries_Entry (
	__IDQuery__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE Predicate_expression_Expression (
	__IDPredicate__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE Query_predicates_Predicate (
	__IDQuery__ Integer NOT NULL,
	__IDPredicate__ Integer NOT NULL
) ;

CREATE TABLE Entry_fields_Field (
	__IDEntry__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;
