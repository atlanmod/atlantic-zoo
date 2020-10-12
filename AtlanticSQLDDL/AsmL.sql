CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Body (
	__IDBody__ Integer NOT NULL,
	PRIMARY KEY Body (__IDBody__)
) ;

CREATE TABLE InWhereHolds (
	__IDInWhereHolds__ Integer NOT NULL,
	FOREIGN KEY var (__FKvar__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY "in" (__FKin__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY "where" (__FKwhere__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY holds (__FKholds__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY InWhereHolds (__IDInWhereHolds__),
	__FKwhere__ Integer,
	__FKholds__ Integer,
	__FKin__ Integer,
	__FKvar__ Integer
) ;

CREATE TABLE AsmLFile (
	__IDAsmLFile__ Integer NOT NULL,
	FOREIGN KEY main (__FKmain__) REFERENCES Main (__IDMain__),
	PRIMARY KEY AsmLFile (__IDAsmLFile__),
	__FKmain__ Integer
) ;

CREATE TABLE AsmLElement (
	__IDAsmLElement__ Integer NOT NULL,
	FOREIGN KEY file (__FKfile__) REFERENCES AsmLFile (__IDAsmLFile__),
	PRIMARY KEY AsmLElement (__IDAsmLElement__),
	__FKfile__ Integer
) ;

CREATE TABLE VarDeclaration (
	__IDVarDeclaration__ Integer NOT NULL,
	isConstant Boolean,
	isDeclaration Boolean,
	isLocal Boolean,
	name text,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY VarDeclaration (__IDVarDeclaration__),
	__FKtype__ Integer
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	name text,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Structure (
	__IDStructure__ Integer NOT NULL,
	name text,
	superStructureName text,
	PRIMARY KEY Structure (__IDStructure__)
) ;

CREATE TABLE VarOrCase (
	__IDVarOrCase__ Integer NOT NULL,
	FOREIGN KEY ownerStructure (__FKownerStructure__) REFERENCES Structure (__IDStructure__),
	PRIMARY KEY VarOrCase (__IDVarOrCase__),
	__FKownerStructure__ Integer
) ;

CREATE TABLE "Case" (
	__IDCase__ Integer NOT NULL,
	name text,
	PRIMARY KEY "Case" (__IDCase__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	isAbstract Boolean,
	superClassName text,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE VarOrMethod (
	__IDVarOrMethod__ Integer NOT NULL,
	FOREIGN KEY ownerClass (__FKownerClass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY VarOrMethod (__IDVarOrMethod__),
	__FKownerClass__ Integer
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	name text,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE Enumerator (
	__IDEnumerator__ Integer NOT NULL,
	name text,
	FOREIGN KEY value (__FKvalue__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Enumerator (__IDEnumerator__),
	__FKvalue__ Integer
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	name text,
	FOREIGN KEY body (__FKbody__) REFERENCES Body (__IDBody__),
	PRIMARY KEY Function (__IDFunction__),
	__FKbody__ Integer
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	isAbstract Boolean,
	isShared Boolean,
	isEntryPoint Boolean,
	isOverride Boolean,
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES Type (__IDType__),
	PRIMARY KEY Method (__IDMethod__),
	__FKreturnType__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	FOREIGN KEY ownerMethod (__FKownerMethod__) REFERENCES Method (__IDMethod__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKownerMethod__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Main (
	__IDMain__ Integer NOT NULL,
	FOREIGN KEY mainFile (__FKmainFile__) REFERENCES AsmLFile (__IDAsmLFile__),
	PRIMARY KEY Main (__IDMain__),
	__FKmainFile__ Integer
) ;

CREATE TABLE Initially (
	__IDInitially__ Integer NOT NULL,
	FOREIGN KEY id (__FKid__) REFERENCES VarTerm (__IDVarTerm__),
	FOREIGN KEY val (__FKval__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Initially (__IDInitially__),
	__FKval__ Integer,
	__FKid__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY ownerBody (__FKownerBody__) REFERENCES Body (__IDBody__),
	PRIMARY KEY Rule (__IDRule__),
	__FKownerBody__ Integer
) ;

CREATE TABLE SkipRule (
	__IDSkipRule__ Integer NOT NULL,
	PRIMARY KEY SkipRule (__IDSkipRule__)
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	name text,
	PRIMARY KEY Step (__IDStep__)
) ;

CREATE TABLE StepUntilFixPoint (
	__IDStepUntilFixPoint__ Integer NOT NULL,
	PRIMARY KEY StepUntilFixPoint (__IDStepUntilFixPoint__)
) ;

CREATE TABLE StepExpression (
	__IDStepExpression__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY StepExpression (__IDStepExpression__),
	__FKexpression__ Integer
) ;

CREATE TABLE StepWhile (
	__IDStepWhile__ Integer NOT NULL,
	PRIMARY KEY StepWhile (__IDStepWhile__)
) ;

CREATE TABLE StepUntil (
	__IDStepUntil__ Integer NOT NULL,
	PRIMARY KEY StepUntil (__IDStepUntil__)
) ;

CREATE TABLE StepForEach (
	__IDStepForEach__ Integer NOT NULL,
	PRIMARY KEY StepForEach (__IDStepForEach__)
) ;

CREATE TABLE MethodInvocation (
	__IDMethodInvocation__ Integer NOT NULL,
	FOREIGN KEY called (__FKcalled__) REFERENCES MethodCallTerm (__IDMethodCallTerm__),
	PRIMARY KEY MethodInvocation (__IDMethodInvocation__),
	__FKcalled__ Integer
) ;

CREATE TABLE UpdateRule (
	__IDUpdateRule__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY UpdateRule (__IDUpdateRule__),
	__FKterm__ Integer
) ;

CREATE TABLE UpdateVarRule (
	__IDUpdateVarRule__ Integer NOT NULL,
	FOREIGN KEY updateVar (__FKupdateVar__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY UpdateVarRule (__IDUpdateVarRule__),
	__FKupdateVar__ Integer
) ;

CREATE TABLE UpdateFieldRule (
	__IDUpdateFieldRule__ Integer NOT NULL,
	PRIMARY KEY UpdateFieldRule (__IDUpdateFieldRule__)
) ;

CREATE TABLE UpdateMapRule (
	__IDUpdateMapRule__ Integer NOT NULL,
	FOREIGN KEY updateMap (__FKupdateMap__) REFERENCES VarTerm (__IDVarTerm__),
	PRIMARY KEY UpdateMapRule (__IDUpdateMapRule__),
	__FKupdateMap__ Integer
) ;

CREATE TABLE ChooseRule (
	__IDChooseRule__ Integer NOT NULL,
	FOREIGN KEY ifChoosenRules (__FKifChoosenRules__) REFERENCES Body (__IDBody__),
	FOREIGN KEY ifNotChoosenRule (__FKifNotChoosenRule__) REFERENCES Body (__IDBody__),
	PRIMARY KEY ChooseRule (__IDChooseRule__),
	__FKifNotChoosenRule__ Integer,
	__FKifChoosenRules__ Integer
) ;

CREATE TABLE ForallRule (
	__IDForallRule__ Integer NOT NULL,
	FOREIGN KEY doRule (__FKdoRule__) REFERENCES Body (__IDBody__),
	PRIMARY KEY ForallRule (__IDForallRule__),
	__FKdoRule__ Integer
) ;

CREATE TABLE ConditionalRule (
	__IDConditionalRule__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY thenRule (__FKthenRule__) REFERENCES Body (__IDBody__),
	FOREIGN KEY elseRule (__FKelseRule__) REFERENCES Body (__IDBody__),
	FOREIGN KEY elseIfRule (__FKelseIfRule__) REFERENCES "ElseIf" (__IDElseIf__),
	PRIMARY KEY ConditionalRule (__IDConditionalRule__),
	__FKthenRule__ Integer,
	__FKelseRule__ Integer,
	__FKelseIfRule__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE "ElseIf" (
	__IDElseIf__ Integer NOT NULL,
	PRIMARY KEY "ElseIf" (__IDElseIf__)
) ;

CREATE TABLE ReturnRule (
	__IDReturnRule__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY ReturnRule (__IDReturnRule__),
	__FKterm__ Integer
) ;

CREATE TABLE AddRule (
	__IDAddRule__ Integer NOT NULL,
	FOREIGN KEY val (__FKval__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY "set" (__FKset__) REFERENCES VarTerm (__IDVarTerm__),
	PRIMARY KEY AddRule (__IDAddRule__),
	__FKval__ Integer,
	__FKset__ Integer
) ;

CREATE TABLE RemoveRule (
	__IDRemoveRule__ Integer NOT NULL,
	FOREIGN KEY val (__FKval__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY "set" (__FKset__) REFERENCES VarTerm (__IDVarTerm__),
	PRIMARY KEY RemoveRule (__IDRemoveRule__),
	__FKset__ Integer,
	__FKval__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	withNull Boolean,
	FOREIGN KEY ownerDeclaration (__FKownerDeclaration__) REFERENCES VarDeclaration (__IDVarDeclaration__),
	FOREIGN KEY ownerMethod (__FKownerMethod__) REFERENCES Method (__IDMethod__),
	FOREIGN KEY ownerParameter (__FKownerParameter__) REFERENCES Parameter (__IDParameter__),
	PRIMARY KEY Type (__IDType__),
	__FKownerDeclaration__ Integer,
	__FKownerMethod__ Integer,
	__FKownerParameter__ Integer
) ;

CREATE TABLE NamedType (
	__IDNamedType__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedType (__IDNamedType__)
) ;

CREATE TABLE MapType (
	__IDMapType__ Integer NOT NULL,
	FOREIGN KEY ofType (__FKofType__) REFERENCES Type (__IDType__),
	FOREIGN KEY toType (__FKtoType__) REFERENCES Type (__IDType__),
	PRIMARY KEY MapType (__IDMapType__),
	__FKofType__ Integer,
	__FKtoType__ Integer
) ;

CREATE TABLE TupletType (
	__IDTupletType__ Integer NOT NULL,
	PRIMARY KEY TupletType (__IDTupletType__)
) ;

CREATE TABLE SetType (
	__IDSetType__ Integer NOT NULL,
	FOREIGN KEY of (__FKof__) REFERENCES Type (__IDType__),
	PRIMARY KEY SetType (__IDSetType__),
	__FKof__ Integer
) ;

CREATE TABLE SequenceType (
	__IDSequenceType__ Integer NOT NULL,
	FOREIGN KEY of (__FKof__) REFERENCES Type (__IDType__),
	PRIMARY KEY SequenceType (__IDSequenceType__),
	__FKof__ Integer
) ;

CREATE TABLE Term (
	__IDTerm__ Integer NOT NULL,
	PRIMARY KEY Term (__IDTerm__)
) ;

CREATE TABLE VarTerm (
	__IDVarTerm__ Integer NOT NULL,
	name text,
	PRIMARY KEY VarTerm (__IDVarTerm__)
) ;

CREATE TABLE Operator (
	__IDOperator__ Integer NOT NULL,
	opName text,
	FOREIGN KEY leftExp (__FKleftExp__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY rightExp (__FKrightExp__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Operator (__IDOperator__),
	__FKleftExp__ Integer,
	__FKrightExp__ Integer
) ;

CREATE TABLE MapTerm (
	__IDMapTerm__ Integer NOT NULL,
	FOREIGN KEY ofTerm (__FKofTerm__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY toTerm (__FKtoTerm__) REFERENCES Term (__IDTerm__),
	"separator" text,
	PRIMARY KEY MapTerm (__IDMapTerm__),
	__FKtoTerm__ Integer,
	__FKofTerm__ Integer
) ;

CREATE TABLE TulpletTerm (
	__IDTulpletTerm__ Integer NOT NULL,
	PRIMARY KEY TulpletTerm (__IDTulpletTerm__)
) ;

CREATE TABLE MethodCallTerm (
	__IDMethodCallTerm__ Integer NOT NULL,
	name text,
	PRIMARY KEY MethodCallTerm (__IDMethodCallTerm__)
) ;

CREATE TABLE NewInstance (
	__IDNewInstance__ Integer NOT NULL,
	PRIMARY KEY NewInstance (__IDNewInstance__)
) ;

CREATE TABLE PredicateTerm (
	__IDPredicateTerm__ Integer NOT NULL,
	PRIMARY KEY PredicateTerm (__IDPredicateTerm__)
) ;

CREATE TABLE ForAllTerm (
	__IDForAllTerm__ Integer NOT NULL,
	PRIMARY KEY ForAllTerm (__IDForAllTerm__)
) ;

CREATE TABLE ExistsTerm (
	__IDExistsTerm__ Integer NOT NULL,
	isUnique Boolean,
	PRIMARY KEY ExistsTerm (__IDExistsTerm__)
) ;

CREATE TABLE AnyIn (
	__IDAnyIn__ Integer NOT NULL,
	PRIMARY KEY AnyIn (__IDAnyIn__)
) ;

CREATE TABLE SetTerm (
	__IDSetTerm__ Integer NOT NULL,
	PRIMARY KEY SetTerm (__IDSetTerm__)
) ;

CREATE TABLE EnumerateSet (
	__IDEnumerateSet__ Integer NOT NULL,
	PRIMARY KEY EnumerateSet (__IDEnumerateSet__)
) ;

CREATE TABLE RangeSet (
	__IDRangeSet__ Integer NOT NULL,
	FOREIGN KEY minval (__FKminval__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY maxval (__FKmaxval__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY RangeSet (__IDRangeSet__),
	__FKminval__ Integer,
	__FKmaxval__ Integer
) ;

CREATE TABLE AlgorithmSet (
	__IDAlgorithmSet__ Integer NOT NULL,
	PRIMARY KEY AlgorithmSet (__IDAlgorithmSet__)
) ;

CREATE TABLE SequenceTerm (
	__IDSequenceTerm__ Integer NOT NULL,
	PRIMARY KEY SequenceTerm (__IDSequenceTerm__)
) ;

CREATE TABLE EnumerateSequence (
	__IDEnumerateSequence__ Integer NOT NULL,
	PRIMARY KEY EnumerateSequence (__IDEnumerateSequence__)
) ;

CREATE TABLE RangeSequence (
	__IDRangeSequence__ Integer NOT NULL,
	FOREIGN KEY minval (__FKminval__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY maxval (__FKmaxval__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY RangeSequence (__IDRangeSequence__),
	__FKmaxval__ Integer,
	__FKminval__ Integer
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	PRIMARY KEY Constant (__IDConstant__)
) ;

CREATE TABLE BooleanConstant (
	__IDBooleanConstant__ Integer NOT NULL,
	val Boolean,
	PRIMARY KEY BooleanConstant (__IDBooleanConstant__)
) ;

CREATE TABLE IntegerConstant (
	__IDIntegerConstant__ Integer NOT NULL,
	val Integer,
	PRIMARY KEY IntegerConstant (__IDIntegerConstant__)
) ;

CREATE TABLE StringConstant (
	__IDStringConstant__ Integer NOT NULL,
	val text,
	PRIMARY KEY StringConstant (__IDStringConstant__)
) ;

CREATE TABLE NullConstant (
	__IDNullConstant__ Integer NOT NULL,
	PRIMARY KEY NullConstant (__IDNullConstant__)
) ;

CREATE TABLE EnumerateSet_vals_Term (
	__IDEnumerateSet__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE MethodCallTerm_parameters_Term (
	__IDMethodCallTerm__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE TupletType_types_Type (
	__IDTupletType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_enumerators_Enumerator (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerator__ Integer NOT NULL
) ;

CREATE TABLE Class_varOrMethod_VarOrMethod (
	__IDClass__ Integer NOT NULL,
	__IDVarOrMethod__ Integer NOT NULL
) ;

CREATE TABLE Method_parameters_Parameter (
	__IDMethod__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE AsmLFile_elements_AsmLElement (
	__IDAsmLFile__ Integer NOT NULL,
	__IDAsmLElement__ Integer NOT NULL
) ;

CREATE TABLE TulpletTerm_terms_Term (
	__IDTulpletTerm__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE AlgorithmSet_expressions_InWhereHolds (
	__IDAlgorithmSet__ Integer NOT NULL,
	__IDInWhereHolds__ Integer NOT NULL
) ;

CREATE TABLE PredicateTerm_expressions_InWhereHolds (
	__IDPredicateTerm__ Integer NOT NULL,
	__IDInWhereHolds__ Integer NOT NULL
) ;

CREATE TABLE Case_variables_VarDeclaration (
	__IDCase__ Integer NOT NULL,
	__IDVarDeclaration__ Integer NOT NULL
) ;

CREATE TABLE ForallRule_expressions_InWhereHolds (
	__IDForallRule__ Integer NOT NULL,
	__IDInWhereHolds__ Integer NOT NULL
) ;

CREATE TABLE UpdateFieldRule_path_VarTerm (
	__IDUpdateFieldRule__ Integer NOT NULL,
	__IDVarTerm__ Integer NOT NULL
) ;

CREATE TABLE StepForEach_expressions_InWhereHolds (
	__IDStepForEach__ Integer NOT NULL,
	__IDInWhereHolds__ Integer NOT NULL
) ;

CREATE TABLE Body_rules_Rule (
	__IDBody__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE Structure_varOrCase_VarOrCase (
	__IDStructure__ Integer NOT NULL,
	__IDVarOrCase__ Integer NOT NULL
) ;

CREATE TABLE EnumerateSequence_vals_Term (
	__IDEnumerateSequence__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE UpdateMapRule_parameters_Term (
	__IDUpdateMapRule__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE ChooseRule_expressions_InWhereHolds (
	__IDChooseRule__ Integer NOT NULL,
	__IDInWhereHolds__ Integer NOT NULL
) ;

CREATE TABLE Main_initialisations_Initially (
	__IDMain__ Integer NOT NULL,
	__IDInitially__ Integer NOT NULL
) ;
