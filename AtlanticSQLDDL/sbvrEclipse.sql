CREATE TABLE Actuality (
	__IDActuality__ Integer NOT NULL,
	PRIMARY KEY Actuality (__IDActuality__)
) ;

CREATE TABLE StateOfAffairs (
	__IDStateOfAffairs__ Integer NOT NULL,
	PRIMARY KEY StateOfAffairs (__IDStateOfAffairs__)
) ;

CREATE TABLE Thing (
	__IDThing__ Integer NOT NULL,
	PRIMARY KEY Thing (__IDThing__)
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE Designation (
	__IDDesignation__ Integer NOT NULL,
	implicitlyIsUnderstood Boolean,
	FOREIGN KEY signifier (__FKsignifier__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Designation (__IDDesignation__),
	__FKsignifier__ Integer
) ;

CREATE TABLE Representation (
	__IDRepresentation__ Integer NOT NULL,
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Representation (__IDRepresentation__),
	__FKmeaning__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE Meaning (
	__IDMeaning__ Integer NOT NULL,
	PRIMARY KEY Meaning (__IDMeaning__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE BindableTarget (
	__IDBindableTarget__ Integer NOT NULL,
	PRIMARY KEY BindableTarget (__IDBindableTarget__)
) ;

CREATE TABLE AdoptedDefinition (
	__IDAdoptedDefinition__ Integer NOT NULL,
	PRIMARY KEY AdoptedDefinition (__IDAdoptedDefinition__)
) ;

CREATE TABLE Definition (
	__IDDefinition__ Integer NOT NULL,
	PRIMARY KEY Definition (__IDDefinition__)
) ;

CREATE TABLE Advice (
	__IDAdvice__ Integer NOT NULL,
	PRIMARY KEY Advice (__IDAdvice__)
) ;

CREATE TABLE ElementOfGuidance (
	__IDElementOfGuidance__ Integer NOT NULL,
	isPracticable Boolean,
	PRIMARY KEY ElementOfGuidance (__IDElementOfGuidance__)
) ;

CREATE TABLE Proposition (
	__IDProposition__ Integer NOT NULL,
	isFalse Boolean,
	isTrue Boolean,
	isPossiblyTrue Boolean,
	isObligatedToBeTrue Boolean,
	isPermittedToBeTrue Boolean,
	isNecessarilyTrue Boolean,
	PRIMARY KEY Proposition (__IDProposition__)
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE AdviceOfContingency (
	__IDAdviceOfContingency__ Integer NOT NULL,
	PRIMARY KEY AdviceOfContingency (__IDAdviceOfContingency__)
) ;

CREATE TABLE AdviceOfPossibility (
	__IDAdviceOfPossibility__ Integer NOT NULL,
	PRIMARY KEY AdviceOfPossibility (__IDAdviceOfPossibility__)
) ;

CREATE TABLE AdviceOfOptionality (
	__IDAdviceOfOptionality__ Integer NOT NULL,
	PRIMARY KEY AdviceOfOptionality (__IDAdviceOfOptionality__)
) ;

CREATE TABLE AdviceOfPermission (
	__IDAdviceOfPermission__ Integer NOT NULL,
	PRIMARY KEY AdviceOfPermission (__IDAdviceOfPermission__)
) ;

CREATE TABLE AdviceStatement (
	__IDAdviceStatement__ Integer NOT NULL,
	PRIMARY KEY AdviceStatement (__IDAdviceStatement__)
) ;

CREATE TABLE GuidanceStatement (
	__IDGuidanceStatement__ Integer NOT NULL,
	PRIMARY KEY GuidanceStatement (__IDGuidanceStatement__)
) ;

CREATE TABLE AggregationFormulation (
	__IDAggregationFormulation__ Integer NOT NULL,
	PRIMARY KEY AggregationFormulation (__IDAggregationFormulation__)
) ;

CREATE TABLE ProjectingFormulation (
	__IDProjectingFormulation__ Integer NOT NULL,
	FOREIGN KEY projection (__FKprojection__) REFERENCES Projection (__IDProjection__),
	PRIMARY KEY ProjectingFormulation (__IDProjectingFormulation__),
	__FKprojection__ Integer
) ;

CREATE TABLE LogicalFormulation (
	__IDLogicalFormulation__ Integer NOT NULL,
	PRIMARY KEY LogicalFormulation (__IDLogicalFormulation__)
) ;

CREATE TABLE SemanticFormulation (
	__IDSemanticFormulation__ Integer NOT NULL,
	PRIMARY KEY SemanticFormulation (__IDSemanticFormulation__)
) ;

CREATE TABLE Projection (
	__IDProjection__ Integer NOT NULL,
	FOREIGN KEY constrainingFormulation (__FKconstrainingFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY Projection (__IDProjection__),
	__FKconstrainingFormulation__ Integer
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY restrictingFormulation (__FKrestrictingFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	FOREIGN KEY projectionPosition (__FKprojectionPosition__) REFERENCES PositiveInteger (__IDPositiveInteger__),
	FOREIGN KEY rangedoverConcept (__FKrangedoverConcept__) REFERENCES Concept (__IDConcept__),
	isUnitary Boolean,
	PRIMARY KEY Variable (__IDVariable__),
	__FKrestrictingFormulation__ Integer,
	__FKprojectionPosition__ Integer,
	__FKrangedoverConcept__ Integer
) ;

CREATE TABLE PositiveInteger (
	__IDPositiveInteger__ Integer NOT NULL,
	PRIMARY KEY PositiveInteger (__IDPositiveInteger__)
) ;

CREATE TABLE NonnegativeInteger (
	__IDNonnegativeInteger__ Integer NOT NULL,
	PRIMARY KEY NonnegativeInteger (__IDNonnegativeInteger__)
) ;

CREATE TABLE Integer (
	__IDInteger__ Integer NOT NULL,
	value text,
	PRIMARY KEY Integer (__IDInteger__)
) ;

CREATE TABLE Number (
	__IDNumber__ Integer NOT NULL,
	PRIMARY KEY Number (__IDNumber__)
) ;

CREATE TABLE Quantity (
	__IDQuantity__ Integer NOT NULL,
	PRIMARY KEY Quantity (__IDQuantity__)
) ;

CREATE TABLE NounConcept (
	__IDNounConcept__ Integer NOT NULL,
	PRIMARY KEY NounConcept (__IDNounConcept__)
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	FOREIGN KEY extension (__FKextension__) REFERENCES "Set" (__IDSet__),
	PRIMARY KEY Concept (__IDConcept__),
	__FKextension__ Integer
) ;

CREATE TABLE AttributiveNamespace (
	__IDAttributiveNamespace__ Integer NOT NULL,
	PRIMARY KEY AttributiveNamespace (__IDAttributiveNamespace__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Uri (
	__IDUri__ Integer NOT NULL,
	PRIMARY KEY Uri (__IDUri__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	value text,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Characteristic (
	__IDCharacteristic__ Integer NOT NULL,
	PRIMARY KEY Characteristic (__IDCharacteristic__)
) ;

CREATE TABLE FactType (
	__IDFactType__ Integer NOT NULL,
	PRIMARY KEY FactType (__IDFactType__)
) ;

CREATE TABLE FactTypeForm (
	__IDFactTypeForm__ Integer NOT NULL,
	PRIMARY KEY FactTypeForm (__IDFactTypeForm__)
) ;

CREATE TABLE Placeholder (
	__IDPlaceholder__ Integer NOT NULL,
	FOREIGN KEY startingCharacterPosition (__FKstartingCharacterPosition__) REFERENCES PositiveInteger (__IDPositiveInteger__),
	PRIMARY KEY Placeholder (__IDPlaceholder__),
	__FKstartingCharacterPosition__ Integer
) ;

CREATE TABLE FactTypeRole (
	__IDFactTypeRole__ Integer NOT NULL,
	PRIMARY KEY FactTypeRole (__IDFactTypeRole__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE RoleBinding (
	__IDRoleBinding__ Integer NOT NULL,
	PRIMARY KEY RoleBinding (__IDRoleBinding__)
) ;

CREATE TABLE ReferenceScheme (
	__IDReferenceScheme__ Integer NOT NULL,
	PRIMARY KEY ReferenceScheme (__IDReferenceScheme__)
) ;

CREATE TABLE "Set" (
	__IDSet__ Integer NOT NULL,
	FOREIGN KEY cardinality (__FKcardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY "Set" (__IDSet__),
	__FKcardinality__ Integer
) ;

CREATE TABLE AuxiliaryVariable (
	__IDAuxiliaryVariable__ Integer NOT NULL,
	PRIMARY KEY AuxiliaryVariable (__IDAuxiliaryVariable__)
) ;

CREATE TABLE AnswerNominalization (
	__IDAnswerNominalization__ Integer NOT NULL,
	PRIMARY KEY AnswerNominalization (__IDAnswerNominalization__)
) ;

CREATE TABLE AssociativeFactType (
	__IDAssociativeFactType__ Integer NOT NULL,
	PRIMARY KEY AssociativeFactType (__IDAssociativeFactType__)
) ;

CREATE TABLE AssortmentFactType (
	__IDAssortmentFactType__ Integer NOT NULL,
	PRIMARY KEY AssortmentFactType (__IDAssortmentFactType__)
) ;

CREATE TABLE AtleastnQuantification (
	__IDAtleastnQuantification__ Integer NOT NULL,
	FOREIGN KEY minimumCardinality (__FKminimumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY AtleastnQuantification (__IDAtleastnQuantification__),
	__FKminimumCardinality__ Integer
) ;

CREATE TABLE Quantification (
	__IDQuantification__ Integer NOT NULL,
	FOREIGN KEY scopeFormulation (__FKscopeFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY Quantification (__IDQuantification__),
	__FKscopeFormulation__ Integer
) ;

CREATE TABLE AtmostnQuantification (
	__IDAtmostnQuantification__ Integer NOT NULL,
	FOREIGN KEY maximumCardinality (__FKmaximumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY AtmostnQuantification (__IDAtmostnQuantification__),
	__FKmaximumCardinality__ Integer
) ;

CREATE TABLE AtmostoneQuantification (
	__IDAtmostoneQuantification__ Integer NOT NULL,
	PRIMARY KEY AtmostoneQuantification (__IDAtmostoneQuantification__)
) ;

CREATE TABLE AtomicFormulation (
	__IDAtomicFormulation__ Integer NOT NULL,
	PRIMARY KEY AtomicFormulation (__IDAtomicFormulation__)
) ;

CREATE TABLE BagProjection (
	__IDBagProjection__ Integer NOT NULL,
	PRIMARY KEY BagProjection (__IDBagProjection__)
) ;

CREATE TABLE BinaryFactType (
	__IDBinaryFactType__ Integer NOT NULL,
	PRIMARY KEY BinaryFactType (__IDBinaryFactType__)
) ;

CREATE TABLE BinaryLogicalOperation (
	__IDBinaryLogicalOperation__ Integer NOT NULL,
	PRIMARY KEY BinaryLogicalOperation (__IDBinaryLogicalOperation__)
) ;

CREATE TABLE LogicalOperation (
	__IDLogicalOperation__ Integer NOT NULL,
	FOREIGN KEY logicalOperand (__FKlogicalOperand__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY LogicalOperation (__IDLogicalOperation__),
	__FKlogicalOperand__ Integer
) ;

CREATE TABLE BodyOfSharedConcepts (
	__IDBodyOfSharedConcepts__ Integer NOT NULL,
	PRIMARY KEY BodyOfSharedConcepts (__IDBodyOfSharedConcepts__)
) ;

CREATE TABLE BodyOfSharedGuidance (
	__IDBodyOfSharedGuidance__ Integer NOT NULL,
	PRIMARY KEY BodyOfSharedGuidance (__IDBodyOfSharedGuidance__)
) ;

CREATE TABLE BodyOfSharedMeanings (
	__IDBodyOfSharedMeanings__ Integer NOT NULL,
	PRIMARY KEY BodyOfSharedMeanings (__IDBodyOfSharedMeanings__)
) ;

CREATE TABLE BusinessPolicy (
	__IDBusinessPolicy__ Integer NOT NULL,
	PRIMARY KEY BusinessPolicy (__IDBusinessPolicy__)
) ;

CREATE TABLE ElementOfGovernance (
	__IDElementOfGovernance__ Integer NOT NULL,
	isDirectlyEnforceable Boolean,
	PRIMARY KEY ElementOfGovernance (__IDElementOfGovernance__)
) ;

CREATE TABLE BusinessPolicyStatement (
	__IDBusinessPolicyStatement__ Integer NOT NULL,
	PRIMARY KEY BusinessPolicyStatement (__IDBusinessPolicyStatement__)
) ;

CREATE TABLE BusinessRule (
	__IDBusinessRule__ Integer NOT NULL,
	PRIMARY KEY BusinessRule (__IDBusinessRule__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	PRIMARY KEY Rule (__IDRule__)
) ;

CREATE TABLE BusinessVocabulary (
	__IDBusinessVocabulary__ Integer NOT NULL,
	PRIMARY KEY BusinessVocabulary (__IDBusinessVocabulary__)
) ;

CREATE TABLE Vocabulary (
	__IDVocabulary__ Integer NOT NULL,
	PRIMARY KEY Vocabulary (__IDVocabulary__)
) ;

CREATE TABLE CategorizationFactType (
	__IDCategorizationFactType__ Integer NOT NULL,
	PRIMARY KEY CategorizationFactType (__IDCategorizationFactType__)
) ;

CREATE TABLE SpecializationFactType (
	__IDSpecializationFactType__ Integer NOT NULL,
	PRIMARY KEY SpecializationFactType (__IDSpecializationFactType__)
) ;

CREATE TABLE CategorizationScheme (
	__IDCategorizationScheme__ Integer NOT NULL,
	PRIMARY KEY CategorizationScheme (__IDCategorizationScheme__)
) ;

CREATE TABLE CategorizationType (
	__IDCategorizationType__ Integer NOT NULL,
	PRIMARY KEY CategorizationType (__IDCategorizationType__)
) ;

CREATE TABLE CharacteristicType (
	__IDCharacteristicType__ Integer NOT NULL,
	PRIMARY KEY CharacteristicType (__IDCharacteristicType__)
) ;

CREATE TABLE ConceptType (
	__IDConceptType__ Integer NOT NULL,
	PRIMARY KEY ConceptType (__IDConceptType__)
) ;

CREATE TABLE ObjectType (
	__IDObjectType__ Integer NOT NULL,
	PRIMARY KEY ObjectType (__IDObjectType__)
) ;

CREATE TABLE ClosedLogicalFormulation (
	__IDClosedLogicalFormulation__ Integer NOT NULL,
	PRIMARY KEY ClosedLogicalFormulation (__IDClosedLogicalFormulation__)
) ;

CREATE TABLE ClosedSemanticFormulation (
	__IDClosedSemanticFormulation__ Integer NOT NULL,
	PRIMARY KEY ClosedSemanticFormulation (__IDClosedSemanticFormulation__)
) ;

CREATE TABLE ClosedProjection (
	__IDClosedProjection__ Integer NOT NULL,
	PRIMARY KEY ClosedProjection (__IDClosedProjection__)
) ;

CREATE TABLE CommunicationContent (
	__IDCommunicationContent__ Integer NOT NULL,
	PRIMARY KEY CommunicationContent (__IDCommunicationContent__)
) ;

CREATE TABLE Community (
	__IDCommunity__ Integer NOT NULL,
	PRIMARY KEY Community (__IDCommunity__)
) ;

CREATE TABLE ConceptOfThingAsComposite (
	__IDConceptOfThingAsComposite__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsComposite (__IDConceptOfThingAsComposite__)
) ;

CREATE TABLE ConceptOfThingAsContinuant (
	__IDConceptOfThingAsContinuant__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsContinuant (__IDConceptOfThingAsContinuant__)
) ;

CREATE TABLE ConceptOfThingAsDeveloped (
	__IDConceptOfThingAsDeveloped__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsDeveloped (__IDConceptOfThingAsDeveloped__)
) ;

CREATE TABLE ConceptOfThingAsOccurrent (
	__IDConceptOfThingAsOccurrent__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsOccurrent (__IDConceptOfThingAsOccurrent__)
) ;

CREATE TABLE ConceptOfThingAsPrimitive (
	__IDConceptOfThingAsPrimitive__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsPrimitive (__IDConceptOfThingAsPrimitive__)
) ;

CREATE TABLE ConceptOfThingAsUnitary (
	__IDConceptOfThingAsUnitary__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingAsUnitary (__IDConceptOfThingAsUnitary__)
) ;

CREATE TABLE ConceptOfThingExistingDependently (
	__IDConceptOfThingExistingDependently__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingExistingDependently (__IDConceptOfThingExistingDependently__)
) ;

CREATE TABLE ConceptOfThingExistingIndependently (
	__IDConceptOfThingExistingIndependently__ Integer NOT NULL,
	PRIMARY KEY ConceptOfThingExistingIndependently (__IDConceptOfThingExistingIndependently__)
) ;

CREATE TABLE ConceptualSchema (
	__IDConceptualSchema__ Integer NOT NULL,
	PRIMARY KEY ConceptualSchema (__IDConceptualSchema__)
) ;

CREATE TABLE Conjunction (
	__IDConjunction__ Integer NOT NULL,
	PRIMARY KEY Conjunction (__IDConjunction__)
) ;

CREATE TABLE ContextOfThing (
	__IDContextOfThing__ Integer NOT NULL,
	PRIMARY KEY ContextOfThing (__IDContextOfThing__)
) ;

CREATE TABLE Segmentation (
	__IDSegmentation__ Integer NOT NULL,
	PRIMARY KEY Segmentation (__IDSegmentation__)
) ;

CREATE TABLE ContextualizationFactType (
	__IDContextualizationFactType__ Integer NOT NULL,
	PRIMARY KEY ContextualizationFactType (__IDContextualizationFactType__)
) ;

CREATE TABLE ContextualizedConcept (
	__IDContextualizedConcept__ Integer NOT NULL,
	PRIMARY KEY ContextualizedConcept (__IDContextualizedConcept__)
) ;

CREATE TABLE ContingencyStatement (
	__IDContingencyStatement__ Integer NOT NULL,
	PRIMARY KEY ContingencyStatement (__IDContingencyStatement__)
) ;

CREATE TABLE StatementOfAdviceOfPossibility (
	__IDStatementOfAdviceOfPossibility__ Integer NOT NULL,
	PRIMARY KEY StatementOfAdviceOfPossibility (__IDStatementOfAdviceOfPossibility__)
) ;

CREATE TABLE DefiniteDescription (
	__IDDefiniteDescription__ Integer NOT NULL,
	PRIMARY KEY DefiniteDescription (__IDDefiniteDescription__)
) ;

CREATE TABLE IntensionalDefinition (
	__IDIntensionalDefinition__ Integer NOT NULL,
	PRIMARY KEY IntensionalDefinition (__IDIntensionalDefinition__)
) ;

CREATE TABLE DerivableConcept (
	__IDDerivableConcept__ Integer NOT NULL,
	PRIMARY KEY DerivableConcept (__IDDerivableConcept__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE DescriptiveExample (
	__IDDescriptiveExample__ Integer NOT NULL,
	PRIMARY KEY DescriptiveExample (__IDDescriptiveExample__)
) ;

CREATE TABLE Disjunction (
	__IDDisjunction__ Integer NOT NULL,
	PRIMARY KEY Disjunction (__IDDisjunction__)
) ;

CREATE TABLE Equivalence (
	__IDEquivalence__ Integer NOT NULL,
	PRIMARY KEY Equivalence (__IDEquivalence__)
) ;

CREATE TABLE ExactlynQuantification (
	__IDExactlynQuantification__ Integer NOT NULL,
	FOREIGN KEY cardinality (__FKcardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY ExactlynQuantification (__IDExactlynQuantification__),
	__FKcardinality__ Integer
) ;

CREATE TABLE ExactlyoneQuantification (
	__IDExactlyoneQuantification__ Integer NOT NULL,
	PRIMARY KEY ExactlyoneQuantification (__IDExactlyoneQuantification__)
) ;

CREATE TABLE ExclusiveDisjunction (
	__IDExclusiveDisjunction__ Integer NOT NULL,
	PRIMARY KEY ExclusiveDisjunction (__IDExclusiveDisjunction__)
) ;

CREATE TABLE ExistentialQuantification (
	__IDExistentialQuantification__ Integer NOT NULL,
	PRIMARY KEY ExistentialQuantification (__IDExistentialQuantification__)
) ;

CREATE TABLE ExplicitnessOfRepresentation (
	__IDExplicitnessOfRepresentation__ Integer NOT NULL,
	PRIMARY KEY ExplicitnessOfRepresentation (__IDExplicitnessOfRepresentation__)
) ;

CREATE TABLE ExtensionalDefinition (
	__IDExtensionalDefinition__ Integer NOT NULL,
	PRIMARY KEY ExtensionalDefinition (__IDExtensionalDefinition__)
) ;

CREATE TABLE Facet (
	__IDFacet__ Integer NOT NULL,
	PRIMARY KEY Facet (__IDFacet__)
) ;

CREATE TABLE Fact (
	__IDFact__ Integer NOT NULL,
	PRIMARY KEY Fact (__IDFact__)
) ;

CREATE TABLE FactModel (
	__IDFactModel__ Integer NOT NULL,
	PRIMARY KEY FactModel (__IDFactModel__)
) ;

CREATE TABLE FactSymbol (
	__IDFactSymbol__ Integer NOT NULL,
	PRIMARY KEY FactSymbol (__IDFactSymbol__)
) ;

CREATE TABLE FactTypeHasFactInFactModel (
	__IDFactTypeHasFactInFactModel__ Integer NOT NULL,
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	FOREIGN KEY fact (__FKfact__) REFERENCES Fact (__IDFact__),
	FOREIGN KEY factModel (__FKfactModel__) REFERENCES FactModel (__IDFactModel__),
	PRIMARY KEY FactTypeHasFactInFactModel (__IDFactTypeHasFactInFactModel__),
	__FKfactType__ Integer,
	__FKfact__ Integer,
	__FKfactModel__ Integer
) ;

CREATE TABLE FactTypeNominalization (
	__IDFactTypeNominalization__ Integer NOT NULL,
	PRIMARY KEY FactTypeNominalization (__IDFactTypeNominalization__)
) ;

CREATE TABLE FactTypeRoleDesignation (
	__IDFactTypeRoleDesignation__ Integer NOT NULL,
	PRIMARY KEY FactTypeRoleDesignation (__IDFactTypeRoleDesignation__)
) ;

CREATE TABLE FactTypeTemplating (
	__IDFactTypeTemplating__ Integer NOT NULL,
	PRIMARY KEY FactTypeTemplating (__IDFactTypeTemplating__)
) ;

CREATE TABLE FormalRepresentation (
	__IDFormalRepresentation__ Integer NOT NULL,
	PRIMARY KEY FormalRepresentation (__IDFormalRepresentation__)
) ;

CREATE TABLE FundamentalConcept (
	__IDFundamentalConcept__ Integer NOT NULL,
	PRIMARY KEY FundamentalConcept (__IDFundamentalConcept__)
) ;

CREATE TABLE Icon (
	__IDIcon__ Integer NOT NULL,
	PRIMARY KEY Icon (__IDIcon__)
) ;

CREATE TABLE NonverbalDesignation (
	__IDNonverbalDesignation__ Integer NOT NULL,
	PRIMARY KEY NonverbalDesignation (__IDNonverbalDesignation__)
) ;

CREATE TABLE Implication (
	__IDImplication__ Integer NOT NULL,
	PRIMARY KEY Implication (__IDImplication__)
) ;

CREATE TABLE ImpossibilityStatement (
	__IDImpossibilityStatement__ Integer NOT NULL,
	PRIMARY KEY ImpossibilityStatement (__IDImpossibilityStatement__)
) ;

CREATE TABLE StructuralRuleStatement (
	__IDStructuralRuleStatement__ Integer NOT NULL,
	PRIMARY KEY StructuralRuleStatement (__IDStructuralRuleStatement__)
) ;

CREATE TABLE RuleStatement (
	__IDRuleStatement__ Integer NOT NULL,
	PRIMARY KEY RuleStatement (__IDRuleStatement__)
) ;

CREATE TABLE IndividualConcept (
	__IDIndividualConcept__ Integer NOT NULL,
	PRIMARY KEY IndividualConcept (__IDIndividualConcept__)
) ;

CREATE TABLE InformalRepresentation (
	__IDInformalRepresentation__ Integer NOT NULL,
	PRIMARY KEY InformalRepresentation (__IDInformalRepresentation__)
) ;

CREATE TABLE InstantiationFormulation (
	__IDInstantiationFormulation__ Integer NOT NULL,
	PRIMARY KEY InstantiationFormulation (__IDInstantiationFormulation__)
) ;

CREATE TABLE IsfacetofFactType (
	__IDIsfacetofFactType__ Integer NOT NULL,
	PRIMARY KEY IsfacetofFactType (__IDIsfacetofFactType__)
) ;

CREATE TABLE IspropertyofFactType (
	__IDIspropertyofFactType__ Integer NOT NULL,
	PRIMARY KEY IspropertyofFactType (__IDIspropertyofFactType__)
) ;

CREATE TABLE IsroleofFactType (
	__IDIsroleofFactType__ Integer NOT NULL,
	PRIMARY KEY IsroleofFactType (__IDIsroleofFactType__)
) ;

CREATE TABLE KindOfGuidanceStatement (
	__IDKindOfGuidanceStatement__ Integer NOT NULL,
	PRIMARY KEY KindOfGuidanceStatement (__IDKindOfGuidanceStatement__)
) ;

CREATE TABLE Language (
	__IDLanguage__ Integer NOT NULL,
	PRIMARY KEY Language (__IDLanguage__)
) ;

CREATE TABLE LevelOfEnforcement (
	__IDLevelOfEnforcement__ Integer NOT NULL,
	PRIMARY KEY LevelOfEnforcement (__IDLevelOfEnforcement__)
) ;

CREATE TABLE LogicalFormulationKind (
	__IDLogicalFormulationKind__ Integer NOT NULL,
	PRIMARY KEY LogicalFormulationKind (__IDLogicalFormulationKind__)
) ;

CREATE TABLE LogicalNegation (
	__IDLogicalNegation__ Integer NOT NULL,
	PRIMARY KEY LogicalNegation (__IDLogicalNegation__)
) ;

CREATE TABLE ModalFormulation (
	__IDModalFormulation__ Integer NOT NULL,
	PRIMARY KEY ModalFormulation (__IDModalFormulation__)
) ;

CREATE TABLE NandFormulation (
	__IDNandFormulation__ Integer NOT NULL,
	PRIMARY KEY NandFormulation (__IDNandFormulation__)
) ;

CREATE TABLE NecessityFormulation (
	__IDNecessityFormulation__ Integer NOT NULL,
	PRIMARY KEY NecessityFormulation (__IDNecessityFormulation__)
) ;

CREATE TABLE NecessityStatement (
	__IDNecessityStatement__ Integer NOT NULL,
	PRIMARY KEY NecessityStatement (__IDNecessityStatement__)
) ;

CREATE TABLE NonnecessityStatement (
	__IDNonnecessityStatement__ Integer NOT NULL,
	PRIMARY KEY NonnecessityStatement (__IDNonnecessityStatement__)
) ;

CREATE TABLE NonobligationStatement (
	__IDNonobligationStatement__ Integer NOT NULL,
	PRIMARY KEY NonobligationStatement (__IDNonobligationStatement__)
) ;

CREATE TABLE StatementOfAdviceOfPermission (
	__IDStatementOfAdviceOfPermission__ Integer NOT NULL,
	PRIMARY KEY StatementOfAdviceOfPermission (__IDStatementOfAdviceOfPermission__)
) ;

CREATE TABLE NorFormulation (
	__IDNorFormulation__ Integer NOT NULL,
	PRIMARY KEY NorFormulation (__IDNorFormulation__)
) ;

CREATE TABLE Note (
	__IDNote__ Integer NOT NULL,
	PRIMARY KEY Note (__IDNote__)
) ;

CREATE TABLE NounConceptNominalization (
	__IDNounConceptNominalization__ Integer NOT NULL,
	PRIMARY KEY NounConceptNominalization (__IDNounConceptNominalization__)
) ;

CREATE TABLE NounForm (
	__IDNounForm__ Integer NOT NULL,
	PRIMARY KEY NounForm (__IDNounForm__)
) ;

CREATE TABLE NumericRangeQuantification (
	__IDNumericRangeQuantification__ Integer NOT NULL,
	FOREIGN KEY maximumCardinality (__FKmaximumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	FOREIGN KEY minimumCardinality (__FKminimumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY NumericRangeQuantification (__IDNumericRangeQuantification__),
	__FKmaximumCardinality__ Integer,
	__FKminimumCardinality__ Integer
) ;

CREATE TABLE Objectification (
	__IDObjectification__ Integer NOT NULL,
	PRIMARY KEY Objectification (__IDObjectification__)
) ;

CREATE TABLE ObligationFormulation (
	__IDObligationFormulation__ Integer NOT NULL,
	PRIMARY KEY ObligationFormulation (__IDObligationFormulation__)
) ;

CREATE TABLE ObligationStatement (
	__IDObligationStatement__ Integer NOT NULL,
	PRIMARY KEY ObligationStatement (__IDObligationStatement__)
) ;

CREATE TABLE OperativeBusinessRuleStatement (
	__IDOperativeBusinessRuleStatement__ Integer NOT NULL,
	PRIMARY KEY OperativeBusinessRuleStatement (__IDOperativeBusinessRuleStatement__)
) ;

CREATE TABLE OperativeBusinessRule (
	__IDOperativeBusinessRule__ Integer NOT NULL,
	PRIMARY KEY OperativeBusinessRule (__IDOperativeBusinessRule__)
) ;

CREATE TABLE OptionalityStatement (
	__IDOptionalityStatement__ Integer NOT NULL,
	PRIMARY KEY OptionalityStatement (__IDOptionalityStatement__)
) ;

CREATE TABLE OwnedDefinition (
	__IDOwnedDefinition__ Integer NOT NULL,
	PRIMARY KEY OwnedDefinition (__IDOwnedDefinition__)
) ;

CREATE TABLE PartitiveFactType (
	__IDPartitiveFactType__ Integer NOT NULL,
	PRIMARY KEY PartitiveFactType (__IDPartitiveFactType__)
) ;

CREATE TABLE PermissibilityFormulation (
	__IDPermissibilityFormulation__ Integer NOT NULL,
	PRIMARY KEY PermissibilityFormulation (__IDPermissibilityFormulation__)
) ;

CREATE TABLE PermissionStatement (
	__IDPermissionStatement__ Integer NOT NULL,
	PRIMARY KEY PermissionStatement (__IDPermissionStatement__)
) ;

CREATE TABLE PossibilityFormulation (
	__IDPossibilityFormulation__ Integer NOT NULL,
	PRIMARY KEY PossibilityFormulation (__IDPossibilityFormulation__)
) ;

CREATE TABLE PossibilityStatement (
	__IDPossibilityStatement__ Integer NOT NULL,
	PRIMARY KEY PossibilityStatement (__IDPossibilityStatement__)
) ;

CREATE TABLE PreferredDesignation (
	__IDPreferredDesignation__ Integer NOT NULL,
	PRIMARY KEY PreferredDesignation (__IDPreferredDesignation__)
) ;

CREATE TABLE ProhibitedDesignation (
	__IDProhibitedDesignation__ Integer NOT NULL,
	PRIMARY KEY ProhibitedDesignation (__IDProhibitedDesignation__)
) ;

CREATE TABLE ProhibitionStatement (
	__IDProhibitionStatement__ Integer NOT NULL,
	PRIMARY KEY ProhibitionStatement (__IDProhibitionStatement__)
) ;

CREATE TABLE PropositionNominalization (
	__IDPropositionNominalization__ Integer NOT NULL,
	PRIMARY KEY PropositionNominalization (__IDPropositionNominalization__)
) ;

CREATE TABLE Question (
	__IDQuestion__ Integer NOT NULL,
	PRIMARY KEY Question (__IDQuestion__)
) ;

CREATE TABLE QuestionNominalization (
	__IDQuestionNominalization__ Integer NOT NULL,
	PRIMARY KEY QuestionNominalization (__IDQuestionNominalization__)
) ;

CREATE TABLE RealworldNumericalCorrespondence (
	__IDRealworldNumericalCorrespondence__ Integer NOT NULL,
	PRIMARY KEY RealworldNumericalCorrespondence (__IDRealworldNumericalCorrespondence__)
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	PRIMARY KEY Reference (__IDReference__)
) ;

CREATE TABLE RepresentationFormality (
	__IDRepresentationFormality__ Integer NOT NULL,
	PRIMARY KEY RepresentationFormality (__IDRepresentationFormality__)
) ;

CREATE TABLE Res (
	__IDRes__ Integer NOT NULL,
	PRIMARY KEY Res (__IDRes__)
) ;

CREATE TABLE RestrictedPermissionStatement (
	__IDRestrictedPermissionStatement__ Integer NOT NULL,
	PRIMARY KEY RestrictedPermissionStatement (__IDRestrictedPermissionStatement__)
) ;

CREATE TABLE RestrictedPossibilityStatement (
	__IDRestrictedPossibilityStatement__ Integer NOT NULL,
	PRIMARY KEY RestrictedPossibilityStatement (__IDRestrictedPossibilityStatement__)
) ;

CREATE TABLE Rulebook (
	__IDRulebook__ Integer NOT NULL,
	PRIMARY KEY Rulebook (__IDRulebook__)
) ;

CREATE TABLE SemanticCommunity (
	__IDSemanticCommunity__ Integer NOT NULL,
	PRIMARY KEY SemanticCommunity (__IDSemanticCommunity__)
) ;

CREATE TABLE SpeechCommunity (
	__IDSpeechCommunity__ Integer NOT NULL,
	PRIMARY KEY SpeechCommunity (__IDSpeechCommunity__)
) ;

CREATE TABLE SententialForm (
	__IDSententialForm__ Integer NOT NULL,
	PRIMARY KEY SententialForm (__IDSententialForm__)
) ;

CREATE TABLE SetProjection (
	__IDSetProjection__ Integer NOT NULL,
	PRIMARY KEY SetProjection (__IDSetProjection__)
) ;

CREATE TABLE Situation (
	__IDSituation__ Integer NOT NULL,
	PRIMARY KEY Situation (__IDSituation__)
) ;

CREATE TABLE SituationalRole (
	__IDSituationalRole__ Integer NOT NULL,
	PRIMARY KEY SituationalRole (__IDSituationalRole__)
) ;

CREATE TABLE SpeechCommunityAdoptsAdoptedDefinitionCitingReference (
	__IDSpeechCommunityAdoptsAdoptedDefinitionCitingReference__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY adoptedDefinition (__FKadoptedDefinition__) REFERENCES AdoptedDefinition (__IDAdoptedDefinition__),
	FOREIGN KEY reference (__FKreference__) REFERENCES Reference (__IDReference__),
	PRIMARY KEY SpeechCommunityAdoptsAdoptedDefinitionCitingReference (__IDSpeechCommunityAdoptsAdoptedDefinitionCitingReference__),
	__FKspeechCommunity__ Integer,
	__FKadoptedDefinition__ Integer,
	__FKreference__ Integer
) ;

CREATE TABLE StateOfAffairsInvolvesThingInRole (
	__IDStateOfAffairsInvolvesThingInRole__ Integer NOT NULL,
	FOREIGN KEY stateOfAffairs (__FKstateOfAffairs__) REFERENCES StateOfAffairs (__IDStateOfAffairs__),
	FOREIGN KEY thing (__FKthing__) REFERENCES Thing (__IDThing__),
	FOREIGN KEY role (__FKrole__) REFERENCES Role (__IDRole__),
	PRIMARY KEY StateOfAffairsInvolvesThingInRole (__IDStateOfAffairsInvolvesThingInRole__),
	__FKstateOfAffairs__ Integer,
	__FKthing__ Integer,
	__FKrole__ Integer
) ;

CREATE TABLE StructuralBusinessRule (
	__IDStructuralBusinessRule__ Integer NOT NULL,
	PRIMARY KEY StructuralBusinessRule (__IDStructuralBusinessRule__)
) ;

CREATE TABLE StructuralRule (
	__IDStructuralRule__ Integer NOT NULL,
	PRIMARY KEY StructuralRule (__IDStructuralRule__)
) ;

CREATE TABLE SubjectField (
	__IDSubjectField__ Integer NOT NULL,
	PRIMARY KEY SubjectField (__IDSubjectField__)
) ;

CREATE TABLE Term (
	__IDTerm__ Integer NOT NULL,
	PRIMARY KEY Term (__IDTerm__)
) ;

CREATE TABLE TerminologicalDictionary (
	__IDTerminologicalDictionary__ Integer NOT NULL,
	PRIMARY KEY TerminologicalDictionary (__IDTerminologicalDictionary__)
) ;

CREATE TABLE ThingInContext (
	__IDThingInContext__ Integer NOT NULL,
	PRIMARY KEY ThingInContext (__IDThingInContext__)
) ;

CREATE TABLE UniversalQuantification (
	__IDUniversalQuantification__ Integer NOT NULL,
	PRIMARY KEY UniversalQuantification (__IDUniversalQuantification__)
) ;

CREATE TABLE Viewpoint (
	__IDViewpoint__ Integer NOT NULL,
	PRIMARY KEY Viewpoint (__IDViewpoint__)
) ;

CREATE TABLE VocabularyNamespace (
	__IDVocabularyNamespace__ Integer NOT NULL,
	PRIMARY KEY VocabularyNamespace (__IDVocabularyNamespace__)
) ;

CREATE TABLE WhetherornotFormulation (
	__IDWhetherornotFormulation__ Integer NOT NULL,
	PRIMARY KEY WhetherornotFormulation (__IDWhetherornotFormulation__)
) ;

CREATE TABLE AtleastnQuantificationHasMinimumCardinality (
	__IDAtleastnQuantificationHasMinimumCardinality__ Integer NOT NULL,
	FOREIGN KEY atleastnQuantification (__FKatleastnQuantification__) REFERENCES AtleastnQuantification (__IDAtleastnQuantification__),
	FOREIGN KEY minimumCardinality (__FKminimumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY AtleastnQuantificationHasMinimumCardinality (__IDAtleastnQuantificationHasMinimumCardinality__),
	__FKatleastnQuantification__ Integer,
	__FKminimumCardinality__ Integer
) ;

CREATE TABLE AtmostnQuantificationHasMaximumCardinality (
	__IDAtmostnQuantificationHasMaximumCardinality__ Integer NOT NULL,
	FOREIGN KEY atmostnQuantification (__FKatmostnQuantification__) REFERENCES AtmostnQuantification (__IDAtmostnQuantification__),
	FOREIGN KEY maximumCardinality (__FKmaximumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY AtmostnQuantificationHasMaximumCardinality (__IDAtmostnQuantificationHasMaximumCardinality__),
	__FKatmostnQuantification__ Integer,
	__FKmaximumCardinality__ Integer
) ;

CREATE TABLE AtomicFormulationIsBasedOnFactType (
	__IDAtomicFormulationIsBasedOnFactType__ Integer NOT NULL,
	FOREIGN KEY atomicFormulation (__FKatomicFormulation__) REFERENCES AtomicFormulation (__IDAtomicFormulation__),
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	PRIMARY KEY AtomicFormulationIsBasedOnFactType (__IDAtomicFormulationIsBasedOnFactType__),
	__FKatomicFormulation__ Integer,
	__FKfactType__ Integer
) ;

CREATE TABLE AttributiveNamespaceIsForSubjectConcept (
	__IDAttributiveNamespaceIsForSubjectConcept__ Integer NOT NULL,
	FOREIGN KEY attributiveNamespace (__FKattributiveNamespace__) REFERENCES AttributiveNamespace (__IDAttributiveNamespace__),
	FOREIGN KEY subjectConcept (__FKsubjectConcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY AttributiveNamespaceIsForSubjectConcept (__IDAttributiveNamespaceIsForSubjectConcept__),
	__FKattributiveNamespace__ Integer,
	__FKsubjectConcept__ Integer
) ;

CREATE TABLE AttributiveNamespaceIsWithinVocabularyNamespace (
	__IDAttributiveNamespaceIsWithinVocabularyNamespace__ Integer NOT NULL,
	FOREIGN KEY attributiveNamespace (__FKattributiveNamespace__) REFERENCES AttributiveNamespace (__IDAttributiveNamespace__),
	FOREIGN KEY vocabularyNamespace (__FKvocabularyNamespace__) REFERENCES VocabularyNamespace (__IDVocabularyNamespace__),
	PRIMARY KEY AttributiveNamespaceIsWithinVocabularyNamespace (__IDAttributiveNamespaceIsWithinVocabularyNamespace__),
	__FKattributiveNamespace__ Integer,
	__FKvocabularyNamespace__ Integer
) ;

CREATE TABLE BinaryLogicalOperationHasLogicalOperand1 (
	__IDBinaryLogicalOperationHasLogicalOperand1__ Integer NOT NULL,
	FOREIGN KEY binaryLogicalOperation (__FKbinaryLogicalOperation__) REFERENCES BinaryLogicalOperation (__IDBinaryLogicalOperation__),
	FOREIGN KEY logicalOperand1 (__FKlogicalOperand1__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY BinaryLogicalOperationHasLogicalOperand1 (__IDBinaryLogicalOperationHasLogicalOperand1__),
	__FKbinaryLogicalOperation__ Integer,
	__FKlogicalOperand1__ Integer
) ;

CREATE TABLE BinaryLogicalOperationHasLogicalOperand2 (
	__IDBinaryLogicalOperationHasLogicalOperand2__ Integer NOT NULL,
	FOREIGN KEY binaryLogicalOperation (__FKbinaryLogicalOperation__) REFERENCES BinaryLogicalOperation (__IDBinaryLogicalOperation__),
	FOREIGN KEY logicalOperand2 (__FKlogicalOperand2__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY BinaryLogicalOperationHasLogicalOperand2 (__IDBinaryLogicalOperationHasLogicalOperand2__),
	__FKbinaryLogicalOperation__ Integer,
	__FKlogicalOperand2__ Integer
) ;

CREATE TABLE BodyOfSharedMeaningsIncludesBodyOfSharedConcepts (
	__IDBodyOfSharedMeaningsIncludesBodyOfSharedConcepts__ Integer NOT NULL,
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	FOREIGN KEY bodyOfSharedConcepts (__FKbodyOfSharedConcepts__) REFERENCES BodyOfSharedConcepts (__IDBodyOfSharedConcepts__),
	PRIMARY KEY BodyOfSharedMeaningsIncludesBodyOfSharedConcepts (__IDBodyOfSharedMeaningsIncludesBodyOfSharedConcepts__),
	__FKbodyOfSharedMeanings__ Integer,
	__FKbodyOfSharedConcepts__ Integer
) ;

CREATE TABLE BodyOfSharedMeaningsIncludesBodyOfSharedGuidance (
	__IDBodyOfSharedMeaningsIncludesBodyOfSharedGuidance__ Integer NOT NULL,
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	FOREIGN KEY bodyOfSharedGuidance (__FKbodyOfSharedGuidance__) REFERENCES BodyOfSharedGuidance (__IDBodyOfSharedGuidance__),
	PRIMARY KEY BodyOfSharedMeaningsIncludesBodyOfSharedGuidance (__IDBodyOfSharedMeaningsIncludesBodyOfSharedGuidance__),
	__FKbodyOfSharedMeanings__ Integer,
	__FKbodyOfSharedGuidance__ Integer
) ;

CREATE TABLE BodyOfSharedMeaningsUnitesSemanticCommunity (
	__IDBodyOfSharedMeaningsUnitesSemanticCommunity__ Integer NOT NULL,
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	FOREIGN KEY semanticCommunity (__FKsemanticCommunity__) REFERENCES SemanticCommunity (__IDSemanticCommunity__),
	PRIMARY KEY BodyOfSharedMeaningsUnitesSemanticCommunity (__IDBodyOfSharedMeaningsUnitesSemanticCommunity__),
	__FKbodyOfSharedMeanings__ Integer,
	__FKsemanticCommunity__ Integer
) ;

CREATE TABLE BodyOfSharedMeanings1ContainsBodyOfSharedMeanings2 (
	__IDBodyOfSharedMeanings1ContainsBodyOfSharedMeanings2__ Integer NOT NULL,
	FOREIGN KEY bodyOfSharedMeanings1 (__FKbodyOfSharedMeanings1__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	FOREIGN KEY bodyOfSharedMeanings2 (__FKbodyOfSharedMeanings2__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	PRIMARY KEY BodyOfSharedMeanings1ContainsBodyOfSharedMeanings2 (__IDBodyOfSharedMeanings1ContainsBodyOfSharedMeanings2__),
	__FKbodyOfSharedMeanings1__ Integer,
	__FKbodyOfSharedMeanings2__ Integer
) ;

CREATE TABLE BusinessPolicyIsBasisForAdvice (
	__IDBusinessPolicyIsBasisForAdvice__ Integer NOT NULL,
	FOREIGN KEY businessPolicy (__FKbusinessPolicy__) REFERENCES BusinessPolicy (__IDBusinessPolicy__),
	FOREIGN KEY advice (__FKadvice__) REFERENCES Advice (__IDAdvice__),
	PRIMARY KEY BusinessPolicyIsBasisForAdvice (__IDBusinessPolicyIsBasisForAdvice__),
	__FKbusinessPolicy__ Integer,
	__FKadvice__ Integer
) ;

CREATE TABLE BusinessRuleIsDerivedFromBusinessPolicy (
	__IDBusinessRuleIsDerivedFromBusinessPolicy__ Integer NOT NULL,
	FOREIGN KEY businessRule (__FKbusinessRule__) REFERENCES BusinessRule (__IDBusinessRule__),
	FOREIGN KEY businessPolicy (__FKbusinessPolicy__) REFERENCES BusinessPolicy (__IDBusinessPolicy__),
	PRIMARY KEY BusinessRuleIsDerivedFromBusinessPolicy (__IDBusinessRuleIsDerivedFromBusinessPolicy__),
	__FKbusinessRule__ Integer,
	__FKbusinessPolicy__ Integer
) ;

CREATE TABLE CategorizationSchemeContainsCategory (
	__IDCategorizationSchemeContainsCategory__ Integer NOT NULL,
	FOREIGN KEY categorizationScheme (__FKcategorizationScheme__) REFERENCES CategorizationScheme (__IDCategorizationScheme__),
	FOREIGN KEY category (__FKcategory__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY CategorizationSchemeContainsCategory (__IDCategorizationSchemeContainsCategory__),
	__FKcategorizationScheme__ Integer,
	__FKcategory__ Integer
) ;

CREATE TABLE CategorizationSchemeIsForGeneralConcept (
	__IDCategorizationSchemeIsForGeneralConcept__ Integer NOT NULL,
	FOREIGN KEY categorizationScheme (__FKcategorizationScheme__) REFERENCES CategorizationScheme (__IDCategorizationScheme__),
	FOREIGN KEY generalConcept (__FKgeneralConcept__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY CategorizationSchemeIsForGeneralConcept (__IDCategorizationSchemeIsForGeneralConcept__),
	__FKcategorizationScheme__ Integer,
	__FKgeneralConcept__ Integer
) ;

CREATE TABLE CategorizationTypeIsForGeneralConcept (
	__IDCategorizationTypeIsForGeneralConcept__ Integer NOT NULL,
	FOREIGN KEY categorizationType (__FKcategorizationType__) REFERENCES CategorizationType (__IDCategorizationType__),
	FOREIGN KEY generalConcept (__FKgeneralConcept__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY CategorizationTypeIsForGeneralConcept (__IDCategorizationTypeIsForGeneralConcept__),
	__FKcategorizationType__ Integer,
	__FKgeneralConcept__ Integer
) ;

CREATE TABLE ClosedLogicalFormulationFormalizesStatement (
	__IDClosedLogicalFormulationFormalizesStatement__ Integer NOT NULL,
	FOREIGN KEY closedLogicalFormulation (__FKclosedLogicalFormulation__) REFERENCES ClosedLogicalFormulation (__IDClosedLogicalFormulation__),
	FOREIGN KEY statement (__FKstatement__) REFERENCES Statement (__IDStatement__),
	PRIMARY KEY ClosedLogicalFormulationFormalizesStatement (__IDClosedLogicalFormulationFormalizesStatement__),
	__FKclosedLogicalFormulation__ Integer,
	__FKstatement__ Integer
) ;

CREATE TABLE ClosedLogicalFormulationMeansProposition (
	__IDClosedLogicalFormulationMeansProposition__ Integer NOT NULL,
	FOREIGN KEY closedLogicalFormulation (__FKclosedLogicalFormulation__) REFERENCES ClosedLogicalFormulation (__IDClosedLogicalFormulation__),
	FOREIGN KEY proposition (__FKproposition__) REFERENCES Proposition (__IDProposition__),
	PRIMARY KEY ClosedLogicalFormulationMeansProposition (__IDClosedLogicalFormulationMeansProposition__),
	__FKclosedLogicalFormulation__ Integer,
	__FKproposition__ Integer
) ;

CREATE TABLE ClosedProjectionDefinesFactType (
	__IDClosedProjectionDefinesFactType__ Integer NOT NULL,
	FOREIGN KEY closedProjection (__FKclosedProjection__) REFERENCES ClosedProjection (__IDClosedProjection__),
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	PRIMARY KEY ClosedProjectionDefinesFactType (__IDClosedProjectionDefinesFactType__),
	__FKclosedProjection__ Integer,
	__FKfactType__ Integer
) ;

CREATE TABLE ClosedProjectionDefinesNounConcept (
	__IDClosedProjectionDefinesNounConcept__ Integer NOT NULL,
	FOREIGN KEY closedProjection (__FKclosedProjection__) REFERENCES ClosedProjection (__IDClosedProjection__),
	FOREIGN KEY nounConcept (__FKnounConcept__) REFERENCES NounConcept (__IDNounConcept__),
	PRIMARY KEY ClosedProjectionDefinesNounConcept (__IDClosedProjectionDefinesNounConcept__),
	__FKclosedProjection__ Integer,
	__FKnounConcept__ Integer
) ;

CREATE TABLE ClosedProjectionFormalizesDefinition (
	__IDClosedProjectionFormalizesDefinition__ Integer NOT NULL,
	FOREIGN KEY closedProjection (__FKclosedProjection__) REFERENCES ClosedProjection (__IDClosedProjection__),
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Definition (__IDDefinition__),
	PRIMARY KEY ClosedProjectionFormalizesDefinition (__IDClosedProjectionFormalizesDefinition__),
	__FKclosedProjection__ Integer,
	__FKdefinition__ Integer
) ;

CREATE TABLE ClosedProjectionMeansQuestion (
	__IDClosedProjectionMeansQuestion__ Integer NOT NULL,
	FOREIGN KEY closedProjection (__FKclosedProjection__) REFERENCES ClosedProjection (__IDClosedProjection__),
	FOREIGN KEY question (__FKquestion__) REFERENCES Question (__IDQuestion__),
	PRIMARY KEY ClosedProjectionMeansQuestion (__IDClosedProjectionMeansQuestion__),
	__FKclosedProjection__ Integer,
	__FKquestion__ Integer
) ;

CREATE TABLE ClosedSemanticFormulationFormulatesMeaning (
	__IDClosedSemanticFormulationFormulatesMeaning__ Integer NOT NULL,
	FOREIGN KEY closedSemanticFormulation (__FKclosedSemanticFormulation__) REFERENCES ClosedSemanticFormulation (__IDClosedSemanticFormulation__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY ClosedSemanticFormulationFormulatesMeaning (__IDClosedSemanticFormulationFormulatesMeaning__),
	__FKclosedSemanticFormulation__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE CommunicationContentIsComposedOfRepresentation (
	__IDCommunicationContentIsComposedOfRepresentation__ Integer NOT NULL,
	FOREIGN KEY communicationContent (__FKcommunicationContent__) REFERENCES CommunicationContent (__IDCommunicationContent__),
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	PRIMARY KEY CommunicationContentIsComposedOfRepresentation (__IDCommunicationContentIsComposedOfRepresentation__),
	__FKcommunicationContent__ Integer,
	__FKrepresentation__ Integer
) ;

CREATE TABLE CommunityHasSubcommunity (
	__IDCommunityHasSubcommunity__ Integer NOT NULL,
	FOREIGN KEY community (__FKcommunity__) REFERENCES Community (__IDCommunity__),
	FOREIGN KEY subcommunity (__FKsubcommunity__) REFERENCES Community (__IDCommunity__),
	PRIMARY KEY CommunityHasSubcommunity (__IDCommunityHasSubcommunity__),
	__FKcommunity__ Integer,
	__FKsubcommunity__ Integer
) ;

CREATE TABLE CommunityHasUri (
	__IDCommunityHasUri__ Integer NOT NULL,
	FOREIGN KEY community (__FKcommunity__) REFERENCES Community (__IDCommunity__),
	FOREIGN KEY uri (__FKuri__) REFERENCES Uri (__IDUri__),
	PRIMARY KEY CommunityHasUri (__IDCommunityHasUri__),
	__FKcommunity__ Integer,
	__FKuri__ Integer
) ;

CREATE TABLE ConceptHasDefinition (
	__IDConceptHasDefinition__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Definition (__IDDefinition__),
	PRIMARY KEY ConceptHasDefinition (__IDConceptHasDefinition__),
	__FKconcept__ Integer,
	__FKdefinition__ Integer
) ;

CREATE TABLE ConceptHasDesignation (
	__IDConceptHasDesignation__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	PRIMARY KEY ConceptHasDesignation (__IDConceptHasDesignation__),
	__FKconcept__ Integer,
	__FKdesignation__ Integer
) ;

CREATE TABLE ConceptHasExtension (
	__IDConceptHasExtension__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY extension (__FKextension__) REFERENCES "Set" (__IDSet__),
	PRIMARY KEY ConceptHasExtension (__IDConceptHasExtension__),
	__FKconcept__ Integer,
	__FKextension__ Integer
) ;

CREATE TABLE ConceptHasImpliedCharacteristic (
	__IDConceptHasImpliedCharacteristic__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY impliedCharacteristic (__FKimpliedCharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY ConceptHasImpliedCharacteristic (__IDConceptHasImpliedCharacteristic__),
	__FKconcept__ Integer,
	__FKimpliedCharacteristic__ Integer
) ;

CREATE TABLE ConceptHasInstance (
	__IDConceptHasInstance__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY ConceptHasInstance (__IDConceptHasInstance__),
	__FKconcept__ Integer,
	__FKinstance__ Integer
) ;

CREATE TABLE ConceptHasNecessaryCharacteristic (
	__IDConceptHasNecessaryCharacteristic__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY necessaryCharacteristic (__FKnecessaryCharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY ConceptHasNecessaryCharacteristic (__IDConceptHasNecessaryCharacteristic__),
	__FKconcept__ Integer,
	__FKnecessaryCharacteristic__ Integer
) ;

CREATE TABLE ConceptHasSharedUnderstandingBySemanticCommunity (
	__IDConceptHasSharedUnderstandingBySemanticCommunity__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY semanticCommunity (__FKsemanticCommunity__) REFERENCES SemanticCommunity (__IDSemanticCommunity__),
	PRIMARY KEY ConceptHasSharedUnderstandingBySemanticCommunity (__IDConceptHasSharedUnderstandingBySemanticCommunity__),
	__FKconcept__ Integer,
	__FKsemanticCommunity__ Integer
) ;

CREATE TABLE ConceptIncorporatesCharacteristic (
	__IDConceptIncorporatesCharacteristic__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY characteristic (__FKcharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY ConceptIncorporatesCharacteristic (__IDConceptIncorporatesCharacteristic__),
	__FKconcept__ Integer,
	__FKcharacteristic__ Integer
) ;

CREATE TABLE ConceptIsClosedInConceptualSchema (
	__IDConceptIsClosedInConceptualSchema__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY conceptualSchema (__FKconceptualSchema__) REFERENCES ConceptualSchema (__IDConceptualSchema__),
	PRIMARY KEY ConceptIsClosedInConceptualSchema (__IDConceptIsClosedInConceptualSchema__),
	__FKconcept__ Integer,
	__FKconceptualSchema__ Integer
) ;

CREATE TABLE ConceptIsIncludedInBodyOfSharedConcepts (
	__IDConceptIsIncludedInBodyOfSharedConcepts__ Integer NOT NULL,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY bodyOfSharedConcepts (__FKbodyOfSharedConcepts__) REFERENCES BodyOfSharedConcepts (__IDBodyOfSharedConcepts__),
	PRIMARY KEY ConceptIsIncludedInBodyOfSharedConcepts (__IDConceptIsIncludedInBodyOfSharedConcepts__),
	__FKconcept__ Integer,
	__FKbodyOfSharedConcepts__ Integer
) ;

CREATE TABLE Concept1IsCoextensiveWithConcept2 (
	__IDConcept1IsCoextensiveWithConcept2__ Integer NOT NULL,
	FOREIGN KEY concept1 (__FKconcept1__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY concept2 (__FKconcept2__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY Concept1IsCoextensiveWithConcept2 (__IDConcept1IsCoextensiveWithConcept2__),
	__FKconcept1__ Integer,
	__FKconcept2__ Integer
) ;

CREATE TABLE Concept1SpecializesConcept2 (
	__IDConcept1SpecializesConcept2__ Integer NOT NULL,
	FOREIGN KEY concept1 (__FKconcept1__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY concept2 (__FKconcept2__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY Concept1SpecializesConcept2 (__IDConcept1SpecializesConcept2__),
	__FKconcept1__ Integer,
	__FKconcept2__ Integer
) ;

CREATE TABLE ConceptualSchemaIncludesConcept (
	__IDConceptualSchemaIncludesConcept__ Integer NOT NULL,
	FOREIGN KEY conceptualSchema (__FKconceptualSchema__) REFERENCES ConceptualSchema (__IDConceptualSchema__),
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY ConceptualSchemaIncludesConcept (__IDConceptualSchemaIncludesConcept__),
	__FKconceptualSchema__ Integer,
	__FKconcept__ Integer
) ;

CREATE TABLE ConceptualSchemaIncludesFact (
	__IDConceptualSchemaIncludesFact__ Integer NOT NULL,
	FOREIGN KEY conceptualSchema (__FKconceptualSchema__) REFERENCES ConceptualSchema (__IDConceptualSchema__),
	FOREIGN KEY fact (__FKfact__) REFERENCES Fact (__IDFact__),
	PRIMARY KEY ConceptualSchemaIncludesFact (__IDConceptualSchemaIncludesFact__),
	__FKconceptualSchema__ Integer,
	__FKfact__ Integer
) ;

CREATE TABLE DefinitionServesAsDesignation (
	__IDDefinitionServesAsDesignation__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Definition (__IDDefinition__),
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	PRIMARY KEY DefinitionServesAsDesignation (__IDDefinitionServesAsDesignation__),
	__FKdefinition__ Integer,
	__FKdesignation__ Integer
) ;

CREATE TABLE DescriptionPortraysMeaning (
	__IDDescriptionPortraysMeaning__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Description (__IDDescription__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY DescriptionPortraysMeaning (__IDDescriptionPortraysMeaning__),
	__FKdescription__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE DescriptiveExampleIllustratesMeaning (
	__IDDescriptiveExampleIllustratesMeaning__ Integer NOT NULL,
	FOREIGN KEY descriptiveExample (__FKdescriptiveExample__) REFERENCES DescriptiveExample (__IDDescriptiveExample__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY DescriptiveExampleIllustratesMeaning (__IDDescriptiveExampleIllustratesMeaning__),
	__FKdescriptiveExample__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE DesignationHasSignifier (
	__IDDesignationHasSignifier__ Integer NOT NULL,
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	FOREIGN KEY signifier (__FKsignifier__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY DesignationHasSignifier (__IDDesignationHasSignifier__),
	__FKdesignation__ Integer,
	__FKsignifier__ Integer
) ;

CREATE TABLE DesignationIsInNamespace (
	__IDDesignationIsInNamespace__ Integer NOT NULL,
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY DesignationIsInNamespace (__IDDesignationIsInNamespace__),
	__FKdesignation__ Integer,
	__FKnamespace__ Integer
) ;

CREATE TABLE ElementOfGuidanceAuthorizesStateOfAffairs (
	__IDElementOfGuidanceAuthorizesStateOfAffairs__ Integer NOT NULL,
	FOREIGN KEY elementOfGuidance (__FKelementOfGuidance__) REFERENCES ElementOfGuidance (__IDElementOfGuidance__),
	FOREIGN KEY stateOfAffairs (__FKstateOfAffairs__) REFERENCES StateOfAffairs (__IDStateOfAffairs__),
	PRIMARY KEY ElementOfGuidanceAuthorizesStateOfAffairs (__IDElementOfGuidanceAuthorizesStateOfAffairs__),
	__FKelementOfGuidance__ Integer,
	__FKstateOfAffairs__ Integer
) ;

CREATE TABLE ElementOfGuidanceIsIncludedInBodyOfSharedGuidance (
	__IDElementOfGuidanceIsIncludedInBodyOfSharedGuidance__ Integer NOT NULL,
	FOREIGN KEY elementOfGuidance (__FKelementOfGuidance__) REFERENCES ElementOfGuidance (__IDElementOfGuidance__),
	FOREIGN KEY bodyOfSharedGuidance (__FKbodyOfSharedGuidance__) REFERENCES BodyOfSharedGuidance (__IDBodyOfSharedGuidance__),
	PRIMARY KEY ElementOfGuidanceIsIncludedInBodyOfSharedGuidance (__IDElementOfGuidanceIsIncludedInBodyOfSharedGuidance__),
	__FKelementOfGuidance__ Integer,
	__FKbodyOfSharedGuidance__ Integer
) ;

CREATE TABLE ElementOfGuidanceObligatesStateOfAffairs (
	__IDElementOfGuidanceObligatesStateOfAffairs__ Integer NOT NULL,
	FOREIGN KEY elementOfGuidance (__FKelementOfGuidance__) REFERENCES ElementOfGuidance (__IDElementOfGuidance__),
	FOREIGN KEY stateOfAffairs (__FKstateOfAffairs__) REFERENCES StateOfAffairs (__IDStateOfAffairs__),
	PRIMARY KEY ElementOfGuidanceObligatesStateOfAffairs (__IDElementOfGuidanceObligatesStateOfAffairs__),
	__FKelementOfGuidance__ Integer,
	__FKstateOfAffairs__ Integer
) ;

CREATE TABLE ElementOfGuidanceProhibitsStateOfAffairs (
	__IDElementOfGuidanceProhibitsStateOfAffairs__ Integer NOT NULL,
	FOREIGN KEY elementOfGuidance (__FKelementOfGuidance__) REFERENCES ElementOfGuidance (__IDElementOfGuidance__),
	FOREIGN KEY stateOfAffairs (__FKstateOfAffairs__) REFERENCES StateOfAffairs (__IDStateOfAffairs__),
	PRIMARY KEY ElementOfGuidanceProhibitsStateOfAffairs (__IDElementOfGuidanceProhibitsStateOfAffairs__),
	__FKelementOfGuidance__ Integer,
	__FKstateOfAffairs__ Integer
) ;

CREATE TABLE ExactlynQuantificationHasCardinality (
	__IDExactlynQuantificationHasCardinality__ Integer NOT NULL,
	FOREIGN KEY exactlynQuantification (__FKexactlynQuantification__) REFERENCES ExactlynQuantification (__IDExactlynQuantification__),
	FOREIGN KEY cardinality (__FKcardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY ExactlynQuantificationHasCardinality (__IDExactlynQuantificationHasCardinality__),
	__FKexactlynQuantification__ Integer,
	__FKcardinality__ Integer
) ;

CREATE TABLE ExpressionRepresentsMeaning (
	__IDExpressionRepresentsMeaning__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY ExpressionRepresentsMeaning (__IDExpressionRepresentsMeaning__),
	__FKexpression__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE FactModelIncludesFact (
	__IDFactModelIncludesFact__ Integer NOT NULL,
	FOREIGN KEY factModel (__FKfactModel__) REFERENCES FactModel (__IDFactModel__),
	FOREIGN KEY fact (__FKfact__) REFERENCES Fact (__IDFact__),
	PRIMARY KEY FactModelIncludesFact (__IDFactModelIncludesFact__),
	__FKfactModel__ Integer,
	__FKfact__ Integer
) ;

CREATE TABLE FactModelIsBasedOnConceptualSchema (
	__IDFactModelIsBasedOnConceptualSchema__ Integer NOT NULL,
	FOREIGN KEY factModel (__FKfactModel__) REFERENCES FactModel (__IDFactModel__),
	FOREIGN KEY conceptualSchema (__FKconceptualSchema__) REFERENCES ConceptualSchema (__IDConceptualSchema__),
	PRIMARY KEY FactModelIsBasedOnConceptualSchema (__IDFactModelIsBasedOnConceptualSchema__),
	__FKfactModel__ Integer,
	__FKconceptualSchema__ Integer
) ;

CREATE TABLE FactTypeFormDemonstratesDesignation (
	__IDFactTypeFormDemonstratesDesignation__ Integer NOT NULL,
	FOREIGN KEY factTypeForm (__FKfactTypeForm__) REFERENCES FactTypeForm (__IDFactTypeForm__),
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	PRIMARY KEY FactTypeFormDemonstratesDesignation (__IDFactTypeFormDemonstratesDesignation__),
	__FKfactTypeForm__ Integer,
	__FKdesignation__ Integer
) ;

CREATE TABLE FactTypeFormIncorporatesFactSymbol (
	__IDFactTypeFormIncorporatesFactSymbol__ Integer NOT NULL,
	FOREIGN KEY factTypeForm (__FKfactTypeForm__) REFERENCES FactTypeForm (__IDFactTypeForm__),
	FOREIGN KEY factSymbol (__FKfactSymbol__) REFERENCES FactSymbol (__IDFactSymbol__),
	PRIMARY KEY FactTypeFormIncorporatesFactSymbol (__IDFactTypeFormIncorporatesFactSymbol__),
	__FKfactTypeForm__ Integer,
	__FKfactSymbol__ Integer
) ;

CREATE TABLE FactTypeFormIsInNamespace (
	__IDFactTypeFormIsInNamespace__ Integer NOT NULL,
	FOREIGN KEY factTypeForm (__FKfactTypeForm__) REFERENCES FactTypeForm (__IDFactTypeForm__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY FactTypeFormIsInNamespace (__IDFactTypeFormIsInNamespace__),
	__FKfactTypeForm__ Integer,
	__FKnamespace__ Integer
) ;

CREATE TABLE FactTypeHasFactTypeForm (
	__IDFactTypeHasFactTypeForm__ Integer NOT NULL,
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	FOREIGN KEY factTypeForm (__FKfactTypeForm__) REFERENCES FactTypeForm (__IDFactTypeForm__),
	PRIMARY KEY FactTypeHasFactTypeForm (__IDFactTypeHasFactTypeForm__),
	__FKfactType__ Integer,
	__FKfactTypeForm__ Integer
) ;

CREATE TABLE FactTypeInternallyIsClosedInConceptualSchema (
	__IDFactTypeInternallyIsClosedInConceptualSchema__ Integer NOT NULL,
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	FOREIGN KEY conceptualSchema (__FKconceptualSchema__) REFERENCES ConceptualSchema (__IDConceptualSchema__),
	PRIMARY KEY FactTypeInternallyIsClosedInConceptualSchema (__IDFactTypeInternallyIsClosedInConceptualSchema__),
	__FKfactType__ Integer,
	__FKconceptualSchema__ Integer
) ;

CREATE TABLE FactTypeIsElementaryInBodyOfSharedMeanings (
	__IDFactTypeIsElementaryInBodyOfSharedMeanings__ Integer NOT NULL,
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	PRIMARY KEY FactTypeIsElementaryInBodyOfSharedMeanings (__IDFactTypeIsElementaryInBodyOfSharedMeanings__),
	__FKfactType__ Integer,
	__FKbodyOfSharedMeanings__ Integer
) ;

CREATE TABLE FactTypeRoleHasRoleBinding (
	__IDFactTypeRoleHasRoleBinding__ Integer NOT NULL,
	FOREIGN KEY factTypeRole (__FKfactTypeRole__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	FOREIGN KEY roleBinding (__FKroleBinding__) REFERENCES RoleBinding (__IDRoleBinding__),
	PRIMARY KEY FactTypeRoleHasRoleBinding (__IDFactTypeRoleHasRoleBinding__),
	__FKfactTypeRole__ Integer,
	__FKroleBinding__ Integer
) ;

CREATE TABLE FactTypeRoleIsInFactType (
	__IDFactTypeRoleIsInFactType__ Integer NOT NULL,
	FOREIGN KEY factTypeRole (__FKfactTypeRole__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	PRIMARY KEY FactTypeRoleIsInFactType (__IDFactTypeRoleIsInFactType__),
	__FKfactTypeRole__ Integer,
	__FKfactType__ Integer
) ;

CREATE TABLE ImplicationHasAntecedent (
	__IDImplicationHasAntecedent__ Integer NOT NULL,
	FOREIGN KEY implication (__FKimplication__) REFERENCES Implication (__IDImplication__),
	FOREIGN KEY antecedent (__FKantecedent__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY ImplicationHasAntecedent (__IDImplicationHasAntecedent__),
	__FKimplication__ Integer,
	__FKantecedent__ Integer
) ;

CREATE TABLE ImplicationHasConsequent (
	__IDImplicationHasConsequent__ Integer NOT NULL,
	FOREIGN KEY implication (__FKimplication__) REFERENCES Implication (__IDImplication__),
	FOREIGN KEY consequent (__FKconsequent__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY ImplicationHasConsequent (__IDImplicationHasConsequent__),
	__FKimplication__ Integer,
	__FKconsequent__ Integer
) ;

CREATE TABLE InstantiationFormulationBindsToBindableTarget (
	__IDInstantiationFormulationBindsToBindableTarget__ Integer NOT NULL,
	FOREIGN KEY instantiationFormulation (__FKinstantiationFormulation__) REFERENCES InstantiationFormulation (__IDInstantiationFormulation__),
	FOREIGN KEY bindableTarget (__FKbindableTarget__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY InstantiationFormulationBindsToBindableTarget (__IDInstantiationFormulationBindsToBindableTarget__),
	__FKinstantiationFormulation__ Integer,
	__FKbindableTarget__ Integer
) ;

CREATE TABLE InstantiationFormulationConsidersConcept (
	__IDInstantiationFormulationConsidersConcept__ Integer NOT NULL,
	FOREIGN KEY instantiationFormulation (__FKinstantiationFormulation__) REFERENCES InstantiationFormulation (__IDInstantiationFormulation__),
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY InstantiationFormulationConsidersConcept (__IDInstantiationFormulationConsidersConcept__),
	__FKinstantiationFormulation__ Integer,
	__FKconcept__ Integer
) ;

CREATE TABLE IntensionalDefinitionUsesDelimitingCharacteristic (
	__IDIntensionalDefinitionUsesDelimitingCharacteristic__ Integer NOT NULL,
	FOREIGN KEY intensionalDefinition (__FKintensionalDefinition__) REFERENCES IntensionalDefinition (__IDIntensionalDefinition__),
	FOREIGN KEY delimitingCharacteristic (__FKdelimitingCharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY IntensionalDefinitionUsesDelimitingCharacteristic (__IDIntensionalDefinitionUsesDelimitingCharacteristic__),
	__FKintensionalDefinition__ Integer,
	__FKdelimitingCharacteristic__ Integer
) ;

CREATE TABLE LogicalFormulationConstrainsProjection (
	__IDLogicalFormulationConstrainsProjection__ Integer NOT NULL,
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	FOREIGN KEY projection (__FKprojection__) REFERENCES Projection (__IDProjection__),
	PRIMARY KEY LogicalFormulationConstrainsProjection (__IDLogicalFormulationConstrainsProjection__),
	__FKlogicalFormulation__ Integer,
	__FKprojection__ Integer
) ;

CREATE TABLE LogicalFormulationRestrictsVariable (
	__IDLogicalFormulationRestrictsVariable__ Integer NOT NULL,
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY LogicalFormulationRestrictsVariable (__IDLogicalFormulationRestrictsVariable__),
	__FKlogicalFormulation__ Integer,
	__FKvariable__ Integer
) ;

CREATE TABLE LogicalOperationHasLogicalOperand (
	__IDLogicalOperationHasLogicalOperand__ Integer NOT NULL,
	FOREIGN KEY logicalOperation (__FKlogicalOperation__) REFERENCES LogicalOperation (__IDLogicalOperation__),
	FOREIGN KEY logicalOperand (__FKlogicalOperand__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY LogicalOperationHasLogicalOperand (__IDLogicalOperationHasLogicalOperand__),
	__FKlogicalOperation__ Integer,
	__FKlogicalOperand__ Integer
) ;

CREATE TABLE MeaningCorrespondsToThing (
	__IDMeaningCorrespondsToThing__ Integer NOT NULL,
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	FOREIGN KEY thing (__FKthing__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY MeaningCorrespondsToThing (__IDMeaningCorrespondsToThing__),
	__FKmeaning__ Integer,
	__FKthing__ Integer
) ;

CREATE TABLE ModalFormulationEmbedsLogicalFormulation (
	__IDModalFormulationEmbedsLogicalFormulation__ Integer NOT NULL,
	FOREIGN KEY modalFormulation (__FKmodalFormulation__) REFERENCES ModalFormulation (__IDModalFormulation__),
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY ModalFormulationEmbedsLogicalFormulation (__IDModalFormulationEmbedsLogicalFormulation__),
	__FKmodalFormulation__ Integer,
	__FKlogicalFormulation__ Integer
) ;

CREATE TABLE NameReferencesThing (
	__IDNameReferencesThing__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	FOREIGN KEY thing (__FKthing__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY NameReferencesThing (__IDNameReferencesThing__),
	__FKname__ Integer,
	__FKthing__ Integer
) ;

CREATE TABLE NamespaceHasUri (
	__IDNamespaceHasUri__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES Namespace (__IDNamespace__),
	FOREIGN KEY uri (__FKuri__) REFERENCES Uri (__IDUri__),
	PRIMARY KEY NamespaceHasUri (__IDNamespaceHasUri__),
	__FKnamespace__ Integer,
	__FKuri__ Integer
) ;

CREATE TABLE Namespace1IncorporatesNamespace2 (
	__IDNamespace1IncorporatesNamespace2__ Integer NOT NULL,
	FOREIGN KEY namespace1 (__FKnamespace1__) REFERENCES Namespace (__IDNamespace__),
	FOREIGN KEY namespace2 (__FKnamespace2__) REFERENCES Namespace (__IDNamespace__),
	PRIMARY KEY Namespace1IncorporatesNamespace2 (__IDNamespace1IncorporatesNamespace2__),
	__FKnamespace1__ Integer,
	__FKnamespace2__ Integer
) ;

CREATE TABLE NoteCommentsOnMeaning (
	__IDNoteCommentsOnMeaning__ Integer NOT NULL,
	FOREIGN KEY note (__FKnote__) REFERENCES Note (__IDNote__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY NoteCommentsOnMeaning (__IDNoteCommentsOnMeaning__),
	__FKnote__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE NumericRangeQuantificationHasMaximumCardinality (
	__IDNumericRangeQuantificationHasMaximumCardinality__ Integer NOT NULL,
	FOREIGN KEY numericRangeQuantification (__FKnumericRangeQuantification__) REFERENCES NumericRangeQuantification (__IDNumericRangeQuantification__),
	FOREIGN KEY maximumCardinality (__FKmaximumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY NumericRangeQuantificationHasMaximumCardinality (__IDNumericRangeQuantificationHasMaximumCardinality__),
	__FKnumericRangeQuantification__ Integer,
	__FKmaximumCardinality__ Integer
) ;

CREATE TABLE NumericRangeQuantificationHasMinimumCardinality (
	__IDNumericRangeQuantificationHasMinimumCardinality__ Integer NOT NULL,
	FOREIGN KEY numericRangeQuantification (__FKnumericRangeQuantification__) REFERENCES NumericRangeQuantification (__IDNumericRangeQuantification__),
	FOREIGN KEY minimumCardinality (__FKminimumCardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY NumericRangeQuantificationHasMinimumCardinality (__IDNumericRangeQuantificationHasMinimumCardinality__),
	__FKnumericRangeQuantification__ Integer,
	__FKminimumCardinality__ Integer
) ;

CREATE TABLE ObjectificationBindsToBindableTarget (
	__IDObjectificationBindsToBindableTarget__ Integer NOT NULL,
	FOREIGN KEY objectification (__FKobjectification__) REFERENCES Objectification (__IDObjectification__),
	FOREIGN KEY bindableTarget (__FKbindableTarget__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY ObjectificationBindsToBindableTarget (__IDObjectificationBindsToBindableTarget__),
	__FKobjectification__ Integer,
	__FKbindableTarget__ Integer
) ;

CREATE TABLE ObjectificationConsidersLogicalFormulation (
	__IDObjectificationConsidersLogicalFormulation__ Integer NOT NULL,
	FOREIGN KEY objectification (__FKobjectification__) REFERENCES Objectification (__IDObjectification__),
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY ObjectificationConsidersLogicalFormulation (__IDObjectificationConsidersLogicalFormulation__),
	__FKobjectification__ Integer,
	__FKlogicalFormulation__ Integer
) ;

CREATE TABLE OperativeBusinessRuleHasLevelOfEnforcement (
	__IDOperativeBusinessRuleHasLevelOfEnforcement__ Integer NOT NULL,
	FOREIGN KEY operativeBusinessRule (__FKoperativeBusinessRule__) REFERENCES OperativeBusinessRule (__IDOperativeBusinessRule__),
	FOREIGN KEY levelOfEnforcement (__FKlevelOfEnforcement__) REFERENCES LevelOfEnforcement (__IDLevelOfEnforcement__),
	PRIMARY KEY OperativeBusinessRuleHasLevelOfEnforcement (__IDOperativeBusinessRuleHasLevelOfEnforcement__),
	__FKoperativeBusinessRule__ Integer,
	__FKlevelOfEnforcement__ Integer
) ;

CREATE TABLE PlaceholderIsAtStartingCharacterPosition (
	__IDPlaceholderIsAtStartingCharacterPosition__ Integer NOT NULL,
	FOREIGN KEY placeholder (__FKplaceholder__) REFERENCES Placeholder (__IDPlaceholder__),
	FOREIGN KEY startingCharacterPosition (__FKstartingCharacterPosition__) REFERENCES PositiveInteger (__IDPositiveInteger__),
	PRIMARY KEY PlaceholderIsAtStartingCharacterPosition (__IDPlaceholderIsAtStartingCharacterPosition__),
	__FKplaceholder__ Integer,
	__FKstartingCharacterPosition__ Integer
) ;

CREATE TABLE PlaceholderIsInFactTypeForm (
	__IDPlaceholderIsInFactTypeForm__ Integer NOT NULL,
	FOREIGN KEY placeholder (__FKplaceholder__) REFERENCES Placeholder (__IDPlaceholder__),
	FOREIGN KEY factTypeForm (__FKfactTypeForm__) REFERENCES FactTypeForm (__IDFactTypeForm__),
	PRIMARY KEY PlaceholderIsInFactTypeForm (__IDPlaceholderIsInFactTypeForm__),
	__FKplaceholder__ Integer,
	__FKfactTypeForm__ Integer
) ;

CREATE TABLE PlaceholderUsesDesignation (
	__IDPlaceholderUsesDesignation__ Integer NOT NULL,
	FOREIGN KEY placeholder (__FKplaceholder__) REFERENCES Placeholder (__IDPlaceholder__),
	FOREIGN KEY designation (__FKdesignation__) REFERENCES Designation (__IDDesignation__),
	PRIMARY KEY PlaceholderUsesDesignation (__IDPlaceholderUsesDesignation__),
	__FKplaceholder__ Integer,
	__FKdesignation__ Integer
) ;

CREATE TABLE ProjectingFormulationBindsToBindableTarget (
	__IDProjectingFormulationBindsToBindableTarget__ Integer NOT NULL,
	FOREIGN KEY projectingFormulation (__FKprojectingFormulation__) REFERENCES ProjectingFormulation (__IDProjectingFormulation__),
	FOREIGN KEY bindableTarget (__FKbindableTarget__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY ProjectingFormulationBindsToBindableTarget (__IDProjectingFormulationBindsToBindableTarget__),
	__FKprojectingFormulation__ Integer,
	__FKbindableTarget__ Integer
) ;

CREATE TABLE ProjectingFormulationHasProjection (
	__IDProjectingFormulationHasProjection__ Integer NOT NULL,
	FOREIGN KEY projectingFormulation (__FKprojectingFormulation__) REFERENCES ProjectingFormulation (__IDProjectingFormulation__),
	FOREIGN KEY projection (__FKprojection__) REFERENCES Projection (__IDProjection__),
	PRIMARY KEY ProjectingFormulationHasProjection (__IDProjectingFormulationHasProjection__),
	__FKprojectingFormulation__ Integer,
	__FKprojection__ Integer
) ;

CREATE TABLE ProjectionHasAuxiliaryVariable (
	__IDProjectionHasAuxiliaryVariable__ Integer NOT NULL,
	FOREIGN KEY projection (__FKprojection__) REFERENCES Projection (__IDProjection__),
	FOREIGN KEY auxiliaryVariable (__FKauxiliaryVariable__) REFERENCES AuxiliaryVariable (__IDAuxiliaryVariable__),
	PRIMARY KEY ProjectionHasAuxiliaryVariable (__IDProjectionHasAuxiliaryVariable__),
	__FKprojection__ Integer,
	__FKauxiliaryVariable__ Integer
) ;

CREATE TABLE ProjectionIsOnVariable (
	__IDProjectionIsOnVariable__ Integer NOT NULL,
	FOREIGN KEY projection (__FKprojection__) REFERENCES Projection (__IDProjection__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY ProjectionIsOnVariable (__IDProjectionIsOnVariable__),
	__FKprojection__ Integer,
	__FKvariable__ Integer
) ;

CREATE TABLE PropositionIsBasedOnFactType (
	__IDPropositionIsBasedOnFactType__ Integer NOT NULL,
	FOREIGN KEY proposition (__FKproposition__) REFERENCES Proposition (__IDProposition__),
	FOREIGN KEY factType (__FKfactType__) REFERENCES FactType (__IDFactType__),
	PRIMARY KEY PropositionIsBasedOnFactType (__IDPropositionIsBasedOnFactType__),
	__FKproposition__ Integer,
	__FKfactType__ Integer
) ;

CREATE TABLE PropositionNominalizationBindsToBindableTarget (
	__IDPropositionNominalizationBindsToBindableTarget__ Integer NOT NULL,
	FOREIGN KEY propositionNominalization (__FKpropositionNominalization__) REFERENCES PropositionNominalization (__IDPropositionNominalization__),
	FOREIGN KEY bindableTarget (__FKbindableTarget__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY PropositionNominalizationBindsToBindableTarget (__IDPropositionNominalizationBindsToBindableTarget__),
	__FKpropositionNominalization__ Integer,
	__FKbindableTarget__ Integer
) ;

CREATE TABLE PropositionNominalizationConsidersLogicalFormulation (
	__IDPropositionNominalizationConsidersLogicalFormulation__ Integer NOT NULL,
	FOREIGN KEY propositionNominalization (__FKpropositionNominalization__) REFERENCES PropositionNominalization (__IDPropositionNominalization__),
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY PropositionNominalizationConsidersLogicalFormulation (__IDPropositionNominalizationConsidersLogicalFormulation__),
	__FKpropositionNominalization__ Integer,
	__FKlogicalFormulation__ Integer
) ;

CREATE TABLE QuantificationIntroducesVariable (
	__IDQuantificationIntroducesVariable__ Integer NOT NULL,
	FOREIGN KEY quantification (__FKquantification__) REFERENCES Quantification (__IDQuantification__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY QuantificationIntroducesVariable (__IDQuantificationIntroducesVariable__),
	__FKquantification__ Integer,
	__FKvariable__ Integer
) ;

CREATE TABLE QuantificationScopesOverLogicalFormulation (
	__IDQuantificationScopesOverLogicalFormulation__ Integer NOT NULL,
	FOREIGN KEY quantification (__FKquantification__) REFERENCES Quantification (__IDQuantification__),
	FOREIGN KEY logicalFormulation (__FKlogicalFormulation__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY QuantificationScopesOverLogicalFormulation (__IDQuantificationScopesOverLogicalFormulation__),
	__FKquantification__ Integer,
	__FKlogicalFormulation__ Integer
) ;

CREATE TABLE Quantity1EqualsQuantity2 (
	__IDQuantity1EqualsQuantity2__ Integer NOT NULL,
	FOREIGN KEY quantity1 (__FKquantity1__) REFERENCES Quantity (__IDQuantity__),
	FOREIGN KEY quantity2 (__FKquantity2__) REFERENCES Quantity (__IDQuantity__),
	PRIMARY KEY Quantity1EqualsQuantity2 (__IDQuantity1EqualsQuantity2__),
	__FKquantity1__ Integer,
	__FKquantity2__ Integer
) ;

CREATE TABLE Quantity1IsLessThanQuantity2 (
	__IDQuantity1IsLessThanQuantity2__ Integer NOT NULL,
	FOREIGN KEY quantity1 (__FKquantity1__) REFERENCES Quantity (__IDQuantity__),
	FOREIGN KEY quantity2 (__FKquantity2__) REFERENCES Quantity (__IDQuantity__),
	PRIMARY KEY Quantity1IsLessThanQuantity2 (__IDQuantity1IsLessThanQuantity2__),
	__FKquantity1__ Integer,
	__FKquantity2__ Integer
) ;

CREATE TABLE ReferencePointsToInformationSource (
	__IDReferencePointsToInformationSource__ Integer NOT NULL,
	FOREIGN KEY reference (__FKreference__) REFERENCES Reference (__IDReference__),
	FOREIGN KEY informationSource (__FKinformationSource__) REFERENCES CommunicationContent (__IDCommunicationContent__),
	PRIMARY KEY ReferencePointsToInformationSource (__IDReferencePointsToInformationSource__),
	__FKreference__ Integer,
	__FKinformationSource__ Integer
) ;

CREATE TABLE ReferenceSchemeExtensionallyUsesFactTypeRole (
	__IDReferenceSchemeExtensionallyUsesFactTypeRole__ Integer NOT NULL,
	FOREIGN KEY referenceScheme (__FKreferenceScheme__) REFERENCES ReferenceScheme (__IDReferenceScheme__),
	FOREIGN KEY factTypeRole (__FKfactTypeRole__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	PRIMARY KEY ReferenceSchemeExtensionallyUsesFactTypeRole (__IDReferenceSchemeExtensionallyUsesFactTypeRole__),
	__FKreferenceScheme__ Integer,
	__FKfactTypeRole__ Integer
) ;

CREATE TABLE ReferenceSchemeIsForConcept (
	__IDReferenceSchemeIsForConcept__ Integer NOT NULL,
	FOREIGN KEY referenceScheme (__FKreferenceScheme__) REFERENCES ReferenceScheme (__IDReferenceScheme__),
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY ReferenceSchemeIsForConcept (__IDReferenceSchemeIsForConcept__),
	__FKreferenceScheme__ Integer,
	__FKconcept__ Integer
) ;

CREATE TABLE ReferenceSchemeSimplyUsesFactTypeRole (
	__IDReferenceSchemeSimplyUsesFactTypeRole__ Integer NOT NULL,
	FOREIGN KEY referenceScheme (__FKreferenceScheme__) REFERENCES ReferenceScheme (__IDReferenceScheme__),
	FOREIGN KEY factTypeRole (__FKfactTypeRole__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	PRIMARY KEY ReferenceSchemeSimplyUsesFactTypeRole (__IDReferenceSchemeSimplyUsesFactTypeRole__),
	__FKreferenceScheme__ Integer,
	__FKfactTypeRole__ Integer
) ;

CREATE TABLE ReferenceSchemeUsesCharacteristic (
	__IDReferenceSchemeUsesCharacteristic__ Integer NOT NULL,
	FOREIGN KEY referenceScheme (__FKreferenceScheme__) REFERENCES ReferenceScheme (__IDReferenceScheme__),
	FOREIGN KEY characteristic (__FKcharacteristic__) REFERENCES Characteristic (__IDCharacteristic__),
	PRIMARY KEY ReferenceSchemeUsesCharacteristic (__IDReferenceSchemeUsesCharacteristic__),
	__FKreferenceScheme__ Integer,
	__FKcharacteristic__ Integer
) ;

CREATE TABLE ReferenceSupportsMeaning (
	__IDReferenceSupportsMeaning__ Integer NOT NULL,
	FOREIGN KEY reference (__FKreference__) REFERENCES Reference (__IDReference__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY ReferenceSupportsMeaning (__IDReferenceSupportsMeaning__),
	__FKreference__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE RepresentationHasExpression (
	__IDRepresentationHasExpression__ Integer NOT NULL,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY RepresentationHasExpression (__IDRepresentationHasExpression__),
	__FKrepresentation__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE RepresentationIsInDesignationContext (
	__IDRepresentationIsInDesignationContext__ Integer NOT NULL,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY designationContext (__FKdesignationContext__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY RepresentationIsInDesignationContext (__IDRepresentationIsInDesignationContext__),
	__FKrepresentation__ Integer,
	__FKdesignationContext__ Integer
) ;

CREATE TABLE RepresentationIsInSubjectField (
	__IDRepresentationIsInSubjectField__ Integer NOT NULL,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY subjectField (__FKsubjectField__) REFERENCES SubjectField (__IDSubjectField__),
	PRIMARY KEY RepresentationIsInSubjectField (__IDRepresentationIsInSubjectField__),
	__FKrepresentation__ Integer,
	__FKsubjectField__ Integer
) ;

CREATE TABLE RepresentationRepresentsMeaning (
	__IDRepresentationRepresentsMeaning__ Integer NOT NULL,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY RepresentationRepresentsMeaning (__IDRepresentationRepresentsMeaning__),
	__FKrepresentation__ Integer,
	__FKmeaning__ Integer
) ;

CREATE TABLE RepresentationUsesVocabulary (
	__IDRepresentationUsesVocabulary__ Integer NOT NULL,
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY RepresentationUsesVocabulary (__IDRepresentationUsesVocabulary__),
	__FKrepresentation__ Integer,
	__FKvocabulary__ Integer
) ;

CREATE TABLE ResIsSensoryManifestationOfSignifier (
	__IDResIsSensoryManifestationOfSignifier__ Integer NOT NULL,
	FOREIGN KEY res (__FKres__) REFERENCES Res (__IDRes__),
	FOREIGN KEY signifier (__FKsignifier__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ResIsSensoryManifestationOfSignifier (__IDResIsSensoryManifestationOfSignifier__),
	__FKres__ Integer,
	__FKsignifier__ Integer
) ;

CREATE TABLE RoleBindingBindsToBindableTarget (
	__IDRoleBindingBindsToBindableTarget__ Integer NOT NULL,
	FOREIGN KEY roleBinding (__FKroleBinding__) REFERENCES RoleBinding (__IDRoleBinding__),
	FOREIGN KEY bindableTarget (__FKbindableTarget__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY RoleBindingBindsToBindableTarget (__IDRoleBindingBindsToBindableTarget__),
	__FKroleBinding__ Integer,
	__FKbindableTarget__ Integer
) ;

CREATE TABLE RoleBindingOccursInAtomicFormulation (
	__IDRoleBindingOccursInAtomicFormulation__ Integer NOT NULL,
	FOREIGN KEY roleBinding (__FKroleBinding__) REFERENCES RoleBinding (__IDRoleBinding__),
	FOREIGN KEY atomicFormulation (__FKatomicFormulation__) REFERENCES AtomicFormulation (__IDAtomicFormulation__),
	PRIMARY KEY RoleBindingOccursInAtomicFormulation (__IDRoleBindingOccursInAtomicFormulation__),
	__FKroleBinding__ Integer,
	__FKatomicFormulation__ Integer
) ;

CREATE TABLE RoleRangesOverObjectType (
	__IDRoleRangesOverObjectType__ Integer NOT NULL,
	FOREIGN KEY role (__FKrole__) REFERENCES Role (__IDRole__),
	FOREIGN KEY objectType (__FKobjectType__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY RoleRangesOverObjectType (__IDRoleRangesOverObjectType__),
	__FKrole__ Integer,
	__FKobjectType__ Integer
) ;

CREATE TABLE RulebookIncludesRepresentation (
	__IDRulebookIncludesRepresentation__ Integer NOT NULL,
	FOREIGN KEY rulebook (__FKrulebook__) REFERENCES Rulebook (__IDRulebook__),
	FOREIGN KEY representation (__FKrepresentation__) REFERENCES Representation (__IDRepresentation__),
	PRIMARY KEY RulebookIncludesRepresentation (__IDRulebookIncludesRepresentation__),
	__FKrulebook__ Integer,
	__FKrepresentation__ Integer
) ;

CREATE TABLE SemanticCommunityHasSpeechCommunity (
	__IDSemanticCommunityHasSpeechCommunity__ Integer NOT NULL,
	FOREIGN KEY semanticCommunity (__FKsemanticCommunity__) REFERENCES SemanticCommunity (__IDSemanticCommunity__),
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	PRIMARY KEY SemanticCommunityHasSpeechCommunity (__IDSemanticCommunityHasSpeechCommunity__),
	__FKsemanticCommunity__ Integer,
	__FKspeechCommunity__ Integer
) ;

CREATE TABLE SetHasCardinality (
	__IDSetHasCardinality__ Integer NOT NULL,
	FOREIGN KEY "set" (__FKset__) REFERENCES "Set" (__IDSet__),
	FOREIGN KEY cardinality (__FKcardinality__) REFERENCES NonnegativeInteger (__IDNonnegativeInteger__),
	PRIMARY KEY SetHasCardinality (__IDSetHasCardinality__),
	__FKset__ Integer,
	__FKcardinality__ Integer
) ;

CREATE TABLE SpeechCommunityDeterminesRulebook (
	__IDSpeechCommunityDeterminesRulebook__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY rulebook (__FKrulebook__) REFERENCES Rulebook (__IDRulebook__),
	PRIMARY KEY SpeechCommunityDeterminesRulebook (__IDSpeechCommunityDeterminesRulebook__),
	__FKspeechCommunity__ Integer,
	__FKrulebook__ Integer
) ;

CREATE TABLE SpeechCommunityOwnsOwnedDefinition (
	__IDSpeechCommunityOwnsOwnedDefinition__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY ownedDefinition (__FKownedDefinition__) REFERENCES OwnedDefinition (__IDOwnedDefinition__),
	PRIMARY KEY SpeechCommunityOwnsOwnedDefinition (__IDSpeechCommunityOwnsOwnedDefinition__),
	__FKspeechCommunity__ Integer,
	__FKownedDefinition__ Integer
) ;

CREATE TABLE SpeechCommunityOwnsVocabulary (
	__IDSpeechCommunityOwnsVocabulary__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY SpeechCommunityOwnsVocabulary (__IDSpeechCommunityOwnsVocabulary__),
	__FKspeechCommunity__ Integer,
	__FKvocabulary__ Integer
) ;

CREATE TABLE SpeechCommunityRegulatesItsUsageOfSignifier (
	__IDSpeechCommunityRegulatesItsUsageOfSignifier__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY signifier (__FKsignifier__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SpeechCommunityRegulatesItsUsageOfSignifier (__IDSpeechCommunityRegulatesItsUsageOfSignifier__),
	__FKspeechCommunity__ Integer,
	__FKsignifier__ Integer
) ;

CREATE TABLE SpeechCommunityUsesLanguage (
	__IDSpeechCommunityUsesLanguage__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY language (__FKlanguage__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY SpeechCommunityUsesLanguage (__IDSpeechCommunityUsesLanguage__),
	__FKspeechCommunity__ Integer,
	__FKlanguage__ Integer
) ;

CREATE TABLE SpeechCommunityUsesVocabulary (
	__IDSpeechCommunityUsesVocabulary__ Integer NOT NULL,
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY SpeechCommunityUsesVocabulary (__IDSpeechCommunityUsesVocabulary__),
	__FKspeechCommunity__ Integer,
	__FKvocabulary__ Integer
) ;

CREATE TABLE StatementExpressesProposition (
	__IDStatementExpressesProposition__ Integer NOT NULL,
	FOREIGN KEY statement (__FKstatement__) REFERENCES Statement (__IDStatement__),
	FOREIGN KEY proposition (__FKproposition__) REFERENCES Proposition (__IDProposition__),
	PRIMARY KEY StatementExpressesProposition (__IDStatementExpressesProposition__),
	__FKstatement__ Integer,
	__FKproposition__ Integer
) ;

CREATE TABLE TermDenotesThing (
	__IDTermDenotesThing__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY thing (__FKthing__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY TermDenotesThing (__IDTermDenotesThing__),
	__FKterm__ Integer,
	__FKthing__ Integer
) ;

CREATE TABLE TerminologicalDictionaryExpressesBodyOfSharedMeanings (
	__IDTerminologicalDictionaryExpressesBodyOfSharedMeanings__ Integer NOT NULL,
	FOREIGN KEY terminologicalDictionary (__FKterminologicalDictionary__) REFERENCES TerminologicalDictionary (__IDTerminologicalDictionary__),
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	PRIMARY KEY TerminologicalDictionaryExpressesBodyOfSharedMeanings (__IDTerminologicalDictionaryExpressesBodyOfSharedMeanings__),
	__FKterminologicalDictionary__ Integer,
	__FKbodyOfSharedMeanings__ Integer
) ;

CREATE TABLE TerminologicalDictionaryHasUri (
	__IDTerminologicalDictionaryHasUri__ Integer NOT NULL,
	FOREIGN KEY terminologicalDictionary (__FKterminologicalDictionary__) REFERENCES TerminologicalDictionary (__IDTerminologicalDictionary__),
	FOREIGN KEY uri (__FKuri__) REFERENCES Uri (__IDUri__),
	PRIMARY KEY TerminologicalDictionaryHasUri (__IDTerminologicalDictionaryHasUri__),
	__FKterminologicalDictionary__ Integer,
	__FKuri__ Integer
) ;

CREATE TABLE TerminologicalDictionaryPresentsVocabulary (
	__IDTerminologicalDictionaryPresentsVocabulary__ Integer NOT NULL,
	FOREIGN KEY terminologicalDictionary (__FKterminologicalDictionary__) REFERENCES TerminologicalDictionary (__IDTerminologicalDictionary__),
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY TerminologicalDictionaryPresentsVocabulary (__IDTerminologicalDictionaryPresentsVocabulary__),
	__FKterminologicalDictionary__ Integer,
	__FKvocabulary__ Integer
) ;

CREATE TABLE ThingIsInSet (
	__IDThingIsInSet__ Integer NOT NULL,
	FOREIGN KEY thing (__FKthing__) REFERENCES Thing (__IDThing__),
	FOREIGN KEY "set" (__FKset__) REFERENCES "Set" (__IDSet__),
	PRIMARY KEY ThingIsInSet (__IDThingIsInSet__),
	__FKthing__ Integer,
	__FKset__ Integer
) ;

CREATE TABLE Thing1IsThing2 (
	__IDThing1IsThing2__ Integer NOT NULL,
	FOREIGN KEY thing1 (__FKthing1__) REFERENCES Thing (__IDThing__),
	FOREIGN KEY thing2 (__FKthing2__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY Thing1IsThing2 (__IDThing1IsThing2__),
	__FKthing1__ Integer,
	__FKthing2__ Integer
) ;

CREATE TABLE VariableHasProjectionPosition (
	__IDVariableHasProjectionPosition__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY projectionPosition (__FKprojectionPosition__) REFERENCES PositiveInteger (__IDPositiveInteger__),
	PRIMARY KEY VariableHasProjectionPosition (__IDVariableHasProjectionPosition__),
	__FKvariable__ Integer,
	__FKprojectionPosition__ Integer
) ;

CREATE TABLE VariableIsFreesWithinSemanticFormulation (
	__IDVariableIsFreesWithinSemanticFormulation__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY semanticFormulation (__FKsemanticFormulation__) REFERENCES SemanticFormulation (__IDSemanticFormulation__),
	PRIMARY KEY VariableIsFreesWithinSemanticFormulation (__IDVariableIsFreesWithinSemanticFormulation__),
	__FKvariable__ Integer,
	__FKsemanticFormulation__ Integer
) ;

CREATE TABLE VariableMapsToFactTypeRole (
	__IDVariableMapsToFactTypeRole__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY factTypeRole (__FKfactTypeRole__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	PRIMARY KEY VariableMapsToFactTypeRole (__IDVariableMapsToFactTypeRole__),
	__FKvariable__ Integer,
	__FKfactTypeRole__ Integer
) ;

CREATE TABLE VariableRangesOverConcept (
	__IDVariableRangesOverConcept__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY VariableRangesOverConcept (__IDVariableRangesOverConcept__),
	__FKvariable__ Integer,
	__FKconcept__ Integer
) ;

CREATE TABLE VocabularyIsDesignedForSpeechCommunity (
	__IDVocabularyIsDesignedForSpeechCommunity__ Integer NOT NULL,
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	FOREIGN KEY speechCommunity (__FKspeechCommunity__) REFERENCES SpeechCommunity (__IDSpeechCommunity__),
	PRIMARY KEY VocabularyIsDesignedForSpeechCommunity (__IDVocabularyIsDesignedForSpeechCommunity__),
	__FKvocabulary__ Integer,
	__FKspeechCommunity__ Integer
) ;

CREATE TABLE VocabularyIsExpressedInLanguage (
	__IDVocabularyIsExpressedInLanguage__ Integer NOT NULL,
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	FOREIGN KEY language (__FKlanguage__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY VocabularyIsExpressedInLanguage (__IDVocabularyIsExpressedInLanguage__),
	__FKvocabulary__ Integer,
	__FKlanguage__ Integer
) ;

CREATE TABLE VocabularyIsUsedToExpressBodyOfSharedMeanings (
	__IDVocabularyIsUsedToExpressBodyOfSharedMeanings__ Integer NOT NULL,
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	FOREIGN KEY bodyOfSharedMeanings (__FKbodyOfSharedMeanings__) REFERENCES BodyOfSharedMeanings (__IDBodyOfSharedMeanings__),
	PRIMARY KEY VocabularyIsUsedToExpressBodyOfSharedMeanings (__IDVocabularyIsUsedToExpressBodyOfSharedMeanings__),
	__FKvocabulary__ Integer,
	__FKbodyOfSharedMeanings__ Integer
) ;

CREATE TABLE VocabularyNamespaceIsDerivedFromVocabulary (
	__IDVocabularyNamespaceIsDerivedFromVocabulary__ Integer NOT NULL,
	FOREIGN KEY vocabularyNamespace (__FKvocabularyNamespace__) REFERENCES VocabularyNamespace (__IDVocabularyNamespace__),
	FOREIGN KEY vocabulary (__FKvocabulary__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY VocabularyNamespaceIsDerivedFromVocabulary (__IDVocabularyNamespaceIsDerivedFromVocabulary__),
	__FKvocabularyNamespace__ Integer,
	__FKvocabulary__ Integer
) ;

CREATE TABLE VocabularyNamespaceIsForLanguage (
	__IDVocabularyNamespaceIsForLanguage__ Integer NOT NULL,
	FOREIGN KEY vocabularyNamespace (__FKvocabularyNamespace__) REFERENCES VocabularyNamespace (__IDVocabularyNamespace__),
	FOREIGN KEY language (__FKlanguage__) REFERENCES Language (__IDLanguage__),
	PRIMARY KEY VocabularyNamespaceIsForLanguage (__IDVocabularyNamespaceIsForLanguage__),
	__FKvocabularyNamespace__ Integer,
	__FKlanguage__ Integer
) ;

CREATE TABLE VocabularyNamespaceIsSpecificToDesignationContext (
	__IDVocabularyNamespaceIsSpecificToDesignationContext__ Integer NOT NULL,
	FOREIGN KEY vocabularyNamespace (__FKvocabularyNamespace__) REFERENCES VocabularyNamespace (__IDVocabularyNamespace__),
	FOREIGN KEY designationContext (__FKdesignationContext__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY VocabularyNamespaceIsSpecificToDesignationContext (__IDVocabularyNamespaceIsSpecificToDesignationContext__),
	__FKvocabularyNamespace__ Integer,
	__FKdesignationContext__ Integer
) ;

CREATE TABLE VocabularyNamespaceIsSpecificToSubjectField (
	__IDVocabularyNamespaceIsSpecificToSubjectField__ Integer NOT NULL,
	FOREIGN KEY vocabularyNamespace (__FKvocabularyNamespace__) REFERENCES VocabularyNamespace (__IDVocabularyNamespace__),
	FOREIGN KEY subjectField (__FKsubjectField__) REFERENCES SubjectField (__IDSubjectField__),
	PRIMARY KEY VocabularyNamespaceIsSpecificToSubjectField (__IDVocabularyNamespaceIsSpecificToSubjectField__),
	__FKvocabularyNamespace__ Integer,
	__FKsubjectField__ Integer
) ;

CREATE TABLE Vocabulary1IncorporatesVocabulary2 (
	__IDVocabulary1IncorporatesVocabulary2__ Integer NOT NULL,
	FOREIGN KEY vocabulary1 (__FKvocabulary1__) REFERENCES Vocabulary (__IDVocabulary__),
	FOREIGN KEY vocabulary2 (__FKvocabulary2__) REFERENCES Vocabulary (__IDVocabulary__),
	PRIMARY KEY Vocabulary1IncorporatesVocabulary2 (__IDVocabulary1IncorporatesVocabulary2__),
	__FKvocabulary1__ Integer,
	__FKvocabulary2__ Integer
) ;

CREATE TABLE WhetherornotFormulationHasConsequent (
	__IDWhetherornotFormulationHasConsequent__ Integer NOT NULL,
	FOREIGN KEY whetherornotFormulation (__FKwhetherornotFormulation__) REFERENCES WhetherornotFormulation (__IDWhetherornotFormulation__),
	FOREIGN KEY consequent (__FKconsequent__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY WhetherornotFormulationHasConsequent (__IDWhetherornotFormulationHasConsequent__),
	__FKwhetherornotFormulation__ Integer,
	__FKconsequent__ Integer
) ;

CREATE TABLE WhetherornotFormulationHasInconsequent (
	__IDWhetherornotFormulationHasInconsequent__ Integer NOT NULL,
	FOREIGN KEY whetherornotFormulation (__FKwhetherornotFormulation__) REFERENCES WhetherornotFormulation (__IDWhetherornotFormulation__),
	FOREIGN KEY inconsequent (__FKinconsequent__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY WhetherornotFormulationHasInconsequent (__IDWhetherornotFormulationHasInconsequent__),
	__FKwhetherornotFormulation__ Integer,
	__FKinconsequent__ Integer
) ;

CREATE TABLE Thing_name_Name (
	__IDThing__ Integer NOT NULL,
	__IDName__ Integer NOT NULL
) ;

CREATE TABLE Meaning_representation_Representation (
	__IDMeaning__ Integer NOT NULL,
	__IDRepresentation__ Integer NOT NULL
) ;

CREATE TABLE Proposition_statement_Statement (
	__IDProposition__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE Projection_projectionVariable_Variable (
	__IDProjection__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Projection_auxiliaryVariable_AuxiliaryVariable (
	__IDProjection__ Integer NOT NULL,
	__IDAuxiliaryVariable__ Integer NOT NULL
) ;

CREATE TABLE Concept_attributiveNamespace_AttributiveNamespace (
	__IDConcept__ Integer NOT NULL,
	__IDAttributiveNamespace__ Integer NOT NULL
) ;

CREATE TABLE Concept_definition_Definition (
	__IDConcept__ Integer NOT NULL,
	__IDDefinition__ Integer NOT NULL
) ;

CREATE TABLE Concept_moreGeneralConcept_Concept (
	__IDConcept__ Integer NOT NULL,
	__IDConcept__ Integer NOT NULL
) ;

CREATE TABLE Concept_category_Concept (
	__IDConcept__ Integer NOT NULL,
	__IDConcept__ Integer NOT NULL
) ;

CREATE TABLE Concept_essentialCharacteristic_Characteristic (
	__IDConcept__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Concept_instance_Thing (
	__IDConcept__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Concept_referenceScheme_ReferenceScheme (
	__IDConcept__ Integer NOT NULL,
	__IDReferenceScheme__ Integer NOT NULL
) ;

CREATE TABLE Concept_impliedCharacteristic_Characteristic (
	__IDConcept__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Concept_necessaryCharacteristic_Characteristic (
	__IDConcept__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE Concept_designation_Designation (
	__IDConcept__ Integer NOT NULL,
	__IDDesignation__ Integer NOT NULL
) ;

CREATE TABLE Namespace_uri_Uri (
	__IDNamespace__ Integer NOT NULL,
	__IDUri__ Integer NOT NULL
) ;

CREATE TABLE FactType_factTypeForm_FactTypeForm (
	__IDFactType__ Integer NOT NULL,
	__IDFactTypeForm__ Integer NOT NULL
) ;

CREATE TABLE FactType_role_FactTypeRole (
	__IDFactType__ Integer NOT NULL,
	__IDFactTypeRole__ Integer NOT NULL
) ;

CREATE TABLE FactTypeForm_placeholder_Placeholder (
	__IDFactTypeForm__ Integer NOT NULL,
	__IDPlaceholder__ Integer NOT NULL
) ;

CREATE TABLE FactTypeRole_roleBinding_RoleBinding (
	__IDFactTypeRole__ Integer NOT NULL,
	__IDRoleBinding__ Integer NOT NULL
) ;

CREATE TABLE ReferenceScheme_simplyUsedRole_FactTypeRole (
	__IDReferenceScheme__ Integer NOT NULL,
	__IDFactTypeRole__ Integer NOT NULL
) ;

CREATE TABLE ReferenceScheme_identifyingCharacteristic_Characteristic (
	__IDReferenceScheme__ Integer NOT NULL,
	__IDCharacteristic__ Integer NOT NULL
) ;

CREATE TABLE ReferenceScheme_extensionallyUsedRole_FactTypeRole (
	__IDReferenceScheme__ Integer NOT NULL,
	__IDFactTypeRole__ Integer NOT NULL
) ;

CREATE TABLE Set_element_Thing (
	__IDSet__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE AtomicFormulation_roleBinding_RoleBinding (
	__IDAtomicFormulation__ Integer NOT NULL,
	__IDRoleBinding__ Integer NOT NULL
) ;

CREATE TABLE BinaryLogicalOperation_logicalOperand2_LogicalFormulation (
	__IDBinaryLogicalOperation__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;

CREATE TABLE BinaryLogicalOperation_logicalOperand1_LogicalFormulation (
	__IDBinaryLogicalOperation__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;

CREATE TABLE BodyOfSharedMeanings_elementaryFactType_FactType (
	__IDBodyOfSharedMeanings__ Integer NOT NULL,
	__IDFactType__ Integer NOT NULL
) ;

CREATE TABLE ObjectType_categorizationScheme_CategorizationScheme (
	__IDObjectType__ Integer NOT NULL,
	__IDCategorizationScheme__ Integer NOT NULL
) ;

CREATE TABLE ObjectType_categorizationType_CategorizationType (
	__IDObjectType__ Integer NOT NULL,
	__IDCategorizationType__ Integer NOT NULL
) ;

CREATE TABLE Community_uri_Uri (
	__IDCommunity__ Integer NOT NULL,
	__IDUri__ Integer NOT NULL
) ;

CREATE TABLE Community_subcommunity_Community (
	__IDCommunity__ Integer NOT NULL,
	__IDCommunity__ Integer NOT NULL
) ;

CREATE TABLE Implication_consequent_LogicalFormulation (
	__IDImplication__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;

CREATE TABLE Implication_antecedent_LogicalFormulation (
	__IDImplication__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;

CREATE TABLE OperativeBusinessRule_levelOfEnforcement_LevelOfEnforcement (
	__IDOperativeBusinessRule__ Integer NOT NULL,
	__IDLevelOfEnforcement__ Integer NOT NULL
) ;

CREATE TABLE SemanticCommunity_speechCommunity_SpeechCommunity (
	__IDSemanticCommunity__ Integer NOT NULL,
	__IDSpeechCommunity__ Integer NOT NULL
) ;

CREATE TABLE TerminologicalDictionary_uri_Uri (
	__IDTerminologicalDictionary__ Integer NOT NULL,
	__IDUri__ Integer NOT NULL
) ;

CREATE TABLE WhetherornotFormulation_inconsequent_LogicalFormulation (
	__IDWhetherornotFormulation__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;

CREATE TABLE WhetherornotFormulation_consequent_LogicalFormulation (
	__IDWhetherornotFormulation__ Integer NOT NULL,
	__IDLogicalFormulation__ Integer NOT NULL
) ;
