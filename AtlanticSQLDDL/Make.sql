CREATE TABLE Makefile (
	__IDMakefile__ Integer NOT NULL,
	name text,
	FOREIGN KEY comment (__FKcomment__) REFERENCES Comment (__IDComment__),
	PRIMARY KEY Makefile (__IDMakefile__),
	__FKcomment__ Integer
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	PRIMARY KEY Rule (__IDRule__)
) ;

CREATE TABLE Macro (
	__IDMacro__ Integer NOT NULL,
	value text,
	PRIMARY KEY Macro (__IDMacro__)
) ;

CREATE TABLE ShellLine (
	__IDShellLine__ Integer NOT NULL,
	command text,
	display Boolean,
	FOREIGN KEY ruleShellLine (__FKruleShellLine__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY ShellLine (__IDShellLine__),
	__FKruleShellLine__ Integer
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	text text,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE RuleDep (
	__IDRuleDep__ Integer NOT NULL,
	FOREIGN KEY ruledep (__FKruledep__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY RuleDep (__IDRuleDep__),
	__FKruledep__ Integer
) ;

CREATE TABLE FileDep (
	__IDFileDep__ Integer NOT NULL,
	name text,
	PRIMARY KEY FileDep (__IDFileDep__)
) ;

CREATE TABLE Rule_dependencies_Dependency (
	__IDRule__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Rule_shellLines_ShellLine (
	__IDRule__ Integer NOT NULL,
	__IDShellLine__ Integer NOT NULL
) ;

CREATE TABLE Makefile_elements_Element (
	__IDMakefile__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;
