( defstruct DescribedElt :description )
( defstruct NamedElt :name )
( defstruct ContainerElt :name :description )
( defstruct Project :name :description )
( defstruct Package :parentPackage :name :description )
( defstruct ContainedElt :package )
( defstruct TypedElt :type )
( defstruct Document :description :name :package :type )
( defstruct Attribute :value :type )
( defstruct Requirement :text :location :name :package :type )
