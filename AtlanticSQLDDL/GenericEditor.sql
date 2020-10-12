CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Editor (
	__IDEditor__ Integer NOT NULL,
	extension text,
	PRIMARY KEY Editor (__IDEditor__)
) ;

CREATE TABLE AbstractElement (
	__IDAbstractElement__ Integer NOT NULL,
	type text,
	FOREIGN KEY format (__FKformat__) REFERENCES Format (__IDFormat__),
	PRIMARY KEY AbstractElement (__IDAbstractElement__),
	__FKformat__ Integer
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	blockbegin text,
	blockend text,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE GroupElement (
	__IDGroupElement__ Integer NOT NULL,
	FOREIGN KEY indent (__FKindent__) REFERENCES Indent (__IDIndent__),
	PRIMARY KEY GroupElement (__IDGroupElement__),
	__FKindent__ Integer
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	element text,
	FOREIGN KEY groupElement (__FKgroupElement__) REFERENCES GroupElement (__IDGroupElement__),
	PRIMARY KEY Element (__IDElement__),
	__FKgroupElement__ Integer
) ;

CREATE TABLE Format (
	__IDFormat__ Integer NOT NULL,
	FOREIGN KEY color (__FKcolor__) REFERENCES Color (__IDColor__),
	FOREIGN KEY font (__FKfont__) REFERENCES Font (__IDFont__),
	PRIMARY KEY Format (__IDFormat__),
	__FKfont__ Integer,
	__FKcolor__ Integer
) ;

CREATE TABLE Color (
	__IDColor__ Integer NOT NULL,
	red Integer,
	green Integer,
	blue Integer,
	PRIMARY KEY Color (__IDColor__)
) ;

CREATE TABLE Font (
	__IDFont__ Integer NOT NULL,
	font text,
	bold Boolean,
	italic Boolean,
	PRIMARY KEY Font (__IDFont__)
) ;

CREATE TABLE Indent (
	__IDIndent__ Integer NOT NULL,
	retrait text,
	FOREIGN KEY groupElementIndent (__FKgroupElementIndent__) REFERENCES GroupElement (__IDGroupElement__),
	PRIMARY KEY Indent (__IDIndent__),
	__FKgroupElementIndent__ Integer
) ;

CREATE TABLE GroupElement_element_Element (
	__IDGroupElement__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Editor_abstractElements_AbstractElement (
	__IDEditor__ Integer NOT NULL,
	__IDAbstractElement__ Integer NOT NULL
) ;
