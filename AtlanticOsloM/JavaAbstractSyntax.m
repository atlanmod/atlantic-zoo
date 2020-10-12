module JavaAbstractSyntax {

	type AST {
		Root_ContRef : ASTNode;
	};

	type ASTNode;

	type AnonymousClassDeclaration : ASTNode {
		BodyDeclarations_ContRef : BodyDeclaration*;
	};

	type BodyDeclaration : ASTNode {
		Modifiers_ContRef : ExtendedModifier*;
		Javadoc_ContRef : Javadoc;
	};

	type CatchClause : ASTNode {
		Body_ContRef : Block;
		Exception_ContRef : SingleVariableDeclaration;
	};

	type Comment : ASTNode {
		AlternateRoot_Ref : ASTNode;
	};

	type CompilationUnit : ASTNode {
		Comments_ContRef : Comment*;
		Package_ContRef : PackageDeclaration;
		Imports_ContRef : ImportDeclaration*;
		Types_ContRef : AbstractTypeDeclaration*;
	};

	type Expression : ASTNode {
		ResolveBoxing_Att : Logical;
		ResolveUnboxing_Att : Logical;
	};

	type ImportDeclaration : ASTNode {
		OnDemand_Att : Logical;
		Static_Att : Logical;
		Name_ContRef : Name;
	};

	type MemberRef : ASTNode {
		Name_ContRef : SimpleName;
		Qualifier_ContRef : Name;
	};

	type MemberValuePair : ASTNode {
		Name_ContRef : SimpleName;
		Value_ContRef : Expression;
	};

	type MethodRef : ASTNode {
		Name_ContRef : SimpleName;
		Qualifier_ContRef : Name;
		Parameters_ContRef : MethodRefParameter*;
	};

	type MethodRefParameter : ASTNode {
		Name_ContRef : SimpleName;
		Type_ContRef : Type;
		Varargs_Att : Logical;
	};

	type ExtendedModifier;

	type Modifier : ASTNode, ExtendedModifier {
		Abstract_Att : Logical;
		Final_Att : Logical;
		Native_Att : Logical;
		None_Att : Logical;
		Private_Att : Logical;
		Protected_Att : Logical;
		Public_Att : Logical;
		Static_Att : Logical;
		Strictfp_Att : Logical;
		Synchronized_Att : Logical;
		Transient_Att : Logical;
		Volatile_Att : Logical;
	};

	type PackageDeclaration : ASTNode {
		Annotations_ContRef : Annotation*;
		Javadoc_ContRef : Javadoc;
		Name_ContRef : Name;
	};

	type Statement : ASTNode;

	type TagElement : ASTNode {
		Fragments_ContRef : ASTNode*;
		TagName_Att : Text;
		Nested_Att : Logical;
	};

	type TextElement : ASTNode {
		Text_Att : Text;
	};

	type Type : ASTNode;

	type TypeParameter : ASTNode {
		Name_ContRef : SimpleName;
		TypeBounds_ContRef : Type*;
	};

	type VariableDeclaration : ASTNode {
		ExtraDimensions_Att : Integer32;
		Initializer_ContRef : Expression;
		Name_ContRef : SimpleName;
	};

	type AbstractTypeDeclaration : BodyDeclaration {
		BodyDeclarations_ContRef : BodyDeclaration*;
		Name_ContRef : SimpleName;
		LocalTypeDeclaration_Att : Logical;
		MemberTypeDeclaration_Att : Logical;
		PackageMemberTypeDeclaration_Att : Logical;
	};

	type AnnotationTypeMemberDeclaration : BodyDeclaration {
		Default_ContRef : Expression;
		Name_ContRef : SimpleName;
		Type_ContRef : Type;
	};

	type EnumConstantDeclaration : BodyDeclaration {
		Arguments_ContRef : Expression*;
		AnonymousClassDeclaration_ContRef : AnonymousClassDeclaration;
		Name_ContRef : SimpleName;
	};

	type FieldDeclaration : BodyDeclaration {
		Fragments_ContRef : VariableDeclarationFragment*;
		Type_ContRef : Type;
	};

	type Initializer : BodyDeclaration {
		Body_ContRef : Block;
	};

	type MethodDeclaration : BodyDeclaration {
		Body_ContRef : Block;
		ExtraDimensions_Att : Integer32;
		Name_ContRef : SimpleName;
		ReturnType_ContRef : Type;
		Constructor_Att : Logical;
		Varargs_Att : Logical;
		Parameters_ContRef : SingleVariableDeclaration*;
		ThrownExceptions_ContRef : Name*;
		TypeParameters_ContRef : TypeParameter*;
	};

	type AnnotationTypeDeclaration : AbstractTypeDeclaration;

	type EnumDeclaration : AbstractTypeDeclaration {
		SuperInterfaceTypes_ContRef : Type*;
		EnumConstants_ContRef : EnumConstantDeclaration*;
	};

	type TypeDeclaration : AbstractTypeDeclaration {
		SuperclassType_ContRef : Type;
		Interface_Att : Logical;
		SuperInterfaceTypes_ContRef : Type*;
		TypeParameters_ContRef : TypeParameter*;
	};

	type BlockComment : Comment;

	type Javadoc : Comment {
		Tags_ContRef : TagElement*;
	};

	type LineComment : Comment;

	type Annotation : Expression, ExtendedModifier {
		TypeName_ContRef : Name;
	};

	type ArrayAccess : Expression {
		Array_ContRef : Expression;
		Index_ContRef : Expression;
	};

	type ArrayCreation : Expression {
		Dimensions_ContRef : Expression*;
		Initializer_ContRef : ArrayInitializer;
		Type_ContRef : ArrayType;
	};

	type ArrayInitializer : Expression {
		Expressions_ContRef : Expression*;
	};

	type Assignment : Expression {
		LeftHandSide_ContRef : Expression;
		Operator_Att : AssignementOperatorKind;
		RightHandSide_ContRef : Expression;
	};

	type AssignementOperatorKind {"RIGHT_SHIFT_SIGNED_ASSIGN", "BIT_XOR_ASSIGN", "TIMES_ASSIGN", "LEFT_SHIFT_ASSIGN", "MINUS_ASSIGN", "BIT_OR_ASSIGN", "PLUS_ASSIGN", "ASSIGN", "RIGHT_SHIFT_UNSIGNED_ASSIGN", "REMAINDER_ASSIGN", "DIVIDE_ASSIGN", "BIT_AND_ASSIGN"};

	type BooleanLiteral : Expression {
		BooleanValue_Att : Logical;
	};

	type CastExpression : Expression {
		Expression_ContRef : Expression;
		Type_ContRef : Type;
	};

	type CharacterLiteral : Expression {
		CharValue_Att : Logical;
		EscapedValue_Att : Text;
	};

	type ClassInstanceCreation : Expression {
		Arguments_ContRef : Expression*;
		AnonymousClassDeclaration_ContRef : AnonymousClassDeclaration;
		Expression_ContRef : Expression;
		Type_ContRef : Type;
		TypeArguments_ContRef : Type*;
	};

	type ConditionalExpression : Expression {
		ElseExpression_ContRef : Expression;
		Expression_ContRef : Expression;
		ThenExpression_ContRef : Expression;
	};

	type FieldAccess : Expression {
		Expression_ContRef : Expression;
		Name_ContRef : SimpleName;
	};

	type InfixExpression : Expression {
		ExtendedOperands_ContRef : Expression*;
		LeftOperand_ContRef : Expression;
		Operator_Att : InfixExpressionOperatorKind;
		RightOperand_ContRef : Expression;
	};

	type InfixExpressionOperatorKind {"GREATER_EQUALS", "OR", "RIGHT_SHIFT_SIGNED", "MINUS", "XOR", "LESS_EQUALS", "EQUALS", "NOT_EQUALS", "AND", "PLUS", "GREATER", "CONDITIONAL_OR", "REMAINDER", "LESS", "LEFT_SHIFT", "RIGHT_SHIFT_UNSIGNED", "CONDITIONAL_AND", "TIMES", "DIVIDE"};

	type InstanceofExpression : Expression {
		LeftOperand_ContRef : Expression;
		RightOperand_ContRef : Type;
	};

	type MethodInvocation : Expression {
		Arguments_ContRef : Expression*;
		Expression_ContRef : Expression;
		Name_ContRef : SimpleName;
		TypeArguments_ContRef : Type*;
	};

	type Name : Expression {
		FullyQualifiedName_Att : Text;
	};

	type NullLiteral : Expression;

	type NumberLiteral : Expression {
		Token_Att : Text;
	};

	type ParenthesizedExpression : Expression {
		Expression_ContRef : Expression;
	};

	type PostfixExpression : Expression {
		Operand_ContRef : Expression;
		Operator_Att : PostfixExpresssionOperatorKind;
	};

	type PostfixExpresssionOperatorKind {"INCREMENT", "DECREMENT"};

	type PrefixExpression : Expression {
		Operand_ContRef : Expression;
		Operator_Att : PrefixExpresssionOperatorKind;
	};

	type PrefixExpresssionOperatorKind {"MINUS", "NOT", "DECREMENT", "COMPLEMENT", "INCREMENT", "PLUS"};

	type StringLiteral : Expression {
		EscapedValue_Att : Text;
		LiteralValue_Att : Text;
	};

	type SuperFieldAccess : Expression {
		Name_ContRef : SimpleName;
		Qualifier_ContRef : Name;
	};

	type SuperMethodInvocation : Expression {
		Arguments_ContRef : Expression*;
		Name_ContRef : Name;
		Qualifier_ContRef : Name;
		TypeArguments_ContRef : Type*;
	};

	type ThisExpression : Expression {
		Qualifier_ContRef : Name;
	};

	type TypeLiteral : Expression {
		Type_ContRef : Type;
	};

	type VariableDeclarationExpression : Expression {
		Fragments_ContRef : VariableDeclarationFragment*;
		Modifiers_ContRef : ExtendedModifier*;
		Type_ContRef : Type;
	};

	type AssertStatement : Statement {
		Expression_ContRef : Expression;
		Message_ContRef : Expression;
	};

	type Block : Statement {
		Statements_ContRef : Statement*;
	};

	type BreakStatement : Statement {
		Label_ContRef : SimpleName;
	};

	type ConstructorInvocation : Statement {
		Arguments_ContRef : Expression*;
		TypeArguments_ContRef : Type*;
	};

	type ContinueStatement : Statement {
		Label_ContRef : SimpleName;
	};

	type DoStatement : Statement {
		Body_ContRef : Statement;
		Expression_ContRef : Expression;
	};

	type EmptyStatement : Statement;

	type EnhancedForStatement : Statement {
		Body_ContRef : Statement;
		Expression_ContRef : Expression;
		Parameter_ContRef : SingleVariableDeclaration;
	};

	type ExpressionStatement : Statement {
		Expression_ContRef : Expression;
	};

	type ForStatement : Statement {
		Body_ContRef : Statement;
		Expression_ContRef : Expression;
		Initializers_ContRef : Expression*;
		Updaters_ContRef : Expression*;
	};

	type IfStatement : Statement {
		ElseStatement_ContRef : Statement;
		Expression_ContRef : Expression;
		ThenStatement_ContRef : Statement;
	};

	type LabeledStatement : Statement {
		Body_ContRef : Statement;
		Label_ContRef : SimpleName;
	};

	type ReturnStatement : Statement {
		Expression_ContRef : Expression;
	};

	type SuperConstructorInvocation : Statement {
		Arguments_ContRef : Expression*;
		Expression_ContRef : Expression;
		TypeArguments_ContRef : Type*;
	};

	type SwitchCase : Statement {
		Expression_ContRef : Expression;
		Default_Att : Logical;
	};

	type SwitchStatement : Statement {
		Expression_ContRef : Expression;
		Statements_ContRef : Statement*;
	};

	type SynchronizedStatement : Statement {
		Body_ContRef : Block;
		Expression_ContRef : Expression;
	};

	type ThrowStatement : Statement {
		Expression_ContRef : Expression;
	};

	type TryStatement : Statement {
		CatchClauses_ContRef : CatchClause*;
		Body_ContRef : Block;
		Finally_ContRef : Block;
	};

	type TypeDeclarationStatement : Statement {
		Declaration_ContRef : AbstractTypeDeclaration;
	};

	type VariableDeclarationStatement : Statement {
		Fragments_ContRef : VariableDeclarationFragment*;
		Modifiers_ContRef : ExtendedModifier*;
		Type_ContRef : Type;
	};

	type WhileStatement : Statement {
		Body_ContRef : Statement;
		Expression_ContRef : Expression;
	};

	type ArrayType : Type {
		ComponentType_ContRef : Type;
		Dimensions_Att : Integer32;
		ElementType_ContRef : Type;
	};

	type ParameterizedType : Type {
		Type_ContRef : Type;
		TypeArguments_ContRef : Type*;
	};

	type PrimitiveType : Type {
		Code_Att : Text;
	};

	type QualifiedType : Type {
		Name_ContRef : SimpleName;
		Qualifier_ContRef : Type;
	};

	type SimpleType : Type {
		Name_ContRef : Name;
	};

	type WildcardType : Type {
		Bound_ContRef : Type;
		UpperBound_Att : Logical;
	};

	type SingleVariableDeclaration : VariableDeclaration {
		Type_ContRef : Type;
		Varargs_Att : Logical;
		Modifiers_ContRef : ExtendedModifier*;
	};

	type VariableDeclarationFragment : VariableDeclaration;

	type QualifiedName : Name {
		Name_ContRef : SimpleName;
		Qualifier_ContRef : Name;
	};

	type SimpleName : Name {
		Identifier_Att : Text;
		Declaration_Att : Logical;
	};

	type MarkerAnnotation : Annotation;

	type NormalAnnotation : Annotation {
		Values_ContRef : MemberValuePair*;
	};

	type SingleMemberAnnotation : Annotation {
		Value_ContRef : Expression;
	};
}