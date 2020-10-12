( defstruct LocatedElement :location )
( defstruct NamedElement :name :location )
( defstruct Grafcet :name :location )
( defstruct Element :grafcet :name :location )
( defstruct Step :isInitial :isActive :action :grafcet :name :location )
( defstruct Transition :condition :grafcet :name :location )
( defstruct Connection :grafcet :name :location )
( defstruct StepToTransition :from :to :grafcet :name :location )
( defstruct TransitionToStep :from :to :grafcet :name :location )