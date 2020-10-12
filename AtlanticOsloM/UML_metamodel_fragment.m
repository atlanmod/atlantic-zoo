module UMLMetamodelFragment {

	type Class {
		Parent_Ref : Generalization;
		Child_Ref : Generalization;
		Dependency_Ref : Dependency;
	};

	type Generalization;

	type Dependency {
		Supplier_Ref : StateMachine;
		Client_Ref : Class;
		Stereotype_Ref : Stereotype;
	};

	type Stereotype {
		BaseClass_Att : Text;
		ExtendedElement_Ref : Dependency;
	};

	type StateMachine {
		Context_Ref : Class;
		Top_ContRef : State;
	};

	type State : StateVertex {
		StateMachine_Ref : StateMachine?;
		Internal_ContRef : Transition;
	};

	type CompositeState : State {
		Subvertex_ContRef : StateVertex;
	};

	type SimpleState : State;

	type FinalState : State;

	type StateVertex {
		CompositeState_Ref : CompositeState?;
	};

	type PseudoState : StateVertex;

	type Transition {
		Trigger_Ref : Event?;
		Source_Ref : StateVertex;
		Target_Ref : StateVertex;
	};

	type Event;
}