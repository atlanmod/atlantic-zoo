CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	id text,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE AGATEObject (
	__IDAGATEObject__ Integer NOT NULL,
	notice text,
	description text,
	sensitivity Integer,
	name text,
	comment text,
	FOREIGN KEY isValidIn (__FKisValidIn__) REFERENCES OperationalContext (__IDOperationalContext__),
	FOREIGN KEY isAssociatedWith (__FKisAssociatedWith__) REFERENCES Stake (__IDStake__),
	PRIMARY KEY AGATEObject (__IDAGATEObject__),
	__FKisAssociatedWith__ Integer,
	__FKisValidIn__ Integer
) ;

CREATE TABLE Objective (
	__IDObjective__ Integer NOT NULL,
	type text,
	priority Integer,
	indicator text,
	traceability text,
	PRIMARY KEY Objective (__IDObjective__)
) ;

CREATE TABLE OperationalContext (
	__IDOperationalContext__ Integer NOT NULL,
	PRIMARY KEY OperationalContext (__IDOperationalContext__)
) ;

CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	FOREIGN KEY moi (__FKmoi__) REFERENCES Role (__IDRole__),
	FOREIGN KEY moa (__FKmoa__) REFERENCES Role (__IDRole__),
	FOREIGN KEY director (__FKdirector__) REFERENCES Role (__IDRole__),
	PRIMARY KEY Project (__IDProject__),
	__FKmoa__ Integer,
	__FKdirector__ Integer,
	__FKmoi__ Integer
) ;

CREATE TABLE Standard (
	__IDStandard__ Integer NOT NULL,
	PRIMARY KEY Standard (__IDStandard__)
) ;

CREATE TABLE GenericStandard (
	__IDGenericStandard__ Integer NOT NULL,
	PRIMARY KEY GenericStandard (__IDGenericStandard__)
) ;

CREATE TABLE Threat (
	__IDThreat__ Integer NOT NULL,
	nature text,
	DCSSI text,
	PRIMARY KEY Threat (__IDThreat__)
) ;

CREATE TABLE GenericThreat (
	__IDGenericThreat__ Integer NOT NULL,
	PRIMARY KEY GenericThreat (__IDGenericThreat__)
) ;

CREATE TABLE Vulnerability (
	__IDVulnerability__ Integer NOT NULL,
	level Integer,
	FOREIGN KEY relatesTo (__FKrelatesTo__) REFERENCES Entity (__IDEntity__),
	PRIMARY KEY Vulnerability (__IDVulnerability__),
	__FKrelatesTo__ Integer
) ;

CREATE TABLE TrafficClass (
	__IDTrafficClass__ Integer NOT NULL,
	PRIMARY KEY TrafficClass (__IDTrafficClass__)
) ;

CREATE TABLE InterfaceCharacteristic (
	__IDInterfaceCharacteristic__ Integer NOT NULL,
	type text,
	PRIMARY KEY InterfaceCharacteristic (__IDInterfaceCharacteristic__)
) ;

CREATE TABLE ConfidentialityLevel (
	__IDConfidentialityLevel__ Integer NOT NULL,
	PRIMARY KEY ConfidentialityLevel (__IDConfidentialityLevel__)
) ;

