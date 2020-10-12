module MetamodelRoot {

	type @[Common_Behavior.Instance] : @[Core.ModelElement] {
		OwnedInstance_ContRef : @[Common_Behavior.Instance]*;
		LinkEnd_Ref : @[Common_Behavior.LinkEnd]*;
		Classifier_Ref : @[Core.Classifier]+;
		ComponentInstance_Ref : @[Common_Behavior.ComponentInstance]?;
		Slot_ContRef : @[Common_Behavior.AttributeLink]*;
		OwnedLink_ContRef : @[Common_Behavior.Link]*;
	};

	type @[Common_Behavior.AttributeLink] : @[Core.ModelElement] {
		Instance_Ref : @[Common_Behavior.Instance]?;
		Value_Ref : @[Common_Behavior.Instance];
		LinkEnd_Ref : @[Common_Behavior.LinkEnd]?;
		Attribute_Ref : @[Core.Attribute];
	};

	type @[Common_Behavior.Link] : @[Core.ModelElement] {
		Association_Ref : @[Core.Association];
		Connection_ContRef : @[Common_Behavior.LinkEnd]#2 ..;
	};

	type @[Common_Behavior.LinkEnd] : @[Core.ModelElement] {
		Link_Ref : @[Common_Behavior.Link];
		QualifiedValue_ContRef : @[Common_Behavior.AttributeLink]*;
		Instance_Ref : @[Common_Behavior.Instance];
		AssociationEnd_Ref : @[Core.AssociationEnd];
	};

	type @[Common_Behavior.ComponentInstance] : @[Common_Behavior.Instance] {
		Resident_Ref : @[Common_Behavior.Instance]*;
		NodeInstance_Ref : @[Common_Behavior.NodeInstance]?;
	};

	type @[Common_Behavior.NodeInstance] : @[Common_Behavior.Instance] {
		Resident_Ref : @[Common_Behavior.ComponentInstance]*;
	};

	type @[Use_Cases.UseCase] : @[Core.Classifier] {
		Include_Ref : @[Use_Cases.Include]*;
		Extend_Ref : @[Use_Cases.Extend]*;
		ExtensionPoint_ContRef : @[Use_Cases.ExtensionPoint]*;
	};

	type @[Use_Cases.Actor] : @[Core.Classifier];

	type @[Use_Cases.UseCaseInstance] : @[Common_Behavior.Instance];

	type @[Use_Cases.Extend] : @[Core.Relationship] {
		ExtensionPoint_Ref : @[Use_Cases.ExtensionPoint]+;
		Extension_Ref : @[Use_Cases.UseCase];
		Base_Ref : @[Use_Cases.UseCase];
		Condition_ContRef : @[Data_Types.BooleanExpression];
	};

	type @[Use_Cases.Include] : @[Core.Relationship] {
		Addition_Ref : @[Use_Cases.UseCase];
		Base_Ref : @[Use_Cases.UseCase];
	};

	type @[Use_Cases.ExtensionPoint] : @[Core.ModelElement] {
		UseCase_Ref : @[Use_Cases.UseCase];
		Location_Att : Text;
	};

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

	type @[Core.StructuralFeature] : @[Core.Feature] {
		Type_Ref : @[Core.Classifier];
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
		Changeability_Att : @[Data_Types.ChangeableKind]?;
		TargetScope_Att : @[Data_Types.ScopeKind]?;
		Ordering_Att : @[Data_Types.OrderingKind]?;
	};

	type @[Core.AssociationEnd] : @[Core.ModelElement] {
		Association_Ref : @[Core.Association];
		Specification_Ref : @[Core.Classifier]*;
		Participant_Ref : @[Core.Classifier];
		Qualifier_ContRef : @[Core.Attribute]*;
		IsNavigable_Att : Logical;
		Ordering_Att : @[Data_Types.OrderingKind]?;
		Aggregation_Att : @[Data_Types.AggregationKind]?;
		TargetScope_Att : @[Data_Types.ScopeKind]?;
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
		Changeability_Att : @[Data_Types.ChangeableKind]?;
	};

	type @[Core.Relationship] : @[Core.ModelElement];

	type @[Core.Association] : @[Core.GeneralizableElement], @[Core.Relationship] {
		Connection_ContRef : @[Core.AssociationEnd]#2 ..;
	};

	type @[Core.Attribute] : @[Core.StructuralFeature] {
		AssociationEnd_Ref : @[Core.AssociationEnd]?;
		InitialValue_ContRef : @[Data_Types.Expression]?;
	};

	type @[Core.Generalization] : @[Core.Relationship] {
		Parent_Ref : @[Core.GeneralizableElement];
		Powertype_Ref : @[Core.Classifier]?;
		Child_Ref : @[Core.GeneralizableElement];
		Discriminator_Att : Text;
	};

	type @[Data_Types.AggregationKind] {"ak_none", "ak_aggregate", "ak_composite"};

	type @[Data_Types.ChangeableKind] {"ck_changeable", "ck_frozen", "ck_addOnly"};

	type @[Data_Types.OrderingKind] {"ok_unordered", "ok_ordered"};

	type @[Data_Types.ScopeKind] {"sk_instance", "sk_classifier"};

	type @[Data_Types.VisibilityKind] {"vk_public", "vk_protected", "vk_private", "vk_package"};

	type @[Data_Types.Multiplicity] {
		Range_ContRef : @[Data_Types.MultiplicityRange]+;
	};

	type @[Data_Types.MultiplicityRange] {
		Multiplicity_Ref : @[Data_Types.Multiplicity];
		Lower_Att : Integer32;
		Upper_Att : Integer32;
	};

	type @[Data_Types.Expression] {
		Language_Att : Text;
		Body_Att : Text;
	};

	type @[Data_Types.BooleanExpression] : @[Data_Types.Expression];
}