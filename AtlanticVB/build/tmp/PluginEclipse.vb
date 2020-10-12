Namespace PluginEclipse

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Eclipse "
		Interface Eclipse : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property bundles As List(Of [[Bundle]]

			''' <summary>
			''' Container
			''' </summary>
			Property packages As List(Of [[Package]]
		End Interface
	#End Region

	#Region " Interface Bundle "
		Interface Bundle : Inherits LocatedElement
			Property symbolicName As [String]

			Property singleton As [Boolean]

			Property manifestVersion As [Integer]

			''' <summary>
			''' Container
			''' </summary>
			Property require As List(Of [[RequiredBundle]]

			''' <summary>
			''' Container
			''' </summary>
			Property version As [[Version]]

			''' <summary>
			''' Container
			''' </summary>
			Property export As List(Of [[ExportedPackage]]

			''' <summary>
			''' Container
			''' </summary>
			Property import As List(Of [[ImportedPackage]]

			''' <summary>
			''' Container
			''' </summary>
			Property packages As List(Of [[Package]]
		End Interface
	#End Region

	#Region " Interface RequireBundleAttribute "
		Interface RequireBundleAttribute : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface AttResolution "
		Interface AttResolution : Inherits RequireBundleAttribute
			Property value As [[Resolution]]
		End Interface
	#End Region

	#Region " Interface AttVisibility "
		Interface AttVisibility : Inherits RequireBundleAttribute
			Property value As [[Visibility]]
		End Interface
	#End Region

	#Region " Interface Range "
		Interface Range : Inherits RequireBundleAttribute
			Property isLeftInclusive As [Boolean]

			Property isRightInclusive As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property lowerBound As [[Version]]

			''' <summary>
			''' Container
			''' </summary>
			Property upperBound As [[Version]]
		End Interface
	#End Region

	#Region " Interface Version "
		Interface Version : Inherits LocatedElement
			Property major As [Integer]

			Property minor As [Integer]

			Property micro As [Integer]

			Property qualification As [String]
		End Interface
	#End Region

	#Region " Interface RequiredBundle "
		Interface RequiredBundle : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property requireBundleAttribute As List(Of [[RequireBundleAttribute]]

			Property bundle As [[Bundle]]
		End Interface
	#End Region

	#Region " Interface ImportedPackage "
		Interface ImportedPackage : Inherits LocatedElement
			Property resolution As [[Resolution]]

			''' <summary>
			''' package oppositeOf importedBy
			''' </summary>
			Property package As [[Package]]

			''' <summary>
			''' Container
			''' </summary>
			Property range As [[Range]]
		End Interface
	#End Region

	#Region " Interface ExportedPackage "
		Interface ExportedPackage : Inherits LocatedElement
			''' <summary>
			''' package oppositeOf exportedBy
			''' </summary>
			Property package As [[Package]]

			''' <summary>
			''' Container
			''' </summary>
			Property version As [[Version]]

			''' <summary>
			''' Container
			''' </summary>
			Property xFriends As [[Xfriends]]
		End Interface
	#End Region

	#Region " Interface Package "
		Interface Package : Inherits LocatedElement
			Property fqn As [String]

			''' <summary>
			''' importedBy oppositeOf package
			''' </summary>
			Property importedBy As List(Of [[ImportedPackage]]

			''' <summary>
			''' exportedBy oppositeOf package
			''' </summary>
			Property exportedBy As [[ExportedPackage]]
		End Interface
	#End Region

	#Region " Enum Resolution "
		Enum Resolution
				[Mandatory]
				[[Optional]]
			End Enum
	#End Region

	#Region " Enum Visibility "
		Enum Visibility
				[[Private]]
				[Reexport]
			End Enum
	#End Region
End Namespace
Namespace PluginsEclipse

	#Region " Interface Xfriends "
		Interface Xfriends : Inherits LocatedElement
			Property bundles As List(Of [[Bundle]]
		End Interface
	#End Region

	#Region " Interface Xinternal "
		Interface Xinternal : Inherits ExportedPackage
			Property value As [Boolean]
		End Interface
	#End Region
End Namespace
