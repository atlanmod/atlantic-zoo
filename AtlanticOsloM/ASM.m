module MetamodelRoot {

	type @[ASM.LocatedElement] {
		Location_Att : Text;
	};

	type @[ASM.XAsmFile] : @[ASM.LocatedElement];

	type @[ASM.XAsmSpec] : @[ASM.XAsmFile] {
		Asm_ContRef : @[ASM.Asm]+;
	};

	type @[ASM.Asm] : @[ASM.LocatedElement] {
		Signature_ContRef : @[ASM.Signature];
		ReturnType_Att : Text;
		MetaInformation_ContRef : @[ASM.MetaInformation];
		Body_ContRef : @[ASM.Body];
	};

	type @[ASM.Signature] : @[ASM.LocatedElement] {
		IsMain_Att : Logical;
		Name_Att : Text;
		Arguments_ContRef : @[ASM.Argument]*;
	};

	type @[ASM.Argument] : @[ASM.VariableDecl] {
		Type_Att : Text;
	};

	type @[ASM.Body] : @[ASM.XAsmFile] {
		Declarations_ContRef : @[ASM.Declaration]*;
		Initialization_ContRef : @[ASM.Initialization]?;
		Rules_ContRef : @[ASM.Rule]*;
	};

	type @[ASM.MetaInformation] : @[ASM.LocatedElement] {
		UsedAsIn_ContRef : @[ASM.Signature]*;
		UsedAs_Att : @[Enum.AsmType];
		AccessUpdateFunctions_ContRef : @[ASM.AccessUpdateFunction]*;
	};

	type @[ASM.AccessUpdateFunction] : @[ASM.LocatedElement] {
		Type_Att : @[Enum.AccessUpdateType];
		Functions_ContRef : @[ASM.Function]+;
	};

	type @[ASM.Declaration] : @[ASM.LocatedElement];

	type @[ASM.Function] : @[ASM.Declaration], @[ASM.ElementDecl] {
		Parameters_ContRef : @[ASM.Parameter]*;
		ReturnType_Att : Text;
		InitTerm_ContRef : @[ASM.Term]?;
		IsExternal_Att : Logical;
	};

	type @[ASM.Parameter] : @[ASM.LocatedElement] {
		Name_Att : Text;
		Type_Att : Text;
	};

	type @[ASM.Universe] : @[ASM.Declaration] {
		Name_Att : Text;
		Contents_Att : Text;
		SuperUniverses_Ref : @[ASM.Universe]*;
	};

	type @[ASM.Initialization] : @[ASM.LocatedElement] {
		Rules_ContRef : @[ASM.Rule]+;
	};

	type @[ASM.Term] : @[ASM.LocatedElement];

	type @[ASM.Constant] : @[ASM.Term];

	type @[ASM.FunctionOrVariableTerm] : @[ASM.Term] {
		Declaration_Ref : @[ASM.ElementDecl];
		Terms_ContRef : @[ASM.Term]*;
	};

	type @[ASM.OperatorTerm] : @[ASM.Term] {
		OpName_Att : Text;
		LeftExp_ContRef : @[ASM.Term];
		RightExp_ContRef : @[ASM.Term]?;
	};

	type @[ASM.BooleanConstant] : @[ASM.Constant] {
		Value_Att : Logical;
	};

	type @[ASM.IntegerConstant] : @[ASM.Constant] {
		Value_Att : Integer32;
	};

	type @[ASM.StringConstant] : @[ASM.Constant] {
		Value_Att : Text;
	};

	type @[ASM.UndefConstant] : @[ASM.Constant];

	type @[ASM.Rule] : @[ASM.LocatedElement] {
		InSequence_Att : Logical;
	};

	type @[ASM.SkipRule] : @[ASM.Rule];

	type @[ASM.AsmInvocation] : @[ASM.Rule] {
		AsmName_Att : Text;
		Arguments_ContRef : @[ASM.Term]*;
	};

	type @[ASM.UpdateRule] : @[ASM.Rule] {
		Function_ContRef : @[ASM.FunctionOrVariableTerm];
		UpdateTerm_ContRef : @[ASM.Term];
	};

	type @[ASM.ChooseRule] : @[ASM.Rule] {
		ChooseId_ContRef : @[ASM.VariableDecl];
		InSet_ContRef : @[ASM.Universe]?;
		Guard_ContRef : @[ASM.Term]?;
		IfChoosenRules_ContRef : @[ASM.Rule]+;
		IfNotChoosenRule_ContRef : @[ASM.Rule]?;
	};

	type @[ASM.DoForallRule] : @[ASM.Rule] {
		Id_ContRef : @[ASM.VariableDecl];
		InSet_ContRef : @[ASM.Universe]?;
		Condition_ContRef : @[ASM.Term]?;
		DoRule_ContRef : @[ASM.Rule]+;
	};

	type @[ASM.ConditionalRule] : @[ASM.Rule] {
		Condition_ContRef : @[ASM.Term];
		ThenRule_ContRef : @[ASM.Rule]+;
		ElseRule_ContRef : @[ASM.Rule]?;
		ElseIfRule_ContRef : @[ASM.ElseIf]?;
	};

	type @[ASM.ElseIf] : @[ASM.LocatedElement] {
		Condition_ContRef : @[ASM.Term];
		ThenRule_ContRef : @[ASM.Rule]+;
		ElseRule_ContRef : @[ASM.Rule]?;
		ElseIfRule_ContRef : @[ASM.ElseIf]?;
	};

	type @[ASM.ExtendRule] : @[ASM.Rule] {
		Extensions_ContRef : @[ASM.Extension]+;
		Rules_ContRef : @[ASM.Rule]+;
	};

	type @[ASM.ElementDecl] : @[ASM.LocatedElement] {
		Name_Att : Text;
	};

	type @[ASM.VariableDecl] : @[ASM.ElementDecl];

	type @[ASM.Extension] : @[ASM.LocatedElement] {
		Elements_ContRef : @[ASM.VariableDecl]+;
		Universe_ContRef : @[ASM.Universe];
	};

	type @[ASM.ReturnRule] : @[ASM.Rule] {
		Term_ContRef : @[ASM.Term];
	};

	type @[Enum.AccessUpdateType] {"access", "update"};

	type @[Enum.AsmType] {"function", "subasm"};
}