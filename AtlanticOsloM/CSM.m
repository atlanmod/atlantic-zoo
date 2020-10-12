module CSM {

	type CSM {
		Step_ContRef : Step+;
		GeneralResource_ContRef : GeneralResource+;
		Scenarion_ContRef : Scenarion+;
	};

	type GeneralResource {
		ResourceAcquire_Ref : ResourceAcquire*;
		ResourceRelease_Ref : ResourceRelease*;
	};

	type Step : Scenarion {
		PostPath_Ref : PathConnection?;
		PrePath_Ref : PathConnection?;
		ActiveResource_Ref : ActiveResource;
	};

	type Scenarion {
		Step_ContRef : Step+;
		Root_Ref : Start+;
	};

	type Start : Step {
		Workload_Ref : Workload?;
	};

	type End : Step;

	type ResourceAcquire : Step {
		GeneralResource_Ref : GeneralResource;
	};

	type ResourceRelease : Step {
		GeneralResource_Ref : GeneralResource;
	};

	type Workload {
		Start_Ref : Start;
	};

	type Component : PassiveResource;

	type ProcessingResource : ActiveResource;

	type ExternalService : ActiveResource;

	type ActiveResource : GeneralResource {
		Step_Ref : Step*;
	};

	type PassiveResource : GeneralResource;

	type Message;

	type PathConnection {
		Message_Ref : Message?;
		Post_Ref : Step*;
		Pre_Ref : Step*;
	};

	type Join : PathConnection;

	type Fork : PathConnection;

	type Merge : PathConnection;

	type Branch : PathConnection;

	type Seqence : PathConnection;
}