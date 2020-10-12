module MTRANS {

	type MetaClass;

	type MetaModel;

	type Module {
		Name_Att : Text;
		Mode_Att : Text;
		MetaDest_Ref : MetaModel*;
		MetaSource_Ref : MetaModel*;
		Rules_ContRef : Rule+;
	};

	type Rule {
		IsAbstract_Att : Logical;
		IsEntryPoint_Att : Logical;
		Name_Att : Text;
		Module_Ref : Module;
		Target_Ref : MetaClass?;
		Source_Ref : MetaClass?;
		Declaration_ContRef : Variable?;
		Sections_ContRef : Section+;
		Guard_ContRef : Expression?;
		Inheritances_ContRef : Inheritance*;
	};

	type Inheritance {
		Rule_Ref : Rule;
		Expressions_ContRef : Expression*;
		InheritedRules_Ref : Rule*;
	};

	type Expression {
		Operator_Att : Text;
		Inheritance_Ref : Inheritance;
		Rule_Ref : Rule;
		Instruction_Ref : Instruction;
	};

	type Section {
		Kind_Att : Text;
		Rule_Ref : Rule;
		Instructions_ContRef : Instruction+;
	};

	type Instruction {
		Body_ContRef : Expression;
		Section_Ref : Section;
	};

	type Variable {
		Name_Att : Text;
		Rule_Ref : Rule;
	};
}