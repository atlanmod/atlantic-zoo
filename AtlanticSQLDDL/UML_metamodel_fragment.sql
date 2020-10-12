CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES Generalization (__IDGeneralization__),
	FOREIGN KEY child (__FKchild__) REFERENCES Generalization (__IDGeneralization__),
	FOREIGN KEY dependency (__FKdependency__) REFERENCES Dependency (__IDDependency__),
	PRIMARY KEY Class (__IDClass__),
	__FKparent__ Integer,
	__FKchild__ Integer,
	__FKdependency__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	PRIMARY KEY Generalization (__IDGeneralization__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	FOREIGN KEY supplier (__FKsupplier__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY client (__FKclient__) REFERENCES Class (__IDClass__),
	FOREIGN KEY stereotype (__FKstereotype__) REFERENCES Stereotype (__IDStereotype__),
	PRIMARY KEY Dependency (__IDDependency__),
	__FKsupplier__ Integer,
	__FKstereotype__ Integer,
	__FKclient__ Integer
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	baseClass text,
	FOREIGN KEY extendedElement (__FKextendedElement__) REFERENCES Dependency (__IDDependency__),
	PRIMARY KEY Stereotype (__IDStereotype__),
	__FKextendedElement__ Integer
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Class (__IDClass__),
	FOREIGN KEY top (__FKtop__) REFERENCES State (__IDState__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKtop__ Integer,
	__FKcontext__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY internal (__FKinternal__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY State (__IDState__),
	__FKinternal__ Integer,
	__FKstateMachine__ Integer
) ;

CREATE TABLE CompositeState (
	__IDCompositeState__ Integer NOT NULL,
	FOREIGN KEY subvertex (__FKsubvertex__) REFERENCES StateVertex (__IDStateVertex__),
	PRIMARY KEY CompositeState (__IDCompositeState__),
	__FKsubvertex__ Integer
) ;

CREATE TABLE SimpleState (
	__IDSimpleState__ Integer NOT NULL,
	PRIMARY KEY SimpleState (__IDSimpleState__)
) ;

CREATE TABLE FinalState (
	__IDFinalState__ Integer NOT NULL,
	PRIMARY KEY FinalState (__IDFinalState__)
) ;

CREATE TABLE StateVertex (
	__IDStateVertex__ Integer NOT NULL,
	FOREIGN KEY compositeState (__FKcompositeState__) REFERENCES CompositeState (__IDCompositeState__),
	PRIMARY KEY StateVertex (__IDStateVertex__),
	__FKcompositeState__ Integer
) ;

CREATE TABLE PseudoState (
	__IDPseudoState__ Integer NOT NULL,
	PRIMARY KEY PseudoState (__IDPseudoState__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY "trigger" (__FKtrigger__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY source (__FKsource__) REFERENCES StateVertex (__IDStateVertex__),
	FOREIGN KEY target (__FKtarget__) REFERENCES StateVertex (__IDStateVertex__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKtrigger__ Integer,
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;
