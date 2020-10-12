CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	id text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	"for" text,
	attrName text,
	type text,
	defValue text,
	PRIMARY KEY "Key" (__IDKey__)
) ;

CREATE TABLE Graph (
	__IDGraph__ Integer NOT NULL,
	edgeDefault text,
	PRIMARY KEY Graph (__IDGraph__)
) ;

CREATE TABLE Edge (
	__IDEdge__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES Node (__IDNode__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Node (__IDNode__),
	FOREIGN KEY sourceport (__FKsourceport__) REFERENCES Port (__IDPort__),
	FOREIGN KEY targetport (__FKtargetport__) REFERENCES Port (__IDPort__),
	PRIMARY KEY Edge (__IDEdge__),
	__FKsource__ Integer,
	__FKtarget__ Integer,
	__FKsourceport__ Integer,
	__FKtargetport__ Integer
) ;

CREATE TABLE HyperEdge (
	__IDHyperEdge__ Integer NOT NULL,
	PRIMARY KEY HyperEdge (__IDHyperEdge__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY subgraph (__FKsubgraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY Node (__IDNode__),
	__FKsubgraph__ Integer
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	name text,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE EndPoint (
	__IDEndPoint__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY port (__FKport__) REFERENCES Port (__IDPort__),
	PRIMARY KEY EndPoint (__IDEndPoint__),
	__FKnode__ Integer,
	__FKport__ Integer
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	"key" text,
	value text,
	PRIMARY KEY Data (__IDData__)
) ;

CREATE TABLE Root_keys_Key (
	__IDRoot__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE Root_graphs_Graph (
	__IDRoot__ Integer NOT NULL,
	__IDGraph__ Integer NOT NULL
) ;

CREATE TABLE Element_datas_Data (
	__IDElement__ Integer NOT NULL,
	__IDData__ Integer NOT NULL
) ;

CREATE TABLE Graph_contents_Element (
	__IDGraph__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE HyperEdge_endpoints_EndPoint (
	__IDHyperEdge__ Integer NOT NULL,
	__IDEndPoint__ Integer NOT NULL
) ;

CREATE TABLE Node_ports_Port (
	__IDNode__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;
