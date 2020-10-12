CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE Integ (
	__IDInteg__ Integer NOT NULL,
	val Integer,
	PRIMARY KEY Integ (__IDInteg__)
) ;

CREATE TABLE Floa (
	__IDFloa__ Integer NOT NULL,
	val "Double",
	PRIMARY KEY Floa (__IDFloa__)
) ;

CREATE TABLE Str (
	__IDStr__ Integer NOT NULL,
	val text,
	PRIMARY KEY Str (__IDStr__)
) ;

CREATE TABLE Ident (
	__IDIdent__ Integer NOT NULL,
	PRIMARY KEY Ident (__IDIdent__)
) ;

CREATE TABLE ValidIdentifier (
	__IDValidIdentifier__ Integer NOT NULL,
	val text,
	PRIMARY KEY ValidIdentifier (__IDValidIdentifier__)
) ;

CREATE TABLE SlotName (
	__IDSlotName__ Integer NOT NULL,
	val text,
	PRIMARY KEY SlotName (__IDSlotName__)
) ;

CREATE TABLE JessVariable (
	__IDJessVariable__ Integer NOT NULL,
	val text,
	PRIMARY KEY JessVariable (__IDJessVariable__)
) ;

CREATE TABLE TemplateExpression (
	__IDTemplateExpression__ Integer NOT NULL,
	FOREIGN KEY templateName (__FKtemplateName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY firstSlot (__FKfirstSlot__) REFERENCES SlotOp (__IDSlotOp__),
	PRIMARY KEY TemplateExpression (__IDTemplateExpression__),
	__FKtemplateName__ Integer,
	__FKfirstSlot__ Integer
) ;

CREATE TABLE SlotOp (
	__IDSlotOp__ Integer NOT NULL,
	FOREIGN KEY slotIdent (__FKslotIdent__) REFERENCES SlotName (__IDSlotName__),
	FOREIGN KEY operator (__FKoperator__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY exp (__FKexp__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SlotOp (__IDSlotOp__),
	__FKslotIdent__ Integer,
	__FKoperator__ Integer,
	__FKexp__ Integer
) ;

CREATE TABLE DefinitionExp (
	__IDDefinitionExp__ Integer NOT NULL,
	PRIMARY KEY DefinitionExp (__IDDefinitionExp__)
) ;

CREATE TABLE GlobalDefinition (
	__IDGlobalDefinition__ Integer NOT NULL,
	PRIMARY KEY GlobalDefinition (__IDGlobalDefinition__)
) ;

CREATE TABLE VarDefinition (
	__IDVarDefinition__ Integer NOT NULL,
	FOREIGN KEY jessVar (__FKjessVar__) REFERENCES JessVariable (__IDJessVariable__),
	FOREIGN KEY eq (__FKeq__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY VarDefinition (__IDVarDefinition__),
	__FKjessVar__ Integer,
	__FKeq__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE FunctionDefinition (
	__IDFunctionDefinition__ Integer NOT NULL,
	FOREIGN KEY funcName (__FKfuncName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	PRIMARY KEY FunctionDefinition (__IDFunctionDefinition__),
	__FKfuncName__ Integer
) ;

CREATE TABLE AdviceDefinition (
	__IDAdviceDefinition__ Integer NOT NULL,
	direction text,
	FOREIGN KEY op (__FKop__) REFERENCES Ident (__IDIdent__),
	PRIMARY KEY AdviceDefinition (__IDAdviceDefinition__),
	__FKop__ Integer
) ;

CREATE TABLE UnDefAdvice (
	__IDUnDefAdvice__ Integer NOT NULL,
	FOREIGN KEY op (__FKop__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY UnDefAdvice (__IDUnDefAdvice__),
	__FKop__ Integer
) ;

CREATE TABLE FactDefinition (
	__IDFactDefinition__ Integer NOT NULL,
	FOREIGN KEY factName (__FKfactName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Str (__IDStr__),
	PRIMARY KEY FactDefinition (__IDFactDefinition__),
	__FKfactName__ Integer,
	__FKdocumentation__ Integer
) ;

CREATE TABLE RuleDefinition (
	__IDRuleDefinition__ Integer NOT NULL,
	FOREIGN KEY ruleName (__FKruleName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Str (__IDStr__),
	FOREIGN KEY "declare" (__FKdeclare__) REFERENCES DeclareRule (__IDDeclareRule__),
	PRIMARY KEY RuleDefinition (__IDRuleDefinition__),
	__FKruleName__ Integer,
	__FKdocumentation__ Integer,
	__FKdeclare__ Integer
) ;

CREATE TABLE DeclareRule (
	__IDDeclareRule__ Integer NOT NULL,
	FOREIGN KEY salience (__FKsalience__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY nodeIndexHash (__FKnodeIndexHash__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY autoFocus (__FKautoFocus__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY noLoop (__FKnoLoop__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	PRIMARY KEY DeclareRule (__IDDeclareRule__),
	__FKsalience__ Integer,
	__FKnodeIndexHash__ Integer,
	__FKautoFocus__ Integer,
	__FKnoLoop__ Integer
) ;

CREATE TABLE ModuleDefinition (
	__IDModuleDefinition__ Integer NOT NULL,
	FOREIGN KEY moduleName (__FKmoduleName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Str (__IDStr__),
	PRIMARY KEY ModuleDefinition (__IDModuleDefinition__),
	__FKmoduleName__ Integer,
	__FKdocumentation__ Integer
) ;

CREATE TABLE QueryDefinition (
	__IDQueryDefinition__ Integer NOT NULL,
	FOREIGN KEY queryName (__FKqueryName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Str (__IDStr__),
	FOREIGN KEY "declare" (__FKdeclare__) REFERENCES DeclareVar (__IDDeclareVar__),
	PRIMARY KEY QueryDefinition (__IDQueryDefinition__),
	__FKqueryName__ Integer,
	__FKdocumentation__ Integer,
	__FKdeclare__ Integer
) ;

CREATE TABLE DeclareVar (
	__IDDeclareVar__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY max (__FKmax__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY DeclareVar (__IDDeclareVar__),
	__FKnode__ Integer,
	__FKmax__ Integer
) ;

CREATE TABLE TemplateDefinition (
	__IDTemplateDefinition__ Integer NOT NULL,
	FOREIGN KEY templateName (__FKtemplateName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Str (__IDStr__),
	FOREIGN KEY declareBloc (__FKdeclareBloc__) REFERENCES DeclareBloc (__IDDeclareBloc__),
	PRIMARY KEY TemplateDefinition (__IDTemplateDefinition__),
	__FKtemplateName__ Integer,
	__FKdocumentation__ Integer,
	__FKdeclareBloc__ Integer
) ;

CREATE TABLE DeclareBloc (
	__IDDeclareBloc__ Integer NOT NULL,
	FOREIGN KEY slotSpecific (__FKslotSpecific__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY backchainReaction (__FKbackchainReaction__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY fromClass (__FKfromClass__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY includeVariable (__FKincludeVariable__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY "order" (__FKorder__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	PRIMARY KEY DeclareBloc (__IDDeclareBloc__),
	__FKslotSpecific__ Integer,
	__FKbackchainReaction__ Integer,
	__FKfromClass__ Integer,
	__FKincludeVariable__ Integer,
	__FKorder__ Integer
) ;

CREATE TABLE ASlotDef (
	__IDASlotDef__ Integer NOT NULL,
	FOREIGN KEY slotName (__FKslotName__) REFERENCES SlotName (__IDSlotName__),
	PRIMARY KEY ASlotDef (__IDASlotDef__),
	__FKslotName__ Integer
) ;

CREATE TABLE SlotDef (
	__IDSlotDef__ Integer NOT NULL,
	PRIMARY KEY SlotDef (__IDSlotDef__)
) ;

CREATE TABLE MultiSlotDef (
	__IDMultiSlotDef__ Integer NOT NULL,
	PRIMARY KEY MultiSlotDef (__IDMultiSlotDef__)
) ;

CREATE TABLE SlotOptions (
	__IDSlotOptions__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	FOREIGN KEY def (__FKdef__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY defaultDyn (__FKdefaultDyn__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY SlotOptions (__IDSlotOptions__),
	__FKtype__ Integer,
	__FKdef__ Integer,
	__FKdefaultDyn__ Integer
) ;

CREATE TABLE UseFuncExp (
	__IDUseFuncExp__ Integer NOT NULL,
	PRIMARY KEY UseFuncExp (__IDUseFuncExp__)
) ;

CREATE TABLE WhileExp (
	__IDWhileExp__ Integer NOT NULL,
	hasDo Boolean,
	FOREIGN KEY boolExp (__FKboolExp__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY WhileExp (__IDWhileExp__),
	__FKboolExp__ Integer
) ;

CREATE TABLE ForExp (
	__IDForExp__ Integer NOT NULL,
	FOREIGN KEY initializer (__FKinitializer__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY increment (__FKincrement__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ForExp (__IDForExp__),
	__FKinitializer__ Integer,
	__FKcondition__ Integer,
	__FKincrement__ Integer
) ;

CREATE TABLE ForeachExp (
	__IDForeachExp__ Integer NOT NULL,
	FOREIGN KEY var (__FKvar__) REFERENCES JessVariable (__IDJessVariable__),
	FOREIGN KEY list (__FKlist__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ForeachExp (__IDForeachExp__),
	__FKvar__ Integer,
	__FKlist__ Integer
) ;

CREATE TABLE FuncCall (
	__IDFuncCall__ Integer NOT NULL,
	FOREIGN KEY funcName (__FKfuncName__) REFERENCES ValidIdentifier (__IDValidIdentifier__),
	PRIMARY KEY FuncCall (__IDFuncCall__),
	__FKfuncName__ Integer
) ;

CREATE TABLE EngineExp (
	__IDEngineExp__ Integer NOT NULL,
	PRIMARY KEY EngineExp (__IDEngineExp__)
) ;

CREATE TABLE ExitExp (
	__IDExitExp__ Integer NOT NULL,
	PRIMARY KEY ExitExp (__IDExitExp__)
) ;

CREATE TABLE IfExpression (
	__IDIfExpression__ Integer NOT NULL,
	FOREIGN KEY ifthen (__FKifthen__) REFERENCES ConditionAction (__IDConditionAction__),
	PRIMARY KEY IfExpression (__IDIfExpression__),
	__FKifthen__ Integer
) ;

CREATE TABLE ConditionAction (
	__IDConditionAction__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConditionAction (__IDConditionAction__),
	__FKcondition__ Integer
) ;

CREATE TABLE ElifConditionAction (
	__IDElifConditionAction__ Integer NOT NULL,
	FOREIGN KEY condAct (__FKcondAct__) REFERENCES ConditionAction (__IDConditionAction__),
	PRIMARY KEY ElifConditionAction (__IDElifConditionAction__),
	__FKcondAct__ Integer
) ;

CREATE TABLE Root_expressions_Expression (
	__IDRoot__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE TemplateExpression_slotOp_SlotOp (
	__IDTemplateExpression__ Integer NOT NULL,
	__IDSlotOp__ Integer NOT NULL
) ;

CREATE TABLE GlobalDefinition_varDef_VarDefinition (
	__IDGlobalDefinition__ Integer NOT NULL,
	__IDVarDefinition__ Integer NOT NULL
) ;

CREATE TABLE FunctionDefinition_parameters_JessVariable (
	__IDFunctionDefinition__ Integer NOT NULL,
	__IDJessVariable__ Integer NOT NULL
) ;

CREATE TABLE FunctionDefinition_expressions_Expression (
	__IDFunctionDefinition__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE AdviceDefinition_advice_Expression (
	__IDAdviceDefinition__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE FactDefinition_fact_Expression (
	__IDFactDefinition__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE RuleDefinition_conditions_Expression (
	__IDRuleDefinition__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE RuleDefinition_functionCall_UseFuncExp (
	__IDRuleDefinition__ Integer NOT NULL,
	__IDUseFuncExp__ Integer NOT NULL
) ;

CREATE TABLE QueryDefinition_expressions_Expression (
	__IDQueryDefinition__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE DeclareVar_var_JessVariable (
	__IDDeclareVar__ Integer NOT NULL,
	__IDJessVariable__ Integer NOT NULL
) ;

CREATE TABLE TemplateDefinition_inherits_ValidIdentifier (
	__IDTemplateDefinition__ Integer NOT NULL,
	__IDValidIdentifier__ Integer NOT NULL
) ;

CREATE TABLE TemplateDefinition_slotDef_ASlotDef (
	__IDTemplateDefinition__ Integer NOT NULL,
	__IDASlotDef__ Integer NOT NULL
) ;

CREATE TABLE ASlotDef_optionals_SlotOptions (
	__IDASlotDef__ Integer NOT NULL,
	__IDSlotOptions__ Integer NOT NULL
) ;

CREATE TABLE SlotOptions_allowedValues_Expression (
	__IDSlotOptions__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE WhileExp_actions_Expression (
	__IDWhileExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ForExp_expressions_Expression (
	__IDForExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ForeachExp_expressions_Expression (
	__IDForeachExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE FuncCall_funcParam_Expression (
	__IDFuncCall__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE IfExpression_elifthen_ElifConditionAction (
	__IDIfExpression__ Integer NOT NULL,
	__IDElifConditionAction__ Integer NOT NULL
) ;

CREATE TABLE IfExpression_else_Expression (
	__IDIfExpression__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ConditionAction_actions_Expression (
	__IDConditionAction__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;
