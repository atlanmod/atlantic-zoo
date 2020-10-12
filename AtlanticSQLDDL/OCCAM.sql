CREATE TABLE OCCAM_Program (
	__IDOCCAM_Program__ Integer NOT NULL,
	PRIMARY KEY OCCAM_Program (__IDOCCAM_Program__)
) ;

CREATE TABLE OCCAM_Element (
	__IDOCCAM_Element__ Integer NOT NULL,
	name text,
	PRIMARY KEY OCCAM_Element (__IDOCCAM_Element__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES Declaration (__IDDeclaration__),
	FOREIGN KEY toChannel (__FKtoChannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Process (__IDProcess__),
	__FKtoChannel__ Integer,
	__FKdeclaration__ Integer
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	name text,
	type text,
	FOREIGN KEY toServer (__FKtoServer__) REFERENCES Server (__IDServer__),
	FOREIGN KEY toProcess (__FKtoProcess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Channel (__IDChannel__),
	__FKtoServer__ Integer,
	__FKtoProcess__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY constructor (__FKconstructor__) REFERENCES Constructor (__IDConstructor__),
	FOREIGN KEY "while" (__FKwhile__) REFERENCES "While" (__IDWhile__),
	FOREIGN KEY "if" (__FKif__) REFERENCES "If" (__IDIf__),
	PRIMARY KEY Action (__IDAction__),
	__FKconstructor__ Integer,
	__FKif__ Integer,
	__FKwhile__ Integer
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	PRIMARY KEY Assignment (__IDAssignment__)
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	PRIMARY KEY Input (__IDInput__)
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	PRIMARY KEY Output (__IDOutput__)
) ;

CREATE TABLE Constructor (
	__IDConstructor__ Integer NOT NULL,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Constructor (__IDConstructor__),
	__FKprocess__ Integer
) ;

CREATE TABLE Buckel (
	__IDBuckel__ Integer NOT NULL,
	FOREIGN KEY constructor (__FKconstructor__) REFERENCES Constructor (__IDConstructor__),
	PRIMARY KEY Buckel (__IDBuckel__),
	__FKconstructor__ Integer
) ;

CREATE TABLE "If" (
	__IDIf__ Integer NOT NULL,
	PRIMARY KEY "If" (__IDIf__)
) ;

CREATE TABLE "While" (
	__IDWhile__ Integer NOT NULL,
	PRIMARY KEY "While" (__IDWhile__)
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	elementRight text,
	elementLeft text,
	typeCondition text,
	FOREIGN KEY "if" (__FKif__) REFERENCES "If" (__IDIf__),
	FOREIGN KEY "while" (__FKwhile__) REFERENCES "While" (__IDWhile__),
	PRIMARY KEY "Condition" (__IDCondition__),
	__FKwhile__ Integer,
	__FKif__ Integer
) ;

CREATE TABLE Sequential (
	__IDSequential__ Integer NOT NULL,
	PRIMARY KEY Sequential (__IDSequential__)
) ;

CREATE TABLE Parallel (
	__IDParallel__ Integer NOT NULL,
	PRIMARY KEY Parallel (__IDParallel__)
) ;

CREATE TABLE Alternative (
	__IDAlternative__ Integer NOT NULL,
	PRIMARY KEY Alternative (__IDAlternative__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	dataType text,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Library (
	__IDLibrary__ Integer NOT NULL,
	name text,
	PRIMARY KEY Library (__IDLibrary__)
) ;

CREATE TABLE File (
	__IDFile__ Integer NOT NULL,
	name text,
	PRIMARY KEY File (__IDFile__)
) ;

CREATE TABLE Server (
	__IDServer__ Integer NOT NULL,
	name text,
	FOREIGN KEY toChannel (__FKtoChannel__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY Server (__IDServer__),
	__FKtoChannel__ Integer
) ;

CREATE TABLE Declaration (
	__IDDeclaration__ Integer NOT NULL,
	name text,
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Declaration (__IDDeclaration__),
	__FKprocess__ Integer
) ;

CREATE TABLE If_actions_Action (
	__IDIf__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE While_actions_Action (
	__IDWhile__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE If_conditions_Condition (
	__IDIf__ Integer NOT NULL,
	__IDCondition__ Integer NOT NULL
) ;

CREATE TABLE While_conditions_Condition (
	__IDWhile__ Integer NOT NULL,
	__IDCondition__ Integer NOT NULL
) ;

CREATE TABLE Declaration_elements_DataType (
	__IDDeclaration__ Integer NOT NULL,
	__IDDataType__ Integer NOT NULL
) ;

CREATE TABLE Process_parameters_DataType (
	__IDProcess__ Integer NOT NULL,
	__IDDataType__ Integer NOT NULL
) ;

CREATE TABLE Process_constructors_Constructor (
	__IDProcess__ Integer NOT NULL,
	__IDConstructor__ Integer NOT NULL
) ;

CREATE TABLE OCCAM_Program_files_File (
	__IDOCCAM_Program__ Integer NOT NULL,
	__IDFile__ Integer NOT NULL
) ;

CREATE TABLE Constructor_childrens_Constructor (
	__IDConstructor__ Integer NOT NULL,
	__IDConstructor__ Integer NOT NULL
) ;

CREATE TABLE Process_libraries_Library (
	__IDProcess__ Integer NOT NULL,
	__IDLibrary__ Integer NOT NULL
) ;

CREATE TABLE Constructor_actions_Action (
	__IDConstructor__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Constructor_buckels_Buckel (
	__IDConstructor__ Integer NOT NULL,
	__IDBuckel__ Integer NOT NULL
) ;

CREATE TABLE OCCAM_Program_occam_Elements_OCCAM_Element (
	__IDOCCAM_Program__ Integer NOT NULL,
	__IDOCCAM_Element__ Integer NOT NULL
) ;
