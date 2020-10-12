module EclipseLaunchConfigurations {

	type LaunchConfiguration {
		Type_Att : Text;
		Attributes_ContRef : Attribute*;
	};

	type Attribute {
		Key_Att : Text;
	};

	type StringAttribute : Attribute {
		Value_Att : Text;
	};

	type BooleanAttribute : Attribute {
		Value_Att : Logical;
	};

	type MapAttribute : Attribute {
		Entries_ContRef : MapEntry*;
	};

	type MapEntry : StringAttribute {
		MapAttribute_Ref : MapAttribute;
	};

	type ListAttribute : Attribute {
		Entries_ContRef : ListEntry*;
	};

	type ListEntry {
		ListAttribute_Ref : ListAttribute;
		Value_Att : Text;
	};
}