CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE ACG (
	__IDACG__ Integer NOT NULL,
	metamodel text,
	startsWith text,
	PRIMARY KEY ACG (__IDACG__)
) ;

CREATE TABLE ACGElement (
	__IDACGElement__ Integer NOT NULL,
	FOREIGN KEY acg (__FKacg__) REFERENCES ACG (__IDACG__),
	PRIMARY KEY ACGElement (__IDACGElement__),
	__FKacg__ Integer
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	context text,
	name text,
	FOREIGN KEY body (__FKbody__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Function (__IDFunction__),
	__FKbody__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	context text,
	name text,
	FOREIGN KEY body (__FKbody__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKbody__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	element text,
	mode text,
	FOREIGN KEY guard (__FKguard__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Node (__IDNode__),
	__FKguard__ Integer
) ;

CREATE TABLE ASMNode (
	__IDASMNode__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ASMNode (__IDASMNode__),
	__FKname__ Integer
) ;

CREATE TABLE CodeNode (
	__IDCodeNode__ Integer NOT NULL,
	PRIMARY KEY CodeNode (__IDCodeNode__)
) ;

CREATE TABLE SimpleNode (
	__IDSimpleNode__ Integer NOT NULL,
	PRIMARY KEY SimpleNode (__IDSimpleNode__)
) ;

CREATE TABLE StatementBlock (
	__IDStatementBlock__ Integer NOT NULL,
	PRIMARY KEY StatementBlock (__IDStatementBlock__)
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE CompoundStat (
	__IDCompoundStat__ Integer NOT NULL,
	PRIMARY KEY CompoundStat (__IDCompoundStat__)
) ;

CREATE TABLE ForEachStat (
	__IDForEachStat__ Integer NOT NULL,
	FOREIGN KEY iterator (__FKiterator__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY collection (__FKcollection__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ForEachStat (__IDForEachStat__),
	__FKiterator__ Integer,
	__FKcollection__ Integer
) ;

CREATE TABLE OnceStat (
	__IDOnceStat__ Integer NOT NULL,
	PRIMARY KEY OnceStat (__IDOnceStat__)
) ;

CREATE TABLE VariableStat (
	__IDVariableStat__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY VariableStat (__IDVariableStat__),
	__FKdefinition__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE OperationStat (
	__IDOperationStat__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY name (__FKname__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY OperationStat (__IDOperationStat__),
	__FKcontext__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE ConditionalStat (
	__IDConditionalStat__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ConditionalStat (__IDConditionalStat__),
	__FKcondition__ Integer
) ;

CREATE TABLE LetStat (
	__IDLetStat__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY LetStat (__IDLetStat__),
	__FKvariable__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE AnalyzeStat (
	__IDAnalyzeStat__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Expression (__IDExpression__),
	mode text,
	PRIMARY KEY AnalyzeStat (__IDAnalyzeStat__),
	__FKtarget__ Integer
) ;

CREATE TABLE ReportStat (
	__IDReportStat__ Integer NOT NULL,
	severity text,
	FOREIGN KEY message (__FKmessage__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ReportStat (__IDReportStat__),
	__FKmessage__ Integer
) ;

CREATE TABLE FieldStat (
	__IDFieldStat__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY type (__FKtype__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY FieldStat (__IDFieldStat__),
	__FKname__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE ParamStat (
	__IDParamStat__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY type (__FKtype__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY ParamStat (__IDParamStat__),
	__FKname__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE EmitStat (
	__IDEmitStat__ Integer NOT NULL,
	PRIMARY KEY EmitStat (__IDEmitStat__)
) ;

CREATE TABLE LabelStat (
	__IDLabelStat__ Integer NOT NULL,
	name text,
	FOREIGN KEY id (__FKid__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY LabelStat (__IDLabelStat__),
	__FKid__ Integer
) ;

CREATE TABLE NewStat (
	__IDNewStat__ Integer NOT NULL,
	PRIMARY KEY NewStat (__IDNewStat__)
) ;

CREATE TABLE DupStat (
	__IDDupStat__ Integer NOT NULL,
	PRIMARY KEY DupStat (__IDDupStat__)
) ;

CREATE TABLE DupX1Stat (
	__IDDupX1Stat__ Integer NOT NULL,
	PRIMARY KEY DupX1Stat (__IDDupX1Stat__)
) ;

CREATE TABLE PopStat (
	__IDPopStat__ Integer NOT NULL,
	PRIMARY KEY PopStat (__IDPopStat__)
) ;

CREATE TABLE SwapStat (
	__IDSwapStat__ Integer NOT NULL,
	PRIMARY KEY SwapStat (__IDSwapStat__)
) ;

CREATE TABLE IterateStat (
	__IDIterateStat__ Integer NOT NULL,
	PRIMARY KEY IterateStat (__IDIterateStat__)
) ;

CREATE TABLE EndIterateStat (
	__IDEndIterateStat__ Integer NOT NULL,
	PRIMARY KEY EndIterateStat (__IDEndIterateStat__)
) ;

CREATE TABLE GetAsmStat (
	__IDGetAsmStat__ Integer NOT NULL,
	PRIMARY KEY GetAsmStat (__IDGetAsmStat__)
) ;

CREATE TABLE FindMEStat (
	__IDFindMEStat__ Integer NOT NULL,
	PRIMARY KEY FindMEStat (__IDFindMEStat__)
) ;

CREATE TABLE PushTStat (
	__IDPushTStat__ Integer NOT NULL,
	PRIMARY KEY PushTStat (__IDPushTStat__)
) ;

CREATE TABLE PushFStat (
	__IDPushFStat__ Integer NOT NULL,
	PRIMARY KEY PushFStat (__IDPushFStat__)
) ;

CREATE TABLE EmitWithOperandStat (
	__IDEmitWithOperandStat__ Integer NOT NULL,
	FOREIGN KEY operand (__FKoperand__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY EmitWithOperandStat (__IDEmitWithOperandStat__),
	__FKoperand__ Integer
) ;

CREATE TABLE PushStat (
	__IDPushStat__ Integer NOT NULL,
	PRIMARY KEY PushStat (__IDPushStat__)
) ;

CREATE TABLE PushIStat (
	__IDPushIStat__ Integer NOT NULL,
	PRIMARY KEY PushIStat (__IDPushIStat__)
) ;

CREATE TABLE PushDStat (
	__IDPushDStat__ Integer NOT NULL,
	PRIMARY KEY PushDStat (__IDPushDStat__)
) ;

CREATE TABLE LoadStat (
	__IDLoadStat__ Integer NOT NULL,
	PRIMARY KEY LoadStat (__IDLoadStat__)
) ;

CREATE TABLE StoreStat (
	__IDStoreStat__ Integer NOT NULL,
	PRIMARY KEY StoreStat (__IDStoreStat__)
) ;

CREATE TABLE CallStat (
	__IDCallStat__ Integer NOT NULL,
	PRIMARY KEY CallStat (__IDCallStat__)
) ;

CREATE TABLE PCallStat (
	__IDPCallStat__ Integer NOT NULL,
	PRIMARY KEY PCallStat (__IDPCallStat__)
) ;

CREATE TABLE SuperCallStat (
	__IDSuperCallStat__ Integer NOT NULL,
	PRIMARY KEY SuperCallStat (__IDSuperCallStat__)
) ;

CREATE TABLE GetStat (
	__IDGetStat__ Integer NOT NULL,
	PRIMARY KEY GetStat (__IDGetStat__)
) ;

CREATE TABLE SetStat (
	__IDSetStat__ Integer NOT NULL,
	PRIMARY KEY SetStat (__IDSetStat__)
) ;

CREATE TABLE EmitWithLabelRefStat (
	__IDEmitWithLabelRefStat__ Integer NOT NULL,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES LabelStat (__IDLabelStat__),
	PRIMARY KEY EmitWithLabelRefStat (__IDEmitWithLabelRefStat__),
	__FKlabel__ Integer
) ;

CREATE TABLE IfStat (
	__IDIfStat__ Integer NOT NULL,
	PRIMARY KEY IfStat (__IDIfStat__)
) ;

CREATE TABLE GotoStat (
	__IDGotoStat__ Integer NOT NULL,
	PRIMARY KEY GotoStat (__IDGotoStat__)
) ;

CREATE TABLE VariableDecl (
	__IDVariableDecl__ Integer NOT NULL,
	name text,
	PRIMARY KEY VariableDecl (__IDVariableDecl__)
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE VariableExp (
	__IDVariableExp__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES VariableDecl (__IDVariableDecl__),
	PRIMARY KEY VariableExp (__IDVariableExp__),
	__FKvariable__ Integer
) ;

CREATE TABLE SelfExp (
	__IDSelfExp__ Integer NOT NULL,
	PRIMARY KEY SelfExp (__IDSelfExp__)
) ;

CREATE TABLE LastExp (
	__IDLastExp__ Integer NOT NULL,
	PRIMARY KEY LastExp (__IDLastExp__)
) ;

CREATE TABLE IfExp (
	__IDIfExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY thenExp (__FKthenExp__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY elseExp (__FKelseExp__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY IfExp (__IDIfExp__),
	__FKcondition__ Integer,
	__FKthenExp__ Integer,
	__FKelseExp__ Integer
) ;

CREATE TABLE IsAExp (
	__IDIsAExp__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Expression (__IDExpression__),
	type text,
	PRIMARY KEY IsAExp (__IDIsAExp__),
	__FKsource__ Integer
) ;

CREATE TABLE LetExp (
	__IDLetExp__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY "in" (__FKin__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY LetExp (__IDLetExp__),
	__FKvariable__ Integer,
	__FKvalue__ Integer,
	__FKin__ Integer
) ;

CREATE TABLE PropertyCallExp (
	__IDPropertyCallExp__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Expression (__IDExpression__),
	name text,
	PRIMARY KEY PropertyCallExp (__IDPropertyCallExp__),
	__FKsource__ Integer
) ;

CREATE TABLE NavigationExp (
	__IDNavigationExp__ Integer NOT NULL,
	PRIMARY KEY NavigationExp (__IDNavigationExp__)
) ;

CREATE TABLE IteratorExp (
	__IDIteratorExp__ Integer NOT NULL,
	FOREIGN KEY iterator (__FKiterator__) REFERENCES VariableDecl (__IDVariableDecl__),
	FOREIGN KEY body (__FKbody__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY IteratorExp (__IDIteratorExp__),
	__FKiterator__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE OperationCallExp (
	__IDOperationCallExp__ Integer NOT NULL,
	PRIMARY KEY OperationCallExp (__IDOperationCallExp__)
) ;

CREATE TABLE OperatorCallExp (
	__IDOperatorCallExp__ Integer NOT NULL,
	PRIMARY KEY OperatorCallExp (__IDOperatorCallExp__)
) ;

CREATE TABLE LiteralExp (
	__IDLiteralExp__ Integer NOT NULL,
	PRIMARY KEY LiteralExp (__IDLiteralExp__)
) ;

CREATE TABLE OclUndefinedExp (
	__IDOclUndefinedExp__ Integer NOT NULL,
	PRIMARY KEY OclUndefinedExp (__IDOclUndefinedExp__)
) ;

CREATE TABLE CollectionExp (
	__IDCollectionExp__ Integer NOT NULL,
	PRIMARY KEY CollectionExp (__IDCollectionExp__)
) ;

CREATE TABLE SequenceExp (
	__IDSequenceExp__ Integer NOT NULL,
	PRIMARY KEY SequenceExp (__IDSequenceExp__)
) ;

CREATE TABLE BooleanExp (
	__IDBooleanExp__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanExp (__IDBooleanExp__)
) ;

CREATE TABLE IntegerExp (
	__IDIntegerExp__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerExp (__IDIntegerExp__)
) ;

CREATE TABLE StringExp (
	__IDStringExp__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringExp (__IDStringExp__)
) ;

CREATE TABLE ACG_elements_ACGElement (
	__IDACG__ Integer NOT NULL,
	__IDACGElement__ Integer NOT NULL
) ;

CREATE TABLE Function_parameters_Parameter (
	__IDFunction__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE StatementBlock_statements_Statement (
	__IDStatementBlock__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE ConditionalStat_elseStatements_Statement (
	__IDConditionalStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE OperationCallExp_arguments_Expression (
	__IDOperationCallExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE CollectionExp_elements_Expression (
	__IDCollectionExp__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;
