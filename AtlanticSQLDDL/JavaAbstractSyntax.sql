CREATE TABLE AST (
	__IDAST__ Integer NOT NULL,
	FOREIGN KEY root (__FKroot__) REFERENCES ASTNode (__IDASTNode__),
	PRIMARY KEY AST (__IDAST__),
	__FKroot__ Integer
) ;

CREATE TABLE ASTNode (
	__IDASTNode__ Integer NOT NULL,
	PRIMARY KEY ASTNode (__IDASTNode__)
) ;

CREATE TABLE AnonymousClassDeclaration (
	__IDAnonymousClassDeclaration__ Integer NOT NULL,
	PRIMARY KEY AnonymousClassDeclaration (__IDAnonymousClassDeclaration__)
) ;

CREATE TABLE BodyDeclaration (
	__IDBodyDeclaration__ Integer NOT NULL,
	FOREIGN KEY javadoc (__FKjavadoc__) REFERENCES Javadoc (__IDJavadoc__),
	PRIMARY KEY BodyDeclaration (__IDBodyDeclaration__),
	__FKjavadoc__ Integer
) ;

CREATE TABLE CatchClause (
	__IDCatchClause__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY exception (__FKexception__) REFERENCES SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	PRIMARY KEY CatchClause (__IDCatchClause__),
	__FKbody__ Integer,
	__FKexception__ Integer
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	FOREIGN KEY alternateRoot (__FKalternateRoot__) REFERENCES ASTNode (__IDASTNode__),
	PRIMARY KEY Comment (__IDComment__),
	__FKalternateRoot__ Integer
) ;

