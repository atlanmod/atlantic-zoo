module IEEE1471 {

	type Element {
		Name_Att : Text;
		Content_Att : Text;
	};

	type IEEE1471Model : Element {
		System_ContRef : System;
		Environment_ContRef : Environment;
		Missions_ContRef : Mission*;
		Architecture_ContRef : Architecture;
		Stakeholders_ContRef : Stakeholder*;
		Concerns_ContRef : Concern*;
		Viewpoints_ContRef : Viewpoint*;
		LibraryViewpoints_ContRef : LibraryViewpoint*;
		ArchitecturalDescription_ContRef : ArchitecturalDescription;
		Rationale_ContRef : Rationale;
	};

	type System : Element {
		Fulfils_Ref : Mission+;
		Inhabits_Ref : Environment;
		HasAn_Ref : Architecture;
		Has_Ref : Stakeholder+;
	};

	type Mission : Element;

	type Environment : Element {
		Influences_Ref : System;
	};

	type Architecture : Element {
		DescribedBy_Ref : ArchitecturalDescription;
	};

	type Rationale : Element {
		Provides_Ref : ArchitecturalDescription;
	};

	type ArchitecturalDescription : Element {
		IdentifiesS_Ref : Stakeholder+;
		IdentifiesC_Ref : Concern+;
		Selects_Ref : Viewpoint+;
		OrganizedBy_ContRef : View+;
		Aggregates_ContRef : Model+;
	};

	type View : Element {
		ConformsTo_Ref : Viewpoint;
		ConsitsOf_Ref : Model+;
	};

	type Model : Element {
		ParticipatesInV_Ref : View+;
		ParticipatesInAD_Ref : ArchitecturalDescription;
	};

	type Stakeholder : Element {
		Has_Ref : Concern+;
	};

	type Concern : Element {
		IsImportantTo_Ref : Stakeholder+;
	};

	type Viewpoint : Element {
		HasSource_Ref : LibraryViewpoint?;
		UsedToCover_Ref : Concern+;
		EstablishesMethodsFor_Ref : Model+;
	};

	type LibraryViewpoint : Element;
}