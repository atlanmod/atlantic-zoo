module DoDAF {

	type Element {
		Name_Att : Text;
		Description_Att : Text;
		View_Att : Text;
	};

	type DoDAFModel : Element {
		Document_ContRef : Document*;
		Sftm_ContRef : SystemFunctionTraceabilityMatrix*;
		Sd_ContRef : SystemDocument*;
		Am_ContRef : AM*;
		System_ContRef : System*;
		Task_ContRef : Task*;
		Capability_ContRef : Capability*;
		CapabilityDocument_ContRef : CapabilityDocument*;
		SystemCapability_ContRef : SystemCapability*;
	};

	type Document : Element {
		Type_Att : Text;
		Cites_Ref : CapabilityDocument*;
		Describes_Ref : SystemDocument*;
		Records_ContRef : ArchitectureDocument*;
		IsThePrimaryReferenceFor_ContRef : PA*;
	};

	type SystemFunctionTraceabilityMatrix : Document {
		IsDefinedBy_ContRef : SystemFunctionTraceabilityElement*;
	};

	type SystemFunctionTraceabilityElement : Element {
		SystemFunction_Ref : SystemFunction?;
		OperationalActivity_Ref : Task?;
		SystemProcessActivity_Ref : SystemPA?;
		System_Ref : System?;
		Capability_Ref : Capability?;
		SupportStatusCode_Att : SupportStatusCode;
	};

	type SystemDocument : Element;

	type ArchitectureDocument : Element;

	type PA : Element {
		IsParentFor_Ref : PA*;
		IsChildFor_Ref : PA*;
		CorrespondsTo_Ref : PATask*;
		IsIncludedIn_Ref : AMPA*;
		IsAssignedTo_Ref : SystemPA*;
		IsSupportedBy_ContRef : SoftwareApplicationProcedurePA*;
		IsTheConsumerFor_ContRef : PAExchangeRequirement*;
		IsTheProducerFor_ContRef : PAExchangeRequirement*;
	};

	type SystemFunction : PA {
		IsCitedFor_Ref : SystemFunctionTraceabilityElement*;
	};

	type SystemPA : Element {
		MayBeCitedFor_Ref : SystemFunctionTraceabilityElement*;
		Provides_ContRef : SystemCapability*;
		Enables_ContRef : SystemOperationalCapabilityTask*;
	};

	type SoftwareApplicationProcedurePA : Element;

	type AM : InformationAsset {
		Type_Att : Text;
		IsCitedBy_ContRef : PATask*;
		Includes_ContRef : AMPA*;
	};

	type InformationAsset : Element;

	type AMPA : Element {
		IsOrdinateOf_Ref : AMPA*;
		IsSubordinateOf_Ref : AMPA*;
	};

	type System : Element {
		IsDesignedToProvide_ContRef : SystemPA*;
		IsDescribedBy_Ref : SystemDocument*;
		Performs_Ref : SystemCapability*;
		IsUsedToAccomplish_Ref : SystemOperationalCapabilityTask*;
	};

	type Task : Element {
		LevelIdentifier_Att : Text;
		References_Att : Text;
		Cost_Att : Text;
		CorrespondsTo_Ref : PATask*;
		IsSupportedBy_Ref : ArchitectureTask*;
		IsTheSourceOfNeedFor_ContRef : InformationExchangeRequirement*;
		IsTheDestinationOfNeedFor_ContRef : InformationExchangeRequirement*;
		IsCitedFor_Ref : SystemFunctionTraceabilityElement*;
	};

	type ArchitectureTask : Element;

	type OperationalCapabilityTask : Task {
		IsAccomplishedA_Ref : SystemOperationalCapabilityTask;
	};

	type SystemOperationalCapabilityTask : Task;

	type PATask : Task;

	type Capability : Element {
		IsPerformedBy_Ref : SystemCapability*;
		IsOrdinateFor_Ref : Capability*;
		IsSubordinateOf_Ref : Capability*;
		IsPerformedByNC_Ref : NetworkCapability*;
		IsPerformedByNLC_Ref : NodeLinkCapability*;
		IsPerformedBySC_Ref : SystemCapability*;
		IsCitedInCD_Ref : CapabilityDocument*;
		IsUsedInMICN_Ref : MaterielItemCapabilityNorm*;
		IsUsedInOTCN_Ref : OrganizationTypeCapabilityNorm*;
		IsAttainedFor_Ref : RequiredInformationTechnologyCapability*;
	};

	type CapabilityDocument : Element {
		IsCitedIn_Ref : Capability*;
	};

	type SystemCapability : Element {
		IsCitedIn_Ref : Capability*;
	};

	type NetworkCapability : Capability;

	type NodeLinkCapability : Capability;

	type MaterielItemCapabilityNorm : Capability;

	type OrganizationTypeCapabilityNorm : Capability;

	type RequiredInformationTechnologyCapability : Capability;

	type InformationTechnologyRequirement : Element {
		Specifies_Ref : RequiredInformationTechnologyCapability*;
	};

	type InformationExchangeRequirement : InformationTechnologyRequirement;

	type PAExchangeRequirement : InformationTechnologyRequirement {
		IsCitedIn_ContRef : InformationExchangeRequirement*;
	};

	type SupportStatusCode {"red", "yellow", "green"};
}