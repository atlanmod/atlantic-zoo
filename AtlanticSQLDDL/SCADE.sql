CREATE TABLE ListString (
	__IDListString__ Integer NOT NULL,
	value text,
	PRIMARY KEY ListString (__IDListString__)
) ;

CREATE TABLE ListInteger (
	__IDListInteger__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY ListInteger (__IDListInteger__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	library Boolean,
	pathname text,
	FOREIGN KEY descriptor (__FKdescriptor__) REFERENCES Descriptor (__IDDescriptor__),
	FOREIGN KEY project (__FKproject__) REFERENCES Project (__IDProject__),
	FOREIGN KEY fileRef (__FKfileRef__) REFERENCES FileRef (__IDFileRef__),
	FOREIGN KEY enumsBlock (__FKenumsBlock__) REFERENCES ConstBlock (__IDConstBlock__),
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	FOREIGN KEY coverageFileM (__FKcoverageFileM__) REFERENCES CoverageFile (__IDCoverageFile__),
	FOREIGN KEY criterionFileM (__FKcriterionFileM__) REFERENCES CriterionFile (__IDCriterionFile__),
	FOREIGN KEY root (__FKroot__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY application (__FKapplication__) REFERENCES MtcApplication (__IDMtcApplication__),
	FOREIGN KEY constBlockK (__FKconstBlockK__) REFERENCES ConstBlock (__IDConstBlock__),
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY varBlockK (__FKvarBlockK__) REFERENCES VarBlock (__IDVarBlock__),
	FOREIGN KEY typeBlock (__FKtypeBlock__) REFERENCES TypeBlock (__IDTypeBlock__),
	FOREIGN KEY refinement (__FKrefinement__) REFERENCES NamedType (__IDNamedType__),
	FOREIGN KEY implementation (__FKimplementation__) REFERENCES Implementation (__IDImplementation__),
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	FOREIGN KEY allConstant (__FKallConstant__) REFERENCES Constant (__IDConstant__),
	FOREIGN KEY allvariable (__FKallvariable__) REFERENCES GlobalVariable (__IDGlobalVariable__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES GlobalVariable (__IDGlobalVariable__),
	FOREIGN KEY allConstVar (__FKallConstVar__) REFERENCES ConstVar (__IDConstVar__),
	FOREIGN KEY constVar (__FKconstVar__) REFERENCES ConstVar (__IDConstVar__),
	FOREIGN KEY constBlock (__FKconstBlock__) REFERENCES ConstBlock (__IDConstBlock__),
	FOREIGN KEY varBlock (__FKvarBlock__) REFERENCES VarBlock (__IDVarBlock__),
	FOREIGN KEY allNamedType (__FKallNamedType__) REFERENCES NamedType (__IDNamedType__),
	FOREIGN KEY namedType (__FKnamedType__) REFERENCES NamedType (__IDNamedType__),
	PRIMARY KEY Model (__IDModel__),
	__FKdescriptor__ Integer,
	__FKproject__ Integer,
	__FKfileRef__ Integer,
	__FKenumsBlock__ Integer,
	__FKmodel__ Integer,
	__FKcoverageFileM__ Integer,
	__FKcriterionFileM__ Integer,
	__FKroot__ Integer,
	__FKapplication__ Integer,
	__FKconstBlockK__ Integer,
	__FKnode__ Integer,
	__FKvarBlockK__ Integer,
	__FKtypeBlock__ Integer,
	__FKrefinement__ Integer,
	__FKimplementation__ Integer,
	__FKconstant__ Integer,
	__FKallConstant__ Integer,
	__FKallvariable__ Integer,
	__FKvariable__ Integer,
	__FKallConstVar__ Integer,
	__FKconstVar__ Integer,
	__FKconstBlock__ Integer,
	__FKvarBlock__ Integer,
	__FKallNamedType__ Integer,
	__FKnamedType__ Integer
) ;

CREATE TABLE Implementation (
	__IDImplementation__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES Model (__IDModel__),
	PRIMARY KEY Implementation (__IDImplementation__),
	__FKkey__ Integer
) ;

CREATE TABLE ConstBlock (
	__IDConstBlock__ Integer NOT NULL,
	FOREIGN KEY modelC (__FKmodelC__) REFERENCES Model (__IDModel__),
	FOREIGN KEY keyC (__FKkeyC__) REFERENCES Model (__IDModel__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Model (__IDModel__),
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY ConstBlock (__IDConstBlock__),
	__FKmodelC__ Integer,
	__FKkeyC__ Integer,
	__FKkey__ Integer,
	__FKconstant__ Integer
) ;

CREATE TABLE VarBlock (
	__IDVarBlock__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES GlobalVariable (__IDGlobalVariable__),
	FOREIGN KEY keyVB (__FKkeyVB__) REFERENCES Model (__IDModel__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Model (__IDModel__),
	PRIMARY KEY VarBlock (__IDVarBlock__),
	__FKvariable__ Integer,
	__FKkeyVB__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE GlobalVariable (
	__IDGlobalVariable__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES VarBlock (__IDVarBlock__),
	PRIMARY KEY GlobalVariable (__IDGlobalVariable__),
	__FKkey__ Integer
) ;

CREATE TABLE TypeBlock (
	__IDTypeBlock__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES NamedType (__IDNamedType__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Model (__IDModel__),
	PRIMARY KEY TypeBlock (__IDTypeBlock__),
	__FKtype__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE Session (
	__IDSession__ Integer NOT NULL,
	FOREIGN KEY descriptor (__FKdescriptor__) REFERENCES Descriptor (__IDDescriptor__),
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	DefinedIn text,
	FOREIGN KEY loader (__FKloader__) REFERENCES Loader (__IDLoader__),
	PRIMARY KEY Session (__IDSession__),
	__FKdescriptor__ Integer,
	__FKmodel__ Integer,
	__FKloader__ Integer
) ;

CREATE TABLE Descriptor (
	__IDDescriptor__ Integer NOT NULL,
	modelFileName text,
	sernFileName text,
	sernPersistAs text,
	rnetFileName text,
	rnetPersistAs text,
	occBase Integer,
	size Integer,
	nameVerify Boolean,
	checked Boolean,
	FOREIGN KEY modelD (__FKmodelD__) REFERENCES Model (__IDModel__),
	PRIMARY KEY Descriptor (__IDDescriptor__),
	__FKmodelD__ Integer
) ;

CREATE TABLE StorageUnit (
	__IDStorageUnit__ Integer NOT NULL,
	saoFileName text,
	annFileName text,
	persistAs text,
	loaded Boolean,
	saoModified Boolean,
	annModified Boolean,
	FOREIGN KEY fileRef (__FKfileRef__) REFERENCES FileRef (__IDFileRef__),
	FOREIGN KEY modelS (__FKmodelS__) REFERENCES Model (__IDModel__),
	PRIMARY KEY StorageUnit (__IDStorageUnit__),
	__FKfileRef__ Integer,
	__FKmodelS__ Integer
) ;

CREATE TABLE StorageElement (
	__IDStorageElement__ Integer NOT NULL,
	FOREIGN KEY storageUnitE (__FKstorageUnitE__) REFERENCES StorageUnit (__IDStorageUnit__),
	PRIMARY KEY StorageElement (__IDStorageElement__),
	__FKstorageUnitE__ Integer
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	name text,
	runLine Integer,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	zoomCoeff Integer,
	fromat text,
	lanscape Boolean,
	defaultPageFormat Boolean,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE NodeBlock (
	__IDNodeBlock__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	PRIMARY KEY NodeBlock (__IDNodeBlock__),
	__FKnode__ Integer
) ;

CREATE TABLE ModelBlock (
	__IDModelBlock__ Integer NOT NULL,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY ModelBlock (__IDModelBlock__),
	__FKmodel__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY exprContactE (__FKexprContactE__) REFERENCES ExprContact (__IDExprContact__),
	FOREIGN KEY exprCallE (__FKexprCallE__) REFERENCES ExprCall (__IDExprCall__),
	FOREIGN KEY dependance (__FKdependance__) REFERENCES ConstVar (__IDConstVar__),
	FOREIGN KEY paramArray (__FKparamArray__) REFERENCES ParamArray (__IDParamArray__),
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	FOREIGN KEY equationE (__FKequationE__) REFERENCES Equation (__IDEquation__),
	FOREIGN KEY assertionE (__FKassertionE__) REFERENCES Assertion (__IDAssertion__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKlabel__ Integer,
	__FKexprContactE__ Integer,
	__FKexprCallE__ Integer,
	__FKdependance__ Integer,
	__FKparamArray__ Integer,
	__FKconstant__ Integer,
	__FKequationE__ Integer,
	__FKassertionE__ Integer
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY "Label" (__IDLabel__),
	__FKexpression__ Integer
) ;

CREATE TABLE ExprNull (
	__IDExprNull__ Integer NOT NULL,
	PRIMARY KEY ExprNull (__IDExprNull__)
) ;

CREATE TABLE ConstValue (
	__IDConstValue__ Integer NOT NULL,
	value text,
	FOREIGN KEY kind (__FKkind__) REFERENCES Object (__IDObject__),
	PRIMARY KEY ConstValue (__IDConstValue__),
	__FKkind__ Integer
) ;

CREATE TABLE ExprContact (
	__IDExprContact__ Integer NOT NULL,
	FOREIGN KEY boolAct (__FKboolAct__) REFERENCES ExprId (__IDExprId__),
	FOREIGN KEY calledOpr (__FKcalledOpr__) REFERENCES ExprCall (__IDExprCall__),
	PRIMARY KEY ExprContact (__IDExprContact__),
	__FKboolAct__ Integer,
	__FKcalledOpr__ Integer
) ;

CREATE TABLE ExprCall (
	__IDExprCall__ Integer NOT NULL,
	numOcc Integer,
	predefOpr Integer,
	FOREIGN KEY exprContactEC (__FKexprContactEC__) REFERENCES ExprContact (__IDExprContact__),
	FOREIGN KEY operator (__FKoperator__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY ExprCall (__IDExprCall__),
	__FKexprContactEC__ Integer,
	__FKoperator__ Integer
) ;

CREATE TABLE Operator (
	__IDOperator__ Integer NOT NULL,
	category text,
	conversion Boolean,
	state Boolean,
	"index" Integer,
	FOREIGN KEY variable (__FKvariable__) REFERENCES LocalVariable (__IDLocalVariable__),
	FOREIGN KEY modelO (__FKmodelO__) REFERENCES Model (__IDModel__),
	FOREIGN KEY modelOp (__FKmodelOp__) REFERENCES Model (__IDModel__),
	FOREIGN KEY criterionO (__FKcriterionO__) REFERENCES Criterion (__IDCriterion__),
	FOREIGN KEY operator (__FKoperator__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY Operator (__IDOperator__),
	__FKvariable__ Integer,
	__FKmodelO__ Integer,
	__FKmodelOp__ Integer,
	__FKcriterionO__ Integer,
	__FKoperator__ Integer
) ;

CREATE TABLE ExprId (
	__IDExprId__ Integer NOT NULL,
	FOREIGN KEY exprContactEI (__FKexprContactEI__) REFERENCES ExprContact (__IDExprContact__),
	FOREIGN KEY reference (__FKreference__) REFERENCES ConstVar (__IDConstVar__),
	PRIMARY KEY ExprId (__IDExprId__),
	__FKexprContactEI__ Integer,
	__FKreference__ Integer
) ;

CREATE TABLE LocalVariable (
	__IDLocalVariable__ Integer NOT NULL,
	optional Boolean,
	const Boolean,
	probe Boolean,
	pure Boolean,
	initValue text,
	FOREIGN KEY operatorI (__FKoperatorI__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY operatorO (__FKoperatorO__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY operatorH (__FKoperatorH__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY nodeL (__FKnodeL__) REFERENCES Node (__IDNode__),
	FOREIGN KEY nodeI (__FKnodeI__) REFERENCES Node (__IDNode__),
	PRIMARY KEY LocalVariable (__IDLocalVariable__),
	__FKoperatorI__ Integer,
	__FKoperatorO__ Integer,
	__FKoperatorH__ Integer,
	__FKnodeL__ Integer,
	__FKnodeI__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY nodeKind (__FKnodeKind__) REFERENCES Object (__IDObject__),
	FOREIGN KEY eqBlock (__FKeqBlock__) REFERENCES EqBlock (__IDEqBlock__),
	FOREIGN KEY paramBlock (__FKparamBlock__) REFERENCES ParamBlock (__IDParamBlock__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Model (__IDModel__),
	FOREIGN KEY stateMachine (__FKstateMachine__) REFERENCES StateMachine (__IDStateMachine__),
	FOREIGN KEY modelN (__FKmodelN__) REFERENCES Model (__IDModel__),
	PRIMARY KEY Node (__IDNode__),
	__FKnodeKind__ Integer,
	__FKeqBlock__ Integer,
	__FKparamBlock__ Integer,
	__FKkey__ Integer,
	__FKstateMachine__ Integer,
	__FKmodelN__ Integer
) ;

CREATE TABLE ParamBlock (
	__IDParamBlock__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES Node (__IDNode__),
	PRIMARY KEY ParamBlock (__IDParamBlock__),
	__FKkey__ Integer
) ;

CREATE TABLE ParamArray (
	__IDParamArray__ Integer NOT NULL,
	FOREIGN KEY paramBlock (__FKparamBlock__) REFERENCES ParamBlock (__IDParamBlock__),
	FOREIGN KEY operator (__FKoperator__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY ParamArray (__IDParamArray__),
	__FKparamBlock__ Integer,
	__FKoperator__ Integer
) ;

CREATE TABLE ConstVar (
	__IDConstVar__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES Object (__IDObject__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY ConstVar (__IDConstVar__),
	__FKkind__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	imported Boolean,
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY enumeration (__FKenumeration__) REFERENCES Enumeration (__IDEnumeration__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES ConstBlock (__IDConstBlock__),
	PRIMARY KEY Constant (__IDConstant__),
	__FKvalue__ Integer,
	__FKenumeration__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY clock (__FKclock__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKclock__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY Type (__IDType__),
	__FKmodel__ Integer
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	size Integer,
	FOREIGN KEY typeT (__FKtypeT__) REFERENCES Type (__IDType__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKtypeT__ Integer
) ;

CREATE TABLE NamedType (
	__IDNamedType__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES Object (__IDObject__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY implementation (__FKimplementation__) REFERENCES Implementation (__IDImplementation__),
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Type (__IDType__),
	FOREIGN KEY keyM (__FKkeyM__) REFERENCES Model (__IDModel__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES TypeBlock (__IDTypeBlock__),
	PRIMARY KEY NamedType (__IDNamedType__),
	__FKkind__ Integer,
	__FKto__ Integer,
	__FKfrom__ Integer,
	__FKimplementation__ Integer,
	__FKdefinition__ Integer,
	__FKkeyM__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE Composite (
	__IDComposite__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES CompositeElement (__IDCompositeElement__),
	PRIMARY KEY Composite (__IDComposite__),
	__FKelement__ Integer
) ;

CREATE TABLE CompositeElement (
	__IDCompositeElement__ Integer NOT NULL,
	FOREIGN KEY typeC (__FKtypeC__) REFERENCES Type (__IDType__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Composite (__IDComposite__),
	PRIMARY KEY CompositeElement (__IDCompositeElement__),
	__FKtypeC__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE Structure (
	__IDStructure__ Integer NOT NULL,
	PRIMARY KEY Structure (__IDStructure__)
) ;

CREATE TABLE Tuple (
	__IDTuple__ Integer NOT NULL,
	PRIMARY KEY Tuple (__IDTuple__)
) ;

CREATE TABLE EqBlock (
	__IDEqBlock__ Integer NOT NULL,
	FOREIGN KEY assertion (__FKassertion__) REFERENCES Assertion (__IDAssertion__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES Node (__IDNode__),
	PRIMARY KEY EqBlock (__IDEqBlock__),
	__FKassertion__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE Equation (
	__IDEquation__ Integer NOT NULL,
	rotation Integer,
	symetrical Boolean,
	terminator Boolean,
	FOREIGN KEY eqBlock (__FKeqBlock__) REFERENCES EqBlock (__IDEqBlock__),
	FOREIGN KEY "right" (__FKright__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY position (__FKposition__) REFERENCES RPoint (__IDRPoint__),
	FOREIGN KEY size (__FKsize__) REFERENCES RSize (__IDRSize__),
	PRIMARY KEY Equation (__IDEquation__),
	__FKeqBlock__ Integer,
	__FKright__ Integer,
	__FKposition__ Integer,
	__FKsize__ Integer
) ;

CREATE TABLE Assertion (
	__IDAssertion__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES EqBlock (__IDEqBlock__),
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY edge (__FKedge__) REFERENCES Edge (__IDEdge__),
	FOREIGN KEY position (__FKposition__) REFERENCES RPoint (__IDRPoint__),
	PRIMARY KEY Assertion (__IDAssertion__),
	__FKkey__ Integer,
	__FKexpression__ Integer,
	__FKedge__ Integer,
	__FKposition__ Integer
) ;

CREATE TABLE Annotable (
	__IDAnnotable__ Integer NOT NULL,
	DefinedIn text,
	PRIMARY KEY Annotable (__IDAnnotable__)
) ;

CREATE TABLE Prop (
	__IDProp__ Integer NOT NULL,
	name text,
	FOREIGN KEY entity (__FKentity__) REFERENCES Annotable (__IDAnnotable__),
	FOREIGN KEY configurationP (__FKconfigurationP__) REFERENCES Configuration (__IDConfiguration__),
	PRIMARY KEY Prop (__IDProp__),
	__FKentity__ Integer,
	__FKconfigurationP__ Integer
) ;

CREATE TABLE Configuration (
	__IDConfiguration__ Integer NOT NULL,
	name text,
	FOREIGN KEY projectC (__FKprojectC__) REFERENCES Project (__IDProject__),
	PRIMARY KEY Configuration (__IDConfiguration__),
	__FKprojectC__ Integer
) ;

CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	pathname text,
	PRIMARY KEY Project (__IDProject__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	derived Boolean,
	ident text,
	description text,
	FOREIGN KEY root (__FKroot__) REFERENCES Project (__IDProject__),
	FOREIGN KEY folder (__FKfolder__) REFERENCES Folder (__IDFolder__),
	FOREIGN KEY criterionE (__FKcriterionE__) REFERENCES Criterion (__IDCriterion__),
	PRIMARY KEY Element (__IDElement__),
	__FKroot__ Integer,
	__FKfolder__ Integer,
	__FKcriterionE__ Integer
) ;

CREATE TABLE FileRef (
	__IDFileRef__ Integer NOT NULL,
	pathname text,
	persistAs text,
	DefinedIn text,
	PRIMARY KEY FileRef (__IDFileRef__)
) ;

CREATE TABLE Folder (
	__IDFolder__ Integer NOT NULL,
	extensions text,
	PRIMARY KEY Folder (__IDFolder__)
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	PRIMARY KEY Reference (__IDReference__)
) ;

CREATE TABLE TypeReference (
	__IDTypeReference__ Integer NOT NULL,
	PRIMARY KEY TypeReference (__IDTypeReference__)
) ;

CREATE TABLE OperatorReference (
	__IDOperatorReference__ Integer NOT NULL,
	PRIMARY KEY OperatorReference (__IDOperatorReference__)
) ;

CREATE TABLE VariableReference (
	__IDVariableReference__ Integer NOT NULL,
	PRIMARY KEY VariableReference (__IDVariableReference__)
) ;

CREATE TABLE Error (
	__IDError__ Integer NOT NULL,
	PRIMARY KEY Error (__IDError__)
) ;

CREATE TABLE Edge (
	__IDEdge__ Integer NOT NULL,
	leftVarIndex Integer,
	labelOrientation Integer,
	FOREIGN KEY leftVar (__FKleftVar__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY rightExpression (__FKrightExpression__) REFERENCES ExprId (__IDExprId__),
	FOREIGN KEY srcEquation (__FKsrcEquation__) REFERENCES Equation (__IDEquation__),
	FOREIGN KEY assertion (__FKassertion__) REFERENCES Assertion (__IDAssertion__),
	FOREIGN KEY dstEquation (__FKdstEquation__) REFERENCES Equation (__IDEquation__),
	PRIMARY KEY Edge (__IDEdge__),
	__FKleftVar__ Integer,
	__FKrightExpression__ Integer,
	__FKsrcEquation__ Integer,
	__FKassertion__ Integer,
	__FKdstEquation__ Integer
) ;

CREATE TABLE RPoint (
	__IDRPoint__ Integer NOT NULL,
	PRIMARY KEY RPoint (__IDRPoint__)
) ;

CREATE TABLE RSize (
	__IDRSize__ Integer NOT NULL,
	PRIMARY KEY RSize (__IDRSize__)
) ;

CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	DefinedIn text,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE StateObj (
	__IDStateObj__ Integer NOT NULL,
	PRIMARY KEY StateObj (__IDStateObj__)
) ;

CREATE TABLE GraphicalObject (
	__IDGraphicalObject__ Integer NOT NULL,
	PRIMARY KEY GraphicalObject (__IDGraphicalObject__)
) ;

CREATE TABLE StInputOutput (
	__IDStInputOutput__ Integer NOT NULL,
	name text,
	type text,
	clock Boolean,
	const Boolean,
	optional Boolean,
	PRIMARY KEY StInputOutput (__IDStInputOutput__)
) ;

CREATE TABLE StInitInput (
	__IDStInitInput__ Integer NOT NULL,
	PRIMARY KEY StInitInput (__IDStInitInput__)
) ;

CREATE TABLE StInput (
	__IDStInput__ Integer NOT NULL,
	PRIMARY KEY StInput (__IDStInput__)
) ;

CREATE TABLE StOutput (
	__IDStOutput__ Integer NOT NULL,
	PRIMARY KEY StOutput (__IDStOutput__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	conditions text,
	transKind Integer,
	FOREIGN KEY state1 (__FKstate1__) REFERENCES State (__IDState__),
	FOREIGN KEY state2 (__FKstate2__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKstate1__ Integer,
	__FKstate2__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	name text,
	cx "Double",
	cy "Double",
	FOREIGN KEY stOutput (__FKstOutput__) REFERENCES StOutput (__IDStOutput__),
	PRIMARY KEY State (__IDState__),
	__FKstOutput__ Integer
) ;

CREATE TABLE InitialStPtr (
	__IDInitialStPtr__ Integer NOT NULL,
	cx "Double",
	cy "Double",
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY InitialStPtr (__IDInitialStPtr__),
	__FKstate__ Integer
) ;

CREATE TABLE StateMachine (
	__IDStateMachine__ Integer NOT NULL,
	FOREIGN KEY initialStPtr (__FKinitialStPtr__) REFERENCES InitialStPtr (__IDInitialStPtr__),
	PRIMARY KEY StateMachine (__IDStateMachine__),
	__FKinitialStPtr__ Integer
) ;

CREATE TABLE Base (
	__IDBase__ Integer NOT NULL,
	DefineIn text,
	PRIMARY KEY Base (__IDBase__)
) ;

CREATE TABLE StateBase (
	__IDStateBase__ Integer NOT NULL,
	PRIMARY KEY StateBase (__IDStateBase__)
) ;

CREATE TABLE AnnNote (
	__IDAnnNote__ Integer NOT NULL,
	name text,
	modified Boolean,
	FOREIGN KEY annNoteType (__FKannNoteType__) REFERENCES AnnNoteType (__IDAnnNoteType__),
	FOREIGN KEY annotable (__FKannotable__) REFERENCES Annotable (__IDAnnotable__),
	PRIMARY KEY AnnNote (__IDAnnNote__),
	__FKannNoteType__ Integer,
	__FKannotable__ Integer
) ;

CREATE TABLE AnnAttValue (
	__IDAnnAttValue__ Integer NOT NULL,
	FOREIGN KEY annNote (__FKannNote__) REFERENCES AnnNote (__IDAnnNote__),
	FOREIGN KEY annAttDefinition (__FKannAttDefinition__) REFERENCES AnnAttDefinition (__IDAnnAttDefinition__),
	PRIMARY KEY AnnAttValue (__IDAnnAttValue__),
	__FKannNote__ Integer,
	__FKannAttDefinition__ Integer
) ;

CREATE TABLE AnnNoteType (
	__IDAnnNoteType__ Integer NOT NULL,
	name text,
	FOREIGN KEY annAttDefinition (__FKannAttDefinition__) REFERENCES AnnAttDefinition (__IDAnnAttDefinition__),
	FOREIGN KEY annAttGroup (__FKannAttGroup__) REFERENCES AnnAttGroup (__IDAnnAttGroup__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES AnnotSchema (__IDAnnotSchema__),
	PRIMARY KEY AnnNoteType (__IDAnnNoteType__),
	__FKannAttDefinition__ Integer,
	__FKannAttGroup__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE AnnAttDefinition (
	__IDAnnAttDefinition__ Integer NOT NULL,
	name text,
	type Integer,
	FOREIGN KEY annAttGroup (__FKannAttGroup__) REFERENCES AnnAttGroup (__IDAnnAttGroup__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES AnnNoteType (__IDAnnNoteType__),
	FOREIGN KEY annProperty (__FKannProperty__) REFERENCES AnnProperty (__IDAnnProperty__),
	PRIMARY KEY AnnAttDefinition (__IDAnnAttDefinition__),
	__FKannAttGroup__ Integer,
	__FKkey__ Integer,
	__FKannProperty__ Integer
) ;

CREATE TABLE AnnAttIntValue (
	__IDAnnAttIntValue__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY AnnAttIntValue (__IDAnnAttIntValue__)
) ;

CREATE TABLE AnnAttBoolValue (
	__IDAnnAttBoolValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY AnnAttBoolValue (__IDAnnAttBoolValue__)
) ;

CREATE TABLE AnnAttCharValue (
	__IDAnnAttCharValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY AnnAttCharValue (__IDAnnAttCharValue__)
) ;

CREATE TABLE AnnAttRealValue (
	__IDAnnAttRealValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY AnnAttRealValue (__IDAnnAttRealValue__)
) ;

CREATE TABLE AnnAttStringValue (
	__IDAnnAttStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY AnnAttStringValue (__IDAnnAttStringValue__)
) ;

CREATE TABLE AnnAttFileValue (
	__IDAnnAttFileValue__ Integer NOT NULL,
	PRIMARY KEY AnnAttFileValue (__IDAnnAttFileValue__)
) ;

CREATE TABLE AnnAttDateValue (
	__IDAnnAttDateValue__ Integer NOT NULL,
	PRIMARY KEY AnnAttDateValue (__IDAnnAttDateValue__)
) ;

CREATE TABLE AnnAttOidValue (
	__IDAnnAttOidValue__ Integer NOT NULL,
	PRIMARY KEY AnnAttOidValue (__IDAnnAttOidValue__)
) ;

CREATE TABLE AnnAttEnumValue (
	__IDAnnAttEnumValue__ Integer NOT NULL,
	PRIMARY KEY AnnAttEnumValue (__IDAnnAttEnumValue__)
) ;

CREATE TABLE AnnProperty (
	__IDAnnProperty__ Integer NOT NULL,
	name text,
	type Integer,
	FOREIGN KEY "key" (__FKkey__) REFERENCES AnnAttDefinition (__IDAnnAttDefinition__),
	PRIMARY KEY AnnProperty (__IDAnnProperty__),
	__FKkey__ Integer
) ;

CREATE TABLE AnnPropertyInt (
	__IDAnnPropertyInt__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY AnnPropertyInt (__IDAnnPropertyInt__)
) ;

CREATE TABLE AnnPropertyBool (
	__IDAnnPropertyBool__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY AnnPropertyBool (__IDAnnPropertyBool__)
) ;

CREATE TABLE AnnPropertyChar (
	__IDAnnPropertyChar__ Integer NOT NULL,
	value text,
	PRIMARY KEY AnnPropertyChar (__IDAnnPropertyChar__)
) ;

CREATE TABLE AnnPropertyReal (
	__IDAnnPropertyReal__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY AnnPropertyReal (__IDAnnPropertyReal__)
) ;

CREATE TABLE AnnPropertyString (
	__IDAnnPropertyString__ Integer NOT NULL,
	value text,
	PRIMARY KEY AnnPropertyString (__IDAnnPropertyString__)
) ;

CREATE TABLE AnnPropertyEnum (
	__IDAnnPropertyEnum__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES Object (__IDObject__),
	PRIMARY KEY AnnPropertyEnum (__IDAnnPropertyEnum__),
	__FKvalue__ Integer
) ;

CREATE TABLE AnnotSchema (
	__IDAnnotSchema__ Integer NOT NULL,
	pathname text,
	FOREIGN KEY annNoteType (__FKannNoteType__) REFERENCES AnnNoteType (__IDAnnNoteType__),
	FOREIGN KEY annCategory (__FKannCategory__) REFERENCES AnnCategory (__IDAnnCategory__),
	PRIMARY KEY AnnotSchema (__IDAnnotSchema__),
	__FKannNoteType__ Integer,
	__FKannCategory__ Integer
) ;

CREATE TABLE AnnCategory (
	__IDAnnCategory__ Integer NOT NULL,
	name text,
	FOREIGN KEY "key" (__FKkey__) REFERENCES AnnotSchema (__IDAnnotSchema__),
	PRIMARY KEY AnnCategory (__IDAnnCategory__),
	__FKkey__ Integer
) ;

CREATE TABLE Annotability (
	__IDAnnotability__ Integer NOT NULL,
	minCardinality Integer,
	maxCardinality Integer,
	defaultNote Boolean,
	FOREIGN KEY annNoteType (__FKannNoteType__) REFERENCES AnnNoteType (__IDAnnNoteType__),
	PRIMARY KEY Annotability (__IDAnnotability__),
	__FKannNoteType__ Integer
) ;

CREATE TABLE AnnAttGroup (
	__IDAnnAttGroup__ Integer NOT NULL,
	name text,
	FOREIGN KEY "key" (__FKkey__) REFERENCES AnnNoteType (__IDAnnNoteType__),
	PRIMARY KEY AnnAttGroup (__IDAnnAttGroup__),
	__FKkey__ Integer
) ;

CREATE TABLE File (
	__IDFile__ Integer NOT NULL,
	PRIMARY KEY File (__IDFile__)
) ;

CREATE TABLE MtcApplication (
	__IDMtcApplication__ Integer NOT NULL,
	FOREIGN KEY modelM (__FKmodelM__) REFERENCES Model (__IDModel__),
	PRIMARY KEY MtcApplication (__IDMtcApplication__),
	__FKmodelM__ Integer
) ;

CREATE TABLE CoverageFile (
	__IDCoverageFile__ Integer NOT NULL,
	FOREIGN KEY record (__FKrecord__) REFERENCES Record (__IDRecord__),
	FOREIGN KEY modelCov (__FKmodelCov__) REFERENCES Model (__IDModel__),
	FOREIGN KEY application (__FKapplication__) REFERENCES MtcApplication (__IDMtcApplication__),
	FOREIGN KEY recordCov (__FKrecordCov__) REFERENCES Record (__IDRecord__),
	PRIMARY KEY CoverageFile (__IDCoverageFile__),
	__FKrecord__ Integer,
	__FKmodelCov__ Integer,
	__FKapplication__ Integer,
	__FKrecordCov__ Integer
) ;

CREATE TABLE CriterionFile (
	__IDCriterionFile__ Integer NOT NULL,
	FOREIGN KEY application (__FKapplication__) REFERENCES MtcApplication (__IDMtcApplication__),
	FOREIGN KEY modelCri (__FKmodelCri__) REFERENCES Model (__IDModel__),
	PRIMARY KEY CriterionFile (__IDCriterionFile__),
	__FKapplication__ Integer,
	__FKmodelCri__ Integer
) ;

CREATE TABLE MtcEntity (
	__IDMtcEntity__ Integer NOT NULL,
	FOREIGN KEY file (__FKfile__) REFERENCES File (__IDFile__),
	PRIMARY KEY MtcEntity (__IDMtcEntity__),
	__FKfile__ Integer
) ;

CREATE TABLE HistoryEntry (
	__IDHistoryEntry__ Integer NOT NULL,
	PRIMARY KEY HistoryEntry (__IDHistoryEntry__)
) ;

CREATE TABLE Criterion (
	__IDCriterion__ Integer NOT NULL,
	ident text,
	name text,
	description text,
	FOREIGN KEY criterionFileC (__FKcriterionFileC__) REFERENCES CriterionFile (__IDCriterionFile__),
	FOREIGN KEY operatorC (__FKoperatorC__) REFERENCES Operator (__IDOperator__),
	PRIMARY KEY Criterion (__IDCriterion__),
	__FKcriterionFileC__ Integer,
	__FKoperatorC__ Integer
) ;

CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	"index" Integer,
	occ text,
	FOREIGN KEY modelI (__FKmodelI__) REFERENCES Model (__IDModel__),
	FOREIGN KEY operatorI (__FKoperatorI__) REFERENCES Operator (__IDOperator__),
	FOREIGN KEY associationClassI (__FKassociationClassI__) REFERENCES AssociationClass (__IDAssociationClass__),
	FOREIGN KEY caller (__FKcaller__) REFERENCES Instance (__IDInstance__),
	FOREIGN KEY origin (__FKorigin__) REFERENCES Instance (__IDInstance__),
	PRIMARY KEY Instance (__IDInstance__),
	__FKmodelI__ Integer,
	__FKoperatorI__ Integer,
	__FKassociationClassI__ Integer,
	__FKcaller__ Integer,
	__FKorigin__ Integer
) ;

CREATE TABLE AssociationClass (
	__IDAssociationClass__ Integer NOT NULL,
	FOREIGN KEY resultA (__FKresultA__) REFERENCES Result (__IDResult__),
	PRIMARY KEY AssociationClass (__IDAssociationClass__),
	__FKresultA__ Integer
) ;

CREATE TABLE Result (
	__IDResult__ Integer NOT NULL,
	elementCount Integer,
	FOREIGN KEY associationClassRs (__FKassociationClassRs__) REFERENCES AssociationClass (__IDAssociationClass__),
	FOREIGN KEY record (__FKrecord__) REFERENCES Record (__IDRecord__),
	PRIMARY KEY Result (__IDResult__),
	__FKassociationClassRs__ Integer,
	__FKrecord__ Integer
) ;

CREATE TABLE Record (
	__IDRecord__ Integer NOT NULL,
	creator text,
	name text,
	date text,
	author text,
	description text,
	FOREIGN KEY "key" (__FKkey__) REFERENCES CoverageFile (__IDCoverageFile__),
	FOREIGN KEY associationClassRc (__FKassociationClassRc__) REFERENCES AssociationClass (__IDAssociationClass__),
	FOREIGN KEY coverageFileR (__FKcoverageFileR__) REFERENCES CoverageFile (__IDCoverageFile__),
	PRIMARY KEY Record (__IDRecord__),
	__FKkey__ Integer,
	__FKassociationClassRc__ Integer,
	__FKcoverageFileR__ Integer
) ;

CREATE TABLE Loader (
	__IDLoader__ Integer NOT NULL,
	FOREIGN KEY descriptor (__FKdescriptor__) REFERENCES Descriptor (__IDDescriptor__),
	FOREIGN KEY session (__FKsession__) REFERENCES Session (__IDSession__),
	PRIMARY KEY Loader (__IDLoader__),
	__FKdescriptor__ Integer,
	__FKsession__ Integer
) ;

CREATE TABLE Model_storageUnitM_StorageUnit (
	__IDModel__ Integer NOT NULL,
	__IDStorageUnit__ Integer NOT NULL
) ;

CREATE TABLE Model_importedOperator_Operator (
	__IDModel__ Integer NOT NULL,
	__IDOperator__ Integer NOT NULL
) ;

CREATE TABLE Model_client_Model (
	__IDModel__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE Model_libraries_Model (
	__IDModel__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE Model_allLibry_Model (
	__IDModel__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE Model_typeM_Type (
	__IDModel__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Model_all_Operator (
	__IDModel__ Integer NOT NULL,
	__IDOperator__ Integer NOT NULL
) ;

CREATE TABLE Model_reference_Reference (
	__IDModel__ Integer NOT NULL,
	__IDReference__ Integer NOT NULL
) ;

CREATE TABLE Model_tmpNode_Node (
	__IDModel__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Implementation_namedTypeI_NamedType (
	__IDImplementation__ Integer NOT NULL,
	__IDNamedType__ Integer NOT NULL
) ;

CREATE TABLE Session_loadsModel_Model (
	__IDSession__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE Descriptor_libraryModels_ListString (
	__IDDescriptor__ Integer NOT NULL,
	__IDListString__ Integer NOT NULL
) ;

CREATE TABLE Descriptor_annTypeFiles_ListString (
	__IDDescriptor__ Integer NOT NULL,
	__IDListString__ Integer NOT NULL
) ;

CREATE TABLE StorageUnit_element_StorageElement (
	__IDStorageUnit__ Integer NOT NULL,
	__IDStorageElement__ Integer NOT NULL
) ;

CREATE TABLE ModelBlock_columnsSize_ListInteger (
	__IDModelBlock__ Integer NOT NULL,
	__IDListInteger__ Integer NOT NULL
) ;

CREATE TABLE Expression_subExprId_ExprId (
	__IDExpression__ Integer NOT NULL,
	__IDExprId__ Integer NOT NULL
) ;

CREATE TABLE ExprContact_initValue_Expression (
	__IDExprContact__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ExprCall_parameter_Expression (
	__IDExprCall__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE Operator_input_LocalVariable (
	__IDOperator__ Integer NOT NULL,
	__IDLocalVariable__ Integer NOT NULL
) ;

CREATE TABLE Operator_output_LocalVariable (
	__IDOperator__ Integer NOT NULL,
	__IDLocalVariable__ Integer NOT NULL
) ;

CREATE TABLE Operator_hidden_LocalVariable (
	__IDOperator__ Integer NOT NULL,
	__IDLocalVariable__ Integer NOT NULL
) ;

CREATE TABLE Operator_client_EqBlock (
	__IDOperator__ Integer NOT NULL,
	__IDEqBlock__ Integer NOT NULL
) ;

CREATE TABLE Operator_intanceO_Instance (
	__IDOperator__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Node_local_LocalVariable (
	__IDNode__ Integer NOT NULL,
	__IDLocalVariable__ Integer NOT NULL
) ;

CREATE TABLE Node_internal_LocalVariable (
	__IDNode__ Integer NOT NULL,
	__IDLocalVariable__ Integer NOT NULL
) ;

CREATE TABLE ParamBlock_columnsSize_ListInteger (
	__IDParamBlock__ Integer NOT NULL,
	__IDListInteger__ Integer NOT NULL
) ;

CREATE TABLE ParamBlock_array_ParamArray (
	__IDParamBlock__ Integer NOT NULL,
	__IDParamArray__ Integer NOT NULL
) ;

CREATE TABLE ParamArray_notes_ListString (
	__IDParamArray__ Integer NOT NULL,
	__IDListString__ Integer NOT NULL
) ;

CREATE TABLE ParamArray_value_Expression (
	__IDParamArray__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE ConstVar_client_EqBlock (
	__IDConstVar__ Integer NOT NULL,
	__IDEqBlock__ Integer NOT NULL
) ;

CREATE TABLE Variable_definition_Equation (
	__IDVariable__ Integer NOT NULL,
	__IDEquation__ Integer NOT NULL
) ;

CREATE TABLE Type_usedType_Type (
	__IDType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Type_namedTypeT_NamedType (
	__IDType__ Integer NOT NULL,
	__IDNamedType__ Integer NOT NULL
) ;

CREATE TABLE Type_tableT_Table (
	__IDType__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE Type_compositeElementT_CompositeElement (
	__IDType__ Integer NOT NULL,
	__IDCompositeElement__ Integer NOT NULL
) ;

CREATE TABLE Type_constVar_ConstVar (
	__IDType__ Integer NOT NULL,
	__IDConstVar__ Integer NOT NULL
) ;

CREATE TABLE NamedType_refinement_NamedType (
	__IDNamedType__ Integer NOT NULL,
	__IDNamedType__ Integer NOT NULL
) ;

CREATE TABLE NamedType_refined_NamedType (
	__IDNamedType__ Integer NOT NULL,
	__IDNamedType__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_value_Constant (
	__IDEnumeration__ Integer NOT NULL,
	__IDConstant__ Integer NOT NULL
) ;

CREATE TABLE EqBlock_equation_Equation (
	__IDEqBlock__ Integer NOT NULL,
	__IDEquation__ Integer NOT NULL
) ;

CREATE TABLE EqBlock_calledOperator_Operator (
	__IDEqBlock__ Integer NOT NULL,
	__IDOperator__ Integer NOT NULL
) ;

CREATE TABLE EqBlock_referencedId_ConstVar (
	__IDEqBlock__ Integer NOT NULL,
	__IDConstVar__ Integer NOT NULL
) ;

CREATE TABLE Equation_left_Variable (
	__IDEquation__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Equation_outEdge_Edge (
	__IDEquation__ Integer NOT NULL,
	__IDEdge__ Integer NOT NULL
) ;

CREATE TABLE Annotable_propA_Prop (
	__IDAnnotable__ Integer NOT NULL,
	__IDProp__ Integer NOT NULL
) ;

CREATE TABLE Prop_values_ListString (
	__IDProp__ Integer NOT NULL,
	__IDListString__ Integer NOT NULL
) ;

CREATE TABLE Configuration_propC_Prop (
	__IDConfiguration__ Integer NOT NULL,
	__IDProp__ Integer NOT NULL
) ;

CREATE TABLE Project_configuration_Configuration (
	__IDProject__ Integer NOT NULL,
	__IDConfiguration__ Integer NOT NULL
) ;

CREATE TABLE Project_fileRef_FileRef (
	__IDProject__ Integer NOT NULL,
	__IDFileRef__ Integer NOT NULL
) ;

CREATE TABLE Project_owner_Element (
	__IDProject__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Folder_element_Element (
	__IDFolder__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Edge_position_RPoint (
	__IDEdge__ Integer NOT NULL,
	__IDRPoint__ Integer NOT NULL
) ;

CREATE TABLE State_transition1_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE State_transition2_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_state_State (
	__IDStateMachine__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE StateMachine_transition_Transition (
	__IDStateMachine__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE AnnNote_annAttValue_AnnAttValue (
	__IDAnnNote__ Integer NOT NULL,
	__IDAnnAttValue__ Integer NOT NULL
) ;

CREATE TABLE AnnCategory_anootability_Annotability (
	__IDAnnCategory__ Integer NOT NULL,
	__IDAnnotability__ Integer NOT NULL
) ;

CREATE TABLE MtcApplication_coverageFileCov_CoverageFile (
	__IDMtcApplication__ Integer NOT NULL,
	__IDCoverageFile__ Integer NOT NULL
) ;

CREATE TABLE MtcApplication_criterionFileCri_CriterionFile (
	__IDMtcApplication__ Integer NOT NULL,
	__IDCriterionFile__ Integer NOT NULL
) ;

CREATE TABLE CriterionFile_criterionC_Criterion (
	__IDCriterionFile__ Integer NOT NULL,
	__IDCriterion__ Integer NOT NULL
) ;

CREATE TABLE Criterion_element_Element (
	__IDCriterion__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Instance_called_Instance (
	__IDInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Instance_related_Instance (
	__IDInstance__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE AssociationClass_recordA_Record (
	__IDAssociationClass__ Integer NOT NULL,
	__IDRecord__ Integer NOT NULL
) ;

CREATE TABLE AssociationClass_instanceA_Instance (
	__IDAssociationClass__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Record_result_Result (
	__IDRecord__ Integer NOT NULL,
	__IDResult__ Integer NOT NULL
) ;
