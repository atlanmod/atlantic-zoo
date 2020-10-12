module CPR {

	type Plan {
		Sub_plans_ContRef : Plan*;
		Super_plan_Ref : Plan;
		Objectives_ContRef : Objective*;
		Actions_ContRef : Action*;
	};

	type Objective {
		Objective_plan_Ref : Plan;
		Criterias_ContRef : EvaluationCriteria*;
	};

	type EvaluationCriteria {
		Criteria_objective_Ref : Objective;
	};

	type Action {
		Action_plan_Ref : Plan;
		Sub_actions_ContRef : Action*;
		Super_action_Ref : Action;
		Actor_ContRef : Actor;
		Resources_ContRef : Resource*;
		TimeSpecs_ContRef : TimeSpec*;
	};

	type Actor {
		Actor_action_Ref : Action;
		Sub_actors_ContRef : Actor*;
		Super_actor_Ref : Actor;
	};

	type Resource {
		Resource_action_Ref : Action;
	};

	type TimeSpec {
		TimeSpec_action_Ref : Action;
	};
}