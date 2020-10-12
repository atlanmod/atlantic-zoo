CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	isInstantiable Boolean,
	PRIMARY KEY Subsystem (__IDSubsystem__)
) ;

CREATE TABLE ElementImport (
	__IDElementImport__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY importedElement (__FKimportedElement__) REFERENCES ModelElement (__IDModelElement__),
	visibility text,
	alias text,
	isSpecification Boolean,
	PRIMARY KEY ElementImport (__IDElementImport__),
	__FKimportedElement__ Integer,
	__FKpackage__ Integer
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	name text,
	visibility text,
	isSpecification Boolean,
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	ownerScope text,
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY child (__FKchild__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	discriminator text,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKchild__ Integer,
	__FKpowertype__ Integer,
	__FKparent__ Integer
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedElement_ModelElement (
	__IDNamespace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE GeneralizableElement_generalization_Generalization (
	__IDGeneralizableElement__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeRange_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Package_elementImport_ElementImport (
	__IDPackage__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;
