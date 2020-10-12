module MySQL {

	type NamedElement {
		Name_Att : Text;
	};

	type DataBase : NamedElement {
		Tables_ContRef : Table*;
	};

	type Table : NamedElement {
		Columns_ContRef : Column*;
		Database_Ref : DataBase;
	};

	type Column : NamedElement {
		Type_Att : Text;
		IsPrimaryKey_Att : Logical;
		Null_Att : Logical;
		DefaultValue_Att : Text;
		Comment_Att : Text;
		Table_Ref : Table;
	};

	type IntegerColumn : Column {
		IsAutoIncrement_Att : Logical;
	};

	type EnumColumn : Column {
		EnumSet_ContRef : EnumSet;
	};

	type EnumSet {
		EnumItems_ContRef : EnumItem*;
	};

	type EnumItem : NamedElement {
		EnumSet_Ref : EnumSet;
	};
}