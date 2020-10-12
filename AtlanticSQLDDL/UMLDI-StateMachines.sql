CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	name text,
	visibility text,
	isSpecification Boolean,
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	ownerScope text,
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE BehavioralFeature (
	__IDBehavioralFeature__ Integer NOT NULL,
	isQuery Boolean,
	PRIMARY KEY BehavioralFeature (__IDBehavioralFeature__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	concurrency text,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	specification text,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY behavioralFeature (__FKbehavioralFeature__) REFERENCES BehavioralFeature (__IDBehavioralFeature__),
	defaultValue text,
	kind text,
	PRIMARY KEY Parameter (__IDParameter__),
	__FKbehavioralFeature__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY child (__FKchild__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	discriminator text,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKpowertype__ Integer,
	__FKparent__ Integer,
	__FKchild__ Integer
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	PRIMARY KEY Signal (__IDSignal__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY actionSequence (__FKactionSequence__) REFERENCES ActionSequence (__IDActionSequence__),
	recurrence text,
	target text,
	isAsynchronous Boolean,
	script text,
	PRIMARY KEY Action (__IDAction__),
	__FKactionSequence__ Integer
) ;

CREATE TABLE CreateAction (
	__IDCreateAction__ Integer NOT NULL,
	FOREIGN KEY instantiation (__FKinstantiation__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY CreateAction (__IDCreateAction__),
	__FKinstantiation__ Integer
) ;

CREATE TABLE DestroyAction (
	__IDDestroyAction__ Integer NOT NULL,
	PRIMARY KEY DestroyAction (__IDDestroyAction__)
) ;

CREATE TABLE UninterpretedAction (
	__IDUninterpretedAction__ Integer NOT NULL,
	PRIMARY KEY UninterpretedAction (__IDUninterpretedAction__)
) ;

CREATE TABLE CallAction (
	__IDCallAction__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY CallAction (__IDCallAction__),
	__FKoperation__ Integer
) ;

CREATE TABLE SendAction (
	__IDSendAction__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY SendAction (__IDSendAction__),
	__FKsignal__ Integer
) ;

CREATE TABLE ActionSequence (
	__IDActionSequence__ Integer NOT NULL,
	PRIMARY KEY ActionSequence (__IDActionSequence__)
) ;

CREATE TABLE Argument (
	__IDArgument__ Integer NOT NULL,
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	value text,
	PRIMARY KEY Argument (__IDArgument__),
	__FKaction__ Integer
) ;

CREATE TABLE Reception (
	__IDReception__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	specification text,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	PRIMARY KEY Reception (__IDReception__),
	__FKsignal__ Integer
) ;

CREATE TABLE ReturnAction (
	__IDReturnAction__ Integer NOT NULL,
	PRIMARY KEY ReturnAction (__IDReturnAction__)
) ;

CREATE TABLE TerminateAction (
	__IDTerminateAction__ Integer NOT NULL,
	PRIMARY KEY TerminateAction (__IDTerminateAction__)
) ;

CREATE TABLE Exception (
	__IDException__ Integer NOT NULL,
	PRIMARY KEY Exception (__IDException__)
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY top (__FKtop__) REFERENCES State (__IDState__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKcontext__ Integer,
	__FKtop__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE StateVertex (
	__IDStateVertex__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES CompositeState (__IDCompositeState__),
	PRIMARY KEY StateVertex (__IDStateVertex__),
	__FKcontainer__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	FOREIGN KEY "exit" (__FKexit__) REFERENCES Action (__IDAction__),
	FOREIGN KEY doActivity (__FKdoActivity__) REFERENCES Action (__IDAction__),
	FOREIGN KEY entry (__FKentry__) REFERENCES Action (__IDAction__),
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY State (__IDState__),
	__FKstateMachine__ Integer,
	__FKentry__ Integer,
	__FKdoActivity__ Integer,
	__FKexit__ Integer
) ;

CREATE TABLE TimeEvent (
	__IDTimeEvent__ Integer NOT NULL,
	"when" text,
	PRIMARY KEY TimeEvent (__IDTimeEvent__)
) ;

CREATE TABLE CallEvent (
	__IDCallEvent__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY CallEvent (__IDCallEvent__),
	__FKoperation__ Integer
) ;

CREATE TABLE SignalEvent (
	__IDSignalEvent__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY SignalEvent (__IDSignalEvent__),
	__FKsignal__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES StateVertex (__IDStateVertex__),
	FOREIGN KEY "trigger" (__FKtrigger__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY source (__FKsource__) REFERENCES StateVertex (__IDStateVertex__),
	FOREIGN KEY effect (__FKeffect__) REFERENCES Action (__IDAction__),
	FOREIGN KEY guard (__FKguard__) REFERENCES Guard (__IDGuard__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKsource__ Integer,
	__FKstateMachine__ Integer,
	__FKtarget__ Integer,
	__FKeffect__ Integer,
	__FKtrigger__ Integer,
	__FKguard__ Integer
) ;

CREATE TABLE CompositeState (
	__IDCompositeState__ Integer NOT NULL,
	isConcurrent Boolean,
	PRIMARY KEY CompositeState (__IDCompositeState__)
) ;

CREATE TABLE ChangeEvent (
	__IDChangeEvent__ Integer NOT NULL,
	changeExpression text,
	PRIMARY KEY ChangeEvent (__IDChangeEvent__)
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	FOREIGN KEY transition (__FKtransition__) REFERENCES Transition (__IDTransition__),
	expression text,
	PRIMARY KEY Guard (__IDGuard__),
	__FKtransition__ Integer
) ;

CREATE TABLE Pseudostate (
	__IDPseudostate__ Integer NOT NULL,
	kind text,
	PRIMARY KEY Pseudostate (__IDPseudostate__)
) ;

CREATE TABLE SimpleState (
	__IDSimpleState__ Integer NOT NULL,
	PRIMARY KEY SimpleState (__IDSimpleState__)
) ;

CREATE TABLE SubmachineState (
	__IDSubmachineState__ Integer NOT NULL,
	FOREIGN KEY submachine (__FKsubmachine__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY SubmachineState (__IDSubmachineState__),
	__FKsubmachine__ Integer
) ;

CREATE TABLE SynchState (
	__IDSynchState__ Integer NOT NULL,
	bound Integer,
	PRIMARY KEY SynchState (__IDSynchState__)
) ;

CREATE TABLE StubState (
	__IDStubState__ Integer NOT NULL,
	referenceState text,
	PRIMARY KEY StubState (__IDStubState__)
) ;

CREATE TABLE FinalState (
	__IDFinalState__ Integer NOT NULL,
	PRIMARY KEY FinalState (__IDFinalState__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	language text,
	body text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE ObjectSetExpression (
	__IDObjectSetExpression__ Integer NOT NULL,
	PRIMARY KEY ObjectSetExpression (__IDObjectSetExpression__)
) ;

CREATE TABLE ActionExpression (
	__IDActionExpression__ Integer NOT NULL,
	PRIMARY KEY ActionExpression (__IDActionExpression__)
) ;

CREATE TABLE IterationExpression (
	__IDIterationExpression__ Integer NOT NULL,
	PRIMARY KEY IterationExpression (__IDIterationExpression__)
) ;

CREATE TABLE TimeExpression (
	__IDTimeExpression__ Integer NOT NULL,
	PRIMARY KEY TimeExpression (__IDTimeExpression__)
) ;

CREATE TABLE State_deferrableEvent_Event (
	__IDState__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE CompositeState_subvertex_StateVertex (
	__IDCompositeState__ Integer NOT NULL,
	__IDStateVertex__ Integer NOT NULL
) ;

CREATE TABLE State_internalTransition_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE GeneralizableElement_generalization_Generalization (
	__IDGeneralizableElement__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_transitions_Transition (
	__IDStateMachine__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Event_parameter_Parameter (
	__IDEvent__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ActionSequence_action_Action (
	__IDActionSequence__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_parameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedElement_ModelElement (
	__IDNamespace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_outgoing_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_submachineState_SubmachineState (
	__IDStateMachine__ Integer NOT NULL,
	__IDSubmachineState__ Integer NOT NULL
) ;

CREATE TABLE Action_actualArgument_Argument (
	__IDAction__ Integer NOT NULL,
	__IDArgument__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeRange_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_incoming_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;