CREATE TABLE Protocol (
	__IDProtocol__ Integer NOT NULL,
	isoLevel Integer,
	PRIMARY KEY Protocol (__IDProtocol__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	unit text,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE Other (
	__IDOther__ Integer NOT NULL,
	PRIMARY KEY Other (__IDOther__)
) ;

CREATE TABLE ProjectContextElement (
	__IDProjectContextElement__ Integer NOT NULL,
	type text,
	PRIMARY KEY ProjectContextElement (__IDProjectContextElement__)
) ;

CREATE TABLE DataClass (
	__IDDataClass__ Integer NOT NULL,
	PRIMARY KEY DataClass (__IDDataClass__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Risk (
	__IDRisk__ Integer NOT NULL,
	disponibilityLevel Integer,
	integrityLevel Integer,
	confidencialityLevel Integer,
	FOREIGN KEY isCoveredByCR (__FKisCoveredByCR__) REFERENCES CountermeasureRequirement (__IDCountermeasureRequirement__),
	FOREIGN KEY isCoveredByAO (__FKisCoveredByAO__) REFERENCES ArchitectureObject (__IDArchitectureObject__),
	FOREIGN KEY isCoveredByMO (__FKisCoveredByMO__) REFERENCES MADIOSObject (__IDMADIOSObject__),
	FOREIGN KEY isCoveredByDR (__FKisCoveredByDR__) REFERENCES DomainRelation (__IDDomainRelation__),
	FOREIGN KEY relatesToRO (__FKrelatesToRO__) REFERENCES ReusableObject (__IDReusableObject__),
	FOREIGN KEY relatesToCO (__FKrelatesToCO__) REFERENCES CommunicationObject (__IDCommunicationObject__),
	FOREIGN KEY isGeneratedBy (__FKisGeneratedBy__) REFERENCES Threat (__IDThreat__),
	PRIMARY KEY Risk (__IDRisk__),
	__FKisCoveredByMO__ Integer,
	__FKisCoveredByDR__ Integer,
	__FKisCoveredByCR__ Integer,
	__FKrelatesToRO__ Integer,
	__FKisGeneratedBy__ Integer,
	__FKrelatesToCO__ Integer,
	__FKisCoveredByAO__ Integer
) ;

CREATE TABLE Stake (
	__IDStake__ Integer NOT NULL,
	type text,
	relativeDate text,
	unit text,
	date text,
	PRIMARY KEY Stake (__IDStake__)
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	criticality Integer,
	priority text,
	state text,
	PRIMARY KEY Requirement (__IDRequirement__)
) ;

CREATE TABLE CountermeasureRequirement (
	__IDCountermeasureRequirement__ Integer NOT NULL,
	type text,
	residualVulnerability text,
	PRIMARY KEY CountermeasureRequirement (__IDCountermeasureRequirement__)
) ;

CREATE TABLE TechnicalRequirement (
	__IDTechnicalRequirement__ Integer NOT NULL,
	PRIMARY KEY TechnicalRequirement (__IDTechnicalRequirement__)
) ;

CREATE TABLE PerformanceRequirement (
	__IDPerformanceRequirement__ Integer NOT NULL,
	PRIMARY KEY PerformanceRequirement (__IDPerformanceRequirement__)
) ;

CREATE TABLE InteroperabilityRequirement (
	__IDInteroperabilityRequirement__ Integer NOT NULL,
	PRIMARY KEY InteroperabilityRequirement (__IDInteroperabilityRequirement__)
) ;

CREATE TABLE OperationalRequirement (
	__IDOperationalRequirement__ Integer NOT NULL,
	PRIMARY KEY OperationalRequirement (__IDOperationalRequirement__)
) ;

CREATE TABLE SecurityRequirement (
	__IDSecurityRequirement__ Integer NOT NULL,
	PRIMARY KEY SecurityRequirement (__IDSecurityRequirement__)
) ;

CREATE TABLE Means (
	__IDMeans__ Integer NOT NULL,
	FOREIGN KEY isProvidedBy (__FKisProvidedBy__) REFERENCES OrganizationObject (__IDOrganizationObject__),
	PRIMARY KEY Means (__IDMeans__),
	__FKisProvidedBy__ Integer
) ;

CREATE TABLE DomainRelation (
	__IDDomainRelation__ Integer NOT NULL,
	PRIMARY KEY DomainRelation (__IDDomainRelation__)
) ;

CREATE TABLE HierarchicalRelation (
	__IDHierarchicalRelation__ Integer NOT NULL,
	PRIMARY KEY HierarchicalRelation (__IDHierarchicalRelation__)
) ;

CREATE TABLE FunctionalRelation (
	__IDFunctionalRelation__ Integer NOT NULL,
	FOREIGN KEY necessaryObjectOF (__FKnecessaryObjectOF__) REFERENCES OperationalFunction (__IDOperationalFunction__),
	FOREIGN KEY dependentObjectOF (__FKdependentObjectOF__) REFERENCES OperationalFunction (__IDOperationalFunction__),
	FOREIGN KEY necessaryObjectOO (__FKnecessaryObjectOO__) REFERENCES OrganizationObject (__IDOrganizationObject__),
	FOREIGN KEY dependentObjectOO (__FKdependentObjectOO__) REFERENCES OrganizationObject (__IDOrganizationObject__),
	FOREIGN KEY necessaryObjectP (__FKnecessaryObjectP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY dependentObjectP (__FKdependentObjectP__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY FunctionalRelation (__IDFunctionalRelation__),
	__FKdependentObjectOO__ Integer,
	__FKnecessaryObjectOF__ Integer,
	__FKdependentObjectOF__ Integer,
	__FKnecessaryObjectOO__ Integer,
	__FKnecessaryObjectP__ Integer,
	__FKdependentObjectP__ Integer
) ;

CREATE TABLE Dependence (
	__IDDependence__ Integer NOT NULL,
	type text,
	FOREIGN KEY necessaryObjectS (__FKnecessaryObjectS__) REFERENCES Service (__IDService__),
	FOREIGN KEY dependentObjectS (__FKdependentObjectS__) REFERENCES Service (__IDService__),
	FOREIGN KEY necessaryObjectLC (__FKnecessaryObjectLC__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	FOREIGN KEY dependentObjectLC (__FKdependentObjectLC__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	FOREIGN KEY necessaryObjectP (__FKnecessaryObjectP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY dependentObjectP (__FKdependentObjectP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY necessaryObjectC (__FKnecessaryObjectC__) REFERENCES Center (__IDCenter__),
	FOREIGN KEY dependentObjectC (__FKdependentObjectC__) REFERENCES Center (__IDCenter__),
	FOREIGN KEY necessaryObjectIS (__FKnecessaryObjectIS__) REFERENCES InformationSystem (__IDInformationSystem__),
	FOREIGN KEY dependentObjectIS (__FKdependentObjectIS__) REFERENCES InformationSystem (__IDInformationSystem__),
	PRIMARY KEY Dependence (__IDDependence__),
	__FKdependentObjectC__ Integer,
	__FKnecessaryObjectP__ Integer,
	__FKnecessaryObjectLC__ Integer,
	__FKnecessaryObjectC__ Integer,
	__FKdependentObjectLC__ Integer,
	__FKnecessaryObjectIS__ Integer,
	__FKdependentObjectIS__ Integer,
	__FKdependentObjectP__ Integer,
	__FKdependentObjectS__ Integer,
	__FKnecessaryObjectS__ Integer
) ;

CREATE TABLE ArchitectureObject (
	__IDArchitectureObject__ Integer NOT NULL,
	PRIMARY KEY ArchitectureObject (__IDArchitectureObject__)
) ;

CREATE TABLE ReusableObject (
	__IDReusableObject__ Integer NOT NULL,
	membership text,
	confidentialityLevel Integer,
	FOREIGN KEY belongsTo (__FKbelongsTo__) REFERENCES Entity (__IDEntity__),
	FOREIGN KEY isAttachedToIS (__FKisAttachedToIS__) REFERENCES InformationSystem (__IDInformationSystem__),
	FOREIGN KEY isAttachedToA (__FKisAttachedToA__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY isA (__FKisA__) REFERENCES Means (__IDMeans__),
	PRIMARY KEY ReusableObject (__IDReusableObject__),
	__FKisAttachedToIS__ Integer,
	__FKbelongsTo__ Integer,
	__FKisAttachedToA__ Integer,
	__FKisA__ Integer
) ;

CREATE TABLE Site (
	__IDSite__ Integer NOT NULL,
	type text,
	localization text,
	PRIMARY KEY Site (__IDSite__)
) ;

CREATE TABLE GenericSite (
	__IDGenericSite__ Integer NOT NULL,
	PRIMARY KEY GenericSite (__IDGenericSite__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY isCoveredByLC (__FKisCoveredByLC__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	FOREIGN KEY isCoveredByTC (__FKisCoveredByTC__) REFERENCES TechnicalComponent (__IDTechnicalComponent__),
	PRIMARY KEY Package (__IDPackage__),
	__FKisCoveredByTC__ Integer,
	__FKisCoveredByLC__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	Statut text,
	FOREIGN KEY isASpecializationOf (__FKisASpecializationOf__) REFERENCES ReferenceService (__IDReferenceService__),
	FOREIGN KEY isCoveredBy (__FKisCoveredBy__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	PRIMARY KEY Service (__IDService__),
	__FKisASpecializationOf__ Integer,
	__FKisCoveredBy__ Integer
) ;

CREATE TABLE TechnicalComponent (
	__IDTechnicalComponent__ Integer NOT NULL,
	type text,
	cots Boolean,
	editor Boolean,
	constructor Boolean,
	version text,
	technology text,
	definedExtension text,
	statut text,
	FOREIGN KEY isASpecializationOf (__FKisASpecializationOf__) REFERENCES ReferenceTechnicalComponent (__IDReferenceTechnicalComponent__),
	PRIMARY KEY TechnicalComponent (__IDTechnicalComponent__),
	__FKisASpecializationOf__ Integer
) ;

CREATE TABLE LogicalComponent (
	__IDLogicalComponent__ Integer NOT NULL,
	type text,
	statut text,
	FOREIGN KEY isASpecializationOf (__FKisASpecializationOf__) REFERENCES ReferenceLogicalComponent (__IDReferenceLogicalComponent__),
	FOREIGN KEY isCoveredBy (__FKisCoveredBy__) REFERENCES TechnicalComponent (__IDTechnicalComponent__),
	PRIMARY KEY LogicalComponent (__IDLogicalComponent__),
	__FKisCoveredBy__ Integer,
	__FKisASpecializationOf__ Integer
) ;

CREATE TABLE OperationalFunction (
	__IDOperationalFunction__ Integer NOT NULL,
	PRIMARY KEY OperationalFunction (__IDOperationalFunction__)
) ;

CREATE TABLE OrganizationObject (
	__IDOrganizationObject__ Integer NOT NULL,
	FOREIGN KEY subordinate (__FKsubordinate__) REFERENCES HierarchicalRelation (__IDHierarchicalRelation__),
	FOREIGN KEY superior (__FKsuperior__) REFERENCES HierarchicalRelation (__IDHierarchicalRelation__),
	PRIMARY KEY OrganizationObject (__IDOrganizationObject__),
	__FKsuperior__ Integer,
	__FKsubordinate__ Integer
) ;

CREATE TABLE Center (
	__IDCenter__ Integer NOT NULL,
	PRIMARY KEY Center (__IDCenter__)
) ;

CREATE TABLE GenericCenter (
	__IDGenericCenter__ Integer NOT NULL,
	PRIMARY KEY GenericCenter (__IDGenericCenter__)
) ;

CREATE TABLE InformationSystem (
	__IDInformationSystem__ Integer NOT NULL,
	nature text,
	version text,
	membershipCountry text,
	currentLocation text,
	startServiceDate text,
	stopServiceDate text,
	isGeneric Boolean,
	functionalDomain text,
	type text,
	PRIMARY KEY InformationSystem (__IDInformationSystem__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	type text,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE GenericRole (
	__IDGenericRole__ Integer NOT NULL,
	PRIMARY KEY GenericRole (__IDGenericRole__)
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE GenericActor (
	__IDGenericActor__ Integer NOT NULL,
	PRIMARY KEY GenericActor (__IDGenericActor__)
) ;

CREATE TABLE TelecomOperator (
	__IDTelecomOperator__ Integer NOT NULL,
	contractType text,
	PRIMARY KEY TelecomOperator (__IDTelecomOperator__)
) ;

CREATE TABLE CommunicationObject (
	__IDCommunicationObject__ Integer NOT NULL,
	confidentialityLevel Integer,
	FOREIGN KEY belongsTo (__FKbelongsTo__) REFERENCES Entity (__IDEntity__),
	PRIMARY KEY CommunicationObject (__IDCommunicationObject__),
	__FKbelongsTo__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE Interconnection (
	__IDInterconnection__ Integer NOT NULL,
	linkType text,
	PRIMARY KEY Interconnection (__IDInterconnection__)
) ;

CREATE TABLE InformationFlow (
	__IDInformationFlow__ Integer NOT NULL,
	priority Integer,
	frequency text,
	media text,
	continuity text,
	myContainer text,
	time text,
	availabilityRatio text,
	integrity Integer,
	interoperabilityLevel Integer,
	mediumFlow text,
	maximumFlow text,
	duration text,
	unitMediumFlow text,
	averageEvent text,
	maximumFlowOverOneDuration text,
	FOREIGN KEY transports (__FKtransports__) REFERENCES Information (__IDInformation__),
	FOREIGN KEY receiverP (__FKreceiverP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY transmitterP (__FKtransmitterP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY receiverOO (__FKreceiverOO__) REFERENCES OrganizationObject (__IDOrganizationObject__),
	FOREIGN KEY transmitterOO (__FKtransmitterOO__) REFERENCES OrganizationObject (__IDOrganizationObject__),
	FOREIGN KEY receiverOF (__FKreceiverOF__) REFERENCES OperationalFunction (__IDOperationalFunction__),
	FOREIGN KEY transmitterOF (__FKtransmitterOF__) REFERENCES OperationalFunction (__IDOperationalFunction__),
	PRIMARY KEY InformationFlow (__IDInformationFlow__),
	__FKtransmitterOF__ Integer,
	__FKreceiverOF__ Integer,
	__FKtransmitterOO__ Integer,
	__FKreceiverOO__ Integer,
	__FKtransports__ Integer,
	__FKreceiverP__ Integer,
	__FKtransmitterP__ Integer
) ;

CREATE TABLE Traffic (
	__IDTraffic__ Integer NOT NULL,
	sequence text,
	type text,
	interoperabilityLevel Integer,
	FOREIGN KEY trafficClass (__FKtrafficClass__) REFERENCES TrafficClass (__IDTrafficClass__),
	FOREIGN KEY dataClass (__FKdataClass__) REFERENCES DataClass (__IDDataClass__),
	FOREIGN KEY receiverP (__FKreceiverP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY transmitterP (__FKtransmitterP__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY receiverIS (__FKreceiverIS__) REFERENCES InformationSystem (__IDInformationSystem__),
	FOREIGN KEY transmitterIS (__FKtransmitterIS__) REFERENCES InformationSystem (__IDInformationSystem__),
	FOREIGN KEY receiverC (__FKreceiverC__) REFERENCES Center (__IDCenter__),
	FOREIGN KEY transmitterC (__FKtransmitterC__) REFERENCES Center (__IDCenter__),
	FOREIGN KEY receiverTO (__FKreceiverTO__) REFERENCES TelecomOperator (__IDTelecomOperator__),
	FOREIGN KEY transmitterTO (__FKtransmitterTO__) REFERENCES TelecomOperator (__IDTelecomOperator__),
	FOREIGN KEY receiverLC (__FKreceiverLC__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	FOREIGN KEY transmitterLC (__FKtransmitterLC__) REFERENCES LogicalComponent (__IDLogicalComponent__),
	FOREIGN KEY receiverTC (__FKreceiverTC__) REFERENCES TechnicalComponent (__IDTechnicalComponent__),
	FOREIGN KEY transmitterTC (__FKtransmitterTC__) REFERENCES TechnicalComponent (__IDTechnicalComponent__),
	PRIMARY KEY Traffic (__IDTraffic__),
	__FKreceiverTO__ Integer,
	__FKtrafficClass__ Integer,
	__FKreceiverP__ Integer,
	__FKreceiverIS__ Integer,
	__FKdataClass__ Integer,
	__FKtransmitterP__ Integer,
	__FKtransmitterIS__ Integer,
	__FKtransmitterTC__ Integer,
	__FKtransmitterTO__ Integer,
	__FKreceiverC__ Integer,
	__FKreceiverLC__ Integer,
	__FKtransmitterC__ Integer,
	__FKreceiverTC__ Integer,
	__FKtransmitterLC__ Integer
) ;

CREATE TABLE Information (
	__IDInformation__ Integer NOT NULL,
	format text,
	storageSupport text,
	persistence text,
	FOREIGN KEY DataType (__FKDataType__) REFERENCES DataClass (__IDDataClass__),
	PRIMARY KEY Information (__IDInformation__),
	__FKDataType__ Integer
) ;

CREATE TABLE ReferenceObject (
	__IDReferenceObject__ Integer NOT NULL,
	name text,
	description text,
	PRIMARY KEY ReferenceObject (__IDReferenceObject__)
) ;

CREATE TABLE ReferenceTechnicalComponent (
	__IDReferenceTechnicalComponent__ Integer NOT NULL,
	PRIMARY KEY ReferenceTechnicalComponent (__IDReferenceTechnicalComponent__)
) ;

CREATE TABLE TechnicalComponentReferenceFrame (
	__IDTechnicalComponentReferenceFrame__ Integer NOT NULL,
	PRIMARY KEY TechnicalComponentReferenceFrame (__IDTechnicalComponentReferenceFrame__)
) ;

CREATE TABLE ReferenceLogicalComponent (
	__IDReferenceLogicalComponent__ Integer NOT NULL,
	PRIMARY KEY ReferenceLogicalComponent (__IDReferenceLogicalComponent__)
) ;

CREATE TABLE ReferenceService (
	__IDReferenceService__ Integer NOT NULL,
	PRIMARY KEY ReferenceService (__IDReferenceService__)
) ;

CREATE TABLE ServiceReferenceFrame (
	__IDServiceReferenceFrame__ Integer NOT NULL,
	PRIMARY KEY ServiceReferenceFrame (__IDServiceReferenceFrame__)
) ;

CREATE TABLE MADIOSObject (
	__IDMADIOSObject__ Integer NOT NULL,
	PRIMARY KEY MADIOSObject (__IDMADIOSObject__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE "Procedure" (
	__IDProcedure__ Integer NOT NULL,
	PRIMARY KEY "Procedure" (__IDProcedure__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	PRIMARY KEY Activity (__IDActivity__)
) ;

CREATE TABLE Project_defines_ProjectContextElement (
	__IDProject__ Integer NOT NULL,
	__IDProjectContextElement__ Integer NOT NULL
) ;

CREATE TABLE TelecomOperator_interfaces_Interface (
	__IDTelecomOperator__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Activity_isisCoveredByS_Service (
	__IDActivity__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Project_associatedISs_InformationSystem (
	__IDProject__ Integer NOT NULL,
	__IDInformationSystem__ Integer NOT NULL
) ;

CREATE TABLE OperationalFunction_isCoveredByP_Package (
	__IDOperationalFunction__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE ServiceReferenceFrame_composedOfRLC_ReferenceLogicalComponent (
	__IDServiceReferenceFrame__ Integer NOT NULL,
	__IDReferenceLogicalComponent__ Integer NOT NULL
) ;

CREATE TABLE Process_isCoveredByS_Service (
	__IDProcess__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Package_subPackage_Package (
	__IDPackage__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Standard_caracterizeP_Package (
	__IDStandard__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_fixes_OperationalContext (
	__IDInformationSystem__ Integer NOT NULL,
	__IDOperationalContext__ Integer NOT NULL
) ;

CREATE TABLE Standard_caracterizeR_Requirement (
	__IDStandard__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE Stake_events_Event (
	__IDStake__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE Site_deployedObjects_ReusableObject (
	__IDSite__ Integer NOT NULL,
	__IDReusableObject__ Integer NOT NULL
) ;

CREATE TABLE Interface_composedOf_Interface (
	__IDInterface__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE OrganizationObject_time_Role (
	__IDOrganizationObject__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Package_time_Role (
	__IDPackage__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE OperationalFunction_isCoveredByS_Service (
	__IDOperationalFunction__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_interfaces_Interface (
	__IDInformationSystem__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE TrafficClass_traffic_Traffic (
	__IDTrafficClass__ Integer NOT NULL,
	__IDTraffic__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_fulfills_Role (
	__IDInformationSystem__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Procedure_isCoveredByS_Service (
	__IDProcedure__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Standard_caracterizeLC_LogicalComponent (
	__IDStandard__ Integer NOT NULL,
	__IDLogicalComponent__ Integer NOT NULL
) ;

CREATE TABLE Requirement_characterizes_ArchitectureObject (
	__IDRequirement__ Integer NOT NULL,
	__IDArchitectureObject__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_composedOf_InformationSystem (
	__IDInformationSystem__ Integer NOT NULL,
	__IDInformationSystem__ Integer NOT NULL
) ;

CREATE TABLE Threat_clarifies_Vulnerability (
	__IDThreat__ Integer NOT NULL,
	__IDVulnerability__ Integer NOT NULL
) ;

CREATE TABLE Interface_characteristics_InterfaceCharacteristic (
	__IDInterface__ Integer NOT NULL,
	__IDInterfaceCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE ReferenceService_composedOf_ReferenceObject (
	__IDReferenceService__ Integer NOT NULL,
	__IDReferenceObject__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_usedBy_Actor (
	__IDInformationSystem__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE Requirement_isCoveredBy_ArchitectureObject (
	__IDRequirement__ Integer NOT NULL,
	__IDArchitectureObject__ Integer NOT NULL
) ;

CREATE TABLE Package_groupedObjects_ReusableObject (
	__IDPackage__ Integer NOT NULL,
	__IDReusableObject__ Integer NOT NULL
) ;

CREATE TABLE Interconnection_between_Interface (
	__IDInterconnection__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE GenericThreat_composedBy_Threat (
	__IDGenericThreat__ Integer NOT NULL,
	__IDThreat__ Integer NOT NULL
) ;

CREATE TABLE LogicalComponent_composedOf_LogicalComponent (
	__IDLogicalComponent__ Integer NOT NULL,
	__IDLogicalComponent__ Integer NOT NULL
) ;

CREATE TABLE OperationalFunction_composedOf_OperationalFunction (
	__IDOperationalFunction__ Integer NOT NULL,
	__IDOperationalFunction__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_associatedProjects_Project (
	__IDInformationSystem__ Integer NOT NULL,
	__IDProject__ Integer NOT NULL
) ;

CREATE TABLE ServiceReferenceFrame_composedOfRS_ReferenceService (
	__IDServiceReferenceFrame__ Integer NOT NULL,
	__IDReferenceService__ Integer NOT NULL
) ;

CREATE TABLE Procedure_isCoveredByP_Package (
	__IDProcedure__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE LogicalComponent_interfaces_Interface (
	__IDLogicalComponent__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Center_deployedObjects_ReusableObject (
	__IDCenter__ Integer NOT NULL,
	__IDReusableObject__ Integer NOT NULL
) ;

CREATE TABLE ReferenceLogicalComponent_composedOf_ReferenceLogicalComponent (
	__IDReferenceLogicalComponent__ Integer NOT NULL,
	__IDReferenceLogicalComponent__ Integer NOT NULL
) ;

CREATE TABLE Activity_isCoveredByP_Package (
	__IDActivity__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE GenericStandard_composedOf_Standard (
	__IDGenericStandard__ Integer NOT NULL,
	__IDStandard__ Integer NOT NULL
) ;

CREATE TABLE Package_composedOf_Interface (
	__IDPackage__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Process_isCoveredByP_Package (
	__IDProcess__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE InformationSystem_defines_Objective (
	__IDInformationSystem__ Integer NOT NULL,
	__IDObjective__ Integer NOT NULL
) ;

CREATE TABLE Standard_caracterizeTC_TechnicalComponent (
	__IDStandard__ Integer NOT NULL,
	__IDTechnicalComponent__ Integer NOT NULL
) ;

CREATE TABLE Standard_caracterizeIC_InterfaceCharacteristic (
	__IDStandard__ Integer NOT NULL,
	__IDInterfaceCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE GenericActor_actors_Actor (
	__IDGenericActor__ Integer NOT NULL,
	__IDActor__ Integer NOT NULL
) ;

CREATE TABLE GenericSite_composedOf_Site (
	__IDGenericSite__ Integer NOT NULL,
	__IDSite__ Integer NOT NULL
) ;

CREATE TABLE Operation_isCoveredByS_Service (
	__IDOperation__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE TechnicalComponentReferenceFrame_composedOf_ReferenceTechnicalComponent (
	__IDTechnicalComponentReferenceFrame__ Integer NOT NULL,
	__IDReferenceTechnicalComponent__ Integer NOT NULL
) ;

CREATE TABLE GenericRole_roles_Role (
	__IDGenericRole__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE GenericCenter_centers_Center (
	__IDGenericCenter__ Integer NOT NULL,
	__IDCenter__ Integer NOT NULL
) ;

CREATE TABLE TechnicalComponent_composedOf_TechnicalComponent (
	__IDTechnicalComponent__ Integer NOT NULL,
	__IDTechnicalComponent__ Integer NOT NULL
) ;

CREATE TABLE Operation_isCoveredByP_Package (
	__IDOperation__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE ReferenceTechnicalComponent_composedOf_ReferenceTechnicalComponent (
	__IDReferenceTechnicalComponent__ Integer NOT NULL,
	__IDReferenceTechnicalComponent__ Integer NOT NULL
) ;

CREATE TABLE TechnicalComponent_interfaces_Interface (
	__IDTechnicalComponent__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;
