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
