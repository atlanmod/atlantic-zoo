module DoDAF {

	type Element {
		Name_Att : Text;
		Description_Att : Text;
		View_Att : Text;
	};

	type DoDAFModel : Element {
		Document_ContRef : Document*;
		Am_ContRef : AM*;
		Task_ContRef : Task*;
		IaDocument_ContRef : InformationAssetDocument*;
		AmSpecification_ContRef : AMSpecification*;
		Doscr_ContRef : DOSCR*;
		OrganizationType_ContRef : OrganizationType*;
	};

	type Document : Element {
		Type_Att : Text;
		Cites_Ref : InformationAssetDocument*;
		Records_ContRef : ArchitectureDocument*;
		IsTheReferenceFor_ContRef : IE*;
		IsThePrimaryReferenceFor_ContRef : PA*;
	};

	type AMSpecification : Document {
		IsSpecifiedUsing_ContRef : AMSpecificationElement*;
	};

	type AMSpecificationElement : Element {
		Subject_Ref : PAExchangeRequirement?;
	};

	type PAExchangeRequirement : Element {
		IsTheSubjectOf_Ref : AMSpecificationElement*;
	};

	type ArchitectureDocument : Element;

	type IE : Element {
		IsAssociatedWith_Ref : AMIERole*;
		IsOrdinateOf_Ref : IE*;
		IsSubordinateOf_Ref : IE*;
	};

	type AMIERole : Element {
		Defines_Ref : AMPA*;
	};

	type Control : AMIERole {
		Source_Att : Text;
		Destination_Att : Text;
	};

	type Input : AMIERole {
		IsTheInputThatIsDefinedBy_Ref : Output*;
		Source_Att : Text;
		Destination_Att : Text;
		Information_Att : Text;
	};

	type Output : AMIERole {
		Source_Att : Text;
		Destination_Att : Text;
		Information_Att : Text;
	};

	type Mechanism : AMIERole {
		Source_Att : Text;
		Destination_Att : Text;
		ResourceType_Att : Text;
	};

	type MechanismSystem : Mechanism;

	type MechanismReference : Mechanism;

	type MechanismFacility : Mechanism;

	type InformationAssetDocument : Element;

	type AMPA : Element {
		IsOrdinateOf_Ref : AMPA*;
		IsSubordinateOf_Ref : AMPA*;
		Defines_ContRef : AMIERole*;
	};

	type PACapability : Element;

	type PA : Element {
		IsTheProducerFor_ContRef : PAExchangeRequirement*;
		IsTheConsumerFor_ContRef : PAExchangeRequirement*;
		IsParentFor_Ref : PA*;
		IsChildFor_Ref : PA*;
		Has_ContRef : PACapability*;
		IsIncludedIn_Ref : AMPA*;
		CorrespondsTo_Ref : PATask*;
	};

	type AM : InformationAsset {
		Type_Att : Text;
		Specifies_Ref : AMSpecification*;
		Includes_ContRef : AMPA*;
		PaTask_Ref : PATask*;
	};

	type InformationAsset : Element {
		IsDescribedUsing_ContRef : PACapability*;
		IsCitedIn_Ref : InformationAssetDocument*;
	};

	type Task : Element {
		LevelIdentifier_Att : Text;
		References_Att : Text;
		Cost_Att : Text;
	};

	type PATask : Task {
		IsCitedBy_Ref : InformationAsset;
	};

	type Organization : Element {
		Type_Ref : OrganizationType;
		Supplies_Ref : InformationAsset*;
		ProvidesStewardshipFor_Ref : InformationAsset*;
		Owns_Ref : InformationAsset*;
		Develops_Ref : IE*;
		IsCitedAs_Ref : MechanismReference*;
	};

	type OrganizationType : Element {
		IsTheTypeOf_ContRef : Organization*;
		IsCitedAs_ContRef : MechanismReference*;
	};

	type OperationalRole : Element {
		IsCitedAs_ContRef : MechanismReference*;
	};

	type Occupation : Element {
		MayBeCitedForOR_ContRef : OperationalRole*;
		MayBeCitedForPT_ContRef : PersonType*;
	};

	type PersonType : Element {
		MayBeCitedFor_ContRef : OperationalRole*;
		Can_ContRef : Skill*;
	};

	type Skill : Element {
		MayBeCitedFor_ContRef : OperationalRole*;
	};

	type DOSCR : Element {
		MayBeAn_ContRef : Occupation;
		AppliesTo_ContRef : PersonType*;
		MayBeCitedFor_ContRef : OperationalRole*;
	};
}