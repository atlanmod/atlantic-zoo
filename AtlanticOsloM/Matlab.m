module Matlab {

	type Matlab {
		Model_ContRef : Model*;
	};

	type BlockDefaults {
		BlockDefaults_Att : Text;
		Model_Ref : Model;
	};

	type Model {
		Name_Att : Text;
		Matlab_Ref : Matlab;
		AnnotationDefaults_ContRef : AnnotationDefaults*;
		System_ContRef : System*;
		BlockDefaults_ContRef : BlockDefaults*;
		LineDefaults_ContRef : LineDefaults*;
		Simulink_Ref : Simulink;
	};

	type AnnotationDefaults {
		AnnotationDefaults_Att : Text;
		Model_Ref : Model;
	};

	type LineDefaults {
		LineDefaults_Att : Text;
		Model_Ref : Model;
	};

	type System {
		Name_Att : Text;
		Blocks_ContRef : Block*;
		Lines_ContRef : Line*;
		Annotations_ContRef : Annotation*;
		Model_Ref : Model;
		ParentSubsystem_Ref : Subsystem;
	};

	type Subsystem : Block {
		System_ContRef : System;
	};

	type Block : BlockDefaults {
		Name_Att : Text;
		BlockType_Att : Text;
		Description_Att : Text;
		Priority_Att : Text;
		Tag_Att : Text;
		Position_Att : Text;
		MySystem_Ref : System;
		Ports_ContRef : Port*;
	};

	type Annotation : AnnotationDefaults {
		Position_Att : Text;
		Text_Att : Text;
		System_Ref : System;
	};

	type Line : LineDefaults {
		Points_Att : Text;
		Id_Att : Text;
		SrcPort_Ref : OutputPort?;
		System_Ref : System;
	};

	type DirectLine : Line {
		DestPort1_Ref : InputPort?;
	};

	type InputPort : Port {
		OwningDirectLine_Ref : DirectLine?;
		OwningDirectBranch_Ref : DirectBranch?;
	};

	type Branch {
		Points_Att : Text;
		BranchedLine_Ref : BranchedLine;
		NestedBranch_Ref : NestedBranch;
	};

	type BranchedLine : Line {
		Branchs_ContRef : Branch*;
	};

	type Primitive : Block {
		Id_Att : Text;
		Parameters_ContRef : Parameter*;
		RefPort_Ref : Port?;
	};

	type Port {
		Id_Att : Text;
		Number_Att : Text;
		PortBlock_Ref : Block;
		Primitive_Ref : Primitive?;
	};

	type Reference : Block {
		SourceType_Att : Text;
		SourceBlock_Att : Text;
		Parameters_ContRef : Parameter*;
	};

	type Masked : Subsystem;

	type Normal : Subsystem;

	type Parameter {
		Name_Att : Text;
		Le_reference_Ref : Reference;
		Primitive_Ref : Primitive;
	};

	type OutputPort : Port {
		OwningLine_Ref : Line?;
	};

	type Type : Parameter {
		Value_Att : Text;
	};

	type Double : Parameter {
		Value_Att : Text;
	};

	type INteger : Parameter {
		Value_Att : Text;
	};

	type Enumeration : Parameter {
		Value_Att : Text;
	};

	type BOolean : Parameter {
		Value_Att : TrueFalse;
	};

	type TrueFalse {"True", "False"};

	type Text : Parameter {
		Value_Att : Text;
	};

	type Vector : Parameter {
		Value_Att : Text;
	};

	type DirectBranch : Branch {
		Id_Att : Text;
		DestPort_Ref : InputPort?;
	};

	type NestedBranch : Branch {
		Branchs_ContRef : Branch*;
	};

	type Machine {
		Name_Att : Text;
		Id_Att : Text;
		Events_ContRef : Event*;
		Data_ContRef : Data*;
		Instances_ContRef : Instance*;
		Targets_ContRef : Target*;
		StateFlow_Ref : StateFlow;
	};

	type Junction {
		_id_Att : Text;
		Id_Att : Text;
		Type_Att : Text;
		Position_Att : Text;
		State_Ref : State;
		Chart_Ref : Chart;
	};

	type Transition {
		_id_Att : Text;
		DataLimites_Att : Text;
		Id_Att : Text;
		Trigger_Att : Text;
		Condition_Att : Text;
		ConditionAction_Att : Text;
		Action_Att : Text;
		Chart_Ref : Chart;
		State_Ref : State;
	};

	type Event {
		Name_Att : Text;
		Id_Att : Text;
		Scope_Att : Text;
		Description_Att : Text;
		Trigger_Att : Text;
		Machine_Ref : Machine;
		Chart_Ref : Chart;
		State_Ref : State;
	};

	type Data {
		Name_Att : Text;
		Id_Att : Text;
		Scope_Att : Text;
		Description_Att : Text;
		Units_Att : Text;
		DataType_Att : Text;
		Props_ContRef : Props*;
		State_Ref : State;
		Chart_Ref : Chart;
		Machine_Ref : Machine;
	};

	type Instance {
		_id_Att : Text;
		Id_Att : Text;
		Name_Att : Text;
		Machine_Ref : Machine;
	};

	type Target {
		Name_Att : Text;
		Id_Att : Text;
		CodeCommand_Att : Text;
		Description_Att : Text;
		MakeCommand_Att : Text;
		CodeFlags_Att : Text;
		ChecksumOld_Att : Text;
		Machine_Ref : Machine;
	};

	type Chart {
		Name_Att : Text;
		Id_Att : Text;
		_id_Att : Text;
		Decomposotion_Att : Text;
		UpdateMethode_Att : Text;
		SampleTime_Att : Text;
		Junctions_ContRef : Junction*;
		Events_ContRef : Event*;
		Transitions_ContRef : Transition*;
		Data_ContRef : Data*;
		States_ContRef : State*;
	};

	type State {
		Name_Att : Text;
		Id_Att : Text;
		_id_Att : Text;
		Type_Att : Text;
		EntryAction_Att : Text;
		ExitAction_Att : Text;
		DuringAction_Att : Text;
		EventActions_Att : Text;
		Decomposition_Att : Text;
		Position_Att : Text;
		Junctions_ContRef : Junction*;
		Events_ContRef : Event*;
		Transitions_ContRef : Transition*;
		Data_ContRef : Data*;
		Chart_Ref : Chart;
		States_ContRef : State*;
	};

	type Props {
		InitialValue_Att : Text;
		Arrays_ContRef : Array*;
		Ranges_ContRef : Range*;
		Data_Ref : Data;
	};

	type Range {
		Maximum_Att : Text;
		Minimum_Att : Text;
		Props_Ref : Props;
	};

	type Array {
		FirstIndex_Att : Text;
		Size_Att : Text;
		Props_Ref : Props;
	};

	type StateFlow {
		StateFlow_Att : Text;
		Machines_ContRef : Machine*;
		Simulink_Ref : Simulink;
	};

	type TransitionTerminal {
		_id_Att : Text;
	};

	type Simulink {
		Simulink_Att : Text;
		StateFlows_ContRef : StateFlow*;
		Models_ContRef : Model*;
	};
}