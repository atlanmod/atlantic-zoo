module MetamodelRoot {

	type @[PluginEclipse.LocatedElement] {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type @[PluginEclipse.Resolution] {"Mandatory", "Optional"};

	type @[PluginEclipse.Visibility] {"Private", "Reexport"};

	type @[PluginEclipse.Eclipse] : @[PluginEclipse.LocatedElement] {
		Bundles_ContRef : @[PluginEclipse.Bundle]+;
		Packages_ContRef : @[PluginEclipse.Package]*;
	};

	type @[PluginEclipse.Bundle] : @[PluginEclipse.LocatedElement] {
		SymbolicName_Att : Text;
		Singleton_Att : Logical;
		ManifestVersion_Att : Integer32;
		Require_ContRef : @[PluginEclipse.RequiredBundle]*;
		Version_ContRef : @[PluginEclipse.Version];
		Export_ContRef : @[PluginEclipse.ExportedPackage]*;
		Import_ContRef : @[PluginEclipse.ImportedPackage]*;
		Packages_ContRef : @[PluginEclipse.Package]*;
	};

	type @[PluginEclipse.RequireBundleAttribute] : @[PluginEclipse.LocatedElement];

	type @[PluginEclipse.AttResolution] : @[PluginEclipse.RequireBundleAttribute] {
		Value_Att : @[PluginEclipse.Resolution];
	};

	type @[PluginEclipse.AttVisibility] : @[PluginEclipse.RequireBundleAttribute] {
		Value_Att : @[PluginEclipse.Visibility];
	};

	type @[PluginEclipse.Range] : @[PluginEclipse.RequireBundleAttribute] {
		IsLeftInclusive_Att : Logical;
		IsRightInclusive_Att : Logical;
		LowerBound_ContRef : @[PluginEclipse.Version];
		UpperBound_ContRef : @[PluginEclipse.Version];
	};

	type @[PluginEclipse.Version] : @[PluginEclipse.LocatedElement] {
		Major_Att : Integer32;
		Minor_Att : Integer32;
		Micro_Att : Integer32;
		Qualification_Att : Text;
	};

	type @[PluginEclipse.RequiredBundle] : @[PluginEclipse.LocatedElement] {
		RequireBundleAttribute_ContRef : @[PluginEclipse.RequireBundleAttribute]*;
		Bundle_Ref : @[PluginEclipse.Bundle];
	};

	type @[PluginEclipse.ImportedPackage] : @[PluginEclipse.LocatedElement] {
		Resolution_Att : @[PluginEclipse.Resolution];
		Package_Ref : @[PluginEclipse.Package];
		Range_ContRef : @[PluginEclipse.Range]?;
	};

	type @[PluginEclipse.ExportedPackage] : @[PluginEclipse.LocatedElement] {
		Package_Ref : @[PluginEclipse.Package];
		Version_ContRef : @[PluginEclipse.Version];
		XFriends_ContRef : @[PluginsEclipse.Xfriends];
	};

	type @[PluginEclipse.Package] : @[PluginEclipse.LocatedElement] {
		Fqn_Att : Text;
		ImportedBy_Ref : @[PluginEclipse.ImportedPackage]*;
		ExportedBy_Ref : @[PluginEclipse.ExportedPackage]?;
	};

	type @[PluginsEclipse.Xfriends] : @[PluginEclipse.LocatedElement] {
		Bundles_Ref : @[PluginEclipse.Bundle]+;
	};

	type @[PluginsEclipse.Xinternal] : @[PluginEclipse.ExportedPackage] {
		Value_Att : Logical;
	};
}