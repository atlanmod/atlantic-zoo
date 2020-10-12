Namespace XAML

	#Region " Interface Transformation "
		Interface Transformation
			
		End Interface
	#End Region

	#Region " Interface WinFXElement "
		Interface WinFXElement
			Property [namespace] As [[NameSpace]]
		End Interface
	#End Region

	#Region " Interface [NameSpace] "
		Interface [NameSpace]
			Property [namespace] As [String]

			Property identifier As [String]
		End Interface
	#End Region

	#Region " Interface ResourceGroup "
		Interface ResourceGroup
			''' <summary>
			''' Container
			''' </summary>
			Property key As [[Key]]
		End Interface
	#End Region

	#Region " Interface Material "
		Interface Material
			
		End Interface
	#End Region

	#Region " Interface Key "
		Interface Key : Inherits WinFXElement
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface ResourceDictionary "
		Interface ResourceDictionary
			''' <summary>
			''' Container
			''' </summary>
			Property resourcegroups As List(Of [[ResourceGroup]]

			''' <summary>
			''' Container
			''' </summary>
			Property xmlns As List(Of [[NameSpace]]
		End Interface
	#End Region

	#Region " Interface Transform3DGroup "
		Interface Transform3DGroup : Inherits ResourceGroup
			''' <summary>
			''' Container
			''' </summary>
			Property transformations As List(Of [[Transformation]]
		End Interface
	#End Region

	#Region " Interface MaterialGroup "
		Interface MaterialGroup : Inherits ResourceGroup
			''' <summary>
			''' Container
			''' </summary>
			Property materials As List(Of [[Material]]
		End Interface
	#End Region

	#Region " Interface DiffuseMaterial "
		Interface DiffuseMaterial : Inherits Material
			Property Brush As [String]
		End Interface
	#End Region

	#Region " Interface TranslateTransform3D "
		Interface TranslateTransform3D : Inherits Transformation
			Property OffsetX As Double

			Property OffsetY As Double

			Property OffsetZ As Double
		End Interface
	#End Region

	#Region " Interface ScaleTransform3D "
		Interface ScaleTransform3D : Inherits Transformation
			Property ScaleX As Double

			Property ScaleY As Double

			Property ScaleZ As Double
		End Interface
	#End Region

	#Region " Interface RotateTransform3D "
		Interface RotateTransform3D : Inherits Transformation
			Property CenterX As Double

			Property CenterY As Double

			''' <summary>
			''' Container
			''' </summary>
			Property rotation As [[RotateTransformat3DRotation]]
		End Interface
	#End Region

	#Region " Interface RotateTransformat3DRotation "
		Interface RotateTransformat3DRotation
			''' <summary>
			''' Container
			''' </summary>
			Property axisAngleRotation3D As [[AxisAngleRotation3D]]
		End Interface
	#End Region

	#Region " Interface AxisAngleRotation3D "
		Interface AxisAngleRotation3D
			Property angle As [Integer]

			Property axis As [String]
		End Interface
	#End Region
End Namespace
