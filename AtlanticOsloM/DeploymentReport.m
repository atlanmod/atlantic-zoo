module DeploymentReport {

	type DeploymentReport {
		Import_Ref : DeploymentImport*;
		Applications_Ref : Applications?;
		Binding_Ref : Binding?;
		LogicalServers_Ref : LogicalServers?;
		Errors_Ref : ErrorCollection?;
	};

	type DeploymentImport {
		Alias_Ref : SimpleName;
		Identity_ContRef : ImportNamespaceIdentity;
	};

	type ImportNamespaceIdentity : NamespaceIdentity {
		Import_Ref : DeploymentImport;
	};

	type NamespaceIdentity {
		Name_Ref : Path;
		Version_Ref : FourPartVersionType?;
		PublicKey_Ref : PublicKeyType?;
		PublicKeyToken_Ref : PublicKeyTokenType?;
		Culture_Ref : CultureNeutral?;
		Platform_Att : Platform?;
	};

	type Applications {
		System_Ref : OuterSystem*;
		Application_Ref : Application*;
	};

	type LogicalServers {
		Zone_Ref : Zone*;
		LogicalServer_Ref : LogicalServer*;
	};

	type OuterSystem {
		System_Ref : OuterSystem*;
		Application_Ref : Application*;
		Name_Att : Text;
	};

	type Binding {
		Zone_Ref : Zone*;
		BoundLogicalServer_Ref : BoundLogicalServer*;
	};

	type Zone {
		Zone_Ref : Zone*;
		BoundLogicalServer_Ref : BoundLogicalServer*;
		LogicalServer_Ref : LogicalServer*;
		Name_Att : Text;
	};

	type ReportObject {
		Sequence_ContRef : SequenceReport*;
		Name_Att : Text;
		Definition_Att : Text;
		Extends_Att : Text;
		InstanceId_Ref : Guid;
		HostedOn_Att : Text;
	};

	type SequenceReport {
		Report_Ref : ReportObject;
		Setting_Ref : Setting;
		System_Ref : ReportSystem*;
		Resource_Ref : ReportResource*;
		Endpoint_Ref : ReportEndpoint*;
	};

	type BoundLogicalServer {
		Setting_Ref : Setting*;
		Application_Ref : Application*;
		Name_Att : Text;
		Definition_Att : Text;
		Extends_Att : Text;
	};

	type LogicalServer : ReportObject;

	type Application : ReportObject;

	type ReportSystem : ReportObject;

	type ReportResource : ReportObject;

	type ReportEndpoint : ReportObject;

	type Setting {
		Value_Ref : SettingInstanceValue*;
		Facet_Ref : SettingFacet*;
		SettingAttributes_Ref : SettingAttributes;
	};

	type SettingFacet {
		Value_Ref : SettingInstanceValue?;
		SettingAttributes_Ref : SettingAttributes;
	};

	type SettingInstanceValue {
		Contents_Att : Text;
		Null_Att : Logical;
	};

	type SettingAttributes {
		Name_Att : Text;
		Definition_Att : Text;
		State_Att : SettingState?;
		Fixed_Att : Logical;
		List_Att : Logical;
		Null_Att : Logical;
		Secure_Att : Logical;
		FailedToSerialize_Att : Logical;
	};

	type SettingValue {
		Contents_Att : Text;
		Null_Att : Logical;
		Secure_Att : Logical;
	};

	type ErrorCollection {
		DocumentError_Ref : DocumentError*;
		DocumentResolutionError_Ref : DocumentResolutionError*;
		DocumentConstraintError_Ref : DocumentConstraintError*;
	};

	type DocumentError {
		Description_Ref : Description*;
		Code_Att : Integer32;
		Level_Att : Integer32;
		File_Att : Text;
	};

	type DocumentResolutionError : DocumentError {
		Statement_Att : Text;
	};

	type DocumentConstraintError : DocumentError {
		FailedInput_Ref : FailedInput*;
		ConstraintMember_Att : Text;
		ConstraintDefinition_Att : Text;
		TargetInstancePath_Att : Text;
		OwnerInstancePath_Att : Text;
		ConstraintErrorCode_Att : Text;
		ConstraintErrorMessage_Att : Text;
	};

	type FailedInput {
		Contents_Att : Text;
	};

	type Description {
		Contents_Att : Text;
	};

	type Guid : Element;

	type SimpleName : Element;

	type Path : Element;

	type FourPartVersionType : Element;

	type PublicKeyType : Element;

	type PublicKeyTokenType : Element;

	type Culture : Element;

	type CultureNeutral : Element;

	type ProcessorArchitectures {"x86", "ia64", "amd64", "wow64", "msil", "shx", "arm", "data"};

	type Platform {"x86", "ia64", "amd64", "wow64", "msil", "shx", "arm", "data", "*", "neutral"};

	type SettingState {"Set", "NotSet", "Error"};

	type Element {
		Value_Att : Text;
	};
}