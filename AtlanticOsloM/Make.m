module Make {

	type Makefile {
		Name_Att : Text;
		Comment_ContRef : Comment?;
		Elements_ContRef : Element+;
	};

	type Element {
		Name_Att : Text;
	};

	type Rule : Element {
		Dependencies_ContRef : Dependency*;
		ShellLines_ContRef : ShellLine+;
	};

	type Macro : Element {
		Value_Att : Text;
	};

	type ShellLine {
		Command_Att : Text;
		Display_Att : Logical;
		RuleShellLine_Ref : Rule;
	};

	type Comment {
		Text_Att : Text;
	};

	type Dependency;

	type RuleDep : Dependency {
		Ruledep_Ref : Rule;
	};

	type FileDep : Dependency {
		Name_Att : Text;
	};
}