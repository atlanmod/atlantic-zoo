CREATE TABLE TechnologyObject (
	__IDTechnologyObject__ Integer NOT NULL,
	PRIMARY KEY TechnologyObject (__IDTechnologyObject__)
) ;

CREATE TABLE Implementation (
	__IDImplementation__ Integer NOT NULL,
	PRIMARY KEY Implementation (__IDImplementation__)
) ;

CREATE TABLE IXIT (
	__IDIXIT__ Integer NOT NULL,
	PRIMARY KEY IXIT (__IDIXIT__)
) ;

CREATE TABLE ImplementableStandard (
	__IDImplementableStandard__ Integer NOT NULL,
	PRIMARY KEY ImplementableStandard (__IDImplementableStandard__)
) ;

CREATE TABLE TechnologyObject_toImplementation_Implementation (
	__IDTechnologyObject__ Integer NOT NULL,
	__IDImplementation__ Integer NOT NULL
) ;

CREATE TABLE ImplementableStandard_techObject_TechnologyObject (
	__IDImplementableStandard__ Integer NOT NULL,
	__IDTechnologyObject__ Integer NOT NULL
) ;

CREATE TABLE TechnologyObject_implStandard_ImplementableStandard (
	__IDTechnologyObject__ Integer NOT NULL,
	__IDImplementableStandard__ Integer NOT NULL
) ;

CREATE TABLE IXIT_ixitImplementation_Implementation (
	__IDIXIT__ Integer NOT NULL,
	__IDImplementation__ Integer NOT NULL
) ;

CREATE TABLE Implementation_implIXIT_IXIT (
	__IDImplementation__ Integer NOT NULL,
	__IDIXIT__ Integer NOT NULL
) ;

CREATE TABLE Implementation_implProduct_TechnologyObject (
	__IDImplementation__ Integer NOT NULL,
	__IDTechnologyObject__ Integer NOT NULL
) ;
