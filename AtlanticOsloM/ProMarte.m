module MARTE {

	type TimeBase {
		Name_Att : Text;
		Instants_ContRef : Instant*;
	};

	type Instant {
		IsBefore_Att : Logical;
		Owner_Ref : TimeBase;
		TimeValue_Ref : TimeValue;
	};

	type TimeValue {
		DenotedInstant_Ref : Instant*;
		Ref_Ref : TimeBase;
	};

	type TimeInterval {
		EndValues_Ref : TimeValue#2 ..;
		DenotedInterval_Ref : Interval*;
	};

	type Interval {
		IncludingMin_Att : Logical;
		IncludingMax_Att : Logical;
		Base_Ref : TimeBase;
		TimeInterval_Ref : TimeInterval;
		Instants_Ref : Instant*;
	};

	type SingleTimeBase : TimeBase {
		CurrentValue_Ref : SingleTimeValue;
		MaximumValue_Ref : SingleTimeValue?;
		CurrentInstant_Ref : SingleInstant;
	};

	type SingleInstant : Instant {
		CoPoint_Ref : CoincidencePoint;
	};

	type SingleInterval : Interval {
		First_Ref : SingleInstant;
		Last_Ref : SingleInstant;
		Members_Ref : SingleInstant*;
	};

	type SingleTimeValue : TimeValue;

	type SingleTimeInterval : TimeInterval {
		Start_Ref : SingleTimeValue;
		End_Ref : SingleTimeValue;
	};

	type DiscreteTimeBase : TimeBase {
		RefEvent_Ref : Event;
	};

	type DiscreteInstant : Instant {
		Next_Ref : DiscreteInstant?;
		Previous_Ref : DiscreteInstant?;
		RefOcc_Ref : EventOccurence;
	};

	type Event {
		Occ_ContRef : EventOccurence*;
	};

	type EventOccurence;

	type PhysicalTime {
		PhysicalInstants_ContRef : PhysicalInstant*;
	};

	type PhysicalInstant {
		Measurement_Ref : MetricTimeValue*;
	};

	type Duration {
		Start_Ref : PhysicalInstant;
		End_Ref : PhysicalInstant;
		Measurement_Ref : MetricTimeInterval*;
	};

	type MultipleTimeBase : TimeBase {
		Bases_ContRef : SingleTimeBase+;
	};

	type CoincidencePoint : Instant {
		CoincidenceInstants_Ref : SingleInstant+;
	};

	type MultipleInterval : Interval {
		First_Ref : CoincidencePoint+;
		Last_Ref : CoincidencePoint+;
	};

	type MultipleTimeValue : TimeValue {
		Values_Ref : SingleTimeValue+;
	};

	type MetricTimeValue : DiscreteTimeValue;

	type DiscreteTimeValue : TimeValue;

	type MetricTimeInterval : DiscreteTimeInterval;

	type DiscreteTimeInterval : TimeInterval;

	type SimultaneousEventOccurrence {
		At_Ref : Instant;
		Occurence_Ref : TimedEventOccurence#2 ..;
	};

	type TimedEvent {
		Timestamp_Ref : MetricTimeValue+;
	};

	type TimedEventOccurence : EventOccurence {
		At_Ref : Instant;
		Timestamp_Ref : TimeValue;
	};

	type TimedAction : Scenario {
		Duration_Ref : TimeInterval*;
		Start_Ref : TimeValue*;
		End_Ref : TimeValue*;
	};

	type Delay : TimedAction;

	type TimingMechanism {
		Stability_Att : Text;
		Drift_Att : Text;
		Skew_Att : Text;
		Origin_Ref : TimedEvent;
		Resolution_Ref : MetricTimeInterval;
		RefClock_Ref : Clock;
		State_Att : Text;
	};

	type Clock : DiscreteTimeBase, TimingMechanism {
		Accuracy_Ref : MetricTimeInterval;
		Offset_Ref : MetricTimeInterval;
		GeneratedInterrupt_Ref : ClockInterrupt*;
	};

	type Timer : TimingMechanism {
		IsPeriodic_Att : Logical;
		Duration_Ref : MetricTimeValue;
		GenratedTimeOuts_Ref : TimeOut*;
	};

	type TimeOut;

	type ClockInterrupt;

	type System {
		Dimension_Ref : Quantity*;
	};

	type Model {
		Ownes_Ref : ModelElement*;
	};

	type AnnotatedModel : Model {
		ConformsTo_Ref : ModelingConcern+;
		Import_Ref : NFPLibrary*;
	};

	type ModelElement {
		Owner_Ref : Model;
	};

	type AnnotatedModelElement : ModelElement {
		Annotation_Ref : NFP*;
	};

	type NFP {
		MeasurementQuantity_Ref : Quantity;
		StoredBy_Ref : NFPLibrary*;
		GroupedBy_Ref : NFPCategory;
	};

	type NFPLibrary {
		RefersTo_Ref : NFPLibrary*;
		UsedNFP_Ref : NFP*;
	};

	type NFPCategory {
		SetOf_ContRef : NFP+;
		Ownes_Ref : NFPCategory*;
		Owner_Ref : NFPCategory?;
	};

	type ModelingConcern {
		RelevantQuantity_Ref : Quantity*;
		AnnotedModel_Ref : AnnotatedModel;
	};

	type AnalysisConcern : ModelingConcern;

	type DesignConcern : ModelingConcern;

	type Quantity;

	type BasicQuantity;

	type DerivedQuantity;

	type QualitativeNFP : NFP {
		Parameter_Ref : NFP*;
	};

	type QuantitativeNFP : NFP {
		SampleSet_ContRef : Realization*;
		Measure_ContRef : Measure*;
	};

	type Realization {
		Function_Ref : Measure*;
		Owner_Ref : QuantitativeNFP;
	};

	type Measure {
		AppliesTo_Ref : Realization+;
		Owner_Ref : QuantitativeNFP;
	};

	type ComplexNFP : NFP {
		Parent_Ref : ComplexNFP*;
		Child_Ref : ComplexNFP*;
		Ownes_ContRef : BasicNFP+;
	};

	type BasicNFP {
		StatisticalQualifier_Att : StatisticalQualifierKinds;
		Directon_Att : DirectionKinds;
		TypedBy_Ref : NFPType;
		ValuedBy_Ref : NFPValueSpecification*;
		DimensionOf_ContRef : ComplexNFP*;
	};

	type NFPType {
		ValueSpecificationLanguage_Att : Text;
		Source_Att : SourceKinds?;
		ConstrainedSpec_Ref : NFPValueSpecification*;
	};

	type NFPInstantType : NFPType {
		Value_Att : Text;
		Unit_Att : InstantUnitKinds?;
	};

	type NFPurationType : NFPType {
		Value_Att : Text;
		Unit_Att : DurationUnitKinds?;
	};

	type NFPRateType : NFPType {
		Value_Att : Text;
		Unit_Att : RateUnitKinds?;
	};

	type NFPProbabilityType : NFPType {
		Value_Att : Text;
		Unit_Att : ProbabilityUnitKinds?;
	};

	type NFPSizeType : NFPType {
		Value_Att : Text;
		Unit_Att : SizeUnitKinds?;
	};

	type NFPValueSpecification {
		ConstrainedBy_Ref : NFPType*;
		Expression_Ref : NFPExpression?;
	};

	type NFPConstant : NFPValueSpecification {
		OwnerList_Ref : NFPListConstant?;
	};

	type NFPListConstant : NFPConstant {
		ListElements_Ref : NFPConstant*;
	};

	type NFPStringConstant : NFPConstant {
		Body_Att : Text;
	};

	type NFPIntegerConstant : NFPConstant {
		Body_Att : Integer32;
	};

	type NFPRealConstant : NFPConstant {
		BodyBeforeComa_Att : Integer32;
		BodyAfterComa_Att : Integer32;
	};

	type NFPBooleanConstant : NFPConstant {
		Body_Att : Logical;
	};

	type NFPVariable : NFPValueSpecification {
		VarName_Att : Text;
	};

	type NFPExpression : NFPValueSpecification {
		Body_Att : Text;
		Operand_ContRef : NFPValueSpecification*;
	};

	type SourceKinds {"est", "meas", "req", "implicit", "calc"};

	type DirectionKinds {"increasing", "decreasing", "undefined"};

	type StatisticalQualifierKinds {"max", "min", "range", "mean", "variance", "standardDeviation", "percentil", "frequency", "moment", "distribution", "instantaneous"};

	type InstantUnitKinds {"TAI", "UT0", "UT1", "UTC", "TT", "TDB", "TCG", "TCB", "Sideral", "Local"};

	type DurationUnitKinds {"ns", "us", "ms", "s", "min", "hrs", "dys", "wks", "mos", "yrs"};

	type RateUnitKinds {"kbs", "MIPS"};

	type ProbabilityUnitKinds {"us", "s"};

	type SizeUnitKinds {"bits", "bytes", "Mb", "MB"};

	type Classifier : AnnotatedModelElement {
		Instances_Ref : InstanceSpecification*;
	};

	type ResourceClassifier : Classifier {
		OfferedService_Ref : ResourceServiceClassifier+;
	};

	type ResourceServiceClassifier : Classifier {
		ResType_Ref : ResourceClassifier;
	};

	type InstanceSpecification : AnnotatedModelElement {
		Type_Ref : Classifier+;
	};

	type ResourceInstanceSpecification : InstanceSpecification {
		OfferedServiceInstance_Ref : ResourceServiceInstanceSpecification+;
	};

	type ResourceServiceInstanceSpecification : InstanceSpecification {
		ResintSpec_Ref : ResourceInstanceSpecification;
	};

	type Hardware {
		Owner_Ref : Hardware;
		ContainH_Ref : Hardware*;
		ContainHL_Ref : HardwareLibrary*;
		ContainHE_Ref : HardwareEntity*;
		DeploymentConfiguration_Ref : HardwareDeployment*;
	};

	type HardwareLibrary {
		Owner_Ref : Hardware;
	};

	type HardwareEntity {
		Owner_Ref : Hardware;
	};

	type HardwareDeployment {
		Owner_Ref : Hardware;
		Contain_Ref : HardwareEntityInstance+;
	};

	type HardwareEntityInstance {
		Owner_Ref : HardwareDeployment;
	};

	type ECUInstance : HardwareEntityInstance {
		ComposedOf_ContRef : ECUGateInstance*;
	};

	type ChannelInstance : HardwareEntityInstance {
		GateInstances_Ref : ECUGateInstance#2 ..;
	};

	type ECUGateInstance {
		Channel_Ref : ChannelInstance;
	};

	type ECU : HardwareEntity {
		Contain_ContRef : ECUGate+;
	};

	type ECUGate {
		Owner_Ref : ECU;
		KindOf_Ref : Channel;
	};

	type Channel {
		Specify_Ref : ECUGate?;
	};

	type AnalysisContext {
		Global_Ref : ComplexNFP*;
		Workload_ContRef : Workload?;
		Behavior_ContRef : Behavior?;
		UsedResources_ContRef : Resource+;
	};

	type Workload {
		Transaction_Ref : Transaction+;
	};

	type Transaction {
		Workload_Ref : Workload+;
		Trigger_ContRef : Trigger+;
		Response_ContRef : Response;
	};

	type Trigger {
		ArrivalPattern_Ref : ComplexNFP;
		Effect_Ref : Response+;
	};

	type Response {
		Efficiency_Ref : ComplexNFP;
		EndToEndLatency_Ref : ComplexNFP;
		Cause_Ref : Trigger+;
		Behavior_Ref : Scenario+;
	};

	type Behavior {
		Scenario_ContRef : Scenario+;
	};

	type Scenario {
		Behavior_Ref : Behavior+;
		ScenarionLatency_Ref : ComplexNFP*;
		Steps_ContRef : Step+;
		Root_Ref : Step;
		EndToEndResponse_Ref : Response;
	};

	type Step : Scenario {
		Predecessor_Ref : Step*;
		Successor_Ref : Step*;
		StepLatency_Ref : ComplexNFP*;
		UsedResourceService_Ref : Service*;
	};

	type Resource;

	type BasicResource : Resource;

	type StructuredResource : Resource {
		BasicResource_ContRef : BasicResource;
	};

	type ProcessingResource : StructuredResource {
		Links_Ref : Link*;
		Components_Ref : Component+;
	};

	type Link;

	type ProcessResource : StructuredResource {
		Components_Ref : Component+;
	};

	type Component {
		Process_Ref : ProcessResource+;
		Interfaces_Ref : Interface+;
	};

	type StructuredComponent : Component;

	type BasicComponent : Component;

	type LogicalResource : StructuredResource;

	type ServerResource : StructuredResource {
		Services_Ref : Service+;
	};

	type Service {
		Resource_Ref : ServerResource;
		Interface_Ref : Interface;
	};

	type Interface {
		Service_Ref : Service;
	};
}