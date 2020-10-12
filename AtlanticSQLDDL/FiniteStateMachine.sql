CREATE TABLE MgaObject (
	__IDMgaObject__ Integer NOT NULL,
	name text,
	position text,
	PRIMARY KEY MgaObject (__IDMgaObject__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY associationStateState (__FKassociationStateState__) REFERENCES AssociationStateState (__IDAssociationStateState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKassociationStateState__ Integer,
	__FKstateMachine__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY State (__IDState__),
	__FKstateMachine__ Integer
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY rootFolder (__FKrootFolder__) REFERENCES RootFolder (__IDRootFolder__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKrootFolder__ Integer
) ;

CREATE TABLE RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	name text,
	PRIMARY KEY RootFolder (__IDRootFolder__)
) ;

CREATE TABLE AssociationStateState (
	__IDAssociationStateState__ Integer NOT NULL,
	FOREIGN KEY transition (__FKtransition__) REFERENCES Transition (__IDTransition__),
	PRIMARY KEY AssociationStateState (__IDAssociationStateState__),
	__FKtransition__ Integer
) ;

CREATE TABLE AssociationStateState_dstTransition_State (
	__IDAssociationStateState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE AssociationStateState_srcTransition_State (
	__IDAssociationStateState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_state_State (
	__IDStateMachine__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_rootFolders_RootFolder (
	__IDRootFolder__ Integer NOT NULL,
	__IDRootFolder__ Integer NOT NULL
) ;

CREATE TABLE State_associationStateStatesrc_AssociationStateState (
	__IDState__ Integer NOT NULL,
	__IDAssociationStateState__ Integer NOT NULL
) ;

CREATE TABLE State_associationStateStatedst_AssociationStateState (
	__IDState__ Integer NOT NULL,
	__IDAssociationStateState__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_transition_Transition (
	__IDStateMachine__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE RootFolder_stateMachine_StateMachine (
	__IDRootFolder__ Integer NOT NULL,
	__IDStateMachine__ Integer NOT NULL
) ;
