Namespace WikiTable

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Table "
		Interface Table : Inherits LocatedElement
			Property border As [Integer]

			Property style As [String]

			Property [class] As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property caption As [[Caption]]

			''' <summary>
			''' Container
			''' </summary>
			Property rows As List(Of [[Row]]
		End Interface
	#End Region

	#Region " Interface Caption "
		Interface Caption : Inherits LocatedElement
			Property content As [String]
		End Interface
	#End Region

	#Region " Interface Row "
		Interface Row : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property cells As List(Of [[Cell]]
		End Interface
	#End Region

	#Region " Interface Cell "
		Interface Cell : Inherits LocatedElement
			Property isHeading As [Boolean]

			Property align As [String]

			Property style As [String]

			Property content As [String]
		End Interface
	#End Region
End Namespace
