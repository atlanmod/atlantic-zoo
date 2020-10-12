module JAVA {

	type JavaElement {
		Name_Att : Text;
	};

	type ClassFeature : JavaElement {
		IsFinal_Att : Logical;
	};

	type ClassMember : ClassFeature {
		Owner_Ref : JavaClass;
		Type_Ref : JavaClass;
		IsStatic_Att : Logical;
		IsPublic_Att : Logical;
	};

	type Field : ClassMember;

	type JavaClass : ClassFeature {
		Members_ContRef : ClassMember*;
		Package_Ref : Package;
		TypedElements_Ref : ClassMember*;
		Parameters_Ref : FeatureParameter*;
		IsAbstract_Att : Logical;
		IsStatic_Att : Logical;
		IsPublic_Att : Logical;
	};

	type Method : ClassMember {
		Parameters_ContRef : FeatureParameter*;
	};

	type Package : JavaElement {
		Classes_ContRef : JavaClass*;
	};

	type PrimitiveType : JavaClass;

	type FeatureParameter : ClassFeature {
		Type_Ref : JavaClass;
		Method_Ref : Method;
	};
}