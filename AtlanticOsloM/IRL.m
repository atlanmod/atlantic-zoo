module IRL {

	type Element {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type NamedElement : Element {
		Name_Att : Text;
	};

	type ExtendedIdentifier : NamedElement {
		ParentIdentifier_Ref : ExtendedIdentifier?;
		ExtendedIdentifierOwner_Ref : Extended;
	};

	type Extended : Element {
		ExtendedIdentifier_ContRef : ExtendedIdentifier;
	};

	type Definition : Extended;

	type RuleSet : NamedElement {
		ImportDefinitions_ContRef : ImportDefinition*;
		PropertyDefinitions_ContRef : @[IRLDeclarations.PropertyDefinition]?;
		RulesetElementDefinitions_ContRef : @[IRLRules.RulesetElementDefinition]*;
	};

	type ImportDefinition : Definition {
		ImportDefinitionOwners_Ref : RuleSet;
		DotStar_Att : Logical;
	};

	type @[IRLExpressions.Expression] : @[IRLTypes.Typed] {
		AppliedProperty_Ref : @[IRLExpressions.PropertyCallExpression]?;
		ExpressionOwner_Ref : @[IRLDeclarations.RuleSetDeclaration];
		LoopExpression_Ref : @[IRLExpressions.LoopExpression]?;
		ParentOperation_Ref : @[IRLExpressions.OperationCallExpression]?;
		RuleConditionExpression_Ref : @[IRLRules.RuleCondition];
		ParentInsert_Ref : @[IRLRules.PRRActions.CreateAction]?;
		ParentModifying_Ref : @[IRLRules.PRRActions.ModifyAction]?;
	};

	type @[IRLExpressions.PropertyCallExpression] : @[IRLExpressions.Expression] {
		Source_ContRef : @[IRLExpressions.Expression]?;
	};

	type @[IRLExpressions.IteratorExp] : @[IRLExpressions.LoopExpression] {
		Name_Att : Text;
	};

	type @[IRLExpressions.LoopExpression] : @[IRLExpressions.PropertyCallExpression] {
		Body_ContRef : @[IRLExpressions.Expression];
		Iterators_ContRef : @[IRLExpressions.Iterator]+;
	};

	type @[IRLExpressions.OperatorCallExpression] : @[IRLExpressions.OperationCallExpression];

	type @[IRLExpressions.OperationCallExpression] : @[IRLExpressions.PropertyCallExpression] {
		Arguments_ContRef : @[IRLExpressions.Expression]*;
		OperationName_Att : Text;
		Signature_Att : Text;
	};

	type @[IRLExpressions.PrimitiveExpression] : @[IRLExpressions.Expression];

	type @[IRLExpressions.Iterator] : @[IRLDeclarations.VariableDeclaration] {
		LoopExpression_Ref : @[IRLExpressions.LoopExpression]?;
	};

	type @[IRLExpressions.NumericExpression] : @[IRLExpressions.PrimitiveExpression];

	type @[IRLExpressions.IntegerExpression] : @[IRLExpressions.NumericExpression] {
		IntegerSymbol_Att : Integer32;
	};

	type @[IRLExpressions.RealExpression] : @[IRLExpressions.NumericExpression] {
		RealSymbol_Att : Double;
	};

	type @[IRLExpressions.BooleanExpression] : @[IRLExpressions.PrimitiveExpression] {
		BooleanSymbol_Att : Logical;
	};

	type @[IRLExpressions.NavigationOrAttributeCallExpression] : @[IRLExpressions.PropertyCallExpression] {
		Name_Att : Text;
	};

	type @[IRLExpressions.VariableExpression] : @[IRLExpressions.Expression] {
		ReferredVariable_Ref : @[IRLDeclarations.VariableDeclaration];
		Name_Att : Text;
	};

	type @[IRLExpressions.StringExpression] : @[IRLExpressions.PrimitiveExpression] {
		StringSymbol_Att : Text;
	};

	type @[IRLTypes.Type] : NamedElement {
		TypeOwner_Ref : @[IRLTypes.Typed];
	};

	type @[IRLTypes.Typed] : Element {
		Type_ContRef : @[IRLTypes.Type];
	};

	type @[IRLTypes.Primitive] : @[IRLTypes.Type];

	type @[IRLTypes.StringType] : @[IRLTypes.Primitive];

	type @[IRLTypes.NumericType] : @[IRLTypes.Primitive];

	type @[IRLTypes.IntegerType] : @[IRLTypes.NumericType];

	type @[IRLTypes.RealType] : @[IRLTypes.NumericType];

	type @[IRLTypes.BooleanType] : @[IRLTypes.Primitive];

	type @[IRLTypes.ClassType] : @[IRLTypes.Type];

	type @[IRLDeclarations.PropertyDefinition] : Definition {
		PropertyDefinitionOwner_Ref : RuleSet;
		RuleSetDeclarations_ContRef : @[IRLDeclarations.RuleSetDeclaration]*;
		SemicoloneOpt_Att : Logical;
	};

	type @[IRLDeclarations.RuleSetDeclaration] : Element {
		RuleSetDeclarationOwner_Ref : @[IRLDeclarations.PropertyDefinition];
		Expression_ContRef : @[IRLExpressions.Expression]?;
	};

	type @[IRLDeclarations.ClassInstancesDeclaration] : @[IRLDeclarations.RuleSetDeclaration], Extended;

	type @[IRLDeclarations.PropertyDeclaration] : @[IRLDeclarations.RuleSetDeclaration];

	type @[IRLDeclarations.VariableDeclaration] : @[IRLTypes.Typed] {
		VarName_Att : Text;
		VariableExp_Ref : @[IRLExpressions.VariableExpression]*;
	};

	type @[IRLRules.RulesetElementDefinition] : NamedElement {
		RulesetElementDefinitionOwner_Ref : RuleSet;
	};

	type @[IRLRules.RuleDefinition] : @[IRLRules.RulesetElementDefinition] {
		Binding_ContRef : @[IRLRules.Binding]?;
		Condition_ContRef : @[IRLRules.RuleCondition]?;
		Actions_ContRef : @[IRLRules.RuleAction]*;
	};

	type @[IRLRules.Binding] : Element {
		BindingOwner_Ref : @[IRLRules.RuleDefinition];
		RuleVariable_ContRef : @[IRLRules.RuleVariable]*;
	};

	type @[IRLRules.RuleVariable] : @[IRLDeclarations.VariableDeclaration] {
		RuleVariableOwner_Ref : @[IRLRules.Binding];
		Filter_ContRef : @[IRLExpressions.Expression]*;
		CollectIn_ContRef : @[IRLExpressions.Expression]?;
	};

	type @[IRLRules.CollectionOperationRuleVariable] : @[IRLRules.RuleVariable] {
		OperationName_Att : Text;
		CollectWhere_ContRef : @[IRLExpressions.Expression]?;
	};

	type @[IRLRules.SimpleRuleVariable] : @[IRLRules.RuleVariable];

	type @[IRLRules.RuleCondition] : Element {
		ConditionExpression_ContRef : @[IRLExpressions.Expression]?;
		RuleDefinitionCondition_Ref : @[IRLRules.RuleDefinition];
	};

	type @[IRLRules.RuleAction] : Element {
		ActionOwner_Ref : @[IRLRules.RuleDefinition]?;
	};

	type @[IRLRules.PRRActions.DeleteAction] : @[IRLRules.RuleAction] {
		ObjValue_ContRef : @[IRLExpressions.Expression];
	};

	type @[IRLRules.PRRActions.CreateAction] : @[IRLRules.RuleAction], @[IRLDeclarations.VariableDeclaration] {
		InsertArguments_ContRef : @[IRLExpressions.Expression]*;
	};

	type @[IRLRules.PRRActions.ModifyAction] : @[IRLRules.RuleAction] {
		ObjValue_ContRef : @[IRLExpressions.Expression];
		ModifiedArguments_ContRef : @[IRLExpressions.Expression]*;
	};

	type @[IRLRules.PRRActions.UpdateAction] : @[IRLRules.RuleAction] {
		ObjValue_ContRef : @[IRLExpressions.Expression];
	};

	type @[IRLRules.PRRActions.InvokeAction] : @[IRLRules.RuleAction] {
		Invocation_ContRef : @[IRLExpressions.Expression];
	};
}