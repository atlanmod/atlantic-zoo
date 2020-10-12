module PetriNet {

	type Element {
		Name_Att : Text;
	};

	type PetriNet : Element {
		Places_ContRef : Place+;
		Transitions_ContRef : Transition*;
		Arcs_ContRef : Arc*;
	};

	type Place : Element {
		Incoming_Ref : TransToPlaceArc*;
		Outgoing_Ref : PlaceToTransArc*;
	};

	type Transition : Element {
		Incoming_Ref : PlaceToTransArc+;
		Outgoing_Ref : TransToPlaceArc+;
	};

	type Arc {
		Weight_Att : Integer32;
	};

	type PlaceToTransArc : Arc {
		Source_Ref : Place;
		Target_Ref : Transition;
	};

	type TransToPlaceArc : Arc {
		Source_Ref : Transition;
		Target_Ref : Place;
	};
}