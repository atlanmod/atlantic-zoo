CREATE TABLE ExecutionGraph (
	__IDExecutionGraph__ Integer NOT NULL,
	FOREIGN KEY nodeNested (__FKnodeNested__) REFERENCES Node (__IDNode__),
	PRIMARY KEY ExecutionGraph (__IDExecutionGraph__),
	__FKnodeNested__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY executionGraph (__FKexecutionGraph__) REFERENCES ExecutionGraph (__IDExecutionGraph__),
	PRIMARY KEY Node (__IDNode__),
	__FKexecutionGraph__ Integer
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

CREATE TABLE Basic (
	__IDBasic__ Integer NOT NULL,
	PRIMARY KEY Basic (__IDBasic__)
) ;

CREATE TABLE Branch (
	__IDBranch__ Integer NOT NULL,
	PRIMARY KEY Branch (__IDBranch__)
) ;

CREATE TABLE "Loop" (
	__IDLoop__ Integer NOT NULL,
	PRIMARY KEY "Loop" (__IDLoop__)
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
	PRIMARY KEY Acquire (__IDAcquire__)
) ;

CREATE TABLE "Release" (
	__IDRelease__ Integer NOT NULL,
	PRIMARY KEY "Release" (__IDRelease__)
) ;

CREATE TABLE Split (
	__IDSplit__ Integer NOT NULL,
	PRIMARY KEY Split (__IDSplit__)
) ;

CREATE TABLE Node_nested_ExecutionGraph (
	__IDNode__ Integer NOT NULL,
	__IDExecutionGraph__ Integer NOT NULL
) ;

CREATE TABLE ExecutionGraph_node_Node (
	__IDExecutionGraph__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Node_successor_Node (
	__IDNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Node_predecessor_Node (
	__IDNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;
