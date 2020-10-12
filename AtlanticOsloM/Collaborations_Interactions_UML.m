module ExtendedUMLCorePackage {

	type Package : ProviderClause;

	type ProviderClause {
		OwnedEltColl_ContRef : CollaborationPackage;
		OwnedEltInt_Ref : InteractionPackage*;
	};

	type CollaborationPackage {
		OwnedElt_Ref : Collaboration;
	};

	type Collaboration {
		Interaction_ContRef : Interaction*;
		OwnedEltAss_ContRef : AssociationRole;
		OwnedEltClass_ContRef : ClassifierRole;
	};

	type InteractionPackage {
		ProviderClause_Ref : ProviderClause;
		OwnedElt_Ref : Interaction;
	};

	type Interaction {
		Context_Ref : Collaboration;
		Message_ContRef : Message+;
	};

	type AssociationRole {
		Connection_ContRef : AssociationEndRole#2 .. 2;
	};

	type ClassifierRole {
		AssociationEndRole_ContRef : AssociationEndRole*;
		ReceiverMess_Ref : Message;
		SenderMess_Ref : Message;
		AvailableFeature_ContRef : Operation*;
		Base_Ref : Interface;
	};

	type AssociationEndRole {
		AssociationRole_Ref : AssociationRole;
		Type_Ref : ClassifierRole;
	};

	type Message {
		Message_Ref : Message*;
		Activator_Ref : Message?;
		Interaction_Ref : Interaction*;
		Receiver_Ref : ClassifierRole;
		Sender_Ref : ClassifierRole;
		Specification_Ref : Request;
	};

	type Request {
		Message_Ref : Message*;
	};

	type Operation : Request {
		ClassifierRole_Ref : ClassifierRole*;
		Owner_Ref : Interface;
	};

	type Interface {
		ClassifierRole_Ref : ClassifierRole*;
		Feature_ContRef : Operation*;
	};
}