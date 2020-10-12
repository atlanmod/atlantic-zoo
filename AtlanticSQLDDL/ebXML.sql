CREATE TABLE MultyPartyCollaboration (
	__IDMultyPartyCollaboration__ Integer NOT NULL,
	PRIMARY KEY MultyPartyCollaboration (__IDMultyPartyCollaboration__)
) ;

CREATE TABLE BusinessPartnerRole (
	__IDBusinessPartnerRole__ Integer NOT NULL,
	FOREIGN KEY collaboration (__FKcollaboration__) REFERENCES MultyPartyCollaboration (__IDMultyPartyCollaboration__),
	FOREIGN KEY transition (__FKtransition__) REFERENCES Transaction (__IDTransaction__),
	PRIMARY KEY BusinessPartnerRole (__IDBusinessPartnerRole__),
	__FKtransition__ Integer,
	__FKcollaboration__ Integer
) ;

CREATE TABLE Performs (
	__IDPerforms__ Integer NOT NULL,
	FOREIGN KEY performedBy (__FKperformedBy__) REFERENCES BusinessPartnerRole (__IDBusinessPartnerRole__),
	FOREIGN KEY collaboration (__FKcollaboration__) REFERENCES BinaryCollaboration (__IDBinaryCollaboration__),
	FOREIGN KEY role (__FKrole__) REFERENCES AuthorizedRole (__IDAuthorizedRole__),
	PRIMARY KEY Performs (__IDPerforms__),
	__FKperformedBy__ Integer,
	__FKcollaboration__ Integer,
	__FKrole__ Integer
) ;

CREATE TABLE AuthorizedRole (
	__IDAuthorizedRole__ Integer NOT NULL,
	isInitiator Boolean,
	PRIMARY KEY AuthorizedRole (__IDAuthorizedRole__)
) ;

