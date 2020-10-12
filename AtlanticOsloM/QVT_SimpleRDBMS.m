module SimpleRDBMS {

	type RModelElement {
		Kind_Att : Text;
		Name_Att : Text;
	};

	type Schema : RModelElement {
		Tables_ContRef : Table*;
	};

	type Table : RModelElement {
		Schema_Ref : Schema;
		Column_ContRef : Column*;
		Key_ContRef : Key*;
		ForeignKey_ContRef : ForeignKey*;
	};

	type Column : RModelElement {
		Type_Att : Text;
		Owner_Ref : Table;
		Key_Ref : Key*;
		ForeignKey_Ref : ForeignKey*;
	};

	type Key : RModelElement {
		Owner_Ref : Table;
		Column_Ref : Column*;
		RefersToOpposite_Ref : ForeignKey*;
	};

	type ForeignKey : RModelElement {
		Column_Ref : Column*;
		Owner_Ref : Table;
		RefersTo_Ref : Key;
	};
}