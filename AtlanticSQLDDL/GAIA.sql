CREATE TABLE OrganizationalStructure (
	__IDOrganizationalStructure__ Integer NOT NULL,
	PRIMARY KEY OrganizationalStructure (__IDOrganizationalStructure__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	FOREIGN KEY collaborates (__FKcollaborates__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY interacts (__FKinteracts__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY Organization (__IDOrganization__),
	__FKinteracts__ Integer,
	__FKcollaborates__ Integer
) ;

CREATE TABLE OrganizationalRule (
	__IDOrganizationalRule__ Integer NOT NULL,
	PRIMARY KEY OrganizationalRule (__IDOrganizationalRule__)
) ;

CREATE TABLE SafetyRule (
	__IDSafetyRule__ Integer NOT NULL,
	PRIMARY KEY SafetyRule (__IDSafetyRule__)
) ;

CREATE TABLE LivenessRule (
	__IDLivenessRule__ Integer NOT NULL,
	PRIMARY KEY LivenessRule (__IDLivenessRule__)
) ;

CREATE TABLE AgentType (
	__IDAgentType__ Integer NOT NULL,
	FOREIGN KEY collaborates (__FKcollaborates__) REFERENCES AgentType (__IDAgentType__),
	FOREIGN KEY agentType (__FKagentType__) REFERENCES AgentType (__IDAgentType__),
	PRIMARY KEY AgentType (__IDAgentType__),
	__FKagentType__ Integer,
	__FKcollaborates__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	inputs text,
	outputs text,
	"pre-conditions" text,
	"post-conditions" text,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY actsOn (__FKactsOn__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	PRIMARY KEY Role (__IDRole__),
	__FKactsOn__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	PRIMARY KEY Activity (__IDActivity__)
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

CREATE TABLE AssociationConnector (
	__IDAssociationConnector__ Integer NOT NULL,
	FOREIGN KEY role (__FKrole__) REFERENCES Role (__IDRole__),
	PRIMARY KEY AssociationConnector (__IDAssociationConnector__),
	__FKrole__ Integer
) ;

CREATE TABLE Permission (
	__IDPermission__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES AssociationConnector (__IDAssociationConnector__),
	PRIMARY KEY Permission (__IDPermission__),
	__FKassociation__ Integer
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	name text,
	description text,
	FOREIGN KEY environnement (__FKenvironnement__) REFERENCES Environnement (__IDEnvironnement__),
	PRIMARY KEY Resource (__IDResource__),
	__FKenvironnement__ Integer
) ;

CREATE TABLE Environnement (
	__IDEnvironnement__ Integer NOT NULL,
	PRIMARY KEY Environnement (__IDEnvironnement__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	type text,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Communication (
	__IDCommunication__ Integer NOT NULL,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES Protocol (__IDProtocol__),
	PRIMARY KEY Communication (__IDCommunication__),
	__FKprotocol__ Integer
) ;

CREATE TABLE Protocol (
	__IDProtocol__ Integer NOT NULL,
	name text,
	initiator text,
	partner text,
	inputs text,
	outputs text,
	description text,
	PRIMARY KEY Protocol (__IDProtocol__)
) ;

CREATE TABLE Role_responsibility_Responsibility (
	__IDRole__ Integer NOT NULL,
	__IDResponsibility__ Integer NOT NULL
) ;

CREATE TABLE Role_communication_Communication (
	__IDRole__ Integer NOT NULL,
	__IDCommunication__ Integer NOT NULL
) ;

CREATE TABLE AgentType_provides_Service (
	__IDAgentType__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Organization_member_AgentType (
	__IDOrganization__ Integer NOT NULL,
	__IDAgentType__ Integer NOT NULL
) ;

CREATE TABLE Organization_observes_OrganizationalRule (
	__IDOrganization__ Integer NOT NULL,
	__IDOrganizationalRule__ Integer NOT NULL
) ;

CREATE TABLE Role_activity_Activity (
	__IDRole__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Communication_observes_OrganizationalRule (
	__IDCommunication__ Integer NOT NULL,
	__IDOrganizationalRule__ Integer NOT NULL
) ;

CREATE TABLE Environnement_resource_Resource (
	__IDEnvironnement__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_permission_Permission (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDPermission__ Integer NOT NULL
) ;

CREATE TABLE AgentType_plays_Role (
	__IDAgentType__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE OrganizationalStructure_organization_Organization (
	__IDOrganizationalStructure__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Resource_permitted_action_Action (
	__IDResource__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE AssociationConnector_actsOn_Resource (
	__IDAssociationConnector__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;
