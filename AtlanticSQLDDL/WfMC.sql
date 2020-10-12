CREATE TABLE WorkflowProcessDefinition (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	PRIMARY KEY WorkflowProcessDefinition (__IDWorkflowProcessDefinition__)
) ;

CREATE TABLE WorkflowApplicationDeclaration (
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL,
	FOREIGN KEY processDefinition (__FKprocessDefinition__) REFERENCES WorkflowProcessDefinition (__IDWorkflowProcessDefinition__),
	PRIMARY KEY WorkflowApplicationDeclaration (__IDWorkflowApplicationDeclaration__),
	__FKprocessDefinition__ Integer
) ;

CREATE TABLE WorkflowRelevantData (
	__IDWorkflowRelevantData__ Integer NOT NULL,
	FOREIGN KEY processDefinition (__FKprocessDefinition__) REFERENCES WorkflowProcessDefinition (__IDWorkflowProcessDefinition__),
	PRIMARY KEY WorkflowRelevantData (__IDWorkflowRelevantData__),
	__FKprocessDefinition__ Integer
) ;

CREATE TABLE WorkflowParticipantSpecification (
	__IDWorkflowParticipantSpecification__ Integer NOT NULL,
	FOREIGN KEY processDefinition (__FKprocessDefinition__) REFERENCES WorkflowProcessDefinition (__IDWorkflowProcessDefinition__),
	PRIMARY KEY WorkflowParticipantSpecification (__IDWorkflowParticipantSpecification__),
	__FKprocessDefinition__ Integer
) ;

CREATE TABLE WorkflowProcessActivity (
	__IDWorkflowProcessActivity__ Integer NOT NULL,
	FOREIGN KEY processDefinition (__FKprocessDefinition__) REFERENCES WorkflowProcessDefinition (__IDWorkflowProcessDefinition__),
	FOREIGN KEY to_transitionInformation (__FKto_transitionInformation__) REFERENCES TransitionInformation (__IDTransitionInformation__),
	FOREIGN KEY from_transitionInformation (__FKfrom_transitionInformation__) REFERENCES TransitionInformation (__IDTransitionInformation__),
	PRIMARY KEY WorkflowProcessActivity (__IDWorkflowProcessActivity__),
	__FKprocessDefinition__ Integer,
	__FKfrom_transitionInformation__ Integer,
	__FKto_transitionInformation__ Integer
) ;

CREATE TABLE TransitionInformation (
	__IDTransitionInformation__ Integer NOT NULL,
	FOREIGN KEY processDefinition (__FKprocessDefinition__) REFERENCES WorkflowProcessDefinition (__IDWorkflowProcessDefinition__),
	FOREIGN KEY to_processActivity (__FKto_processActivity__) REFERENCES WorkflowProcessActivity (__IDWorkflowProcessActivity__),
	FOREIGN KEY from_processActivity (__FKfrom_processActivity__) REFERENCES WorkflowProcessActivity (__IDWorkflowProcessActivity__),
	PRIMARY KEY TransitionInformation (__IDTransitionInformation__),
	__FKfrom_processActivity__ Integer,
	__FKprocessDefinition__ Integer,
	__FKto_processActivity__ Integer
) ;

CREATE TABLE WorkflowProcessDefinition_revelantDatas_WorkflowRelevantData (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	__IDWorkflowRelevantData__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessDefinition_processActivities_WorkflowProcessActivity (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	__IDWorkflowProcessActivity__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessActivity_applicationDeclarations_WorkflowApplicationDeclaration (
	__IDWorkflowProcessActivity__ Integer NOT NULL,
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL
) ;

CREATE TABLE TransitionInformation_revelantDatas_WorkflowRelevantData (
	__IDTransitionInformation__ Integer NOT NULL,
	__IDWorkflowRelevantData__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessDefinition_transitionInformations_TransitionInformation (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	__IDTransitionInformation__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessDefinition_participantSpecificatons_WorkflowParticipantSpecification (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	__IDWorkflowParticipantSpecification__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessActivity_revelantDatas_WorkflowRelevantData (
	__IDWorkflowProcessActivity__ Integer NOT NULL,
	__IDWorkflowRelevantData__ Integer NOT NULL
) ;

CREATE TABLE WorkflowRelevantData_processActivities_WorkflowProcessActivity (
	__IDWorkflowRelevantData__ Integer NOT NULL,
	__IDWorkflowProcessActivity__ Integer NOT NULL
) ;

CREATE TABLE WorkflowRelevantData_transitionInformations_TransitionInformation (
	__IDWorkflowRelevantData__ Integer NOT NULL,
	__IDTransitionInformation__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessDefinition_applicationDeclarations_WorkflowApplicationDeclaration (
	__IDWorkflowProcessDefinition__ Integer NOT NULL,
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL
) ;

CREATE TABLE WorkflowRelevantData_applicationDeclarations_WorkflowApplicationDeclaration (
	__IDWorkflowRelevantData__ Integer NOT NULL,
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL
) ;

CREATE TABLE WorkflowApplicationDeclaration_processActivities_WorkflowProcessActivity (
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL,
	__IDWorkflowProcessActivity__ Integer NOT NULL
) ;

CREATE TABLE WorkflowApplicationDeclaration_revelantDatas_WorkflowRelevantData (
	__IDWorkflowApplicationDeclaration__ Integer NOT NULL,
	__IDWorkflowRelevantData__ Integer NOT NULL
) ;

CREATE TABLE WorkflowRelevantData_participantSpecifications_WorkflowParticipantSpecification (
	__IDWorkflowRelevantData__ Integer NOT NULL,
	__IDWorkflowParticipantSpecification__ Integer NOT NULL
) ;

CREATE TABLE WorkflowParticipantSpecification_revelantDatas_WorkflowRelevantData (
	__IDWorkflowParticipantSpecification__ Integer NOT NULL,
	__IDWorkflowRelevantData__ Integer NOT NULL
) ;

CREATE TABLE WorkflowParticipantSpecification_processActivities_WorkflowProcessActivity (
	__IDWorkflowParticipantSpecification__ Integer NOT NULL,
	__IDWorkflowProcessActivity__ Integer NOT NULL
) ;

CREATE TABLE WorkflowProcessActivity_participantSpecifications_WorkflowParticipantSpecification (
	__IDWorkflowProcessActivity__ Integer NOT NULL,
	__IDWorkflowParticipantSpecification__ Integer NOT NULL
) ;
