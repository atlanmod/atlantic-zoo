module CORBAComponent {

	type InterfaceDef;

	type OperationDef;

	type ValueDef;

	type ComponentDef : InterfaceDef {
		IsBasic_Att : Logical;
		Facets_ContRef : ProvidesDef*;
		Receptacles_ContRef : UsesDef*;
		Supports_Ref : InterfaceDef*;
		Emits_ContRef : EmitsDef*;
		Publishes_ContRef : PublishesDef*;
		Consumes_ContRef : ConsumesDef*;
	};

	type ProvidesDef {
		Provides_Ref : InterfaceDef;
		Prd_home_Ref : ComponentDef;
	};

	type UsesDef {
		Multiple_Att : Logical;
		Uses_Ref : InterfaceDef;
		Ud_home_Ref : ComponentDef;
	};

	type EventDef {
		Type_Ref : ValueDef;
	};

	type EmitsDef : EventDef {
		Ed_home_Ref : ComponentDef;
	};

	type PublishesDef : EventDef {
		Pud_home_Ref : ComponentDef;
	};

	type ConsumesDef : EventDef {
		Cd_home_Ref : ComponentDef;
	};

	type HomeDef : InterfaceDef {
		Manages_Ref : ComponentDef;
		Factories_ContRef : FactoryDef*;
		Finders_ContRef : FinderDef*;
		Key_ContRef : PrimaryKeyDef?;
	};

	type FactoryDef : OperationDef {
		Fa_home_Ref : HomeDef;
	};

	type FinderDef : OperationDef {
		Fi_home_Ref : HomeDef;
	};

	type PrimaryKeyDef {
		Pkd_home_Ref : HomeDef;
		Type_Ref : ValueDef;
	};
}