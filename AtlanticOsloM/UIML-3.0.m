module MetamodelRoot {

	type @[UIML.UIML] {
		Head_ContRef : @[UIML.Header]?;
		Templates_ContRef : @[Template.Template]*;
		Interfaces_ContRef : @[Interface.Interface]*;
		Peers_ContRef : @[Peer.Peer]*;
	};

	type @[UIML.Header] {
		Metas_ContRef : @[UIML.MetaData]*;
	};

	type @[UIML.MetaData] {
		Name_Att : Text;
		Content_Att : Text;
	};

	type @[Peer.Peer] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Presentations_ContRef : @[Peer.Presentation]*;
		Logics_ContRef : @[Peer.Logic]*;
	};

	type @[Peer.Presentation] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Base_Att : Text;
		Source_Ref : @[Interface.Source]?;
		DClasses_ContRef : @[Peer.DClass]*;
	};

	type @[Peer.Logic] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		DComponents_ContRef : @[Peer.DComponent]*;
	};

	type @[Peer.DComponent] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		MapsTo_Att : Text;
		Location_Att : Text;
		Source_Ref : @[Interface.Source]?;
		DMethods_ContRef : @[Peer.DMethod]*;
	};

	type @[Peer.DClass] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		MapsTo_Att : Text;
		MapsType_Att : Text;
		Source_Ref : @[Interface.Source]?;
		DMethods_ContRef : @[Peer.DMethod]*;
		DProperties_ContRef : @[Peer.DProperty]*;
		Events_ContRef : @[Interface.Event]*;
		Listeners_ContRef : @[Peer.Listener]*;
	};

	type @[Peer.DProperty] {
		Id_Att : Text;
		MapsType_Att : @[Peer.MapsTypeKind];
		MapsTo_Att : Text;
		ReturnType_Att : Text;
		DMethods_ContRef : @[Peer.DMethod]*;
		DParams_ContRef : @[Peer.DParam]*;
	};

	type @[Peer.DMethod] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		MapsTo_Att : Text;
		ReturnType_Att : Text;
		Source_Ref : @[Interface.Source]?;
		DParams_ContRef : @[Peer.DParam]*;
		Script_ContRef : @[Peer.Script]?;
	};

	type @[Peer.DParam] {
		Id_Att : Text;
		Type_Att : Text;
		Value_Att : Text;
	};

	type @[Peer.Script] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		Type_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Value_Att : Text;
		Source_Att : Text;
	};

	type @[Peer.Listener] {
		Class_Att : Text;
		Attacher_Att : Text;
	};

	type @[Peer.UsedInTagKind] {"event", "listener", "part"};

	type @[Peer.MapsTypeKind] {"attribute", "getMethod", "setMethod", "method"};

	type @[Interface.ExtensibleElement];

	type @[Interface.Source];

	type @[Interface.LocalSource] : @[Interface.Source] {
		Source_Ref : @[Interface.ExtensibleElement];
	};

	type @[Interface.RemoteSource] : @[Interface.Source] {
		Location_Att : Text;
	};

	type @[Interface.Interface] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Structure_ContRef : @[Interface.Structure]*;
		Style_ContRef : @[Interface.Style]*;
		Content_ContRef : @[Interface.Content]*;
		Behavior_ContRef : @[Interface.Behavior]*;
	};

	type @[Interface.Structure] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Parts_ContRef : @[Interface.Part]*;
	};

	type @[Interface.Part] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Class_Att : Text;
		WherePart_Att : Text;
		Source_Ref : @[Interface.Source]?;
		Style_ContRef : @[Interface.Style]?;
		Content_ContRef : @[Interface.Content]?;
		Behavior_ContRef : @[Interface.Behavior]?;
		Parts_ContRef : @[Interface.Part]*;
		Repeats_ContRef : @[Interface.Repeat]*;
	};

	type @[Interface.Style] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Properties_ContRef : @[Interface.Property]*;
	};

	type @[Interface.Property] : @[Interface.ExtensibleElement] {
		Name_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Values_Att : Text;
		Parts_Ref : @[Interface.Part]*;
		Events_Ref : @[Interface.Event]*;
		Source_Ref : @[Interface.Source]?;
		Constants_ContRef : @[Interface.Constant]*;
		Properties_ContRef : @[Interface.Property]*;
		References_ContRef : @[Interface.Reference]*;
		Calls_ContRef : @[Interface.Call]*;
		Iterators_ContRef : @[Interface.Iterator]*;
	};

	type @[Interface.Content] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Constants_ContRef : @[Interface.Constant]*;
	};

	type @[Interface.Behavior] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Rules_ContRef : @[Interface.Rule]*;
	};

	type @[Interface.Repeat] {
		Iterator_ContRef : @[Interface.Iterator];
		Parts_ContRef : @[Interface.Part]+;
	};

	type @[Interface.Constant] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Model_Att : Text;
		Value_Att : Text;
		Source_Ref : @[Interface.Source]?;
		Constants_ContRef : @[Interface.Constant]*;
	};

	type @[Interface.Reference] {
		Constant_Ref : @[Interface.Constant]?;
	};

	type @[Interface.Rule] : @[Interface.ExtensibleElement] {
		Id_Att : Text;
		How_Att : @[Interface.HowKind]?;
		Export_Att : @[Interface.ExportKind]?;
		Source_Ref : @[Interface.Source]?;
		Condition_ContRef : @[Interface.Condition];
		Action_ContRef : @[Interface.Action];
	};

	type @[Interface.Condition];

	type @[Interface.EventCondition] : @[Interface.Condition] {
		Event_ContRef : @[Interface.Event];
	};

	type @[Interface.EqualCondition] : @[Interface.Condition] {
		Equal_ContRef : @[Interface.Equal];
	};

	type @[Interface.OpCondition] : @[Interface.Condition] {
		Op_ContRef : @[Interface.Operation];
	};

	type @[Interface.Action];

	type @[Interface.Action_1] : @[Interface.Action] {
		Event_Ref : @[Interface.Event]?;
		Properties_ContRef : @[Interface.Property]*;
		Calls_ContRef : @[Interface.Call]*;
		Restructures_ContRef : @[Interface.Restructure]*;
	};

	type @[Interface.Action_2] : @[Interface.Action] {
		WhenTrue_Ref : @[Interface.WhenTrue]?;
		WhenFalse_Ref : @[Interface.WhenFalse]?;
		ByDefault_Ref : @[Interface.ByDefault]?;
	};

	type @[Interface.Call] {
		Name_Att : Text;
		Params_ContRef : @[Interface.Parameter]*;
	};

	type @[Interface.Parameter] {
		Name_Att : Text;
	};

	type @[Interface.PropertyParameter] : @[Interface.Parameter] {
		Property_Ref : @[Interface.Property];
	};

	type @[Interface.ReferenceParameter] : @[Interface.Parameter] {
		Reference_Ref : @[Interface.Reference];
	};

	type @[Interface.CallParameter] : @[Interface.Parameter] {
		Call_Ref : @[Interface.Call];
	};

	type @[Interface.OperationParameter] : @[Interface.Parameter] {
		Op_Ref : @[Interface.Operation];
	};

	type @[Interface.EventParameter] : @[Interface.Parameter] {
		Event_Ref : @[Interface.Event];
	};

	type @[Interface.ConstantParameter] : @[Interface.Parameter] {
		Constant_Ref : @[Interface.Constant];
	};

	type @[Interface.IteratorParameter] : @[Interface.Parameter] {
		Iterator_Ref : @[Interface.Iterator];
	};

	type @[Interface.Iterator] {
		Id_Att : Text;
	};

	type @[Interface.ConstantIterator] : @[Interface.Iterator] {
		Constant_ContRef : @[Interface.Constant];
	};

	type @[Interface.PropertyIterator] : @[Interface.Iterator] {
		Property_ContRef : @[Interface.Property];
	};

	type @[Interface.CallIterator] : @[Interface.Iterator] {
		Call_ContRef : @[Interface.Call];
	};

	type @[Interface.TextIterator] : @[Interface.Iterator] {
		Value_Att : Integer32;
	};

	type @[Interface.Event] {
		Class_Att : Text;
		Parts_Ref : @[Interface.Part]*;
	};

	type @[Interface.Equal] {
		Event_Ref : @[Interface.Event];
	};

	type @[Interface.EqualToConstant] : @[Interface.Equal] {
		Constant_Ref : @[Interface.Constant];
	};

	type @[Interface.EqualToProperty] : @[Interface.Equal] {
		Property_Ref : @[Interface.Property];
	};

	type @[Interface.EqualToReference] : @[Interface.Equal] {
		Reference_Ref : @[Interface.Reference];
	};

	type @[Interface.EqualToOperation] : @[Interface.Equal] {
		Op_Ref : @[Interface.Operation];
	};

	type @[Interface.Operation] {
		Name_Att : Text;
		Constants_ContRef : @[Interface.Constant]*;
		Properties_ContRef : @[Interface.Property]*;
		References_ContRef : @[Interface.Reference]*;
		Calls_ContRef : @[Interface.Call]*;
		Ops_ContRef : @[Interface.Operation]*;
		Events_ContRef : @[Interface.Event]*;
	};

	type @[Interface.Restructure] : @[Interface.ExtensibleElement] {
		How_Att : @[Interface.HowKind]?;
		AtPart_Ref : @[Interface.Part]?;
		WherePart_Ref : @[Interface.Part]?;
		Source_Ref : @[Interface.Source]?;
		Template_ContRef : @[Template.Template]?;
	};

	type @[Interface.Branch] {
		Properties_ContRef : @[Interface.Property]*;
		Calls_ContRef : @[Interface.Call]*;
		Restructure_ContRef : @[Interface.Restructure]?;
		Op_ContRef : @[Interface.Operation]?;
		Equal_ContRef : @[Interface.Equal]?;
		Event_ContRef : @[Interface.Event]?;
	};

	type @[Interface.WhenTrue] : @[Interface.Branch];

	type @[Interface.WhenFalse] : @[Interface.Branch];

	type @[Interface.ByDefault] : @[Interface.Branch];

	type @[Interface.HowKind] {"append", "cascade", "replace", "union", "delete"};

	type @[Interface.ExportKind] {"hidden", "optional", "required"};

	type @[Interface.WhereKind] {"first", "last", "before", "after"};

	type @[Template.Template] {
		Id_Att : Text;
	};

	type @[Template.BehaviorTemplate] : @[Template.Template] {
		Behavior_ContRef : @[Interface.Behavior];
	};

	type @[Template.DClassTemplate] : @[Template.Template] {
		DClass_ContRef : @[Peer.DClass];
	};

	type @[Template.DComponentTemplate] : @[Template.Template] {
		DComponent_ContRef : @[Peer.DComponent];
	};

	type @[Template.ConstantTemplate] : @[Template.Template] {
		Constant_ContRef : @[Interface.Constant];
	};

	type @[Template.ContentTemplate] : @[Template.Template] {
		Content_ContRef : @[Interface.Content];
	};

	type @[Template.InterfaceTemplate] : @[Template.Template] {
		Interface_ContRef : @[Interface.Interface];
	};

	type @[Template.LogicTemplate] : @[Template.Template] {
		Logic_ContRef : @[Peer.Logic];
	};

	type @[Template.PartTemplate] : @[Template.Template] {
		Part_ContRef : @[Interface.Part];
	};

	type @[Template.PeerTemplate] : @[Template.Template] {
		Peer_ContRef : @[Peer.Peer];
	};

	type @[Template.PresentationTemplate] : @[Template.Template] {
		Presentation_ContRef : @[Peer.Presentation];
	};

	type @[Template.PropertyTemplate] : @[Template.Template] {
		Property_ContRef : @[Interface.Property];
	};

	type @[Template.RestructureTemplate] : @[Template.Template] {
		Restructure_ContRef : @[Interface.Restructure];
	};

	type @[Template.RuleTemplate] : @[Template.Template] {
		Rule_ContRef : @[Interface.Rule];
	};

	type @[Template.ScriptTemplate] : @[Template.Template] {
		Script_ContRef : @[Peer.Script];
	};

	type @[Template.StructureTemplate] : @[Template.Template] {
		Structure_ContRef : @[Interface.Structure];
	};

	type @[Template.StyleTemplate] : @[Template.Template] {
		Style_ContRef : @[Interface.Style];
	};
}