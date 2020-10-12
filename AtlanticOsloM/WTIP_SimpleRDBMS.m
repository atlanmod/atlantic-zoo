module SimpleRDBMS {

	type Table {
		Name_Att : Text;
		Fkeys_ContRef : FKey*;
		Pkey_Ref : Column*;
		Cols_ContRef : Column*;
	};

	type Column {
		Name_Att : Text;
		Type_Att : Text;
	};

	type FKey {
		References_Ref : Table;
		Cols_Ref : Column*;
	};
}