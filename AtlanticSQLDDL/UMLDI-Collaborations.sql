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

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Classifier (__IDClassifier__),
	multiplicity text,
	changeability text,
	targetScope text,
	ordering text,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKtype__ Integer
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	FOREIGN KEY participant (__FKparticipant__) REFERENCES Classifier (__IDClassifier__),
	isNavigable Boolean,
	ordering text,
	aggregation text,
	targetScope text,
	multiplicity text,
	changeability text,
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__),
	__FKassociation__ Integer,
	__FKparticipant__ Integer
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
	initialValue text,
	PRIMARY KEY Attribute (__IDAttribute__),
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
	defaultValue text,
	kind text,
	PRIMARY KEY Parameter (__IDParameter__),
	__FKtype__ Integer,
	__FKbehavioralFeature__ Integer
) ;

CREATE TABLE Generalization (
	__IDGeneralization__ Integer NOT NULL,
	FOREIGN KEY parent (__FKparent__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	FOREIGN KEY powertype (__FKpowertype__) REFERENCES Classifier (__IDClassifier__),
	FOREIGN KEY child (__FKchild__) REFERENCES GeneralizableElement (__IDGeneralizableElement__),
	discriminator text,
	PRIMARY KEY Generalization (__IDGeneralization__),
	__FKpowertype__ Integer,
	__FKchild__ Integer,
	__FKparent__ Integer
) ;

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

CREATE TABLE AttributeLink (
	__IDAttributeLink__ Integer NOT NULL,
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY linkEnd (__FKlinkEnd__) REFERENCES LinkEnd (__IDLinkEnd__),
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY AttributeLink (__IDAttributeLink__),
	__FKinstance__ Integer,
	__FKattribute__ Integer,
	__FKvalue__ Integer,
	__FKlinkEnd__ Integer
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

CREATE TABLE LinkEnd (
	__IDLinkEnd__ Integer NOT NULL,
	FOREIGN KEY link (__FKlink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY associationEnd (__FKassociationEnd__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	PRIMARY KEY LinkEnd (__IDLinkEnd__),
	__FKassociationEnd__ Integer,
	__FKlink__ Integer,
	__FKinstance__ Integer
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
	__FKdispatchAction__ Integer,
	__FKsender__ Integer,
	__FKcommunicationLink__ Integer,
	__FKreceiver__ Integer
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

CREATE TABLE Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	FOREIGN KEY representedOperation (__FKrepresentedOperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY representedClassifier (__FKrepresentedClassifier__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Collaboration (__IDCollaboration__),
	__FKrepresentedClassifier__ Integer,
	__FKrepresentedOperation__ Integer
) ;

CREATE TABLE ClassifierRole (
	__IDClassifierRole__ Integer NOT NULL,
	multiplicity text,
	PRIMARY KEY ClassifierRole (__IDClassifierRole__)
) ;

CREATE TABLE AssociationRole (
	__IDAssociationRole__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Association (__IDAssociation__),
	multiplicity text,
	PRIMARY KEY AssociationRole (__IDAssociationRole__),
	__FKbase__ Integer
) ;

CREATE TABLE AssociationEndRole (
	__IDAssociationEndRole__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES AssociationEnd (__IDAssociationEnd__),
	collaborationMultiplicity text,
	PRIMARY KEY AssociationEndRole (__IDAssociationEndRole__),
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
	__FKinteraction__ Integer,
	__FKsender__ Integer,
	__FKreceiver__ Integer,
	__FKactivator__ Integer,
	__FKaction__ Integer
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

CREATE TABLE Link_connection_LinkEnd (
	__IDLink__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE BehavioralFeature_parameter_Parameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE AssociationRole_conformingLink_Link (
	__IDAssociationRole__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_participatingInstance_Instance (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE Message_conformingStimulus_Stimulus (
	__IDMessage__ Integer NOT NULL,
	__IDStimulus__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_constrainingElement_ModelElement (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE NodeInstance_resident_ComponentInstance (
	__IDNodeInstance__ Integer NOT NULL,
	__IDComponentInstance__ Integer NOT NULL
) ;

CREATE TABLE Message_predecessor_Message (
	__IDMessage__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE ComponentInstance_resident_Instance (
	__IDComponentInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Instance_slot_AttributeLink (
	__IDInstance__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE Stimulus_argument_Instance (
	__IDStimulus__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedLink_Link (
	__IDInstance__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Instance_linkEnd_LinkEnd (
	__IDInstance__ Integer NOT NULL,
	__IDLinkEnd__ Integer NOT NULL
) ;

CREATE TABLE Multiplicity_range_MultiplicityRange (
	__IDMultiplicity__ Integer NOT NULL,
	__IDMultiplicityRange__ Integer NOT NULL
) ;

CREATE TABLE GeneralizableElement_generalization_Generalization (
	__IDGeneralizableElement__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_interactionInstanceSet_InteractionInstanceSet (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDInteractionInstanceSet__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_specification_Classifier (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_conformingInstance_Instance (
	__IDClassifierRole__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Interaction_message_Message (
	__IDInteraction__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Instance_ownedInstance_Instance (
	__IDInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_availableContents_ModelElement (
	__IDClassifierRole__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE CollaborationInstanceSet_participatingLink_Link (
	__IDCollaborationInstanceSet__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE InteractionInstanceSet_participatingStimulus_Stimulus (
	__IDInteractionInstanceSet__ Integer NOT NULL,
	__IDStimulus__ Integer NOT NULL
) ;

CREATE TABLE Namespace_ownedElement_ModelElement (
	__IDNamespace__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_availableFeature_Feature (
	__IDClassifierRole__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;

CREATE TABLE LinkEnd_qualifiedValue_AttributeLink (
	__IDLinkEnd__ Integer NOT NULL,
	__IDAttributeLink__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_constrainingElement_ModelElement (
	__IDCollaboration__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ActionSequence_action_Action (
	__IDActionSequence__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_usedCollaboration_Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	__IDCollaboration__ Integer NOT NULL
) ;

CREATE TABLE Action_actualArgument_Argument (
	__IDAction__ Integer NOT NULL,
	__IDArgument__ Integer NOT NULL
) ;

CREATE TABLE Instance_classifier_Classifier (
	__IDInstance__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE AssociationRole_message_Message (
	__IDAssociationRole__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Classifier_powertypeRange_Generalization (
	__IDClassifier__ Integer NOT NULL,
	__IDGeneralization__ Integer NOT NULL
) ;

CREATE TABLE AssociationEnd_qualifier_Attribute (
	__IDAssociationEnd__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Association_connection_AssociationEnd (
	__IDAssociation__ Integer NOT NULL,
	__IDAssociationEnd__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_base_Classifier (
	__IDClassifierRole__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE AssociationEndRole_availableQualifier_Attribute (
	__IDAssociationEndRole__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_interaction_Interaction (
	__IDCollaboration__ Integer NOT NULL,
	__IDInteraction__ Integer NOT NULL
) ;
