CREATE TABLE MaudeSpec (
	__IDMaudeSpec__ Integer NOT NULL,
	PRIMARY KEY MaudeSpec (__IDMaudeSpec__)
) ;

CREATE TABLE MaudeTopEl (
	__IDMaudeTopEl__ Integer NOT NULL,
	name text,
	PRIMARY KEY MaudeTopEl (__IDMaudeTopEl__)
) ;

CREATE TABLE ModExpression (
	__IDModExpression__ Integer NOT NULL,
	PRIMARY KEY ModExpression (__IDModExpression__)
) ;

CREATE TABLE InstModExp (
	__IDInstModExp__ Integer NOT NULL,
	FOREIGN KEY modExp (__FKmodExp__) REFERENCES ModExpression (__IDModExpression__),
	PRIMARY KEY InstModExp (__IDInstModExp__),
	__FKmodExp__ Integer
) ;

CREATE TABLE RenModExp (
	__IDRenModExp__ Integer NOT NULL,
	FOREIGN KEY modExp (__FKmodExp__) REFERENCES ModExpression (__IDModExpression__),
	PRIMARY KEY RenModExp (__IDRenModExp__),
	__FKmodExp__ Integer
) ;

CREATE TABLE CompModExp (
	__IDCompModExp__ Integer NOT NULL,
	PRIMARY KEY CompModExp (__IDCompModExp__)
) ;

CREATE TABLE ModuleIdModExp (
	__IDModuleIdModExp__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY ModuleIdModExp (__IDModuleIdModExp__),
	__FKmodule__ Integer
) ;

