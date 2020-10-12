CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Element (__IDElement__),
	__FKowner__ Integer
) ;

CREATE TABLE MultiplicityElement (
	__IDMultiplicityElement__ Integer NOT NULL,
	isOrdered Boolean,
	isUnique Boolean,
	lower Integer,
	upper text,
	FOREIGN KEY upperValue (__FKupperValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY lowerValue (__FKlowerValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY MultiplicityElement (__IDMultiplicityElement__),
	__FKlowerValue__ Integer,
	__FKupperValue__ Integer
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	qualifiedName text,
	visibility text,
	FOREIGN KEY nameExpression (__FKnameExpression__) REFERENCES StringExpression (__IDStringExpression__),
	PRIMARY KEY NamedElement (__IDNamedElement__),
	__FKnameExpression__ Integer
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE OpaqueExpression (
	__IDOpaqueExpression__ Integer NOT NULL,
	body text,
	language text,
	FOREIGN KEY result (__FKresult__) REFERENCES Parameter (__IDParameter__),
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY OpaqueExpression (__IDOpaqueExpression__),
	__FKbehavior__ Integer,
	__FKresult__ Integer
) ;

CREATE TABLE ValueSpecification (
	__IDValueSpecification__ Integer NOT NULL,
	PRIMARY KEY ValueSpecification (__IDValueSpecification__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	symbol text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	body text,
	FOREIGN KEY bodyExpression (__FKbodyExpression__) REFERENCES StringExpression (__IDStringExpression__),
	PRIMARY KEY Comment (__IDComment__),
	__FKbodyExpression__ Integer
) ;

CREATE TABLE DirectedRelationship (
	__IDDirectedRelationship__ Integer NOT NULL,
	PRIMARY KEY DirectedRelationship (__IDDirectedRelationship__)
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isActive Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Type (__IDType__),
	__FKpackage__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	"default" text,
	isComposite Boolean,
	isDerived Boolean,
	FOREIGN KEY class_ (__FKclass___) REFERENCES Class (__IDClass__),
	FOREIGN KEY opposite (__FKopposite__) REFERENCES Property (__IDProperty__),
	isDerivedUnion Boolean,
	FOREIGN KEY owningAssociation (__FKowningAssociation__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY datatype (__FKdatatype__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	aggregation text,
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY Property (__IDProperty__),
	__FKassociation__ Integer,
	__FKdatatype__ Integer,
	__FKdefaultValue__ Integer,
	__FKowningAssociation__ Integer,
	__FKclass___ Integer,
	__FKopposite__ Integer,
	__FKassociationEnd__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY class_ (__FKclass___) REFERENCES Class (__IDClass__),
	isQuery Boolean,
	FOREIGN KEY datatype (__FKdatatype__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY bodyCondition (__FKbodyCondition__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKdatatype__ Integer,
	__FKclass___ Integer,
	__FKbodyCondition__ Integer
) ;

CREATE TABLE TypedElement (
	__IDTypedElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypedElement (__IDTypedElement__),
	__FKtype__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	"default" text,
	direction text,
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	isException Boolean,
	isStream Boolean,
	effect text,
	PRIMARY KEY Parameter (__IDParameter__),
	__FKoperation__ Integer,
	__FKdefaultValue__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY nestingPackage (__FKnestingPackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Package (__IDPackage__),
	__FKnestingPackage__ Integer
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	FOREIGN KEY enumeration (__FKenumeration__) REFERENCES Enumeration (__IDEnumeration__),
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__),
	__FKenumeration__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	isAbstract Boolean,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES CollaborationOccurrence (__IDCollaborationOccurrence__),
	PRIMARY KEY Classifier (__IDClassifier__),
	__FKrepresentation__ Integer
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	isStatic Boolean,
	PRIMARY KEY Feature (__IDFeature__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Namespace (__IDNamespace__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	FOREIGN KEY specification (__FKspecification__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKspecification__ Integer,
	__FKnamespace__ Integer,
	__FKcontext__ Integer
) ;

CREATE TABLE LiteralBoolean (
	__IDLiteralBoolean__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY LiteralBoolean (__IDLiteralBoolean__)
) ;

CREATE TABLE LiteralSpecification (
	__IDLiteralSpecification__ Integer NOT NULL,
	PRIMARY KEY LiteralSpecification (__IDLiteralSpecification__)
) ;

CREATE TABLE LiteralString (
	__IDLiteralString__ Integer NOT NULL,
	value text,
	PRIMARY KEY LiteralString (__IDLiteralString__)
) ;

CREATE TABLE LiteralNull (
	__IDLiteralNull__ Integer NOT NULL,
	PRIMARY KEY LiteralNull (__IDLiteralNull__)
) ;

CREATE TABLE LiteralInteger (
	__IDLiteralInteger__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY LiteralInteger (__IDLiteralInteger__)
) ;

CREATE TABLE LiteralUnlimitedNatural (
	__IDLiteralUnlimitedNatural__ Integer NOT NULL,
	value text,
	PRIMARY KEY LiteralUnlimitedNatural (__IDLiteralUnlimitedNatural__)
) ;

CREATE TABLE BehavioralFeature (
	__IDBehavioralFeature__ Integer NOT NULL,
	isAbstract Boolean,
	concurrency text,
	PRIMARY KEY BehavioralFeature (__IDBehavioralFeature__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	isReadOnly Boolean,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__)
) ;

CREATE TABLE InstanceSpecification (
	__IDInstanceSpecification__ Integer NOT NULL,
	FOREIGN KEY specification (__FKspecification__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY InstanceSpecification (__IDInstanceSpecification__),
	__FKspecification__ Integer
) ;

CREATE TABLE Slot (
	__IDSlot__ Integer NOT NULL,
	FOREIGN KEY owningInstance (__FKowningInstance__) REFERENCES InstanceSpecification (__IDInstanceSpecification__),
	FOREIGN KEY definingFeature (__FKdefiningFeature__) REFERENCES StructuralFeature (__IDStructuralFeature__),
	PRIMARY KEY Slot (__IDSlot__),
	__FKdefiningFeature__ Integer,
	__FKowningInstance__ Integer
) ;

CREATE TABLE InstanceValue (
	__IDInstanceValue__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES InstanceSpecification (__IDInstanceSpecification__),
	PRIMARY KEY InstanceValue (__IDInstanceValue__),
	__FKinstance__ Integer
) ;

CREATE TABLE RedefinableElement (
	__IDRedefinableElement__ Integer NOT NULL,
	isLeaf Boolean,
	PRIMARY KEY RedefinableElement (__IDRedefinableElement__)
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY "specific" (__FKspecific__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY general (__FKgeneral__) REFERENCES Classifier (__IDClassifier__),
	isSubstitutable Boolean,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKgeneral__ Integer,
	__FKspecific__ Integer
) ;

CREATE TABLE PackageableElement (
	__IDPackageableElement__ Integer NOT NULL,
	packageableElement_visibility text,
	PRIMARY KEY PackageableElement (__IDPackageableElement__)
) ;

CREATE TABLE ElementImport (
	__IDElementImport__ Integer NOT NULL,
	visibility text,
	alias text,
	FOREIGN KEY importedElement (__FKimportedElement__) REFERENCES PackageableElement (__IDPackageableElement__),
	FOREIGN KEY importingNamespace (__FKimportingNamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY ElementImport (__IDElementImport__),
	__FKimportedElement__ Integer,
	__FKimportingNamespace__ Integer
) ;

CREATE TABLE PackageImport (
	__IDPackageImport__ Integer NOT NULL,
	visibility text,
	FOREIGN KEY importedPackage (__FKimportedPackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY importingNamespace (__FKimportingNamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY PackageImport (__IDPackageImport__),
	__FKimportingNamespace__ Integer,
	__FKimportedPackage__ Integer
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	isDerived Boolean,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE PackageMerge (
	__IDPackageMerge__ Integer NOT NULL,
	FOREIGN KEY mergingPackage (__FKmergingPackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY mergedPackage (__FKmergedPackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY PackageMerge (__IDPackageMerge__),
	__FKmergedPackage__ Integer,
	__FKmergingPackage__ Integer
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	PRIMARY KEY Stereotype (__IDStereotype__)
) ;

CREATE TABLE Profile (
	__IDProfile__ Integer NOT NULL,
	PRIMARY KEY Profile (__IDProfile__)
) ;

CREATE TABLE ProfileApplication (
	__IDProfileApplication__ Integer NOT NULL,
	FOREIGN KEY importedProfile (__FKimportedProfile__) REFERENCES Profile (__IDProfile__),
	PRIMARY KEY ProfileApplication (__IDProfileApplication__),
	__FKimportedProfile__ Integer
) ;

CREATE TABLE Extension (
	__IDExtension__ Integer NOT NULL,
	isRequired Boolean,
	FOREIGN KEY metaclass (__FKmetaclass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Extension (__IDExtension__),
	__FKmetaclass__ Integer
) ;

CREATE TABLE ExtensionEnd (
	__IDExtensionEnd__ Integer NOT NULL,
	PRIMARY KEY ExtensionEnd (__IDExtensionEnd__)
) ;

CREATE TABLE Behavior (
	__IDBehavior__ Integer NOT NULL,
	isReentrant Boolean,
	FOREIGN KEY context (__FKcontext__) REFERENCES BehavioredClassifier (__IDBehavioredClassifier__),
	FOREIGN KEY specification (__FKspecification__) REFERENCES BehavioralFeature (__IDBehavioralFeature__),
	PRIMARY KEY Behavior (__IDBehavior__),
	__FKcontext__ Integer,
	__FKspecification__ Integer
) ;

CREATE TABLE BehavioredClassifier (
	__IDBehavioredClassifier__ Integer NOT NULL,
	FOREIGN KEY classifierBehavior (__FKclassifierBehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY BehavioredClassifier (__IDBehavioredClassifier__),
	__FKclassifierBehavior__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	body text,
	language text,
	isSingleExecution Boolean,
	isReadOnly Boolean,
	PRIMARY KEY Activity (__IDActivity__)
) ;

CREATE TABLE Permission (
	__IDPermission__ Integer NOT NULL,
	PRIMARY KEY Permission (__IDPermission__)
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE "Usage" (
	__IDUsage__ Integer NOT NULL,
	PRIMARY KEY "Usage" (__IDUsage__)
) ;

CREATE TABLE Abstraction (
	__IDAbstraction__ Integer NOT NULL,
	FOREIGN KEY mapping (__FKmapping__) REFERENCES OpaqueExpression (__IDOpaqueExpression__),
	PRIMARY KEY Abstraction (__IDAbstraction__),
	__FKmapping__ Integer
) ;

CREATE TABLE Realization (
	__IDRealization__ Integer NOT NULL,
	FOREIGN KEY abstraction (__FKabstraction__) REFERENCES Component (__IDComponent__),
	FOREIGN KEY realizingClassifier (__FKrealizingClassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Realization (__IDRealization__),
	__FKabstraction__ Integer,
	__FKrealizingClassifier__ Integer
) ;

CREATE TABLE Substitution (
	__IDSubstitution__ Integer NOT NULL,
	FOREIGN KEY contract (__FKcontract__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY substitutingClassifier (__FKsubstitutingClassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Substitution (__IDSubstitution__),
	__FKcontract__ Integer,
	__FKsubstitutingClassifier__ Integer
) ;

CREATE TABLE GeneralizationSet (
	__IDGeneralizationSet__ Integer NOT NULL,
	isCovering Boolean,
	isDisjoint Boolean,
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY GeneralizationSet (__IDGeneralizationSet__),
	__FKpowertype__ Integer
) ;

CREATE TABLE AssociationClass (
	__IDAssociationClass__ Integer NOT NULL,
	PRIMARY KEY AssociationClass (__IDAssociationClass__)
) ;

CREATE TABLE InformationItem (
	__IDInformationItem__ Integer NOT NULL,
	PRIMARY KEY InformationItem (__IDInformationItem__)
) ;

CREATE TABLE InformationFlow (
	__IDInformationFlow__ Integer NOT NULL,
	PRIMARY KEY InformationFlow (__IDInformationFlow__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	viewpoint text,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE ConnectorEnd (
	__IDConnectorEnd__ Integer NOT NULL,
	FOREIGN KEY definingEnd (__FKdefiningEnd__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY role (__FKrole__) REFERENCES ConnectableElement (__IDConnectableElement__),
	FOREIGN KEY partWithPort (__FKpartWithPort__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY ConnectorEnd (__IDConnectorEnd__),
	__FKdefiningEnd__ Integer,
	__FKpartWithPort__ Integer,
	__FKrole__ Integer
) ;

CREATE TABLE ConnectableElement (
	__IDConnectableElement__ Integer NOT NULL,
	PRIMARY KEY ConnectableElement (__IDConnectableElement__)
) ;

CREATE TABLE Connector (
	__IDConnector__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Association (__IDAssociation__),
	kind text,
	PRIMARY KEY Connector (__IDConnector__),
	__FKtype__ Integer
) ;

CREATE TABLE StructuredClassifier (
	__IDStructuredClassifier__ Integer NOT NULL,
	PRIMARY KEY StructuredClassifier (__IDStructuredClassifier__)
) ;

CREATE TABLE ActivityEdge (
	__IDActivityEdge__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY source (__FKsource__) REFERENCES ActivityNode (__IDActivityNode__),
	FOREIGN KEY target (__FKtarget__) REFERENCES ActivityNode (__IDActivityNode__),
	FOREIGN KEY guard (__FKguard__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY inStructuredNode (__FKinStructuredNode__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	FOREIGN KEY weight (__FKweight__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY interrupts (__FKinterrupts__) REFERENCES InterruptibleActivityRegion (__IDInterruptibleActivityRegion__),
	PRIMARY KEY ActivityEdge (__IDActivityEdge__),
	__FKguard__ Integer,
	__FKactivity__ Integer,
	__FKinStructuredNode__ Integer,
	__FKtarget__ Integer,
	__FKweight__ Integer,
	__FKinterrupts__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE ActivityGroup (
	__IDActivityGroup__ Integer NOT NULL,
	FOREIGN KEY superGroup (__FKsuperGroup__) REFERENCES ActivityGroup (__IDActivityGroup__),
	FOREIGN KEY activityGroup_activity (__FKactivityGroup_activity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ActivityGroup (__IDActivityGroup__),
	__FKactivityGroup_activity__ Integer,
	__FKsuperGroup__ Integer
) ;

CREATE TABLE ActivityNode (
	__IDActivityNode__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY inStructuredNode (__FKinStructuredNode__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	PRIMARY KEY ActivityNode (__IDActivityNode__),
	__FKinStructuredNode__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	effect text,
	FOREIGN KEY context (__FKcontext__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Action (__IDAction__),
	__FKcontext__ Integer
) ;

CREATE TABLE ObjectNode (
	__IDObjectNode__ Integer NOT NULL,
	ordering text,
	FOREIGN KEY upperBound (__FKupperBound__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY selection (__FKselection__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY ObjectNode (__IDObjectNode__),
	__FKselection__ Integer,
	__FKupperBound__ Integer
) ;

CREATE TABLE ControlNode (
	__IDControlNode__ Integer NOT NULL,
	PRIMARY KEY ControlNode (__IDControlNode__)
) ;

CREATE TABLE ControlFlow (
	__IDControlFlow__ Integer NOT NULL,
	PRIMARY KEY ControlFlow (__IDControlFlow__)
) ;

CREATE TABLE ObjectFlow (
	__IDObjectFlow__ Integer NOT NULL,
	isMulticast Boolean,
	isMultireceive Boolean,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Behavior (__IDBehavior__),
	FOREIGN KEY selection (__FKselection__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY ObjectFlow (__IDObjectFlow__),
	__FKtransformation__ Integer,
	__FKselection__ Integer
) ;

CREATE TABLE InitialNode (
	__IDInitialNode__ Integer NOT NULL,
	PRIMARY KEY InitialNode (__IDInitialNode__)
) ;

CREATE TABLE FinalNode (
	__IDFinalNode__ Integer NOT NULL,
	PRIMARY KEY FinalNode (__IDFinalNode__)
) ;

CREATE TABLE ActivityFinalNode (
	__IDActivityFinalNode__ Integer NOT NULL,
	PRIMARY KEY ActivityFinalNode (__IDActivityFinalNode__)
) ;

CREATE TABLE DecisionNode (
	__IDDecisionNode__ Integer NOT NULL,
	FOREIGN KEY decisionInput (__FKdecisionInput__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY DecisionNode (__IDDecisionNode__),
	__FKdecisionInput__ Integer
) ;

CREATE TABLE MergeNode (
	__IDMergeNode__ Integer NOT NULL,
	PRIMARY KEY MergeNode (__IDMergeNode__)
) ;

CREATE TABLE ExecutableNode (
	__IDExecutableNode__ Integer NOT NULL,
	PRIMARY KEY ExecutableNode (__IDExecutableNode__)
) ;

CREATE TABLE OutputPin (
	__IDOutputPin__ Integer NOT NULL,
	PRIMARY KEY OutputPin (__IDOutputPin__)
) ;

CREATE TABLE InputPin (
	__IDInputPin__ Integer NOT NULL,
	PRIMARY KEY InputPin (__IDInputPin__)
) ;

CREATE TABLE Pin (
	__IDPin__ Integer NOT NULL,
	PRIMARY KEY Pin (__IDPin__)
) ;

CREATE TABLE ActivityParameterNode (
	__IDActivityParameterNode__ Integer NOT NULL,
	FOREIGN KEY parameter (__FKparameter__) REFERENCES Parameter (__IDParameter__),
	PRIMARY KEY ActivityParameterNode (__IDActivityParameterNode__),
	__FKparameter__ Integer
) ;

CREATE TABLE ValuePin (
	__IDValuePin__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY ValuePin (__IDValuePin__),
	__FKvalue__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY Interface (__IDInterface__),
	__FKprotocol__ Integer
) ;

CREATE TABLE Implementation (
	__IDImplementation__ Integer NOT NULL,
	FOREIGN KEY contract (__FKcontract__) REFERENCES Interface (__IDInterface__),
	FOREIGN KEY implementingClassifier (__FKimplementingClassifier__) REFERENCES BehavioredClassifier (__IDBehavioredClassifier__),
	PRIMARY KEY Implementation (__IDImplementation__),
	__FKimplementingClassifier__ Integer,
	__FKcontract__ Integer
) ;

CREATE TABLE Artifact (
	__IDArtifact__ Integer NOT NULL,
	fileName text,
	PRIMARY KEY Artifact (__IDArtifact__)
) ;

CREATE TABLE Manifestation (
	__IDManifestation__ Integer NOT NULL,
	FOREIGN KEY utilizedElement (__FKutilizedElement__) REFERENCES PackageableElement (__IDPackageableElement__),
	PRIMARY KEY Manifestation (__IDManifestation__),
	__FKutilizedElement__ Integer
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	FOREIGN KEY extendedCase (__FKextendedCase__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY extension (__FKextension__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY Extend (__IDExtend__),
	__FKextendedCase__ Integer,
	__FKcondition__ Integer,
	__FKextension__ Integer
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKuseCase__ Integer
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	FOREIGN KEY includingCase (__FKincludingCase__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY addition (__FKaddition__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Include (__IDInclude__),
	__FKaddition__ Integer,
	__FKincludingCase__ Integer
) ;

CREATE TABLE CollaborationOccurrence (
	__IDCollaborationOccurrence__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY CollaborationOccurrence (__IDCollaborationOccurrence__),
	__FKtype__ Integer
) ;

CREATE TABLE Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	PRIMARY KEY Collaboration (__IDCollaboration__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	isBehavior Boolean,
	isService Boolean,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY Port (__IDPort__),
	__FKprotocol__ Integer
) ;

CREATE TABLE EncapsulatedClassifier (
	__IDEncapsulatedClassifier__ Integer NOT NULL,
	PRIMARY KEY EncapsulatedClassifier (__IDEncapsulatedClassifier__)
) ;

CREATE TABLE CallTrigger (
	__IDCallTrigger__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY CallTrigger (__IDCallTrigger__),
	__FKoperation__ Integer
) ;

CREATE TABLE MessageTrigger (
	__IDMessageTrigger__ Integer NOT NULL,
	PRIMARY KEY MessageTrigger (__IDMessageTrigger__)
) ;

CREATE TABLE ChangeTrigger (
	__IDChangeTrigger__ Integer NOT NULL,
	FOREIGN KEY changeExpression (__FKchangeExpression__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY ChangeTrigger (__IDChangeTrigger__),
	__FKchangeExpression__ Integer
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	PRIMARY KEY "Trigger" (__IDTrigger__)
) ;

CREATE TABLE Reception (
	__IDReception__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY Reception (__IDReception__),
	__FKsignal__ Integer
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	PRIMARY KEY Signal (__IDSignal__)
) ;

CREATE TABLE SignalTrigger (
	__IDSignalTrigger__ Integer NOT NULL,
	PRIMARY KEY SignalTrigger (__IDSignalTrigger__)
) ;

CREATE TABLE TimeTrigger (
	__IDTimeTrigger__ Integer NOT NULL,
	isRelative Boolean,
	FOREIGN KEY "when" (__FKwhen__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY TimeTrigger (__IDTimeTrigger__),
	__FKwhen__ Integer
) ;

CREATE TABLE AnyTrigger (
	__IDAnyTrigger__ Integer NOT NULL,
	PRIMARY KEY AnyTrigger (__IDAnyTrigger__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY scope (__FKscope__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKscope__ Integer
) ;

CREATE TABLE StructuredActivityNode (
	__IDStructuredActivityNode__ Integer NOT NULL,
	mustIsolate Boolean,
	PRIMARY KEY StructuredActivityNode (__IDStructuredActivityNode__)
) ;

CREATE TABLE ConditionalNode (
	__IDConditionalNode__ Integer NOT NULL,
	isDeterminate Boolean,
	isAssured Boolean,
	PRIMARY KEY ConditionalNode (__IDConditionalNode__)
) ;

CREATE TABLE Clause (
	__IDClause__ Integer NOT NULL,
	FOREIGN KEY decider (__FKdecider__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY Clause (__IDClause__),
	__FKdecider__ Integer
) ;

CREATE TABLE LoopNode (
	__IDLoopNode__ Integer NOT NULL,
	isTestedFirst Boolean,
	FOREIGN KEY decider (__FKdecider__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY LoopNode (__IDLoopNode__),
	__FKdecider__ Integer
) ;

CREATE TABLE Interaction (
	__IDInteraction__ Integer NOT NULL,
	PRIMARY KEY Interaction (__IDInteraction__)
) ;

CREATE TABLE InteractionFragment (
	__IDInteractionFragment__ Integer NOT NULL,
	FOREIGN KEY enclosingInteraction (__FKenclosingInteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY enclosingOperand (__FKenclosingOperand__) REFERENCES InteractionOperand (__IDInteractionOperand__),
	PRIMARY KEY InteractionFragment (__IDInteractionFragment__),
	__FKenclosingOperand__ Integer,
	__FKenclosingInteraction__ Integer
) ;

CREATE TABLE Lifeline (
	__IDLifeline__ Integer NOT NULL,
	FOREIGN KEY represents (__FKrepresents__) REFERENCES ConnectableElement (__IDConnectableElement__),
	FOREIGN KEY interaction (__FKinteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY selector (__FKselector__) REFERENCES OpaqueExpression (__IDOpaqueExpression__),
	FOREIGN KEY decomposedAs (__FKdecomposedAs__) REFERENCES PartDecomposition (__IDPartDecomposition__),
	PRIMARY KEY Lifeline (__IDLifeline__),
	__FKdecomposedAs__ Integer,
	__FKselector__ Integer,
	__FKinteraction__ Integer,
	__FKrepresents__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	messageKind text,
	messageSort text,
	FOREIGN KEY receiveEvent (__FKreceiveEvent__) REFERENCES MessageEnd (__IDMessageEnd__),
	FOREIGN KEY sendEvent (__FKsendEvent__) REFERENCES MessageEnd (__IDMessageEnd__),
	FOREIGN KEY connector (__FKconnector__) REFERENCES Connector (__IDConnector__),
	FOREIGN KEY interaction (__FKinteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY signature (__FKsignature__) REFERENCES NamedElement (__IDNamedElement__),
	PRIMARY KEY Message (__IDMessage__),
	__FKsignature__ Integer,
	__FKreceiveEvent__ Integer,
	__FKinteraction__ Integer,
	__FKconnector__ Integer,
	__FKsendEvent__ Integer
) ;

CREATE TABLE GeneralOrdering (
	__IDGeneralOrdering__ Integer NOT NULL,
	FOREIGN KEY "before" (__FKbefore__) REFERENCES EventOccurrence (__IDEventOccurrence__),
	FOREIGN KEY after (__FKafter__) REFERENCES EventOccurrence (__IDEventOccurrence__),
	PRIMARY KEY GeneralOrdering (__IDGeneralOrdering__),
	__FKafter__ Integer,
	__FKbefore__ Integer
) ;

CREATE TABLE MessageEnd (
	__IDMessageEnd__ Integer NOT NULL,
	FOREIGN KEY receiveMessage (__FKreceiveMessage__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY sendMessage (__FKsendMessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY MessageEnd (__IDMessageEnd__),
	__FKsendMessage__ Integer,
	__FKreceiveMessage__ Integer
) ;

CREATE TABLE EventOccurrence (
	__IDEventOccurrence__ Integer NOT NULL,
	PRIMARY KEY EventOccurrence (__IDEventOccurrence__)
) ;

CREATE TABLE ExecutionOccurrence (
	__IDExecutionOccurrence__ Integer NOT NULL,
	FOREIGN KEY start (__FKstart__) REFERENCES EventOccurrence (__IDEventOccurrence__),
	FOREIGN KEY finish (__FKfinish__) REFERENCES EventOccurrence (__IDEventOccurrence__),
	PRIMARY KEY ExecutionOccurrence (__IDExecutionOccurrence__),
	__FKfinish__ Integer,
	__FKstart__ Integer
) ;

CREATE TABLE StateInvariant (
	__IDStateInvariant__ Integer NOT NULL,
	FOREIGN KEY invariant (__FKinvariant__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY StateInvariant (__IDStateInvariant__),
	__FKinvariant__ Integer
) ;

CREATE TABLE Stop (
	__IDStop__ Integer NOT NULL,
	PRIMARY KEY Stop (__IDStop__)
) ;

CREATE TABLE TemplateSignature (
	__IDTemplateSignature__ Integer NOT NULL,
	FOREIGN KEY nestingSignature (__FKnestingSignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	FOREIGN KEY template (__FKtemplate__) REFERENCES TemplateableElement (__IDTemplateableElement__),
	PRIMARY KEY TemplateSignature (__IDTemplateSignature__),
	__FKtemplate__ Integer,
	__FKnestingSignature__ Integer
) ;

CREATE TABLE TemplateParameter (
	__IDTemplateParameter__ Integer NOT NULL,
	FOREIGN KEY signature (__FKsignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	FOREIGN KEY parameteredElement (__FKparameteredElement__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY ownedParameteredElement (__FKownedParameteredElement__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY "default" (__FKdefault__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY ownedDefault (__FKownedDefault__) REFERENCES ParameterableElement (__IDParameterableElement__),
	PRIMARY KEY TemplateParameter (__IDTemplateParameter__),
	__FKdefault__ Integer,
	__FKparameteredElement__ Integer,
	__FKownedDefault__ Integer,
	__FKownedParameteredElement__ Integer,
	__FKsignature__ Integer
) ;

CREATE TABLE TemplateableElement (
	__IDTemplateableElement__ Integer NOT NULL,
	FOREIGN KEY ownedTemplateSignature (__FKownedTemplateSignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	PRIMARY KEY TemplateableElement (__IDTemplateableElement__),
	__FKownedTemplateSignature__ Integer
) ;

CREATE TABLE StringExpression (
	__IDStringExpression__ Integer NOT NULL,
	FOREIGN KEY owningExpression (__FKowningExpression__) REFERENCES StringExpression (__IDStringExpression__),
	PRIMARY KEY StringExpression (__IDStringExpression__),
	__FKowningExpression__ Integer
) ;

CREATE TABLE ParameterableElement (
	__IDParameterableElement__ Integer NOT NULL,
	FOREIGN KEY templateParameter (__FKtemplateParameter__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	FOREIGN KEY owningParameter (__FKowningParameter__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	PRIMARY KEY ParameterableElement (__IDParameterableElement__),
	__FKowningParameter__ Integer,
	__FKtemplateParameter__ Integer
) ;

CREATE TABLE TemplateBinding (
	__IDTemplateBinding__ Integer NOT NULL,
	FOREIGN KEY boundElement (__FKboundElement__) REFERENCES TemplateableElement (__IDTemplateableElement__),
	FOREIGN KEY signature (__FKsignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	PRIMARY KEY TemplateBinding (__IDTemplateBinding__),
	__FKboundElement__ Integer,
	__FKsignature__ Integer
) ;

CREATE TABLE TemplateParameterSubstitution (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	FOREIGN KEY formal (__FKformal__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	FOREIGN KEY templateBinding (__FKtemplateBinding__) REFERENCES TemplateBinding (__IDTemplateBinding__),
	PRIMARY KEY TemplateParameterSubstitution (__IDTemplateParameterSubstitution__),
	__FKformal__ Integer,
	__FKtemplateBinding__ Integer
) ;

CREATE TABLE OperationTemplateParameter (
	__IDOperationTemplateParameter__ Integer NOT NULL,
	PRIMARY KEY OperationTemplateParameter (__IDOperationTemplateParameter__)
) ;

CREATE TABLE ClassifierTemplateParameter (
	__IDClassifierTemplateParameter__ Integer NOT NULL,
	allowSubstitutable Boolean,
	PRIMARY KEY ClassifierTemplateParameter (__IDClassifierTemplateParameter__)
) ;

CREATE TABLE ParameterableClassifier (
	__IDParameterableClassifier__ Integer NOT NULL,
	PRIMARY KEY ParameterableClassifier (__IDParameterableClassifier__)
) ;

CREATE TABLE RedefinableTemplateSignature (
	__IDRedefinableTemplateSignature__ Integer NOT NULL,
	PRIMARY KEY RedefinableTemplateSignature (__IDRedefinableTemplateSignature__)
) ;

CREATE TABLE TemplateableClassifier (
	__IDTemplateableClassifier__ Integer NOT NULL,
	PRIMARY KEY TemplateableClassifier (__IDTemplateableClassifier__)
) ;

CREATE TABLE ConnectableElementTemplateParameter (
	__IDConnectableElementTemplateParameter__ Integer NOT NULL,
	PRIMARY KEY ConnectableElementTemplateParameter (__IDConnectableElementTemplateParameter__)
) ;

CREATE TABLE ForkNode (
	__IDForkNode__ Integer NOT NULL,
	PRIMARY KEY ForkNode (__IDForkNode__)
) ;

CREATE TABLE JoinNode (
	__IDJoinNode__ Integer NOT NULL,
	isCombineDuplicate Boolean,
	FOREIGN KEY joinSpec (__FKjoinSpec__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY JoinNode (__IDJoinNode__),
	__FKjoinSpec__ Integer
) ;

CREATE TABLE FlowFinalNode (
	__IDFlowFinalNode__ Integer NOT NULL,
	PRIMARY KEY FlowFinalNode (__IDFlowFinalNode__)
) ;

CREATE TABLE CentralBufferNode (
	__IDCentralBufferNode__ Integer NOT NULL,
	PRIMARY KEY CentralBufferNode (__IDCentralBufferNode__)
) ;

CREATE TABLE ActivityPartition (
	__IDActivityPartition__ Integer NOT NULL,
	isDimension Boolean,
	isExternal Boolean,
	FOREIGN KEY superPartition (__FKsuperPartition__) REFERENCES ActivityPartition (__IDActivityPartition__),
	FOREIGN KEY represents (__FKrepresents__) REFERENCES Element (__IDElement__),
	PRIMARY KEY ActivityPartition (__IDActivityPartition__),
	__FKsuperPartition__ Integer,
	__FKrepresents__ Integer
) ;

CREATE TABLE ExpansionNode (
	__IDExpansionNode__ Integer NOT NULL,
	FOREIGN KEY regionAsOutput (__FKregionAsOutput__) REFERENCES ExpansionRegion (__IDExpansionRegion__),
	FOREIGN KEY regionAsInput (__FKregionAsInput__) REFERENCES ExpansionRegion (__IDExpansionRegion__),
	PRIMARY KEY ExpansionNode (__IDExpansionNode__),
	__FKregionAsInput__ Integer,
	__FKregionAsOutput__ Integer
) ;

CREATE TABLE ExpansionRegion (
	__IDExpansionRegion__ Integer NOT NULL,
	mode text,
	PRIMARY KEY ExpansionRegion (__IDExpansionRegion__)
) ;

CREATE TABLE ExceptionHandler (
	__IDExceptionHandler__ Integer NOT NULL,
	FOREIGN KEY protectedNode (__FKprotectedNode__) REFERENCES ExecutableNode (__IDExecutableNode__),
	FOREIGN KEY handlerBody (__FKhandlerBody__) REFERENCES ExecutableNode (__IDExecutableNode__),
	FOREIGN KEY exceptionInput (__FKexceptionInput__) REFERENCES ObjectNode (__IDObjectNode__),
	PRIMARY KEY ExceptionHandler (__IDExceptionHandler__),
	__FKhandlerBody__ Integer,
	__FKprotectedNode__ Integer,
	__FKexceptionInput__ Integer
) ;

CREATE TABLE InteractionOccurrence (
	__IDInteractionOccurrence__ Integer NOT NULL,
	FOREIGN KEY refersTo (__FKrefersTo__) REFERENCES Interaction (__IDInteraction__),
	PRIMARY KEY InteractionOccurrence (__IDInteractionOccurrence__),
	__FKrefersTo__ Integer
) ;

CREATE TABLE Gate (
	__IDGate__ Integer NOT NULL,
	PRIMARY KEY Gate (__IDGate__)
) ;

CREATE TABLE PartDecomposition (
	__IDPartDecomposition__ Integer NOT NULL,
	PRIMARY KEY PartDecomposition (__IDPartDecomposition__)
) ;

CREATE TABLE InteractionOperand (
	__IDInteractionOperand__ Integer NOT NULL,
	FOREIGN KEY guard (__FKguard__) REFERENCES InteractionConstraint (__IDInteractionConstraint__),
	PRIMARY KEY InteractionOperand (__IDInteractionOperand__),
	__FKguard__ Integer
) ;

CREATE TABLE InteractionConstraint (
	__IDInteractionConstraint__ Integer NOT NULL,
	FOREIGN KEY minint (__FKminint__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY maxint (__FKmaxint__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY InteractionConstraint (__IDInteractionConstraint__),
	__FKminint__ Integer,
	__FKmaxint__ Integer
) ;

CREATE TABLE CombinedFragment (
	__IDCombinedFragment__ Integer NOT NULL,
	interactionOperator text,
	PRIMARY KEY CombinedFragment (__IDCombinedFragment__)
) ;

CREATE TABLE Continuation (
	__IDContinuation__ Integer NOT NULL,
	setting Boolean,
	PRIMARY KEY Continuation (__IDContinuation__)
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY extendedStateMachine (__FKextendedStateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY stateMachine_redefinitionContext (__FKstateMachine_redefinitionContext__) REFERENCES BehavioredClassifier (__IDBehavioredClassifier__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKstateMachine_redefinitionContext__ Integer,
	__FKextendedStateMachine__ Integer
) ;

CREATE TABLE Region (
	__IDRegion__ Integer NOT NULL,
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	FOREIGN KEY extendedRegion (__FKextendedRegion__) REFERENCES Region (__IDRegion__),
	PRIMARY KEY Region (__IDRegion__),
	__FKstate__ Integer,
	__FKstateMachine__ Integer,
	__FKextendedRegion__ Integer
) ;

CREATE TABLE Pseudostate (
	__IDPseudostate__ Integer NOT NULL,
	kind text,
	PRIMARY KEY Pseudostate (__IDPseudostate__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	isComposite Boolean,
	isOrthogonal Boolean,
	isSimple Boolean,
	isSubmachineState Boolean,
	FOREIGN KEY submachine (__FKsubmachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY redefinedState (__FKredefinedState__) REFERENCES State (__IDState__),
	FOREIGN KEY entry (__FKentry__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "exit" (__FKexit__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY doActivity (__FKdoActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY stateInvariant (__FKstateInvariant__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY State (__IDState__),
	__FKredefinedState__ Integer,
	__FKdoActivity__ Integer,
	__FKsubmachine__ Integer,
	__FKexit__ Integer,
	__FKstateInvariant__ Integer,
	__FKentry__ Integer
) ;

CREATE TABLE Vertex (
	__IDVertex__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Region (__IDRegion__),
	PRIMARY KEY Vertex (__IDVertex__),
	__FKcontainer__ Integer
) ;

CREATE TABLE ConnectionPointReference (
	__IDConnectionPointReference__ Integer NOT NULL,
	PRIMARY KEY ConnectionPointReference (__IDConnectionPointReference__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	kind text,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Region (__IDRegion__),
	FOREIGN KEY source (__FKsource__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY redefinedTransition (__FKredefinedTransition__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY guard (__FKguard__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY effect (__FKeffect__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKeffect__ Integer,
	__FKguard__ Integer,
	__FKtarget__ Integer,
	__FKsource__ Integer,
	__FKredefinedTransition__ Integer,
	__FKcontainer__ Integer
) ;

CREATE TABLE FinalState (
	__IDFinalState__ Integer NOT NULL,
	PRIMARY KEY FinalState (__IDFinalState__)
) ;

CREATE TABLE CreateObjectAction (
	__IDCreateObjectAction__ Integer NOT NULL,
	FOREIGN KEY classifier (__FKclassifier__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY CreateObjectAction (__IDCreateObjectAction__),
	__FKclassifier__ Integer,
	__FKresult__ Integer
) ;

CREATE TABLE DestroyObjectAction (
	__IDDestroyObjectAction__ Integer NOT NULL,
	isDestroyLinks Boolean,
	isDestroyOwnedObjects Boolean,
	FOREIGN KEY target (__FKtarget__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY DestroyObjectAction (__IDDestroyObjectAction__),
	__FKtarget__ Integer
) ;

CREATE TABLE TestIdentityAction (
	__IDTestIdentityAction__ Integer NOT NULL,
	FOREIGN KEY first (__FKfirst__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY second (__FKsecond__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY TestIdentityAction (__IDTestIdentityAction__),
	__FKfirst__ Integer,
	__FKresult__ Integer,
	__FKsecond__ Integer
) ;

CREATE TABLE ReadSelfAction (
	__IDReadSelfAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY ReadSelfAction (__IDReadSelfAction__),
	__FKresult__ Integer
) ;

CREATE TABLE StructuralFeatureAction (
	__IDStructuralFeatureAction__ Integer NOT NULL,
	FOREIGN KEY structuralFeature (__FKstructuralFeature__) REFERENCES StructuralFeature (__IDStructuralFeature__),
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY StructuralFeatureAction (__IDStructuralFeatureAction__),
	__FKstructuralFeature__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE ReadStructuralFeatureAction (
	__IDReadStructuralFeatureAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY ReadStructuralFeatureAction (__IDReadStructuralFeatureAction__),
	__FKresult__ Integer
) ;

CREATE TABLE WriteStructuralFeatureAction (
	__IDWriteStructuralFeatureAction__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY WriteStructuralFeatureAction (__IDWriteStructuralFeatureAction__),
	__FKvalue__ Integer
) ;

CREATE TABLE ClearStructuralFeatureAction (
	__IDClearStructuralFeatureAction__ Integer NOT NULL,
	PRIMARY KEY ClearStructuralFeatureAction (__IDClearStructuralFeatureAction__)
) ;

CREATE TABLE RemoveStructuralFeatureValueAction (
	__IDRemoveStructuralFeatureValueAction__ Integer NOT NULL,
	PRIMARY KEY RemoveStructuralFeatureValueAction (__IDRemoveStructuralFeatureValueAction__)
) ;

CREATE TABLE AddStructuralFeatureValueAction (
	__IDAddStructuralFeatureValueAction__ Integer NOT NULL,
	isReplaceAll Boolean,
	FOREIGN KEY insertAt (__FKinsertAt__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY AddStructuralFeatureValueAction (__IDAddStructuralFeatureValueAction__),
	__FKinsertAt__ Integer
) ;

CREATE TABLE LinkAction (
	__IDLinkAction__ Integer NOT NULL,
	PRIMARY KEY LinkAction (__IDLinkAction__)
) ;

CREATE TABLE LinkEndData (
	__IDLinkEndData__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY end (__FKend__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY LinkEndData (__IDLinkEndData__),
	__FKend__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE ReadLinkAction (
	__IDReadLinkAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY ReadLinkAction (__IDReadLinkAction__),
	__FKresult__ Integer
) ;

CREATE TABLE LinkEndCreationData (
	__IDLinkEndCreationData__ Integer NOT NULL,
	isReplaceAll Boolean,
	FOREIGN KEY insertAt (__FKinsertAt__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY LinkEndCreationData (__IDLinkEndCreationData__),
	__FKinsertAt__ Integer
) ;

CREATE TABLE CreateLinkAction (
	__IDCreateLinkAction__ Integer NOT NULL,
	PRIMARY KEY CreateLinkAction (__IDCreateLinkAction__)
) ;

CREATE TABLE WriteLinkAction (
	__IDWriteLinkAction__ Integer NOT NULL,
	PRIMARY KEY WriteLinkAction (__IDWriteLinkAction__)
) ;

CREATE TABLE DestroyLinkAction (
	__IDDestroyLinkAction__ Integer NOT NULL,
	PRIMARY KEY DestroyLinkAction (__IDDestroyLinkAction__)
) ;

CREATE TABLE ClearAssociationAction (
	__IDClearAssociationAction__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	PRIMARY KEY ClearAssociationAction (__IDClearAssociationAction__),
	__FKassociation__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE VariableAction (
	__IDVariableAction__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY VariableAction (__IDVariableAction__),
	__FKvariable__ Integer
) ;

CREATE TABLE ReadVariableAction (
	__IDReadVariableAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY ReadVariableAction (__IDReadVariableAction__),
	__FKresult__ Integer
) ;

CREATE TABLE WriteVariableAction (
	__IDWriteVariableAction__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY WriteVariableAction (__IDWriteVariableAction__),
	__FKvalue__ Integer
) ;

CREATE TABLE ClearVariableAction (
	__IDClearVariableAction__ Integer NOT NULL,
	PRIMARY KEY ClearVariableAction (__IDClearVariableAction__)
) ;

CREATE TABLE AddVariableValueAction (
	__IDAddVariableValueAction__ Integer NOT NULL,
	isReplaceAll Boolean,
	FOREIGN KEY insertAt (__FKinsertAt__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY AddVariableValueAction (__IDAddVariableValueAction__),
	__FKinsertAt__ Integer
) ;

CREATE TABLE RemoveVariableValueAction (
	__IDRemoveVariableValueAction__ Integer NOT NULL,
	PRIMARY KEY RemoveVariableValueAction (__IDRemoveVariableValueAction__)
) ;

CREATE TABLE ApplyFunctionAction (
	__IDApplyFunctionAction__ Integer NOT NULL,
	FOREIGN KEY function (__FKfunction__) REFERENCES PrimitiveFunction (__IDPrimitiveFunction__),
	PRIMARY KEY ApplyFunctionAction (__IDApplyFunctionAction__),
	__FKfunction__ Integer
) ;

CREATE TABLE PrimitiveFunction (
	__IDPrimitiveFunction__ Integer NOT NULL,
	body text,
	language text,
	PRIMARY KEY PrimitiveFunction (__IDPrimitiveFunction__)
) ;

CREATE TABLE CallAction (
	__IDCallAction__ Integer NOT NULL,
	isSynchronous Boolean,
	PRIMARY KEY CallAction (__IDCallAction__)
) ;

CREATE TABLE InvocationAction (
	__IDInvocationAction__ Integer NOT NULL,
	FOREIGN KEY onPort (__FKonPort__) REFERENCES Port (__IDPort__),
	PRIMARY KEY InvocationAction (__IDInvocationAction__),
	__FKonPort__ Integer
) ;

CREATE TABLE SendSignalAction (
	__IDSendSignalAction__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY SendSignalAction (__IDSendSignalAction__),
	__FKsignal__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE BroadcastSignalAction (
	__IDBroadcastSignalAction__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY BroadcastSignalAction (__IDBroadcastSignalAction__),
	__FKsignal__ Integer
) ;

CREATE TABLE SendObjectAction (
	__IDSendObjectAction__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY request (__FKrequest__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY SendObjectAction (__IDSendObjectAction__),
	__FKrequest__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE CallOperationAction (
	__IDCallOperationAction__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY target (__FKtarget__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY CallOperationAction (__IDCallOperationAction__),
	__FKoperation__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE CallBehaviorAction (
	__IDCallBehaviorAction__ Integer NOT NULL,
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY CallBehaviorAction (__IDCallBehaviorAction__),
	__FKbehavior__ Integer
) ;

CREATE TABLE TimeExpression (
	__IDTimeExpression__ Integer NOT NULL,
	firstTime Boolean,
	FOREIGN KEY event (__FKevent__) REFERENCES NamedElement (__IDNamedElement__),
	PRIMARY KEY TimeExpression (__IDTimeExpression__),
	__FKevent__ Integer
) ;

CREATE TABLE Duration (
	__IDDuration__ Integer NOT NULL,
	firstTime Boolean,
	PRIMARY KEY Duration (__IDDuration__)
) ;

CREATE TABLE TimeObservationAction (
	__IDTimeObservationAction__ Integer NOT NULL,
	PRIMARY KEY TimeObservationAction (__IDTimeObservationAction__)
) ;

CREATE TABLE DurationInterval (
	__IDDurationInterval__ Integer NOT NULL,
	PRIMARY KEY DurationInterval (__IDDurationInterval__)
) ;

CREATE TABLE "Interval" (
	__IDInterval__ Integer NOT NULL,
	PRIMARY KEY "Interval" (__IDInterval__)
) ;

CREATE TABLE TimeConstraint (
	__IDTimeConstraint__ Integer NOT NULL,
	PRIMARY KEY TimeConstraint (__IDTimeConstraint__)
) ;

CREATE TABLE IntervalConstraint (
	__IDIntervalConstraint__ Integer NOT NULL,
	PRIMARY KEY IntervalConstraint (__IDIntervalConstraint__)
) ;

CREATE TABLE TimeInterval (
	__IDTimeInterval__ Integer NOT NULL,
	PRIMARY KEY TimeInterval (__IDTimeInterval__)
) ;

CREATE TABLE DurationObservationAction (
	__IDDurationObservationAction__ Integer NOT NULL,
	PRIMARY KEY DurationObservationAction (__IDDurationObservationAction__)
) ;

CREATE TABLE DurationConstraint (
	__IDDurationConstraint__ Integer NOT NULL,
	PRIMARY KEY DurationConstraint (__IDDurationConstraint__)
) ;

CREATE TABLE DataStoreNode (
	__IDDataStoreNode__ Integer NOT NULL,
	PRIMARY KEY DataStoreNode (__IDDataStoreNode__)
) ;

CREATE TABLE InterruptibleActivityRegion (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	PRIMARY KEY InterruptibleActivityRegion (__IDInterruptibleActivityRegion__)
) ;

CREATE TABLE ParameterSet (
	__IDParameterSet__ Integer NOT NULL,
	PRIMARY KEY ParameterSet (__IDParameterSet__)
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	isIndirectlyInstantiated Boolean,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE Deployment (
	__IDDeployment__ Integer NOT NULL,
	FOREIGN KEY location (__FKlocation__) REFERENCES DeploymentTarget (__IDDeploymentTarget__),
	PRIMARY KEY Deployment (__IDDeployment__),
	__FKlocation__ Integer
) ;

CREATE TABLE DeployedArtifact (
	__IDDeployedArtifact__ Integer NOT NULL,
	PRIMARY KEY DeployedArtifact (__IDDeployedArtifact__)
) ;

CREATE TABLE DeploymentTarget (
	__IDDeploymentTarget__ Integer NOT NULL,
	PRIMARY KEY DeploymentTarget (__IDDeploymentTarget__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Device (
	__IDDevice__ Integer NOT NULL,
	PRIMARY KEY Device (__IDDevice__)
) ;

CREATE TABLE ExecutionEnvironment (
	__IDExecutionEnvironment__ Integer NOT NULL,
	PRIMARY KEY ExecutionEnvironment (__IDExecutionEnvironment__)
) ;

CREATE TABLE CommunicationPath (
	__IDCommunicationPath__ Integer NOT NULL,
	PRIMARY KEY CommunicationPath (__IDCommunicationPath__)
) ;

CREATE TABLE ProtocolConformance (
	__IDProtocolConformance__ Integer NOT NULL,
	FOREIGN KEY specificMachine (__FKspecificMachine__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	FOREIGN KEY generalMachine (__FKgeneralMachine__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY ProtocolConformance (__IDProtocolConformance__),
	__FKspecificMachine__ Integer,
	__FKgeneralMachine__ Integer
) ;

CREATE TABLE ProtocolStateMachine (
	__IDProtocolStateMachine__ Integer NOT NULL,
	PRIMARY KEY ProtocolStateMachine (__IDProtocolStateMachine__)
) ;

CREATE TABLE ProtocolTransition (
	__IDProtocolTransition__ Integer NOT NULL,
	FOREIGN KEY postCondition (__FKpostCondition__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY preCondition (__FKpreCondition__) REFERENCES "Constraint" (__IDConstraint__),
	PRIMARY KEY ProtocolTransition (__IDProtocolTransition__),
	__FKpreCondition__ Integer,
	__FKpostCondition__ Integer
) ;

CREATE TABLE ReadExtentAction (
	__IDReadExtentAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	FOREIGN KEY classifier (__FKclassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY ReadExtentAction (__IDReadExtentAction__),
	__FKresult__ Integer,
	__FKclassifier__ Integer
) ;

CREATE TABLE ReclassifyObjectAction (
	__IDReclassifyObjectAction__ Integer NOT NULL,
	isReplaceAll Boolean,
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY ReclassifyObjectAction (__IDReclassifyObjectAction__),
	__FKobject__ Integer
) ;

CREATE TABLE ReadIsClassifiedObjectAction (
	__IDReadIsClassifiedObjectAction__ Integer NOT NULL,
	isDirect Boolean,
	FOREIGN KEY classifier (__FKclassifier__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY ReadIsClassifiedObjectAction (__IDReadIsClassifiedObjectAction__),
	__FKclassifier__ Integer,
	__FKresult__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE StartOwnedBehaviorAction (
	__IDStartOwnedBehaviorAction__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY StartOwnedBehaviorAction (__IDStartOwnedBehaviorAction__),
	__FKobject__ Integer
) ;

CREATE TABLE QualifierValue (
	__IDQualifierValue__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY value (__FKvalue__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY QualifierValue (__IDQualifierValue__),
	__FKqualifier__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE ReadLinkObjectEndAction (
	__IDReadLinkObjectEndAction__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY end (__FKend__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY ReadLinkObjectEndAction (__IDReadLinkObjectEndAction__),
	__FKend__ Integer,
	__FKresult__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE ReadLinkObjectEndQualifierAction (
	__IDReadLinkObjectEndQualifierAction__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES InputPin (__IDInputPin__),
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY ReadLinkObjectEndQualifierAction (__IDReadLinkObjectEndQualifierAction__),
	__FKqualifier__ Integer,
	__FKobject__ Integer,
	__FKresult__ Integer
) ;

CREATE TABLE CreateLinkObjectAction (
	__IDCreateLinkObjectAction__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY CreateLinkObjectAction (__IDCreateLinkObjectAction__),
	__FKresult__ Integer
) ;

CREATE TABLE AcceptEventAction (
	__IDAcceptEventAction__ Integer NOT NULL,
	PRIMARY KEY AcceptEventAction (__IDAcceptEventAction__)
) ;

CREATE TABLE AcceptCallAction (
	__IDAcceptCallAction__ Integer NOT NULL,
	FOREIGN KEY returnInformation (__FKreturnInformation__) REFERENCES OutputPin (__IDOutputPin__),
	PRIMARY KEY AcceptCallAction (__IDAcceptCallAction__),
	__FKreturnInformation__ Integer
) ;

CREATE TABLE ReplyAction (
	__IDReplyAction__ Integer NOT NULL,
	FOREIGN KEY replyToCall (__FKreplyToCall__) REFERENCES CallTrigger (__IDCallTrigger__),
	FOREIGN KEY returnInformation (__FKreturnInformation__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY ReplyAction (__IDReplyAction__),
	__FKreturnInformation__ Integer,
	__FKreplyToCall__ Integer
) ;

CREATE TABLE RaiseExceptionAction (
	__IDRaiseExceptionAction__ Integer NOT NULL,
	FOREIGN KEY exception (__FKexception__) REFERENCES InputPin (__IDInputPin__),
	PRIMARY KEY RaiseExceptionAction (__IDRaiseExceptionAction__),
	__FKexception__ Integer
) ;

CREATE TABLE DeploymentSpecification (
	__IDDeploymentSpecification__ Integer NOT NULL,
	deploymentLocation text,
	executionLocation text,
	PRIMARY KEY DeploymentSpecification (__IDDeploymentSpecification__)
) ;

CREATE TABLE RedefinableElement_redefinitionContext_Classifier (
	__IDRedefinableElement__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE EventOccurrence_finishExec_ExecutionOccurrence (
	__IDEventOccurrence__ Integer NOT NULL,
	__IDExecutionOccurrence__ Integer NOT NULL
) ;

CREATE TABLE CombinedFragment_operand_InteractionOperand (
	__IDCombinedFragment__ Integer NOT NULL,
	__IDInteractionOperand__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_loopVariableInput_InputPin (
	__IDLoopNode__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_ownedTrigger_Trigger (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE InstanceSpecification_slot_Slot (
	__IDInstanceSpecification__ Integer NOT NULL,
	__IDSlot__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_ownedConnector_Connector (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_ownedStateMachine_StateMachine (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDStateMachine__ Integer NOT NULL
) ;

CREATE TABLE Behavior_returnResult_Parameter (
	__IDBehavior__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_inGroup_ActivityGroup (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE ReclassifyObjectAction_newClassifier_Classifier (
	__IDReclassifyObjectAction__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE ApplyFunctionAction_result_OutputPin (
	__IDApplyFunctionAction__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Package_packageMerge_PackageMerge (
	__IDPackage__ Integer NOT NULL,
	__IDPackageMerge__ Integer NOT NULL
) ;

CREATE TABLE Dependency_client_NamedElement (
	__IDDependency__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Class_superClass_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE TemplateParameterSubstitution_actual_ParameterableElement (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	__IDParameterableElement__ Integer NOT NULL
) ;

CREATE TABLE Package_packageExtension_PackageMerge (
	__IDPackage__ Integer NOT NULL,
	__IDPackageMerge__ Integer NOT NULL
) ;

CREATE TABLE InteractionOccurrence_actualGate_Gate (
	__IDInteractionOccurrence__ Integer NOT NULL,
	__IDGate__ Integer NOT NULL
) ;

CREATE TABLE Operation_precondition_Constraint (
	__IDOperation__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Activity_structuredNode_StructuredActivityNode (
	__IDActivity__ Integer NOT NULL,
	__IDStructuredActivityNode__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_setupPart_ActivityNode (
	__IDLoopNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Classifier_occurrence_CollaborationOccurrence (
	__IDClassifier__ Integer NOT NULL,
	__IDCollaborationOccurrence__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_ownedBehavior_Behavior (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_containedNode_ActivityNode (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Deployment_deployedArtifact_DeployedArtifact (
	__IDDeployment__ Integer NOT NULL,
	__IDDeployedArtifact__ Integer NOT NULL
) ;

CREATE TABLE Feature_featuringClassifier_Classifier (
	__IDFeature__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Clause_bodyOutput_OutputPin (
	__IDClause__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Association_endType_Type (
	__IDAssociation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE EventOccurrence_toAfter_GeneralOrdering (
	__IDEventOccurrence__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE EventOccurrence_startExec_ExecutionOccurrence (
	__IDEventOccurrence__ Integer NOT NULL,
	__IDExecutionOccurrence__ Integer NOT NULL
) ;

CREATE TABLE Profile_ownedStereotype_Stereotype (
	__IDProfile__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;

CREATE TABLE DataType_ownedOperation_Operation (
	__IDDataType__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Expression_operand_ValueSpecification (
	__IDExpression__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Class_nestedClassifier_Classifier (
	__IDClass__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE InformationFlow_realization_Relationship (
	__IDInformationFlow__ Integer NOT NULL,
	__IDRelationship__ Integer NOT NULL
) ;

CREATE TABLE Association_memberEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Namespace_member_NamedElement (
	__IDNamespace__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inInterruptibleRegion_InterruptibleActivityRegion (
	__IDActivityNode__ Integer NOT NULL,
	__IDInterruptibleActivityRegion__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_variable_Variable (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE State_region_Region (
	__IDState__ Integer NOT NULL,
	__IDRegion__ Integer NOT NULL
) ;

CREATE TABLE Clause_successorClause_Clause (
	__IDClause__ Integer NOT NULL,
	__IDClause__ Integer NOT NULL
) ;

CREATE TABLE TemplateableElement_templateBinding_TemplateBinding (
	__IDTemplateableElement__ Integer NOT NULL,
	__IDTemplateBinding__ Integer NOT NULL
) ;

CREATE TABLE InteractionOperand_fragment_InteractionFragment (
	__IDInteractionOperand__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;

CREATE TABLE EventOccurrence_toBefore_GeneralOrdering (
	__IDEventOccurrence__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE ObjectNode_inState_State (
	__IDObjectNode__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE LinkAction_endData_LinkEndData (
	__IDLinkAction__ Integer NOT NULL,
	__IDLinkEndData__ Integer NOT NULL
) ;

CREATE TABLE InteractionOccurrence_argument_InputPin (
	__IDInteractionOccurrence__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Element_ownedComment_Comment (
	__IDElement__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_part_Property (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Behavior_redefinedBehavior_Behavior (
	__IDBehavior__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Component_realization_Realization (
	__IDComponent__ Integer NOT NULL,
	__IDRealization__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedOperation_Operation (
	__IDClass__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Component_required_Interface (
	__IDComponent__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_returnResult_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ReclassifyObjectAction_oldClassifier_Classifier (
	__IDReclassifyObjectAction__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_raisedException_Type (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE InstanceSpecification_classifier_Classifier (
	__IDInstanceSpecification__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE TemplateBinding_parameterSubstitution_TemplateParameterSubstitution (
	__IDTemplateBinding__ Integer NOT NULL,
	__IDTemplateParameterSubstitution__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_redefinedElement_ActivityNode (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Vertex_outgoing_Transition (
	__IDVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_connectionPoint_Pseudostate (
	__IDStateMachine__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE Action_localPrecondition_Constraint (
	__IDAction__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Deployment_configuration_DeploymentSpecification (
	__IDDeployment__ Integer NOT NULL,
	__IDDeploymentSpecification__ Integer NOT NULL
) ;

CREATE TABLE Classifier_ownedUseCase_UseCase (
	__IDClassifier__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Component_provided_Interface (
	__IDComponent__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE ProtocolTransition_referred_Operation (
	__IDProtocolTransition__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE DeploymentTarget_deployedElement_PackageableElement (
	__IDDeploymentTarget__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE Activity_node_ActivityNode (
	__IDActivity__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE CollaborationOccurrence_roleBinding_Dependency (
	__IDCollaborationOccurrence__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE Interaction_message_Message (
	__IDInteraction__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE State_deferrableTrigger_Trigger (
	__IDState__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE Interval_min_ValueSpecification (
	__IDInterval__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedReception_Reception (
	__IDClass__ Integer NOT NULL,
	__IDReception__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_redefinedElement_ActivityEdge (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Package_ownedType_Type (
	__IDPackage__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Package_ownedMember_PackageableElement (
	__IDPackage__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE EncapsulatedClassifier_ownedPort_Port (
	__IDEncapsulatedClassifier__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_ownedAttribute_Property (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_ownedLiteral_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;

CREATE TABLE DeploymentTarget_deployment_Deployment (
	__IDDeploymentTarget__ Integer NOT NULL,
	__IDDeployment__ Integer NOT NULL
) ;

CREATE TABLE Port_provided_Interface (
	__IDPort__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE ParameterSet_condition_Constraint (
	__IDParameterSet__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_loopVariable_OutputPin (
	__IDLoopNode__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Connector_redefinedConnector_Connector (
	__IDConnector__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE Clause_predecessorClause_Clause (
	__IDClause__ Integer NOT NULL,
	__IDClause__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedAttribute_Property (
	__IDInterface__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Property_subsettedProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE CombinedFragment_cfragmentGate_Gate (
	__IDCombinedFragment__ Integer NOT NULL,
	__IDGate__ Integer NOT NULL
) ;

CREATE TABLE Signal_ownedAttribute_Property (
	__IDSignal__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE InformationFlow_conveyed_Classifier (
	__IDInformationFlow__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Interaction_fragment_InteractionFragment (
	__IDInteraction__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;

CREATE TABLE Activity_group_ActivityGroup (
	__IDActivity__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_containedEdge_ActivityEdge (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Generalization_generalizationSet_GeneralizationSet (
	__IDGeneralization__ Integer NOT NULL,
	__IDGeneralizationSet__ Integer NOT NULL
) ;

CREATE TABLE Interaction_formalGate_Gate (
	__IDInteraction__ Integer NOT NULL,
	__IDGate__ Integer NOT NULL
) ;

CREATE TABLE Node_nestedNode_Node (
	__IDNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Behavior_formalParameter_Parameter (
	__IDBehavior__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extensionPoint_ExtensionPoint (
	__IDUseCase__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE Interaction_lifeline_Lifeline (
	__IDInteraction__ Integer NOT NULL,
	__IDLifeline__ Integer NOT NULL
) ;

CREATE TABLE ConnectionPointReference_entry_Pseudostate (
	__IDConnectionPointReference__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_collaborationRole_ConnectableElement (
	__IDCollaboration__ Integer NOT NULL,
	__IDConnectableElement__ Integer NOT NULL
) ;

CREATE TABLE Component_ownedMember_PackageableElement (
	__IDComponent__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE Lifeline_coveredBy_InteractionFragment (
	__IDLifeline__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;

CREATE TABLE Property_redefinedProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Profile_metaclassReference_ElementImport (
	__IDProfile__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;

CREATE TABLE Action_input_InputPin (
	__IDAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE ExecutionOccurrence_behavior_Behavior (
	__IDExecutionOccurrence__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Namespace_importedMember_PackageableElement (
	__IDNamespace__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE UseCase_include_Include (
	__IDUseCase__ Integer NOT NULL,
	__IDInclude__ Integer NOT NULL
) ;

CREATE TABLE Action_output_OutputPin (
	__IDAction__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inPartition_ActivityPartition (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeExtent_GeneralizationSet (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralizationSet__ Integer NOT NULL
) ;

CREATE TABLE DataType_ownedAttribute_Property (
	__IDDataType__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Element_ownedElement_Element (
	__IDElement__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Artifact_manifestation_Manifestation (
	__IDArtifact__ Integer NOT NULL,
	__IDManifestation__ Integer NOT NULL
) ;

CREATE TABLE Classifier_substitution_Substitution (
	__IDClassifier__ Integer NOT NULL,
	__IDSubstitution__ Integer NOT NULL
) ;

CREATE TABLE TimeObservationAction_now_TimeExpression (
	__IDTimeObservationAction__ Integer NOT NULL,
	__IDTimeExpression__ Integer NOT NULL
) ;

CREATE TABLE Parameter_parameterSet_ParameterSet (
	__IDParameter__ Integer NOT NULL,
	__IDParameterSet__ Integer NOT NULL
) ;

CREATE TABLE Classifier_generalization_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extend_Extend (
	__IDUseCase__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE Artifact_nestedArtifact_Artifact (
	__IDArtifact__ Integer NOT NULL,
	__IDArtifact__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_test_ActivityNode (
	__IDLoopNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Classifier_attribute_Property (
	__IDClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Interval_max_ValueSpecification (
	__IDInterval__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Port_redefinedPort_Port (
	__IDPort__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Operation_ownedParameter_Parameter (
	__IDOperation__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE SignalTrigger_signal_Signal (
	__IDSignalTrigger__ Integer NOT NULL,
	__IDSignal__ Integer NOT NULL
) ;

CREATE TABLE ParameterSet_parameter_Parameter (
	__IDParameterSet__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_method_Behavior (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_containedEdge_ActivityEdge (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE InterruptibleActivityRegion_interruptingEdge_ActivityEdge (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_role_ConnectableElement (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDConnectableElement__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_parameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ExecutableNode_handler_ExceptionHandler (
	__IDExecutableNode__ Integer NOT NULL,
	__IDExceptionHandler__ Integer NOT NULL
) ;

CREATE TABLE DirectedRelationship_source_Element (
	__IDDirectedRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Behavior_precondition_Constraint (
	__IDBehavior__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE StringExpression_subExpression_StringExpression (
	__IDStringExpression__ Integer NOT NULL,
	__IDStringExpression__ Integer NOT NULL
) ;

CREATE TABLE Operation_postcondition_Constraint (
	__IDOperation__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Package_appliedProfile_ProfileApplication (
	__IDPackage__ Integer NOT NULL,
	__IDProfileApplication__ Integer NOT NULL
) ;

CREATE TABLE ApplyFunctionAction_argument_InputPin (
	__IDApplyFunctionAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Region_transition_Transition (
	__IDRegion__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE InterruptibleActivityRegion_containedNode_ActivityNode (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE InvocationAction_argument_InputPin (
	__IDInvocationAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Interface_redefinedInterface_Interface (
	__IDInterface__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Vertex_incoming_Transition (
	__IDVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE ConditionalNode_clause_Clause (
	__IDConditionalNode__ Integer NOT NULL,
	__IDClause__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_outgoing_ActivityEdge (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inGroup_ActivityGroup (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE ExceptionHandler_exceptionType_Classifier (
	__IDExceptionHandler__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_bodyOutput_OutputPin (
	__IDLoopNode__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Clause_body_ActivityNode (
	__IDClause__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE State_connection_ConnectionPointReference (
	__IDState__ Integer NOT NULL,
	__IDConnectionPointReference__ Integer NOT NULL
) ;

CREATE TABLE ConditionalNode_result_OutputPin (
	__IDConditionalNode__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE UseCase_subject_Classifier (
	__IDUseCase__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Trigger_port_Port (
	__IDTrigger__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE TemplateParameterSubstitution_ownedActual_ParameterableElement (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	__IDParameterableElement__ Integer NOT NULL
) ;

CREATE TABLE DurationObservationAction_duration_Duration (
	__IDDurationObservationAction__ Integer NOT NULL,
	__IDDuration__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedReception_Reception (
	__IDInterface__ Integer NOT NULL,
	__IDReception__ Integer NOT NULL
) ;

CREATE TABLE Slot_value_ValueSpecification (
	__IDSlot__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Operation_redefinedOperation_Operation (
	__IDOperation__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Classifier_inheritedMember_NamedElement (
	__IDClassifier__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE ExpansionRegion_outputElement_ExpansionNode (
	__IDExpansionRegion__ Integer NOT NULL,
	__IDExpansionNode__ Integer NOT NULL
) ;

CREATE TABLE Message_argument_ValueSpecification (
	__IDMessage__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Association_ownedEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Clause_test_ActivityNode (
	__IDClause__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_result_OutputPin (
	__IDLoopNode__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Classifier_redefinedClassifier_Classifier (
	__IDClassifier__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Extend_extensionLocation_ExtensionPoint (
	__IDExtend__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ProtocolStateMachine_conformance_ProtocolConformance (
	__IDProtocolStateMachine__ Integer NOT NULL,
	__IDProtocolConformance__ Integer NOT NULL
) ;

CREATE TABLE NamedElement_clientDependency_Dependency (
	__IDNamedElement__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE LoopNode_bodyPart_ActivityNode (
	__IDLoopNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Behavior_ownedParameterSet_ParameterSet (
	__IDBehavior__ Integer NOT NULL,
	__IDParameterSet__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_formalParameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Connector_contract_Behavior (
	__IDConnector__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE DirectedRelationship_target_Element (
	__IDDirectedRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_incoming_ActivityEdge (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Artifact_ownedAttribute_Property (
	__IDArtifact__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE GeneralizationSet_generalization_Generalization (
	__IDGeneralizationSet__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE TemplateSignature_parameter_TemplateParameter (
	__IDTemplateSignature__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE Connector_end_ConnectorEnd (
	__IDConnector__ Integer NOT NULL,
	__IDConnectorEnd__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_containedNode_ActivityNode (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Package_nestedPackage_Package (
	__IDPackage__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Transition_trigger_Trigger (
	__IDTransition__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE CallAction_result_OutputPin (
	__IDCallAction__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE InformationItem_represented_Classifier (
	__IDInformationItem__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Relationship_relatedElement_Element (
	__IDRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE InteractionFragment_generalOrdering_GeneralOrdering (
	__IDInteractionFragment__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE ConnectableElement_end_ConnectorEnd (
	__IDConnectableElement__ Integer NOT NULL,
	__IDConnectorEnd__ Integer NOT NULL
) ;

CREATE TABLE AcceptEventAction_trigger_Trigger (
	__IDAcceptEventAction__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE ReplyAction_replyValue_InputPin (
	__IDReplyAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Activity_edge_ActivityEdge (
	__IDActivity__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Classifier_useCase_UseCase (
	__IDClassifier__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Classifier_general_Classifier (
	__IDClassifier__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_implementation_Implementation (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDImplementation__ Integer NOT NULL
) ;

CREATE TABLE Interface_nestedClassifier_Classifier (
	__IDInterface__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Namespace_elementImport_ElementImport (
	__IDNamespace__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;

CREATE TABLE Class_extension_Extension (
	__IDClass__ Integer NOT NULL,
	__IDExtension__ Integer NOT NULL
) ;

CREATE TABLE Property_qualifier_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Port_required_Interface (
	__IDPort__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedOperation_Operation (
	__IDInterface__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE ConnectionPointReference_exit_Pseudostate (
	__IDConnectionPointReference__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_inPartition_ActivityPartition (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_subgroup_ActivityPartition (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE Constraint_constrainedElement_Element (
	__IDConstraint__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE AcceptEventAction_result_OutputPin (
	__IDAcceptEventAction__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Region_subvertex_Vertex (
	__IDRegion__ Integer NOT NULL,
	__IDVertex__ Integer NOT NULL
) ;

CREATE TABLE TemplateSignature_nestedSignature_TemplateSignature (
	__IDTemplateSignature__ Integer NOT NULL,
	__IDTemplateSignature__ Integer NOT NULL
) ;

CREATE TABLE Dependency_supplier_NamedElement (
	__IDDependency__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedRule_Constraint (
	__IDNamespace__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Duration_event_NamedElement (
	__IDDuration__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Profile_metamodelReference_PackageImport (
	__IDProfile__ Integer NOT NULL,
	__IDPackageImport__ Integer NOT NULL
) ;

CREATE TABLE Behavior_postcondition_Constraint (
	__IDBehavior__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE InteractionFragment_covered_Lifeline (
	__IDInteractionFragment__ Integer NOT NULL,
	__IDLifeline__ Integer NOT NULL
) ;

CREATE TABLE Activity_action_Action (
	__IDActivity__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE LinkEndData_qualifier_QualifierValue (
	__IDLinkEndData__ Integer NOT NULL,
	__IDQualifierValue__ Integer NOT NULL
) ;

CREATE TABLE ExpansionRegion_inputElement_ExpansionNode (
	__IDExpansionRegion__ Integer NOT NULL,
	__IDExpansionNode__ Integer NOT NULL
) ;

CREATE TABLE Behavior_parameter_Parameter (
	__IDBehavior__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Namespace_packageImport_PackageImport (
	__IDNamespace__ Integer NOT NULL,
	__IDPackageImport__ Integer NOT NULL
) ;

CREATE TABLE Action_localPostcondition_Constraint (
	__IDAction__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE TemplateSignature_ownedParameter_TemplateParameter (
	__IDTemplateSignature__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE Artifact_ownedOperation_Operation (
	__IDArtifact__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Comment_annotatedElement_Element (
	__IDComment__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_region_Region (
	__IDStateMachine__ Integer NOT NULL,
	__IDRegion__ Integer NOT NULL
) ;
