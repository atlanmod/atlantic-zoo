module MetamodelRoot {

	type @[Qvttemplate.TemplateExp] : @[Essentialocl.LiteralExp] {
		BindsTo_ContRef : @[Essentialocl.Variable]?;
		Where_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Qvttemplate.ObjectTemplateExp] : @[Qvttemplate.TemplateExp] {
		Part_ContRef : @[Qvttemplate.PropertyTemplateItem]*;
		ReferredClass_Ref : @[Emof.Class];
	};

	type @[Qvttemplate.CollectionTemplateExp] : @[Qvttemplate.TemplateExp] {
		Part_ContRef : @[Essentialocl.OclExpression]*;
		Kind_Att : @[Essentialocl.CollectionKind]?;
		ReferredCollectionType_Ref : @[Essentialocl.CollectionType]?;
		Match_Ref : @[Essentialocl.OclExpression]?;
	};

	type @[Qvttemplate.PropertyTemplateItem] : @[Emof.Element] {
		ObjContainer_Ref : @[Qvttemplate.ObjectTemplateExp];
		Value_ContRef : @[Essentialocl.OclExpression];
		ReferredProperty_Ref : @[Emof.Property];
	};

	type @[Imperativeocl.ImperativeIterateExp] : @[Imperativeocl.ImperativeLoopExp] {
		Target_ContRef : @[Essentialocl.Variable];
	};

	type @[Imperativeocl.AssignExp] : @[Imperativeocl.ImperativeExpression] {
		Value_ContRef : @[Essentialocl.OclExpression]*;
		Left_ContRef : @[Essentialocl.OclExpression];
		DefaultValue_ContRef : @[Essentialocl.OclExpression]?;
		IsReset_Att : Logical;
	};

	type @[Imperativeocl.BlockExp] : @[Imperativeocl.ImperativeExpression] {
		Body_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Imperativeocl.SwitchExp] : @[Essentialocl.CallExp], @[Imperativeocl.ImperativeExpression] {
		AlternativePart_ContRef : @[Imperativeocl.AltExp]*;
		ElsePart_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Imperativeocl.VariableInitExp] : @[Imperativeocl.ImperativeExpression] {
		ReferredVariable_ContRef : @[Essentialocl.Variable];
		WithResult_Att : Logical;
	};

	type @[Imperativeocl.WhileExp] : @[Imperativeocl.ImperativeExpression] {
		Condition_ContRef : @[Essentialocl.OclExpression];
		Body_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.ComputeExp] : @[Imperativeocl.ImperativeExpression] {
		ReturnedElement_ContRef : @[Essentialocl.Variable];
		Body_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.AltExp] : @[Imperativeocl.ImperativeExpression] {
		Condition_ContRef : @[Essentialocl.OclExpression];
		Body_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.UnlinkExp] : @[Imperativeocl.ImperativeExpression] {
		Target_ContRef : @[Essentialocl.OclExpression];
		Item_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.ReturnExp] : @[Imperativeocl.ImperativeExpression] {
		Value_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.BreakExp] : @[Imperativeocl.ImperativeExpression];

	type @[Imperativeocl.TryExp] : @[Imperativeocl.ImperativeExpression] {
		TryBody_ContRef : @[Essentialocl.OclExpression];
		Exception_Ref : @[Emof.Type]*;
		ExceptBody_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Imperativeocl.RaiseExp] : @[Imperativeocl.ImperativeExpression] {
		Exception_Ref : @[Emof.Type];
	};

	type @[Imperativeocl.ContinueExp] : @[Imperativeocl.ImperativeExpression];

	type @[Imperativeocl.ForExp] : @[Imperativeocl.ImperativeLoopExp];

	type @[Imperativeocl.TupleExp] : @[Imperativeocl.ImperativeExpression] {
		Element_ContRef : @[Essentialocl.OclExpression]+;
	};

	type @[Imperativeocl.Typedef] : @[Emof.Class] {
		Base_Ref : @[Emof.Type];
		Condition_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Imperativeocl.InstantiationExp] : @[Imperativeocl.ImperativeExpression] {
		InstantiatedClass_Ref : @[Emof.Class];
		Extent_Ref : @[Essentialocl.Variable]?;
		Argument_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Imperativeocl.DictionaryType] : @[Essentialocl.CollectionType] {
		KeyType_Ref : @[Emof.Type]?;
	};

	type @[Imperativeocl.DictLiteralExp] : @[Essentialocl.LiteralExp] {
		Part_ContRef : @[Imperativeocl.DictLiteralPart]*;
	};

	type @[Imperativeocl.DictLiteralPart] : @[Emof.Element] {
		Key_ContRef : @[Essentialocl.OclExpression];
		Value_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.TemplateParameterType] : @[Emof.Type] {
		Specification_Att : Text;
	};

	type @[Imperativeocl.LogExp] : @[Imperativeocl.ImperativeExpression] {
		Text_Att : Text;
		Level_Att : Integer32;
		Condition_ContRef : @[Essentialocl.OclExpression]?;
		Element_Ref : @[Emof.Element]?;
	};

	type @[Imperativeocl.AssertExp] : @[Imperativeocl.ImperativeExpression] {
		Severity_Att : @[Imperativeocl.SeverityKind]?;
		Log_ContRef : @[Imperativeocl.LogExp]?;
		Assertion_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Imperativeocl.SeverityKind] {"error", "fatal", "warning"};

	type @[Imperativeocl.ImperativeLoopExp] : @[Essentialocl.LoopExp], @[Imperativeocl.ImperativeExpression] {
		Condition_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Imperativeocl.CollectorExp] : @[Imperativeocl.ImperativeLoopExp] {
		Target_ContRef : @[Essentialocl.Variable];
	};

	type @[Imperativeocl.ImperativeExpression] : @[Essentialocl.OclExpression];

	type @[Imperativeocl.UnpackExp] : @[Imperativeocl.ImperativeExpression] {
		Variable_ContRef : @[Essentialocl.Variable]+;
	};

	type @[Imperativeocl.AnonymousTupleType] : @[Emof.Class] {
		ElementType_Ref : @[Emof.Type]*;
	};

	type @[Imperativeocl.AnonymousTupleLiteralExp] : @[Essentialocl.LiteralExp] {
		Part_ContRef : @[Imperativeocl.AnonymousTupleLiteralPart]*;
	};

	type @[Imperativeocl.AnonymousTupleLiteralPart] : @[Emof.Element] {
		Value_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Imperativeocl.ListType] : @[Essentialocl.CollectionType];

	type @[Emof.Class] : @[Emof.Type] {
		OwnedAttribute_ContRef : @[Emof.Property]*;
		OwnedOperation_ContRef : @[Emof.Operation]*;
		SuperClass_Ref : @[Emof.Class]*;
		IsAbstract_Att : Logical;
	};

	type @[Emof.DataType] : @[Emof.Type];

	type @[Emof.Element] : @[Emof.Object] {
		Tag_Ref : @[Emof.Tag]*;
		OwnedComment_ContRef : @[Emof.Comment]*;
	};

	type @[Emof.Tag] : @[Emof.Element] {
		Element_Ref : @[Emof.Element]*;
		Transformation_Ref : @[Qvtbase.Transformation]?;
		Owner_Ref : @[Qvtoperational.Module]?;
		Value_Att : Text;
		Name_Att : Text;
	};

	type @[Emof.Enumeration] : @[Emof.DataType] {
		OwnedLiteral_ContRef : @[Emof.EnumerationLiteral]*;
	};

	type @[Emof.NamedElement] : @[Emof.Element] {
		Name_Att : Text;
	};

	type @[Emof.Extent] : @[Emof.Object];

	type @[Emof.Object];

	type @[Emof.Operation] : @[Emof.MultiplicityElement], @[Emof.TypedElement] {
		Class_Ref : @[Emof.Class];
		OwnedParameter_ContRef : @[Emof.Parameter]*;
		RaisedException_Ref : @[Emof.Type]*;
	};

	type @[Emof.MultiplicityElement] {
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
		Lower_Att : Integer32;
		Upper_Att : Logical;
	};

	type @[Emof.Package] : @[Emof.NamedElement] {
		OwnedType_ContRef : @[Emof.Type]*;
		NestedPackage_Ref : @[Emof.Package]*;
		Uri_Att : Text;
	};

	type @[Emof.Type] : @[Emof.NamedElement] {
		Package_Ref : @[Emof.Package];
	};

	type @[Emof.Parameter] : @[Emof.MultiplicityElement], @[Emof.TypedElement] {
		Operation_Ref : @[Emof.Operation]?;
	};

	type @[Emof.EnumerationLiteral] : @[Emof.NamedElement] {
		Enumeration_Ref : @[Emof.Enumeration]?;
	};

	type @[Emof.Property] : @[Emof.MultiplicityElement], @[Emof.TypedElement] {
		Class_Ref : @[Emof.Class];
		Opposite_Ref : @[Emof.Property]?;
		Module_Ref : @[Qvtoperational.Module]?;
		IsReadOnly_Att : Logical;
		IsDerived_Att : Logical;
		IsComposite_Att : Logical;
		IsId_Att : Logical;
		Default_Att : Text;
	};

	type @[Emof.TypedElement] : @[Emof.NamedElement] {
		Type_Ref : @[Emof.Type]?;
	};

	type @[Emof.PrimitiveType] : @[Emof.DataType];

	type @[Emof.URIExtent] : @[Emof.Extent];

	type @[Emof.Comment] : @[Emof.Element] {
		AnnotatedElement_Ref : @[Emof.NamedElement]*;
	};

	type @[Qvtoperational.MappingBody] : @[Qvtoperational.OperationBody] {
		InitSection_ContRef : @[Essentialocl.OclExpression]*;
		EndSection_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Qvtoperational.Helper] : @[Qvtoperational.ImperativeOperation] {
		IsQuery_Att : Logical;
	};

	type @[Qvtoperational.ResolveExp] : @[Essentialocl.CallExp] {
		Condition_ContRef : @[Essentialocl.OclExpression]?;
		One_Att : Logical;
		IsInverse_Att : Logical;
		IsDeferred_Att : Logical;
	};

	type @[Qvtoperational.ResolveInExp] : @[Qvtoperational.ResolveExp] {
		InMapping_Ref : @[Qvtoperational.MappingOperation]?;
	};

	type @[Qvtoperational.OperationalTransformation] : @[Qvtoperational.Module] {
		IntermediateClass_Ref : @[Emof.Class]*;
		Refined_Ref : @[Qvtbase.Transformation]?;
		IntermediateProperty_Ref : @[Emof.Property]*;
		ModelParameter_ContRef : @[Qvtoperational.ModelParameter]*;
		Entry_Ref : @[Qvtoperational.EntryOperation]?;
		Relation_ContRef : @[Qvtrelation.Relation]*;
	};

	type @[Qvtoperational.MappingParameter] : @[Qvtoperational.VarParameter] {
		RefinedDomain_Ref : @[Qvtrelation.RelationDomain]?;
		Extent_Ref : @[Qvtoperational.ModelParameter]?;
	};

	type @[Qvtoperational.MappingOperation] : @[Qvtoperational.ImperativeOperation], @[Emof.Operation], @[Emof.NamedElement] {
		Disjunct_Ref : @[Qvtoperational.MappingOperation]*;
		RefinedRelation_Ref : @[Qvtrelation.Relation];
		Merged_Ref : @[Qvtoperational.MappingOperation]*;
		Inherited_Ref : @[Qvtoperational.MappingOperation]*;
		When_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Qvtoperational.MappingCallExp] : @[Qvtoperational.ImperativeCallExp] {
		IsStrict_Att : Logical;
	};

	type @[Qvtoperational.Constructor] : @[Qvtoperational.ImperativeOperation];

	type @[Qvtoperational.ContextualProperty] : @[Emof.Property] {
		Context_Ref : @[Emof.Class];
		Overridden_Ref : @[Emof.Property]?;
	};

	type @[Qvtoperational.EntryOperation] : @[Qvtoperational.ImperativeOperation];

	type @[Qvtoperational.ImperativeCallExp] : @[Essentialocl.OperationCallExp] {
		IsVirtual_Att : Logical;
	};

	type @[Qvtoperational.ImperativeOperation] : @[Emof.Operation] {
		Context_ContRef : @[Qvtoperational.VarParameter]?;
		Result_ContRef : @[Qvtoperational.VarParameter]*;
		Overridden_Ref : @[Qvtoperational.ImperativeOperation]?;
		Body_ContRef : @[Qvtoperational.OperationBody]?;
		IsBlackbox_Att : Logical;
	};

	type @[Qvtoperational.DirectionKind] {"in", "inout", "out"};

	type @[Qvtoperational.Library] : @[Qvtoperational.Module];

	type @[Qvtoperational.ModelParameter] : @[Qvtoperational.VarParameter];

	type @[Qvtoperational.ModelType] : @[Emof.Class], @[Emof.URIExtent] {
		Metamodel_Ref : @[Emof.Package]*;
		AdditionalCondition_ContRef : @[Essentialocl.OclExpression]*;
		ConformanceKind_Att : Text;
	};

	type @[Qvtoperational.Module] : @[Emof.Class], @[Emof.Package] {
		OwnedTag_ContRef : @[Emof.Tag]*;
		ConfigProperty_Ref : @[Emof.Property]*;
		ModuleImport_ContRef : @[Qvtoperational.ModuleImport]*;
		UsedModelType_Ref : @[Qvtoperational.ModelType]*;
		IsBlackbox_Att : Logical;
	};

	type @[Qvtoperational.ModuleImport] : @[Emof.Element] {
		Binding_Ref : @[Qvtoperational.ModelType]*;
		Module_Ref : @[Qvtoperational.Module]?;
		ImportedModule_Ref : @[Qvtoperational.Module];
		Kind_Att : @[Qvtoperational.ImportKind]?;
	};

	type @[Qvtoperational.ImportKind] {"extension", "access"};

	type @[Qvtoperational.VarParameter] : @[Emof.Parameter], @[Essentialocl.Variable] {
		CtxOwner_Ref : @[Qvtoperational.ImperativeOperation]?;
		ResOwner_Ref : @[Qvtoperational.ImperativeOperation]?;
		Kind_Att : @[Qvtoperational.DirectionKind]?;
	};

	type @[Qvtoperational.OperationBody] : @[Emof.Element] {
		Operation_Ref : @[Qvtoperational.ImperativeOperation]?;
		Content_ContRef : @[Essentialocl.OclExpression]*;
	};

	type @[Qvtoperational.ConstructorBody] : @[Qvtoperational.OperationBody];

	type @[Qvtoperational.ObjectExp] : @[Imperativeocl.InstantiationExp] {
		ReferredObject_Ref : @[Essentialocl.Variable]?;
		Body_ContRef : @[Qvtoperational.ConstructorBody];
	};

	type @[Qvtcore.Area] {
		GuardPattern_ContRef : @[Qvtcore.GuardPattern];
		BottomPattern_ContRef : @[Qvtcore.BottomPattern];
	};

	type @[Qvtcore.Assignment] {
		BottomPattern_Ref : @[Qvtcore.BottomPattern];
		SlotExpression_ContRef : @[Essentialocl.OclExpression];
		Value_ContRef : @[Essentialocl.OclExpression];
		TargetProperty_Ref : @[Emof.Property];
		IsDefault_Att : Logical;
	};

	type @[Qvtcore.BottomPattern] : @[Qvtcore.CorePattern] {
		Area_Ref : @[Qvtcore.Area];
		Assignment_ContRef : @[Qvtcore.Assignment]*;
		RealizedVariable_ContRef : @[Qvtcore.RealizedVariable]*;
		EnforcementOperation_ContRef : @[Qvtcore.EnforcementOperation]*;
	};

	type @[Qvtcore.GuardPattern] : @[Qvtcore.CorePattern] {
		Area_Ref : @[Qvtcore.Area];
	};

	type @[Qvtcore.Mapping] : @[Qvtbase.Rule], @[Qvtcore.Area] {
		Specification_Ref : @[Qvtcore.Mapping]*;
		Local_Ref : @[Qvtcore.Mapping]*;
		Context_Ref : @[Qvtcore.Mapping]?;
	};

	type @[Qvtcore.RealizedVariable] : @[Essentialocl.Variable];

	type @[Qvtcore.CoreDomain] : @[Qvtbase.Domain], @[Qvtcore.Area];

	type @[Qvtcore.CorePattern] : @[Qvtbase.Pattern];

	type @[Qvtcore.EnforcementOperation] {
		EnforcementMode_Att : @[Qvtcore.EnforcementMode]?;
		BottomPattern_Ref : @[Qvtcore.BottomPattern]?;
		OperationCallExp_Ref : @[Essentialocl.OperationCallExp];
	};

	type @[Qvtcore.EnforcementMode] {"Deletion", "Creation"};

	type @[Qvtbase.Domain] : @[Emof.NamedElement] {
		IsCheckable_Att : Logical;
		IsEnforceable_Att : Logical;
		Rule_Ref : @[Qvtbase.Rule];
		TypedModel_Ref : @[Qvtbase.TypedModel];
	};

	type @[Qvtbase.Transformation] : @[Emof.Class], @[Emof.Package] {
		OwnedTag_ContRef : @[Emof.Tag]*;
		ModelParameter_ContRef : @[Qvtbase.TypedModel]*;
		Rule_ContRef : @[Qvtbase.Rule]*;
		Extends_Ref : @[Qvtbase.Transformation]?;
	};

	type @[Qvtbase.TypedModel] : @[Emof.NamedElement] {
		Transformation_Ref : @[Qvtbase.Transformation];
		UsedPackage_Ref : @[Emof.Package]+;
		DependsOn_Ref : @[Qvtbase.TypedModel]*;
	};

	type @[Qvtbase.Rule] : @[Emof.NamedElement] {
		Domain_ContRef : @[Qvtbase.Domain]*;
		Transformation_Ref : @[Qvtbase.Transformation];
		Overrides_Ref : @[Qvtbase.Rule]?;
	};

	type @[Qvtbase.Pattern] : @[Emof.Element] {
		Predicate_ContRef : @[Qvtbase.Predicate]*;
		BindsTo_ContRef : @[Essentialocl.Variable]*;
		WhenOwner_Ref : @[Qvtrelation.Relation]?;
		WhereOwner_Ref : @[Qvtrelation.Relation]?;
	};

	type @[Qvtbase.Predicate] : @[Emof.Element] {
		ConditionExpression_ContRef : @[Essentialocl.OclExpression];
		Pattern_Ref : @[Qvtbase.Pattern];
	};

	type @[Qvtbase.Function] : @[Emof.Operation] {
		QueryExpression_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Qvtbase.FunctionParameter] : @[Emof.Parameter], @[Essentialocl.Variable];

	type @[Qvtrelation.RelationalTransformation] : @[Qvtbase.Transformation] {
		OwnedKey_ContRef : @[Qvtrelation.Key]*;
	};

	type @[Qvtrelation.Relation] : @[Qvtbase.Rule] {
		IsTopLevel_Att : Logical;
		Variable_ContRef : @[Essentialocl.Variable]*;
		OperationalImpl_Ref : @[Qvtrelation.RelationImplementation]*;
		Where_ContRef : @[Qvtbase.Pattern]?;
		When_ContRef : @[Qvtbase.Pattern]?;
	};

	type @[Qvtrelation.RelationDomain] : @[Qvtbase.Domain] {
		Pattern_ContRef : @[Qvtrelation.DomainPattern];
		RootVariable_Ref : @[Essentialocl.Variable];
	};

	type @[Qvtrelation.DomainPattern] : @[Qvtbase.Pattern] {
		TemplateExpression_ContRef : @[Qvttemplate.TemplateExp]?;
	};

	type @[Qvtrelation.RelationImplementation] : @[Emof.Element] {
		Relation_Ref : @[Qvtrelation.Relation]?;
		Impl_Ref : @[Emof.Operation];
		InDirectionOf_Ref : @[Qvtbase.TypedModel];
	};

	type @[Qvtrelation.Key] : @[Emof.Element] {
		Identifies_Ref : @[Emof.Class];
		Part_Ref : @[Emof.Property]+;
		Transformation_Ref : @[Qvtrelation.RelationalTransformation]?;
	};

	type @[Essentialocl.BooleanLiteralExp] : @[Essentialocl.PrimitiveLiteralExp] {
		BooleanSymbol_Att : Logical;
	};

	type @[Essentialocl.CallExp] : @[Essentialocl.OclExpression] {
		Source_ContRef : @[Essentialocl.OclExpression]?;
	};

	type @[Essentialocl.CollectionKind] {"OrderedSet", "Set", "Bag", "Sequence"};

	type @[Essentialocl.OclExpression] : @[Emof.TypedElement] {
		TryBodyOwner_Ref : @[Imperativeocl.TryExp]?;
	};

	type @[Essentialocl.UnlimitedNaturalExp] : @[Essentialocl.NumericLiteralExp] {
		Symbol_Att : Logical;
	};

	type @[Essentialocl.IfExp] : @[Essentialocl.OclExpression] {
		Condition_ContRef : @[Essentialocl.OclExpression];
		ThenExpression_ContRef : @[Essentialocl.OclExpression];
		ElseExpression_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Essentialocl.LetExp] : @[Essentialocl.OclExpression] {
		In_ContRef : @[Essentialocl.OclExpression]*;
		Variable_ContRef : @[Essentialocl.Variable];
	};

	type @[Essentialocl.Variable] : @[Emof.TypedElement] {
		InitExpression_ContRef : @[Essentialocl.OclExpression]?;
		LetExp_Ref : @[Essentialocl.LetExp]?;
		ComputeOwner_Ref : @[Imperativeocl.ComputeExp]?;
		BindParameter_Ref : @[Emof.Parameter]?;
	};

	type @[Essentialocl.PropertyCallExp] : @[Essentialocl.FeaturePropertyCall] {
		ReferredProperty_Ref : @[Emof.Property]?;
	};

	type @[Essentialocl.VariableExp] : @[Essentialocl.OclExpression] {
		ReferredVariable_Ref : @[Essentialocl.Variable]?;
	};

	type @[Essentialocl.TypeExp] : @[Essentialocl.OclExpression] {
		ReferredType_Ref : @[Emof.Type]?;
	};

	type @[Essentialocl.LoopExp] : @[Essentialocl.CallExp], @[Essentialocl.OclExpression] {
		Body_ContRef : @[Essentialocl.OclExpression];
		Iterator_ContRef : @[Essentialocl.Variable]*;
	};

	type @[Essentialocl.IteratorExp] : @[Essentialocl.LoopExp];

	type @[Essentialocl.StringLiteralExp] : @[Essentialocl.PrimitiveLiteralExp] {
		StringSymbol_Att : Text;
	};

	type @[Essentialocl.IntegerLiteralExp] : @[Essentialocl.NumericLiteralExp] {
		IntegerSymbol_Att : Integer32;
	};

	type @[Essentialocl.OperationCallExp] : @[Essentialocl.FeaturePropertyCall] {
		Argument_ContRef : @[Essentialocl.OclExpression]*;
		ReferredOperation_Ref : @[Emof.Operation]?;
	};

	type @[Essentialocl.RealLiteralExp] : @[Essentialocl.NumericLiteralExp] {
		RealSymbol_Att : Logical;
	};

	type @[Essentialocl.LiteralExp] : @[Essentialocl.OclExpression];

	type @[Essentialocl.IterateExp] : @[Essentialocl.LoopExp] {
		Result_ContRef : @[Essentialocl.Variable]?;
	};

	type @[Essentialocl.PrimitiveLiteralExp] : @[Essentialocl.LiteralExp];

	type @[Essentialocl.NumericLiteralExp] : @[Essentialocl.PrimitiveLiteralExp];

	type @[Essentialocl.CollectionLiteralExp] : @[Essentialocl.LiteralExp] {
		Kind_Att : @[Essentialocl.CollectionKind]?;
		Part_ContRef : @[Essentialocl.CollectionLiteralPart]*;
	};

	type @[Essentialocl.CollectionLiteralPart] : @[Emof.TypedElement] {
		CollectionLiteralExp_Ref : @[Essentialocl.CollectionLiteralExp];
	};

	type @[Essentialocl.CollectionItem] : @[Essentialocl.CollectionLiteralPart] {
		Item_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Essentialocl.CollectionRange] : @[Essentialocl.CollectionLiteralPart] {
		First_ContRef : @[Essentialocl.OclExpression];
		Last_ContRef : @[Essentialocl.OclExpression];
	};

	type @[Essentialocl.TupleLiteralExp] : @[Essentialocl.LiteralExp] {
		Part_ContRef : @[Essentialocl.TupleLiteralPart]*;
	};

	type @[Essentialocl.NullLiteralExp] : @[Essentialocl.LiteralExp];

	type @[Essentialocl.ExpressionInOcl] : @[Essentialocl.OpaqueExpression] {
		BodyExpression_ContRef : @[Essentialocl.OclExpression];
		Context_ContRef : @[Essentialocl.Variable]?;
		ResultVariable_ContRef : @[Essentialocl.Variable]?;
		ParameterVariable_ContRef : @[Essentialocl.Variable]?;
	};

	type @[Essentialocl.OpaqueExpression];

	type @[Essentialocl.InvalidLiteralExp] : @[Essentialocl.LiteralExp];

	type @[Essentialocl.FeaturePropertyCall] : @[Essentialocl.CallExp];

	type @[Essentialocl.TupleLiteralPart] : @[Emof.TypedElement] {
		TupleLiteralExp_Ref : @[Essentialocl.TupleLiteralExp]?;
		Attribute_ContRef : @[Emof.Property]?;
	};

	type @[Essentialocl.BagType] : @[Essentialocl.CollectionType];

	type @[Essentialocl.CollectionType] : @[Emof.DataType] {
		ElementType_Ref : @[Emof.Type]?;
	};

	type @[Essentialocl.EnumLiteralExp] : @[Essentialocl.LiteralExp] {
		ReferredEnumLiteral_Ref : @[Emof.EnumerationLiteral]?;
	};

	type @[Essentialocl.InvalidType] : @[Emof.Type];

	type @[Essentialocl.OrderedSetType] : @[Essentialocl.CollectionType];

	type @[Essentialocl.SequenceType] : @[Essentialocl.CollectionType];

	type @[Essentialocl.SetType] : @[Essentialocl.CollectionType];

	type @[Essentialocl.TupleType] : @[Emof.Class], @[Emof.DataType];

	type @[Essentialocl.VoidType] : @[Emof.Type];

	type @[Essentialocl.AnyType] : @[Emof.Class], @[Emof.Type];
}