CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY stereotype (__FKstereotype__) REFERENCES Stereotype (__IDStereotype__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKstereotype__ Integer
) ;

CREATE TABLE KDMEntity (
	__IDKDMEntity__ Integer NOT NULL,
	name text,
	FOREIGN KEY owner (__FKowner__) REFERENCES KDMContainer (__IDKDMContainer__),
	FOREIGN KEY model (__FKmodel__) REFERENCES KDMModel (__IDKDMModel__),
	PRIMARY KEY KDMEntity (__IDKDMEntity__),
	__FKowner__ Integer,
	__FKmodel__ Integer
) ;

CREATE TABLE KDMContainer (
	__IDKDMContainer__ Integer NOT NULL,
	PRIMARY KEY KDMContainer (__IDKDMContainer__)
) ;

CREATE TABLE KDMGroup (
	__IDKDMGroup__ Integer NOT NULL,
	PRIMARY KEY KDMGroup (__IDKDMGroup__)
) ;

CREATE TABLE KDMRelationship (
	__IDKDMRelationship__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES KDMEntity (__IDKDMEntity__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES KDMEntity (__IDKDMEntity__),
	FOREIGN KEY model (__FKmodel__) REFERENCES KDMModel (__IDKDMModel__),
	PRIMARY KEY KDMRelationship (__IDKDMRelationship__),
	__FKto__ Integer,
	__FKfrom__ Integer,
	__FKmodel__ Integer
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	note text,
	PRIMARY KEY Annotation (__IDAnnotation__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	tag text,
	value text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE KDMExtensionFamily (
	__IDKDMExtensionFamily__ Integer NOT NULL,
	name text,
	PRIMARY KEY KDMExtensionFamily (__IDKDMExtensionFamily__)
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	baseClass text,
	name text,
	FOREIGN KEY family (__FKfamily__) REFERENCES KDMExtensionFamily (__IDKDMExtensionFamily__),
	FOREIGN KEY extendedElement (__FKextendedElement__) REFERENCES ModelElement (__IDModelElement__),
	PRIMARY KEY Stereotype (__IDStereotype__),
	__FKfamily__ Integer,
	__FKextendedElement__ Integer
) ;

CREATE TABLE TagDefinition (
	__IDTagDefinition__ Integer NOT NULL,
	tag text,
	type text,
	PRIMARY KEY TagDefinition (__IDTagDefinition__)
) ;

CREATE TABLE TaggedValue (
	__IDTaggedValue__ Integer NOT NULL,
	value text,
	FOREIGN KEY tag (__FKtag__) REFERENCES TagDefinition (__IDTagDefinition__),
	PRIMARY KEY TaggedValue (__IDTaggedValue__),
	__FKtag__ Integer
) ;

CREATE TABLE KDMFramework (
	__IDKDMFramework__ Integer NOT NULL,
	name text,
	PRIMARY KEY KDMFramework (__IDKDMFramework__)
) ;

CREATE TABLE KDMModel (
	__IDKDMModel__ Integer NOT NULL,
	PRIMARY KEY KDMModel (__IDKDMModel__)
) ;

CREATE TABLE Element_annotation_Annotation (
	__IDElement__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Element_attribute_Attribute (
	__IDElement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_taggedValue_TaggedValue (
	__IDModelElement__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE KDMEntity_inbound_KDMRelationship (
	__IDKDMEntity__ Integer NOT NULL,
	__IDKDMRelationship__ Integer NOT NULL
) ;

CREATE TABLE KDMEntity_outbound_KDMRelationship (
	__IDKDMEntity__ Integer NOT NULL,
	__IDKDMRelationship__ Integer NOT NULL
) ;

CREATE TABLE KDMEntity_group_KDMGroup (
	__IDKDMEntity__ Integer NOT NULL,
	__IDKDMGroup__ Integer NOT NULL
) ;

CREATE TABLE KDMContainer_ownedElement_KDMEntity (
	__IDKDMContainer__ Integer NOT NULL,
	__IDKDMEntity__ Integer NOT NULL
) ;

CREATE TABLE KDMGroup_groupedElement_KDMEntity (
	__IDKDMGroup__ Integer NOT NULL,
	__IDKDMEntity__ Integer NOT NULL
) ;

CREATE TABLE KDMExtensionFamily_stereotype_Stereotype (
	__IDKDMExtensionFamily__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_tag_TagDefinition (
	__IDStereotype__ Integer NOT NULL,
	__IDTagDefinition__ Integer NOT NULL
) ;

CREATE TABLE KDMFramework_extension_KDMExtensionFamily (
	__IDKDMFramework__ Integer NOT NULL,
	__IDKDMExtensionFamily__ Integer NOT NULL
) ;

CREATE TABLE KDMModel_ownedElement_KDMEntity (
	__IDKDMModel__ Integer NOT NULL,
	__IDKDMEntity__ Integer NOT NULL
) ;

CREATE TABLE KDMModel_ownedRelation_KDMRelationship (
	__IDKDMModel__ Integer NOT NULL,
	__IDKDMRelationship__ Integer NOT NULL
) ;
