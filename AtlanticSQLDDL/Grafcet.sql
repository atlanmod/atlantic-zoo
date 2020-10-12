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

CREATE TABLE Grafcet (
	__IDGrafcet__ Integer NOT NULL,
	PRIMARY KEY Grafcet (__IDGrafcet__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY grafcet (__FKgrafcet__) REFERENCES Grafcet (__IDGrafcet__),
	PRIMARY KEY Element (__IDElement__),
	__FKgrafcet__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	isInitial Boolean,
	isActive Boolean,
	action text,
	PRIMARY KEY Step (__IDStep__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	"condition" text,
	PRIMARY KEY Transition (__IDTransition__)
) ;

CREATE TABLE "Connection" (
	__IDConnection__ Integer NOT NULL,
	FOREIGN KEY grafcet (__FKgrafcet__) REFERENCES Grafcet (__IDGrafcet__),
	PRIMARY KEY "Connection" (__IDConnection__),
	__FKgrafcet__ Integer
) ;

CREATE TABLE StepToTransition (
	__IDStepToTransition__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Step (__IDStep__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY StepToTransition (__IDStepToTransition__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE TransitionToStep (
	__IDTransitionToStep__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Step (__IDStep__),
	PRIMARY KEY TransitionToStep (__IDTransitionToStep__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Grafcet_connections_Connection (
	__IDGrafcet__ Integer NOT NULL,
	__IDConnection__ Integer NOT NULL
) ;

CREATE TABLE Step_incomingConnections_TransitionToStep (
	__IDStep__ Integer NOT NULL,
	__IDTransitionToStep__ Integer NOT NULL
) ;

CREATE TABLE Transition_outgoingConnections_TransitionToStep (
	__IDTransition__ Integer NOT NULL,
	__IDTransitionToStep__ Integer NOT NULL
) ;

CREATE TABLE Transition_incomingConnections_StepToTransition (
	__IDTransition__ Integer NOT NULL,
	__IDStepToTransition__ Integer NOT NULL
) ;

CREATE TABLE Step_outgoingConnections_StepToTransition (
	__IDStep__ Integer NOT NULL,
	__IDStepToTransition__ Integer NOT NULL
) ;

CREATE TABLE Grafcet_elements_Element (
	__IDGrafcet__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;
