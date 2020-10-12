CREATE TABLE Trace (
	__IDTrace__ Integer NOT NULL,
	name text,
	PRIMARY KEY Trace (__IDTrace__)
) ;

CREATE TABLE Level (
	__IDLevel__ Integer NOT NULL,
	FOREIGN KEY trace (__FKtrace__) REFERENCES Trace (__IDTrace__),
	PRIMARY KEY Level (__IDLevel__),
	__FKtrace__ Integer
) ;

CREATE TABLE "Call" (
	__IDCall__ Integer NOT NULL,
	FOREIGN KEY level (__FKlevel__) REFERENCES Level (__IDLevel__),
	methodName text,
	DBAccessesNumber Integer,
	DBRowsNumber Integer,
	CPUTime Integer,
	PRIMARY KEY "Call" (__IDCall__),
	__FKlevel__ Integer
) ;

CREATE TABLE "Index" (
	__IDIndex__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY "Index" (__IDIndex__)
) ;

CREATE TABLE Trace_levels_Level (
	__IDTrace__ Integer NOT NULL,
	__IDLevel__ Integer NOT NULL
) ;

CREATE TABLE Level_calls_Call (
	__IDLevel__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE Call_indexes_Index (
	__IDCall__ Integer NOT NULL,
	__IDIndex__ Integer NOT NULL
) ;
