module PetriNet {

	type Place {
		Net_Ref : Net;
		Out_Ref : PTArc*;
		In_Ref : TPArc*;
	};

	type Transition {
		Net_Ref : Net;
		In_Ref : PTArc+;
		Out_Ref : TPArc+;
	};

	type Net {
		Place_ContRef : Place+;
		Transition_ContRef : Transition+;
	};

	type Arc;

	type PTArc : Arc {
		Dst_Ref : Transition;
		Src_Ref : Place;
	};

	type TPArc : Arc {
		Src_Ref : Transition;
		Dst_Ref : Place;
	};
}