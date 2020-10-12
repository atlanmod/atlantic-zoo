CREATE TABLE TextualPathExp (
	__IDTextualPathExp__ Integer NOT NULL,
	FOREIGN KEY path (__FKpath__) REFERENCES Path (__IDPath__),
	PRIMARY KEY TextualPathExp (__IDTextualPathExp__),
	__FKpath__ Integer
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	PRIMARY KEY Path (__IDPath__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	isMultiple Boolean,
	PRIMARY KEY Transition (__IDTransition__)
) ;

CREATE TABLE AlternativeTrans (
	__IDAlternativeTrans__ Integer NOT NULL,
	PRIMARY KEY AlternativeTrans (__IDAlternativeTrans__)
) ;

CREATE TABLE PrimitiveTrans (
	__IDPrimitiveTrans__ Integer NOT NULL,
	name text,
	PRIMARY KEY PrimitiveTrans (__IDPrimitiveTrans__)
) ;

CREATE TABLE Path_transitions_Transition (
	__IDPath__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE AlternativeTrans_altPaths_Path (
	__IDAlternativeTrans__ Integer NOT NULL,
	__IDPath__ Integer NOT NULL
) ;
