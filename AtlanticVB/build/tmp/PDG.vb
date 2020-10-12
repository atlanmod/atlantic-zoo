Namespace PDG

	#Region " Interface MProgramDependenceGraph "
		Interface MProgramDependenceGraph
			''' <summary>
			''' Container
			''' </summary>
			Property node As [[EnterNode]]
		End Interface
	#End Region

	#Region " Interface EnterNode "
		Interface EnterNode
			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property controlDependenceNodes As List(Of [[ExpressionNode]]
		End Interface
	#End Region

	#Region " Interface ExpressionNode "
		Interface ExpressionNode
			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property expression As [[Expression]]

			Property dataDependenceNodes As List(Of [[ExpressionNode]]

			''' <summary>
			''' Container
			''' </summary>
			Property controlDependenceNodes As List(Of [[ExpressionNode]]
		End Interface
	#End Region

	#Region " Interface Expression "
		Interface Expression
			Property name As [String]

			Property isIdentifier As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property innerExpressions As List(Of [[Expression]]
		End Interface
	#End Region
End Namespace
