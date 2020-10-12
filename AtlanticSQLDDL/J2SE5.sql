CREATE TABLE AbstractTypeDeclaration (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	originalFileContent text,
	FOREIGN KEY package (__FKpackage__) REFERENCES PackageDeclaration (__IDPackageDeclaration__),
	PRIMARY KEY AbstractTypeDeclaration (__IDAbstractTypeDeclaration__),
	__FKpackage__ Integer
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY Annotation (__IDAnnotation__),
	__FKtype__ Integer
) ;

CREATE TABLE AnnotationMemberValuePair (
	__IDAnnotationMemberValuePair__ Integer NOT NULL,
	FOREIGN KEY member (__FKmember__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AnnotationMemberValuePair (__IDAnnotationMemberValuePair__),
	__FKmember__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE AnnotationTypeDeclaration (
	__IDAnnotationTypeDeclaration__ Integer NOT NULL,
	PRIMARY KEY AnnotationTypeDeclaration (__IDAnnotationTypeDeclaration__)
) ;

CREATE TABLE AnnotationTypeMemberDeclaration (
	__IDAnnotationTypeMemberDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY "default" (__FKdefault__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AnnotationTypeMemberDeclaration (__IDAnnotationTypeMemberDeclaration__),
	__FKtype__ Integer,
	__FKdefault__ Integer
) ;

CREATE TABLE AnonymousClassDeclaration (
	__IDAnonymousClassDeclaration__ Integer NOT NULL,
	PRIMARY KEY AnonymousClassDeclaration (__IDAnonymousClassDeclaration__)
) ;

CREATE TABLE ArrayAccess (
	__IDArrayAccess__ Integer NOT NULL,
	FOREIGN KEY "index" (__FKindex__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY array (__FKarray__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ArrayAccess (__IDArrayAccess__),
	__FKindex__ Integer,
	__FKarray__ Integer
) ;

CREATE TABLE ArrayCreation (
	__IDArrayCreation__ Integer NOT NULL,
	FOREIGN KEY initializer (__FKinitializer__) REFERENCES ArrayInitializer (__IDArrayInitializer__),
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY ArrayCreation (__IDArrayCreation__),
	__FKinitializer__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE ArrayInitializer (
	__IDArrayInitializer__ Integer NOT NULL,
	PRIMARY KEY ArrayInitializer (__IDArrayInitializer__)
) ;

CREATE TABLE ArrayLengthAccess (
	__IDArrayLengthAccess__ Integer NOT NULL,
	FOREIGN KEY array (__FKarray__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ArrayLengthAccess (__IDArrayLengthAccess__),
	__FKarray__ Integer
) ;

CREATE TABLE AssertStatement (
	__IDAssertStatement__ Integer NOT NULL,
	FOREIGN KEY message (__FKmessage__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY AssertStatement (__IDAssertStatement__),
	__FKmessage__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	operator text,
	FOREIGN KEY rightHandSide (__FKrightHandSide__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY leftHandSide (__FKleftHandSide__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Assignment (__IDAssignment__),
	__FKrightHandSide__ Integer,
	__FKleftHandSide__ Integer
) ;

CREATE TABLE ASTNode (
	__IDASTNode__ Integer NOT NULL,
	PRIMARY KEY ASTNode (__IDASTNode__)
) ;

CREATE TABLE BodyDeclaration (
	__IDBodyDeclaration__ Integer NOT NULL,
	modifiers text,
	PRIMARY KEY BodyDeclaration (__IDBodyDeclaration__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE BlockComment (
	__IDBlockComment__ Integer NOT NULL,
	PRIMARY KEY BlockComment (__IDBlockComment__)
) ;

CREATE TABLE BreakStatement (
	__IDBreakStatement__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY BreakStatement (__IDBreakStatement__),
	__FKlabel__ Integer
) ;

CREATE TABLE CastExpression (
	__IDCastExpression__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY CastExpression (__IDCastExpression__),
	__FKtype__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE CatchClause (
	__IDCatchClause__ Integer NOT NULL,
	FOREIGN KEY exception (__FKexception__) REFERENCES SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY CatchClause (__IDCatchClause__),
	__FKexception__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE ClassInstanceCreation (
	__IDClassInstanceCreation__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY anonymousClassDeclaration (__FKanonymousClassDeclaration__) REFERENCES AnonymousClassDeclaration (__IDAnonymousClassDeclaration__),
	PRIMARY KEY ClassInstanceCreation (__IDClassInstanceCreation__),
	__FKtype__ Integer,
	__FKexpression__ Integer,
	__FKanonymousClassDeclaration__ Integer
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	content text,
	isEnclosedByParent Boolean,
	isPrefixOfParent Boolean,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE ConditionalExpression (
	__IDConditionalExpression__ Integer NOT NULL,
	FOREIGN KEY elseExpression (__FKelseExpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY thenExpression (__FKthenExpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConditionalExpression (__IDConditionalExpression__),
	__FKelseExpression__ Integer,
	__FKthenExpression__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE ContinueStatement (
	__IDContinueStatement__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY ContinueStatement (__IDContinueStatement__),
	__FKlabel__ Integer
) ;

CREATE TABLE ConstructorInvocation (
	__IDConstructorInvocation__ Integer NOT NULL,
	PRIMARY KEY ConstructorInvocation (__IDConstructorInvocation__)
) ;

CREATE TABLE DoStatement (
	__IDDoStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY DoStatement (__IDDoStatement__),
	__FKexpression__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE EmptyStatement (
	__IDEmptyStatement__ Integer NOT NULL,
	PRIMARY KEY EmptyStatement (__IDEmptyStatement__)
) ;

CREATE TABLE EnhancedForStatement (
	__IDEnhancedForStatement__ Integer NOT NULL,
	FOREIGN KEY parameter (__FKparameter__) REFERENCES SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY EnhancedForStatement (__IDEnhancedForStatement__),
	__FKparameter__ Integer,
	__FKexpression__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE EnumConstantDeclaration (
	__IDEnumConstantDeclaration__ Integer NOT NULL,
	FOREIGN KEY anonymousClassDeclaration (__FKanonymousClassDeclaration__) REFERENCES AnonymousClassDeclaration (__IDAnonymousClassDeclaration__),
	PRIMARY KEY EnumConstantDeclaration (__IDEnumConstantDeclaration__),
	__FKanonymousClassDeclaration__ Integer
) ;

CREATE TABLE EnumDeclaration (
	__IDEnumDeclaration__ Integer NOT NULL,
	PRIMARY KEY EnumDeclaration (__IDEnumDeclaration__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE ExpressionStatement (
	__IDExpressionStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ExpressionStatement (__IDExpressionStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE FieldAccess (
	__IDFieldAccess__ Integer NOT NULL,
	FOREIGN KEY field (__FKfield__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY FieldAccess (__IDFieldAccess__),
	__FKfield__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE FieldDeclaration (
	__IDFieldDeclaration__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY FieldDeclaration (__IDFieldDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE ForStatement (
	__IDForStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ForStatement (__IDForStatement__),
	__FKbody__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE InfixExpression (
	__IDInfixExpression__ Integer NOT NULL,
	operator text,
	FOREIGN KEY rightOperand (__FKrightOperand__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY leftOperand (__FKleftOperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY InfixExpression (__IDInfixExpression__),
	__FKrightOperand__ Integer,
	__FKleftOperand__ Integer
) ;

CREATE TABLE IfStatement (
	__IDIfStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY elseStatement (__FKelseStatement__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY thenStatement (__FKthenStatement__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY IfStatement (__IDIfStatement__),
	__FKexpression__ Integer,
	__FKelseStatement__ Integer,
	__FKthenStatement__ Integer
) ;

CREATE TABLE ImportDeclaration (
	__IDImportDeclaration__ Integer NOT NULL,
	static Boolean,
	FOREIGN KEY importedElement (__FKimportedElement__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY ImportDeclaration (__IDImportDeclaration__),
	__FKimportedElement__ Integer
) ;

CREATE TABLE Initializer (
	__IDInitializer__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Initializer (__IDInitializer__),
	__FKbody__ Integer
) ;

CREATE TABLE InstanceofExpression (
	__IDInstanceofExpression__ Integer NOT NULL,
	FOREIGN KEY leftOperand (__FKleftOperand__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY rightOperand (__FKrightOperand__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY InstanceofExpression (__IDInstanceofExpression__),
	__FKleftOperand__ Integer,
	__FKrightOperand__ Integer
) ;

CREATE TABLE Javadoc (
	__IDJavadoc__ Integer NOT NULL,
	PRIMARY KEY Javadoc (__IDJavadoc__)
) ;

CREATE TABLE LabeledStatement (
	__IDLabeledStatement__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY LabeledStatement (__IDLabeledStatement__),
	__FKbody__ Integer
) ;

CREATE TABLE LineComment (
	__IDLineComment__ Integer NOT NULL,
	PRIMARY KEY LineComment (__IDLineComment__)
) ;

CREATE TABLE MemberRef (
	__IDMemberRef__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY member (__FKmember__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY MemberRef (__IDMemberRef__),
	__FKqualifier__ Integer,
	__FKmember__ Integer
) ;

CREATE TABLE MethodDeclaration (
	__IDMethodDeclaration__ Integer NOT NULL,
	extraArrayDimensions Integer,
	constructor Boolean,
	varargs Boolean,
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY MethodDeclaration (__IDMethodDeclaration__),
	__FKbody__ Integer,
	__FKreturnType__ Integer
) ;

CREATE TABLE MethodInvocation (
	__IDMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY method (__FKmethod__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY MethodInvocation (__IDMethodInvocation__),
	__FKmethod__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE MethodRef (
	__IDMethodRef__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY method (__FKmethod__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY MethodRef (__IDMethodRef__),
	__FKqualifier__ Integer,
	__FKmethod__ Integer
) ;

CREATE TABLE MethodRefParameter (
	__IDMethodRefParameter__ Integer NOT NULL,
	name text,
	isVarargs Boolean,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY MethodRefParameter (__IDMethodRefParameter__),
	__FKtype__ Integer
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	name text,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE MultipleValuedNamedElement (
	__IDMultipleValuedNamedElement__ Integer NOT NULL,
	PRIMARY KEY MultipleValuedNamedElement (__IDMultipleValuedNamedElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	proxy Boolean,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE NamedElementRef (
	__IDNamedElementRef__ Integer NOT NULL,
	extraArrayDimensions Integer,
	FOREIGN KEY element (__FKelement__) REFERENCES NamedElement (__IDNamedElement__),
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY NamedElementRef (__IDNamedElementRef__),
	__FKelement__ Integer,
	__FKqualifier__ Integer
) ;

CREATE TABLE OrphanType (
	__IDOrphanType__ Integer NOT NULL,
	PRIMARY KEY OrphanType (__IDOrphanType__)
) ;

CREATE TABLE PackageDeclaration (
	__IDPackageDeclaration__ Integer NOT NULL,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY PackageDeclaration (__IDPackageDeclaration__),
	__FKmodel__ Integer
) ;

CREATE TABLE ParameterizedType (
	__IDParameterizedType__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY ParameterizedType (__IDParameterizedType__),
	__FKtype__ Integer
) ;

CREATE TABLE ParenthesizedExpression (
	__IDParenthesizedExpression__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ParenthesizedExpression (__IDParenthesizedExpression__),
	__FKexpression__ Integer
) ;

CREATE TABLE PostfixExpression (
	__IDPostfixExpression__ Integer NOT NULL,
	operator text,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY PostfixExpression (__IDPostfixExpression__),
	__FKoperand__ Integer
) ;

CREATE TABLE PrefixExpression (
	__IDPrefixExpression__ Integer NOT NULL,
	operator text,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY PrefixExpression (__IDPrefixExpression__),
	__FKoperand__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE ReturnStatement (
	__IDReturnStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ReturnStatement (__IDReturnStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE ThrowStatement (
	__IDThrowStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ThrowStatement (__IDThrowStatement__),
	__FKexpression__ Integer
) ;

CREATE TABLE SingleVariableDeclaration (
	__IDSingleVariableDeclaration__ Integer NOT NULL,
	modifiers text,
	isVarargs Boolean,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY SingleVariableDeclaration (__IDSingleVariableDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE SuperConstructorInvocation (
	__IDSuperConstructorInvocation__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SuperConstructorInvocation (__IDSuperConstructorInvocation__),
	__FKexpression__ Integer
) ;

CREATE TABLE SuperFieldAccess (
	__IDSuperFieldAccess__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY field (__FKfield__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY SuperFieldAccess (__IDSuperFieldAccess__),
	__FKqualifier__ Integer,
	__FKfield__ Integer
) ;

CREATE TABLE SuperMethodInvocation (
	__IDSuperMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	FOREIGN KEY method (__FKmethod__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY SuperMethodInvocation (__IDSuperMethodInvocation__),
	__FKqualifier__ Integer,
	__FKmethod__ Integer
) ;

CREATE TABLE SwitchCase (
	__IDSwitchCase__ Integer NOT NULL,
	expressionInitialized Boolean,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
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

CREATE TABLE TagElement (
	__IDTagElement__ Integer NOT NULL,
	tagName text,
	PRIMARY KEY TagElement (__IDTagElement__)
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	text text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE ThisExpression (
	__IDThisExpression__ Integer NOT NULL,
	FOREIGN KEY qualifier (__FKqualifier__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY ThisExpression (__IDThisExpression__),
	__FKqualifier__ Integer
) ;

CREATE TABLE TryStatement (
	__IDTryStatement__ Integer NOT NULL,
	FOREIGN KEY finally (__FKfinally__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY body (__FKbody__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY TryStatement (__IDTryStatement__),
	__FKfinally__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE TypeDeclaration (
	__IDTypeDeclaration__ Integer NOT NULL,
	isInterface Boolean,
	FOREIGN KEY superclass (__FKsuperclass__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY TypeDeclaration (__IDTypeDeclaration__),
	__FKsuperclass__ Integer
) ;

CREATE TABLE TypeDeclarationStatement (
	__IDTypeDeclarationStatement__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES AbstractTypeDeclaration (__IDAbstractTypeDeclaration__),
	PRIMARY KEY TypeDeclarationStatement (__IDTypeDeclarationStatement__),
	__FKdeclaration__ Integer
) ;

CREATE TABLE TypeLiteral (
	__IDTypeLiteral__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY TypeLiteral (__IDTypeLiteral__),
	__FKtype__ Integer
) ;

CREATE TABLE TypeParameter (
	__IDTypeParameter__ Integer NOT NULL,
	PRIMARY KEY TypeParameter (__IDTypeParameter__)
) ;

CREATE TABLE UnresolvedItem (
	__IDUnresolvedItem__ Integer NOT NULL,
	PRIMARY KEY UnresolvedItem (__IDUnresolvedItem__)
) ;

CREATE TABLE ValuedNamedElement (
	__IDValuedNamedElement__ Integer NOT NULL,
	extraArrayDimensions Integer,
	FOREIGN KEY initializer (__FKinitializer__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ValuedNamedElement (__IDValuedNamedElement__),
	__FKinitializer__ Integer
) ;

CREATE TABLE VariableDeclarationExpression (
	__IDVariableDeclarationExpression__ Integer NOT NULL,
	modifiers text,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY VariableDeclarationExpression (__IDVariableDeclarationExpression__),
	__FKtype__ Integer
) ;

CREATE TABLE VariableDeclarationStatement (
	__IDVariableDeclarationStatement__ Integer NOT NULL,
	modifiers text,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY VariableDeclarationStatement (__IDVariableDeclarationStatement__),
	__FKtype__ Integer
) ;

CREATE TABLE WildCardType (
	__IDWildCardType__ Integer NOT NULL,
	isUpperBound Boolean,
	FOREIGN KEY bound (__FKbound__) REFERENCES NamedElementRef (__IDNamedElementRef__),
	PRIMARY KEY WildCardType (__IDWildCardType__),
	__FKbound__ Integer
) ;

CREATE TABLE WhileStatement (
	__IDWhileStatement__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY body (__FKbody__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY WhileStatement (__IDWhileStatement__),
	__FKexpression__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE AbstractTypeDeclaration_bodyDeclarations_BodyDeclaration (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDBodyDeclaration__ Integer NOT NULL
) ;

CREATE TABLE AbstractTypeDeclaration_superInterfaces_NamedElementRef (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDNamedElementRef__ Integer NOT NULL
) ;

CREATE TABLE AbstractTypeDeclaration_commentsAfterBody_Comment (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE AbstractTypeDeclaration_imports_ImportDeclaration (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDImportDeclaration__ Integer NOT NULL
) ;

CREATE TABLE AbstractTypeDeclaration_commentsBeforeBody_Comment (
	__IDAbstractTypeDeclaration__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE Annotation_values_AnnotationMemberValuePair (
	__IDAnnotation__ Integer NOT NULL,
	__IDAnnotationMemberValuePair__ Integer NOT NULL
) ;

CREATE TABLE AnonymousClassDeclaration_bodyDeclarations_BodyDeclaration (
	__IDAnonymousClassDeclaration__ Integer NOT NULL,
	__IDBodyDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ArrayCreation_dimensions_Expression (
	__IDArrayCreation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ArrayInitializer_expressions_Expression (
	__IDArrayInitializer__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ASTNode_comments_Comment (
	__IDASTNode__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE BodyDeclaration_annotations_Annotation (
	__IDBodyDeclaration__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Block_statements_Statement (
	__IDBlock__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE ClassInstanceCreation_arguments_Expression (
	__IDClassInstanceCreation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ConstructorInvocation_arguments_Expression (
	__IDConstructorInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE EnumConstantDeclaration_arguments_Expression (
	__IDEnumConstantDeclaration__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE EnumDeclaration_enumConstants_EnumConstantDeclaration (
	__IDEnumDeclaration__ Integer NOT NULL,
	__IDEnumConstantDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ForStatement_initializers_Expression (
	__IDForStatement__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ForStatement_updaters_Expression (
	__IDForStatement__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE InfixExpression_extendedOperands_Expression (
	__IDInfixExpression__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE Javadoc_tags_TagElement (
	__IDJavadoc__ Integer NOT NULL,
	__IDTagElement__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_parameters_SingleVariableDeclaration (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDSingleVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_typeParameters_TypeParameter (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDTypeParameter__ Integer NOT NULL
) ;

CREATE TABLE MethodDeclaration_thrownExceptions_NamedElementRef (
	__IDMethodDeclaration__ Integer NOT NULL,
	__IDNamedElementRef__ Integer NOT NULL
) ;

CREATE TABLE MethodInvocation_arguments_Expression (
	__IDMethodInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE MethodRef_parameters_MethodRefParameter (
	__IDMethodRef__ Integer NOT NULL,
	__IDMethodRefParameter__ Integer NOT NULL
) ;

CREATE TABLE Model_ownedElements_PackageDeclaration (
	__IDModel__ Integer NOT NULL,
	__IDPackageDeclaration__ Integer NOT NULL
) ;

CREATE TABLE Model_orphanTypes_OrphanType (
	__IDModel__ Integer NOT NULL,
	__IDOrphanType__ Integer NOT NULL
) ;

CREATE TABLE MultipleValuedNamedElement_fragments_SingleVariableDeclaration (
	__IDMultipleValuedNamedElement__ Integer NOT NULL,
	__IDSingleVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE PackageDeclaration_ownedElements_AbstractTypeDeclaration (
	__IDPackageDeclaration__ Integer NOT NULL,
	__IDAbstractTypeDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ParameterizedType_typeArguments_NamedElementRef (
	__IDParameterizedType__ Integer NOT NULL,
	__IDNamedElementRef__ Integer NOT NULL
) ;

CREATE TABLE SuperConstructorInvocation_arguments_Expression (
	__IDSuperConstructorInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SuperMethodInvocation_arguments_Expression (
	__IDSuperMethodInvocation__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE SwitchStatement_statements_Statement (
	__IDSwitchStatement__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE TagElement_fragments_ASTNode (
	__IDTagElement__ Integer NOT NULL,
	__IDASTNode__ Integer NOT NULL
) ;

CREATE TABLE TryStatement_catchClauses_CatchClause (
	__IDTryStatement__ Integer NOT NULL,
	__IDCatchClause__ Integer NOT NULL
) ;

CREATE TABLE TypeDeclaration_typeParameters_TypeParameter (
	__IDTypeDeclaration__ Integer NOT NULL,
	__IDTypeParameter__ Integer NOT NULL
) ;

CREATE TABLE TypeParameter_bounds_NamedElementRef (
	__IDTypeParameter__ Integer NOT NULL,
	__IDNamedElementRef__ Integer NOT NULL
) ;
