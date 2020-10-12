module SDM {

	type SystemDefinitionModel {
		Information_ContRef : Information?;
		Import_ContRef : Import*;
		DesignData_Ref : DesignData?;
		SettingDefinitions_Ref : SettingDefinitions?;
		CommunicationDefinition_ContRef : SDMCommunicationDefinition*;
		ContainmentDefinition_ContRef : SDMContainmentDefinition*;
		DelegationDefinition_ContRef : SDMDelegationDefinition*;
		ReferenceDefinition_ContRef : SDMReferenceDefinition*;
		EndpointDefinition_ContRef : SDMEndpointDefinition*;
		ResourceDefinition_ContRef : SDMResourceDefinition*;
		SystemDefinition_ContRef : SDMSystemDefinition*;
		ConstraintDefinition_ContRef : SDMConstraintDefinition*;
		Manager_ContRef : SDMManager*;
		NameSpace_Ref : NameSpace?;
		NamespaceIdentity_Ref : NamespaceIdentity;
		DocumentLanguage_Ref : Culture*;
		CompilationHash_Ref : CompilationHashType*;
	};

	type Information {
		Sdm_Ref : SystemDefinitionModel;
		Friendlyname_Att : Text;
		Companyname_Att : Text;
		Copyright_Att : Text;
		Trademark_Att : Text;
		Description_Ref : Description?;
		Comments_Att : Text;
		Compilerversion_Ref : FourPartVersionType?;
	};

	type Import {
		Sdm_Ref : SystemDefinitionModel;
		Alias_Ref : SimpleName;
		Identity_ContRef : ImportNamespaceIdentity;
	};

	type ImportNamespaceIdentity : NamespaceIdentity {
		Import_Ref : Import;
	};

	type SDMCommunicationDefinition : CommunicationDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMContainmentDefinition : ContainmentDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMDelegationDefinition : DelegationDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMReferenceDefinition : ReferenceDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMEndpointDefinition : EndpointDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMResourceDefinition : ResourceDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMSystemDefinition : SystemDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMConstraintDefinition : ConstraintDefinition {
		Sdm_Ref : SystemDefinitionModel;
	};

	type SDMManager : ManagerDeclaration {
		Sdm_Ref : SystemDefinitionModel;
	};

	type ManagerDeclaration {
		Description_Ref : Description?;
		Name_Ref : SimpleName?;
		AssemblyName_Att : Text;
		Version_Ref : FourPartVersionType?;
		PublicKeyToken_Ref : PublicKeyTokenType?;
		Culture_Ref : CultureNeutral?;
		Platform_Att : Platform?;
		SourcePath_Ref : Path?;
	};

	type ObjectDefinition : Definition {
		Flow_ContRef : OBFlow*;
		RelationshipConstraint_ContRef : OBRelationshipConstraint*;
		Constraint_ContRef : OBConstraint*;
		ConstraintGroup_ContRef : OBConstraintGroup*;
		EndpointDefinition_ContRef : OBEndpointDefinition*;
		SystemDefinition_ContRef : OBSystemDefinition*;
		ResourceDefinition_ContRef : OBResourceDefinition*;
		CommunicationDefinition_ContRef : OBCommunicationDefinition*;
		ContainmentDefinition_ContRef : OBContainmentDefinition*;
		DelegationDefinition_ContRef : OBDelegationDefinition*;
		ReferenceDefinition_ContRef : OBReferenceDefinition*;
		HostingDefinition_ContRef : OBHostingDefinition*;
		Endpoint_ContRef : OBEndpoint*;
		Subsystem_ContRef : OBSubsystem*;
		Resource_ContRef : OBResource*;
		Hosting_ContRef : OBHosting*;
		Containment_ContRef : OBContainment*;
		Connection_ContRef : OBConnection*;
		Delegation_ContRef : OBDelegation*;
		Obreference_ContRef : OBReference*;
		Layer_Att : Text;
		Extends_Ref : QualifiedName?;
		Abstract_Att : Logical;
	};

	type OBFlow : FlowMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBRelationshipConstraint : RelationshipConstraint {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBConstraint : ConstraintMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBConstraintGroup : ConstraintGroup {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBEndpointDefinition : EndpointDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBSystemDefinition : SystemDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBResourceDefinition : ResourceDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBCommunicationDefinition : CommunicationDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBContainmentDefinition : ContainmentDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBDelegationDefinition : DelegationDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBReferenceDefinition : ReferenceDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBHostingDefinition : HostingDefinition {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBEndpoint : EndpointMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBSubsystem : SystemMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBResource : ResourceMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBHosting : HostingMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBContainment : ContainmentMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBConnection : CommunicationMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBDelegation : DelegationMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type OBReference : ReferenceMember {
		ObjectDefinition_Ref : ObjectDefinition;
	};

	type SystemDefinition : ObjectDefinition {
		SimulationRoot_Att : Logical;
	};

	type EndpointDefinition : ObjectDefinition;

	type ResourceDefinition : ObjectDefinition;

	type RelationshipDefinition : Definition {
		ObjectConstraint_ContRef : RDObjectConstraint*;
		Constraint_ContRef : RDConstraint*;
		ConstraintGroup_ContRef : RDConstraintGroup*;
		Flow_ContRef : RDFlow*;
		Connection_ContRef : RDConnection*;
		Hosting_ContRef : RDHosting*;
		Delegation_ContRef : RDDelegation*;
		Reference_ContRef : RDReference*;
		Containment_ContRef : RDContainment*;
		Extends_Ref : QualifiedName;
		Abstract_Att : Logical;
	};

	type RDObjectConstraint : ObjectConstraint {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDConstraint : ConstraintMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDConstraintGroup : ConstraintGroup {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDFlow : FlowMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDConnection : CommunicationMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDHosting : HostingMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDDelegation : DelegationMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDReference : ReferenceMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type RDContainment : ContainmentMember {
		RelationshipDefinition_Ref : RelationshipDefinition;
	};

	type CommunicationDefinition : RelationshipDefinition {
		ClientDefinition_Ref : QualifiedName;
		ServerDefinition_Ref : QualifiedName;
	};

	type HostingDefinition : RelationshipDefinition {
		GuestDefinition_Ref : QualifiedName;
		HostDefinition_Ref : QualifiedName;
		SimulationRoot_Att : Logical;
	};

	type ContainmentDefinition : RelationshipDefinition {
		ParentDefinition_Ref : QualifiedName;
		MemberDefinition_Ref : QualifiedName;
	};

	type DelegationDefinition : RelationshipDefinition {
		ProxyDefinition_Ref : QualifiedName;
		DelegateDefinition_Ref : QualifiedName;
	};

	type ReferenceDefinition : RelationshipDefinition {
		DependentDefinition_Ref : QualifiedName;
		SourceDefinition_Ref : QualifiedName;
	};

	type Member {
		Description_Ref : Description*;
		DesignData_Ref : DesignData;
		SettingValue_ContRef : MembSettingValue*;
		SettingValueList_ContRef : MembSettingValueList*;
		Name_Ref : SimpleName;
		Definition_Ref : QualifiedName;
	};

	type MembSettingValue : SettingValue {
		Member_Ref : Member;
	};

	type MembSettingValueList : SettingValueList {
		Member_Ref : Member;
	};

	type ObjectMember : Member {
		MinOccurs_Ref : MinOccurs?;
		MaxOccurs_Ref : MaxOccurs?;
		Reference_Att : Logical;
		Proxy_Att : Logical;
	};

	type RelationshipMember : Member;

	type SystemMember : ObjectMember;

	type EndpointMember : ObjectMember;

	type ResourceMember : ObjectMember;

	type HostingMember : RelationshipMember {
		GuestMember_Ref : Path;
		HostMember_Ref : Path;
	};

	type CommunicationMember : RelationshipMember {
		ClientMember_Ref : Path;
		ServerMember_Ref : Path;
	};

	type ContainmentMember : RelationshipMember {
		ChildMember_Ref : Path;
	};

	type DelegationMember : RelationshipMember {
		ProxyMember_Ref : Path;
		DelegateMember_Ref : Path;
	};

	type ReferenceMember : RelationshipMember {
		DependentMember_Ref : Path;
		SourceMember_Ref : Path;
	};

	type DesignData {
		NameSpace_ContRef : NameSpace*;
	};

	type NameSpace : Element {
		DesignData_Ref : DesignData;
	};

	type ObjectConstraint : StructuralConstraint {
		Constraint_ContRef : OCConstraint*;
		RelationshipConstraint_ContRef : OCRelationshipConstraint*;
		ConstraintGroup_ContRef : OCConstraintGroup*;
		PrimaryRole_Att : RolesList;
		PrimaryObjectDefinition_Ref : QualifiedName;
		SecondaryRole_Att : RolesList*;
		SecondaryObjectDefinition_Ref : QualifiedName*;
		MinOccurs_Ref : MinOccurs*;
		MaxOccurs_Ref : MaxOccurs*;
	};

	type OCConstraint : ConstraintMember {
		ObjectConstraint_Ref : ObjectConstraint;
	};

	type OCRelationshipConstraint : RelationshipConstraint {
		ObjectConstraint_OC_Ref : ObjectConstraint;
	};

	type OCConstraintGroup : ConstraintGroup {
		ObjectConstraint_OC_Ref : ObjectConstraint;
	};

	type RelationshipConstraint : StructuralConstraint {
		Constraint_ContRef : RCConstraint*;
		RelationshipConstraint_ContRef : RCRelationshipConstraint*;
		ObjectConstraint_ContRef : RCObjectConstraint*;
		ConstraintGroup_ContRef : RCConstraintGroup*;
		RelationshipDefinition_Ref : QualifiedName;
		TargetRole_Att : RolesList;
		TargetObjectDefinition_Ref : QualifiedName?;
		MinOccurs_Ref : MinOccurs?;
		MaxOccurs_Ref : MaxOccurs?;
		DelegationAware_Att : Logical;
	};

	type RCConstraint : ConstraintMember {
		RelationshipConstraint_Ref : RelationshipConstraint;
	};

	type RCRelationshipConstraint : RelationshipConstraint {
		RelationshipConstraint_RC_Ref : RelationshipConstraint;
	};

	type RCObjectConstraint : ObjectConstraint {
		RelationshipConstraint_RC_Ref : RelationshipConstraint;
	};

	type RCConstraintGroup : ConstraintGroup {
		RelationshipConstraint_RC_Ref : RelationshipConstraint;
	};

	type ConstraintGroup : StructuralConstraint {
		Constraint_ContRef : CGConstraint*;
		RelationshipConstraint_ContRef : CGRelationshipConstraint*;
		ObjectConstraint_ContRef : CGObjectConstraint*;
	};

	type CGConstraint : ConstraintMember {
		ConstraintGroup_Ref : ConstraintGroup;
	};

	type CGRelationshipConstraint : RelationshipConstraint {
		ConstraintGroup_CG_Ref : ConstraintGroup;
	};

	type CGObjectConstraint : ObjectConstraint {
		ConstraintGroup_CG_Ref : ConstraintGroup;
	};

	type StructuralConstraint {
		Description_Ref : Description?;
		DesignData_Ref : DesignData?;
		Name_Ref : SimpleName;
		Evaluate_Att : ConstraintEvaluation?;
		RaiseError_Att : Logical;
		ReturnEarly_Att : Logical;
	};

	type ConstraintDefinition : Definition {
		RelationshipConstraint_ContRef : CDRelationshipConstraint*;
		ConstraintGroup_ContRef : CDConstraintGroup*;
		ObjectConstraint_ContRef : CDObjectConstraint*;
		Constraint_ContRef : CDConstraint*;
		TargetDefinition_Ref : QualifiedName?;
		ReturnEarly_Att : Logical;
	};

	type CDRelationshipConstraint : RelationshipConstraint {
		ConstraintDefinition_Ref : ConstraintDefinition;
	};

	type CDConstraintGroup : ConstraintGroup {
		ConstraintDefinition_Ref : ConstraintDefinition;
	};

	type CDObjectConstraint : ObjectConstraint {
		ConstraintDefinition_Ref : ConstraintDefinition;
	};

	type CDConstraint : ConstraintMember {
		ConstraintDefinition_Ref : ConstraintDefinition;
	};

	type ConstraintMember : Member {
		Input_Ref : Input*;
		RaiseError_Att : Logical;
		Evaluate_Att : ConstraintEvaluation?;
	};

	type Definition {
		Description_Ref : Description?;
		DesignData_Ref : DesignData?;
		SettingDeclaration_ContRef : DefSettingDeclaration*;
		SettingValue_ContRef : DefSettingValue*;
		SettingValueList_ContRef : DefSettingValueList*;
		Name_Ref : SimpleName;
		Manager_Ref : QualifiedName?;
		ClassName_Att : Text;
	};

	type DefSettingDeclaration : SettingMember {
		Definition_DSD_Ref : Definition;
	};

	type DefSettingValue : SettingValue {
		Definition_Ref : Definition;
	};

	type DefSettingValueList : SettingValueList {
		Definition_Ref : Definition;
	};

	type SimpleName : Element;

	type QualifiedName : Element;

	type Path : Element;

	type SettingPath : Element;

	type NamespaceIdentity {
		Name_Ref : Path;
		Version_Ref : FourPartVersionType?;
		PublicKey_Ref : PublicKeyType?;
		PublicKeyToken_Ref : PublicKeyTokenType?;
		Culture_Ref : CultureNeutral?;
		Platform_Att : Platform?;
	};

	type FlowDefinition : Definition;

	type FlowMember : Member {
		Input_Ref : Input*;
		Output_Ref : Output*;
	};

	type ValueTransfer {
		Name_Ref : SimpleName;
		Path_Ref : SettingPath;
		Cast_Att : Logical;
		Convert_Att : Logical;
	};

	type Output : ValueTransfer {
		Fixed_Att : Logical;
		Replace_Att : Logical;
	};

	type Input : ValueTransfer;

	type SettingDefinitions {
		NameSpace_Ref : NameSpace?;
		Manager_Ref : QualifiedName;
		ClrNameSpace_Att : Text;
	};

	type SettingMember : Member {
		Facet_Ref : Facet*;
		SettingAttributes_Ref : SettingsAttributes;
	};

	type SettingsAttributes {
		List_Att : Logical;
		Access_Att : SettingMemberAccess;
		Secure_Att : SettingMemberSecure;
		DeploymentTime_Att : Logical;
		Required_Att : Logical;
		CanBeNull_Att : Logical;
		ElementsCanBeNull_Att : Logical;
		DefaultRead_Att : Text;
		DefaultWrite_Att : Text;
	};

	type SettingMemberAccess {"ReadWrite", "ReadOnly", "WriteOnly"};

	type SettingMemberSecure {"Always", "PerInstance", "Never"};

	type Facet {
		Name_Ref : SimpleName;
	};

	type SettingValue {
		Contents_Att : Text;
		SettingValueAttributes_Ref : SettingValueAttributes;
	};

	type SettingValueList {
		Value_Ref : Value*;
		SettingValueAttributes_Ref : SettingValueAttributes;
	};

	type Value {
		Contents_Att : Text;
		Null_Att : Logical;
	};

	type SettingValueAttributes {
		Path_Ref : SettingPath;
		Null_Att : Logical;
		Fixed_Att : Logical;
		Unset_Att : Logical;
		Definition_Ref : QualifiedName?;
		Convert_Att : Logical;
		Secure_Att : Logical;
		Reference_Att : Logical;
	};

	type Description {
		Entry_ContRef : Entry*;
		ResourceId_Att : Text;
		Manager_Ref : QualifiedName?;
	};

	type Entry : DescriptionEntry {
		Description_Ref : Description;
	};

	type DescriptionEntry {
		Name_Att : Text;
		ResourceId_Att : Text;
		Manager_Ref : QualifiedName?;
		Substitute_ContRef : Substitute?;
	};

	type Substitute : PathList {
		DescriptionEntry_ContRef : DescriptionEntry?;
	};

	type PathList {
		SettingPath_Ref : SettingPath*;
	};

	type MaxOccurs : Element;

	type MinOccurs : Element;

	type FourPartVersionType : Element;

	type PublicKeyType : Element;

	type PublicKeyTokenType : Element;

	type CompilationHashType : Element;

	type RolesList {"Host", "Guest", "Parent", "Member", "Source", "Dependent", "Proxy", "Delegate", "Client", "Server"};

	type Culture : Element;

	type CultureNeutral : Element;

	type ProcessorArchitectures {"x86", "ia64", "amd64", "wow64", "msil", "shx", "arm", "data"};

	type Platform {"x86", "ia64", "amd64", "wow64", "msil", "shx", "arm", "data", "*", "neutral"};

	type ConstraintEvaluation {"Design", "Never"};

	type Element {
		Value_Att : Text;
	};
}