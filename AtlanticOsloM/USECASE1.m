module USECASE1 {

	type Task {
		Service_Ref : Service+;
	};

	type User {
		UseCase_Ref : UseCase+;
		Actor_Ref : Actor*;
	};

	type Actor {
		UseCase_Ref : UseCase+;
		Goal_Ref : Goal*;
		User_Ref : User*;
	};

	type Goal {
		Service_Ref : Service+;
		Actor_Ref : Actor+;
	};

	type UseCase {
		Context_ContRef : Context?;
		Service_Ref : Service*;
		User_Ref : User*;
		Actor_Ref : Actor*;
	};

	type Service {
		UseCase_Ref : UseCase+;
		Goal_Ref : Goal+;
		Task_Ref : Task+;
	};

	type Scenario;

	type Context {
		PreCondition_Ref : PreCondition+;
		PostCondition_Ref : PostCondition+;
		UseCase_Ref : UseCase+;
	};

	type PreCondition {
		Context_Ref : Context*;
	};

	type PostCondition {
		Context_Ref : Context*;
	};

	type Episode {
		Event_Ref : Event*;
	};

	type Event {
		Episode_Ref : Episode+;
	};

	type Action : Event;

	type Responce : Event {
		Parameter_ContRef : Parameter*;
	};

	type Stimilus : Event {
		Parameter_ContRef : Parameter*;
	};

	type Parameter {
		Stimilus_Ref : Stimilus+;
		Responce_Ref : Responce+;
	};
}