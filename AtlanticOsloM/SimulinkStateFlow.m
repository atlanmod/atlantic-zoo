module SimulinkStateFlow {

	type Simulink {
		SubSystem_ContRef : System*;
	};

	type System {
		Name_Att : Text;
		Simulink_Ref : Simulink;
		Blocks_Ref : Block;
		Lines_Ref : Line;
		SubSystem_ContRef : System*;
	};

	type Connector;

	type Line {
		Name_Att : Text;
		Block_Ref : Block;
		System_Ref : System;
	};

	type BranchPoint : Connector;

	type Port : Connector {
		Units_Att : Units;
	};

	type Block {
		Description_Att : Text;
		Name_Att : Text;
		Priority_Att : Text;
		Natagme_Att : Text;
		BlockType_Att : Text;
		Lines_ContRef : Line*;
		Parameters_ContRef : Parameter*;
		Annotations_ContRef : Annotation*;
		BlockRefs_ContRef : BlockRef*;
		System_Ref : System;
	};

	type BlockRef;

	type Primitive : Block {
		DeadLine_Att : Text;
		Period_Att : Text;
		ExecutionTime_Att : Text;
	};

	type OutPut : Port {
		Number_Att : Integer32;
	};

	type TriggerPort : Port {
		TriggerType_Att : TriggerEnum;
	};

	type EnablePort : Port {
		StatesWhenEnabling_Att : EnableEnum;
	};

	type Reference : Block {
		SourceBlock_Att : Text;
		SourceType_Att : Text;
	};

	type Annotation {
		Text_Att : Text;
		Block_Ref : Block;
	};

	type Parameter {
		Value_Att : Text;
		Block_Ref : Block;
	};

	type Units {"alpha", "beta"};

	type TriggerEnum {"alpha", "beta"};

	type EnableEnum {"alpha", "beta"};
}