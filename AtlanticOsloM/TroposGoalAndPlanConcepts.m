module GoalAndPlanConcepts {

	type Actor {
		Decomposition_Ref : Decomposition*;
		Contribution_Ref : Contribution*;
		MeansEnd_Ref : MeansEnd*;
	};

	type Decomposition {
		PointOfView_Ref : Actor;
	};

	type Contribution {
		Metric_Att : Text;
		Contributer_Ref : Goal;
		Contributed_Ref : Goal;
		PointOfView_Ref : Actor;
	};

	type Goal {
		ContributionR_Ref : Contribution*;
		ContributionD_Ref : Contribution*;
		MeansEndS_Ref : MeansEnd*;
		MeansEndD_Ref : MeansEnd*;
		BooleanDecomposition_Ref : BooleanDecomposition?;
		BooleanDecLink_Ref : BooleanDecLink*;
	};

	type MeansEnd {
		MeansR_Ref : Resource?;
		Means_Ref : Goal?;
		End_Ref : Goal;
		PointOfView_Ref : Actor;
		MeansP_Ref : Plan?;
	};

	type Resource {
		MeansEndR_Ref : MeansEnd*;
	};

	type Plan {
		MeansEndP_Ref : MeansEnd*;
		BooleanDecompositionP_Ref : BooleanDecomposition?;
		BooleanDecLinkP_Ref : BooleanDecLink*;
	};

	type BooleanDecomposition : Decomposition {
		Type_Att : Text;
		Root_Ref : Goal?;
		RootP_Ref : Plan?;
		BooleanDecLinkD_ContRef : BooleanDecLink+;
	};

	type BooleanDecLink {
		BooleanDecompositionB_Ref : BooleanDecomposition;
		Target_Ref : Goal?;
		TargetP_Ref : Plan?;
	};

	type AndDecLink : BooleanDecLink;

	type OrDecLink : BooleanDecLink;
}