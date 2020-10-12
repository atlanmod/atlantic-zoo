Namespace M

	#Region " Interface IdentifiedElement "
		Interface IdentifiedElement
			Property qualifiers As [String]

			Property identifier As [String]
		End Interface
	#End Region

	#Region " Interface MElement "
		Interface MElement : Inherits IdentifiedElement
			
		End Interface
	#End Region

	#Region " Interface MElementReference "
		Interface MElementReference
			Property alias As [String]

			Property referencedElement As [[MElement]]
		End Interface
	#End Region

	#Region " Interface [Module] "
		Interface [Module] : Inherits MElement
			''' <summary>
			''' imports oppositeOf module / container
			''' </summary>
			Property imports As List(Of [[ImportDirective]]

			''' <summary>
			''' exports oppositeOf module / container
			''' </summary>
			Property exports As List(Of [[ExportDirective]]

			''' <summary>
			''' moduleMembers oppositeOf module / container
			''' </summary>
			Property moduleMembers As List(Of [[ModuleMember]]
		End Interface
	#End Region

	#Region " Interface ModuleMember "
		Interface ModuleMember : Inherits MElement
			''' <summary>
			''' module oppositeOf moduleMembers
			''' </summary>
			Property [module] As [[Module]]
		End Interface
	#End Region

	#Region " Interface ImportDirective "
		Interface ImportDirective
			''' <summary>
			''' module oppositeOf imports
			''' </summary>
			Property [module] As [[Module]]

			''' <summary>
			''' Container
			''' </summary>
			Property importedElements As List(Of [[MElementReference]]
		End Interface
	#End Region

	#Region " Interface ExportDirective "
		Interface ExportDirective
			''' <summary>
			''' module oppositeOf exports
			''' </summary>
			Property [module] As [[Module]]

			Property exportedElements As List(Of [[ModuleMember]]
		End Interface
	#End Region

	#Region " Interface Value "
		Interface Value
			
		End Interface
	#End Region

	#Region " Interface NumericalValue "
		Interface NumericalValue : Inherits Value
			
		End Interface
	#End Region

	#Region " Interface StringValue "
		Interface StringValue : Inherits Value
			Property value As [String]
		End Interface
	#End Region

	#Region " Interface IntegerValue "
		Interface IntegerValue : Inherits NumericalValue
			Property value As [Integer]
		End Interface
	#End Region

	#Region " Interface DecimalValue "
		Interface DecimalValue : Inherits NumericalValue
			Property value As Double
		End Interface
	#End Region

	#Region " Interface BooleanValue "
		Interface BooleanValue : Inherits Value
			Property value As [Boolean]
		End Interface
	#End Region
End Namespace
