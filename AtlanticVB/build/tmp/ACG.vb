Namespace ACG

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface ACG "
		Interface ACG : Inherits LocatedElement
			Property metamodel As [String]

			Property startsWith As [String]

			''' <summary>
			''' elements oppositeOf acg / container
			''' </summary>
			Property elements As List(Of [[ACGElement]]
		End Interface
	#End Region

	#Region " Interface ACGElement "
		Interface ACGElement : Inherits LocatedElement
			''' <summary>
			''' acg oppositeOf elements
			''' </summary>
			Property acg As [[ACG]]
		End Interface
	#End Region

	#Region " Interface [Function] "
		Interface [Function] : Inherits ACGElement
			Property context As [String]

			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property parameters As List(Of [[Parameter]]

			''' <summary>
			''' Container
			''' </summary>
			Property body As [[Expression]]
		End Interface
	#End Region

	#Region " Interface Attribute "
		Interface Attribute : Inherits ACGElement
			Property context As [String]

			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property body As [[Expression]]
		End Interface
	#End Region

	#Region " Interface Parameter "
		Interface Parameter : Inherits VariableDecl
			
		End Interface
	#End Region

	#Region " Interface Node "
		Interface Node : Inherits ACGElement, StatementBlock
			Property element As [String]

			Property mode As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property guard As [[Expression]]
		End Interface
	#End Region

	#Region " Interface ASMNode "
		Interface ASMNode : Inherits Node
			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Expression]]
		End Interface
	#End Region

	#Region " Interface CodeNode "
		Interface CodeNode : Inherits Node
			
		End Interface
	#End Region

	#Region " Interface SimpleNode "
		Interface SimpleNode : Inherits Node
			
		End Interface
	#End Region

	#Region " Interface StatementBlock "
		Interface StatementBlock : Inherits LocatedElement
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

	#Region " Interface CompoundStat "
		Interface CompoundStat : Inherits Statement, StatementBlock
			
		End Interface
	#End Region

	#Region " Interface ForEachStat "
		Interface ForEachStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property iterator As [[VariableDecl]]

			''' <summary>
			''' Container
			''' </summary>
			Property collection As [[Expression]]
		End Interface
	#End Region

	#Region " Interface OnceStat "
		Interface OnceStat : Inherits CompoundStat
			
		End Interface
	#End Region

	#Region " Interface VariableStat "
		Interface VariableStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property definition As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Expression]]
		End Interface
	#End Region

	#Region " Interface OperationStat "
		Interface OperationStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property context As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Expression]]
		End Interface
	#End Region

	#Region " Interface ConditionalStat "
		Interface ConditionalStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property condition As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property elseStatements As List(Of [[Statement]]
		End Interface
	#End Region

	#Region " Interface LetStat "
		Interface LetStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property variable As [[VariableDecl]]

			''' <summary>
			''' Container
			''' </summary>
			Property value As [[Expression]]
		End Interface
	#End Region

	#Region " Interface AnalyzeStat "
		Interface AnalyzeStat : Inherits CompoundStat
			''' <summary>
			''' Container
			''' </summary>
			Property target As [[Expression]]

			Property mode As [String]
		End Interface
	#End Region

	#Region " Interface ReportStat "
		Interface ReportStat : Inherits Statement
			Property severity As [[Severity]]

			''' <summary>
			''' Container
			''' </summary>
			Property message As [[Expression]]
		End Interface
	#End Region

	#Region " Interface FieldStat "
		Interface FieldStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property type As [[Expression]]
		End Interface
	#End Region

	#Region " Interface ParamStat "
		Interface ParamStat : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property type As [[Expression]]
		End Interface
	#End Region

	#Region " Interface EmitStat "
		Interface EmitStat : Inherits Statement
			
		End Interface
	#End Region

	#Region " Interface LabelStat "
		Interface LabelStat : Inherits EmitStat
			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property id As [[Expression]]
		End Interface
	#End Region

	#Region " Interface NewStat "
		Interface NewStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface DupStat "
		Interface DupStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface DupX1Stat "
		Interface DupX1Stat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface PopStat "
		Interface PopStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface SwapStat "
		Interface SwapStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface IterateStat "
		Interface IterateStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface EndIterateStat "
		Interface EndIterateStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface GetAsmStat "
		Interface GetAsmStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface FindMEStat "
		Interface FindMEStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface PushTStat "
		Interface PushTStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface PushFStat "
		Interface PushFStat : Inherits EmitStat
			
		End Interface
	#End Region

	#Region " Interface EmitWithOperandStat "
		Interface EmitWithOperandStat : Inherits EmitStat
			''' <summary>
			''' Container
			''' </summary>
			Property operand As [[Expression]]
		End Interface
	#End Region

	#Region " Interface PushStat "
		Interface PushStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface PushIStat "
		Interface PushIStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface PushDStat "
		Interface PushDStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface LoadStat "
		Interface LoadStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface StoreStat "
		Interface StoreStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface CallStat "
		Interface CallStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface PCallStat "
		Interface PCallStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface SuperCallStat "
		Interface SuperCallStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface GetStat "
		Interface GetStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface SetStat "
		Interface SetStat : Inherits EmitWithOperandStat
			
		End Interface
	#End Region

	#Region " Interface EmitWithLabelRefStat "
		Interface EmitWithLabelRefStat : Inherits EmitStat
			Property label As [[LabelStat]]
		End Interface
	#End Region

	#Region " Interface IfStat "
		Interface IfStat : Inherits EmitWithLabelRefStat
			
		End Interface
	#End Region

	#Region " Interface GotoStat "
		Interface GotoStat : Inherits EmitWithLabelRefStat
			
		End Interface
	#End Region

	#Region " Interface VariableDecl "
		Interface VariableDecl : Inherits LocatedElement
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface Expression "
		Interface Expression : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface VariableExp "
		Interface VariableExp : Inherits Expression
			Property variable As [[VariableDecl]]
		End Interface
	#End Region

	#Region " Interface SelfExp "
		Interface SelfExp : Inherits Expression
			
		End Interface
	#End Region

	#Region " Interface LastExp "
		Interface LastExp : Inherits Expression
			
		End Interface
	#End Region

	#Region " Interface IfExp "
		Interface IfExp : Inherits Expression
			''' <summary>
			''' Container
			''' </summary>
			Property condition As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property thenExp As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property elseExp As [[Expression]]
		End Interface
	#End Region

	#Region " Interface IsAExp "
		Interface IsAExp : Inherits Expression
			''' <summary>
			''' Container
			''' </summary>
			Property source As [[Expression]]

			Property type As [String]
		End Interface
	#End Region

	#Region " Interface LetExp "
		Interface LetExp : Inherits Expression
			''' <summary>
			''' Container
			''' </summary>
			Property variable As [[VariableDecl]]

			''' <summary>
			''' Container
			''' </summary>
			Property value As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property in As [[Expression]]
		End Interface
	#End Region

	#Region " Interface PropertyCallExp "
		Interface PropertyCallExp : Inherits Expression
			''' <summary>
			''' Container
			''' </summary>
			Property source As [[Expression]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface NavigationExp "
		Interface NavigationExp : Inherits PropertyCallExp
			
		End Interface
	#End Region

	#Region " Interface IteratorExp "
		Interface IteratorExp : Inherits PropertyCallExp
			''' <summary>
			''' Container
			''' </summary>
			Property iterator As [[VariableDecl]]

			''' <summary>
			''' Container
			''' </summary>
			Property body As [[Expression]]
		End Interface
	#End Region

	#Region " Interface OperationCallExp "
		Interface OperationCallExp : Inherits PropertyCallExp
			''' <summary>
			''' Container
			''' </summary>
			Property arguments As List(Of [[Expression]]
		End Interface
	#End Region

	#Region " Interface OperatorCallExp "
		Interface OperatorCallExp : Inherits OperationCallExp
			
		End Interface
	#End Region

	#Region " Interface LiteralExp "
		Interface LiteralExp : Inherits Expression
			
		End Interface
	#End Region

	#Region " Interface OclUndefinedExp "
		Interface OclUndefinedExp : Inherits LiteralExp
			
		End Interface
	#End Region

	#Region " Interface CollectionExp "
		Interface CollectionExp : Inherits LiteralExp
			''' <summary>
			''' Container
			''' </summary>
			Property elements As List(Of [[Expression]]
		End Interface
	#End Region

	#Region " Interface SequenceExp "
		Interface SequenceExp : Inherits CollectionExp
			
		End Interface
	#End Region

	#Region " Interface BooleanExp "
		Interface BooleanExp : Inherits LiteralExp
			Property value As [Boolean]
		End Interface
	#End Region

	#Region " Interface IntegerExp "
		Interface IntegerExp : Inherits LiteralExp
			Property value As [Integer]
		End Interface
	#End Region

	#Region " Interface StringExp "
		Interface StringExp : Inherits LiteralExp
			Property value As [String]
		End Interface
	#End Region

	#Region " Enum Severity "
		Enum Severity
				[critic]
				[[error]]
				[warning]
			End Enum
	#End Region
End Namespace
