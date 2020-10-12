Namespace Maude

	#Region " Interface MaudeSpec "
		Interface MaudeSpec
			''' <summary>
			''' Container
			''' </summary>
			Property els As List(Of [[MaudeTopEl]]

			Property printableEls As List(Of [[MaudeTopEl]]
		End Interface
	#End Region

	#Region " Interface MaudeTopEl "
		Interface MaudeTopEl
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface ModExpression "
		Interface ModExpression
			
		End Interface
	#End Region

	#Region " Interface InstModExp "
		Interface InstModExp : Inherits ModExpression
			''' <summary>
			''' Container
			''' </summary>
			Property modExp As [[ModExpression]]

			Property views As List(Of [[View]]
		End Interface
	#End Region

	#Region " Interface RenModExp "
		Interface RenModExp : Inherits ModExpression
			''' <summary>
			''' Container
			''' </summary>
			Property modExp As [[ModExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property renamings As List(Of [[RenMapping]]
		End Interface
	#End Region

	#Region " Interface CompModExp "
		Interface CompModExp : Inherits ModExpression
			''' <summary>
			''' Container
			''' </summary>
			Property modExps As List(Of [[ModExpression]]
		End Interface
	#End Region

	#Region " Interface ModuleIdModExp "
		Interface ModuleIdModExp : Inherits ModExpression
			Property [module] As [[Module]]
		End Interface
	#End Region

	#Region " Interface TheoryIdModExp "
		Interface TheoryIdModExp : Inherits ModExpression
			Property theory As [[Theory]]
		End Interface
	#End Region

	#Region " Interface Parameter "
		Interface Parameter : Inherits ModExpression
			Property label As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property modExp As [[ModExpression]]
		End Interface
	#End Region

	#Region " Interface Theory "
		Interface Theory : Inherits MaudeTopEl
			''' <summary>
			''' els oppositeOf theory / container
			''' </summary>
			Property els As List(Of [[ModElement]]
		End Interface
	#End Region

	#Region " Interface FTheory "
		Interface FTheory : Inherits Theory
			
		End Interface
	#End Region

	#Region " Interface STheory "
		Interface STheory : Inherits Theory
			
		End Interface
	#End Region

	#Region " Interface [Module] "
		Interface [Module] : Inherits MaudeTopEl
			''' <summary>
			''' els oppositeOf module / container
			''' </summary>
			Property els As List(Of [[ModElement]]

			''' <summary>
			''' Container
			''' </summary>
			Property params As List(Of [[Parameter]]
		End Interface
	#End Region

	#Region " Interface FModule "
		Interface FModule : Inherits [Module]
			
		End Interface
	#End Region

	#Region " Interface SModule "
		Interface SModule : Inherits [Module]
			
		End Interface
	#End Region

	#Region " Interface ModElement "
		Interface ModElement
			''' <summary>
			''' module oppositeOf els
			''' </summary>
			Property [module] As [[Module]]

			''' <summary>
			''' theory oppositeOf els
			''' </summary>
			Property theory As [[Theory]]
		End Interface
	#End Region

	#Region " Interface ModImportation "
		Interface ModImportation : Inherits ModElement
			''' <summary>
			''' Container
			''' </summary>
			Property imports As [[ModExpression]]

			Property mode As [[ImportationMode]]
		End Interface
	#End Region

	#Region " Interface Type "
		Interface Type
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface Sort "
		Interface Sort : Inherits Type, ModElement
			''' <summary>
			''' subsortRels oppositeOf supersorts
			''' </summary>
			Property subsortRels As List(Of [[SubsortRel]]

			''' <summary>
			''' supersortRels oppositeOf subsorts
			''' </summary>
			Property supersortRels As List(Of [[SubsortRel]]

			''' <summary>
			''' kind oppositeOf sorts
			''' </summary>
			Property kind As [[Kind]]
		End Interface
	#End Region

	#Region " Interface Kind "
		Interface Kind : Inherits Type
			''' <summary>
			''' sorts oppositeOf kind
			''' </summary>
			Property sorts As List(Of [[Sort]]
		End Interface
	#End Region

	#Region " Interface SubsortRel "
		Interface SubsortRel : Inherits ModElement
			''' <summary>
			''' subsorts oppositeOf supersortRels
			''' </summary>
			Property subsorts As List(Of [[Sort]]

			''' <summary>
			''' supersorts oppositeOf subsortRels
			''' </summary>
			Property supersorts As List(Of [[Sort]]
		End Interface
	#End Region

	#Region " Interface Operation "
		Interface Operation : Inherits ModElement
			Property name As [String]

			Property coarity As [[Type]]

			Property arity As List(Of [[Type]]

			Property atts As [String]
		End Interface
	#End Region

	#Region " Interface Statement "
		Interface Statement : Inherits ModElement
			Property label As [String]

			Property atts As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property conds As List(Of [[Condition]]
		End Interface
	#End Region

	#Region " Interface Membership "
		Interface Membership : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property term As [[Term]]

			Property sort As [[Sort]]
		End Interface
	#End Region

	#Region " Interface Equation "
		Interface Equation : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property lhs As [[Term]]

			''' <summary>
			''' Container
			''' </summary>
			Property rhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface Rule "
		Interface Rule : Inherits Statement
			''' <summary>
			''' Container
			''' </summary>
			Property lhs As [[Term]]

			''' <summary>
			''' Container
			''' </summary>
			Property rhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface Condition "
		Interface Condition
			''' <summary>
			''' Container
			''' </summary>
			Property lhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface EquationalCond "
		Interface EquationalCond : Inherits Condition
			
		End Interface
	#End Region

	#Region " Interface RewriteCond "
		Interface RewriteCond : Inherits Condition
			''' <summary>
			''' Container
			''' </summary>
			Property rhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface MembershipCond "
		Interface MembershipCond : Inherits EquationalCond
			Property rhs As [[Sort]]
		End Interface
	#End Region

	#Region " Interface BooleanCond "
		Interface BooleanCond : Inherits EquationalCond
			
		End Interface
	#End Region

	#Region " Interface MatchingCond "
		Interface MatchingCond : Inherits EquationalCond
			''' <summary>
			''' Container
			''' </summary>
			Property rhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface EqualCond "
		Interface EqualCond : Inherits EquationalCond
			''' <summary>
			''' Container
			''' </summary>
			Property rhs As [[Term]]
		End Interface
	#End Region

	#Region " Interface Term "
		Interface Term
			Property type As [[Type]]
		End Interface
	#End Region

	#Region " Interface Constant "
		Interface Constant : Inherits Term
			Property op As [String]
		End Interface
	#End Region

	#Region " Interface RecTerm "
		Interface RecTerm : Inherits Term
			Property op As [String]

			''' <summary>
			''' Container
			''' </summary>
			Property args As List(Of [[Term]]
		End Interface
	#End Region

	#Region " Interface Variable "
		Interface Variable : Inherits Term
			Property name As [String]
		End Interface
	#End Region

	#Region " Interface View "
		Interface View : Inherits MaudeTopEl
			''' <summary>
			''' Container
			''' </summary>
			Property from As [[ModExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property [to] As [[ModExpression]]

			''' <summary>
			''' Container
			''' </summary>
			Property els As List(Of [[ViewMapping]]
		End Interface
	#End Region

	#Region " Interface ViewMapping "
		Interface ViewMapping
			
		End Interface
	#End Region

	#Region " Interface RenMapping "
		Interface RenMapping : Inherits ViewMapping
			
		End Interface
	#End Region

	#Region " Interface TermMapping "
		Interface TermMapping : Inherits ViewMapping
			''' <summary>
			''' Container
			''' </summary>
			Property from As [[Term]]

			''' <summary>
			''' Container
			''' </summary>
			Property [to] As [[Term]]
		End Interface
	#End Region

	#Region " Interface SortMapping "
		Interface SortMapping : Inherits RenMapping
			Property from As [[Sort]]

			Property [to] As [String]
		End Interface
	#End Region

	#Region " Interface OpTypedMapping "
		Interface OpTypedMapping : Inherits RenMapping
			Property from As [[Operation]]

			Property [to] As [String]

			Property atts As [String]
		End Interface
	#End Region

	#Region " Interface OpMapping "
		Interface OpMapping : Inherits RenMapping
			Property from As [[Operation]]

			Property [to] As [String]
		End Interface
	#End Region

	#Region " Interface LabelMapping "
		Interface LabelMapping : Inherits RenMapping
			Property from As [String]

			Property [to] As [String]
		End Interface
	#End Region

	#Region " Enum ImportationMode "
		Enum ImportationMode
				[protecting]
				[including]
				[extending]
			End Enum
	#End Region
End Namespace
