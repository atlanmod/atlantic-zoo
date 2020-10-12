CREATE TABLE DescribedElt (
	__IDDescribedElt__ Integer NOT NULL,
	description text,
	PRIMARY KEY DescribedElt (__IDDescribedElt__)
) ;

CREATE TABLE NamedElt (
	__IDNamedElt__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElt (__IDNamedElt__)
) ;

CREATE TABLE ContainerElt (
	__IDContainerElt__ Integer NOT NULL,
	PRIMARY KEY ContainerElt (__IDContainerElt__)
) ;

CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	PRIMARY KEY Project (__IDProject__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY parentPackage (__FKparentPackage__) REFERENCES ContainerElt (__IDContainerElt__),
	PRIMARY KEY Package (__IDPackage__),
	__FKparentPackage__ Integer
) ;

CREATE TABLE ContainedElt (
	__IDContainedElt__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES ContainerElt (__IDContainerElt__),
	PRIMARY KEY ContainedElt (__IDContainedElt__),
	__FKpackage__ Integer
) ;

CREATE TABLE TypedElt (
	__IDTypedElt__ Integer NOT NULL,
	type text,
	PRIMARY KEY TypedElt (__IDTypedElt__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	PRIMARY KEY Document (__IDDocument__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	value text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Requirement (
	__IDRequirement__ Integer NOT NULL,
	text text,
	FOREIGN KEY location (__FKlocation__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY parent (__FKparent__) REFERENCES Requirement (__IDRequirement__),
	PRIMARY KEY Requirement (__IDRequirement__),
	__FKparent__ Integer,
	__FKlocation__ Integer
) ;

CREATE TABLE ContainerElt_packages_Package (
	__IDContainerElt__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Requirement_children_Requirement (
	__IDRequirement__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE ContainerElt_content_ContainedElt (
	__IDContainerElt__ Integer NOT NULL,
	__IDContainedElt__ Integer NOT NULL
) ;

CREATE TABLE Requirement_coverLink_Requirement (
	__IDRequirement__ Integer NOT NULL,
	__IDRequirement__ Integer NOT NULL
) ;

CREATE TABLE Requirement_attributes_Attribute (
	__IDRequirement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;
