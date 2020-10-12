CREATE TABLE InvariantSchema (
	__IDInvariantSchema__ Integer NOT NULL,
	PRIMARY KEY InvariantSchema (__IDInvariantSchema__)
) ;

CREATE TABLE InformationObjectTemplate (
	__IDInformationObjectTemplate__ Integer NOT NULL,
	PRIMARY KEY InformationObjectTemplate (__IDInformationObjectTemplate__)
) ;

CREATE TABLE InformationObjectType (
	__IDInformationObjectType__ Integer NOT NULL,
	PRIMARY KEY InformationObjectType (__IDInformationObjectType__)
) ;

CREATE TABLE InformationObject (
	__IDInformationObject__ Integer NOT NULL,
	FOREIGN KEY IO_S (__FKIO_S__) REFERENCES State (__IDState__),
	PRIMARY KEY InformationObject (__IDInformationObject__),
	__FKIO_S__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY "change" (__FKchange__) REFERENCES StateChange (__IDStateChange__),
	FOREIGN KEY causeSC (__FKcauseSC__) REFERENCES StateChange (__IDStateChange__),
	FOREIGN KEY S_IO (__FKS_IO__) REFERENCES InformationObject (__IDInformationObject__),
	PRIMARY KEY State (__IDState__),
	__FKS_IO__ Integer,
	__FKchange__ Integer,
	__FKcauseSC__ Integer
) ;

CREATE TABLE StateChange (
	__IDStateChange__ Integer NOT NULL,
	FOREIGN KEY startState (__FKstartState__) REFERENCES State (__IDState__),
	FOREIGN KEY endState (__FKendState__) REFERENCES State (__IDState__),
	PRIMARY KEY StateChange (__IDStateChange__),
	__FKendState__ Integer,
	__FKstartState__ Integer
) ;

CREATE TABLE DynamicSchema (
	__IDDynamicSchema__ Integer NOT NULL,
	PRIMARY KEY DynamicSchema (__IDDynamicSchema__)
) ;

CREATE TABLE StaticSchema (
	__IDStaticSchema__ Integer NOT NULL,
	locationTime "Double",
	PRIMARY KEY StaticSchema (__IDStaticSchema__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE ActionType (
	__IDActionType__ Integer NOT NULL,
	PRIMARY KEY ActionType (__IDActionType__)
) ;

CREATE TABLE ActionTemplate (
	__IDActionTemplate__ Integer NOT NULL,
	PRIMARY KEY ActionTemplate (__IDActionTemplate__)
) ;

CREATE TABLE StateChange_specifier_DynamicSchema (
	__IDStateChange__ Integer NOT NULL,
	__IDDynamicSchema__ Integer NOT NULL
) ;

CREATE TABLE ActionType_ATy_A_Action (
	__IDActionType__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_AT_ActionTemplate (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDActionTemplate__ Integer NOT NULL
) ;

CREATE TABLE Action_effect_StateChange (
	__IDAction__ Integer NOT NULL,
	__IDStateChange__ Integer NOT NULL
) ;

CREATE TABLE InformationObjectTemplate_IOT_constrainer_InvariantSchema (
	__IDInformationObjectTemplate__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_S_State (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE InformationObjectType_IOTy_constrainer_InvariantSchema (
	__IDInformationObjectType__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE Action_A_ATy_ActionType (
	__IDAction__ Integer NOT NULL,
	__IDActionType__ Integer NOT NULL
) ;

CREATE TABLE ActionTemplate_AT_constrainer_InvariantSchema (
	__IDActionTemplate__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE Action_A_AT_ActionTemplate (
	__IDAction__ Integer NOT NULL,
	__IDActionTemplate__ Integer NOT NULL
) ;

CREATE TABLE InformationObjectType_IOTy_IO_InformationObject (
	__IDInformationObjectType__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE DynamicSchema_dsStateChange_StateChange (
	__IDDynamicSchema__ Integer NOT NULL,
	__IDStateChange__ Integer NOT NULL
) ;

CREATE TABLE StateChange_SC_constrainer_InvariantSchema (
	__IDStateChange__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_SC_StateChange (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDStateChange__ Integer NOT NULL
) ;

CREATE TABLE InformationObject_IO_IOTy_InformationObjectType (
	__IDInformationObject__ Integer NOT NULL,
	__IDInformationObjectType__ Integer NOT NULL
) ;

CREATE TABLE ActionType_ATy_constrainer_InvariantSchema (
	__IDActionType__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE InformationObjectTemplate_IOT_IO_InformationObject (
	__IDInformationObjectTemplate__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE InformationObject_IO_IOT_InformationObjectTemplate (
	__IDInformationObject__ Integer NOT NULL,
	__IDInformationObjectTemplate__ Integer NOT NULL
) ;

CREATE TABLE InformationObject_IO_A_Action (
	__IDInformationObject__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_IOTy_InformationObjectType (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDInformationObjectType__ Integer NOT NULL
) ;

CREATE TABLE InformationObject_describer_StaticSchema (
	__IDInformationObject__ Integer NOT NULL,
	__IDStaticSchema__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_ATy_ActionType (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDActionType__ Integer NOT NULL
) ;

CREATE TABLE StaticSchema_SS_IO_InformationObject (
	__IDStaticSchema__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE State_S_constrainer_InvariantSchema (
	__IDState__ Integer NOT NULL,
	__IDInvariantSchema__ Integer NOT NULL
) ;

CREATE TABLE ActionTemplate_AT_A_Action (
	__IDActionTemplate__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE InvariantSchema_constrainer_IOT_InformationObjectTemplate (
	__IDInvariantSchema__ Integer NOT NULL,
	__IDInformationObjectTemplate__ Integer NOT NULL
) ;

CREATE TABLE Action_participant_InformationObject (
	__IDAction__ Integer NOT NULL,
	__IDInformationObject__ Integer NOT NULL
) ;

CREATE TABLE StateChange_cause_Action (
	__IDStateChange__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;
