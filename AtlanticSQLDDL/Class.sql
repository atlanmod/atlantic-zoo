CREATE TABLE NamedElt (
	__IDNamedElt__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElt (__IDNamedElt__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isAbstract Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	multiValued Boolean,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY owner (__FKowner__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKowner__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Class_attr_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Class_super_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;
