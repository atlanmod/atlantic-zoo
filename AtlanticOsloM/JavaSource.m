module JavaSource {

	type JavaSource {
		Classes_ContRef : ClassDeclaration+;
	};

	type NamedElement {
		Name_Att : Text;
	};

	type ClassDeclaration : NamedElement {
		Superclass_Ref : ClassDeclaration?;
		Methods_ContRef : MethodDefinition*;
	};

	type MethodDefinition : NamedElement {
		Class_Ref : ClassDeclaration;
		Invocations_ContRef : MethodInvocation*;
	};

	type MethodInvocation {
		Method_Ref : MethodDefinition;
	};
}