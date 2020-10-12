CREATE TABLE Program (
	__IDProgram__ Integer NOT NULL,
	name text,
	PRIMARY KEY Program (__IDProgram__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	name text,
	FOREIGN KEY program (__FKprogram__) REFERENCES Program (__IDProgram__),
	FOREIGN KEY "procedure" (__FKprocedure__) REFERENCES "Procedure" (__IDProcedure__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKtype__ Integer,
	__FKprogram__ Integer,
	__FKprocedure__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	name text,
	FOREIGN KEY program (__FKprogram__) REFERENCES Program (__IDProgram__),
	PRIMARY KEY Type (__IDType__),
	__FKprogram__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY procedure_parameter (__FKprocedure_parameter__) REFERENCES "Procedure" (__IDProcedure__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKprocedure_parameter__ Integer
) ;

CREATE TABLE Instruction (
	__IDInstruction__ Integer NOT NULL,
	FOREIGN KEY block (__FKblock__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Instruction (__IDInstruction__),
	__FKblock__ Integer
) ;

CREATE TABLE Calculation (
	__IDCalculation__ Integer NOT NULL,
	PRIMARY KEY Calculation (__IDCalculation__)
) ;

CREATE TABLE Control (
	__IDControl__ Integer NOT NULL,
	PRIMARY KEY Control (__IDControl__)
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	PRIMARY KEY Assignment (__IDAssignment__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	FOREIGN KEY "procedure" (__FKprocedure__) REFERENCES "Procedure" (__IDProcedure__),
	FOREIGN KEY "loop" (__FKloop__) REFERENCES "Loop" (__IDLoop__),
	FOREIGN KEY conditional (__FKconditional__) REFERENCES Conditional (__IDConditional__),
	PRIMARY KEY Block (__IDBlock__),
	__FKprocedure__ Integer,
	__FKconditional__ Integer,
	__FKloop__ Integer
) ;

CREATE TABLE Conditional (
	__IDConditional__ Integer NOT NULL,
	PRIMARY KEY Conditional (__IDConditional__)
) ;

CREATE TABLE "Loop" (
	__IDLoop__ Integer NOT NULL,
	FOREIGN KEY block_loop (__FKblock_loop__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY "Loop" (__IDLoop__),
	__FKblock_loop__ Integer
) ;

CREATE TABLE "Procedure" (
	__IDProcedure__ Integer NOT NULL,
	name text,
	FOREIGN KEY program (__FKprogram__) REFERENCES Program (__IDProgram__),
	FOREIGN KEY block_procedure (__FKblock_procedure__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY "Procedure" (__IDProcedure__),
	__FKblock_procedure__ Integer,
	__FKprogram__ Integer
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES Type (__IDType__),
	PRIMARY KEY Function (__IDFunction__),
	__FKreturnType__ Integer
) ;

CREATE TABLE "For" (
	__IDFor__ Integer NOT NULL,
	PRIMARY KEY "For" (__IDFor__)
) ;

CREATE TABLE "While" (
	__IDWhile__ Integer NOT NULL,
	PRIMARY KEY "While" (__IDWhile__)
) ;

CREATE TABLE "Repeat" (
	__IDRepeat__ Integer NOT NULL,
	PRIMARY KEY "Repeat" (__IDRepeat__)
) ;

CREATE TABLE Type_variables_Variable (
	__IDType__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Program_procedures_Procedure (
	__IDProgram__ Integer NOT NULL,
	__IDProcedure__ Integer NOT NULL
) ;

CREATE TABLE Program_types_Type (
	__IDProgram__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Procedure_variables_Variable (
	__IDProcedure__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Conditional_blocks_Block (
	__IDConditional__ Integer NOT NULL,
	__IDBlock__ Integer NOT NULL
) ;

CREATE TABLE Procedure_parameters_Parameter (
	__IDProcedure__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Program_variables_Variable (
	__IDProgram__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Block_instructions_Instruction (
	__IDBlock__ Integer NOT NULL,
	__IDInstruction__ Integer NOT NULL
) ;
