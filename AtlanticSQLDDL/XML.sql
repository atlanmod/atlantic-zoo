CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	startLine Integer,
	startColumn Integer,
	endLine Integer,
	endColumn Integer,
	name text,
	value text,
	FOREIGN KEY parent (__FKparent__) REFERENCES Element (__IDElement__),
	PRIMARY KEY Node (__IDNode__),
	__FKparent__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE Element_children_Node (
	__IDElement__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;
