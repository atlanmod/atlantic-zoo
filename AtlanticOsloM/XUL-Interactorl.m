module MetamodelRoot {

	type @[XULInteractorMetaModel.UIModel] {
		Windows_ContRef : @[XULInteractorMetaModel.Windows]?;
		Functions_ContRef : @[XULInteractorMetaModel.Function]*;
	};

	type @[XULInteractorMetaModel.Windows] : @[XULInteractorMetaModel.Container] {
		Id_Att : Text;
		Title_Att : Text;
		Orient_Att : @[XULInteractorMetaModel.Orients]?;
		Style_Att : Text;
		Headers_ContRef : @[XULInteractorMetaModel.HeaderCss]*;
		HeadersJScript_Ref : @[XULInteractorMetaModel.HeaderJScript]*;
	};

	type @[XULInteractorMetaModel.Button] : @[XULInteractorMetaModel.Containement] {
		Tooltiptext_Att : Text;
		Image_Att : Text;
	};

	type @[XULInteractorMetaModel.Orients] {"horizontal", "vertical"};

	type @[XULInteractorMetaModel.Image] : @[XULInteractorMetaModel.Containement] {
		Src_Att : Text;
	};

	type @[XULInteractorMetaModel.RadioGroup] : @[XULInteractorMetaModel.Containement] {
		Radiobuttons_ContRef : @[XULInteractorMetaModel.Radio]*;
	};

	type @[XULInteractorMetaModel.Radio] : @[XULInteractorMetaModel.Interactor] {
		Id_Att : Text;
		Label_Att : Text;
		Selected_Att : Logical;
		Disabled_Att : Logical;
	};

	type @[XULInteractorMetaModel.ListBox] : @[XULInteractorMetaModel.Containement] {
		Rows_Att : Integer32;
		Listitems_ContRef : @[XULInteractorMetaModel.ListItem]*;
	};

	type @[XULInteractorMetaModel.ListItem] : @[XULInteractorMetaModel.Interactor] {
		Label_Att : Text;
		Value_Att : Text;
	};

	type @[XULInteractorMetaModel.MenuList] : @[XULInteractorMetaModel.Containement] {
		Menuitems_ContRef : @[XULInteractorMetaModel.MenuItem]*;
	};

	type @[XULInteractorMetaModel.MenuItem] : @[XULInteractorMetaModel.Interactor] {
		Label_Att : Text;
	};

	type @[XULInteractorMetaModel.Vbox] : @[XULInteractorMetaModel.Container];

	type @[XULInteractorMetaModel.Hbox] : @[XULInteractorMetaModel.Container];

	type @[XULInteractorMetaModel.Containement] : @[XULInteractorMetaModel.Interactor] {
		Style_Att : Text;
		Accesskey_Att : Text;
		Class_Att : Text;
		Maxlength_Att : Integer32;
		Label_Att : Text;
		Orient_Att : @[XULInteractorMetaModel.Orients]?;
		Minlength_Att : Text;
		Onclick_Att : Text;
		Disabled_Att : Text;
	};

	type @[XULInteractorMetaModel.GroupBox] : @[XULInteractorMetaModel.Container];

	type @[XULInteractorMetaModel.Container] : @[XULInteractorMetaModel.Interactor] {
		XulInteractors_ContRef : @[XULInteractorMetaModel.Interactor]*;
	};

	type @[XULInteractorMetaModel.Interactor] {
		Flex_Att : Integer32;
		Id_Att : Text;
		Stat_Att : Text;
		Style_Att : Text;
		Events_ContRef : @[XULInteractorMetaModel.Event]*;
	};

	type @[XULInteractorMetaModel.TabBox] : @[XULInteractorMetaModel.Containement] {
		TabPanels_ContRef : @[XULInteractorMetaModel.Interactor]*;
	};

	type @[XULInteractorMetaModel.TextBox] : @[XULInteractorMetaModel.Containement] {
		Multiline_Att : Logical;
		Value_Att : Text;
	};

	type @[XULInteractorMetaModel.Spacer] : @[XULInteractorMetaModel.Containement];

	type @[XULInteractorMetaModel.Label] : @[XULInteractorMetaModel.Containement] {
		Value_Att : Text;
		Control_Att : Text;
	};

	type @[XULInteractorMetaModel.Grid] : @[XULInteractorMetaModel.Containement] {
		Columns_ContRef : @[XULInteractorMetaModel.Column]*;
		Rows_ContRef : @[XULInteractorMetaModel.Row]*;
	};

	type @[XULInteractorMetaModel.Row] : @[XULInteractorMetaModel.Container];

	type @[XULInteractorMetaModel.Column] : @[XULInteractorMetaModel.Container];

	type @[XULInteractorMetaModel.CheckBox] : @[XULInteractorMetaModel.Containement] {
		Checked_Att : Logical;
	};

	type @[XULInteractorMetaModel.Caption] : @[XULInteractorMetaModel.Containement] {
		Label_Att : Text;
	};

	type @[XULInteractorMetaModel.Description] : @[XULInteractorMetaModel.Containement] {
		Value_Att : Text;
	};

	type @[XULInteractorMetaModel.HeaderCss] {
		Ref_Att : Text;
		Type_Att : Text;
	};

	type @[XULInteractorMetaModel.HeaderJScript] {
		Ref_Att : Text;
	};

	type @[XULInteractorMetaModel.TabPanel] : @[XULInteractorMetaModel.Container] {
		Id_Att : Text;
		Orient_Att : @[XULInteractorMetaModel.Orients]?;
	};

	type @[XULInteractorMetaModel.Event] {
		FunctionCallParameters_ContRef : @[XULInteractorMetaModel.Parameter]*;
		FunctionCalledName_Att : Text;
		Name_Att : Text;
	};

	type @[XULInteractorMetaModel.Parameter] {
		Value_Att : Text;
		Name_Att : Text;
	};

	type @[XULInteractorMetaModel.OnClick] : @[XULInteractorMetaModel.Event];

	type @[XULInteractorMetaModel.Function] {
		Name_Att : Text;
		FunctionUIModel_Ref : @[XULInteractorMetaModel.UIModel];
		Body_Att : Text;
	};
}