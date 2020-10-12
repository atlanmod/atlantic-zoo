CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	expresssion text,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	name text,
	visibility text,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES NameSpace (__IDNameSpace__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	kind text,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKbody__ Integer
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKtype__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE NameSpace (
	__IDNameSpace__ Integer NOT NULL,
	PRIMARY KEY NameSpace (__IDNameSpace__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Datatype (
	__IDDatatype__ Integer NOT NULL,
	PRIMARY KEY Datatype (__IDDatatype__)
) ;

CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	PRIMARY KEY Subsystem (__IDSubsystem__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE Dependency_suppliers_ModelElement (
	__IDDependency__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_importers_Package (
	__IDModelElement__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Classifier_features_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Package_importedElements_ModelElement (
	__IDPackage__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_contraints_Constraint (
	__IDModelElement__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE NameSpace_ownedElements_ModelElement (
	__IDNameSpace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Constraint_constrainedElements_ModelElement (
	__IDConstraint__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_clientDependencies_Dependency (
	__IDModelElement__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_supplierDependencies_Dependency (
	__IDModelElement__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Dependency_clients_ModelElement (
	__IDDependency__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;
