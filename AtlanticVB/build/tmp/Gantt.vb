Namespace Gantt

	#Region " Interface Project "
		Interface Project
			Property name As [String]

			Property company As [String]

			Property viewDate As [[Date]]

			Property viewIndex As [[Date]]

			Property ganttDividerLocation As [Integer]

			Property ressourceDividerLocation As [Integer]

			Property webLink As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property tasks As [[Tasks]]

			''' <summary>
			''' Container
			''' </summary>
			Property ressources As List(Of [[Ressource]]

			''' <summary>
			''' Container
			''' </summary>
			Property allocations As List(Of [[Allocation]]
		End Interface
	#End Region

	#Region " Interface Tasks "
		Interface Tasks
			Property color As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property tasks As List(Of [[Task]]
		End Interface
	#End Region

	#Region " Interface Task "
		Interface Task
			Property id As [String]

			Property name As [String]

			Property meeting As [Boolean]

			Property color As [String]

			Property expand As [Boolean]

			Property complete As [Integer]

			Property duration As [Integer]

			Property priority As [Integer]

			Property start As [[Date]]

			''' <summary>
			''' Container
			''' </summary>
			Property depends As List(Of [[Depend]]
		End Interface
	#End Region

	#Region " Interface Depend "
		Interface Depend
			Property id As [String]

			Property type As [Integer]

			Property difference As [Integer]

			Property hardness As [String]

			Property task As [[Task]]
		End Interface
	#End Region

	#Region " Interface Ressource "
		Interface Ressource
			Property Id As [String]

			Property name As [String]

			Property fonction As [String]

			Property contact As [String]

			Property phone As [String]
		End Interface
	#End Region

	#Region " Interface [Date] "
		Interface [Date]
			Property year As [Integer]

			Property month As [Integer]

			Property day As [Integer]
		End Interface
	#End Region

	#Region " Interface Allocation "
		Interface Allocation
			Property taskId As [String]

			Property ressourceId As [String]

			Property name As [String]

			Property [function] As [String]

			Property responsible As [Boolean]

			Property load As [Integer]
		End Interface
	#End Region

	#Region " Interface Vacation "
		Interface Vacation
			
		End Interface
	#End Region

	#Region " Interface Description "
		Interface Description
			
		End Interface
	#End Region

	#Region " Interface Previous "
		Interface Previous
			
		End Interface
	#End Region
End Namespace
