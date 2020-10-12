CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	content text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Architecture (
	__IDArchitecture__ Integer NOT NULL,
	PRIMARY KEY Architecture (__IDArchitecture__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	PRIMARY KEY Organization (__IDOrganization__)
) ;

CREATE TABLE Guidance (
	__IDGuidance__ Integer NOT NULL,
	PRIMARY KEY Guidance (__IDGuidance__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	FOREIGN KEY describesArchitecture (__FKdescribesArchitecture__) REFERENCES Architecture (__IDArchitecture__),
	PRIMARY KEY Document (__IDDocument__),
	__FKdescribesArchitecture__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	FOREIGN KEY mayBeA (__FKmayBeA__) REFERENCES Task (__IDTask__),
	PRIMARY KEY Action (__IDAction__),
	__FKmayBeA__ Integer
) ;

CREATE TABLE Agreement (
	__IDAgreement__ Integer NOT NULL,
	PRIMARY KEY Agreement (__IDAgreement__)
) ;

CREATE TABLE Standard (
	__IDStandard__ Integer NOT NULL,
	PRIMARY KEY Standard (__IDStandard__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE InformationAsset (
	__IDInformationAsset__ Integer NOT NULL,
	PRIMARY KEY InformationAsset (__IDInformationAsset__)
) ;

CREATE TABLE ConceptualDataModel (
	__IDConceptualDataModel__ Integer NOT NULL,
	PRIMARY KEY ConceptualDataModel (__IDConceptualDataModel__)
) ;

CREATE TABLE ActivityModel (
	__IDActivityModel__ Integer NOT NULL,
	PRIMARY KEY ActivityModel (__IDActivityModel__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Network (
	__IDNetwork__ Integer NOT NULL,
	PRIMARY KEY Network (__IDNetwork__)
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	PRIMARY KEY Requirement (__IDRequirement__)
) ;

CREATE TABLE InfoExchRequirement (
	__IDInfoExchRequirement__ Integer NOT NULL,
	PRIMARY KEY InfoExchRequirement (__IDInfoExchRequirement__)
) ;

CREATE TABLE ExchangeNeedLineReq (
	__IDExchangeNeedLineReq__ Integer NOT NULL,
	PRIMARY KEY ExchangeNeedLineReq (__IDExchangeNeedLineReq__)
) ;

CREATE TABLE MissionArea (
	__IDMissionArea__ Integer NOT NULL,
	PRIMARY KEY MissionArea (__IDMissionArea__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE Mission (
	__IDMission__ Integer NOT NULL,
	FOREIGN KEY isCitedBy (__FKisCitedBy__) REFERENCES Architecture (__IDArchitecture__),
	PRIMARY KEY Mission (__IDMission__),
	__FKisCitedBy__ Integer
) ;

CREATE TABLE FunctionalArea (
	__IDFunctionalArea__ Integer NOT NULL,
	PRIMARY KEY FunctionalArea (__IDFunctionalArea__)
) ;

CREATE TABLE Capability (
	__IDCapability__ Integer NOT NULL,
	PRIMARY KEY Capability (__IDCapability__)
) ;

CREATE TABLE MaterielItem (
	__IDMaterielItem__ Integer NOT NULL,
	PRIMARY KEY MaterielItem (__IDMaterielItem__)
) ;

CREATE TABLE EquipmentType (
	__IDEquipmentType__ Integer NOT NULL,
	PRIMARY KEY EquipmentType (__IDEquipmentType__)
) ;

CREATE TABLE SoftwareItem (
	__IDSoftwareItem__ Integer NOT NULL,
	FOREIGN KEY isSourceFor (__FKisSourceFor__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY SoftwareItem (__IDSoftwareItem__),
	__FKisSourceFor__ Integer
) ;

CREATE TABLE Facility (
	__IDFacility__ Integer NOT NULL,
	PRIMARY KEY Facility (__IDFacility__)
) ;

CREATE TABLE Mission_isAssigned_Organization (
	__IDMission__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Node_hasServicesProvidedBy_Facility (
	__IDNode__ Integer NOT NULL,
	__IDFacility__ Integer NOT NULL
) ;

CREATE TABLE System_uses_MaterielItem (
	__IDSystem__ Integer NOT NULL,
	__IDMaterielItem__ Integer NOT NULL
) ;

CREATE TABLE Network_isAssociatedWith_Network (
	__IDNetwork__ Integer NOT NULL,
	__IDNetwork__ Integer NOT NULL
) ;

CREATE TABLE Node_isParticipedInBy_Network (
	__IDNode__ Integer NOT NULL,
	__IDNetwork__ Integer NOT NULL
) ;

CREATE TABLE Task_isAssociatedWith_Task (
	__IDTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE System_isDescribedBy_InformationAsset (
	__IDSystem__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE System_compliesWith_Standard (
	__IDSystem__ Integer NOT NULL,
	__IDStandard__ Integer NOT NULL
) ;

CREATE TABLE MaterielItem_conformsTo_Standard (
	__IDMaterielItem__ Integer NOT NULL,
	__IDStandard__ Integer NOT NULL
) ;

CREATE TABLE Node_supports_System (
	__IDNode__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Task_isPerformedUsing_System (
	__IDTask__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Guidance_providesAuthorityFor_InformationAsset (
	__IDGuidance__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE Requirement_specifiesNeedFor_MaterielItem (
	__IDRequirement__ Integer NOT NULL,
	__IDMaterielItem__ Integer NOT NULL
) ;

CREATE TABLE Document_describesSystem_System (
	__IDDocument__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Node_describes_Architecture (
	__IDNode__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE Document_isAssociatedWith_Document (
	__IDDocument__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Organization_softwareItems_SoftwareItem (
	__IDOrganization__ Integer NOT NULL,
	__IDSoftwareItem__ Integer NOT NULL
) ;

CREATE TABLE Action_involvedIn_ActivityModel (
	__IDAction__ Integer NOT NULL,
	__IDActivityModel__ Integer NOT NULL
) ;

CREATE TABLE FunctionalArea_cites_MissionArea (
	__IDFunctionalArea__ Integer NOT NULL,
	__IDMissionArea__ Integer NOT NULL
) ;

CREATE TABLE InfoExchRequirement_isSpecifiedInInfos_InformationAsset (
	__IDInfoExchRequirement__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE Guidance_defines_MissionArea (
	__IDGuidance__ Integer NOT NULL,
	__IDMissionArea__ Integer NOT NULL
) ;

CREATE TABLE Organization_performsTo_Capability (
	__IDOrganization__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE MissionArea_supports_Task (
	__IDMissionArea__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Mission_mayCite_FunctionalArea (
	__IDMission__ Integer NOT NULL,
	__IDFunctionalArea__ Integer NOT NULL
) ;

CREATE TABLE Guidance_isSpecifiedIn_Document (
	__IDGuidance__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Organization_isAssociatedWith_Organization (
	__IDOrganization__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Node_isAssociatedWith_Node (
	__IDNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Document_cites_InformationAsset (
	__IDDocument__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE FunctionalArea_isPartOf_FunctionalArea (
	__IDFunctionalArea__ Integer NOT NULL,
	__IDFunctionalArea__ Integer NOT NULL
) ;

CREATE TABLE Document_isSpecifiedUsing_Agreement (
	__IDDocument__ Integer NOT NULL,
	__IDAgreement__ Integer NOT NULL
) ;

CREATE TABLE Organization_owns_InformationAsset (
	__IDOrganization__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE Architecture_isFocusOf_FunctionalArea (
	__IDArchitecture__ Integer NOT NULL,
	__IDFunctionalArea__ Integer NOT NULL
) ;

CREATE TABLE Network_performsTo_Capability (
	__IDNetwork__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE Requirement_isSpecifiedUsing_InformationAsset (
	__IDRequirement__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE System_appliesTo_Requirement (
	__IDSystem__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE SoftwareItem_uses_EquipmentType (
	__IDSoftwareItem__ Integer NOT NULL,
	__IDEquipmentType__ Integer NOT NULL
) ;

CREATE TABLE Architecture_uses_Organization (
	__IDArchitecture__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Network_compliesWith_Standard (
	__IDNetwork__ Integer NOT NULL,
	__IDStandard__ Integer NOT NULL
) ;

CREATE TABLE Agreement_appliesTo_InformationAsset (
	__IDAgreement__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE Organization_hasRequirement_Requirement (
	__IDOrganization__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE System_associatedOrganization_Organization (
	__IDSystem__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Node_involves_InfoExchRequirement (
	__IDNode__ Integer NOT NULL,
	__IDInfoExchRequirement__ Integer NOT NULL
) ;

CREATE TABLE Network_has_Organization (
	__IDNetwork__ Integer NOT NULL,
	__IDOrganization__ Integer NOT NULL
) ;

CREATE TABLE Node_uses_InformationAsset (
	__IDNode__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE Organization_hasMissionArea_MissionArea (
	__IDOrganization__ Integer NOT NULL,
	__IDMissionArea__ Integer NOT NULL
) ;

CREATE TABLE Agreement_isAssociatedWith_Agreement (
	__IDAgreement__ Integer NOT NULL,
	__IDAgreement__ Integer NOT NULL
) ;

CREATE TABLE Agreement_implements_Guidance (
	__IDAgreement__ Integer NOT NULL,
	__IDGuidance__ Integer NOT NULL
) ;

CREATE TABLE System_isAssociatedWith_System (
	__IDSystem__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Requirement_mayBeSatifiedBy_Architecture (
	__IDRequirement__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE InformationAsset_isAssociatedWith_InformationAsset (
	__IDInformationAsset__ Integer NOT NULL,
	__IDInformationAsset__ Integer NOT NULL
) ;

CREATE TABLE InfoExchRequirement_isCitedIn_Document (
	__IDInfoExchRequirement__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Architecture_missions_Mission (
	__IDArchitecture__ Integer NOT NULL,
	__IDMission__ Integer NOT NULL
) ;

CREATE TABLE Mission_requires_Task (
	__IDMission__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Architecture_isAssociatedWith_Architecture (
	__IDArchitecture__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE Agreement_isCitedBy_Agreement (
	__IDAgreement__ Integer NOT NULL,
	__IDAgreement__ Integer NOT NULL
) ;

CREATE TABLE Network_isDescribedIn_Document (
	__IDNetwork__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE MaterielItem_performsTo_Capability (
	__IDMaterielItem__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE Guidance_isAssocitatedWith_Guidance (
	__IDGuidance__ Integer NOT NULL,
	__IDGuidance__ Integer NOT NULL
) ;

CREATE TABLE FunctionalArea_supports_System (
	__IDFunctionalArea__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Requirement_cites_MissionArea (
	__IDRequirement__ Integer NOT NULL,
	__IDMissionArea__ Integer NOT NULL
) ;

CREATE TABLE Guidance_isImplementedBy_Architecture (
	__IDGuidance__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE Task_specifies_Requirement (
	__IDTask__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE Task_isPerformedBy_Node (
	__IDTask__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Organization_associatedSystems_System (
	__IDOrganization__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Capability_specifiesRequired_Requirement (
	__IDCapability__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE MaterielItem_establishedAs_MaterielItem (
	__IDMaterielItem__ Integer NOT NULL,
	__IDMaterielItem__ Integer NOT NULL
) ;

CREATE TABLE System_operatesUsing_Network (
	__IDSystem__ Integer NOT NULL,
	__IDNetwork__ Integer NOT NULL
) ;

CREATE TABLE System_performsTo_Capability (
	__IDSystem__ Integer NOT NULL,
	__IDCapability__ Integer NOT NULL
) ;

CREATE TABLE Action_isAssociatedWith_Action (
	__IDAction__ Integer NOT NULL,
	__IDAction__ Integer NOT NULL
) ;

CREATE TABLE System_citedIn_Architecture (
	__IDSystem__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE Organization_isProponentOf_FunctionalArea (
	__IDOrganization__ Integer NOT NULL,
	__IDFunctionalArea__ Integer NOT NULL
) ;

CREATE TABLE Node_involvedIn_ActivityModel (
	__IDNode__ Integer NOT NULL,
	__IDActivityModel__ Integer NOT NULL
) ;

CREATE TABLE Organization_includes_Node (
	__IDOrganization__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;
