CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	name text,
	type text,
	capacity Integer,
	schedulingPolicy text,
	description text,
	FOREIGN KEY acquire (__FKacquire__) REFERENCES Acquire (__IDAcquire__),
	FOREIGN KEY "release" (__FKrelease__) REFERENCES "Release" (__IDRelease__),
	PRIMARY KEY Resource (__IDResource__),
	__FKacquire__ Integer,
	__FKrelease__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	name text,
	formalParams text,
	speedAttr text,
	failAttr text,
	description text,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Behavior (
	__IDBehavior__ Integer NOT NULL,
	FOREIGN KEY stepn (__FKstepn__) REFERENCES Step (__IDStep__),
	FOREIGN KEY service (__FKservice__) REFERENCES Service (__IDService__),
	FOREIGN KEY workLoad (__FKworkLoad__) REFERENCES WorkLoad (__IDWorkLoad__),
	PRIMARY KEY Behavior (__IDBehavior__),
	__FKservice__ Integer,
	__FKworkLoad__ Integer,
	__FKstepn__ Integer
) ;

CREATE TABLE WorkLoad (
	__IDWorkLoad__ Integer NOT NULL,
	workLoadType text,
	arrivalProcess text,
	population text,
	initialResource text,
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY WorkLoad (__IDWorkLoad__),
	__FKbehavior__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	name text,
	repetition text,
	internalExecTime text,
	internalFailProb text,
	completionModel text,
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	FOREIGN KEY nestedBehavior (__FKnestedBehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY Step (__IDStep__),
	__FKnestedBehavior__ Integer,
	__FKbehavior__ Integer
) ;

CREATE TABLE Start (
	__IDStart__ Integer NOT NULL,
	PRIMARY KEY Start (__IDStart__)
) ;

CREATE TABLE End (
	__IDEnd__ Integer NOT NULL,
	PRIMARY KEY End (__IDEnd__)
) ;

CREATE TABLE Control (
	__IDControl__ Integer NOT NULL,
	PRIMARY KEY Control (__IDControl__)
) ;

CREATE TABLE InternalActivity (
	__IDInternalActivity__ Integer NOT NULL,
	PRIMARY KEY InternalActivity (__IDInternalActivity__)
) ;

CREATE TABLE ServiceCall (
	__IDServiceCall__ Integer NOT NULL,
	resourceType text,
	serviceName text,
	isSynch Boolean,
	FOREIGN KEY step (__FKstep__) REFERENCES Step (__IDStep__),
	FOREIGN KEY calledService (__FKcalledService__) REFERENCES Service (__IDService__),
	PRIMARY KEY ServiceCall (__IDServiceCall__),
	__FKstep__ Integer,
	__FKcalledService__ Integer
) ;

CREATE TABLE ActualParam (
	__IDActualParam__ Integer NOT NULL,
	value text,
	FOREIGN KEY serviceCall (__FKserviceCall__) REFERENCES ServiceCall (__IDServiceCall__),
	PRIMARY KEY ActualParam (__IDActualParam__),
	__FKserviceCall__ Integer
) ;

CREATE TABLE Branch (
	__IDBranch__ Integer NOT NULL,
	branchProbs text,
	PRIMARY KEY Branch (__IDBranch__)
) ;

CREATE TABLE Fork (
	__IDFork__ Integer NOT NULL,
	PRIMARY KEY Fork (__IDFork__)
) ;

CREATE TABLE "Join" (
	__IDJoin__ Integer NOT NULL,
	PRIMARY KEY "Join" (__IDJoin__)
) ;

CREATE TABLE Acquire (
	__IDAcquire__ Integer NOT NULL,
	resourceUnits text,
	FOREIGN KEY resource (__FKresource__) REFERENCES Resource (__IDResource__),
	PRIMARY KEY Acquire (__IDAcquire__),
	__FKresource__ Integer
) ;

CREATE TABLE "Release" (
	__IDRelease__ Integer NOT NULL,
	resourceUnits text,
	FOREIGN KEY resource (__FKresource__) REFERENCES Resource (__IDResource__),
	PRIMARY KEY "Release" (__IDRelease__),
	__FKresource__ Integer
) ;

CREATE TABLE Behavior_usedService_Service (
	__IDBehavior__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE Behavior_stepb_Step (
	__IDBehavior__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Service_behaviorUsed_Behavior (
	__IDService__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Step_serviceCall_ServiceCall (
	__IDStep__ Integer NOT NULL,
	__IDServiceCall__ Integer NOT NULL
) ;

CREATE TABLE Service_behavior_Behavior (
	__IDService__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Step_successor_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE ServiceCall_actualParam_ActualParam (
	__IDServiceCall__ Integer NOT NULL,
	__IDActualParam__ Integer NOT NULL
) ;

CREATE TABLE Service_serviceCall_ServiceCall (
	__IDService__ Integer NOT NULL,
	__IDServiceCall__ Integer NOT NULL
) ;

CREATE TABLE Step_predecessor_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;
