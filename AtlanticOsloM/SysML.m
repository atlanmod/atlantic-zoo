module SysML {

	type Entity;

	type NamedElement : Entity {
		Name_Att : Text;
	};

	type Dependency : NamedElement;

	type Conform : Dependency {
		Target_Ref : Viewpoint;
		Source_Ref : View;
	};

	type Package : NamedElement;

	type View : Package {
		ConformsTo_Ref : Viewpoint;
	};

	type Class : Classifier {
		Name_Att : Text;
	};

	type Viewpoint : Class {
		Stakeholders_Att : Text;
		Purpose_Att : Text;
		Concerns_Att : Text;
		Languages_Att : Text;
		Methods_Att : Text;
	};

	type Comment : Entity {
		Content_Att : Text;
	};

	type Rationale : Comment;

	type Problem : Comment;

	type Block : Class {
		IsEncapsulated_Att : Logical;
	};

	type ConstraintBlock : Block;

	type Property : Entity;

	type BlockProperty : Property;

	type ConstraintProperty : BlockProperty;

	type DistributedProperty : BlockProperty;

	type DataType : Entity;

	type ValueType : DataType {
		Unit_Ref : Unit?;
		Dimension_Ref : Dimension?;
	};

	type Unit : ValueType;

	type Dimension : ValueType;

	type ConnectorEnd : Entity;

	type NestedConnectorEnd : ConnectorEnd {
		PropertyPath_ContRef : Property#2 ..;
	};

	type Port : Property {
		IsBehavior_Att : Logical;
	};

	type FlowPort : Port {
		IsAtomic_Att : Logical;
		Direction_Att : FlowDirection?;
		IsConjugated_Att : Logical;
	};

	type FlowProperty : Property {
		Direction_Att : FlowDirection?;
	};

	type Interface : Entity;

	type FlowSpecification : Interface {
		OwnedFlowProperty_ContRef : FlowProperty*;
	};

	type FlowDirection {"in", "out", "inout"};

	type Classifier : Entity;

	type InformationItem : Classifier {
		Represented_Ref : Classifier*;
	};

	type InformationFlow : Entity {
		Conveyed_Ref : Classifier+;
		Source_Ref : NamedElement+;
		Target_Ref : NamedElement+;
	};

	type ItemFlow : InformationFlow {
		ItemProperty_Ref : BlockProperty?;
	};

	type Parameter : Entity;

	type ActivityEdge : Entity;

	type ParameterSet : Entity;

	type Optional : Parameter;

	type Rate : Parameter, ActivityEdge {
		Instance_Ref : InstanceSpecification;
	};

	type InstanceSpecification : Entity;

	type Continous : Rate;

	type Discrete : Rate;

	type Probability : ActivityEdge, ParameterSet {
		Probability_Ref : ValueSpecification;
	};

	type ValueSpecification : Entity;

	type Behavior : Entity;

	type Operation : Entity;

	type ControlOperation : Behavior, Operation;

	type ObjectNode : Entity;

	type NoBuffer : ObjectNode;

	type Overwrite : ObjectNode;

	type Abstraction : Entity;

	type Allocate : Abstraction;

	type Allocated : NamedElement {
		AllocatedFrom_Ref : NamedElement*;
		AllocatedTo_Ref : NamedElement*;
	};

	type ActivityPartition : Entity;

	type AllocateActivityPartition : ActivityPartition;

	type Trace : Entity;

	type DeriveReqt : Trace;

	type Verify : Trace;

	type Copy : Trace;

	type Realization : Entity;

	type Satisfy : Realization;

	type Requirement : Class {
		Text_Att : Text;
		Id_Att : Text;
		Derived_Ref : Requirement*;
		DerivedFrom_Ref : Requirement*;
		SatisfiedBy_Ref : NamedElement*;
		RefinedBy_Ref : NamedElement*;
		TracedTo_Ref : NamedElement*;
		VerifiedBy_Ref : TestCase*;
		Master_Ref : Requirement;
	};

	type TestCase : Behavior, Operation;

	type RequirementRelated : NamedElement {
		Verifies_Ref : Requirement*;
		TracedFrom_Ref : Requirement*;
		Satisfies_Ref : Requirement*;
		Refines_Ref : Requirement*;
	};

	type BasicInterval : DistributedProperty {
		Min_Att : Integer32;
		Max_Att : Integer32;
	};

	type Interval : BasicInterval;

	type Uniform : BasicInterval;

	type Normal : DistributedProperty {
		Mean_Att : Integer32;
		StandardDeviation_Att : Integer32;
	};
}