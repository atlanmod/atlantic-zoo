module PathExp {

	type Element {
		Name_Att : Text;
	};

	type PathExp : Element {
		States_ContRef : State+;
		Transitions_ContRef : Transition*;
	};

	type State {
		Incoming_Ref : Transition*;
		Outgoing_Ref : Transition*;
	};

	type Transition : Element {
		Source_Ref : State;
		Target_Ref : State;
	};
}