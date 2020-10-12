CREATE TABLE ControllerAttribute (
	__IDControllerAttribute__ Integer NOT NULL,
	FOREIGN KEY controller (__FKcontroller__) REFERENCES Controller (__IDController__),
	PRIMARY KEY ControllerAttribute (__IDControllerAttribute__),
	__FKcontroller__ Integer
) ;

CREATE TABLE Controller (
	__IDController__ Integer NOT NULL,
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY Controller (__IDController__),
	__FKbehavior__ Integer
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	PRIMARY KEY StateMachine (__IDStateMachine__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY theContainer (__FKtheContainer__) REFERENCES State (__IDState__),
	PRIMARY KEY State (__IDState__),
	__FKtheContainer__ Integer
) ;

CREATE TABLE SubControllerState (
	__IDSubControllerState__ Integer NOT NULL,
	FOREIGN KEY controller (__FKcontroller__) REFERENCES Controller (__IDController__),
	PRIMARY KEY SubControllerState (__IDSubControllerState__),
	__FKcontroller__ Integer
) ;

CREATE TABLE ViewState (
	__IDViewState__ Integer NOT NULL,
	PRIMARY KEY ViewState (__IDViewState__)
) ;

CREATE TABLE StateTransition (
	__IDStateTransition__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES State (__IDState__),
	FOREIGN KEY target (__FKtarget__) REFERENCES State (__IDState__),
	FOREIGN KEY "trigger" (__FKtrigger__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY effect (__FKeffect__) REFERENCES StateMachineAction (__IDStateMachineAction__),
	PRIMARY KEY StateTransition (__IDStateTransition__),
	__FKeffect__ Integer,
	__FKtrigger__ Integer,
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE StateMachineAction (
	__IDStateMachineAction__ Integer NOT NULL,
	PRIMARY KEY StateMachineAction (__IDStateMachineAction__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE State_substates_State (
	__IDState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE Controller_controllerAttribute_ControllerAttribute (
	__IDController__ Integer NOT NULL,
	__IDControllerAttribute__ Integer NOT NULL
) ;

CREATE TABLE State_outGoing_StateTransition (
	__IDState__ Integer NOT NULL,
	__IDStateTransition__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_states_State (
	__IDStateMachine__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE State_incoming_StateTransition (
	__IDState__ Integer NOT NULL,
	__IDStateTransition__ Integer NOT NULL
) ;
