module ActorConcept {

	type Actor {
		DependencyE_Ref : Dependency*;
		DependencyR_Ref : Dependency*;
		Goal_Ref : Goal*;
		Plan_Ref : Plan*;
		Resource_Ref : Resource*;
	};

	type Goal {
		Wanter_Ref : Actor;
		Plan_Ref : Plan+;
		DependencyWG_Ref : Dependency*;
		DependencyG_Ref : Dependency*;
	};

	type SoftGoal : Goal;

	type HardGoal : Goal;

	type Dependency {
		Dependee_Ref : Actor;
		Depender_Ref : Actor;
		Goal_Ref : Goal?;
		WhyG_Ref : Goal?;
		WhyR_Ref : Resource?;
		ResourceD_Ref : Resource?;
		WhyP_Ref : Plan?;
		Plan_Ref : Plan?;
	};

	type Plan {
		IsFulfilled_Ref : Goal;
		CapableOf_Ref : Actor;
		DependencyWP_Ref : Dependency*;
		DependencyP_Ref : Dependency*;
	};

	type Resource {
		Use_Ref : Actor;
		DependencyWR_Ref : Dependency;
		DependencyR_Ref : Dependency;
	};
}