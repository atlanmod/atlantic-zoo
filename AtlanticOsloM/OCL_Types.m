module OCLTypes {

	type Type {
		Supertype_Ref : Type*;
		Subtype_Ref : Type*;
		CollectionType_ContRef : CollectionType*;
	};

	type BasicType : Type;

	type InstanceType : Type {
		Classifier_ContRef : Classifier;
	};

	type EnumType : Type {
		EnumLiteral_ContRef : EnumLiteral+;
	};

	type OclAnyType : Type;

	type OclTypeType : Type;

	type CollectionType : Type {
		ElementType_Ref : Type;
	};

	type IntegerType : BasicType;

	type RealType : BasicType;

	type StringType : BasicType;

	type BooleanType : BasicType;

	type Classifier {
		InstanceType_Ref : InstanceType?;
	};

	type EnumLiteral {
		EnumType_Ref : EnumType?;
	};

	type SetType : CollectionType;

	type SequenceType : CollectionType;

	type BagType : CollectionType;
}