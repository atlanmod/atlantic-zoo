module FSM {

	type MgaObject {
		Name_Att : Text;
		Position_Att : Text;
	};

	type Transition : MgaObject {
		StateMachine_Ref : StateMachine;
		AssociationStateState_Ref : AssociationStateState;
	};

	type State : MgaObject {
		StateMachine_Ref : StateMachine;
		AssociationStateStatedst_Ref : AssociationStateState+;
		AssociationStateStatesrc_Ref : AssociationStateState+;
	};

	type StateMachine : MgaObject {
		RootFolder_Ref : RootFolder;
		State_ContRef : State*;
		Transition_ContRef : Transition*;
	};

	type RootFolder {
		Name_Att : Text;
		RootFolders_ContRef : RootFolder*;
		StateMachine_ContRef : StateMachine*;
	};

	type AssociationStateState {
		Transition_Ref : Transition;
		DstTransition_Ref : State+;
		SrcTransition_Ref : State+;
	};
}