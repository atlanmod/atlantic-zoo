module CSharp {

	type Member {
		Name_Att : Text;
		Owner_Ref : Type?;
	};

	type TypedAttribute : Member {
		Type_Ref : Type;
	};

	type Field : TypedAttribute;

	type Property : TypedAttribute {
		IsReadable_Att : Logical;
		IsWritable_Att : Logical;
	};

	type MethodBase : Member {
		Visibility_Att : Text;
		IsAbstract_Att : Logical;
		IsFinal_Att : Logical;
		IsStatic_Att : Logical;
		Parameters_ContRef : Parameter*;
	};

	type Constructor : MethodBase;

	type Method : MethodBase {
		ReturnType_Ref : Type;
	};

	type Type : Member {
		QualifiedName_Att : Text;
		IsAbstract_Att : Logical;
		Visibility_Att : Text;
		IsSealed_Att : Logical;
		NameSpace_Att : Text;
		Members_ContRef : Member*;
		T_container_Ref : Assembly?;
		Super_Ref : Type?;
	};

	type Parameter {
		IsIn_Att : Logical;
		IsOut_Att : Logical;
		Name_Att : Logical;
		Position_Att : Integer32;
		Method_Ref : MethodBase;
		Type_Ref : Type;
	};

	type Assembly {
		Name_Att : Text;
		Content_ContRef : Type*;
	};
}