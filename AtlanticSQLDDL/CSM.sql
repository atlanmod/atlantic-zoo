CREATE TABLE CSM (
	__IDCSM__ Integer NOT NULL,
	PRIMARY KEY CSM (__IDCSM__)
) ;

CREATE TABLE GeneralResource (
	__IDGeneralResource__ Integer NOT NULL,
	PRIMARY KEY GeneralResource (__IDGeneralResource__)
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	FOREIGN KEY postPath (__FKpostPath__) REFERENCES PathConnection (__IDPathConnection__),
	FOREIGN KEY prePath (__FKprePath__) REFERENCES PathConnection (__IDPathConnection__),
	FOREIGN KEY activeResource (__FKactiveResource__) REFERENCES ActiveResource (__IDActiveResource__),
	PRIMARY KEY Step (__IDStep__),
	__FKactiveResource__ Integer,
	__FKpostPath__ Integer,
	__FKprePath__ Integer
) ;

CREATE TABLE Scenarion (
	__IDScenarion__ Integer NOT NULL,
	PRIMARY KEY Scenarion (__IDScenarion__)
) ;

CREATE TABLE Start (
	__IDStart__ Integer NOT NULL,
	FOREIGN KEY workload (__FKworkload__) REFERENCES Workload (__IDWorkload__),
	PRIMARY KEY Start (__IDStart__),
	__FKworkload__ Integer
) ;

CREATE TABLE End (
	__IDEnd__ Integer NOT NULL,
	PRIMARY KEY End (__IDEnd__)
) ;

CREATE TABLE ResourceAcquire (
	__IDResourceAcquire__ Integer NOT NULL,
	FOREIGN KEY generalResource (__FKgeneralResource__) REFERENCES GeneralResource (__IDGeneralResource__),
	PRIMARY KEY ResourceAcquire (__IDResourceAcquire__),
	__FKgeneralResource__ Integer
) ;

CREATE TABLE ResourceRelease (
	__IDResourceRelease__ Integer NOT NULL,
	FOREIGN KEY generalResource (__FKgeneralResource__) REFERENCES GeneralResource (__IDGeneralResource__),
	PRIMARY KEY ResourceRelease (__IDResourceRelease__),
	__FKgeneralResource__ Integer
) ;

CREATE TABLE Workload (
	__IDWorkload__ Integer NOT NULL,
	FOREIGN KEY start (__FKstart__) REFERENCES Start (__IDStart__),
	PRIMARY KEY Workload (__IDWorkload__),
	__FKstart__ Integer
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE ProcessingResource (
	__IDProcessingResource__ Integer NOT NULL,
	PRIMARY KEY ProcessingResource (__IDProcessingResource__)
) ;

CREATE TABLE ExternalService (
	__IDExternalService__ Integer NOT NULL,
	PRIMARY KEY ExternalService (__IDExternalService__)
) ;

CREATE TABLE ActiveResource (
	__IDActiveResource__ Integer NOT NULL,
	PRIMARY KEY ActiveResource (__IDActiveResource__)
) ;

CREATE TABLE PassiveResource (
	__IDPassiveResource__ Integer NOT NULL,
	PRIMARY KEY PassiveResource (__IDPassiveResource__)
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE PathConnection (
	__IDPathConnection__ Integer NOT NULL,
	FOREIGN KEY message (__FKmessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY PathConnection (__IDPathConnection__),
	__FKmessage__ Integer
) ;

CREATE TABLE "Join" (
	__IDJoin__ Integer NOT NULL,
	PRIMARY KEY "Join" (__IDJoin__)
) ;

CREATE TABLE Fork (
	__IDFork__ Integer NOT NULL,
	PRIMARY KEY Fork (__IDFork__)
) ;

CREATE TABLE Merge (
	__IDMerge__ Integer NOT NULL,
	PRIMARY KEY Merge (__IDMerge__)
) ;

CREATE TABLE Branch (
	__IDBranch__ Integer NOT NULL,
	PRIMARY KEY Branch (__IDBranch__)
) ;

CREATE TABLE Seqence (
	__IDSeqence__ Integer NOT NULL,
	PRIMARY KEY Seqence (__IDSeqence__)
) ;

CREATE TABLE GeneralResource_resourceRelease_ResourceRelease (
	__IDGeneralResource__ Integer NOT NULL,
	__IDResourceRelease__ Integer NOT NULL
) ;

CREATE TABLE ActiveResource_step_Step (
	__IDActiveResource__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE CSM_step_Step (
	__IDCSM__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE PathConnection_post_Step (
	__IDPathConnection__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE GeneralResource_resourceAcquire_ResourceAcquire (
	__IDGeneralResource__ Integer NOT NULL,
	__IDResourceAcquire__ Integer NOT NULL
) ;

CREATE TABLE PathConnection_pre_Step (
	__IDPathConnection__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Scenarion_root_Start (
	__IDScenarion__ Integer NOT NULL,
	__IDStart__ Integer NOT NULL
) ;

CREATE TABLE CSM_generalResource_GeneralResource (
	__IDCSM__ Integer NOT NULL,
	__IDGeneralResource__ Integer NOT NULL
) ;

CREATE TABLE CSM_scenarion_Scenarion (
	__IDCSM__ Integer NOT NULL,
	__IDScenarion__ Integer NOT NULL
) ;

CREATE TABLE Scenarion_step_Step (
	__IDScenarion__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;
