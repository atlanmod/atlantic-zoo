CREATE TABLE JavaSource (
	__IDJavaSource__ Integer NOT NULL,
	PRIMARY KEY JavaSource (__IDJavaSource__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE ClassDeclaration (
	__IDClassDeclaration__ Integer NOT NULL,
	FOREIGN KEY superclass (__FKsuperclass__) REFERENCES ClassDeclaration (__IDClassDeclaration__),
	PRIMARY KEY ClassDeclaration (__IDClassDeclaration__),
	__FKsuperclass__ Integer
) ;

CREATE TABLE MethodDefinition (
	__IDMethodDefinition__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES ClassDeclaration (__IDClassDeclaration__),
	PRIMARY KEY MethodDefinition (__IDMethodDefinition__),
	__FKclass__ Integer
) ;

CREATE TABLE MethodInvocation (
	__IDMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY method (__FKmethod__) REFERENCES MethodDefinition (__IDMethodDefinition__),
	PRIMARY KEY MethodInvocation (__IDMethodInvocation__),
	__FKmethod__ Integer
) ;

CREATE TABLE JavaSource_classes_ClassDeclaration (
	__IDJavaSource__ Integer NOT NULL,
	__IDClassDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ClassDeclaration_methods_MethodDefinition (
	__IDClassDeclaration__ Integer NOT NULL,
	__IDMethodDefinition__ Integer NOT NULL
) ;

CREATE TABLE MethodDefinition_invocations_MethodInvocation (
	__IDMethodDefinition__ Integer NOT NULL,
	__IDMethodInvocation__ Integer NOT NULL
) ;
