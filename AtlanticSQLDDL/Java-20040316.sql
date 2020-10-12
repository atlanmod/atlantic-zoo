CREATE TABLE JavaElement (
	__IDJavaElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY JavaElement (__IDJavaElement__)
) ;

CREATE TABLE ClassFeature (
	__IDClassFeature__ Integer NOT NULL,
	isFinal Boolean,
	PRIMARY KEY ClassFeature (__IDClassFeature__)
) ;

CREATE TABLE ClassMember (
	__IDClassMember__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES JavaClass (__IDJavaClass__),
	FOREIGN KEY type (__FKtype__) REFERENCES JavaClass (__IDJavaClass__),
	isStatic Boolean,
	isPublic Boolean,
	PRIMARY KEY ClassMember (__IDClassMember__),
	__FKtype__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	PRIMARY KEY Field (__IDField__)
) ;

CREATE TABLE JavaClass (
	__IDJavaClass__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	isAbstract Boolean,
	isStatic Boolean,
	isPublic Boolean,
	PRIMARY KEY JavaClass (__IDJavaClass__),
	__FKpackage__ Integer
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	PRIMARY KEY Method (__IDMethod__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE FeatureParameter (
	__IDFeatureParameter__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES JavaClass (__IDJavaClass__),
	FOREIGN KEY method (__FKmethod__) REFERENCES Method (__IDMethod__),
	PRIMARY KEY FeatureParameter (__IDFeatureParameter__),
	__FKmethod__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE JavaClass_members_ClassMember (
	__IDJavaClass__ Integer NOT NULL,
	__IDClassMember__ Integer NOT NULL
) ;

CREATE TABLE Package_classes_JavaClass (
	__IDPackage__ Integer NOT NULL,
	__IDJavaClass__ Integer NOT NULL
) ;

CREATE TABLE JavaClass_parameters_FeatureParameter (
	__IDJavaClass__ Integer NOT NULL,
	__IDFeatureParameter__ Integer NOT NULL
) ;

CREATE TABLE Method_parameters_FeatureParameter (
	__IDMethod__ Integer NOT NULL,
	__IDFeatureParameter__ Integer NOT NULL
) ;

CREATE TABLE JavaClass_typedElements_ClassMember (
	__IDJavaClass__ Integer NOT NULL,
	__IDClassMember__ Integer NOT NULL
) ;
