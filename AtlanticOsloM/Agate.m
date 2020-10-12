module AGATE {

	type Entity;

	type Object : Entity {
		Id_Att : Text;
	};

	type AGATEObject : Object {
		Notice_Att : Text;
		Description_Att : Text;
		Sensitivity_Att : Integer32;
		Name_Att : Text;
		Comment_Att : Text;
		IsValidIn_Ref : OperationalContext;
		IsAssociatedWith_Ref : Stake;
	};

	type Objective : AGATEObject {
		Type_Att : Text;
		Priority_Att : Integer32;
		Indicator_Att : Text;
		Traceability_Att : Text;
	};

	type OperationalContext : AGATEObject;

	type Project : AGATEObject {
		Moi_Ref : Role;
		Moa_Ref : Role;
		Director_Ref : Role;
		Defines_Ref : ProjectContextElement*;
		AssociatedISs_Ref : InformationSystem*;
	};

	type Standard : GenericStandard {
		CaracterizeIC_Ref : InterfaceCharacteristic*;
		CaracterizeTC_Ref : TechnicalComponent*;
		CaracterizeLC_Ref : LogicalComponent*;
		CaracterizeP_Ref : Package*;
		CaracterizeR_Ref : Requirement*;
	};

	type GenericStandard : AGATEObject {
		ComposedOf_ContRef : Standard*;
	};

	type Threat : GenericThreat {
		Nature_Att : Text;
		DCSSI_Att : Text;
		Clarifies_Ref : Vulnerability*;
	};

	type GenericThreat : AGATEObject {
		ComposedBy_ContRef : Threat*;
	};

	type Vulnerability {
		Level_Att : Integer32;
		RelatesTo_Ref : Entity;
	};

	type TrafficClass : AGATEObject {
		Traffic_Ref : Traffic*;
	};

	type InterfaceCharacteristic : AGATEObject {
		Type_Att : Text;
	};

	type ConfidentialityLevel : InterfaceCharacteristic;

	type Protocol : InterfaceCharacteristic {
		IsoLevel_Att : Integer32;
	};

	type Flow : InterfaceCharacteristic {
		Unit_Att : Text;
	};

	type Other : InterfaceCharacteristic;

	type ProjectContextElement : AGATEObject {
		Type_Att : Text;
	};

	type DataClass : AGATEObject;

	type Event : AGATEObject;

	type Risk : AGATEObject {
		DisponibilityLevel_Att : Integer32;
		IntegrityLevel_Att : Integer32;
		ConfidencialityLevel_Att : Integer32;
		IsCoveredByCR_Ref : CountermeasureRequirement;
		IsCoveredByAO_Ref : ArchitectureObject;
		IsCoveredByMO_Ref : MADIOSObject;
		IsCoveredByDR_Ref : DomainRelation;
		RelatesToRO_Ref : ReusableObject;
		RelatesToCO_Ref : CommunicationObject;
		IsGeneratedBy_Ref : Threat;
	};

	type Stake : AGATEObject {
		Type_Att : Text;
		RelativeDate_Att : Text;
		Unit_Att : Text;
		Date_Att : Text;
		Events_ContRef : Event*;
	};

	type Requirement : AGATEObject {
		Criticality_Att : Integer32;
		Priority_Att : Text;
		State_Att : Text;
		IsCoveredBy_Ref : ArchitectureObject*;
		Characterizes_Ref : ArchitectureObject*;
	};

	type CountermeasureRequirement : Requirement {
		Type_Att : Text;
		ResidualVulnerability_Att : Text;
	};

	type TechnicalRequirement : Requirement;

	type PerformanceRequirement : Requirement;

	type InteroperabilityRequirement : Requirement;

	type OperationalRequirement : Requirement;

	type SecurityRequirement : Requirement;

	type Means : AGATEObject {
		IsProvidedBy_Ref : OrganizationObject;
	};

	type DomainRelation : AGATEObject;

	type HierarchicalRelation : DomainRelation;

	type FunctionalRelation : DomainRelation {
		NecessaryObjectOF_Ref : OperationalFunction?;
		DependentObjectOF_Ref : OperationalFunction?;
		NecessaryObjectOO_Ref : OrganizationObject?;
		DependentObjectOO_Ref : OrganizationObject?;
		NecessaryObjectP_Ref : Package;
		DependentObjectP_Ref : Package;
	};

	type Dependence : DomainRelation {
		Type_Att : Text;
		NecessaryObjectS_Ref : Service?;
		DependentObjectS_Ref : Service?;
		NecessaryObjectLC_Ref : LogicalComponent?;
		DependentObjectLC_Ref : LogicalComponent?;
		NecessaryObjectP_Ref : Package?;
		DependentObjectP_Ref : Package?;
		NecessaryObjectC_Ref : Center?;
		DependentObjectC_Ref : Center?;
		NecessaryObjectIS_Ref : InformationSystem?;
		DependentObjectIS_Ref : InformationSystem?;
	};

	type ArchitectureObject : AGATEObject;

	type ReusableObject : ArchitectureObject {
		Membership_Att : Text;
		ConfidentialityLevel_Att : Integer32;
		BelongsTo_Ref : Entity?;
		IsAttachedToIS_Ref : InformationSystem?;
		IsAttachedToA_Ref : Actor?;
		IsA_Ref : Means?;
	};

	type Site : GenericSite {
		Type_Att : Text;
		Localization_Att : Text;
		DeployedObjects_ContRef : ReusableObject*;
	};

	type GenericSite : ReusableObject {
		ComposedOf_ContRef : Site*;
	};

	type Package : ReusableObject {
		SubPackage_ContRef : Package*;
		Time_Ref : Role*;
		GroupedObjects_ContRef : ReusableObject*;
		IsCoveredByLC_Ref : LogicalComponent;
		IsCoveredByTC_Ref : TechnicalComponent;
		ComposedOf_Ref : Interface*;
	};

	type Service : ReusableObject {
		Statut_Att : Text;
		IsASpecializationOf_Ref : ReferenceService;
		IsCoveredBy_Ref : LogicalComponent;
	};

	type TechnicalComponent : ReusableObject {
		Type_Att : Text;
		Cots_Att : Logical;
		Editor_Att : Logical;
		Constructor_Att : Logical;
		Version_Att : Text;
		Technology_Att : Text;
		DefinedExtension_Att : Text;
		Statut_Att : Text;
		ComposedOf_ContRef : TechnicalComponent*;
		IsASpecializationOf_Ref : ReferenceTechnicalComponent;
		Interfaces_ContRef : Interface*;
	};

	type LogicalComponent : ReusableObject {
		Type_Att : Text;
		Statut_Att : Text;
		ComposedOf_ContRef : LogicalComponent*;
		IsASpecializationOf_Ref : ReferenceLogicalComponent;
		Interfaces_ContRef : Interface*;
		IsCoveredBy_Ref : TechnicalComponent;
	};

	type OperationalFunction : ReusableObject {
		ComposedOf_ContRef : OperationalFunction*;
		IsCoveredByP_Ref : Package*;
		IsCoveredByS_Ref : Service*;
	};

	type OrganizationObject : ReusableObject {
		Time_Ref : Role*;
		Subordinate_Ref : HierarchicalRelation;
		Superior_Ref : HierarchicalRelation;
	};

	type Center : GenericCenter {
		DeployedObjects_ContRef : ReusableObject*;
	};

	type GenericCenter : OrganizationObject {
		Centers_ContRef : Center*;
	};

	type InformationSystem : OrganizationObject {
		Nature_Att : Text;
		Version_Att : Text;
		MembershipCountry_Att : Text;
		CurrentLocation_Att : Text;
		StartServiceDate_Att : Text;
		StopServiceDate_Att : Text;
		IsGeneric_Att : Logical;
		FunctionalDomain_Att : Text;
		Type_Att : Text;
		ComposedOf_ContRef : InformationSystem*;
		AssociatedProjects_Ref : Project*;
		Defines_ContRef : Objective*;
		Fulfills_Ref : Role*;
		Fixes_Ref : OperationalContext*;
		UsedBy_Ref : Actor*;
		Interfaces_ContRef : Interface*;
	};

	type Role : GenericRole {
		Type_Att : Text;
	};

	type GenericRole : OrganizationObject {
		Roles_ContRef : Role*;
	};

	type Actor : GenericActor;

	type GenericActor : OrganizationObject {
		Actors_ContRef : Actor*;
	};

	type TelecomOperator : Actor {
		ContractType_Att : Text;
		Interfaces_ContRef : Interface*;
	};

	type CommunicationObject : ArchitectureObject {
		ConfidentialityLevel_Att : Integer32;
		BelongsTo_Ref : Entity?;
	};

	type Interface : CommunicationObject {
		Characteristics_ContRef : InterfaceCharacteristic*;
		ComposedOf_ContRef : Interface*;
	};

	type Interconnection : CommunicationObject {
		LinkType_Att : Text;
		Between_Ref : Interface#2 .. 2;
	};

	type InformationFlow : CommunicationObject {
		Priority_Att : Integer32;
		Frequency_Att : Text;
		Media_Att : Text;
		Continuity_Att : Text;
		MyContainer_Att : Text;
		Time_Att : Text;
		AvailabilityRatio_Att : Text;
		Integrity_Att : Integer32;
		InteroperabilityLevel_Att : Integer32;
		MediumFlow_Att : Text;
		MaximumFlow_Att : Text;
		Duration_Att : Text;
		UnitMediumFlow_Att : Text;
		AverageEvent_Att : Text;
		MaximumFlowOverOneDuration_Att : Text;
		Transports_Ref : Information;
		ReceiverP_Ref : Package;
		TransmitterP_Ref : Package;
		ReceiverOO_Ref : OrganizationObject;
		TransmitterOO_Ref : OrganizationObject;
		ReceiverOF_Ref : OperationalFunction;
		TransmitterOF_Ref : OperationalFunction;
	};

	type Traffic : CommunicationObject {
		Sequence_Att : Text;
		Type_Att : Text;
		InteroperabilityLevel_Att : Integer32;
		TrafficClass_Ref : TrafficClass;
		DataClass_Ref : DataClass;
		ReceiverP_Ref : Package?;
		TransmitterP_Ref : Package?;
		ReceiverIS_Ref : InformationSystem?;
		TransmitterIS_Ref : InformationSystem?;
		ReceiverC_Ref : Center?;
		TransmitterC_Ref : Center?;
		ReceiverTO_Ref : TelecomOperator?;
		TransmitterTO_Ref : TelecomOperator?;
		ReceiverLC_Ref : LogicalComponent?;
		TransmitterLC_Ref : LogicalComponent?;
		ReceiverTC_Ref : TechnicalComponent?;
		TransmitterTC_Ref : TechnicalComponent?;
	};

	type Information : CommunicationObject {
		Format_Att : Text;
		StorageSupport_Att : Text;
		Persistence_Att : Text;
		DataType_Ref : DataClass?;
	};

	type ReferenceObject : Object {
		Name_Att : Text;
		Description_Att : Text;
	};

	type ReferenceTechnicalComponent : ReferenceObject {
		ComposedOf_Ref : ReferenceTechnicalComponent*;
	};

	type TechnicalComponentReferenceFrame : ReferenceObject {
		ComposedOf_Ref : ReferenceTechnicalComponent*;
	};

	type ReferenceLogicalComponent : ReferenceObject {
		ComposedOf_ContRef : ReferenceLogicalComponent*;
	};

	type ReferenceService : ReferenceObject {
		ComposedOf_ContRef : ReferenceObject*;
	};

	type ServiceReferenceFrame {
		ComposedOfRS_ContRef : ReferenceService*;
		ComposedOfRLC_ContRef : ReferenceLogicalComponent*;
	};

	type MADIOSObject : Object;

	type Process : MADIOSObject {
		IsCoveredByP_Ref : Package*;
		IsCoveredByS_Ref : Service*;
	};

	type Procedure : MADIOSObject {
		IsCoveredByP_Ref : Package*;
		IsCoveredByS_Ref : Service*;
	};

	type Operation : MADIOSObject {
		IsCoveredByP_Ref : Package*;
		IsCoveredByS_Ref : Service*;
	};

	type Activity : MADIOSObject {
		IsCoveredByP_Ref : Package*;
		IsisCoveredByS_Ref : Service*;
	};
}