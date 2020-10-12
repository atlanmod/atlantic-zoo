CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE BusinessEntityPropertySet (
	__IDBusinessEntityPropertySet__ Integer NOT NULL,
	PRIMARY KEY BusinessEntityPropertySet (__IDBusinessEntityPropertySet__)
) ;

CREATE TABLE BusinessRole (
	__IDBusinessRole__ Integer NOT NULL,
	FOREIGN KEY characterisedby (__FKcharacterisedby__) REFERENCES BusinessEntityPropertySet (__IDBusinessEntityPropertySet__),
	FOREIGN KEY typ (__FKtyp__) REFERENCES Class (__IDClass__),
	PRIMARY KEY BusinessRole (__IDBusinessRole__),
	__FKtyp__ Integer,
	__FKcharacterisedby__ Integer
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE ArtifactRole (
	__IDArtifactRole__ Integer NOT NULL,
	PRIMARY KEY ArtifactRole (__IDArtifactRole__)
) ;

CREATE TABLE PerformerRole (
	__IDPerformerRole__ Integer NOT NULL,
	FOREIGN KEY perform (__FKperform__) REFERENCES Task (__IDTask__),
	PRIMARY KEY PerformerRole (__IDPerformerRole__),
	__FKperform__ Integer
) ;

CREATE TABLE OrganisationalUnit (
	__IDOrganisationalUnit__ Integer NOT NULL,
	PRIMARY KEY OrganisationalUnit (__IDOrganisationalUnit__)
) ;

CREATE TABLE BusinessEntity (
	__IDBusinessEntity__ Integer NOT NULL,
	PRIMARY KEY BusinessEntity (__IDBusinessEntity__)
) ;

CREATE TABLE Task_needs_ArtifactRole (
	__IDTask__ Integer NOT NULL,
	__IDArtifactRole__ Integer NOT NULL
) ;

CREATE TABLE BusinessRole_fille_BusinessEntity (
	__IDBusinessRole__ Integer NOT NULL,
	__IDBusinessEntity__ Integer NOT NULL
) ;

CREATE TABLE Task_associatedWith_BusinessRole (
	__IDTask__ Integer NOT NULL,
	__IDBusinessRole__ Integer NOT NULL
) ;

CREATE TABLE BusinessEntity_placehold_BusinessRole (
	__IDBusinessEntity__ Integer NOT NULL,
	__IDBusinessRole__ Integer NOT NULL
) ;

CREATE TABLE BusinessRole_task_Task (
	__IDBusinessRole__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;
