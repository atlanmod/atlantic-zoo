module CWMCore {

	type VisibilityKind {"vk_public_vis", "vk_private_vis", "vk_protected_vis"};

	type BooleanExpression {
		Expresssion_Att : Text;
	};

	type ModelElement {
		Name_Att : Text;
		Visibility_Att : VisibilityKind;
		Contraints_Ref : Constraint*;
		ClientDependencies_Ref : Dependency*;
		SupplierDependencies_Ref : Dependency*;
		Namespace_Ref : NameSpace?;
		Importers_Ref : Package*;
	};

	type Dependency : ModelElement {
		Kind_Att : Text;
		Clients_Ref : ModelElement+;
		Suppliers_Ref : ModelElement+;
	};

	type Constraint : ModelElement {
		Body_ContRef : BooleanExpression;
		ConstrainedElements_Ref : ModelElement*;
	};

	type Feature : ModelElement {
		Owner_Ref : Classifier?;
	};

	type StructuralFeature : Feature {
		Type_Ref : Classifier;
	};

	type Attribute : StructuralFeature;

	type NameSpace : ModelElement {
		OwnedElements_ContRef : ModelElement*;
	};

	type Classifier : NameSpace {
		Features_ContRef : Feature*;
	};

	type Package : NameSpace {
		ImportedElements_Ref : ModelElement*;
	};

	type Class : Classifier;

	type Datatype : Classifier;

	type Subsystem : Classifier, Package;

	type Model : Package;
}