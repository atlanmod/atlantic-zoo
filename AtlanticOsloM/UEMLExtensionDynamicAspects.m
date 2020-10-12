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

	type Task : Activity;

	type FlowObject {
		Target_Ref : AssociationConnector;
		Origin_Ref : AssociationConnector;
	};

	type Event : FlowObject;

	type Process {
		Child_ContRef : Activity*;
	};
}