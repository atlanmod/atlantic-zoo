CREATE TABLE VarScope (
	__IDVarScope__ Integer NOT NULL,
	PRIMARY KEY VarScope (__IDVarScope__)
) ;

CREATE TABLE AbstractVar (
	__IDAbstractVar__ Integer NOT NULL,
	FOREIGN KEY scope (__FKscope__) REFERENCES VarScope (__IDVarScope__),
	FOREIGN KEY varUse (__FKvarUse__) REFERENCES VarUse (__IDVarUse__),
	PRIMARY KEY AbstractVar (__IDAbstractVar__),
	__FKscope__ Integer,
	__FKvarUse__ Integer
) ;

CREATE TABLE VarUse (
	__IDVarUse__ Integer NOT NULL,
	FOREIGN KEY var (__FKvar__) REFERENCES AbstractVar (__IDAbstractVar__),
	PRIMARY KEY VarUse (__IDVarUse__),
	__FKvar__ Integer
) ;

CREATE TABLE "MOF::Property" (
	"__IDMOF::Property__" Integer NOT NULL,
	FOREIGN KEY part (__FKpart__) REFERENCES "Key" (__IDKey__),
	PRIMARY KEY "MOF::Property" ("__IDMOF::Property__"),
	__FKpart__ Integer
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Transformation (__IDTransformation__),
	PRIMARY KEY "Key" (__IDKey__),
	__FKtransformation__ Integer
) ;

CREATE TABLE PatternScope (
	__IDPatternScope__ Integer NOT NULL,
	PRIMARY KEY PatternScope (__IDPatternScope__)
) ;

