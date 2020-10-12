CREATE TABLE DeploymentReport (
	__IDDeploymentReport__ Integer NOT NULL,
	FOREIGN KEY applications (__FKapplications__) REFERENCES Applications (__IDApplications__),
	FOREIGN KEY binding (__FKbinding__) REFERENCES Binding (__IDBinding__),
	FOREIGN KEY logicalServers (__FKlogicalServers__) REFERENCES LogicalServers (__IDLogicalServers__),
	FOREIGN KEY errors (__FKerrors__) REFERENCES ErrorCollection (__IDErrorCollection__),
	PRIMARY KEY DeploymentReport (__IDDeploymentReport__),
	__FKerrors__ Integer,
	__FKbinding__ Integer,
	__FKlogicalServers__ Integer,
	__FKapplications__ Integer
) ;

CREATE TABLE DeploymentImport (
	__IDDeploymentImport__ Integer NOT NULL,
	FOREIGN KEY alias (__FKalias__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY identity (__FKidentity__) REFERENCES ImportNamespaceIdentity (__IDImportNamespaceIdentity__),
	PRIMARY KEY DeploymentImport (__IDDeploymentImport__),
	__FKalias__ Integer,
	__FKidentity__ Integer
) ;

CREATE TABLE ImportNamespaceIdentity (
	__IDImportNamespaceIdentity__ Integer NOT NULL,
	FOREIGN KEY import (__FKimport__) REFERENCES DeploymentImport (__IDDeploymentImport__),
	PRIMARY KEY ImportNamespaceIdentity (__IDImportNamespaceIdentity__),
	__FKimport__ Integer
) ;

CREATE TABLE NamespaceIdentity (
	__IDNamespaceIdentity__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Path (__IDPath__),
	FOREIGN KEY version (__FKversion__) REFERENCES FourPartVersionType (__IDFourPartVersionType__),
	FOREIGN KEY publicKey (__FKpublicKey__) REFERENCES PublicKeyType (__IDPublicKeyType__),
	FOREIGN KEY publicKeyToken (__FKpublicKeyToken__) REFERENCES PublicKeyTokenType (__IDPublicKeyTokenType__),
	FOREIGN KEY culture (__FKculture__) REFERENCES CultureNeutral (__IDCultureNeutral__),
	platform text,
	PRIMARY KEY NamespaceIdentity (__IDNamespaceIdentity__),
	__FKversion__ Integer,
	__FKpublicKeyToken__ Integer,
	__FKculture__ Integer,
	__FKpublicKey__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE Applications (
	__IDApplications__ Integer NOT NULL,
	PRIMARY KEY Applications (__IDApplications__)
) ;

CREATE TABLE LogicalServers (
	__IDLogicalServers__ Integer NOT NULL,
	PRIMARY KEY LogicalServers (__IDLogicalServers__)
) ;

CREATE TABLE OuterSystem (
	__IDOuterSystem__ Integer NOT NULL,
	name text,
	PRIMARY KEY OuterSystem (__IDOuterSystem__)
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	PRIMARY KEY Binding (__IDBinding__)
) ;

CREATE TABLE Zone (
	__IDZone__ Integer NOT NULL,
	name text,
	PRIMARY KEY Zone (__IDZone__)
) ;

CREATE TABLE ReportObject (
	__IDReportObject__ Integer NOT NULL,
	name text,
	definition text,
	extends text,
	FOREIGN KEY instanceId (__FKinstanceId__) REFERENCES Guid (__IDGuid__),
	hostedOn text,
	PRIMARY KEY ReportObject (__IDReportObject__),
	__FKinstanceId__ Integer
) ;

CREATE TABLE SequenceReport (
	__IDSequenceReport__ Integer NOT NULL,
	FOREIGN KEY report (__FKreport__) REFERENCES ReportObject (__IDReportObject__),
	FOREIGN KEY setting (__FKsetting__) REFERENCES Setting (__IDSetting__),
	PRIMARY KEY SequenceReport (__IDSequenceReport__),
	__FKsetting__ Integer,
	__FKreport__ Integer
) ;

CREATE TABLE BoundLogicalServer (
	__IDBoundLogicalServer__ Integer NOT NULL,
	name text,
	definition text,
	extends text,
	PRIMARY KEY BoundLogicalServer (__IDBoundLogicalServer__)
) ;

CREATE TABLE LogicalServer (
	__IDLogicalServer__ Integer NOT NULL,
	PRIMARY KEY LogicalServer (__IDLogicalServer__)
) ;

CREATE TABLE Application (
	__IDApplication__ Integer NOT NULL,
	PRIMARY KEY Application (__IDApplication__)
) ;

CREATE TABLE ReportSystem (
	__IDReportSystem__ Integer NOT NULL,
	PRIMARY KEY ReportSystem (__IDReportSystem__)
) ;

CREATE TABLE ReportResource (
	__IDReportResource__ Integer NOT NULL,
	PRIMARY KEY ReportResource (__IDReportResource__)
) ;

CREATE TABLE ReportEndpoint (
	__IDReportEndpoint__ Integer NOT NULL,
	PRIMARY KEY ReportEndpoint (__IDReportEndpoint__)
) ;

CREATE TABLE Setting (
	__IDSetting__ Integer NOT NULL,
	FOREIGN KEY settingAttributes (__FKsettingAttributes__) REFERENCES SettingAttributes (__IDSettingAttributes__),
	PRIMARY KEY Setting (__IDSetting__),
	__FKsettingAttributes__ Integer
) ;

CREATE TABLE SettingFacet (
	__IDSettingFacet__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES SettingInstanceValue (__IDSettingInstanceValue__),
	FOREIGN KEY settingAttributes (__FKsettingAttributes__) REFERENCES SettingAttributes (__IDSettingAttributes__),
	PRIMARY KEY SettingFacet (__IDSettingFacet__),
	__FKsettingAttributes__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE SettingInstanceValue (
	__IDSettingInstanceValue__ Integer NOT NULL,
	"null" Boolean,
	PRIMARY KEY SettingInstanceValue (__IDSettingInstanceValue__)
) ;

CREATE TABLE SettingAttributes (
	__IDSettingAttributes__ Integer NOT NULL,
	name text,
	definition text,
	state text,
	fixed Boolean,
	list Boolean,
	"null" Boolean,
	secure Boolean,
	failedToSerialize Boolean,
	PRIMARY KEY SettingAttributes (__IDSettingAttributes__)
) ;

CREATE TABLE SettingValue (
	__IDSettingValue__ Integer NOT NULL,
	"Null" Boolean,
	Secure Boolean,
	PRIMARY KEY SettingValue (__IDSettingValue__)
) ;

CREATE TABLE ErrorCollection (
	__IDErrorCollection__ Integer NOT NULL,
	PRIMARY KEY ErrorCollection (__IDErrorCollection__)
) ;

CREATE TABLE DocumentError (
	__IDDocumentError__ Integer NOT NULL,
	Code Integer,
	Level Integer,
	File text,
	PRIMARY KEY DocumentError (__IDDocumentError__)
) ;

CREATE TABLE DocumentResolutionError (
	__IDDocumentResolutionError__ Integer NOT NULL,
	Statement text,
	PRIMARY KEY DocumentResolutionError (__IDDocumentResolutionError__)
) ;

CREATE TABLE DocumentConstraintError (
	__IDDocumentConstraintError__ Integer NOT NULL,
	constraintMember text,
	constraintDefinition text,
	targetInstancePath text,
	ownerInstancePath text,
	constraintErrorCode text,
	constraintErrorMessage text,
	PRIMARY KEY DocumentConstraintError (__IDDocumentConstraintError__)
) ;

CREATE TABLE FailedInput (
	__IDFailedInput__ Integer NOT NULL,
	PRIMARY KEY FailedInput (__IDFailedInput__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Guid (
	__IDGuid__ Integer NOT NULL,
	PRIMARY KEY Guid (__IDGuid__)
) ;

CREATE TABLE SimpleName (
	__IDSimpleName__ Integer NOT NULL,
	PRIMARY KEY SimpleName (__IDSimpleName__)
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	PRIMARY KEY Path (__IDPath__)
) ;

CREATE TABLE FourPartVersionType (
	__IDFourPartVersionType__ Integer NOT NULL,
	PRIMARY KEY FourPartVersionType (__IDFourPartVersionType__)
) ;

CREATE TABLE PublicKeyType (
	__IDPublicKeyType__ Integer NOT NULL,
	PRIMARY KEY PublicKeyType (__IDPublicKeyType__)
) ;

CREATE TABLE PublicKeyTokenType (
	__IDPublicKeyTokenType__ Integer NOT NULL,
	PRIMARY KEY PublicKeyTokenType (__IDPublicKeyTokenType__)
) ;

CREATE TABLE Culture (
	__IDCulture__ Integer NOT NULL,
	PRIMARY KEY Culture (__IDCulture__)
) ;

CREATE TABLE CultureNeutral (
	__IDCultureNeutral__ Integer NOT NULL,
	PRIMARY KEY CultureNeutral (__IDCultureNeutral__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	value text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE SequenceReport_system_ReportSystem (
	__IDSequenceReport__ Integer NOT NULL,
	__IDReportSystem__ Integer NOT NULL
) ;

CREATE TABLE Zone_zone_Zone (
	__IDZone__ Integer NOT NULL,
	__IDZone__ Integer NOT NULL
) ;

CREATE TABLE LogicalServers_logicalServer_LogicalServer (
	__IDLogicalServers__ Integer NOT NULL,
	__IDLogicalServer__ Integer NOT NULL
) ;

CREATE TABLE OuterSystem_application_Application (
	__IDOuterSystem__ Integer NOT NULL,
	__IDApplication__ Integer NOT NULL
) ;

CREATE TABLE ErrorCollection_documentConstraintError_DocumentConstraintError (
	__IDErrorCollection__ Integer NOT NULL,
	__IDDocumentConstraintError__ Integer NOT NULL
) ;

CREATE TABLE BoundLogicalServer_setting_Setting (
	__IDBoundLogicalServer__ Integer NOT NULL,
	__IDSetting__ Integer NOT NULL
) ;

CREATE TABLE SequenceReport_resource_ReportResource (
	__IDSequenceReport__ Integer NOT NULL,
	__IDReportResource__ Integer NOT NULL
) ;

CREATE TABLE SequenceReport_endpoint_ReportEndpoint (
	__IDSequenceReport__ Integer NOT NULL,
	__IDReportEndpoint__ Integer NOT NULL
) ;

CREATE TABLE ReportObject_sequence_SequenceReport (
	__IDReportObject__ Integer NOT NULL,
	__IDSequenceReport__ Integer NOT NULL
) ;

CREATE TABLE OuterSystem_system_OuterSystem (
	__IDOuterSystem__ Integer NOT NULL,
	__IDOuterSystem__ Integer NOT NULL
) ;

CREATE TABLE Applications_system_OuterSystem (
	__IDApplications__ Integer NOT NULL,
	__IDOuterSystem__ Integer NOT NULL
) ;

CREATE TABLE Setting_facet_SettingFacet (
	__IDSetting__ Integer NOT NULL,
	__IDSettingFacet__ Integer NOT NULL
) ;

CREATE TABLE DocumentConstraintError_failedInput_FailedInput (
	__IDDocumentConstraintError__ Integer NOT NULL,
	__IDFailedInput__ Integer NOT NULL
) ;

CREATE TABLE Zone_logicalServer_LogicalServer (
	__IDZone__ Integer NOT NULL,
	__IDLogicalServer__ Integer NOT NULL
) ;

CREATE TABLE Binding_zone_Zone (
	__IDBinding__ Integer NOT NULL,
	__IDZone__ Integer NOT NULL
) ;

CREATE TABLE Applications_application_Application (
	__IDApplications__ Integer NOT NULL,
	__IDApplication__ Integer NOT NULL
) ;

CREATE TABLE LogicalServers_zone_Zone (
	__IDLogicalServers__ Integer NOT NULL,
	__IDZone__ Integer NOT NULL
) ;

CREATE TABLE DeploymentReport_import_DeploymentImport (
	__IDDeploymentReport__ Integer NOT NULL,
	__IDDeploymentImport__ Integer NOT NULL
) ;

CREATE TABLE ErrorCollection_documentResolutionError_DocumentResolutionError (
	__IDErrorCollection__ Integer NOT NULL,
	__IDDocumentResolutionError__ Integer NOT NULL
) ;

CREATE TABLE Binding_boundLogicalServer_BoundLogicalServer (
	__IDBinding__ Integer NOT NULL,
	__IDBoundLogicalServer__ Integer NOT NULL
) ;

CREATE TABLE Zone_boundLogicalServer_BoundLogicalServer (
	__IDZone__ Integer NOT NULL,
	__IDBoundLogicalServer__ Integer NOT NULL
) ;

CREATE TABLE BoundLogicalServer_application_Application (
	__IDBoundLogicalServer__ Integer NOT NULL,
	__IDApplication__ Integer NOT NULL
) ;

CREATE TABLE ErrorCollection_documentError_DocumentError (
	__IDErrorCollection__ Integer NOT NULL,
	__IDDocumentError__ Integer NOT NULL
) ;

CREATE TABLE Setting_value_SettingInstanceValue (
	__IDSetting__ Integer NOT NULL,
	__IDSettingInstanceValue__ Integer NOT NULL
) ;

CREATE TABLE DocumentError_description_Description (
	__IDDocumentError__ Integer NOT NULL,
	__IDDescription__ Integer NOT NULL
) ;
