CREATE TABLE SystemDefinitionModel (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	FOREIGN KEY information (__FKinformation__) REFERENCES Information (__IDInformation__),
	FOREIGN KEY designData (__FKdesignData__) REFERENCES DesignData (__IDDesignData__),
	FOREIGN KEY settingDefinitions (__FKsettingDefinitions__) REFERENCES SettingDefinitions (__IDSettingDefinitions__),
	FOREIGN KEY nameSpace (__FKnameSpace__) REFERENCES NameSpace (__IDNameSpace__),
	FOREIGN KEY namespaceIdentity (__FKnamespaceIdentity__) REFERENCES NamespaceIdentity (__IDNamespaceIdentity__),
	PRIMARY KEY SystemDefinitionModel (__IDSystemDefinitionModel__),
	__FKnameSpace__ Integer,
	__FKsettingDefinitions__ Integer,
	__FKinformation__ Integer,
	__FKnamespaceIdentity__ Integer,
	__FKdesignData__ Integer
) ;

CREATE TABLE Information (
	__IDInformation__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	friendlyname text,
	companyname text,
	copyright text,
	trademark text,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	comments text,
	FOREIGN KEY compilerversion (__FKcompilerversion__) REFERENCES FourPartVersionType (__IDFourPartVersionType__),
	PRIMARY KEY Information (__IDInformation__),
	__FKcompilerversion__ Integer,
	__FKsdm__ Integer,
	__FKdescription__ Integer
) ;

