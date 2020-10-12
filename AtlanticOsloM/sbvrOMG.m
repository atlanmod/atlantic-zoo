module Sbvr {

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
}