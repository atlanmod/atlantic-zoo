CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	FOREIGN KEY constrainedStereotype (__FKconstrainedStereotype__) REFERENCES Stereotype (__IDStereotype__),
	PRIMARY KEY "Constraint" (__IDConstraint__),
	__FKconstrainedStereotype__ Integer
) ;

CREATE TABLE TaggedValue (
	__IDTaggedValue__ Integer NOT NULL,
	dataValue text,
	FOREIGN KEY type (__FKtype__) REFERENCES TagDefinition (__IDTagDefinition__),
	PRIMARY KEY TaggedValue (__IDTaggedValue__),
	__FKtype__ Integer
) ;

CREATE TABLE TagDefinition (
	__IDTagDefinition__ Integer NOT NULL,
	tagType text,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	FOREIGN KEY owner (__FKowner__) REFERENCES Stereotype (__IDStereotype__),
	PRIMARY KEY TagDefinition (__IDTagDefinition__),
	__FKmultiplicity__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Multiplicity (
	__IDMultiplicity__ Integer NOT NULL,
	value text,
	PRIMARY KEY Multiplicity (__IDMultiplicity__)
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	FOREIGN KEY icon (__FKicon__) REFERENCES Geometry (__IDGeometry__),
	PRIMARY KEY Stereotype (__IDStereotype__),
	__FKicon__ Integer
) ;

CREATE TABLE Geometry (
	__IDGeometry__ Integer NOT NULL,
	value text,
	PRIMARY KEY Geometry (__IDGeometry__)
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	value text,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE Stereotype_baseClass_Name (
	__IDStereotype__ Integer NOT NULL,
	__IDName__ Integer NOT NULL
) ;

CREATE TABLE Constraint_constrainedElement_ModelElement (
	__IDConstraint__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_extendedElement_ModelElement (
	__IDStereotype__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_definedTag_TagDefinition (
	__IDStereotype__ Integer NOT NULL,
	__IDTagDefinition__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_taggedValue_TaggedValue (
	__IDModelElement__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE TaggedValue_referenceValue_ModelElement (
	__IDTaggedValue__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE TagDefinition_typedValue_TaggedValue (
	__IDTagDefinition__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_referenceTag_TaggedValue (
	__IDModelElement__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_constraint_Constraint (
	__IDModelElement__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_stereotypeConstraint_Constraint (
	__IDStereotype__ Integer NOT NULL,
	__IDConstraint__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_stereotype_Stereotype (
	__IDModelElement__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;
