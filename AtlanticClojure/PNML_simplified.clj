( defstruct LocatedElement :location )
( defstruct IdedElement :id :location )
( defstruct URI :value :location )
( defstruct PNMLDocument :xmlns :nets :location )
( defstruct NetElement :type :document :id :location )
( defstruct NetContent :net :location )
( defstruct LabeledElement :location )
( defstruct Label :text :labeledElement :location )
( defstruct Name :location )
( defstruct NetContentElement :net :location :id :location )
( defstruct Arc :source :target :net :location :id :location )
( defstruct Place :net :location :id :location )
( defstruct Transition :net :location :id :location )