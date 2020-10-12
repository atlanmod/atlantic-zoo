CREATE TABLE QoSComponent (
	__IDQoSComponent__ Integer NOT NULL,
	FOREIGN KEY operations (__FKoperations__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY QoSComponent (__IDQoSComponent__),
	__FKoperations__ Integer
) ;

CREATE TABLE QoSProfile (
	__IDQoSProfile__ Integer NOT NULL,
	FOREIGN KEY "for" (__FKfor__) REFERENCES QoSComponent (__IDQoSComponent__),
	PRIMARY KEY QoSProfile (__IDQoSProfile__),
	__FKfor__ Integer
) ;

CREATE TABLE QoSContraints (
	__IDQoSContraints__ Integer NOT NULL,
	PRIMARY KEY QoSContraints (__IDQoSContraints__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE CompoundProfile (
	__IDCompoundProfile__ Integer NOT NULL,
	PRIMARY KEY CompoundProfile (__IDCompoundProfile__)
) ;

CREATE TABLE SimpleProfile (
	__IDSimpleProfile__ Integer NOT NULL,
	FOREIGN KEY compoundProfile (__FKcompoundProfile__) REFERENCES CompoundProfile (__IDCompoundProfile__),
	FOREIGN KEY "use" (__FKuse__) REFERENCES QoSStatement (__IDQoSStatement__),
	FOREIGN KEY provides (__FKprovides__) REFERENCES QoSStatement (__IDQoSStatement__),
	PRIMARY KEY SimpleProfile (__IDSimpleProfile__),
	__FKprovides__ Integer,
	__FKuse__ Integer,
	__FKcompoundProfile__ Integer
) ;

CREATE TABLE ProfileTransition (
	__IDProfileTransition__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES SimpleProfile (__IDSimpleProfile__),
	FOREIGN KEY "to" (__FKto__) REFERENCES SimpleProfile (__IDSimpleProfile__),
	FOREIGN KEY compoundProfile (__FKcompoundProfile__) REFERENCES CompoundProfile (__IDCompoundProfile__),
	PRIMARY KEY ProfileTransition (__IDProfileTransition__),
	__FKto__ Integer,
	__FKfrom__ Integer,
	__FKcompoundProfile__ Integer
) ;

CREATE TABLE QoSStatement (
	__IDQoSStatement__ Integer NOT NULL,
	FOREIGN KEY relation (__FKrelation__) REFERENCES CoumpoundQoSStatement (__IDCoumpoundQoSStatement__),
	PRIMARY KEY QoSStatement (__IDQoSStatement__),
	__FKrelation__ Integer
) ;

CREATE TABLE SingleQoSStatement (
	__IDSingleQoSStatement__ Integer NOT NULL,
	FOREIGN KEY contraint (__FKcontraint__) REFERENCES QoSContraint (__IDQoSContraint__),
	PRIMARY KEY SingleQoSStatement (__IDSingleQoSStatement__),
	__FKcontraint__ Integer
) ;

CREATE TABLE CoumpoundQoSStatement (
	__IDCoumpoundQoSStatement__ Integer NOT NULL,
	PRIMARY KEY CoumpoundQoSStatement (__IDCoumpoundQoSStatement__)
) ;

CREATE TABLE QoSContraint (
	__IDQoSContraint__ Integer NOT NULL,
	FOREIGN KEY qualification (__FKqualification__) REFERENCES QualificationKind (__IDQualificationKind__),
	PRIMARY KEY QoSContraint (__IDQoSContraint__),
	__FKqualification__ Integer
) ;

CREATE TABLE QualificationKind (
	__IDQualificationKind__ Integer NOT NULL,
	value text,
	PRIMARY KEY QualificationKind (__IDQualificationKind__)
) ;

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
	__FKparallel_and_composition__ Integer,
	__FKvalues__ Integer,
	__FKparameter__ Integer,
	__FKinvariant__ Integer,
	__FKdomain__ Integer,
	__FKsequential_composition__ Integer,
	__FKparallel_or_composition__ Integer
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

CREATE TABLE ProfileTransition_operations_Operation (
	__IDProfileTransition__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE QoSStatement_parameter_Parameter (
	__IDQoSStatement__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE QoSStatement_contraints_QoSContraints (
	__IDQoSStatement__ Integer NOT NULL,
	__IDQoSContraints__ Integer NOT NULL
) ;

CREATE TABLE CoumpoundQoSStatement_statement_QoSStatement (
	__IDCoumpoundQoSStatement__ Integer NOT NULL,
	__IDQoSStatement__ Integer NOT NULL
) ;

CREATE TABLE CompoundProfile_profileTransition_ProfileTransition (
	__IDCompoundProfile__ Integer NOT NULL,
	__IDProfileTransition__ Integer NOT NULL
) ;

CREATE TABLE QoSProfile_provide_QoSStatement (
	__IDQoSProfile__ Integer NOT NULL,
	__IDQoSStatement__ Integer NOT NULL
) ;

CREATE TABLE Set_stringSet_StringSet (
	__IDSet__ Integer NOT NULL,
	__IDStringSet__ Integer NOT NULL
) ;

CREATE TABLE QoSCharacteristic_statisticalAttribute_StatisticalAttributekindKind (
	__IDQoSCharacteristic__ Integer NOT NULL,
	__IDStatisticalAttributekindKind__ Integer NOT NULL
) ;

CREATE TABLE QoSProfile_uses_QoSStatement (
	__IDQoSProfile__ Integer NOT NULL,
	__IDQoSStatement__ Integer NOT NULL
) ;

CREATE TABLE CompoundProfile_simpleProfile_SimpleProfile (
	__IDCompoundProfile__ Integer NOT NULL,
	__IDSimpleProfile__ Integer NOT NULL
) ;

CREATE TABLE QoSComponent_profile_QoSProfile (
	__IDQoSComponent__ Integer NOT NULL,
	__IDQoSProfile__ Integer NOT NULL
) ;
