CREATE TABLE TypeDescription (
	__IDTypeDescription__ Integer NOT NULL,
	name text,
	PRIMARY KEY TypeDescription (__IDTypeDescription__)
) ;

CREATE TABLE Notation (
	__IDNotation__ Integer NOT NULL,
	content text,
	PRIMARY KEY Notation (__IDNotation__)
) ;

CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	content text,
	isInternal Boolean,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE AnyElement (
	__IDAnyElement__ Integer NOT NULL,
	PRIMARY KEY AnyElement (__IDAnyElement__)
) ;

CREATE TABLE RestrictedElement (
	__IDRestrictedElement__ Integer NOT NULL,
	FOREIGN KEY content (__FKcontent__) REFERENCES ElementContent (__IDElementContent__),
	PRIMARY KEY RestrictedElement (__IDRestrictedElement__),
	__FKcontent__ Integer
) ;

CREATE TABLE ElementContent (
	__IDElementContent__ Integer NOT NULL,
	PRIMARY KEY ElementContent (__IDElementContent__)
) ;

CREATE TABLE Mixed (
	__IDMixed__ Integer NOT NULL,
	elements text,
	PRIMARY KEY Mixed (__IDMixed__)
) ;

CREATE TABLE Children (
	__IDChildren__ Integer NOT NULL,
	occ text,
	PRIMARY KEY Children (__IDChildren__)
) ;

CREATE TABLE Sequence (
	__IDSequence__ Integer NOT NULL,
	PRIMARY KEY Sequence (__IDSequence__)
) ;

CREATE TABLE Leaf (
	__IDLeaf__ Integer NOT NULL,
	elementName text,
	PRIMARY KEY Leaf (__IDLeaf__)
) ;

CREATE TABLE Choice (
	__IDChoice__ Integer NOT NULL,
	PRIMARY KEY Choice (__IDChoice__)
) ;

CREATE TABLE AttributeList (
	__IDAttributeList__ Integer NOT NULL,
	PRIMARY KEY AttributeList (__IDAttributeList__)
) ;

CREATE TABLE AttributeDescription (
	__IDAttributeDescription__ Integer NOT NULL,
	FOREIGN KEY attributeList (__FKattributeList__) REFERENCES AttributeList (__IDAttributeList__),
	FOREIGN KEY type (__FKtype__) REFERENCES AttributeType (__IDAttributeType__),
	PRIMARY KEY AttributeDescription (__IDAttributeDescription__),
	__FKattributeList__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE NoDefaultValue (
	__IDNoDefaultValue__ Integer NOT NULL,
	isRequired Boolean,
	PRIMARY KEY NoDefaultValue (__IDNoDefaultValue__)
) ;

CREATE TABLE DefaultValue (
	__IDDefaultValue__ Integer NOT NULL,
	value text,
	isFixed Boolean,
	PRIMARY KEY DefaultValue (__IDDefaultValue__)
) ;

CREATE TABLE AttributeType (
	__IDAttributeType__ Integer NOT NULL,
	PRIMARY KEY AttributeType (__IDAttributeType__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	"values" text,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE OtherAttributeType (
	__IDOtherAttributeType__ Integer NOT NULL,
	type text,
	PRIMARY KEY OtherAttributeType (__IDOtherAttributeType__)
) ;

CREATE TABLE Choice_childrenChoice_Children (
	__IDChoice__ Integer NOT NULL,
	__IDChildren__ Integer NOT NULL
) ;

CREATE TABLE AttributeList_containsAttributes_AttributeDescription (
	__IDAttributeList__ Integer NOT NULL,
	__IDAttributeDescription__ Integer NOT NULL
) ;

CREATE TABLE Sequence_children_Children (
	__IDSequence__ Integer NOT NULL,
	__IDChildren__ Integer NOT NULL
) ;
