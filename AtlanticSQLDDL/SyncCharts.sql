CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE SyncChart (
	__IDSyncChart__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY SyncChart (__IDSyncChart__),
	__FKcontext__ Integer
) ;

CREATE TABLE ReferenceState (
	__IDReferenceState__ Integer NOT NULL,
	FOREIGN KEY subSyncChart (__FKsubSyncChart__) REFERENCES SyncChart (__IDSyncChart__),
	FOREIGN KEY containers (__FKcontainers__) REFERENCES Stg (__IDStg__),
	PRIMARY KEY ReferenceState (__IDReferenceState__),
	__FKcontainers__ Integer,
	__FKsubSyncChart__ Integer
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	isImmediate Boolean,
	priority Integer,
	FOREIGN KEY target (__FKtarget__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY source (__FKsource__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY stg (__FKstg__) REFERENCES Stg (__IDStg__),
	PRIMARY KEY Arc (__IDArc__),
	__FKstg__ Integer,
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE Vertex (
	__IDVertex__ Integer NOT NULL,
	PRIMARY KEY Vertex (__IDVertex__)
) ;

CREATE TABLE PseudoState (
	__IDPseudoState__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES PseudoStateKind (__IDPseudoStateKind__),
	PRIMARY KEY PseudoState (__IDPseudoState__),
	__FKkind__ Integer
) ;

CREATE TABLE PseudoStateKind (
	__IDPseudoStateKind__ Integer NOT NULL,
	PRIMARY KEY PseudoStateKind (__IDPseudoStateKind__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	isFinal Boolean,
	PRIMARY KEY State (__IDState__)
) ;

CREATE TABLE SimpleState (
	__IDSimpleState__ Integer NOT NULL,
	PRIMARY KEY SimpleState (__IDSimpleState__)
) ;

CREATE TABLE CompositeState (
	__IDCompositeState__ Integer NOT NULL,
	canTerminate Boolean,
	isSuspendable Boolean,
	PRIMARY KEY CompositeState (__IDCompositeState__)
) ;

CREATE TABLE Stg (
	__IDStg__ Integer NOT NULL,
	withFinal Boolean,
	FOREIGN KEY compositeState (__FKcompositeState__) REFERENCES CompositeState (__IDCompositeState__),
	PRIMARY KEY Stg (__IDStg__),
	__FKcompositeState__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES TransitionKind (__IDTransitionKind__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKkind__ Integer
) ;

CREATE TABLE TransitionKind (
	__IDTransitionKind__ Integer NOT NULL,
	PRIMARY KEY TransitionKind (__IDTransitionKind__)
) ;

CREATE TABLE PseudoTransition (
	__IDPseudoTransition__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES PseudoTransitionKind (__IDPseudoTransitionKind__),
	PRIMARY KEY PseudoTransition (__IDPseudoTransition__),
	__FKkind__ Integer
) ;

CREATE TABLE PseudoTransitionKind (
	__IDPseudoTransitionKind__ Integer NOT NULL,
	PRIMARY KEY PseudoTransitionKind (__IDPseudoTransitionKind__)
) ;

CREATE TABLE Vertex_outcoming_Arc (
	__IDVertex__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE Stg_arc_Arc (
	__IDStg__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE SyncChart_referenceState_ReferenceState (
	__IDSyncChart__ Integer NOT NULL,
	__IDReferenceState__ Integer NOT NULL
) ;

CREATE TABLE Stg_referenceState_ReferenceState (
	__IDStg__ Integer NOT NULL,
	__IDReferenceState__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_behavior_SyncChart (
	__IDModelElement__ Integer NOT NULL,
	__IDSyncChart__ Integer NOT NULL
) ;

CREATE TABLE Vertex_incoming_Arc (
	__IDVertex__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE CompositeState_stg_Stg (
	__IDCompositeState__ Integer NOT NULL,
	__IDStg__ Integer NOT NULL
) ;
