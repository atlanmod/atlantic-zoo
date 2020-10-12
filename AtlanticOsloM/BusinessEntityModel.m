module BusinessEntityModel {

	type DataType;

	type Action;

	type Class;

	type BusinessEntityPropertySet : DataType;

	type BusinessRole : Action {
		Characterisedby_Ref : BusinessEntityPropertySet;
		Typ_Ref : Class;
		Task_Ref : Task*;
		Fille_Ref : BusinessEntity+;
	};

	type Task {
		AssociatedWith_Ref : BusinessRole+;
		Needs_Ref : ArtifactRole*;
	};

	type ArtifactRole : BusinessRole;

	type PerformerRole : BusinessRole {
		Perform_Ref : Task;
	};

	type OrganisationalUnit : BusinessRole;

	type BusinessEntity : Class {
		Placehold_Ref : BusinessRole+;
	};
}