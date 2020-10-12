CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE XAsmFile (
	__IDXAsmFile__ Integer NOT NULL,
	PRIMARY KEY XAsmFile (__IDXAsmFile__)
) ;

CREATE TABLE XAsmSpec (
	__IDXAsmSpec__ Integer NOT NULL,
	PRIMARY KEY XAsmSpec (__IDXAsmSpec__)
) ;

CREATE TABLE Asm (
	__IDAsm__ Integer NOT NULL,
	FOREIGN KEY signature (__FKsignature__) REFERENCES Signature (__IDSignature__),
	returnType text,
	FOREIGN KEY metaInformation (__FKmetaInformation__) REFERENCES MetaInformation (__IDMetaInformation__),
	FOREIGN KEY body (__FKbody__) REFERENCES Body (__IDBody__),
	PRIMARY KEY Asm (__IDAsm__),
	__FKbody__ Integer,
	__FKsignature__ Integer,
	__FKmetaInformation__ Integer
) ;

CREATE TABLE Signature (
	__IDSignature__ Integer NOT NULL,
	isMain Boolean,
	name text,
	PRIMARY KEY Signature (__IDSignature__)
) ;

CREATE TABLE Argument (
	__IDArgument__ Integer NOT NULL,
	type text,
	PRIMARY KEY Argument (__IDArgument__)
) ;

CREATE TABLE Body (
	__IDBody__ Integer NOT NULL,
	FOREIGN KEY initialization (__FKinitialization__) REFERENCES Initialization (__IDInitialization__),
	PRIMARY KEY Body (__IDBody__),
	__FKinitialization__ Integer
) ;

CREATE TABLE MetaInformation (
	__IDMetaInformation__ Integer NOT NULL,
	usedAs text,
	PRIMARY KEY MetaInformation (__IDMetaInformation__)
) ;

CREATE TABLE AccessUpdateFunction (
	__IDAccessUpdateFunction__ Integer NOT NULL,
	type text,
	PRIMARY KEY AccessUpdateFunction (__IDAccessUpdateFunction__)
) ;

