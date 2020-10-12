module MetamodelRoot {

	type @[Core.Element];

	type @[Core.ModelElement] : @[Core.Element] {
		Namespace_Ref : @[Core.Namespace]?;
		Name_Att : Text;
		Visibility_Att : @[Data_Types.VisibilityKind]?;
		IsSpecification_Att : Logical;
	};

	type @[Core.GeneralizableElement] : @[Core.ModelElement] {
		Generalization_Ref : @[Core.Generalization]*;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type @[Core.Namespace] : @[Core.ModelElement] {
		OwnedElement_ContRef : @[Core.ModelElement]*;
	};

	type @[Core.Classifier] : @[Core.GeneralizableElement], @[Core.Namespace] {
		PowertypeRange_Ref : @[Core.Generalization]*;
		Feature_ContRef : @[Core.Feature]*;
	};

	type @[Core.Feature] : @[Core.ModelElement] {
		Owner_Ref : @[Core.Classifier]?;
		OwnerScope_Att : @[Data_Types.ScopeKind];
	};

	type @[Core.Relationship] : @[Core.ModelElement];

	type @[Core.Generalization] : @[Core.Relationship] {
		Parent_Ref : @[Core.GeneralizableElement];
		Powertype_Ref : @[Core.Classifier]?;
		Child_Ref : @[Core.GeneralizableElement];
		Discriminator_Att : Text;
	};

	type @[Model_Management.Package] : @[Core.GeneralizableElement], @[Core.Namespace] {
		ElementImport_ContRef : @[Model_Management.ElementImport]*;
	};

	type @[Model_Management.Model] : @[Model_Management.Package];

	type @[Model_Management.Subsystem] : @[Model_Management.Package], @[Core.Classifier] {
		IsInstantiable_Att : Logical;
	};

	type @[Model_Management.ElementImport] {
		Package_Ref : @[Model_Management.Package];
		ImportedElement_Ref : @[Core.ModelElement];
		Visibility_Att : @[Data_Types.VisibilityKind]?;
		Alias_Att : Text;
		IsSpecification_Att : Logical;
	};

	type @[Data_Types.ScopeKind] {"sk_instance", "sk_classifier"};

	type @[Data_Types.VisibilityKind] {"vk_public", "vk_protected", "vk_private", "vk_package"};
}