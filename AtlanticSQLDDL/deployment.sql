CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	name text,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Device (
	__IDDevice__ Integer NOT NULL,
	PRIMARY KEY Device (__IDDevice__)
) ;

CREATE TABLE ExecutionEnvironment (
	__IDExecutionEnvironment__ Integer NOT NULL,
	PRIMARY KEY ExecutionEnvironment (__IDExecutionEnvironment__)
) ;

CREATE TABLE Specification (
	__IDSpecification__ Integer NOT NULL,
	PRIMARY KEY Specification (__IDSpecification__)
) ;

CREATE TABLE CommunicationLink (
	__IDCommunicationLink__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Node (__IDNode__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Node (__IDNode__),
	name text,
	PRIMARY KEY CommunicationLink (__IDCommunicationLink__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Node_nestedNode_Node (
	__IDNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Specification_ownedNode_Node (
	__IDSpecification__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Specification_ownedCommunicationLink_CommunicationLink (
	__IDSpecification__ Integer NOT NULL,
	__IDCommunicationLink__ Integer NOT NULL
) ;
