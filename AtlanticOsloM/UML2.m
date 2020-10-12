module Uml2 {

	type Element {
		OwnedElement_Ref : Element*;
		Owner_Ref : Element?;
		OwnedComment_ContRef : Comment*;
	};

	type MultiplicityElement : Element {
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
		Lower_Att : Integer32;
		Upper_Att : Logical;
		UpperValue_ContRef : ValueSpecification?;
		LowerValue_ContRef : ValueSpecification?;
	};

	type NamedElement : TemplateableElement {
		Name_Att : Text;
		QualifiedName_Att : Text;
		Visibility_Att : VisibilityKind?;
		ClientDependency_Ref : Dependency*;
		NameExpression_ContRef : StringExpression?;
	};

	type Namespace : NamedElement {
		Member_Ref : NamedElement*;
		OwnedRule_ContRef : Constraint*;
		ImportedMember_Ref : PackageableElement*;
		ElementImport_ContRef : ElementImport*;
		PackageImport_ContRef : PackageImport*;
	};

	type OpaqueExpression : ValueSpecification {
		Body_Att : Text;
		Language_Att : Text;
		Result_Ref : Parameter?;
		Behavior_Ref : Behavior?;
	};

	type ValueSpecification : TypedElement, ParameterableElement;

	type Expression : OpaqueExpression {
		Symbol_Att : Text;
		Operand_ContRef : ValueSpecification*;
	};

	type Comment : TemplateableElement {
		Body_Att : Text;
		AnnotatedElement_Ref : Element*;
		BodyExpression_ContRef : StringExpression?;
	};

	type DirectedRelationship : Relationship {
		Source_Ref : Element+;
		Target_Ref : Element+;
	};

	type Relationship : Element {
		RelatedElement_Ref : Element+;
	};

	type Class : BehavioredClassifier, EncapsulatedClassifier {
		OwnedOperation_ContRef : Operation*;
		SuperClass_Ref : Class*;
		Extension_Ref : Extension*;
		NestedClassifier_ContRef : Classifier*;
		IsActive_Att : Logical;
		OwnedReception_ContRef : Reception*;
	};

	type Type : PackageableElement {
		Package_Ref : Package?;
	};

	type Property : StructuralFeature, ConnectableElement, DeploymentTarget {
		Default_Att : Text;
		IsComposite_Att : Logical;
		IsDerived_Att : Logical;
		Class__Ref : Class?;
		Opposite_Ref : Property?;
		IsDerivedUnion_Att : Logical;
		OwningAssociation_Ref : Association?;
		RedefinedProperty_Ref : Property*;
		SubsettedProperty_Ref : Property*;
		Datatype_Ref : DataType?;
		Association_Ref : Association?;
		Aggregation_Att : AggregationKind?;
		DefaultValue_ContRef : ValueSpecification?;
		Qualifier_ContRef : Property*;
		AssociationEnd_Ref : Property?;
	};

	type Operation : BehavioralFeature, TypedElement, MultiplicityElement, ParameterableElement {
		OwnedParameter_ContRef : Parameter*;
		Class__Ref : Class?;
		IsQuery_Att : Logical;
		Datatype_Ref : DataType?;
		Precondition_Ref : Constraint*;
		Postcondition_Ref : Constraint*;
		RedefinedOperation_Ref : Operation*;
		BodyCondition_Ref : Constraint?;
	};

	type TypedElement : NamedElement {
		Type_Ref : Type?;
	};

	type Parameter : ConnectableElement, TypedElement, MultiplicityElement {
		Operation_Ref : Operation?;
		Default_Att : Text;
		Direction_Att : ParameterDirectionKind?;
		DefaultValue_ContRef : ValueSpecification?;
		IsException_Att : Logical;
		IsStream_Att : Logical;
		Effect_Att : ParameterEffectKind?;
		ParameterSet_Ref : ParameterSet*;
	};

	type Package : Namespace, PackageableElement {
		NestedPackage_Ref : Package*;
		NestingPackage_Ref : Package?;
		OwnedType_Ref : Type*;
		OwnedMember_ContRef : PackageableElement*;
		PackageMerge_ContRef : PackageMerge*;
		AppliedProfile_Ref : ProfileApplication*;
		PackageExtension_ContRef : PackageMerge*;
	};

	type Enumeration : DataType {
		OwnedLiteral_ContRef : EnumerationLiteral*;
	};

	type DataType : Classifier {
		OwnedAttribute_ContRef : Property*;
		OwnedOperation_ContRef : Operation*;
	};

	type EnumerationLiteral : InstanceSpecification {
		Enumeration_Ref : Enumeration?;
	};

	type PrimitiveType : DataType;

	type Classifier : Namespace, Type, RedefinableElement {
		Feature_Ref : Feature*;
		IsAbstract_Att : Logical;
		InheritedMember_Ref : NamedElement*;
		General_Ref : Classifier*;
		Generalization_ContRef : Generalization*;
		Attribute_Ref : Property*;
		RedefinedClassifier_Ref : Classifier*;
		Substitution_ContRef : Substitution*;
		PowertypeExtent_Ref : GeneralizationSet*;
		OwnedUseCase_ContRef : UseCase*;
		UseCase_Ref : UseCase*;
		Representation_Ref : CollaborationOccurrence?;
		Occurrence_ContRef : CollaborationOccurrence*;
	};

	type Feature : RedefinableElement {
		FeaturingClassifier_Ref : Classifier*;
		IsStatic_Att : Logical;
	};

	type Constraint : PackageableElement {
		Context_Ref : Namespace?;
		Namespace_Ref : Namespace?;
		Specification_ContRef : ValueSpecification;
		ConstrainedElement_Ref : Element*;
	};

	type VisibilityKind {"package", "private", "protected", "public"};

	type LiteralBoolean : LiteralSpecification {
		Value_Att : Logical;
	};

	type LiteralSpecification : ValueSpecification;

	type LiteralString : LiteralSpecification {
		Value_Att : Text;
	};

	type LiteralNull : LiteralSpecification;

	type LiteralInteger : LiteralSpecification {
		Value_Att : Integer32;
	};

	type LiteralUnlimitedNatural : LiteralSpecification {
		Value_Att : Logical;
	};

	type BehavioralFeature : Namespace, Feature {
		Parameter_Ref : Parameter*;
		FormalParameter_ContRef : Parameter*;
		ReturnResult_ContRef : Parameter*;
		RaisedException_Ref : Type*;
		IsAbstract_Att : Logical;
		Method_Ref : Behavior*;
		Concurrency_Att : CallConcurrencyKind?;
	};

	type StructuralFeature : Feature, TypedElement, MultiplicityElement {
		IsReadOnly_Att : Logical;
	};

	type InstanceSpecification : PackageableElement, DeploymentTarget, DeployedArtifact {
		Slot_ContRef : Slot*;
		Classifier_Ref : Classifier*;
		Specification_ContRef : ValueSpecification?;
	};

	type Slot : Element {
		OwningInstance_Ref : InstanceSpecification;
		Value_ContRef : ValueSpecification*;
		DefiningFeature_Ref : StructuralFeature;
	};

	type InstanceValue : ValueSpecification {
		Instance_Ref : InstanceSpecification;
	};

	type RedefinableElement : NamedElement {
		RedefinitionContext_Ref : Classifier*;
		IsLeaf_Att : Logical;
	};

	type Generalization : DirectedRelationship {
		Specific_Ref : Classifier;
		General_Ref : Classifier;
		IsSubstitutable_Att : Logical;
		GeneralizationSet_Ref : GeneralizationSet*;
	};

	type PackageableElement : NamedElement, ParameterableElement {
		PackageableElement_visibility_Att : VisibilityKind?;
	};

	type ElementImport : DirectedRelationship {
		Visibility_Att : VisibilityKind?;
		Alias_Att : Text;
		ImportedElement_Ref : PackageableElement;
		ImportingNamespace_Ref : Namespace;
	};

	type PackageImport : DirectedRelationship {
		Visibility_Att : VisibilityKind?;
		ImportedPackage_Ref : Package;
		ImportingNamespace_Ref : Namespace;
	};

	type Association : Classifier, Relationship {
		IsDerived_Att : Logical;
		OwnedEnd_ContRef : Property*;
		EndType_Ref : Type+;
		MemberEnd_Ref : Property#2 ..;
	};

	type PackageMerge : DirectedRelationship {
		MergingPackage_Ref : Package;
		MergedPackage_Ref : Package;
	};

	type Stereotype : Class;

	type Profile : Package {
		OwnedStereotype_Ref : Stereotype*;
		MetaclassReference_Ref : ElementImport*;
		MetamodelReference_Ref : PackageImport*;
	};

	type ProfileApplication : PackageImport {
		ImportedProfile_Ref : Profile;
	};

	type Extension : Association {
		IsRequired_Att : Logical;
		Metaclass_Ref : Class;
	};

	type ExtensionEnd : Property;

	type ParameterDirectionKind {"in", "inout", "out", "return"};

	type AggregationKind {"composite", "none", "shared"};

	type Behavior : Class {
		IsReentrant_Att : Logical;
		Context_Ref : BehavioredClassifier?;
		RedefinedBehavior_Ref : Behavior*;
		Specification_Ref : BehavioralFeature?;
		Parameter_ContRef : Parameter*;
		FormalParameter_Ref : Parameter*;
		ReturnResult_Ref : Parameter*;
		Precondition_Ref : Constraint*;
		Postcondition_Ref : Constraint*;
		OwnedParameterSet_ContRef : ParameterSet*;
	};

	type BehavioredClassifier : Classifier {
		OwnedBehavior_ContRef : Behavior*;
		ClassifierBehavior_Ref : Behavior?;
		Implementation_ContRef : Implementation*;
		OwnedTrigger_ContRef : Trigger*;
		OwnedStateMachine_ContRef : StateMachine*;
	};

	type Activity : Behavior {
		Body_Att : Text;
		Language_Att : Text;
		Edge_ContRef : ActivityEdge*;
		Group_ContRef : ActivityGroup*;
		Node_ContRef : ActivityNode*;
		Action_Ref : Action*;
		StructuredNode_Ref : StructuredActivityNode*;
		IsSingleExecution_Att : Logical;
		IsReadOnly_Att : Logical;
	};

	type Permission : Dependency;

	type Dependency : PackageableElement, DirectedRelationship {
		Client_Ref : NamedElement+;
		Supplier_Ref : NamedElement+;
	};

	type Usage : Dependency;

	type Abstraction : Dependency {
		Mapping_ContRef : OpaqueExpression?;
	};

	type Realization : Abstraction {
		Abstraction_Ref : Component?;
		RealizingClassifier_Ref : Classifier;
	};

	type Substitution : Realization {
		Contract_Ref : Classifier;
		SubstitutingClassifier_Ref : Classifier;
	};

	type GeneralizationSet : PackageableElement {
		IsCovering_Att : Logical;
		IsDisjoint_Att : Logical;
		Powertype_Ref : Classifier?;
		Generalization_Ref : Generalization*;
	};

	type AssociationClass : Class, Association;

	type InformationItem : Classifier {
		Represented_Ref : Classifier*;
	};

	type InformationFlow : PackageableElement, DirectedRelationship {
		Realization_Ref : Relationship*;
		Conveyed_Ref : Classifier+;
	};

	type Model : Package {
		Viewpoint_Att : Text;
	};

	type ConnectorEnd : MultiplicityElement {
		DefiningEnd_Ref : Property?;
		Role_Ref : ConnectableElement?;
		PartWithPort_Ref : Property?;
	};

	type ConnectableElement : NamedElement, ParameterableElement {
		End_Ref : ConnectorEnd*;
	};

	type Connector : Feature {
		Type_Ref : Association?;
		RedefinedConnector_Ref : Connector*;
		End_ContRef : ConnectorEnd#2 ..;
		Kind_Att : ConnectorKind?;
		Contract_Ref : Behavior*;
	};

	type StructuredClassifier : Classifier {
		OwnedAttribute_ContRef : Property*;
		Part_Ref : Property*;
		Role_Ref : ConnectableElement*;
		OwnedConnector_ContRef : Connector*;
	};

	type ActivityEdge : RedefinableElement {
		Activity_Ref : Activity?;
		Source_Ref : ActivityNode;
		Target_Ref : ActivityNode;
		InGroup_Ref : ActivityGroup*;
		Guard_ContRef : ValueSpecification;
		RedefinedElement_Ref : ActivityEdge*;
		InStructuredNode_Ref : StructuredActivityNode?;
		InPartition_Ref : ActivityPartition*;
		Weight_ContRef : ValueSpecification;
		Interrupts_Ref : InterruptibleActivityRegion?;
	};

	type ActivityGroup : Element {
		SuperGroup_Ref : ActivityGroup?;
		ActivityGroup_activity_Ref : Activity?;
	};

	type ActivityNode : RedefinableElement {
		Outgoing_Ref : ActivityEdge*;
		Incoming_Ref : ActivityEdge*;
		InGroup_Ref : ActivityGroup*;
		Activity_Ref : Activity?;
		RedefinedElement_Ref : ActivityNode*;
		InStructuredNode_Ref : StructuredActivityNode?;
		InPartition_Ref : ActivityPartition*;
		InInterruptibleRegion_Ref : InterruptibleActivityRegion*;
	};

	type Action : ExecutableNode {
		Effect_Att : Text;
		Output_Ref : OutputPin*;
		Input_Ref : InputPin*;
		Context_Ref : Classifier?;
		LocalPrecondition_ContRef : Constraint*;
		LocalPostcondition_ContRef : Constraint*;
	};

	type ObjectNode : ActivityNode, TypedElement {
		Ordering_Att : ObjectNodeOrderingKind?;
		UpperBound_ContRef : ValueSpecification;
		InState_Ref : State*;
		Selection_Ref : Behavior?;
	};

	type ControlNode : ActivityNode;

	type ControlFlow : ActivityEdge;

	type ObjectFlow : ActivityEdge {
		IsMulticast_Att : Logical;
		IsMultireceive_Att : Logical;
		Transformation_Ref : Behavior?;
		Selection_Ref : Behavior?;
	};

	type InitialNode : ControlNode;

	type FinalNode : ControlNode;

	type ActivityFinalNode : FinalNode;

	type DecisionNode : ControlNode {
		DecisionInput_Ref : Behavior?;
	};

	type MergeNode : ControlNode;

	type ExecutableNode : ActivityNode {
		Handler_ContRef : ExceptionHandler*;
	};

	type OutputPin : Pin;

	type InputPin : Pin;

	type Pin : ObjectNode, MultiplicityElement;

	type ActivityParameterNode : ObjectNode {
		Parameter_Ref : Parameter;
	};

	type ValuePin : InputPin {
		Value_ContRef : ValueSpecification;
	};

	type Interface : Classifier {
		OwnedAttribute_ContRef : Property*;
		OwnedOperation_ContRef : Operation*;
		RedefinedInterface_Ref : Interface*;
		NestedClassifier_ContRef : Classifier*;
		OwnedReception_ContRef : Reception*;
		Protocol_ContRef : ProtocolStateMachine?;
	};

	type Implementation : Realization {
		Contract_Ref : Interface;
		ImplementingClassifier_Ref : BehavioredClassifier;
	};

	type Artifact : Classifier, DeployedArtifact {
		FileName_Att : Text;
		NestedArtifact_ContRef : Artifact*;
		Manifestation_ContRef : Manifestation*;
		OwnedOperation_ContRef : Operation*;
		OwnedAttribute_ContRef : Property*;
	};

	type Manifestation : Abstraction {
		UtilizedElement_Ref : PackageableElement;
	};

	type Actor : Classifier;

	type Extend : NamedElement, DirectedRelationship {
		ExtendedCase_Ref : UseCase;
		Extension_Ref : UseCase;
		Condition_ContRef : Constraint?;
		ExtensionLocation_Ref : ExtensionPoint+;
	};

	type UseCase : BehavioredClassifier {
		Include_ContRef : Include*;
		Extend_ContRef : Extend*;
		ExtensionPoint_ContRef : ExtensionPoint*;
		Subject_Ref : Classifier*;
	};

	type ExtensionPoint : RedefinableElement {
		UseCase_Ref : UseCase;
	};

	type Include : NamedElement, DirectedRelationship {
		IncludingCase_Ref : UseCase;
		Addition_Ref : UseCase;
	};

	type CollaborationOccurrence : NamedElement {
		Type_Ref : Collaboration;
		RoleBinding_ContRef : Dependency*;
	};

	type Collaboration : BehavioredClassifier, StructuredClassifier {
		CollaborationRole_Ref : ConnectableElement*;
	};

	type Port : Property {
		IsBehavior_Att : Logical;
		IsService_Att : Logical;
		Required_Ref : Interface*;
		RedefinedPort_Ref : Port*;
		Provided_Ref : Interface*;
		Protocol_Ref : ProtocolStateMachine?;
	};

	type EncapsulatedClassifier : StructuredClassifier {
		OwnedPort_ContRef : Port*;
	};

	type CallConcurrencyKind {"guarded", "concurrent", "sequential"};

	type CallTrigger : MessageTrigger {
		Operation_Ref : Operation;
	};

	type MessageTrigger : Trigger;

	type ChangeTrigger : Trigger {
		ChangeExpression_ContRef : ValueSpecification;
	};

	type Trigger : NamedElement {
		Port_Ref : Port*;
	};

	type Reception : BehavioralFeature {
		Signal_Ref : Signal?;
	};

	type Signal : Classifier {
		OwnedAttribute_ContRef : Property*;
	};

	type SignalTrigger : MessageTrigger {
		Signal_Ref : Signal*;
	};

	type TimeTrigger : Trigger {
		IsRelative_Att : Logical;
		When_ContRef : ValueSpecification;
	};

	type AnyTrigger : MessageTrigger;

	type Variable : ConnectableElement, TypedElement, MultiplicityElement {
		Scope_Ref : StructuredActivityNode;
	};

	type StructuredActivityNode : Action, Namespace, ActivityGroup {
		Variable_ContRef : Variable*;
		ContainedNode_ContRef : ActivityNode*;
		ContainedEdge_ContRef : ActivityEdge*;
		MustIsolate_Att : Logical;
	};

	type ConditionalNode : StructuredActivityNode {
		IsDeterminate_Att : Logical;
		IsAssured_Att : Logical;
		Clause_ContRef : Clause+;
		Result_ContRef : OutputPin*;
	};

	type Clause : Element {
		Test_Ref : ActivityNode*;
		Body_Ref : ActivityNode*;
		PredecessorClause_Ref : Clause*;
		SuccessorClause_Ref : Clause*;
		Decider_Ref : OutputPin;
		BodyOutput_Ref : OutputPin*;
	};

	type LoopNode : StructuredActivityNode {
		IsTestedFirst_Att : Logical;
		BodyPart_Ref : ActivityNode*;
		SetupPart_Ref : ActivityNode*;
		Decider_Ref : OutputPin;
		Test_Ref : ActivityNode*;
		Result_ContRef : OutputPin*;
		LoopVariable_ContRef : OutputPin*;
		BodyOutput_Ref : OutputPin*;
		LoopVariableInput_ContRef : InputPin*;
	};

	type Interaction : Behavior, InteractionFragment {
		Lifeline_ContRef : Lifeline*;
		Message_ContRef : Message*;
		Fragment_ContRef : InteractionFragment*;
		FormalGate_ContRef : Gate*;
	};

	type InteractionFragment : NamedElement {
		Covered_Ref : Lifeline*;
		GeneralOrdering_ContRef : GeneralOrdering*;
		EnclosingInteraction_Ref : Interaction?;
		EnclosingOperand_Ref : InteractionOperand?;
	};

	type Lifeline : NamedElement {
		CoveredBy_Ref : InteractionFragment*;
		Represents_Ref : ConnectableElement;
		Interaction_Ref : Interaction;
		Selector_ContRef : OpaqueExpression?;
		DecomposedAs_Ref : PartDecomposition?;
	};

	type Message : NamedElement {
		MessageKind_Att : MessageKind?;
		MessageSort_Att : MessageSort?;
		ReceiveEvent_Ref : MessageEnd?;
		SendEvent_Ref : MessageEnd?;
		Connector_Ref : Connector?;
		Interaction_Ref : Interaction;
		Signature_Ref : NamedElement?;
		Argument_ContRef : ValueSpecification*;
	};

	type GeneralOrdering : NamedElement {
		Before_Ref : EventOccurrence;
		After_Ref : EventOccurrence;
	};

	type MessageKind {"found", "lost", "unknown", "complete"};

	type MessageSort {"synchSignal", "synchCall", "asynchCall", "asynchSignal"};

	type MessageEnd : NamedElement {
		ReceiveMessage_Ref : Message?;
		SendMessage_Ref : Message?;
	};

	type EventOccurrence : InteractionFragment, MessageEnd {
		StartExec_Ref : ExecutionOccurrence*;
		FinishExec_Ref : ExecutionOccurrence*;
		ToAfter_Ref : GeneralOrdering*;
		ToBefore_Ref : GeneralOrdering*;
	};

	type ExecutionOccurrence : InteractionFragment {
		Start_Ref : EventOccurrence;
		Finish_Ref : EventOccurrence;
		Behavior_Ref : Behavior*;
	};

	type StateInvariant : InteractionFragment {
		Invariant_ContRef : Constraint;
	};

	type Stop : EventOccurrence;

	type TemplateSignature : Element {
		Parameter_Ref : TemplateParameter+;
		OwnedParameter_ContRef : TemplateParameter*;
		NestedSignature_Ref : TemplateSignature*;
		NestingSignature_Ref : TemplateSignature?;
		Template_Ref : TemplateableElement;
	};

	type TemplateParameter : Element {
		Signature_Ref : TemplateSignature;
		ParameteredElement_Ref : ParameterableElement;
		OwnedParameteredElement_ContRef : ParameterableElement?;
		Default_Ref : ParameterableElement?;
		OwnedDefault_ContRef : ParameterableElement?;
	};

	type TemplateableElement : Element {
		TemplateBinding_ContRef : TemplateBinding*;
		OwnedTemplateSignature_ContRef : TemplateSignature?;
	};

	type StringExpression : TemplateableElement {
		SubExpression_ContRef : StringExpression*;
		OwningExpression_Ref : StringExpression?;
	};

	type ParameterableElement : Element {
		TemplateParameter_Ref : TemplateParameter?;
		OwningParameter_Ref : TemplateParameter?;
	};

	type TemplateBinding : DirectedRelationship {
		BoundElement_Ref : TemplateableElement;
		Signature_Ref : TemplateSignature;
		ParameterSubstitution_ContRef : TemplateParameterSubstitution*;
	};

	type TemplateParameterSubstitution : Element {
		Formal_Ref : TemplateParameter;
		TemplateBinding_Ref : TemplateBinding;
		Actual_Ref : ParameterableElement+;
		OwnedActual_ContRef : ParameterableElement*;
	};

	type OperationTemplateParameter : TemplateParameter;

	type ClassifierTemplateParameter : TemplateParameter {
		AllowSubstitutable_Att : Logical;
	};

	type ParameterableClassifier : Classifier;

	type RedefinableTemplateSignature : RedefinableElement, TemplateSignature;

	type TemplateableClassifier : Classifier;

	type ConnectableElementTemplateParameter : TemplateParameter;

	type ForkNode : ControlNode;

	type JoinNode : ControlNode {
		IsCombineDuplicate_Att : Logical;
		JoinSpec_ContRef : ValueSpecification;
	};

	type FlowFinalNode : FinalNode;

	type CentralBufferNode : ObjectNode;

	type ActivityPartition : NamedElement, ActivityGroup {
		IsDimension_Att : Logical;
		IsExternal_Att : Logical;
		ContainedEdge_Ref : ActivityEdge*;
		ContainedNode_Ref : ActivityNode*;
		Subgroup_ContRef : ActivityPartition*;
		SuperPartition_Ref : ActivityPartition?;
		Represents_Ref : Element?;
	};

	type ExpansionNode : ObjectNode {
		RegionAsOutput_Ref : ExpansionRegion?;
		RegionAsInput_Ref : ExpansionRegion?;
	};

	type ExpansionRegion : StructuredActivityNode {
		Mode_Att : ExpansionKind?;
		OutputElement_Ref : ExpansionNode*;
		InputElement_Ref : ExpansionNode+;
	};

	type ExpansionKind {"parallel", "iterative", "stream"};

	type ExceptionHandler : Element {
		ProtectedNode_Ref : ExecutableNode;
		HandlerBody_Ref : ExecutableNode;
		ExceptionInput_Ref : ObjectNode;
		ExceptionType_Ref : Classifier+;
	};

	type InteractionOccurrence : InteractionFragment {
		RefersTo_Ref : Interaction;
		ActualGate_ContRef : Gate*;
		Argument_ContRef : InputPin*;
	};

	type Gate : MessageEnd;

	type PartDecomposition : InteractionOccurrence;

	type InteractionOperand : Namespace, InteractionFragment {
		Guard_ContRef : InteractionConstraint?;
		Fragment_ContRef : InteractionFragment*;
	};

	type InteractionConstraint : Constraint {
		Minint_ContRef : ValueSpecification?;
		Maxint_ContRef : ValueSpecification?;
	};

	type InteractionOperator {"consider", "par", "opt", "loop", "alt", "break", "assert", "strict", "seq", "ignore", "neg", "critical"};

	type CombinedFragment : InteractionFragment {
		InteractionOperator_Att : InteractionOperator?;
		Operand_ContRef : InteractionOperand+;
		CfragmentGate_ContRef : Gate*;
	};

	type Continuation : InteractionFragment {
		Setting_Att : Logical;
	};

	type StateMachine : Behavior {
		Region_ContRef : Region+;
		ConnectionPoint_ContRef : Pseudostate*;
		ExtendedStateMachine_Ref : StateMachine?;
		StateMachine_redefinitionContext_Ref : BehavioredClassifier?;
	};

	type Region : Namespace, RedefinableElement {
		Subvertex_ContRef : Vertex*;
		Transition_ContRef : Transition*;
		StateMachine_Ref : StateMachine?;
		State_Ref : State?;
		ExtendedRegion_Ref : Region?;
	};

	type Pseudostate : Vertex {
		Kind_Att : PseudostateKind?;
	};

	type State : Namespace, RedefinableElement, Vertex {
		IsComposite_Att : Logical;
		IsOrthogonal_Att : Logical;
		IsSimple_Att : Logical;
		IsSubmachineState_Att : Logical;
		Submachine_Ref : StateMachine?;
		Connection_ContRef : ConnectionPointReference*;
		RedefinedState_Ref : State?;
		DeferrableTrigger_Ref : Trigger*;
		Region_ContRef : Region*;
		Entry_ContRef : Activity?;
		Exit_ContRef : Activity?;
		DoActivity_ContRef : Activity?;
		StateInvariant_ContRef : Constraint?;
	};

	type Vertex : NamedElement {
		Container_Ref : Region?;
		Outgoing_Ref : Transition*;
		Incoming_Ref : Transition*;
	};

	type ConnectionPointReference : Vertex {
		Entry_Ref : Pseudostate*;
		Exit_Ref : Pseudostate*;
	};

	type Transition : RedefinableElement {
		Kind_Att : TransitionKind?;
		Container_Ref : Region;
		Source_Ref : Vertex;
		Target_Ref : Vertex;
		RedefinedTransition_Ref : Transition?;
		Trigger_Ref : Trigger*;
		Guard_ContRef : Constraint?;
		Effect_ContRef : Activity?;
	};

	type TransitionKind {"internal", "local", "external"};

	type PseudostateKind {"deepHistory", "shallowHistory", "choice", "join", "exitPoint", "terminate", "fork", "junction", "initial", "entryPoint"};

	type FinalState : State;

	type CreateObjectAction : Action {
		Classifier_Ref : Classifier;
		Result_ContRef : OutputPin;
	};

	type DestroyObjectAction : Action {
		IsDestroyLinks_Att : Logical;
		IsDestroyOwnedObjects_Att : Logical;
		Target_ContRef : InputPin;
	};

	type TestIdentityAction : Action {
		First_ContRef : InputPin;
		Second_ContRef : InputPin;
		Result_ContRef : OutputPin;
	};

	type ReadSelfAction : Action {
		Result_ContRef : OutputPin;
	};

	type StructuralFeatureAction : Action {
		StructuralFeature_Ref : StructuralFeature;
		Object_ContRef : InputPin;
	};

	type ReadStructuralFeatureAction : StructuralFeatureAction {
		Result_ContRef : OutputPin;
	};

	type WriteStructuralFeatureAction : StructuralFeatureAction {
		Value_ContRef : InputPin;
	};

	type ClearStructuralFeatureAction : StructuralFeatureAction;

	type RemoveStructuralFeatureValueAction : WriteStructuralFeatureAction;

	type AddStructuralFeatureValueAction : WriteStructuralFeatureAction {
		IsReplaceAll_Att : Logical;
		InsertAt_ContRef : InputPin?;
	};

	type LinkAction : Action {
		EndData_ContRef : LinkEndData#2 ..;
	};

	type LinkEndData : Element {
		Value_Ref : InputPin?;
		End_Ref : Property;
		Qualifier_ContRef : QualifierValue*;
	};

	type ReadLinkAction : LinkAction {
		Result_ContRef : OutputPin;
	};

	type LinkEndCreationData : LinkEndData {
		IsReplaceAll_Att : Logical;
		InsertAt_Ref : InputPin?;
	};

	type CreateLinkAction : WriteLinkAction;

	type WriteLinkAction : LinkAction;

	type DestroyLinkAction : WriteLinkAction;

	type ClearAssociationAction : Action {
		Object_ContRef : InputPin;
		Association_Ref : Association;
	};

	type VariableAction : Action {
		Variable_Ref : Variable;
	};

	type ReadVariableAction : VariableAction {
		Result_ContRef : OutputPin;
	};

	type WriteVariableAction : VariableAction {
		Value_ContRef : InputPin;
	};

	type ClearVariableAction : VariableAction;

	type AddVariableValueAction : WriteVariableAction {
		IsReplaceAll_Att : Logical;
		InsertAt_ContRef : InputPin?;
	};

	type RemoveVariableValueAction : WriteVariableAction;

	type ApplyFunctionAction : Action {
		Function_Ref : PrimitiveFunction;
		Argument_ContRef : InputPin*;
		Result_ContRef : OutputPin*;
	};

	type PrimitiveFunction : PackageableElement {
		Body_Att : Text;
		Language_Att : Text;
	};

	type CallAction : InvocationAction {
		IsSynchronous_Att : Logical;
		Result_ContRef : OutputPin*;
	};

	type InvocationAction : Action {
		Argument_ContRef : InputPin*;
		OnPort_Ref : Port?;
	};

	type SendSignalAction : InvocationAction {
		Target_ContRef : InputPin;
		Signal_Ref : Signal;
	};

	type BroadcastSignalAction : InvocationAction {
		Signal_Ref : Signal;
	};

	type SendObjectAction : InvocationAction {
		Target_ContRef : InputPin;
		Request_ContRef : InputPin;
	};

	type CallOperationAction : CallAction {
		Operation_Ref : Operation;
		Target_ContRef : InputPin;
	};

	type CallBehaviorAction : CallAction {
		Behavior_Ref : Behavior;
	};

	type TimeExpression : ValueSpecification {
		FirstTime_Att : Logical;
		Event_Ref : NamedElement?;
	};

	type Duration : ValueSpecification {
		FirstTime_Att : Logical;
		Event_Ref : NamedElement#0 .. 2;
	};

	type TimeObservationAction : WriteStructuralFeatureAction {
		Now_ContRef : TimeExpression*;
	};

	type DurationInterval : Interval;

	type Interval : ValueSpecification {
		Min_Ref : ValueSpecification*;
		Max_Ref : ValueSpecification*;
	};

	type TimeConstraint : IntervalConstraint;

	type IntervalConstraint : Constraint;

	type TimeInterval : Interval;

	type DurationObservationAction : WriteStructuralFeatureAction {
		Duration_ContRef : Duration*;
	};

	type DurationConstraint : IntervalConstraint;

	type DataStoreNode : CentralBufferNode;

	type ParameterEffectKind {"update", "read", "delete", "create"};

	type InterruptibleActivityRegion : ActivityGroup {
		InterruptingEdge_Ref : ActivityEdge*;
		ContainedNode_Ref : ActivityNode*;
	};

	type ObjectNodeOrderingKind {"FIFO", "unordered", "ordered", "LIFO"};

	type ParameterSet : NamedElement {
		Parameter_Ref : Parameter+;
		Condition_ContRef : Constraint*;
	};

	type Component : Class {
		IsIndirectlyInstantiated_Att : Logical;
		Required_Ref : Interface*;
		Provided_Ref : Interface*;
		Realization_ContRef : Realization*;
		OwnedMember_ContRef : PackageableElement*;
	};

	type ConnectorKind {"delegation", "assembly"};

	type Deployment : Dependency {
		DeployedArtifact_Ref : DeployedArtifact*;
		Location_Ref : DeploymentTarget;
		Configuration_ContRef : DeploymentSpecification*;
	};

	type DeployedArtifact : NamedElement;

	type DeploymentTarget : NamedElement {
		Deployment_ContRef : Deployment*;
		DeployedElement_Ref : PackageableElement*;
	};

	type Node : Class, DeploymentTarget {
		NestedNode_ContRef : Node*;
	};

	type Device : Node;

	type ExecutionEnvironment : Node;

	type CommunicationPath : Association;

	type ProtocolConformance : DirectedRelationship {
		SpecificMachine_Ref : ProtocolStateMachine;
		GeneralMachine_Ref : ProtocolStateMachine;
	};

	type ProtocolStateMachine : StateMachine {
		Conformance_ContRef : ProtocolConformance*;
	};

	type ProtocolTransition : Transition {
		PostCondition_ContRef : Constraint?;
		Referred_Ref : Operation*;
		PreCondition_Ref : Constraint?;
	};

	type ReadExtentAction : Action {
		Result_ContRef : OutputPin;
		Classifier_Ref : Classifier;
	};

	type ReclassifyObjectAction : Action {
		IsReplaceAll_Att : Logical;
		OldClassifier_Ref : Classifier*;
		NewClassifier_Ref : Classifier*;
		Object_ContRef : InputPin;
	};

	type ReadIsClassifiedObjectAction : Action {
		IsDirect_Att : Logical;
		Classifier_Ref : Classifier;
		Result_ContRef : OutputPin;
		Object_ContRef : InputPin;
	};

	type StartOwnedBehaviorAction : Action {
		Object_ContRef : InputPin;
	};

	type QualifierValue : Element {
		Qualifier_Ref : Property;
		Value_Ref : InputPin;
	};

	type ReadLinkObjectEndAction : Action {
		Object_ContRef : InputPin;
		End_Ref : Property;
		Result_ContRef : OutputPin;
	};

	type ReadLinkObjectEndQualifierAction : Action {
		Object_ContRef : InputPin;
		Result_ContRef : OutputPin;
		Qualifier_Ref : Property;
	};

	type CreateLinkObjectAction : CreateLinkAction {
		Result_ContRef : OutputPin;
	};

	type AcceptEventAction : Action {
		Trigger_Ref : Trigger*;
		Result_Ref : OutputPin*;
	};

	type AcceptCallAction : AcceptEventAction {
		ReturnInformation_Ref : OutputPin;
	};

	type ReplyAction : Action {
		ReplyToCall_Ref : CallTrigger;
		ReplyValue_Ref : InputPin*;
		ReturnInformation_Ref : InputPin;
	};

	type RaiseExceptionAction : Action {
		Exception_Ref : InputPin;
	};

	type DeploymentSpecification : Artifact {
		DeploymentLocation_Att : Text;
		ExecutionLocation_Att : Text;
	};
}