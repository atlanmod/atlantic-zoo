module CADM {

	type Element {
		Name_Att : Text;
		Content_Att : Text;
	};

	type Architecture : Element {
		IsAssociatedWith_ContRef : Architecture*;
		Missions_ContRef : Mission*;
		IsFocusOf_Ref : FunctionalArea*;
		Uses_Ref : Organization*;
	};

	type Organization : Element {
		IsAssociatedWith_Ref : Organization*;
		SoftwareItems_ContRef : SoftwareItem*;
		Owns_Ref : InformationAsset*;
		Includes_Ref : Node*;
		PerformsTo_Ref : Capability*;
		HasRequirement_Ref : Requirement*;
		HasMissionArea_Ref : MissionArea*;
		AssociatedSystems_Ref : System*;
		IsProponentOf_Ref : FunctionalArea*;
	};

	type Guidance : Element {
		IsAssocitatedWith_ContRef : Guidance*;
		IsImplementedBy_Ref : Architecture*;
		IsSpecifiedIn_Ref : Document*;
		ProvidesAuthorityFor_Ref : InformationAsset*;
		Defines_Ref : MissionArea*;
	};

	type Document : Element {
		IsAssociatedWith_ContRef : Document*;
		DescribesArchitecture_Ref : Architecture;
		DescribesSystem_Ref : System*;
		IsSpecifiedUsing_Ref : Agreement*;
		Cites_Ref : InformationAsset*;
	};

	type Action : Element {
		MayBeA_ContRef : Task;
		IsAssociatedWith_ContRef : Action*;
		InvolvedIn_Ref : ActivityModel*;
	};

	type Agreement : Element {
		IsAssociatedWith_ContRef : Agreement*;
		IsCitedBy_Ref : Agreement*;
		AppliesTo_Ref : InformationAsset*;
		Implements_Ref : Guidance*;
	};

	type Standard : Agreement;

	type Task : Element {
		IsAssociatedWith_ContRef : Task*;
		IsPerformedBy_Ref : Node*;
		IsPerformedUsing_Ref : System*;
		Specifies_Ref : Requirement*;
	};

	type InformationAsset : Element {
		IsAssociatedWith_ContRef : InformationAsset*;
	};

	type ConceptualDataModel : InformationAsset;

	type ActivityModel : InformationAsset;

	type Node {
		IsAssociatedWith_Ref : Node*;
		Describes_Ref : Architecture*;
		HasServicesProvidedBy_Ref : Facility*;
		InvolvedIn_Ref : ActivityModel*;
		Uses_Ref : InformationAsset*;
		Involves_Ref : InfoExchRequirement*;
		IsParticipedInBy_Ref : Network*;
		Supports_Ref : System*;
	};

	type Network : Element {
		IsAssociatedWith_ContRef : Network*;
		IsDescribedIn_Ref : Document*;
		CompliesWith_Ref : Standard*;
		Has_Ref : Organization*;
		PerformsTo_Ref : Capability*;
	};

	type Requirement : Guidance {
		MayBeSatifiedBy_Ref : Architecture*;
		IsSpecifiedUsing_Ref : InformationAsset*;
		SpecifiesNeedFor_Ref : MaterielItem*;
		Cites_Ref : MissionArea*;
	};

	type InfoExchRequirement : Requirement {
		IsCitedIn_Ref : Document*;
		IsSpecifiedInInfos_Ref : InformationAsset*;
	};

	type ExchangeNeedLineReq : Requirement;

	type MissionArea : Element {
		Supports_Ref : Task*;
	};

	type System : Element {
		IsAssociatedWith_Ref : System*;
		CitedIn_Ref : Architecture*;
		CompliesWith_Ref : Standard*;
		IsDescribedBy_Ref : InformationAsset*;
		Uses_Ref : MaterielItem*;
		OperatesUsing_Ref : Network*;
		PerformsTo_Ref : Capability*;
		AssociatedOrganization_Ref : Organization*;
		AppliesTo_Ref : Requirement*;
	};

	type Mission : Element {
		IsCitedBy_Ref : Architecture;
		Requires_Ref : Task*;
		IsAssigned_Ref : Organization*;
		MayCite_Ref : FunctionalArea*;
	};

	type FunctionalArea : Element {
		IsPartOf_Ref : FunctionalArea*;
		Supports_Ref : System*;
		Cites_Ref : MissionArea*;
	};

	type Capability : Element {
		SpecifiesRequired_Ref : Requirement*;
	};

	type MaterielItem : Element {
		EstablishedAs_ContRef : MaterielItem*;
		ConformsTo_Ref : Standard*;
		PerformsTo_Ref : Capability*;
	};

	type EquipmentType : MaterielItem;

	type SoftwareItem : MaterielItem {
		Uses_Ref : EquipmentType*;
		IsSourceFor_Ref : Organization;
	};

	type Facility : Element;
}