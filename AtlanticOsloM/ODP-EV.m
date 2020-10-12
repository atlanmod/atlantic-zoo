module ODPEV {

	type EnterpriseObject {
		EoConfigurations_Ref : Community*;
		EoRoles_Ref : Role*;
		EoArtefactActions_Ref : Action+;
		EoResourceActions_Ref : Action+;
		EoActorActions_Ref : Action+;
		EoPolicy_Ref : Policy*;
		EoEOAR_Ref : EO_A_R*;
		EoEOPD_Ref : EO_P_D;
	};

	type ODPSystem : EnterpriseObject {
		OdpBehaviour_Ref : Scope;
		OdpObjectives_Ref : Objective+;
		OdpSpecifier_Ref : EnterpriseSpecification;
	};

	type Party : EnterpriseObject {
		PtyAccountableAction_Ref : AccountableAction*;
		PtyEOPD_Ref : EO_P_D;
	};

	type Objective {
		ObjFulfiller_Ref : ODPSystem?;
		ObjSpecifier_Ref : Contract;
		ObjRefiners_Ref : Objective*;
		ObjRefinement_Ref : Objective?;
		ObjAchievers_Ref : Process*;
		ObjFulfillers_Ref : Behaviour+;
	};

	type Scope {
		ScOdpSystem_Ref : ODPSystem;
	};

	type EnterpriseSpecification {
		EsDescribedSystems_Ref : ODPSystem+;
		EsContext_Ref : FieldOfApplication;
	};

	type FieldOfApplication {
		FaEnterpriseSpecifications_Ref : EnterpriseSpecification;
	};

	type Policy {
		PoSpecifier_Ref : Contract;
		PoOwner_Ref : Community;
		PoProcess_Ref : Process*;
		PoBehaviour_Ref : Behaviour*;
		PoChanger_Ref : Behaviour*;
		PoRole_Ref : Role*;
		PoEnterpriseObject_Ref : EnterpriseObject*;
	};

	type PolicyEnvelope : Policy {
		PePolicySetter_Ref : Behaviour;
		PeBehaviour_Ref : Behaviour?;
		PeValues_ContRef : PolicyValue+;
		PeCurrentValue_Ref : PolicyValue;
	};

	type PolicyValue : Policy {
		PvValue_Ref : PolicyEnvelope;
	};

	type AssigmentPolicy : Policy {
		ApEOAR_Ref : EO_A_R*;
	};

	type Contract {
		CtPolicies_Ref : Policy;
		CtObjective_Ref : Objective;
		CtBehaviours_Ref : Behaviour+;
	};

	type Process {
		PrObjectives_Ref : Objective+;
		PrDetails_Ref : Step+;
		PrRefinement_Ref : Step?;
		PrConstrainer_Ref : Policy*;
	};

	type Step {
		StGraphs_Ref : Process+;
		StAbstraction_Ref : Process?;
	};

	type Action : Step {
		ActBehaviours_Ref : Behaviour+;
		ActArtefactRoleFillers_Ref : EnterpriseObject*;
		ActResourceRoleFillers_Ref : EnterpriseObject*;
		ActActorRoleFillers_Ref : EnterpriseObject*;
	};

	type AccountableAction : Action {
		AaAccountableParty_Ref : Party+;
	};

	type Prescription : AccountableAction;

	type Commitment : AccountableAction;

	type Declaration : AccountableAction;

	type Evaluation : AccountableAction;

	type Delegation : AccountableAction {
		DlgEOPD_Ref : EO_P_D;
	};

	type Behaviour {
		BeObjectives_Ref : Objective+;
		BeSpecifiers_Ref : Contract+;
		BeActions_Ref : Action+;
		BeIdentifier_Ref : Role?;
		BePolicyEnvelope_Ref : PolicyEnvelope?;
		BeConstrainer_Ref : PolicyEnvelope?;
		BePolicyConstrainer_Ref : Policy*;
		BePolicy_Ref : Policy*;
	};

	type Community {
		CoAbstraction_Ref : CommunityObject?;
		CoMembers_Ref : EnterpriseObject*;
		CoCommunityRoles_Ref : Role*;
		CoPolicy_Ref : Policy*;
	};

	type CommunityObject : EnterpriseObject {
		CobjRefinement_Ref : Community;
	};

	type Role {
		RoleBehaviour_Ref : Behaviour;
		RoleSpecifier_Ref : Community;
		Rolefillers_Ref : EnterpriseObject*;
		RoleConstrainer_Ref : Policy*;
		RoleEOAR_Ref : EO_A_R*;
	};

	type InterfaceRole : Role;

	type Violation : Behaviour {
		VioProhibitor_Ref : Rule;
	};

	type Rule {
		RuViolation_Ref : Violation*;
	};

	type Obligation : Rule;

	type Authorisation : Rule;

	type Permission : Rule;

	type Prohibition : Rule;

	type EO_A_R {
		EoarSubject_Ref : EnterpriseObject*;
		EoarSubjectRole_Ref : Role+;
		EoarGovernor_Ref : AssigmentPolicy*;
	};

	type EO_P_D {
		EopdAgent_Ref : EnterpriseObject;
		EopdPrincipal_Ref : Party;
		EopdAction_Ref : Delegation;
	};
}