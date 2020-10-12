module HSM {

	type MgaObject {
		Name_Att : Text;
		Position_Att : Text;
	};

	type StateBase : MgaObject {
		DefaultTransition_Att : Text;
		Marked_Att : Logical;
		AssociationStateStatedst_Ref : AssociationStateState+;
		AssociationStateStatesrc_Ref : AssociationStateState+;
		Data_Ref : DataVar*;
		AssociationDataStateBase_Ref : AssociationDataStateBase;
	};

	type DataVar : MgaObject {
		StateBase_Ref : StateBase*;
		OrState_Ref : OrState;
		AssociationDataStateBase_Ref : AssociationDataStateBase;
	};

	type Transition : MgaObject {
		Guard_Att : Text;
		Trigger_Att : Text;
		Action_Att : Text;
		IsSync_Att : Logical;
		OrState_Ref : OrState;
		AssociationStateState_Ref : AssociationStateState;
	};

	type StateDateRelation : MgaObject {
		Value_Att : Text;
		Color_Att : Text;
	};

	type RootFolder {
		Name_Att : Text;
		RootFolders_ContRef : RootFolder*;
		OrState_ContRef : OrState*;
	};

	type OrState : CompoundState {
		RootFolder_Ref : RootFolder;
		State_ContRef : State*;
		Init_ContRef : Init;
		DataVar_ContRef : DataVar*;
		StateDataRelation_ContRef : StateDataRelation*;
		Transition_ContRef : Transition*;
		CompoundState_ContRef : CompoundState*;
	};

	type AndState : CompoundState {
		CompoundState_ContRef : CompoundState*;
	};

	type CompoundState : StateBase {
		AndState_Ref : AndState;
		OrState_Ref : OrState;
	};

	type PrimitiveState : StateBase;

	type Init : PrimitiveState {
		OrState_Ref : OrState;
	};

	type State : PrimitiveState {
		OrState_Ref : OrState;
	};

	type StateDataRelation : PrimitiveState {
		Value_Att : Text;
		Color_Att : Text;
		OrState_Ref : OrState;
		AssociationDataStateBase1_Ref : AssociationDataStateBase;
	};

	type AssociationStateState {
		Transition_Ref : Transition;
		DstTransition_Ref : StateBase+;
		SrcTransition_Ref : StateBase+;
	};

	type AssociationDataStateBase {
		StateDataRelation_Ref : StateDataRelation;
		DataVar_Ref : DataVar+;
		StateBase_Ref : StateBase+;
	};
}