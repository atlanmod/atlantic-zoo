module SimpleSBVR {

	type Root {
		Elements_ContRef : Element*;
	};

	type Element {
		ObjectName_Att : Text;
	};

	type Representation : Element {
		Meaning_Ref : Meaning;
	};

	type Designation : Representation {
		Text_Ref : Text;
	};

	type Text : Element {
		Value_Att : Text;
	};

	type Meaning : Element {
		Representations_Ref : Representation*;
	};

	type Concept : Meaning;

	type NounConcept : Concept;

	type ObjectType : NounConcept {
		Specializes_Ref : ObjectType?;
		Generalizes_Ref : ObjectType*;
	};

	type IndividualConcept : NounConcept {
		InstanceOf_Ref : ObjectType?;
	};

	type DataType : NounConcept;

	type NonEmptyString : DataType {
		Value_Att : Text;
	};

	type NonNegativeInteger : DataType {
		Value_Att : Integer32;
	};

	type FactType : Concept;

	type BinaryFactType : FactType {
		Role1_Ref : FactTypeRole;
		Role2_Ref : FactTypeRole;
	};

	type IsPropertyOfFactType : BinaryFactType;

	type AssociativeFactType : BinaryFactType;

	type CategorizationFactType : BinaryFactType;

	type ObjectificationFactType : BinaryFactType;

	type Role : Element {
		NounConcept_Ref : NounConcept;
	};

	type FactTypeRole : Role;

	type LogicalFormulation : Meaning;

	type AtomicFormulation : LogicalFormulation {
		IsBasedOn_Ref : FactType;
	};

	type BinaryAtomicFormulation : AtomicFormulation {
		RoleBinding1_Ref : RoleBinding;
		RoleBinding2_Ref : RoleBinding;
	};

	type NecessityFormulation : LogicalFormulation;

	type Quantification : LogicalFormulation {
		IntroducedVariable_Ref : Variable;
		ScopesOver_Ref : LogicalFormulation;
	};

	type UniversalQuantification : Quantification;

	type AtLeastNQuantification : Quantification {
		MinCardinality_Ref : NonNegativeInteger;
	};

	type ExactlyNQuantification : Quantification {
		Cardinality_Ref : NonNegativeInteger;
	};

	type AtMostNQuantification : Quantification {
		MaxCardinality_Ref : NonNegativeInteger;
	};

	type BindableTarget : Element;

	type Variable : BindableTarget {
		RangesOver_Ref : ObjectType;
	};

	type RoleBinding : Element {
		OccursIn_Ref : AtomicFormulation;
		IsOf_Ref : FactType;
		BindsTo_Ref : BindableTarget;
	};
}