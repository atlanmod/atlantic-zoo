CREATE TABLE MSProject (
	__IDMSProject__ Integer NOT NULL,
	PRIMARY KEY MSProject (__IDMSProject__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	UID text,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE MSProject_tasks_Task (
	__IDMSProject__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Task_predecessors_Task (
	__IDTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;