CREATE TABLE Transaction (
	__IDTransaction__ Integer NOT NULL,
	onInitiation text,
	conditionGuard text,
	conditionExpression text,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES BusinessState (__IDBusinessState__),
	FOREIGN KEY "to" (__FKto__) REFERENCES BusinessState (__IDBusinessState__),
	PRIMARY KEY Transaction (__IDTransaction__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE BinaryCollaboration (
	__IDBinaryCollaboration__ Integer NOT NULL,
	pattern text,
	timeToPerform text,
	preCondition text,
	postCondition text,
	beginsWhen text,
	endsWhen text,
	PRIMARY KEY BinaryCollaboration (__IDBinaryCollaboration__)
) ;

CREATE TABLE BusinessState (
	__IDBusinessState__ Integer NOT NULL,
	FOREIGN KEY collaboration (__FKcollaboration__) REFERENCES BinaryCollaboration (__IDBinaryCollaboration__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES AuthorizedRole (__IDAuthorizedRole__),
	FOREIGN KEY "to" (__FKto__) REFERENCES AuthorizedRole (__IDAuthorizedRole__),
	PRIMARY KEY BusinessState (__IDBusinessState__),
	__FKcollaboration__ Integer,
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Start (
	__IDStart__ Integer NOT NULL,
	PRIMARY KEY Start (__IDStart__)
) ;

CREATE TABLE Fork (
	__IDFork__ Integer NOT NULL,
	waitForAll text,
	PRIMARY KEY Fork (__IDFork__)
) ;

CREATE TABLE "Join" (
	__IDJoin__ Integer NOT NULL,
	PRIMARY KEY "Join" (__IDJoin__)
) ;

CREATE TABLE CompletionState (
	__IDCompletionState__ Integer NOT NULL,
	guardCondition text,
	PRIMARY KEY CompletionState (__IDCompletionState__)
) ;

CREATE TABLE Failure (
	__IDFailure__ Integer NOT NULL,
	PRIMARY KEY Failure (__IDFailure__)
) ;

CREATE TABLE Success (
	__IDSuccess__ Integer NOT NULL,
	PRIMARY KEY Success (__IDSuccess__)
) ;

CREATE TABLE BusinessActivity (
	__IDBusinessActivity__ Integer NOT NULL,
	PRIMARY KEY BusinessActivity (__IDBusinessActivity__)
) ;

CREATE TABLE BusinessTransactionActivity (
	__IDBusinessTransactionActivity__ Integer NOT NULL,
	timeToPerform text,
	isConcurrent Boolean,
	isLegallyBinding Boolean,
	FOREIGN KEY "use" (__FKuse__) REFERENCES BusinessTransaction (__IDBusinessTransaction__),
	PRIMARY KEY BusinessTransactionActivity (__IDBusinessTransactionActivity__),
	__FKuse__ Integer
) ;

CREATE TABLE CollaborationActivity (
	__IDCollaborationActivity__ Integer NOT NULL,
	FOREIGN KEY "use" (__FKuse__) REFERENCES BinaryCollaboration (__IDBinaryCollaboration__),
	PRIMARY KEY CollaborationActivity (__IDCollaborationActivity__),
	__FKuse__ Integer
) ;

CREATE TABLE BusinessTransaction (
	__IDBusinessTransaction__ Integer NOT NULL,
	pattern text,
	isGuaranteedDeliveryRequired Boolean,
	preCondition text,
	postCondition text,
	beginsWhen text,
	endsWhen text,
	FOREIGN KEY requester (__FKrequester__) REFERENCES RequestingBusinessActivity (__IDRequestingBusinessActivity__),
	FOREIGN KEY responder (__FKresponder__) REFERENCES RespondingBusinessActivity (__IDRespondingBusinessActivity__),
	PRIMARY KEY BusinessTransaction (__IDBusinessTransaction__),
	__FKrequester__ Integer,
	__FKresponder__ Integer
) ;

CREATE TABLE BusinessAction (
	__IDBusinessAction__ Integer NOT NULL,
	isIntelligiblecheckRequired Boolean,
	isAuthorizationRequired Boolean,
	timeToAcknowledgeReceipt text,
	isNonRepudiationRequired Boolean,
	isNonRepudiationOfRecipientRequired Boolean,
	PRIMARY KEY BusinessAction (__IDBusinessAction__)
) ;

CREATE TABLE RequestingBusinessActivity (
	__IDRequestingBusinessActivity__ Integer NOT NULL,
	timeToAcknowledgeAcceptance text,
	FOREIGN KEY transaction (__FKtransaction__) REFERENCES BusinessTransaction (__IDBusinessTransaction__),
	FOREIGN KEY documentEnvelope (__FKdocumentEnvelope__) REFERENCES DocumentEnvelope (__IDDocumentEnvelope__),
	PRIMARY KEY RequestingBusinessActivity (__IDRequestingBusinessActivity__),
	__FKdocumentEnvelope__ Integer,
	__FKtransaction__ Integer
) ;

CREATE TABLE RespondingBusinessActivity (
	__IDRespondingBusinessActivity__ Integer NOT NULL,
	FOREIGN KEY transaction (__FKtransaction__) REFERENCES BusinessTransaction (__IDBusinessTransaction__),
	FOREIGN KEY documentEnvelope (__FKdocumentEnvelope__) REFERENCES DocumentEnvelope (__IDDocumentEnvelope__),
	PRIMARY KEY RespondingBusinessActivity (__IDRespondingBusinessActivity__),
	__FKtransaction__ Integer,
	__FKdocumentEnvelope__ Integer
) ;

CREATE TABLE DocumentSecurity (
	__IDDocumentSecurity__ Integer NOT NULL,
	isConfidential Boolean,
	isTamperProof Boolean,
	isAuthenticated Boolean,
	PRIMARY KEY DocumentSecurity (__IDDocumentSecurity__)
) ;

CREATE TABLE DocumentEnvelope (
	__IDDocumentEnvelope__ Integer NOT NULL,
	isPositiveResponse Boolean,
	FOREIGN KEY requesting (__FKrequesting__) REFERENCES RequestingBusinessActivity (__IDRequestingBusinessActivity__),
	FOREIGN KEY responding (__FKresponding__) REFERENCES RespondingBusinessActivity (__IDRespondingBusinessActivity__),
	FOREIGN KEY document (__FKdocument__) REFERENCES BusinessDocument (__IDBusinessDocument__),
	PRIMARY KEY DocumentEnvelope (__IDDocumentEnvelope__),
	__FKresponding__ Integer,
	__FKdocument__ Integer,
	__FKrequesting__ Integer
) ;

CREATE TABLE Attachment (
	__IDAttachment__ Integer NOT NULL,
	mimeType text,
	specification text,
	version text,
	FOREIGN KEY envelope (__FKenvelope__) REFERENCES DocumentEnvelope (__IDDocumentEnvelope__),
	FOREIGN KEY document (__FKdocument__) REFERENCES BusinessDocument (__IDBusinessDocument__),
	PRIMARY KEY Attachment (__IDAttachment__),
	__FKenvelope__ Integer,
	__FKdocument__ Integer
) ;

CREATE TABLE BusinessDocument (
	__IDBusinessDocument__ Integer NOT NULL,
	specificationLocation text,
	specificationElement text,
	conditionExpression text,
	PRIMARY KEY BusinessDocument (__IDBusinessDocument__)
) ;

CREATE TABLE AuthorizedRole_performers_Performs (
	__IDAuthorizedRole__ Integer NOT NULL,
	__IDPerforms__ Integer NOT NULL
) ;

CREATE TABLE BusinessDocument_envelopes_DocumentEnvelope (
	__IDBusinessDocument__ Integer NOT NULL,
	__IDDocumentEnvelope__ Integer NOT NULL
) ;

CREATE TABLE BinaryCollaboration_transitions_Transaction (
	__IDBinaryCollaboration__ Integer NOT NULL,
	__IDTransaction__ Integer NOT NULL
) ;

CREATE TABLE BinaryCollaboration_roles_Performs (
	__IDBinaryCollaboration__ Integer NOT NULL,
	__IDPerforms__ Integer NOT NULL
) ;

CREATE TABLE MultyPartyCollaboration_partners_BusinessPartnerRole (
	__IDMultyPartyCollaboration__ Integer NOT NULL,
	__IDBusinessPartnerRole__ Integer NOT NULL
) ;

CREATE TABLE DocumentEnvelope_attachements_Attachment (
	__IDDocumentEnvelope__ Integer NOT NULL,
	__IDAttachment__ Integer NOT NULL
) ;

CREATE TABLE BusinessDocument_attachments_Attachment (
	__IDBusinessDocument__ Integer NOT NULL,
	__IDAttachment__ Integer NOT NULL
) ;

CREATE TABLE BinaryCollaboration_states_BusinessState (
	__IDBinaryCollaboration__ Integer NOT NULL,
	__IDBusinessState__ Integer NOT NULL
) ;

CREATE TABLE BusinessPartnerRole_performers_Performs (
	__IDBusinessPartnerRole__ Integer NOT NULL,
	__IDPerforms__ Integer NOT NULL
) ;