CREATE TABLE PatternDefn (
	__IDPatternDefn__ Integer NOT NULL,
	FOREIGN KEY scope (__FKscope__) REFERENCES PatternScope (__IDPatternScope__),
	FOREIGN KEY body (__FKbody__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY PatternDefn (__IDPatternDefn__),
	__FKbody__ Integer,
	__FKscope__ Integer
) ;

CREATE TABLE TRule (
	__IDTRule__ Integer NOT NULL,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Transformation (__IDTransformation__),
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY TRule (__IDTRule__),
	__FKtransformation__ Integer,
	__FKterm__ Integer
) ;

CREATE TABLE Transformation (
	__IDTransformation__ Integer NOT NULL,
	PRIMARY KEY Transformation (__IDTransformation__)
) ;

CREATE TABLE Query (
	__IDQuery__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Query (__IDQuery__),
	__FKterm__ Integer
) ;

CREATE TABLE Term (
	__IDTerm__ Integer NOT NULL,
	FOREIGN KEY patternDefn (__FKpatternDefn__) REFERENCES PatternDefn (__IDPatternDefn__),
	FOREIGN KEY query (__FKquery__) REFERENCES Query (__IDQuery__),
	FOREIGN KEY tRule (__FKtRule__) REFERENCES TRule (__IDTRule__),
	FOREIGN KEY context (__FKcontext__) REFERENCES ExtentVar (__IDExtentVar__),
	FOREIGN KEY compoundTerm (__FKcompoundTerm__) REFERENCES CompoundTerm (__IDCompoundTerm__),
	PRIMARY KEY Term (__IDTerm__),
	__FKcompoundTerm__ Integer,
	__FKpatternDefn__ Integer,
	__FKquery__ Integer,
	__FKtRule__ Integer,
	__FKcontext__ Integer
) ;

CREATE TABLE TRuleVar (
	__IDTRuleVar__ Integer NOT NULL,
	PRIMARY KEY TRuleVar (__IDTRuleVar__)
) ;

CREATE TABLE PatternVar (
	__IDPatternVar__ Integer NOT NULL,
	FOREIGN KEY query (__FKquery__) REFERENCES Query (__IDQuery__),
	FOREIGN KEY patternDefn (__FKpatternDefn__) REFERENCES PatternDefn (__IDPatternDefn__),
	PRIMARY KEY PatternVar (__IDPatternVar__),
	__FKpatternDefn__ Integer,
	__FKquery__ Integer
) ;

CREATE TABLE ExtentVar (
	__IDExtentVar__ Integer NOT NULL,
	FOREIGN KEY src (__FKsrc__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY ExtentVar (__IDExtentVar__),
	__FKsrc__ Integer
) ;

CREATE TABLE CompoundTerm (
	__IDCompoundTerm__ Integer NOT NULL,
	PRIMARY KEY CompoundTerm (__IDCompoundTerm__)
) ;

CREATE TABLE AndTerm (
	__IDAndTerm__ Integer NOT NULL,
	PRIMARY KEY AndTerm (__IDAndTerm__)
) ;

CREATE TABLE OrTerm (
	__IDOrTerm__ Integer NOT NULL,
	PRIMARY KEY OrTerm (__IDOrTerm__)
) ;

CREATE TABLE NotTerm (
	__IDNotTerm__ Integer NOT NULL,
	PRIMARY KEY NotTerm (__IDNotTerm__)
) ;

CREATE TABLE IfTerm (
	__IDIfTerm__ Integer NOT NULL,
	PRIMARY KEY IfTerm (__IDIfTerm__)
) ;

CREATE TABLE SimpleTerm (
	__IDSimpleTerm__ Integer NOT NULL,
	FOREIGN KEY tRuleST (__FKtRuleST__) REFERENCES TRule (__IDTRule__),
	PRIMARY KEY SimpleTerm (__IDSimpleTerm__),
	__FKtRuleST__ Integer
) ;

CREATE TABLE TrackingUse (
	__IDTrackingUse__ Integer NOT NULL,
	featureNames text,
	FOREIGN KEY tracking (__FKtracking__) REFERENCES "MOF::Class" ("__IDMOF::Class__"),
	PRIMARY KEY TrackingUse (__IDTrackingUse__),
	__FKtracking__ Integer
) ;

CREATE TABLE "MOF::Class" (
	"__IDMOF::Class__" Integer NOT NULL,
	PRIMARY KEY "MOF::Class" ("__IDMOF::Class__")
) ;

CREATE TABLE PatternUse (
	__IDPatternUse__ Integer NOT NULL,
	PRIMARY KEY PatternUse (__IDPatternUse__)
) ;

CREATE TABLE MofTerm (
	__IDMofTerm__ Integer NOT NULL,
	PRIMARY KEY MofTerm (__IDMofTerm__)
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	reason text,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE MofInstance (
	__IDMofInstance__ Integer NOT NULL,
	isExactly Boolean,
	FOREIGN KEY typeName (__FKtypeName__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY MofInstance (__IDMofInstance__),
	__FKinstance__ Integer,
	__FKtypeName__ Integer
) ;

CREATE TABLE MofOrder (
	__IDMofOrder__ Integer NOT NULL,
	FOREIGN KEY lesser (__FKlesser__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY greater (__FKgreater__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY MofOrder (__IDMofOrder__),
	__FKinstance__ Integer,
	__FKlesser__ Integer,
	__FKgreater__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	FOREIGN KEY lesser (__FKlesser__) REFERENCES MofOrder (__IDMofOrder__),
	FOREIGN KEY instance (__FKinstance__) REFERENCES MofOrder (__IDMofOrder__),
	FOREIGN KEY greater (__FKgreater__) REFERENCES MofOrder (__IDMofOrder__),
	FOREIGN KEY term (__FKterm__) REFERENCES SimpleTerm (__IDSimpleTerm__),
	FOREIGN KEY expr (__FKexpr__) REFERENCES CoumpoundExpr (__IDCoumpoundExpr__),
	PRIMARY KEY Expression (__IDExpression__),
	__FKterm__ Integer,
	__FKlesser__ Integer,
	__FKexpr__ Integer,
	__FKgreater__ Integer,
	__FKinstance__ Integer
) ;

CREATE TABLE CoumpoundExpr (
	__IDCoumpoundExpr__ Integer NOT NULL,
	PRIMARY KEY CoumpoundExpr (__IDCoumpoundExpr__)
) ;

CREATE TABLE CollectionExpr (
	__IDCollectionExpr__ Integer NOT NULL,
	"unique" Boolean,
	ordered Boolean,
	PRIMARY KEY CollectionExpr (__IDCollectionExpr__)
) ;

CREATE TABLE FunctionExpr (
	__IDFunctionExpr__ Integer NOT NULL,
	function text,
	PRIMARY KEY FunctionExpr (__IDFunctionExpr__)
) ;

CREATE TABLE FeatureExpr (
	__IDFeatureExpr__ Integer NOT NULL,
	collect text,
	featureName text,
	PRIMARY KEY FeatureExpr (__IDFeatureExpr__)
) ;

CREATE TABLE InstanceRef (
	__IDInstanceRef__ Integer NOT NULL,
	FOREIGN KEY obj (__FKobj__) REFERENCES "MOF::Object" ("__IDMOF::Object__"),
	PRIMARY KEY InstanceRef (__IDInstanceRef__),
	__FKobj__ Integer
) ;

CREATE TABLE "MOF::Object" (
	"__IDMOF::Object__" Integer NOT NULL,
	FOREIGN KEY obj (__FKobj__) REFERENCES InstanceRef (__IDInstanceRef__),
	PRIMARY KEY "MOF::Object" ("__IDMOF::Object__"),
	__FKobj__ Integer
) ;

CREATE TABLE SimpleExpr (
	__IDSimpleExpr__ Integer NOT NULL,
	representation text,
	PRIMARY KEY SimpleExpr (__IDSimpleExpr__)
) ;

CREATE TABLE StringConstant (
	__IDStringConstant__ Integer NOT NULL,
	PRIMARY KEY StringConstant (__IDStringConstant__)
) ;

CREATE TABLE IntConstant (
	__IDIntConstant__ Integer NOT NULL,
	PRIMARY KEY IntConstant (__IDIntConstant__)
) ;

CREATE TABLE BooleanConstant (
	__IDBooleanConstant__ Integer NOT NULL,
	PRIMARY KEY BooleanConstant (__IDBooleanConstant__)
) ;

CREATE TABLE EnumConstant (
	__IDEnumConstant__ Integer NOT NULL,
	PRIMARY KEY EnumConstant (__IDEnumConstant__)
) ;

CREATE TABLE TRuleVar_extended_TRuleVar (
	__IDTRuleVar__ Integer NOT NULL,
	__IDTRuleVar__ Integer NOT NULL
) ;

CREATE TABLE SimpleTerm_arg_Expression (
	__IDSimpleTerm__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE Query_parameter_PatternVar (
	__IDQuery__ Integer NOT NULL,
	__IDPatternVar__ Integer NOT NULL
) ;

CREATE TABLE TRuleVar_extender_TRuleVar (
	__IDTRuleVar__ Integer NOT NULL,
	__IDTRuleVar__ Integer NOT NULL
) ;

CREATE TABLE VarScope_var_AbstractVar (
	__IDVarScope__ Integer NOT NULL,
	__IDAbstractVar__ Integer NOT NULL
) ;

CREATE TABLE CompoundTerm_term_Term (
	__IDCompoundTerm__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE TRuleVar_superseder_TRuleVar (
	__IDTRuleVar__ Integer NOT NULL,
	__IDTRuleVar__ Integer NOT NULL
) ;

CREATE TABLE TRuleVar_superseded_TRuleVar (
	__IDTRuleVar__ Integer NOT NULL,
	__IDTRuleVar__ Integer NOT NULL
) ;

CREATE TABLE Transformation_keys_Key (
	__IDTransformation__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE TRule_extended_TRule (
	__IDTRule__ Integer NOT NULL,
	__IDTRule__ Integer NOT NULL
) ;

CREATE TABLE TRule_superseder_TRule (
	__IDTRule__ Integer NOT NULL,
	__IDTRule__ Integer NOT NULL
) ;

CREATE TABLE TRule_tgt_SimpleTerm (
	__IDTRule__ Integer NOT NULL,
	__IDSimpleTerm__ Integer NOT NULL
) ;

CREATE TABLE "MOF::Class_tracking_TrackingUse" (
	"__IDMOF::Class__" Integer NOT NULL,
	__IDTrackingUse__ Integer NOT NULL
) ;

CREATE TABLE TRule_superseded_TRule (
	__IDTRule__ Integer NOT NULL,
	__IDTRule__ Integer NOT NULL
) ;

CREATE TABLE Transformation_tRule_TRule (
	__IDTransformation__ Integer NOT NULL,
	__IDTRule__ Integer NOT NULL
) ;

CREATE TABLE "Key_property_MOF::Property" (
	__IDKey__ Integer NOT NULL,
	"__IDMOF::Property__" Integer NOT NULL
) ;

CREATE TABLE PatternScope_patternDefn_PatternDefn (
	__IDPatternScope__ Integer NOT NULL,
	__IDPatternDefn__ Integer NOT NULL
) ;

CREATE TABLE CoumpoundExpr_arg_Expression (
	__IDCoumpoundExpr__ Integer NOT NULL,
	__IDExpression__ Integer NOT NULL
) ;

CREATE TABLE TRule_extender_TRule (
	__IDTRule__ Integer NOT NULL,
	__IDTRule__ Integer NOT NULL
) ;

CREATE TABLE PatternDefn_parameter_PatternVar (
	__IDPatternDefn__ Integer NOT NULL,
	__IDPatternVar__ Integer NOT NULL
) ;
