( defstruct AbstractTypeDeclaration :originalFileContent :package :name :proxy :modifiers )
( defstruct Annotation :type )
( defstruct AnnotationMemberValuePair :member :value )
( defstruct AnnotationTypeDeclaration :originalFileContent :package :name :proxy :modifiers )
( defstruct AnnotationTypeMemberDeclaration :type :name :proxy :modifiers )
( defstruct AnonymousClassDeclaration )
( defstruct ArrayAccess :index :array )
( defstruct ArrayCreation :type )
( defstruct ArrayInitializer )
( defstruct ArrayLengthAccess :array )
( defstruct AssertStatement :expression )
( defstruct Assignment :operator :rightHandSide :leftHandSide )
( defstruct ASTNode )
( defstruct BodyDeclaration :modifiers )
( defstruct Block )
( defstruct BlockComment :content :isEnclosedByParent :isPrefixOfParent )
( defstruct BreakStatement )
( defstruct CastExpression :type :expression )
( defstruct CatchClause :exception :body )
( defstruct ClassInstanceCreation :type )
( defstruct Comment :content :isEnclosedByParent :isPrefixOfParent )
( defstruct ConditionalExpression :elseExpression :thenExpression :expression )
( defstruct ContinueStatement )
( defstruct ConstructorInvocation )
( defstruct DoStatement :expression :body )
( defstruct EmptyStatement )
( defstruct EnhancedForStatement :parameter :expression :body )
( defstruct EnumConstantDeclaration :modifiers :name :proxy )
( defstruct EnumDeclaration :originalFileContent :package :name :proxy :modifiers )
( defstruct Expression )
( defstruct ExpressionStatement :expression )
( defstruct FieldAccess :field :expression )
( defstruct FieldDeclaration :type :modifiers :extraArrayDimensions :name :proxy )
( defstruct ForStatement :body )
( defstruct InfixExpression :operator :rightOperand :leftOperand )
( defstruct IfStatement :expression :thenStatement )
( defstruct ImportDeclaration :static :importedElement )
( defstruct Initializer :body :modifiers )
( defstruct InstanceofExpression :leftOperand :rightOperand )
( defstruct Javadoc :content :isEnclosedByParent :isPrefixOfParent )
( defstruct LabeledStatement :body :name :proxy )
( defstruct LineComment :content :isEnclosedByParent :isPrefixOfParent )
( defstruct MemberRef :member )
( defstruct MethodDeclaration :extraArrayDimensions :constructor :varargs :returnType :name :proxy :modifiers )
( defstruct MethodInvocation :method )
( defstruct MethodRef :method )
( defstruct MethodRefParameter :name :isVarargs )
( defstruct Model :name )
( defstruct MultipleValuedNamedElement :extraArrayDimensions :name :proxy )
( defstruct NamedElement :name :proxy )
( defstruct NamedElementRef :extraArrayDimensions )
( defstruct OrphanType :name :proxy )
( defstruct PackageDeclaration :model :name :proxy )
( defstruct ParameterizedType :type :name :proxy )
( defstruct ParenthesizedExpression :expression )
( defstruct PostfixExpression :operator :operand )
( defstruct PrefixExpression :operator :operand )
( defstruct PrimitiveType :name :proxy )
( defstruct ReturnStatement )
( defstruct ThrowStatement :expression )
( defstruct SingleVariableDeclaration :modifiers :isVarargs :type :extraArrayDimensions :name :proxy )
( defstruct Statement )
( defstruct SuperConstructorInvocation )
( defstruct SuperFieldAccess :field )
( defstruct SuperMethodInvocation :method )
( defstruct SwitchCase :expressionInitialized )
( defstruct SwitchStatement :expression )
( defstruct SynchronizedStatement :body :expression )
( defstruct TagElement :tagName )
( defstruct TextElement :text )
( defstruct ThisExpression )
( defstruct TryStatement :body )
( defstruct TypeDeclaration :isInterface :originalFileContent :package :name :proxy :modifiers )
( defstruct TypeDeclarationStatement :declaration )
( defstruct TypeLiteral :type )
( defstruct TypeParameter :name :proxy )
( defstruct UnresolvedItem :name :proxy )
( defstruct ValuedNamedElement :extraArrayDimensions :name :proxy )
( defstruct VariableDeclarationExpression :modifiers :type :extraArrayDimensions :name :proxy :extraArrayDimensions :name :proxy )
( defstruct VariableDeclarationStatement :modifiers :type :extraArrayDimensions :name :proxy :extraArrayDimensions :name :proxy )
( defstruct WildCardType :isUpperBound :name :proxy )
( defstruct WhileStatement :expression :body )