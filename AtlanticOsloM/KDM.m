module KDM_MetaModel {

	type @[Action.ActionElement] : @[Code.AbstractCodeElement] {
		Kind_Att : Text;
		CodeElement_ContRef : @[Code.AbstractCodeElement]*;
		ActionRelation_ContRef : @[Action.AbstractActionRelationship]*;
	};

	type @[Action.AbstractActionRelationship] : @[Core.KDMRelationship];

	type @[Action.ControlFlow] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Action.ActionElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Calls] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.ControlElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Creates] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.Datatype];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Reads] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.DataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Writes] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.DataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.CompliesTo] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Flow] : @[Action.ControlFlow];

	type @[Action.TrueFlow] : @[Action.ControlFlow];

	type @[Action.FalseFlow] : @[Action.ControlFlow];

	type @[Action.GuardedFlow] : @[Action.ControlFlow];

	type @[Action.UsesType] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.Datatype];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Addresses] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.ComputationalObject];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.ActionRelationship] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Throws] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.DataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.Dispatches] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.DataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.EntryFlow] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Action.ActionElement];
		From_Ref : @[Code.ControlElement];
	};

	type @[Action.BlockUnit] : @[Action.ActionElement];

	type @[Action.ExceptionUnit] : @[Action.BlockUnit];

	type @[Action.TryUnit] : @[Action.ExceptionUnit];

	type @[Action.FinallyUnit] : @[Action.ExceptionUnit];

	type @[Action.CatchUnit] : @[Action.ExceptionUnit];

	type @[Action.ExitFlow] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Action.ActionElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Action.ExceptionFlow] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Action.ActionElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Build.AbstractBuildElement] : @[Core.KDMEntity] {
		BuildRelation_ContRef : @[Build.AbstractBuildRelationship]*;
	};

	type @[Build.BuildResource] : @[Build.AbstractBuildElement] {
		Implementation_Ref : @[Core.KDMEntity]*;
		GroupedBuild_Ref : @[Build.AbstractBuildElement]*;
		BuildElement_ContRef : @[Build.AbstractBuildElement]*;
	};

	type @[Build.BuildDescription] : @[Build.BuildResource] {
		Source_ContRef : @[Source.SourceRef]*;
		Text_Att : Text;
	};

	type @[Build.SymbolicLink] : @[Build.AbstractBuildElement];

	type @[Build.AbstractBuildRelationship] : @[Core.KDMRelationship];

	type @[Build.LinksTo] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.AbstractBuildElement];
		From_Ref : @[Build.SymbolicLink];
	};

	type @[Build.Consumes] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.AbstractBuildElement];
		From_Ref : @[Build.BuildStep];
	};

	type @[Build.BuildModel] : @[Kdm.KDMModel] {
		BuildElement_ContRef : @[Build.AbstractBuildElement]*;
	};

	type @[Build.BuildComponent] : @[Build.BuildResource];

	type @[Build.Supplier] : @[Build.AbstractBuildElement];

	type @[Build.Tool] : @[Build.AbstractBuildElement];

	type @[Build.BuildElement] : @[Build.AbstractBuildElement];

	type @[Build.BuildRelationship] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Build.AbstractBuildElement];
	};

	type @[Build.SuppliedBy] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.Supplier];
		From_Ref : @[Build.AbstractBuildElement];
	};

	type @[Build.Library] : @[Build.BuildResource];

	type @[Build.BuildStep] : @[Build.BuildResource];

	type @[Build.Produces] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.AbstractBuildElement];
		From_Ref : @[Build.BuildStep];
	};

	type @[Build.SupportedBy] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.Tool];
		From_Ref : @[Build.BuildStep];
	};

	type @[Build.BuildProduct] : @[Build.BuildResource];

	type @[Build.DescribedBy] : @[Build.AbstractBuildRelationship] {
		To_Ref : @[Build.BuildDescription];
		From_Ref : @[Build.BuildStep];
	};

	type @[Code.AbstractCodeElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		Comment_ContRef : @[Code.CommentUnit]*;
		CodeRelation_ContRef : @[Code.AbstractCodeRelationship]*;
	};

	type @[Code.CodeItem] : @[Code.AbstractCodeElement];

	type @[Code.ComputationalObject] : @[Code.CodeItem];

	type @[Code.ControlElement] : @[Code.ComputationalObject] {
		Type_Ref : @[Code.Datatype]?;
		EntryFlow_ContRef : @[Action.EntryFlow]*;
		CodeElement_ContRef : @[Code.AbstractCodeElement]*;
	};

	type @[Code.MethodUnit] : @[Code.ControlElement] {
		Kind_Att : @[Code.MethodKind]?;
		Export_Att : @[Code.ExportKind]?;
	};

	type @[Code.Module] : @[Code.CodeItem] {
		CodeElement_ContRef : @[Code.AbstractCodeElement]*;
	};

	type @[Code.CodeAssembly] : @[Code.Module];

	type @[Code.CallableUnit] : @[Code.ControlElement] {
		Kind_Att : @[Code.CallableKind]?;
	};

	type @[Code.Datatype] : @[Code.CodeItem];

	type @[Code.TemplateUnit] : @[Code.Datatype] {
		CodeElement_ContRef : @[Code.CodeItem]*;
	};

	type @[Code.TemplateParameter] : @[Code.Datatype];

	type @[Code.AbstractCodeRelationship] : @[Core.KDMRelationship];

	type @[Code.InstanceOf] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.TemplateUnit];
		From_Ref : @[Code.AbstractCodeElement];
	};

	type @[Code.CompilationUnit] : @[Code.Module];

	type @[Code.CodeModel] : @[Kdm.KDMModel] {
		CodeElement_ContRef : @[Code.AbstractCodeElement]*;
	};

	type @[Code.DerivedType] : @[Code.Datatype] {
		ItemUnit_ContRef : @[Code.ItemUnit];
	};

	type @[Code.ArrayType] : @[Code.DerivedType] {
		Size_Att : Integer32;
		IndexUnit_ContRef : @[Code.IndexUnit];
	};

	type @[Code.PrimitiveType] : @[Code.Datatype];

	type @[Code.BooleanType] : @[Code.PrimitiveType];

	type @[Code.CharType] : @[Code.PrimitiveType];

	type @[Code.ClassUnit] : @[Code.Datatype] {
		IsAbstract_Att : Logical;
		CodeElement_ContRef : @[Code.CodeItem]*;
	};

	type @[Code.CompositeType] : @[Code.Datatype] {
		ItemUnit_ContRef : @[Code.ItemUnit]*;
	};

	type @[Code.RecordType] : @[Code.CompositeType];

	type @[Code.EnumeratedType] : @[Code.Datatype] {
		Value_ContRef : @[Code.Value]*;
	};

	type @[Code.Extends] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.Datatype];
		From_Ref : @[Code.Datatype];
	};

	type @[Code.ScaledType] : @[Code.PrimitiveType];

	type @[Code.FloatType] : @[Code.PrimitiveType];

	type @[Code.HasType] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.Datatype];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.ImplementationOf] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.Implements] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.IntegerType] : @[Code.PrimitiveType];

	type @[Code.InterfaceUnit] : @[Code.Datatype] {
		CodeElement_ContRef : @[Code.CodeItem]*;
	};

	type @[Code.PointerType] : @[Code.DerivedType];

	type @[Code.DefinedType] : @[Code.Datatype] {
		Type_Ref : @[Code.Datatype];
		CodeElement_ContRef : @[Code.Datatype]?;
	};

	type @[Code.TypeUnit] : @[Code.DefinedType];

	type @[Code.RangeType] : @[Code.DerivedType] {
		Lower_Att : Integer32;
		Upper_Att : Integer32;
	};

	type @[Code.Signature] : @[Code.Datatype] {
		ParameterUnit_ContRef : @[Code.ParameterUnit]*;
	};

	type @[Code.DataElement] : @[Code.ComputationalObject] {
		Type_Ref : @[Code.Datatype];
		Ext_Att : Text;
		Size_Att : Integer32;
		CodeElement_ContRef : @[Code.Datatype]*;
	};

	type @[Code.StringType] : @[Code.PrimitiveType];

	type @[Code.ChoiceType] : @[Code.CompositeType];

	type @[Code.NamespaceUnit] : @[Code.CodeItem] {
		GroupedCode_Ref : @[Code.CodeItem]*;
	};

	type @[Code.VisibleIn] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.CommentUnit] : @[Core.ModelElement] {
		Text_Att : Text;
	};

	type @[Code.SharedUnit] : @[Code.CompilationUnit];

	type @[Code.DecimalType] : @[Code.PrimitiveType];

	type @[Code.DateType] : @[Code.PrimitiveType];

	type @[Code.TimeType] : @[Code.PrimitiveType];

	type @[Code.MethodKind] {"operator", "destructor", "method", "abstract", "virtual", "unknown", "constructor"};

	type @[Code.VoidType] : @[Code.PrimitiveType];

	type @[Code.ValueElement] : @[Code.DataElement];

	type @[Code.Value] : @[Code.ValueElement];

	type @[Code.ValueList] : @[Code.ValueElement] {
		ValueElement_ContRef : @[Code.ValueElement]*;
	};

	type @[Code.StorableUnit] : @[Code.DataElement] {
		Kind_Att : @[Code.StorableKind]?;
	};

	type @[Code.MemberUnit] : @[Code.DataElement] {
		Export_Att : @[Code.ExportKind]?;
	};

	type @[Code.ParameterUnit] : @[Code.DataElement] {
		Kind_Att : @[Code.ParameterKind]?;
		Pos_Att : Integer32;
	};

	type @[Code.ItemUnit] : @[Code.DataElement];

	type @[Code.IndexUnit] : @[Code.DataElement];

	type @[Code.SynonymType] : @[Code.DefinedType];

	type @[Code.SequenceType] : @[Code.DerivedType] {
		Size_Att : Integer32;
	};

	type @[Code.BagType] : @[Code.DerivedType] {
		Size_Att : Integer32;
	};

	type @[Code.SetType] : @[Code.DerivedType] {
		Size_Att : Integer32;
	};

	type @[Code.CodeElement] : @[Code.CodeItem];

	type @[Code.CodeRelationship] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.ParameterKind] {"byReference", "unknown", "exception", "return", "byValue", "catchall", "byName", "throws", "variadic"};

	type @[Code.ExportKind] {"private", "unknown", "public", "protected", "final"};

	type @[Code.LanguageUnit] : @[Code.Module];

	type @[Code.OrdinalType] : @[Code.PrimitiveType];

	type @[Code.BitstringType] : @[Code.PrimitiveType];

	type @[Code.OctetType] : @[Code.PrimitiveType];

	type @[Code.OctetstringType] : @[Code.PrimitiveType];

	type @[Code.BitType] : @[Code.PrimitiveType];

	type @[Code.StorableKind] {"global", "external", "static", "unknown", "register", "local"};

	type @[Code.CallableKind] {"external", "regular", "stored", "operator", "unknown"};

	type @[Code.Imports] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.CodeItem];
	};

	type @[Code.Package] : @[Code.Module];

	type @[Code.ParameterTo] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.AbstractCodeElement];
	};

	type @[Code.TemplateType] : @[Code.Datatype];

	type @[Code.PreprocessorDirective] : @[Code.AbstractCodeElement] {
		CodeElement_ContRef : @[Code.AbstractCodeElement]*;
	};

	type @[Code.MacroDirective] : @[Code.PreprocessorDirective];

	type @[Code.MacroUnit] : @[Code.PreprocessorDirective] {
		Kind_Att : @[Code.MacroKind]?;
	};

	type @[Code.ConditionalDirective] : @[Code.PreprocessorDirective];

	type @[Code.IncludeDirective] : @[Code.PreprocessorDirective];

	type @[Code.MacroKind] {"external", "unknown", "option", "undefined", "regular"};

	type @[Code.VariantTo] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.PreprocessorDirective];
		From_Ref : @[Code.PreprocessorDirective];
	};

	type @[Code.Expands] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.PreprocessorDirective];
		From_Ref : @[Code.PreprocessorDirective];
	};

	type @[Code.Redefines] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.PreprocessorDirective];
		From_Ref : @[Code.PreprocessorDirective];
	};

	type @[Code.GeneratedFrom] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.PreprocessorDirective];
		From_Ref : @[Code.AbstractCodeElement];
	};

	type @[Code.Includes] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.AbstractCodeElement];
		From_Ref : @[Code.PreprocessorDirective];
	};

	type @[Code.HasValue] : @[Code.AbstractCodeRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Code.CodeItem];
	};

	type @[Conceptual.ConceptualModel] : @[Kdm.KDMModel] {
		ConceptualElement_ContRef : @[Conceptual.AbstractConceptualElement]*;
	};

	type @[Conceptual.AbstractConceptualElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		Implementation_Ref : @[Core.KDMEntity]*;
		ConceptualRelation_ContRef : @[Conceptual.AbstractConceptualRelationship]*;
		Abstraction_ContRef : @[Action.ActionElement]*;
	};

	type @[Conceptual.TermUnit] : @[Conceptual.AbstractConceptualElement];

	type @[Conceptual.ConceptualContainer] : @[Conceptual.AbstractConceptualElement] {
		ConceptualElement_ContRef : @[Conceptual.AbstractConceptualElement]*;
	};

	type @[Conceptual.FactUnit] : @[Conceptual.ConceptualContainer];

	type @[Conceptual.AbstractConceptualRelationship] : @[Core.KDMRelationship];

	type @[Conceptual.ConceptualRelationship] : @[Conceptual.AbstractConceptualRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Conceptual.AbstractConceptualElement];
	};

	type @[Conceptual.BehaviorUnit] : @[Conceptual.ConceptualContainer];

	type @[Conceptual.RuleUnit] : @[Conceptual.ConceptualContainer];

	type @[Conceptual.ScenarioUnit] : @[Conceptual.ConceptualContainer];

	type @[Conceptual.ConceptualFlow] : @[Conceptual.AbstractConceptualRelationship] {
		To_Ref : @[Conceptual.ConceptualContainer];
		From_Ref : @[Conceptual.ConceptualContainer];
	};

	type @[Conceptual.ConceptualElement] : @[Conceptual.AbstractConceptualElement];

	type @[Conceptual.ConceptualRole] : @[Conceptual.AbstractConceptualElement] {
		ConceptualElement_Ref : @[Conceptual.AbstractConceptualElement];
	};

	type @[Core.Element] {
		Attribute_ContRef : @[Kdm.Attribute]*;
		Annotation_ContRef : @[Kdm.Annotation]*;
	};

	type @[Core.ModelElement] : @[Core.Element] {
		Stereotype_Ref : @[Kdm.Stereotype]*;
		TaggedValue_ContRef : @[Kdm.ExtendedValue]*;
	};

	type @[Core.KDMEntity] : @[Core.ModelElement] {
		Name_Att : Text;
	};

	type @[Core.KDMRelationship] : @[Core.ModelElement];

	type @[Core.AggregatedRelationship] : @[Core.ModelElement] {
		From_Ref : @[Core.KDMEntity];
		To_Ref : @[Core.KDMEntity];
		Relation_Ref : @[Core.KDMRelationship]*;
		Density_Att : Integer32;
	};

	type @[Data.DataModel] : @[Kdm.KDMModel] {
		DataElement_ContRef : @[Data.AbstractDataElement]*;
	};

	type @[Data.AbstractDataElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		DataRelation_ContRef : @[Data.AbstractDataRelationship]*;
		Abstraction_ContRef : @[Action.ActionElement]*;
	};

	type @[Data.DataResource] : @[Data.AbstractDataElement];

	type @[Data.IndexElement] : @[Data.DataResource] {
		Implementation_Ref : @[Code.ItemUnit]*;
	};

	type @[Data.UniqueKey] : @[Data.IndexElement];

	type @[Data.Index] : @[Data.IndexElement];

	type @[Data.AbstractDataRelationship] : @[Core.KDMRelationship];

	type @[Data.KeyRelation] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Data.UniqueKey];
		From_Ref : @[Data.ReferenceKey];
	};

	type @[Data.ReferenceKey] : @[Data.IndexElement];

	type @[Data.DataContainer] : @[Data.DataResource] {
		DataElement_ContRef : @[Data.DataResource]*;
	};

	type @[Data.Catalog] : @[Data.DataContainer];

	type @[Data.RelationalSchema] : @[Data.DataContainer] {
		CodeElement_ContRef : @[Code.CodeItem]*;
	};

	type @[Data.ColumnSet] : @[Data.DataContainer] {
		ItemUnit_ContRef : @[Code.ItemUnit]*;
	};

	type @[Data.RelationalTable] : @[Data.ColumnSet];

	type @[Data.RelationalView] : @[Data.ColumnSet];

	type @[Data.RecordFile] : @[Data.ColumnSet];

	type @[Data.DataEvent] : @[Data.DataResource] {
		Kind_Att : Text;
	};

	type @[Data.XMLSchema] : @[Data.AbstractDataElement] {
		ContentElement_ContRef : @[Data.AbstractContentElement]*;
	};

	type @[Data.AbstractContentElement] : @[Data.AbstractDataElement];

	type @[Data.ComplexContentType] : @[Data.AbstractContentElement] {
		ContentElement_ContRef : @[Data.AbstractContentElement]*;
	};

	type @[Data.AllContent] : @[Data.ComplexContentType];

	type @[Data.SeqContent] : @[Data.ComplexContentType];

	type @[Data.ChoiceContent] : @[Data.ComplexContentType];

	type @[Data.ContentItem] : @[Data.AbstractContentElement] {
		Type_Ref : @[Data.ComplexContentType]?;
		ContentElement_ContRef : @[Data.AbstractContentElement]*;
	};

	type @[Data.GroupContent] : @[Data.ContentItem];

	type @[Data.ContentRestriction] : @[Data.AbstractContentElement] {
		Kind_Att : Text;
		Value_Att : Text;
	};

	type @[Data.SimpleContentType] : @[Data.ComplexContentType] {
		Type_Ref : @[Data.ComplexContentType]*;
		Kind_Att : Text;
	};

	type @[Data.ExtendedDataElement] : @[Data.AbstractDataElement];

	type @[Data.DataRelationship] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Data.AbstractDataElement];
	};

	type @[Data.MixedContent] : @[Data.ComplexContentType];

	type @[Data.ContentReference] : @[Data.ContentItem];

	type @[Data.DataAction] : @[Data.AbstractDataElement] {
		Kind_Att : Text;
		Implementation_Ref : @[Action.ActionElement]*;
		DataElement_ContRef : @[Data.DataEvent]*;
	};

	type @[Data.ReadsColumnSet] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Data.ColumnSet];
		From_Ref : @[Action.ActionElement];
	};

	type @[Data.ContentAttribute] : @[Data.ContentItem];

	type @[Data.TypedBy] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Data.ComplexContentType];
		From_Ref : @[Data.ContentItem];
	};

	type @[Data.ReferenceTo] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Data.ContentItem];
		From_Ref : @[Data.ContentItem];
	};

	type @[Data.RestrictionOf] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Data.ComplexContentType];
		From_Ref : @[Data.ComplexContentType];
	};

	type @[Data.ExtensionTo] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Data.ComplexContentType];
		From_Ref : @[Data.ComplexContentType];
	};

	type @[Data.DatatypeOf] : @[Data.AbstractDataRelationship] {
		To_Ref : @[Code.Datatype];
		From_Ref : @[Data.ComplexContentType];
	};

	type @[Data.HasContent] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Data.AbstractDataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Data.WritesColumnSet] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Data.ColumnSet];
		From_Ref : @[Action.ActionElement];
	};

	type @[Data.ProducesDataEvent] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Data.DataEvent];
		From_Ref : @[Action.ActionElement];
	};

	type @[Data.DataSegment] : @[Data.ColumnSet];

	type @[Data.ContentElement] : @[Data.ContentItem];

	type @[Data.ManagesData] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Data.AbstractDataElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Event.EventModel] : @[Kdm.KDMModel] {
		EventElement_ContRef : @[Event.AbstractEventElement]*;
	};

	type @[Event.AbstractEventElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		EventRelation_ContRef : @[Event.AbstractEventRelationship]*;
		Abstraction_ContRef : @[Action.ActionElement]*;
		Implementation_Ref : @[Code.AbstractCodeElement]*;
	};

	type @[Event.Event] : @[Event.AbstractEventElement] {
		Kind_Att : Text;
	};

	type @[Event.AbstractEventRelationship] : @[Core.KDMRelationship];

	type @[Event.EventRelationship] : @[Event.AbstractEventRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Event.AbstractEventElement];
	};

	type @[Event.EventResource] : @[Event.AbstractEventElement] {
		EventElement_ContRef : @[Event.AbstractEventElement]*;
	};

	type @[Event.State] : @[Event.EventResource];

	type @[Event.Transition] : @[Event.EventResource];

	type @[Event.OnEntry] : @[Event.Transition];

	type @[Event.OnExit] : @[Event.Transition];

	type @[Event.EventAction] : @[Event.AbstractEventElement] {
		Kind_Att : Text;
		EventElement_ContRef : @[Event.Event]*;
	};

	type @[Event.ReadsState] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Event.State];
		From_Ref : @[Action.ActionElement];
	};

	type @[Event.ProducesEvent] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Event.Event];
		From_Ref : @[Action.ActionElement];
	};

	type @[Event.ConsumesEvent] : @[Event.AbstractEventRelationship] {
		To_Ref : @[Event.Event];
		From_Ref : @[Event.Transition];
	};

	type @[Event.NextState] : @[Event.AbstractEventRelationship] {
		To_Ref : @[Event.State];
		From_Ref : @[Event.Transition];
	};

	type @[Event.InitialState] : @[Event.State];

	type @[Event.EventElement] : @[Event.AbstractEventElement];

	type @[Event.HasState] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Event.AbstractEventElement];
		From_Ref : @[Action.ActionElement];
	};

	type @[Source.SourceRef] : @[Core.Element] {
		Region_ContRef : @[Source.SourceRegion]*;
		Language_Att : Text;
		Snippet_Att : Text;
	};

	type @[Source.SourceRegion] : @[Core.Element] {
		File_Ref : @[Source.SourceFile]?;
		StartLine_Att : Integer32;
		StartPosition_Att : Integer32;
		EndLine_Att : Integer32;
		EndPosition_Att : Integer32;
		Language_Att : Text;
		Path_Att : Text;
	};

	type @[Source.InventoryModel] : @[Kdm.KDMModel] {
		InventoryElement_ContRef : @[Source.AbstractInventoryElement]*;
	};

	type @[Source.AbstractInventoryElement] : @[Core.KDMEntity] {
		InventoryRelation_ContRef : @[Source.AbstractInventoryRelationship]*;
	};

	type @[Source.InventoryItem] : @[Source.AbstractInventoryElement] {
		Version_Att : Text;
		Path_Att : Text;
	};

	type @[Source.SourceFile] : @[Source.InventoryItem] {
		Language_Att : Text;
		Encoding_Att : Text;
	};

	type @[Source.Image] : @[Source.InventoryItem];

	type @[Source.ResourceDescription] : @[Source.InventoryItem];

	type @[Source.Configuration] : @[Source.InventoryItem];

	type @[Source.InventoryContainer] : @[Source.AbstractInventoryElement] {
		InventoryElement_ContRef : @[Source.AbstractInventoryElement]*;
	};

	type @[Source.Directory] : @[Source.InventoryContainer] {
		Path_Att : Text;
	};

	type @[Source.Project] : @[Source.InventoryContainer];

	type @[Source.AbstractInventoryRelationship] : @[Core.KDMRelationship];

	type @[Source.BinaryFile] : @[Source.InventoryItem];

	type @[Source.ExecutableFile] : @[Source.InventoryItem];

	type @[Source.DependsOn] : @[Source.AbstractInventoryRelationship] {
		To_Ref : @[Source.AbstractInventoryElement];
		From_Ref : @[Source.AbstractInventoryElement];
	};

	type @[Source.InventoryElement] : @[Source.AbstractInventoryElement];

	type @[Source.InventoryRelationship] : @[Source.AbstractInventoryRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Source.AbstractInventoryElement];
	};

	type @[Platform.AbstractPlatformElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		Relation_ContRef : @[Platform.AbstractPlatformRelationship]*;
		Abstraction_ContRef : @[Action.ActionElement]*;
		Implementation_Ref : @[Code.AbstractCodeElement]*;
	};

	type @[Platform.PlatformModel] : @[Kdm.KDMModel] {
		PlatformElement_ContRef : @[Platform.AbstractPlatformElement]*;
	};

	type @[Platform.AbstractPlatformRelationship] : @[Core.KDMRelationship];

	type @[Platform.Requires] : @[Platform.AbstractPlatformRelationship] {
		To_Ref : @[Platform.AbstractPlatformElement];
		From_Ref : @[Platform.DeployedComponent];
	};

	type @[Platform.ResourceType] : @[Platform.AbstractPlatformElement] {
		PlatformElement_ContRef : @[Platform.AbstractPlatformElement]*;
	};

	type @[Platform.NamingResource] : @[Platform.ResourceType];

	type @[Platform.MarshalledResource] : @[Platform.ResourceType];

	type @[Platform.MessagingResource] : @[Platform.ResourceType];

	type @[Platform.FileResource] : @[Platform.ResourceType];

	type @[Platform.ExecutionResource] : @[Platform.ResourceType];

	type @[Platform.PlatformAction] : @[Platform.AbstractPlatformElement] {
		Kind_Att : Text;
		PlatformElement_ContRef : @[Platform.PlatformEvent]*;
	};

	type @[Platform.ExternalActor] : @[Platform.PlatformAction];

	type @[Platform.DataManager] : @[Platform.ResourceType];

	type @[Platform.BindsTo] : @[Platform.AbstractPlatformRelationship] {
		To_Ref : @[Platform.ResourceType];
		From_Ref : @[Platform.ResourceType];
	};

	type @[Platform.PlatformElement] : @[Platform.AbstractPlatformElement];

	type @[Platform.PlatformRelationship] : @[Platform.AbstractPlatformRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Platform.AbstractPlatformElement];
	};

	type @[Platform.PlatformEvent] : @[Platform.AbstractPlatformElement] {
		Kind_Att : Text;
	};

	type @[Platform.LockResource] : @[Platform.ResourceType];

	type @[Platform.DeployedSoftwareSystem] : @[Platform.AbstractPlatformElement] {
		GroupedComponent_Ref : @[Platform.DeployedComponent]*;
	};

	type @[Platform.Machine] : @[Platform.AbstractPlatformElement] {
		DeployedComponent_ContRef : @[Platform.DeployedComponent]*;
		DeployedResource_ContRef : @[Platform.DeployedResource]*;
	};

	type @[Platform.DeployedComponent] : @[Platform.AbstractPlatformElement] {
		GroupedCode_Ref : @[Code.Module]*;
	};

	type @[Platform.DeployedResource] : @[Platform.AbstractPlatformElement] {
		PlatformElement_ContRef : @[Platform.ResourceType]*;
	};

	type @[Platform.Loads] : @[Platform.AbstractPlatformRelationship] {
		To_Ref : @[Platform.DeployedComponent];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.Spawns] : @[Platform.AbstractPlatformRelationship] {
		To_Ref : @[Platform.RuntimeResource];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.RuntimeResource] : @[Platform.ResourceType];

	type @[Platform.Thread] : @[Platform.RuntimeResource];

	type @[Platform.Process] : @[Platform.RuntimeResource];

	type @[Platform.ReadsResource] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Platform.ResourceType];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.WritesResource] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Platform.ResourceType];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.ManagesResource] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Platform.ResourceType];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.DefinedBy] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Code.CodeItem];
		From_Ref : @[Action.ActionElement];
	};

	type @[Platform.StreamResource] : @[Platform.ResourceType];

	type @[Structure.AbstractStructureElement] : @[Core.KDMEntity] {
		Aggregated_ContRef : @[Core.AggregatedRelationship]*;
		Implementation_Ref : @[Core.KDMEntity]*;
		StructureElement_ContRef : @[Structure.AbstractStructureElement]*;
		StructureRelationship_ContRef : @[Structure.AbstractStructureRelationship]*;
	};

	type @[Structure.Subsystem] : @[Structure.AbstractStructureElement];

	type @[Structure.Layer] : @[Structure.AbstractStructureElement];

	type @[Structure.StructureModel] : @[Kdm.KDMModel] {
		StructureElement_ContRef : @[Structure.AbstractStructureElement]*;
	};

	type @[Structure.Component] : @[Structure.AbstractStructureElement];

	type @[Structure.SoftwareSystem] : @[Structure.AbstractStructureElement];

	type @[Structure.AbstractStructureRelationship] : @[Core.KDMRelationship];

	type @[Structure.StructureRelationship] : @[Structure.AbstractStructureRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Structure.AbstractStructureElement];
	};

	type @[Structure.ArchitectureView] : @[Structure.AbstractStructureElement];

	type @[Structure.StructureElement] : @[Structure.AbstractStructureElement];

	type @[Kdm.KDMFramework] : @[Core.ModelElement] {
		Audit_ContRef : @[Kdm.Audit]*;
		ExtensionFamily_ContRef : @[Kdm.ExtensionFamily]*;
		Name_Att : Text;
	};

	type @[Kdm.KDMModel] : @[Kdm.KDMFramework];

	type @[Kdm.Audit] : @[Core.Element] {
		Description_Att : Text;
		Author_Att : Text;
		Date_Att : Text;
	};

	type @[Kdm.Segment] : @[Kdm.KDMFramework] {
		Segment_ContRef : @[Kdm.Segment]*;
		Model_ContRef : @[Kdm.KDMModel]*;
	};

	type @[Kdm.Attribute] : @[Core.Element] {
		Tag_Att : Text;
		Value_Att : Text;
	};

	type @[Kdm.Annotation] : @[Core.Element] {
		Text_Att : Text;
	};

	type @[Kdm.TagDefinition] : @[Core.Element] {
		Tag_Att : Text;
		Type_Att : Text;
	};

	type @[Kdm.ExtendedValue] : @[Core.Element] {
		Tag_Ref : @[Kdm.TagDefinition];
	};

	type @[Kdm.Stereotype] : @[Core.Element] {
		Tag_ContRef : @[Kdm.TagDefinition]*;
		Name_Att : Text;
		Type_Att : Text;
	};

	type @[Kdm.ExtensionFamily] : @[Core.Element] {
		Stereotype_ContRef : @[Kdm.Stereotype]*;
		Name_Att : Text;
	};

	type @[Kdm.TaggedRef] : @[Kdm.ExtendedValue] {
		Reference_Ref : @[Core.ModelElement];
	};

	type @[Kdm.TaggedValue] : @[Kdm.ExtendedValue] {
		Value_Att : Text;
	};

	type @[Ui.AbstractUIElement] : @[Core.KDMEntity] {
		Source_ContRef : @[Source.SourceRef]*;
		UIRelation_ContRef : @[Ui.AbstractUIRelationship]*;
		Implementation_Ref : @[Code.AbstractCodeElement]*;
		Abstraction_ContRef : @[Action.ActionElement]*;
	};

	type @[Ui.UIResource] : @[Ui.AbstractUIElement] {
		UIElement_ContRef : @[Ui.AbstractUIElement]*;
	};

	type @[Ui.UIDisplay] : @[Ui.UIResource];

	type @[Ui.Screen] : @[Ui.UIDisplay];

	type @[Ui.Report] : @[Ui.UIDisplay];

	type @[Ui.UIModel] : @[Kdm.KDMModel] {
		UIElement_ContRef : @[Ui.AbstractUIElement]*;
	};

	type @[Ui.AbstractUIRelationship] : @[Core.KDMRelationship];

	type @[Ui.UILayout] : @[Ui.AbstractUIRelationship] {
		To_Ref : @[Ui.UIResource];
		From_Ref : @[Ui.UIResource];
	};

	type @[Ui.UIField] : @[Ui.UIResource];

	type @[Ui.DisplaysImage] : @[Ui.AbstractUIRelationship] {
		To_Ref : @[Source.Image];
		From_Ref : @[Action.ActionElement];
	};

	type @[Ui.Displays] : @[Ui.AbstractUIRelationship] {
		To_Ref : @[Ui.UIResource];
		From_Ref : @[Action.ActionElement];
	};

	type @[Ui.UIFlow] : @[Ui.AbstractUIRelationship] {
		To_Ref : @[Ui.AbstractUIElement];
		From_Ref : @[Ui.AbstractUIElement];
	};

	type @[Ui.UIElement] : @[Ui.AbstractUIElement];

	type @[Ui.UIRelationship] : @[Ui.AbstractUIRelationship] {
		To_Ref : @[Core.KDMEntity];
		From_Ref : @[Ui.AbstractUIElement];
	};

	type @[Ui.UIAction] : @[Ui.AbstractUIElement] {
		Kind_Att : Text;
		UIElement_ContRef : @[Ui.UIEvent]*;
	};

	type @[Ui.UIEvent] : @[Ui.AbstractUIElement] {
		Kind_Att : Text;
	};

	type @[Ui.ReadsUI] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Ui.UIResource];
		From_Ref : @[Action.ActionElement];
	};

	type @[Ui.WritesUI] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Ui.UIResource];
		From_Ref : @[Action.ActionElement];
	};

	type @[Ui.ManagesUI] : @[Action.AbstractActionRelationship] {
		To_Ref : @[Ui.UIResource];
		From_Ref : @[Action.ActionElement];
	};
}