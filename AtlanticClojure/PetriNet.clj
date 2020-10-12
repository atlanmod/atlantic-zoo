( defstruct Element :name )
( defstruct PetriNet :places :name )
( defstruct Place :name )
( defstruct Transition :incoming :outgoing :name )
( defstruct Arc :weight )
( defstruct PlaceToTransArc :source :target :weight )
( defstruct TransToPlaceArc :source :target :weight )