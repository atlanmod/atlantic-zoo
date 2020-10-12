( declare JavaAbstractSyntax_AST )
( declare JavaAbstractSyntax_ASTNode )
( declare JavaAbstractSyntax_AnonymousClassDeclaration )
( declare JavaAbstractSyntax_BodyDeclaration )
( declare JavaAbstractSyntax_CatchClause )
( declare JavaAbstractSyntax_Comment )
( declare JavaAbstractSyntax_CompilationUnit )
( declare JavaAbstractSyntax_Expression )
( declare JavaAbstractSyntax_ImportDeclaration )
( declare JavaAbstractSyntax_MemberRef )
( declare JavaAbstractSyntax_MemberValuePair )
( declare JavaAbstractSyntax_MethodRef )
( declare JavaAbstractSyntax_MethodRefParameter )
( declare JavaAbstractSyntax_ExtendedModifier )
( declare JavaAbstractSyntax_Modifier )
( declare JavaAbstractSyntax_PackageDeclaration )
( declare JavaAbstractSyntax_Statement )
( declare JavaAbstractSyntax_TagElement )
( declare JavaAbstractSyntax_TextElement )
( declare JavaAbstractSyntax_Type )
( declare JavaAbstractSyntax_TypeParameter )
( declare JavaAbstractSyntax_VariableDeclaration )
( declare JavaAbstractSyntax_AbstractTypeDeclaration )
( declare JavaAbstractSyntax_AnnotationTypeMemberDeclaration )
( declare JavaAbstractSyntax_EnumConstantDeclaration )
( declare JavaAbstractSyntax_FieldDeclaration )
( declare JavaAbstractSyntax_Initializer )
( declare JavaAbstractSyntax_MethodDeclaration )
( declare JavaAbstractSyntax_AnnotationTypeDeclaration )
( declare JavaAbstractSyntax_EnumDeclaration )
( declare JavaAbstractSyntax_TypeDeclaration )
( declare JavaAbstractSyntax_BlockComment )
( declare JavaAbstractSyntax_Javadoc )
( declare JavaAbstractSyntax_LineComment )
( declare JavaAbstractSyntax_Annotation )
( declare JavaAbstractSyntax_ArrayAccess )
( declare JavaAbstractSyntax_ArrayCreation )
( declare JavaAbstractSyntax_ArrayInitializer )
( declare JavaAbstractSyntax_Assignment )
( declare JavaAbstractSyntax_AssignementOperatorKind )
( declare JavaAbstractSyntax_BooleanLiteral )
( declare JavaAbstractSyntax_CastExpression )
( declare JavaAbstractSyntax_CharacterLiteral )
( declare JavaAbstractSyntax_ClassInstanceCreation )
( declare JavaAbstractSyntax_ConditionalExpression )
( declare JavaAbstractSyntax_FieldAccess )
( declare JavaAbstractSyntax_InfixExpression )
( declare JavaAbstractSyntax_InfixExpressionOperatorKind )
( declare JavaAbstractSyntax_InstanceofExpression )
( declare JavaAbstractSyntax_MethodInvocation )
( declare JavaAbstractSyntax_Name )
( declare JavaAbstractSyntax_NullLiteral )
( declare JavaAbstractSyntax_NumberLiteral )
( declare JavaAbstractSyntax_ParenthesizedExpression )
( declare JavaAbstractSyntax_PostfixExpression )
( declare JavaAbstractSyntax_PostfixExpresssionOperatorKind )
( declare JavaAbstractSyntax_PrefixExpression )
( declare JavaAbstractSyntax_PrefixExpresssionOperatorKind )
( declare JavaAbstractSyntax_StringLiteral )
( declare JavaAbstractSyntax_SuperFieldAccess )
( declare JavaAbstractSyntax_SuperMethodInvocation )
( declare JavaAbstractSyntax_ThisExpression )
( declare JavaAbstractSyntax_TypeLiteral )
( declare JavaAbstractSyntax_VariableDeclarationExpression )
( declare JavaAbstractSyntax_AssertStatement )
( declare JavaAbstractSyntax_Block )
( declare JavaAbstractSyntax_BreakStatement )
( declare JavaAbstractSyntax_ConstructorInvocation )
( declare JavaAbstractSyntax_ContinueStatement )
( declare JavaAbstractSyntax_DoStatement )
( declare JavaAbstractSyntax_EmptyStatement )
( declare JavaAbstractSyntax_EnhancedForStatement )
( declare JavaAbstractSyntax_ExpressionStatement )
( declare JavaAbstractSyntax_ForStatement )
( declare JavaAbstractSyntax_IfStatement )
( declare JavaAbstractSyntax_LabeledStatement )
( declare JavaAbstractSyntax_ReturnStatement )
( declare JavaAbstractSyntax_SuperConstructorInvocation )
( declare JavaAbstractSyntax_SwitchCase )
( declare JavaAbstractSyntax_SwitchStatement )
( declare JavaAbstractSyntax_SynchronizedStatement )
( declare JavaAbstractSyntax_ThrowStatement )
( declare JavaAbstractSyntax_TryStatement )
( declare JavaAbstractSyntax_TypeDeclarationStatement )
( declare JavaAbstractSyntax_VariableDeclarationStatement )
( declare JavaAbstractSyntax_WhileStatement )
( declare JavaAbstractSyntax_ArrayType )
( declare JavaAbstractSyntax_ParameterizedType )
( declare JavaAbstractSyntax_PrimitiveType )
( declare JavaAbstractSyntax_QualifiedType )
( declare JavaAbstractSyntax_SimpleType )
( declare JavaAbstractSyntax_WildcardType )
( declare JavaAbstractSyntax_SingleVariableDeclaration )
( declare JavaAbstractSyntax_VariableDeclarationFragment )
( declare JavaAbstractSyntax_QualifiedName )
( declare JavaAbstractSyntax_SimpleName )
( declare JavaAbstractSyntax_MarkerAnnotation )
( declare JavaAbstractSyntax_NormalAnnotation )
( declare JavaAbstractSyntax_SingleMemberAnnotation )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Character )
( def JavaAbstractSyntax ( struct-map
	KM3_Package
	:contents[( def AssignementOperatorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "RIGHT_SHIFT_SIGNED_ASSIGN"
		:location "228:16-228:50"
	) ( struct-map
		KM3_EnumLiteral
		:name "BIT_XOR_ASSIGN"
		:location "231:16-231:39"
	) ( struct-map
		KM3_EnumLiteral
		:name "TIMES_ASSIGN"
		:location "234:16-234:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "LEFT_SHIFT_ASSIGN"
		:location "237:16-237:42"
	) ( struct-map
		KM3_EnumLiteral
		:name "MINUS_ASSIGN"
		:location "240:16-240:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "BIT_OR_ASSIGN"
		:location "243:16-243:38"
	) ( struct-map
		KM3_EnumLiteral
		:name "PLUS_ASSIGN"
		:location "246:16-246:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "ASSIGN"
		:location "249:16-249:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "RIGHT_SHIFT_UNSIGNED_ASSIGN"
		:location "252:16-252:52"
	) ( struct-map
		KM3_EnumLiteral
		:name "REMAINDER_ASSIGN"
		:location "255:16-255:41"
	) ( struct-map
		KM3_EnumLiteral
		:name "DIVIDE_ASSIGN"
		:location "258:16-258:38"
	) ( struct-map
		KM3_EnumLiteral
		:name "BIT_AND_ASSIGN"
		:location "261:16-261:39"
	)] ) ) ( def InfixExpressionOperatorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "GREATER_EQUALS"
		:location "307:16-307:39"
	) ( struct-map
		KM3_EnumLiteral
		:name "OR"
		:location "310:16-310:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "RIGHT_SHIFT_SIGNED"
		:location "313:16-313:43"
	) ( struct-map
		KM3_EnumLiteral
		:name "MINUS"
		:location "316:16-316:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "XOR"
		:location "319:16-319:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "LESS_EQUALS"
		:location "322:16-322:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "EQUALS"
		:location "325:16-325:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT_EQUALS"
		:location "328:16-328:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "AND"
		:location "331:16-331:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "PLUS"
		:location "334:16-334:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "GREATER"
		:location "337:16-337:32"
	) ( struct-map
		KM3_EnumLiteral
		:name "CONDITIONAL_OR"
		:location "340:16-340:39"
	) ( struct-map
		KM3_EnumLiteral
		:name "REMAINDER"
		:location "343:16-343:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "LESS"
		:location "346:16-346:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "LEFT_SHIFT"
		:location "349:16-349:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "RIGHT_SHIFT_UNSIGNED"
		:location "352:16-352:45"
	) ( struct-map
		KM3_EnumLiteral
		:name "CONDITIONAL_AND"
		:location "355:16-355:40"
	) ( struct-map
		KM3_EnumLiteral
		:name "TIMES"
		:location "358:16-358:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "DIVIDE"
		:location "361:16-361:31"
	)] ) ) ( def PostfixExpresssionOperatorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "INCREMENT"
		:location "400:16-400:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "DECREMENT"
		:location "403:16-403:34"
	)] ) ) ( def PrefixExpresssionOperatorKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "MINUS"
		:location "414:16-414:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "NOT"
		:location "417:16-417:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "DECREMENT"
		:location "420:16-420:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "COMPLEMENT"
		:location "423:16-423:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "INCREMENT"
		:location "426:16-426:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "PLUS"
		:location "429:16-429:29"
	)] ) ) ( def JavaAbstractSyntax_AST ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AST
			:type JavaAbstractSyntax_ASTNode
			:location "12:16-12:51"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ASTNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_AnonymousClassDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bodyDeclarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_AnonymousClassDeclaration
			:type JavaAbstractSyntax_BodyDeclaration
			:location "20:16-20:82"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_BodyDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "modifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_BodyDeclaration
			:type JavaAbstractSyntax_ExtendedModifier
			:location "24:16-24:76"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "javadoc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_BodyDeclaration
			:type JavaAbstractSyntax_Javadoc
			:location "25:16-25:54"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_CatchClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CatchClause
			:type JavaAbstractSyntax_Block
			:location "29:16-29:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exception"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CatchClause
			:type JavaAbstractSyntax_SingleVariableDeclaration
			:location "30:16-30:74"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Comment ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "alternateRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Comment
			:type JavaAbstractSyntax_ASTNode
			:location "34:16-34:50"
			:isContainer false
		)]
	) ) ( def JavaAbstractSyntax_CompilationUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "comments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_CompilationUnit
			:type JavaAbstractSyntax_Comment
			:location "38:16-38:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CompilationUnit
			:type JavaAbstractSyntax_PackageDeclaration
			:location "39:16-39:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "imports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_CompilationUnit
			:type JavaAbstractSyntax_ImportDeclaration
			:location "40:16-40:75"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "types"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_CompilationUnit
			:type JavaAbstractSyntax_AbstractTypeDeclaration
			:location "41:16-41:79"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resolveBoxing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Expression
			:type Boolean
			:location "45:16-45:50"
		) ( struct-map
			KM3_Attribute
			:name "resolveUnboxing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Expression
			:type Boolean
			:location "46:16-46:52"
		)]
	) ) ( def JavaAbstractSyntax_ImportDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "onDemand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ImportDeclaration
			:type Boolean
			:location "50:16-50:45"
		) ( struct-map
			KM3_Attribute
			:name "static"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ImportDeclaration
			:type Boolean
			:location "51:16-51:43"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ImportDeclaration
			:type JavaAbstractSyntax_Name
			:location "52:16-52:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MemberRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MemberRef
			:type JavaAbstractSyntax_SimpleName
			:location "56:16-56:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MemberRef
			:type JavaAbstractSyntax_Name
			:location "57:16-57:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MemberValuePair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MemberValuePair
			:type JavaAbstractSyntax_SimpleName
			:location "61:16-61:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MemberValuePair
			:type JavaAbstractSyntax_Expression
			:location "62:16-62:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MethodRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodRef
			:type JavaAbstractSyntax_SimpleName
			:location "66:16-66:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodRef
			:type JavaAbstractSyntax_Name
			:location "67:16-67:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodRef
			:type JavaAbstractSyntax_MethodRefParameter
			:location "68:16-68:79"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MethodRefParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "varargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodRefParameter
			:type Boolean
			:location "74:16-74:44"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodRefParameter
			:type JavaAbstractSyntax_SimpleName
			:location "72:16-72:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodRefParameter
			:type JavaAbstractSyntax_Type
			:location "73:16-73:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ExtendedModifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_Modifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode JavaAbstractSyntax_ExtendedModifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "82:16-82:47"
		) ( struct-map
			KM3_Attribute
			:name "final"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "83:16-83:42"
		) ( struct-map
			KM3_Attribute
			:name "native"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "84:16-84:43"
		) ( struct-map
			KM3_Attribute
			:name "none"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "85:16-85:41"
		) ( struct-map
			KM3_Attribute
			:name "private"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "86:16-86:44"
		) ( struct-map
			KM3_Attribute
			:name "protected"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "87:16-87:46"
		) ( struct-map
			KM3_Attribute
			:name "public"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "88:16-88:43"
		) ( struct-map
			KM3_Attribute
			:name "static"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "89:16-89:43"
		) ( struct-map
			KM3_Attribute
			:name "strictfp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "90:16-90:45"
		) ( struct-map
			KM3_Attribute
			:name "synchronized"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "91:16-91:49"
		) ( struct-map
			KM3_Attribute
			:name "transient"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "92:16-92:46"
		) ( struct-map
			KM3_Attribute
			:name "volatile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Modifier
			:type Boolean
			:location "93:16-93:45"
		)]
	) ) ( def JavaAbstractSyntax_PackageDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_PackageDeclaration
			:type JavaAbstractSyntax_Annotation
			:location "97:16-97:72"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "javadoc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PackageDeclaration
			:type JavaAbstractSyntax_Javadoc
			:location "98:16-98:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PackageDeclaration
			:type JavaAbstractSyntax_Name
			:location "99:16-99:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_TagElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tagName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TagElement
			:type String
			:location "108:16-108:43"
		) ( struct-map
			KM3_Attribute
			:name "nested"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TagElement
			:type Boolean
			:location "109:16-109:43"
		) ( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_TagElement
			:type JavaAbstractSyntax_ASTNode
			:location "107:16-107:67"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_TextElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TextElement
			:type String
			:location "113:16-113:40"
		)]
	) ) ( def JavaAbstractSyntax_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_TypeParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TypeParameter
			:type JavaAbstractSyntax_SimpleName
			:location "121:16-121:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeBounds"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_TypeParameter
			:type JavaAbstractSyntax_Type
			:location "122:16-122:65"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_VariableDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_ASTNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extraDimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_VariableDeclaration
			:type Integer
			:location "126:16-126:52"
		) ( struct-map
			KM3_Reference
			:name "initializer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_VariableDeclaration
			:type JavaAbstractSyntax_Expression
			:location "127:16-127:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_VariableDeclaration
			:type JavaAbstractSyntax_SimpleName
			:location "128:16-128:54"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_AbstractTypeDeclaration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "localTypeDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AbstractTypeDeclaration
			:type Boolean
			:location "134:16-134:57"
		) ( struct-map
			KM3_Attribute
			:name "memberTypeDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AbstractTypeDeclaration
			:type Boolean
			:location "135:16-135:58"
		) ( struct-map
			KM3_Attribute
			:name "packageMemberTypeDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AbstractTypeDeclaration
			:type Boolean
			:location "136:16-136:65"
		) ( struct-map
			KM3_Reference
			:name "bodyDeclarations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_AbstractTypeDeclaration
			:type JavaAbstractSyntax_BodyDeclaration
			:location "132:16-132:82"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AbstractTypeDeclaration
			:type JavaAbstractSyntax_SimpleName
			:location "133:16-133:54"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_AnnotationTypeMemberDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "default"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AnnotationTypeMemberDeclaration
			:type JavaAbstractSyntax_Expression
			:location "140:16-140:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AnnotationTypeMemberDeclaration
			:type JavaAbstractSyntax_SimpleName
			:location "141:16-141:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AnnotationTypeMemberDeclaration
			:type JavaAbstractSyntax_Type
			:location "142:16-142:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_EnumConstantDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_EnumConstantDeclaration
			:type JavaAbstractSyntax_Expression
			:location "146:16-146:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "anonymousClassDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_EnumConstantDeclaration
			:type JavaAbstractSyntax_AnonymousClassDeclaration
			:location "147:16-147:90"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_EnumConstantDeclaration
			:type JavaAbstractSyntax_SimpleName
			:location "148:16-148:54"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_FieldDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_FieldDeclaration
			:type JavaAbstractSyntax_VariableDeclarationFragment
			:location "152:16-152:87"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_FieldDeclaration
			:type JavaAbstractSyntax_Type
			:location "153:16-153:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Initializer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Initializer
			:type JavaAbstractSyntax_Block
			:location "157:16-157:49"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MethodDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_BodyDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extraDimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type Integer
			:location "162:16-162:52"
		) ( struct-map
			KM3_Attribute
			:name "constructor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type Boolean
			:location "165:16-165:48"
		) ( struct-map
			KM3_Attribute
			:name "varargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type Boolean
			:location "166:16-166:44"
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_Block
			:location "161:16-161:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_SimpleName
			:location "163:16-163:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_Type
			:location "164:16-164:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_SingleVariableDeclaration
			:location "167:16-167:86"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thrownExceptions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_Name
			:location "168:16-168:71"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeParameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodDeclaration
			:type JavaAbstractSyntax_TypeParameter
			:location "169:16-169:78"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_AnnotationTypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_AbstractTypeDeclaration]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_EnumDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_AbstractTypeDeclaration]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superInterfaceTypes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_EnumDeclaration
			:type JavaAbstractSyntax_Type
			:location "177:16-177:74"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "enumConstants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_EnumDeclaration
			:type JavaAbstractSyntax_EnumConstantDeclaration
			:location "178:16-178:87"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_TypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_AbstractTypeDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "interface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TypeDeclaration
			:type Boolean
			:location "183:16-183:46"
		) ( struct-map
			KM3_Reference
			:name "superclassType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TypeDeclaration
			:type JavaAbstractSyntax_Type
			:location "182:16-182:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "superInterfaceTypes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_TypeDeclaration
			:type JavaAbstractSyntax_Type
			:location "184:16-184:74"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeParameters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_TypeDeclaration
			:type JavaAbstractSyntax_TypeParameter
			:location "185:16-185:78"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_BlockComment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Comment]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_Javadoc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Comment]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tags"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_Javadoc
			:type JavaAbstractSyntax_TagElement
			:location "193:16-193:65"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_LineComment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Comment]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_Annotation ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_Expression JavaAbstractSyntax_ExtendedModifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "typeName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Annotation
			:type JavaAbstractSyntax_Name
			:location "201:16-201:52"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ArrayAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "array"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayAccess
			:type JavaAbstractSyntax_Expression
			:location "205:16-205:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "index"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayAccess
			:type JavaAbstractSyntax_Expression
			:location "206:16-206:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ArrayCreation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dimensions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ArrayCreation
			:type JavaAbstractSyntax_Expression
			:location "210:16-210:71"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initializer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayCreation
			:type JavaAbstractSyntax_ArrayInitializer
			:location "211:16-211:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayCreation
			:type JavaAbstractSyntax_ArrayType
			:location "212:16-212:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ArrayInitializer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ArrayInitializer
			:type JavaAbstractSyntax_Expression
			:location "216:16-216:72"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Assignment
			:type AssignementOperatorKind
			:location "221:16-221:61"
		) ( struct-map
			KM3_Reference
			:name "leftHandSide"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Assignment
			:type JavaAbstractSyntax_Expression
			:location "220:16-220:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightHandSide"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Assignment
			:type JavaAbstractSyntax_Expression
			:location "222:16-222:63"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_BooleanLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "booleanValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_BooleanLiteral
			:type Boolean
			:location "265:16-265:49"
		)]
	) ) ( def JavaAbstractSyntax_CastExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CastExpression
			:type JavaAbstractSyntax_Expression
			:location "269:16-269:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CastExpression
			:type JavaAbstractSyntax_Type
			:location "270:16-270:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_CharacterLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "charValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CharacterLiteral
			:type Character
			:location "274:16-274:48"
		) ( struct-map
			KM3_Attribute
			:name "escapedValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_CharacterLiteral
			:type String
			:location "275:16-275:48"
		)]
	) ) ( def JavaAbstractSyntax_ClassInstanceCreation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ClassInstanceCreation
			:type JavaAbstractSyntax_Expression
			:location "279:16-279:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "anonymousClassDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ClassInstanceCreation
			:type JavaAbstractSyntax_AnonymousClassDeclaration
			:location "280:16-280:90"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ClassInstanceCreation
			:type JavaAbstractSyntax_Expression
			:location "281:16-281:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ClassInstanceCreation
			:type JavaAbstractSyntax_Type
			:location "282:16-282:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ClassInstanceCreation
			:type JavaAbstractSyntax_Type
			:location "283:16-283:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ConditionalExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elseExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ConditionalExpression
			:type JavaAbstractSyntax_Expression
			:location "287:16-287:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ConditionalExpression
			:type JavaAbstractSyntax_Expression
			:location "288:16-288:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ConditionalExpression
			:type JavaAbstractSyntax_Expression
			:location "289:16-289:64"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_FieldAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_FieldAccess
			:type JavaAbstractSyntax_Expression
			:location "293:16-293:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_FieldAccess
			:type JavaAbstractSyntax_SimpleName
			:location "294:16-294:54"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_InfixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_InfixExpression
			:type InfixExpressionOperatorKind
			:location "300:16-300:65"
		) ( struct-map
			KM3_Reference
			:name "extendedOperands"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_InfixExpression
			:type JavaAbstractSyntax_Expression
			:location "298:16-298:77"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "leftOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_InfixExpression
			:type JavaAbstractSyntax_Expression
			:location "299:16-299:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_InfixExpression
			:type JavaAbstractSyntax_Expression
			:location "301:16-301:62"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_InstanceofExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "leftOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_InstanceofExpression
			:type JavaAbstractSyntax_Expression
			:location "365:16-365:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightOperand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_InstanceofExpression
			:type JavaAbstractSyntax_Type
			:location "366:16-366:56"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_MethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodInvocation
			:type JavaAbstractSyntax_Expression
			:location "370:16-370:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodInvocation
			:type JavaAbstractSyntax_Expression
			:location "371:16-371:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_MethodInvocation
			:type JavaAbstractSyntax_SimpleName
			:location "372:16-372:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_MethodInvocation
			:type JavaAbstractSyntax_Type
			:location "373:16-373:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Name ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fullyQualifiedName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_Name
			:type String
			:location "377:16-377:54"
		)]
	) ) ( def JavaAbstractSyntax_NullLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_NumberLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "token"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_NumberLiteral
			:type String
			:location "385:16-385:41"
		)]
	) ) ( def JavaAbstractSyntax_ParenthesizedExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ParenthesizedExpression
			:type JavaAbstractSyntax_Expression
			:location "389:16-389:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_PostfixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PostfixExpression
			:type PostfixExpresssionOperatorKind
			:location "394:16-394:68"
		) ( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PostfixExpression
			:type JavaAbstractSyntax_Expression
			:location "393:16-393:57"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_PrefixExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "operator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PrefixExpression
			:type PrefixExpresssionOperatorKind
			:location "408:16-408:67"
		) ( struct-map
			KM3_Reference
			:name "operand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PrefixExpression
			:type JavaAbstractSyntax_Expression
			:location "407:16-407:57"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_StringLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "escapedValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_StringLiteral
			:type String
			:location "433:16-433:48"
		) ( struct-map
			KM3_Attribute
			:name "literalValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_StringLiteral
			:type String
			:location "434:16-434:48"
		)]
	) ) ( def JavaAbstractSyntax_SuperFieldAccess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SuperFieldAccess
			:type JavaAbstractSyntax_SimpleName
			:location "438:16-438:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SuperFieldAccess
			:type JavaAbstractSyntax_Name
			:location "439:16-439:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SuperMethodInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SuperMethodInvocation
			:type JavaAbstractSyntax_Expression
			:location "443:16-443:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SuperMethodInvocation
			:type JavaAbstractSyntax_Name
			:location "444:16-444:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SuperMethodInvocation
			:type JavaAbstractSyntax_Name
			:location "445:16-445:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SuperMethodInvocation
			:type JavaAbstractSyntax_Type
			:location "446:16-446:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ThisExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ThisExpression
			:type JavaAbstractSyntax_Name
			:location "450:16-450:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_TypeLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TypeLiteral
			:type JavaAbstractSyntax_Type
			:location "454:16-454:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_VariableDeclarationExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_VariableDeclarationExpression
			:type JavaAbstractSyntax_VariableDeclarationFragment
			:location "458:16-458:87"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "modifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_VariableDeclarationExpression
			:type JavaAbstractSyntax_ExtendedModifier
			:location "459:16-459:76"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_VariableDeclarationExpression
			:type JavaAbstractSyntax_Type
			:location "460:16-460:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_AssertStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AssertStatement
			:type JavaAbstractSyntax_Expression
			:location "464:16-464:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_AssertStatement
			:type JavaAbstractSyntax_Expression
			:location "465:16-465:57"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_Block
			:type JavaAbstractSyntax_Statement
			:location "469:16-469:70"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_BreakStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_BreakStatement
			:type JavaAbstractSyntax_SimpleName
			:location "473:16-473:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ConstructorInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ConstructorInvocation
			:type JavaAbstractSyntax_Expression
			:location "477:16-477:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ConstructorInvocation
			:type JavaAbstractSyntax_Type
			:location "478:16-478:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ContinueStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ContinueStatement
			:type JavaAbstractSyntax_SimpleName
			:location "482:16-482:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_DoStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_DoStatement
			:type JavaAbstractSyntax_Statement
			:location "486:16-486:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_DoStatement
			:type JavaAbstractSyntax_Expression
			:location "487:16-487:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_EmptyStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_EnhancedForStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_EnhancedForStatement
			:type JavaAbstractSyntax_Statement
			:location "495:16-495:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_EnhancedForStatement
			:type JavaAbstractSyntax_Expression
			:location "496:16-496:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_EnhancedForStatement
			:type JavaAbstractSyntax_SingleVariableDeclaration
			:location "497:16-497:74"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ExpressionStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ExpressionStatement
			:type JavaAbstractSyntax_Expression
			:location "501:16-501:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ForStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ForStatement
			:type JavaAbstractSyntax_Statement
			:location "505:16-505:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ForStatement
			:type JavaAbstractSyntax_Expression
			:location "506:16-506:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "initializers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ForStatement
			:type JavaAbstractSyntax_Expression
			:location "507:16-507:73"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "updaters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ForStatement
			:type JavaAbstractSyntax_Expression
			:location "508:16-508:69"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_IfStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elseStatement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_IfStatement
			:type JavaAbstractSyntax_Statement
			:location "512:16-512:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_IfStatement
			:type JavaAbstractSyntax_Expression
			:location "513:16-513:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenStatement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_IfStatement
			:type JavaAbstractSyntax_Statement
			:location "514:16-514:62"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_LabeledStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_LabeledStatement
			:type JavaAbstractSyntax_Statement
			:location "518:16-518:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_LabeledStatement
			:type JavaAbstractSyntax_SimpleName
			:location "519:16-519:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ReturnStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ReturnStatement
			:type JavaAbstractSyntax_Expression
			:location "523:16-523:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SuperConstructorInvocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SuperConstructorInvocation
			:type JavaAbstractSyntax_Expression
			:location "527:16-527:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SuperConstructorInvocation
			:type JavaAbstractSyntax_Expression
			:location "528:16-528:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SuperConstructorInvocation
			:type JavaAbstractSyntax_Type
			:location "529:16-529:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SwitchCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "default"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SwitchCase
			:type Boolean
			:location "534:16-534:44"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SwitchCase
			:type JavaAbstractSyntax_Expression
			:location "533:16-533:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SwitchStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SwitchStatement
			:type JavaAbstractSyntax_Expression
			:location "538:16-538:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SwitchStatement
			:type JavaAbstractSyntax_Statement
			:location "539:16-539:70"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SynchronizedStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SynchronizedStatement
			:type JavaAbstractSyntax_Block
			:location "543:16-543:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SynchronizedStatement
			:type JavaAbstractSyntax_Expression
			:location "544:16-544:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ThrowStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ThrowStatement
			:type JavaAbstractSyntax_Expression
			:location "548:16-548:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_TryStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "catchClauses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_TryStatement
			:type JavaAbstractSyntax_CatchClause
			:location "552:16-552:74"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TryStatement
			:type JavaAbstractSyntax_Block
			:location "553:16-553:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "finally"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TryStatement
			:type JavaAbstractSyntax_Block
			:location "554:16-554:52"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_TypeDeclarationStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_TypeDeclarationStatement
			:type JavaAbstractSyntax_AbstractTypeDeclaration
			:location "558:16-558:74"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_VariableDeclarationStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fragments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_VariableDeclarationStatement
			:type JavaAbstractSyntax_VariableDeclarationFragment
			:location "562:16-562:87"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "modifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_VariableDeclarationStatement
			:type JavaAbstractSyntax_ExtendedModifier
			:location "563:16-563:76"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_VariableDeclarationStatement
			:type JavaAbstractSyntax_Type
			:location "564:16-564:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_WhileStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_WhileStatement
			:type JavaAbstractSyntax_Statement
			:location "568:16-568:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_WhileStatement
			:type JavaAbstractSyntax_Expression
			:location "569:16-569:60"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ArrayType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dimensions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayType
			:type Integer
			:location "574:16-574:47"
		) ( struct-map
			KM3_Reference
			:name "componentType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayType
			:type JavaAbstractSyntax_Type
			:location "573:16-573:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elementType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ArrayType
			:type JavaAbstractSyntax_Type
			:location "575:16-575:55"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_ParameterizedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_ParameterizedType
			:type JavaAbstractSyntax_Type
			:location "579:16-579:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeArguments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_ParameterizedType
			:type JavaAbstractSyntax_Type
			:location "580:16-580:68"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "code"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_PrimitiveType
			:type String
			:location "584:16-584:40"
		)]
	) ) ( def JavaAbstractSyntax_QualifiedType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_QualifiedType
			:type JavaAbstractSyntax_SimpleName
			:location "588:16-588:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_QualifiedType
			:type JavaAbstractSyntax_Type
			:location "589:16-589:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SimpleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SimpleType
			:type JavaAbstractSyntax_Name
			:location "593:16-593:48"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_WildcardType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "upperBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_WildcardType
			:type Boolean
			:location "598:16-598:47"
		) ( struct-map
			KM3_Reference
			:name "bound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_WildcardType
			:type JavaAbstractSyntax_Type
			:location "597:16-597:49"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SingleVariableDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_VariableDeclaration]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "varargs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SingleVariableDeclaration
			:type Boolean
			:location "603:16-603:44"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SingleVariableDeclaration
			:type JavaAbstractSyntax_Type
			:location "602:16-602:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "modifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_SingleVariableDeclaration
			:type JavaAbstractSyntax_ExtendedModifier
			:location "604:16-604:76"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_VariableDeclarationFragment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_VariableDeclaration]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_QualifiedName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Name]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_QualifiedName
			:type JavaAbstractSyntax_SimpleName
			:location "612:16-612:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_QualifiedName
			:type JavaAbstractSyntax_Name
			:location "613:16-613:53"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SimpleName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Name]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SimpleName
			:type String
			:location "617:16-617:46"
		) ( struct-map
			KM3_Attribute
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SimpleName
			:type Boolean
			:location "618:16-618:48"
		)]
	) ) ( def JavaAbstractSyntax_MarkerAnnotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Annotation]
		:structuralFeatures[]
	) ) ( def JavaAbstractSyntax_NormalAnnotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Annotation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered true
			:owner JavaAbstractSyntax_NormalAnnotation
			:type JavaAbstractSyntax_MemberValuePair
			:location "626:16-626:72"
			:isContainer true
		)]
	) ) ( def JavaAbstractSyntax_SingleMemberAnnotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JavaAbstractSyntax_Annotation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JavaAbstractSyntax_SingleMemberAnnotation
			:type JavaAbstractSyntax_Expression
			:location "630:16-630:55"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "635:8-635:24"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "636:8-636:25"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "637:8-637:25"
	) ) ( def ptyp_Character ( struct-map
		KM3_DataType
		:name "Character"
		:location "638:8-638:27"
	) )]
) )
