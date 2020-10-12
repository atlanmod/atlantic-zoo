module DoDAF {

	type Element {
		Name_Att : Text;
		Description_Att : Text;
		View_Att : Text;
	};

	type DoDAFModel : Element {
		Document_ContRef : Document*;
		Sfd_ContRef : SystemFunctionalityDescription*;
		AmSpecification_ContRef : AMSpecification*;
		Sd_ContRef : SystemDocument*;
		Task_ContRef : Task*;
		IaDocument_ContRef : InformationAssetDocument*;
		Position_ContRef : Position*;
		Occupation_ContRef : Occupation*;
		Ad_ContRef : ArchitectureDocument*;
		System_ContRef : System*;
		Am_ContRef : AM*;
		Spas_ContRef : SystemPAStandard*;
		Its_ContRef : InformationTechnologyStandard*;
		Orpa_ContRef : OperationalRolePA*;
		Ptcn_ContRef : PersonTypeCapabilityNorm*;
	};

	type Document : Element {
		Type_Att : Text;
		Cites_Ref : InformationAssetDocument*;
		Describes_Ref : SystemDocument*;
		Records_ContRef : ArchitectureDocument*;
		IsTheReferenceFor_ContRef : IE*;
		IsThePrimaryReferenceFor_ContRef : PA*;
	};

	type SystemFunctionalityDescription : Document;

	type FunctionalSpecification : Document {
		MayBeA_ContRef : SystemDocument;
	};

	type AMSpecification : Document {
		IsUsedIn_ContRef : FunctionalSpecification*;
	};

	type SystemDocument : Element;

	type ArchitectureDocument : Element;

	type System : Element {
		IsDesignedToProvide_ContRef : SystemPA*;
		IsDescribedBy_Ref : SystemDocument*;
	};

	type SystemPA : Element {
		IsDefinedUsing_Ref : SystemPAStandard*;
	};

	type IE : Element {
		IsAssociatedWith_Ref : AMIERole*;
		IsOrdinateOf_Ref : IE*;
		IsSubordinateOf_Ref : IE*;
	};

	type AMIERole : Element {
		Defines_Ref : AMPA*;
		IsRepresentedBy_ContRef : AMIERoleGraphic*;
	};

	type AMIERoleGraphic : Element;

	type Input : AMIERole {
		IsTheInputThatIsDefinedBy_ContRef : Output*;
		Source_Att : Text;
		Destination_Att : Text;
		Information_Att : Text;
	};

	type Output : AMIERole {
		Source_Att : Text;
		Destination_Att : Text;
		Information_Att : Text;
	};

	type InformationAssetDocument : Element;

	type AMPA : Element {
		IsOrdinateOf_Ref : AMPA*;
		IsSubordinateOf_Ref : AMPA*;
		Defines_ContRef : AMIERole*;
		IsRepresentedBy_ContRef : AMPAGraphic*;
	};

	type AMPAGraphic : Element;

	type PA : Element {
		IsParentFor_Ref : PA*;
		IsChildFor_Ref : PA*;
		IsIncludedIn_Ref : AMPA*;
		IsAssignedTo_Ref : SystemPA*;
		Represents_ContRef : ArchitectureBusinessSubFunction*;
		CorrespondsTo_Ref : PATask*;
		Has_ContRef : PACapability*;
		IsPerformedBy_Ref : OperationalRolePA*;
	};

	type PACapability : Element;

	type AM : InformationAsset {
		Type_Att : Text;
		IsCitedBy_ContRef : PATask*;
		Specifies_Ref : AMSpecification*;
		Includes_ContRef : AMPA*;
		IsUsedToDescribe_Ref : SystemFunctionalityDescription*;
		Defines_ContRef : LineOfBusiness*;
	};

	type InformationAsset : Element {
		IsCitedIn_Ref : InformationAssetDocument*;
		Describes_ContRef : DataStore*;
	};

	type DataStore : PA;

	type SystemFunction : PA;

	type SystemPAStandard : Element {
		IsUsedToDefine_Ref : InformationTechnologyStandard*;
	};

	type InformationTechnologyStandard : Element {
		IsUsedToDefine_Ref : SystemPAStandard*;
	};

	type LineOfBusiness : Element {
		AppliesToTask_Ref : Task*;
		AppliesToBS_ContRef : BusinessSubfunction*;
	};

	type Task : Element {
		LevelIdentifier_Att : Text;
		References_Att : Text;
		Cost_Att : Text;
		CorrespondsTo_Ref : PATask*;
		Supports_Ref : TaskMissionArea*;
	};

	type HumanBehaviourTask : Task;

	type OperationalCapabilityTask : Task;

	type TaskMissionArea : Task {
		HasContributionFrom_ContRef : OperationalCapabilityTask*;
	};

	type PATask : Task;

	type BusinessSubfunction : Element {
		AppliesTo_Ref : ArchitectureBusinessSubFunction*;
	};

	type ArchitectureBusinessSubFunction : Element;

	type OperationalRolePA : Element;

	type OperationalRole : Element {
		Performs_ContRef : OperationalRolePA*;
		IsPerformedByOTOR_ContRef : OrganizationTypeOperationalRole*;
		IsPerformedByOOR_ContRef : OrganizationOperationalRole*;
	};

	type OrganizationTypeOperationalRole : Element;

	type OrganizationOperationalRole : Element;

	type Occupation : Element {
		MayBeCitedForOR_ContRef : OperationalRole*;
		MayBeCitedForPT_ContRef : PersonType*;
	};

	type PersonType : Element {
		MayBeCitedFor_ContRef : OperationalRole*;
		PerformsTo_ContRef : PersonTypeCapabilityNorm*;
		Can_ContRef : Skill*;
	};

	type PersonTypeCapabilityNorm : Element;

	type Skill : Element {
		MayBeCitedFor_ContRef : OperationalRole*;
	};

	type Position : Element {
		MayBeCitedFor_ContRef : OperationalRole*;
	};
}