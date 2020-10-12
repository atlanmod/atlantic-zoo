CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	PRIMARY KEY Project (__IDProject__)
) ;

CREATE TABLE TypedElement (
	__IDTypedElement__ Integer NOT NULL,
	type text,
	PRIMARY KEY TypedElement (__IDTypedElement__)
) ;

CREATE TABLE ElementWithIL (
	__IDElementWithIL__ Integer NOT NULL,
	name text,
	"label" text,
	PRIMARY KEY ElementWithIL (__IDElementWithIL__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	FOREIGN KEY project (__FKproject__) REFERENCES Project (__IDProject__),
	PRIMARY KEY Document (__IDDocument__),
	__FKproject__ Integer
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	description text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE Section (
	__IDSection__ Integer NOT NULL,
	FOREIGN KEY document (__FKdocument__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY sectionParent (__FKsectionParent__) REFERENCES Section (__IDSection__),
	PRIMARY KEY Section (__IDSection__),
	__FKdocument__ Integer,
	__FKsectionParent__ Integer
) ;

CREATE TABLE AbstractRequirement (
	__IDAbstractRequirement__ Integer NOT NULL,
	FOREIGN KEY section (__FKsection__) REFERENCES Section (__IDSection__),
	FOREIGN KEY isContained (__FKisContained__) REFERENCES MacroRequirement (__IDMacroRequirement__),
	PRIMARY KEY AbstractRequirement (__IDAbstractRequirement__),
	__FKsection__ Integer,
	__FKisContained__ Integer
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	PRIMARY KEY Requirement (__IDRequirement__)
) ;

CREATE TABLE MacroRequirement (
	__IDMacroRequirement__ Integer NOT NULL,
	PRIMARY KEY MacroRequirement (__IDMacroRequirement__)
) ;

CREATE TABLE CoverLink (
	__IDCoverLink__ Integer NOT NULL,
	FOREIGN KEY linkWith (__FKlinkWith__) REFERENCES AbstractRequirement (__IDAbstractRequirement__),
	PRIMARY KEY CoverLink (__IDCoverLink__),
	__FKlinkWith__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	value text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE AbstractRequirement_coverLinks_CoverLink (
	__IDAbstractRequirement__ Integer NOT NULL,
	__IDCoverLink__ Integer NOT NULL
) ;

CREATE TABLE Project_documents_Document (
	__IDProject__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Section_sectionChildren_Section (
	__IDSection__ Integer NOT NULL,
	__IDSection__ Integer NOT NULL
) ;

CREATE TABLE AbstractRequirement_attribute_Attribute (
	__IDAbstractRequirement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE MacroRequirement_contains_AbstractRequirement (
	__IDMacroRequirement__ Integer NOT NULL,
	__IDAbstractRequirement__ Integer NOT NULL
) ;

CREATE TABLE Section_requirements_AbstractRequirement (
	__IDSection__ Integer NOT NULL,
	__IDAbstractRequirement__ Integer NOT NULL
) ;

CREATE TABLE Document_sections_Section (
	__IDDocument__ Integer NOT NULL,
	__IDSection__ Integer NOT NULL
) ;