CREATE TABLE Declaration (
	__IDDeclaration__ Integer NOT NULL,
	PRIMARY KEY Declaration (__IDDeclaration__)
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	returnType text,
	FOREIGN KEY initTerm (__FKinitTerm__) REFERENCES Term (__IDTerm__),
	isExternal Boolean,
	PRIMARY KEY Function (__IDFunction__),
	__FKinitTerm__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	type text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE Universe (
	__IDUniverse__ Integer NOT NULL,
	name text,
	PRIMARY KEY Universe (__IDUniverse__)
) ;

CREATE TABLE Initialization (
	__IDInitialization__ Integer NOT NULL,
	PRIMARY KEY Initialization (__IDInitialization__)
) ;

CREATE TABLE Term (
	__IDTerm__ Integer NOT NULL,
	PRIMARY KEY Term (__IDTerm__)
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	PRIMARY KEY Constant (__IDConstant__)
) ;

CREATE TABLE FunctionOrVariableTerm (
	__IDFunctionOrVariableTerm__ Integer NOT NULL,
	FOREIGN KEY declaration (__FKdeclaration__) REFERENCES ElementDecl (__IDElementDecl__),
	PRIMARY KEY FunctionOrVariableTerm (__IDFunctionOrVariableTerm__),
	__FKdeclaration__ Integer
) ;

CREATE TABLE OperatorTerm (
	__IDOperatorTerm__ Integer NOT NULL,
	opName text,
	FOREIGN KEY leftExp (__FKleftExp__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY rightExp (__FKrightExp__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY OperatorTerm (__IDOperatorTerm__),
	__FKleftExp__ Integer,
	__FKrightExp__ Integer
) ;

CREATE TABLE BooleanConstant (
	__IDBooleanConstant__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanConstant (__IDBooleanConstant__)
) ;

CREATE TABLE IntegerConstant (
	__IDIntegerConstant__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerConstant (__IDIntegerConstant__)
) ;

CREATE TABLE StringConstant (
	__IDStringConstant__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringConstant (__IDStringConstant__)
) ;

CREATE TABLE UndefConstant (
	__IDUndefConstant__ Integer NOT NULL,
	PRIMARY KEY UndefConstant (__IDUndefConstant__)
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	inSequence Boolean,
	PRIMARY KEY Rule (__IDRule__)
) ;

CREATE TABLE SkipRule (
	__IDSkipRule__ Integer NOT NULL,
	PRIMARY KEY SkipRule (__IDSkipRule__)
) ;

CREATE TABLE AsmInvocation (
	__IDAsmInvocation__ Integer NOT NULL,
	asmName text,
	PRIMARY KEY AsmInvocation (__IDAsmInvocation__)
) ;

CREATE TABLE UpdateRule (
	__IDUpdateRule__ Integer NOT NULL,
	FOREIGN KEY function (__FKfunction__) REFERENCES FunctionOrVariableTerm (__IDFunctionOrVariableTerm__),
	FOREIGN KEY updateTerm (__FKupdateTerm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY UpdateRule (__IDUpdateRule__),
	__FKupdateTerm__ Integer,
	__FKfunction__ Integer
) ;

CREATE TABLE ChooseRule (
	__IDChooseRule__ Integer NOT NULL,
	FOREIGN KEY chooseId (__FKchooseId__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY inSet (__FKinSet__) REFERENCES Universe (__IDUniverse__),
	FOREIGN KEY guard (__FKguard__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY ifNotChoosenRule (__FKifNotChoosenRule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY ChooseRule (__IDChooseRule__),
	__FKinSet__ Integer,
	__FKguard__ Integer,
	__FKifNotChoosenRule__ Integer,
	__FKchooseId__ Integer
) ;

CREATE TABLE DoForallRule (
	__IDDoForallRule__ Integer NOT NULL,
	FOREIGN KEY id (__FKid__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY inSet (__FKinSet__) REFERENCES Universe (__IDUniverse__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY DoForallRule (__IDDoForallRule__),
	__FKcondition__ Integer,
	__FKid__ Integer,
	__FKinSet__ Integer
) ;

CREATE TABLE ConditionalRule (
	__IDConditionalRule__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY elseRule (__FKelseRule__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY elseIfRule (__FKelseIfRule__) REFERENCES "ElseIf" (__IDElseIf__),
	PRIMARY KEY ConditionalRule (__IDConditionalRule__),
	__FKelseRule__ Integer,
	__FKcondition__ Integer,
	__FKelseIfRule__ Integer
) ;

CREATE TABLE "ElseIf" (
	__IDElseIf__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY elseRule (__FKelseRule__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY elseIfRule (__FKelseIfRule__) REFERENCES "ElseIf" (__IDElseIf__),
	PRIMARY KEY "ElseIf" (__IDElseIf__),
	__FKelseIfRule__ Integer,
	__FKelseRule__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE ExtendRule (
	__IDExtendRule__ Integer NOT NULL,
	PRIMARY KEY ExtendRule (__IDExtendRule__)
) ;

CREATE TABLE ElementDecl (
	__IDElementDecl__ Integer NOT NULL,
	name text,
	PRIMARY KEY ElementDecl (__IDElementDecl__)
) ;

CREATE TABLE VariableDecl (
	__IDVariableDecl__ Integer NOT NULL,
	PRIMARY KEY VariableDecl (__IDVariableDecl__)
) ;

CREATE TABLE Extension (
	__IDExtension__ Integer NOT NULL,
	FOREIGN KEY universe (__FKuniverse__) REFERENCES Universe (__IDUniverse__),
	PRIMARY KEY Extension (__IDExtension__),
	__FKuniverse__ Integer
) ;

CREATE TABLE ReturnRule (
	__IDReturnRule__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY ReturnRule (__IDReturnRule__),
	__FKterm__ Integer
) ;

CREATE TABLE ElseIf_thenRule_Rule (
	__IDElseIf__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Universe_superUniverses_Universe (
	__IDUniverse__ Integer NOT NULL,
	__IDUniverse__ Integer NOT NULL
) ;

CREATE TABLE DoForallRule_doRule_Rule (
	__IDDoForallRule__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE MetaInformation_accessUpdateFunctions_AccessUpdateFunction (
	__IDMetaInformation__ Integer NOT NULL,
	__IDAccessUpdateFunction__ Integer NOT NULL
) ;

CREATE TABLE ConditionalRule_thenRule_Rule (
	__IDConditionalRule__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE FunctionOrVariableTerm_terms_Term (
	__IDFunctionOrVariableTerm__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE ChooseRule_ifChoosenRules_Rule (
	__IDChooseRule__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Body_declarations_Declaration (
	__IDBody__ Integer NOT NULL,
	__IDDeclaration__ Integer NOT NULL
) ;

CREATE TABLE Function_parameters_Parameter (
	__IDFunction__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE ExtendRule_extensions_Extension (
	__IDExtendRule__ Integer NOT NULL,
	__IDExtension__ Integer NOT NULL
) ;

CREATE TABLE MetaInformation_usedAsIn_Signature (
	__IDMetaInformation__ Integer NOT NULL,
	__IDSignature__ Integer NOT NULL
) ;

CREATE TABLE AsmInvocation_arguments_Term (
	__IDAsmInvocation__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE AccessUpdateFunction_functions_Function (
	__IDAccessUpdateFunction__ Integer NOT NULL,
	__IDFunction__ Integer NOT NULL
) ;

CREATE TABLE Signature_arguments_Argument (
	__IDSignature__ Integer NOT NULL,
	__IDArgument__ Integer NOT NULL
) ;

CREATE TABLE Extension_elements_VariableDecl (
	__IDExtension__ Integer NOT NULL,
	__IDVariableDecl__ Integer NOT NULL
) ;

CREATE TABLE Initialization_rules_Rule (
	__IDInitialization__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE XAsmSpec_Asm_Asm (
	__IDXAsmSpec__ Integer NOT NULL,
	__IDAsm__ Integer NOT NULL
) ;

CREATE TABLE Body_rules_Rule (
	__IDBody__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE ExtendRule_rules_Rule (
	__IDExtendRule__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;
