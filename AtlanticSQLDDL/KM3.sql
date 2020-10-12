CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	name text,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKpackage__ Integer
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE EnumLiteral (
	__IDEnumLiteral__ Integer NOT NULL,
	PRIMARY KEY EnumLiteral (__IDEnumLiteral__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isAbstract Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	lower Integer,
	upper Integer,
	isOrdered Boolean,
	isUnique Boolean,
	FOREIGN KEY owner (__FKowner__) REFERENCES Class (__IDClass__),
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKowner__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	isContainer Boolean,
	FOREIGN KEY opposite (__FKopposite__) REFERENCES Reference (__IDReference__),
	PRIMARY KEY Reference (__IDReference__),
	__FKopposite__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY metamodel (__FKmetamodel__) REFERENCES Metamodel (__IDMetamodel__),
	PRIMARY KEY Package (__IDPackage__),
	__FKmetamodel__ Integer
) ;

CREATE TABLE Metamodel (
	__IDMetamodel__ Integer NOT NULL,
	PRIMARY KEY Metamodel (__IDMetamodel__)
) ;

CREATE TABLE Package_contents_ModelElement (
	__IDPackage__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_literals_EnumLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumLiteral__ Integer NOT NULL
) ;

CREATE TABLE Class_supertypes_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_structuralFeatures_StructuralFeature (
	__IDClass__ Integer NOT NULL,
	__IDStructuralFeature__ Integer NOT NULL
) ;

CREATE TABLE Metamodel_contents_Package (
	__IDMetamodel__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;
