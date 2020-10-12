CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Graph (
	__IDGraph__ Integer NOT NULL,
	type text,
	rankDir text,
	dim Integer,
	PRIMARY KEY Graph (__IDGraph__)
) ;

CREATE TABLE GraphElement (
	__IDGraphElement__ Integer NOT NULL,
	"label" text,
	color text,
	z Integer,
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY GraphElement (__IDGraphElement__),
	__FKgraph__ Integer
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	shape text,
	style text,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE DirectedArc (
	__IDDirectedArc__ Integer NOT NULL,
	sourceNode text,
	sourcePart text,
	targetNode text,
	targetPart text,
	shape text,
	PRIMARY KEY DirectedArc (__IDDirectedArc__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	val text,
	PRIMARY KEY "Constraint" (__IDConstraint__)
) ;

CREATE TABLE SubGraph (
	__IDSubGraph__ Integer NOT NULL,
	PRIMARY KEY SubGraph (__IDSubGraph__)
) ;

CREATE TABLE Graph_contents_GraphElement (
	__IDGraph__ Integer NOT NULL,
	__IDGraphElement__ Integer NOT NULL
) ;
