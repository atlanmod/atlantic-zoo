module UMLForOOClassModeling {

	type VisibilityKind {"vk_public_vis", "vk_private_vis", "vk_protected_vis"};

	type ScopeKind {"sk_instance_level", "sk_classifier_level"};

	type MultiplicityType {
		Lower_Att : Integer32;
		Upper_Att : Integer32;
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
	};

	type ModelElement {
		Name_Att : Text;
	};

	type Feature : ModelElement {
		OwnerScope_Att : ScopeKind;
		Visibility_Att : VisibilityKind;
		Owner_Ref : Classifier?;
	};

	type NameSpace : ModelElement;

	type GeneralizableElement : ModelElement {
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type Classifier : NameSpace, GeneralizableElement {
		Feature_ContRef : Feature*;
	};

	type Class : Classifier {
		IsActive_Att : Logical;
	};

	type StructuralFeature : Feature {
		Multiplicity_Ref : MultiplicityType;
		IsChangeable_Att : Logical;
		TargetScope_Att : ScopeKind;
	};

	type Attribute : StructuralFeature {
		InitialValue_Att : Text;
	};

	type BehavioralFeature : Feature {
		IsQuery_Att : Logical;
	};

	type Operation : BehavioralFeature {
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
		Specification_Att : Text;
	};
}