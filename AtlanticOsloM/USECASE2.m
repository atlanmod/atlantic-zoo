module USECASEUML {

	type Requirement;

	type NonFunctionnelRequirement : Requirement {
		Scopes_Ref : UseCase*;
	};

	type FunctionnelRequirement : Requirement {
		Specifies_Ref : UseCase*;
	};

	type UseCase {
		Scenario_Ref : ScenarioDescription*;
		Condition_Ref : Condition*;
		Interacter_Ref : Role*;
		Specified_by_Ref : FunctionnelRequirement*;
		Scoped_by_Ref : NonFunctionnelRequirement*;
		Meet_by_Ref : Goal+;
	};

	type Goal {
		To_meet_Ref : UseCase+;
	};

	type Role {
		Interacted_with_Ref : UseCase*;
	};

	type HumanRole : Role;

	type SystemRole : Role;

	type EventRole : Role;

	type Manage : UseCase {
		Managed_Resource_Ref : Resource*;
	};

	type Resource;

	type ScenarioDescription {
		UseCase_Ref : UseCase;
	};

	type Condition {
		Constrained_with_Ref : UseCase*;
	};

	type Pre : Condition;

	type Post : Condition;
}