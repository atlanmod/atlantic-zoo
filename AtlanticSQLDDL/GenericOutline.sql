CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Outline (
	__IDOutline__ Integer NOT NULL,
	extension text,
	PRIMARY KEY Outline (__IDOutline__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	name text,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES "Label" (__IDLabel__),
	icon text,
	FOREIGN KEY outline (__FKoutline__) REFERENCES Outline (__IDOutline__),
	PRIMARY KEY Node (__IDNode__),
	__FKoutline__ Integer,
	__FKlabel__ Integer
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	"label" text,
	methodCall text,
	PRIMARY KEY "Label" (__IDLabel__)
) ;

CREATE TABLE LabelSuite (
	__IDLabelSuite__ Integer NOT NULL,
	"label" text,
	methodCall text,
	PRIMARY KEY LabelSuite (__IDLabelSuite__)
) ;

CREATE TABLE Map (
	__IDMap__ Integer NOT NULL,
	mapString text,
	PRIMARY KEY Map (__IDMap__)
) ;

CREATE TABLE Outline_nodes_Node (
	__IDOutline__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;

CREATE TABLE Label_labelSuite_LabelSuite (
	__IDLabel__ Integer NOT NULL,
	__IDLabelSuite__ Integer NOT NULL
) ;

CREATE TABLE Node_mapping_Map (
	__IDNode__ Integer NOT NULL,
	__IDMap__ Integer NOT NULL
) ;
