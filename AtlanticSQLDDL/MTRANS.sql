CREATE TABLE MetaClass (
	__IDMetaClass__ Integer NOT NULL,
	PRIMARY KEY MetaClass (__IDMetaClass__)
) ;

CREATE TABLE MetaModel (
	__IDMetaModel__ Integer NOT NULL,
	PRIMARY KEY MetaModel (__IDMetaModel__)
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	name text,
	mode text,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	isAbstract Boolean,
	isEntryPoint Boolean,
	name text,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	FOREIGN KEY target (__FKtarget__) REFERENCES MetaClass (__IDMetaClass__),
	FOREIGN KEY source (__FKsource__) REFERENCES MetaClass (__IDMetaClass__),
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY guard (__FKguard__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Rule (__IDRule__),
	__FKtarget__ Integer,
	__FKmodule__ Integer,
	__FKguard__ Integer,
	__FKsource__ Integer,
	__FKdeclaration__ Integer
) ;

CREATE TABLE Inheritance (
	__IDInheritance__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Inheritance (__IDInheritance__),
	__FKrule__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	operator text,
	FOREIGN KEY inheritance (__FKinheritance__) REFERENCES Inheritance (__IDInheritance__),
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY instruction (__FKinstruction__) REFERENCES Instruction (__IDInstruction__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKrule__ Integer,
	__FKinstruction__ Integer,
	__FKinheritance__ Integer
) ;

CREATE TABLE Section (
	__IDSection__ Integer NOT NULL,
	kind text,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Section (__IDSection__),
	__FKrule__ Integer
) ;

CREATE TABLE Instruction (
	__IDInstruction__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY section (__FKsection__) REFERENCES Section (__IDSection__),
	PRIMARY KEY Instruction (__IDInstruction__),
	__FKsection__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	name text,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKrule__ Integer
) ;

CREATE TABLE Module_metaSource_MetaModel (
	__IDModule__ Integer NOT NULL,
	__IDMetaModel__ Integer NOT NULL
) ;

CREATE TABLE Rule_inheritances_Inheritance (
	__IDRule__ Integer NOT NULL,
	__IDInheritance__ Integer NOT NULL
) ;

CREATE TABLE Inheritance_inheritedRules_Rule (
	__IDInheritance__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Inheritance_expressions_Expression (
	__IDInheritance__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE Module_metaDest_MetaModel (
	__IDModule__ Integer NOT NULL,
	__IDMetaModel__ Integer NOT NULL
) ;

CREATE TABLE Section_instructions_Instruction (
	__IDSection__ Integer NOT NULL,
	__IDInstruction__ Integer NOT NULL
) ;

CREATE TABLE Module_rules_Rule (
	__IDModule__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Rule_sections_Section (
	__IDRule__ Integer NOT NULL,
	__IDSection__ Integer NOT NULL
) ;
