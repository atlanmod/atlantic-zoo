module Pascal {

	type Program {
		Name_Att : Text;
		Variables_ContRef : Variable*;
		Types_ContRef : Type*;
		Procedures_ContRef : Procedure*;
	};

	type Variable {
		Name_Att : Text;
		Program_Ref : Program;
		Procedure_Ref : Procedure;
		Type_Ref : Type;
	};

	type Type {
		Name_Att : Text;
		Program_Ref : Program;
		Variables_Ref : Variable*;
	};

	type Parameter : Variable {
		Procedure_parameter_Ref : Procedure;
	};

	type Instruction {
		Block_Ref : Block;
	};

	type Calculation : Instruction;

	type Control : Instruction;

	type Assignment : Instruction;

	type Block : Instruction {
		Instructions_ContRef : Instruction*;
		Procedure_Ref : Procedure;
		Loop_Ref : Loop;
		Conditional_Ref : Conditional;
	};

	type Conditional : Control {
		Blocks_ContRef : Block#1 .. 2;
	};

	type Loop : Control {
		Block_loop_ContRef : Block;
	};

	type Procedure : Control {
		Name_Att : Text;
		Program_Ref : Program;
		Variables_ContRef : Variable*;
		Parameters_ContRef : Parameter*;
		Block_procedure_ContRef : Block;
	};

	type Function : Procedure {
		ReturnType_Ref : Type;
	};

	type For : Loop;

	type While : Loop;

	type Repeat : Loop;
}