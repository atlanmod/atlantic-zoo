CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE BasicType (
	__IDBasicType__ Integer NOT NULL,
	PRIMARY KEY BasicType (__IDBasicType__)
) ;

CREATE TABLE InstanceType (
	__IDInstanceType__ Integer NOT NULL,
	FOREIGN KEY classifier (__FKclassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY InstanceType (__IDInstanceType__),
	__FKclassifier__ Integer
) ;

CREATE TABLE EnumType (
	__IDEnumType__ Integer NOT NULL,
	PRIMARY KEY EnumType (__IDEnumType__)
) ;

CREATE TABLE OclAnyType (
	__IDOclAnyType__ Integer NOT NULL,
	PRIMARY KEY OclAnyType (__IDOclAnyType__)
) ;

CREATE TABLE OclTypeType (
	__IDOclTypeType__ Integer NOT NULL,
	PRIMARY KEY OclTypeType (__IDOclTypeType__)
) ;

CREATE TABLE CollectionType (
	__IDCollectionType__ Integer NOT NULL,
	FOREIGN KEY elementType (__FKelementType__) REFERENCES Type (__IDType__),
	PRIMARY KEY CollectionType (__IDCollectionType__),
	__FKelementType__ Integer
) ;

CREATE TABLE IntegerType (
	__IDIntegerType__ Integer NOT NULL,
	PRIMARY KEY IntegerType (__IDIntegerType__)
) ;

CREATE TABLE RealType (
	__IDRealType__ Integer NOT NULL,
	PRIMARY KEY RealType (__IDRealType__)
) ;

CREATE TABLE StringType (
	__IDStringType__ Integer NOT NULL,
	PRIMARY KEY StringType (__IDStringType__)
) ;

CREATE TABLE BooleanType (
	__IDBooleanType__ Integer NOT NULL,
	PRIMARY KEY BooleanType (__IDBooleanType__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	FOREIGN KEY instanceType (__FKinstanceType__) REFERENCES InstanceType (__IDInstanceType__),
	PRIMARY KEY Classifier (__IDClassifier__),
	__FKinstanceType__ Integer
) ;

CREATE TABLE EnumLiteral (
	__IDEnumLiteral__ Integer NOT NULL,
	FOREIGN KEY enumType (__FKenumType__) REFERENCES EnumType (__IDEnumType__),
	PRIMARY KEY EnumLiteral (__IDEnumLiteral__),
	__FKenumType__ Integer
) ;

CREATE TABLE SetType (
	__IDSetType__ Integer NOT NULL,
	PRIMARY KEY SetType (__IDSetType__)
) ;

CREATE TABLE SequenceType (
	__IDSequenceType__ Integer NOT NULL,
	PRIMARY KEY SequenceType (__IDSequenceType__)
) ;

CREATE TABLE BagType (
	__IDBagType__ Integer NOT NULL,
	PRIMARY KEY BagType (__IDBagType__)
) ;

CREATE TABLE Type_supertype_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_collectionType_CollectionType (
	__IDType__ Integer NOT NULL,
	__IDCollectionType__ Integer NOT NULL
) ;

CREATE TABLE EnumType_enumLiteral_EnumLiteral (
	__IDEnumType__ Integer NOT NULL,
	__IDEnumLiteral__ Integer NOT NULL
) ;

CREATE TABLE Type_subtype_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;