CREATE TABLE CompilationUnit (
	__IDCompilationUnit__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES PackageDeclaration (__IDPackageDeclaration__),
	PRIMARY KEY CompilationUnit (__IDCompilationUnit__),
	__FKpackage__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	resolveBoxing Boolean,
	resolveUnboxing Boolean,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE ImportDeclaration (
	__IDImportDeclaration__ Integer NOT NULL,
	onDemand Boolean,
	static Boolean,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY ImportDeclaration (__IDImportDeclaration__),
	__FKname__ Integer
) ;

CREATE TABLE MemberRef (
	__IDMemberRef__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY MemberRef (__IDMemberRef__),
	__FKqualifier__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE MemberValuePair (
	__IDMemberValuePair__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY MemberValuePair (__IDMemberValuePair__),
	__FKvalue__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE MethodRef (
	__IDMethodRef__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY MethodRef (__IDMethodRef__),
	__FKname__ Integer,
	__FKqualifier__ Integer
) ;

CREATE TABLE MethodRefParameter (
	__IDMethodRefParameter__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	varargs Boolean,
	PRIMARY KEY MethodRefParameter (__IDMethodRefParameter__),
	__FKtype__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE ExtendedModifier (
	__IDExtendedModifier__ Integer NOT NULL,
	PRIMARY KEY ExtendedModifier (__IDExtendedModifier__)
) ;

CREATE TABLE Modifier (
	__IDModifier__ Integer NOT NULL,
	abstract Boolean,
	final Boolean,
	native Boolean,
	none Boolean,
	private Boolean,
	protected Boolean,
	public Boolean,
	static Boolean,
	strictfp Boolean,
	synchronized Boolean,
	transient Boolean,
	volatile Boolean,
	PRIMARY KEY Modifier (__IDModifier__)
) ;

CREATE TABLE PackageDeclaration (
	__IDPackageDeclaration__ Integer NOT NULL,
	FOREIGN KEY javadoc (__FKjavadoc__) REFERENCES Javadoc (__IDJavadoc__),
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY PackageDeclaration (__IDPackageDeclaration__),
	__FKname__ Integer,
	__FKjavadoc__ Integer
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE TagElement (
	__IDTagElement__ Integer NOT NULL,
	tagName text,
	nested Boolean,
	PRIMARY KEY TagElement (__IDTagElement__)
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	text text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE TypeParameter (
	__IDTypeParameter__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY TypeParameter (__IDTypeParameter__),
	__FKname__ Integer
) ;

CREATE TABLE VariableDeclaration (
	__IDVariableDeclaration__ Integer NOT NULL,
	extraDimensions Integer,
	FOREIGN KEY initializer (__FKinitializer__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY VariableDeclaration (__IDVariableDeclaration__),
	__FKname__ Integer,
	__FKinitializer__ Integer
) ;

CREATE TABLE AbstractTypeDeclaration (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	localTypeDeclaration Boolean,
	memberTypeDeclaration Boolean,
	packageMemberTypeDeclaration Boolean,
	PRIMARY KEY AbstractTypeDeclaration (__IDAbstractTypeDeclaration__),
	__FKname__ Integer
) ;

CREATE TABLE AnnotationTypeMemberDeclaration (
	__IDAnnotationTypeMemberDeclaration__ Integer NOT NULL,
	FOREIGN KEY "default" (__FKdefault__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY AnnotationTypeMemberDeclaration (__IDAnnotationTypeMemberDeclaration__),
	__FKdefault__ Integer,
	__FKname__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE EnumConstantDeclaration (
	__IDEnumConstantDeclaration__ Integer NOT NULL,
	FOREIGN KEY anonymousClassDeclaration (__FKanonymousClassDeclaration__) REFERENCES AnonymousClassDeclaration (__IDAnonymousClassDeclaration__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY EnumConstantDeclaration (__IDEnumConstantDeclaration__),
	__FKname__ Integer,
	__FKanonymousClassDeclaration__ Integer
) ;

CREATE TABLE FieldDeclaration (
	__IDFieldDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY FieldDeclaration (__IDFieldDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE Initializer (
	__IDInitializer__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Initializer (__IDInitializer__),
	__FKbody__ Integer
) ;

CREATE TABLE MethodDeclaration (
	__IDMethodDeclaration__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	extraDimensions Integer,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES Type (__IDType__),
	constructor Boolean,
	varargs Boolean,
	PRIMARY KEY MethodDeclaration (__IDMethodDeclaration__),
	__FKreturnType__ Integer,
	__FKbody__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE AnnotationTypeDeclaration (
	__IDAnnotationTypeDeclaration__ Integer NOT NULL,
	PRIMARY KEY AnnotationTypeDeclaration (__IDAnnotationTypeDeclaration__)
) ;

CREATE TABLE EnumDeclaration (
	__IDEnumDeclaration__ Integer NOT NULL,
	PRIMARY KEY EnumDeclaration (__IDEnumDeclaration__)
) ;

CREATE TABLE TypeDeclaration (
	__IDTypeDeclaration__ Integer NOT NULL,
	FOREIGN KEY superclassType (__FKsuperclassType__) REFERENCES Type (__IDType__),
	interface Boolean,
	PRIMARY KEY TypeDeclaration (__IDTypeDeclaration__),
	__FKsuperclassType__ Integer
) ;

CREATE TABLE BlockComment (
	__IDBlockComment__ Integer NOT NULL,
	PRIMARY KEY BlockComment (__IDBlockComment__)
) ;

CREATE TABLE Javadoc (
	__IDJavadoc__ Integer NOT NULL,
	PRIMARY KEY Javadoc (__IDJavadoc__)
) ;

CREATE TABLE LineComment (
	__IDLineComment__ Integer NOT NULL,
	PRIMARY KEY LineComment (__IDLineComment__)
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	FOREIGN KEY typeName (__FKtypeName__) REFERENCES Name (__IDName__),
	PRIMARY KEY Annotation (__IDAnnotation__),
	__FKtypeName__ Integer
) ;

CREATE TABLE ArrayAccess (
	__IDArrayAccess__ Integer NOT NULL,
	FOREIGN KEY array (__FKarray__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "index" (__FKindex__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ArrayAccess (__IDArrayAccess__),
	__FKarray__ Integer,
	__FKindex__ Integer
) ;

CREATE TABLE ArrayCreation (
	__IDArrayCreation__ Integer NOT NULL,
	FOREIGN KEY initializer (__FKinitializer__) REFERENCES ArrayInitializer (__IDArrayInitializer__),
	FOREIGN KEY type (__FKtype__) REFERENCES ArrayType (__IDArrayType__),
	PRIMARY KEY ArrayCreation (__IDArrayCreation__),
	__FKinitializer__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE ArrayInitializer (
	__IDArrayInitializer__ Integer NOT NULL,
	PRIMARY KEY ArrayInitializer (__IDArrayInitializer__)
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	FOREIGN KEY leftHandSide (__FKleftHandSide__) REFERENCES Expression (__IDExpression__),
	operator text,
	FOREIGN KEY rightHandSide (__FKrightHandSide__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Assignment (__IDAssignment__),
	__FKleftHandSide__ Integer,
	__FKrightHandSide__ Integer
) ;

CREATE TABLE BooleanLiteral (
	__IDBooleanLiteral__ Integer NOT NULL,
	booleanValue Boolean,
	PRIMARY KEY BooleanLiteral (__IDBooleanLiteral__)
) ;

CREATE TABLE CastExpression (
	__IDCastExpression__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY CastExpression (__IDCastExpression__),
	__FKexpression__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE CharacterLiteral (
	__IDCharacterLiteral__ Integer NOT NULL,
	charValue text,
	escapedValue text,
	PRIMARY KEY CharacterLiteral (__IDCharacterLiteral__)
) ;

CREATE TABLE ClassInstanceCreation (
	__IDClassInstanceCreation__ Integer NOT NULL,
	FOREIGN KEY anonymousClassDeclaration (__FKanonymousClassDeclaration__) REFERENCES AnonymousClassDeclaration (__IDAnonymousClassDeclaration__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY ClassInstanceCreation (__IDClassInstanceCreation__),
	__FKanonymousClassDeclaration__ Integer,
	__FKtype__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE ConditionalExpression (
	__IDConditionalExpression__ Integer NOT NULL,
	FOREIGN KEY elseExpression (__FKelseExpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY thenExpression (__FKthenExpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConditionalExpression (__IDConditionalExpression__),
	__FKthenExpression__ Integer,
	__FKelseExpression__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE FieldAccess (
	__IDFieldAccess__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY FieldAccess (__IDFieldAccess__),
	__FKexpression__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE InfixExpression (
	__IDInfixExpression__ Integer NOT NULL,
	FOREIGN KEY leftOperand (__FKleftOperand__) REFERENCES Expression (__IDExpression__),
	operator text,
	FOREIGN KEY rightOperand (__FKrightOperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY InfixExpression (__IDInfixExpression__),
	__FKleftOperand__ Integer,
	__FKrightOperand__ Integer
) ;

CREATE TABLE InstanceofExpression (
	__IDInstanceofExpression__ Integer NOT NULL,
	FOREIGN KEY leftOperand (__FKleftOperand__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY rightOperand (__FKrightOperand__) REFERENCES Type (__IDType__),
	PRIMARY KEY InstanceofExpression (__IDInstanceofExpression__),
	__FKrightOperand__ Integer,
	__FKleftOperand__ Integer
) ;

CREATE TABLE MethodInvocation (
	__IDMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY MethodInvocation (__IDMethodInvocation__),
	__FKname__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	fullyQualifiedName text,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE NullLiteral (
	__IDNullLiteral__ Integer NOT NULL,
	PRIMARY KEY NullLiteral (__IDNullLiteral__)
) ;

CREATE TABLE NumberLiteral (
	__IDNumberLiteral__ Integer NOT NULL,
	token text,
	PRIMARY KEY NumberLiteral (__IDNumberLiteral__)
) ;

CREATE TABLE ParenthesizedExpression (
	__IDParenthesizedExpression__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ParenthesizedExpression (__IDParenthesizedExpression__),
	__FKexpression__ Integer
) ;

CREATE TABLE PostfixExpression (
	__IDPostfixExpression__ Integer NOT NULL,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	operator text,
	PRIMARY KEY PostfixExpression (__IDPostfixExpression__),
	__FKoperand__ Integer
) ;

CREATE TABLE PrefixExpression (
	__IDPrefixExpression__ Integer NOT NULL,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	operator text,
	PRIMARY KEY PrefixExpression (__IDPrefixExpression__),
	__FKoperand__ Integer
) ;

CREATE TABLE StringLiteral (
	__IDStringLiteral__ Integer NOT NULL,
	escapedValue text,
	literalValue text,
	PRIMARY KEY StringLiteral (__IDStringLiteral__)
) ;

CREATE TABLE SuperFieldAccess (
	__IDSuperFieldAccess__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY SuperFieldAccess (__IDSuperFieldAccess__),
	__FKqualifier__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE SuperMethodInvocation (
	__IDSuperMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY SuperMethodInvocation (__IDSuperMethodInvocation__),
	__FKqualifier__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE ThisExpression (
	__IDThisExpression__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY ThisExpression (__IDThisExpression__),
	__FKqualifier__ Integer
) ;

CREATE TABLE TypeLiteral (
	__IDTypeLiteral__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypeLiteral (__IDTypeLiteral__),
	__FKtype__ Integer
) ;

CREATE TABLE VariableDeclarationExpression (
	__IDVariableDeclarationExpression__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY VariableDeclarationExpression (__IDVariableDeclarationExpression__),
	__FKtype__ Integer
) ;

CREATE TABLE AssertStatement (
	__IDAssertStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY message (__FKmessage__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AssertStatement (__IDAssertStatement__),
	__FKmessage__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE BreakStatement (
	__IDBreakStatement__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY BreakStatement (__IDBreakStatement__),
	__FKlabel__ Integer
) ;

CREATE TABLE ConstructorInvocation (
	__IDConstructorInvocation__ Integer NOT NULL,
	PRIMARY KEY ConstructorInvocation (__IDConstructorInvocation__)
) ;

CREATE TABLE ContinueStatement (
	__IDContinueStatement__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY ContinueStatement (__IDContinueStatement__),
	__FKlabel__ Integer
) ;

CREATE TABLE DoStatement (
	__IDDoStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY DoStatement (__IDDoStatement__),
	__FKbody__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE EmptyStatement (
	__IDEmptyStatement__ Integer NOT NULL,
	PRIMARY KEY EmptyStatement (__IDEmptyStatement__)
) ;

CREATE TABLE EnhancedForStatement (
	__IDEnhancedForStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY parameter (__FKparameter__) REFERENCES SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	PRIMARY KEY EnhancedForStatement (__IDEnhancedForStatement__),
	__FKbody__ Integer,
	__FKexpression__ Integer,
	__FKparameter__ Integer
) ;

CREATE TABLE ExpressionStatement (
	__IDExpressionStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ExpressionStatement (__IDExpressionStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE ForStatement (
	__IDForStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ForStatement (__IDForStatement__),
	__FKexpression__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE IfStatement (
	__IDIfStatement__ Integer NOT NULL,
	FOREIGN KEY elseStatement (__FKelseStatement__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY thenStatement (__FKthenStatement__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY IfStatement (__IDIfStatement__),
	__FKelseStatement__ Integer,
	__FKexpression__ Integer,
	__FKthenStatement__ Integer
) ;

CREATE TABLE LabeledStatement (
	__IDLabeledStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY "label" (__FKlabel__) REFERENCES SimpleName (__IDSimpleName__),
	PRIMARY KEY LabeledStatement (__IDLabeledStatement__),
	__FKbody__ Integer,
	__FKlabel__ Integer
) ;

CREATE TABLE ReturnStatement (
	__IDReturnStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ReturnStatement (__IDReturnStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE SuperConstructorInvocation (
	__IDSuperConstructorInvocation__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SuperConstructorInvocation (__IDSuperConstructorInvocation__),
	__FKexpression__ Integer
) ;

CREATE TABLE SwitchCase (
	__IDSwitchCase__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	"default" Boolean,
	PRIMARY KEY SwitchCase (__IDSwitchCase__),
	__FKexpression__ Integer
) ;

CREATE TABLE SwitchStatement (
	__IDSwitchStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SwitchStatement (__IDSwitchStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE SynchronizedStatement (
	__IDSynchronizedStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SynchronizedStatement (__IDSynchronizedStatement__),
	__FKbody__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE ThrowStatement (
	__IDThrowStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ThrowStatement (__IDThrowStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE TryStatement (
	__IDTryStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY finally (__FKfinally__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY TryStatement (__IDTryStatement__),
	__FKfinally__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE TypeDeclarationStatement (
	__IDTypeDeclarationStatement__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES AbstractTypeDeclaration (__IDAbstractTypeDeclaration__),
	PRIMARY KEY TypeDeclarationStatement (__IDTypeDeclarationStatement__),
	__FKdeclaration__ Integer
) ;

CREATE TABLE VariableDeclarationStatement (
	__IDVariableDeclarationStatement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY VariableDeclarationStatement (__IDVariableDeclarationStatement__),
	__FKtype__ Integer
) ;

CREATE TABLE WhileStatement (
	__IDWhileStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY WhileStatement (__IDWhileStatement__),
	__FKexpression__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE ArrayType (
	__IDArrayType__ Integer NOT NULL,
	FOREIGN KEY componentType (__FKcomponentType__) REFERENCES Type (__IDType__),
	dimensions Integer,
	FOREIGN KEY elementType (__FKelementType__) REFERENCES Type (__IDType__),
	PRIMARY KEY ArrayType (__IDArrayType__),
	__FKcomponentType__ Integer,
	__FKelementType__ Integer
) ;

CREATE TABLE ParameterizedType (
	__IDParameterizedType__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY ParameterizedType (__IDParameterizedType__),
	__FKtype__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	code text,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE QualifiedType (
	__IDQualifiedType__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Type (__IDType__),
	PRIMARY KEY QualifiedType (__IDQualifiedType__),
	__FKname__ Integer,
	__FKqualifier__ Integer
) ;

CREATE TABLE SimpleType (
	__IDSimpleType__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY SimpleType (__IDSimpleType__),
	__FKname__ Integer
) ;

CREATE TABLE WildcardType (
	__IDWildcardType__ Integer NOT NULL,
	FOREIGN KEY bound (__FKbound__) REFERENCES Type (__IDType__),
	upperBound Boolean,
	PRIMARY KEY WildcardType (__IDWildcardType__),
	__FKbound__ Integer
) ;

CREATE TABLE SingleVariableDeclaration (
	__IDSingleVariableDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	varargs Boolean,
	PRIMARY KEY SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE VariableDeclarationFragment (
	__IDVariableDeclarationFragment__ Integer NOT NULL,
	PRIMARY KEY VariableDeclarationFragment (__IDVariableDeclarationFragment__)
) ;

CREATE TABLE QualifiedName (
	__IDQualifiedName__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES SimpleName (__IDSimpleName__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES Name (__IDName__),
	PRIMARY KEY QualifiedName (__IDQualifiedName__),
	__FKname__ Integer,
	__FKqualifier__ Integer
) ;

CREATE TABLE SimpleName (
	__IDSimpleName__ Integer NOT NULL,
	identifier text,
	declaration Boolean,
	PRIMARY KEY SimpleName (__IDSimpleName__)
) ;

CREATE TABLE MarkerAnnotation (
	__IDMarkerAnnotation__ Integer NOT NULL,
	PRIMARY KEY MarkerAnnotation (__IDMarkerAnnotation__)
) ;

CREATE TABLE NormalAnnotation (
	__IDNormalAnnotation__ Integer NOT NULL,
	PRIMARY KEY NormalAnnotation (__IDNormalAnnotation__)
) ;

CREATE TABLE SingleMemberAnnotation (
	__IDSingleMemberAnnotation__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SingleMemberAnnotation (__IDSingleMemberAnnotation__),
	__FKvalue__ Integer
) ;

CREATE TABLE SuperConstructorInvocation_typeArguments_Type (
	__IDSuperConstructorInvocation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE PackageDeclaration_annotations_Annotation (
	__IDPackageDeclaration__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Javadoc_tags_TagElement (
	__IDJavadoc__ Integer NOT NULL,
	__IDTagElement__ Integer NOT NULL
) ;

CREATE TABLE AnonymousClassDeclaration_bodyDeclarations_BodyDeclaration (
	__IDAnonymousClassDeclaration__ Integer NOT NULL,
	__IDBodyDeclaration__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclarationStatement_fragments_VariableDeclarationFragment (
	__IDVariableDeclarationStatement__ Integer NOT NULL,
	__IDVariableDeclarationFragment__ Integer NOT NULL
) ;

CREATE TABLE CompilationUnit_types_AbstractTypeDeclaration (
	__IDCompilationUnit__ Integer NOT NULL,
	__IDAbstractTypeDeclaration__ Integer NOT NULL
) ;

CREATE TABLE CompilationUnit_comments_Comment (
	__IDCompilationUnit__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE TagElement_fragments_ASTNode (
	__IDTagElement__ Integer NOT NULL,
	__IDASTNode__ Integer NOT NULL
) ;

CREATE TABLE EnumConstantDeclaration_arguments_Expression (
	__IDEnumConstantDeclaration__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ConstructorInvocation_typeArguments_Type (
	__IDConstructorInvocation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE SuperMethodInvocation_typeArguments_Type (
	__IDSuperMethodInvocation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE EnumDeclaration_superInterfaceTypes_Type (
	__IDEnumDeclaration__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclarationStatement_modifiers_ExtendedModifier (
	__IDVariableDeclarationStatement__ Integer NOT NULL,
	__IDExtendedModifier__ Integer NOT NULL
) ;

CREATE TABLE FieldDeclaration_fragments_VariableDeclarationFragment (
	__IDFieldDeclaration__ Integer NOT NULL,
	__IDVariableDeclarationFragment__ Integer NOT NULL
) ;

CREATE TABLE ConstructorInvocation_arguments_Expression (
	__IDConstructorInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SuperMethodInvocation_arguments_Expression (
	__IDSuperMethodInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ClassInstanceCreation_arguments_Expression (
	__IDClassInstanceCreation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ClassInstanceCreation_typeArguments_Type (
	__IDClassInstanceCreation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE NormalAnnotation_values_MemberValuePair (
	__IDNormalAnnotation__ Integer NOT NULL,
	__IDMemberValuePair__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_parameters_SingleVariableDeclaration (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDSingleVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE EnumDeclaration_enumConstants_EnumConstantDeclaration (
	__IDEnumDeclaration__ Integer NOT NULL,
	__IDEnumConstantDeclaration__ Integer NOT NULL
) ;

CREATE TABLE MethodRef_parameters_MethodRefParameter (
	__IDMethodRef__ Integer NOT NULL,
	__IDMethodRefParameter__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclarationExpression_modifiers_ExtendedModifier (
	__IDVariableDeclarationExpression__ Integer NOT NULL,
	__IDExtendedModifier__ Integer NOT NULL
) ;

CREATE TABLE MethodInvocation_arguments_Expression (
	__IDMethodInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE CompilationUnit_imports_ImportDeclaration (
	__IDCompilationUnit__ Integer NOT NULL,
	__IDImportDeclaration__ Integer NOT NULL
) ;

CREATE TABLE TypeDeclaration_typeParameters_TypeParameter (
	__IDTypeDeclaration__ Integer NOT NULL,
	__IDTypeParameter__ Integer NOT NULL
) ;

CREATE TABLE SuperConstructorInvocation_arguments_Expression (
	__IDSuperConstructorInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_typeParameters_TypeParameter (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDTypeParameter__ Integer NOT NULL
) ;

CREATE TABLE ArrayCreation_dimensions_Expression (
	__IDArrayCreation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SwitchStatement_statements_Statement (
	__IDSwitchStatement__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE TypeParameter_typeBounds_Type (
	__IDTypeParameter__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclarationExpression_fragments_VariableDeclarationFragment (
	__IDVariableDeclarationExpression__ Integer NOT NULL,
	__IDVariableDeclarationFragment__ Integer NOT NULL
) ;

CREATE TABLE ArrayInitializer_expressions_Expression (
	__IDArrayInitializer__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE InfixExpression_extendedOperands_Expression (
	__IDInfixExpression__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_thrownExceptions_Name (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDName__ Integer NOT NULL
) ;

CREATE TABLE MethodInvocation_typeArguments_Type (
	__IDMethodInvocation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE TryStatement_catchClauses_CatchClause (
	__IDTryStatement__ Integer NOT NULL,
	__IDCatchClause__ Integer NOT NULL
) ;

CREATE TABLE ForStatement_updaters_Expression (
	__IDForStatement__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ForStatement_initializers_Expression (
	__IDForStatement__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SingleVariableDeclaration_modifiers_ExtendedModifier (
	__IDSingleVariableDeclaration__ Integer NOT NULL,
	__IDExtendedModifier__ Integer NOT NULL
) ;

CREATE TABLE Block_statements_Statement (
	__IDBlock__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE BodyDeclaration_modifiers_ExtendedModifier (
	__IDBodyDeclaration__ Integer NOT NULL,
	__IDExtendedModifier__ Integer NOT NULL
) ;

CREATE TABLE AbstractTypeDeclaration_bodyDeclarations_BodyDeclaration (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDBodyDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ParameterizedType_typeArguments_Type (
	__IDParameterizedType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE TypeDeclaration_superInterfaceTypes_Type (
	__IDTypeDeclaration__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;
