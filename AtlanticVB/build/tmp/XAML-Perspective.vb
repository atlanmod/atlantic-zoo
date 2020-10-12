Namespace XAML

	#Region " Interface Page "
		Interface Page
			''' <summary>
			''' Container
			''' </summary>
			Property xmlns As List(Of [[NameSpace]]

			Property title As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property graphContainer As [[GraphicalContainer]]

			''' <summary>
			''' Container
			''' </summary>
			Property pageResources As [[PageResource]]
		End Interface
	#End Region

	#Region " Interface [NameSpace] "
		Interface [NameSpace]
			Property [namespace] As [String]

			Property identifier As [String]
		End Interface
	#End Region

	#Region " Interface PageResource "
		Interface PageResource
			''' <summary>
			''' Container
			''' </summary>
			Property dictionaries As List(Of [[ResourceDictionary]]
		End Interface
	#End Region

	#Region " Interface GraphicalContainer "
		Interface GraphicalContainer
			
		End Interface
	#End Region

	#Region " Interface WinFXElement "
		Interface WinFXElement
			Property [namespace] As [[NameSpace]]
		End Interface
	#End Region

	#Region " Interface PerspectiveElement "
		Interface PerspectiveElement
			Property [namespace] As [[NameSpace]]
		End Interface
	#End Region

	#Region " Interface ResourceDictionary "
		Interface ResourceDictionary
			Property source As [String]
		End Interface
	#End Region

	#Region " Interface Grid "
		Interface Grid : Inherits GraphicalContainer
			''' <summary>
			''' Container
			''' </summary>
			Property object3D As List(Of [[Object3D]]
		End Interface
	#End Region

	#Region " Interface Object3D "
		Interface Object3D
			
		End Interface
	#End Region

	#Region " Interface Workshop3D "
		Interface Workshop3D : Inherits Object3D, PerspectiveElement
			''' <summary>
			''' Container
			''' </summary>
			Property elements3D As List(Of [[Element3D]]
		End Interface
	#End Region

	#Region " Interface Element3D "
		Interface Element3D
			
		End Interface
	#End Region

	#Region " Interface UI3Delement "
		Interface UI3Delement : Inherits Element3D
			Property transform As [String]

			Property material As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property name As [[Name]]
		End Interface
	#End Region

	#Region " Interface XyzAxis3D "
		Interface XyzAxis3D : Inherits Element3D, PerspectiveElement
			Property length As Double
		End Interface
	#End Region

	#Region " Interface Box3D "
		Interface Box3D : Inherits UI3Delement, PerspectiveElement
			
		End Interface
	#End Region

	#Region " Interface Square3D "
		Interface Square3D : Inherits UI3Delement, PerspectiveElement
			
		End Interface
	#End Region

	#Region " Interface Name "
		Interface Name : Inherits WinFXElement
			Property name As [String]
		End Interface
	#End Region
End Namespace
