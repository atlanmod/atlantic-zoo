Namespace ATL

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Unit "
		Interface Unit : Inherits LocatedElement
			''' <summary>
			''' libraries oppositeOf unit / container
			''' </summary>
			Property libraries As List(Of [[LibraryRef]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface Library "
		Interface Library : Inherits Unit
			''' <summary>
			''' helpers oppositeOf library / container
			''' </summary>
			Property helpers As List(Of [[Helper]]
		End Interface
	#End Region

	#Region " Interface Query "
		Interface Query : Inherits Unit
			''' <summary>
			''' Container
			''' </summary>
			Property body As [[OclExpression]]

			''' <summary>
			''' helpers oppositeOf query / container
			''' </summary>
			Property helpers As List(Of [[Helper]]
		End Interface
	#End Region

	#Region " Interface [Module] "
		Interface [Module] : Inherits Unit
			Property isRefining As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property inModels As List(Of [[OclModel]]

			''' <summary>
			''' Container
			''' </summary>
			Property outModels As List(Of [[OclModel]]

			''' <summary>
			''' elements oppositeOf module / container
			''' </summary>
			Property elements As List(Of [[ModuleElement]]
		End Interface
	#End Region

	#Region " Interface ModuleElement "
		Interface ModuleElement : Inherits LocatedElement
			''' <summary>
			''' module oppositeOf elements
			''' </summary>
			Property [module] As [[Module]]
		End Interface
	#End Region

	#Region " Interface Helper "
		Interface Helper : Inherits ModuleElement
			''' <summary>
			''' query oppositeOf helpers
			''' </summary>
			Property query As [[Query]]

			''' <summary>
			''' library oppositeOf helpers
			''' </summary>
			Property library As [[Library]]

			''' <summary>
			''' Container
			''' </summary>
			Property definition As [[OclFeatureDefinition]]
		End Interface
	#End Region

	#Region " Interface Rule "
		Interface Rule : Inherits ModuleElement
			''' <summary>
			''' outPattern oppositeOf rule / container
			''' </summary>
			Property outPattern As [[OutPattern]]

			''' <summary>
			''' actionBlock oppositeOf rule / container
			''' </summary>
			Property actionBlock As [[ActionBlock]]

			''' <summary>
			''' variables oppositeOf rule / container
			''' </summary>
			Property variables As List(Of [[RuleVariableDeclaration]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface MatchedRule "
		Interface MatchedRule : Inherits Rule
			''' <summary>
			''' inPattern oppositeOf rule / container
			''' </summary>
			Property inPattern As [[InPattern]]

			''' <summary>
			''' children oppositeOf superRule
			''' </summary>
			Property children As List(Of [[MatchedRule]]

			''' <summary>
			''' superRule oppositeOf children
			''' </summary>
			Property superRule As [[MatchedRule]]

			Property isAbstract As [Boolean]

			Property isRefining As [Boolean]

			Property isNoDefault As [Boolean]
		End Interface
	#End Region

	#Region " Interface LazyMatchedRule "
		Interface LazyMatchedRule : Inherits MatchedRule
			Property isUnique As [Boolean]
		End Interface
	#End Region

	#Region " Interface CalledRule "
		Interface CalledRule : Inherits Rule
			''' <summary>
			''' Container
			''' </summary>
			Property parameters As List(Of [[Parameter]]

			Property isEntrypoint As [Boolean]

			Property isEndpoint As [Boolean]
		End Interface
	#End Region

	#Region " Interface InPattern "
		Interface InPattern : Inherits LocatedElement
			''' <summary>
			''' elements oppositeOf inPattern / container
			''' </summary>
			Property elements As List(Of [[InPatternElement]]

			''' <summary>
			''' rule oppositeOf inPattern
			''' </summary>
			Property rule As [[MatchedRule]]

			''' <summary>
			''' Container
			''' </summary>
			Property filter As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface OutPattern "
		Interface OutPattern : Inherits LocatedElement
			''' <summary>
			''' rule oppositeOf outPattern
			''' </summary>
			Property rule As [[Rule]]

			''' <summary>
			''' elements oppositeOf outPattern / container
			''' </summary>
			Property elements As List(Of [[OutPatternElement]]
		End Interface
	#End Region

	#Region " Interface PatternElement "
		Interface PatternElement : Inherits VariableDeclaration
			
		End Interface
	#End Region

	#Region " Interface InPatternElement "
		Interface InPatternElement : Inherits PatternElement
			''' <summary>
			''' mapsTo oppositeOf sourceElement
			''' </summary>
			Property mapsTo As [[OutPatternElement]]

			''' <summary>
			''' inPattern oppositeOf elements
			''' </summary>
			Property inPattern As [[InPattern]]

			Property models As List(Of [[OclModel]]
		End Interface
	#End Region

	#Region " Interface SimpleInPatternElement "
		Interface SimpleInPatternElement : Inherits InPatternElement
			
		End Interface
	#End Region

	#Region " Interface OutPatternElement "
		Interface OutPatternElement : Inherits PatternElement
			''' <summary>
			''' outPattern oppositeOf elements
			''' </summary>
			Property outPattern As [[OutPattern]]

			''' <summary>
			''' sourceElement oppositeOf mapsTo
			''' </summary>
			Property sourceElement As [[InPatternElement]]

			''' <summary>
			''' bindings oppositeOf outPatternElement / container
			''' </summary>
			Property bindings As List(Of [[Binding]]

			Property model As [[OclModel]]
		End Interface
	#End Region

	#Region " Interface SimpleOutPatternElement "
		Interface SimpleOutPatternElement : Inherits OutPatternElement
			''' <summary>
			''' Container
			''' </summary>
			Property reverseBindings As List(Of [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface ForEachOutPatternElement "
		Interface ForEachOutPatternElement : Inherits OutPatternElement
			''' <summary>
			''' Container
			''' </summary>
			Property collection As [[OclExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property iterator As [[Iterator]]
		End Interface
	#End Region

	#Region " Interface Binding "
		Interface Binding : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property value As [[OclExpression]]

			''' <summary>
			''' outPatternElement oppositeOf bindings
			''' </summary>
			Property outPatternElement As [[OutPatternElement]]

			Property propertyName As [String]

			Property isAssignment As [Boolean]
		End Interface
	#End Region

	#Region " Interface RuleVariableDeclaration "
		Interface RuleVariableDeclaration : Inherits VariableDeclaration
			''' <summary>
			''' rule oppositeOf variables
			''' </summary>
			Property rule As [[Rule]]
		End Interface
	#End Region

	#Region " Interface LibraryRef "
		Interface LibraryRef : Inherits LocatedElement
			''' <summary>
			''' unit oppositeOf libraries
			''' </summary>
			Property unit As [[Unit]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface ActionBlock "
		Interface ActionBlock : Inherits LocatedElement
			''' <summary>
			''' rule oppositeOf actionBlock
			''' </summary>
			Property rule As [[Rule]]

			''' <summary>
			''' Container
			''' </summary>
			Property statements As List(Of [[Statement]]
		End Interface
	#End Region

	#Region " Interface Statement "
		Interface Statement : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface ExpressionStat "
		Interface ExpressionStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property expression As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface BindingStat "
		Interface BindingStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property source As [[OclExpression]]

			Property propertyName As [String]

			Property isAssignment As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property value As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface IfStat "
		Interface IfStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property condition As [[OclExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property thenStatements As List(Of [[Statement]]

			''' <summary>
			''' Container
			''' </summary>
			Property elseStatements As List(Of [[Statement]]
		End Interface
	#End Region

	#Region " Interface ForStat "
		Interface ForStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property iterator As [[Iterator]]

			''' <summary>
			''' Container
			''' </summary>
			Property collection As [[OclExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property statements As List(Of [[Statement]]
		End Interface
	#End Region
End Namespace
Namespace OCL

	#Region " Interface OclExpression "
		Interface OclExpression : Inherits LocatedElement
			''' <summary>
			''' type oppositeOf oclExpression / container
			''' </summary>
			Property type As [[OclType]]

			''' <summary>
			''' ifExp3 oppositeOf elseExpression
			''' </summary>
			Property ifExp3 As [[IfExp]]

			''' <summary>
			''' appliedProperty oppositeOf source
			''' </summary>
			Property appliedProperty As [[PropertyCallExp]]

			''' <summary>
			''' collection oppositeOf elements
			''' </summary>
			Property collection As [[CollectionExp]]

			''' <summary>
			''' letExp oppositeOf in_
			''' </summary>
			Property letExp As [[LetExp]]

			''' <summary>
			''' loopExp oppositeOf body
			''' </summary>
			Property loopExp As [[LoopExp]]

			''' <summary>
			''' parentOperation oppositeOf arguments
			''' </summary>
			Property parentOperation As [[OperationCallExp]]

			''' <summary>
			''' initializedVariable oppositeOf initExpression
			''' </summary>
			Property initializedVariable As [[VariableDeclaration]]

			''' <summary>
			''' ifExp2 oppositeOf thenExpression
			''' </summary>
			Property ifExp2 As [[IfExp]]

			''' <summary>
			''' owningOperation oppositeOf body
			''' </summary>
			Property owningOperation As [[Operation]]

			''' <summary>
			''' ifExp1 oppositeOf condition
			''' </summary>
			Property ifExp1 As [[IfExp]]

			''' <summary>
			''' owningAttribute oppositeOf initExpression
			''' </summary>
			Property owningAttribute As [[Attribute]]
		End Interface
	#End Region

	#Region " Interface VariableExp "
		Interface VariableExp : Inherits OclExpression
			''' <summary>
			''' referredVariable oppositeOf variableExp
			''' </summary>
			Property referredVariable As [[VariableDeclaration]]
		End Interface
	#End Region

	#Region " Interface SuperExp "
		Interface SuperExp : Inherits OclExpression
			
		End Interface
	#End Region

	#Region " Interface PrimitiveExp "
		Interface PrimitiveExp : Inherits OclExpression
			
		End Interface
	#End Region

	#Region " Interface StringExp "
		Interface StringExp : Inherits PrimitiveExp
			Property stringSymbol As [String]
		End Interface
	#End Region

	#Region " Interface BooleanExp "
		Interface BooleanExp : Inherits PrimitiveExp
			Property booleanSymbol As [Boolean]
		End Interface
	#End Region

	#Region " Interface NumericExp "
		Interface NumericExp : Inherits PrimitiveExp
			
		End Interface
	#End Region

	#Region " Interface RealExp "
		Interface RealExp : Inherits NumericExp
			Property realSymbol As Double
		End Interface
	#End Region

	#Region " Interface IntegerExp "
		Interface IntegerExp : Inherits NumericExp
			Property integerSymbol As [Integer]
		End Interface
	#End Region

	#Region " Interface CollectionExp "
		Interface CollectionExp : Inherits OclExpression
			''' <summary>
			''' elements oppositeOf collection / container
			''' </summary>
			Property elements As List(Of [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface BagExp "
		Interface BagExp : Inherits CollectionExp
			
		End Interface
	#End Region

	#Region " Interface OrderedSetExp "
		Interface OrderedSetExp : Inherits CollectionExp
			
		End Interface
	#End Region

	#Region " Interface SequenceExp "
		Interface SequenceExp : Inherits CollectionExp
			
		End Interface
	#End Region

	#Region " Interface SetExp "
		Interface SetExp : Inherits CollectionExp
			
		End Interface
	#End Region

	#Region " Interface TupleExp "
		Interface TupleExp : Inherits OclExpression
			''' <summary>
			''' tuplePart oppositeOf tuple / container
			''' </summary>
			Property tuplePart As List(Of [[TuplePart]]
		End Interface
	#End Region

	#Region " Interface TuplePart "
		Interface TuplePart : Inherits VariableDeclaration
			''' <summary>
			''' tuple oppositeOf tuplePart
			''' </summary>
			Property tuple As [[TupleExp]]
		End Interface
	#End Region

	#Region " Interface MapExp "
		Interface MapExp : Inherits OclExpression
			''' <summary>
			''' elements oppositeOf map / container
			''' </summary>
			Property elements As List(Of [[MapElement]]
		End Interface
	#End Region

	#Region " Interface MapElement "
		Interface MapElement : Inherits LocatedElement
			''' <summary>
			''' map oppositeOf elements
			''' </summary>
			Property map As [[MapExp]]

			''' <summary>
			''' Container
			''' </summary>
			Property key As [[OclExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property value As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface EnumLiteralExp "
		Interface EnumLiteralExp : Inherits OclExpression
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface OclUndefinedExp "
		Interface OclUndefinedExp : Inherits OclExpression
			
		End Interface
	#End Region

	#Region " Interface PropertyCallExp "
		Interface PropertyCallExp : Inherits OclExpression
			''' <summary>
			''' source oppositeOf appliedProperty / container
			''' </summary>
			Property source As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface NavigationOrAttributeCallExp "
		Interface NavigationOrAttributeCallExp : Inherits PropertyCallExp
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface OperationCallExp "
		Interface OperationCallExp : Inherits PropertyCallExp
			''' <summary>
			''' arguments oppositeOf parentOperation / container
			''' </summary>
			Property arguments As List(Of [[OclExpression]]

			Property operationName As [String]
		End Interface
	#End Region

	#Region " Interface OperatorCallExp "
		Interface OperatorCallExp : Inherits OperationCallExp
			
		End Interface
	#End Region

	#Region " Interface CollectionOperationCallExp "
		Interface CollectionOperationCallExp : Inherits OperationCallExp
			
		End Interface
	#End Region

	#Region " Interface LoopExp "
		Interface LoopExp : Inherits PropertyCallExp
			''' <summary>
			''' body oppositeOf loopExp / container
			''' </summary>
			Property body As [[OclExpression]]

			''' <summary>
			''' iterators oppositeOf loopExpr / container
			''' </summary>
			Property iterators As List(Of [[Iterator]]
		End Interface
	#End Region

	#Region " Interface IterateExp "
		Interface IterateExp : Inherits LoopExp
			''' <summary>
			''' result oppositeOf baseExp / container
			''' </summary>
			Property result As [[VariableDeclaration]]
		End Interface
	#End Region

	#Region " Interface IteratorExp "
		Interface IteratorExp : Inherits LoopExp
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface LetExp "
		Interface LetExp : Inherits OclExpression
			''' <summary>
			''' variable oppositeOf letExp / container
			''' </summary>
			Property variable As [[VariableDeclaration]]

			''' <summary>
			''' in_ oppositeOf letExp / container
			''' </summary>
			Property in_ As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface IfExp "
		Interface IfExp : Inherits OclExpression
			''' <summary>
			''' thenExpression oppositeOf ifExp2 / container
			''' </summary>
			Property thenExpression As [[OclExpression]]

			''' <summary>
			''' condition oppositeOf ifExp1 / container
			''' </summary>
			Property condition As [[OclExpression]]

			''' <summary>
			''' elseExpression oppositeOf ifExp3 / container
			''' </summary>
			Property elseExpression As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface VariableDeclaration "
		Interface VariableDeclaration : Inherits LocatedElement
			Property id As [String]

			Property varName As [String]

			''' <summary>
			''' type oppositeOf variableDeclaration / container
			''' </summary>
			Property type As [[OclType]]

			''' <summary>
			''' initExpression oppositeOf initializedVariable / container
			''' </summary>
			Property initExpression As [[OclExpression]]

			''' <summary>
			''' letExp oppositeOf variable
			''' </summary>
			Property letExp As [[LetExp]]

			''' <summary>
			''' baseExp oppositeOf result
			''' </summary>
			Property baseExp As [[IterateExp]]

			''' <summary>
			''' variableExp oppositeOf referredVariable
			''' </summary>
			Property variableExp As List(Of [[VariableExp]]
		End Interface
	#End Region

	#Region " Interface Iterator "
		Interface Iterator : Inherits VariableDeclaration
			''' <summary>
			''' loopExpr oppositeOf iterators
			''' </summary>
			Property loopExpr As [[LoopExp]]
		End Interface
	#End Region

	#Region " Interface Parameter "
		Interface Parameter : Inherits VariableDeclaration
			''' <summary>
			''' operation oppositeOf parameters
			''' </summary>
			Property operation As [[Operation]]
		End Interface
	#End Region

	#Region " Interface CollectionType "
		Interface CollectionType : Inherits OclType
			''' <summary>
			''' elementType oppositeOf collectionTypes / container
			''' </summary>
			Property elementType As [[OclType]]
		End Interface
	#End Region

	#Region " Interface OclType "
		Interface OclType : Inherits OclExpression
			Property name As [String]

			''' <summary>
			''' definitions oppositeOf context_
			''' </summary>
			Property definitions As [[OclContextDefinition]]

			''' <summary>
			''' oclExpression oppositeOf type
			''' </summary>
			Property oclExpression As [[OclExpression]]

			''' <summary>
			''' operation oppositeOf returnType
			''' </summary>
			Property operation As [[Operation]]

			''' <summary>
			''' mapType2 oppositeOf valueType
			''' </summary>
			Property mapType2 As [[MapType]]

			''' <summary>
			''' attribute oppositeOf type
			''' </summary>
			Property attribute As [[Attribute]]

			''' <summary>
			''' mapType oppositeOf keyType
			''' </summary>
			Property mapType As [[MapType]]

			''' <summary>
			''' collectionTypes oppositeOf elementType
			''' </summary>
			Property collectionTypes As [[CollectionType]]

			''' <summary>
			''' tupleTypeAttribute oppositeOf type
			''' </summary>
			Property tupleTypeAttribute As [[TupleTypeAttribute]]

			''' <summary>
			''' variableDeclaration oppositeOf type
			''' </summary>
			Property variableDeclaration As [[VariableDeclaration]]
		End Interface
	#End Region

	#Region " Interface Primitive "
		Interface Primitive : Inherits OclType
			
		End Interface
	#End Region

	#Region " Interface StringType "
		Interface StringType : Inherits Primitive
			
		End Interface
	#End Region

	#Region " Interface BooleanType "
		Interface BooleanType : Inherits Primitive
			
		End Interface
	#End Region

	#Region " Interface NumericType "
		Interface NumericType : Inherits Primitive
			
		End Interface
	#End Region

	#Region " Interface IntegerType "
		Interface IntegerType : Inherits NumericType
			
		End Interface
	#End Region

	#Region " Interface RealType "
		Interface RealType : Inherits NumericType
			
		End Interface
	#End Region

	#Region " Interface BagType "
		Interface BagType : Inherits CollectionType
			
		End Interface
	#End Region

	#Region " Interface OrderedSetType "
		Interface OrderedSetType : Inherits CollectionType
			
		End Interface
	#End Region

	#Region " Interface SequenceType "
		Interface SequenceType : Inherits CollectionType
			
		End Interface
	#End Region

	#Region " Interface SetType "
		Interface SetType : Inherits CollectionType
			
		End Interface
	#End Region

	#Region " Interface OclAnyType "
		Interface OclAnyType : Inherits OclType
			
		End Interface
	#End Region

	#Region " Interface TupleType "
		Interface TupleType : Inherits OclType
			''' <summary>
			''' attributes oppositeOf tupleType / container
			''' </summary>
			Property attributes As List(Of [[TupleTypeAttribute]]
		End Interface
	#End Region

	#Region " Interface TupleTypeAttribute "
		Interface TupleTypeAttribute : Inherits LocatedElement
			''' <summary>
			''' type oppositeOf tupleTypeAttribute / container
			''' </summary>
			Property type As [[OclType]]

			''' <summary>
			''' tupleType oppositeOf attributes
			''' </summary>
			Property tupleType As [[TupleType]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface OclModelElement "
		Interface OclModelElement : Inherits OclType
			''' <summary>
			''' model oppositeOf elements
			''' </summary>
			Property model As [[OclModel]]
		End Interface
	#End Region

	#Region " Interface MapType "
		Interface MapType : Inherits OclType
			''' <summary>
			''' valueType oppositeOf mapType2 / container
			''' </summary>
			Property valueType As [[OclType]]

			''' <summary>
			''' keyType oppositeOf mapType / container
			''' </summary>
			Property keyType As [[OclType]]
		End Interface
	#End Region

	#Region " Interface OclFeatureDefinition "
		Interface OclFeatureDefinition : Inherits LocatedElement
			''' <summary>
			''' feature oppositeOf definition / container
			''' </summary>
			Property feature As [[OclFeature]]

			''' <summary>
			''' context_ oppositeOf definition / container
			''' </summary>
			Property context_ As [[OclContextDefinition]]
		End Interface
	#End Region

	#Region " Interface OclContextDefinition "
		Interface OclContextDefinition : Inherits LocatedElement
			''' <summary>
			''' definition oppositeOf context_
			''' </summary>
			Property definition As [[OclFeatureDefinition]]

			''' <summary>
			''' context_ oppositeOf definitions / container
			''' </summary>
			Property context_ As [[OclType]]
		End Interface
	#End Region

	#Region " Interface OclFeature "
		Interface OclFeature : Inherits LocatedElement
			''' <summary>
			''' definition oppositeOf feature
			''' </summary>
			Property definition As [[OclFeatureDefinition]]
		End Interface
	#End Region

	#Region " Interface Attribute "
		Interface Attribute : Inherits OclFeature
			Property name As [String]

			''' <summary>
			''' initExpression oppositeOf owningAttribute / container
			''' </summary>
			Property initExpression As [[OclExpression]]

			''' <summary>
			''' type oppositeOf attribute / container
			''' </summary>
			Property type As [[OclType]]
		End Interface
	#End Region

	#Region " Interface Operation "
		Interface Operation : Inherits OclFeature
			Property name As [String]

			''' <summary>
			''' parameters oppositeOf operation / container
			''' </summary>
			Property parameters As List(Of [[Parameter]]

			''' <summary>
			''' returnType oppositeOf operation / container
			''' </summary>
			Property returnType As [[OclType]]

			''' <summary>
			''' body oppositeOf owningOperation / container
			''' </summary>
			Property body As [[OclExpression]]
		End Interface
	#End Region

	#Region " Interface OclModel "
		Interface OclModel : Inherits LocatedElement
			Property name As [String]

			''' <summary>
			''' metamodel oppositeOf model
			''' </summary>
			Property metamodel As [[OclModel]]

			''' <summary>
			''' elements oppositeOf model
			''' </summary>
			Property elements As List(Of [[OclModelElement]]

			''' <summary>
			''' model oppositeOf metamodel
			''' </summary>
			Property model As List(Of [[OclModel]]
		End Interface
	#End Region
End Namespace
