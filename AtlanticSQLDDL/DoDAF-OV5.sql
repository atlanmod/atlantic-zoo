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

CREATE TABLE AMSpecification (
	__IDAMSpecification__ Integer NOT NULL,
	PRIMARY KEY AMSpecification (__IDAMSpecification__)
) ;

CREATE TABLE AMSpecificationElement (
	__IDAMSpecificationElement__ Integer NOT NULL,
	FOREIGN KEY subject (__FKsubject__) REFERENCES PAExchangeRequirement (__IDPAExchangeRequirement__),
	PRIMARY KEY AMSpecificationElement (__IDAMSpecificationElement__),
	__FKsubject__ Integer
) ;

CREATE TABLE PAExchangeRequirement (
	__IDPAExchangeRequirement__ Integer NOT NULL,
	PRIMARY KEY PAExchangeRequirement (__IDPAExchangeRequirement__)
) ;

CREATE TABLE ArchitectureDocument (
	__IDArchitectureDocument__ Integer NOT NULL,
	PRIMARY KEY ArchitectureDocument (__IDArchitectureDocument__)
) ;

CREATE TABLE IE (
	__IDIE__ Integer NOT NULL,
	PRIMARY KEY IE (__IDIE__)
) ;

CREATE TABLE AMIERole (
	__IDAMIERole__ Integer NOT NULL,
	PRIMARY KEY AMIERole (__IDAMIERole__)
) ;

