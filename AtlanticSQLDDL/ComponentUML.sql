CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Entity (__IDEntity__),
	FOREIGN KEY association (__FKassociation__) REFERENCES Association (__IDAssociation__),
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__),
	__FKassociation__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Method (
	__IDMethod__ Integer NOT NULL,
	FOREIGN KEY entity (__FKentity__) REFERENCES Entity (__IDEntity__),
	PRIMARY KEY Method (__IDMethod__),
	__FKentity__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY entity (__FKentity__) REFERENCES Entity (__IDEntity__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKentity__ Integer
) ;

CREATE TABLE Entity_attributes_Attribute (
	__IDEntity__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Association_associationEnds_AssociationEnd (
	__IDAssociation__ Integer NOT NULL,
	__IDAssociationEnd__ Integer NOT NULL
) ;

CREATE TABLE Entity_associationEnds_AssociationEnd (
	__IDEntity__ Integer NOT NULL,
	__IDAssociationEnd__ Integer NOT NULL
) ;

CREATE TABLE Entity_methods_Method (
	__IDEntity__ Integer NOT NULL,
	__IDMethod__ Integer NOT NULL
) ;
