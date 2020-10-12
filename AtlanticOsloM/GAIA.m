module GAIA {

	type OrganizationalStructure {
		Organization_ContRef : Organization*;
	};

	type Organization {
		Collaborates_Ref : Organization;
		Interacts_Ref : Organization;
		Member_ContRef : AgentType*;
		Observes_Ref : OrganizationalRule*;
	};

	type OrganizationalRule;

	type SafetyRule : OrganizationalRule;

	type LivenessRule : OrganizationalRule;

	type AgentType {
		Provides_Ref : Service+;
		Collaborates_Ref : AgentType;
		AgentType_Ref : AgentType;
		Plays_Ref : Role*;
	};

	type Service {
		Inputs_Att : Text;
		Outputs_Att : Text;
		@[Pre-conditions_Att] : Text;
		@[Post-conditions_Att] : Text;
	};

	type Role {
		Activity_Ref : Activity+;
		Communication_Ref : Communication*;
		Responsibility_Ref : Responsibility+;
		ActsOn_Ref : AssociationConnector?;
	};

	type Activity;

	type Responsibility;

	type LivenessProperty : Responsibility;

	type SafetyProperty : Responsibility;

	type AssociationConnector {
		ActsOn_Ref : Resource*;
		Role_Ref : Role;
		Permission_Ref : Permission*;
	};

	type Permission {
		Association_Ref : AssociationConnector;
	};

	type Resource {
		Name_Att : Text;
		Description_Att : Text;
		Permitted_action_Ref : Action*;
		Environnement_Ref : Environnement;
	};

	type Environnement {
		Resource_ContRef : Resource*;
	};

	type Action {
		Type_Att : Text;
	};

	type Communication {
		Observes_Ref : OrganizationalRule*;
		Protocol_Ref : Protocol;
	};

	type Protocol {
		Name_Att : Text;
		Initiator_Att : Text;
		Partner_Att : Text;
		Inputs_Att : Text;
		Outputs_Att : Text;
		Description_Att : Text;
	};
}