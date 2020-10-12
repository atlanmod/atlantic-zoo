module DTMP {

	type State {
		Name_Att : Text;
		IsStart_Att : Logical;
		IsEnd_Att : Logical;
		IsFail_Att : Logical;
		Incoming_Ref : Transition*;
		OutGoing_Ref : Transition*;
		FormalParam_Ref : Parameter*;
	};

	type Transition {
		TransProb_Att : Text;
		To_Ref : State;
		From_Ref : State;
	};

	type Parameter {
		Name_Att : Text;
		Type_Att : Text;
		State_Ref : State;
	};
}