CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	PRIMARY KEY Subsystem (__IDSubsystem__)
) ;

CREATE TABLE Relation (
	__IDRelation__ Integer NOT NULL,
	FOREIGN KEY subsystem (__FKsubsystem__) REFERENCES Subsystem (__IDSubsystem__),
	PRIMARY KEY Relation (__IDRelation__),
	__FKsubsystem__ Integer
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	is_deferred Boolean,
	FOREIGN KEY parentSubsystem (__FKparentSubsystem__) REFERENCES Subsystem (__IDSubsystem__),
	FOREIGN KEY subsystem (__FKsubsystem__) REFERENCES Subsystem (__IDSubsystem__),
	PRIMARY KEY Class (__IDClass__),
	__FKsubsystem__ Integer,
	__FKparentSubsystem__ Integer
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY theClass (__FKtheClass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Feature (__IDFeature__),
	__FKtype__ Integer,
	__FKtheClass__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	name text,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE Routine (
	__IDRoutine__ Integer NOT NULL,
	PRIMARY KEY Routine (__IDRoutine__)
) ;

CREATE TABLE Class_features_Feature (
	__IDClass__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Relation_classes_Class (
	__IDRelation__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Subsystem_relations_Relation (
	__IDSubsystem__ Integer NOT NULL,
	__IDRelation__ Integer NOT NULL
) ;

CREATE TABLE Class_relations_Relation (
	__IDClass__ Integer NOT NULL,
	__IDRelation__ Integer NOT NULL
) ;

CREATE TABLE Subsystem_classes_Class (
	__IDSubsystem__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;
