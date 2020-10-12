module Statecharts {

	type BooleanExpression {
		Value_Att : Text;
	};

	type StateMachine {
		Transitions_ContRef : Transition*;
		Top_ContRef : State*;
	};

	type State : StateVertex {
		State_container_Ref : StateMachine;
		InternalTransitions_ContRef : Transition*;
		DeferrableEvents_Ref : Event*;
	};

	type CompositeState : State {
		SubVertexes_ContRef : StateVertex*;
		IsConcurrent_Att : Logical;
	};

	type Transition {
		TransSM_container_Ref : StateMachine?;
		TransS_container_Ref : State?;
		Trigger_ContRef : Event?;
		Guard_ContRef : Guard?;
		Source_Ref : StateVertex;
		Target_Ref : StateVertex;
	};

	type StateVertex {
		Sv_container_Ref : CompositeState?;
		Outgoing_Ref : Transition*;
		Incoming_Ref : Transition*;
	};

	type Guard {
		Gua_container_Ref : Transition;
		Expression_Ref : BooleanExpression;
	};

	type Event {
		Evt_container_Ref : Transition*;
		Targets_Ref : State*;
	};
}