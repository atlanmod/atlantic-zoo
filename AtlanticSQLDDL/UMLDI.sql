CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	FOREIGN KEY componentInstance (__FKcomponentInstance__) REFERENCES ComponentInstance (__IDComponentInstance__),
	PRIMARY KEY Instance (__IDInstance__),
	__FKcomponentInstance__ Integer
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	PRIMARY KEY Signal (__IDSignal__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY actionSequence (__FKactionSequence__) REFERENCES ActionSequence (__IDActionSequence__),
	FOREIGN KEY recurrence (__FKrecurrence__) REFERENCES IterationExpression (__IDIterationExpression__),
	FOREIGN KEY target (__FKtarget__) REFERENCES ObjectSetExpression (__IDObjectSetExpression__),
	isAsynchronous Boolean,
	FOREIGN KEY script (__FKscript__) REFERENCES ActionExpression (__IDActionExpression__),
	PRIMARY KEY Action (__IDAction__),
	__FKscript__ Integer,
	__FKtarget__ Integer,
	__FKrecurrence__ Integer,
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

CREATE TABLE AttributeLink (
	__IDAttributeLink__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY linkEnd (__FKlinkEnd__) REFERENCES LinkEnd (__IDLinkEnd__),
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY AttributeLink (__IDAttributeLink__),
	__FKattribute__ Integer,
	__FKinstance__ Integer,
	__FKlinkEnd__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	PRIMARY KEY Link (__IDLink__),
	__FKassociation__ Integer
) ;

CREATE TABLE LinkObject (
	__IDLinkObject__ Integer NOT NULL,
	PRIMARY KEY LinkObject (__IDLinkObject__)
) ;

CREATE TABLE DataValue (
	__IDDataValue__ Integer NOT NULL,
	PRIMARY KEY DataValue (__IDDataValue__)
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
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Argument (__IDArgument__),
	__FKvalue__ Integer,
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

CREATE TABLE LinkEnd (
	__IDLinkEnd__ Integer NOT NULL,
	FOREIGN KEY link (__FKlink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	PRIMARY KEY LinkEnd (__IDLinkEnd__),
	__FKinstance__ Integer,
	__FKlink__ Integer,
	__FKassociationEnd__ Integer
) ;

CREATE TABLE ReturnAction (
	__IDReturnAction__ Integer NOT NULL,
	PRIMARY KEY ReturnAction (__IDReturnAction__)
) ;

CREATE TABLE TerminateAction (
	__IDTerminateAction__ Integer NOT NULL,
	PRIMARY KEY TerminateAction (__IDTerminateAction__)
) ;

CREATE TABLE Stimulus (
	__IDStimulus__ Integer NOT NULL,
	FOREIGN KEY communicationLink (__FKcommunicationLink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY receiver (__FKreceiver__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY dispatchAction (__FKdispatchAction__) REFERENCES Action (__IDAction__),
	FOREIGN KEY sender (__FKsender__) REFERENCES Instance (__IDInstance__),
	PRIMARY KEY Stimulus (__IDStimulus__),
	__FKcommunicationLink__ Integer,
	__FKdispatchAction__ Integer,
	__FKreceiver__ Integer,
	__FKsender__ Integer
) ;

CREATE TABLE Exception (
	__IDException__ Integer NOT NULL,
	PRIMARY KEY Exception (__IDException__)
) ;

CREATE TABLE ComponentInstance (
	__IDComponentInstance__ Integer NOT NULL,
	FOREIGN KEY nodeInstance (__FKnodeInstance__) REFERENCES NodeInstance (__IDNodeInstance__),
	PRIMARY KEY ComponentInstance (__IDComponentInstance__),
	__FKnodeInstance__ Integer
) ;

CREATE TABLE NodeInstance (
	__IDNodeInstance__ Integer NOT NULL,
	PRIMARY KEY NodeInstance (__IDNodeInstance__)
) ;

CREATE TABLE SubsystemInstance (
	__IDSubsystemInstance__ Integer NOT NULL,
	PRIMARY KEY SubsystemInstance (__IDSubsystemInstance__)
) ;

CREATE TABLE Multiplicity (
	__IDMultiplicity__ Integer NOT NULL,
	PRIMARY KEY Multiplicity (__IDMultiplicity__)
) ;

CREATE TABLE MultiplicityRange (
	__IDMultiplicityRange__ Integer NOT NULL,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	lower Integer,
	upper Integer,
	PRIMARY KEY MultiplicityRange (__IDMultiplicityRange__),
	__FKmultiplicity__ Integer
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

CREATE TABLE TypeExpression (
	__IDTypeExpression__ Integer NOT NULL,
	PRIMARY KEY TypeExpression (__IDTypeExpression__)
) ;

CREATE TABLE MappingExpression (
	__IDMappingExpression__ Integer NOT NULL,
	PRIMARY KEY MappingExpression (__IDMappingExpression__)
) ;

CREATE TABLE ProcedureExpression (
	__IDProcedureExpression__ Integer NOT NULL,
	PRIMARY KEY ProcedureExpression (__IDProcedureExpression__)
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

CREATE TABLE ArgListsExpression (
	__IDArgListsExpression__ Integer NOT NULL,
	PRIMARY KEY ArgListsExpression (__IDArgListsExpression__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	isInstantiable Boolean,
	PRIMARY KEY Subsystem (__IDSubsystem__)
) ;

CREATE TABLE ElementImport (
	__IDElementImport__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY importedElement (__FKimportedElement__) REFERENCES ModelElement (__IDModelElement__),
	visibility text,
	alias text,
	isSpecification Boolean,
	PRIMARY KEY ElementImport (__IDElementImport__),
	__FKimportedElement__ Integer,
	__FKpackage__ Integer
) ;

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

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isActive Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	ownerScope text,
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	changeability text,
	targetScope text,
	ordering text,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKtype__ Integer,
	__FKmultiplicity__ Integer
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY participant (__FKparticipant__) REFERENCES Classifier (__IDClassifier__),
	isNavigable Boolean,
	ordering text,
	aggregation text,
	targetScope text,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	changeability text,
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__),
	__FKmultiplicity__ Integer,
	__FKparticipant__ Integer,
	__FKassociation__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKbody__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	FOREIGN KEY initialValue (__FKinitialValue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKinitialValue__ Integer,
	__FKassociationEnd__ Integer
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
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES Expression (__IDExpression__),
	kind text,
	PRIMARY KEY Parameter (__IDParameter__),
	__FKbehavioralFeature__ Integer,
	__FKtype__ Integer,
	__FKdefaultValue__ Integer
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	FOREIGN KEY specification (__FKspecification__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY body (__FKbody__) REFERENCES ProcedureExpression (__IDProcedureExpression__),
	PRIMARY KEY Method (__IDMethod__),
	__FKbody__ Integer,
	__FKspecification__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY child (__FKchild__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	discriminator text,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKparent__ Integer,
	__FKpowertype__ Integer,
	__FKchild__ Integer
) ;

CREATE TABLE AssociationClass (
	__IDAssociationClass__ Integer NOT NULL,
	PRIMARY KEY AssociationClass (__IDAssociationClass__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE Abstraction (
	__IDAbstraction__ Integer NOT NULL,
	FOREIGN KEY mapping (__FKmapping__) REFERENCES MappingExpression (__IDMappingExpression__),
	PRIMARY KEY Abstraction (__IDAbstraction__),
	__FKmapping__ Integer
) ;

CREATE TABLE PresentationElement (
	__IDPresentationElement__ Integer NOT NULL,
	PRIMARY KEY PresentationElement (__IDPresentationElement__)
) ;

CREATE TABLE "Usage" (
	__IDUsage__ Integer NOT NULL,
	PRIMARY KEY "Usage" (__IDUsage__)
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	PRIMARY KEY Binding (__IDBinding__)
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Permission (
	__IDPermission__ Integer NOT NULL,
	PRIMARY KEY Permission (__IDPermission__)
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	body text,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE ElementResidence (
	__IDElementResidence__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Component (__IDComponent__),
	FOREIGN KEY resident (__FKresident__) REFERENCES ModelElement (__IDModelElement__),
	visibility text,
	PRIMARY KEY ElementResidence (__IDElementResidence__),
	__FKresident__ Integer,
	__FKcontainer__ Integer
) ;

CREATE TABLE TemplateParameter (
	__IDTemplateParameter__ Integer NOT NULL,
	FOREIGN KEY template (__FKtemplate__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY parameter (__FKparameter__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY defaultElement (__FKdefaultElement__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY TemplateParameter (__IDTemplateParameter__),
	__FKtemplate__ Integer,
	__FKdefaultElement__ Integer,
	__FKparameter__ Integer
) ;

CREATE TABLE Primitive (
	__IDPrimitive__ Integer NOT NULL,
	PRIMARY KEY Primitive (__IDPrimitive__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	FOREIGN KEY enumeration (__FKenumeration__) REFERENCES Enumeration (__IDEnumeration__),
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__),
	__FKenumeration__ Integer
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	icon text,
	PRIMARY KEY Stereotype (__IDStereotype__)
) ;

CREATE TABLE TagDefinition (
	__IDTagDefinition__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Stereotype (__IDStereotype__),
	tagType text,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY TagDefinition (__IDTagDefinition__),
	__FKmultiplicity__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE TaggedValue (
	__IDTaggedValue__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES TagDefinition (__IDTagDefinition__),
	FOREIGN KEY modelElement (__FKmodelElement__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY TaggedValue (__IDTaggedValue__),
	__FKtype__ Integer,
	__FKmodelElement__ Integer
) ;

CREATE TABLE ProgrammingLanguageDataType (
	__IDProgrammingLanguageDataType__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES TypeExpression (__IDTypeExpression__),
	PRIMARY KEY ProgrammingLanguageDataType (__IDProgrammingLanguageDataType__),
	__FKexpression__ Integer
) ;

CREATE TABLE Artifact (
	__IDArtifact__ Integer NOT NULL,
	PRIMARY KEY Artifact (__IDArtifact__)
) ;

CREATE TABLE TemplateArgument (
	__IDTemplateArgument__ Integer NOT NULL,
	FOREIGN KEY binding (__FKbinding__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY modelElement (__FKmodelElement__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY TemplateArgument (__IDTemplateArgument__),
	__FKmodelElement__ Integer,
	__FKbinding__ Integer
) ;

CREATE TABLE Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	FOREIGN KEY representedOperation (__FKrepresentedOperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY representedClassifier (__FKrepresentedClassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Collaboration (__IDCollaboration__),
	__FKrepresentedOperation__ Integer,
	__FKrepresentedClassifier__ Integer
) ;

CREATE TABLE ClassifierRole (
	__IDClassifierRole__ Integer NOT NULL,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY ClassifierRole (__IDClassifierRole__),
	__FKmultiplicity__ Integer
) ;

CREATE TABLE AssociationRole (
	__IDAssociationRole__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY AssociationRole (__IDAssociationRole__),
	__FKbase__ Integer,
	__FKmultiplicity__ Integer
) ;

CREATE TABLE AssociationEndRole (
	__IDAssociationEndRole__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	FOREIGN KEY collaborationMultiplicity (__FKcollaborationMultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY AssociationEndRole (__IDAssociationEndRole__),
	__FKcollaborationMultiplicity__ Integer,
	__FKbase__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	FOREIGN KEY interaction (__FKinteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	FOREIGN KEY communicationConnection (__FKcommunicationConnection__) REFERENCES AssociationRole (__IDAssociationRole__),
	FOREIGN KEY activator (__FKactivator__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY receiver (__FKreceiver__) REFERENCES ClassifierRole (__IDClassifierRole__),
	FOREIGN KEY sender (__FKsender__) REFERENCES ClassifierRole (__IDClassifierRole__),
	PRIMARY KEY Message (__IDMessage__),
	__FKcommunicationConnection__ Integer,
	__FKaction__ Integer,
	__FKsender__ Integer,
	__FKreceiver__ Integer,
	__FKactivator__ Integer,
	__FKinteraction__ Integer
) ;

CREATE TABLE Interaction (
	__IDInteraction__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY Interaction (__IDInteraction__),
	__FKcontext__ Integer
) ;

CREATE TABLE InteractionInstanceSet (
	__IDInteractionInstanceSet__ Integer NOT NULL,
	FOREIGN KEY interaction (__FKinteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY context (__FKcontext__) REFERENCES CollaborationInstanceSet (__IDCollaborationInstanceSet__),
	PRIMARY KEY InteractionInstanceSet (__IDInteractionInstanceSet__),
	__FKcontext__ Integer,
	__FKinteraction__ Integer
) ;

CREATE TABLE CollaborationInstanceSet (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	FOREIGN KEY collaboration (__FKcollaboration__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY CollaborationInstanceSet (__IDCollaborationInstanceSet__),
	__FKcollaboration__ Integer
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES ModelElement (__IDModelElement__),
	FOREIGN KEY top (__FKtop__) REFERENCES State (__IDState__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKtop__ Integer,
	__FKcontext__ Integer
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
	__FKdoActivity__ Integer,
	__FKstateMachine__ Integer,
	__FKentry__ Integer,
	__FKexit__ Integer
) ;

CREATE TABLE TimeEvent (
	__IDTimeEvent__ Integer NOT NULL,
	FOREIGN KEY "when" (__FKwhen__) REFERENCES TimeExpression (__IDTimeExpression__),
	PRIMARY KEY TimeEvent (__IDTimeEvent__),
	__FKwhen__ Integer
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
	__FKtarget__ Integer,
	__FKstateMachine__ Integer,
	__FKguard__ Integer,
	__FKeffect__ Integer,
	__FKsource__ Integer,
	__FKtrigger__ Integer
) ;

CREATE TABLE CompositeState (
	__IDCompositeState__ Integer NOT NULL,
	isConcurrent Boolean,
	PRIMARY KEY CompositeState (__IDCompositeState__)
) ;

CREATE TABLE ChangeEvent (
	__IDChangeEvent__ Integer NOT NULL,
	FOREIGN KEY changeExpression (__FKchangeExpression__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY ChangeEvent (__IDChangeEvent__),
	__FKchangeExpression__ Integer
) ;

CREATE TABLE Guard (
	__IDGuard__ Integer NOT NULL,
	FOREIGN KEY transition (__FKtransition__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY Guard (__IDGuard__),
	__FKtransition__ Integer,
	__FKexpression__ Integer
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

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	x "Double",
	y "Double",
	PRIMARY KEY Point (__IDPoint__)
) ;

CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	width "Double",
	height "Double",
	PRIMARY KEY Dimension (__IDDimension__)
) ;

CREATE TABLE BezierPoint (
	__IDBezierPoint__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY control1 (__FKcontrol1__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY control2 (__FKcontrol2__) REFERENCES Point (__IDPoint__),
	PRIMARY KEY BezierPoint (__IDBezierPoint__),
	__FKcontrol1__ Integer,
	__FKbase__ Integer,
	__FKcontrol2__ Integer
) ;

CREATE TABLE DiagramElement (
	__IDDiagramElement__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES GraphElement (__IDGraphElement__),
	isVisible Boolean,
	PRIMARY KEY DiagramElement (__IDDiagramElement__),
	__FKcontainer__ Integer
) ;

CREATE TABLE GraphElement (
	__IDGraphElement__ Integer NOT NULL,
	FOREIGN KEY semanticModel (__FKsemanticModel__) REFERENCES SemanticModelBridge (__IDSemanticModelBridge__),
	FOREIGN KEY position (__FKposition__) REFERENCES Point (__IDPoint__),
	PRIMARY KEY GraphElement (__IDGraphElement__),
	__FKposition__ Integer,
	__FKsemanticModel__ Integer
) ;

CREATE TABLE SemanticModelBridge (
	__IDSemanticModelBridge__ Integer NOT NULL,
	FOREIGN KEY diagram (__FKdiagram__) REFERENCES Diagram (__IDDiagram__),
	FOREIGN KEY graphElement (__FKgraphElement__) REFERENCES GraphElement (__IDGraphElement__),
	presentation text,
	PRIMARY KEY SemanticModelBridge (__IDSemanticModelBridge__),
	__FKdiagram__ Integer,
	__FKgraphElement__ Integer
) ;

CREATE TABLE GraphEdge (
	__IDGraphEdge__ Integer NOT NULL,
	PRIMARY KEY GraphEdge (__IDGraphEdge__)
) ;

CREATE TABLE GraphNode (
	__IDGraphNode__ Integer NOT NULL,
	FOREIGN KEY size (__FKsize__) REFERENCES Dimension (__IDDimension__),
	PRIMARY KEY GraphNode (__IDGraphNode__),
	__FKsize__ Integer
) ;

CREATE TABLE GraphConnector (
	__IDGraphConnector__ Integer NOT NULL,
	FOREIGN KEY graphElement (__FKgraphElement__) REFERENCES GraphElement (__IDGraphElement__),
	FOREIGN KEY position (__FKposition__) REFERENCES Point (__IDPoint__),
	PRIMARY KEY GraphConnector (__IDGraphConnector__),
	__FKposition__ Integer,
	__FKgraphElement__ Integer
) ;

CREATE TABLE LeafElement (
	__IDLeafElement__ Integer NOT NULL,
	PRIMARY KEY LeafElement (__IDLeafElement__)
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	FOREIGN KEY referenced (__FKreferenced__) REFERENCES DiagramElement (__IDDiagramElement__),
	PRIMARY KEY Reference (__IDReference__),
	__FKreferenced__ Integer
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	text text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE GraphicPrimitive (
	__IDGraphicPrimitive__ Integer NOT NULL,
	PRIMARY KEY GraphicPrimitive (__IDGraphicPrimitive__)
) ;

CREATE TABLE Polyline (
	__IDPolyline__ Integer NOT NULL,
	closed Boolean,
	PRIMARY KEY Polyline (__IDPolyline__)
) ;

CREATE TABLE Ellipse (
	__IDEllipse__ Integer NOT NULL,
	FOREIGN KEY center (__FKcenter__) REFERENCES Point (__IDPoint__),
	radiusX "Double",
	radiusY "Double",
	rotation "Double",
	startAngle "Double",
	endAngle "Double",
	PRIMARY KEY Ellipse (__IDEllipse__),
	__FKcenter__ Integer
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	uri text,
	mimeType text,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	"key" text,
	value text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE SimpleSemanticModelElement (
	__IDSimpleSemanticModelElement__ Integer NOT NULL,
	typeInfo text,
	PRIMARY KEY SimpleSemanticModelElement (__IDSimpleSemanticModelElement__)
) ;

CREATE TABLE Uml1SemanticModelBridge (
	__IDUml1SemanticModelBridge__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Uml1SemanticModelBridge (__IDUml1SemanticModelBridge__),
	__FKelement__ Integer
) ;

CREATE TABLE CoreSemanticModelBridge (
	__IDCoreSemanticModelBridge__ Integer NOT NULL,
	PRIMARY KEY CoreSemanticModelBridge (__IDCoreSemanticModelBridge__)
) ;

CREATE TABLE DiagramLink (
	__IDDiagramLink__ Integer NOT NULL,
	FOREIGN KEY graphElement (__FKgraphElement__) REFERENCES GraphElement (__IDGraphElement__),
	FOREIGN KEY diagram (__FKdiagram__) REFERENCES Diagram (__IDDiagram__),
	zoom "Double",
	FOREIGN KEY viewport (__FKviewport__) REFERENCES Point (__IDPoint__),
	PRIMARY KEY DiagramLink (__IDDiagramLink__),
	__FKviewport__ Integer,
	__FKdiagram__ Integer,
	__FKgraphElement__ Integer
) ;

CREATE TABLE Diagram (
	__IDDiagram__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES SemanticModelBridge (__IDSemanticModelBridge__),
	name text,
	zoom "Double",
	FOREIGN KEY viewport (__FKviewport__) REFERENCES Point (__IDPoint__),
	PRIMARY KEY Diagram (__IDDiagram__),
	__FKowner__ Integer,
	__FKviewport__ Integer
) ;

CREATE TABLE ActivityGraph (
	__IDActivityGraph__ Integer NOT NULL,
	PRIMARY KEY ActivityGraph (__IDActivityGraph__)
) ;

CREATE TABLE Partition (
	__IDPartition__ Integer NOT NULL,
	FOREIGN KEY activityGraph (__FKactivityGraph__) REFERENCES ActivityGraph (__IDActivityGraph__),
	PRIMARY KEY Partition (__IDPartition__),
	__FKactivityGraph__ Integer
) ;

CREATE TABLE SubactivityState (
	__IDSubactivityState__ Integer NOT NULL,
	isDynamic Boolean,
	FOREIGN KEY dynamicArguments (__FKdynamicArguments__) REFERENCES ArgListsExpression (__IDArgListsExpression__),
	FOREIGN KEY dynamicMultiplicity (__FKdynamicMultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY SubactivityState (__IDSubactivityState__),
	__FKdynamicArguments__ Integer,
	__FKdynamicMultiplicity__ Integer
) ;

CREATE TABLE ActionState (
	__IDActionState__ Integer NOT NULL,
	isDynamic Boolean,
	FOREIGN KEY dynamicArguments (__FKdynamicArguments__) REFERENCES ArgListsExpression (__IDArgListsExpression__),
	FOREIGN KEY dynamicMultiplicity (__FKdynamicMultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY ActionState (__IDActionState__),
	__FKdynamicMultiplicity__ Integer,
	__FKdynamicArguments__ Integer
) ;

CREATE TABLE CallState (
	__IDCallState__ Integer NOT NULL,
	PRIMARY KEY CallState (__IDCallState__)
) ;

CREATE TABLE ObjectFlowState (
	__IDObjectFlowState__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	isSynch Boolean,
	PRIMARY KEY ObjectFlowState (__IDObjectFlowState__),
	__FKtype__ Integer
) ;

CREATE TABLE ClassifierInState (
	__IDClassifierInState__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY ClassifierInState (__IDClassifierInState__),
	__FKtype__ Integer
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE UseCaseInstance (
	__IDUseCaseInstance__ Integer NOT NULL,
	PRIMARY KEY UseCaseInstance (__IDUseCaseInstance__)
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	FOREIGN KEY extension (__FKextension__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	PRIMARY KEY Extend (__IDExtend__),
	__FKbase__ Integer,
	__FKextension__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	FOREIGN KEY addition (__FKaddition__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Include (__IDInclude__),
	__FKbase__ Integer,
	__FKaddition__ Integer
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	location text,
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKuseCase__ Integer
) ;

CREATE TABLE CollaborationInstanceSet_participatingLink_Link (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE ActivityGraph_partition_Partition (
	__IDActivityGraph__ Integer NOT NULL,
	__IDPartition__ Integer NOT NULL
) ;

CREATE TABLE Comment_annotatedElement_ModelElement (
	__IDComment__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Binding_argument_TemplateArgument (
	__IDBinding__ Integer NOT NULL,
	__IDTemplateArgument__ Integer NOT NULL
) ;

CREATE TABLE Association_connection_AssociationEnd (
	__IDAssociation__ Integer NOT NULL,
	__IDAssociationEnd__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_base_Classifier (
	__IDClassifierRole__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Flow_target_ModelElement (
	__IDFlow__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extensionPoint_ExtensionPoint (
	__IDUseCase__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_taggedValue_TaggedValue (
	__IDModelElement__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE Flow_source_ModelElement (
	__IDFlow__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Action_actualArgument_Argument (
	__IDAction__ Integer NOT NULL,
	__IDArgument__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_incoming_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Component_residentElement_ElementResidence (
	__IDComponent__ Integer NOT NULL,
	__IDElementResidence__ Integer NOT NULL
) ;

CREATE TABLE Node_deployedComponent_Component (
	__IDNode__ Integer NOT NULL,
	__IDComponent__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_transitions_Transition (
	__IDStateMachine__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE CompositeState_subvertex_StateVertex (
	__IDCompositeState__ Integer NOT NULL,
	__IDStateVertex__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_participatingInstance_Instance (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE InteractionInstanceSet_participatingStimulus_Stimulus (
	__IDInteractionInstanceSet__ Integer NOT NULL,
	__IDStimulus__ Integer NOT NULL
) ;

CREATE TABLE Instance_slot_AttributeLink (
	__IDInstance__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_conformingInstance_Instance (
	__IDClassifierRole__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_anchorage_GraphConnector (
	__IDGraphElement__ Integer NOT NULL,
	__IDGraphConnector__ Integer NOT NULL
) ;

CREATE TABLE PresentationElement_subject_ModelElement (
	__IDPresentationElement__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE AssociationEndRole_availableQualifier_Attribute (
	__IDAssociationEndRole__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_stereotype_Stereotype (
	__IDModelElement__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;

CREATE TABLE ComponentInstance_resident_Instance (
	__IDComponentInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_constraint_Constraint (
	__IDModelElement__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Component_implementation_Artifact (
	__IDComponent__ Integer NOT NULL,
	__IDArtifact__ Integer NOT NULL
) ;

CREATE TABLE Instance_linkEnd_LinkEnd (
	__IDInstance__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_sourceFlow_Flow (
	__IDModelElement__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE Message_predecessor_Message (
	__IDMessage__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_submachineState_SubmachineState (
	__IDStateMachine__ Integer NOT NULL,
	__IDSubmachineState__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedElement_ModelElement (
	__IDNamespace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Event_parameter_Parameter (
	__IDEvent__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Instance_classifier_Classifier (
	__IDInstance__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE StateVertex_outgoing_Transition (
	__IDStateVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_targetFlow_Flow (
	__IDModelElement__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_availableFeature_Feature (
	__IDClassifierRole__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE GeneralizableElement_generalization_Generalization (
	__IDGeneralizableElement__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE ObjectFlowState_parameter_Parameter (
	__IDObjectFlowState__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeRange_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE GraphConnector_graphEdge_GraphEdge (
	__IDGraphConnector__ Integer NOT NULL,
	__IDGraphEdge__ Integer NOT NULL
) ;

CREATE TABLE AssociationRole_message_Message (
	__IDAssociationRole__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Stimulus_argument_Instance (
	__IDStimulus__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE AssociationRole_conformingLink_Link (
	__IDAssociationRole__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedLink_Link (
	__IDInstance__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Partition_contents_ModelElement (
	__IDPartition__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ClassifierInState_inState_State (
	__IDClassifierInState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE LinkEnd_qualifiedValue_AttributeLink (
	__IDLinkEnd__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_qualifier_Attribute (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Message_conformingStimulus_Stimulus (
	__IDMessage__ Integer NOT NULL,
	__IDStimulus__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedInstance_Instance (
	__IDInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE DiagramElement_reference_Reference (
	__IDDiagramElement__ Integer NOT NULL,
	__IDReference__ Integer NOT NULL
) ;

CREATE TABLE Polyline_waypoints_BezierPoint (
	__IDPolyline__ Integer NOT NULL,
	__IDBezierPoint__ Integer NOT NULL
) ;

CREATE TABLE TaggedValue_referenceValue_ModelElement (
	__IDTaggedValue__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_comment_Comment (
	__IDModelElement__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE Link_connection_LinkEnd (
	__IDLink__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE UseCase_include_Include (
	__IDUseCase__ Integer NOT NULL,
	__IDInclude__ Integer NOT NULL
) ;

CREATE TABLE Extend_extensionPoint_ExtensionPoint (
	__IDExtend__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_clientDependency_Dependency (
	__IDModelElement__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_interactionInstanceSet_InteractionInstanceSet (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDInteractionInstanceSet__ Integer NOT NULL
) ;

CREATE TABLE State_internalTransition_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_stereotypeConstraint_Constraint (
	__IDStereotype__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_link_DiagramLink (
	__IDGraphElement__ Integer NOT NULL,
	__IDDiagramLink__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_usedCollaboration_Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	__IDCollaboration__ Integer NOT NULL
) ;

CREATE TABLE Interaction_message_Message (
	__IDInteraction__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_constrainingElement_ModelElement (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_constrainingElement_ModelElement (
	__IDCollaboration__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE NodeInstance_resident_ComponentInstance (
	__IDNodeInstance__ Integer NOT NULL,
	__IDComponentInstance__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_specification_Classifier (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Package_elementImport_ElementImport (
	__IDPackage__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_definedTag_TagDefinition (
	__IDStereotype__ Integer NOT NULL,
	__IDTagDefinition__ Integer NOT NULL
) ;

CREATE TABLE GraphEdge_anchor_GraphConnector (
	__IDGraphEdge__ Integer NOT NULL,
	__IDGraphConnector__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_parameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Dependency_supplier_ModelElement (
	__IDDependency__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE State_deferrableEvent_Event (
	__IDState__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE DiagramElement_property_Property (
	__IDDiagramElement__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Multiplicity_range_MultiplicityRange (
	__IDMultiplicity__ Integer NOT NULL,
	__IDMultiplicityRange__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_availableContents_ModelElement (
	__IDClassifierRole__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_contained_DiagramElement (
	__IDGraphElement__ Integer NOT NULL,
	__IDDiagramElement__ Integer NOT NULL
) ;

CREATE TABLE ActionSequence_action_Action (
	__IDActionSequence__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_literal_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extend_Extend (
	__IDUseCase__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE Component_deploymentLocation_Node (
	__IDComponent__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_templateParameter_TemplateParameter (
	__IDModelElement__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE Dependency_client_ModelElement (
	__IDDependency__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_interaction_Interaction (
	__IDCollaboration__ Integer NOT NULL,
	__IDInteraction__ Integer NOT NULL
) ;

CREATE TABLE GraphEdge_waypoints_BezierPoint (
	__IDGraphEdge__ Integer NOT NULL,
	__IDBezierPoint__ Integer NOT NULL
) ;

CREATE TABLE Constraint_constrainedElement_ModelElement (
	__IDConstraint__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Diagram_diagramLink_DiagramLink (
	__IDDiagram__ Integer NOT NULL,
	__IDDiagramLink__ Integer NOT NULL
) ;
