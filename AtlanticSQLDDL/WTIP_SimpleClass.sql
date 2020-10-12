CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	name text,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	is_persistent Boolean,
	FOREIGN KEY parent (__FKparent__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Class (__IDClass__),
	__FKparent__ Integer
) ;

CREATE TABLE PrimitiveDataType (
	__IDPrimitiveDataType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveDataType (__IDPrimitiveDataType__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	name text,
	FOREIGN KEY src (__FKsrc__) REFERENCES Class (__IDClass__),
	FOREIGN KEY dest (__FKdest__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Association (__IDAssociation__),
	__FKsrc__ Integer,
	__FKdest__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	name text,
	is_primary Boolean,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKtype__ Integer
) ;

CREATE TABLE Class_attrs_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;
