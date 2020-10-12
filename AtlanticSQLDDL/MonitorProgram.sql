CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Structure (
	__IDStructure__ Integer NOT NULL,
	PRIMARY KEY Structure (__IDStructure__)
) ;

CREATE TABLE ProcContainerElement (
	__IDProcContainerElement__ Integer NOT NULL,
	PRIMARY KEY ProcContainerElement (__IDProcContainerElement__)
) ;

CREATE TABLE Program (
	__IDProgram__ Integer NOT NULL,
	PRIMARY KEY Program (__IDProgram__)
) ;

CREATE TABLE Monitor (
	__IDMonitor__ Integer NOT NULL,
	FOREIGN KEY program (__FKprogram__) REFERENCES Program (__IDProgram__),
	PRIMARY KEY Monitor (__IDMonitor__),
	__FKprogram__ Integer
) ;

CREATE TABLE "Procedure" (
	__IDProcedure__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES ProcContainerElement (__IDProcContainerElement__),
	PRIMARY KEY "Procedure" (__IDProcedure__),
	__FKcontainer__ Integer
) ;

CREATE TABLE VariableDeclaration (
	__IDVariableDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	FOREIGN KEY initialValue (__FKinitialValue__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY structure (__FKstructure__) REFERENCES Structure (__IDStructure__),
	PRIMARY KEY VariableDeclaration (__IDVariableDeclaration__),
	__FKstructure__ Integer,
	__FKinitialValue__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	direction text,
	FOREIGN KEY "procedure" (__FKprocedure__) REFERENCES "Procedure" (__IDProcedure__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKprocedure__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE VariableExp (
	__IDVariableExp__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	PRIMARY KEY VariableExp (__IDVariableExp__),
	__FKdeclaration__ Integer
) ;

CREATE TABLE PropertyCallExp (
	__IDPropertyCallExp__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Expression (__IDExpression__),
	name text,
	PRIMARY KEY PropertyCallExp (__IDPropertyCallExp__),
	__FKsource__ Integer
) ;

CREATE TABLE OperatorCallExp (
	__IDOperatorCallExp__ Integer NOT NULL,
	FOREIGN KEY "right" (__FKright__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY OperatorCallExp (__IDOperatorCallExp__),
	__FKright__ Integer
) ;

CREATE TABLE AttributeCallExp (
	__IDAttributeCallExp__ Integer NOT NULL,
	PRIMARY KEY AttributeCallExp (__IDAttributeCallExp__)
) ;

CREATE TABLE ProcedureCallExp (
	__IDProcedureCallExp__ Integer NOT NULL,
	PRIMARY KEY ProcedureCallExp (__IDProcedureCallExp__)
) ;

CREATE TABLE LiteralExp (
	__IDLiteralExp__ Integer NOT NULL,
	PRIMARY KEY LiteralExp (__IDLiteralExp__)
) ;

CREATE TABLE BooleanExp (
	__IDBooleanExp__ Integer NOT NULL,
	symbol Boolean,
	PRIMARY KEY BooleanExp (__IDBooleanExp__)
) ;

CREATE TABLE IntegerExp (
	__IDIntegerExp__ Integer NOT NULL,
	symbol Integer,
	PRIMARY KEY IntegerExp (__IDIntegerExp__)
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE AssignmentStat (
	__IDAssignmentStat__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES VariableExp (__IDVariableExp__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AssignmentStat (__IDAssignmentStat__),
	__FKvalue__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE ConditionalStat (
	__IDConditionalStat__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConditionalStat (__IDConditionalStat__),
	__FKcondition__ Integer
) ;

CREATE TABLE WhileStat (
	__IDWhileStat__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY WhileStat (__IDWhileStat__),
	__FKcondition__ Integer
) ;

CREATE TABLE ExpressionStat (
	__IDExpressionStat__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ExpressionStat (__IDExpressionStat__),
	__FKexpression__ Integer
) ;

CREATE TABLE Procedure_parameters_Parameter (
	__IDProcedure__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE WhileStat_doStats_Statement (
	__IDWhileStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Program_monitors_Monitor (
	__IDProgram__ Integer NOT NULL,
	__IDMonitor__ Integer NOT NULL
) ;

CREATE TABLE Procedure_statements_Statement (
	__IDProcedure__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE ConditionalStat_elseStats_Statement (
	__IDConditionalStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Structure_variables_VariableDeclaration (
	__IDStructure__ Integer NOT NULL,
	__IDVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ProcedureCallExp_arguments_Expression (
	__IDProcedureCallExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ProcContainerElement_procedures_Procedure (
	__IDProcContainerElement__ Integer NOT NULL,
	__IDProcedure__ Integer NOT NULL
) ;

CREATE TABLE ConditionalStat_thenStats_Statement (
	__IDConditionalStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;
