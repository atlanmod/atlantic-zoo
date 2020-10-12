module MetamodelRoot {

	type @[ATL.LocatedElement] {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type @[ATL.Unit] : @[ATL.LocatedElement] {
		Libraries_ContRef : @[ATL.LibraryRef]*;
		Name_Att : Text;
	};

	type @[ATL.Library] : @[ATL.Unit] {
		Helpers_ContRef : @[ATL.Helper]*;
	};

	type @[ATL.Query] : @[ATL.Unit] {
		Body_ContRef : @[OCL.OclExpression];
		Helpers_ContRef : @[ATL.Helper]*;
	};

	type @[ATL.Module] : @[ATL.Unit] {
		IsRefining_Att : Logical;
		InModels_ContRef : @[OCL.OclModel]+;
		OutModels_ContRef : @[OCL.OclModel]+;
		Elements_ContRef : @[ATL.ModuleElement]*;
	};

	type @[ATL.ModuleElement] : @[ATL.LocatedElement] {
		Module_Ref : @[ATL.Module];
	};

	type @[ATL.Helper] : @[ATL.ModuleElement] {
		Query_Ref : @[ATL.Query]?;
		Library_Ref : @[ATL.Library]?;
		Definition_ContRef : @[OCL.OclFeatureDefinition];
	};

	type @[ATL.Rule] : @[ATL.ModuleElement] {
		OutPattern_ContRef : @[ATL.OutPattern]?;
		ActionBlock_ContRef : @[ATL.ActionBlock]?;
		Variables_ContRef : @[ATL.RuleVariableDeclaration]*;
		Name_Att : Text;
	};

	type @[ATL.MatchedRule] : @[ATL.Rule] {
		InPattern_ContRef : @[ATL.InPattern]?;
		Children_Ref : @[ATL.MatchedRule]*;
		SuperRule_Ref : @[ATL.MatchedRule]?;
		IsAbstract_Att : Logical;
		IsRefining_Att : Logical;
		IsNoDefault_Att : Logical;
	};

	type @[ATL.LazyMatchedRule] : @[ATL.MatchedRule] {
		IsUnique_Att : Logical;
	};

	type @[ATL.CalledRule] : @[ATL.Rule] {
		Parameters_ContRef : @[OCL.Parameter]*;
		IsEntrypoint_Att : Logical;
		IsEndpoint_Att : Logical;
	};

	type @[ATL.InPattern] : @[ATL.LocatedElement] {
		Elements_ContRef : @[ATL.InPatternElement]+;
		Rule_Ref : @[ATL.MatchedRule];
		Filter_ContRef : @[OCL.OclExpression]?;
	};

	type @[ATL.OutPattern] : @[ATL.LocatedElement] {
		Rule_Ref : @[ATL.Rule];
		Elements_ContRef : @[ATL.OutPatternElement]+;
	};

	type @[ATL.PatternElement] : @[OCL.VariableDeclaration];

	type @[ATL.InPatternElement] : @[ATL.PatternElement] {
		MapsTo_Ref : @[ATL.OutPatternElement];
		InPattern_Ref : @[ATL.InPattern];
		Models_Ref : @[OCL.OclModel]*;
	};

	type @[ATL.SimpleInPatternElement] : @[ATL.InPatternElement];

	type @[ATL.OutPatternElement] : @[ATL.PatternElement] {
		OutPattern_Ref : @[ATL.OutPattern];
		SourceElement_Ref : @[ATL.InPatternElement]?;
		Bindings_ContRef : @[ATL.Binding]*;
		Model_Ref : @[OCL.OclModel]?;
	};

	type @[ATL.SimpleOutPatternElement] : @[ATL.OutPatternElement] {
		ReverseBindings_ContRef : @[OCL.OclExpression]*;
	};

	type @[ATL.ForEachOutPatternElement] : @[ATL.OutPatternElement] {
		Collection_ContRef : @[OCL.OclExpression];
		Iterator_ContRef : @[OCL.Iterator];
	};

	type @[ATL.Binding] : @[ATL.LocatedElement] {
		Value_ContRef : @[OCL.OclExpression];
		OutPatternElement_Ref : @[ATL.OutPatternElement];
		PropertyName_Att : Text;
		IsAssignment_Att : Logical;
	};

	type @[ATL.RuleVariableDeclaration] : @[OCL.VariableDeclaration] {
		Rule_Ref : @[ATL.Rule];
	};

	type @[ATL.LibraryRef] : @[ATL.LocatedElement] {
		Unit_Ref : @[ATL.Unit];
		Name_Att : Text;
	};

	type @[ATL.ActionBlock] : @[ATL.LocatedElement] {
		Rule_Ref : @[ATL.Rule];
		Statements_ContRef : @[ATL.Statement]*;
	};

	type @[ATL.Statement] : @[ATL.LocatedElement];

	type @[ATL.ExpressionStat] : @[ATL.Statement] {
		Expression_ContRef : @[OCL.OclExpression];
	};

	type @[ATL.BindingStat] : @[ATL.Statement] {
		Source_ContRef : @[OCL.OclExpression];
		PropertyName_Att : Text;
		IsAssignment_Att : Logical;
		Value_ContRef : @[OCL.OclExpression];
	};

	type @[ATL.IfStat] : @[ATL.Statement] {
		Condition_ContRef : @[OCL.OclExpression];
		ThenStatements_ContRef : @[ATL.Statement]*;
		ElseStatements_ContRef : @[ATL.Statement]*;
	};

	type @[ATL.ForStat] : @[ATL.Statement] {
		Iterator_ContRef : @[OCL.Iterator];
		Collection_ContRef : @[OCL.OclExpression];
		Statements_ContRef : @[ATL.Statement]*;
	};

	type @[OCL.OclExpression] : @[ATL.LocatedElement] {
		Type_ContRef : @[OCL.OclType]?;
		IfExp3_Ref : @[OCL.IfExp]?;
		AppliedProperty_Ref : @[OCL.PropertyCallExp]?;
		Collection_Ref : @[OCL.CollectionExp]?;
		LetExp_Ref : @[OCL.LetExp]?;
		LoopExp_Ref : @[OCL.LoopExp]?;
		ParentOperation_Ref : @[OCL.OperationCallExp]?;
		InitializedVariable_Ref : @[OCL.VariableDeclaration]?;
		IfExp2_Ref : @[OCL.IfExp]?;
		OwningOperation_Ref : @[OCL.Operation]?;
		IfExp1_Ref : @[OCL.IfExp]?;
		OwningAttribute_Ref : @[OCL.Attribute]?;
	};

	type @[OCL.VariableExp] : @[OCL.OclExpression] {
		ReferredVariable_Ref : @[OCL.VariableDeclaration];
	};

	type @[OCL.SuperExp] : @[OCL.OclExpression];

	type @[OCL.PrimitiveExp] : @[OCL.OclExpression];

	type @[OCL.StringExp] : @[OCL.PrimitiveExp] {
		StringSymbol_Att : Text;
	};

	type @[OCL.BooleanExp] : @[OCL.PrimitiveExp] {
		BooleanSymbol_Att : Logical;
	};

	type @[OCL.NumericExp] : @[OCL.PrimitiveExp];

	type @[OCL.RealExp] : @[OCL.NumericExp] {
		RealSymbol_Att : Double;
	};

	type @[OCL.IntegerExp] : @[OCL.NumericExp] {
		IntegerSymbol_Att : Integer32;
	};

	type @[OCL.CollectionExp] : @[OCL.OclExpression] {
		Elements_ContRef : @[OCL.OclExpression]*;
	};

	type @[OCL.BagExp] : @[OCL.CollectionExp];

	type @[OCL.OrderedSetExp] : @[OCL.CollectionExp];

	type @[OCL.SequenceExp] : @[OCL.CollectionExp];

	type @[OCL.SetExp] : @[OCL.CollectionExp];

	type @[OCL.TupleExp] : @[OCL.OclExpression] {
		TuplePart_ContRef : @[OCL.TuplePart]*;
	};

	type @[OCL.TuplePart] : @[OCL.VariableDeclaration] {
		Tuple_Ref : @[OCL.TupleExp];
	};

	type @[OCL.MapExp] : @[OCL.OclExpression] {
		Elements_ContRef : @[OCL.MapElement]*;
	};

	type @[OCL.MapElement] : @[ATL.LocatedElement] {
		Map_Ref : @[OCL.MapExp];
		Key_ContRef : @[OCL.OclExpression];
		Value_ContRef : @[OCL.OclExpression];
	};

	type @[OCL.EnumLiteralExp] : @[OCL.OclExpression] {
		Name_Att : Text;
	};

	type @[OCL.OclUndefinedExp] : @[OCL.OclExpression];

	type @[OCL.PropertyCallExp] : @[OCL.OclExpression] {
		Source_ContRef : @[OCL.OclExpression];
	};

	type @[OCL.NavigationOrAttributeCallExp] : @[OCL.PropertyCallExp] {
		Name_Att : Text;
	};

	type @[OCL.OperationCallExp] : @[OCL.PropertyCallExp] {
		Arguments_ContRef : @[OCL.OclExpression]*;
		OperationName_Att : Text;
	};

	type @[OCL.OperatorCallExp] : @[OCL.OperationCallExp];

	type @[OCL.CollectionOperationCallExp] : @[OCL.OperationCallExp];

	type @[OCL.LoopExp] : @[OCL.PropertyCallExp] {
		Body_ContRef : @[OCL.OclExpression];
		Iterators_ContRef : @[OCL.Iterator]+;
	};

	type @[OCL.IterateExp] : @[OCL.LoopExp] {
		Result_ContRef : @[OCL.VariableDeclaration];
	};

	type @[OCL.IteratorExp] : @[OCL.LoopExp] {
		Name_Att : Text;
	};

	type @[OCL.LetExp] : @[OCL.OclExpression] {
		Variable_ContRef : @[OCL.VariableDeclaration];
		In__ContRef : @[OCL.OclExpression];
	};

	type @[OCL.IfExp] : @[OCL.OclExpression] {
		ThenExpression_ContRef : @[OCL.OclExpression];
		Condition_ContRef : @[OCL.OclExpression];
		ElseExpression_ContRef : @[OCL.OclExpression];
	};

	type @[OCL.VariableDeclaration] : @[ATL.LocatedElement] {
		Id_Att : Text;
		VarName_Att : Text;
		Type_ContRef : @[OCL.OclType]?;
		InitExpression_ContRef : @[OCL.OclExpression]?;
		LetExp_Ref : @[OCL.LetExp]?;
		BaseExp_Ref : @[OCL.IterateExp]?;
		VariableExp_Ref : @[OCL.VariableExp]*;
	};

	type @[OCL.Iterator] : @[OCL.VariableDeclaration] {
		LoopExpr_Ref : @[OCL.LoopExp]?;
	};

	type @[OCL.Parameter] : @[OCL.VariableDeclaration] {
		Operation_Ref : @[OCL.Operation];
	};

	type @[OCL.CollectionType] : @[OCL.OclType] {
		ElementType_ContRef : @[OCL.OclType];
	};

	type @[OCL.OclType] : @[OCL.OclExpression] {
		Name_Att : Text;
		Definitions_Ref : @[OCL.OclContextDefinition]?;
		OclExpression_Ref : @[OCL.OclExpression]?;
		Operation_Ref : @[OCL.Operation]?;
		MapType2_Ref : @[OCL.MapType]?;
		Attribute_Ref : @[OCL.Attribute]?;
		MapType_Ref : @[OCL.MapType]?;
		CollectionTypes_Ref : @[OCL.CollectionType]?;
		TupleTypeAttribute_Ref : @[OCL.TupleTypeAttribute]?;
		VariableDeclaration_Ref : @[OCL.VariableDeclaration]?;
	};

	type @[OCL.Primitive] : @[OCL.OclType];

	type @[OCL.StringType] : @[OCL.Primitive];

	type @[OCL.BooleanType] : @[OCL.Primitive];

	type @[OCL.NumericType] : @[OCL.Primitive];

	type @[OCL.IntegerType] : @[OCL.NumericType];

	type @[OCL.RealType] : @[OCL.NumericType];

	type @[OCL.BagType] : @[OCL.CollectionType];

	type @[OCL.OrderedSetType] : @[OCL.CollectionType];

	type @[OCL.SequenceType] : @[OCL.CollectionType];

	type @[OCL.SetType] : @[OCL.CollectionType];

	type @[OCL.OclAnyType] : @[OCL.OclType];

	type @[OCL.TupleType] : @[OCL.OclType] {
		Attributes_ContRef : @[OCL.TupleTypeAttribute]*;
	};

	type @[OCL.TupleTypeAttribute] : @[ATL.LocatedElement] {
		Type_ContRef : @[OCL.OclType];
		TupleType_Ref : @[OCL.TupleType];
		Name_Att : Text;
	};

	type @[OCL.OclModelElement] : @[OCL.OclType] {
		Model_Ref : @[OCL.OclModel];
	};

	type @[OCL.MapType] : @[OCL.OclType] {
		ValueType_ContRef : @[OCL.OclType];
		KeyType_ContRef : @[OCL.OclType];
	};

	type @[OCL.OclFeatureDefinition] : @[ATL.LocatedElement] {
		Feature_ContRef : @[OCL.OclFeature];
		Context__ContRef : @[OCL.OclContextDefinition]?;
	};

	type @[OCL.OclContextDefinition] : @[ATL.LocatedElement] {
		Definition_Ref : @[OCL.OclFeatureDefinition];
		Context__ContRef : @[OCL.OclType];
	};

	type @[OCL.OclFeature] : @[ATL.LocatedElement] {
		Definition_Ref : @[OCL.OclFeatureDefinition]?;
	};

	type @[OCL.Attribute] : @[OCL.OclFeature] {
		Name_Att : Text;
		InitExpression_ContRef : @[OCL.OclExpression];
		Type_ContRef : @[OCL.OclType];
	};

	type @[OCL.Operation] : @[OCL.OclFeature] {
		Name_Att : Text;
		Parameters_ContRef : @[OCL.Parameter]*;
		ReturnType_ContRef : @[OCL.OclType];
		Body_ContRef : @[OCL.OclExpression];
	};

	type @[OCL.OclModel] : @[ATL.LocatedElement] {
		Name_Att : Text;
		Metamodel_Ref : @[OCL.OclModel];
		Elements_Ref : @[OCL.OclModelElement]*;
		Model_Ref : @[OCL.OclModel]*;
	};
}