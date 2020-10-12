module JavaProject {

	type JavaProject : NamedElement {
		OwnedPackageFragment_ContRef : PackageFragment*;
	};

	type PackageFragment : NamedElement {
		OwnedCompilationUnit_ContRef : CompilationUnit*;
	};

	type CompilationUnit : NamedElement {
		ImportDeclaration_ContRef : ImportDeclaration*;
		OwnedType_ContRef : Type*;
		Declaration_ContRef : PackageDeclaration?;
	};

	type ImportDeclaration : NamedElement;

	type Type : JavaElement {
		NestedType_ContRef : Type*;
		OwnedSuperType_Ref : Type*;
		ElementName_Att : Text;
		Member_kind_Att : MEMBER_KIND?;
		Methods_ContRef : Method*;
		Fields_ContRef : Field*;
	};

	type Field : JavaElement;

	type Method : JavaElement {
		ReturnType_Att : Text;
		ParametersName_Att : Text;
		ParametersType_Att : Text;
	};

	type JavaElement : NamedElement;

	type MEMBER_KIND {"class", "enum", "interface", "Annotation"};

	type NamedElement {
		Name_Att : Text;
	};

	type PackageDeclaration : NamedElement;
}