module EbXML {

	type MultyPartyCollaboration {
		Partners_ContRef : BusinessPartnerRole*;
	};

	type BusinessPartnerRole {
		Collaboration_Ref : MultyPartyCollaboration;
		Transition_ContRef : Transaction?;
		Performers_ContRef : Performs*;
	};

	type Performs {
		PerformedBy_Ref : BusinessPartnerRole;
		Collaboration_Ref : BinaryCollaboration;
		Role_Ref : AuthorizedRole;
	};

	type AuthorizedRole {
		IsInitiator_Att : Logical;
		Performers_Ref : Performs*;
	};

	type Transaction {
		OnInitiation_Att : Text;
		ConditionGuard_Att : Text;
		ConditionExpression_Att : Text;
		From_Ref : BusinessState;
		To_Ref : BusinessState;
	};

	type BinaryCollaboration {
		Pattern_Att : Text;
		TimeToPerform_Att : Text;
		PreCondition_Att : Text;
		PostCondition_Att : Text;
		BeginsWhen_Att : Text;
		EndsWhen_Att : Text;
		Roles_ContRef : Performs*;
		Transitions_ContRef : Transaction*;
		States_ContRef : BusinessState*;
	};

	type BusinessState {
		Collaboration_Ref : BinaryCollaboration;
		From_Ref : AuthorizedRole;
		To_Ref : AuthorizedRole;
	};

	type Start : BusinessState;

	type Fork : BusinessState {
		WaitForAll_Att : Text;
	};

	type Join : BusinessState;

	type CompletionState : BusinessState {
		GuardCondition_Att : Text;
	};

	type Failure : CompletionState;

	type Success : CompletionState;

	type BusinessActivity : BusinessState;

	type BusinessTransactionActivity : BusinessActivity {
		TimeToPerform_Att : Text;
		IsConcurrent_Att : Logical;
		IsLegallyBinding_Att : Logical;
		Use_Ref : BusinessTransaction;
	};

	type CollaborationActivity : BusinessActivity {
		Use_Ref : BinaryCollaboration;
	};

	type BusinessTransaction {
		Pattern_Att : Text;
		IsGuaranteedDeliveryRequired_Att : Logical;
		PreCondition_Att : Text;
		PostCondition_Att : Text;
		BeginsWhen_Att : Text;
		EndsWhen_Att : Text;
		Requester_ContRef : RequestingBusinessActivity;
		Responder_ContRef : RespondingBusinessActivity;
	};

	type BusinessAction {
		IsIntelligiblecheckRequired_Att : Logical;
		IsAuthorizationRequired_Att : Logical;
		TimeToAcknowledgeReceipt_Att : Text;
		IsNonRepudiationRequired_Att : Logical;
		IsNonRepudiationOfRecipientRequired_Att : Logical;
	};

	type RequestingBusinessActivity : BusinessAction {
		TimeToAcknowledgeAcceptance_Att : Text;
		Transaction_ContRef : BusinessTransaction;
		DocumentEnvelope_Ref : DocumentEnvelope;
	};

	type RespondingBusinessActivity : BusinessAction {
		Transaction_ContRef : BusinessTransaction;
		DocumentEnvelope_Ref : DocumentEnvelope;
	};

	type DocumentSecurity {
		IsConfidential_Att : Logical;
		IsTamperProof_Att : Logical;
		IsAuthenticated_Att : Logical;
	};

	type DocumentEnvelope : DocumentSecurity {
		IsPositiveResponse_Att : Logical;
		Requesting_Ref : RequestingBusinessActivity?;
		Responding_Ref : RespondingBusinessActivity?;
		Attachements_ContRef : Attachment*;
		Document_Ref : BusinessDocument;
	};

	type Attachment : DocumentSecurity {
		MimeType_Att : Text;
		Specification_Att : Text;
		Version_Att : Text;
		Envelope_Ref : DocumentEnvelope;
		Document_Ref : BusinessDocument;
	};

	type BusinessDocument {
		SpecificationLocation_Att : Text;
		SpecificationElement_Att : Text;
		ConditionExpression_Att : Text;
		Envelopes_Ref : DocumentEnvelope*;
		Attachments_Ref : Attachment*;
	};
}