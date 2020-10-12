CREATE TABLE Strong (
	__IDStrong__ Integer NOT NULL,
	PRIMARY KEY Strong (__IDStrong__)
) ;

CREATE TABLE Start (
	__IDStart__ Integer NOT NULL,
	PRIMARY KEY Start (__IDStart__)
) ;

CREATE TABLE End (
	__IDEnd__ Integer NOT NULL,
	PRIMARY KEY End (__IDEnd__)
) ;

CREATE TABLE FeedBack (
	__IDFeedBack__ Integer NOT NULL,
	PRIMARY KEY FeedBack (__IDFeedBack__)
) ;

CREATE TABLE Weak (
	__IDWeak__ Integer NOT NULL,
	PRIMARY KEY Weak (__IDWeak__)
) ;

CREATE TABLE Grouping (
	__IDGrouping__ Integer NOT NULL,
	PRIMARY KEY Grouping (__IDGrouping__)
) ;

CREATE TABLE Precedence (
	__IDPrecedence__ Integer NOT NULL,
	PRIMARY KEY Precedence (__IDPrecedence__)
) ;

CREATE TABLE DynPrecedence (
	__IDDynPrecedence__ Integer NOT NULL,
	PRIMARY KEY DynPrecedence (__IDDynPrecedence__)
) ;

CREATE TABLE DerPrecedence (
	__IDDerPrecedence__ Integer NOT NULL,
	PRIMARY KEY DerPrecedence (__IDDerPrecedence__)
) ;

CREATE TABLE BasPrecedence (
	__IDBasPrecedence__ Integer NOT NULL,
	PRIMARY KEY BasPrecedence (__IDBasPrecedence__)
) ;

CREATE TABLE MetaTaskOccurence (
	__IDMetaTaskOccurence__ Integer NOT NULL,
	PRIMARY KEY MetaTaskOccurence (__IDMetaTaskOccurence__)
) ;

CREATE TABLE ParBinding (
	__IDParBinding__ Integer NOT NULL,
	inclusion Boolean,
	FOREIGN KEY targetPar (__FKtargetPar__) REFERENCES ParameterPrec (__IDParameterPrec__),
	FOREIGN KEY sourcePar (__FKsourcePar__) REFERENCES ParameterPrec (__IDParameterPrec__),
	PRIMARY KEY ParBinding (__IDParBinding__),
	__FKtargetPar__ Integer,
	__FKsourcePar__ Integer
) ;

CREATE TABLE ParameterPrec (
	__IDParameterPrec__ Integer NOT NULL,
	PRIMARY KEY ParameterPrec (__IDParameterPrec__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY dependencyUMLsupp (__FKdependencyUMLsupp__) REFERENCES DependancyUML (__IDDependancyUML__),
	FOREIGN KEY dependencyUMLcli (__FKdependencyUMLcli__) REFERENCES DependancyUML (__IDDependancyUML__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKdependencyUMLcli__ Integer,
	__FKdependencyUMLsupp__ Integer
) ;

CREATE TABLE DependancyUML (
	__IDDependancyUML__ Integer NOT NULL,
	PRIMARY KEY DependancyUML (__IDDependancyUML__)
) ;

CREATE TABLE MetaTask (
	__IDMetaTask__ Integer NOT NULL,
	PRIMARY KEY MetaTask (__IDMetaTask__)
) ;

CREATE TABLE ParameterUML (
	__IDParameterUML__ Integer NOT NULL,
	FOREIGN KEY task (__FKtask__) REFERENCES MetaTask (__IDMetaTask__),
	PRIMARY KEY ParameterUML (__IDParameterUML__),
	__FKtask__ Integer
) ;

CREATE TABLE MetaDocument (
	__IDMetaDocument__ Integer NOT NULL,
	PRIMARY KEY MetaDocument (__IDMetaDocument__)
) ;

CREATE TABLE MetaTask_params_ParameterUML (
	__IDMetaTask__ Integer NOT NULL,
	__IDParameterUML__ Integer NOT NULL
) ;

CREATE TABLE DependancyUML_suppier_ModelElement (
	__IDDependancyUML__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE MetaTask_occurs_MetaTaskOccurence (
	__IDMetaTask__ Integer NOT NULL,
	__IDMetaTaskOccurence__ Integer NOT NULL
) ;

CREATE TABLE DependancyUML_client_ModelElement (
	__IDDependancyUML__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ParBinding_precs_Precedence (
	__IDParBinding__ Integer NOT NULL,
	__IDPrecedence__ Integer NOT NULL
) ;

CREATE TABLE ParameterPrec_dstParams_ParameterPrec (
	__IDParameterPrec__ Integer NOT NULL,
	__IDParameterPrec__ Integer NOT NULL
) ;

CREATE TABLE MetaTaskOccurence_dprecs_DerPrecedence (
	__IDMetaTaskOccurence__ Integer NOT NULL,
	__IDDerPrecedence__ Integer NOT NULL
) ;

CREATE TABLE ParameterPrec_orParams_ParameterPrec (
	__IDParameterPrec__ Integer NOT NULL,
	__IDParameterPrec__ Integer NOT NULL
) ;

CREATE TABLE DerPrecedence_precs_Precedence (
	__IDDerPrecedence__ Integer NOT NULL,
	__IDPrecedence__ Integer NOT NULL
) ;

CREATE TABLE ParameterUML_doc_MetaDocument (
	__IDParameterUML__ Integer NOT NULL,
	__IDMetaDocument__ Integer NOT NULL
) ;

CREATE TABLE MetaDocument_params_ParameterUML (
	__IDMetaDocument__ Integer NOT NULL,
	__IDParameterUML__ Integer NOT NULL
) ;

CREATE TABLE MetaTaskOccurence_taskCl_MetaTask (
	__IDMetaTaskOccurence__ Integer NOT NULL,
	__IDMetaTask__ Integer NOT NULL
) ;

CREATE TABLE ParameterPrec_parbindsSour_ParBinding (
	__IDParameterPrec__ Integer NOT NULL,
	__IDParBinding__ Integer NOT NULL
) ;

CREATE TABLE Precedence_deprecs_DerPrecedence (
	__IDPrecedence__ Integer NOT NULL,
	__IDDerPrecedence__ Integer NOT NULL
) ;

CREATE TABLE DerPrecedence_auxTasks_MetaTaskOccurence (
	__IDDerPrecedence__ Integer NOT NULL,
	__IDMetaTaskOccurence__ Integer NOT NULL
) ;

CREATE TABLE ParameterPrec_parbindsTar_ParBinding (
	__IDParameterPrec__ Integer NOT NULL,
	__IDParBinding__ Integer NOT NULL
) ;

CREATE TABLE Precedence_parbind_ParBinding (
	__IDPrecedence__ Integer NOT NULL,
	__IDParBinding__ Integer NOT NULL
) ;
