( defstruct Element )
( defstruct ModelElement :isSpecification )
( defstruct GeneralizableElement :isRoot :isLeaf :isAbstract :isSpecification )
( defstruct Namespace :isSpecification )
( defstruct Classifier :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct Feature :ownerScope :isSpecification )
( defstruct StructuralFeature :type :ownerScope :isSpecification )
( defstruct AssociationEnd :association :participant :isNavigable :isSpecification )
( defstruct Relationship :isSpecification )
( defstruct Association :connection :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct Attribute :type :ownerScope :isSpecification )
( defstruct BehavioralFeature :isQuery :ownerScope :isSpecification )
( defstruct Operation :isRoot :isLeaf :isAbstract :isQuery :ownerScope :isSpecification )
( defstruct Parameter :type :kind :isSpecification )
( defstruct Generalization :parent :child :isSpecification )
( defstruct Instance :classifier :isSpecification )
( defstruct Signal :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct Action :isAsynchronous :isSpecification )
( defstruct CreateAction :instantiation :isAsynchronous :isSpecification )
( defstruct DestroyAction :isAsynchronous :isSpecification )
( defstruct UninterpretedAction :isAsynchronous :isSpecification )
( defstruct AttributeLink :value :attribute :isSpecification )
( defstruct Object :classifier :isSpecification )
( defstruct Link :association :connection :isSpecification )
( defstruct LinkObject :classifier :isSpecification :association :connection :isSpecification )
( defstruct DataValue :classifier :isSpecification )
( defstruct CallAction :operation :isAsynchronous :isSpecification )
( defstruct SendAction :signal :isAsynchronous :isSpecification )
( defstruct ActionSequence :isAsynchronous :isSpecification )
( defstruct Argument :value :isSpecification )
( defstruct Reception :signal :isRoot :isLeaf :isAbstract :isQuery :ownerScope :isSpecification )
( defstruct LinkEnd :link :instance :associationEnd :isSpecification )
( defstruct ReturnAction :isAsynchronous :isSpecification )
( defstruct TerminateAction :isAsynchronous :isSpecification )
( defstruct Stimulus :receiver :dispatchAction :sender :isSpecification )
( defstruct Exception :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct ComponentInstance :classifier :isSpecification )
( defstruct NodeInstance :classifier :isSpecification )
( defstruct SubsystemInstance :classifier :isSpecification )
( defstruct Collaboration :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct ClassifierRole :base :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct AssociationRole :connection :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct AssociationEndRole :association :participant :isNavigable :isSpecification )
( defstruct Message :interaction :action :receiver :sender :isSpecification )
( defstruct Interaction :message :context :isSpecification )
( defstruct InteractionInstanceSet :context :participatingStimulus :isSpecification )
( defstruct CollaborationInstanceSet :participatingInstance :isSpecification )
( defstruct Multiplicity :range )
( defstruct MultiplicityRange :multiplicity :lower :upper )
( defstruct Expression :body )
( defstruct BooleanExpression :body )
( defstruct ObjectSetExpression :body )
( defstruct ActionExpression :body )
( defstruct IterationExpression :body )