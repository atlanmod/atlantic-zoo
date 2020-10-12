module RelationalDBContent {

	type NamedElement {
		Name_Att : Text;
	};

	type DataBase : NamedElement {
		SGBDname_Att : Text;
		Tables_ContRef : Table*;
	};

	type Table : NamedElement {
		Database_Ref : DataBase;
		Tuples_ContRef : Tuple*;
	};

	type Tuple {
		Owner_Ref : Table;
		Elements_ContRef : TupleElement*;
	};

	type TupleElement {
		Tuple_Ref : Tuple;
		Value_Att : Text;
	};
}