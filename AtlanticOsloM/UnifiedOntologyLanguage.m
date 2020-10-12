module UnifiedOntologyLanguage {

	type Node;

	type Resource : Node {
		Context_Ref : Package;
	};

	type Literal : Node;

	type Fact {
		Object_Ref : Node;
		Subject_Ref : Resource;
		Predicate_Ref : Resource;
		Context_Ref : Package;
	};

	type Package : Resource;

	type Ontology : Package {
		Imports_Ref : Package*;
	};
}