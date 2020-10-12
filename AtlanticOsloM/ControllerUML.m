module ControllerUML {

	type ControllerAttribute {
		Controller_Ref : Controller;
	};

	type Controller {
		ControllerAttribute_Ref : ControllerAttribute*;
		Behavior_ContRef : StateMachine;
	};

	type StateMachine {
		States_ContRef : State*;
	};

	type State {
		Substates_ContRef : State*;
		TheContainer_Ref : State?;
		OutGoing_ContRef : StateTransition*;
		Incoming_Ref : StateTransition*;
	};

	type SubControllerState : State {
		Controller_Ref : Controller;
	};

	type ViewState : State;

	type StateTransition {
		Source_Ref : State;
		Target_Ref : State;
		Trigger_Ref : Event;
		Effect_ContRef : StateMachineAction?;
	};

	type StateMachineAction;

	type Event;
}