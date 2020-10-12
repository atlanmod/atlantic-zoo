CREATE TABLE PreCondition (
	__IDPreCondition__ Integer NOT NULL,
	PRIMARY KEY PreCondition (__IDPreCondition__)
) ;

CREATE TABLE PortCondition (
	__IDPortCondition__ Integer NOT NULL,
	PRIMARY KEY PortCondition (__IDPortCondition__)
) ;

CREATE TABLE Invariant (
	__IDInvariant__ Integer NOT NULL,
	PRIMARY KEY Invariant (__IDInvariant__)
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	PRIMARY KEY Guard (__IDGuard__)
) ;
