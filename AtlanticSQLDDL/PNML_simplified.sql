CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE IdedElement (
	__IDIdedElement__ Integer NOT NULL,
	id text,
	PRIMARY KEY IdedElement (__IDIdedElement__)
) ;

CREATE TABLE URI (
	__IDURI__ Integer NOT NULL,
	value text,
	PRIMARY KEY URI (__IDURI__)
) ;

CREATE TABLE PNMLDocument (
	__IDPNMLDocument__ Integer NOT NULL,
	FOREIGN KEY xmlns (__FKxmlns__) REFERENCES URI (__IDURI__),
	PRIMARY KEY PNMLDocument (__IDPNMLDocument__),
	__FKxmlns__ Integer
) ;

CREATE TABLE NetElement (
	__IDNetElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES URI (__IDURI__),
	FOREIGN KEY document (__FKdocument__) REFERENCES PNMLDocument (__IDPNMLDocument__),
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY NetElement (__IDNetElement__),
	__FKtype__ Integer,
	__FKname__ Integer,
	__FKdocument__ Integer
) ;

CREATE TABLE NetContent (
	__IDNetContent__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY NetContent (__IDNetContent__),
	__FKname__ Integer,
	__FKnet__ Integer
) ;

CREATE TABLE LabeledElement (
	__IDLabeledElement__ Integer NOT NULL,
	PRIMARY KEY LabeledElement (__IDLabeledElement__)
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	text text,
	FOREIGN KEY labeledElement (__FKlabeledElement__) REFERENCES LabeledElement (__IDLabeledElement__),
	PRIMARY KEY "Label" (__IDLabel__),
	__FKlabeledElement__ Integer
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	FOREIGN KEY netContent (__FKnetContent__) REFERENCES NetContent (__IDNetContent__),
	PRIMARY KEY Name (__IDName__),
	__FKnetContent__ Integer,
	__FKnet__ Integer
) ;

CREATE TABLE NetContentElement (
	__IDNetContentElement__ Integer NOT NULL,
	PRIMARY KEY NetContentElement (__IDNetContentElement__)
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES NetContentElement (__IDNetContentElement__),
	FOREIGN KEY target (__FKtarget__) REFERENCES NetContentElement (__IDNetContentElement__),
	PRIMARY KEY Arc (__IDArc__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE Place (
	__IDPlace__ Integer NOT NULL,
	PRIMARY KEY Place (__IDPlace__)
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	PRIMARY KEY Transition (__IDTransition__)
) ;

CREATE TABLE NetElement_contents_NetContent (
	__IDNetElement__ Integer NOT NULL,
	__IDNetContent__ Integer NOT NULL
) ;

CREATE TABLE LabeledElement_labels_Label (
	__IDLabeledElement__ Integer NOT NULL,
	__IDLabel__ Integer NOT NULL
) ;

CREATE TABLE PNMLDocument_nets_NetElement (
	__IDPNMLDocument__ Integer NOT NULL,
	__IDNetElement__ Integer NOT NULL
) ;
