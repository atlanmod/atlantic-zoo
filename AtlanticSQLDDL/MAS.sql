CREATE TABLE Agent (
	__IDAgent__ Integer NOT NULL,
	FOREIGN KEY belongs (__FKbelongs__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY fipa_Platform_Agent (__FKfipa_Platform_Agent__) REFERENCES "FIPA-Platform Agent" ("__IDFIPA-Platform Agent__"),
	FOREIGN KEY role (__FKrole__) REFERENCES Role (__IDRole__),
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY characteristic (__FKcharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	FOREIGN KEY skill (__FKskill__) REFERENCES Skill (__IDSkill__),
	FOREIGN KEY aptitude (__FKaptitude__) REFERENCES Aptitude (__IDAptitude__),
	PRIMARY KEY Agent (__IDAgent__),
	__FKaptitude__ Integer,
	__FKrepresentation__ Integer,
	__FKfipa_Platform_Agent__ Integer,
	__FKskill__ Integer,
	__FKbelongs__ Integer,
	__FKrole__ Integer,
	__FKcharacteristic__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	inputs text,
	outputs text,
	"pre-conditions" text,
	"post-conditions" text,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE "Non Functionnal Requirement" (
	"__IDNon Functionnal Requirement__" Integer NOT NULL,
	PRIMARY KEY "Non Functionnal Requirement" ("__IDNon Functionnal Requirement__")
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	PRIMARY KEY Requirement (__IDRequirement__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	FOREIGN KEY organizational_Structure (__FKorganizational_Structure__) REFERENCES "Organizational Structure" ("__IDOrganizational Structure__"),
	PRIMARY KEY Organization (__IDOrganization__),
	__FKorganizational_Structure__ Integer
) ;

CREATE TABLE "Organizational Structure" (
	"__IDOrganizational Structure__" Integer NOT NULL,
	PRIMARY KEY "Organizational Structure" ("__IDOrganizational Structure__")
) ;

CREATE TABLE SafetyRule (
	__IDSafetyRule__ Integer NOT NULL,
	PRIMARY KEY SafetyRule (__IDSafetyRule__)
) ;

CREATE TABLE LivenessRule (
	__IDLivenessRule__ Integer NOT NULL,
	PRIMARY KEY LivenessRule (__IDLivenessRule__)
) ;

CREATE TABLE CooperationRules (
	__IDCooperationRules__ Integer NOT NULL,
	FOREIGN KEY ncs (__FKncs__) REFERENCES NCS (__IDNCS__),
	PRIMARY KEY CooperationRules (__IDCooperationRules__),
	__FKncs__ Integer
) ;

CREATE TABLE NCS (
	__IDNCS__ Integer NOT NULL,
	FOREIGN KEY cooperationRules (__FKcooperationRules__) REFERENCES CooperationRules (__IDCooperationRules__),
	PRIMARY KEY NCS (__IDNCS__),
	__FKcooperationRules__ Integer
) ;

CREATE TABLE "FIPA-Platform Agent" (
	"__IDFIPA-Platform Agent__" Integer NOT NULL,
	FOREIGN KEY agentF (__FKagentF__) REFERENCES Agent (__IDAgent__),
	PRIMARY KEY "FIPA-Platform Agent" ("__IDFIPA-Platform Agent__"),
	__FKagentF__ Integer
) ;

CREATE TABLE "FIPA-Platform Task" (
	"__IDFIPA-Platform Task__" Integer NOT NULL,
	FOREIGN KEY fipa_Platform_AgentF (__FKfipa_Platform_AgentF__) REFERENCES "FIPA-Platform Agent" ("__IDFIPA-Platform Agent__"),
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY "FIPA-Platform Task" ("__IDFIPA-Platform Task__"),
	__FKfipa_Platform_AgentF__ Integer,
	__FKtask__ Integer
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	name text,
	FOREIGN KEY fipa_Platform_TaskT (__FKfipa_Platform_TaskT__) REFERENCES "FIPA-Platform Task" ("__IDFIPA-Platform Task__"),
	PRIMARY KEY Task (__IDTask__),
	__FKfipa_Platform_TaskT__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY agentR (__FKagentR__) REFERENCES Agent (__IDAgent__),
	PRIMARY KEY Role (__IDRole__),
	__FKagentR__ Integer
) ;

CREATE TABLE Representation (
	__IDRepresentation__ Integer NOT NULL,
	FOREIGN KEY agentRep (__FKagentRep__) REFERENCES Agent (__IDAgent__),
	FOREIGN KEY ontology (__FKontology__) REFERENCES Ontology (__IDOntology__),
	FOREIGN KEY environnement (__FKenvironnement__) REFERENCES Environnement (__IDEnvironnement__),
	PRIMARY KEY Representation (__IDRepresentation__),
	__FKagentRep__ Integer,
	__FKenvironnement__ Integer,
	__FKontology__ Integer
) ;

CREATE TABLE Characteristic (
	__IDCharacteristic__ Integer NOT NULL,
	FOREIGN KEY agentC (__FKagentC__) REFERENCES Agent (__IDAgent__),
	PRIMARY KEY Characteristic (__IDCharacteristic__),
	__FKagentC__ Integer
) ;

CREATE TABLE Skill (
	__IDSkill__ Integer NOT NULL,
	FOREIGN KEY agentS (__FKagentS__) REFERENCES Agent (__IDAgent__),
	PRIMARY KEY Skill (__IDSkill__),
	__FKagentS__ Integer
) ;

CREATE TABLE Aptitude (
	__IDAptitude__ Integer NOT NULL,
	FOREIGN KEY agentA (__FKagentA__) REFERENCES Agent (__IDAgent__),
	PRIMARY KEY Aptitude (__IDAptitude__),
	__FKagentA__ Integer
) ;

CREATE TABLE Ontology (
	__IDOntology__ Integer NOT NULL,
	FOREIGN KEY environnement (__FKenvironnement__) REFERENCES Environnement (__IDEnvironnement__),
	PRIMARY KEY Ontology (__IDOntology__),
	__FKenvironnement__ Integer
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	PRIMARY KEY Concept (__IDConcept__)
) ;

CREATE TABLE Predicat (
	__IDPredicat__ Integer NOT NULL,
	PRIMARY KEY Predicat (__IDPredicat__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Environnement (
	__IDEnvironnement__ Integer NOT NULL,
	FOREIGN KEY resource (__FKresource__) REFERENCES Resource (__IDResource__),
	PRIMARY KEY Environnement (__IDEnvironnement__),
	__FKresource__ Integer
) ;

CREATE TABLE Responsibility (
	__IDResponsibility__ Integer NOT NULL,
	PRIMARY KEY Responsibility (__IDResponsibility__)
) ;

CREATE TABLE LivenessProperty (
	__IDLivenessProperty__ Integer NOT NULL,
	PRIMARY KEY LivenessProperty (__IDLivenessProperty__)
) ;

CREATE TABLE SafetyProperty (
	__IDSafetyProperty__ Integer NOT NULL,
	PRIMARY KEY SafetyProperty (__IDSafetyProperty__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	name text,
	FOREIGN KEY environnement (__FKenvironnement__) REFERENCES Environnement (__IDEnvironnement__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Resource (__IDResource__),
	__FKaction__ Integer,
	__FKenvironnement__ Integer
) ;

CREATE TABLE Communication (
	__IDCommunication__ Integer NOT NULL,
	name text,
	FOREIGN KEY "Exchanged Knoledge" ("__FKExchanged Knoledge__") REFERENCES Ontology (__IDOntology__),
	FOREIGN KEY aip (__FKaip__) REFERENCES AIP (__IDAIP__),
	PRIMARY KEY Communication (__IDCommunication__),
	"__FKExchanged Knoledge__" Integer,
	__FKaip__ Integer
) ;

CREATE TABLE AIP (
	__IDAIP__ Integer NOT NULL,
	name text,
	FOREIGN KEY performative (__FKperformative__) REFERENCES Performative (__IDPerformative__),
	PRIMARY KEY AIP (__IDAIP__),
	__FKperformative__ Integer
) ;

CREATE TABLE Performative (
	__IDPerformative__ Integer NOT NULL,
	FOREIGN KEY aip (__FKaip__) REFERENCES AIP (__IDAIP__),
	PRIMARY KEY Performative (__IDPerformative__),
	__FKaip__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	FOREIGN KEY communication (__FKcommunication__) REFERENCES Communication (__IDCommunication__),
	FOREIGN KEY Comm_Act (__FKComm_Act__) REFERENCES Performative (__IDPerformative__),
	PRIMARY KEY Message (__IDMessage__),
	__FKComm_Act__ Integer,
	__FKcommunication__ Integer
) ;

CREATE TABLE Scenario (
	__IDScenario__ Integer NOT NULL,
	PRIMARY KEY Scenario (__IDScenario__)
) ;

CREATE TABLE "Agent_non_Functionnal_Requirement_Non Functionnal Requirement" (
	__IDAgent__ Integer NOT NULL,
	"__IDNon Functionnal Requirement__" Integer NOT NULL
) ;

CREATE TABLE Role_actsOn_Resource (
	__IDRole__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Agent_cooperationRules_CooperationRules (
	__IDAgent__ Integer NOT NULL,
	__IDCooperationRules__ Integer NOT NULL
) ;

CREATE TABLE Role_scenario_Scenario (
	__IDRole__ Integer NOT NULL,
	__IDScenario__ Integer NOT NULL
) ;

CREATE TABLE "FIPA-Platform Agent_fipa_Platform_Task_FIPA-Platform Task" (
	"__IDFIPA-Platform Agent__" Integer NOT NULL,
	"__IDFIPA-Platform Task__" Integer NOT NULL
) ;

CREATE TABLE Agent_service_Service (
	__IDAgent__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Communication_scenario_Scenario (
	__IDCommunication__ Integer NOT NULL,
	__IDScenario__ Integer NOT NULL
) ;

CREATE TABLE Role_participant_Communication (
	__IDRole__ Integer NOT NULL,
	__IDCommunication__ Integer NOT NULL
) ;

CREATE TABLE "Organization_observes_Organizational Structure" (
	__IDOrganization__ Integer NOT NULL,
	"__IDOrganizational Structure__" Integer NOT NULL
) ;

CREATE TABLE Agent_requirement_Requirement (
	__IDAgent__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE "Organizational Structure_organization_Organization" (
	"__IDOrganizational Structure__" Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Role_activity_Task (
	__IDRole__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Communication_message_Message (
	__IDCommunication__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Role_has_Responsibility (
	__IDRole__ Integer NOT NULL,
	__IDResponsibility__ Integer NOT NULL
) ;
