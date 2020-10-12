CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	aggregation text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE PackagedElement (
	__IDPackagedElement__ Integer NOT NULL,
	PRIMARY KEY PackagedElement (__IDPackagedElement__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	direction text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE type (
	__IDtype__ Integer NOT NULL,
	PRIMARY KEY type (__IDtype__)
) ;

CREATE TABLE TypedElement (
	__IDTypedElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES type (__IDtype__),
	PRIMARY KEY TypedElement (__IDTypedElement__),
	__FKtype__ Integer
) ;

CREATE TABLE MultiplicityElement (
	__IDMultiplicityElement__ Integer NOT NULL,
	upper text,
	lower text,
	PRIMARY KEY MultiplicityElement (__IDMultiplicityElement__)
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY general (__FKgeneral__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKgeneral__ Integer
) ;

CREATE TABLE Class_nestedClassifier_Classifier (
	__IDClass__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Operation_ownedParmeter_Parameter (
	__IDOperation__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Interface_nestedClassifier_Classifier (
	__IDInterface__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Classifier_ownedProperty_Property (
	__IDClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Classifier_ownedOperation_Operation (
	__IDClassifier__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Classifier_ownedElement_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Package_ownedPackagedElement_PackagedElement (
	__IDPackage__ Integer NOT NULL,
	__IDPackagedElement__ Integer NOT NULL
) ;

CREATE TABLE Association_ownedEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Association_memberEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_ownedLiteral_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;
