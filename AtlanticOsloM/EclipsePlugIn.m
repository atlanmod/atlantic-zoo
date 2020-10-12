module EclipsePlugIn {

	type Application {
		Name_Att : Text;
		Version_Att : Text;
		Author_Att : Text;
		ExtensionPoints_ContRef : ExtensionPoint+;
	};

	type ExtensionPoint {
		Name_Att : Text;
		Id_Att : Text;
		Application_Ref : Application;
		Descriptions_Ref : Description*;
		PlugIn_Ref : PlugIn;
	};

	type Description {
		XmlSchema_Att : Text;
		ExtensionPoints_Ref : ExtensionPoint*;
	};

	type Extension {
		Name_Att : Text;
		Id_Att : Text;
		IsConfiguredInto_Ref : ExtensionPoint;
	};

	type PlugIn {
		Id_Att : Text;
		DisplayableName_Att : Text;
		Version_Att : Text;
		Supplier_Att : Text;
		Configures_Ref : Extension+;
		ExtensionPoints_ContRef : ExtensionPoint*;
		Requires_Ref : PlugIn*;
		Uses_Ref : Librairy*;
	};

	type Librairy {
		Name_Att : Text;
		PlugIn_Ref : PlugIn;
		Classes_ContRef : Class+;
	};

	type Class {
		Name_Att : Text;
		Librairy_Ref : Librairy;
	};
}