Namespace SBVRvoc

	#Region " Interface LocatedElement "
		Interface LocatedElement
			Property location As [String]

			Property commentsBefore As [String]

			Property commentsAfter As [String]
		End Interface
	#End Region

	#Region " Interface Root "
		Interface Root : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property entries As List(Of [[VocabularyEntry]]
		End Interface
	#End Region

	#Region " Interface VocabularyEntry "
		Interface VocabularyEntry : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property primaryRep As [[PrimaryRepresentation]]

			''' <summary>
			''' Container
			''' </summary>
			Property caption As List(Of [[Caption]]
		End Interface
	#End Region

	#Region " Interface Caption "
		Interface Caption : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface DefCaption "
		Interface DefCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property definition As [[ConceptDefinition]]
		End Interface
	#End Region

	#Region " Interface DescCaption "
		Interface DescCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property description As [[Note]]
		End Interface
	#End Region

	#Region " Interface SrcCaption "
		Interface SrcCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property source As [[ConceptSource]]
		End Interface
	#End Region

	#Region " Interface DBCaption "
		Interface DBCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property dictionaryBasis As [[ConceptSource]]
		End Interface
	#End Region

	#Region " Interface GenCCaption "
		Interface GenCCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property generalConcept As [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface CTypCaption "
		Interface CTypCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property conceptType As List(Of [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface Necessity "
		Interface Necessity : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property exp As [[SBVRExpression]]
		End Interface
	#End Region

	#Region " Interface Possibility "
		Interface Possibility : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property exp As [[SBVRExpression]]
		End Interface
	#End Region

	#Region " Interface RefSCaption "
		Interface RefSCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property referenceScheme As [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface NoteCaption "
		Interface NoteCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property note As [[Note]]
		End Interface
	#End Region

	#Region " Interface ExCaption "
		Interface ExCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property example As List(Of [[SBVRExpression]]
		End Interface
	#End Region

	#Region " Interface SynCaption "
		Interface SynCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property synonym As List(Of [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface SynFCaption "
		Interface SynFCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property synonymousForm As List(Of [[SBVRExpression]]
		End Interface
	#End Region

	#Region " Interface SeeCaption "
		Interface SeeCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property see As [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface SFCaption "
		Interface SFCaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property subjectField As [[PrimaryRepresentation]]
		End Interface
	#End Region

	#Region " Interface NSURICaption "
		Interface NSURICaption : Inherits Caption
			''' <summary>
			''' Container
			''' </summary>
			Property namespaceURI As [[NameSpaceURI]]
		End Interface
	#End Region

	#Region " Interface PrimaryRepresentation "
		Interface PrimaryRepresentation : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface NotFactTypeRepresentation "
		Interface NotFactTypeRepresentation : Inherits PrimaryRepresentation
			
		End Interface
	#End Region

	#Region " Interface TermRepresentation "
		Interface TermRepresentation : Inherits NotFactTypeRepresentation
			''' <summary>
			''' Container
			''' </summary>
			Property term As List(Of [[StringWord]]
		End Interface
	#End Region

	#Region " Interface NameRepresentation "
		Interface NameRepresentation : Inherits NotFactTypeRepresentation
			Property hasThe As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property name As List(Of [[NameWord]]
		End Interface
	#End Region

	#Region " Interface FactTypeFormRepresentation "
		Interface FactTypeFormRepresentation : Inherits PrimaryRepresentation
			''' <summary>
			''' Container
			''' </summary>
			Property primaryRep1 As [[NotFactTypeRepresentation]]

			Property verbExp As [[Verb]]

			''' <summary>
			''' Container
			''' </summary>
			Property primaryRep2 As [[NotFactTypeRepresentation]]
		End Interface
	#End Region

	#Region " Interface ConceptDefinition "
		Interface ConceptDefinition : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property exp As [[Concept]]

			''' <summary>
			''' Container
			''' </summary>
			Property conjexp As List(Of [[ConjConcept]]
		End Interface
	#End Region

	#Region " Interface ConceptSource "
		Interface ConceptSource : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property source As List(Of [[Word]]
		End Interface
	#End Region

	#Region " Interface Note "
		Interface Note : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property sentences As List(Of [[Sentence]]
		End Interface
	#End Region

	#Region " Interface Sentence "
		Interface Sentence : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property words As List(Of [[Word]]
		End Interface
	#End Region

	#Region " Interface NameSpaceURI "
		Interface NameSpaceURI : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property URI As List(Of [[Word]]
		End Interface
	#End Region

	#Region " Interface Word "
		Interface Word : Inherits LocatedElement
			Property val As [String]
		End Interface
	#End Region

	#Region " Interface StringWord "
		Interface StringWord : Inherits Word
			
		End Interface
	#End Region

	#Region " Interface QuotedStringWord "
		Interface QuotedStringWord : Inherits Word
			
		End Interface
	#End Region

	#Region " Interface NameWord "
		Interface NameWord : Inherits Word
			
		End Interface
	#End Region

	#Region " Interface SBVRExpression "
		Interface SBVRExpression : Inherits LocatedElement
			Property hasPoint As [Boolean]

			''' <summary>
			''' Container
			''' </summary>
			Property firstProposition As [[SimpleSBVRProp]]

			''' <summary>
			''' Container
			''' </summary>
			Property nextProposition As List(Of [[SBVRPropWithKW]]
		End Interface
	#End Region

	#Region " Interface SBVRPropWithKW "
		Interface SBVRPropWithKW : Inherits LocatedElement
			Property conjonction As [[ConjonctionnalKeyWord]]

			Property endConj As [[EndOperator]]

			''' <summary>
			''' Container
			''' </summary>
			Property proposition As [[SimpleSBVRProp]]
		End Interface
	#End Region

	#Region " Interface ModalForm "
		Interface ModalForm : Inherits LocatedElement
			Property modal As [[ModalVerb]]

			Property isNeg As [Boolean]
		End Interface
	#End Region

	#Region " Interface SimpleSBVRProp "
		Interface SimpleSBVRProp : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property modal As [[ModalBegin]]

			''' <summary>
			''' Container
			''' </summary>
			Property concept1 As [[Concept]]

			''' <summary>
			''' Container
			''' </summary>
			Property modalVerb As [[ModalForm]]

			Property verbs As [[Verb]]

			''' <summary>
			''' Container
			''' </summary>
			Property concept2 As [[Concept]]
		End Interface
	#End Region

	#Region " Interface SubSBVRProp "
		Interface SubSBVRProp : Inherits LocatedElement
			Property join As [[Join]]

			Property modalVerb As [[ModalVerb]]

			Property verbs As [[Verb]]

			''' <summary>
			''' Container
			''' </summary>
			Property concept2 As [[Concept]]
		End Interface
	#End Region

	#Region " Interface LinkSBVRConcept "
		Interface LinkSBVRConcept : Inherits LocatedElement
			Property link As [[Link]]

			''' <summary>
			''' Container
			''' </summary>
			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface ConjConcept "
		Interface ConjConcept : Inherits LocatedElement
			Property conjonction As [[ConjonctionnalKeyWord]]

			''' <summary>
			''' Container
			''' </summary>
			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface Concept "
		Interface Concept : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property subProp As [[SubSBVRProp]]

			''' <summary>
			''' Container
			''' </summary>
			Property linkedConcept As [[LinkSBVRConcept]]
		End Interface
	#End Region

	#Region " Interface NameConcept "
		Interface NameConcept : Inherits Concept
			Property the As [[Qualif]]

			''' <summary>
			''' Container
			''' </summary>
			Property name As List(Of [[NameWord]]
		End Interface
	#End Region

	#Region " Interface ObjectConcept "
		Interface ObjectConcept : Inherits Concept
			''' <summary>
			''' Container
			''' </summary>
			Property operatoredConcept As [[NounConcept]]

			''' <summary>
			''' Container
			''' </summary>
			Property qualify As [[Qualification]]
		End Interface
	#End Region

	#Region " Interface StringConcept "
		Interface StringConcept : Inherits Concept
			''' <summary>
			''' Container
			''' </summary>
			Property stringWord As List(Of [[QuotedStringWord]]
		End Interface
	#End Region

	#Region " Interface NounConcept "
		Interface NounConcept : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property qualif As [[Qualifier]]

			''' <summary>
			''' Container
			''' </summary>
			Property noun As List(Of [[StringWord]]
		End Interface
	#End Region

	#Region " Interface Qualification "
		Interface Qualification : Inherits LocatedElement
			''' <summary>
			''' Container
			''' </summary>
			Property generalConcept As List(Of [[GeneralConcept]]
		End Interface
	#End Region

	#Region " Interface GeneralConcept "
		Interface GeneralConcept : Inherits LocatedElement
			
		End Interface
	#End Region

	#Region " Interface NameGConcept "
		Interface NameGConcept : Inherits GeneralConcept
			''' <summary>
			''' Container
			''' </summary>
			Property name As [[NameConcept]]
		End Interface
	#End Region

	#Region " Interface NounGConcept "
		Interface NounGConcept : Inherits GeneralConcept
			''' <summary>
			''' Container
			''' </summary>
			Property noun As List(Of [[StringWord]]
		End Interface
	#End Region

	#Region " Interface Qualifier "
		Interface Qualifier : Inherits LocatedElement
			Property op As [[Qualif]]

			Property endOperator As [[EndOperator]]

			''' <summary>
			''' Container
			''' </summary>
			Property min As [[StringWord]]

			''' <summary>
			''' Container
			''' </summary>
			Property max As [[StringWord]]
		End Interface
	#End Region

	#Region " Interface ModalBegin "
		Interface ModalBegin : Inherits LocatedElement
			Property endOperator As [[EndOperator]]
		End Interface
	#End Region

	#Region " Interface ModalBeginC "
		Interface ModalBeginC : Inherits ModalBegin
			
		End Interface
	#End Region

	#Region " Enum Verb "
		Enum Verb
				[[is]]
				[relevant]
				[comprises]
				[[to]]
				[work]
				[in]
				[trades]
				[[as]]
				[are]
				[accepted]
				[generally]
				[important]
				[across]
				[share]
				[sets]
				[assigned]
				[by]
				[contains]
				[[for]]
				[has]
				[specifies]
				[specified]
			End Enum
	#End Region

	#Region " Enum ConjonctionnalKeyWord "
		Enum ConjonctionnalKeyWord
				[[and]]
				[[or]]
				[[if]]
				[whether]
			End Enum
	#End Region

	#Region " Enum ModalVerb "
		Enum ModalVerb
				[must]
				[may]
				[never]
				[always]
			End Enum
	#End Region

	#Region " Enum Join "
		Enum Join
				[that]
				[who]
			End Enum
	#End Region

	#Region " Enum Link "
		Enum Link
				[of]
				[quoteS]
			End Enum
	#End Region

	#Region " Enum Qualif "
		Enum Qualif
				[the]
				[The]
				[a]
				[A]
				[an]
				[An]
				[[Each]]
				[[each]]
				[Some]
				[some]
				[At]
				[at]
				[Exactly]
				[exactly]
			End Enum
	#End Region

	#Region " Enum EndOperator "
		Enum EndOperator
				[given]
				[thanone]
				[one]
				[isobligatorythat]
				[ispermittedthat]
				[isprohibitedthat]
				[isnecessarythat]
				[ispossiblethat]
				[isimpossiblethat]
				[isnotthecasethat]
				[least]
				[leastone]
				[most]
				[mostone]
				[leastnandatmostm]
				[andonlyif]
				[ornot]
				[[not]]
				[of]
			End Enum
	#End Region
End Namespace
