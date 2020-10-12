CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	value text,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	PRIMARY KEY StateMachine (__IDStateMachine__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY state_container (__FKstate_container__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY State (__IDState__),
	__FKstate_container__ Integer
) ;

CREATE TABLE CompositeState (
	__IDCompositeState__ Integer NOT NULL,
	isConcurrent Boolean,
	PRIMARY KEY CompositeState (__IDCompositeState__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY transSM_container (__FKtransSM_container__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY transS_container (__FKtransS_container__) REFERENCES State (__IDState__),
	FOREIGN KEY "trigger" (__FKtrigger__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY guard (__FKguard__) REFERENCES Guard (__IDGuard__),
	FOREIGN KEY source (__FKsource__) REFERENCES StateVertex (__IDStateVertex__),
	FOREIGN KEY target (__FKtarget__) REFERENCES StateVertex (__IDStateVertex__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKsource__ Integer,
	__FKtarget__ Integer,
	__FKtransS_container__ Integer,
	__FKtrigger__ Integer,
	__FKtransSM_container__ Integer,
	__FKguard__ Integer
) ;

CREATE TABLE StateVertex (
	__IDStateVertex__ Integer NOT NULL,
	FOREIGN KEY sv_container (__FKsv_container__) REFERENCES CompositeState (__IDCompositeState__),
	PRIMARY KEY StateVertex (__IDStateVertex__),
	__FKsv_container__ Integer
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	FOREIGN KEY gua_container (__FKgua_container__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY Guard (__IDGuard__),
	__FKgua_container__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE CompositeState_subVertexes_StateVertex (
	__IDCompositeState__ Integer NOT NULL,
	__IDStateVertex__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_top_State (
	__IDStateMachine__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE Event_targets_State (
	__IDEvent__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE State_deferrableEvents_Event (
	__IDState__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_incoming_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE State_internalTransitions_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_outgoing_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Event_evt_container_Transition (
	__IDEvent__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_transitions_Transition (
	__IDStateMachine__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
