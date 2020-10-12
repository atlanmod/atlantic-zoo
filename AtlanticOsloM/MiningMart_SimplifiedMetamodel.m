module SimplifiedMiningMart {

	type ModelElement;

	type Classifier : ModelElement;

	type StructuralFeature : ModelElement;

	type Class : Classifier {
		Name_Ref : String;
		Attributes_ContRef : Attribute+;
	};

	type DataType : Classifier {
		Attribute_Ref : Attribute;
	};

	type Attribute : StructuralFeature {
		Class_Ref : Class;
		Has_Ref : DataType;
	};

	type Concept : Class;

	type ColumnSet : Class;

	type Column : Attribute;

	type FeatureAttribute : Attribute;

	type Value : Attribute;

	type RoleRestriction : Attribute;

	type Integer : DataType;

	type String : DataType;

	type DomainDataType : DataType;
}