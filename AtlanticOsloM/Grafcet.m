module Grafcet {

	type LocatedElement {
		Location_Att : Text;
	};

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type Grafcet : NamedElement {
		Elements_ContRef : Element*;
		Connections_ContRef : Connection*;
	};

	type Element : NamedElement {
		Grafcet_Ref : Grafcet;
	};

	type Step : Element {
		IsInitial_Att : Logical;
		IsActive_Att : Logical;
		Action_Att : Text;
		IncomingConnections_Ref : TransitionToStep*;
		OutgoingConnections_Ref : StepToTransition*;
	};

	type Transition : Element {
		Condition_Att : Text;
		IncomingConnections_Ref : StepToTransition*;
		OutgoingConnections_Ref : TransitionToStep*;
	};

	type Connection : NamedElement {
		Grafcet_Ref : Grafcet;
	};

	type StepToTransition : Connection {
		From_Ref : Step;
		To_Ref : Transition;
	};

	type TransitionToStep : Connection {
		From_Ref : Transition;
		To_Ref : Step;
	};
}