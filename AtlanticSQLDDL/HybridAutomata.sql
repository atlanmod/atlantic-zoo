CREATE TABLE FiniteTransition (
	__IDFiniteTransition__ Integer NOT NULL,
	"trigger" text,
	guard text,
	action text,
	PRIMARY KEY FiniteTransition (__IDFiniteTransition__)
) ;

CREATE TABLE FiniteState (
	__IDFiniteState__ Integer NOT NULL,
	name text,
	position text,
	isInit Boolean,
	PRIMARY KEY FiniteState (__IDFiniteState__)
) ;
