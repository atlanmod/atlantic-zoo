CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	name text,
	company text,
	viewDate text,
	viewIndex text,
	ganttDividerLocation Integer,
	ressourceDividerLocation Integer,
	webLink text,
	FOREIGN KEY tasks (__FKtasks__) REFERENCES Tasks (__IDTasks__),
	PRIMARY KEY Project (__IDProject__),
	__FKtasks__ Integer
) ;

CREATE TABLE Tasks (
	__IDTasks__ Integer NOT NULL,
	color text,
	PRIMARY KEY Tasks (__IDTasks__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	id text,
	name text,
	meeting Boolean,
	color text,
	expand Boolean,
	complete Integer,
	duration Integer,
	priority Integer,
	start text,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE Depend (
	__IDDepend__ Integer NOT NULL,
	id text,
	type Integer,
	difference Integer,
	hardness text,
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY Depend (__IDDepend__),
	__FKtask__ Integer
) ;

CREATE TABLE Ressource (
	__IDRessource__ Integer NOT NULL,
	Id text,
	name text,
	fonction text,
	contact text,
	phone text,
	PRIMARY KEY Ressource (__IDRessource__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE Allocation (
	__IDAllocation__ Integer NOT NULL,
	taskId text,
	ressourceId text,
	name text,
	function text,
	responsible Boolean,
	"load" Integer,
	PRIMARY KEY Allocation (__IDAllocation__)
) ;

CREATE TABLE Vacation (
	__IDVacation__ Integer NOT NULL,
	PRIMARY KEY Vacation (__IDVacation__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Previous (
	__IDPrevious__ Integer NOT NULL,
	PRIMARY KEY Previous (__IDPrevious__)
) ;

CREATE TABLE Project_ressources_Ressource (
	__IDProject__ Integer NOT NULL,
	__IDRessource__ Integer NOT NULL
) ;

CREATE TABLE Project_allocations_Allocation (
	__IDProject__ Integer NOT NULL,
	__IDAllocation__ Integer NOT NULL
) ;

CREATE TABLE Tasks_tasks_Task (
	__IDTasks__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Task_depends_Depend (
	__IDTask__ Integer NOT NULL,
	__IDDepend__ Integer NOT NULL
) ;
