module PRR {

	type Element {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type NamedElement : Element {
		Name_Att : Text;
	};

	type RuleSet : Element {
		Rules_ContRef : Rule*;
	};

	type Rule : NamedElement {
		Binding_ContRef : Binding?;
		Condition_ContRef : RuleCondition?;
		Actions_ContRef : RuleAction*;
		RuleOwner_Ref : RuleSet?;
	};

	type RuleAction : Element {
		ActionOwner_Ref : Rule?;
	};

	type RuleCondition : Element {
		RuleConditionOwner_Ref : Rule?;
		ConditionExp_ContRef : @[PRRExpressions.OclExpression]?;
	};

	type Binding : Element {
		BindingOwner_Ref : Rule;
		RuleVariable_ContRef : RuleVariable*;
	};

	type RuleVariable : @[PRRExpressions.VariableDeclaration] {
		RuleVariableOwner_Ref : Binding;
		Filter_ContRef : @[PRRExpressions.OclExpression]?;
	};

	type @[PRRActions.DeleteAction] : RuleAction {
		ObjValue_ContRef : @[PRRExpressions.OclExpression];
	};

	type @[PRRActions.CreateAction] : RuleAction, @[PRRExpressions.VariableDeclaration] {
		InsertArguments_ContRef : @[PRRExpressions.OclExpression]*;
	};

	type @[PRRActions.AssignAction] : RuleAction {
		ObjValue_ContRef : @[PRRExpressions.OclExpression];
		AValue_ContRef : @[PRRExpressions.OclExpression];
	};

	type @[PRRActions.InvokeAction] : RuleAction {
		Invocation_ContRef : @[PRRExpressions.OclExpression];
	};

	type @[PRRExpressions.PropertyCallExp] : @[PRRExpressions.OclExpression] {
		Source_ContRef : @[PRRExpressions.OclExpression]?;
	};

	type @[PRRExpressions.OclExpression] : Element {
		LoopExp_Ref : @[PRRExpressions.LoopExp]?;
		AppliedProperty_Ref : @[PRRExpressions.PropertyCallExp]?;
		ParentOperation_Ref : @[PRRExpressions.OperationCallExp]?;
		ParentInsert_Ref : @[PRRActions.CreateAction]?;
		Type_ContRef : @[PRRTypes.OclType];
		FilterRuleVariableOwner_Ref : RuleVariable?;
		ConditionOwner_Ref : RuleCondition?;
		AssignedObj_Ref : @[PRRActions.AssignAction]?;
	};

	type @[PRRExpressions.IteratorExp] : @[PRRExpressions.LoopExp] {
		Name_Att : Text;
	};

	type @[PRRExpressions.LoopExp] : @[PRRExpressions.PropertyCallExp] {
		Body_ContRef : @[PRRExpressions.OclExpression];
		Iterators_ContRef : @[PRRExpressions.Iterator]+;
	};

	type @[PRRExpressions.OperatorCallExp] : @[PRRExpressions.OperationCallExp];

	type @[PRRExpressions.OperationCallExp] : @[PRRExpressions.PropertyCallExp] {
		Arguments_ContRef : @[PRRExpressions.OclExpression]*;
		OperationName_Att : Text;
		Signature_Att : Text;
	};

	type @[PRRExpressions.CollectionOperationCallExp] : @[PRRExpressions.OperationCallExp];

	type @[PRRExpressions.StringExp] : @[PRRExpressions.PrimitiveExp] {
		StringSymbol_Att : Text;
	};

	type @[PRRExpressions.BooleanExp] : @[PRRExpressions.PrimitiveExp] {
		BooleanSymbol_Att : Logical;
	};

	type @[PRRExpressions.NumericExp] : @[PRRExpressions.PrimitiveExp];

	type @[PRRExpressions.IntegerExp] : @[PRRExpressions.NumericExp] {
		IntegerSymbol_Att : Integer32;
	};

	type @[PRRExpressions.RealExp] : @[PRRExpressions.NumericExp] {
		RealSymbol_Att : Double;
	};

	type @[PRRExpressions.PrimitiveExp] : @[PRRExpressions.OclExpression];

	type @[PRRExpressions.NavigationOrAttributeCallExp] : @[PRRExpressions.PropertyCallExp] {
		Name_Att : Text;
	};

	type @[PRRExpressions.Iterator] : @[PRRExpressions.VariableDeclaration] {
		LoopExpr_Ref : @[PRRExpressions.LoopExp]?;
	};

	type @[PRRExpressions.VariableDeclaration] : Element {
		Type_ContRef : @[PRRTypes.OclType];
		VarName_Att : Text;
		VariableExp_Ref : @[PRRExpressions.VariableExp]*;
	};

	type @[PRRExpressions.VariableExp] : @[PRRExpressions.OclExpression] {
		ReferredVariable_Ref : @[PRRExpressions.VariableDeclaration];
	};

	type @[PRRExpressions.TypeExp] : @[PRRExpressions.OclExpression] {
		ReferredType_ContRef : @[PRRTypes.OclType]?;
	};

	type @[PRRExpressions.AllInstanceExp] : @[PRRExpressions.OclExpression] {
		SourceType_ContRef : @[PRRTypes.OclType];
	};

	type @[PRRTypes.OclType] : NamedElement {
		VariableDeclaration_Ref : @[PRRExpressions.VariableDeclaration]*;
		OclExpression_Ref : @[PRRExpressions.OclExpression]*;
		AppliedAllInstance_Ref : @[PRRExpressions.AllInstanceExp]?;
		TypeExp_Ref : @[PRRExpressions.TypeExp]*;
	};

	type @[PRRTypes.StringType] : @[PRRTypes.Primitive];

	type @[PRRTypes.Primitive] : @[PRRTypes.OclType];

	type @[PRRTypes.RealType] : @[PRRTypes.NumericType];

	type @[PRRTypes.BooleanType] : @[PRRTypes.Primitive];

	type @[PRRTypes.NumericType] : @[PRRTypes.Primitive];

	type @[PRRTypes.IntegerType] : @[PRRTypes.NumericType];
}