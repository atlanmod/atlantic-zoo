module SBVR {

	type Actuality : StateOfAffairs;

	type StateOfAffairs : Thing;

	type Thing {
		Name_Ref : Name*;
	};

	type Name : Designation;

	type Designation : Representation {
		ImplicitlyIsUnderstood_Att : Logical;
		Signifier_Ref : Expression;
	};

	type Representation : Actuality {
		Meaning_Ref : Meaning;
		Expression_Ref : Expression;
	};

	type Meaning : Thing {
		Representation_Ref : Representation*;
	};

	type Expression : BindableTarget;

	type BindableTarget : Thing;

	type AdoptedDefinition : Definition;

	type Definition : Representation;

	type Advice : ElementOfGuidance;

	type ElementOfGuidance : Proposition {
		IsPracticable_Att : Logical;
	};

	type Proposition : Meaning {
		IsFalse_Att : Logical;
		IsTrue_Att : Logical;
		Statement_Ref : Statement*;
		IsPossiblyTrue_Att : Logical;
		IsObligatedToBeTrue_Att : Logical;
		IsPermittedToBeTrue_Att : Logical;
		IsNecessarilyTrue_Att : Logical;
	};

	type Statement : Representation;

	type AdviceOfContingency : AdviceOfPossibility;

	type AdviceOfPossibility : Advice;

	type AdviceOfOptionality : AdviceOfPermission;

	type AdviceOfPermission : Advice;

	type AdviceStatement : GuidanceStatement;

	type GuidanceStatement : Statement;

	type AggregationFormulation : ProjectingFormulation;

	type ProjectingFormulation : LogicalFormulation {
		Projection_Ref : Projection;
	};

	type LogicalFormulation : SemanticFormulation;

	type SemanticFormulation : Thing;

	type Projection : SemanticFormulation {
		ConstrainingFormulation_Ref : LogicalFormulation?;
		ProjectionVariable_Ref : Variable+;
		AuxiliaryVariable_Ref : AuxiliaryVariable*;
	};

	type Variable : BindableTarget {
		RestrictingFormulation_Ref : LogicalFormulation?;
		ProjectionPosition_Ref : PositiveInteger?;
		RangedoverConcept_Ref : Concept?;
		IsUnitary_Att : Logical;
	};

	type PositiveInteger : NonnegativeInteger;

	type NonnegativeInteger : Integer;

	type Integer : Number {
		Value_Att : Logical;
	};

	type Number : Quantity;

	type Quantity : NounConcept;

	type NounConcept : Concept;

	type Concept : Meaning {
		AttributiveNamespace_Ref : AttributiveNamespace*;
		Definition_Ref : Definition*;
		MoreGeneralConcept_Ref : Concept*;
		Category_Ref : Concept*;
		EssentialCharacteristic_Ref : Characteristic*;
		Instance_Ref : Thing*;
		ReferenceScheme_Ref : ReferenceScheme*;
		ImpliedCharacteristic_Ref : Characteristic*;
		NecessaryCharacteristic_Ref : Characteristic*;
		Designation_Ref : Designation*;
		Extension_Ref : Set;
	};

	type AttributiveNamespace : Namespace;

	type Namespace : Thing {
		Uri_Ref : Uri*;
	};

	type Uri : Text;

	type Text : Expression {
		Value_Att : Text;
	};

	type Characteristic : FactType;

	type FactType : Concept {
		FactTypeForm_Ref : FactTypeForm*;
		Role_Ref : FactTypeRole+;
	};

	type FactTypeForm : Representation {
		Placeholder_Ref : Placeholder+;
	};

	type Placeholder : Designation {
		StartingCharacterPosition_Ref : PositiveInteger?;
	};

	type FactTypeRole : Role {
		RoleBinding_Ref : RoleBinding*;
	};

	type Role : NounConcept;

	type RoleBinding : Thing;

	type ReferenceScheme : Thing {
		SimplyUsedRole_Ref : FactTypeRole*;
		IdentifyingCharacteristic_Ref : Characteristic*;
		ExtensionallyUsedRole_Ref : FactTypeRole*;
	};

	type Set : Thing {
		Cardinality_Ref : NonnegativeInteger?;
		Element_Ref : Thing*;
	};

	type AuxiliaryVariable : Variable;

	type AnswerNominalization : ProjectingFormulation;

	type AssociativeFactType : FactType;

	type AssortmentFactType : FactType;

	type AtleastnQuantification : Quantification {
		MinimumCardinality_Ref : NonnegativeInteger;
	};

	type Quantification : LogicalFormulation {
		ScopeFormulation_Ref : LogicalFormulation?;
	};

	type AtmostnQuantification : Quantification {
		MaximumCardinality_Ref : NonnegativeInteger;
	};

	type AtmostoneQuantification : AtmostnQuantification;

	type AtomicFormulation : LogicalFormulation {
		RoleBinding_Ref : RoleBinding*;
	};

	type BagProjection : Projection;

	type BinaryFactType : FactType;

	type BinaryLogicalOperation : LogicalOperation {
		LogicalOperand2_Ref : LogicalFormulation*;
		LogicalOperand1_Ref : LogicalFormulation*;
	};

	type LogicalOperation : LogicalFormulation {
		LogicalOperand_Ref : LogicalFormulation;
	};

	type BodyOfSharedConcepts : Thing;

	type BodyOfSharedGuidance : Thing;

	type BodyOfSharedMeanings : Set {
		ElementaryFactType_Ref : FactType*;
	};

	type BusinessPolicy : ElementOfGovernance;

	type ElementOfGovernance : ElementOfGuidance {
		IsDirectlyEnforceable_Att : Logical;
	};

	type BusinessPolicyStatement : GuidanceStatement;

	type BusinessRule : ElementOfGuidance, Rule;

	type Rule : Proposition;

	type BusinessVocabulary : Vocabulary;

	type Vocabulary : Set;

	type CategorizationFactType : SpecializationFactType;

	type SpecializationFactType : FactType;

	type CategorizationScheme : Thing;

	type CategorizationType : Concept;

	type CharacteristicType : ConceptType;

	type ConceptType : ObjectType;

	type ObjectType : Concept {
		CategorizationScheme_Ref : CategorizationScheme*;
		CategorizationType_Ref : CategorizationType*;
	};

	type ClosedLogicalFormulation : ClosedSemanticFormulation, LogicalFormulation;

	type ClosedSemanticFormulation : SemanticFormulation;

	type ClosedProjection : Projection;

	type CommunicationContent : Representation;

	type Community : Thing {
		Uri_Ref : Uri*;
		Subcommunity_Ref : Community*;
	};

	type ConceptOfThingAsComposite : Concept;

	type ConceptOfThingAsContinuant : Concept;

	type ConceptOfThingAsDeveloped : Concept;

	type ConceptOfThingAsOccurrent : Concept;

	type ConceptOfThingAsPrimitive : Concept;

	type ConceptOfThingAsUnitary : Concept;

	type ConceptOfThingExistingDependently : Concept;

	type ConceptOfThingExistingIndependently : Concept;

	type ConceptualSchema : Thing;

	type Conjunction : BinaryLogicalOperation;

	type ContextOfThing : Segmentation;

	type Segmentation : CategorizationScheme;

	type ContextualizationFactType : SpecializationFactType;

	type ContextualizedConcept : NounConcept;

	type ContingencyStatement : StatementOfAdviceOfPossibility;

	type StatementOfAdviceOfPossibility : AdviceStatement;

	type DefiniteDescription : IntensionalDefinition;

	type IntensionalDefinition : Definition;

	type DerivableConcept : Concept;

	type Description : Representation;

	type DescriptiveExample : Representation;

	type Disjunction : BinaryLogicalOperation;

	type Equivalence : BinaryLogicalOperation;

	type ExactlynQuantification : Quantification {
		Cardinality_Ref : NonnegativeInteger;
	};

	type ExactlyoneQuantification : ExactlynQuantification;

	type ExclusiveDisjunction : BinaryLogicalOperation;

	type ExistentialQuantification : AtleastnQuantification;

	type ExplicitnessOfRepresentation : CategorizationScheme;

	type ExtensionalDefinition : Definition;

	type Facet : ContextualizedConcept;

	type Fact : Proposition;

	type FactModel : Thing;

	type FactSymbol : Designation;

	type FactTypeHasFactInFactModel {
		FactType_Ref : FactType;
		Fact_Ref : Fact;
		FactModel_Ref : FactModel;
	};

	type FactTypeNominalization : ProjectingFormulation;

	type FactTypeRoleDesignation : Designation;

	type FactTypeTemplating : CategorizationScheme;

	type FormalRepresentation : Representation;

	type FundamentalConcept : ObjectType;

	type Icon : NonverbalDesignation;

	type NonverbalDesignation : Designation;

	type Implication : BinaryLogicalOperation {
		Consequent_Ref : LogicalFormulation*;
		Antecedent_Ref : LogicalFormulation*;
	};

	type ImpossibilityStatement : StructuralRuleStatement;

	type StructuralRuleStatement : RuleStatement;

	type RuleStatement : GuidanceStatement;

	type IndividualConcept : NounConcept, BindableTarget;

	type InformalRepresentation : Representation;

	type InstantiationFormulation : LogicalFormulation;

	type IsfacetofFactType : ContextualizationFactType;

	type IspropertyofFactType : AssociativeFactType;

	type IsroleofFactType : FactType;

	type KindOfGuidanceStatement : CategorizationScheme;

	type Language : Thing;

	type LevelOfEnforcement : Thing;

	type LogicalFormulationKind : ObjectType;

	type LogicalNegation : LogicalOperation;

	type ModalFormulation : LogicalFormulation;

	type NandFormulation : BinaryLogicalOperation;

	type NecessityFormulation : ModalFormulation;

	type NecessityStatement : StructuralRuleStatement;

	type NonnecessityStatement : StatementOfAdviceOfPossibility;

	type NonobligationStatement : StatementOfAdviceOfPermission;

	type StatementOfAdviceOfPermission : AdviceStatement;

	type NorFormulation : BinaryLogicalOperation;

	type Note : Representation;

	type NounConceptNominalization : ProjectingFormulation;

	type NounForm : FactTypeForm;

	type NumericRangeQuantification : Quantification {
		MaximumCardinality_Ref : NonnegativeInteger;
		MinimumCardinality_Ref : NonnegativeInteger;
	};

	type Objectification : LogicalFormulation;

	type ObligationFormulation : ModalFormulation;

	type ObligationStatement : OperativeBusinessRuleStatement;

	type OperativeBusinessRuleStatement : RuleStatement;

	type OperativeBusinessRule : ElementOfGovernance, BusinessRule {
		LevelOfEnforcement_Ref : LevelOfEnforcement*;
	};

	type OptionalityStatement : StatementOfAdviceOfPermission;

	type OwnedDefinition : Definition;

	type PartitiveFactType : BinaryFactType;

	type PermissibilityFormulation : ModalFormulation;

	type PermissionStatement : StatementOfAdviceOfPermission;

	type PossibilityFormulation : ModalFormulation;

	type PossibilityStatement : StatementOfAdviceOfPossibility;

	type PreferredDesignation : Designation;

	type ProhibitedDesignation : Designation;

	type ProhibitionStatement : OperativeBusinessRuleStatement;

	type PropositionNominalization : LogicalFormulation;

	type Question : Meaning;

	type QuestionNominalization : ProjectingFormulation;

	type RealworldNumericalCorrespondence : CategorizationScheme;

	type Reference : Representation;

	type RepresentationFormality : Segmentation;

	type Res : Thing;

	type RestrictedPermissionStatement : OperativeBusinessRuleStatement;

	type RestrictedPossibilityStatement : StructuralRuleStatement;

	type Rulebook : Set;

	type SemanticCommunity : Community {
		SpeechCommunity_Ref : SpeechCommunity*;
	};

	type SpeechCommunity : Community;

	type SententialForm : FactTypeForm;

	type SetProjection : Projection;

	type Situation : Thing;

	type SituationalRole : ObjectType, Role;

	type SpeechCommunityAdoptsAdoptedDefinitionCitingReference {
		SpeechCommunity_Ref : SpeechCommunity;
		AdoptedDefinition_Ref : AdoptedDefinition;
		Reference_Ref : Reference;
	};

	type StateOfAffairsInvolvesThingInRole {
		StateOfAffairs_Ref : StateOfAffairs;
		Thing_Ref : Thing;
		Role_Ref : Role;
	};

	type StructuralBusinessRule : BusinessRule, StructuralRule;

	type StructuralRule : Rule;

	type SubjectField : Thing;

	type Term : Designation;

	type TerminologicalDictionary : Thing {
		Uri_ContRef : Uri*;
	};

	type ThingInContext : Segmentation;

	type UniversalQuantification : Quantification;

	type Viewpoint : Thing;

	type VocabularyNamespace : Namespace;

	type WhetherornotFormulation : BinaryLogicalOperation {
		Inconsequent_Ref : LogicalFormulation*;
		Consequent_Ref : LogicalFormulation*;
	};

	type AtleastnQuantificationHasMinimumCardinality {
		AtleastnQuantification_Ref : AtleastnQuantification;
		MinimumCardinality_Ref : NonnegativeInteger;
	};

	type AtmostnQuantificationHasMaximumCardinality {
		AtmostnQuantification_Ref : AtmostnQuantification;
		MaximumCardinality_Ref : NonnegativeInteger;
	};

	type AtomicFormulationIsBasedOnFactType {
		AtomicFormulation_Ref : AtomicFormulation;
		FactType_Ref : FactType;
	};

	type AttributiveNamespaceIsForSubjectConcept {
		AttributiveNamespace_Ref : AttributiveNamespace;
		SubjectConcept_Ref : Concept;
	};

	type AttributiveNamespaceIsWithinVocabularyNamespace {
		AttributiveNamespace_Ref : AttributiveNamespace;
		VocabularyNamespace_Ref : VocabularyNamespace;
	};

	type BinaryLogicalOperationHasLogicalOperand1 {
		BinaryLogicalOperation_Ref : BinaryLogicalOperation;
		LogicalOperand1_Ref : LogicalFormulation;
	};

	type BinaryLogicalOperationHasLogicalOperand2 {
		BinaryLogicalOperation_Ref : BinaryLogicalOperation;
		LogicalOperand2_Ref : LogicalFormulation;
	};

	type BodyOfSharedMeaningsIncludesBodyOfSharedConcepts {
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
		BodyOfSharedConcepts_Ref : BodyOfSharedConcepts;
	};

	type BodyOfSharedMeaningsIncludesBodyOfSharedGuidance {
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
		BodyOfSharedGuidance_Ref : BodyOfSharedGuidance;
	};

	type BodyOfSharedMeaningsUnitesSemanticCommunity {
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
		SemanticCommunity_Ref : SemanticCommunity;
	};

	type BodyOfSharedMeanings1ContainsBodyOfSharedMeanings2 {
		BodyOfSharedMeanings1_Ref : BodyOfSharedMeanings;
		BodyOfSharedMeanings2_Ref : BodyOfSharedMeanings;
	};

	type BusinessPolicyIsBasisForAdvice {
		BusinessPolicy_Ref : BusinessPolicy;
		Advice_Ref : Advice;
	};

	type BusinessRuleIsDerivedFromBusinessPolicy {
		BusinessRule_Ref : BusinessRule;
		BusinessPolicy_Ref : BusinessPolicy;
	};

	type CategorizationSchemeContainsCategory {
		CategorizationScheme_Ref : CategorizationScheme;
		Category_Ref : Concept;
	};

	type CategorizationSchemeIsForGeneralConcept {
		CategorizationScheme_Ref : CategorizationScheme;
		GeneralConcept_Ref : ObjectType;
	};

	type CategorizationTypeIsForGeneralConcept {
		CategorizationType_Ref : CategorizationType;
		GeneralConcept_Ref : ObjectType;
	};

	type ClosedLogicalFormulationFormalizesStatement {
		ClosedLogicalFormulation_Ref : ClosedLogicalFormulation;
		Statement_Ref : Statement;
	};

	type ClosedLogicalFormulationMeansProposition {
		ClosedLogicalFormulation_Ref : ClosedLogicalFormulation;
		Proposition_Ref : Proposition;
	};

	type ClosedProjectionDefinesFactType {
		ClosedProjection_Ref : ClosedProjection;
		FactType_Ref : FactType;
	};

	type ClosedProjectionDefinesNounConcept {
		ClosedProjection_Ref : ClosedProjection;
		NounConcept_Ref : NounConcept;
	};

	type ClosedProjectionFormalizesDefinition {
		ClosedProjection_Ref : ClosedProjection;
		Definition_Ref : Definition;
	};

	type ClosedProjectionMeansQuestion {
		ClosedProjection_Ref : ClosedProjection;
		Question_Ref : Question;
	};

	type ClosedSemanticFormulationFormulatesMeaning {
		ClosedSemanticFormulation_Ref : ClosedSemanticFormulation;
		Meaning_Ref : Meaning;
	};

	type CommunicationContentIsComposedOfRepresentation {
		CommunicationContent_Ref : CommunicationContent;
		Representation_Ref : Representation;
	};

	type CommunityHasSubcommunity {
		Community_Ref : Community;
		Subcommunity_Ref : Community;
	};

	type CommunityHasUri {
		Community_Ref : Community;
		Uri_Ref : Uri;
	};

	type ConceptHasDefinition {
		Concept_Ref : Concept;
		Definition_Ref : Definition;
	};

	type ConceptHasDesignation {
		Concept_Ref : Concept;
		Designation_Ref : Designation;
	};

	type ConceptHasExtension {
		Concept_Ref : Concept;
		Extension_Ref : Set;
	};

	type ConceptHasImpliedCharacteristic {
		Concept_Ref : Concept;
		ImpliedCharacteristic_Ref : Characteristic;
	};

	type ConceptHasInstance {
		Concept_Ref : Concept;
		Instance_Ref : Thing;
	};

	type ConceptHasNecessaryCharacteristic {
		Concept_Ref : Concept;
		NecessaryCharacteristic_Ref : Characteristic;
	};

	type ConceptHasSharedUnderstandingBySemanticCommunity {
		Concept_Ref : Concept;
		SemanticCommunity_Ref : SemanticCommunity;
	};

	type ConceptIncorporatesCharacteristic {
		Concept_Ref : Concept;
		Characteristic_Ref : Characteristic;
	};

	type ConceptIsClosedInConceptualSchema {
		Concept_Ref : Concept;
		ConceptualSchema_Ref : ConceptualSchema;
	};

	type ConceptIsIncludedInBodyOfSharedConcepts {
		Concept_Ref : Concept;
		BodyOfSharedConcepts_Ref : BodyOfSharedConcepts;
	};

	type Concept1IsCoextensiveWithConcept2 {
		Concept1_Ref : Concept;
		Concept2_Ref : Concept;
	};

	type Concept1SpecializesConcept2 {
		Concept1_Ref : Concept;
		Concept2_Ref : Concept;
	};

	type ConceptualSchemaIncludesConcept {
		ConceptualSchema_Ref : ConceptualSchema;
		Concept_Ref : Concept;
	};

	type ConceptualSchemaIncludesFact {
		ConceptualSchema_Ref : ConceptualSchema;
		Fact_Ref : Fact;
	};

	type DefinitionServesAsDesignation {
		Definition_Ref : Definition;
		Designation_Ref : Designation;
	};

	type DescriptionPortraysMeaning {
		Description_Ref : Description;
		Meaning_Ref : Meaning;
	};

	type DescriptiveExampleIllustratesMeaning {
		DescriptiveExample_Ref : DescriptiveExample;
		Meaning_Ref : Meaning;
	};

	type DesignationHasSignifier {
		Designation_Ref : Designation;
		Signifier_Ref : Expression;
	};

	type DesignationIsInNamespace {
		Designation_Ref : Designation;
		Namespace_Ref : Namespace;
	};

	type ElementOfGuidanceAuthorizesStateOfAffairs {
		ElementOfGuidance_Ref : ElementOfGuidance;
		StateOfAffairs_Ref : StateOfAffairs;
	};

	type ElementOfGuidanceIsIncludedInBodyOfSharedGuidance {
		ElementOfGuidance_Ref : ElementOfGuidance;
		BodyOfSharedGuidance_Ref : BodyOfSharedGuidance;
	};

	type ElementOfGuidanceObligatesStateOfAffairs {
		ElementOfGuidance_Ref : ElementOfGuidance;
		StateOfAffairs_Ref : StateOfAffairs;
	};

	type ElementOfGuidanceProhibitsStateOfAffairs {
		ElementOfGuidance_Ref : ElementOfGuidance;
		StateOfAffairs_Ref : StateOfAffairs;
	};

	type ExactlynQuantificationHasCardinality {
		ExactlynQuantification_Ref : ExactlynQuantification;
		Cardinality_Ref : NonnegativeInteger;
	};

	type ExpressionRepresentsMeaning {
		Expression_Ref : Expression;
		Meaning_Ref : Meaning;
	};

	type FactModelIncludesFact {
		FactModel_Ref : FactModel;
		Fact_Ref : Fact;
	};

	type FactModelIsBasedOnConceptualSchema {
		FactModel_Ref : FactModel;
		ConceptualSchema_Ref : ConceptualSchema;
	};

	type FactTypeFormDemonstratesDesignation {
		FactTypeForm_Ref : FactTypeForm;
		Designation_Ref : Designation;
	};

	type FactTypeFormIncorporatesFactSymbol {
		FactTypeForm_Ref : FactTypeForm;
		FactSymbol_Ref : FactSymbol;
	};

	type FactTypeFormIsInNamespace {
		FactTypeForm_Ref : FactTypeForm;
		Namespace_Ref : Namespace;
	};

	type FactTypeHasFactTypeForm {
		FactType_Ref : FactType;
		FactTypeForm_Ref : FactTypeForm;
	};

	type FactTypeInternallyIsClosedInConceptualSchema {
		FactType_Ref : FactType;
		ConceptualSchema_Ref : ConceptualSchema;
	};

	type FactTypeIsElementaryInBodyOfSharedMeanings {
		FactType_Ref : FactType;
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
	};

	type FactTypeRoleHasRoleBinding {
		FactTypeRole_Ref : FactTypeRole;
		RoleBinding_Ref : RoleBinding;
	};

	type FactTypeRoleIsInFactType {
		FactTypeRole_Ref : FactTypeRole;
		FactType_Ref : FactType;
	};

	type ImplicationHasAntecedent {
		Implication_Ref : Implication;
		Antecedent_Ref : LogicalFormulation;
	};

	type ImplicationHasConsequent {
		Implication_Ref : Implication;
		Consequent_Ref : LogicalFormulation;
	};

	type InstantiationFormulationBindsToBindableTarget {
		InstantiationFormulation_Ref : InstantiationFormulation;
		BindableTarget_Ref : BindableTarget;
	};

	type InstantiationFormulationConsidersConcept {
		InstantiationFormulation_Ref : InstantiationFormulation;
		Concept_Ref : Concept;
	};

	type IntensionalDefinitionUsesDelimitingCharacteristic {
		IntensionalDefinition_Ref : IntensionalDefinition;
		DelimitingCharacteristic_Ref : Characteristic;
	};

	type LogicalFormulationConstrainsProjection {
		LogicalFormulation_Ref : LogicalFormulation;
		Projection_Ref : Projection;
	};

	type LogicalFormulationRestrictsVariable {
		LogicalFormulation_Ref : LogicalFormulation;
		Variable_Ref : Variable;
	};

	type LogicalOperationHasLogicalOperand {
		LogicalOperation_Ref : LogicalOperation;
		LogicalOperand_Ref : LogicalFormulation;
	};

	type MeaningCorrespondsToThing {
		Meaning_Ref : Meaning;
		Thing_Ref : Thing;
	};

	type ModalFormulationEmbedsLogicalFormulation {
		ModalFormulation_Ref : ModalFormulation;
		LogicalFormulation_Ref : LogicalFormulation;
	};

	type NameReferencesThing {
		Name_Ref : Name;
		Thing_Ref : Thing;
	};

	type NamespaceHasUri {
		Namespace_Ref : Namespace;
		Uri_Ref : Uri;
	};

	type Namespace1IncorporatesNamespace2 {
		Namespace1_Ref : Namespace;
		Namespace2_Ref : Namespace;
	};

	type NoteCommentsOnMeaning {
		Note_Ref : Note;
		Meaning_Ref : Meaning;
	};

	type NumericRangeQuantificationHasMaximumCardinality {
		NumericRangeQuantification_Ref : NumericRangeQuantification;
		MaximumCardinality_Ref : NonnegativeInteger;
	};

	type NumericRangeQuantificationHasMinimumCardinality {
		NumericRangeQuantification_Ref : NumericRangeQuantification;
		MinimumCardinality_Ref : NonnegativeInteger;
	};

	type ObjectificationBindsToBindableTarget {
		Objectification_Ref : Objectification;
		BindableTarget_Ref : BindableTarget;
	};

	type ObjectificationConsidersLogicalFormulation {
		Objectification_Ref : Objectification;
		LogicalFormulation_Ref : LogicalFormulation;
	};

	type OperativeBusinessRuleHasLevelOfEnforcement {
		OperativeBusinessRule_Ref : OperativeBusinessRule;
		LevelOfEnforcement_Ref : LevelOfEnforcement;
	};

	type PlaceholderIsAtStartingCharacterPosition {
		Placeholder_Ref : Placeholder;
		StartingCharacterPosition_Ref : PositiveInteger;
	};

	type PlaceholderIsInFactTypeForm {
		Placeholder_Ref : Placeholder;
		FactTypeForm_Ref : FactTypeForm;
	};

	type PlaceholderUsesDesignation {
		Placeholder_Ref : Placeholder;
		Designation_Ref : Designation;
	};

	type ProjectingFormulationBindsToBindableTarget {
		ProjectingFormulation_Ref : ProjectingFormulation;
		BindableTarget_Ref : BindableTarget;
	};

	type ProjectingFormulationHasProjection {
		ProjectingFormulation_Ref : ProjectingFormulation;
		Projection_Ref : Projection;
	};

	type ProjectionHasAuxiliaryVariable {
		Projection_Ref : Projection;
		AuxiliaryVariable_Ref : AuxiliaryVariable;
	};

	type ProjectionIsOnVariable {
		Projection_Ref : Projection;
		Variable_Ref : Variable;
	};

	type PropositionIsBasedOnFactType {
		Proposition_Ref : Proposition;
		FactType_Ref : FactType;
	};

	type PropositionNominalizationBindsToBindableTarget {
		PropositionNominalization_Ref : PropositionNominalization;
		BindableTarget_Ref : BindableTarget;
	};

	type PropositionNominalizationConsidersLogicalFormulation {
		PropositionNominalization_Ref : PropositionNominalization;
		LogicalFormulation_Ref : LogicalFormulation;
	};

	type QuantificationIntroducesVariable {
		Quantification_Ref : Quantification;
		Variable_Ref : Variable;
	};

	type QuantificationScopesOverLogicalFormulation {
		Quantification_Ref : Quantification;
		LogicalFormulation_Ref : LogicalFormulation;
	};

	type Quantity1EqualsQuantity2 {
		Quantity1_Ref : Quantity;
		Quantity2_Ref : Quantity;
	};

	type Quantity1IsLessThanQuantity2 {
		Quantity1_Ref : Quantity;
		Quantity2_Ref : Quantity;
	};

	type ReferencePointsToInformationSource {
		Reference_Ref : Reference;
		InformationSource_Ref : CommunicationContent;
	};

	type ReferenceSchemeExtensionallyUsesFactTypeRole {
		ReferenceScheme_Ref : ReferenceScheme;
		FactTypeRole_Ref : FactTypeRole;
	};

	type ReferenceSchemeIsForConcept {
		ReferenceScheme_Ref : ReferenceScheme;
		Concept_Ref : Concept;
	};

	type ReferenceSchemeSimplyUsesFactTypeRole {
		ReferenceScheme_Ref : ReferenceScheme;
		FactTypeRole_Ref : FactTypeRole;
	};

	type ReferenceSchemeUsesCharacteristic {
		ReferenceScheme_Ref : ReferenceScheme;
		Characteristic_Ref : Characteristic;
	};

	type ReferenceSupportsMeaning {
		Reference_Ref : Reference;
		Meaning_Ref : Meaning;
	};

	type RepresentationHasExpression {
		Representation_Ref : Representation;
		Expression_Ref : Expression;
	};

	type RepresentationIsInDesignationContext {
		Representation_Ref : Representation;
		DesignationContext_Ref : Concept;
	};

	type RepresentationIsInSubjectField {
		Representation_Ref : Representation;
		SubjectField_Ref : SubjectField;
	};

	type RepresentationRepresentsMeaning {
		Representation_Ref : Representation;
		Meaning_Ref : Meaning;
	};

	type RepresentationUsesVocabulary {
		Representation_Ref : Representation;
		Vocabulary_Ref : Vocabulary;
	};

	type ResIsSensoryManifestationOfSignifier {
		Res_Ref : Res;
		Signifier_Ref : Expression;
	};

	type RoleBindingBindsToBindableTarget {
		RoleBinding_Ref : RoleBinding;
		BindableTarget_Ref : BindableTarget;
	};

	type RoleBindingOccursInAtomicFormulation {
		RoleBinding_Ref : RoleBinding;
		AtomicFormulation_Ref : AtomicFormulation;
	};

	type RoleRangesOverObjectType {
		Role_Ref : Role;
		ObjectType_Ref : ObjectType;
	};

	type RulebookIncludesRepresentation {
		Rulebook_Ref : Rulebook;
		Representation_Ref : Representation;
	};

	type SemanticCommunityHasSpeechCommunity {
		SemanticCommunity_Ref : SemanticCommunity;
		SpeechCommunity_Ref : SpeechCommunity;
	};

	type SetHasCardinality {
		Set_Ref : Set;
		Cardinality_Ref : NonnegativeInteger;
	};

	type SpeechCommunityDeterminesRulebook {
		SpeechCommunity_Ref : SpeechCommunity;
		Rulebook_Ref : Rulebook;
	};

	type SpeechCommunityOwnsOwnedDefinition {
		SpeechCommunity_Ref : SpeechCommunity;
		OwnedDefinition_Ref : OwnedDefinition;
	};

	type SpeechCommunityOwnsVocabulary {
		SpeechCommunity_Ref : SpeechCommunity;
		Vocabulary_Ref : Vocabulary;
	};

	type SpeechCommunityRegulatesItsUsageOfSignifier {
		SpeechCommunity_Ref : SpeechCommunity;
		Signifier_Ref : Expression;
	};

	type SpeechCommunityUsesLanguage {
		SpeechCommunity_Ref : SpeechCommunity;
		Language_Ref : Language;
	};

	type SpeechCommunityUsesVocabulary {
		SpeechCommunity_Ref : SpeechCommunity;
		Vocabulary_Ref : Vocabulary;
	};

	type StatementExpressesProposition {
		Statement_Ref : Statement;
		Proposition_Ref : Proposition;
	};

	type TermDenotesThing {
		Term_Ref : Term;
		Thing_Ref : Thing;
	};

	type TerminologicalDictionaryExpressesBodyOfSharedMeanings {
		TerminologicalDictionary_Ref : TerminologicalDictionary;
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
	};

	type TerminologicalDictionaryHasUri {
		TerminologicalDictionary_Ref : TerminologicalDictionary;
		Uri_Ref : Uri;
	};

	type TerminologicalDictionaryPresentsVocabulary {
		TerminologicalDictionary_Ref : TerminologicalDictionary;
		Vocabulary_Ref : Vocabulary;
	};

	type ThingIsInSet {
		Thing_Ref : Thing;
		Set_Ref : Set;
	};

	type Thing1IsThing2 {
		Thing1_Ref : Thing;
		Thing2_Ref : Thing;
	};

	type VariableHasProjectionPosition {
		Variable_Ref : Variable;
		ProjectionPosition_Ref : PositiveInteger;
	};

	type VariableIsFreesWithinSemanticFormulation {
		Variable_Ref : Variable;
		SemanticFormulation_Ref : SemanticFormulation;
	};

	type VariableMapsToFactTypeRole {
		Variable_Ref : Variable;
		FactTypeRole_Ref : FactTypeRole;
	};

	type VariableRangesOverConcept {
		Variable_Ref : Variable;
		Concept_Ref : Concept;
	};

	type VocabularyIsDesignedForSpeechCommunity {
		Vocabulary_Ref : Vocabulary;
		SpeechCommunity_Ref : SpeechCommunity;
	};

	type VocabularyIsExpressedInLanguage {
		Vocabulary_Ref : Vocabulary;
		Language_Ref : Language;
	};

	type VocabularyIsUsedToExpressBodyOfSharedMeanings {
		Vocabulary_Ref : Vocabulary;
		BodyOfSharedMeanings_Ref : BodyOfSharedMeanings;
	};

	type VocabularyNamespaceIsDerivedFromVocabulary {
		VocabularyNamespace_Ref : VocabularyNamespace;
		Vocabulary_Ref : Vocabulary;
	};

	type VocabularyNamespaceIsForLanguage {
		VocabularyNamespace_Ref : VocabularyNamespace;
		Language_Ref : Language;
	};

	type VocabularyNamespaceIsSpecificToDesignationContext {
		VocabularyNamespace_Ref : VocabularyNamespace;
		DesignationContext_Ref : Concept;
	};

	type VocabularyNamespaceIsSpecificToSubjectField {
		VocabularyNamespace_Ref : VocabularyNamespace;
		SubjectField_Ref : SubjectField;
	};

	type Vocabulary1IncorporatesVocabulary2 {
		Vocabulary1_Ref : Vocabulary;
		Vocabulary2_Ref : Vocabulary;
	};

	type WhetherornotFormulationHasConsequent {
		WhetherornotFormulation_Ref : WhetherornotFormulation;
		Consequent_Ref : LogicalFormulation;
	};

	type WhetherornotFormulationHasInconsequent {
		WhetherornotFormulation_Ref : WhetherornotFormulation;
		Inconsequent_Ref : LogicalFormulation;
	};
}