CREATE TABLE Import (
	__IDImport__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	FOREIGN KEY alias (__FKalias__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY identity (__FKidentity__) REFERENCES ImportNamespaceIdentity (__IDImportNamespaceIdentity__),
	PRIMARY KEY Import (__IDImport__),
	__FKidentity__ Integer,
	__FKsdm__ Integer,
	__FKalias__ Integer
) ;

CREATE TABLE ImportNamespaceIdentity (
	__IDImportNamespaceIdentity__ Integer NOT NULL,
	FOREIGN KEY import (__FKimport__) REFERENCES Import (__IDImport__),
	PRIMARY KEY ImportNamespaceIdentity (__IDImportNamespaceIdentity__),
	__FKimport__ Integer
) ;

CREATE TABLE SDMCommunicationDefinition (
	__IDSDMCommunicationDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMCommunicationDefinition (__IDSDMCommunicationDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMContainmentDefinition (
	__IDSDMContainmentDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMContainmentDefinition (__IDSDMContainmentDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMDelegationDefinition (
	__IDSDMDelegationDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMDelegationDefinition (__IDSDMDelegationDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMReferenceDefinition (
	__IDSDMReferenceDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMReferenceDefinition (__IDSDMReferenceDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMEndpointDefinition (
	__IDSDMEndpointDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMEndpointDefinition (__IDSDMEndpointDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMResourceDefinition (
	__IDSDMResourceDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMResourceDefinition (__IDSDMResourceDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMSystemDefinition (
	__IDSDMSystemDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMSystemDefinition (__IDSDMSystemDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMConstraintDefinition (
	__IDSDMConstraintDefinition__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMConstraintDefinition (__IDSDMConstraintDefinition__),
	__FKsdm__ Integer
) ;

CREATE TABLE SDMManager (
	__IDSDMManager__ Integer NOT NULL,
	FOREIGN KEY sdm (__FKsdm__) REFERENCES SystemDefinitionModel (__IDSystemDefinitionModel__),
	PRIMARY KEY SDMManager (__IDSDMManager__),
	__FKsdm__ Integer
) ;

CREATE TABLE ManagerDeclaration (
	__IDManagerDeclaration__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	assemblyName text,
	FOREIGN KEY version (__FKversion__) REFERENCES FourPartVersionType (__IDFourPartVersionType__),
	FOREIGN KEY publicKeyToken (__FKpublicKeyToken__) REFERENCES PublicKeyTokenType (__IDPublicKeyTokenType__),
	FOREIGN KEY culture (__FKculture__) REFERENCES CultureNeutral (__IDCultureNeutral__),
	platform text,
	FOREIGN KEY sourcePath (__FKsourcePath__) REFERENCES Path (__IDPath__),
	PRIMARY KEY ManagerDeclaration (__IDManagerDeclaration__),
	__FKculture__ Integer,
	__FKdescription__ Integer,
	__FKpublicKeyToken__ Integer,
	__FKsourcePath__ Integer,
	__FKname__ Integer,
	__FKversion__ Integer
) ;

CREATE TABLE ObjectDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	layer text,
	FOREIGN KEY extends (__FKextends__) REFERENCES QualifiedName (__IDQualifiedName__),
	abstract Boolean,
	PRIMARY KEY ObjectDefinition (__IDObjectDefinition__),
	__FKextends__ Integer
) ;

CREATE TABLE OBFlow (
	__IDOBFlow__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBFlow (__IDOBFlow__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBRelationshipConstraint (
	__IDOBRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBRelationshipConstraint (__IDOBRelationshipConstraint__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBConstraint (
	__IDOBConstraint__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBConstraint (__IDOBConstraint__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBConstraintGroup (
	__IDOBConstraintGroup__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBConstraintGroup (__IDOBConstraintGroup__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBEndpointDefinition (
	__IDOBEndpointDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBEndpointDefinition (__IDOBEndpointDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBSystemDefinition (
	__IDOBSystemDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBSystemDefinition (__IDOBSystemDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBResourceDefinition (
	__IDOBResourceDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBResourceDefinition (__IDOBResourceDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBCommunicationDefinition (
	__IDOBCommunicationDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBCommunicationDefinition (__IDOBCommunicationDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBContainmentDefinition (
	__IDOBContainmentDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBContainmentDefinition (__IDOBContainmentDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBDelegationDefinition (
	__IDOBDelegationDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBDelegationDefinition (__IDOBDelegationDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBReferenceDefinition (
	__IDOBReferenceDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBReferenceDefinition (__IDOBReferenceDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBHostingDefinition (
	__IDOBHostingDefinition__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBHostingDefinition (__IDOBHostingDefinition__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBEndpoint (
	__IDOBEndpoint__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBEndpoint (__IDOBEndpoint__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBSubsystem (
	__IDOBSubsystem__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBSubsystem (__IDOBSubsystem__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBResource (
	__IDOBResource__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBResource (__IDOBResource__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBHosting (
	__IDOBHosting__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBHosting (__IDOBHosting__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBContainment (
	__IDOBContainment__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBContainment (__IDOBContainment__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBConnection (
	__IDOBConnection__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBConnection (__IDOBConnection__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBDelegation (
	__IDOBDelegation__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBDelegation (__IDOBDelegation__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE OBReference (
	__IDOBReference__ Integer NOT NULL,
	FOREIGN KEY objectDefinition (__FKobjectDefinition__) REFERENCES ObjectDefinition (__IDObjectDefinition__),
	PRIMARY KEY OBReference (__IDOBReference__),
	__FKobjectDefinition__ Integer
) ;

CREATE TABLE SystemDefinition (
	__IDSystemDefinition__ Integer NOT NULL,
	simulationRoot Boolean,
	PRIMARY KEY SystemDefinition (__IDSystemDefinition__)
) ;

CREATE TABLE EndpointDefinition (
	__IDEndpointDefinition__ Integer NOT NULL,
	PRIMARY KEY EndpointDefinition (__IDEndpointDefinition__)
) ;

CREATE TABLE ResourceDefinition (
	__IDResourceDefinition__ Integer NOT NULL,
	PRIMARY KEY ResourceDefinition (__IDResourceDefinition__)
) ;

CREATE TABLE RelationshipDefinition (
	__IDRelationshipDefinition__ Integer NOT NULL,
	FOREIGN KEY extends (__FKextends__) REFERENCES QualifiedName (__IDQualifiedName__),
	abstract Boolean,
	PRIMARY KEY RelationshipDefinition (__IDRelationshipDefinition__),
	__FKextends__ Integer
) ;

CREATE TABLE RDObjectConstraint (
	__IDRDObjectConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDObjectConstraint (__IDRDObjectConstraint__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDConstraint (
	__IDRDConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDConstraint (__IDRDConstraint__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDConstraintGroup (
	__IDRDConstraintGroup__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDConstraintGroup (__IDRDConstraintGroup__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDFlow (
	__IDRDFlow__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDFlow (__IDRDFlow__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDConnection (
	__IDRDConnection__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDConnection (__IDRDConnection__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDHosting (
	__IDRDHosting__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDHosting (__IDRDHosting__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDDelegation (
	__IDRDDelegation__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDDelegation (__IDRDDelegation__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDReference (
	__IDRDReference__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDReference (__IDRDReference__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE RDContainment (
	__IDRDContainment__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES RelationshipDefinition (__IDRelationshipDefinition__),
	PRIMARY KEY RDContainment (__IDRDContainment__),
	__FKrelationshipDefinition__ Integer
) ;

CREATE TABLE CommunicationDefinition (
	__IDCommunicationDefinition__ Integer NOT NULL,
	FOREIGN KEY clientDefinition (__FKclientDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY serverDefinition (__FKserverDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY CommunicationDefinition (__IDCommunicationDefinition__),
	__FKclientDefinition__ Integer,
	__FKserverDefinition__ Integer
) ;

CREATE TABLE HostingDefinition (
	__IDHostingDefinition__ Integer NOT NULL,
	FOREIGN KEY guestDefinition (__FKguestDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY hostDefinition (__FKhostDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	simulationRoot Boolean,
	PRIMARY KEY HostingDefinition (__IDHostingDefinition__),
	__FKguestDefinition__ Integer,
	__FKhostDefinition__ Integer
) ;

CREATE TABLE ContainmentDefinition (
	__IDContainmentDefinition__ Integer NOT NULL,
	FOREIGN KEY parentDefinition (__FKparentDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY memberDefinition (__FKmemberDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY ContainmentDefinition (__IDContainmentDefinition__),
	__FKmemberDefinition__ Integer,
	__FKparentDefinition__ Integer
) ;

CREATE TABLE DelegationDefinition (
	__IDDelegationDefinition__ Integer NOT NULL,
	FOREIGN KEY proxyDefinition (__FKproxyDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY delegateDefinition (__FKdelegateDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY DelegationDefinition (__IDDelegationDefinition__),
	__FKdelegateDefinition__ Integer,
	__FKproxyDefinition__ Integer
) ;

CREATE TABLE ReferenceDefinition (
	__IDReferenceDefinition__ Integer NOT NULL,
	FOREIGN KEY dependentDefinition (__FKdependentDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY sourceDefinition (__FKsourceDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY ReferenceDefinition (__IDReferenceDefinition__),
	__FKsourceDefinition__ Integer,
	__FKdependentDefinition__ Integer
) ;

CREATE TABLE Member (
	__IDMember__ Integer NOT NULL,
	FOREIGN KEY designData (__FKdesignData__) REFERENCES DesignData (__IDDesignData__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY definition (__FKdefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY Member (__IDMember__),
	__FKname__ Integer,
	__FKdesignData__ Integer,
	__FKdefinition__ Integer
) ;

CREATE TABLE MembSettingValue (
	__IDMembSettingValue__ Integer NOT NULL,
	FOREIGN KEY member (__FKmember__) REFERENCES Member (__IDMember__),
	PRIMARY KEY MembSettingValue (__IDMembSettingValue__),
	__FKmember__ Integer
) ;

CREATE TABLE MembSettingValueList (
	__IDMembSettingValueList__ Integer NOT NULL,
	FOREIGN KEY member (__FKmember__) REFERENCES Member (__IDMember__),
	PRIMARY KEY MembSettingValueList (__IDMembSettingValueList__),
	__FKmember__ Integer
) ;

CREATE TABLE ObjectMember (
	__IDObjectMember__ Integer NOT NULL,
	FOREIGN KEY minOccurs (__FKminOccurs__) REFERENCES MinOccurs (__IDMinOccurs__),
	FOREIGN KEY maxOccurs (__FKmaxOccurs__) REFERENCES MaxOccurs (__IDMaxOccurs__),
	reference Boolean,
	proxy Boolean,
	PRIMARY KEY ObjectMember (__IDObjectMember__),
	__FKmaxOccurs__ Integer,
	__FKminOccurs__ Integer
) ;

CREATE TABLE RelationshipMember (
	__IDRelationshipMember__ Integer NOT NULL,
	PRIMARY KEY RelationshipMember (__IDRelationshipMember__)
) ;

CREATE TABLE SystemMember (
	__IDSystemMember__ Integer NOT NULL,
	PRIMARY KEY SystemMember (__IDSystemMember__)
) ;

CREATE TABLE EndpointMember (
	__IDEndpointMember__ Integer NOT NULL,
	PRIMARY KEY EndpointMember (__IDEndpointMember__)
) ;

CREATE TABLE ResourceMember (
	__IDResourceMember__ Integer NOT NULL,
	PRIMARY KEY ResourceMember (__IDResourceMember__)
) ;

CREATE TABLE HostingMember (
	__IDHostingMember__ Integer NOT NULL,
	FOREIGN KEY guestMember (__FKguestMember__) REFERENCES Path (__IDPath__),
	FOREIGN KEY hostMember (__FKhostMember__) REFERENCES Path (__IDPath__),
	PRIMARY KEY HostingMember (__IDHostingMember__),
	__FKguestMember__ Integer,
	__FKhostMember__ Integer
) ;

CREATE TABLE CommunicationMember (
	__IDCommunicationMember__ Integer NOT NULL,
	FOREIGN KEY clientMember (__FKclientMember__) REFERENCES Path (__IDPath__),
	FOREIGN KEY serverMember (__FKserverMember__) REFERENCES Path (__IDPath__),
	PRIMARY KEY CommunicationMember (__IDCommunicationMember__),
	__FKclientMember__ Integer,
	__FKserverMember__ Integer
) ;

CREATE TABLE ContainmentMember (
	__IDContainmentMember__ Integer NOT NULL,
	FOREIGN KEY childMember (__FKchildMember__) REFERENCES Path (__IDPath__),
	PRIMARY KEY ContainmentMember (__IDContainmentMember__),
	__FKchildMember__ Integer
) ;

CREATE TABLE DelegationMember (
	__IDDelegationMember__ Integer NOT NULL,
	FOREIGN KEY proxyMember (__FKproxyMember__) REFERENCES Path (__IDPath__),
	FOREIGN KEY delegateMember (__FKdelegateMember__) REFERENCES Path (__IDPath__),
	PRIMARY KEY DelegationMember (__IDDelegationMember__),
	__FKproxyMember__ Integer,
	__FKdelegateMember__ Integer
) ;

CREATE TABLE ReferenceMember (
	__IDReferenceMember__ Integer NOT NULL,
	FOREIGN KEY dependentMember (__FKdependentMember__) REFERENCES Path (__IDPath__),
	FOREIGN KEY sourceMember (__FKsourceMember__) REFERENCES Path (__IDPath__),
	PRIMARY KEY ReferenceMember (__IDReferenceMember__),
	__FKdependentMember__ Integer,
	__FKsourceMember__ Integer
) ;

CREATE TABLE DesignData (
	__IDDesignData__ Integer NOT NULL,
	PRIMARY KEY DesignData (__IDDesignData__)
) ;

CREATE TABLE NameSpace (
	__IDNameSpace__ Integer NOT NULL,
	FOREIGN KEY designData (__FKdesignData__) REFERENCES DesignData (__IDDesignData__),
	PRIMARY KEY NameSpace (__IDNameSpace__),
	__FKdesignData__ Integer
) ;

CREATE TABLE ObjectConstraint (
	__IDObjectConstraint__ Integer NOT NULL,
	primaryRole text,
	FOREIGN KEY primaryObjectDefinition (__FKprimaryObjectDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY ObjectConstraint (__IDObjectConstraint__),
	__FKprimaryObjectDefinition__ Integer
) ;

CREATE TABLE OCConstraint (
	__IDOCConstraint__ Integer NOT NULL,
	FOREIGN KEY objectConstraint (__FKobjectConstraint__) REFERENCES ObjectConstraint (__IDObjectConstraint__),
	PRIMARY KEY OCConstraint (__IDOCConstraint__),
	__FKobjectConstraint__ Integer
) ;

CREATE TABLE OCRelationshipConstraint (
	__IDOCRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY objectConstraint_OC (__FKobjectConstraint_OC__) REFERENCES ObjectConstraint (__IDObjectConstraint__),
	PRIMARY KEY OCRelationshipConstraint (__IDOCRelationshipConstraint__),
	__FKobjectConstraint_OC__ Integer
) ;

CREATE TABLE OCConstraintGroup (
	__IDOCConstraintGroup__ Integer NOT NULL,
	FOREIGN KEY objectConstraint_OC (__FKobjectConstraint_OC__) REFERENCES ObjectConstraint (__IDObjectConstraint__),
	PRIMARY KEY OCConstraintGroup (__IDOCConstraintGroup__),
	__FKobjectConstraint_OC__ Integer
) ;

CREATE TABLE RelationshipConstraint (
	__IDRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipDefinition (__FKrelationshipDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	targetRole text,
	FOREIGN KEY targetObjectDefinition (__FKtargetObjectDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY minOccurs (__FKminOccurs__) REFERENCES MinOccurs (__IDMinOccurs__),
	FOREIGN KEY maxOccurs (__FKmaxOccurs__) REFERENCES MaxOccurs (__IDMaxOccurs__),
	delegationAware Boolean,
	PRIMARY KEY RelationshipConstraint (__IDRelationshipConstraint__),
	__FKrelationshipDefinition__ Integer,
	__FKtargetObjectDefinition__ Integer,
	__FKminOccurs__ Integer,
	__FKmaxOccurs__ Integer
) ;

CREATE TABLE RCConstraint (
	__IDRCConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipConstraint (__FKrelationshipConstraint__) REFERENCES RelationshipConstraint (__IDRelationshipConstraint__),
	PRIMARY KEY RCConstraint (__IDRCConstraint__),
	__FKrelationshipConstraint__ Integer
) ;

CREATE TABLE RCRelationshipConstraint (
	__IDRCRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipConstraint_RC (__FKrelationshipConstraint_RC__) REFERENCES RelationshipConstraint (__IDRelationshipConstraint__),
	PRIMARY KEY RCRelationshipConstraint (__IDRCRelationshipConstraint__),
	__FKrelationshipConstraint_RC__ Integer
) ;

CREATE TABLE RCObjectConstraint (
	__IDRCObjectConstraint__ Integer NOT NULL,
	FOREIGN KEY relationshipConstraint_RC (__FKrelationshipConstraint_RC__) REFERENCES RelationshipConstraint (__IDRelationshipConstraint__),
	PRIMARY KEY RCObjectConstraint (__IDRCObjectConstraint__),
	__FKrelationshipConstraint_RC__ Integer
) ;

CREATE TABLE RCConstraintGroup (
	__IDRCConstraintGroup__ Integer NOT NULL,
	FOREIGN KEY relationshipConstraint_RC (__FKrelationshipConstraint_RC__) REFERENCES RelationshipConstraint (__IDRelationshipConstraint__),
	PRIMARY KEY RCConstraintGroup (__IDRCConstraintGroup__),
	__FKrelationshipConstraint_RC__ Integer
) ;

CREATE TABLE ConstraintGroup (
	__IDConstraintGroup__ Integer NOT NULL,
	PRIMARY KEY ConstraintGroup (__IDConstraintGroup__)
) ;

CREATE TABLE CGConstraint (
	__IDCGConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintGroup (__FKconstraintGroup__) REFERENCES ConstraintGroup (__IDConstraintGroup__),
	PRIMARY KEY CGConstraint (__IDCGConstraint__),
	__FKconstraintGroup__ Integer
) ;

CREATE TABLE CGRelationshipConstraint (
	__IDCGRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintGroup_CG (__FKconstraintGroup_CG__) REFERENCES ConstraintGroup (__IDConstraintGroup__),
	PRIMARY KEY CGRelationshipConstraint (__IDCGRelationshipConstraint__),
	__FKconstraintGroup_CG__ Integer
) ;

CREATE TABLE CGObjectConstraint (
	__IDCGObjectConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintGroup_CG (__FKconstraintGroup_CG__) REFERENCES ConstraintGroup (__IDConstraintGroup__),
	PRIMARY KEY CGObjectConstraint (__IDCGObjectConstraint__),
	__FKconstraintGroup_CG__ Integer
) ;

CREATE TABLE StructuralConstraint (
	__IDStructuralConstraint__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	FOREIGN KEY designData (__FKdesignData__) REFERENCES DesignData (__IDDesignData__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	evaluate text,
	raiseError Boolean,
	returnEarly Boolean,
	PRIMARY KEY StructuralConstraint (__IDStructuralConstraint__),
	__FKdesignData__ Integer,
	__FKdescription__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE ConstraintDefinition (
	__IDConstraintDefinition__ Integer NOT NULL,
	FOREIGN KEY targetDefinition (__FKtargetDefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	returnEarly Boolean,
	PRIMARY KEY ConstraintDefinition (__IDConstraintDefinition__),
	__FKtargetDefinition__ Integer
) ;

CREATE TABLE CDRelationshipConstraint (
	__IDCDRelationshipConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintDefinition (__FKconstraintDefinition__) REFERENCES ConstraintDefinition (__IDConstraintDefinition__),
	PRIMARY KEY CDRelationshipConstraint (__IDCDRelationshipConstraint__),
	__FKconstraintDefinition__ Integer
) ;

CREATE TABLE CDConstraintGroup (
	__IDCDConstraintGroup__ Integer NOT NULL,
	FOREIGN KEY constraintDefinition (__FKconstraintDefinition__) REFERENCES ConstraintDefinition (__IDConstraintDefinition__),
	PRIMARY KEY CDConstraintGroup (__IDCDConstraintGroup__),
	__FKconstraintDefinition__ Integer
) ;

CREATE TABLE CDObjectConstraint (
	__IDCDObjectConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintDefinition (__FKconstraintDefinition__) REFERENCES ConstraintDefinition (__IDConstraintDefinition__),
	PRIMARY KEY CDObjectConstraint (__IDCDObjectConstraint__),
	__FKconstraintDefinition__ Integer
) ;

CREATE TABLE CDConstraint (
	__IDCDConstraint__ Integer NOT NULL,
	FOREIGN KEY constraintDefinition (__FKconstraintDefinition__) REFERENCES ConstraintDefinition (__IDConstraintDefinition__),
	PRIMARY KEY CDConstraint (__IDCDConstraint__),
	__FKconstraintDefinition__ Integer
) ;

CREATE TABLE ConstraintMember (
	__IDConstraintMember__ Integer NOT NULL,
	raiseError Boolean,
	evaluate text,
	PRIMARY KEY ConstraintMember (__IDConstraintMember__)
) ;

CREATE TABLE Definition (
	__IDDefinition__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	FOREIGN KEY designData (__FKdesignData__) REFERENCES DesignData (__IDDesignData__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY manager (__FKmanager__) REFERENCES QualifiedName (__IDQualifiedName__),
	className text,
	PRIMARY KEY Definition (__IDDefinition__),
	__FKmanager__ Integer,
	__FKdesignData__ Integer,
	__FKname__ Integer,
	__FKdescription__ Integer
) ;

CREATE TABLE DefSettingDeclaration (
	__IDDefSettingDeclaration__ Integer NOT NULL,
	FOREIGN KEY definition_DSD (__FKdefinition_DSD__) REFERENCES Definition (__IDDefinition__),
	PRIMARY KEY DefSettingDeclaration (__IDDefSettingDeclaration__),
	__FKdefinition_DSD__ Integer
) ;

CREATE TABLE DefSettingValue (
	__IDDefSettingValue__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Definition (__IDDefinition__),
	PRIMARY KEY DefSettingValue (__IDDefSettingValue__),
	__FKdefinition__ Integer
) ;

CREATE TABLE DefSettingValueList (
	__IDDefSettingValueList__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Definition (__IDDefinition__),
	PRIMARY KEY DefSettingValueList (__IDDefSettingValueList__),
	__FKdefinition__ Integer
) ;

CREATE TABLE SimpleName (
	__IDSimpleName__ Integer NOT NULL,
	PRIMARY KEY SimpleName (__IDSimpleName__)
) ;

CREATE TABLE QualifiedName (
	__IDQualifiedName__ Integer NOT NULL,
	PRIMARY KEY QualifiedName (__IDQualifiedName__)
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	PRIMARY KEY Path (__IDPath__)
) ;

CREATE TABLE SettingPath (
	__IDSettingPath__ Integer NOT NULL,
	PRIMARY KEY SettingPath (__IDSettingPath__)
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
	__FKculture__ Integer,
	__FKversion__ Integer,
	__FKname__ Integer,
	__FKpublicKeyToken__ Integer,
	__FKpublicKey__ Integer
) ;

CREATE TABLE FlowDefinition (
	__IDFlowDefinition__ Integer NOT NULL,
	PRIMARY KEY FlowDefinition (__IDFlowDefinition__)
) ;

CREATE TABLE FlowMember (
	__IDFlowMember__ Integer NOT NULL,
	PRIMARY KEY FlowMember (__IDFlowMember__)
) ;

CREATE TABLE ValueTransfer (
	__IDValueTransfer__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY path (__FKpath__) REFERENCES SettingPath (__IDSettingPath__),
	cast Boolean,
	"convert" Boolean,
	PRIMARY KEY ValueTransfer (__IDValueTransfer__),
	__FKpath__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	fixed Boolean,
	"replace" Boolean,
	PRIMARY KEY Output (__IDOutput__)
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	PRIMARY KEY Input (__IDInput__)
) ;

CREATE TABLE SettingDefinitions (
	__IDSettingDefinitions__ Integer NOT NULL,
	FOREIGN KEY nameSpace (__FKnameSpace__) REFERENCES NameSpace (__IDNameSpace__),
	FOREIGN KEY manager (__FKmanager__) REFERENCES QualifiedName (__IDQualifiedName__),
	clrNameSpace text,
	PRIMARY KEY SettingDefinitions (__IDSettingDefinitions__),
	__FKnameSpace__ Integer,
	__FKmanager__ Integer
) ;

CREATE TABLE SettingMember (
	__IDSettingMember__ Integer NOT NULL,
	FOREIGN KEY settingAttributes (__FKsettingAttributes__) REFERENCES SettingsAttributes (__IDSettingsAttributes__),
	PRIMARY KEY SettingMember (__IDSettingMember__),
	__FKsettingAttributes__ Integer
) ;

CREATE TABLE SettingsAttributes (
	__IDSettingsAttributes__ Integer NOT NULL,
	list Boolean,
	access text,
	secure text,
	deploymentTime Boolean,
	required Boolean,
	canBeNull Boolean,
	elementsCanBeNull Boolean,
	defaultRead text,
	defaultWrite text,
	PRIMARY KEY SettingsAttributes (__IDSettingsAttributes__)
) ;

CREATE TABLE Facet (
	__IDFacet__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY Facet (__IDFacet__),
	__FKname__ Integer
) ;

CREATE TABLE SettingValue (
	__IDSettingValue__ Integer NOT NULL,
	FOREIGN KEY settingValueAttributes (__FKsettingValueAttributes__) REFERENCES SettingValueAttributes (__IDSettingValueAttributes__),
	PRIMARY KEY SettingValue (__IDSettingValue__),
	__FKsettingValueAttributes__ Integer
) ;

CREATE TABLE SettingValueList (
	__IDSettingValueList__ Integer NOT NULL,
	FOREIGN KEY settingValueAttributes (__FKsettingValueAttributes__) REFERENCES SettingValueAttributes (__IDSettingValueAttributes__),
	PRIMARY KEY SettingValueList (__IDSettingValueList__),
	__FKsettingValueAttributes__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	"null" Boolean,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE SettingValueAttributes (
	__IDSettingValueAttributes__ Integer NOT NULL,
	FOREIGN KEY path (__FKpath__) REFERENCES SettingPath (__IDSettingPath__),
	"null" Boolean,
	fixed Boolean,
	unset Boolean,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES QualifiedName (__IDQualifiedName__),
	"convert" Boolean,
	secure Boolean,
	reference Boolean,
	PRIMARY KEY SettingValueAttributes (__IDSettingValueAttributes__),
	__FKdefinition__ Integer,
	__FKpath__ Integer
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	resourceId text,
	FOREIGN KEY manager (__FKmanager__) REFERENCES QualifiedName (__IDQualifiedName__),
	PRIMARY KEY Description (__IDDescription__),
	__FKmanager__ Integer
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	PRIMARY KEY Entry (__IDEntry__),
	__FKdescription__ Integer
) ;

CREATE TABLE DescriptionEntry (
	__IDDescriptionEntry__ Integer NOT NULL,
	name text,
	resourceId text,
	FOREIGN KEY manager (__FKmanager__) REFERENCES QualifiedName (__IDQualifiedName__),
	FOREIGN KEY substitute (__FKsubstitute__) REFERENCES Substitute (__IDSubstitute__),
	PRIMARY KEY DescriptionEntry (__IDDescriptionEntry__),
	__FKmanager__ Integer,
	__FKsubstitute__ Integer
) ;

CREATE TABLE Substitute (
	__IDSubstitute__ Integer NOT NULL,
	FOREIGN KEY descriptionEntry (__FKdescriptionEntry__) REFERENCES DescriptionEntry (__IDDescriptionEntry__),
	PRIMARY KEY Substitute (__IDSubstitute__),
	__FKdescriptionEntry__ Integer
) ;

CREATE TABLE PathList (
	__IDPathList__ Integer NOT NULL,
	PRIMARY KEY PathList (__IDPathList__)
) ;

CREATE TABLE MaxOccurs (
	__IDMaxOccurs__ Integer NOT NULL,
	PRIMARY KEY MaxOccurs (__IDMaxOccurs__)
) ;

CREATE TABLE MinOccurs (
	__IDMinOccurs__ Integer NOT NULL,
	PRIMARY KEY MinOccurs (__IDMinOccurs__)
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

CREATE TABLE CompilationHashType (
	__IDCompilationHashType__ Integer NOT NULL,
	PRIMARY KEY CompilationHashType (__IDCompilationHashType__)
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

CREATE TABLE SystemDefinitionModel_referenceDefinition_SDMReferenceDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMReferenceDefinition__ Integer NOT NULL
) ;

CREATE TABLE PathList_settingPath_SettingPath (
	__IDPathList__ Integer NOT NULL,
	__IDSettingPath__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_endpointDefinition_SDMEndpointDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMEndpointDefinition__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_communicationDefinition_SDMCommunicationDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMCommunicationDefinition__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_constraintDefinition_SDMConstraintDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMConstraintDefinition__ Integer NOT NULL
) ;

CREATE TABLE Member_settingValueList_MembSettingValueList (
	__IDMember__ Integer NOT NULL,
	__IDMembSettingValueList__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_containment_OBContainment (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBContainment__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_delegationDefinition_SDMDelegationDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMDelegationDefinition__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_import_Import (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDImport__ Integer NOT NULL
) ;

CREATE TABLE ConstraintMember_input_Input (
	__IDConstraintMember__ Integer NOT NULL,
	__IDInput__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_connection_RDConnection (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDConnection__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_hostingDefinition_OBHostingDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBHostingDefinition__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_delegation_OBDelegation (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBDelegation__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_communicationDefinition_OBCommunicationDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBCommunicationDefinition__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_referenceDefinition_OBReferenceDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBReferenceDefinition__ Integer NOT NULL
) ;

CREATE TABLE FlowMember_input_Input (
	__IDFlowMember__ Integer NOT NULL,
	__IDInput__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_containmentDefinition_OBContainmentDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBContainmentDefinition__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_constraint_OCConstraint (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDOCConstraint__ Integer NOT NULL
) ;

CREATE TABLE SettingMember_facet_Facet (
	__IDSettingMember__ Integer NOT NULL,
	__IDFacet__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_relationshipConstraint_OCRelationshipConstraint (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDOCRelationshipConstraint__ Integer NOT NULL
) ;

CREATE TABLE Description_entry_Entry (
	__IDDescription__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_manager_SDMManager (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMManager__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_subsystem_OBSubsystem (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBSubsystem__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_systemDefinition_SDMSystemDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMSystemDefinition__ Integer NOT NULL
) ;

CREATE TABLE ConstraintGroup_relationshipConstraint_CGRelationshipConstraint (
	__IDConstraintGroup__ Integer NOT NULL,
	__IDCGRelationshipConstraint__ Integer NOT NULL
) ;

CREATE TABLE SettingValueList_value_Value (
	__IDSettingValueList__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE DesignData_nameSpace_NameSpace (
	__IDDesignData__ Integer NOT NULL,
	__IDNameSpace__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_endpointDefinition_OBEndpointDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBEndpointDefinition__ Integer NOT NULL
) ;

CREATE TABLE Definition_settingValueList_DefSettingValueList (
	__IDDefinition__ Integer NOT NULL,
	__IDDefSettingValueList__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_constraint_RDConstraint (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDConstraint__ Integer NOT NULL
) ;

CREATE TABLE ConstraintDefinition_relationshipConstraint_CDRelationshipConstraint (
	__IDConstraintDefinition__ Integer NOT NULL,
	__IDCDRelationshipConstraint__ Integer NOT NULL
) ;

CREATE TABLE Definition_settingValue_DefSettingValue (
	__IDDefinition__ Integer NOT NULL,
	__IDDefSettingValue__ Integer NOT NULL
) ;

CREATE TABLE ConstraintDefinition_constraint_CDConstraint (
	__IDConstraintDefinition__ Integer NOT NULL,
	__IDCDConstraint__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_secondaryObjectDefinition_QualifiedName (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDQualifiedName__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_resource_OBResource (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBResource__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_hosting_OBHosting (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBHosting__ Integer NOT NULL
) ;

CREATE TABLE ConstraintDefinition_constraintGroup_CDConstraintGroup (
	__IDConstraintDefinition__ Integer NOT NULL,
	__IDCDConstraintGroup__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_constraintGroup_OCConstraintGroup (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDOCConstraintGroup__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_documentLanguage_Culture (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDCulture__ Integer NOT NULL
) ;

CREATE TABLE RelationshipConstraint_constraintGroup_RCConstraintGroup (
	__IDRelationshipConstraint__ Integer NOT NULL,
	__IDRCConstraintGroup__ Integer NOT NULL
) ;

CREATE TABLE FlowMember_output_Output (
	__IDFlowMember__ Integer NOT NULL,
	__IDOutput__ Integer NOT NULL
) ;

CREATE TABLE Definition_settingDeclaration_DefSettingDeclaration (
	__IDDefinition__ Integer NOT NULL,
	__IDDefSettingDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_flow_OBFlow (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBFlow__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_constraintGroup_OBConstraintGroup (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBConstraintGroup__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_flow_RDFlow (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDFlow__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_constraintGroup_RDConstraintGroup (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDConstraintGroup__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_delegation_RDDelegation (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDDelegation__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_endpoint_OBEndpoint (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBEndpoint__ Integer NOT NULL
) ;

CREATE TABLE RelationshipConstraint_objectConstraint_RCObjectConstraint (
	__IDRelationshipConstraint__ Integer NOT NULL,
	__IDRCObjectConstraint__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_compilationHash_CompilationHashType (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDCompilationHashType__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_minOccurs_MinOccurs (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDMinOccurs__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_delegationDefinition_OBDelegationDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBDelegationDefinition__ Integer NOT NULL
) ;

CREATE TABLE ConstraintDefinition_objectConstraint_CDObjectConstraint (
	__IDConstraintDefinition__ Integer NOT NULL,
	__IDCDObjectConstraint__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_constraint_OBConstraint (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBConstraint__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_resourceDefinition_SDMResourceDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMResourceDefinition__ Integer NOT NULL
) ;

CREATE TABLE ConstraintGroup_constraint_CGConstraint (
	__IDConstraintGroup__ Integer NOT NULL,
	__IDCGConstraint__ Integer NOT NULL
) ;

CREATE TABLE SystemDefinitionModel_containmentDefinition_SDMContainmentDefinition (
	__IDSystemDefinitionModel__ Integer NOT NULL,
	__IDSDMContainmentDefinition__ Integer NOT NULL
) ;

CREATE TABLE RelationshipConstraint_relationshipConstraint_RCRelationshipConstraint (
	__IDRelationshipConstraint__ Integer NOT NULL,
	__IDRCRelationshipConstraint__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_hosting_RDHosting (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDHosting__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_obreference_OBReference (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBReference__ Integer NOT NULL
) ;

CREATE TABLE ObjectConstraint_maxOccurs_MaxOccurs (
	__IDObjectConstraint__ Integer NOT NULL,
	__IDMaxOccurs__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_relationshipConstraint_OBRelationshipConstraint (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBRelationshipConstraint__ Integer NOT NULL
) ;

CREATE TABLE ConstraintGroup_objectConstraint_CGObjectConstraint (
	__IDConstraintGroup__ Integer NOT NULL,
	__IDCGObjectConstraint__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_objectConstraint_RDObjectConstraint (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDObjectConstraint__ Integer NOT NULL
) ;

CREATE TABLE Member_description_Description (
	__IDMember__ Integer NOT NULL,
	__IDDescription__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_resourceDefinition_OBResourceDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBResourceDefinition__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_connection_OBConnection (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBConnection__ Integer NOT NULL
) ;

CREATE TABLE Member_settingValue_MembSettingValue (
	__IDMember__ Integer NOT NULL,
	__IDMembSettingValue__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_reference_RDReference (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDReference__ Integer NOT NULL
) ;

CREATE TABLE RelationshipDefinition_containment_RDContainment (
	__IDRelationshipDefinition__ Integer NOT NULL,
	__IDRDContainment__ Integer NOT NULL
) ;

CREATE TABLE RelationshipConstraint_constraint_RCConstraint (
	__IDRelationshipConstraint__ Integer NOT NULL,
	__IDRCConstraint__ Integer NOT NULL
) ;

CREATE TABLE ObjectDefinition_systemDefinition_OBSystemDefinition (
	__IDObjectDefinition__ Integer NOT NULL,
	__IDOBSystemDefinition__ Integer NOT NULL
) ;
