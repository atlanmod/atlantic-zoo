module Amble {

	type Element {
		Name_Att : Text;
	};

	type Program : Element {
		Processes_ContRef : Process*;
		Networks_ContRef : Network*;
	};

	type Process : Element {
		MinId_Att : Integer32;
		MaxId_Att : Integer32;
		InstancesNb_Att : Integer32;
		States_ContRef : State*;
		Transitions_ContRef : Transition*;
		Initial_ContRef : Action?;
		Variables_ContRef : Variable*;
		ConnectedTo_Ref : Network*;
	};

	type State : Element {
		IsInitial_Att : Logical;
		Incoming_Ref : Transition*;
		Outgoing_Ref : Transition*;
	};

	type Transition {
		Guard_ContRef : Guard?;
		Action_ContRef : Action?;
		Source_Ref : State;
		Target_Ref : State;
	};

	type Trans : Transition {
		WaitFor_Ref : Message;
	};

	type Strans : Transition;

	type Transall : Transition {
		WaitFor_Ref : Message;
	};

	type Guard : Element;

	type Action : Element;

	type Network : Element {
		Channels_ContRef : Channel*;
	};

	type Channel : Element {
		Messages_ContRef : Message*;
		Source_Ref : Process;
		Target_Ref : Process;
	};

	type Message : Element;

	type Variable : Element {
		Type_Att : Text;
		InitValue_Att : Text;
	};
}