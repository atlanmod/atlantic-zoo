( defstruct Matlab )
( defstruct BlockDefaults :blockDefaults :model )
( defstruct Model :name :matlab :simulink )
( defstruct AnnotationDefaults :annotationDefaults :model )
( defstruct LineDefaults :lineDefaults :model )
( defstruct System :name :model :parentSubsystem )
( defstruct Subsystem :system :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Block :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Annotation :position :text :system :annotationDefaults :model )
( defstruct Line :points :system :lineDefaults :model )
( defstruct DirectLine :points :system :lineDefaults :model )
( defstruct InputPort :number :portBlock )
( defstruct Branch :points :branchedLine :nestedBranch )
( defstruct BranchedLine :points :system :lineDefaults :model )
( defstruct Primitive :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Port :number :portBlock )
( defstruct Reference :sourceType :sourceBlock :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Masked :system :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Normal :system :name :blockType :description :priority :tag :position :mySystem :blockDefaults :model )
( defstruct Parameter :name :le_reference :primitive )
( defstruct OutputPort :number :portBlock )
( defstruct Type :value :name :le_reference :primitive )
( defstruct Double :value :name :le_reference :primitive )
( defstruct INteger :value :name :le_reference :primitive )
( defstruct Enumeration :value :name :le_reference :primitive )
( defstruct BOolean :value :name :le_reference :primitive )
( defstruct Text :value :name :le_reference :primitive )
( defstruct Vector :value :name :le_reference :primitive )
( defstruct DirectBranch :points :branchedLine :nestedBranch )
( defstruct NestedBranch :points :branchedLine :nestedBranch )
( defstruct Machine :name :id :stateFlow )
( defstruct Junction :id :type :position :state :chart )
( defstruct Transition :dataLimites :id :trigger :condition :conditionAction :action :chart :state )
( defstruct Event :name :id :scope :description :trigger :machine :chart :state )
( defstruct Data :name :id :scope :description :units :dataType :state :chart :machine )
( defstruct Instance :id :name :machine )
( defstruct Target :name :id :codeCommand :description :makeCommand :codeFlags :checksumOld :machine )
( defstruct Chart :name :id :decomposotion :updateMethode :sampleTime )
( defstruct State :name :id :type :entryAction :exitAction :duringAction :eventActions :decomposition :position :chart )
( defstruct Props :initialValue :data )
( defstruct Range :maximum :minimum :props )
( defstruct Array :firstIndex :size :props )
( defstruct StateFlow :stateFlow :simulink )
( defstruct TransitionTerminal )
( defstruct Simulink )
