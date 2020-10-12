CREATE TABLE Simulink (
	__IDSimulink__ Integer NOT NULL,
	PRIMARY KEY Simulink (__IDSimulink__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	name text,
	FOREIGN KEY simulink (__FKsimulink__) REFERENCES Simulink (__IDSimulink__),
	FOREIGN KEY blocks (__FKblocks__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY "lines" (__FKlines__) REFERENCES Line (__IDLine__),
	PRIMARY KEY System (__IDSystem__),
	__FKsimulink__ Integer,
	__FKlines__ Integer,
	__FKblocks__ Integer
) ;

CREATE TABLE Connector (
	__IDConnector__ Integer NOT NULL,
	PRIMARY KEY Connector (__IDConnector__)
) ;

CREATE TABLE Line (
	__IDLine__ Integer NOT NULL,
	name text,
	FOREIGN KEY block (__FKblock__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Line (__IDLine__),
	__FKsystem__ Integer,
	__FKblock__ Integer
) ;

CREATE TABLE BranchPoint (
	__IDBranchPoint__ Integer NOT NULL,
	PRIMARY KEY BranchPoint (__IDBranchPoint__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	units text,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	description text,
	name text,
	priority text,
	natagme text,
	blockType text,
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Block (__IDBlock__),
	__FKsystem__ Integer
) ;

CREATE TABLE BlockRef (
	__IDBlockRef__ Integer NOT NULL,
	PRIMARY KEY BlockRef (__IDBlockRef__)
) ;

CREATE TABLE Primitive (
	__IDPrimitive__ Integer NOT NULL,
	deadLine text,
	period text,
	executionTime text,
	PRIMARY KEY Primitive (__IDPrimitive__)
) ;

CREATE TABLE OutPut (
	__IDOutPut__ Integer NOT NULL,
	number Integer,
	PRIMARY KEY OutPut (__IDOutPut__)
) ;

CREATE TABLE TriggerPort (
	__IDTriggerPort__ Integer NOT NULL,
	triggerType text,
	PRIMARY KEY TriggerPort (__IDTriggerPort__)
) ;

CREATE TABLE EnablePort (
	__IDEnablePort__ Integer NOT NULL,
	statesWhenEnabling text,
	PRIMARY KEY EnablePort (__IDEnablePort__)
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	sourceBlock text,
	sourceType text,
	PRIMARY KEY Reference (__IDReference__)
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	text text,
	FOREIGN KEY block (__FKblock__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Annotation (__IDAnnotation__),
	__FKblock__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	value text,
	FOREIGN KEY block (__FKblock__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKblock__ Integer
) ;

CREATE TABLE Block_lines_Line (
	__IDBlock__ Integer NOT NULL,
	__IDLine__ Integer NOT NULL
) ;

CREATE TABLE Simulink_subSystem_System (
	__IDSimulink__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Block_parameters_Parameter (
	__IDBlock__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Block_annotations_Annotation (
	__IDBlock__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE System_subSystem_System (
	__IDSystem__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Block_blockRefs_BlockRef (
	__IDBlock__ Integer NOT NULL,
	__IDBlockRef__ Integer NOT NULL
) ;
