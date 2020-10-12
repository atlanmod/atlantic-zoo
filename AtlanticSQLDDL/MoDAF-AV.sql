CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	content text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE MoDAFModel (
	__IDMoDAFModel__ Integer NOT NULL,
	FOREIGN KEY enterprise (__FKenterprise__) REFERENCES Enterprise (__IDEnterprise__),
	FOREIGN KEY environment (__FKenvironment__) REFERENCES Environment (__IDEnvironment__),
	PRIMARY KEY MoDAFModel (__IDMoDAFModel__),
	__FKenvironment__ Integer,
	__FKenterprise__ Integer
) ;

CREATE TABLE Enterprise (
	__IDEnterprise__ Integer NOT NULL,
	FOREIGN KEY inhabits (__FKinhabits__) REFERENCES Environment (__IDEnvironment__),
	PRIMARY KEY Enterprise (__IDEnterprise__),
	__FKinhabits__ Integer
) ;

CREATE TABLE Environment (
	__IDEnvironment__ Integer NOT NULL,
	FOREIGN KEY influences (__FKinfluences__) REFERENCES Enterprise (__IDEnterprise__),
	PRIMARY KEY Environment (__IDEnvironment__),
	__FKinfluences__ Integer
) ;

CREATE TABLE OperationalMission (
	__IDOperationalMission__ Integer NOT NULL,
	PRIMARY KEY OperationalMission (__IDOperationalMission__)
) ;

