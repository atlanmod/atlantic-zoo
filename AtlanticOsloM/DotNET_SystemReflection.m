module DNSR {

	type NamedElement {
		Name_Att : Text;
	};

	type Assembly : NamedElement {
		Location_Att : Text;
		ImageRuntimeVersion_Att : Text;
		Evidence_Att : Text;
		CodeBase_Att : Text;
		EntryPoint_Ref : MethodInfo;
		Modules_ContRef : Module*;
		ManifestModule_Ref : Module;
		ReferencedAssembly_Ref : Assembly*;
		Manifest_ContRef : ManifestResource;
	};

	type ManifestResource {
		Content_Att : Text;
		Assembly_Ref : Assembly;
	};

	type Module : NamedElement {
		QualifiedName_Att : Text;
		ScopeName_Att : Text;
		Assembly_Ref : Assembly;
		Types_ContRef : Type*;
	};

	type MemberInfo : NamedElement {
		MemberType_Att : MemberTypes;
		DeclaringType_Ref : Type;
	};

	type PropertyInfo : MemberInfo {
		PropertyType_Ref : Type;
		Attributes_Att : PropertyAttributes*;
	};

	type FieldInfo : MemberInfo {
		FieldType_Ref : Type;
		Attributes_Att : FieldAttributes*;
	};

	type EventInfo : MemberInfo {
		IsMulticast_Att : Logical;
		Attributes_Att : EventAttributes?;
		EventHandlerType_Ref : Type;
	};

	type ParameterInfo : NamedElement {
		DefaultValue_Att : Text;
		Position_Att : Integer32;
		Attributes_Att : ParameterAttributes*;
		ParameterType_Ref : Type;
		Member_Ref : MethodBase;
	};

	type MethodBase : MemberInfo {
		Attributes_Att : MethodAttributes*;
		Parameters_ContRef : ParameterInfo*;
	};

	type MethodInfo : MethodBase {
		ReturnType_Ref : Type?;
	};

	type ConstructorInfo : MethodBase;

	type Type : MemberInfo {
		Namespace_Att : Text;
		GenericParameterAttributes_Att : GenericParameterAttributes*;
		TypeAttributes_Att : TypeAttributes*;
		BaseType_Ref : Type?;
		Module_Ref : Module;
		Interfaces_Ref : Type*;
		Members_ContRef : MemberInfo*;
	};

	type EventAttributes {"None", "ReservedMask", "RTSpecialName", "SpecialName"};

	type FieldAttributes {"FieldAccessMask", "PrivateScope", "Private", "Assembly", "Family", "FamANDAssem", "FamORAssem", "Public", "Shared", "InitOnly", "Literal", "NotSerialized", "SpecialName", "PinvokeImpl", "ReservedMask", "RTSpecialName", "HasFieldMarshal", "HasDefault", "HasFieldRVA", "Static"};

	type GenericParameterAttributes {"HasElementType", "Abstract", "AnsiClass", "AutoClass", "AutoLayout", "ByRef", "Class", "COMObject", "Contextful", "Enum", "ExplicitLayout", "Import", "Interface", "LayoutSequential", "MarshalByRef", "NestedAssembly", "NestedFamADNAssem", "NestedFamily", "NestedFamORAssem", "NestedPrivate", "NestedPublic", "NotPublic", "Pointer", "Primitive", "Public", "Sealed", "Serializable", "SpecialName", "UnicodeClass", "ValueType"};

	type MemberTypes {"Constructor", "Event", "Field", "Method", "Property", "TypeInfo", "Custom", "NestedType", "All"};

	type MethodAttributes {"Abstract", "Assembly", "ChekedAccessOnOverride", "FamADNAssem", "Family", "FamORAssem", "Final", "HasSecurity", "HideBySig", "MemberAccessMask", "NewSlot", "PInvokeImpl", "Private", "PrivateScope", "Public", "RequiredSecObject", "ReservedMask", "ReuseSlot", "RTSpecialName", "SpecialName", "Static", "UnmanagedExport", "Virtual", "VtableLayoutMask"};

	type ParameterAttributes {"HasDefault", "HasDefaultMArshal", "In", "Lcid", "None", "Optional", "Out", "Reserved3", "Reserved4", "ReservedMask", "RetVal"};

	type PropertyAttributes {"NotSupported", "Optional", "Read", "Required", "Write"};

	type TypeAttributes {"Abstract", "AnsiClass", "AutoClass", "AutoLayout", "BeforFieldInit", "Class", "ClassSemanticsMask", "ExplicitLayout", "HasSecutity", "Import", "Interface", "LayoutMask", "NestedAssembly", "NestedFamADNAssem", "NestedFamily", "NestedFamORAssem", "NestedPrivate", "NestedPublic", "NotPublic", "Public", "ReservedMask", "RTSpecialName", "Sealed", "SequentialLayout", "Serializable", "SpecialName", "StringFormatMask", "UnicodeClass", "VisibilityMask"};
}