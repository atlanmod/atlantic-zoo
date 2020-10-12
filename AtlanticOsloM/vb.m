module Fr {

	type @[Obeo.Psm.Vb.Resources.LocatedElement] {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type @[Obeo.Psm.Vb.Resources.VB_LangElement] : @[Obeo.Psm.Vb.Resources.LocatedElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Content] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		HasVersion_Att : Logical;
		Version_Att : Text;
		HasClass_Att : Logical;
		HasBeginEnd_Att : Logical;
		BeginEndGlobalVariables_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_GlobalVariable]*;
		GlobalVariables_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_GlobalVariable]*;
		Elements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_GlobalVariable] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Name_Att : Text;
		Value_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]+;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_FileAttribute] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Name_Att : Text;
		InitialValue_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]+;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Option] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Name_Att : Text;
		HasEnablement_Att : Logical;
		Enablement_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.EnablementEnum]?;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Imports] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Imports_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Implements] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Implements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Assembly] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Call_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Call];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Class] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement], @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Type] {
		IsFriend_Att : Logical;
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		Name_Att : Text;
		HasInherits_Att : Logical;
		Inherits_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef]?;
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Module] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Name_Att : Text;
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Type] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Data] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_SimpleType] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		Name_Att : Text;
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Enum] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum];
		Name_Att : Text;
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Preprocessing.VB_PreprocIf] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement] {
		Condition_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Data], @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Region] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		Name_Att : Text;
		Features_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Sub] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		HasAnnotation_Att : Logical;
		Annotation_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Call]?;
		IsFriend_Att : Logical;
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		IsOverloads_Att : Logical;
		IsOverrides_Att : Logical;
		Name_Att : Text;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		HasHandles_Att : Logical;
		Handles_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef]*;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Function] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		IsFriend_Att : Logical;
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		Name_Att : Text;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		Return_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef]?;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_DeclareFunction] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		IsAuto_Att : Logical;
		Name_Att : Text;
		Lib_Att : Text;
		IsAlias_Att : Logical;
		Alias_Att : Text;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		Return_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_DeclareSub] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		IsAuto_Att : Logical;
		Name_Att : Text;
		Lib_Att : Text;
		IsAlias_Att : Logical;
		Alias_Att : Text;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Data] {
		IsOptional_Att : Logical;
		HasQualifier_Att : Logical;
		Qualifier_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.QualifierEnum]?;
		Name_Att : Text;
		IsArray_Att : Logical;
		ArrayExpression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]?;
		HasType_Att : Logical;
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef]?;
		HasInitialValue_Att : Logical;
		Value_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]?;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Property] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum];
		IsShared_Att : Logical;
		IsGetOnly_Att : Logical;
		IsSet_Att : Logical;
		IsLet_Att : Logical;
		Name_Att : Text;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef]?;
		Modifiers_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Modifier]*;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Modifier] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Set] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Modifier] {
		HasParameters_Att : Logical;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Get] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Modifier] {
		HasParameters_Att : Logical;
		Parameters_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Parameter]*;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Attribute] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Feature] {
		HasVisibility_Att : Logical;
		Visibility_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum]?;
		HasQualifier_Att : Logical;
		Qualifier_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.Qualifier_2Enum]?;
		IsFriend_Att : Logical;
		IsWithEvents_Att : Logical;
		IsShared_Att : Logical;
		Name_Att : Text;
		IsArray_Att : Logical;
		ArrayExpressions_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]*;
		HasType_Att : Logical;
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]?;
		HasInitialValue_Att : Logical;
		InitialValue_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]?;
		HasNext_Att : Logical;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalElement] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_ContentElement], @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Data] {
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
		Name_Att : Text;
		Fields_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalField]*;
		Children_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalElement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalField] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalPropertySet] : @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalField] {
		Name_Att : Text;
		HasArguments_Att : Logical;
		Arguments_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]*;
		HasBrackets_Att : Logical;
		Fields_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalField]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalProperty] : @[Obeo.Psm.Vb.Projects.VB_1.Core.VB_Data], @[Obeo.Psm.Vb.Projects.VB_1.Graphicals.VB_GraphicalField] {
		Property_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullDataRef];
		Value_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement] : @[Obeo.Psm.Vb.Projects.VB_1.Features.VB_Modifier];

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Call] : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement] {
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullDataRef];
		Arguments_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallArgument]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallArgument] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallEmptyArgument] : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallArgument];

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallExpressionArgument] : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallArgument] {
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
		HasSeparator_Att : Logical;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Case] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Values_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]+;
		HasSeparator_Att : Logical;
		Statements_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_RawBody] : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_Statement] {
		Value_Att : Text;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] : @[Obeo.Psm.Vb.Resources.VB_LangElement];

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_AssignmentExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Variable_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullDataRef];
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_TypeOfExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Variable_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullDataRef];
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_OperatorExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		LeftHand_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
		RightHand_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
		OperatorName_Att : Text;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_NewExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Type_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef];
		HasArguments_Att : Logical;
		Arguments_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]*;
		HasInitialization_Att : Logical;
		Initializations_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_NotExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_NegativeExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_ParenthesisExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Expression_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_TabValuesExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Arguments_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression]*;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_ByValExpression] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Value_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Value] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression];

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_NegativeValue] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Value] {
		Value_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Value];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_VariableSystem] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Value] {
		Name_Att : @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.NameEnum];
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Value] {
		Value_Att : Text;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal_Literal] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal];

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal_Number] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal];

	type @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal_Value] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Literal];

	type @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullTypeRef] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Members_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_TypeRef]+;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.References.VB_TypeRef] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Type_Ref : @[Obeo.Psm.Vb.Resources.VB_LangElement];
		TypeValue_Att : Text;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.References.VB_FullDataRef] : @[Obeo.Psm.Vb.Projects.VB_1.Expressions.VB_Expression] {
		Self_Att : Logical;
		Members_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_DataRef]+;
		HasRecSet_Att : Logical;
		RecSetMember_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.References.VB_DataRef]?;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.References.VB_DataRef] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Data_Ref : @[Obeo.Psm.Vb.Resources.VB_LangElement];
		DataValue_Att : Text;
		HasArguments_Att : Logical;
		Arguments_ContRef : @[Obeo.Psm.Vb.Projects.VB_1.Statements.VB_CallArgument]*;
		HasRefMarker_Att : Logical;
		HasSubMarker_Att : Logical;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.References.VB_LabelRef] : @[Obeo.Psm.Vb.Resources.VB_LangElement] {
		Label_Ref : @[Obeo.Psm.Vb.Resources.VB_LangElement];
		LabelValue_Att : Text;
	};

	type @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.EnablementEnum] {"Off", "On"};

	type @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.VisibilityEnum] {"private", "protected", "public"};

	type @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.QualifierEnum] {"byRef", "byVal"};

	type @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.Qualifier_2Enum] {"static", "const", "dim"};

	type @[Obeo.Psm.Vb.Projects.VB_1.Enumerations.NameEnum] {"trueLit", "falseLit", "nothing"};
}