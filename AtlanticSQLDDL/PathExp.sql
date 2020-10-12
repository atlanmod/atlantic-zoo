CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE PathExp (
	__IDPathExp__ Integer NOT NULL,
	PRIMARY KEY PathExp (__IDPathExp__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	PRIMARY KEY State (__IDState__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES State (__IDState__),
	FOREIGN KEY target (__FKtarget__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE State_incoming_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE PathExp_states_State (
	__IDPathExp__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE State_outgoing_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE PathExp_transitions_Transition (
	__IDPathExp__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
