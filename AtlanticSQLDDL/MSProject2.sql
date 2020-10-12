CREATE TABLE MSPProject (
	__IDMSPProject__ Integer NOT NULL,
	PRIMARY KEY MSPProject (__IDMSPProject__)
) ;

CREATE TABLE MSPTask (
	__IDMSPTask__ Integer NOT NULL,
	finishDate text,
	startDate text,
	FOREIGN KEY project (__FKproject__) REFERENCES MSPProject (__IDMSPProject__),
	FOREIGN KEY superTask (__FKsuperTask__) REFERENCES MSPTask (__IDMSPTask__),
	PRIMARY KEY MSPTask (__IDMSPTask__),
	__FKproject__ Integer,
	__FKsuperTask__ Integer
) ;

CREATE TABLE MSPLink (
	__IDMSPLink__ Integer NOT NULL,
	FOREIGN KEY project (__FKproject__) REFERENCES MSPProject (__IDMSPProject__),
	FOREIGN KEY succ (__FKsucc__) REFERENCES MSPTask (__IDMSPTask__),
	FOREIGN KEY pred (__FKpred__) REFERENCES MSPTask (__IDMSPTask__),
	PRIMARY KEY MSPLink (__IDMSPLink__),
	__FKproject__ Integer,
	__FKpred__ Integer,
	__FKsucc__ Integer
) ;

CREATE TABLE MSPAssignment (
	__IDMSPAssignment__ Integer NOT NULL,
	FOREIGN KEY task (__FKtask__) REFERENCES MSPTask (__IDMSPTask__),
	FOREIGN KEY resource (__FKresource__) REFERENCES MSPResource (__IDMSPResource__),
	PRIMARY KEY MSPAssignment (__IDMSPAssignment__),
	__FKresource__ Integer,
	__FKtask__ Integer
) ;

CREATE TABLE MSPResource (
	__IDMSPResource__ Integer NOT NULL,
	cost "Double",
	FOREIGN KEY project (__FKproject__) REFERENCES MSPProject (__IDMSPProject__),
	PRIMARY KEY MSPResource (__IDMSPResource__),
	__FKproject__ Integer
) ;

CREATE TABLE MSPHumanResource (
	__IDMSPHumanResource__ Integer NOT NULL,
	email text,
	PRIMARY KEY MSPHumanResource (__IDMSPHumanResource__)
) ;

CREATE TABLE MSPMachine (
	__IDMSPMachine__ Integer NOT NULL,
	PRIMARY KEY MSPMachine (__IDMSPMachine__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	day Integer,
	month Integer,
	year Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE MSPTask_outLink_MSPLink (
	__IDMSPTask__ Integer NOT NULL,
	__IDMSPLink__ Integer NOT NULL
) ;

CREATE TABLE MSPResource_assignment_MSPAssignment (
	__IDMSPResource__ Integer NOT NULL,
	__IDMSPAssignment__ Integer NOT NULL
) ;

CREATE TABLE MSPTask_subTask_MSPTask (
	__IDMSPTask__ Integer NOT NULL,
	__IDMSPTask__ Integer NOT NULL
) ;

CREATE TABLE MSPProject_resource_MSPResource (
	__IDMSPProject__ Integer NOT NULL,
	__IDMSPResource__ Integer NOT NULL
) ;

CREATE TABLE MSPProject_task_MSPTask (
	__IDMSPProject__ Integer NOT NULL,
	__IDMSPTask__ Integer NOT NULL
) ;

CREATE TABLE MSPProject_link_MSPLink (
	__IDMSPProject__ Integer NOT NULL,
	__IDMSPLink__ Integer NOT NULL
) ;

CREATE TABLE MSPTask_inLink_MSPLink (
	__IDMSPTask__ Integer NOT NULL,
	__IDMSPLink__ Integer NOT NULL
) ;

CREATE TABLE MSPTask_assignment_MSPAssignment (
	__IDMSPTask__ Integer NOT NULL,
	__IDMSPAssignment__ Integer NOT NULL
) ;
