Namespace SimpleSBVR

	#Region " Interface Root "
		Interface Root
			''' <summary>
			''' Container
			''' </summary>
			Property elements As List(Of [[Element]]
		End Interface
	#End Region

	#Region " Interface Element "
		Interface Element
			Property objectName As [String]
		End Interface
	#End Region

	#Region " Interface Representation "
		Interface Representation : Inherits Element
			''' <summary>
			''' meaning oppositeOf representations
			''' </summary>
			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface Designation "
		Interface Designation : Inherits Representation
			Property text As [[Text]]
		End Interface
	#End Region

	#Region " Interface Text "
		Interface Text : Inherits Element
			Property value As [String]
		End Interface
	#End Region

	#Region " Interface Meaning "
		Interface Meaning : Inherits Element
			''' <summary>
			''' representations oppositeOf meaning
			''' </summary>
			Property representations As List(Of [[Representation]]
		End Interface
	#End Region

	#Region " Interface Concept "
		Interface Concept : Inherits Meaning
			
		End Interface
	#End Region

	#Region " Interface NounConcept "
		Interface NounConcept : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ObjectType "
		Interface ObjectType : Inherits NounConcept
			''' <summary>
			''' specializes oppositeOf generalizes
			''' </summary>
			Property specializes As [[ObjectType]]

			''' <summary>
			''' generalizes oppositeOf specializes
			''' </summary>
			Property generalizes As List(Of [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface IndividualConcept "
		Interface IndividualConcept : Inherits NounConcept
			Property instanceOf As [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface DataType "
		Interface DataType : Inherits NounConcept
			
		End Interface
	#End Region

	#Region " Interface NonEmptyString "
		Interface NonEmptyString : Inherits DataType
			Property value As [String]
		End Interface
	#End Region

	#Region " Interface NonNegativeInteger "
		Interface NonNegativeInteger : Inherits DataType
			Property value As [Integer]
		End Interface
	#End Region

	#Region " Interface FactType "
		Interface FactType : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface BinaryFactType "
		Interface BinaryFactType : Inherits FactType
			Property role1 As [[FactTypeRole]]

			Property role2 As [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface IsPropertyOfFactType "
		Interface IsPropertyOfFactType : Inherits BinaryFactType
			
		End Interface
	#End Region

	#Region " Interface AssociativeFactType "
		Interface AssociativeFactType : Inherits BinaryFactType
			
		End Interface
	#End Region

	#Region " Interface CategorizationFactType "
		Interface CategorizationFactType : Inherits BinaryFactType
			
		End Interface
	#End Region

	#Region " Interface ObjectificationFactType "
		Interface ObjectificationFactType : Inherits BinaryFactType
			
		End Interface
	#End Region

	#Region " Interface Role "
		Interface Role : Inherits Element
			Property nounConcept As [[NounConcept]]
		End Interface
	#End Region

	#Region " Interface FactTypeRole "
		Interface FactTypeRole : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface LogicalFormulation "
		Interface LogicalFormulation : Inherits Meaning
			
		End Interface
	#End Region

	#Region " Interface AtomicFormulation "
		Interface AtomicFormulation : Inherits LogicalFormulation
			Property isBasedOn As [[FactType]]
		End Interface
	#End Region

	#Region " Interface BinaryAtomicFormulation "
		Interface BinaryAtomicFormulation : Inherits AtomicFormulation
			Property roleBinding1 As [[RoleBinding]]

			Property roleBinding2 As [[RoleBinding]]
		End Interface
	#End Region

	#Region " Interface NecessityFormulation "
		Interface NecessityFormulation : Inherits LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface Quantification "
		Interface Quantification : Inherits LogicalFormulation
			Property introducedVariable As [[Variable]]

			Property scopesOver As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface UniversalQuantification "
		Interface UniversalQuantification : Inherits Quantification
			
		End Interface
	#End Region

	#Region " Interface AtLeastNQuantification "
		Interface AtLeastNQuantification : Inherits Quantification
			Property minCardinality As [[NonNegativeInteger]]
		End Interface
	#End Region

	#Region " Interface ExactlyNQuantification "
		Interface ExactlyNQuantification : Inherits Quantification
			Property cardinality As [[NonNegativeInteger]]
		End Interface
	#End Region

	#Region " Interface AtMostNQuantification "
		Interface AtMostNQuantification : Inherits Quantification
			Property maxCardinality As [[NonNegativeInteger]]
		End Interface
	#End Region

	#Region " Interface BindableTarget "
		Interface BindableTarget : Inherits Element
			
		End Interface
	#End Region

	#Region " Interface Variable "
		Interface Variable : Inherits BindableTarget
			Property rangesOver As [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface RoleBinding "
		Interface RoleBinding : Inherits Element
			Property occursIn As [[AtomicFormulation]]

			Property isOf As [[FactType]]

			Property bindsTo As [[BindableTarget]]
		End Interface
	#End Region
End Namespace
