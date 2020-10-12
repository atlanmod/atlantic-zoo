module JAVA {

	type Modifier {
		Visibility_Att : Text;
		State_Att : Text;
		Name_Att : Text;
	};

	type Class : Modifier {
		SuperClass_Ref : Class?;
		Implement_Ref : Interface*;
		Methods_ContRef : Method*;
		Fields_ContRef : Field*;
	};

	type Interface : Modifier {
		SuperInterface_Ref : Interface*;
		ImplementedBy_Ref : Class*;
		AbstractMethods_ContRef : Method*;
		Constants_ContRef : Field*;
	};

	type Method : Modifier {
		Share_Att : Logical;
		Class_Ref : Class;
		Interface_Ref : Interface;
		ResultOf_Ref : Type?;
		Parameters_ContRef : Parameter*;
	};

	type Field : Modifier {
		Share_Att : Logical;
		Class_Ref : Class;
		Interface_Ref : Interface;
		Value_ContRef : Value;
		TypeOf_Ref : Type;
	};

	type Value;

	type Parameter {
		Name_Att : Text;
		TypeOf_Ref : Type?;
		Owner_Ref : Method;
	};

	type Type;

	type ReferenceType : Type {
		Reference_Ref : Class;
	};

	type PrimitiveType : Type;

	type Int : PrimitiveType;
}