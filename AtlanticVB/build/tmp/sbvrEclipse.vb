Namespace SBVR

	#Region " Interface Actuality "
		Interface Actuality : Inherits StateOfAffairs
			
		End Interface
	#End Region

	#Region " Interface StateOfAffairs "
		Interface StateOfAffairs : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Thing "
		Interface Thing
			Property name As List(Of [[Name]]
		End Interface
	#End Region

	#Region " Interface Name "
		Interface Name : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface Designation "
		Interface Designation : Inherits Representation
			Property implicitlyIsUnderstood As [Boolean]

			Property signifier As [[Expression]]
		End Interface
	#End Region

	#Region " Interface Representation "
		Interface Representation : Inherits Actuality
			Property meaning As [[Meaning]]

			Property expression As [[Expression]]
		End Interface
	#End Region

	#Region " Interface Meaning "
		Interface Meaning : Inherits Thing
			Property representation As List(Of [[Representation]]
		End Interface
	#End Region

	#Region " Interface Expression "
		Interface Expression : Inherits BindableTarget
			
		End Interface
	#End Region

	#Region " Interface BindableTarget "
		Interface BindableTarget : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface AdoptedDefinition "
		Interface AdoptedDefinition : Inherits Definition
			
		End Interface
	#End Region

	#Region " Interface Definition "
		Interface Definition : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface Advice "
		Interface Advice : Inherits ElementOfGuidance
			
		End Interface
	#End Region

	#Region " Interface ElementOfGuidance "
		Interface ElementOfGuidance : Inherits Proposition
			Property isPracticable As [Boolean]
		End Interface
	#End Region

	#Region " Interface Proposition "
		Interface Proposition : Inherits Meaning
			Property isFalse As [Boolean]

			Property isTrue As [Boolean]

			Property statement As List(Of [[Statement]]

			Property isPossiblyTrue As [Boolean]

			Property isObligatedToBeTrue As [Boolean]

			Property isPermittedToBeTrue As [Boolean]

			Property isNecessarilyTrue As [Boolean]
		End Interface
	#End Region

	#Region " Interface Statement "
		Interface Statement : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface AdviceOfContingency "
		Interface AdviceOfContingency : Inherits AdviceOfPossibility
			
		End Interface
	#End Region

	#Region " Interface AdviceOfPossibility "
		Interface AdviceOfPossibility : Inherits Advice
			
		End Interface
	#End Region

	#Region " Interface AdviceOfOptionality "
		Interface AdviceOfOptionality : Inherits AdviceOfPermission
			
		End Interface
	#End Region

	#Region " Interface AdviceOfPermission "
		Interface AdviceOfPermission : Inherits Advice
			
		End Interface
	#End Region

	#Region " Interface AdviceStatement "
		Interface AdviceStatement : Inherits GuidanceStatement
			
		End Interface
	#End Region

	#Region " Interface GuidanceStatement "
		Interface GuidanceStatement : Inherits Statement
			
		End Interface
	#End Region

	#Region " Interface AggregationFormulation "
		Interface AggregationFormulation : Inherits ProjectingFormulation
			
		End Interface
	#End Region

	#Region " Interface ProjectingFormulation "
		Interface ProjectingFormulation : Inherits LogicalFormulation
			Property projection As [[Projection]]
		End Interface
	#End Region

	#Region " Interface LogicalFormulation "
		Interface LogicalFormulation : Inherits SemanticFormulation
			
		End Interface
	#End Region

	#Region " Interface SemanticFormulation "
		Interface SemanticFormulation : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Projection "
		Interface Projection : Inherits SemanticFormulation
			Property constrainingFormulation As [[LogicalFormulation]]

			Property projectionVariable As List(Of [[Variable]]

			Property auxiliaryVariable As List(Of [[AuxiliaryVariable]]
		End Interface
	#End Region

	#Region " Interface Variable "
		Interface Variable : Inherits BindableTarget
			Property restrictingFormulation As [[LogicalFormulation]]

			Property projectionPosition As [[PositiveInteger]]

			Property rangedoverConcept As [[Concept]]

			Property isUnitary As [Boolean]
		End Interface
	#End Region

	#Region " Interface PositiveInteger "
		Interface PositiveInteger : Inherits NonnegativeInteger
			
		End Interface
	#End Region

	#Region " Interface NonnegativeInteger "
		Interface NonnegativeInteger : Inherits [Integer]
			
		End Interface
	#End Region

	#Region " Interface [Integer] "
		Interface [Integer] : Inherits Number
			Property value As [integer]
		End Interface
	#End Region

	#Region " Interface Number "
		Interface Number : Inherits Quantity
			
		End Interface
	#End Region

	#Region " Interface Quantity "
		Interface Quantity : Inherits NounConcept
			
		End Interface
	#End Region

	#Region " Interface NounConcept "
		Interface NounConcept : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface Concept "
		Interface Concept : Inherits Meaning
			Property attributiveNamespace As List(Of [[AttributiveNamespace]]

			Property definition As List(Of [[Definition]]

			Property moreGeneralConcept As List(Of [[Concept]]

			Property category As List(Of [[Concept]]

			Property essentialCharacteristic As List(Of [[Characteristic]]

			Property instance As List(Of [[Thing]]

			Property referenceScheme As List(Of [[ReferenceScheme]]

			Property impliedCharacteristic As List(Of [[Characteristic]]

			Property necessaryCharacteristic As List(Of [[Characteristic]]

			Property designation As List(Of [[Designation]]

			Property extension As [[Set]]
		End Interface
	#End Region

	#Region " Interface AttributiveNamespace "
		Interface AttributiveNamespace : Inherits [Namespace]
			
		End Interface
	#End Region

	#Region " Interface [Namespace] "
		Interface [Namespace] : Inherits Thing
			Property uri As List(Of [[Uri]]
		End Interface
	#End Region

	#Region " Interface Uri "
		Interface Uri : Inherits Text
			
		End Interface
	#End Region

	#Region " Interface Text "
		Interface Text : Inherits Expression
			Property value As [String]
		End Interface
	#End Region

	#Region " Interface Characteristic "
		Interface Characteristic : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface FactType "
		Interface FactType : Inherits Concept
			Property factTypeForm As List(Of [[FactTypeForm]]

			Property role As List(Of [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface FactTypeForm "
		Interface FactTypeForm : Inherits Representation
			Property placeholder As List(Of [[Placeholder]]
		End Interface
	#End Region

	#Region " Interface Placeholder "
		Interface Placeholder : Inherits Designation
			Property startingCharacterPosition As [[PositiveInteger]]
		End Interface
	#End Region

	#Region " Interface FactTypeRole "
		Interface FactTypeRole : Inherits Role
			Property roleBinding As List(Of [[RoleBinding]]
		End Interface
	#End Region

	#Region " Interface Role "
		Interface Role : Inherits NounConcept
			
		End Interface
	#End Region

	#Region " Interface RoleBinding "
		Interface RoleBinding : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface ReferenceScheme "
		Interface ReferenceScheme : Inherits Thing
			Property simplyUsedRole As List(Of [[FactTypeRole]]

			Property identifyingCharacteristic As List(Of [[Characteristic]]

			Property extensionallyUsedRole As List(Of [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface [Set] "
		Interface [Set] : Inherits Thing
			Property cardinality As [[NonnegativeInteger]]

			Property element As List(Of [[Thing]]
		End Interface
	#End Region

	#Region " Interface AuxiliaryVariable "
		Interface AuxiliaryVariable : Inherits Variable
			
		End Interface
	#End Region

	#Region " Interface AnswerNominalization "
		Interface AnswerNominalization : Inherits ProjectingFormulation
			
		End Interface
	#End Region

	#Region " Interface AssociativeFactType "
		Interface AssociativeFactType : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface AssortmentFactType "
		Interface AssortmentFactType : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface AtleastnQuantification "
		Interface AtleastnQuantification : Inherits Quantification
			Property minimumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface Quantification "
		Interface Quantification : Inherits LogicalFormulation
			Property scopeFormulation As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface AtmostnQuantification "
		Interface AtmostnQuantification : Inherits Quantification
			Property maximumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface AtmostoneQuantification "
		Interface AtmostoneQuantification : Inherits AtmostnQuantification
			
		End Interface
	#End Region

	#Region " Interface AtomicFormulation "
		Interface AtomicFormulation : Inherits LogicalFormulation
			Property roleBinding As List(Of [[RoleBinding]]
		End Interface
	#End Region

	#Region " Interface BagProjection "
		Interface BagProjection : Inherits Projection
			
		End Interface
	#End Region

	#Region " Interface BinaryFactType "
		Interface BinaryFactType : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface BinaryLogicalOperation "
		Interface BinaryLogicalOperation : Inherits LogicalOperation
			Property logicalOperand2 As List(Of [[LogicalFormulation]]

			Property logicalOperand1 As List(Of [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface LogicalOperation "
		Interface LogicalOperation : Inherits LogicalFormulation
			Property logicalOperand As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface BodyOfSharedConcepts "
		Interface BodyOfSharedConcepts : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface BodyOfSharedGuidance "
		Interface BodyOfSharedGuidance : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface BodyOfSharedMeanings "
		Interface BodyOfSharedMeanings : Inherits [Set]
			Property elementaryFactType As List(Of [[FactType]]
		End Interface
	#End Region

	#Region " Interface BusinessPolicy "
		Interface BusinessPolicy : Inherits ElementOfGovernance
			
		End Interface
	#End Region

	#Region " Interface ElementOfGovernance "
		Interface ElementOfGovernance : Inherits ElementOfGuidance
			Property isDirectlyEnforceable As [Boolean]
		End Interface
	#End Region

	#Region " Interface BusinessPolicyStatement "
		Interface BusinessPolicyStatement : Inherits GuidanceStatement
			
		End Interface
	#End Region

	#Region " Interface BusinessRule "
		Interface BusinessRule : Inherits ElementOfGuidance, Rule
			
		End Interface
	#End Region

	#Region " Interface Rule "
		Interface Rule : Inherits Proposition
			
		End Interface
	#End Region

	#Region " Interface BusinessVocabulary "
		Interface BusinessVocabulary : Inherits Vocabulary
			
		End Interface
	#End Region

	#Region " Interface Vocabulary "
		Interface Vocabulary : Inherits [Set]
			
		End Interface
	#End Region

	#Region " Interface CategorizationFactType "
		Interface CategorizationFactType : Inherits SpecializationFactType
			
		End Interface
	#End Region

	#Region " Interface SpecializationFactType "
		Interface SpecializationFactType : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface CategorizationScheme "
		Interface CategorizationScheme : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface CategorizationType "
		Interface CategorizationType : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface CharacteristicType "
		Interface CharacteristicType : Inherits ConceptType
			
		End Interface
	#End Region

	#Region " Interface ConceptType "
		Interface ConceptType : Inherits ObjectType
			
		End Interface
	#End Region

	#Region " Interface ObjectType "
		Interface ObjectType : Inherits Concept
			Property categorizationScheme As List(Of [[CategorizationScheme]]

			Property categorizationType As List(Of [[CategorizationType]]
		End Interface
	#End Region

	#Region " Interface ClosedLogicalFormulation "
		Interface ClosedLogicalFormulation : Inherits ClosedSemanticFormulation, LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface ClosedSemanticFormulation "
		Interface ClosedSemanticFormulation : Inherits SemanticFormulation
			
		End Interface
	#End Region

	#Region " Interface ClosedProjection "
		Interface ClosedProjection : Inherits Projection
			
		End Interface
	#End Region

	#Region " Interface CommunicationContent "
		Interface CommunicationContent : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface Community "
		Interface Community : Inherits Thing
			Property uri As List(Of [[Uri]]

			Property subcommunity As List(Of [[Community]]
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsComposite "
		Interface ConceptOfThingAsComposite : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsContinuant "
		Interface ConceptOfThingAsContinuant : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsDeveloped "
		Interface ConceptOfThingAsDeveloped : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsOccurrent "
		Interface ConceptOfThingAsOccurrent : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsPrimitive "
		Interface ConceptOfThingAsPrimitive : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingAsUnitary "
		Interface ConceptOfThingAsUnitary : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingExistingDependently "
		Interface ConceptOfThingExistingDependently : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptOfThingExistingIndependently "
		Interface ConceptOfThingExistingIndependently : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface ConceptualSchema "
		Interface ConceptualSchema : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Conjunction "
		Interface Conjunction : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface ContextOfThing "
		Interface ContextOfThing : Inherits Segmentation
			
		End Interface
	#End Region

	#Region " Interface Segmentation "
		Interface Segmentation : Inherits CategorizationScheme
			
		End Interface
	#End Region

	#Region " Interface ContextualizationFactType "
		Interface ContextualizationFactType : Inherits SpecializationFactType
			
		End Interface
	#End Region

	#Region " Interface ContextualizedConcept "
		Interface ContextualizedConcept : Inherits NounConcept
			
		End Interface
	#End Region

	#Region " Interface ContingencyStatement "
		Interface ContingencyStatement : Inherits StatementOfAdviceOfPossibility
			
		End Interface
	#End Region

	#Region " Interface StatementOfAdviceOfPossibility "
		Interface StatementOfAdviceOfPossibility : Inherits AdviceStatement
			
		End Interface
	#End Region

	#Region " Interface DefiniteDescription "
		Interface DefiniteDescription : Inherits IntensionalDefinition
			
		End Interface
	#End Region

	#Region " Interface IntensionalDefinition "
		Interface IntensionalDefinition : Inherits Definition
			
		End Interface
	#End Region

	#Region " Interface DerivableConcept "
		Interface DerivableConcept : Inherits Concept
			
		End Interface
	#End Region

	#Region " Interface Description "
		Interface Description : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface DescriptiveExample "
		Interface DescriptiveExample : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface Disjunction "
		Interface Disjunction : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface Equivalence "
		Interface Equivalence : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface ExactlynQuantification "
		Interface ExactlynQuantification : Inherits Quantification
			Property cardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface ExactlyoneQuantification "
		Interface ExactlyoneQuantification : Inherits ExactlynQuantification
			
		End Interface
	#End Region

	#Region " Interface ExclusiveDisjunction "
		Interface ExclusiveDisjunction : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface ExistentialQuantification "
		Interface ExistentialQuantification : Inherits AtleastnQuantification
			
		End Interface
	#End Region

	#Region " Interface ExplicitnessOfRepresentation "
		Interface ExplicitnessOfRepresentation : Inherits CategorizationScheme
			
		End Interface
	#End Region

	#Region " Interface ExtensionalDefinition "
		Interface ExtensionalDefinition : Inherits Definition
			
		End Interface
	#End Region

	#Region " Interface Facet "
		Interface Facet : Inherits ContextualizedConcept
			
		End Interface
	#End Region

	#Region " Interface Fact "
		Interface Fact : Inherits Proposition
			
		End Interface
	#End Region

	#Region " Interface FactModel "
		Interface FactModel : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface FactSymbol "
		Interface FactSymbol : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface FactTypeHasFactInFactModel "
		Interface FactTypeHasFactInFactModel
			Property factType As [[FactType]]

			Property fact As [[Fact]]

			Property factModel As [[FactModel]]
		End Interface
	#End Region

	#Region " Interface FactTypeNominalization "
		Interface FactTypeNominalization : Inherits ProjectingFormulation
			
		End Interface
	#End Region

	#Region " Interface FactTypeRoleDesignation "
		Interface FactTypeRoleDesignation : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface FactTypeTemplating "
		Interface FactTypeTemplating : Inherits CategorizationScheme
			
		End Interface
	#End Region

	#Region " Interface FormalRepresentation "
		Interface FormalRepresentation : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface FundamentalConcept "
		Interface FundamentalConcept : Inherits ObjectType
			
		End Interface
	#End Region

	#Region " Interface Icon "
		Interface Icon : Inherits NonverbalDesignation
			
		End Interface
	#End Region

	#Region " Interface NonverbalDesignation "
		Interface NonverbalDesignation : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface Implication "
		Interface Implication : Inherits BinaryLogicalOperation
			Property consequent As List(Of [[LogicalFormulation]]

			Property antecedent As List(Of [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface ImpossibilityStatement "
		Interface ImpossibilityStatement : Inherits StructuralRuleStatement
			
		End Interface
	#End Region

	#Region " Interface StructuralRuleStatement "
		Interface StructuralRuleStatement : Inherits RuleStatement
			
		End Interface
	#End Region

	#Region " Interface RuleStatement "
		Interface RuleStatement : Inherits GuidanceStatement
			
		End Interface
	#End Region

	#Region " Interface IndividualConcept "
		Interface IndividualConcept : Inherits NounConcept, BindableTarget
			
		End Interface
	#End Region

	#Region " Interface InformalRepresentation "
		Interface InformalRepresentation : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface InstantiationFormulation "
		Interface InstantiationFormulation : Inherits LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface IsfacetofFactType "
		Interface IsfacetofFactType : Inherits ContextualizationFactType
			
		End Interface
	#End Region

	#Region " Interface IspropertyofFactType "
		Interface IspropertyofFactType : Inherits AssociativeFactType
			
		End Interface
	#End Region

	#Region " Interface IsroleofFactType "
		Interface IsroleofFactType : Inherits FactType
			
		End Interface
	#End Region

	#Region " Interface KindOfGuidanceStatement "
		Interface KindOfGuidanceStatement : Inherits CategorizationScheme
			
		End Interface
	#End Region

	#Region " Interface Language "
		Interface Language : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface LevelOfEnforcement "
		Interface LevelOfEnforcement : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface LogicalFormulationKind "
		Interface LogicalFormulationKind : Inherits ObjectType
			
		End Interface
	#End Region

	#Region " Interface LogicalNegation "
		Interface LogicalNegation : Inherits LogicalOperation
			
		End Interface
	#End Region

	#Region " Interface ModalFormulation "
		Interface ModalFormulation : Inherits LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface NandFormulation "
		Interface NandFormulation : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface NecessityFormulation "
		Interface NecessityFormulation : Inherits ModalFormulation
			
		End Interface
	#End Region

	#Region " Interface NecessityStatement "
		Interface NecessityStatement : Inherits StructuralRuleStatement
			
		End Interface
	#End Region

	#Region " Interface NonnecessityStatement "
		Interface NonnecessityStatement : Inherits StatementOfAdviceOfPossibility
			
		End Interface
	#End Region

	#Region " Interface NonobligationStatement "
		Interface NonobligationStatement : Inherits StatementOfAdviceOfPermission
			
		End Interface
	#End Region

	#Region " Interface StatementOfAdviceOfPermission "
		Interface StatementOfAdviceOfPermission : Inherits AdviceStatement
			
		End Interface
	#End Region

	#Region " Interface NorFormulation "
		Interface NorFormulation : Inherits BinaryLogicalOperation
			
		End Interface
	#End Region

	#Region " Interface Note "
		Interface Note : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface NounConceptNominalization "
		Interface NounConceptNominalization : Inherits ProjectingFormulation
			
		End Interface
	#End Region

	#Region " Interface NounForm "
		Interface NounForm : Inherits FactTypeForm
			
		End Interface
	#End Region

	#Region " Interface NumericRangeQuantification "
		Interface NumericRangeQuantification : Inherits Quantification
			Property maximumCardinality As [[NonnegativeInteger]]

			Property minimumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface Objectification "
		Interface Objectification : Inherits LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface ObligationFormulation "
		Interface ObligationFormulation : Inherits ModalFormulation
			
		End Interface
	#End Region

	#Region " Interface ObligationStatement "
		Interface ObligationStatement : Inherits OperativeBusinessRuleStatement
			
		End Interface
	#End Region

	#Region " Interface OperativeBusinessRuleStatement "
		Interface OperativeBusinessRuleStatement : Inherits RuleStatement
			
		End Interface
	#End Region

	#Region " Interface OperativeBusinessRule "
		Interface OperativeBusinessRule : Inherits ElementOfGovernance, BusinessRule
			Property levelOfEnforcement As List(Of [[LevelOfEnforcement]]
		End Interface
	#End Region

	#Region " Interface OptionalityStatement "
		Interface OptionalityStatement : Inherits StatementOfAdviceOfPermission
			
		End Interface
	#End Region

	#Region " Interface OwnedDefinition "
		Interface OwnedDefinition : Inherits Definition
			
		End Interface
	#End Region

	#Region " Interface PartitiveFactType "
		Interface PartitiveFactType : Inherits BinaryFactType
			
		End Interface
	#End Region

	#Region " Interface PermissibilityFormulation "
		Interface PermissibilityFormulation : Inherits ModalFormulation
			
		End Interface
	#End Region

	#Region " Interface PermissionStatement "
		Interface PermissionStatement : Inherits StatementOfAdviceOfPermission
			
		End Interface
	#End Region

	#Region " Interface PossibilityFormulation "
		Interface PossibilityFormulation : Inherits ModalFormulation
			
		End Interface
	#End Region

	#Region " Interface PossibilityStatement "
		Interface PossibilityStatement : Inherits StatementOfAdviceOfPossibility
			
		End Interface
	#End Region

	#Region " Interface PreferredDesignation "
		Interface PreferredDesignation : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface ProhibitedDesignation "
		Interface ProhibitedDesignation : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface ProhibitionStatement "
		Interface ProhibitionStatement : Inherits OperativeBusinessRuleStatement
			
		End Interface
	#End Region

	#Region " Interface PropositionNominalization "
		Interface PropositionNominalization : Inherits LogicalFormulation
			
		End Interface
	#End Region

	#Region " Interface Question "
		Interface Question : Inherits Meaning
			
		End Interface
	#End Region

	#Region " Interface QuestionNominalization "
		Interface QuestionNominalization : Inherits ProjectingFormulation
			
		End Interface
	#End Region

	#Region " Interface RealworldNumericalCorrespondence "
		Interface RealworldNumericalCorrespondence : Inherits CategorizationScheme
			
		End Interface
	#End Region

	#Region " Interface Reference "
		Interface Reference : Inherits Representation
			
		End Interface
	#End Region

	#Region " Interface RepresentationFormality "
		Interface RepresentationFormality : Inherits Segmentation
			
		End Interface
	#End Region

	#Region " Interface Res "
		Interface Res : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface RestrictedPermissionStatement "
		Interface RestrictedPermissionStatement : Inherits OperativeBusinessRuleStatement
			
		End Interface
	#End Region

	#Region " Interface RestrictedPossibilityStatement "
		Interface RestrictedPossibilityStatement : Inherits StructuralRuleStatement
			
		End Interface
	#End Region

	#Region " Interface Rulebook "
		Interface Rulebook : Inherits [Set]
			
		End Interface
	#End Region

	#Region " Interface SemanticCommunity "
		Interface SemanticCommunity : Inherits Community
			Property speechCommunity As List(Of [[SpeechCommunity]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunity "
		Interface SpeechCommunity : Inherits Community
			
		End Interface
	#End Region

	#Region " Interface SententialForm "
		Interface SententialForm : Inherits FactTypeForm
			
		End Interface
	#End Region

	#Region " Interface SetProjection "
		Interface SetProjection : Inherits Projection
			
		End Interface
	#End Region

	#Region " Interface Situation "
		Interface Situation : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface SituationalRole "
		Interface SituationalRole : Inherits ObjectType, Role
			
		End Interface
	#End Region

	#Region " Interface SpeechCommunityAdoptsAdoptedDefinitionCitingReference "
		Interface SpeechCommunityAdoptsAdoptedDefinitionCitingReference
			Property speechCommunity As [[SpeechCommunity]]

			Property adoptedDefinition As [[AdoptedDefinition]]

			Property reference As [[Reference]]
		End Interface
	#End Region

	#Region " Interface StateOfAffairsInvolvesThingInRole "
		Interface StateOfAffairsInvolvesThingInRole
			Property stateOfAffairs As [[StateOfAffairs]]

			Property thing As [[Thing]]

			Property role As [[Role]]
		End Interface
	#End Region

	#Region " Interface StructuralBusinessRule "
		Interface StructuralBusinessRule : Inherits BusinessRule, StructuralRule
			
		End Interface
	#End Region

	#Region " Interface StructuralRule "
		Interface StructuralRule : Inherits Rule
			
		End Interface
	#End Region

	#Region " Interface SubjectField "
		Interface SubjectField : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Term "
		Interface Term : Inherits Designation
			
		End Interface
	#End Region

	#Region " Interface TerminologicalDictionary "
		Interface TerminologicalDictionary : Inherits Thing
			''' <summary>
			''' Container
			''' </summary>
			Property uri As List(Of [[Uri]]
		End Interface
	#End Region

	#Region " Interface ThingInContext "
		Interface ThingInContext : Inherits Segmentation
			
		End Interface
	#End Region

	#Region " Interface UniversalQuantification "
		Interface UniversalQuantification : Inherits Quantification
			
		End Interface
	#End Region

	#Region " Interface Viewpoint "
		Interface Viewpoint : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface VocabularyNamespace "
		Interface VocabularyNamespace : Inherits [Namespace]
			
		End Interface
	#End Region

	#Region " Interface WhetherornotFormulation "
		Interface WhetherornotFormulation : Inherits BinaryLogicalOperation
			Property inconsequent As List(Of [[LogicalFormulation]]

			Property consequent As List(Of [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface AtleastnQuantificationHasMinimumCardinality "
		Interface AtleastnQuantificationHasMinimumCardinality
			Property atleastnQuantification As [[AtleastnQuantification]]

			Property minimumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface AtmostnQuantificationHasMaximumCardinality "
		Interface AtmostnQuantificationHasMaximumCardinality
			Property atmostnQuantification As [[AtmostnQuantification]]

			Property maximumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface AtomicFormulationIsBasedOnFactType "
		Interface AtomicFormulationIsBasedOnFactType
			Property atomicFormulation As [[AtomicFormulation]]

			Property factType As [[FactType]]
		End Interface
	#End Region

	#Region " Interface AttributiveNamespaceIsForSubjectConcept "
		Interface AttributiveNamespaceIsForSubjectConcept
			Property attributiveNamespace As [[AttributiveNamespace]]

			Property subjectConcept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface AttributiveNamespaceIsWithinVocabularyNamespace "
		Interface AttributiveNamespaceIsWithinVocabularyNamespace
			Property attributiveNamespace As [[AttributiveNamespace]]

			Property vocabularyNamespace As [[VocabularyNamespace]]
		End Interface
	#End Region

	#Region " Interface BinaryLogicalOperationHasLogicalOperand1 "
		Interface BinaryLogicalOperationHasLogicalOperand1
			Property binaryLogicalOperation As [[BinaryLogicalOperation]]

			Property logicalOperand1 As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface BinaryLogicalOperationHasLogicalOperand2 "
		Interface BinaryLogicalOperationHasLogicalOperand2
			Property binaryLogicalOperation As [[BinaryLogicalOperation]]

			Property logicalOperand2 As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface BodyOfSharedMeaningsIncludesBodyOfSharedConcepts "
		Interface BodyOfSharedMeaningsIncludesBodyOfSharedConcepts
			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]

			Property bodyOfSharedConcepts As [[BodyOfSharedConcepts]]
		End Interface
	#End Region

	#Region " Interface BodyOfSharedMeaningsIncludesBodyOfSharedGuidance "
		Interface BodyOfSharedMeaningsIncludesBodyOfSharedGuidance
			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]

			Property bodyOfSharedGuidance As [[BodyOfSharedGuidance]]
		End Interface
	#End Region

	#Region " Interface BodyOfSharedMeaningsUnitesSemanticCommunity "
		Interface BodyOfSharedMeaningsUnitesSemanticCommunity
			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]

			Property semanticCommunity As [[SemanticCommunity]]
		End Interface
	#End Region

	#Region " Interface BodyOfSharedMeanings1ContainsBodyOfSharedMeanings2 "
		Interface BodyOfSharedMeanings1ContainsBodyOfSharedMeanings2
			Property bodyOfSharedMeanings1 As [[BodyOfSharedMeanings]]

			Property bodyOfSharedMeanings2 As [[BodyOfSharedMeanings]]
		End Interface
	#End Region

	#Region " Interface BusinessPolicyIsBasisForAdvice "
		Interface BusinessPolicyIsBasisForAdvice
			Property businessPolicy As [[BusinessPolicy]]

			Property advice As [[Advice]]
		End Interface
	#End Region

	#Region " Interface BusinessRuleIsDerivedFromBusinessPolicy "
		Interface BusinessRuleIsDerivedFromBusinessPolicy
			Property businessRule As [[BusinessRule]]

			Property businessPolicy As [[BusinessPolicy]]
		End Interface
	#End Region

	#Region " Interface CategorizationSchemeContainsCategory "
		Interface CategorizationSchemeContainsCategory
			Property categorizationScheme As [[CategorizationScheme]]

			Property category As [[Concept]]
		End Interface
	#End Region

	#Region " Interface CategorizationSchemeIsForGeneralConcept "
		Interface CategorizationSchemeIsForGeneralConcept
			Property categorizationScheme As [[CategorizationScheme]]

			Property generalConcept As [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface CategorizationTypeIsForGeneralConcept "
		Interface CategorizationTypeIsForGeneralConcept
			Property categorizationType As [[CategorizationType]]

			Property generalConcept As [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface ClosedLogicalFormulationFormalizesStatement "
		Interface ClosedLogicalFormulationFormalizesStatement
			Property closedLogicalFormulation As [[ClosedLogicalFormulation]]

			Property statement As [[Statement]]
		End Interface
	#End Region

	#Region " Interface ClosedLogicalFormulationMeansProposition "
		Interface ClosedLogicalFormulationMeansProposition
			Property closedLogicalFormulation As [[ClosedLogicalFormulation]]

			Property proposition As [[Proposition]]
		End Interface
	#End Region

	#Region " Interface ClosedProjectionDefinesFactType "
		Interface ClosedProjectionDefinesFactType
			Property closedProjection As [[ClosedProjection]]

			Property factType As [[FactType]]
		End Interface
	#End Region

	#Region " Interface ClosedProjectionDefinesNounConcept "
		Interface ClosedProjectionDefinesNounConcept
			Property closedProjection As [[ClosedProjection]]

			Property nounConcept As [[NounConcept]]
		End Interface
	#End Region

	#Region " Interface ClosedProjectionFormalizesDefinition "
		Interface ClosedProjectionFormalizesDefinition
			Property closedProjection As [[ClosedProjection]]

			Property definition As [[Definition]]
		End Interface
	#End Region

	#Region " Interface ClosedProjectionMeansQuestion "
		Interface ClosedProjectionMeansQuestion
			Property closedProjection As [[ClosedProjection]]

			Property question As [[Question]]
		End Interface
	#End Region

	#Region " Interface ClosedSemanticFormulationFormulatesMeaning "
		Interface ClosedSemanticFormulationFormulatesMeaning
			Property closedSemanticFormulation As [[ClosedSemanticFormulation]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface CommunicationContentIsComposedOfRepresentation "
		Interface CommunicationContentIsComposedOfRepresentation
			Property communicationContent As [[CommunicationContent]]

			Property representation As [[Representation]]
		End Interface
	#End Region

	#Region " Interface CommunityHasSubcommunity "
		Interface CommunityHasSubcommunity
			Property community As [[Community]]

			Property subcommunity As [[Community]]
		End Interface
	#End Region

	#Region " Interface CommunityHasUri "
		Interface CommunityHasUri
			Property community As [[Community]]

			Property uri As [[Uri]]
		End Interface
	#End Region

	#Region " Interface ConceptHasDefinition "
		Interface ConceptHasDefinition
			Property concept As [[Concept]]

			Property definition As [[Definition]]
		End Interface
	#End Region

	#Region " Interface ConceptHasDesignation "
		Interface ConceptHasDesignation
			Property concept As [[Concept]]

			Property designation As [[Designation]]
		End Interface
	#End Region

	#Region " Interface ConceptHasExtension "
		Interface ConceptHasExtension
			Property concept As [[Concept]]

			Property extension As [[Set]]
		End Interface
	#End Region

	#Region " Interface ConceptHasImpliedCharacteristic "
		Interface ConceptHasImpliedCharacteristic
			Property concept As [[Concept]]

			Property impliedCharacteristic As [[Characteristic]]
		End Interface
	#End Region

	#Region " Interface ConceptHasInstance "
		Interface ConceptHasInstance
			Property concept As [[Concept]]

			Property instance As [[Thing]]
		End Interface
	#End Region

	#Region " Interface ConceptHasNecessaryCharacteristic "
		Interface ConceptHasNecessaryCharacteristic
			Property concept As [[Concept]]

			Property necessaryCharacteristic As [[Characteristic]]
		End Interface
	#End Region

	#Region " Interface ConceptHasSharedUnderstandingBySemanticCommunity "
		Interface ConceptHasSharedUnderstandingBySemanticCommunity
			Property concept As [[Concept]]

			Property semanticCommunity As [[SemanticCommunity]]
		End Interface
	#End Region

	#Region " Interface ConceptIncorporatesCharacteristic "
		Interface ConceptIncorporatesCharacteristic
			Property concept As [[Concept]]

			Property characteristic As [[Characteristic]]
		End Interface
	#End Region

	#Region " Interface ConceptIsClosedInConceptualSchema "
		Interface ConceptIsClosedInConceptualSchema
			Property concept As [[Concept]]

			Property conceptualSchema As [[ConceptualSchema]]
		End Interface
	#End Region

	#Region " Interface ConceptIsIncludedInBodyOfSharedConcepts "
		Interface ConceptIsIncludedInBodyOfSharedConcepts
			Property concept As [[Concept]]

			Property bodyOfSharedConcepts As [[BodyOfSharedConcepts]]
		End Interface
	#End Region

	#Region " Interface Concept1IsCoextensiveWithConcept2 "
		Interface Concept1IsCoextensiveWithConcept2
			Property concept1 As [[Concept]]

			Property concept2 As [[Concept]]
		End Interface
	#End Region

	#Region " Interface Concept1SpecializesConcept2 "
		Interface Concept1SpecializesConcept2
			Property concept1 As [[Concept]]

			Property concept2 As [[Concept]]
		End Interface
	#End Region

	#Region " Interface ConceptualSchemaIncludesConcept "
		Interface ConceptualSchemaIncludesConcept
			Property conceptualSchema As [[ConceptualSchema]]

			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface ConceptualSchemaIncludesFact "
		Interface ConceptualSchemaIncludesFact
			Property conceptualSchema As [[ConceptualSchema]]

			Property fact As [[Fact]]
		End Interface
	#End Region

	#Region " Interface DefinitionServesAsDesignation "
		Interface DefinitionServesAsDesignation
			Property definition As [[Definition]]

			Property designation As [[Designation]]
		End Interface
	#End Region

	#Region " Interface DescriptionPortraysMeaning "
		Interface DescriptionPortraysMeaning
			Property description As [[Description]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface DescriptiveExampleIllustratesMeaning "
		Interface DescriptiveExampleIllustratesMeaning
			Property descriptiveExample As [[DescriptiveExample]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface DesignationHasSignifier "
		Interface DesignationHasSignifier
			Property designation As [[Designation]]

			Property signifier As [[Expression]]
		End Interface
	#End Region

	#Region " Interface DesignationIsInNamespace "
		Interface DesignationIsInNamespace
			Property designation As [[Designation]]

			Property [namespace] As [[Namespace]]
		End Interface
	#End Region

	#Region " Interface ElementOfGuidanceAuthorizesStateOfAffairs "
		Interface ElementOfGuidanceAuthorizesStateOfAffairs
			Property elementOfGuidance As [[ElementOfGuidance]]

			Property stateOfAffairs As [[StateOfAffairs]]
		End Interface
	#End Region

	#Region " Interface ElementOfGuidanceIsIncludedInBodyOfSharedGuidance "
		Interface ElementOfGuidanceIsIncludedInBodyOfSharedGuidance
			Property elementOfGuidance As [[ElementOfGuidance]]

			Property bodyOfSharedGuidance As [[BodyOfSharedGuidance]]
		End Interface
	#End Region

	#Region " Interface ElementOfGuidanceObligatesStateOfAffairs "
		Interface ElementOfGuidanceObligatesStateOfAffairs
			Property elementOfGuidance As [[ElementOfGuidance]]

			Property stateOfAffairs As [[StateOfAffairs]]
		End Interface
	#End Region

	#Region " Interface ElementOfGuidanceProhibitsStateOfAffairs "
		Interface ElementOfGuidanceProhibitsStateOfAffairs
			Property elementOfGuidance As [[ElementOfGuidance]]

			Property stateOfAffairs As [[StateOfAffairs]]
		End Interface
	#End Region

	#Region " Interface ExactlynQuantificationHasCardinality "
		Interface ExactlynQuantificationHasCardinality
			Property exactlynQuantification As [[ExactlynQuantification]]

			Property cardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface ExpressionRepresentsMeaning "
		Interface ExpressionRepresentsMeaning
			Property expression As [[Expression]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface FactModelIncludesFact "
		Interface FactModelIncludesFact
			Property factModel As [[FactModel]]

			Property fact As [[Fact]]
		End Interface
	#End Region

	#Region " Interface FactModelIsBasedOnConceptualSchema "
		Interface FactModelIsBasedOnConceptualSchema
			Property factModel As [[FactModel]]

			Property conceptualSchema As [[ConceptualSchema]]
		End Interface
	#End Region

	#Region " Interface FactTypeFormDemonstratesDesignation "
		Interface FactTypeFormDemonstratesDesignation
			Property factTypeForm As [[FactTypeForm]]

			Property designation As [[Designation]]
		End Interface
	#End Region

	#Region " Interface FactTypeFormIncorporatesFactSymbol "
		Interface FactTypeFormIncorporatesFactSymbol
			Property factTypeForm As [[FactTypeForm]]

			Property factSymbol As [[FactSymbol]]
		End Interface
	#End Region

	#Region " Interface FactTypeFormIsInNamespace "
		Interface FactTypeFormIsInNamespace
			Property factTypeForm As [[FactTypeForm]]

			Property [namespace] As [[Namespace]]
		End Interface
	#End Region

	#Region " Interface FactTypeHasFactTypeForm "
		Interface FactTypeHasFactTypeForm
			Property factType As [[FactType]]

			Property factTypeForm As [[FactTypeForm]]
		End Interface
	#End Region

	#Region " Interface FactTypeInternallyIsClosedInConceptualSchema "
		Interface FactTypeInternallyIsClosedInConceptualSchema
			Property factType As [[FactType]]

			Property conceptualSchema As [[ConceptualSchema]]
		End Interface
	#End Region

	#Region " Interface FactTypeIsElementaryInBodyOfSharedMeanings "
		Interface FactTypeIsElementaryInBodyOfSharedMeanings
			Property factType As [[FactType]]

			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]
		End Interface
	#End Region

	#Region " Interface FactTypeRoleHasRoleBinding "
		Interface FactTypeRoleHasRoleBinding
			Property factTypeRole As [[FactTypeRole]]

			Property roleBinding As [[RoleBinding]]
		End Interface
	#End Region

	#Region " Interface FactTypeRoleIsInFactType "
		Interface FactTypeRoleIsInFactType
			Property factTypeRole As [[FactTypeRole]]

			Property factType As [[FactType]]
		End Interface
	#End Region

	#Region " Interface ImplicationHasAntecedent "
		Interface ImplicationHasAntecedent
			Property implication As [[Implication]]

			Property antecedent As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface ImplicationHasConsequent "
		Interface ImplicationHasConsequent
			Property implication As [[Implication]]

			Property consequent As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface InstantiationFormulationBindsToBindableTarget "
		Interface InstantiationFormulationBindsToBindableTarget
			Property instantiationFormulation As [[InstantiationFormulation]]

			Property bindableTarget As [[BindableTarget]]
		End Interface
	#End Region

	#Region " Interface InstantiationFormulationConsidersConcept "
		Interface InstantiationFormulationConsidersConcept
			Property instantiationFormulation As [[InstantiationFormulation]]

			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface IntensionalDefinitionUsesDelimitingCharacteristic "
		Interface IntensionalDefinitionUsesDelimitingCharacteristic
			Property intensionalDefinition As [[IntensionalDefinition]]

			Property delimitingCharacteristic As [[Characteristic]]
		End Interface
	#End Region

	#Region " Interface LogicalFormulationConstrainsProjection "
		Interface LogicalFormulationConstrainsProjection
			Property logicalFormulation As [[LogicalFormulation]]

			Property projection As [[Projection]]
		End Interface
	#End Region

	#Region " Interface LogicalFormulationRestrictsVariable "
		Interface LogicalFormulationRestrictsVariable
			Property logicalFormulation As [[LogicalFormulation]]

			Property variable As [[Variable]]
		End Interface
	#End Region

	#Region " Interface LogicalOperationHasLogicalOperand "
		Interface LogicalOperationHasLogicalOperand
			Property logicalOperation As [[LogicalOperation]]

			Property logicalOperand As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface MeaningCorrespondsToThing "
		Interface MeaningCorrespondsToThing
			Property meaning As [[Meaning]]

			Property thing As [[Thing]]
		End Interface
	#End Region

	#Region " Interface ModalFormulationEmbedsLogicalFormulation "
		Interface ModalFormulationEmbedsLogicalFormulation
			Property modalFormulation As [[ModalFormulation]]

			Property logicalFormulation As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface NameReferencesThing "
		Interface NameReferencesThing
			Property name As [[Name]]

			Property thing As [[Thing]]
		End Interface
	#End Region

	#Region " Interface NamespaceHasUri "
		Interface NamespaceHasUri
			Property [namespace] As [[Namespace]]

			Property uri As [[Uri]]
		End Interface
	#End Region

	#Region " Interface Namespace1IncorporatesNamespace2 "
		Interface Namespace1IncorporatesNamespace2
			Property namespace1 As [[Namespace]]

			Property namespace2 As [[Namespace]]
		End Interface
	#End Region

	#Region " Interface NoteCommentsOnMeaning "
		Interface NoteCommentsOnMeaning
			Property note As [[Note]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface NumericRangeQuantificationHasMaximumCardinality "
		Interface NumericRangeQuantificationHasMaximumCardinality
			Property numericRangeQuantification As [[NumericRangeQuantification]]

			Property maximumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface NumericRangeQuantificationHasMinimumCardinality "
		Interface NumericRangeQuantificationHasMinimumCardinality
			Property numericRangeQuantification As [[NumericRangeQuantification]]

			Property minimumCardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface ObjectificationBindsToBindableTarget "
		Interface ObjectificationBindsToBindableTarget
			Property objectification As [[Objectification]]

			Property bindableTarget As [[BindableTarget]]
		End Interface
	#End Region

	#Region " Interface ObjectificationConsidersLogicalFormulation "
		Interface ObjectificationConsidersLogicalFormulation
			Property objectification As [[Objectification]]

			Property logicalFormulation As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface OperativeBusinessRuleHasLevelOfEnforcement "
		Interface OperativeBusinessRuleHasLevelOfEnforcement
			Property operativeBusinessRule As [[OperativeBusinessRule]]

			Property levelOfEnforcement As [[LevelOfEnforcement]]
		End Interface
	#End Region

	#Region " Interface PlaceholderIsAtStartingCharacterPosition "
		Interface PlaceholderIsAtStartingCharacterPosition
			Property placeholder As [[Placeholder]]

			Property startingCharacterPosition As [[PositiveInteger]]
		End Interface
	#End Region

	#Region " Interface PlaceholderIsInFactTypeForm "
		Interface PlaceholderIsInFactTypeForm
			Property placeholder As [[Placeholder]]

			Property factTypeForm As [[FactTypeForm]]
		End Interface
	#End Region

	#Region " Interface PlaceholderUsesDesignation "
		Interface PlaceholderUsesDesignation
			Property placeholder As [[Placeholder]]

			Property designation As [[Designation]]
		End Interface
	#End Region

	#Region " Interface ProjectingFormulationBindsToBindableTarget "
		Interface ProjectingFormulationBindsToBindableTarget
			Property projectingFormulation As [[ProjectingFormulation]]

			Property bindableTarget As [[BindableTarget]]
		End Interface
	#End Region

	#Region " Interface ProjectingFormulationHasProjection "
		Interface ProjectingFormulationHasProjection
			Property projectingFormulation As [[ProjectingFormulation]]

			Property projection As [[Projection]]
		End Interface
	#End Region

	#Region " Interface ProjectionHasAuxiliaryVariable "
		Interface ProjectionHasAuxiliaryVariable
			Property projection As [[Projection]]

			Property auxiliaryVariable As [[AuxiliaryVariable]]
		End Interface
	#End Region

	#Region " Interface ProjectionIsOnVariable "
		Interface ProjectionIsOnVariable
			Property projection As [[Projection]]

			Property variable As [[Variable]]
		End Interface
	#End Region

	#Region " Interface PropositionIsBasedOnFactType "
		Interface PropositionIsBasedOnFactType
			Property proposition As [[Proposition]]

			Property factType As [[FactType]]
		End Interface
	#End Region

	#Region " Interface PropositionNominalizationBindsToBindableTarget "
		Interface PropositionNominalizationBindsToBindableTarget
			Property propositionNominalization As [[PropositionNominalization]]

			Property bindableTarget As [[BindableTarget]]
		End Interface
	#End Region

	#Region " Interface PropositionNominalizationConsidersLogicalFormulation "
		Interface PropositionNominalizationConsidersLogicalFormulation
			Property propositionNominalization As [[PropositionNominalization]]

			Property logicalFormulation As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface QuantificationIntroducesVariable "
		Interface QuantificationIntroducesVariable
			Property quantification As [[Quantification]]

			Property variable As [[Variable]]
		End Interface
	#End Region

	#Region " Interface QuantificationScopesOverLogicalFormulation "
		Interface QuantificationScopesOverLogicalFormulation
			Property quantification As [[Quantification]]

			Property logicalFormulation As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface Quantity1EqualsQuantity2 "
		Interface Quantity1EqualsQuantity2
			Property quantity1 As [[Quantity]]

			Property quantity2 As [[Quantity]]
		End Interface
	#End Region

	#Region " Interface Quantity1IsLessThanQuantity2 "
		Interface Quantity1IsLessThanQuantity2
			Property quantity1 As [[Quantity]]

			Property quantity2 As [[Quantity]]
		End Interface
	#End Region

	#Region " Interface ReferencePointsToInformationSource "
		Interface ReferencePointsToInformationSource
			Property reference As [[Reference]]

			Property informationSource As [[CommunicationContent]]
		End Interface
	#End Region

	#Region " Interface ReferenceSchemeExtensionallyUsesFactTypeRole "
		Interface ReferenceSchemeExtensionallyUsesFactTypeRole
			Property referenceScheme As [[ReferenceScheme]]

			Property factTypeRole As [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface ReferenceSchemeIsForConcept "
		Interface ReferenceSchemeIsForConcept
			Property referenceScheme As [[ReferenceScheme]]

			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface ReferenceSchemeSimplyUsesFactTypeRole "
		Interface ReferenceSchemeSimplyUsesFactTypeRole
			Property referenceScheme As [[ReferenceScheme]]

			Property factTypeRole As [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface ReferenceSchemeUsesCharacteristic "
		Interface ReferenceSchemeUsesCharacteristic
			Property referenceScheme As [[ReferenceScheme]]

			Property characteristic As [[Characteristic]]
		End Interface
	#End Region

	#Region " Interface ReferenceSupportsMeaning "
		Interface ReferenceSupportsMeaning
			Property reference As [[Reference]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface RepresentationHasExpression "
		Interface RepresentationHasExpression
			Property representation As [[Representation]]

			Property expression As [[Expression]]
		End Interface
	#End Region

	#Region " Interface RepresentationIsInDesignationContext "
		Interface RepresentationIsInDesignationContext
			Property representation As [[Representation]]

			Property designationContext As [[Concept]]
		End Interface
	#End Region

	#Region " Interface RepresentationIsInSubjectField "
		Interface RepresentationIsInSubjectField
			Property representation As [[Representation]]

			Property subjectField As [[SubjectField]]
		End Interface
	#End Region

	#Region " Interface RepresentationRepresentsMeaning "
		Interface RepresentationRepresentsMeaning
			Property representation As [[Representation]]

			Property meaning As [[Meaning]]
		End Interface
	#End Region

	#Region " Interface RepresentationUsesVocabulary "
		Interface RepresentationUsesVocabulary
			Property representation As [[Representation]]

			Property vocabulary As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface ResIsSensoryManifestationOfSignifier "
		Interface ResIsSensoryManifestationOfSignifier
			Property res As [[Res]]

			Property signifier As [[Expression]]
		End Interface
	#End Region

	#Region " Interface RoleBindingBindsToBindableTarget "
		Interface RoleBindingBindsToBindableTarget
			Property roleBinding As [[RoleBinding]]

			Property bindableTarget As [[BindableTarget]]
		End Interface
	#End Region

	#Region " Interface RoleBindingOccursInAtomicFormulation "
		Interface RoleBindingOccursInAtomicFormulation
			Property roleBinding As [[RoleBinding]]

			Property atomicFormulation As [[AtomicFormulation]]
		End Interface
	#End Region

	#Region " Interface RoleRangesOverObjectType "
		Interface RoleRangesOverObjectType
			Property role As [[Role]]

			Property objectType As [[ObjectType]]
		End Interface
	#End Region

	#Region " Interface RulebookIncludesRepresentation "
		Interface RulebookIncludesRepresentation
			Property rulebook As [[Rulebook]]

			Property representation As [[Representation]]
		End Interface
	#End Region

	#Region " Interface SemanticCommunityHasSpeechCommunity "
		Interface SemanticCommunityHasSpeechCommunity
			Property semanticCommunity As [[SemanticCommunity]]

			Property speechCommunity As [[SpeechCommunity]]
		End Interface
	#End Region

	#Region " Interface SetHasCardinality "
		Interface SetHasCardinality
			Property [set] As [[Set]]

			Property cardinality As [[NonnegativeInteger]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityDeterminesRulebook "
		Interface SpeechCommunityDeterminesRulebook
			Property speechCommunity As [[SpeechCommunity]]

			Property rulebook As [[Rulebook]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityOwnsOwnedDefinition "
		Interface SpeechCommunityOwnsOwnedDefinition
			Property speechCommunity As [[SpeechCommunity]]

			Property ownedDefinition As [[OwnedDefinition]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityOwnsVocabulary "
		Interface SpeechCommunityOwnsVocabulary
			Property speechCommunity As [[SpeechCommunity]]

			Property vocabulary As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityRegulatesItsUsageOfSignifier "
		Interface SpeechCommunityRegulatesItsUsageOfSignifier
			Property speechCommunity As [[SpeechCommunity]]

			Property signifier As [[Expression]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityUsesLanguage "
		Interface SpeechCommunityUsesLanguage
			Property speechCommunity As [[SpeechCommunity]]

			Property language As [[Language]]
		End Interface
	#End Region

	#Region " Interface SpeechCommunityUsesVocabulary "
		Interface SpeechCommunityUsesVocabulary
			Property speechCommunity As [[SpeechCommunity]]

			Property vocabulary As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface StatementExpressesProposition "
		Interface StatementExpressesProposition
			Property statement As [[Statement]]

			Property proposition As [[Proposition]]
		End Interface
	#End Region

	#Region " Interface TermDenotesThing "
		Interface TermDenotesThing
			Property term As [[Term]]

			Property thing As [[Thing]]
		End Interface
	#End Region

	#Region " Interface TerminologicalDictionaryExpressesBodyOfSharedMeanings "
		Interface TerminologicalDictionaryExpressesBodyOfSharedMeanings
			Property terminologicalDictionary As [[TerminologicalDictionary]]

			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]
		End Interface
	#End Region

	#Region " Interface TerminologicalDictionaryHasUri "
		Interface TerminologicalDictionaryHasUri
			Property terminologicalDictionary As [[TerminologicalDictionary]]

			Property uri As [[Uri]]
		End Interface
	#End Region

	#Region " Interface TerminologicalDictionaryPresentsVocabulary "
		Interface TerminologicalDictionaryPresentsVocabulary
			Property terminologicalDictionary As [[TerminologicalDictionary]]

			Property vocabulary As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface ThingIsInSet "
		Interface ThingIsInSet
			Property thing As [[Thing]]

			Property [set] As [[Set]]
		End Interface
	#End Region

	#Region " Interface Thing1IsThing2 "
		Interface Thing1IsThing2
			Property thing1 As [[Thing]]

			Property thing2 As [[Thing]]
		End Interface
	#End Region

	#Region " Interface VariableHasProjectionPosition "
		Interface VariableHasProjectionPosition
			Property variable As [[Variable]]

			Property projectionPosition As [[PositiveInteger]]
		End Interface
	#End Region

	#Region " Interface VariableIsFreesWithinSemanticFormulation "
		Interface VariableIsFreesWithinSemanticFormulation
			Property variable As [[Variable]]

			Property semanticFormulation As [[SemanticFormulation]]
		End Interface
	#End Region

	#Region " Interface VariableMapsToFactTypeRole "
		Interface VariableMapsToFactTypeRole
			Property variable As [[Variable]]

			Property factTypeRole As [[FactTypeRole]]
		End Interface
	#End Region

	#Region " Interface VariableRangesOverConcept "
		Interface VariableRangesOverConcept
			Property variable As [[Variable]]

			Property concept As [[Concept]]
		End Interface
	#End Region

	#Region " Interface VocabularyIsDesignedForSpeechCommunity "
		Interface VocabularyIsDesignedForSpeechCommunity
			Property vocabulary As [[Vocabulary]]

			Property speechCommunity As [[SpeechCommunity]]
		End Interface
	#End Region

	#Region " Interface VocabularyIsExpressedInLanguage "
		Interface VocabularyIsExpressedInLanguage
			Property vocabulary As [[Vocabulary]]

			Property language As [[Language]]
		End Interface
	#End Region

	#Region " Interface VocabularyIsUsedToExpressBodyOfSharedMeanings "
		Interface VocabularyIsUsedToExpressBodyOfSharedMeanings
			Property vocabulary As [[Vocabulary]]

			Property bodyOfSharedMeanings As [[BodyOfSharedMeanings]]
		End Interface
	#End Region

	#Region " Interface VocabularyNamespaceIsDerivedFromVocabulary "
		Interface VocabularyNamespaceIsDerivedFromVocabulary
			Property vocabularyNamespace As [[VocabularyNamespace]]

			Property vocabulary As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface VocabularyNamespaceIsForLanguage "
		Interface VocabularyNamespaceIsForLanguage
			Property vocabularyNamespace As [[VocabularyNamespace]]

			Property language As [[Language]]
		End Interface
	#End Region

	#Region " Interface VocabularyNamespaceIsSpecificToDesignationContext "
		Interface VocabularyNamespaceIsSpecificToDesignationContext
			Property vocabularyNamespace As [[VocabularyNamespace]]

			Property designationContext As [[Concept]]
		End Interface
	#End Region

	#Region " Interface VocabularyNamespaceIsSpecificToSubjectField "
		Interface VocabularyNamespaceIsSpecificToSubjectField
			Property vocabularyNamespace As [[VocabularyNamespace]]

			Property subjectField As [[SubjectField]]
		End Interface
	#End Region

	#Region " Interface Vocabulary1IncorporatesVocabulary2 "
		Interface Vocabulary1IncorporatesVocabulary2
			Property vocabulary1 As [[Vocabulary]]

			Property vocabulary2 As [[Vocabulary]]
		End Interface
	#End Region

	#Region " Interface WhetherornotFormulationHasConsequent "
		Interface WhetherornotFormulationHasConsequent
			Property whetherornotFormulation As [[WhetherornotFormulation]]

			Property consequent As [[LogicalFormulation]]
		End Interface
	#End Region

	#Region " Interface WhetherornotFormulationHasInconsequent "
		Interface WhetherornotFormulationHasInconsequent
			Property whetherornotFormulation As [[WhetherornotFormulation]]

			Property inconsequent As [[LogicalFormulation]]
		End Interface
	#End Region
End Namespace
