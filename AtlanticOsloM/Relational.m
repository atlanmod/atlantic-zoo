module Relational {

	type Named {
		Name_Att : Text;
	};

	type Table : Named {
		Col_ContRef : Column*;
		Key_Ref : Column*;
	};

	type Column : Named {
		Owner_Ref : Table;
		KeyOf_Ref : Table?;
		Type_Ref : Type;
	};

	type Type : Named;
}