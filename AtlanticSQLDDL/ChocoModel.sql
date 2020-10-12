CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	name text,
	FOREIGN KEY problem (__FKproblem__) REFERENCES ChocoProblem (__IDChocoProblem__),
	PRIMARY KEY Package (__IDPackage__),
	__FKproblem__ Integer
) ;

CREATE TABLE Import (
	__IDImport__ Integer NOT NULL,
	fqn text,
	PRIMARY KEY Import (__IDImport__)
) ;

CREATE TABLE ChocoProblem (
	__IDChocoProblem__ Integer NOT NULL,
	name text,
	PRIMARY KEY ChocoProblem (__IDChocoProblem__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	"label" text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE ConstraintDef (
	__IDConstraintDef__ Integer NOT NULL,
	op text,
	FOREIGN KEY "left" (__FKleft__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "right" (__FKright__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConstraintDef (__IDConstraintDef__),
	__FKleft__ Integer,
	__FKright__ Integer
) ;

CREATE TABLE IntVar (
	__IDIntVar__ Integer NOT NULL,
	FOREIGN KEY domain (__FKdomain__) REFERENCES Domain (__IDDomain__),
	PRIMARY KEY IntVar (__IDIntVar__),
	__FKdomain__ Integer
) ;

CREATE TABLE Domain (
	__IDDomain__ Integer NOT NULL,
	lower Integer,
	upper Integer,
	PRIMARY KEY Domain (__IDDomain__)
) ;

CREATE TABLE IntConstant (
	__IDIntConstant__ Integer NOT NULL,
	val Integer,
	PRIMARY KEY IntConstant (__IDIntConstant__)
) ;

CREATE TABLE SymbolicTerm (
	__IDSymbolicTerm__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SymbolicTerm (__IDSymbolicTerm__),
	__FKterm__ Integer
) ;

CREATE TABLE IntValue (
	__IDIntValue__ Integer NOT NULL,
	val Integer,
	PRIMARY KEY IntValue (__IDIntValue__)
) ;

CREATE TABLE IntExp (
	__IDIntExp__ Integer NOT NULL,
	op text,
	FOREIGN KEY "left" (__FKleft__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "right" (__FKright__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY IntExp (__IDIntExp__),
	__FKleft__ Integer,
	__FKright__ Integer
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	op text,
	FOREIGN KEY "left" (__FKleft__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "right" (__FKright__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKleft__ Integer,
	__FKright__ Integer
) ;

CREATE TABLE PostConstraint (
	__IDPostConstraint__ Integer NOT NULL,
	op text,
	FOREIGN KEY "constraint" (__FKconstraint__) REFERENCES ConstraintDef (__IDConstraintDef__),
	PRIMARY KEY PostConstraint (__IDPostConstraint__),
	__FKconstraint__ Integer
) ;

CREATE TABLE Package_import_Import (
	__IDPackage__ Integer NOT NULL,
	__IDImport__ Integer NOT NULL
) ;

CREATE TABLE ChocoProblem_elements_Element (
	__IDChocoProblem__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;
