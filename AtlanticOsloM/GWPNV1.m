module PetriNet {

	type Place {
		Net_Ref : Net;
		Src_Ref : Transition*;
		Dst_Ref : Transition*;
	};

	type Transition {
		Net_Ref : Net;
		Src_Ref : Place+;
		Dst_Ref : Place+;
	};

	type Net {
		Place_ContRef : Place+;
		Transition_ContRef : Transition+;
	};
}