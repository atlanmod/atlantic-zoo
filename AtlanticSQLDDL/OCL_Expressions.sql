CREATE TABLE OclExpression (
	__IDOclExpression__ Integer NOT NULL,
	FOREIGN KEY resultType (__FKresultType__) REFERENCES Type (__IDType__),
	PRIMARY KEY OclExpression (__IDOclExpression__),
	__FKresultType__ Integer
) ;

CREATE TABLE SelfExp (
	__IDSelfExp__ Integer NOT NULL,
	PRIMARY KEY SelfExp (__IDSelfExp__)
) ;

CREATE TABLE ResultExp (
	__IDResultExp__ Integer NOT NULL,
	PRIMARY KEY ResultExp (__IDResultExp__)
) ;

CREATE TABLE VariableExp (
	__IDVariableExp__ Integer NOT NULL,
	var text,
	PRIMARY KEY VariableExp (__IDVariableExp__)
) ;

CREATE TABLE OperationExp (
	__IDOperationExp__ Integer NOT NULL,
	PRIMARY KEY OperationExp (__IDOperationExp__)
) ;

CREATE TABLE QueryExp (
	__IDQueryExp__ Integer NOT NULL,
	FOREIGN KEY argument (__FKargument__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY source (__FKsource__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY varDeclaration (__FKvarDeclaration__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	PRIMARY KEY QueryExp (__IDQueryExp__),
	__FKsource__ Integer,
	__FKvarDeclaration__ Integer,
	__FKargument__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE VariableDeclaration (
	__IDVariableDeclaration__ Integer NOT NULL,
	var text,
	FOREIGN KEY varType (__FKvarType__) REFERENCES Type (__IDType__),
	PRIMARY KEY VariableDeclaration (__IDVariableDeclaration__),
	__FKvarType__ Integer
) ;

CREATE TABLE VariableInitialisation (
	__IDVariableInitialisation__ Integer NOT NULL,
	FOREIGN KEY initExpression (__FKinitExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY varDec (__FKvarDec__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	FOREIGN KEY iterateExp (__FKiterateExp__) REFERENCES IterateExp (__IDIterateExp__),
	PRIMARY KEY VariableInitialisation (__IDVariableInitialisation__),
	__FKvarDec__ Integer,
	__FKinitExpression__ Integer,
	__FKiterateExp__ Integer
) ;

CREATE TABLE ForAllExp (
	__IDForAllExp__ Integer NOT NULL,
	PRIMARY KEY ForAllExp (__IDForAllExp__)
) ;

CREATE TABLE ExistsExp (
	__IDExistsExp__ Integer NOT NULL,
	PRIMARY KEY ExistsExp (__IDExistsExp__)
) ;

CREATE TABLE SelectExp (
	__IDSelectExp__ Integer NOT NULL,
	PRIMARY KEY SelectExp (__IDSelectExp__)
) ;

CREATE TABLE RejectExp (
	__IDRejectExp__ Integer NOT NULL,
	PRIMARY KEY RejectExp (__IDRejectExp__)
) ;

CREATE TABLE CollectExp (
	__IDCollectExp__ Integer NOT NULL,
	PRIMARY KEY CollectExp (__IDCollectExp__)
) ;

CREATE TABLE IterateExp (
	__IDIterateExp__ Integer NOT NULL,
	FOREIGN KEY varInit (__FKvarInit__) REFERENCES VariableInitialisation (__IDVariableInitialisation__),
	PRIMARY KEY IterateExp (__IDIterateExp__),
	__FKvarInit__ Integer
) ;

CREATE TABLE VariableDeclaration_oclExpression_OclExpression (
	__IDVariableDeclaration__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE Type_oclExpression_OclExpression (
	__IDType__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_varDec_VariableDeclaration (
	__IDOclExpression__ Integer NOT NULL,
	__IDVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclaration_queryExp_QueryExp (
	__IDVariableDeclaration__ Integer NOT NULL,
	__IDQueryExp__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_queryArg_QueryExp (
	__IDOclExpression__ Integer NOT NULL,
	__IDQueryExp__ Integer NOT NULL
) ;

CREATE TABLE Type_varDec_VariableDeclaration (
	__IDType__ Integer NOT NULL,
	__IDVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclaration_varInit_VariableInitialisation (
	__IDVariableDeclaration__ Integer NOT NULL,
	__IDVariableInitialisation__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_querySrc_QueryExp (
	__IDOclExpression__ Integer NOT NULL,
	__IDQueryExp__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_varInit_VariableInitialisation (
	__IDOclExpression__ Integer NOT NULL,
	__IDVariableInitialisation__ Integer NOT NULL
) ;
