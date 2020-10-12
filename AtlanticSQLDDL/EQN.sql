CREATE TABLE RoutingChain (
	__IDRoutingChain__ Integer NOT NULL,
	PRIMARY KEY RoutingChain (__IDRoutingChain__)
) ;

CREATE TABLE QueuingNetwork (
	__IDQueuingNetwork__ Integer NOT NULL,
	FOREIGN KEY workLoad (__FKworkLoad__) REFERENCES RoutingChain (__IDRoutingChain__),
	PRIMARY KEY QueuingNetwork (__IDQueuingNetwork__),
	__FKworkLoad__ Integer
) ;

CREATE TABLE ExecutionGraph (
	__IDExecutionGraph__ Integer NOT NULL,
	FOREIGN KEY nodeNested (__FKnodeNested__) REFERENCES Node (__IDNode__),
	PRIMARY KEY ExecutionGraph (__IDExecutionGraph__),
	__FKnodeNested__ Integer
) ;

CREATE TABLE Center (
	__IDCenter__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY queuingNetwork (__FKqueuingNetwork__) REFERENCES QueuingNetwork (__IDQueuingNetwork__),
	PRIMARY KEY Center (__IDCenter__),
	__FKqueuingNetwork__ Integer,
	__FKnode__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY nested (__FKnested__) REFERENCES ExecutionGraph (__IDExecutionGraph__),
	FOREIGN KEY executionGraph (__FKexecutionGraph__) REFERENCES ExecutionGraph (__IDExecutionGraph__),
	PRIMARY KEY Node (__IDNode__),
	__FKnested__ Integer,
	__FKexecutionGraph__ Integer
) ;

CREATE TABLE Special (
	__IDSpecial__ Integer NOT NULL,
	PRIMARY KEY Special (__IDSpecial__)
) ;

CREATE TABLE ActiveCenter (
	__IDActiveCenter__ Integer NOT NULL,
	PRIMARY KEY ActiveCenter (__IDActiveCenter__)
) ;

CREATE TABLE PassiveCenter (
	__IDPassiveCenter__ Integer NOT NULL,
	PRIMARY KEY PassiveCenter (__IDPassiveCenter__)
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	PRIMARY KEY Source (__IDSource__)
) ;

CREATE TABLE Sink (
	__IDSink__ Integer NOT NULL,
	PRIMARY KEY Sink (__IDSink__)
) ;

CREATE TABLE Fork (
	__IDFork__ Integer NOT NULL,
	PRIMARY KEY Fork (__IDFork__)
) ;

CREATE TABLE "Join" (
	__IDJoin__ Integer NOT NULL,
	PRIMARY KEY "Join" (__IDJoin__)
) ;

CREATE TABLE Split (
	__IDSplit__ Integer NOT NULL,
	PRIMARY KEY Split (__IDSplit__)
) ;

CREATE TABLE Allocate (
	__IDAllocate__ Integer NOT NULL,
	PRIMARY KEY Allocate (__IDAllocate__)
) ;

CREATE TABLE "Release" (
	__IDRelease__ Integer NOT NULL,
	PRIMARY KEY "Release" (__IDRelease__)
) ;

CREATE TABLE ExecutionGraph_node_Node (
	__IDExecutionGraph__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE RoutingChain_queuingNetwork_QueuingNetwork (
	__IDRoutingChain__ Integer NOT NULL,
	__IDQueuingNetwork__ Integer NOT NULL
) ;

CREATE TABLE QueuingNetwork_center_Center (
	__IDQueuingNetwork__ Integer NOT NULL,
	__IDCenter__ Integer NOT NULL
) ;

CREATE TABLE Node_demand_Center (
	__IDNode__ Integer NOT NULL,
	__IDCenter__ Integer NOT NULL
) ;
