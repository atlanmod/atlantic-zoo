module UMLWithReuseContrats {

	type ReuseContract : Dependency {
		Supplier_Ref : ProviderClause;
		Client_Ref : ReuserClause;
	};

	type Dependency {
		OwningDependency_Ref : Dependency?;
		SubDependency_ContRef : Dependency*;
	};

	type ProviderClause : Package;

	type Package;

	type ReuserClause : Package;

	type CompositeProvider : ProviderClause {
		Subcontract_ContRef : ReuseContract;
	};

	type BasicProvider : ProviderClause;

	type CompositeReuser : ReuserClause {
		Subreuser_ContRef : ReuserClause*;
	};

	type BasicReuser : ReuserClause;
}