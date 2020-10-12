CREATE TABLE Page (
	__IDPage__ Integer NOT NULL,
	title text,
	FOREIGN KEY graphContainer (__FKgraphContainer__) REFERENCES GraphicalContainer (__IDGraphicalContainer__),
	FOREIGN KEY pageResources (__FKpageResources__) REFERENCES PageResource (__IDPageResource__),
	PRIMARY KEY Page (__IDPage__),
	__FKgraphContainer__ Integer,
	__FKpageResources__ Integer
) ;

CREATE TABLE NameSpace (
	__IDNameSpace__ Integer NOT NULL,
	namespace text,
	identifier text,
	PRIMARY KEY NameSpace (__IDNameSpace__)
) ;

CREATE TABLE PageResource (
	__IDPageResource__ Integer NOT NULL,
	PRIMARY KEY PageResource (__IDPageResource__)
) ;

CREATE TABLE GraphicalContainer (
	__IDGraphicalContainer__ Integer NOT NULL,
	PRIMARY KEY GraphicalContainer (__IDGraphicalContainer__)
) ;

CREATE TABLE WinFXElement (
	__IDWinFXElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES NameSpace (__IDNameSpace__),
	PRIMARY KEY WinFXElement (__IDWinFXElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE PerspectiveElement (
	__IDPerspectiveElement__ Integer NOT NULL,
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES NameSpace (__IDNameSpace__),
	PRIMARY KEY PerspectiveElement (__IDPerspectiveElement__),
	__FKnamespace__ Integer
) ;

CREATE TABLE ResourceDictionary (
	__IDResourceDictionary__ Integer NOT NULL,
	source text,
	PRIMARY KEY ResourceDictionary (__IDResourceDictionary__)
) ;

CREATE TABLE Grid (
	__IDGrid__ Integer NOT NULL,
	PRIMARY KEY Grid (__IDGrid__)
) ;

CREATE TABLE Object3D (
	__IDObject3D__ Integer NOT NULL,
	PRIMARY KEY Object3D (__IDObject3D__)
) ;

CREATE TABLE Workshop3D (
	__IDWorkshop3D__ Integer NOT NULL,
	PRIMARY KEY Workshop3D (__IDWorkshop3D__)
) ;

CREATE TABLE Element3D (
	__IDElement3D__ Integer NOT NULL,
	PRIMARY KEY Element3D (__IDElement3D__)
) ;

CREATE TABLE UI3Delement (
	__IDUI3Delement__ Integer NOT NULL,
	transform text,
	material text,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY UI3Delement (__IDUI3Delement__),
	__FKname__ Integer
) ;

CREATE TABLE XyzAxis3D (
	__IDXyzAxis3D__ Integer NOT NULL,
	length "Double",
	PRIMARY KEY XyzAxis3D (__IDXyzAxis3D__)
) ;

CREATE TABLE Box3D (
	__IDBox3D__ Integer NOT NULL,
	PRIMARY KEY Box3D (__IDBox3D__)
) ;

CREATE TABLE Square3D (
	__IDSquare3D__ Integer NOT NULL,
	PRIMARY KEY Square3D (__IDSquare3D__)
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	name text,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE Page_xmlns_NameSpace (
	__IDPage__ Integer NOT NULL,
	__IDNameSpace__ Integer NOT NULL
) ;

CREATE TABLE PageResource_dictionaries_ResourceDictionary (
	__IDPageResource__ Integer NOT NULL,
	__IDResourceDictionary__ Integer NOT NULL
) ;

CREATE TABLE Grid_object3D_Object3D (
	__IDGrid__ Integer NOT NULL,
	__IDObject3D__ Integer NOT NULL
) ;

CREATE TABLE Workshop3D_elements3D_Element3D (
	__IDWorkshop3D__ Integer NOT NULL,
	__IDElement3D__ Integer NOT NULL
) ;
