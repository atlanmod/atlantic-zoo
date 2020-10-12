CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE PetriNet (
	__IDPetriNet__ Integer NOT NULL,
	PRIMARY KEY PetriNet (__IDPetriNet__)
) ;

CREATE TABLE Place (
	__IDPlace__ Integer NOT NULL,
	PRIMARY KEY Place (__IDPlace__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	PRIMARY KEY Transition (__IDTransition__)
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	weight Integer,
	PRIMARY KEY Arc (__IDArc__)
) ;

CREATE TABLE PlaceToTransArc (
	__IDPlaceToTransArc__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Place (__IDPlace__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY PlaceToTransArc (__IDPlaceToTransArc__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE TransToPlaceArc (
	__IDTransToPlaceArc__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Place (__IDPlace__),
	PRIMARY KEY TransToPlaceArc (__IDTransToPlaceArc__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE PetriNet_places_Place (
	__IDPetriNet__ Integer NOT NULL,
	__IDPlace__ Integer NOT NULL
) ;

CREATE TABLE PetriNet_transitions_Transition (
	__IDPetriNet__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Transition_outgoing_TransToPlaceArc (
	__IDTransition__ Integer NOT NULL,
	__IDTransToPlaceArc__ Integer NOT NULL
) ;

CREATE TABLE Place_incoming_TransToPlaceArc (
	__IDPlace__ Integer NOT NULL,
	__IDTransToPlaceArc__ Integer NOT NULL
) ;

CREATE TABLE PetriNet_arcs_Arc (
	__IDPetriNet__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE Transition_incoming_PlaceToTransArc (
	__IDTransition__ Integer NOT NULL,
	__IDPlaceToTransArc__ Integer NOT NULL
) ;

CREATE TABLE Place_outgoing_PlaceToTransArc (
	__IDPlace__ Integer NOT NULL,
	__IDPlaceToTransArc__ Integer NOT NULL
) ;
