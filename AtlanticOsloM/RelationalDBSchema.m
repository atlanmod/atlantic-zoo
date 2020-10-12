module RelationalDBSchema {

	type NamedElement {
		Name_Att : Text;
	};

	type DataBase : NamedElement {
		SGBDname_Att : Text;
		Tables_ContRef : Table*;
	};

	type Table : NamedElement {
		Database_Ref : DataBase;
		Columns_ContRef : Column*;
		Key_Ref : Column*;
	};

	type Column : NamedElement {
		DataType_Att : Text;
		Null_Att : Logical;
		DefaultValue_Att : Text;
		Owner_Ref : Table;
		KeyOf_Ref : Table?;
	};
}