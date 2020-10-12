CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	identity text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE LoadedElement (
	__IDLoadedElement__ Integer NOT NULL,
	isLoaded Boolean,
	PRIMARY KEY LoadedElement (__IDLoadedElement__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	namespace text,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE DomainModel (
	__IDDomainModel__ Integer NOT NULL,
	PRIMARY KEY DomainModel (__IDDomainModel__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	isAbstract Boolean,
	FOREIGN KEY superType (__FKsuperType__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY domainModel (__FKdomainModel__) REFERENCES DomainModel (__IDDomainModel__),
	PRIMARY KEY Classifier (__IDClassifier__),
	__FKsuperType__ Integer,
	__FKdomainModel__ Integer
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isSerializationRoot Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	isEmbedding Boolean,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	min Integer,
	max Integer,
	isUnbounded Boolean,
	accepts text,
	isOrdered Boolean,
	isNavigableFrom Boolean,
	isPropertyGenerator Boolean,
	FOREIGN KEY source (__FKsource__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY relation (__FKrelation__) REFERENCES Relationship (__IDRelationship__),
	PRIMARY KEY Role (__IDRole__),
	__FKrelation__ Integer,
	__FKtype__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE ValueProperty (
	__IDValueProperty__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY ValueProperty (__IDValueProperty__),
	__FKowner__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE SimpleType (
	__IDSimpleType__ Integer NOT NULL,
	PRIMARY KEY SimpleType (__IDSimpleType__)
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE DomainModel_types_Type (
	__IDDomainModel__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE DomainModel_classifiers_Classifier (
	__IDDomainModel__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Classifier_properties_ValueProperty (
	__IDClassifier__ Integer NOT NULL,
	__IDValueProperty__ Integer NOT NULL
) ;

CREATE TABLE Classifier_subTypes_Classifier (
	__IDClassifier__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_literals_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;

CREATE TABLE Relationship_roles_Role (
	__IDRelationship__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;
