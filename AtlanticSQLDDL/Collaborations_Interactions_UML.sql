CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE ProviderClause (
	__IDProviderClause__ Integer NOT NULL,
	FOREIGN KEY ownedEltColl (__FKownedEltColl__) REFERENCES CollaborationPackage (__IDCollaborationPackage__),
	PRIMARY KEY ProviderClause (__IDProviderClause__),
	__FKownedEltColl__ Integer
) ;

CREATE TABLE CollaborationPackage (
	__IDCollaborationPackage__ Integer NOT NULL,
	FOREIGN KEY ownedElt (__FKownedElt__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY CollaborationPackage (__IDCollaborationPackage__),
	__FKownedElt__ Integer
) ;

CREATE TABLE Collaboration (
	__IDCollaboration__ Integer NOT NULL,
	FOREIGN KEY ownedEltAss (__FKownedEltAss__) REFERENCES AssociationRole (__IDAssociationRole__),
	FOREIGN KEY ownedEltClass (__FKownedEltClass__) REFERENCES ClassifierRole (__IDClassifierRole__),
	PRIMARY KEY Collaboration (__IDCollaboration__),
	__FKownedEltAss__ Integer,
	__FKownedEltClass__ Integer
) ;

CREATE TABLE InteractionPackage (
	__IDInteractionPackage__ Integer NOT NULL,
	FOREIGN KEY providerClause (__FKproviderClause__) REFERENCES ProviderClause (__IDProviderClause__),
	FOREIGN KEY ownedElt (__FKownedElt__) REFERENCES Interaction (__IDInteraction__),
	PRIMARY KEY InteractionPackage (__IDInteractionPackage__),
	__FKproviderClause__ Integer,
	__FKownedElt__ Integer
) ;

CREATE TABLE Interaction (
	__IDInteraction__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Collaboration (__IDCollaboration__),
	PRIMARY KEY Interaction (__IDInteraction__),
	__FKcontext__ Integer
) ;

CREATE TABLE AssociationRole (
	__IDAssociationRole__ Integer NOT NULL,
	PRIMARY KEY AssociationRole (__IDAssociationRole__)
) ;

CREATE TABLE ClassifierRole (
	__IDClassifierRole__ Integer NOT NULL,
	FOREIGN KEY receiverMess (__FKreceiverMess__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY senderMess (__FKsenderMess__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY base (__FKbase__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY ClassifierRole (__IDClassifierRole__),
	__FKbase__ Integer,
	__FKsenderMess__ Integer,
	__FKreceiverMess__ Integer
) ;

CREATE TABLE AssociationEndRole (
	__IDAssociationEndRole__ Integer NOT NULL,
	FOREIGN KEY associationRole (__FKassociationRole__) REFERENCES AssociationRole (__IDAssociationRole__),
	FOREIGN KEY type (__FKtype__) REFERENCES ClassifierRole (__IDClassifierRole__),
	PRIMARY KEY AssociationEndRole (__IDAssociationEndRole__),
	__FKtype__ Integer,
	__FKassociationRole__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	FOREIGN KEY activator (__FKactivator__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY receiver (__FKreceiver__) REFERENCES ClassifierRole (__IDClassifierRole__),
	FOREIGN KEY sender (__FKsender__) REFERENCES ClassifierRole (__IDClassifierRole__),
	FOREIGN KEY specification (__FKspecification__) REFERENCES Request (__IDRequest__),
	PRIMARY KEY Message (__IDMessage__),
	__FKsender__ Integer,
	__FKreceiver__ Integer,
	__FKactivator__ Integer,
	__FKspecification__ Integer
) ;

CREATE TABLE Request (
	__IDRequest__ Integer NOT NULL,
	PRIMARY KEY Request (__IDRequest__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKowner__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE Interaction_message_Message (
	__IDInteraction__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_availableFeature_Operation (
	__IDClassifierRole__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Collaboration_interaction_Interaction (
	__IDCollaboration__ Integer NOT NULL,
	__IDInteraction__ Integer NOT NULL
) ;

CREATE TABLE Message_interaction_Interaction (
	__IDMessage__ Integer NOT NULL,
	__IDInteraction__ Integer NOT NULL
) ;

CREATE TABLE ClassifierRole_associationEndRole_AssociationEndRole (
	__IDClassifierRole__ Integer NOT NULL,
	__IDAssociationEndRole__ Integer NOT NULL
) ;

CREATE TABLE Interface_feature_Operation (
	__IDInterface__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Interface_classifierRole_ClassifierRole (
	__IDInterface__ Integer NOT NULL,
	__IDClassifierRole__ Integer NOT NULL
) ;

CREATE TABLE ProviderClause_ownedEltInt_InteractionPackage (
	__IDProviderClause__ Integer NOT NULL,
	__IDInteractionPackage__ Integer NOT NULL
) ;

CREATE TABLE Message_message_Message (
	__IDMessage__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE Operation_classifierRole_ClassifierRole (
	__IDOperation__ Integer NOT NULL,
	__IDClassifierRole__ Integer NOT NULL
) ;

CREATE TABLE AssociationRole_connection_AssociationEndRole (
	__IDAssociationRole__ Integer NOT NULL,
	__IDAssociationEndRole__ Integer NOT NULL
) ;

CREATE TABLE Request_message_Message (
	__IDRequest__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;
