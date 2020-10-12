module UEML {

	type UEMLObject {
		Has_Ref : Geometry?;
		Model_Ref : UEMLModel?;
	};

	type UEMLModel : UEMLObject {
		Contains_ContRef : UEMLObject*;
	};

	type Geometry {
		Object_Ref : UEMLObject;
	};

	type Port : UEMLObject;

	type Flow : UEMLObject {
		AssociationConnector_Ref : AssociationConnector;
	};

	type Activity : UEMLObject, FlowObject {
		ResourceRole_Ref : ResourceRole*;
		Parent_Ref : Process?;
		HasOutput_ContRef : OutputPort+;
		HasInput_ContRef : InputPort+;
		ActivityType_Ref : ActivityType;
	};

	type Object : UEMLObject {
		IoFlow_Ref : IOFlow?;
	};

	type InformationObject : Object {
		ControlFlow_Ref : ControlFlow?;
	};

	type Resource : Object {
		Carries_Ref : ResourceFlow?;
		Plays_Ref : ResourceRole*;
		ResourceType_Ref : ResourceType;
		Commitment_Ref : Commitment*;
	};

	type MaterialResource : PassiveObject;

	type HumanResource : Agent;

	type ResourceFlow : Flow {
		ResourceCarries_Ref : Resource*;
	};

	type IOFlow : Flow {
		Carries_Ref : Object*;
	};

	type ControlFlow : Flow {
		Carries_Ref : InformationObject*;
	};

	type TriggerFlow : ControlFlow;

	type ConstraintFlow : ControlFlow;

	type ResourceRole : Port {
		ResourcePlays_Ref : Resource*;
		RoleQualifier_Ref : RoleType?;
		In_Ref : Activity;
	};

	type RoleType;

	type Anchor : Port;

	type OutputPort : Anchor {
		Activity_Ref : Activity;
	};

	type InputPort : Anchor {
		Activity_Ref : Activity;
	};

	type ConnectionOperator : Anchor, FlowObject;

	type AssociationConnector {
		Origin_Ref : FlowObject*;
		Target_Ref : FlowObject*;
		ClassAssociation_Ref : Flow;
	};

	type FlowObject {
		Target_Ref : AssociationConnector;
		Origin_Ref : AssociationConnector;
	};

	type Event : FlowObject;

	type ResourceType {
		Resource_Ref : Resource*;
	};

	type ActivityType {
		ActivityT_Ref : Activity*;
	};

	type PassiveObject : Resource;

	type Commitment : PassiveObject {
		Resource_Ref : Resource+;
		Task_Ref : Task;
		AgentO_Ref : Agent;
		AgentC_Ref : Agent;
		Contract_Ref : Contract;
	};

	type Software : Agent;

	type Organisation : Agent;

	type Process : Activity {
		Child_ContRef : Activity;
		Fulfills_Ref : Contract*;
		Realises_Ref : Service;
	};

	type Service : Resource {
		Process_Ref : Process;
	};

	type Agent : Resource {
		Obliger_Ref : Commitment;
		Claimer_Ref : Commitment;
		Has_parties_Ref : Contract;
	};

	type Contract : PassiveObject {
		Process_Ref : Process+;
		Agent_Ref : Agent#2 ..;
		Collection_of_ContRef : Commitment+;
	};

	type Task : Activity {
		Fulfills_Ref : Commitment*;
	};
}