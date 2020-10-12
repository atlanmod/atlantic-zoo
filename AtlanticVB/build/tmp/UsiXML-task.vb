Namespace TaskUsiXML

	#Region " Interface Task "
		Interface Task
			Property id As [String]

			Property name As [String]

			Property category As [String]

			Property frequency As [Integer]

			Property importance As [Integer]

			Property structurationLevel As [Integer]

			Property complexityLevel As [Integer]

			Property criticity As [Integer]

			Property centrality As [Integer]

			Property terminationValue As [String]

			Property taskType As [String]

			Property taskItem As [String]

			''' <summary>
			''' decompositionTasks oppositeOf decomposedTask / container
			''' </summary>
			Property decompositionTasks As List(Of [[Task]]

			''' <summary>
			''' decomposedTask oppositeOf decompositionTasks
			''' </summary>
			Property decomposedTask As [[Task]]

			''' <summary>
			''' leftOperator oppositeOf rightTask
			''' </summary>
			Property leftOperator As [[BinaryOperator]]

			''' <summary>
			''' rightOperator oppositeOf leftTask
			''' </summary>
			Property rightOperator As [[BinaryOperator]]

			''' <summary>
			''' decoration oppositeOf decoratedTask
			''' </summary>
			Property decoration As [[UnaryOperator]]
		End Interface
	#End Region

	#Region " Interface Operator "
		Interface Operator
			Property id As [String]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface BinaryOperator "
		Interface BinaryOperator : Inherits Operator
			Property type As [[BinaryType]]

			''' <summary>
			''' leftTask oppositeOf rightOperator
			''' </summary>
			Property leftTask As [[Task]]

			''' <summary>
			''' rightTask oppositeOf leftOperator
			''' </summary>
			Property rightTask As [[Task]]
		End Interface
	#End Region

	#Region " Interface UnaryOperator "
		Interface UnaryOperator : Inherits Operator
			Property UnaryType As [[UnaryType]]

			''' <summary>
			''' decoratedTask oppositeOf decoration
			''' </summary>
			Property decoratedTask As [[Task]]
		End Interface
	#End Region

	#Region " Interface FiniteInteration "
		Interface FiniteInteration : Inherits UnaryOperator
			Property interation As [Integer]
		End Interface
	#End Region

	#Region " Enum BinaryType "
		Enum BinaryType
				[Enabling]
				[Disabling]
				[SuspendResume]
				[OrderIndependence]
				[IndependentConcurrency]
				[ConcurencyWithInformationPassing]
				[UnderterministicChoice]
				[EnablingWithInformationPassing]
			End Enum
	#End Region

	#Region " Enum UnaryType "
		Enum UnaryType
				[[Optional]]
				[Iteration]
				[finitIteration]
			End Enum
	#End Region
End Namespace
