module CPP {

	type CDerived;

	type CStructured;

	type CBehavorialFeature;

	type CFunction : CBehavorialFeature {
		IsVsrArg_Att : Logical;
	};

	type CStructureContents;

	type CField;

	type CDerivableType;

	type VisibilityKind {"vk_public", "vk_private", "vk_protected"};

	type CPPReference : CDerived;

	type CPPExtern : CDerived {
		Linkage_Att : Text;
	};

	type CPPConst : CDerived;

	type CPPTemplate : CDerived {
		Classes_Ref : CPPClass*;
	};

	type CPPClass : CStructured {
		IsAbstract_Att : Logical;
		IsVolatile_Att : Logical;
		Visibility_Att : VisibilityKind;
		Templates_Ref : CPPTemplate*;
		Generalizations_Ref : CPPGeneralization*;
	};

	type CPPGeneralization {
		Visibility_Att : VisibilityKind;
		IsVirtual_Att : Logical;
		Supertype_Ref : CPPClass;
	};

	type CPPOperation : CFunction, CStructureContents {
		IsStatic_Att : Logical;
		IsExtern_Att : Logical;
		IsInline_Att : Logical;
		IsVirtual_Att : Logical;
		IsPure_Att : Logical;
		Visibility_Att : VisibilityKind;
		IsCtor_Att : Logical;
		IsDtor_Att : Logical;
		Throws_Ref : CPPClass*;
	};

	type CPPOperator : CStructureContents {
		IsInline_Att : Logical;
		Visibility_Att : VisibilityKind;
	};

	type CPPMember {
		IsStatic_Att : Logical;
		IsVolatile_Att : Logical;
		IsRegister_Att : Logical;
		Visibility_Att : VisibilityKind;
	};
}