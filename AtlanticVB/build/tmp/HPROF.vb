Namespace HPROF

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Profile "
		Interface Profile : Inherits LocatedElement
			Property header As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property threadActions As List(Of [[ThreadAction]]

			''' <summary>
			''' Container
			''' </summary>
			Property traces As List(Of [[Trace]]

			''' <summary>
			''' Container
			''' </summary>
			Property times As [[Times]]

			''' <summary>
			''' Container
			''' </summary>
			Property methods As List(Of [[Method]]
		End Interface
	#End Region

	#Region " Interface Method "
		Interface Method : Inherits LocatedElement
			Property fullyQualifiedName As [String]

			''' <summary>
			''' stackTraceElements oppositeOf method
			''' </summary>
			Property stackTraceElements As List(Of [[StackTraceElement]]
		End Interface
	#End Region

	#Region " Interface ThreadAction "
		Interface ThreadAction : Inherits LocatedElement
			Property id As [Integer]
		End Interface
	#End Region

	#Region " Interface ThreadStart "
		Interface ThreadStart : Inherits ThreadAction
			Property obj As [Integer]

			Property name As [String]

			Property group As [String]
		End Interface
	#End Region

	#Region " Interface ThreadEnd "
		Interface ThreadEnd : Inherits ThreadAction
			
		End Interface
	#End Region

	#Region " Interface Trace "
		Interface Trace : Inherits LocatedElement
			Property id As [Integer]

			Property threadId As [Integer]

			''' <summary>
			''' elements oppositeOf trace / container
			''' </summary>
			Property elements As List(Of [[StackTraceElement]]

			''' <summary>
			''' times oppositeOf trace
			''' </summary>
			Property times As List(Of [[Time]]
		End Interface
	#End Region

	#Region " Interface StackTraceElement "
		Interface StackTraceElement : Inherits LocatedElement
			''' <summary>
			''' method oppositeOf stackTraceElements
			''' </summary>
			Property method As [[Method]]

			Property fileName As [String]

			Property line As [Integer]

			''' <summary>
			''' trace oppositeOf elements
			''' </summary>
			Property trace As [[Trace]]
		End Interface
	#End Region

	#Region " Interface Times "
		Interface Times : Inherits LocatedElement
			Property unit As [String]

			Property total As [Integer]

			''' <summary>
			''' Container
			''' </summary>
			Property [date] As [[Date]]

			''' <summary>
			''' Container
			''' </summary>
			Property elements As List(Of [[Time]]
		End Interface
	#End Region

	#Region " Interface Time "
		Interface Time : Inherits LocatedElement
			Property rank As [Integer]

			Property self As Double

			Property accum As Double

			Property count As [Integer]

			''' <summary>
			''' trace oppositeOf times
			''' </summary>
			Property trace As [[Trace]]

			Property method As [[Method]]
		End Interface
	#End Region

	#Region " Interface [Date] "
		Interface [Date] : Inherits LocatedElement
			Property day As [[Day]]

			Property month As [[Month]]

			Property dayOfMonth As [Integer]

			Property hour As [Integer]

			Property minutes As [Integer]

			Property seconds As [Integer]

			Property year As [Integer]
		End Interface
	#End Region

	#Region " Enum Day "
		Enum Day
				[Monday]
				[Tuesday]
				[Wednesday]
				[Thursday]
				[Friday]
				[Saturday]
				[Sunday]
			End Enum
	#End Region

	#Region " Enum Month "
		Enum Month
				[January]
				[February]
				[March]
				[April]
				[May]
				[June]
				[July]
				[August]
				[September]
				[October]
				[November]
				[December]
			End Enum
	#End Region
End Namespace
