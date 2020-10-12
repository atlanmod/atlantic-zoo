CREATE TABLE Architecture (
	__IDArchitecture__ Integer NOT NULL,
	FOREIGN KEY describedBy (__FKdescribedBy__) REFERENCES ArchitectureDescription (__IDArchitectureDescription__),
	PRIMARY KEY Architecture (__IDArchitecture__),
	__FKdescribedBy__ Integer
) ;

CREATE TABLE ArchitectureDescription (
	__IDArchitectureDescription__ Integer NOT NULL,
	PRIMARY KEY ArchitectureDescription (__IDArchitectureDescription__)
) ;

CREATE TABLE ArchitectureView (
	__IDArchitectureView__ Integer NOT NULL,
	PRIMARY KEY ArchitectureView (__IDArchitectureView__)
) ;

CREATE TABLE ArchitectureViewPoint (
	__IDArchitectureViewPoint__ Integer NOT NULL,
	FOREIGN KEY defines (__FKdefines__) REFERENCES MainView (__IDMainView__),
	PRIMARY KEY ArchitectureViewPoint (__IDArchitectureViewPoint__),
	__FKdefines__ Integer
) ;

CREATE TABLE MainView (
	__IDMainView__ Integer NOT NULL,
	PRIMARY KEY MainView (__IDMainView__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE ArchitectureView_selectedBy_ArchitectureDescription (
	__IDArchitectureView__ Integer NOT NULL,
	__IDArchitectureDescription__ Integer NOT NULL
) ;

CREATE TABLE ArchitectureView_constituents_ModelElement (
	__IDArchitectureView__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE MainView_consistsOf_ModelElement (
	__IDMainView__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE ArchitectureView_conformsTo_ArchitectureViewPoint (
	__IDArchitectureView__ Integer NOT NULL,
	__IDArchitectureViewPoint__ Integer NOT NULL
) ;

CREATE TABLE MainView_isProjectedOnto_ArchitectureView (
	__IDMainView__ Integer NOT NULL,
	__IDArchitectureView__ Integer NOT NULL
) ;

CREATE TABLE ArchitectureDescription_organizedBy_ArchitectureView (
	__IDArchitectureDescription__ Integer NOT NULL,
	__IDArchitectureView__ Integer NOT NULL
) ;

CREATE TABLE ArchitectureDescription_selects_ArchitectureView (
	__IDArchitectureDescription__ Integer NOT NULL,
	__IDArchitectureView__ Integer NOT NULL
) ;

CREATE TABLE ArchitectureViewPoint_views_ArchitectureView (
	__IDArchitectureViewPoint__ Integer NOT NULL,
	__IDArchitectureView__ Integer NOT NULL
) ;
