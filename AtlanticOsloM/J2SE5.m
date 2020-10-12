module MetamodelRoot {

	type @[J2SE5.AbstractTypeDeclaration] : @[J2SE5.NamedElement], @[J2SE5.BodyDeclaration] {
		OriginalFileContent_Att : Text;
		Package_Ref : @[J2SE5.PackageDeclaration];
		BodyDeclarations_ContRef : @[J2SE5.BodyDeclaration]*;
		SuperInterfaces_ContRef : @[J2SE5.NamedElementRef]*;
		CommentsAfterBody_ContRef : @[J2SE5.Comment]*;
		Imports_ContRef : @[J2SE5.ImportDeclaration]*;
		CommentsBeforeBody_ContRef : @[J2SE5.Comment]*;
	};

	type @[J2SE5.Annotation] : @[J2SE5.Expression] {
		Type_ContRef : @[J2SE5.NamedElementRef];
		Values_ContRef : @[J2SE5.AnnotationMemberValuePair]*;
	};

	type @[J2SE5.AnnotationMemberValuePair] : @[J2SE5.ASTNode] {
		Member_ContRef : @[J2SE5.NamedElementRef];
		Value_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.AnnotationTypeDeclaration] : @[J2SE5.AbstractTypeDeclaration];

	type @[J2SE5.AnnotationTypeMemberDeclaration] : @[J2SE5.NamedElement], @[J2SE5.BodyDeclaration] {
		Type_ContRef : @[J2SE5.NamedElementRef];
		Default_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.AnonymousClassDeclaration] : @[J2SE5.ASTNode] {
		BodyDeclarations_ContRef : @[J2SE5.BodyDeclaration]*;
	};

	type @[J2SE5.ArrayAccess] : @[J2SE5.Expression] {
		Index_ContRef : @[J2SE5.Expression];
		Array_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.ArrayCreation] : @[J2SE5.Expression] {
		Dimensions_ContRef : @[J2SE5.Expression]*;
		Initializer_ContRef : @[J2SE5.ArrayInitializer]?;
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.ArrayInitializer] : @[J2SE5.Expression] {
		Expressions_ContRef : @[J2SE5.Expression]*;
	};

	type @[J2SE5.ArrayLengthAccess] : @[J2SE5.Expression] {
		Array_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.AssertStatement] : @[J2SE5.Statement] {
		Message_ContRef : @[J2SE5.Expression]?;
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.Assignment] : @[J2SE5.Expression] {
		Operator_Att : Text;
		RightHandSide_ContRef : @[J2SE5.Expression];
		LeftHandSide_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.ASTNode] {
		Comments_ContRef : @[J2SE5.Comment]*;
	};

	type @[J2SE5.BodyDeclaration] : @[J2SE5.ASTNode] {
		Modifiers_Att : Text;
		Annotations_ContRef : @[J2SE5.Annotation]*;
	};

	type @[J2SE5.Block] : @[J2SE5.Statement] {
		Statements_ContRef : @[J2SE5.Statement]*;
	};

	type @[J2SE5.BlockComment] : @[J2SE5.Comment];

	type @[J2SE5.BreakStatement] : @[J2SE5.Statement] {
		Label_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.CastExpression] : @[J2SE5.Expression] {
		Type_ContRef : @[J2SE5.NamedElementRef];
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.CatchClause] : @[J2SE5.ASTNode] {
		Exception_ContRef : @[J2SE5.SingleVariableDeclaration];
		Body_ContRef : @[J2SE5.Block];
	};

	type @[J2SE5.ClassInstanceCreation] : @[J2SE5.Expression] {
		Arguments_ContRef : @[J2SE5.Expression]*;
		Type_ContRef : @[J2SE5.NamedElementRef];
		Expression_ContRef : @[J2SE5.Expression]?;
		AnonymousClassDeclaration_ContRef : @[J2SE5.AnonymousClassDeclaration]?;
	};

	type @[J2SE5.Comment] : @[J2SE5.ASTNode] {
		Content_Att : Text;
		IsEnclosedByParent_Att : Logical;
		IsPrefixOfParent_Att : Logical;
	};

	type @[J2SE5.ConditionalExpression] : @[J2SE5.Expression] {
		ElseExpression_ContRef : @[J2SE5.Expression];
		ThenExpression_ContRef : @[J2SE5.Expression];
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.ContinueStatement] : @[J2SE5.Statement] {
		Label_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.ConstructorInvocation] : @[J2SE5.Statement] {
		Arguments_ContRef : @[J2SE5.Expression]*;
	};

	type @[J2SE5.DoStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression];
		Body_ContRef : @[J2SE5.Statement];
	};

	type @[J2SE5.EmptyStatement] : @[J2SE5.Statement];

	type @[J2SE5.EnhancedForStatement] : @[J2SE5.Statement] {
		Parameter_ContRef : @[J2SE5.SingleVariableDeclaration];
		Expression_ContRef : @[J2SE5.Expression];
		Body_ContRef : @[J2SE5.Statement];
	};

	type @[J2SE5.EnumConstantDeclaration] : @[J2SE5.BodyDeclaration], @[J2SE5.NamedElement] {
		Arguments_ContRef : @[J2SE5.Expression]*;
		AnonymousClassDeclaration_ContRef : @[J2SE5.AnonymousClassDeclaration]?;
	};

	type @[J2SE5.EnumDeclaration] : @[J2SE5.AbstractTypeDeclaration] {
		EnumConstants_ContRef : @[J2SE5.EnumConstantDeclaration]*;
	};

	type @[J2SE5.Expression] : @[J2SE5.ASTNode];

	type @[J2SE5.ExpressionStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.FieldAccess] : @[J2SE5.Expression] {
		Field_ContRef : @[J2SE5.NamedElementRef];
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.FieldDeclaration] : @[J2SE5.BodyDeclaration], @[J2SE5.MultipleValuedNamedElement] {
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.ForStatement] : @[J2SE5.Statement] {
		Body_ContRef : @[J2SE5.Statement];
		Expression_ContRef : @[J2SE5.Expression]?;
		Initializers_ContRef : @[J2SE5.Expression]*;
		Updaters_ContRef : @[J2SE5.Expression]*;
	};

	type @[J2SE5.InfixExpression] : @[J2SE5.Expression] {
		Operator_Att : Text;
		ExtendedOperands_ContRef : @[J2SE5.Expression]*;
		RightOperand_ContRef : @[J2SE5.Expression];
		LeftOperand_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.IfStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression];
		ElseStatement_ContRef : @[J2SE5.Statement]?;
		ThenStatement_ContRef : @[J2SE5.Statement];
	};

	type @[J2SE5.ImportDeclaration] : @[J2SE5.ASTNode] {
		Static_Att : Logical;
		ImportedElement_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.Initializer] : @[J2SE5.BodyDeclaration] {
		Body_ContRef : @[J2SE5.Block];
	};

	type @[J2SE5.InstanceofExpression] : @[J2SE5.Expression] {
		LeftOperand_ContRef : @[J2SE5.Expression];
		RightOperand_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.Javadoc] : @[J2SE5.Comment] {
		Tags_ContRef : @[J2SE5.TagElement]*;
	};

	type @[J2SE5.LabeledStatement] : @[J2SE5.Statement], @[J2SE5.NamedElement] {
		Body_ContRef : @[J2SE5.Statement];
	};

	type @[J2SE5.LineComment] : @[J2SE5.Comment];

	type @[J2SE5.MemberRef] : @[J2SE5.ASTNode] {
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
		Member_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.MethodDeclaration] : @[J2SE5.NamedElement], @[J2SE5.BodyDeclaration] {
		ExtraArrayDimensions_Att : Integer32;
		Constructor_Att : Logical;
		Varargs_Att : Logical;
		Body_ContRef : @[J2SE5.Block]?;
		Parameters_ContRef : @[J2SE5.SingleVariableDeclaration]*;
		TypeParameters_ContRef : @[J2SE5.TypeParameter]*;
		ThrownExceptions_ContRef : @[J2SE5.NamedElementRef]*;
		ReturnType_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.MethodInvocation] : @[J2SE5.Expression] {
		Method_ContRef : @[J2SE5.NamedElementRef];
		Arguments_ContRef : @[J2SE5.Expression]*;
		Expression_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.MethodRef] : @[J2SE5.ASTNode] {
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
		Parameters_ContRef : @[J2SE5.MethodRefParameter]*;
		Method_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.MethodRefParameter] : @[J2SE5.ASTNode] {
		Name_Att : Text;
		IsVarargs_Att : Logical;
		Type_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.Model] {
		Name_Att : Text;
		OwnedElements_ContRef : @[J2SE5.PackageDeclaration]*;
		OrphanTypes_ContRef : @[J2SE5.OrphanType]*;
	};

	type @[J2SE5.MultipleValuedNamedElement] : @[J2SE5.ValuedNamedElement] {
		Fragments_ContRef : @[J2SE5.SingleVariableDeclaration]*;
	};

	type @[J2SE5.NamedElement] {
		Name_Att : Text;
		Proxy_Att : Logical;
	};

	type @[J2SE5.NamedElementRef] : @[J2SE5.Expression] {
		ExtraArrayDimensions_Att : Integer32;
		Element_Ref : @[J2SE5.NamedElement]?;
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.OrphanType] : @[J2SE5.NamedElement];

	type @[J2SE5.PackageDeclaration] : @[J2SE5.ASTNode], @[J2SE5.NamedElement] {
		Model_Ref : @[J2SE5.Model];
		OwnedElements_ContRef : @[J2SE5.AbstractTypeDeclaration]*;
	};

	type @[J2SE5.ParameterizedType] : @[J2SE5.ASTNode], @[J2SE5.OrphanType] {
		TypeArguments_ContRef : @[J2SE5.NamedElementRef]*;
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.ParenthesizedExpression] : @[J2SE5.Expression] {
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.PostfixExpression] : @[J2SE5.Expression] {
		Operator_Att : Text;
		Operand_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.PrefixExpression] : @[J2SE5.Expression] {
		Operator_Att : Text;
		Operand_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.PrimitiveType] : @[J2SE5.ASTNode], @[J2SE5.OrphanType];

	type @[J2SE5.ReturnStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.ThrowStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.SingleVariableDeclaration] : @[J2SE5.ASTNode], @[J2SE5.ValuedNamedElement] {
		Modifiers_Att : Text;
		IsVarargs_Att : Logical;
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.Statement] : @[J2SE5.ASTNode];

	type @[J2SE5.SuperConstructorInvocation] : @[J2SE5.Statement] {
		Arguments_ContRef : @[J2SE5.Expression]*;
		Expression_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.SuperFieldAccess] : @[J2SE5.Expression] {
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
		Field_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.SuperMethodInvocation] : @[J2SE5.Expression] {
		Arguments_ContRef : @[J2SE5.Expression]*;
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
		Method_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.SwitchCase] : @[J2SE5.Statement] {
		ExpressionInitialized_Att : Logical;
		Expression_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.SwitchStatement] : @[J2SE5.Statement] {
		Statements_ContRef : @[J2SE5.Statement]*;
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.SynchronizedStatement] : @[J2SE5.Statement] {
		Body_ContRef : @[J2SE5.Block];
		Expression_ContRef : @[J2SE5.Expression];
	};

	type @[J2SE5.TagElement] : @[J2SE5.ASTNode] {
		TagName_Att : Text;
		Fragments_ContRef : @[J2SE5.ASTNode]*;
	};

	type @[J2SE5.TextElement] : @[J2SE5.ASTNode] {
		Text_Att : Text;
	};

	type @[J2SE5.ThisExpression] : @[J2SE5.Expression] {
		Qualifier_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.TryStatement] : @[J2SE5.Statement] {
		Finally_ContRef : @[J2SE5.Block]?;
		Body_ContRef : @[J2SE5.Block];
		CatchClauses_ContRef : @[J2SE5.CatchClause]*;
	};

	type @[J2SE5.TypeDeclaration] : @[J2SE5.AbstractTypeDeclaration] {
		IsInterface_Att : Logical;
		TypeParameters_ContRef : @[J2SE5.TypeParameter]*;
		Superclass_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.TypeDeclarationStatement] : @[J2SE5.Statement] {
		Declaration_ContRef : @[J2SE5.AbstractTypeDeclaration];
	};

	type @[J2SE5.TypeLiteral] : @[J2SE5.Expression] {
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.TypeParameter] : @[J2SE5.ASTNode], @[J2SE5.NamedElement] {
		Bounds_ContRef : @[J2SE5.NamedElementRef]*;
	};

	type @[J2SE5.UnresolvedItem] : @[J2SE5.NamedElement], @[J2SE5.ASTNode];

	type @[J2SE5.ValuedNamedElement] : @[J2SE5.NamedElement] {
		ExtraArrayDimensions_Att : Integer32;
		Initializer_ContRef : @[J2SE5.Expression]?;
	};

	type @[J2SE5.VariableDeclarationExpression] : @[J2SE5.Expression], @[J2SE5.MultipleValuedNamedElement], @[J2SE5.ValuedNamedElement] {
		Modifiers_Att : Text;
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.VariableDeclarationStatement] : @[J2SE5.Statement], @[J2SE5.MultipleValuedNamedElement], @[J2SE5.ValuedNamedElement] {
		Modifiers_Att : Text;
		Type_ContRef : @[J2SE5.NamedElementRef];
	};

	type @[J2SE5.WildCardType] : @[J2SE5.OrphanType], @[J2SE5.ASTNode] {
		IsUpperBound_Att : Logical;
		Bound_ContRef : @[J2SE5.NamedElementRef]?;
	};

	type @[J2SE5.WhileStatement] : @[J2SE5.Statement] {
		Expression_ContRef : @[J2SE5.Expression];
		Body_ContRef : @[J2SE5.Statement];
	};
}