( declare J2SE5_AbstractTypeDeclaration )
( declare J2SE5_Annotation )
( declare J2SE5_AnnotationMemberValuePair )
( declare J2SE5_AnnotationTypeDeclaration )
( declare J2SE5_AnnotationTypeMemberDeclaration )
( declare J2SE5_AnonymousClassDeclaration )
( declare J2SE5_ArrayAccess )
( declare J2SE5_ArrayCreation )
( declare J2SE5_ArrayInitializer )
( declare J2SE5_ArrayLengthAccess )
( declare J2SE5_AssertStatement )
( declare J2SE5_Assignment )
( declare J2SE5_ASTNode )
( declare J2SE5_BodyDeclaration )
( declare J2SE5_Block )
( declare J2SE5_BlockComment )
( declare J2SE5_BreakStatement )
( declare J2SE5_CastExpression )
( declare J2SE5_CatchClause )
( declare J2SE5_ClassInstanceCreation )
( declare J2SE5_Comment )
( declare J2SE5_ConditionalExpression )
( declare J2SE5_ContinueStatement )
( declare J2SE5_ConstructorInvocation )
( declare J2SE5_DoStatement )
( declare J2SE5_EmptyStatement )
( declare J2SE5_EnhancedForStatement )
( declare J2SE5_EnumConstantDeclaration )
( declare J2SE5_EnumDeclaration )
( declare J2SE5_Expression )
( declare J2SE5_ExpressionStatement )
( declare J2SE5_FieldAccess )
( declare J2SE5_FieldDeclaration )
( declare J2SE5_ForStatement )
( declare J2SE5_InfixExpression )
( declare J2SE5_IfStatement )
( declare J2SE5_ImportDeclaration )
( declare J2SE5_Initializer )
( declare J2SE5_InstanceofExpression )
( declare J2SE5_Javadoc )
( declare J2SE5_LabeledStatement )
( declare J2SE5_LineComment )
( declare J2SE5_MemberRef )
( declare J2SE5_MethodDeclaration )
( declare J2SE5_MethodInvocation )
( declare J2SE5_MethodRef )
( declare J2SE5_MethodRefParameter )
( declare J2SE5_Model )
( declare J2SE5_MultipleValuedNamedElement )
( declare J2SE5_NamedElement )
( declare J2SE5_NamedElementRef )
( declare J2SE5_OrphanType )
( declare J2SE5_PackageDeclaration )
( declare J2SE5_ParameterizedType )
( declare J2SE5_ParenthesizedExpression )
( declare J2SE5_PostfixExpression )
( declare J2SE5_PrefixExpression )
( declare J2SE5_PrimitiveType )
( declare J2SE5_ReturnStatement )
( declare J2SE5_ThrowStatement )
( declare J2SE5_SingleVariableDeclaration )
( declare J2SE5_Statement )
( declare J2SE5_SuperConstructorInvocation )
( declare J2SE5_SuperFieldAccess )
( declare J2SE5_SuperMethodInvocation )
( declare J2SE5_SwitchCase )
( declare J2SE5_SwitchStatement )
( declare J2SE5_SynchronizedStatement )
( declare J2SE5_TagElement )
( declare J2SE5_TextElement )
( declare J2SE5_ThisExpression )
( declare J2SE5_TryStatement )
( declare J2SE5_TypeDeclaration )
( declare J2SE5_TypeDeclarationStatement )
( declare J2SE5_TypeLiteral )
( declare J2SE5_TypeParameter )
( declare J2SE5_UnresolvedItem )
( declare J2SE5_ValuedNamedElement )
( declare J2SE5_VariableDeclarationExpression )
( declare J2SE5_VariableDeclarationStatement )
( declare J2SE5_WildCardType )
( declare J2SE5_WhileStatement )
( declare PrimitiveType_String )
( declare PrimitiveType_Boolean )
( declare PrimitiveType_Integer )
( def J2SE5 ( struct-map
	KM3_Package
	:contents[( def J2SE5_AbstractTypeDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_NamedElement J2SE5_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "originalFileContent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type String
			:location "11:5-11:51"
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_PackageDeclaration
			:location "12:5-12:71"
			:isContainer false
			:opposite ownedElements
		) ( struct-map
			KM3_Reference
			:name "bodyDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_BodyDeclaration
			:location "13:5-13:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "superInterfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_NamedElementRef
			:location "14:5-14:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "commentsAfterBody"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_Comment
			:location "15:5-15:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "imports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_ImportDeclaration
			:location "16:5-16:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "commentsBeforeBody"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AbstractTypeDeclaration
			:type J2SE5_Comment
			:location "17:5-17:57"
			:isContainer true
		)]
	) ) ( def J2SE5_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Annotation
			:type J2SE5_NamedElementRef
			:location "21:5-21:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_Annotation
			:type J2SE5_AnnotationMemberValuePair
			:location "22:5-22:63"
			:isContainer true
		)]
	) ) ( def J2SE5_AnnotationMemberValuePair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "member"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AnnotationMemberValuePair
			:type J2SE5_NamedElementRef
			:location "26:5-26:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AnnotationMemberValuePair
			:type J2SE5_Expression
			:location "27:5-27:44"
			:isContainer true
		)]
	) ) ( def J2SE5_AnnotationTypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_AbstractTypeDeclaration]
		:structuralFeatures[]
	) ) ( def J2SE5_AnnotationTypeMemberDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_NamedElement J2SE5_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AnnotationTypeMemberDeclaration
			:type J2SE5_NamedElementRef
			:location "34:5-34:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_AnnotationTypeMemberDeclaration
			:type J2SE5_Expression
			:location "35:5-35:51"
			:isContainer true
		)]
	) ) ( def J2SE5_AnonymousClassDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bodyDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_AnonymousClassDeclaration
			:type J2SE5_BodyDeclaration
			:location "39:5-39:63"
			:isContainer true
		)]
	) ) ( def J2SE5_ArrayAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "index"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ArrayAccess
			:type J2SE5_Expression
			:location "43:5-43:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "array"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ArrayAccess
			:type J2SE5_Expression
			:location "44:5-44:44"
			:isContainer true
		)]
	) ) ( def J2SE5_ArrayCreation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dimensions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ArrayCreation
			:type J2SE5_Expression
			:location "48:5-48:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initializer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ArrayCreation
			:type J2SE5_ArrayInitializer
			:location "49:5-49:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ArrayCreation
			:type J2SE5_NamedElementRef
			:location "50:5-50:48"
			:isContainer true
		)]
	) ) ( def J2SE5_ArrayInitializer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ArrayInitializer
			:type J2SE5_Expression
			:location "54:5-54:53"
			:isContainer true
		)]
	) ) ( def J2SE5_ArrayLengthAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "array"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ArrayLengthAccess
			:type J2SE5_Expression
			:location "58:5-58:44"
			:isContainer true
		)]
	) ) ( def J2SE5_AssertStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_AssertStatement
			:type J2SE5_Expression
			:location "62:5-62:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_AssertStatement
			:type J2SE5_Expression
			:location "63:5-63:49"
			:isContainer true
		)]
	) ) ( def J2SE5_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Assignment
			:type String
			:location "67:5-67:40"
		) ( struct-map
			KM3_Reference
			:name "rightHandSide"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Assignment
			:type J2SE5_Expression
			:location "68:5-68:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "leftHandSide"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Assignment
			:type J2SE5_Expression
			:location "69:5-69:51"
			:isContainer true
		)]
	) ) ( def J2SE5_ASTNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "comments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ASTNode
			:type J2SE5_Comment
			:location "73:5-73:47"
			:isContainer true
		)]
	) ) ( def J2SE5_BodyDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modifiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_BodyDeclaration
			:type String
			:location "77:5-77:41"
		) ( struct-map
			KM3_Reference
			:name "annotations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_BodyDeclaration
			:type J2SE5_Annotation
			:location "78:5-78:53"
			:isContainer true
		)]
	) ) ( def J2SE5_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_Block
			:type J2SE5_Statement
			:location "82:5-82:51"
			:isContainer true
		)]
	) ) ( def J2SE5_BlockComment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Comment]
		:structuralFeatures[]
	) ) ( def J2SE5_BreakStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_BreakStatement
			:type J2SE5_NamedElementRef
			:location "89:5-89:54"
			:isContainer true
		)]
	) ) ( def J2SE5_CastExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_CastExpression
			:type J2SE5_NamedElementRef
			:location "93:5-93:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_CastExpression
			:type J2SE5_Expression
			:location "94:5-94:49"
			:isContainer true
		)]
	) ) ( def J2SE5_CatchClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exception"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_CatchClause
			:type J2SE5_SingleVariableDeclaration
			:location "98:5-98:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_CatchClause
			:type J2SE5_Block
			:location "99:5-99:38"
			:isContainer true
		)]
	) ) ( def J2SE5_ClassInstanceCreation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ClassInstanceCreation
			:type J2SE5_Expression
			:location "103:5-103:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ClassInstanceCreation
			:type J2SE5_NamedElementRef
			:location "104:5-104:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ClassInstanceCreation
			:type J2SE5_Expression
			:location "105:5-105:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "anonymousClassDeclaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ClassInstanceCreation
			:type J2SE5_AnonymousClassDeclaration
			:location "106:5-106:84"
			:isContainer true
		)]
	) ) ( def J2SE5_Comment ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Comment
			:type String
			:location "110:5-110:39"
		) ( struct-map
			KM3_Attribute
			:name "isEnclosedByParent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Comment
			:type Boolean
			:location "111:5-111:51"
		) ( struct-map
			KM3_Attribute
			:name "isPrefixOfParent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Comment
			:type Boolean
			:location "112:5-112:49"
		)]
	) ) ( def J2SE5_ConditionalExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elseExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ConditionalExpression
			:type J2SE5_Expression
			:location "116:5-116:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ConditionalExpression
			:type J2SE5_Expression
			:location "117:5-117:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ConditionalExpression
			:type J2SE5_Expression
			:location "118:5-118:49"
			:isContainer true
		)]
	) ) ( def J2SE5_ContinueStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ContinueStatement
			:type J2SE5_NamedElementRef
			:location "122:5-122:54"
			:isContainer true
		)]
	) ) ( def J2SE5_ConstructorInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ConstructorInvocation
			:type J2SE5_Expression
			:location "126:5-126:51"
			:isContainer true
		)]
	) ) ( def J2SE5_DoStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_DoStatement
			:type J2SE5_Expression
			:location "130:5-130:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_DoStatement
			:type J2SE5_Statement
			:location "131:5-131:42"
			:isContainer true
		)]
	) ) ( def J2SE5_EmptyStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[]
	) ) ( def J2SE5_EnhancedForStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_EnhancedForStatement
			:type J2SE5_SingleVariableDeclaration
			:location "138:5-138:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_EnhancedForStatement
			:type J2SE5_Expression
			:location "139:5-139:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_EnhancedForStatement
			:type J2SE5_Statement
			:location "140:5-140:42"
			:isContainer true
		)]
	) ) ( def J2SE5_EnumConstantDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_BodyDeclaration J2SE5_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_EnumConstantDeclaration
			:type J2SE5_Expression
			:location "144:5-144:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "anonymousClassDeclaration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_EnumConstantDeclaration
			:type J2SE5_AnonymousClassDeclaration
			:location "145:5-145:84"
			:isContainer true
		)]
	) ) ( def J2SE5_EnumDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_AbstractTypeDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumConstants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_EnumDeclaration
			:type J2SE5_EnumConstantDeclaration
			:location "149:5-149:68"
			:isContainer true
		)]
	) ) ( def J2SE5_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[]
	) ) ( def J2SE5_ExpressionStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ExpressionStatement
			:type J2SE5_Expression
			:location "156:5-156:49"
			:isContainer true
		)]
	) ) ( def J2SE5_FieldAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "field"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_FieldAccess
			:type J2SE5_NamedElementRef
			:location "160:5-160:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_FieldAccess
			:type J2SE5_Expression
			:location "161:5-161:49"
			:isContainer true
		)]
	) ) ( def J2SE5_FieldDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_BodyDeclaration J2SE5_MultipleValuedNamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_FieldDeclaration
			:type J2SE5_NamedElementRef
			:location "165:5-165:48"
			:isContainer true
		)]
	) ) ( def J2SE5_ForStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ForStatement
			:type J2SE5_Statement
			:location "169:5-169:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ForStatement
			:type J2SE5_Expression
			:location "170:5-170:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initializers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ForStatement
			:type J2SE5_Expression
			:location "171:5-171:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "updaters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ForStatement
			:type J2SE5_Expression
			:location "172:5-172:50"
			:isContainer true
		)]
	) ) ( def J2SE5_InfixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_InfixExpression
			:type String
			:location "176:5-176:40"
		) ( struct-map
			KM3_Reference
			:name "extendedOperands"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_InfixExpression
			:type J2SE5_Expression
			:location "177:5-177:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_InfixExpression
			:type J2SE5_Expression
			:location "178:5-178:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "leftOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_InfixExpression
			:type J2SE5_Expression
			:location "179:5-179:50"
			:isContainer true
		)]
	) ) ( def J2SE5_IfStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_IfStatement
			:type J2SE5_Expression
			:location "183:5-183:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseStatement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_IfStatement
			:type J2SE5_Statement
			:location "184:5-184:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStatement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_IfStatement
			:type J2SE5_Statement
			:location "185:5-185:51"
			:isContainer true
		)]
	) ) ( def J2SE5_ImportDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "static"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ImportDeclaration
			:type Boolean
			:location "189:5-189:39"
		) ( struct-map
			KM3_Reference
			:name "importedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ImportDeclaration
			:type J2SE5_NamedElementRef
			:location "190:5-190:59"
			:isContainer true
		)]
	) ) ( def J2SE5_Initializer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Initializer
			:type J2SE5_Block
			:location "194:5-194:38"
			:isContainer true
		)]
	) ) ( def J2SE5_InstanceofExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "leftOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_InstanceofExpression
			:type J2SE5_Expression
			:location "198:5-198:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_InstanceofExpression
			:type J2SE5_NamedElementRef
			:location "199:5-199:56"
			:isContainer true
		)]
	) ) ( def J2SE5_Javadoc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Comment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tags"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_Javadoc
			:type J2SE5_TagElement
			:location "203:5-203:46"
			:isContainer true
		)]
	) ) ( def J2SE5_LabeledStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement J2SE5_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_LabeledStatement
			:type J2SE5_Statement
			:location "207:5-207:42"
			:isContainer true
		)]
	) ) ( def J2SE5_LineComment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Comment]
		:structuralFeatures[]
	) ) ( def J2SE5_MemberRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_MemberRef
			:type J2SE5_NamedElementRef
			:location "214:5-214:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MemberRef
			:type J2SE5_NamedElementRef
			:location "215:5-215:50"
			:isContainer true
		)]
	) ) ( def J2SE5_MethodDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_NamedElement J2SE5_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extraArrayDimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type Integer
			:location "219:5-219:53"
		) ( struct-map
			KM3_Attribute
			:name "constructor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type Boolean
			:location "220:5-220:44"
		) ( struct-map
			KM3_Attribute
			:name "varargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type Boolean
			:location "221:5-221:40"
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type J2SE5_Block
			:location "222:5-222:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type J2SE5_SingleVariableDeclaration
			:location "223:5-223:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeParameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type J2SE5_TypeParameter
			:location "224:5-224:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thrownExceptions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type J2SE5_NamedElementRef
			:location "225:5-225:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodDeclaration
			:type J2SE5_NamedElementRef
			:location "226:5-226:54"
			:isContainer true
		)]
	) ) ( def J2SE5_MethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodInvocation
			:type J2SE5_NamedElementRef
			:location "230:5-230:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodInvocation
			:type J2SE5_Expression
			:location "231:5-231:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodInvocation
			:type J2SE5_Expression
			:location "232:5-232:54"
			:isContainer true
		)]
	) ) ( def J2SE5_MethodRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodRef
			:type J2SE5_NamedElementRef
			:location "236:5-236:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodRef
			:type J2SE5_MethodRefParameter
			:location "237:5-237:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodRef
			:type J2SE5_NamedElementRef
			:location "238:5-238:50"
			:isContainer true
		)]
	) ) ( def J2SE5_MethodRefParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodRefParameter
			:type String
			:location "242:5-242:36"
		) ( struct-map
			KM3_Attribute
			:name "isVarargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_MethodRefParameter
			:type Boolean
			:location "243:5-243:42"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_MethodRefParameter
			:type J2SE5_NamedElementRef
			:location "244:5-244:53"
			:isContainer true
		)]
	) ) ( def J2SE5_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_Model
			:type String
			:location "248:5-248:36"
		) ( struct-map
			KM3_Reference
			:name "ownedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_Model
			:type J2SE5_PackageDeclaration
			:location "249:5-249:80"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "orphanTypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_Model
			:type J2SE5_OrphanType
			:location "250:5-250:53"
			:isContainer true
		)]
	) ) ( def J2SE5_MultipleValuedNamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_ValuedNamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_MultipleValuedNamedElement
			:type J2SE5_SingleVariableDeclaration
			:location "254:5-254:66"
			:isContainer true
		)]
	) ) ( def J2SE5_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_NamedElement
			:type String
			:location "258:5-258:36"
		) ( struct-map
			KM3_Attribute
			:name "proxy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_NamedElement
			:type Boolean
			:location "259:5-259:38"
		)]
	) ) ( def J2SE5_NamedElementRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extraArrayDimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_NamedElementRef
			:type Integer
			:location "263:5-263:53"
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_NamedElementRef
			:type J2SE5_NamedElement
			:location "264:5-264:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_NamedElementRef
			:type J2SE5_NamedElementRef
			:location "265:5-265:58"
			:isContainer true
		)]
	) ) ( def J2SE5_OrphanType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_NamedElement]
		:structuralFeatures[]
	) ) ( def J2SE5_PackageDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode J2SE5_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_PackageDeclaration
			:type J2SE5_Model
			:location "273:5-273:54"
			:isContainer false
			:opposite ownedElements
		) ( struct-map
			KM3_Reference
			:name "ownedElements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_PackageDeclaration
			:type J2SE5_AbstractTypeDeclaration
			:location "274:5-274:89"
			:isContainer true
			:opposite package
		)]
	) ) ( def J2SE5_ParameterizedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode J2SE5_OrphanType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_ParameterizedType
			:type J2SE5_NamedElementRef
			:location "278:5-278:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ParameterizedType
			:type J2SE5_NamedElementRef
			:location "279:5-279:48"
			:isContainer true
		)]
	) ) ( def J2SE5_ParenthesizedExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ParenthesizedExpression
			:type J2SE5_Expression
			:location "283:5-283:49"
			:isContainer true
		)]
	) ) ( def J2SE5_PostfixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_PostfixExpression
			:type String
			:location "287:5-287:40"
		) ( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_PostfixExpression
			:type J2SE5_Expression
			:location "288:5-288:46"
			:isContainer true
		)]
	) ) ( def J2SE5_PrefixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_PrefixExpression
			:type String
			:location "292:5-292:40"
		) ( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_PrefixExpression
			:type J2SE5_Expression
			:location "293:5-293:46"
			:isContainer true
		)]
	) ) ( def J2SE5_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode J2SE5_OrphanType]
		:structuralFeatures[]
	) ) ( def J2SE5_ReturnStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ReturnStatement
			:type J2SE5_Expression
			:location "300:5-300:54"
			:isContainer true
		)]
	) ) ( def J2SE5_ThrowStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ThrowStatement
			:type J2SE5_Expression
			:location "304:5-304:49"
			:isContainer true
		)]
	) ) ( def J2SE5_SingleVariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode J2SE5_ValuedNamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modifiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SingleVariableDeclaration
			:type String
			:location "308:5-308:41"
		) ( struct-map
			KM3_Attribute
			:name "isVarargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SingleVariableDeclaration
			:type Boolean
			:location "309:5-309:42"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SingleVariableDeclaration
			:type J2SE5_NamedElementRef
			:location "310:5-310:48"
			:isContainer true
		)]
	) ) ( def J2SE5_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[]
	) ) ( def J2SE5_SuperConstructorInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_SuperConstructorInvocation
			:type J2SE5_Expression
			:location "317:5-317:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_SuperConstructorInvocation
			:type J2SE5_Expression
			:location "318:5-318:54"
			:isContainer true
		)]
	) ) ( def J2SE5_SuperFieldAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_SuperFieldAccess
			:type J2SE5_NamedElementRef
			:location "322:5-322:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "field"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SuperFieldAccess
			:type J2SE5_NamedElementRef
			:location "323:5-323:49"
			:isContainer true
		)]
	) ) ( def J2SE5_SuperMethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_SuperMethodInvocation
			:type J2SE5_Expression
			:location "327:5-327:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_SuperMethodInvocation
			:type J2SE5_NamedElementRef
			:location "328:5-328:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SuperMethodInvocation
			:type J2SE5_NamedElementRef
			:location "329:5-329:50"
			:isContainer true
		)]
	) ) ( def J2SE5_SwitchCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expressionInitialized"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SwitchCase
			:type Boolean
			:location "333:5-333:54"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_SwitchCase
			:type J2SE5_Expression
			:location "334:5-334:54"
			:isContainer true
		)]
	) ) ( def J2SE5_SwitchStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_SwitchStatement
			:type J2SE5_Statement
			:location "338:5-338:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SwitchStatement
			:type J2SE5_Expression
			:location "339:5-339:49"
			:isContainer true
		)]
	) ) ( def J2SE5_SynchronizedStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SynchronizedStatement
			:type J2SE5_Block
			:location "343:5-343:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_SynchronizedStatement
			:type J2SE5_Expression
			:location "344:5-344:49"
			:isContainer true
		)]
	) ) ( def J2SE5_TagElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tagName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TagElement
			:type String
			:location "348:5-348:39"
		) ( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_TagElement
			:type J2SE5_ASTNode
			:location "349:5-349:48"
			:isContainer true
		)]
	) ) ( def J2SE5_TextElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TextElement
			:type String
			:location "353:5-353:36"
		)]
	) ) ( def J2SE5_ThisExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ThisExpression
			:type J2SE5_NamedElementRef
			:location "357:5-357:58"
			:isContainer true
		)]
	) ) ( def J2SE5_TryStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "finally"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_TryStatement
			:type J2SE5_Block
			:location "361:5-361:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TryStatement
			:type J2SE5_Block
			:location "362:5-362:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "catchClauses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_TryStatement
			:type J2SE5_CatchClause
			:location "363:5-363:55"
			:isContainer true
		)]
	) ) ( def J2SE5_TypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_AbstractTypeDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInterface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TypeDeclaration
			:type Boolean
			:location "367:5-367:44"
		) ( struct-map
			KM3_Reference
			:name "typeParameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_TypeDeclaration
			:type J2SE5_TypeParameter
			:location "368:5-368:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "superclass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_TypeDeclaration
			:type J2SE5_NamedElementRef
			:location "369:5-369:59"
			:isContainer true
		)]
	) ) ( def J2SE5_TypeDeclarationStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TypeDeclarationStatement
			:type J2SE5_AbstractTypeDeclaration
			:location "373:5-373:63"
			:isContainer true
		)]
	) ) ( def J2SE5_TypeLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_TypeLiteral
			:type J2SE5_NamedElementRef
			:location "377:5-377:48"
			:isContainer true
		)]
	) ) ( def J2SE5_TypeParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_ASTNode J2SE5_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bounds"
			:upper -1
			:lower 0
			:isOrdered false
			:owner J2SE5_TypeParameter
			:type J2SE5_NamedElementRef
			:location "381:5-381:53"
			:isContainer true
		)]
	) ) ( def J2SE5_UnresolvedItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_NamedElement J2SE5_ASTNode]
		:structuralFeatures[]
	) ) ( def J2SE5_ValuedNamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[J2SE5_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extraArrayDimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_ValuedNamedElement
			:type Integer
			:location "389:5-389:53"
		) ( struct-map
			KM3_Reference
			:name "initializer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_ValuedNamedElement
			:type J2SE5_Expression
			:location "390:5-390:55"
			:isContainer true
		)]
	) ) ( def J2SE5_VariableDeclarationExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Expression J2SE5_MultipleValuedNamedElement J2SE5_ValuedNamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modifiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_VariableDeclarationExpression
			:type String
			:location "394:5-394:41"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_VariableDeclarationExpression
			:type J2SE5_NamedElementRef
			:location "395:5-395:48"
			:isContainer true
		)]
	) ) ( def J2SE5_VariableDeclarationStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement J2SE5_MultipleValuedNamedElement J2SE5_ValuedNamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modifiers"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_VariableDeclarationStatement
			:type String
			:location "399:5-399:41"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_VariableDeclarationStatement
			:type J2SE5_NamedElementRef
			:location "400:5-400:48"
			:isContainer true
		)]
	) ) ( def J2SE5_WildCardType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_OrphanType J2SE5_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isUpperBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_WildCardType
			:type Boolean
			:location "404:5-404:45"
		) ( struct-map
			KM3_Reference
			:name "bound"
			:upper 1
			:lower 0
			:isOrdered false
			:owner J2SE5_WildCardType
			:type J2SE5_NamedElementRef
			:location "405:5-405:54"
			:isContainer true
		)]
	) ) ( def J2SE5_WhileStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[J2SE5_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_WhileStatement
			:type J2SE5_Expression
			:location "409:5-409:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner J2SE5_WhileStatement
			:type J2SE5_Statement
			:location "410:5-410:42"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveType ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "416:2-416:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "418:2-418:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "420:2-420:19"
	) )]
) )
