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

	type Activity : UEMLObject {
		ResourceRole_Ref : ResourceRole*;
		Parent_Ref : Process?;
		HasOutput_Ref : OutputPort;
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
	};

	type MaterialResource : Resource;

	type HumanResource : Resource;

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

	type Anchor : Port {
		Target_Ref : AssociationConnector;
		Origin_Ref : AssociationConnector;
	};

	type OutputPort : Anchor {
		Activity_Ref : Activity;
	};

	type InputPort : Anchor;

	type ConnectionOperator : Anchor;

	type AssociationConnector {
		Origin_Ref : Anchor*;
		Target_Ref : Anchor*;
		ClassAssociation_Ref : Flow;
	};

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

	type Contract {
		Process_Ref : Process+;
		Agent_Ref : Agent#2 ..;
		Collection_of_ContRef : Commitment+;
	};

	type Task : Activity {
		Fulfills_Ref : Commitment*;
	};

	type Commitment {
		Task_Ref : Task;
		AgentO_Ref : Agent;
		AgentC_Ref : Agent;
		Contract_Ref : Contract;
	};
}