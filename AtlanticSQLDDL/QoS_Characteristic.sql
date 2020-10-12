CREATE TABLE QoSCharacteristic (
	__IDQoSCharacteristic__ Integer NOT NULL,
	FOREIGN KEY invariant (__FKinvariant__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	FOREIGN KEY parallel_and_composition (__FKparallel_and_composition__) REFERENCES MappingExpression (__IDMappingExpression__),
	FOREIGN KEY parallel_or_composition (__FKparallel_or_composition__) REFERENCES MappingExpression (__IDMappingExpression__),
	FOREIGN KEY sequential_composition (__FKsequential_composition__) REFERENCES MappingExpression (__IDMappingExpression__),
	FOREIGN KEY "values" (__FKvalues__) REFERENCES MappingExpression (__IDMappingExpression__),
	FOREIGN KEY parameter (__FKparameter__) REFERENCES Parameter (__IDParameter__),
	FOREIGN KEY domain (__FKdomain__) REFERENCES Domain (__IDDomain__),
	PRIMARY KEY QoSCharacteristic (__IDQoSCharacteristic__),
	__FKdomain__ Integer,
	__FKvalues__ Integer,
	__FKinvariant__ Integer,
	__FKparameter__ Integer,
	__FKparallel_or_composition__ Integer,
	__FKsequential_composition__ Integer,
	__FKparallel_and_composition__ Integer
) ;

CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	value text,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE MappingExpression (
	__IDMappingExpression__ Integer NOT NULL,
	value text,
	PRIMARY KEY MappingExpression (__IDMappingExpression__)
) ;

CREATE TABLE StatisticalAttributekindKind (
	__IDStatisticalAttributekindKind__ Integer NOT NULL,
	PRIMARY KEY StatisticalAttributekindKind (__IDStatisticalAttributekindKind__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Domain (
	__IDDomain__ Integer NOT NULL,
	FOREIGN KEY direction (__FKdirection__) REFERENCES DirectionKind (__IDDirectionKind__),
	PRIMARY KEY Domain (__IDDomain__),
	__FKdirection__ Integer
) ;

CREATE TABLE DirectionKind (
	__IDDirectionKind__ Integer NOT NULL,
	value text,
	PRIMARY KEY DirectionKind (__IDDirectionKind__)
) ;

CREATE TABLE "Numeric" (
	__IDNumeric__ Integer NOT NULL,
	PRIMARY KEY "Numeric" (__IDNumeric__)
) ;

CREATE TABLE "Set" (
	__IDSet__ Integer NOT NULL,
	PRIMARY KEY "Set" (__IDSet__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE StringSet (
	__IDStringSet__ Integer NOT NULL,
	PRIMARY KEY StringSet (__IDStringSet__)
) ;

CREATE TABLE QoSCharacteristic_statisticalAttribute_StatisticalAttributekindKind (
	__IDQoSCharacteristic__ Integer NOT NULL,
	__IDStatisticalAttributekindKind__ Integer NOT NULL
) ;

CREATE TABLE Set_stringSet_StringSet (
	__IDSet__ Integer NOT NULL,
	__IDStringSet__ Integer NOT NULL
) ;
