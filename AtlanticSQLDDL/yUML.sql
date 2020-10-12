CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKmodel__ Integer
) ;

CREATE TABLE ColorableElement (
	__IDColorableElement__ Integer NOT NULL,
	color text,
	PRIMARY KEY ColorableElement (__IDColorableElement__)
) ;

CREATE TABLE ClassReference (
	__IDClassReference__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	stereotype text,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES ClassDefinition (__IDClassDefinition__),
	PRIMARY KEY ClassReference (__IDClassReference__),
	__FKclass__ Integer,
	__FKdefinition__ Integer
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES ClassReference (__IDClassReference__),
	FOREIGN KEY target (__FKtarget__) REFERENCES ClassReference (__IDClassReference__),
	PRIMARY KEY Relationship (__IDRelationship__),
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE ClassDefinition (
	__IDClassDefinition__ Integer NOT NULL,
	PRIMARY KEY ClassDefinition (__IDClassDefinition__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	type text,
	FOREIGN KEY sourceCardinality (__FKsourceCardinality__) REFERENCES Cardinality (__IDCardinality__),
	sourceLabel text,
	navigableSource Boolean,
	sourceVisibility text,
	FOREIGN KEY targetCardinality (__FKtargetCardinality__) REFERENCES Cardinality (__IDCardinality__),
	targetLabel text,
	navigableTarget Boolean,
	targetVisibility text,
	PRIMARY KEY Association (__IDAssociation__),
	__FKsourceCardinality__ Integer,
	__FKtargetCardinality__ Integer
) ;

CREATE TABLE Inheritance (
	__IDInheritance__ Integer NOT NULL,
	PRIMARY KEY Inheritance (__IDInheritance__)
) ;

CREATE TABLE Cardinality (
	__IDCardinality__ Integer NOT NULL,
	lowerBound Integer,
	upperBound Integer,
	PRIMARY KEY Cardinality (__IDCardinality__)
) ;

CREATE TABLE ClassMember (
	__IDClassMember__ Integer NOT NULL,
	visibility text,
	name text,
	PRIMARY KEY ClassMember (__IDClassMember__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	type text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	PRIMARY KEY Method (__IDMethod__)
) ;

CREATE TABLE Note (
	__IDNote__ Integer NOT NULL,
	PRIMARY KEY Note (__IDNote__)
) ;

CREATE TABLE NoteAssociation (
	__IDNoteAssociation__ Integer NOT NULL,
	FOREIGN KEY note (__FKnote__) REFERENCES Note (__IDNote__),
	PRIMARY KEY NoteAssociation (__IDNoteAssociation__),
	__FKnote__ Integer
) ;

CREATE TABLE Model_classes_Class (
	__IDModel__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Model_elements_ModelElement (
	__IDModel__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ClassDefinition_attributes_Attribute (
	__IDClassDefinition__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE ClassDefinition_methods_Method (
	__IDClassDefinition__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;
