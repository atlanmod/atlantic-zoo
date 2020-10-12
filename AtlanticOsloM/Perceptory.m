module Perceptory {

	type RelationSchip {
		AffectCharacteristic_ContRef : Characteristic*;
		Constraint_Ref : Constraint?;
		Steriotype_Ref : Steriotype*;
		Packages_Ref : Package*;
		AssociatePackages_Ref : Package#2 .. 2;
	};

	type ConstrainedRelationSchip;

	type Aggregation : Association;

	type Composition : Association;

	type Association : RelationSchip;

	type Generalisation : RelationSchip;

	type Dependency : RelationSchip;

	type AssociationEnd;

	type Package {
		Steriotype_Ref : Steriotype?;
		Children_ContRef : Package*;
		Parent_Ref : Package;
		Classes_ContRef : Class*;
		RelationSchip_ContRef : RelationSchip*;
		ConnectedRelationSchip_Ref : RelationSchip*;
	};

	type Steriotype {
		DescriptiveAttribute_Ref : DescriptiveAttribute*;
		Operations_Ref : Operation*;
		RelationSchip_Ref : RelationSchip*;
		TheClass_Ref : Class*;
		ThePackage_Ref : Package*;
	};

	type Class {
		Characteristic_ContRef : Characteristic*;
		Details_ContRef : MetaData?;
		Operations_Ref : Operation;
		MyOperations_ContRef : Operation*;
		Constraint_Ref : Constraint*;
		Steriotype_Ref : Steriotype?;
		Packages_Ref : Package*;
	};

	type Constraint {
		Caracteristic_Ref : Characteristic;
		TheClass_Ref : Class;
		RelationSchip_Ref : RelationSchip*;
	};

	type Operation {
		Detail_ContRef : MetaData?;
		InCharacteristic_ContRef : Characteristic+;
		AffectFeature_ContRef : Class*;
		Steriotype_Ref : Steriotype?;
		Behaviour_Ref : Class;
	};

	type Characteristic {
		Details_ContRef : MetaData?;
		Rule_ContRef : BusnissRule?;
		Operations_Ref : Operation;
		TheClass_Ref : Class;
		RelationSchip_Ref : RelationSchip;
		Constraint_Ref : Constraint?;
	};

	type BusnissRule {
		Characteristic_Ref : Characteristic;
	};

	type MetaData {
		Source_ContRef : Source?;
		Characteristic_Ref : Characteristic;
		Operations_Ref : Operation;
		TheClass_Ref : Class;
	};

	type Source {
		MetaData_Ref : MetaData;
	};

	type Domain {
		DescriptiveAttribute_Ref : DescriptiveAttribute+;
	};

	type DescriptiveAttribute : Characteristic {
		TempsDef_ContRef : Temporality?;
		SpecialDef_ContRef : Geometry?;
		Steriotype_Ref : Steriotype?;
		Domain_Ref : Domain?;
	};

	type Geometry : PerceptorySteriotype, Characteristic {
		TempsDef_Ref : Temporality?;
		DescriptiveAttributeg_Ref : DescriptiveAttribute;
	};

	type Temporality : PerceptorySteriotype, Characteristic {
		Geometry_Ref : Geometry?;
		DescriptiveAttributet_Ref : DescriptiveAttribute;
	};

	type VisualInfo : PerceptorySteriotype, Characteristic;

	type Value {
		EnumeratedDomain_Ref : EnumeratedDomain;
	};

	type RangeDomain : Domain;

	type EnumeratedDomain : Domain {
		Value_ContRef : Value+;
	};

	type PerceptorySteriotype : Steriotype;
}