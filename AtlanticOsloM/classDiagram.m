module ClassDiagram {

	type Class : Classifier {
		NestedClassifier_ContRef : Classifier*;
	};

	type Property : TypedElement, MultiplicityElement, NamedElement {
		Aggregation_Att : AggregationKind?;
	};

	type Operation : NamedElement {
		OwnedParmeter_ContRef : Parameter*;
	};

	type Interface : Classifier {
		NestedClassifier_ContRef : Classifier*;
	};

	type Classifier : PackagedElement, Type {
		OwnedProperty_ContRef : Property*;
		OwnedOperation_ContRef : Operation*;
		OwnedElement_ContRef : Generalization*;
	};

	type Package : PackagedElement {
		OwnedPackagedElement_ContRef : PackagedElement*;
	};

	type Association : PackagedElement {
		OwnedEnd_ContRef : Property*;
		MemberEnd_Ref : Property*;
	};

	type PackagedElement : NamedElement;

	type Parameter : TypedElement, MultiplicityElement, NamedElement {
		Direction_Att : ParameterDirectionKind?;
	};

	type DataType : Classifier;

	type Enumeration : DataType {
		OwnedLiteral_ContRef : EnumerationLiteral*;
	};

	type AggregationKind {"none", "shared", "composite"};

	type Type : PackagedElement;

	type TypedElement {
		Type_Ref : Type?;
	};

	type ParameterDirectionKind {"IN", "INOUT", "OUT", "RETURN"};

	type MultiplicityElement {
		Upper_Att : Logical;
		Lower_Att : Logical;
	};

	type EnumerationLiteral : NamedElement;

	type NamedElement {
		Name_Att : Text;
	};

	type Generalization {
		General_Ref : Classifier?;
	};
}