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
		Child_ContRef : Activity*;
		Parent_Ref : Activity?;
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

	type Anchor : Port {
		Target_Ref : AssociationConnector;
		Origin_Ref : AssociationConnector;
	};

	type OutputPort : Anchor {
		Activity_Ref : Activity;
	};

	type InputPort : Anchor {
		Activity_Ref : Activity;
	};

	type ConnectionOperator : Anchor;

	type AssociationConnector {
		Origin_Ref : Anchor*;
		Target_Ref : Anchor*;
		ClassAssociation_Ref : Flow;
	};

	type PassiveObject : Resource;

	type Commitment : PassiveObject {
		Resource_Ref : Resource+;
	};

	type Contract : PassiveObject;

	type Agent : Resource;

	type Software : Agent;

	type Organisation : Agent;
}