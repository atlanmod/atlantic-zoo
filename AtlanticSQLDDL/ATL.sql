CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Unit (
	__IDUnit__ Integer NOT NULL,
	name text,
	PRIMARY KEY Unit (__IDUnit__)
) ;

CREATE TABLE Library (
	__IDLibrary__ Integer NOT NULL,
	PRIMARY KEY Library (__IDLibrary__)
) ;

CREATE TABLE Query (
	__IDQuery__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY Query (__IDQuery__),
	__FKbody__ Integer
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	isRefining Boolean,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE ModuleElement (
	__IDModuleElement__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY ModuleElement (__IDModuleElement__),
	__FKmodule__ Integer
) ;

CREATE TABLE Helper (
	__IDHelper__ Integer NOT NULL,
	FOREIGN KEY query (__FKquery__) REFERENCES Query (__IDQuery__),
	FOREIGN KEY library (__FKlibrary__) REFERENCES Library (__IDLibrary__),
	FOREIGN KEY definition (__FKdefinition__) REFERENCES OclFeatureDefinition (__IDOclFeatureDefinition__),
	PRIMARY KEY Helper (__IDHelper__),
	__FKquery__ Integer,
	__FKlibrary__ Integer,
	__FKdefinition__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY outPattern (__FKoutPattern__) REFERENCES OutPattern (__IDOutPattern__),
	FOREIGN KEY actionBlock (__FKactionBlock__) REFERENCES ActionBlock (__IDActionBlock__),
	name text,
	PRIMARY KEY Rule (__IDRule__),
	__FKoutPattern__ Integer,
	__FKactionBlock__ Integer
) ;

CREATE TABLE MatchedRule (
	__IDMatchedRule__ Integer NOT NULL,
	FOREIGN KEY inPattern (__FKinPattern__) REFERENCES InPattern (__IDInPattern__),
	FOREIGN KEY superRule (__FKsuperRule__) REFERENCES MatchedRule (__IDMatchedRule__),
	isAbstract Boolean,
	isRefining Boolean,
	isNoDefault Boolean,
	PRIMARY KEY MatchedRule (__IDMatchedRule__),
	__FKinPattern__ Integer,
	__FKsuperRule__ Integer
) ;

CREATE TABLE LazyMatchedRule (
	__IDLazyMatchedRule__ Integer NOT NULL,
	isUnique Boolean,
	PRIMARY KEY LazyMatchedRule (__IDLazyMatchedRule__)
) ;

CREATE TABLE CalledRule (
	__IDCalledRule__ Integer NOT NULL,
	isEntrypoint Boolean,
	isEndpoint Boolean,
	PRIMARY KEY CalledRule (__IDCalledRule__)
) ;

CREATE TABLE InPattern (
	__IDInPattern__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES MatchedRule (__IDMatchedRule__),
	FOREIGN KEY filter (__FKfilter__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY InPattern (__IDInPattern__),
	__FKrule__ Integer,
	__FKfilter__ Integer
) ;

CREATE TABLE OutPattern (
	__IDOutPattern__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY OutPattern (__IDOutPattern__),
	__FKrule__ Integer
) ;

CREATE TABLE PatternElement (
	__IDPatternElement__ Integer NOT NULL,
	PRIMARY KEY PatternElement (__IDPatternElement__)
) ;

CREATE TABLE InPatternElement (
	__IDInPatternElement__ Integer NOT NULL,
	FOREIGN KEY mapsTo (__FKmapsTo__) REFERENCES OutPatternElement (__IDOutPatternElement__),
	FOREIGN KEY inPattern (__FKinPattern__) REFERENCES InPattern (__IDInPattern__),
	PRIMARY KEY InPatternElement (__IDInPatternElement__),
	__FKmapsTo__ Integer,
	__FKinPattern__ Integer
) ;

CREATE TABLE SimpleInPatternElement (
	__IDSimpleInPatternElement__ Integer NOT NULL,
	PRIMARY KEY SimpleInPatternElement (__IDSimpleInPatternElement__)
) ;

CREATE TABLE OutPatternElement (
	__IDOutPatternElement__ Integer NOT NULL,
	FOREIGN KEY outPattern (__FKoutPattern__) REFERENCES OutPattern (__IDOutPattern__),
	FOREIGN KEY sourceElement (__FKsourceElement__) REFERENCES InPatternElement (__IDInPatternElement__),
	FOREIGN KEY model (__FKmodel__) REFERENCES OclModel (__IDOclModel__),
	PRIMARY KEY OutPatternElement (__IDOutPatternElement__),
	__FKoutPattern__ Integer,
	__FKsourceElement__ Integer,
	__FKmodel__ Integer
) ;

CREATE TABLE SimpleOutPatternElement (
	__IDSimpleOutPatternElement__ Integer NOT NULL,
	PRIMARY KEY SimpleOutPatternElement (__IDSimpleOutPatternElement__)
) ;

CREATE TABLE ForEachOutPatternElement (
	__IDForEachOutPatternElement__ Integer NOT NULL,
	FOREIGN KEY collection (__FKcollection__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY iterator (__FKiterator__) REFERENCES Iterator (__IDIterator__),
	PRIMARY KEY ForEachOutPatternElement (__IDForEachOutPatternElement__),
	__FKcollection__ Integer,
	__FKiterator__ Integer
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY outPatternElement (__FKoutPatternElement__) REFERENCES OutPatternElement (__IDOutPatternElement__),
	propertyName text,
	isAssignment Boolean,
	PRIMARY KEY Binding (__IDBinding__),
	__FKvalue__ Integer,
	__FKoutPatternElement__ Integer
) ;

CREATE TABLE RuleVariableDeclaration (
	__IDRuleVariableDeclaration__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY RuleVariableDeclaration (__IDRuleVariableDeclaration__),
	__FKrule__ Integer
) ;

CREATE TABLE LibraryRef (
	__IDLibraryRef__ Integer NOT NULL,
	FOREIGN KEY unit (__FKunit__) REFERENCES Unit (__IDUnit__),
	name text,
	PRIMARY KEY LibraryRef (__IDLibraryRef__),
	__FKunit__ Integer
) ;

CREATE TABLE ActionBlock (
	__IDActionBlock__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY ActionBlock (__IDActionBlock__),
	__FKrule__ Integer
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE ExpressionStat (
	__IDExpressionStat__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ExpressionStat (__IDExpressionStat__),
	__FKexpression__ Integer
) ;

CREATE TABLE BindingStat (
	__IDBindingStat__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES OclExpression (__IDOclExpression__),
	propertyName text,
	isAssignment Boolean,
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY BindingStat (__IDBindingStat__),
	__FKsource__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE IfStat (
	__IDIfStat__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY IfStat (__IDIfStat__),
	__FKcondition__ Integer
) ;

CREATE TABLE ForStat (
	__IDForStat__ Integer NOT NULL,
	FOREIGN KEY iterator (__FKiterator__) REFERENCES Iterator (__IDIterator__),
	FOREIGN KEY collection (__FKcollection__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ForStat (__IDForStat__),
	__FKiterator__ Integer,
	__FKcollection__ Integer
) ;

CREATE TABLE OclExpression (
	__IDOclExpression__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES OclType (__IDOclType__),
	FOREIGN KEY ifExp3 (__FKifExp3__) REFERENCES IfExp (__IDIfExp__),
	FOREIGN KEY appliedProperty (__FKappliedProperty__) REFERENCES PropertyCallExp (__IDPropertyCallExp__),
	FOREIGN KEY collection (__FKcollection__) REFERENCES CollectionExp (__IDCollectionExp__),
	FOREIGN KEY letExp (__FKletExp__) REFERENCES LetExp (__IDLetExp__),
	FOREIGN KEY loopExp (__FKloopExp__) REFERENCES LoopExp (__IDLoopExp__),
	FOREIGN KEY parentOperation (__FKparentOperation__) REFERENCES OperationCallExp (__IDOperationCallExp__),
	FOREIGN KEY initializedVariable (__FKinitializedVariable__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	FOREIGN KEY ifExp2 (__FKifExp2__) REFERENCES IfExp (__IDIfExp__),
	FOREIGN KEY owningOperation (__FKowningOperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY ifExp1 (__FKifExp1__) REFERENCES IfExp (__IDIfExp__),
	FOREIGN KEY owningAttribute (__FKowningAttribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY OclExpression (__IDOclExpression__),
	__FKtype__ Integer,
	__FKifExp3__ Integer,
	__FKappliedProperty__ Integer,
	__FKcollection__ Integer,
	__FKletExp__ Integer,
	__FKloopExp__ Integer,
	__FKparentOperation__ Integer,
	__FKinitializedVariable__ Integer,
	__FKifExp2__ Integer,
	__FKowningOperation__ Integer,
	__FKifExp1__ Integer,
	__FKowningAttribute__ Integer
) ;

CREATE TABLE VariableExp (
	__IDVariableExp__ Integer NOT NULL,
	FOREIGN KEY referredVariable (__FKreferredVariable__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	PRIMARY KEY VariableExp (__IDVariableExp__),
	__FKreferredVariable__ Integer
) ;

CREATE TABLE SuperExp (
	__IDSuperExp__ Integer NOT NULL,
	PRIMARY KEY SuperExp (__IDSuperExp__)
) ;

CREATE TABLE PrimitiveExp (
	__IDPrimitiveExp__ Integer NOT NULL,
	PRIMARY KEY PrimitiveExp (__IDPrimitiveExp__)
) ;

CREATE TABLE StringExp (
	__IDStringExp__ Integer NOT NULL,
	stringSymbol text,
	PRIMARY KEY StringExp (__IDStringExp__)
) ;

CREATE TABLE BooleanExp (
	__IDBooleanExp__ Integer NOT NULL,
	booleanSymbol Boolean,
	PRIMARY KEY BooleanExp (__IDBooleanExp__)
) ;

CREATE TABLE NumericExp (
	__IDNumericExp__ Integer NOT NULL,
	PRIMARY KEY NumericExp (__IDNumericExp__)
) ;

CREATE TABLE RealExp (
	__IDRealExp__ Integer NOT NULL,
	realSymbol "Double",
	PRIMARY KEY RealExp (__IDRealExp__)
) ;

CREATE TABLE IntegerExp (
	__IDIntegerExp__ Integer NOT NULL,
	integerSymbol Integer,
	PRIMARY KEY IntegerExp (__IDIntegerExp__)
) ;

CREATE TABLE CollectionExp (
	__IDCollectionExp__ Integer NOT NULL,
	PRIMARY KEY CollectionExp (__IDCollectionExp__)
) ;

CREATE TABLE BagExp (
	__IDBagExp__ Integer NOT NULL,
	PRIMARY KEY BagExp (__IDBagExp__)
) ;

CREATE TABLE OrderedSetExp (
	__IDOrderedSetExp__ Integer NOT NULL,
	PRIMARY KEY OrderedSetExp (__IDOrderedSetExp__)
) ;

CREATE TABLE SequenceExp (
	__IDSequenceExp__ Integer NOT NULL,
	PRIMARY KEY SequenceExp (__IDSequenceExp__)
) ;

CREATE TABLE SetExp (
	__IDSetExp__ Integer NOT NULL,
	PRIMARY KEY SetExp (__IDSetExp__)
) ;

CREATE TABLE TupleExp (
	__IDTupleExp__ Integer NOT NULL,
	PRIMARY KEY TupleExp (__IDTupleExp__)
) ;

CREATE TABLE TuplePart (
	__IDTuplePart__ Integer NOT NULL,
	FOREIGN KEY tuple (__FKtuple__) REFERENCES TupleExp (__IDTupleExp__),
	PRIMARY KEY TuplePart (__IDTuplePart__),
	__FKtuple__ Integer
) ;

CREATE TABLE MapExp (
	__IDMapExp__ Integer NOT NULL,
	PRIMARY KEY MapExp (__IDMapExp__)
) ;

CREATE TABLE MapElement (
	__IDMapElement__ Integer NOT NULL,
	FOREIGN KEY map (__FKmap__) REFERENCES MapExp (__IDMapExp__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY MapElement (__IDMapElement__),
	__FKmap__ Integer,
	__FKkey__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE EnumLiteralExp (
	__IDEnumLiteralExp__ Integer NOT NULL,
	name text,
	PRIMARY KEY EnumLiteralExp (__IDEnumLiteralExp__)
) ;

CREATE TABLE OclUndefinedExp (
	__IDOclUndefinedExp__ Integer NOT NULL,
	PRIMARY KEY OclUndefinedExp (__IDOclUndefinedExp__)
) ;

CREATE TABLE PropertyCallExp (
	__IDPropertyCallExp__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY PropertyCallExp (__IDPropertyCallExp__),
	__FKsource__ Integer
) ;

CREATE TABLE NavigationOrAttributeCallExp (
	__IDNavigationOrAttributeCallExp__ Integer NOT NULL,
	name text,
	PRIMARY KEY NavigationOrAttributeCallExp (__IDNavigationOrAttributeCallExp__)
) ;

CREATE TABLE OperationCallExp (
	__IDOperationCallExp__ Integer NOT NULL,
	operationName text,
	PRIMARY KEY OperationCallExp (__IDOperationCallExp__)
) ;

CREATE TABLE OperatorCallExp (
	__IDOperatorCallExp__ Integer NOT NULL,
	PRIMARY KEY OperatorCallExp (__IDOperatorCallExp__)
) ;

CREATE TABLE CollectionOperationCallExp (
	__IDCollectionOperationCallExp__ Integer NOT NULL,
	PRIMARY KEY CollectionOperationCallExp (__IDCollectionOperationCallExp__)
) ;

CREATE TABLE LoopExp (
	__IDLoopExp__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY LoopExp (__IDLoopExp__),
	__FKbody__ Integer
) ;

CREATE TABLE IterateExp (
	__IDIterateExp__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	PRIMARY KEY IterateExp (__IDIterateExp__),
	__FKresult__ Integer
) ;

CREATE TABLE IteratorExp (
	__IDIteratorExp__ Integer NOT NULL,
	name text,
	PRIMARY KEY IteratorExp (__IDIteratorExp__)
) ;

CREATE TABLE LetExp (
	__IDLetExp__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	FOREIGN KEY in_ (__FKin___) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY LetExp (__IDLetExp__),
	__FKvariable__ Integer,
	__FKin___ Integer
) ;

CREATE TABLE IfExp (
	__IDIfExp__ Integer NOT NULL,
	FOREIGN KEY thenExpression (__FKthenExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY elseExpression (__FKelseExpression__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY IfExp (__IDIfExp__),
	__FKthenExpression__ Integer,
	__FKcondition__ Integer,
	__FKelseExpression__ Integer
) ;

CREATE TABLE VariableDeclaration (
	__IDVariableDeclaration__ Integer NOT NULL,
	id text,
	varName text,
	FOREIGN KEY type (__FKtype__) REFERENCES OclType (__IDOclType__),
	FOREIGN KEY initExpression (__FKinitExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY letExp (__FKletExp__) REFERENCES LetExp (__IDLetExp__),
	FOREIGN KEY baseExp (__FKbaseExp__) REFERENCES IterateExp (__IDIterateExp__),
	PRIMARY KEY VariableDeclaration (__IDVariableDeclaration__),
	__FKtype__ Integer,
	__FKinitExpression__ Integer,
	__FKletExp__ Integer,
	__FKbaseExp__ Integer
) ;

CREATE TABLE Iterator (
	__IDIterator__ Integer NOT NULL,
	FOREIGN KEY loopExpr (__FKloopExpr__) REFERENCES LoopExp (__IDLoopExp__),
	PRIMARY KEY Iterator (__IDIterator__),
	__FKloopExpr__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKoperation__ Integer
) ;

CREATE TABLE CollectionType (
	__IDCollectionType__ Integer NOT NULL,
	FOREIGN KEY elementType (__FKelementType__) REFERENCES OclType (__IDOclType__),
	PRIMARY KEY CollectionType (__IDCollectionType__),
	__FKelementType__ Integer
) ;

CREATE TABLE OclType (
	__IDOclType__ Integer NOT NULL,
	name text,
	FOREIGN KEY definitions (__FKdefinitions__) REFERENCES OclContextDefinition (__IDOclContextDefinition__),
	FOREIGN KEY oclExpression (__FKoclExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY mapType2 (__FKmapType2__) REFERENCES MapType (__IDMapType__),
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	FOREIGN KEY mapType (__FKmapType__) REFERENCES MapType (__IDMapType__),
	FOREIGN KEY collectionTypes (__FKcollectionTypes__) REFERENCES CollectionType (__IDCollectionType__),
	FOREIGN KEY tupleTypeAttribute (__FKtupleTypeAttribute__) REFERENCES TupleTypeAttribute (__IDTupleTypeAttribute__),
	FOREIGN KEY variableDeclaration (__FKvariableDeclaration__) REFERENCES VariableDeclaration (__IDVariableDeclaration__),
	PRIMARY KEY OclType (__IDOclType__),
	__FKdefinitions__ Integer,
	__FKoclExpression__ Integer,
	__FKoperation__ Integer,
	__FKmapType2__ Integer,
	__FKattribute__ Integer,
	__FKmapType__ Integer,
	__FKcollectionTypes__ Integer,
	__FKtupleTypeAttribute__ Integer,
	__FKvariableDeclaration__ Integer
) ;

CREATE TABLE Primitive (
	__IDPrimitive__ Integer NOT NULL,
	PRIMARY KEY Primitive (__IDPrimitive__)
) ;

CREATE TABLE StringType (
	__IDStringType__ Integer NOT NULL,
	PRIMARY KEY StringType (__IDStringType__)
) ;

CREATE TABLE BooleanType (
	__IDBooleanType__ Integer NOT NULL,
	PRIMARY KEY BooleanType (__IDBooleanType__)
) ;

CREATE TABLE NumericType (
	__IDNumericType__ Integer NOT NULL,
	PRIMARY KEY NumericType (__IDNumericType__)
) ;

CREATE TABLE IntegerType (
	__IDIntegerType__ Integer NOT NULL,
	PRIMARY KEY IntegerType (__IDIntegerType__)
) ;

CREATE TABLE RealType (
	__IDRealType__ Integer NOT NULL,
	PRIMARY KEY RealType (__IDRealType__)
) ;

CREATE TABLE BagType (
	__IDBagType__ Integer NOT NULL,
	PRIMARY KEY BagType (__IDBagType__)
) ;

CREATE TABLE OrderedSetType (
	__IDOrderedSetType__ Integer NOT NULL,
	PRIMARY KEY OrderedSetType (__IDOrderedSetType__)
) ;

CREATE TABLE SequenceType (
	__IDSequenceType__ Integer NOT NULL,
	PRIMARY KEY SequenceType (__IDSequenceType__)
) ;

CREATE TABLE SetType (
	__IDSetType__ Integer NOT NULL,
	PRIMARY KEY SetType (__IDSetType__)
) ;

CREATE TABLE OclAnyType (
	__IDOclAnyType__ Integer NOT NULL,
	PRIMARY KEY OclAnyType (__IDOclAnyType__)
) ;

CREATE TABLE TupleType (
	__IDTupleType__ Integer NOT NULL,
	PRIMARY KEY TupleType (__IDTupleType__)
) ;

CREATE TABLE TupleTypeAttribute (
	__IDTupleTypeAttribute__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES OclType (__IDOclType__),
	FOREIGN KEY tupleType (__FKtupleType__) REFERENCES TupleType (__IDTupleType__),
	name text,
	PRIMARY KEY TupleTypeAttribute (__IDTupleTypeAttribute__),
	__FKtype__ Integer,
	__FKtupleType__ Integer
) ;

CREATE TABLE OclModelElement (
	__IDOclModelElement__ Integer NOT NULL,
	FOREIGN KEY model (__FKmodel__) REFERENCES OclModel (__IDOclModel__),
	PRIMARY KEY OclModelElement (__IDOclModelElement__),
	__FKmodel__ Integer
) ;

CREATE TABLE MapType (
	__IDMapType__ Integer NOT NULL,
	FOREIGN KEY valueType (__FKvalueType__) REFERENCES OclType (__IDOclType__),
	FOREIGN KEY keyType (__FKkeyType__) REFERENCES OclType (__IDOclType__),
	PRIMARY KEY MapType (__IDMapType__),
	__FKvalueType__ Integer,
	__FKkeyType__ Integer
) ;

CREATE TABLE OclFeatureDefinition (
	__IDOclFeatureDefinition__ Integer NOT NULL,
	FOREIGN KEY feature (__FKfeature__) REFERENCES OclFeature (__IDOclFeature__),
	FOREIGN KEY context_ (__FKcontext___) REFERENCES OclContextDefinition (__IDOclContextDefinition__),
	PRIMARY KEY OclFeatureDefinition (__IDOclFeatureDefinition__),
	__FKfeature__ Integer,
	__FKcontext___ Integer
) ;

CREATE TABLE OclContextDefinition (
	__IDOclContextDefinition__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES OclFeatureDefinition (__IDOclFeatureDefinition__),
	FOREIGN KEY context_ (__FKcontext___) REFERENCES OclType (__IDOclType__),
	PRIMARY KEY OclContextDefinition (__IDOclContextDefinition__),
	__FKdefinition__ Integer,
	__FKcontext___ Integer
) ;

CREATE TABLE OclFeature (
	__IDOclFeature__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES OclFeatureDefinition (__IDOclFeatureDefinition__),
	PRIMARY KEY OclFeature (__IDOclFeature__),
	__FKdefinition__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	name text,
	FOREIGN KEY initExpression (__FKinitExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY type (__FKtype__) REFERENCES OclType (__IDOclType__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKinitExpression__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	name text,
	FOREIGN KEY returnType (__FKreturnType__) REFERENCES OclType (__IDOclType__),
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKreturnType__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE OclModel (
	__IDOclModel__ Integer NOT NULL,
	name text,
	FOREIGN KEY metamodel (__FKmetamodel__) REFERENCES OclModel (__IDOclModel__),
	PRIMARY KEY OclModel (__IDOclModel__),
	__FKmetamodel__ Integer
) ;

CREATE TABLE Unit_libraries_LibraryRef (
	__IDUnit__ Integer NOT NULL,
	__IDLibraryRef__ Integer NOT NULL
) ;

CREATE TABLE Library_helpers_Helper (
	__IDLibrary__ Integer NOT NULL,
	__IDHelper__ Integer NOT NULL
) ;

CREATE TABLE Query_helpers_Helper (
	__IDQuery__ Integer NOT NULL,
	__IDHelper__ Integer NOT NULL
) ;

CREATE TABLE Module_inModels_OclModel (
	__IDModule__ Integer NOT NULL,
	__IDOclModel__ Integer NOT NULL
) ;

CREATE TABLE Module_outModels_OclModel (
	__IDModule__ Integer NOT NULL,
	__IDOclModel__ Integer NOT NULL
) ;

CREATE TABLE Module_elements_ModuleElement (
	__IDModule__ Integer NOT NULL,
	__IDModuleElement__ Integer NOT NULL
) ;

CREATE TABLE Rule_variables_RuleVariableDeclaration (
	__IDRule__ Integer NOT NULL,
	__IDRuleVariableDeclaration__ Integer NOT NULL
) ;

CREATE TABLE MatchedRule_children_MatchedRule (
	__IDMatchedRule__ Integer NOT NULL,
	__IDMatchedRule__ Integer NOT NULL
) ;

CREATE TABLE CalledRule_parameters_Parameter (
	__IDCalledRule__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE InPattern_elements_InPatternElement (
	__IDInPattern__ Integer NOT NULL,
	__IDInPatternElement__ Integer NOT NULL
) ;

CREATE TABLE OutPattern_elements_OutPatternElement (
	__IDOutPattern__ Integer NOT NULL,
	__IDOutPatternElement__ Integer NOT NULL
) ;

CREATE TABLE InPatternElement_models_OclModel (
	__IDInPatternElement__ Integer NOT NULL,
	__IDOclModel__ Integer NOT NULL
) ;

CREATE TABLE OutPatternElement_bindings_Binding (
	__IDOutPatternElement__ Integer NOT NULL,
	__IDBinding__ Integer NOT NULL
) ;

CREATE TABLE SimpleOutPatternElement_reverseBindings_OclExpression (
	__IDSimpleOutPatternElement__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE ActionBlock_statements_Statement (
	__IDActionBlock__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE IfStat_thenStatements_Statement (
	__IDIfStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE IfStat_elseStatements_Statement (
	__IDIfStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE ForStat_statements_Statement (
	__IDForStat__ Integer NOT NULL,
	__IDStatement__ Integer NOT NULL
) ;

CREATE TABLE CollectionExp_elements_OclExpression (
	__IDCollectionExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE TupleExp_tuplePart_TuplePart (
	__IDTupleExp__ Integer NOT NULL,
	__IDTuplePart__ Integer NOT NULL
) ;

CREATE TABLE MapExp_elements_MapElement (
	__IDMapExp__ Integer NOT NULL,
	__IDMapElement__ Integer NOT NULL
) ;

CREATE TABLE OperationCallExp_arguments_OclExpression (
	__IDOperationCallExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE LoopExp_iterators_Iterator (
	__IDLoopExp__ Integer NOT NULL,
	__IDIterator__ Integer NOT NULL
) ;

CREATE TABLE VariableDeclaration_variableExp_VariableExp (
	__IDVariableDeclaration__ Integer NOT NULL,
	__IDVariableExp__ Integer NOT NULL
) ;

CREATE TABLE TupleType_attributes_TupleTypeAttribute (
	__IDTupleType__ Integer NOT NULL,
	__IDTupleTypeAttribute__ Integer NOT NULL
) ;

CREATE TABLE Operation_parameters_Parameter (
	__IDOperation__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE OclModel_elements_OclModelElement (
	__IDOclModel__ Integer NOT NULL,
	__IDOclModelElement__ Integer NOT NULL
) ;

CREATE TABLE OclModel_model_OclModel (
	__IDOclModel__ Integer NOT NULL,
	__IDOclModel__ Integer NOT NULL
) ;
