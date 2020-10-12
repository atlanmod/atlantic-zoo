CREATE TABLE LogFile (
	__IDLogFile__ Integer NOT NULL,
	file text,
	FOREIGN KEY instance (__FKinstance__) REFERENCES LogFile (__IDLogFile__),
	FOREIGN KEY logger (__FKlogger__) REFERENCES Logger (__IDLogger__),
	PRIMARY KEY LogFile (__IDLogFile__),
	__FKlogger__ Integer,
	__FKinstance__ Integer
) ;

CREATE TABLE Logger (
	__IDLogger__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES Logger (__IDLogger__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY logFile (__FKlogFile__) REFERENCES LogFile (__IDLogFile__),
	PRIMARY KEY Logger (__IDLogger__),
	__FKinstance__ Integer,
	__FKlogFile__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	loggingOn Boolean,
	FOREIGN KEY logger (__FKlogger__) REFERENCES Logger (__IDLogger__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKlogger__ Integer
) ;

CREATE TABLE Literal (
	__IDLiteral__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY Literal (__IDLiteral__)
) ;

CREATE TABLE VariableExpression (
	__IDVariableExpression__ Integer NOT NULL,
	name text,
	PRIMARY KEY VariableExpression (__IDVariableExpression__)
) ;

CREATE TABLE NumberExpression (
	__IDNumberExpression__ Integer NOT NULL,
	PRIMARY KEY NumberExpression (__IDNumberExpression__)
) ;

CREATE TABLE UnaryOperator (
	__IDUnaryOperator__ Integer NOT NULL,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY UnaryOperator (__IDUnaryOperator__),
	__FKoperand__ Integer
) ;

CREATE TABLE UnaryPlusOp (
	__IDUnaryPlusOp__ Integer NOT NULL,
	PRIMARY KEY UnaryPlusOp (__IDUnaryPlusOp__)
) ;

CREATE TABLE UnaryMinusOp (
	__IDUnaryMinusOp__ Integer NOT NULL,
	PRIMARY KEY UnaryMinusOp (__IDUnaryMinusOp__)
) ;

CREATE TABLE BinaryOperator (
	__IDBinaryOperator__ Integer NOT NULL,
	FOREIGN KEY operand1 (__FKoperand1__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY operand2 (__FKoperand2__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY BinaryOperator (__IDBinaryOperator__),
	__FKoperand1__ Integer,
	__FKoperand2__ Integer
) ;

CREATE TABLE PlusOperator (
	__IDPlusOperator__ Integer NOT NULL,
	PRIMARY KEY PlusOperator (__IDPlusOperator__)
) ;

CREATE TABLE MinusOperator (
	__IDMinusOperator__ Integer NOT NULL,
	PRIMARY KEY MinusOperator (__IDMinusOperator__)
) ;
