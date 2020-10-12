module Express {

	type @[Rules.ONEOFConstraint] : @[Rules.SubtypeConstraint];

	type @[Rules.SupertypeRule] : @[Core.CommonElement] {
		NamedSupertype_Ref : @[Core.EntityType];
		Constraints_ContRef : @[Rules.SubtypeConstraint]*;
		AssertsAbstract_Att : Logical;
	};

	type @[Rules.SubtypeConstraint] {
		ConstrainedSubtypes_Ref : @[Rules.Extent]+;
		EquivalentRule_ContRef : @[Core.Expression];
		Collection_Ref : @[Rules.SupertypeRule];
	};

	type @[Rules.Extent] : @[Instances.SETValue] {
		Constraints_Ref : @[Rules.SubtypeConstraint]*;
		Content_Ref : @[Instances.EntityInstance]*;
		WithinPopulation_Ref : @[Instances.Population];
		ConstraintRules_Ref : @[Rules.GlobalRule]*;
		ForType_Ref : @[Core.EntityType];
		Id_ContRef : @[Core.ScopedId];
	};

	type @[Rules.TOTAL_OVERConstraint] : @[Rules.SubtypeConstraint];

	type @[Rules.ANDConstraint] : @[Rules.SubtypeConstraint];

	type @[Rules.GlobalRule] : @[Core.SchemaElement], @[Core.AlgorithmScope] {
		SupportingBody_ContRef : @[Algorithms.Statement]?;
		ConstrainedExtents_Ref : @[Rules.Extent]+;
		ContainsRules_ContRef : @[Rules.NamedRule]+;
	};

	type @[Rules.NamedRule] : @[Core.LocalElement] {
		AssertsExpression_ContRef : @[Core.Expression];
		Position_Att : Integer32;
	};

	type @[Statements.ProcedureCall] : @[Algorithms.Statement] {
		Invokes_Ref : @[Algorithms.Procedure];
		ActualParameters_ContRef : @[Expressions.ActualParameter]*;
	};

	type @[Statements.SkipStatement] : @[Statements.ControlStatement];

	type @[Statements.AliasStatement] : @[Algorithms.Statement], @[Core.LocalScope] {
		BindsToReference_Ref : @[Statements.VARExpression];
		Body_ContRef : @[Algorithms.Statement];
		AliasVariable_ContRef : @[Statements.AliasVariable];
	};

	type @[Statements.ControlVariable] : @[Algorithms.NamedVariable] {
		BoundValue_Ref : @[Core.Expression];
		InitialValue_Ref : @[Core.Expression];
		Increment_Ref : @[Core.Expression];
	};

	type @[Statements.AliasVariable] : @[Algorithms.NamedVariable], @[Algorithms.VARVariable] {
		Referent_Ref : @[Statements.VARExpression]?;
	};

	type @[Statements.ControlStatement] : @[Algorithms.Statement];

	type @[Statements.VARCell] : @[Statements.VARExpression] {
		RefersTo_Ref : @[Algorithms.VARVariable];
		Id_Att : Logical;
	};

	type @[Statements.NullStatement] : @[Statements.ControlStatement];

	type @[Statements.VARExpression] {
		Text_Att : Logical;
	};

	type @[Statements.AttributeCell] : @[Statements.VARExpression] {
		RefersTo_Ref : @[Core.ExplicitAttribute];
		BaseEntity_ContRef : @[Statements.VARExpression];
		Id_Att : Logical;
	};

	type @[Statements.StatementBlock] : @[Algorithms.Statement] {
		BodyStatements_Statement_ContRef : @[Algorithms.Statement]*;
		Delimited_Att : Logical;
	};

	type @[Statements.CaseAction] {
		LabelValue_Ref : @[Core.Expression]*;
		Action_ContRef : @[Algorithms.Statement]?;
		IsDefault_Att : Logical;
	};

	type @[Statements.MemberCell] : @[Statements.VARExpression] {
		IndexValue_Ref : @[Core.Expression];
		BaseAggregate_ContRef : @[Statements.VARExpression];
	};

	type @[Statements.RepeatStatement] : @[Algorithms.Statement], @[Core.LocalScope] {
		WhileExpression_Ref : @[Core.Expression]?;
		Body_ContRef : @[Algorithms.Statement];
		ControlVariable_ContRef : @[Statements.ControlVariable]?;
		UntilExpression_Ref : @[Core.Expression]?;
	};

	type @[Statements.GroupCell] : @[Statements.VARExpression] {
		BaseEntity_ContRef : @[Statements.VARExpression];
		RefersTo_Ref : @[Core.SingleEntityType];
		Id_Att : Logical;
	};

	type @[Statements.VariableCell] : @[Statements.VARExpression] {
		RefersTo_Ref : @[Algorithms.Variable];
		Id_Att : Logical;
	};

	type @[Statements.CaseStatement] : @[Algorithms.Statement] {
		Cases_ContRef : @[Statements.CaseAction]+;
		SelectionExpression_Ref : @[Core.Expression];
	};

	type @[Statements.IfStatement] : @[Algorithms.Statement] {
		IfCondition_ContRef : @[Core.Expression];
		ElseActions_ContRef : @[Algorithms.Statement]?;
		ThenActions_ContRef : @[Algorithms.Statement];
	};

	type @[Statements.EscapeStatement] : @[Statements.ControlStatement];

	type @[Statements.ReturnStatement] : @[Statements.ControlStatement] {
		ReturnValue_Ref : @[Core.Expression]?;
	};

	type @[Statements.Assignment] : @[Algorithms.Statement] {
		AssignedValue_Ref : @[Core.Expression];
		Variable_Ref : @[Statements.VARExpression];
	};

	type @[Expressions.Selector] : @[Core.Expression] {
		EntityInstance_Ref : @[Core.Expression];
	};

	type @[Expressions.RepeatCount] {
		Derivation_Ref : @[Core.Expression]?;
	};

	type @[Expressions.EnumItemRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Instances.EnumerationItem];
		Id_Att : Logical;
	};

	type @[Expressions.Literal] : @[Expressions.Primary] {
		RefersTo_Ref : @[Instances.SimpleValue];
	};

	type @[Expressions.BinaryIndex] : @[Expressions.IndexOperation] {
		FirstBit_Ref : @[Core.Expression];
		LastBit_Ref : @[Core.Expression]?;
	};

	type @[Expressions.IndeterminateRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Instances.Indeterminate];
	};

	type @[Expressions.SELFRef] : @[Expressions.Primary];

	type @[Expressions.IndexOperation] : @[Core.Expression] {
		BaseValue_Ref : @[Core.Expression];
	};

	type @[Expressions.BinaryOperation] : @[Expressions.Operation] {
		LeftOperand_Ref : @[Core.Expression];
		RightOperand_Ref : @[Core.Expression];
		Operator_Att : Logical;
	};

	type @[Expressions.AggregateInitializer] : @[Core.Expression] {
		ResultValue_Ref : @[Instances.GenericAggregate]?;
		Bindings_ContRef : @[Expressions.MemberBinding]*;
	};

	type @[Expressions.StringIndex] : @[Expressions.IndexOperation] {
		FirstCode_Ref : @[Core.Expression];
		LastCode_Ref : @[Core.Expression]?;
	};

	type @[Expressions.PartialEntityConstructor] : @[Core.Expression] {
		ResultValue_Ref : @[Instances.PartialEntityValue]?;
		AttributeGroup_Ref : @[Core.SingleEntityType];
		Bindings_ContRef : @[Expressions.AttributeBinding]*;
		Id_Att : Logical;
	};

	type @[Expressions.Coercion] : @[Expressions.Operation] {
		Operand_Ref : @[Core.Expression];
		TargetType_Ref : @[Core.VariableType];
	};

	type @[Expressions.Primary] : @[Core.Expression];

	type @[Expressions.ActualParameter] {
		InProcedureCall_Ref : @[Statements.ProcedureCall]?;
		InFunctionCall_Ref : @[Expressions.FunctionCall]?;
		FormalParameter_Ref : @[Algorithms.Parameter];
		ActualReferent_Ref : @[Statements.VARExpression]?;
		ActualValue_Ref : @[Core.Expression]?;
		Position_Att : Integer32;
	};

	type @[Expressions.ParameterRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Algorithms.Parameter];
		Id_Att : Logical;
	};

	type @[Expressions.AttributeRef] : @[Expressions.Selector] {
		RefersTo_Ref : @[Core.Attribute];
		Id_Att : Logical;
	};

	type @[Expressions.AggregateIndex] : @[Expressions.IndexOperation] {
		IndexValue_ContRef : @[Core.Expression];
	};

	type @[Expressions.GroupRef] : @[Expressions.Selector] {
		RefersTo_Ref : @[Core.SingleEntityType];
		Id_Att : Logical;
	};

	type @[Expressions.UnaryOperation] : @[Expressions.Operation] {
		UnaryOperand_Ref : @[Core.Expression];
		Operator_Att : Logical;
	};

	type @[Expressions.UsedInRef] : @[Expressions.Selector] {
		InverseOf_Ref : @[Core.Attribute];
	};

	type @[Expressions.ConstantRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Instances.Constant];
		Id_Att : Logical;
	};

	type @[Expressions.QueryExpression] : @[Core.LocalScope], @[Core.Expression] {
		SelectCondition_ContRef : @[Core.Expression];
		QueryVariable_Ref : @[Expressions.QueryVariable];
		AggregateOperand_Ref : @[Core.Expression];
	};

	type @[Expressions.QueryVariable] : @[Algorithms.NamedVariable];

	type @[Expressions.Operation] : @[Core.Expression];

	type @[Expressions.AttributeBinding] {
		AttributeValue_Ref : @[Core.Expression];
		ToValue_Ref : @[Instances.AttributeValue]?;
		Attribute_Ref : @[Core.ExplicitAttribute];
		Position_Att : Integer32;
	};

	type @[Expressions.FunctionCall] : @[Core.Expression] {
		ActualParameters_ContRef : @[Expressions.ActualParameter]*;
		InvokesFunction_Ref : @[Algorithms.Function];
		ReturnsResult_Ref : @[Algorithms.FunctionResult];
	};

	type @[Expressions.MemberBinding] {
		Repetition_ContRef : @[Expressions.RepeatCount]?;
		ToSlot_Ref : @[Instances.ListMember]*;
		MemberValue_Ref : @[Core.Expression];
		Position_Att : Integer32;
	};

	type @[Expressions.ExtentRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Core.NamedType];
		Id_Att : Logical;
	};

	type @[Expressions.VariableRef] : @[Expressions.Primary] {
		RefersTo_Ref : @[Algorithms.NamedVariable];
		Id_Att : Logical;
	};

	type @[Core.TypeElement] : @[Core.NamedElement];

	type @[Core.SingleEntityType] {
		DeclaresExplicitAttribute_Ref : @[Core.ExplicitAttribute]*;
		DeclaresAttribute_ContRef : @[Core.Attribute]*;
		DeclaredIn_Ref : @[Core.EntityType];
		Equivalent_Ref : @[Core.PartialEntityType];
		Id_ContRef : @[Core.ScopedId];
	};

	type @[Core.AGGREGATEType] : @[Core.GeneralizedType] {
		UpperBound_ContRef : @[Core.SizeConstraint]?;
		MemberType_Ref : @[Core.ParameterType];
		Constraint_Ref : @[Algorithms.ActualStructureConstraint]?;
		LowerBound_ContRef : @[Core.SizeConstraint]?;
	};

	type @[Core.GeneralBAGType] : @[Core.GeneralAggregationType];

	type @[Core.DomainRule] : @[Core.DomainConstraint], @[Core.TypeElement] {
		Position_Att : Integer32;
	};

	type @[Core.GeneralAggregationType] : @[Core.GeneralizedType], @[Core.AggregationType] {
		MemberType_Ref : @[Core.GeneralizedType];
	};

	type @[Core.ConcreteType] : @[Core.InstantiableType];

	type @[Core.Expression] {
		Evaluation_Ref : @[Core.Instance]?;
		InterpretationContext_Ref : @[Core.Scope]?;
		DataType_Ref : @[Core.DataType]?;
		Text_Att : Logical;
	};

	type @[Core.InverseAttribute] : @[Core.Attribute] {
		ModelsRole_Ref : @[Core.DomainRole];
		Explicit_Ref : @[Core.InvertibleAttribute];
		IsUnique_Att : Logical;
	};

	type @[Core.EnumerationType] : @[Core.DefinedType] {
		Values_Ref : @[Instances.EnumerationItem]*;
		DeclaredItems_ContRef : @[Instances.EnumerationItem]*;
		Extension_Ref : @[Core.EnumerationType]*;
		Base_Ref : @[Core.EnumerationType];
		IsExtensible_Att : Logical;
	};

	type @[Core.VariableType] : @[Core.DataType], @[Core.AttributeType];

	type @[Core.ArrayBound] {
		BoundExpression_Ref : @[Core.Expression];
		Bound_Att : Integer32;
	};

	type @[Core.GeneralSETType] : @[Core.GeneralAggregationType];

	type @[Core.LISTType] : @[Core.ConcreteAggregationType];

	type @[Core.Redeclaration] {
		Derivation_Ref : @[Core.Expression]?;
		RestrictedType_Ref : @[Core.AttributeType];
		Refines_Ref : @[Core.Redeclaration]?;
		UpperBound_ContRef : @[Core.SizeConstraint]?;
		LowerBound_ContRef : @[Core.SizeConstraint]?;
		Scope_Ref : @[Core.EntityType];
		OriginalAttribute_Ref : @[Core.Attribute];
		RefinedRole_Ref : @[Core.Role]?;
		Position_Att : Integer32;
		IsMandatory_Att : Logical;
		Alias_ContRef : @[Core.ScopedId]?;
	};

	type @[Core.EntityType] : @[Core.NamedType], @[Core.InstantiableType] {
		PlaysRole_Ref : @[Core.Role]*;
		Redeclarations_ContRef : @[Core.Redeclaration]*;
		Attributes_ContRef : @[Core.Attribute]*;
		PlaysRangeRole_Ref : @[Core.RangeRole]*;
		Declares_Ref : @[Core.SingleEntityType];
		Extension_Ref : @[Rules.Extent]*;
		InvertibleAttributes_Ref : @[Core.InvertibleAttribute]*;
		PlaysDomainRole_Ref : @[Core.DomainRole]*;
		UniqueRules_Ref : @[Core.UniqueRule]*;
		UsedIn_Ref : @[Core.InvertibleAttribute]*;
		SubtypeOf_Ref : @[Core.EntityType]*;
		IsAbstract_Att : Logical;
	};

	type @[Core.DataType] {
		Instances_Ref : @[Core.Instance]*;
	};

	type @[Core.PartialEntityType] : @[Core.DataType] {
		Components_Ref : @[Core.SingleEntityType]+;
	};

	type @[Core.Schema] : @[Core.Scope] {
		Documentation_Ref : @[Core.Remark]*;
		Interfaces_ContRef : @[Core.InterfacedElement]*;
		SchemaElements_ContRef : @[Core.SchemaElement]*;
		InterfacedElements_Ref : @[Core.SchemaElement]*;
		Name_Att : Logical;
		Version_Att : Logical;
	};

	type @[Core.InvertibleAttribute] : @[Core.ExplicitAttribute] {
		Inverse_Ref : @[Core.InverseAttribute]*;
		RangeType_Ref : @[Core.EntityType]+;
		CreatesRelationship_Ref : @[Core.Relationship];
		ReferencingType_Ref : @[Core.EntityType]+;
		ModelsRole_Ref : @[Core.RangeRole];
	};

	type @[Core.GeneralizedType] : @[Core.ParameterType], @[Core.AttributeType] {
		OccursIn_Ref : @[Core.ParameterType]+;
	};

	type @[Core.InterfacedElement] {
		InterfacingSchema_Ref : @[Core.Schema];
		RefersTo_Ref : @[Core.SchemaElement];
		IsUSE_Att : Logical;
		InterfacedId_ContRef : @[Core.ScopedId]?;
	};

	type @[Core.NumericType] : @[Core.SimpleType];

	type @[Core.DefinedType] : @[Core.NamedType], @[Core.ConcreteType];

	type @[Core.UniqueRule] : @[Core.TypeElement] {
		Domain_Ref : @[Core.EntityType];
		KeyComponent_Ref : @[Core.Attribute]+;
		Position_Att : Integer32;
	};

	type @[Core.DomainRole] : @[Core.Role] {
		RangeView_Ref : @[Core.InverseAttribute]?;
		Domain_Ref : @[Core.EntityType];
		Id_ContRef : @[Core.ScopedId]?;
	};

	type @[Core.DomainConstraint] {
		Domain_Ref : @[Core.AttributeType];
		Asserts_ContRef : @[Core.Expression]?;
	};

	type @[Core.InstantiableType] : @[Core.ParameterType], @[Core.VariableType] {
		FundamentalType_Ref : @[Core.InstantiableType];
	};

	type @[Core.GeneralLISTType] : @[Core.GeneralAggregationType];

	type @[Core.NamedElement] {
		Namespace_Ref : @[Core.Scope];
		Documentation_Ref : @[Core.Remark]*;
		Id_ContRef : @[Core.ScopedId]?;
	};

	type @[Core.Attribute] : @[Core.TypeElement] {
		AttributeType_Ref : @[Core.AttributeType];
		OfEntity_Ref : @[Core.SingleEntityType];
		IsAbstract_Att : Logical;
		Position_Att : Integer32;
		OwningEntity_Ref : @[Core.EntityType];
	};

	type @[Core.BAGType] : @[Core.ConcreteAggregationType];

	type @[Core.RealType] : @[Core.NumericType] {
		Precision_Att : Integer32;
	};

	type @[Core.LogicType] : @[Core.SimpleType];

	type @[Core.GenericType] : @[Core.GeneralizedType] {
		Constraint_Ref : @[Algorithms.ActualTypeConstraint]?;
		IsEntity_Att : Logical;
	};

	type @[Core.StringType] : @[Core.SimpleType] {
		StringLengthConstraint_ContRef : @[Core.LengthConstraint]?;
	};

	type @[Core.AnonymousType] : @[Core.ConcreteType], @[Core.InstantiableType] {
		Specializes_Ref : @[Core.AnonymousType]*;
	};

	type @[Core.AlgorithmScope] : @[Core.LocalScope] {
		CommonElements_Ref : @[Core.CommonElement]*;
		Variables_Ref : @[Algorithms.Variable]*;
	};

	type @[Core.Instance] {
		AppearsInPopulation_Ref : @[Instances.Population]*;
		OfType_Ref : @[Core.DataType]+;
	};

	type @[Core.AttributeType] {
		Role_Ref : @[Core.Attribute]*;
		Constraints_Ref : @[Core.DomainConstraint]*;
	};

	type @[Core.DerivedAttribute] : @[Core.Attribute] {
		Derivation_Ref : @[Core.Expression];
	};

	type @[Core.RangeRole] : @[Core.Role] {
		DomainView_Ref : @[Core.InvertibleAttribute];
		Range_Ref : @[Core.EntityType];
		Id_ContRef : @[Core.ScopedId];
	};

	type @[Core.LocalElement] : @[Core.NamedElement];

	type @[Core.Remark] {
		DescribesSchema_Ref : @[Core.Schema]*;
		AppearsIn_Ref : @[Core.Scope];
		DescribesElement_Ref : @[Core.NamedElement]*;
		IsTagged_Att : Logical;
		IsTail_Att : Logical;
		Text_Att : Logical;
	};

	type @[Core.SizeConstraint] : @[Core.DomainConstraint] {
		Bound_Att : Integer32;
	};

	type @[Core.Role] {
		InRelationship_Ref : @[Core.Relationship];
		OfEntity_Ref : @[Core.EntityType]+;
		UpperBound_Ref : @[Core.SizeConstraint]?;
		LowerBound_Ref : @[Core.SizeConstraint]?;
	};

	type @[Core.SETType] : @[Core.ConcreteAggregationType];

	type @[Core.SpecializedType] : @[Core.DefinedType] {
		UnderlyingType_Ref : @[Core.ConcreteType];
	};

	type @[Core.GeneralARRAYType] : @[Core.GeneralAggregationType] {
		HiIndex_ContRef : @[Core.ArrayBound]?;
		LoIndex_ContRef : @[Core.ArrayBound]?;
		IsOptional_Att : Logical;
	};

	type @[Core.Relationship] {
		Domain_Ref : @[Core.DomainRole];
		Roles_Ref : @[Core.Role]#2 .. 2;
		BasedOn_Ref : @[Core.InvertibleAttribute];
		Range_Ref : @[Core.RangeRole];
	};

	type @[Core.LengthConstraint] : @[Core.DomainConstraint] {
		MaxLength_Att : Integer32;
		IsFixed_Att : Logical;
	};

	type @[Core.LocalScope] : @[Core.Scope] {
		LocalElements_Ref : @[Core.LocalElement]*;
	};

	type @[Core.NamedType] : @[Core.InstantiableType], @[Core.Scope], @[Core.CommonElement], @[Core.AttributeType] {
		Instantiates_Ref : @[Core.SelectType]*;
		DomainRules_Ref : @[Core.DomainRule]*;
	};

	type @[Core.BinaryType] : @[Core.SimpleType] {
		BinaryLengthConstraint_ContRef : @[Core.LengthConstraint]?;
	};

	type @[Core.ScopedId] {
		LocalName_Att : Logical;
		DefiningScope_Ref : @[Core.Scope];
	};

	type @[Core.AggregationType] {
		LowerBound_ContRef : @[Core.SizeConstraint]?;
		UpperBound_ContRef : @[Core.SizeConstraint]?;
		IsUnique_Att : Logical;
		Ordering_Att : Logical;
	};

	type @[Core.Scope] {
		NamedElements_ContRef : @[Core.NamedElement]*;
		IncludesRemarks_Ref : @[Core.Remark]*;
	};

	type @[Core.ParameterType] {
		Contains_Ref : @[Core.GeneralizedType]*;
	};

	type @[Core.SelectType] : @[Core.DefinedType] {
		AllowedTypes_Ref : @[Core.NamedType]*;
		Extension_Ref : @[Core.SelectType]*;
		Base_Ref : @[Core.SelectType];
		SelectList_Ref : @[Core.NamedType]*;
		IsExtensible_Att : Logical;
		IsEntity_Att : Logical;
	};

	type @[Core.ActualType] : @[Core.VariableType] {
		Scope_Ref : @[Algorithms.Algorithm];
	};

	type @[Core.ExplicitAttribute] : @[Core.Attribute] {
		IsOptional_Att : Logical;
	};

	type @[Core.SimpleType] : @[Core.AnonymousType] {
		Id_Att : Logical;
	};

	type @[Core.CommonElement] : @[Core.SchemaElement] {
		LocalScope_Ref : @[Core.AlgorithmScope]?;
	};

	type @[Core.SchemaElement] : @[Core.NamedElement] {
		ReferencedAs_Ref : @[Core.InterfacedElement]*;
		ReferencedIn_Ref : @[Core.Schema]*;
		DefinedIn_Ref : @[Core.Schema]?;
	};

	type @[Core.ConcreteAggregationType] : @[Core.AnonymousType], @[Core.AggregationType] {
		MemberType_Ref : @[Core.InstantiableType];
	};

	type @[Core.ARRAYType] : @[Core.ConcreteAggregationType] {
		LoIndex_ContRef : @[Core.ArrayBound];
		HiIndex_ContRef : @[Core.ArrayBound];
		IsOptional_Att : Logical;
	};

	type @[Algorithms.ActualTypeConstraint] {
		MatchingType_Ref : @[Core.GenericType];
		RequiredType_Ref : @[Algorithms.ActualDataType];
		Label_Att : Logical;
	};

	type @[Algorithms.FunctionResult] : @[Algorithms.Variable];

	type @[Algorithms.Function] : @[Algorithms.Algorithm] {
		Result_ContRef : @[Algorithms.FunctionResult];
	};

	type @[Algorithms.InParameter] : @[Algorithms.Parameter] {
		Variable_Ref : @[Algorithms.InVariable];
	};

	type @[Algorithms.LocalVariable] : @[Algorithms.Variable] {
		InitialValue_Ref : @[Core.Expression]?;
	};

	type @[Algorithms.ActualStructure] : @[Algorithms.GenericElement], @[Core.AGGREGATEType];

	type @[Algorithms.ActualGenericType] : @[Core.ActualType] {
		RefersTo_Ref : @[Algorithms.ActualDataType];
		IsEntity_Att : Logical;
		Label_Att : Logical;
	};

	type @[Algorithms.Statement] {
		InBlock_Ref : @[Statements.StatementBlock]?;
		BodyStatementsSkipStatement_ContRef : @[Statements.SkipStatement]*;
		BodyStatementsEscapeStatement_ContRef : @[Statements.EscapeStatement]*;
		ControlledBy_Ref : @[Statements.RepeatStatement]?;
		Implements_Ref : @[Algorithms.Algorithm]?;
		Text_Att : Logical;
	};

	type @[Algorithms.NamedVariable] : @[Core.LocalElement] {
		VariableType_Ref : @[Core.VariableType];
	};

	type @[Algorithms.InVariable] : @[Algorithms.Variable] {
		Source_Ref : @[Algorithms.InParameter];
	};

	type @[Algorithms.Procedure] : @[Algorithms.Algorithm];

	type @[Algorithms.ActualARRAYType] : @[Algorithms.ActualAggregationType] {
		HiIndex_ContRef : @[Core.ArrayBound];
		LoIndex_ContRef : @[Core.ArrayBound];
		IsOptional_Att : Logical;
	};

	type @[Algorithms.ActualSETType] : @[Algorithms.ActualAggregationType];

	type @[Algorithms.ActualAGGREGATEType] : @[Core.ActualType] {
		UpperBound_ContRef : @[Core.SizeConstraint]?;
		RefersTo_Ref : @[Algorithms.ActualStructure];
		MemberType_Ref : @[Core.VariableType];
		LowerBound_ContRef : @[Core.SizeConstraint]?;
		Label_Att : Logical;
	};

	type @[Algorithms.Parameter] : @[Core.LocalElement] {
		StructureConstraints_ContRef : @[Algorithms.ActualStructureConstraint]*;
		TypeConstraints_ContRef : @[Algorithms.ActualTypeConstraint]*;
		FormalParameterType_Ref : @[Core.ParameterType];
		Inout_Att : Logical;
		Position_Att : Integer32;
	};

	type @[Algorithms.ActualStructureConstraint] {
		MatchingStructure_Ref : @[Core.AGGREGATEType];
		RequiredStructure_Ref : @[Algorithms.ActualStructure];
		Label_Att : Logical;
	};

	type @[Algorithms.Algorithm] : @[Core.AlgorithmScope], @[Core.CommonElement] {
		Body_ContRef : @[Algorithms.Statement]?;
		FormalParameters_Ref : @[Algorithms.Parameter]*;
	};

	type @[Algorithms.ActualAggregationType] : @[Core.ActualType], @[Core.AggregationType] {
		MemberType_Ref : @[Core.ActualType];
	};

	type @[Algorithms.VARVariable];

	type @[Algorithms.ActualLISTType] : @[Algorithms.ActualAggregationType];

	type @[Algorithms.Variable] : @[Algorithms.NamedVariable];

	type @[Algorithms.GenericElement] : @[Core.LocalElement] {
		Source_Ref : @[Algorithms.Parameter];
		Label_ContRef : @[Core.ScopedId];
	};

	type @[Algorithms.VARParameter] : @[Algorithms.Parameter], @[Algorithms.VARVariable];

	type @[Algorithms.ActualDataType] : @[Core.GenericType], @[Algorithms.GenericElement];

	type @[Algorithms.ActualBAGType] : @[Algorithms.ActualAggregationType];

	type @[Instances.AttributeValue] {
		ActualValue_Ref : @[Core.Instance]?;
		Attribute_Ref : @[Core.ExplicitAttribute];
	};

	type @[Instances.ARRAYValue] : @[Instances.AggregateValue] {
		MemberSlot_ContRef : @[Instances.ArrayMember]+;
	};

	type @[Instances.RoleName] : @[Instances.StringValue] {
		RefersTo_Ref : @[Core.Attribute];
		Represents_ContRef : @[Core.ScopedId];
	};

	type @[Instances.EntityInstance] : @[Instances.TypedInstance] {
		State_Ref : @[Instances.EntityValue];
		InstanceOf_Ref : @[Core.EntityType]+;
		Id_Att : Logical;
	};

	type @[Instances.IntegerValue] : @[Instances.RealValue];

	type @[Instances.AggregateValue] : @[Instances.ConcreteValue];

	type @[Instances.Constant] : @[Core.CommonElement] {
		ValueExpression_Ref : @[Core.Expression];
		ActualValue_Ref : @[Core.Instance]?;
		DataType_Ref : @[Core.InstantiableType];
	};

	type @[Instances.LogicalValue] : @[Instances.SimpleValue];

	type @[Instances.TypedInstance] : @[Core.Instance] {
		SatisfiesType_Ref : @[Core.SelectType]*;
	};

	type @[Instances.ListMember] {
		MemberValue_Ref : @[Core.Instance];
		Position_Att : Integer32;
	};

	type @[Instances.BagMember] {
		MemberValue_Ref : @[Core.Instance];
		Count_Att : Integer32;
	};

	type @[Instances.SingleEntityValue] {
		Equivalent_Ref : @[Instances.PartialEntityValue];
		OfType_Ref : @[Core.SingleEntityType];
		Properties_ContRef : @[Instances.AttributeValue]*;
	};

	type @[Instances.Indeterminate] : @[Core.Instance];

	type @[Instances.SingleLeafInstance] : @[Instances.EntityInstance] {
		CharacterizingType_Ref : @[Core.EntityType];
	};

	type @[Instances.GenericAggregate] : @[Instances.LISTValue];

	type @[Instances.BinaryValue] : @[Instances.SimpleValue];

	type @[Instances.SpecializedValue] : @[Instances.TypedInstance] {
		FundamentalValue_Ref : @[Instances.ConcreteValue];
	};

	type @[Instances.BAGValue] : @[Instances.AggregateValue] {
		MemberSlot_ContRef : @[Instances.BagMember]*;
	};

	type @[Instances.EnumerationItem] : @[Core.TypeElement], @[Instances.TypedInstance], @[Instances.ConcreteValue] {
		DeclaredIn_Ref : @[Core.EnumerationType];
		Position_Att : Integer32;
	};

	type @[Instances.EntityValue] : @[Instances.PartialEntityValue] {
		CorrespondsTo_Ref : @[Core.EntityType]+;
		Describes_Ref : @[Instances.EntityInstance]*;
	};

	type @[Instances.SETValue] : @[Instances.AggregateValue] {
		MemberValue_Ref : @[Core.Instance]*;
	};

	type @[Instances.ArrayMember] {
		MemberValue_Ref : @[Core.Instance]?;
		Index_Att : Integer32;
	};

	type @[Instances.Population] {
		CompositionEntityInstance_Ref : @[Instances.EntityInstance]*;
		CompositionInstance_Ref : @[Core.Instance]*;
		GoverningSchema_Ref : @[Core.Schema]*;
	};

	type @[Instances.RealValue] : @[Instances.NumberValue];

	type @[Instances.BooleanValue] : @[Instances.LogicalValue];

	type @[Instances.LISTValue] : @[Core.Instance], @[Instances.AggregateValue] {
		MemberSlot_ContRef : @[Instances.ListMember]*;
	};

	type @[Instances.StringValue] : @[Instances.SimpleValue];

	type @[Instances.TypeName] : @[Instances.StringValue] {
		RefersTo_Ref : @[Core.NamedType];
		Represents_ContRef : @[Core.ScopedId];
	};

	type @[Instances.PartialEntityValue] : @[Core.Instance] {
		Components_ContRef : @[Instances.SingleEntityValue]+;
	};

	type @[Instances.NumberValue] : @[Instances.SimpleValue];

	type @[Instances.MultiLeafInstance] : @[Instances.EntityInstance];

	type @[Instances.SimpleValue] : @[Instances.ConcreteValue] {
		Name_Att : Text;
	};

	type @[Instances.ConcreteValue] : @[Core.Instance];
}