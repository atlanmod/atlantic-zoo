CREATE TABLE BusinessTemplate (
	__IDBusinessTemplate__ Integer NOT NULL,
	PRIMARY KEY BusinessTemplate (__IDBusinessTemplate__)
) ;

CREATE TABLE BusinessContact (
	__IDBusinessContact__ Integer NOT NULL,
	PRIMARY KEY BusinessContact (__IDBusinessContact__)
) ;

CREATE TABLE BusinessService (
	__IDBusinessService__ Integer NOT NULL,
	PRIMARY KEY BusinessService (__IDBusinessService__)
) ;

CREATE TABLE BusinessEntity (
	__IDBusinessEntity__ Integer NOT NULL,
	FOREIGN KEY identifierBag (__FKidentifierBag__) REFERENCES IdentifierBag (__IDIdentifierBag__),
	PRIMARY KEY BusinessEntity (__IDBusinessEntity__),
	__FKidentifierBag__ Integer
) ;

CREATE TABLE IdentifierBag (
	__IDIdentifierBag__ Integer NOT NULL,
	PRIMARY KEY IdentifierBag (__IDIdentifierBag__)
) ;

CREATE TABLE TModel (
	__IDTModel__ Integer NOT NULL,
	FOREIGN KEY identifierBag (__FKidentifierBag__) REFERENCES IdentifierBag (__IDIdentifierBag__),
	PRIMARY KEY TModel (__IDTModel__),
	__FKidentifierBag__ Integer
) ;

CREATE TABLE OverviewDocument (
	__IDOverviewDocument__ Integer NOT NULL,
	PRIMARY KEY OverviewDocument (__IDOverviewDocument__)
) ;

CREATE TABLE BusinessEntity_businessServices_BusinessService (
	__IDBusinessEntity__ Integer NOT NULL,
	__IDBusinessService__ Integer NOT NULL
) ;

CREATE TABLE TModel_overviewDocuments_OverviewDocument (
	__IDTModel__ Integer NOT NULL,
	__IDOverviewDocument__ Integer NOT NULL
) ;

CREATE TABLE BusinessEntity_businessContacts_BusinessContact (
	__IDBusinessEntity__ Integer NOT NULL,
	__IDBusinessContact__ Integer NOT NULL
) ;
