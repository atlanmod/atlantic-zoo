CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE PetriNet (
	__IDPetriNet__ Integer NOT NULL,
	PRIMARY KEY PetriNet (__IDPetriNet__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES PetriNet (__IDPetriNet__),
	PRIMARY KEY Element (__IDElement__),
	__FKnet__ Integer
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
	FOREIGN KEY net (__FKnet__) REFERENCES PetriNet (__IDPetriNet__),
	PRIMARY KEY Arc (__IDArc__),
	__FKnet__ Integer
) ;

CREATE TABLE PlaceToTransition (
	__IDPlaceToTransition__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Place (__IDPlace__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY PlaceToTransition (__IDPlaceToTransition__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE TransitionToPlace (
	__IDTransitionToPlace__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Place (__IDPlace__),
	PRIMARY KEY TransitionToPlace (__IDTransitionToPlace__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Execution (
	__IDExecution__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES PetriNet (__IDPetriNet__),
	PRIMARY KEY Execution (__IDExecution__),
	__FKnet__ Integer
) ;

CREATE TABLE Token (
	__IDToken__ Integer NOT NULL,
	FOREIGN KEY placedAt (__FKplacedAt__) REFERENCES Place (__IDPlace__),
	FOREIGN KEY marking (__FKmarking__) REFERENCES Marking (__IDMarking__),
	PRIMARY KEY Token (__IDToken__),
	__FKplacedAt__ Integer,
	__FKmarking__ Integer
) ;

CREATE TABLE Marking (
	__IDMarking__ Integer NOT NULL,
	FOREIGN KEY exec (__FKexec__) REFERENCES Execution (__IDExecution__),
	PRIMARY KEY Marking (__IDMarking__),
	__FKexec__ Integer
) ;

CREATE TABLE Movement (
	__IDMovement__ Integer NOT NULL,
	FOREIGN KEY exec (__FKexec__) REFERENCES Execution (__IDExecution__),
	FOREIGN KEY fire (__FKfire__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY source (__FKsource__) REFERENCES Marking (__IDMarking__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Marking (__IDMarking__),
	PRIMARY KEY Movement (__IDMovement__),
	__FKfire__ Integer,
	__FKsource__ Integer,
	__FKexec__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Execution_markings_Marking (
	__IDExecution__ Integer NOT NULL,
	__IDMarking__ Integer NOT NULL
) ;

CREATE TABLE Place_incomingArc_TransitionToPlace (
	__IDPlace__ Integer NOT NULL,
	__IDTransitionToPlace__ Integer NOT NULL
) ;

CREATE TABLE PetriNet_execs_Execution (
	__IDPetriNet__ Integer NOT NULL,
	__IDExecution__ Integer NOT NULL
) ;

CREATE TABLE Execution_movements_Movement (
	__IDExecution__ Integer NOT NULL,
	__IDMovement__ Integer NOT NULL
) ;

CREATE TABLE Transition_outgoingArc_TransitionToPlace (
	__IDTransition__ Integer NOT NULL,
	__IDTransitionToPlace__ Integer NOT NULL
) ;

CREATE TABLE PetriNet_elements_Element (
	__IDPetriNet__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Transition_incomingArc_PlaceToTransition (
	__IDTransition__ Integer NOT NULL,
	__IDPlaceToTransition__ Integer NOT NULL
) ;

CREATE TABLE Place_outgoingArc_PlaceToTransition (
	__IDPlace__ Integer NOT NULL,
	__IDPlaceToTransition__ Integer NOT NULL
) ;

CREATE TABLE Marking_tokens_Token (
	__IDMarking__ Integer NOT NULL,
	__IDToken__ Integer NOT NULL
) ;

CREATE TABLE PetriNet_arcs_Arc (
	__IDPetriNet__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;
