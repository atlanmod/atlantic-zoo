module Klaper {

	type Resource {
		Name_Att : Text;
		Type_Att : Text;
		Capacity_Att : Integer32;
		SchedulingPolicy_Att : Text;
		Description_Att : Text;
		Acquire_Ref : Acquire;
		Release_Ref : Release;
	};

	type Service {
		Name_Att : Text;
		FormalParams_Att : Text;
		SpeedAttr_Att : Text;
		FailAttr_Att : Text;
		Description_Att : Text;
		Behavior_Ref : Behavior+;
		BehaviorUsed_Ref : Behavior*;
		ServiceCall_Ref : ServiceCall*;
	};

	type Behavior {
		Stepn_Ref : Step;
		Stepb_ContRef : Step+;
		Service_Ref : Service;
		UsedService_Ref : Service*;
		WorkLoad_Ref : WorkLoad?;
	};

	type WorkLoad {
		WorkLoadType_Att : Text;
		ArrivalProcess_Att : Text;
		Population_Att : Text;
		InitialResource_Att : Text;
		Behavior_Ref : Behavior;
	};

	type Step : Behavior {
		Name_Att : Text;
		Repetition_Att : Text;
		InternalExecTime_Att : Text;
		InternalFailProb_Att : Text;
		CompletionModel_Att : Text;
		ServiceCall_ContRef : ServiceCall*;
		Predecessor_Ref : Step*;
		Successor_Ref : Step*;
		Behavior_Ref : Behavior;
		NestedBehavior_Ref : Behavior?;
	};

	type Start : Step;

	type End : Step;

	type Control : Step;

	type InternalActivity : Step;

	type ServiceCall : Step {
		ResourceType_Att : Text;
		ServiceName_Att : Text;
		IsSynch_Att : Logical;
		ActualParam_Ref : ActualParam*;
		Step_Ref : Step;
		CalledService_Ref : Service?;
	};

	type ActualParam {
		Value_Att : Text;
		ServiceCall_Ref : ServiceCall;
	};

	type Branch : Control {
		BranchProbs_Att : Text;
	};

	type Fork : Control;

	type Join : Control;

	type Acquire : Control {
		ResourceUnits_Att : Text;
		Resource_Ref : Resource;
	};

	type Release : Control {
		ResourceUnits_Att : Text;
		Resource_Ref : Resource;
	};
}