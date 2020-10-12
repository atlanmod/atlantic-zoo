CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	description text,
	view text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE DoDAFModel (
	__IDDoDAFModel__ Integer NOT NULL,
	PRIMARY KEY DoDAFModel (__IDDoDAFModel__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	type text,
	PRIMARY KEY Document (__IDDocument__)
) ;

CREATE TABLE SystemFunctionTraceabilityMatrix (
	__IDSystemFunctionTraceabilityMatrix__ Integer NOT NULL,
	PRIMARY KEY SystemFunctionTraceabilityMatrix (__IDSystemFunctionTraceabilityMatrix__)
) ;

CREATE TABLE SystemFunctionTraceabilityElement (
	__IDSystemFunctionTraceabilityElement__ Integer NOT NULL,
	FOREIGN KEY systemFunction (__FKsystemFunction__) REFERENCES SystemFunction (__IDSystemFunction__),
	FOREIGN KEY operationalActivity (__FKoperationalActivity__) REFERENCES Task (__IDTask__),
	FOREIGN KEY systemProcessActivity (__FKsystemProcessActivity__) REFERENCES SystemPA (__IDSystemPA__),
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	FOREIGN KEY capability (__FKcapability__) REFERENCES Capability (__IDCapability__),
	supportStatusCode text,
	PRIMARY KEY SystemFunctionTraceabilityElement (__IDSystemFunctionTraceabilityElement__),
	__FKcapability__ Integer,
	__FKsystemProcessActivity__ Integer,
	__FKsystem__ Integer,
	__FKsystemFunction__ Integer,
	__FKoperationalActivity__ Integer
) ;

CREATE TABLE SystemDocument (
	__IDSystemDocument__ Integer NOT NULL,
	PRIMARY KEY SystemDocument (__IDSystemDocument__)
) ;

CREATE TABLE ArchitectureDocument (
	__IDArchitectureDocument__ Integer NOT NULL,
	PRIMARY KEY ArchitectureDocument (__IDArchitectureDocument__)
) ;

CREATE TABLE PA (
	__IDPA__ Integer NOT NULL,
	PRIMARY KEY PA (__IDPA__)
) ;

CREATE TABLE SystemFunction (
	__IDSystemFunction__ Integer NOT NULL,
	PRIMARY KEY SystemFunction (__IDSystemFunction__)
) ;

CREATE TABLE SystemPA (
	__IDSystemPA__ Integer NOT NULL,
	PRIMARY KEY SystemPA (__IDSystemPA__)
) ;

CREATE TABLE SoftwareApplicationProcedurePA (
	__IDSoftwareApplicationProcedurePA__ Integer NOT NULL,
	PRIMARY KEY SoftwareApplicationProcedurePA (__IDSoftwareApplicationProcedurePA__)
) ;

CREATE TABLE AM (
	__IDAM__ Integer NOT NULL,
	type text,
	PRIMARY KEY AM (__IDAM__)
) ;

CREATE TABLE InformationAsset (
	__IDInformationAsset__ Integer NOT NULL,
	PRIMARY KEY InformationAsset (__IDInformationAsset__)
) ;

CREATE TABLE AMPA (
	__IDAMPA__ Integer NOT NULL,
	PRIMARY KEY AMPA (__IDAMPA__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	levelIdentifier text,
	"references" text,
	cost text,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE ArchitectureTask (
	__IDArchitectureTask__ Integer NOT NULL,
	PRIMARY KEY ArchitectureTask (__IDArchitectureTask__)
) ;

CREATE TABLE OperationalCapabilityTask (
	__IDOperationalCapabilityTask__ Integer NOT NULL,
	FOREIGN KEY isAccomplishedA (__FKisAccomplishedA__) REFERENCES SystemOperationalCapabilityTask (__IDSystemOperationalCapabilityTask__),
	PRIMARY KEY OperationalCapabilityTask (__IDOperationalCapabilityTask__),
	__FKisAccomplishedA__ Integer
) ;

CREATE TABLE SystemOperationalCapabilityTask (
	__IDSystemOperationalCapabilityTask__ Integer NOT NULL,
	PRIMARY KEY SystemOperationalCapabilityTask (__IDSystemOperationalCapabilityTask__)
) ;

CREATE TABLE PATask (
	__IDPATask__ Integer NOT NULL,
	PRIMARY KEY PATask (__IDPATask__)
) ;

CREATE TABLE Capability (
	__IDCapability__ Integer NOT NULL,
	PRIMARY KEY Capability (__IDCapability__)
) ;

CREATE TABLE CapabilityDocument (
	__IDCapabilityDocument__ Integer NOT NULL,
	PRIMARY KEY CapabilityDocument (__IDCapabilityDocument__)
) ;

CREATE TABLE SystemCapability (
	__IDSystemCapability__ Integer NOT NULL,
	PRIMARY KEY SystemCapability (__IDSystemCapability__)
) ;

CREATE TABLE NetworkCapability (
	__IDNetworkCapability__ Integer NOT NULL,
	PRIMARY KEY NetworkCapability (__IDNetworkCapability__)
) ;

CREATE TABLE NodeLinkCapability (
	__IDNodeLinkCapability__ Integer NOT NULL,
	PRIMARY KEY NodeLinkCapability (__IDNodeLinkCapability__)
) ;

CREATE TABLE MaterielItemCapabilityNorm (
	__IDMaterielItemCapabilityNorm__ Integer NOT NULL,
	PRIMARY KEY MaterielItemCapabilityNorm (__IDMaterielItemCapabilityNorm__)
) ;

CREATE TABLE OrganizationTypeCapabilityNorm (
	__IDOrganizationTypeCapabilityNorm__ Integer NOT NULL,
	PRIMARY KEY OrganizationTypeCapabilityNorm (__IDOrganizationTypeCapabilityNorm__)
) ;

CREATE TABLE RequiredInformationTechnologyCapability (
	__IDRequiredInformationTechnologyCapability__ Integer NOT NULL,
	PRIMARY KEY RequiredInformationTechnologyCapability (__IDRequiredInformationTechnologyCapability__)
) ;

CREATE TABLE InformationTechnologyRequirement (
	__IDInformationTechnologyRequirement__ Integer NOT NULL,
	PRIMARY KEY InformationTechnologyRequirement (__IDInformationTechnologyRequirement__)
) ;

CREATE TABLE InformationExchangeRequirement (
	__IDInformationExchangeRequirement__ Integer NOT NULL,
	PRIMARY KEY InformationExchangeRequirement (__IDInformationExchangeRequirement__)
) ;

CREATE TABLE PAExchangeRequirement (
	__IDPAExchangeRequirement__ Integer NOT NULL,
	PRIMARY KEY PAExchangeRequirement (__IDPAExchangeRequirement__)
) ;

CREATE TABLE CapabilityDocument_isCitedIn_Capability (
	__IDCapabilityDocument__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_capability_Capability (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE Capability_isPerformedByNC_NetworkCapability (
	__IDCapability__ Integer NOT NULL,
	__IDNetworkCapability__ Integer NOT NULL
) ;

CREATE TABLE System_isUsedToAccomplish_SystemOperationalCapabilityTask (
	__IDSystem__ Integer NOT NULL,
	__IDSystemOperationalCapabilityTask__ Integer NOT NULL
) ;

CREATE TABLE PA_isChildFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE Task_isCitedFor_SystemFunctionTraceabilityElement (
	__IDTask__ Integer NOT NULL,
	__IDSystemFunctionTraceabilityElement__ Integer NOT NULL
) ;

CREATE TABLE System_performs_SystemCapability (
	__IDSystem__ Integer NOT NULL,
	__IDSystemCapability__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_sftm_SystemFunctionTraceabilityMatrix (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemFunctionTraceabilityMatrix__ Integer NOT NULL
) ;

CREATE TABLE PA_isParentFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE SystemFunction_isCitedFor_SystemFunctionTraceabilityElement (
	__IDSystemFunction__ Integer NOT NULL,
	__IDSystemFunctionTraceabilityElement__ Integer NOT NULL
) ;

CREATE TABLE SystemPA_provides_SystemCapability (
	__IDSystemPA__ Integer NOT NULL,
	__IDSystemCapability__ Integer NOT NULL
) ;

CREATE TABLE SystemPA_mayBeCitedFor_SystemFunctionTraceabilityElement (
	__IDSystemPA__ Integer NOT NULL,
	__IDSystemFunctionTraceabilityElement__ Integer NOT NULL
) ;

CREATE TABLE Capability_isPerformedBy_SystemCapability (
	__IDCapability__ Integer NOT NULL,
	__IDSystemCapability__ Integer NOT NULL
) ;

CREATE TABLE Capability_isPerformedBySC_SystemCapability (
	__IDCapability__ Integer NOT NULL,
	__IDSystemCapability__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_task_Task (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE PA_correspondsTo_PATask (
	__IDPA__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE Capability_isSubordinateOf_Capability (
	__IDCapability__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isSubordinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Capability_isCitedInCD_CapabilityDocument (
	__IDCapability__ Integer NOT NULL,
	__IDCapabilityDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_capabilityDocument_CapabilityDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDCapabilityDocument__ Integer NOT NULL
) ;

CREATE TABLE AM_isCitedBy_PATask (
	__IDAM__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE System_isDesignedToProvide_SystemPA (
	__IDSystem__ Integer NOT NULL,
	__IDSystemPA__ Integer NOT NULL
) ;

CREATE TABLE PA_isTheConsumerFor_PAExchangeRequirement (
	__IDPA__ Integer NOT NULL,
	__IDPAExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE SystemFunctionTraceabilityMatrix_isDefinedBy_SystemFunctionTraceabilityElement (
	__IDSystemFunctionTraceabilityMatrix__ Integer NOT NULL,
	__IDSystemFunctionTraceabilityElement__ Integer NOT NULL
) ;

CREATE TABLE SystemCapability_isCitedIn_Capability (
	__IDSystemCapability__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_am_AM (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDAM__ Integer NOT NULL
) ;

CREATE TABLE Capability_isPerformedByNLC_NodeLinkCapability (
	__IDCapability__ Integer NOT NULL,
	__IDNodeLinkCapability__ Integer NOT NULL
) ;

CREATE TABLE System_isDescribedBy_SystemDocument (
	__IDSystem__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_document_Document (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Task_isTheSourceOfNeedFor_InformationExchangeRequirement (
	__IDTask__ Integer NOT NULL,
	__IDInformationExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE Document_records_ArchitectureDocument (
	__IDDocument__ Integer NOT NULL,
	__IDArchitectureDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_system_System (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE PA_isIncludedIn_AMPA (
	__IDPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Capability_isAttainedFor_RequiredInformationTechnologyCapability (
	__IDCapability__ Integer NOT NULL,
	__IDRequiredInformationTechnologyCapability__ Integer NOT NULL
) ;

CREATE TABLE PAExchangeRequirement_isCitedIn_InformationExchangeRequirement (
	__IDPAExchangeRequirement__ Integer NOT NULL,
	__IDInformationExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE SystemPA_enables_SystemOperationalCapabilityTask (
	__IDSystemPA__ Integer NOT NULL,
	__IDSystemOperationalCapabilityTask__ Integer NOT NULL
) ;

CREATE TABLE Task_isTheDestinationOfNeedFor_InformationExchangeRequirement (
	__IDTask__ Integer NOT NULL,
	__IDInformationExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE Capability_isOrdinateFor_Capability (
	__IDCapability__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE PA_isTheProducerFor_PAExchangeRequirement (
	__IDPA__ Integer NOT NULL,
	__IDPAExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE Capability_isUsedInOTCN_OrganizationTypeCapabilityNorm (
	__IDCapability__ Integer NOT NULL,
	__IDOrganizationTypeCapabilityNorm__ Integer NOT NULL
) ;

CREATE TABLE Document_cites_CapabilityDocument (
	__IDDocument__ Integer NOT NULL,
	__IDCapabilityDocument__ Integer NOT NULL
) ;

CREATE TABLE PA_isSupportedBy_SoftwareApplicationProcedurePA (
	__IDPA__ Integer NOT NULL,
	__IDSoftwareApplicationProcedurePA__ Integer NOT NULL
) ;

CREATE TABLE AM_includes_AMPA (
	__IDAM__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_systemCapability_SystemCapability (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemCapability__ Integer NOT NULL
) ;

CREATE TABLE InformationTechnologyRequirement_specifies_RequiredInformationTechnologyCapability (
	__IDInformationTechnologyRequirement__ Integer NOT NULL,
	__IDRequiredInformationTechnologyCapability__ Integer NOT NULL
) ;

CREATE TABLE Document_isThePrimaryReferenceFor_PA (
	__IDDocument__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE Capability_isUsedInMICN_MaterielItemCapabilityNorm (
	__IDCapability__ Integer NOT NULL,
	__IDMaterielItemCapabilityNorm__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isOrdinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Document_describes_SystemDocument (
	__IDDocument__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_sd_SystemDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE Task_correspondsTo_PATask (
	__IDTask__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE PA_isAssignedTo_SystemPA (
	__IDPA__ Integer NOT NULL,
	__IDSystemPA__ Integer NOT NULL
) ;

CREATE TABLE Task_isSupportedBy_ArchitectureTask (
	__IDTask__ Integer NOT NULL,
	__IDArchitectureTask__ Integer NOT NULL
) ;
