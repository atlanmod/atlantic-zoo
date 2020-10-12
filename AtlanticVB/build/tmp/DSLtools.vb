Namespace DSL

	#Region " Interface NamedElement "
		Interface NamedElement
			Property name As [String]

			Property identity As [String]
		End Interface
	#End Region

	#Region " Interface LoadedElement "
		Interface LoadedElement : Inherits [Namespace]
			Property isLoaded As [Boolean]
		End Interface
	#End Region

	#Region " Interface [Namespace] "
		Interface [Namespace] : Inherits NamedElement
			Property [namespace] As [String]
		End Interface
	#End Region

	#Region " Interface DomainModel "
		Interface DomainModel : Inherits LoadedElement
			''' <summary>
			''' classifiers oppositeOf domainModel / container
			''' </summary>
			Property classifiers As List(Of [[Classifier]]

			''' <summary>
			''' Container
			''' </summary>
			Property types As List(Of [[Type]]
		End Interface
	#End Region

	#Region " Interface Classifier "
		Interface Classifier : Inherits LoadedElement
			Property isAbstract As [Boolean]

			''' <summary>
			''' properties oppositeOf owner / container
			''' </summary>
			Property properties As List(Of [[ValueProperty]]

			''' <summary>
			''' superType oppositeOf subTypes
			''' </summary>
			Property superType As [[Classifier]]

			''' <summary>
			''' subTypes oppositeOf superType
			''' </summary>
			Property subTypes As List(Of [[Classifier]]

			''' <summary>
			''' domainModel oppositeOf classifiers
			''' </summary>
			Property domainModel As [[DomainModel]]
		End Interface
	#End Region

	#Region " Interface [Class] "
		Interface [Class] : Inherits Classifier
			Property isSerializationRoot As [Boolean]
		End Interface
	#End Region

	#Region " Interface Relationship "
		Interface Relationship : Inherits Classifier
			Property isEmbedding As [Boolean]

			''' <summary>
			''' roles oppositeOf relation / container
			''' </summary>
			Property roles As List(Of [[Role]]
		End Interface
	#End Region

	#Region " Interface Role "
		Interface Role : Inherits NamedElement
			Property min As [Integer]

			Property max As [Integer]

			Property isUnbounded As [Boolean]

			Property accepts As [String]

			Property isOrdered As [Boolean]

			Property isNavigableFrom As [Boolean]

			Property isPropertyGenerator As [Boolean]

			Property source As [[Classifier]]

			Property type As [[Classifier]]

			''' <summary>
			''' relation oppositeOf roles
			''' </summary>
			Property relation As [[Relationship]]
		End Interface
	#End Region

	#Region " Interface ValueProperty "
		Interface ValueProperty : Inherits NamedElement
			''' <summary>
			''' owner oppositeOf properties
			''' </summary>
			Property owner As [[Classifier]]

			Property type As [[Type]]
		End Interface
	#End Region

	#Region " Interface Type "
		Interface Type : Inherits [Namespace]
			
		End Interface
	#End Region

	#Region " Interface SimpleType "
		Interface SimpleType : Inherits Type
			
		End Interface
	#End Region

	#Region " Interface EnumerationLiteral "
		Interface EnumerationLiteral : Inherits NamedElement
			Property value As [Integer]
		End Interface
	#End Region

	#Region " Interface Enumeration "
		Interface Enumeration : Inherits Type
			''' <summary>
			''' Container
			''' </summary>
			Property literals As List(Of [[EnumerationLiteral]]
		End Interface
	#End Region
End Namespace
