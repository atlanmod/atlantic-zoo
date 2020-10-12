module WorkDefinitions {

	type WorkDefinition {
		ParentWorks_Ref : WorkDefinition*;
		SubWorks_Ref : WorkDefinition*;
		Owner_Ref : ProcessPerformer;
	};

	type ProcessPerformer {
		Features_ContRef : WorkDefinition*;
	};

	type Role : ProcessPerformer {
		Products_Ref : WorkProduct*;
	};

	type WorkProduct {
		Responsible_Ref : Role;
	};

	type Lifecycle : WorkDefinition {
		Phases_ContRef : Phase+;
	};

	type Phase : WorkDefinition {
		LifeCycle_Ref : Lifecycle;
		Iterations_ContRef : Iteration+;
	};

	type Iteration : WorkDefinition {
		Phase_Ref : Phase;
		Activities_ContRef : Activity+;
	};

	type Activity : WorkDefinition {
		Iteration_Ref : Iteration;
		Steps_ContRef : Step*;
	};

	type Step;
}