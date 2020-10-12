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

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
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
	PRIMARY KEY QoSCharacteristic (__IDQoSCharacteristic__)
) ;

CREATE TABLE QoSStatement_parameter_Parameter (
	__IDQoSStatement__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE CoumpoundQoSStatement_statement_QoSStatement (
	__IDCoumpoundQoSStatement__ Integer NOT NULL,
	__IDQoSStatement__ Integer NOT NULL
) ;
