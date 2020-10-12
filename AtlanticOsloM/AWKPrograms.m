module AWKPrograms {

	type AWKProgram {
		Name_Att : Text;
		Input_Ref : File;
		Output_Ref : File;
		Script_Ref : Script;
	};

	type File {
		Name_Att : Text;
		Records_ContRef : Record*;
	};

	type Record {
		R_file_Ref : File;
		Fields_ContRef : Field*;
	};

	type Field {
		Value_Att : Text;
		F_record_Ref : Record;
	};

	type Script {
		Name_Att : Text;
		Rules_ContRef : Rule*;
	};

	type Rule {
		R_script_Ref : Script;
		Pattern_Ref : Pattern;
		Action_Ref : Action;
	};

	type Pattern {
		RegularExpression_Att : Text;
	};

	type Action {
		Instructions_ContRef : Instruction*;
	};

	type Instruction {
		Value_Att : Text;
		I_action_Ref : Action;
	};

	type InitialRule : Rule;

	type FinalRule : Rule;
}