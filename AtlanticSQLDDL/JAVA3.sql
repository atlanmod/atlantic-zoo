CREATE TABLE Modifier (
	__IDModifier__ Integer NOT NULL,
	visibility text,
	state text,
	name text,
	PRIMARY KEY Modifier (__IDModifier__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	FOREIGN KEY superClass (__FKsuperClass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Class (__IDClass__),
	__FKsuperClass__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	share Boolean,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY interface (__FKinterface__) REFERENCES Interface (__IDInterface__),
	FOREIGN KEY resultOf (__FKresultOf__) REFERENCES Type (__IDType__),
	PRIMARY KEY Method (__IDMethod__),
	__FKresultOf__ Integer,
	__FKinterface__ Integer,
	__FKclass__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	share Boolean,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY interface (__FKinterface__) REFERENCES Interface (__IDInterface__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Value (__IDValue__),
	FOREIGN KEY typeOf (__FKtypeOf__) REFERENCES Type (__IDType__),
	PRIMARY KEY Field (__IDField__),
	__FKvalue__ Integer,
	__FKtypeOf__ Integer,
	__FKinterface__ Integer,
	__FKclass__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	FOREIGN KEY typeOf (__FKtypeOf__) REFERENCES Type (__IDType__),
	FOREIGN KEY owner (__FKowner__) REFERENCES Method (__IDMethod__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKtypeOf__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE ReferenceType (
	__IDReferenceType__ Integer NOT NULL,
	FOREIGN KEY reference (__FKreference__) REFERENCES Class (__IDClass__),
	PRIMARY KEY ReferenceType (__IDReferenceType__),
	__FKreference__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE "Int" (
	__IDInt__ Integer NOT NULL,
	PRIMARY KEY "Int" (__IDInt__)
) ;

CREATE TABLE Class_fields_Field (
	__IDClass__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;

CREATE TABLE Interface_constants_Field (
	__IDInterface__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;

CREATE TABLE Interface_superInterface_Interface (
	__IDInterface__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Interface_implementedBy_Class (
	__IDInterface__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_implement_Interface (
	__IDClass__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Class_methods_Method (
	__IDClass__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;

CREATE TABLE Interface_abstractMethods_Method (
	__IDInterface__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;

CREATE TABLE Method_parameters_Parameter (
	__IDMethod__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;
