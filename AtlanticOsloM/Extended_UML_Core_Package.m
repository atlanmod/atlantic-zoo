module ExtendedUMLCorePackage {

	type ModelElement {
		Name_Ref : Name;
	};

	type Name;

	type AssociationEnd : ModelElement {
		IsNavigable_Att : Logical;
		IsOrdered_Att : Logical;
		Aggregation_Ref : AggregationKind;
		Multiplicity_Ref : Multiplicity;
		Changeable_Ref : ChangeableKind;
		TargetScope_Ref : ScopeKind;
		RfIntegrety_Ref : RlIntegretyKind;
		RlIntegrety_Ref : RlIntegretyKind;
	};

	type AggregationKind;

	type Multiplicity;

	type ChangeableKind;

	type ScopeKind;

	type RfIntegretyKind;

	type RlIntegretyKind;

	type Namespace : ModelElement;

	type GeneralizableElement : Namespace;

	type Classifier : GeneralizableElement;

	type Class : Classifier {
		IsActive_Att : Logical;
		Mutliplicity_Ref : Multiplicity;
		Key_ContRef : Key*;
	};

	type Key : ModelElement {
		ClassOwner_Ref : Class;
	};

	type Feature : ModelElement;

	type StructureFeature : Feature;

	type Constraint : Feature;

	type Attribute : StructureFeature {
		InitialValue_Ref : Expression;
		IsKey_Att : Logical;
		IsUnique_Att : Logical;
	};

	type Expression;
}