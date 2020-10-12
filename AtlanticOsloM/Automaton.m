module Automatoon {

	type FiniteAutomaton {
		Alphabet_Att : Text;
		TransitionSet_Ref : Transition*;
		InitialState_Ref : State;
		FinalStateSet_Ref : State+;
		StateSet_Ref : State*;
	};

	type Transition {
		Letter_Att : Text;
		Source_Ref : State;
		Target_Ref : State;
	};

	type State {
		Name_Att : Text;
		Combination_Ref : State;
	};
}