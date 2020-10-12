Namespace ChocoModel

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Package "
		Interface Package : Inherits LocatedElement
			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property import As List(Of [[Import]]

			''' <summary>
			''' Container
			''' </summary>
			Property problem As [[ChocoProblem]]
		End Interface
	#End Region

	#Region " Interface Import "
		Interface Import : Inherits LocatedElement
			Property fqn As [String]
		End Interface
	#End Region

	#Region " Interface ChocoProblem "
		Interface ChocoProblem : Inherits LocatedElement
			Property name As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property elements As List(Of [[Element]]
		End Interface
	#End Region

	#Region " Interface Element "
		Interface Element : Inherits LocatedElement
			Property label As [String]
		End Interface
	#End Region

	#Region " Interface Expression "
		Interface Expression : Inherits Element
			
		End Interface
	#End Region

	#Region " Interface ConstraintDef "
		Interface ConstraintDef : Inherits Expression
			Property op As [[OpConstraint]]

			''' <summary>
			''' Container
			''' </summary>
			Property left As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property right As [[Expression]]
		End Interface
	#End Region

	#Region " Interface IntVar "
		Interface IntVar : Inherits Expression
			''' <summary>
			''' Container
			''' </summary>
			Property domain As [[Domain]]
		End Interface
	#End Region

	#Region " Interface Domain "
		Interface Domain : Inherits LocatedElement
			Property lower As [Integer]

			Property upper As [Integer]
		End Interface
	#End Region

	#Region " Interface IntConstant "
		Interface IntConstant : Inherits Expression
			Property val As [Integer]
		End Interface
	#End Region

	#Region " Interface SymbolicTerm "
		Interface SymbolicTerm : Inherits Expression
			Property term As [[Expression]]
		End Interface
	#End Region

	#Region " Interface IntValue "
		Interface IntValue : Inherits Expression
			Property val As [Integer]
		End Interface
	#End Region

	#Region " Interface IntExp "
		Interface IntExp : Inherits Expression
			Property op As [[OpConstraint]]

			''' <summary>
			''' Container
			''' </summary>
			Property left As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property right As [[Expression]]
		End Interface
	#End Region

	#Region " Interface Constraint "
		Interface Constraint : Inherits Expression
			Property op As [[OpConstraint]]

			''' <summary>
			''' Container
			''' </summary>
			Property left As [[Expression]]

			''' <summary>
			''' Container
			''' </summary>
			Property right As [[Expression]]
		End Interface
	#End Region

	#Region " Interface PostConstraint "
		Interface PostConstraint : Inherits Element
			Property op As [[OpConstraint]]

			Property constraint As [[ConstraintDef]]
		End Interface
	#End Region

	#Region " Enum OpConstraint "
		Enum OpConstraint
				[eq]
				[and2]
				[or2]
				[gt]
				[ge]
				[lt]
				[le]
				[plus]
			End Enum
	#End Region
End Namespace
