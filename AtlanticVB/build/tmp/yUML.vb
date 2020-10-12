Namespace yUML

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Model "
		Interface Model : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property classes As List(Of [[Class]]

			''' <summary>
			''' elements oppositeOf model / container
			''' </summary>
			Property elements As List(Of [[ModelElement]]
		End Interface
	#End Region

	#Region " Interface [Class] "
		Interface [Class] : Inherits LocatedElement
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface ModelElement "
		Interface ModelElement : Inherits LocatedElement
			''' <summary>
			''' model oppositeOf elements
			''' </summary>
			Property model As [[Model]]
		End Interface
	#End Region

	#Region " Interface ColorableElement "
		Interface ColorableElement : Inherits ModelElement
			Property color As [String]
		End Interface
	#End Region

	#Region " Interface ClassReference "
		Interface ClassReference : Inherits ColorableElement
			Property [class] As [[Class]]

			Property stereotype As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property definition As [[ClassDefinition]]
		End Interface
	#End Region

	#Region " Interface Relationship "
		Interface Relationship : Inherits ModelElement
			''' <summary>
			''' Container
			''' </summary>
			Property source As [[ClassReference]]

			''' <summary>
			''' Container
			''' </summary>
			Property target As [[ClassReference]]
		End Interface
	#End Region

	#Region " Interface ClassDefinition "
		Interface ClassDefinition : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property attributes As List(Of [[Attribute]]

			''' <summary>
			''' Container
			''' </summary>
			Property methods As List(Of [[Method]]
		End Interface
	#End Region

	#Region " Interface Association "
		Interface Association : Inherits Relationship
			Property type As [[AssociationType]]

			''' <summary>
			''' Container
			''' </summary>
			Property sourceCardinality As [[Cardinality]]

			Property sourceLabel As [String]

			Property navigableSource As [Boolean]

			Property sourceVisibility As [[Visibility]]

			''' <summary>
			''' Container
			''' </summary>
			Property targetCardinality As [[Cardinality]]

			Property targetLabel As [String]

			Property navigableTarget As [Boolean]

			Property targetVisibility As [[Visibility]]
		End Interface
	#End Region

	#Region " Interface Inheritance "
		Interface Inheritance : Inherits Relationship
			
		End Interface
	#End Region

	#Region " Interface Cardinality "
		Interface Cardinality : Inherits LocatedElement
			Property lowerBound As [Integer]

			Property upperBound As [Integer]
		End Interface
	#End Region

	#Region " Interface ClassMember "
		Interface ClassMember : Inherits LocatedElement
			Property visibility As [[Visibility]]

			Property name As [String]
		End Interface
	#End Region

	#Region " Interface Attribute "
		Interface Attribute : Inherits ClassMember
			Property type As [String]
		End Interface
	#End Region

	#Region " Interface Method "
		Interface Method : Inherits ClassMember
			Property arguments As [String]
		End Interface
	#End Region

	#Region " Interface Note "
		Interface Note : Inherits ColorableElement
			Property text As [String]
		End Interface
	#End Region

	#Region " Interface NoteAssociation "
		Interface NoteAssociation : Inherits Relationship
			''' <summary>
			''' Container
			''' </summary>
			Property note As [[Note]]
		End Interface
	#End Region

	#Region " Enum AssociationType "
		Enum AssociationType
				[simpleAssociation]
				[aggregation]
				[composition]
			End Enum
	#End Region

	#Region " Enum Visibility "
		Enum Visibility
				[unspecified]
				[[public]]
				[[private]]
				[protected]
				[package]
			End Enum
	#End Region
End Namespace
