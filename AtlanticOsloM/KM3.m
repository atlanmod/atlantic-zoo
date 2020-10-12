module KM3 {

	type LocatedElement {
		Location_Att : Text;
	};

	type ModelElement : LocatedElement {
		Name_Att : Text;
		Package_Ref : Package;
	};

	type Classifier : ModelElement;

	type DataType : Classifier;

	type Enumeration : Classifier {
		Literals_ContRef : EnumLiteral*;
	};

	type EnumLiteral : ModelElement;

	type Class : Classifier {
		IsAbstract_Att : Logical;
		Supertypes_Ref : Class*;
		StructuralFeatures_ContRef : StructuralFeature*;
	};

	type StructuralFeature : ModelElement {
		Lower_Att : Integer32;
		Upper_Att : Integer32;
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
		Owner_Ref : Class;
		Type_Ref : Classifier;
	};

	type Attribute : StructuralFeature;

	type Reference : StructuralFeature {
		IsContainer_Att : Logical;
		Opposite_Ref : Reference?;
	};

	type Package : ModelElement {
		Contents_ContRef : ModelElement*;
		Metamodel_Ref : Metamodel;
	};

	type Metamodel : LocatedElement {
		Contents_ContRef : Package*;
	};
}