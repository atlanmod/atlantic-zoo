( defstruct Actuality )
( defstruct StateOfAffairs )
( defstruct Thing )
( defstruct Name :signifier :meaning :expression )
( defstruct Designation :signifier :meaning :expression )
( defstruct Representation :meaning :expression )
( defstruct Meaning )
( defstruct Expression )
( defstruct BindableTarget )
( defstruct AdoptedDefinition :meaning :expression )
( defstruct Definition :meaning :expression )
( defstruct Advice )
( defstruct ElementOfGuidance )
( defstruct Proposition )
( defstruct Statement :meaning :expression )
( defstruct AdviceOfContingency )
( defstruct AdviceOfPossibility )
( defstruct AdviceOfOptionality )
( defstruct AdviceOfPermission )
( defstruct AdviceStatement :meaning :expression )
( defstruct GuidanceStatement :meaning :expression )
( defstruct AggregationFormulation :projection )
( defstruct ProjectingFormulation :projection )
( defstruct LogicalFormulation )
( defstruct SemanticFormulation )
( defstruct Projection :projectionVariable )
( defstruct Variable )
( defstruct PositiveInteger :extension )
( defstruct NonnegativeInteger :extension )
( defstruct Integer :extension )
( defstruct Number :extension )
( defstruct Quantity :extension )
( defstruct NounConcept :extension )
( defstruct Concept :extension )
( defstruct AttributiveNamespace )
( defstruct Namespace )
( defstruct Uri )
( defstruct Text )
( defstruct Characteristic :role :extension )
( defstruct FactType :role :extension )
( defstruct FactTypeForm :placeholder :meaning :expression )
( defstruct Placeholder :signifier :meaning :expression )
( defstruct FactTypeRole :extension )
( defstruct Role :extension )
( defstruct RoleBinding )
( defstruct ReferenceScheme )
( defstruct Set )
( defstruct AuxiliaryVariable )
( defstruct AnswerNominalization :projection )
( defstruct AssociativeFactType :role :extension )
( defstruct AssortmentFactType :role :extension )
( defstruct AtleastnQuantification :minimumCardinality )
( defstruct Quantification )
( defstruct AtmostnQuantification :maximumCardinality )
( defstruct AtmostoneQuantification :maximumCardinality )
( defstruct AtomicFormulation )
( defstruct BagProjection :projectionVariable )
( defstruct BinaryFactType :role :extension )
( defstruct BinaryLogicalOperation :logicalOperand )
( defstruct LogicalOperation :logicalOperand )
( defstruct BodyOfSharedConcepts )
( defstruct BodyOfSharedGuidance )
( defstruct BodyOfSharedMeanings )
( defstruct BusinessPolicy )
( defstruct ElementOfGovernance )
( defstruct BusinessPolicyStatement :meaning :expression )
( defstruct BusinessRule )
( defstruct Rule )
( defstruct BusinessVocabulary )
( defstruct Vocabulary )
( defstruct CategorizationFactType :role :extension )
( defstruct SpecializationFactType :role :extension )
( defstruct CategorizationScheme )
( defstruct CategorizationType :extension )
( defstruct CharacteristicType :extension )
( defstruct ConceptType :extension )
( defstruct ObjectType :extension )
( defstruct ClosedLogicalFormulation )
( defstruct ClosedSemanticFormulation )
( defstruct ClosedProjection :projectionVariable )
( defstruct CommunicationContent :meaning :expression )
( defstruct Community )
( defstruct ConceptOfThingAsComposite :extension )
( defstruct ConceptOfThingAsContinuant :extension )
( defstruct ConceptOfThingAsDeveloped :extension )
( defstruct ConceptOfThingAsOccurrent :extension )
( defstruct ConceptOfThingAsPrimitive :extension )
( defstruct ConceptOfThingAsUnitary :extension )
( defstruct ConceptOfThingExistingDependently :extension )
( defstruct ConceptOfThingExistingIndependently :extension )
( defstruct ConceptualSchema )
( defstruct Conjunction :logicalOperand )
( defstruct ContextOfThing )
( defstruct Segmentation )
( defstruct ContextualizationFactType :role :extension )
( defstruct ContextualizedConcept :extension )
( defstruct ContingencyStatement :meaning :expression )
( defstruct StatementOfAdviceOfPossibility :meaning :expression )
( defstruct DefiniteDescription :meaning :expression )
( defstruct IntensionalDefinition :meaning :expression )
( defstruct DerivableConcept :extension )
( defstruct Description :meaning :expression )
( defstruct DescriptiveExample :meaning :expression )
( defstruct Disjunction :logicalOperand )
( defstruct Equivalence :logicalOperand )
( defstruct ExactlynQuantification :cardinality )
( defstruct ExactlyoneQuantification :cardinality )
( defstruct ExclusiveDisjunction :logicalOperand )
( defstruct ExistentialQuantification :minimumCardinality )
( defstruct ExplicitnessOfRepresentation )
( defstruct ExtensionalDefinition :meaning :expression )
( defstruct Facet :extension )
( defstruct Fact )
( defstruct FactModel )
( defstruct FactSymbol :signifier :meaning :expression )
( defstruct FactTypeHasFactInFactModel :factType :fact :factModel )
( defstruct FactTypeNominalization :projection )
( defstruct FactTypeRoleDesignation :signifier :meaning :expression )
( defstruct FactTypeTemplating )
( defstruct FormalRepresentation :meaning :expression )
( defstruct FundamentalConcept :extension )
( defstruct Icon :signifier :meaning :expression )
( defstruct NonverbalDesignation :signifier :meaning :expression )
( defstruct Implication :logicalOperand )
( defstruct ImpossibilityStatement :meaning :expression )
( defstruct StructuralRuleStatement :meaning :expression )
( defstruct RuleStatement :meaning :expression )
( defstruct IndividualConcept :extension )
( defstruct InformalRepresentation :meaning :expression )
( defstruct InstantiationFormulation )
( defstruct IsfacetofFactType :role :extension )
( defstruct IspropertyofFactType :role :extension )
( defstruct IsroleofFactType :role :extension )
( defstruct KindOfGuidanceStatement )
( defstruct Language )
( defstruct LevelOfEnforcement )
( defstruct LogicalFormulationKind :extension )
( defstruct LogicalNegation :logicalOperand )
( defstruct ModalFormulation )
( defstruct NandFormulation :logicalOperand )
( defstruct NecessityFormulation )
( defstruct NecessityStatement :meaning :expression )
( defstruct NonnecessityStatement :meaning :expression )
( defstruct NonobligationStatement :meaning :expression )
( defstruct StatementOfAdviceOfPermission :meaning :expression )
( defstruct NorFormulation :logicalOperand )
( defstruct Note :meaning :expression )
( defstruct NounConceptNominalization :projection )
( defstruct NounForm :placeholder :meaning :expression )
( defstruct NumericRangeQuantification :maximumCardinality :minimumCardinality )
( defstruct Objectification )
( defstruct ObligationFormulation )
( defstruct ObligationStatement :meaning :expression )
( defstruct OperativeBusinessRuleStatement :meaning :expression )
( defstruct OperativeBusinessRule )
( defstruct OptionalityStatement :meaning :expression )
( defstruct OwnedDefinition :meaning :expression )
( defstruct PartitiveFactType :role :extension )
( defstruct PermissibilityFormulation )
( defstruct PermissionStatement :meaning :expression )
( defstruct PossibilityFormulation )
( defstruct PossibilityStatement :meaning :expression )
( defstruct PreferredDesignation :signifier :meaning :expression )
( defstruct ProhibitedDesignation :signifier :meaning :expression )
( defstruct ProhibitionStatement :meaning :expression )
( defstruct PropositionNominalization )
( defstruct Question )
( defstruct QuestionNominalization :projection )
( defstruct RealworldNumericalCorrespondence )
( defstruct Reference :meaning :expression )
( defstruct RepresentationFormality )
( defstruct Res )
( defstruct RestrictedPermissionStatement :meaning :expression )
( defstruct RestrictedPossibilityStatement :meaning :expression )
( defstruct Rulebook )
( defstruct SemanticCommunity )
( defstruct SpeechCommunity )
( defstruct SententialForm :placeholder :meaning :expression )
( defstruct SetProjection :projectionVariable )
( defstruct Situation )
( defstruct SituationalRole :extension :extension )
( defstruct SpeechCommunityAdoptsAdoptedDefinitionCitingReference :speechCommunity :adoptedDefinition :reference )
( defstruct StateOfAffairsInvolvesThingInRole :stateOfAffairs :thing :role )
( defstruct StructuralBusinessRule )
( defstruct StructuralRule )
( defstruct SubjectField )
( defstruct Term :signifier :meaning :expression )
( defstruct TerminologicalDictionary )
( defstruct ThingInContext )
( defstruct UniversalQuantification )
( defstruct Viewpoint )
( defstruct VocabularyNamespace )
( defstruct WhetherornotFormulation :logicalOperand )
