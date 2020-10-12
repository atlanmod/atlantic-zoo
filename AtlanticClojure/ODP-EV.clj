( defstruct EnterpriseObject :eoArtefactActions :eoResourceActions :eoActorActions :eoEOPD )
( defstruct ODPSystem :odpBehaviour :odpObjectives :odpSpecifier :eoArtefactActions :eoResourceActions :eoActorActions :eoEOPD )
( defstruct Party :ptyEOPD :eoArtefactActions :eoResourceActions :eoActorActions :eoEOPD )
( defstruct Objective :objSpecifier :objFulfillers )
( defstruct Scope :scOdpSystem )
( defstruct EnterpriseSpecification :esDescribedSystems :esContext )
( defstruct FieldOfApplication :faEnterpriseSpecifications )
( defstruct Policy :poSpecifier :poOwner )
( defstruct PolicyEnvelope :pePolicySetter :peValues :peCurrentValue :poSpecifier :poOwner )
( defstruct PolicyValue :pvValue :poSpecifier :poOwner )
( defstruct AssigmentPolicy :poSpecifier :poOwner )
( defstruct Contract :ctPolicies :ctObjective :ctBehaviours )
( defstruct Process :prObjectives :prDetails )
( defstruct Step :stGraphs )
( defstruct Action :actBehaviours :stGraphs )
( defstruct AccountableAction :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Prescription :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Commitment :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Declaration :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Evaluation :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Delegation :dlgEOPD :aaAccountableParty :actBehaviours :stGraphs )
( defstruct Behaviour :beObjectives :beSpecifiers :beActions )
( defstruct Community )
( defstruct CommunityObject :cobjRefinement :eoArtefactActions :eoResourceActions :eoActorActions :eoEOPD )
( defstruct Role :roleBehaviour :roleSpecifier )
( defstruct InterfaceRole :roleBehaviour :roleSpecifier )
( defstruct Violation :vioProhibitor :beObjectives :beSpecifiers :beActions )
( defstruct Rule )
( defstruct Obligation )
( defstruct Authorisation )
( defstruct Permission )
( defstruct Prohibition )
( defstruct EO_A_R :eoarSubjectRole )
( defstruct EO_P_D :eopdAgent :eopdPrincipal :eopdAction )