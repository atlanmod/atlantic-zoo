( defstruct Element )
( defstruct ModelElement :isSpecification )
( defstruct GeneralizableElement :isRoot :isLeaf :isAbstract :isSpecification )
( defstruct Namespace :isSpecification )
( defstruct Classifier :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct Feature :ownerScope :isSpecification )
( defstruct Relationship :isSpecification )
( defstruct BehavioralFeature :isQuery :ownerScope :isSpecification )
( defstruct Operation :isRoot :isLeaf :isAbstract :isQuery :ownerScope :isSpecification )
( defstruct Parameter :type :kind :isSpecification )
( defstruct Generalization :parent :child :isSpecification )
( defstruct Signal :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct Action :isAsynchronous :isSpecification )
( defstruct CreateAction :instantiation :isAsynchronous :isSpecification )
( defstruct DestroyAction :isAsynchronous :isSpecification )
( defstruct UninterpretedAction :isAsynchronous :isSpecification )
( defstruct CallAction :operation :isAsynchronous :isSpecification )
( defstruct SendAction :signal :isAsynchronous :isSpecification )
( defstruct ActionSequence :isAsynchronous :isSpecification )
( defstruct Argument :value :isSpecification )
( defstruct Reception :signal :isRoot :isLeaf :isAbstract :isQuery :ownerScope :isSpecification )
( defstruct ReturnAction :isAsynchronous :isSpecification )
( defstruct TerminateAction :isAsynchronous :isSpecification )
( defstruct Exception :isRoot :isLeaf :isAbstract :isSpecification :isSpecification )
( defstruct StateMachine :top :isSpecification )
( defstruct Event :isSpecification )
( defstruct StateVertex :isSpecification )
( defstruct State :isSpecification )
( defstruct TimeEvent :when :isSpecification )
( defstruct CallEvent :operation :isSpecification )
( defstruct SignalEvent :signal :isSpecification )
( defstruct Transition :target :source :isSpecification )
( defstruct CompositeState :isConcurrent :isSpecification )
( defstruct ChangeEvent :changeExpression :isSpecification )
( defstruct Guard :transition :expression :isSpecification )
( defstruct Pseudostate :kind :isSpecification )
( defstruct SimpleState :isSpecification )
( defstruct SubmachineState :submachine :isConcurrent :isSpecification )
( defstruct SynchState :bound :isSpecification )
( defstruct StubState :referenceState :isSpecification )
( defstruct FinalState :isSpecification )
( defstruct Expression :body )
( defstruct BooleanExpression :body )
( defstruct ObjectSetExpression :body )
( defstruct ActionExpression :body )
( defstruct IterationExpression :body )
( defstruct TimeExpression :body )
