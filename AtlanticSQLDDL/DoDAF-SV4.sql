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

CREATE TABLE SystemFunctionalityDescription (
	__IDSystemFunctionalityDescription__ Integer NOT NULL,
	PRIMARY KEY SystemFunctionalityDescription (__IDSystemFunctionalityDescription__)
) ;

CREATE TABLE FunctionalSpecification (
	__IDFunctionalSpecification__ Integer NOT NULL,
	FOREIGN KEY mayBeA (__FKmayBeA__) REFERENCES SystemDocument (__IDSystemDocument__),
	PRIMARY KEY FunctionalSpecification (__IDFunctionalSpecification__),
	__FKmayBeA__ Integer
) ;

CREATE TABLE AMSpecification (
	__IDAMSpecification__ Integer NOT NULL,
	PRIMARY KEY AMSpecification (__IDAMSpecification__)
) ;

CREATE TABLE SystemDocument (
	__IDSystemDocument__ Integer NOT NULL,
	PRIMARY KEY SystemDocument (__IDSystemDocument__)
) ;

CREATE TABLE ArchitectureDocument (
	__IDArchitectureDocument__ Integer NOT NULL,
	PRIMARY KEY ArchitectureDocument (__IDArchitectureDocument__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE SystemPA (
	__IDSystemPA__ Integer NOT NULL,
	PRIMARY KEY SystemPA (__IDSystemPA__)
) ;

CREATE TABLE IE (
	__IDIE__ Integer NOT NULL,
	PRIMARY KEY IE (__IDIE__)
) ;

CREATE TABLE AMIERole (
	__IDAMIERole__ Integer NOT NULL,
	PRIMARY KEY AMIERole (__IDAMIERole__)
) ;

CREATE TABLE AMIERoleGraphic (
	__IDAMIERoleGraphic__ Integer NOT NULL,
	PRIMARY KEY AMIERoleGraphic (__IDAMIERoleGraphic__)
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	source text,
	destination text,
	information text,
	PRIMARY KEY Input (__IDInput__)
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	source text,
	destination text,
	information text,
	PRIMARY KEY Output (__IDOutput__)
) ;

CREATE TABLE InformationAssetDocument (
	__IDInformationAssetDocument__ Integer NOT NULL,
	PRIMARY KEY InformationAssetDocument (__IDInformationAssetDocument__)
) ;

CREATE TABLE AMPA (
	__IDAMPA__ Integer NOT NULL,
	PRIMARY KEY AMPA (__IDAMPA__)
) ;

CREATE TABLE AMPAGraphic (
	__IDAMPAGraphic__ Integer NOT NULL,
	PRIMARY KEY AMPAGraphic (__IDAMPAGraphic__)
) ;

CREATE TABLE PA (
	__IDPA__ Integer NOT NULL,
	PRIMARY KEY PA (__IDPA__)
) ;

CREATE TABLE PACapability (
	__IDPACapability__ Integer NOT NULL,
	PRIMARY KEY PACapability (__IDPACapability__)
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

CREATE TABLE DataStore (
	__IDDataStore__ Integer NOT NULL,
	PRIMARY KEY DataStore (__IDDataStore__)
) ;

CREATE TABLE SystemFunction (
	__IDSystemFunction__ Integer NOT NULL,
	PRIMARY KEY SystemFunction (__IDSystemFunction__)
) ;

CREATE TABLE SystemPAStandard (
	__IDSystemPAStandard__ Integer NOT NULL,
	PRIMARY KEY SystemPAStandard (__IDSystemPAStandard__)
) ;

CREATE TABLE InformationTechnologyStandard (
	__IDInformationTechnologyStandard__ Integer NOT NULL,
	PRIMARY KEY InformationTechnologyStandard (__IDInformationTechnologyStandard__)
) ;

CREATE TABLE LineOfBusiness (
	__IDLineOfBusiness__ Integer NOT NULL,
	PRIMARY KEY LineOfBusiness (__IDLineOfBusiness__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	levelIdentifier text,
	"references" text,
	cost text,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE HumanBehaviourTask (
	__IDHumanBehaviourTask__ Integer NOT NULL,
	PRIMARY KEY HumanBehaviourTask (__IDHumanBehaviourTask__)
) ;

CREATE TABLE OperationalCapabilityTask (
	__IDOperationalCapabilityTask__ Integer NOT NULL,
	PRIMARY KEY OperationalCapabilityTask (__IDOperationalCapabilityTask__)
) ;

CREATE TABLE TaskMissionArea (
	__IDTaskMissionArea__ Integer NOT NULL,
	PRIMARY KEY TaskMissionArea (__IDTaskMissionArea__)
) ;

CREATE TABLE PATask (
	__IDPATask__ Integer NOT NULL,
	PRIMARY KEY PATask (__IDPATask__)
) ;

CREATE TABLE BusinessSubfunction (
	__IDBusinessSubfunction__ Integer NOT NULL,
	PRIMARY KEY BusinessSubfunction (__IDBusinessSubfunction__)
) ;

CREATE TABLE ArchitectureBusinessSubFunction (
	__IDArchitectureBusinessSubFunction__ Integer NOT NULL,
	PRIMARY KEY ArchitectureBusinessSubFunction (__IDArchitectureBusinessSubFunction__)
) ;

CREATE TABLE OperationalRolePA (
	__IDOperationalRolePA__ Integer NOT NULL,
	PRIMARY KEY OperationalRolePA (__IDOperationalRolePA__)
) ;

CREATE TABLE OperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	PRIMARY KEY OperationalRole (__IDOperationalRole__)
) ;

CREATE TABLE OrganizationTypeOperationalRole (
	__IDOrganizationTypeOperationalRole__ Integer NOT NULL,
	PRIMARY KEY OrganizationTypeOperationalRole (__IDOrganizationTypeOperationalRole__)
) ;

CREATE TABLE OrganizationOperationalRole (
	__IDOrganizationOperationalRole__ Integer NOT NULL,
	PRIMARY KEY OrganizationOperationalRole (__IDOrganizationOperationalRole__)
) ;

CREATE TABLE Occupation (
	__IDOccupation__ Integer NOT NULL,
	PRIMARY KEY Occupation (__IDOccupation__)
) ;

CREATE TABLE PersonType (
	__IDPersonType__ Integer NOT NULL,
	PRIMARY KEY PersonType (__IDPersonType__)
) ;

CREATE TABLE PersonTypeCapabilityNorm (
	__IDPersonTypeCapabilityNorm__ Integer NOT NULL,
	PRIMARY KEY PersonTypeCapabilityNorm (__IDPersonTypeCapabilityNorm__)
) ;

CREATE TABLE Skill (
	__IDSkill__ Integer NOT NULL,
	PRIMARY KEY Skill (__IDSkill__)
) ;

CREATE TABLE Position (
	__IDPosition__ Integer NOT NULL,
	PRIMARY KEY Position (__IDPosition__)
) ;

CREATE TABLE PA_isPerformedBy_OperationalRolePA (
	__IDPA__ Integer NOT NULL,
	__IDOperationalRolePA__ Integer NOT NULL
) ;

CREATE TABLE AM_includes_AMPA (
	__IDAM__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Input_isTheInputThatIsDefinedBy_Output (
	__IDInput__ Integer NOT NULL,
	__IDOutput__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_document_Document (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_ptcn_PersonTypeCapabilityNorm (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDPersonTypeCapabilityNorm__ Integer NOT NULL
) ;

CREATE TABLE Task_correspondsTo_PATask (
	__IDTask__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE InformationAsset_describes_DataStore (
	__IDInformationAsset__ Integer NOT NULL,
	__IDDataStore__ Integer NOT NULL
) ;

CREATE TABLE AM_isCitedBy_PATask (
	__IDAM__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isRepresentedBy_AMPAGraphic (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPAGraphic__ Integer NOT NULL
) ;

CREATE TABLE SystemPA_isDefinedUsing_SystemPAStandard (
	__IDSystemPA__ Integer NOT NULL,
	__IDSystemPAStandard__ Integer NOT NULL
) ;

CREATE TABLE LineOfBusiness_appliesToBS_BusinessSubfunction (
	__IDLineOfBusiness__ Integer NOT NULL,
	__IDBusinessSubfunction__ Integer NOT NULL
) ;

CREATE TABLE InformationAsset_isCitedIn_InformationAssetDocument (
	__IDInformationAsset__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE IE_isAssociatedWith_AMIERole (
	__IDIE__ Integer NOT NULL,
	__IDAMIERole__ Integer NOT NULL
) ;

CREATE TABLE Document_isTheReferenceFor_IE (
	__IDDocument__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE Position_mayBeCitedFor_OperationalRole (
	__IDPosition__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE PersonType_can_Skill (
	__IDPersonType__ Integer NOT NULL,
	__IDSkill__ Integer NOT NULL
) ;

CREATE TABLE PersonType_performsTo_PersonTypeCapabilityNorm (
	__IDPersonType__ Integer NOT NULL,
	__IDPersonTypeCapabilityNorm__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_iaDocument_InformationAssetDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE Skill_mayBeCitedFor_OperationalRole (
	__IDSkill__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE AM_specifies_AMSpecification (
	__IDAM__ Integer NOT NULL,
	__IDAMSpecification__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_sd_SystemDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_its_InformationTechnologyStandard (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDInformationTechnologyStandard__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_isPerformedByOTOR_OrganizationTypeOperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	__IDOrganizationTypeOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE Document_records_ArchitectureDocument (
	__IDDocument__ Integer NOT NULL,
	__IDArchitectureDocument__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_orpa_OperationalRolePA (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDOperationalRolePA__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_performs_OperationalRolePA (
	__IDOperationalRole__ Integer NOT NULL,
	__IDOperationalRolePA__ Integer NOT NULL
) ;

CREATE TABLE Document_describes_SystemDocument (
	__IDDocument__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE System_isDescribedBy_SystemDocument (
	__IDSystem__ Integer NOT NULL,
	__IDSystemDocument__ Integer NOT NULL
) ;

CREATE TABLE BusinessSubfunction_appliesTo_ArchitectureBusinessSubFunction (
	__IDBusinessSubfunction__ Integer NOT NULL,
	__IDArchitectureBusinessSubFunction__ Integer NOT NULL
) ;

CREATE TABLE PA_has_PACapability (
	__IDPA__ Integer NOT NULL,
	__IDPACapability__ Integer NOT NULL
) ;

CREATE TABLE System_isDesignedToProvide_SystemPA (
	__IDSystem__ Integer NOT NULL,
	__IDSystemPA__ Integer NOT NULL
) ;

CREATE TABLE Occupation_mayBeCitedForPT_PersonType (
	__IDOccupation__ Integer NOT NULL,
	__IDPersonType__ Integer NOT NULL
) ;

CREATE TABLE PA_represents_ArchitectureBusinessSubFunction (
	__IDPA__ Integer NOT NULL,
	__IDArchitectureBusinessSubFunction__ Integer NOT NULL
) ;

CREATE TABLE AMPA_defines_AMIERole (
	__IDAMPA__ Integer NOT NULL,
	__IDAMIERole__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_system_System (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE InformationTechnologyStandard_isUsedToDefine_SystemPAStandard (
	__IDInformationTechnologyStandard__ Integer NOT NULL,
	__IDSystemPAStandard__ Integer NOT NULL
) ;

CREATE TABLE PA_isAssignedTo_SystemPA (
	__IDPA__ Integer NOT NULL,
	__IDSystemPA__ Integer NOT NULL
) ;

CREATE TABLE LineOfBusiness_appliesToTask_Task (
	__IDLineOfBusiness__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE PA_correspondsTo_PATask (
	__IDPA__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE IE_isSubordinateOf_IE (
	__IDIE__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_amSpecification_AMSpecification (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDAMSpecification__ Integer NOT NULL
) ;

CREATE TABLE AM_isUsedToDescribe_SystemFunctionalityDescription (
	__IDAM__ Integer NOT NULL,
	__IDSystemFunctionalityDescription__ Integer NOT NULL
) ;

CREATE TABLE PA_isParentFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE AMIERole_defines_AMPA (
	__IDAMIERole__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE PA_isIncludedIn_AMPA (
	__IDPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isOrdinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_position_Position (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDPosition__ Integer NOT NULL
) ;

CREATE TABLE PA_isChildFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE Occupation_mayBeCitedForOR_OperationalRole (
	__IDOccupation__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_isPerformedByOOR_OrganizationOperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	__IDOrganizationOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_am_AM (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDAM__ Integer NOT NULL
) ;

CREATE TABLE Task_supports_TaskMissionArea (
	__IDTask__ Integer NOT NULL,
	__IDTaskMissionArea__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isSubordinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_sfd_SystemFunctionalityDescription (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemFunctionalityDescription__ Integer NOT NULL
) ;

CREATE TABLE TaskMissionArea_hasContributionFrom_OperationalCapabilityTask (
	__IDTaskMissionArea__ Integer NOT NULL,
	__IDOperationalCapabilityTask__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_ad_ArchitectureDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDArchitectureDocument__ Integer NOT NULL
) ;

CREATE TABLE PersonType_mayBeCitedFor_OperationalRole (
	__IDPersonType__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE AMSpecification_isUsedIn_FunctionalSpecification (
	__IDAMSpecification__ Integer NOT NULL,
	__IDFunctionalSpecification__ Integer NOT NULL
) ;

CREATE TABLE IE_isOrdinateOf_IE (
	__IDIE__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE SystemPAStandard_isUsedToDefine_InformationTechnologyStandard (
	__IDSystemPAStandard__ Integer NOT NULL,
	__IDInformationTechnologyStandard__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_occupation_Occupation (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDOccupation__ Integer NOT NULL
) ;

CREATE TABLE AMIERole_isRepresentedBy_AMIERoleGraphic (
	__IDAMIERole__ Integer NOT NULL,
	__IDAMIERoleGraphic__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_task_Task (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_spas_SystemPAStandard (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDSystemPAStandard__ Integer NOT NULL
) ;

CREATE TABLE Document_isThePrimaryReferenceFor_PA (
	__IDDocument__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE Document_cites_InformationAssetDocument (
	__IDDocument__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE AM_defines_LineOfBusiness (
	__IDAM__ Integer NOT NULL,
	__IDLineOfBusiness__ Integer NOT NULL
) ;
