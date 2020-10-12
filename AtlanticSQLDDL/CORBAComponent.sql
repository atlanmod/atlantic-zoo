CREATE TABLE InterfaceDef (
	__IDInterfaceDef__ Integer NOT NULL,
	PRIMARY KEY InterfaceDef (__IDInterfaceDef__)
) ;

CREATE TABLE OperationDef (
	__IDOperationDef__ Integer NOT NULL,
	PRIMARY KEY OperationDef (__IDOperationDef__)
) ;

CREATE TABLE ValueDef (
	__IDValueDef__ Integer NOT NULL,
	PRIMARY KEY ValueDef (__IDValueDef__)
) ;

CREATE TABLE ComponentDef (
	__IDComponentDef__ Integer NOT NULL,
	isBasic Boolean,
	PRIMARY KEY ComponentDef (__IDComponentDef__)
) ;

CREATE TABLE ProvidesDef (
	__IDProvidesDef__ Integer NOT NULL,
	FOREIGN KEY provides (__FKprovides__) REFERENCES InterfaceDef (__IDInterfaceDef__),
	FOREIGN KEY prd_home (__FKprd_home__) REFERENCES ComponentDef (__IDComponentDef__),
	PRIMARY KEY ProvidesDef (__IDProvidesDef__),
	__FKprd_home__ Integer,
	__FKprovides__ Integer
) ;

CREATE TABLE UsesDef (
	__IDUsesDef__ Integer NOT NULL,
	multiple Boolean,
	FOREIGN KEY uses (__FKuses__) REFERENCES InterfaceDef (__IDInterfaceDef__),
	FOREIGN KEY ud_home (__FKud_home__) REFERENCES ComponentDef (__IDComponentDef__),
	PRIMARY KEY UsesDef (__IDUsesDef__),
	__FKuses__ Integer,
	__FKud_home__ Integer
) ;

CREATE TABLE EventDef (
	__IDEventDef__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES ValueDef (__IDValueDef__),
	PRIMARY KEY EventDef (__IDEventDef__),
	__FKtype__ Integer
) ;

CREATE TABLE EmitsDef (
	__IDEmitsDef__ Integer NOT NULL,
	FOREIGN KEY ed_home (__FKed_home__) REFERENCES ComponentDef (__IDComponentDef__),
	PRIMARY KEY EmitsDef (__IDEmitsDef__),
	__FKed_home__ Integer
) ;

CREATE TABLE PublishesDef (
	__IDPublishesDef__ Integer NOT NULL,
	FOREIGN KEY pud_home (__FKpud_home__) REFERENCES ComponentDef (__IDComponentDef__),
	PRIMARY KEY PublishesDef (__IDPublishesDef__),
	__FKpud_home__ Integer
) ;

CREATE TABLE ConsumesDef (
	__IDConsumesDef__ Integer NOT NULL,
	FOREIGN KEY cd_home (__FKcd_home__) REFERENCES ComponentDef (__IDComponentDef__),
	PRIMARY KEY ConsumesDef (__IDConsumesDef__),
	__FKcd_home__ Integer
) ;

CREATE TABLE HomeDef (
	__IDHomeDef__ Integer NOT NULL,
	FOREIGN KEY manages (__FKmanages__) REFERENCES ComponentDef (__IDComponentDef__),
	FOREIGN KEY "key" (__FKkey__) REFERENCES PrimaryKeyDef (__IDPrimaryKeyDef__),
	PRIMARY KEY HomeDef (__IDHomeDef__),
	__FKmanages__ Integer,
	__FKkey__ Integer
) ;

CREATE TABLE FactoryDef (
	__IDFactoryDef__ Integer NOT NULL,
	FOREIGN KEY fa_home (__FKfa_home__) REFERENCES HomeDef (__IDHomeDef__),
	PRIMARY KEY FactoryDef (__IDFactoryDef__),
	__FKfa_home__ Integer
) ;

CREATE TABLE FinderDef (
	__IDFinderDef__ Integer NOT NULL,
	FOREIGN KEY fi_home (__FKfi_home__) REFERENCES HomeDef (__IDHomeDef__),
	PRIMARY KEY FinderDef (__IDFinderDef__),
	__FKfi_home__ Integer
) ;

CREATE TABLE PrimaryKeyDef (
	__IDPrimaryKeyDef__ Integer NOT NULL,
	FOREIGN KEY pkd_home (__FKpkd_home__) REFERENCES HomeDef (__IDHomeDef__),
	FOREIGN KEY type (__FKtype__) REFERENCES ValueDef (__IDValueDef__),
	PRIMARY KEY PrimaryKeyDef (__IDPrimaryKeyDef__),
	__FKtype__ Integer,
	__FKpkd_home__ Integer
) ;

CREATE TABLE ComponentDef_receptacles_UsesDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDUsesDef__ Integer NOT NULL
) ;

CREATE TABLE ComponentDef_emits_EmitsDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDEmitsDef__ Integer NOT NULL
) ;

CREATE TABLE ComponentDef_supports_InterfaceDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDInterfaceDef__ Integer NOT NULL
) ;

CREATE TABLE ComponentDef_publishes_PublishesDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDPublishesDef__ Integer NOT NULL
) ;

CREATE TABLE ComponentDef_consumes_ConsumesDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDConsumesDef__ Integer NOT NULL
) ;

CREATE TABLE HomeDef_factories_FactoryDef (
	__IDHomeDef__ Integer NOT NULL,
	__IDFactoryDef__ Integer NOT NULL
) ;

CREATE TABLE HomeDef_finders_FinderDef (
	__IDHomeDef__ Integer NOT NULL,
	__IDFinderDef__ Integer NOT NULL
) ;

CREATE TABLE ComponentDef_facets_ProvidesDef (
	__IDComponentDef__ Integer NOT NULL,
	__IDProvidesDef__ Integer NOT NULL
) ;
