CREATE TABLE UMLModelElement (
	__IDUMLModelElement__ Integer NOT NULL,
	kind text,
	name text,
	PRIMARY KEY UMLModelElement (__IDUMLModelElement__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Class (__IDClass__),
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKowner__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE PackageElement (
	__IDPackageElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY PackageElement (__IDPackageElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE PrimitiveDataType (
	__IDPrimitiveDataType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveDataType (__IDPrimitiveDataType__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Class (__IDClass__),
	FOREIGN KEY destination (__FKdestination__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Association (__IDAssociation__),
	__FKdestination__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE Class_reverse_Association (
	__IDClass__ Integer NOT NULL,
	__IDAssociation__ Integer NOT NULL
) ;

CREATE TABLE Package_elements_PackageElement (
	__IDPackage__ Integer NOT NULL,
	__IDPackageElement__ Integer NOT NULL
) ;

CREATE TABLE Class_forward_Association (
	__IDClass__ Integer NOT NULL,
	__IDAssociation__ Integer NOT NULL
) ;

CREATE TABLE Classifier_typeOpposite_Attribute (
	__IDClassifier__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Class_general_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_generalOpposite_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_attribute_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;
