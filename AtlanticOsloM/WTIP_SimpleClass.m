module SimpleClass {

	type Classifier {
		Name_Att : Text;
	};

	type Class : Classifier {
		Is_persistent_Att : Logical;
		Parent_Ref : Class?;
		Attrs_ContRef : Attribute*;
	};

	type PrimitiveDataType : Classifier;

	type Association {
		Name_Att : Text;
		Src_Ref : Class;
		Dest_Ref : Class;
	};

	type Attribute {
		Name_Att : Text;
		Is_primary_Att : Logical;
		Type_Ref : Classifier;
	};
}