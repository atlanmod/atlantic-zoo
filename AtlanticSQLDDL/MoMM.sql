CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	level Integer,
	name text,
	potency text,
	FOREIGN KEY hasClass (__FKhasClass__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY elementTarget (__FKelementTarget__) REFERENCES Relationship (__IDRelationship__),
	FOREIGN KEY elementSource (__FKelementSource__) REFERENCES Relationship (__IDRelationship__),
	FOREIGN KEY attType (__FKattType__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKattType__ Integer,
	__FKelementSource__ Integer,
	__FKelementTarget__ Integer,
	__FKhasClass__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKtype__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY source (__FKsource__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY Relationship (__IDRelationship__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	PRIMARY KEY Generalization (__IDGeneralization__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	maxSource text,
	maxTarget text,
	minSource text,
	minTarget text,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE ModelElement_attributes_Attribute (
	__IDModelElement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_classElement_ModelElement (
	__IDModelElement__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;
