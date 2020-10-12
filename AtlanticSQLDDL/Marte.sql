CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Element (__IDElement__),
	__FKowner__ Integer
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	body text,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY nestingPackage (__FKnestingPackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Package (__IDPackage__),
	__FKnestingPackage__ Integer
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	visibility text,
	qualifiedName text,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	FOREIGN KEY nameExpression (__FKnameExpression__) REFERENCES StringExpression (__IDStringExpression__),
	PRIMARY KEY NamedElement (__IDNamedElement__),
	__FKnamespace__ Integer,
	__FKnameExpression__ Integer
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	isReadOnly Boolean,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__)
) ;

CREATE TABLE ConnectableElement (
	__IDConnectableElement__ Integer NOT NULL,
	PRIMARY KEY ConnectableElement (__IDConnectableElement__)
) ;

CREATE TABLE TemplateableElement (
	__IDTemplateableElement__ Integer NOT NULL,
	FOREIGN KEY ownedTemplateSignature (__FKownedTemplateSignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	PRIMARY KEY TemplateableElement (__IDTemplateableElement__),
	__FKownedTemplateSignature__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY datatype (__FKdatatype__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY owningAssociation (__FKowningAssociation__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	isDerived Boolean,
	isDerivedUnion Boolean,
	"default" text,
	aggregation text,
	isComposite Boolean,
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY opposite (__FKopposite__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY Property (__IDProperty__),
	__FKclass__ Integer,
	__FKdatatype__ Integer,
	__FKowningAssociation__ Integer,
	__FKassociation__ Integer,
	__FKdefaultValue__ Integer,
	__FKopposite__ Integer,
	__FKassociationEnd__ Integer
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	PRIMARY KEY Dependency (__IDDependency__)
) ;

CREATE TABLE DirectedRelationship (
	__IDDirectedRelationship__ Integer NOT NULL,
	PRIMARY KEY DirectedRelationship (__IDDirectedRelationship__)
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
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
	__FKimportedPackage__ Integer,
	__FKimportingNamespace__ Integer
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY specification (__FKspecification__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY context (__FKcontext__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKspecification__ Integer,
	__FKcontext__ Integer
) ;

CREATE TABLE TypedElement (
	__IDTypedElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypedElement (__IDTypedElement__),
	__FKtype__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Type (__IDType__),
	__FKpackage__ Integer
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	isDerived Boolean,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	isAbstract Boolean,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES CollaborationUse (__IDCollaborationUse__),
	PRIMARY KEY Classifier (__IDClassifier__),
	__FKrepresentation__ Integer
) ;

CREATE TABLE RedefinableElement (
	__IDRedefinableElement__ Integer NOT NULL,
	isLeaf Boolean,
	PRIMARY KEY RedefinableElement (__IDRedefinableElement__)
) ;

CREATE TABLE TemplateBinding (
	__IDTemplateBinding__ Integer NOT NULL,
	FOREIGN KEY signature (__FKsignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	FOREIGN KEY boundElement (__FKboundElement__) REFERENCES TemplateableElement (__IDTemplateableElement__),
	PRIMARY KEY TemplateBinding (__IDTemplateBinding__),
	__FKsignature__ Integer,
	__FKboundElement__ Integer
) ;

CREATE TABLE TemplateSignature (
	__IDTemplateSignature__ Integer NOT NULL,
	FOREIGN KEY template (__FKtemplate__) REFERENCES TemplateableElement (__IDTemplateableElement__),
	PRIMARY KEY TemplateSignature (__IDTemplateSignature__),
	__FKtemplate__ Integer
) ;

CREATE TABLE TemplateParameter (
	__IDTemplateParameter__ Integer NOT NULL,
	FOREIGN KEY signature (__FKsignature__) REFERENCES TemplateSignature (__IDTemplateSignature__),
	FOREIGN KEY parameteredElement (__FKparameteredElement__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY ownedParameteredElement (__FKownedParameteredElement__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY "default" (__FKdefault__) REFERENCES ParameterableElement (__IDParameterableElement__),
	FOREIGN KEY ownedDefault (__FKownedDefault__) REFERENCES ParameterableElement (__IDParameterableElement__),
	PRIMARY KEY TemplateParameter (__IDTemplateParameter__),
	__FKsignature__ Integer,
	__FKparameteredElement__ Integer,
	__FKownedParameteredElement__ Integer,
	__FKdefault__ Integer,
	__FKownedDefault__ Integer
) ;

CREATE TABLE ParameterableElement (
	__IDParameterableElement__ Integer NOT NULL,
	FOREIGN KEY owningTemplateParameter (__FKowningTemplateParameter__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	FOREIGN KEY templateParameter (__FKtemplateParameter__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	PRIMARY KEY ParameterableElement (__IDParameterableElement__),
	__FKowningTemplateParameter__ Integer,
	__FKtemplateParameter__ Integer
) ;

CREATE TABLE TemplateParameterSubstitution (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	FOREIGN KEY formal (__FKformal__) REFERENCES TemplateParameter (__IDTemplateParameter__),
	FOREIGN KEY templateBinding (__FKtemplateBinding__) REFERENCES TemplateBinding (__IDTemplateBinding__),
	PRIMARY KEY TemplateParameterSubstitution (__IDTemplateParameterSubstitution__),
	__FKformal__ Integer,
	__FKtemplateBinding__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	isSubstitutable Boolean,
	FOREIGN KEY general (__FKgeneral__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY "specific" (__FKspecific__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKgeneral__ Integer,
	__FKspecific__ Integer
) ;

CREATE TABLE GeneralizationSet (
	__IDGeneralizationSet__ Integer NOT NULL,
	isCovering Boolean,
	isDisjoint Boolean,
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY GeneralizationSet (__IDGeneralizationSet__),
	__FKpowertype__ Integer
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	isStatic Boolean,
	PRIMARY KEY Feature (__IDFeature__)
) ;

CREATE TABLE Substitution (
	__IDSubstitution__ Integer NOT NULL,
	FOREIGN KEY contract (__FKcontract__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY substitutingClassifier (__FKsubstitutingClassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Substitution (__IDSubstitution__),
	__FKcontract__ Integer,
	__FKsubstitutingClassifier__ Integer
) ;

CREATE TABLE PackageableElement (
	__IDPackageableElement__ Integer NOT NULL,
	PRIMARY KEY PackageableElement (__IDPackageableElement__)
) ;

CREATE TABLE PackageMerge (
	__IDPackageMerge__ Integer NOT NULL,
	FOREIGN KEY mergedPackage (__FKmergedPackage__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY receivingPackage (__FKreceivingPackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY PackageMerge (__IDPackageMerge__),
	__FKmergedPackage__ Integer,
	__FKreceivingPackage__ Integer
) ;

CREATE TABLE ProfileApplication (
	__IDProfileApplication__ Integer NOT NULL,
	FOREIGN KEY appliedProfile (__FKappliedProfile__) REFERENCES Profile (__IDProfile__),
	isStrict Boolean,
	FOREIGN KEY applyingPackage (__FKapplyingPackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY ProfileApplication (__IDProfileApplication__),
	__FKappliedProfile__ Integer,
	__FKapplyingPackage__ Integer
) ;

CREATE TABLE Profile (
	__IDProfile__ Integer NOT NULL,
	PRIMARY KEY Profile (__IDProfile__)
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	PRIMARY KEY Stereotype (__IDStereotype__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isActive Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE StringExpression (
	__IDStringExpression__ Integer NOT NULL,
	FOREIGN KEY owningExpression (__FKowningExpression__) REFERENCES StringExpression (__IDStringExpression__),
	PRIMARY KEY StringExpression (__IDStringExpression__),
	__FKowningExpression__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	symbol text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE ValueSpecification (
	__IDValueSpecification__ Integer NOT NULL,
	PRIMARY KEY ValueSpecification (__IDValueSpecification__)
) ;

CREATE TABLE BehavioredClassifier (
	__IDBehavioredClassifier__ Integer NOT NULL,
	FOREIGN KEY classifierBehavior (__FKclassifierBehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY BehavioredClassifier (__IDBehavioredClassifier__),
	__FKclassifierBehavior__ Integer
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

CREATE TABLE MultiplicityElement (
	__IDMultiplicityElement__ Integer NOT NULL,
	isOrdered Boolean,
	isUnique Boolean,
	upper text,
	lower Integer,
	FOREIGN KEY upperValue (__FKupperValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY lowerValue (__FKlowerValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY MultiplicityElement (__IDMultiplicityElement__),
	__FKupperValue__ Integer,
	__FKlowerValue__ Integer
) ;

CREATE TABLE DeploymentTarget (
	__IDDeploymentTarget__ Integer NOT NULL,
	PRIMARY KEY DeploymentTarget (__IDDeploymentTarget__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE CollaborationUse (
	__IDCollaborationUse__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY CollaborationUse (__IDCollaborationUse__),
	__FKtype__ Integer
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE Realization (
	__IDRealization__ Integer NOT NULL,
	PRIMARY KEY Realization (__IDRealization__)
) ;

CREATE TABLE Abstraction (
	__IDAbstraction__ Integer NOT NULL,
	FOREIGN KEY mapping (__FKmapping__) REFERENCES OpaqueExpression (__IDOpaqueExpression__),
	PRIMARY KEY Abstraction (__IDAbstraction__),
	__FKmapping__ Integer
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	content text,
	location text,
	format text,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE OpaqueExpression (
	__IDOpaqueExpression__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES Parameter (__IDParameter__),
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY OpaqueExpression (__IDOpaqueExpression__),
	__FKresult__ Integer,
	__FKbehavior__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	direction text,
	"default" text,
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	isException Boolean,
	isStream Boolean,
	effect text,
	PRIMARY KEY Parameter (__IDParameter__),
	__FKdefaultValue__ Integer,
	__FKoperation__ Integer
) ;

CREATE TABLE EncapsulatedClassifier (
	__IDEncapsulatedClassifier__ Integer NOT NULL,
	PRIMARY KEY EncapsulatedClassifier (__IDEncapsulatedClassifier__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY interface (__FKinterface__) REFERENCES Interface (__IDInterface__),
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	isQuery Boolean,
	isOrdered Boolean,
	isUnique Boolean,
	lower Integer,
	upper text,
	FOREIGN KEY datatype (__FKdatatype__) REFERENCES DataType (__IDDataType__),
	FOREIGN KEY bodyCondition (__FKbodyCondition__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKinterface__ Integer,
	__FKclass__ Integer,
	__FKdatatype__ Integer,
	__FKbodyCondition__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Reception (
	__IDReception__ Integer NOT NULL,
	FOREIGN KEY signal (__FKsignal__) REFERENCES Signal (__IDSignal__),
	PRIMARY KEY Reception (__IDReception__),
	__FKsignal__ Integer
) ;

CREATE TABLE Extension (
	__IDExtension__ Integer NOT NULL,
	isRequired Boolean,
	FOREIGN KEY metaclass (__FKmetaclass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Extension (__IDExtension__),
	__FKmetaclass__ Integer
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	FOREIGN KEY enumeration (__FKenumeration__) REFERENCES Enumeration (__IDEnumeration__),
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__),
	__FKenumeration__ Integer
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

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE InstanceSpecification (
	__IDInstanceSpecification__ Integer NOT NULL,
	FOREIGN KEY specification (__FKspecification__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY InstanceSpecification (__IDInstanceSpecification__),
	__FKspecification__ Integer
) ;

CREATE TABLE BehavioralFeature (
	__IDBehavioralFeature__ Integer NOT NULL,
	isAbstract Boolean,
	concurrency text,
	PRIMARY KEY BehavioralFeature (__IDBehavioralFeature__)
) ;

CREATE TABLE Signal (
	__IDSignal__ Integer NOT NULL,
	PRIMARY KEY Signal (__IDSignal__)
) ;

CREATE TABLE TimeExpression (
	__IDTimeExpression__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY TimeExpression (__IDTimeExpression__),
	__FKexpr__ Integer
) ;

CREATE TABLE Observation (
	__IDObservation__ Integer NOT NULL,
	PRIMARY KEY Observation (__IDObservation__)
) ;

CREATE TABLE Duration (
	__IDDuration__ Integer NOT NULL,
	FOREIGN KEY expr (__FKexpr__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY Duration (__IDDuration__),
	__FKexpr__ Integer
) ;

CREATE TABLE DurationInterval (
	__IDDurationInterval__ Integer NOT NULL,
	PRIMARY KEY DurationInterval (__IDDurationInterval__)
) ;

CREATE TABLE "Interval" (
	__IDInterval__ Integer NOT NULL,
	FOREIGN KEY min (__FKmin__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY max (__FKmax__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY "Interval" (__IDInterval__),
	__FKmin__ Integer,
	__FKmax__ Integer
) ;

CREATE TABLE TimeConstraint (
	__IDTimeConstraint__ Integer NOT NULL,
	firstEvent Boolean,
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

CREATE TABLE DurationConstraint (
	__IDDurationConstraint__ Integer NOT NULL,
	PRIMARY KEY DurationConstraint (__IDDurationConstraint__)
) ;

CREATE TABLE TimeObservation (
	__IDTimeObservation__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES NamedElement (__IDNamedElement__),
	firstEvent Boolean,
	PRIMARY KEY TimeObservation (__IDTimeObservation__),
	__FKevent__ Integer
) ;

CREATE TABLE DurationObservation (
	__IDDurationObservation__ Integer NOT NULL,
	PRIMARY KEY DurationObservation (__IDDurationObservation__)
) ;

CREATE TABLE ConnectorEnd (
	__IDConnectorEnd__ Integer NOT NULL,
	FOREIGN KEY definingEnd (__FKdefiningEnd__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY partWithPort (__FKpartWithPort__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY role (__FKrole__) REFERENCES ConnectableElement (__IDConnectableElement__),
	PRIMARY KEY ConnectorEnd (__IDConnectorEnd__),
	__FKdefiningEnd__ Integer,
	__FKpartWithPort__ Integer,
	__FKrole__ Integer
) ;

CREATE TABLE TimeEvent (
	__IDTimeEvent__ Integer NOT NULL,
	isRelative Boolean,
	FOREIGN KEY "when" (__FKwhen__) REFERENCES ValueSpecification (__IDValueSpecification__),
	PRIMARY KEY TimeEvent (__IDTimeEvent__),
	__FKwhen__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	isBehavior Boolean,
	isService Boolean,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY Port (__IDPort__),
	__FKprotocol__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Action (__IDAction__),
	__FKcontext__ Integer
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
	__FKreceiveEvent__ Integer,
	__FKsendEvent__ Integer,
	__FKconnector__ Integer,
	__FKinteraction__ Integer,
	__FKsignature__ Integer
) ;

CREATE TABLE Lifeline (
	__IDLifeline__ Integer NOT NULL,
	FOREIGN KEY represents (__FKrepresents__) REFERENCES ConnectableElement (__IDConnectableElement__),
	FOREIGN KEY interaction (__FKinteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY selector (__FKselector__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY decomposedAs (__FKdecomposedAs__) REFERENCES PartDecomposition (__IDPartDecomposition__),
	PRIMARY KEY Lifeline (__IDLifeline__),
	__FKrepresents__ Integer,
	__FKinteraction__ Integer,
	__FKselector__ Integer,
	__FKdecomposedAs__ Integer
) ;

CREATE TABLE ExecutionSpecification (
	__IDExecutionSpecification__ Integer NOT NULL,
	FOREIGN KEY start (__FKstart__) REFERENCES OccurrenceSpecification (__IDOccurrenceSpecification__),
	FOREIGN KEY finish (__FKfinish__) REFERENCES OccurrenceSpecification (__IDOccurrenceSpecification__),
	PRIMARY KEY ExecutionSpecification (__IDExecutionSpecification__),
	__FKstart__ Integer,
	__FKfinish__ Integer
) ;

CREATE TABLE InvocationAction (
	__IDInvocationAction__ Integer NOT NULL,
	FOREIGN KEY onPort (__FKonPort__) REFERENCES Port (__IDPort__),
	PRIMARY KEY InvocationAction (__IDInvocationAction__),
	__FKonPort__ Integer
) ;

CREATE TABLE Connector (
	__IDConnector__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Association (__IDAssociation__),
	kind text,
	PRIMARY KEY Connector (__IDConnector__),
	__FKtype__ Integer
) ;

CREATE TABLE Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	PRIMARY KEY Collaboration (__IDCollaboration__)
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	FOREIGN KEY protocol (__FKprotocol__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY Interface (__IDInterface__),
	__FKprotocol__ Integer
) ;

CREATE TABLE InterfaceRealization (
	__IDInterfaceRealization__ Integer NOT NULL,
	FOREIGN KEY contract (__FKcontract__) REFERENCES Interface (__IDInterface__),
	FOREIGN KEY implementingClassifier (__FKimplementingClassifier__) REFERENCES BehavioredClassifier (__IDBehavioredClassifier__),
	PRIMARY KEY InterfaceRealization (__IDInterfaceRealization__),
	__FKcontract__ Integer,
	__FKimplementingClassifier__ Integer
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY "Trigger" (__IDTrigger__),
	__FKevent__ Integer
) ;

CREATE TABLE ProtocolStateMachine (
	__IDProtocolStateMachine__ Integer NOT NULL,
	PRIMARY KEY ProtocolStateMachine (__IDProtocolStateMachine__)
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	PRIMARY KEY StateMachine (__IDStateMachine__)
) ;

CREATE TABLE ProtocolConformance (
	__IDProtocolConformance__ Integer NOT NULL,
	FOREIGN KEY generalMachine (__FKgeneralMachine__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	FOREIGN KEY specificMachine (__FKspecificMachine__) REFERENCES ProtocolStateMachine (__IDProtocolStateMachine__),
	PRIMARY KEY ProtocolConformance (__IDProtocolConformance__),
	__FKgeneralMachine__ Integer,
	__FKspecificMachine__ Integer
) ;

CREATE TABLE Deployment (
	__IDDeployment__ Integer NOT NULL,
	FOREIGN KEY location (__FKlocation__) REFERENCES DeploymentTarget (__IDDeploymentTarget__),
	PRIMARY KEY Deployment (__IDDeployment__),
	__FKlocation__ Integer
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	FOREIGN KEY addition (__FKaddition__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY includingCase (__FKincludingCase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Include (__IDInclude__),
	__FKaddition__ Integer,
	__FKincludingCase__ Integer
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	FOREIGN KEY extendedCase (__FKextendedCase__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY extension (__FKextension__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Extend (__IDExtend__),
	__FKextendedCase__ Integer,
	__FKcondition__ Integer,
	__FKextension__ Integer
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKuseCase__ Integer
) ;

CREATE TABLE Region (
	__IDRegion__ Integer NOT NULL,
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	FOREIGN KEY extendedRegion (__FKextendedRegion__) REFERENCES Region (__IDRegion__),
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	PRIMARY KEY Region (__IDRegion__),
	__FKstate__ Integer,
	__FKextendedRegion__ Integer,
	__FKstateMachine__ Integer
) ;

CREATE TABLE StructuredClassifier (
	__IDStructuredClassifier__ Integer NOT NULL,
	PRIMARY KEY StructuredClassifier (__IDStructuredClassifier__)
) ;

CREATE TABLE Vertex (
	__IDVertex__ Integer NOT NULL,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Region (__IDRegion__),
	PRIMARY KEY Vertex (__IDVertex__),
	__FKcontainer__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	kind text,
	FOREIGN KEY container (__FKcontainer__) REFERENCES Region (__IDRegion__),
	FOREIGN KEY redefinedTransition (__FKredefinedTransition__) REFERENCES Transition (__IDTransition__),
	FOREIGN KEY guard (__FKguard__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY effect (__FKeffect__) REFERENCES Behavior (__IDBehavior__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY source (__FKsource__) REFERENCES Vertex (__IDVertex__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKcontainer__ Integer,
	__FKredefinedTransition__ Integer,
	__FKguard__ Integer,
	__FKeffect__ Integer,
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	isComposite Boolean,
	isOrthogonal Boolean,
	isSimple Boolean,
	isSubmachineState Boolean,
	FOREIGN KEY submachine (__FKsubmachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY redefinedState (__FKredefinedState__) REFERENCES State (__IDState__),
	FOREIGN KEY stateInvariant (__FKstateInvariant__) REFERENCES "Constraint" (__IDConstraint__),
	FOREIGN KEY entry (__FKentry__) REFERENCES Behavior (__IDBehavior__),
	FOREIGN KEY "exit" (__FKexit__) REFERENCES Behavior (__IDBehavior__),
	FOREIGN KEY doActivity (__FKdoActivity__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY State (__IDState__),
	__FKsubmachine__ Integer,
	__FKredefinedState__ Integer,
	__FKstateInvariant__ Integer,
	__FKentry__ Integer,
	__FKexit__ Integer,
	__FKdoActivity__ Integer
) ;

CREATE TABLE ParameterSet (
	__IDParameterSet__ Integer NOT NULL,
	PRIMARY KEY ParameterSet (__IDParameterSet__)
) ;

CREATE TABLE ActivityNode (
	__IDActivityNode__ Integer NOT NULL,
	FOREIGN KEY inStructuredNode (__FKinStructuredNode__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ActivityNode (__IDActivityNode__),
	__FKinStructuredNode__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE ActivityGroup (
	__IDActivityGroup__ Integer NOT NULL,
	FOREIGN KEY superGroup (__FKsuperGroup__) REFERENCES ActivityGroup (__IDActivityGroup__),
	FOREIGN KEY inActivity (__FKinActivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ActivityGroup (__IDActivityGroup__),
	__FKsuperGroup__ Integer,
	__FKinActivity__ Integer
) ;

CREATE TABLE ActivityEdge (
	__IDActivityEdge__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES ActivityNode (__IDActivityNode__),
	FOREIGN KEY target (__FKtarget__) REFERENCES ActivityNode (__IDActivityNode__),
	FOREIGN KEY guard (__FKguard__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY weight (__FKweight__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY interrupts (__FKinterrupts__) REFERENCES InterruptibleActivityRegion (__IDInterruptibleActivityRegion__),
	FOREIGN KEY inStructuredNode (__FKinStructuredNode__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ActivityEdge (__IDActivityEdge__),
	__FKsource__ Integer,
	__FKtarget__ Integer,
	__FKguard__ Integer,
	__FKweight__ Integer,
	__FKinterrupts__ Integer,
	__FKinStructuredNode__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE InterruptibleActivityRegion (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	PRIMARY KEY InterruptibleActivityRegion (__IDInterruptibleActivityRegion__)
) ;

CREATE TABLE DeployedArtifact (
	__IDDeployedArtifact__ Integer NOT NULL,
	PRIMARY KEY DeployedArtifact (__IDDeployedArtifact__)
) ;

CREATE TABLE Slot (
	__IDSlot__ Integer NOT NULL,
	FOREIGN KEY definingFeature (__FKdefiningFeature__) REFERENCES StructuralFeature (__IDStructuralFeature__),
	FOREIGN KEY owningInstance (__FKowningInstance__) REFERENCES InstanceSpecification (__IDInstanceSpecification__),
	PRIMARY KEY Slot (__IDSlot__),
	__FKdefiningFeature__ Integer,
	__FKowningInstance__ Integer
) ;

CREATE TABLE ExecutableNode (
	__IDExecutableNode__ Integer NOT NULL,
	PRIMARY KEY ExecutableNode (__IDExecutableNode__)
) ;

CREATE TABLE OutputPin (
	__IDOutputPin__ Integer NOT NULL,
	PRIMARY KEY OutputPin (__IDOutputPin__)
) ;

CREATE TABLE Pin (
	__IDPin__ Integer NOT NULL,
	isControl Boolean,
	PRIMARY KEY Pin (__IDPin__)
) ;

CREATE TABLE InputPin (
	__IDInputPin__ Integer NOT NULL,
	PRIMARY KEY InputPin (__IDInputPin__)
) ;

CREATE TABLE ExceptionHandler (
	__IDExceptionHandler__ Integer NOT NULL,
	FOREIGN KEY handlerBody (__FKhandlerBody__) REFERENCES ExecutableNode (__IDExecutableNode__),
	FOREIGN KEY exceptionInput (__FKexceptionInput__) REFERENCES ObjectNode (__IDObjectNode__),
	FOREIGN KEY protectedNode (__FKprotectedNode__) REFERENCES ExecutableNode (__IDExecutableNode__),
	PRIMARY KEY ExceptionHandler (__IDExceptionHandler__),
	__FKhandlerBody__ Integer,
	__FKexceptionInput__ Integer,
	__FKprotectedNode__ Integer
) ;

CREATE TABLE ObjectNode (
	__IDObjectNode__ Integer NOT NULL,
	ordering text,
	isControlType Boolean,
	FOREIGN KEY upperBound (__FKupperBound__) REFERENCES ValueSpecification (__IDValueSpecification__),
	FOREIGN KEY selection (__FKselection__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY ObjectNode (__IDObjectNode__),
	__FKupperBound__ Integer,
	__FKselection__ Integer
) ;

CREATE TABLE MessageEnd (
	__IDMessageEnd__ Integer NOT NULL,
	FOREIGN KEY message (__FKmessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY MessageEnd (__IDMessageEnd__),
	__FKmessage__ Integer
) ;

CREATE TABLE Interaction (
	__IDInteraction__ Integer NOT NULL,
	PRIMARY KEY Interaction (__IDInteraction__)
) ;

CREATE TABLE PartDecomposition (
	__IDPartDecomposition__ Integer NOT NULL,
	PRIMARY KEY PartDecomposition (__IDPartDecomposition__)
) ;

CREATE TABLE InteractionUse (
	__IDInteractionUse__ Integer NOT NULL,
	FOREIGN KEY refersTo (__FKrefersTo__) REFERENCES Interaction (__IDInteraction__),
	PRIMARY KEY InteractionUse (__IDInteractionUse__),
	__FKrefersTo__ Integer
) ;

CREATE TABLE InteractionFragment (
	__IDInteractionFragment__ Integer NOT NULL,
	FOREIGN KEY enclosingInteraction (__FKenclosingInteraction__) REFERENCES Interaction (__IDInteraction__),
	FOREIGN KEY enclosingOperand (__FKenclosingOperand__) REFERENCES InteractionOperand (__IDInteractionOperand__),
	PRIMARY KEY InteractionFragment (__IDInteractionFragment__),
	__FKenclosingInteraction__ Integer,
	__FKenclosingOperand__ Integer
) ;

CREATE TABLE Pseudostate (
	__IDPseudostate__ Integer NOT NULL,
	kind text,
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY Pseudostate (__IDPseudostate__),
	__FKstateMachine__ Integer,
	__FKstate__ Integer
) ;

CREATE TABLE ConnectionPointReference (
	__IDConnectionPointReference__ Integer NOT NULL,
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY ConnectionPointReference (__IDConnectionPointReference__),
	__FKstate__ Integer
) ;

CREATE TABLE StructuredActivityNode (
	__IDStructuredActivityNode__ Integer NOT NULL,
	mustIsolate Boolean,
	PRIMARY KEY StructuredActivityNode (__IDStructuredActivityNode__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY scope (__FKscope__) REFERENCES StructuredActivityNode (__IDStructuredActivityNode__),
	FOREIGN KEY activityScope (__FKactivityScope__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKscope__ Integer,
	__FKactivityScope__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	isReadOnly Boolean,
	isSingleExecution Boolean,
	PRIMARY KEY Activity (__IDActivity__)
) ;

CREATE TABLE OccurrenceSpecification (
	__IDOccurrenceSpecification__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY OccurrenceSpecification (__IDOccurrenceSpecification__),
	__FKevent__ Integer
) ;

CREATE TABLE DeploymentSpecification (
	__IDDeploymentSpecification__ Integer NOT NULL,
	deploymentLocation text,
	executionLocation text,
	FOREIGN KEY deployment (__FKdeployment__) REFERENCES Deployment (__IDDeployment__),
	PRIMARY KEY DeploymentSpecification (__IDDeploymentSpecification__),
	__FKdeployment__ Integer
) ;

CREATE TABLE Gate (
	__IDGate__ Integer NOT NULL,
	PRIMARY KEY Gate (__IDGate__)
) ;

CREATE TABLE Artifact (
	__IDArtifact__ Integer NOT NULL,
	fileName text,
	PRIMARY KEY Artifact (__IDArtifact__)
) ;

CREATE TABLE GeneralOrdering (
	__IDGeneralOrdering__ Integer NOT NULL,
	FOREIGN KEY "before" (__FKbefore__) REFERENCES OccurrenceSpecification (__IDOccurrenceSpecification__),
	FOREIGN KEY after (__FKafter__) REFERENCES OccurrenceSpecification (__IDOccurrenceSpecification__),
	PRIMARY KEY GeneralOrdering (__IDGeneralOrdering__),
	__FKbefore__ Integer,
	__FKafter__ Integer
) ;

CREATE TABLE Manifestation (
	__IDManifestation__ Integer NOT NULL,
	FOREIGN KEY utilizedElement (__FKutilizedElement__) REFERENCES PackageableElement (__IDPackageableElement__),
	PRIMARY KEY Manifestation (__IDManifestation__),
	__FKutilizedElement__ Integer
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

CREATE TABLE Element_ownedElement_Element (
	__IDElement__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Element_ownedComment_Comment (
	__IDElement__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE Comment_annotatedElement_Element (
	__IDComment__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Package_ownedType_Type (
	__IDPackage__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Package_packageMerge_PackageMerge (
	__IDPackage__ Integer NOT NULL,
	__IDPackageMerge__ Integer NOT NULL
) ;

CREATE TABLE Package_packagedElement_PackageableElement (
	__IDPackage__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE Package_nestedPackage_Package (
	__IDPackage__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Package_profileApplication_ProfileApplication (
	__IDPackage__ Integer NOT NULL,
	__IDProfileApplication__ Integer NOT NULL
) ;

CREATE TABLE NamedElement_clientDependency_Dependency (
	__IDNamedElement__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE ConnectableElement_end_ConnectorEnd (
	__IDConnectableElement__ Integer NOT NULL,
	__IDConnectorEnd__ Integer NOT NULL
) ;

CREATE TABLE TemplateableElement_templateBinding_TemplateBinding (
	__IDTemplateableElement__ Integer NOT NULL,
	__IDTemplateBinding__ Integer NOT NULL
) ;

CREATE TABLE Property_redefinedProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Property_subsettedProperty_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Property_qualifier_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Dependency_supplier_NamedElement (
	__IDDependency__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Dependency_client_NamedElement (
	__IDDependency__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE DirectedRelationship_source_Element (
	__IDDirectedRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE DirectedRelationship_target_Element (
	__IDDirectedRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Relationship_relatedElement_Element (
	__IDRelationship__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Namespace_elementImport_ElementImport (
	__IDNamespace__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;

CREATE TABLE Namespace_packageImport_PackageImport (
	__IDNamespace__ Integer NOT NULL,
	__IDPackageImport__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedRule_Constraint (
	__IDNamespace__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Namespace_member_NamedElement (
	__IDNamespace__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Namespace_importedMember_PackageableElement (
	__IDNamespace__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedMember_NamedElement (
	__IDNamespace__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Constraint_constrainedElement_Element (
	__IDConstraint__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Association_ownedEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Association_endType_Type (
	__IDAssociation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Association_memberEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Association_navigableOwnedEnd_Property (
	__IDAssociation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Classifier_generalization_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeExtent_GeneralizationSet (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralizationSet__ Integer NOT NULL
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Classifier_inheritedMember_NamedElement (
	__IDClassifier__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Classifier_redefinedClassifier_Classifier (
	__IDClassifier__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Classifier_general_Classifier (
	__IDClassifier__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Classifier_substitution_Substitution (
	__IDClassifier__ Integer NOT NULL,
	__IDSubstitution__ Integer NOT NULL
) ;

CREATE TABLE Classifier_attribute_Property (
	__IDClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Classifier_collaborationUse_CollaborationUse (
	__IDClassifier__ Integer NOT NULL,
	__IDCollaborationUse__ Integer NOT NULL
) ;

CREATE TABLE Classifier_ownedUseCase_UseCase (
	__IDClassifier__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Classifier_useCase_UseCase (
	__IDClassifier__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE RedefinableElement_redefinedElement_RedefinableElement (
	__IDRedefinableElement__ Integer NOT NULL,
	__IDRedefinableElement__ Integer NOT NULL
) ;

CREATE TABLE RedefinableElement_redefinitionContext_Classifier (
	__IDRedefinableElement__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE TemplateBinding_parameterSubstitution_TemplateParameterSubstitution (
	__IDTemplateBinding__ Integer NOT NULL,
	__IDTemplateParameterSubstitution__ Integer NOT NULL
) ;

CREATE TABLE TemplateSignature_parameter_TemplateParameter (
	__IDTemplateSignature__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE TemplateSignature_ownedParameter_TemplateParameter (
	__IDTemplateSignature__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE TemplateParameterSubstitution_actual_ParameterableElement (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	__IDParameterableElement__ Integer NOT NULL
) ;

CREATE TABLE TemplateParameterSubstitution_ownedActual_ParameterableElement (
	__IDTemplateParameterSubstitution__ Integer NOT NULL,
	__IDParameterableElement__ Integer NOT NULL
) ;

CREATE TABLE Generalization_generalizationSet_GeneralizationSet (
	__IDGeneralization__ Integer NOT NULL,
	__IDGeneralizationSet__ Integer NOT NULL
) ;

CREATE TABLE GeneralizationSet_generalization_Generalization (
	__IDGeneralizationSet__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE Feature_featuringClassifier_Classifier (
	__IDFeature__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Profile_ownedStereotype_Stereotype (
	__IDProfile__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;

CREATE TABLE Profile_metaclassReference_ElementImport (
	__IDProfile__ Integer NOT NULL,
	__IDElementImport__ Integer NOT NULL
) ;

CREATE TABLE Profile_metamodelReference_PackageImport (
	__IDProfile__ Integer NOT NULL,
	__IDPackageImport__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_icon_Image (
	__IDStereotype__ Integer NOT NULL,
	__IDImage__ Integer NOT NULL
) ;

CREATE TABLE Class_nestedClassifier_Classifier (
	__IDClass__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedOperation_Operation (
	__IDClass__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Class_superClass_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedReception_Reception (
	__IDClass__ Integer NOT NULL,
	__IDReception__ Integer NOT NULL
) ;

CREATE TABLE Class_extension_Extension (
	__IDClass__ Integer NOT NULL,
	__IDExtension__ Integer NOT NULL
) ;

CREATE TABLE StringExpression_subExpression_StringExpression (
	__IDStringExpression__ Integer NOT NULL,
	__IDStringExpression__ Integer NOT NULL
) ;

CREATE TABLE Expression_operand_ValueSpecification (
	__IDExpression__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_ownedBehavior_Behavior (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_interfaceRealization_InterfaceRealization (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDInterfaceRealization__ Integer NOT NULL
) ;

CREATE TABLE BehavioredClassifier_ownedTrigger_Trigger (
	__IDBehavioredClassifier__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE Behavior_redefinedBehavior_Behavior (
	__IDBehavior__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Behavior_ownedParameter_Parameter (
	__IDBehavior__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Behavior_precondition_Constraint (
	__IDBehavior__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Behavior_postcondition_Constraint (
	__IDBehavior__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Behavior_ownedParameterSet_ParameterSet (
	__IDBehavior__ Integer NOT NULL,
	__IDParameterSet__ Integer NOT NULL
) ;

CREATE TABLE DeploymentTarget_deployment_Deployment (
	__IDDeploymentTarget__ Integer NOT NULL,
	__IDDeployment__ Integer NOT NULL
) ;

CREATE TABLE DeploymentTarget_deployedElement_PackageableElement (
	__IDDeploymentTarget__ Integer NOT NULL,
	__IDPackageableElement__ Integer NOT NULL
) ;

CREATE TABLE DataType_ownedAttribute_Property (
	__IDDataType__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE DataType_ownedOperation_Operation (
	__IDDataType__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE CollaborationUse_roleBinding_Dependency (
	__IDCollaborationUse__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;

CREATE TABLE UseCase_include_Include (
	__IDUseCase__ Integer NOT NULL,
	__IDInclude__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extend_Extend (
	__IDUseCase__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extensionPoint_ExtensionPoint (
	__IDUseCase__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE UseCase_subject_Classifier (
	__IDUseCase__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Parameter_parameterSet_ParameterSet (
	__IDParameter__ Integer NOT NULL,
	__IDParameterSet__ Integer NOT NULL
) ;

CREATE TABLE EncapsulatedClassifier_ownedPort_Port (
	__IDEncapsulatedClassifier__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Operation_precondition_Constraint (
	__IDOperation__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Operation_postcondition_Constraint (
	__IDOperation__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Operation_redefinedOperation_Operation (
	__IDOperation__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_node_ActivityNode (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_subpartition_ActivityPartition (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE ActivityPartition_edge_ActivityEdge (
	__IDActivityPartition__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_ownedLiteral_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;

CREATE TABLE InstanceSpecification_classifier_Classifier (
	__IDInstanceSpecification__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE InstanceSpecification_slot_Slot (
	__IDInstanceSpecification__ Integer NOT NULL,
	__IDSlot__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_ownedParameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_method_Behavior (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_raisedException_Type (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_ownedParameterSet_ParameterSet (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameterSet__ Integer NOT NULL
) ;

CREATE TABLE Signal_ownedAttribute_Property (
	__IDSignal__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE TimeExpression_observation_Observation (
	__IDTimeExpression__ Integer NOT NULL,
	__IDObservation__ Integer NOT NULL
) ;

CREATE TABLE Duration_observation_Observation (
	__IDDuration__ Integer NOT NULL,
	__IDObservation__ Integer NOT NULL
) ;

CREATE TABLE DurationObservation_event_NamedElement (
	__IDDurationObservation__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE Port_required_Interface (
	__IDPort__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Port_redefinedPort_Port (
	__IDPort__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Port_provided_Interface (
	__IDPort__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Action_output_OutputPin (
	__IDAction__ Integer NOT NULL,
	__IDOutputPin__ Integer NOT NULL
) ;

CREATE TABLE Action_input_InputPin (
	__IDAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Action_localPrecondition_Constraint (
	__IDAction__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Action_localPostcondition_Constraint (
	__IDAction__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Message_argument_ValueSpecification (
	__IDMessage__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Lifeline_coveredBy_InteractionFragment (
	__IDLifeline__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;

CREATE TABLE InvocationAction_argument_InputPin (
	__IDInvocationAction__ Integer NOT NULL,
	__IDInputPin__ Integer NOT NULL
) ;

CREATE TABLE Connector_redefinedConnector_Connector (
	__IDConnector__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE Connector_end_ConnectorEnd (
	__IDConnector__ Integer NOT NULL,
	__IDConnectorEnd__ Integer NOT NULL
) ;

CREATE TABLE Connector_contract_Behavior (
	__IDConnector__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_collaborationRole_ConnectableElement (
	__IDCollaboration__ Integer NOT NULL,
	__IDConnectableElement__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedAttribute_Property (
	__IDInterface__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedOperation_Operation (
	__IDInterface__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Interface_nestedClassifier_Classifier (
	__IDInterface__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE Interface_redefinedInterface_Interface (
	__IDInterface__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Interface_ownedReception_Reception (
	__IDInterface__ Integer NOT NULL,
	__IDReception__ Integer NOT NULL
) ;

CREATE TABLE Trigger_port_Port (
	__IDTrigger__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE ProtocolStateMachine_conformance_ProtocolConformance (
	__IDProtocolStateMachine__ Integer NOT NULL,
	__IDProtocolConformance__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_region_Region (
	__IDStateMachine__ Integer NOT NULL,
	__IDRegion__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_submachineState_State (
	__IDStateMachine__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_connectionPoint_Pseudostate (
	__IDStateMachine__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_extendedStateMachine_StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	__IDStateMachine__ Integer NOT NULL
) ;

CREATE TABLE Deployment_deployedArtifact_DeployedArtifact (
	__IDDeployment__ Integer NOT NULL,
	__IDDeployedArtifact__ Integer NOT NULL
) ;

CREATE TABLE Deployment_configuration_DeploymentSpecification (
	__IDDeployment__ Integer NOT NULL,
	__IDDeploymentSpecification__ Integer NOT NULL
) ;

CREATE TABLE Extend_extensionLocation_ExtensionPoint (
	__IDExtend__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE Region_subvertex_Vertex (
	__IDRegion__ Integer NOT NULL,
	__IDVertex__ Integer NOT NULL
) ;

CREATE TABLE Region_transition_Transition (
	__IDRegion__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_ownedAttribute_Property (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_part_Property (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_role_ConnectableElement (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDConnectableElement__ Integer NOT NULL
) ;

CREATE TABLE StructuredClassifier_ownedConnector_Connector (
	__IDStructuredClassifier__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE Vertex_incoming_Transition (
	__IDVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Vertex_outgoing_Transition (
	__IDVertex__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Transition_trigger_Trigger (
	__IDTransition__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE State_connection_ConnectionPointReference (
	__IDState__ Integer NOT NULL,
	__IDConnectionPointReference__ Integer NOT NULL
) ;

CREATE TABLE State_connectionPoint_Pseudostate (
	__IDState__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE State_deferrableTrigger_Trigger (
	__IDState__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE State_region_Region (
	__IDState__ Integer NOT NULL,
	__IDRegion__ Integer NOT NULL
) ;

CREATE TABLE ParameterSet_parameter_Parameter (
	__IDParameterSet__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ParameterSet_condition_Constraint (
	__IDParameterSet__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_outgoing_ActivityEdge (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_incoming_ActivityEdge (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inPartition_ActivityPartition (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inInterruptibleRegion_InterruptibleActivityRegion (
	__IDActivityNode__ Integer NOT NULL,
	__IDInterruptibleActivityRegion__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_inGroup_ActivityGroup (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE ActivityNode_redefinedNode_ActivityNode (
	__IDActivityNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE ActivityGroup_subgroup_ActivityGroup (
	__IDActivityGroup__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE ActivityGroup_containedEdge_ActivityEdge (
	__IDActivityGroup__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE ActivityGroup_containedNode_ActivityNode (
	__IDActivityGroup__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_redefinedEdge_ActivityEdge (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_inPartition_ActivityPartition (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE ActivityEdge_inGroup_ActivityGroup (
	__IDActivityEdge__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE InterruptibleActivityRegion_node_ActivityNode (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE InterruptibleActivityRegion_interruptingEdge_ActivityEdge (
	__IDInterruptibleActivityRegion__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Slot_value_ValueSpecification (
	__IDSlot__ Integer NOT NULL,
	__IDValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE ExecutableNode_handler_ExceptionHandler (
	__IDExecutableNode__ Integer NOT NULL,
	__IDExceptionHandler__ Integer NOT NULL
) ;

CREATE TABLE ExceptionHandler_exceptionType_Classifier (
	__IDExceptionHandler__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE ObjectNode_inState_State (
	__IDObjectNode__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE Interaction_lifeline_Lifeline (
	__IDInteraction__ Integer NOT NULL,
	__IDLifeline__ Integer NOT NULL
) ;

CREATE TABLE Interaction_fragment_InteractionFragment (
	__IDInteraction__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;

CREATE TABLE Interaction_action_Action (
	__IDInteraction__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Interaction_formalGate_Gate (
	__IDInteraction__ Integer NOT NULL,
	__IDGate__ Integer NOT NULL
) ;

CREATE TABLE Interaction_message_Message (
	__IDInteraction__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE InteractionUse_actualGate_Gate (
	__IDInteractionUse__ Integer NOT NULL,
	__IDGate__ Integer NOT NULL
) ;

CREATE TABLE InteractionUse_argument_Action (
	__IDInteractionUse__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE InteractionFragment_covered_Lifeline (
	__IDInteractionFragment__ Integer NOT NULL,
	__IDLifeline__ Integer NOT NULL
) ;

CREATE TABLE InteractionFragment_generalOrdering_GeneralOrdering (
	__IDInteractionFragment__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE ConnectionPointReference_entry_Pseudostate (
	__IDConnectionPointReference__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE ConnectionPointReference_exit_Pseudostate (
	__IDConnectionPointReference__ Integer NOT NULL,
	__IDPseudostate__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_variable_Variable (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_edge_ActivityEdge (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE StructuredActivityNode_node_ActivityNode (
	__IDStructuredActivityNode__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Activity_structuredNode_StructuredActivityNode (
	__IDActivity__ Integer NOT NULL,
	__IDStructuredActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Activity_variable_Variable (
	__IDActivity__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Activity_node_ActivityNode (
	__IDActivity__ Integer NOT NULL,
	__IDActivityNode__ Integer NOT NULL
) ;

CREATE TABLE Activity_edge_ActivityEdge (
	__IDActivity__ Integer NOT NULL,
	__IDActivityEdge__ Integer NOT NULL
) ;

CREATE TABLE Activity_partition_ActivityPartition (
	__IDActivity__ Integer NOT NULL,
	__IDActivityPartition__ Integer NOT NULL
) ;

CREATE TABLE Activity_group_ActivityGroup (
	__IDActivity__ Integer NOT NULL,
	__IDActivityGroup__ Integer NOT NULL
) ;

CREATE TABLE OccurrenceSpecification_toBefore_GeneralOrdering (
	__IDOccurrenceSpecification__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE OccurrenceSpecification_toAfter_GeneralOrdering (
	__IDOccurrenceSpecification__ Integer NOT NULL,
	__IDGeneralOrdering__ Integer NOT NULL
) ;

CREATE TABLE Artifact_nestedArtifact_Artifact (
	__IDArtifact__ Integer NOT NULL,
	__IDArtifact__ Integer NOT NULL
) ;

CREATE TABLE Artifact_manifestation_Manifestation (
	__IDArtifact__ Integer NOT NULL,
	__IDManifestation__ Integer NOT NULL
) ;

CREATE TABLE Artifact_ownedOperation_Operation (
	__IDArtifact__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Artifact_ownedAttribute_Property (
	__IDArtifact__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE InteractionOperand_fragment_InteractionFragment (
	__IDInteractionOperand__ Integer NOT NULL,
	__IDInteractionFragment__ Integer NOT NULL
) ;
