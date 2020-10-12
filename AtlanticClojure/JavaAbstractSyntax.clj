( defstruct AST :root )
( defstruct ASTNode )
( defstruct AnonymousClassDeclaration )
( defstruct BodyDeclaration :javadoc )
( defstruct CatchClause :body :exception )
( defstruct Comment :alternateRoot )
( defstruct CompilationUnit :package )
( defstruct Expression :resolveBoxing :resolveUnboxing )
( defstruct ImportDeclaration :onDemand :static :name )
( defstruct MemberRef :name :qualifier )
( defstruct MemberValuePair :name :value )
( defstruct MethodRef :name :qualifier )
( defstruct MethodRefParameter :name :type :varargs )
( defstruct ExtendedModifier )
( defstruct Modifier :abstract :final :native :none :private :protected :public :static :strictfp :synchronized :transient :volatile )
( defstruct PackageDeclaration :javadoc :name )
( defstruct Statement )
( defstruct TagElement :tagName :nested )
( defstruct TextElement :text )
( defstruct Type )
( defstruct TypeParameter :name )
( defstruct VariableDeclaration :extraDimensions :initializer :name )
( defstruct AbstractTypeDeclaration :name :localTypeDeclaration :memberTypeDeclaration :packageMemberTypeDeclaration :javadoc )
( defstruct AnnotationTypeMemberDeclaration :default :name :type :javadoc )
( defstruct EnumConstantDeclaration :anonymousClassDeclaration :name :javadoc )
( defstruct FieldDeclaration :type :javadoc )
( defstruct Initializer :body :javadoc )
( defstruct MethodDeclaration :body :extraDimensions :name :returnType :constructor :varargs :javadoc )
( defstruct AnnotationTypeDeclaration :name :localTypeDeclaration :memberTypeDeclaration :packageMemberTypeDeclaration :javadoc )
( defstruct EnumDeclaration :name :localTypeDeclaration :memberTypeDeclaration :packageMemberTypeDeclaration :javadoc )
( defstruct TypeDeclaration :superclassType :interface :name :localTypeDeclaration :memberTypeDeclaration :packageMemberTypeDeclaration :javadoc )
( defstruct BlockComment :alternateRoot )
( defstruct Javadoc :alternateRoot )
( defstruct LineComment :alternateRoot )
( defstruct Annotation :typeName :resolveBoxing :resolveUnboxing )
( defstruct ArrayAccess :array :index :resolveBoxing :resolveUnboxing )
( defstruct ArrayCreation :initializer :type :resolveBoxing :resolveUnboxing )
( defstruct ArrayInitializer :resolveBoxing :resolveUnboxing )
( defstruct Assignment :leftHandSide :operator :rightHandSide :resolveBoxing :resolveUnboxing )
( defstruct BooleanLiteral :booleanValue :resolveBoxing :resolveUnboxing )
( defstruct CastExpression :expression :type :resolveBoxing :resolveUnboxing )
( defstruct CharacterLiteral :charValue :escapedValue :resolveBoxing :resolveUnboxing )
( defstruct ClassInstanceCreation :anonymousClassDeclaration :expression :type :resolveBoxing :resolveUnboxing )
( defstruct ConditionalExpression :elseExpression :expression :thenExpression :resolveBoxing :resolveUnboxing )
( defstruct FieldAccess :expression :name :resolveBoxing :resolveUnboxing )
( defstruct InfixExpression :leftOperand :operator :rightOperand :resolveBoxing :resolveUnboxing )
( defstruct InstanceofExpression :leftOperand :rightOperand :resolveBoxing :resolveUnboxing )
( defstruct MethodInvocation :expression :name :resolveBoxing :resolveUnboxing )
( defstruct Name :fullyQualifiedName :resolveBoxing :resolveUnboxing )
( defstruct NullLiteral :resolveBoxing :resolveUnboxing )
( defstruct NumberLiteral :token :resolveBoxing :resolveUnboxing )
( defstruct ParenthesizedExpression :expression :resolveBoxing :resolveUnboxing )
( defstruct PostfixExpression :operand :operator :resolveBoxing :resolveUnboxing )
( defstruct PrefixExpression :operand :operator :resolveBoxing :resolveUnboxing )
( defstruct StringLiteral :escapedValue :literalValue :resolveBoxing :resolveUnboxing )
( defstruct SuperFieldAccess :name :qualifier :resolveBoxing :resolveUnboxing )
( defstruct SuperMethodInvocation :name :qualifier :resolveBoxing :resolveUnboxing )
( defstruct ThisExpression :qualifier :resolveBoxing :resolveUnboxing )
( defstruct TypeLiteral :type :resolveBoxing :resolveUnboxing )
( defstruct VariableDeclarationExpression :type :resolveBoxing :resolveUnboxing )
( defstruct AssertStatement :expression :message )
( defstruct Block )
( defstruct BreakStatement :label )
( defstruct ConstructorInvocation )
( defstruct ContinueStatement :label )
( defstruct DoStatement :body :expression )
( defstruct EmptyStatement )
( defstruct EnhancedForStatement :body :expression :parameter )
( defstruct ExpressionStatement :expression )
( defstruct ForStatement :body :expression )
( defstruct IfStatement :elseStatement :expression :thenStatement )
( defstruct LabeledStatement :body :label )
( defstruct ReturnStatement :expression )
( defstruct SuperConstructorInvocation :expression )
( defstruct SwitchCase :expression :default )
( defstruct SwitchStatement :expression )
( defstruct SynchronizedStatement :body :expression )
( defstruct ThrowStatement :expression )
( defstruct TryStatement :body :finally )
( defstruct TypeDeclarationStatement :declaration )
( defstruct VariableDeclarationStatement :type )
( defstruct WhileStatement :body :expression )
( defstruct ArrayType :componentType :dimensions :elementType )
( defstruct ParameterizedType :type )
( defstruct PrimitiveType :code )
( defstruct QualifiedType :name :qualifier )
( defstruct SimpleType :name )
( defstruct WildcardType :bound :upperBound )
( defstruct SingleVariableDeclaration :type :varargs :extraDimensions :initializer :name )
( defstruct VariableDeclarationFragment :extraDimensions :initializer :name )
( defstruct QualifiedName :name :qualifier :fullyQualifiedName :resolveBoxing :resolveUnboxing )
( defstruct SimpleName :identifier :declaration :fullyQualifiedName :resolveBoxing :resolveUnboxing )
( defstruct MarkerAnnotation :typeName :resolveBoxing :resolveUnboxing )
( defstruct NormalAnnotation :typeName :resolveBoxing :resolveUnboxing )
( defstruct SingleMemberAnnotation :value :typeName :resolveBoxing :resolveUnboxing )