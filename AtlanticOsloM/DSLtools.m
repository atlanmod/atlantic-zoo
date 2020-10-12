module DSL {

	type NamedElement {
		Name_Att : Text;
		Identity_Att : Text;
	};

	type LoadedElement : Namespace {
		IsLoaded_Att : Logical;
	};

	type Namespace : NamedElement {
		Namespace_Att : Text;
	};

	type DomainModel : LoadedElement {
		Classifiers_ContRef : Classifier*;
		Types_ContRef : Type*;
	};

	type Classifier : LoadedElement {
		IsAbstract_Att : Logical;
		Properties_ContRef : ValueProperty*;
		SuperType_Ref : Classifier?;
		SubTypes_Ref : Classifier*;
		DomainModel_Ref : DomainModel;
	};

	type Class : Classifier {
		IsSerializationRoot_Att : Logical;
	};

	type Relationship : Classifier {
		IsEmbedding_Att : Logical;
		Roles_ContRef : Role#2 .. 2;
	};

	type Role : NamedElement {
		Min_Att : Integer32;
		Max_Att : Integer32;
		IsUnbounded_Att : Logical;
		Accepts_Att : Text;
		IsOrdered_Att : Logical;
		IsNavigableFrom_Att : Logical;
		IsPropertyGenerator_Att : Logical;
		Source_Ref : Classifier;
		Type_Ref : Classifier;
		Relation_Ref : Relationship;
	};

	type ValueProperty : NamedElement {
		Owner_Ref : Classifier;
		Type_Ref : Type;
	};

	type Type : Namespace;

	type SimpleType : Type;

	type EnumerationLiteral : NamedElement {
		Value_Att : Integer32;
	};

	type Enumeration : Type {
		Literals_ContRef : EnumerationLiteral*;
	};
}