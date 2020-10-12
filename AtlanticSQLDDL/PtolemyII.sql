CREATE TABLE EDataType (
	__IDEDataType__ Integer NOT NULL,
	value text,
	PRIMARY KEY EDataType (__IDEDataType__)
) ;

CREATE TABLE NamedObject (
	__IDNamedObject__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedObject (__IDNamedObject__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY att_container (__FKatt_container__) REFERENCES Entity (__IDEntity__),
	value text,
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKatt_container__ Integer
) ;

CREATE TABLE Entity (
	__IDEntity__ Integer NOT NULL,
	PRIMARY KEY Entity (__IDEntity__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	FOREIGN KEY po_container (__FKpo_container__) REFERENCES Entity (__IDEntity__),
	PRIMARY KEY Port (__IDPort__),
	__FKpo_container__ Integer
) ;

CREATE TABLE Relation (
	__IDRelation__ Integer NOT NULL,
	PRIMARY KEY Relation (__IDRelation__)
) ;

CREATE TABLE Director (
	__IDDirector__ Integer NOT NULL,
	FOREIGN KEY ca_container (__FKca_container__) REFERENCES CompositeActor (__IDCompositeActor__),
	PRIMARY KEY Director (__IDDirector__),
	__FKca_container__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY pa_container (__FKpa_container__) REFERENCES Entity (__IDEntity__),
	FOREIGN KEY dataType (__FKdataType__) REFERENCES EDataType (__IDEDataType__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKpa_container__ Integer,
	__FKdataType__ Integer
) ;

CREATE TABLE ComponentPort (
	__IDComponentPort__ Integer NOT NULL,
	PRIMARY KEY ComponentPort (__IDComponentPort__)
) ;

CREATE TABLE ComponentRelation (
	__IDComponentRelation__ Integer NOT NULL,
	FOREIGN KEY re_container (__FKre_container__) REFERENCES CompositeEntity (__IDCompositeEntity__),
	PRIMARY KEY ComponentRelation (__IDComponentRelation__),
	__FKre_container__ Integer
) ;

CREATE TABLE ComponentEntity (
	__IDComponentEntity__ Integer NOT NULL,
	FOREIGN KEY ce_container (__FKce_container__) REFERENCES CompositeEntity (__IDCompositeEntity__),
	PRIMARY KEY ComponentEntity (__IDComponentEntity__),
	__FKce_container__ Integer
) ;

CREATE TABLE AtomicActor (
	__IDAtomicActor__ Integer NOT NULL,
	PRIMARY KEY AtomicActor (__IDAtomicActor__)
) ;

CREATE TABLE CompositeEntity (
	__IDCompositeEntity__ Integer NOT NULL,
	PRIMARY KEY CompositeEntity (__IDCompositeEntity__)
) ;

CREATE TABLE WorkSpace (
	__IDWorkSpace__ Integer NOT NULL,
	PRIMARY KEY WorkSpace (__IDWorkSpace__)
) ;

CREATE TABLE CompositeActor (
	__IDCompositeActor__ Integer NOT NULL,
	PRIMARY KEY CompositeActor (__IDCompositeActor__)
) ;

CREATE TABLE Entity_parameters_Parameter (
	__IDEntity__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Port_links_Relation (
	__IDPort__ Integer NOT NULL,
	__IDRelation__ Integer NOT NULL
) ;

CREATE TABLE Entity_ports_Port (
	__IDEntity__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE CompositeEntity_containees_ComponentEntity (
	__IDCompositeEntity__ Integer NOT NULL,
	__IDComponentEntity__ Integer NOT NULL
) ;

CREATE TABLE Relation_ports_Port (
	__IDRelation__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE CompositeEntity_relations_ComponentRelation (
	__IDCompositeEntity__ Integer NOT NULL,
	__IDComponentRelation__ Integer NOT NULL
) ;

CREATE TABLE Entity_attributes_Attribute (
	__IDEntity__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE CompositeActor_directors_Director (
	__IDCompositeActor__ Integer NOT NULL,
	__IDDirector__ Integer NOT NULL
) ;
