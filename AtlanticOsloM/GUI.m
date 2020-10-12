module GUI {

	type LocatedElement {
		Location_Att : Text;
	};

	type Named : LocatedElement {
		Name_Att : Text;
	};

	type GUI : Named {
		GuiTabs_ContRef : Tab*;
	};

	type Tab : Named {
		Title_Att : Text;
		Gui_Ref : GUI;
		Group_Ref : Group;
	};

	type Composant : Named {
		ComposantGroup_Ref : Group;
	};

	type Layout {"default", "horizontal", "vertical"};

	type Group : Composant {
		Title_Att : Text;
		Layout_Att : Layout;
		Description_Att : Text;
		TabGroup_Ref : Tab?;
		Composants_ContRef : Composant*;
	};

	type Label : Composant {
		Text_Att : Text;
	};

	type TextArea : Composant {
		Text_Att : Text;
		NbRows_Att : Integer32;
	};

	type Table : Composant {
		TabColumns_ContRef : Column*;
	};

	type Column : LocatedElement {
		Title_Att : Text;
		ColumnTab_Ref : Table;
	};

	type ComboBox : Composant {
		ListRows_ContRef : Row*;
	};

	type Row : Composant {
		RowList_Ref : ComboBox;
		Text_Att : Text;
		ListItems_ContRef : Item*;
	};

	type Item : Composant {
		ItemList_Ref : Row;
		Text_Att : Text;
	};

	type Button : Composant {
		Title_Att : Text;
	};
}