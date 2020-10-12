CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	name text,
	isStart Boolean,
	isEnd Boolean,
	isFail Boolean,
	PRIMARY KEY State (__IDState__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES State (__IDState__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKstate__ Integer
) ;

CREATE TABLE State_formalParam_Parameter (
	__IDState__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE State_outGoing_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE State_incoming_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
