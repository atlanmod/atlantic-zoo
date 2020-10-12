( defstruct OrganizationalStructure )
( defstruct Organization :collaborates :interacts )
( defstruct OrganizationalRule )
( defstruct SafetyRule )
( defstruct LivenessRule )
( defstruct AgentType :provides :collaborates :agentType )
( defstruct Service :inputs :outputs :pre-conditions :post-conditions )
( defstruct Role :activity :responsibility )
( defstruct Activity )
( defstruct Responsibility )
( defstruct LivenessProperty )
( defstruct SafetyProperty )
( defstruct AssociationConnector :role )
( defstruct Permission :association )
( defstruct Resource :name :description :environnement )
( defstruct Environnement )
( defstruct Action :type )
( defstruct Communication :protocol )
( defstruct Protocol :name :initiator :partner :inputs :outputs :description )