CREATE TABLE Architecture (
	__IDArchitecture__ Integer NOT NULL,
	FOREIGN KEY enterprise (__FKenterprise__) REFERENCES Enterprise (__IDEnterprise__),
	FOREIGN KEY describedBy (__FKdescribedBy__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY Architecture (__IDArchitecture__),
	__FKenterprise__ Integer,
	__FKdescribedBy__ Integer
) ;

CREATE TABLE ArchitecturalDescription (
	__IDArchitecturalDescription__ Integer NOT NULL,
	approvialAuthority text,
	architect text,
	assumptionAndConstraints text,
	creatingOrganisation text,
	dateCompleted text,
	purpose text,
	recommendations text,
	summaryOfFindings text,
	tollsUsed text,
	FOREIGN KEY taxonomy (__FKtaxonomy__) REFERENCES Taxonomy (__IDTaxonomy__),
	PRIMARY KEY ArchitecturalDescription (__IDArchitecturalDescription__),
	__FKtaxonomy__ Integer
) ;

CREATE TABLE ArchitecturalReference (
	__IDArchitecturalReference__ Integer NOT NULL,
	FOREIGN KEY referred (__FKreferred__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	FOREIGN KEY referrer (__FKreferrer__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY ArchitecturalReference (__IDArchitecturalReference__),
	__FKreferred__ Integer,
	__FKreferrer__ Integer
) ;

CREATE TABLE ArchitecturalProduct (
	__IDArchitecturalProduct__ Integer NOT NULL,
	description text,
	FOREIGN KEY definingView (__FKdefiningView__) REFERENCES View (__IDView__),
	PRIMARY KEY ArchitecturalProduct (__IDArchitecturalProduct__),
	__FKdefiningView__ Integer
) ;

CREATE TABLE Elements (
	__IDElements__ Integer NOT NULL,
	PRIMARY KEY Elements (__IDElements__)
) ;

CREATE TABLE ArchitecturalFramework (
	__IDArchitecturalFramework__ Integer NOT NULL,
	PRIMARY KEY ArchitecturalFramework (__IDArchitecturalFramework__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	framework text,
	frameworkWebsite text,
	viewCode text,
	viewDescription text,
	viewName text,
	FOREIGN KEY definingFramework (__FKdefiningFramework__) REFERENCES ArchitecturalFramework (__IDArchitecturalFramework__),
	PRIMARY KEY View (__IDView__),
	__FKdefiningFramework__ Integer
) ;

CREATE TABLE Concern (
	__IDConcern__ Integer NOT NULL,
	PRIMARY KEY Concern (__IDConcern__)
) ;

CREATE TABLE StakeholderHasConcern (
	__IDStakeholderHasConcern__ Integer NOT NULL,
	FOREIGN KEY client (__FKclient__) REFERENCES Stakeholder (__IDStakeholder__),
	FOREIGN KEY supplier (__FKsupplier__) REFERENCES Concern (__IDConcern__),
	FOREIGN KEY owner (__FKowner__) REFERENCES MoDAFModel (__IDMoDAFModel__),
	PRIMARY KEY StakeholderHasConcern (__IDStakeholderHasConcern__),
	__FKowner__ Integer,
	__FKclient__ Integer,
	__FKsupplier__ Integer
) ;

CREATE TABLE Stakeholder (
	__IDStakeholder__ Integer NOT NULL,
	PRIMARY KEY Stakeholder (__IDStakeholder__)
) ;

CREATE TABLE MetaData (
	__IDMetaData__ Integer NOT NULL,
	dublinCoreElement text,
	modMetaDataElement text,
	name text,
	body text,
	PRIMARY KEY MetaData (__IDMetaData__)
) ;

CREATE TABLE ArchitectureMetaData (
	__IDArchitectureMetaData__ Integer NOT NULL,
	FOREIGN KEY annotatedArchitecture (__FKannotatedArchitecture__) REFERENCES ArchitecturalDescription (__IDArchitecturalDescription__),
	PRIMARY KEY ArchitectureMetaData (__IDArchitectureMetaData__),
	__FKannotatedArchitecture__ Integer
) ;

CREATE TABLE Taxonomy (
	__IDTaxonomy__ Integer NOT NULL,
	date text,
	url text,
	version text,
	PRIMARY KEY Taxonomy (__IDTaxonomy__)
) ;

CREATE TABLE ClassifiedElement (
	__IDClassifiedElement__ Integer NOT NULL,
	FOREIGN KEY taxonomy (__FKtaxonomy__) REFERENCES Taxonomy (__IDTaxonomy__),
	PRIMARY KEY ClassifiedElement (__IDClassifiedElement__),
	__FKtaxonomy__ Integer
) ;

CREATE TABLE Standard (
	__IDStandard__ Integer NOT NULL,
	identifier text,
	publishedWebsite text,
	publisher text,
	FOREIGN KEY ratificationDate (__FKratificationDate__) REFERENCES TimeExpression (__IDTimeExpression__),
	version text,
	FOREIGN KEY withdrawalDate (__FKwithdrawalDate__) REFERENCES TimeExpression (__IDTimeExpression__),
	PRIMARY KEY Standard (__IDStandard__),
	__FKratificationDate__ Integer,
	__FKwithdrawalDate__ Integer
) ;

CREATE TABLE MeasurableProperty (
	__IDMeasurableProperty__ Integer NOT NULL,
	FOREIGN KEY maxValue (__FKmaxValue__) REFERENCES LiteralSpecification (__IDLiteralSpecification__),
	FOREIGN KEY minValue (__FKminValue__) REFERENCES LiteralSpecification (__IDLiteralSpecification__),
	PRIMARY KEY MeasurableProperty (__IDMeasurableProperty__),
	__FKminValue__ Integer,
	__FKmaxValue__ Integer
) ;

CREATE TABLE CapabilityRequirement (
	__IDCapabilityRequirement__ Integer NOT NULL,
	PRIMARY KEY CapabilityRequirement (__IDCapabilityRequirement__)
) ;

CREATE TABLE Effect (
	__IDEffect__ Integer NOT NULL,
	PRIMARY KEY Effect (__IDEffect__)
) ;

CREATE TABLE EnduringTask (
	__IDEnduringTask__ Integer NOT NULL,
	PRIMARY KEY EnduringTask (__IDEnduringTask__)
) ;

CREATE TABLE OperationalConstraint (
	__IDOperationalConstraint__ Integer NOT NULL,
	FOREIGN KEY nodeUsageContext (__FKnodeUsageContext__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY OperationalConstraint (__IDOperationalConstraint__),
	__FKnodeUsageContext__ Integer
) ;

CREATE TABLE PostType (
	__IDPostType__ Integer NOT NULL,
	PRIMARY KEY PostType (__IDPostType__)
) ;

CREATE TABLE OrganisationType (
	__IDOrganisationType__ Integer NOT NULL,
	PRIMARY KEY OrganisationType (__IDOrganisationType__)
) ;

CREATE TABLE RoleInOrganisation (
	__IDRoleInOrganisation__ Integer NOT NULL,
	PRIMARY KEY RoleInOrganisation (__IDRoleInOrganisation__)
) ;

CREATE TABLE LocationType (
	__IDLocationType__ Integer NOT NULL,
	PRIMARY KEY LocationType (__IDLocationType__)
) ;

CREATE TABLE OperationalActivity (
	__IDOperationalActivity__ Integer NOT NULL,
	PRIMARY KEY OperationalActivity (__IDOperationalActivity__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE InformationExchange (
	__IDInformationExchange__ Integer NOT NULL,
	identifier text,
	requirementText text,
	PRIMARY KEY InformationExchange (__IDInformationExchange__)
) ;

CREATE TABLE Competence (
	__IDCompetence__ Integer NOT NULL,
	PRIMARY KEY Competence (__IDCompetence__)
) ;

CREATE TABLE InformationElement (
	__IDInformationElement__ Integer NOT NULL,
	PRIMARY KEY InformationElement (__IDInformationElement__)
) ;

CREATE TABLE NodeConnectionType (
	__IDNodeConnectionType__ Integer NOT NULL,
	PRIMARY KEY NodeConnectionType (__IDNodeConnectionType__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE DataElement (
	__IDDataElement__ Integer NOT NULL,
	PRIMARY KEY DataElement (__IDDataElement__)
) ;

CREATE TABLE SystemFunction (
	__IDSystemFunction__ Integer NOT NULL,
	FOREIGN KEY systemUsageContext (__FKsystemUsageContext__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY SystemFunction (__IDSystemFunction__),
	__FKsystemUsageContext__ Integer
) ;

CREATE TABLE SystemConnectionSpecification (
	__IDSystemConnectionSpecification__ Integer NOT NULL,
	PRIMARY KEY SystemConnectionSpecification (__IDSystemConnectionSpecification__)
) ;

CREATE TABLE ProjectType (
	__IDProjectType__ Integer NOT NULL,
	PRIMARY KEY ProjectType (__IDProjectType__)
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Unit (
	__IDUnit__ Integer NOT NULL,
	PRIMARY KEY Unit (__IDUnit__)
) ;

CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	PRIMARY KEY Dimension (__IDDimension__)
) ;

CREATE TABLE OrganisationProjectRelationship (
	__IDOrganisationProjectRelationship__ Integer NOT NULL,
	PRIMARY KEY OrganisationProjectRelationship (__IDOrganisationProjectRelationship__)
) ;

CREATE TABLE ProjectThreadType (
	__IDProjectThreadType__ Integer NOT NULL,
	PRIMARY KEY ProjectThreadType (__IDProjectThreadType__)
) ;

CREATE TABLE TimeExpression (
	__IDTimeExpression__ Integer NOT NULL,
	value text,
	PRIMARY KEY TimeExpression (__IDTimeExpression__)
) ;

CREATE TABLE LiteralSpecification (
	__IDLiteralSpecification__ Integer NOT NULL,
	value text,
	PRIMARY KEY LiteralSpecification (__IDLiteralSpecification__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	value text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE Taxonomy_contents_ClassifiedElement (
	__IDTaxonomy__ Integer NOT NULL,
	__IDClassifiedElement__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalProduct_addresses_Concern (
	__IDArchitecturalProduct__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_architectureMetadatas_ArchitectureMetaData (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDArchitectureMetaData__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_stakeholderHasConcerns_StakeholderHasConcern (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDStakeholderHasConcern__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_metaDatas_MetaData (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDMetaData__ Integer NOT NULL
) ;

CREATE TABLE View_usedToCover_Concern (
	__IDView__ Integer NOT NULL,
	__IDConcern__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_architecturalDescription_ArchitecturalDescription (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDArchitecturalDescription__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_stakeholders_Stakeholder (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDStakeholder__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_architecturalReferences_ArchitecturalReference (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDArchitecturalReference__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_architecturalFrameworks_ArchitecturalFramework (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDArchitecturalFramework__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_operationalMissions_OperationalMission (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDOperationalMission__ Integer NOT NULL
) ;

CREATE TABLE Concern_adressedBy_ArchitecturalProduct (
	__IDConcern__ Integer NOT NULL,
	__IDArchitecturalProduct__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_viewpoints_View (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDView__ Integer NOT NULL
) ;

CREATE TABLE MoDAFModel_architectures_Architecture (
	__IDMoDAFModel__ Integer NOT NULL,
	__IDArchitecture__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalDescription_products_ArchitecturalProduct (
	__IDArchitecturalDescription__ Integer NOT NULL,
	__IDArchitecturalProduct__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalFramework_ownedMember_View (
	__IDArchitecturalFramework__ Integer NOT NULL,
	__IDView__ Integer NOT NULL
) ;

CREATE TABLE ArchitecturalProduct_architecturalElements_Elements (
	__IDArchitecturalProduct__ Integer NOT NULL,
	__IDElements__ Integer NOT NULL
) ;

CREATE TABLE Enterprise_fulfills_OperationalMission (
	__IDEnterprise__ Integer NOT NULL,
	__IDOperationalMission__ Integer NOT NULL
) ;
