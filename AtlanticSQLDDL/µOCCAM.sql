CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE StopProcess (
	__IDStopProcess__ Integer NOT NULL,
	PRIMARY KEY StopProcess (__IDStopProcess__)
) ;

CREATE TABLE SkipProcess (
	__IDSkipProcess__ Integer NOT NULL,
	PRIMARY KEY SkipProcess (__IDSkipProcess__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Construction (
	__IDConstruction__ Integer NOT NULL,
	PRIMARY KEY Construction (__IDConstruction__)
) ;

CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	name text,
	PRIMARY KEY Instance (__IDInstance__)
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Assignment (__IDAssignment__),
	__FKexpression__ Integer,
	__FKvariable__ Integer
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY Input (__IDInput__),
	__FKvariable__ Integer,
	__FKchannel__ Integer
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	FOREIGN KEY channel (__FKchannel__) REFERENCES Channel (__IDChannel__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Output (__IDOutput__),
	__FKchannel__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Sequence (
	__IDSequence__ Integer NOT NULL,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Sequence (__IDSequence__),
	__FKprocess__ Integer
) ;

CREATE TABLE NormalSequence (
	__IDNormalSequence__ Integer NOT NULL,
	PRIMARY KEY NormalSequence (__IDNormalSequence__)
) ;

CREATE TABLE ReplicatorSequence (
	__IDReplicatorSequence__ Integer NOT NULL,
	FOREIGN KEY replicator (__FKreplicator__) REFERENCES Replicator (__IDReplicator__),
	PRIMARY KEY ReplicatorSequence (__IDReplicatorSequence__),
	__FKreplicator__ Integer
) ;

CREATE TABLE Conditional (
	__IDConditional__ Integer NOT NULL,
	FOREIGN KEY choice (__FKchoice__) REFERENCES Choice (__IDChoice__),
	PRIMARY KEY Conditional (__IDConditional__),
	__FKchoice__ Integer
) ;

CREATE TABLE NormalConditional (
	__IDNormalConditional__ Integer NOT NULL,
	PRIMARY KEY NormalConditional (__IDNormalConditional__)
) ;

CREATE TABLE ReplicatorConditional (
	__IDReplicatorConditional__ Integer NOT NULL,
	FOREIGN KEY replicator (__FKreplicator__) REFERENCES Replicator (__IDReplicator__),
	PRIMARY KEY ReplicatorConditional (__IDReplicatorConditional__),
	__FKreplicator__ Integer
) ;

CREATE TABLE "Loop" (
	__IDLoop__ Integer NOT NULL,
	FOREIGN KEY boolean (__FKboolean__) REFERENCES BooleanRef (__IDBooleanRef__),
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY "Loop" (__IDLoop__),
	__FKprocess__ Integer,
	__FKboolean__ Integer
) ;

CREATE TABLE Parallel (
	__IDParallel__ Integer NOT NULL,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Parallel (__IDParallel__),
	__FKprocess__ Integer
) ;

CREATE TABLE NormalParallel (
	__IDNormalParallel__ Integer NOT NULL,
	PRIMARY KEY NormalParallel (__IDNormalParallel__)
) ;

CREATE TABLE ReplicatorParallel (
	__IDReplicatorParallel__ Integer NOT NULL,
	FOREIGN KEY replicator (__FKreplicator__) REFERENCES Replicator (__IDReplicator__),
	PRIMARY KEY ReplicatorParallel (__IDReplicatorParallel__),
	__FKreplicator__ Integer
) ;

CREATE TABLE Alternation (
	__IDAlternation__ Integer NOT NULL,
	FOREIGN KEY alternative (__FKalternative__) REFERENCES Alternative (__IDAlternative__),
	PRIMARY KEY Alternation (__IDAlternation__),
	__FKalternative__ Integer
) ;

CREATE TABLE NormalAlternation (
	__IDNormalAlternation__ Integer NOT NULL,
	PRIMARY KEY NormalAlternation (__IDNormalAlternation__)
) ;

CREATE TABLE ReplicatorAlternation (
	__IDReplicatorAlternation__ Integer NOT NULL,
	FOREIGN KEY replicator (__FKreplicator__) REFERENCES Replicator (__IDReplicator__),
	PRIMARY KEY ReplicatorAlternation (__IDReplicatorAlternation__),
	__FKreplicator__ Integer
) ;

CREATE TABLE Choice (
	__IDChoice__ Integer NOT NULL,
	FOREIGN KEY boolean (__FKboolean__) REFERENCES BooleanRef (__IDBooleanRef__),
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Choice (__IDChoice__),
	__FKboolean__ Integer,
	__FKprocess__ Integer
) ;

CREATE TABLE BooleanRef (
	__IDBooleanRef__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY BooleanRef (__IDBooleanRef__),
	__FKexpression__ Integer
) ;

CREATE TABLE Alternative (
	__IDAlternative__ Integer NOT NULL,
	FOREIGN KEY guard (__FKguard__) REFERENCES Guard (__IDGuard__),
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Alternative (__IDAlternative__),
	__FKprocess__ Integer,
	__FKguard__ Integer
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	FOREIGN KEY input (__FKinput__) REFERENCES Input (__IDInput__),
	PRIMARY KEY Guard (__IDGuard__),
	__FKinput__ Integer
) ;

CREATE TABLE InputGuard (
	__IDInputGuard__ Integer NOT NULL,
	PRIMARY KEY InputGuard (__IDInputGuard__)
) ;

CREATE TABLE BooleanGuard (
	__IDBooleanGuard__ Integer NOT NULL,
	FOREIGN KEY boolean (__FKboolean__) REFERENCES BooleanRef (__IDBooleanRef__),
	PRIMARY KEY BooleanGuard (__IDBooleanGuard__),
	__FKboolean__ Integer
) ;

CREATE TABLE Replicator (
	__IDReplicator__ Integer NOT NULL,
	name text,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	FOREIGN KEY count (__FKcount__) REFERENCES Count (__IDCount__),
	PRIMARY KEY Replicator (__IDReplicator__),
	__FKbase__ Integer,
	__FKcount__ Integer
) ;

CREATE TABLE Base (
	__IDBase__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Base (__IDBase__),
	__FKexpression__ Integer
) ;

CREATE TABLE Count (
	__IDCount__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Count (__IDCount__),
	__FKexpression__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	FOREIGN KEY primitiveType (__FKprimitiveType__) REFERENCES PrimitiveType (__IDPrimitiveType__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Type (__IDType__),
	__FKprimitiveType__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	isInt Boolean,
	isChan Boolean,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE Literal (
	__IDLiteral__ Integer NOT NULL,
	integer Integer,
	PRIMARY KEY Literal (__IDLiteral__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	FOREIGN KEY subscript (__FKsubscript__) REFERENCES Subscript (__IDSubscript__),
	PRIMARY KEY Element (__IDElement__),
	__FKsubscript__ Integer
) ;

CREATE TABLE Subscript (
	__IDSubscript__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Subscript (__IDSubscript__),
	__FKexpression__ Integer
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKelement__ Integer
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Channel (__IDChannel__),
	__FKelement__ Integer
) ;

CREATE TABLE Operand (
	__IDOperand__ Integer NOT NULL,
	PRIMARY KEY Operand (__IDOperand__)
) ;

CREATE TABLE VariableOPerand (
	__IDVariableOPerand__ Integer NOT NULL,
	PRIMARY KEY VariableOPerand (__IDVariableOPerand__)
) ;

CREATE TABLE LiteralOperand (
	__IDLiteralOperand__ Integer NOT NULL,
	PRIMARY KEY LiteralOperand (__IDLiteralOperand__)
) ;

CREATE TABLE ExpressionOperand (
	__IDExpressionOperand__ Integer NOT NULL,
	PRIMARY KEY ExpressionOperand (__IDExpressionOperand__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Operand (__IDOperand__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKoperand__ Integer
) ;

CREATE TABLE MonadicExpression (
	__IDMonadicExpression__ Integer NOT NULL,
	FOREIGN KEY monadicOperator (__FKmonadicOperator__) REFERENCES MonadicOperator (__IDMonadicOperator__),
	PRIMARY KEY MonadicExpression (__IDMonadicExpression__),
	__FKmonadicOperator__ Integer
) ;

CREATE TABLE DyadicExpression (
	__IDDyadicExpression__ Integer NOT NULL,
	FOREIGN KEY operandRight (__FKoperandRight__) REFERENCES Operand (__IDOperand__),
	FOREIGN KEY dyadicOperator (__FKdyadicOperator__) REFERENCES DyadicOperator (__IDDyadicOperator__),
	PRIMARY KEY DyadicExpression (__IDDyadicExpression__),
	__FKdyadicOperator__ Integer,
	__FKoperandRight__ Integer
) ;

CREATE TABLE SimpleExpression (
	__IDSimpleExpression__ Integer NOT NULL,
	PRIMARY KEY SimpleExpression (__IDSimpleExpression__)
) ;

CREATE TABLE Specification (
	__IDSpecification__ Integer NOT NULL,
	PRIMARY KEY Specification (__IDSpecification__)
) ;

CREATE TABLE Declaration (
	__IDDeclaration__ Integer NOT NULL,
	PRIMARY KEY Declaration (__IDDeclaration__)
) ;

CREATE TABLE TypeDeclaration (
	__IDTypeDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypeDeclaration (__IDTypeDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE IntDeclaration (
	__IDIntDeclaration__ Integer NOT NULL,
	name text,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY IntDeclaration (__IDIntDeclaration__),
	__FKexpression__ Integer
) ;

CREATE TABLE ValDeclaration (
	__IDValDeclaration__ Integer NOT NULL,
	name text,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ValDeclaration (__IDValDeclaration__),
	__FKexpression__ Integer
) ;

CREATE TABLE Definition (
	__IDDefinition__ Integer NOT NULL,
	name text,
	FOREIGN KEY procedureBody (__FKprocedureBody__) REFERENCES ProcedureBody (__IDProcedureBody__),
	PRIMARY KEY Definition (__IDDefinition__),
	__FKprocedureBody__ Integer
) ;

CREATE TABLE Formal (
	__IDFormal__ Integer NOT NULL,
	name text,
	FOREIGN KEY primitiveType (__FKprimitiveType__) REFERENCES PrimitiveType (__IDPrimitiveType__),
	PRIMARY KEY Formal (__IDFormal__),
	__FKprimitiveType__ Integer
) ;

CREATE TABLE ProcedureBody (
	__IDProcedureBody__ Integer NOT NULL,
	name text,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY ProcedureBody (__IDProcedureBody__),
	__FKprocess__ Integer
) ;

CREATE TABLE Actual (
	__IDActual__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Actual (__IDActual__),
	__FKelement__ Integer
) ;

CREATE TABLE MonadicOperator (
	__IDMonadicOperator__ Integer NOT NULL,
	minus Boolean,
	"not" Boolean,
	PRIMARY KEY MonadicOperator (__IDMonadicOperator__)
) ;

CREATE TABLE DyadicOperator (
	__IDDyadicOperator__ Integer NOT NULL,
	plus Boolean,
	minus Boolean,
	star Boolean,
	slash Boolean,
	"or" Boolean,
	inverseSlash Boolean,
	"and" Boolean,
	eq Boolean,
	ne Boolean,
	lt Boolean,
	gt Boolean,
	le Boolean,
	ge Boolean,
	PRIMARY KEY DyadicOperator (__IDDyadicOperator__)
) ;
