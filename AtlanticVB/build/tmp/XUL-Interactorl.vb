Namespace XULInteractorMetaModel

	#Region " Interface UIModel "
		Interface UIModel
			''' <summary>
			''' Container
			''' </summary>
			Property windows As [[Windows]]

			''' <summary>
			''' functions oppositeOf functionUIModel / container
			''' </summary>
			Property functions As List(Of [[Function]]
		End Interface
	#End Region

	#Region " Interface Windows "
		Interface Windows : Inherits Container
			Property id As [String]

			Property title As [String]

			Property orient As [[Orients]]

			Property style As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property headers As List(Of [[HeaderCss]]

			Property headersJScript As List(Of [[HeaderJScript]]
		End Interface
	#End Region

	#Region " Interface Button "
		Interface Button : Inherits Containement
			Property tooltiptext As [String]

			Property image As [String]
		End Interface
	#End Region

	#Region " Interface Image "
		Interface Image : Inherits Containement
			Property src As [String]
		End Interface
	#End Region

	#Region " Interface RadioGroup "
		Interface RadioGroup : Inherits Containement
			''' <summary>
			''' Container
			''' </summary>
			Property radiobuttons As List(Of [[Radio]]
		End Interface
	#End Region

	#Region " Interface Radio "
		Interface Radio : Inherits Interactor
			Property id As [String]

			Property label As [String]

			Property selected As [Boolean]

			Property disabled As [Boolean]
		End Interface
	#End Region

	#Region " Interface ListBox "
		Interface ListBox : Inherits Containement
			Property rows As [Integer]

			''' <summary>
			''' Container
			''' </summary>
			Property listitems As List(Of [[ListItem]]
		End Interface
	#End Region

	#Region " Interface ListItem "
		Interface ListItem : Inherits Interactor
			Property label As [String]

			Property value As [String]
		End Interface
	#End Region

	#Region " Interface MenuList "
		Interface MenuList : Inherits Containement
			''' <summary>
			''' Container
			''' </summary>
			Property menuitems As List(Of [[MenuItem]]
		End Interface
	#End Region

	#Region " Interface MenuItem "
		Interface MenuItem : Inherits Interactor
			Property label As [String]
		End Interface
	#End Region

	#Region " Interface vbox "
		Interface vbox : Inherits Container
			
		End Interface
	#End Region

	#Region " Interface hbox "
		Interface hbox : Inherits Container
			
		End Interface
	#End Region

	#Region " Interface Containement "
		Interface Containement : Inherits Interactor
			Property style As [String]

			Property accesskey As [String]

			Property [class] As [String]

			Property maxlength As [Integer]

			Property label As [String]

			Property orient As [[Orients]]

			Property minlength As [String]

			Property onclick As [String]

			Property disabled As [String]
		End Interface
	#End Region

	#Region " Interface GroupBox "
		Interface GroupBox : Inherits Container
			
		End Interface
	#End Region

	#Region " Interface Container "
		Interface Container : Inherits Interactor
			''' <summary>
			''' Container
			''' </summary>
			Property xulInteractors As List(Of [[Interactor]]
		End Interface
	#End Region

	#Region " Interface Interactor "
		Interface Interactor
			Property flex As [Integer]

			Property id As [String]

			Property stat As [String]

			Property style As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property events As List(Of [[Event]]
		End Interface
	#End Region

	#Region " Interface TabBox "
		Interface TabBox : Inherits Containement
			''' <summary>
			''' Container
			''' </summary>
			Property tabPanels As List(Of [[Interactor]]
		End Interface
	#End Region

	#Region " Interface TextBox "
		Interface TextBox : Inherits Containement
			Property multiline As [Boolean]

			Property value As [String]
		End Interface
	#End Region

	#Region " Interface Spacer "
		Interface Spacer : Inherits Containement
			
		End Interface
	#End Region

	#Region " Interface Label "
		Interface Label : Inherits Containement
			Property value As [String]

			Property control As [String]
		End Interface
	#End Region

	#Region " Interface Grid "
		Interface Grid : Inherits Containement
			''' <summary>
			''' Container
			''' </summary>
			Property columns As List(Of [[column]]

			''' <summary>
			''' Container
			''' </summary>
			Property rows As List(Of [[row]]
		End Interface
	#End Region

	#Region " Interface row "
		Interface row : Inherits Container
			
		End Interface
	#End Region

	#Region " Interface column "
		Interface column : Inherits Container
			
		End Interface
	#End Region

	#Region " Interface CheckBox "
		Interface CheckBox : Inherits Containement
			Property checked As [Boolean]
		End Interface
	#End Region

	#Region " Interface Caption "
		Interface Caption : Inherits Containement
			Property label As [String]
		End Interface
	#End Region

	#Region " Interface Description "
		Interface Description : Inherits Containement
			Property value As [String]
		End Interface
	#End Region

	#Region " Interface HeaderCss "
		Interface HeaderCss
			Property ref As [String]

			Property type As [String]
		End Interface
	#End Region

	#Region " Interface HeaderJScript "
		Interface HeaderJScript
			Property ref As [String]
		End Interface
	#End Region

	#Region " Interface TabPanel "
		Interface TabPanel : Inherits Container
			Property id As [String]

			Property orient As [[Orients]]
		End Interface
	#End Region

	#Region " Interface [Event] "
		Interface [Event]
			''' <summary>
			''' Container
			''' </summary>
			Property functionCallParameters As List(Of [[Parameter]]

			Property functionCalledName As [String]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface Parameter "
		Interface Parameter
			Property value As [String]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface onClick "
		Interface onClick : Inherits [Event]
			
		End Interface
	#End Region

	#Region " Interface [Function] "
		Interface [Function]
			Property name As [String]

			''' <summary>
			''' functionUIModel oppositeOf functions
			''' </summary>
			Property functionUIModel As [[UIModel]]

			Property body As [String]
		End Interface
	#End Region

	#Region " Enum Orients "
		Enum Orients
				[horizontal]
				[vertical]
			End Enum
	#End Region
End Namespace
Namespace primitivetype

	
End Namespace
