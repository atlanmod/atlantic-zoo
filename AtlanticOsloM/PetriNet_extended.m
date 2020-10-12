module PetriNet {

	type LocatedElement {
		Location_Att : Text;
	};

	type NamedElement : LocatedElement {
		Name_Att : Text;
	};

	type PetriNet : NamedElement {
		Elements_ContRef : Element*;
		Arcs_ContRef : Arc*;
		Execs_Ref : Execution*;
	};

	type Element : NamedElement {
		Net_Ref : PetriNet;
	};

	type Place : Element {
		IncomingArc_Ref : TransitionToPlace*;
		OutgoingArc_Ref : PlaceToTransition*;
	};

	type Transition : Element {
		IncomingArc_Ref : PlaceToTransition+;
		OutgoingArc_Ref : TransitionToPlace+;
	};

	type Arc : NamedElement {
		Weight_Att : Integer32;
		Net_Ref : PetriNet;
	};

	type PlaceToTransition : Arc {
		From_Ref : Place;
		To_Ref : Transition;
	};

	type TransitionToPlace : Arc {
		From_Ref : Transition;
		To_Ref : Place;
	};

	type Execution {
		Net_Ref : PetriNet;
		Markings_ContRef : Marking*;
		Movements_ContRef : Movement*;
	};

	type Token {
		PlacedAt_Ref : Place;
		Marking_Ref : Marking;
	};

	type Marking {
		Exec_Ref : Execution;
		Tokens_ContRef : Token*;
	};

	type Movement {
		Exec_Ref : Execution;
		Fire_Ref : Transition;
		Source_Ref : Marking;
		Target_Ref : Marking;
	};
}