CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	PRIMARY KEY Activity (__IDActivity__)
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE Timepoint (
	__IDTimepoint__ Integer NOT NULL,
	PRIMARY KEY Timepoint (__IDTimepoint__)
) ;

CREATE TABLE Relation (
	__IDRelation__ Integer NOT NULL,
	PRIMARY KEY Relation (__IDRelation__)
) ;

CREATE TABLE Decision (
	__IDDecision__ Integer NOT NULL,
	PRIMARY KEY Decision (__IDDecision__)
) ;

CREATE TABLE Agent (
	__IDAgent__ Integer NOT NULL,
	PRIMARY KEY Agent (__IDAgent__)
) ;

CREATE TABLE Creates (
	__IDCreates__ Integer NOT NULL,
	PRIMARY KEY Creates (__IDCreates__)
) ;

CREATE TABLE "Modifies" (
	__IDModifies__ Integer NOT NULL,
	PRIMARY KEY "Modifies" (__IDModifies__)
) ;

CREATE TABLE "Before" (
	__IDBefore__ Integer NOT NULL,
	PRIMARY KEY "Before" (__IDBefore__)
) ;

CREATE TABLE Uses (
	__IDUses__ Integer NOT NULL,
	PRIMARY KEY Uses (__IDUses__)
) ;

CREATE TABLE Performs (
	__IDPerforms__ Integer NOT NULL,
	PRIMARY KEY Performs (__IDPerforms__)
) ;

CREATE TABLE ActivityStatus (
	__IDActivityStatus__ Integer NOT NULL,
	PRIMARY KEY ActivityStatus (__IDActivityStatus__)
) ;

CREATE TABLE Succesor (
	__IDSuccesor__ Integer NOT NULL,
	PRIMARY KEY Succesor (__IDSuccesor__)
) ;
