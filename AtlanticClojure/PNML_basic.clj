( defstruct IdedElement :id )
( defstruct URI :value )
( defstruct Color )
( defstruct AnyElement :name :text )
( defstruct PNMLDocument :xmlns :nets )
( defstruct NetElement :type :document :id )
( defstruct NetContent :net )
( defstruct ToolSpecific :tool :version )
( defstruct LabeledElement )
( defstruct Label :text :namedelement )
( defstruct Name )
( defstruct Inscription :arc )
( defstruct InitialMarking :place )
( defstruct NetContentElement :node :net )
( defstruct Arc :source :target :net :id )
( defstruct Node :netcontentelement :id )
( defstruct Place :node :net )
( defstruct Transition :node :net )
( defstruct Graphics )
( defstruct NetGraphics :net )
( defstruct NodeGraphics :node :position )
( defstruct EdgeGraphics :arc )
( defstruct AnnotationGraphics :namedelement :offset )
( defstruct Coordinate :x :y )
( defstruct Position :x :y )
( defstruct Offset :annotationgraphics :x :y )
( defstruct Dimension :width :height :nodegraphics )
( defstruct Fill )
( defstruct Line )
( defstruct Font :annotationgraphics )