CREATE TABLE Control (
	__IDControl__ Integer NOT NULL,
	source text,
	destination text,
	PRIMARY KEY Control (__IDControl__)
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

CREATE TABLE Mechanism (
	__IDMechanism__ Integer NOT NULL,
	source text,
	destination text,
	resourceType text,
	PRIMARY KEY Mechanism (__IDMechanism__)
) ;

CREATE TABLE MechanismSystem (
	__IDMechanismSystem__ Integer NOT NULL,
	PRIMARY KEY MechanismSystem (__IDMechanismSystem__)
) ;

CREATE TABLE MechanismReference (
	__IDMechanismReference__ Integer NOT NULL,
	PRIMARY KEY MechanismReference (__IDMechanismReference__)
) ;

CREATE TABLE MechanismFacility (
	__IDMechanismFacility__ Integer NOT NULL,
	PRIMARY KEY MechanismFacility (__IDMechanismFacility__)
) ;

CREATE TABLE InformationAssetDocument (
	__IDInformationAssetDocument__ Integer NOT NULL,
	PRIMARY KEY InformationAssetDocument (__IDInformationAssetDocument__)
) ;

CREATE TABLE AMPA (
	__IDAMPA__ Integer NOT NULL,
	PRIMARY KEY AMPA (__IDAMPA__)
) ;

CREATE TABLE PACapability (
	__IDPACapability__ Integer NOT NULL,
	PRIMARY KEY PACapability (__IDPACapability__)
) ;

CREATE TABLE PA (
	__IDPA__ Integer NOT NULL,
	PRIMARY KEY PA (__IDPA__)
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

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	levelIdentifier text,
	"references" text,
	cost text,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE PATask (
	__IDPATask__ Integer NOT NULL,
	FOREIGN KEY isCitedBy (__FKisCitedBy__) REFERENCES InformationAsset (__IDInformationAsset__),
	PRIMARY KEY PATask (__IDPATask__),
	__FKisCitedBy__ Integer
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES OrganizationType (__IDOrganizationType__),
	PRIMARY KEY Organization (__IDOrganization__),
	__FKtype__ Integer
) ;

CREATE TABLE OrganizationType (
	__IDOrganizationType__ Integer NOT NULL,
	PRIMARY KEY OrganizationType (__IDOrganizationType__)
) ;

CREATE TABLE OperationalRole (
	__IDOperationalRole__ Integer NOT NULL,
	PRIMARY KEY OperationalRole (__IDOperationalRole__)
) ;

CREATE TABLE Occupation (
	__IDOccupation__ Integer NOT NULL,
	PRIMARY KEY Occupation (__IDOccupation__)
) ;

CREATE TABLE PersonType (
	__IDPersonType__ Integer NOT NULL,
	PRIMARY KEY PersonType (__IDPersonType__)
) ;

CREATE TABLE Skill (
	__IDSkill__ Integer NOT NULL,
	PRIMARY KEY Skill (__IDSkill__)
) ;

CREATE TABLE DOSCR (
	__IDDOSCR__ Integer NOT NULL,
	FOREIGN KEY mayBeAn (__FKmayBeAn__) REFERENCES Occupation (__IDOccupation__),
	PRIMARY KEY DOSCR (__IDDOSCR__),
	__FKmayBeAn__ Integer
) ;

CREATE TABLE AMSpecification_isSpecifiedUsing_AMSpecificationElement (
	__IDAMSpecification__ Integer NOT NULL,
	__IDAMSpecificationElement__ Integer NOT NULL
) ;

CREATE TABLE Skill_mayBeCitedFor_OperationalRole (
	__IDSkill__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE PersonType_can_Skill (
	__IDPersonType__ Integer NOT NULL,
	__IDSkill__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_doscr_DOSCR (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDDOSCR__ Integer NOT NULL
) ;

CREATE TABLE OperationalRole_isCitedAs_MechanismReference (
	__IDOperationalRole__ Integer NOT NULL,
	__IDMechanismReference__ Integer NOT NULL
) ;

CREATE TABLE AMIERole_defines_AMPA (
	__IDAMIERole__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Organization_supplies_InformationAsset (
	__IDOrganization__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE PA_has_PACapability (
	__IDPA__ Integer NOT NULL,
	__IDPACapability__ Integer NOT NULL
) ;

CREATE TABLE PA_isChildFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_iaDocument_InformationAssetDocument (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE OrganizationType_isCitedAs_MechanismReference (
	__IDOrganizationType__ Integer NOT NULL,
	__IDMechanismReference__ Integer NOT NULL
) ;

CREATE TABLE InformationAsset_isDescribedUsing_PACapability (
	__IDInformationAsset__ Integer NOT NULL,
	__IDPACapability__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_document_Document (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE OrganizationType_isTheTypeOf_Organization (
	__IDOrganizationType__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE PA_isTheProducerFor_PAExchangeRequirement (
	__IDPA__ Integer NOT NULL,
	__IDPAExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE PA_isTheConsumerFor_PAExchangeRequirement (
	__IDPA__ Integer NOT NULL,
	__IDPAExchangeRequirement__ Integer NOT NULL
) ;

CREATE TABLE Document_isTheReferenceFor_IE (
	__IDDocument__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_amSpecification_AMSpecification (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDAMSpecification__ Integer NOT NULL
) ;

CREATE TABLE Input_isTheInputThatIsDefinedBy_Output (
	__IDInput__ Integer NOT NULL,
	__IDOutput__ Integer NOT NULL
) ;

CREATE TABLE Document_cites_InformationAssetDocument (
	__IDDocument__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE DOSCR_mayBeCitedFor_OperationalRole (
	__IDDOSCR__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_organizationType_OrganizationType (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDOrganizationType__ Integer NOT NULL
) ;

CREATE TABLE Organization_owns_InformationAsset (
	__IDOrganization__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE PersonType_mayBeCitedFor_OperationalRole (
	__IDPersonType__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE Document_isThePrimaryReferenceFor_PA (
	__IDDocument__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE DOSCR_appliesTo_PersonType (
	__IDDOSCR__ Integer NOT NULL,
	__IDPersonType__ Integer NOT NULL
) ;

CREATE TABLE AM_paTask_PATask (
	__IDAM__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_task_Task (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Occupation_mayBeCitedForPT_PersonType (
	__IDOccupation__ Integer NOT NULL,
	__IDPersonType__ Integer NOT NULL
) ;

CREATE TABLE AM_includes_AMPA (
	__IDAM__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE IE_isSubordinateOf_IE (
	__IDIE__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE Organization_isCitedAs_MechanismReference (
	__IDOrganization__ Integer NOT NULL,
	__IDMechanismReference__ Integer NOT NULL
) ;

CREATE TABLE AM_specifies_AMSpecification (
	__IDAM__ Integer NOT NULL,
	__IDAMSpecification__ Integer NOT NULL
) ;

CREATE TABLE Organization_providesStewardshipFor_InformationAsset (
	__IDOrganization__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE InformationAsset_isCitedIn_InformationAssetDocument (
	__IDInformationAsset__ Integer NOT NULL,
	__IDInformationAssetDocument__ Integer NOT NULL
) ;

CREATE TABLE IE_isAssociatedWith_AMIERole (
	__IDIE__ Integer NOT NULL,
	__IDAMIERole__ Integer NOT NULL
) ;

CREATE TABLE PA_isParentFor_PA (
	__IDPA__ Integer NOT NULL,
	__IDPA__ Integer NOT NULL
) ;

CREATE TABLE IE_isOrdinateOf_IE (
	__IDIE__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isSubordinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE Occupation_mayBeCitedForOR_OperationalRole (
	__IDOccupation__ Integer NOT NULL,
	__IDOperationalRole__ Integer NOT NULL
) ;

CREATE TABLE DoDAFModel_am_AM (
	__IDDoDAFModel__ Integer NOT NULL,
	__IDAM__ Integer NOT NULL
) ;

CREATE TABLE PA_isIncludedIn_AMPA (
	__IDPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE PAExchangeRequirement_isTheSubjectOf_AMSpecificationElement (
	__IDPAExchangeRequirement__ Integer NOT NULL,
	__IDAMSpecificationElement__ Integer NOT NULL
) ;

CREATE TABLE Organization_develops_IE (
	__IDOrganization__ Integer NOT NULL,
	__IDIE__ Integer NOT NULL
) ;

CREATE TABLE Document_records_ArchitectureDocument (
	__IDDocument__ Integer NOT NULL,
	__IDArchitectureDocument__ Integer NOT NULL
) ;

CREATE TABLE AMPA_defines_AMIERole (
	__IDAMPA__ Integer NOT NULL,
	__IDAMIERole__ Integer NOT NULL
) ;

CREATE TABLE AMPA_isOrdinateOf_AMPA (
	__IDAMPA__ Integer NOT NULL,
	__IDAMPA__ Integer NOT NULL
) ;

CREATE TABLE PA_correspondsTo_PATask (
	__IDPA__ Integer NOT NULL,
	__IDPATask__ Integer NOT NULL
) ;
