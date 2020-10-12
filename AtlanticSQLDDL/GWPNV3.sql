CREATE TABLE Place (
	__IDPlace__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES Net (__IDNet__),
	PRIMARY KEY Place (__IDPlace__),
	__FKnet__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES Net (__IDNet__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKnet__ Integer
) ;

CREATE TABLE Net (
	__IDNet__ Integer NOT NULL,
	PRIMARY KEY Net (__IDNet__)
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	PRIMARY KEY Arc (__IDArc__)
) ;

CREATE TABLE PTArc (
	__IDPTArc__ Integer NOT NULL,
	FOREIGN KEY dst (__FKdst__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY src (__FKsrc__) REFERENCES Place (__IDPlace__),
	PRIMARY KEY PTArc (__IDPTArc__),
	__FKdst__ Integer,
	__FKsrc__ Integer
) ;

CREATE TABLE TPArc (
	__IDTPArc__ Integer NOT NULL,
	FOREIGN KEY src (__FKsrc__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY dst (__FKdst__) REFERENCES Place (__IDPlace__),
	PRIMARY KEY TPArc (__IDTPArc__),
	__FKsrc__ Integer,
	__FKdst__ Integer
) ;

CREATE TABLE Place_out_PTArc (
	__IDPlace__ Integer NOT NULL,
	__IDPTArc__ Integer NOT NULL
) ;

CREATE TABLE Place_in_TPArc (
	__IDPlace__ Integer NOT NULL,
	__IDTPArc__ Integer NOT NULL
) ;

CREATE TABLE Transition_in_PTArc (
	__IDTransition__ Integer NOT NULL,
	__IDPTArc__ Integer NOT NULL
) ;

CREATE TABLE Transition_out_TPArc (
	__IDTransition__ Integer NOT NULL,
	__IDTPArc__ Integer NOT NULL
) ;

CREATE TABLE Net_place_Place (
	__IDNet__ Integer NOT NULL,
	__IDPlace__ Integer NOT NULL
) ;

CREATE TABLE Net_transition_Transition (
	__IDNet__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
