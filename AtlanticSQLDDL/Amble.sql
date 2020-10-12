CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Program (
	__IDProgram__ Integer NOT NULL,
	PRIMARY KEY Program (__IDProgram__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	minId Integer,
	maxId Integer,
	instancesNb Integer,
	FOREIGN KEY initial (__FKinitial__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Process (__IDProcess__),
	__FKinitial__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	isInitial Boolean,
	PRIMARY KEY State (__IDState__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY guard (__FKguard__) REFERENCES Guard (__IDGuard__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	FOREIGN KEY source (__FKsource__) REFERENCES State (__IDState__),
	FOREIGN KEY target (__FKtarget__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKguard__ Integer,
	__FKsource__ Integer,
	__FKtarget__ Integer,
	__FKaction__ Integer
) ;

CREATE TABLE Trans (
	__IDTrans__ Integer NOT NULL,
	FOREIGN KEY waitFor (__FKwaitFor__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Trans (__IDTrans__),
	__FKwaitFor__ Integer
) ;

CREATE TABLE Strans (
	__IDStrans__ Integer NOT NULL,
	PRIMARY KEY Strans (__IDStrans__)
) ;

CREATE TABLE Transall (
	__IDTransall__ Integer NOT NULL,
	FOREIGN KEY waitFor (__FKwaitFor__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Transall (__IDTransall__),
	__FKwaitFor__ Integer
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	PRIMARY KEY Guard (__IDGuard__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Network (
	__IDNetwork__ Integer NOT NULL,
	PRIMARY KEY Network (__IDNetwork__)
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Process (__IDProcess__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Channel (__IDChannel__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	type text,
	initValue text,
	PRIMARY KEY Variable (__IDVariable__)
) ;

CREATE TABLE Process_connectedTo_Network (
	__IDProcess__ Integer NOT NULL,
	__IDNetwork__ Integer NOT NULL
) ;

CREATE TABLE State_outgoing_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Process_transitions_Transition (
	__IDProcess__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Program_networks_Network (
	__IDProgram__ Integer NOT NULL,
	__IDNetwork__ Integer NOT NULL
) ;

CREATE TABLE Process_variables_Variable (
	__IDProcess__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Process_states_State (
	__IDProcess__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE Channel_messages_Message (
	__IDChannel__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Program_processes_Process (
	__IDProgram__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE Network_channels_Channel (
	__IDNetwork__ Integer NOT NULL,
	__IDChannel__ Integer NOT NULL
) ;

CREATE TABLE State_incoming_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