CREATE TABLE TheoryIdModExp (
	__IDTheoryIdModExp__ Integer NOT NULL,
	FOREIGN KEY theory (__FKtheory__) REFERENCES Theory (__IDTheory__),
	PRIMARY KEY TheoryIdModExp (__IDTheoryIdModExp__),
	__FKtheory__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	"label" text,
	FOREIGN KEY modExp (__FKmodExp__) REFERENCES ModExpression (__IDModExpression__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKmodExp__ Integer
) ;

CREATE TABLE Theory (
	__IDTheory__ Integer NOT NULL,
	PRIMARY KEY Theory (__IDTheory__)
) ;

CREATE TABLE FTheory (
	__IDFTheory__ Integer NOT NULL,
	PRIMARY KEY FTheory (__IDFTheory__)
) ;

CREATE TABLE STheory (
	__IDSTheory__ Integer NOT NULL,
	PRIMARY KEY STheory (__IDSTheory__)
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE FModule (
	__IDFModule__ Integer NOT NULL,
	PRIMARY KEY FModule (__IDFModule__)
) ;

CREATE TABLE SModule (
	__IDSModule__ Integer NOT NULL,
	PRIMARY KEY SModule (__IDSModule__)
) ;

CREATE TABLE ModElement (
	__IDModElement__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	FOREIGN KEY theory (__FKtheory__) REFERENCES Theory (__IDTheory__),
	PRIMARY KEY ModElement (__IDModElement__),
	__FKmodule__ Integer,
	__FKtheory__ Integer
) ;

CREATE TABLE ModImportation (
	__IDModImportation__ Integer NOT NULL,
	FOREIGN KEY imports (__FKimports__) REFERENCES ModExpression (__IDModExpression__),
	mode text,
	PRIMARY KEY ModImportation (__IDModImportation__),
	__FKimports__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	name text,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Sort (
	__IDSort__ Integer NOT NULL,
	FOREIGN KEY kind (__FKkind__) REFERENCES Kind (__IDKind__),
	PRIMARY KEY Sort (__IDSort__),
	__FKkind__ Integer
) ;

CREATE TABLE Kind (
	__IDKind__ Integer NOT NULL,
	PRIMARY KEY Kind (__IDKind__)
) ;

CREATE TABLE SubsortRel (
	__IDSubsortRel__ Integer NOT NULL,
	PRIMARY KEY SubsortRel (__IDSubsortRel__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	name text,
	FOREIGN KEY coarity (__FKcoarity__) REFERENCES Type (__IDType__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKcoarity__ Integer
) ;

CREATE TABLE Statement (
	__IDStatement__ Integer NOT NULL,
	"label" text,
	PRIMARY KEY Statement (__IDStatement__)
) ;

CREATE TABLE Membership (
	__IDMembership__ Integer NOT NULL,
	FOREIGN KEY term (__FKterm__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY sort (__FKsort__) REFERENCES Sort (__IDSort__),
	PRIMARY KEY Membership (__IDMembership__),
	__FKterm__ Integer,
	__FKsort__ Integer
) ;

CREATE TABLE Equation (
	__IDEquation__ Integer NOT NULL,
	FOREIGN KEY lhs (__FKlhs__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Equation (__IDEquation__),
	__FKlhs__ Integer,
	__FKrhs__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY lhs (__FKlhs__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY Rule (__IDRule__),
	__FKlhs__ Integer,
	__FKrhs__ Integer
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	FOREIGN KEY lhs (__FKlhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY "Condition" (__IDCondition__),
	__FKlhs__ Integer
) ;

CREATE TABLE EquationalCond (
	__IDEquationalCond__ Integer NOT NULL,
	PRIMARY KEY EquationalCond (__IDEquationalCond__)
) ;

CREATE TABLE RewriteCond (
	__IDRewriteCond__ Integer NOT NULL,
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY RewriteCond (__IDRewriteCond__),
	__FKrhs__ Integer
) ;

CREATE TABLE MembershipCond (
	__IDMembershipCond__ Integer NOT NULL,
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Sort (__IDSort__),
	PRIMARY KEY MembershipCond (__IDMembershipCond__),
	__FKrhs__ Integer
) ;

CREATE TABLE BooleanCond (
	__IDBooleanCond__ Integer NOT NULL,
	PRIMARY KEY BooleanCond (__IDBooleanCond__)
) ;

CREATE TABLE MatchingCond (
	__IDMatchingCond__ Integer NOT NULL,
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY MatchingCond (__IDMatchingCond__),
	__FKrhs__ Integer
) ;

CREATE TABLE EqualCond (
	__IDEqualCond__ Integer NOT NULL,
	FOREIGN KEY rhs (__FKrhs__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY EqualCond (__IDEqualCond__),
	__FKrhs__ Integer
) ;

CREATE TABLE Term (
	__IDTerm__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Term (__IDTerm__),
	__FKtype__ Integer
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	op text,
	PRIMARY KEY Constant (__IDConstant__)
) ;

CREATE TABLE RecTerm (
	__IDRecTerm__ Integer NOT NULL,
	op text,
	PRIMARY KEY RecTerm (__IDRecTerm__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	name text,
	PRIMARY KEY Variable (__IDVariable__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ModExpression (__IDModExpression__),
	FOREIGN KEY "to" (__FKto__) REFERENCES ModExpression (__IDModExpression__),
	PRIMARY KEY View (__IDView__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE ViewMapping (
	__IDViewMapping__ Integer NOT NULL,
	PRIMARY KEY ViewMapping (__IDViewMapping__)
) ;

CREATE TABLE RenMapping (
	__IDRenMapping__ Integer NOT NULL,
	PRIMARY KEY RenMapping (__IDRenMapping__)
) ;

CREATE TABLE TermMapping (
	__IDTermMapping__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Term (__IDTerm__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Term (__IDTerm__),
	PRIMARY KEY TermMapping (__IDTermMapping__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE SortMapping (
	__IDSortMapping__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Sort (__IDSort__),
	"to" text,
	PRIMARY KEY SortMapping (__IDSortMapping__),
	__FKfrom__ Integer
) ;

CREATE TABLE OpTypedMapping (
	__IDOpTypedMapping__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Operation (__IDOperation__),
	"to" text,
	PRIMARY KEY OpTypedMapping (__IDOpTypedMapping__),
	__FKfrom__ Integer
) ;

CREATE TABLE OpMapping (
	__IDOpMapping__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Operation (__IDOperation__),
	"to" text,
	PRIMARY KEY OpMapping (__IDOpMapping__),
	__FKfrom__ Integer
) ;

CREATE TABLE LabelMapping (
	__IDLabelMapping__ Integer NOT NULL,
	"from" text,
	"to" text,
	PRIMARY KEY LabelMapping (__IDLabelMapping__)
) ;

CREATE TABLE MaudeSpec_els_MaudeTopEl (
	__IDMaudeSpec__ Integer NOT NULL,
	__IDMaudeTopEl__ Integer NOT NULL
) ;

CREATE TABLE MaudeSpec_printableEls_MaudeTopEl (
	__IDMaudeSpec__ Integer NOT NULL,
	__IDMaudeTopEl__ Integer NOT NULL
) ;

CREATE TABLE InstModExp_views_View (
	__IDInstModExp__ Integer NOT NULL,
	__IDView__ Integer NOT NULL
) ;

CREATE TABLE RenModExp_renamings_RenMapping (
	__IDRenModExp__ Integer NOT NULL,
	__IDRenMapping__ Integer NOT NULL
) ;

CREATE TABLE CompModExp_modExps_ModExpression (
	__IDCompModExp__ Integer NOT NULL,
	__IDModExpression__ Integer NOT NULL
) ;

CREATE TABLE Theory_els_ModElement (
	__IDTheory__ Integer NOT NULL,
	__IDModElement__ Integer NOT NULL
) ;

CREATE TABLE Module_els_ModElement (
	__IDModule__ Integer NOT NULL,
	__IDModElement__ Integer NOT NULL
) ;

CREATE TABLE Module_params_Parameter (
	__IDModule__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Sort_subsortRels_SubsortRel (
	__IDSort__ Integer NOT NULL,
	__IDSubsortRel__ Integer NOT NULL
) ;

CREATE TABLE Sort_supersortRels_SubsortRel (
	__IDSort__ Integer NOT NULL,
	__IDSubsortRel__ Integer NOT NULL
) ;

CREATE TABLE Kind_sorts_Sort (
	__IDKind__ Integer NOT NULL,
	__IDSort__ Integer NOT NULL
) ;

CREATE TABLE SubsortRel_subsorts_Sort (
	__IDSubsortRel__ Integer NOT NULL,
	__IDSort__ Integer NOT NULL
) ;

CREATE TABLE SubsortRel_supersorts_Sort (
	__IDSubsortRel__ Integer NOT NULL,
	__IDSort__ Integer NOT NULL
) ;

CREATE TABLE Operation_arity_Type (
	__IDOperation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Statement_conds_Condition (
	__IDStatement__ Integer NOT NULL,
	__IDCondition__ Integer NOT NULL
) ;

CREATE TABLE RecTerm_args_Term (
	__IDRecTerm__ Integer NOT NULL,
	__IDTerm__ Integer NOT NULL
) ;

CREATE TABLE View_els_ViewMapping (
	__IDView__ Integer NOT NULL,
	__IDViewMapping__ Integer NOT NULL
) ;
