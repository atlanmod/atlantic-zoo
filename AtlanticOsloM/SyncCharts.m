module OCLExpression {

	type ModelElement {
		Behavior_Ref : SyncChart*;
	};

	type SyncChart {
		Context_Ref : ModelElement?;
		ReferenceState_Ref : ReferenceState*;
	};

	type ReferenceState {
		SubSyncChart_Ref : SyncChart;
		Containers_Ref : Stg?;
	};

	type Arc : ModelElement {
		IsImmediate_Att : Logical;
		Priority_Att : Integer32;
		Target_Ref : Vertex;
		Source_Ref : Vertex;
		Stg_Ref : Stg?;
	};

	type Vertex : ModelElement {
		Incoming_Ref : Arc*;
		Outcoming_Ref : Arc*;
	};

	type PseudoState : Vertex {
		Kind_Ref : PseudoStateKind;
	};

	type PseudoStateKind;

	type State : Vertex {
		IsFinal_Att : Logical;
	};

	type SimpleState : State;

	type CompositeState : State, ReferenceState {
		CanTerminate_Att : Logical;
		IsSuspendable_Att : Logical;
		Stg_Ref : Stg+;
	};

	type Stg {
		WithFinal_Att : Logical;
		CompositeState_Ref : CompositeState;
		Arc_ContRef : Arc*;
		ReferenceState_ContRef : ReferenceState*;
	};

	type Transition : Arc {
		Kind_Ref : TransitionKind;
	};

	type TransitionKind;

	type PseudoTransition : Arc {
		Kind_Ref : PseudoTransitionKind;
	};

	type PseudoTransitionKind;
}