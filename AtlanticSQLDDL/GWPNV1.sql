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

CREATE TABLE Place_src_Transition (
	__IDPlace__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Place_dst_Transition (
	__IDPlace__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Transition_src_Place (
	__IDTransition__ Integer NOT NULL,
	__IDPlace__ Integer NOT NULL
) ;

CREATE TABLE Transition_dst_Place (
	__IDTransition__ Integer NOT NULL,
	__IDPlace__ Integer NOT NULL
) ;

CREATE TABLE Net_place_Place (
	__IDNet__ Integer NOT NULL,
	__IDPlace__ Integer NOT NULL
) ;

CREATE TABLE Net_transition_Transition (
	__IDNet__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
