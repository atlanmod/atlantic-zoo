module OCLValues {

	type Value {
		Type_ContRef : Type;
		BagValue_Ref : BagValue*;
		SequenceValue_Ref : SequenceValue*;
		SetValue_Ref : SetValue*;
	};

	type Type {
		Value_Ref : Value*;
	};

	type BasicValue : Value;

	type IntegerValue : BasicValue {
		Val_Att : Integer32;
	};

	type RealValue : BasicValue {
		Val_Att : Double;
	};

	type StringValue : BasicValue {
		Val_Att : Text;
	};

	type BooleanValue : BasicValue {
		Val_Att : Logical;
	};

	type ObjectValue : Value {
		Object_ContRef : Object;
	};

	type Object {
		ObjectValue_Ref : ObjectValue?;
	};

	type EnumValue : Value {
		EnumLiteral_ContRef : EnumLiteral;
	};

	type EnumLiteral {
		EnumValue_Ref : EnumValue?;
	};

	type UndefinedValue : Value;

	type CollectionValue : Value;

	type BagValue {
		Elements_ContRef : Value*;
	};

	type SequenceValue {
		Elements_ContRef : Value*;
	};

	type SetValue {
		Elements_ContRef : Value*;
	};

	type Count {
		Num_Att : Integer32;
	};
}