module PIF {

	type BusinessTemplate;

	type BusinessContact;

	type BusinessService;

	type BusinessEntity {
		BusinessContacts_Ref : BusinessContact*;
		BusinessServices_ContRef : BusinessService*;
		IdentifierBag_Ref : IdentifierBag?;
	};

	type IdentifierBag;

	type TModel {
		OverviewDocuments_ContRef : OverviewDocument*;
		IdentifierBag_Ref : IdentifierBag?;
	};

	type OverviewDocument;
}