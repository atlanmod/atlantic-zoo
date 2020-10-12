CREATE TABLE ATOM (
	__IDATOM__ Integer NOT NULL,
	title text,
	id text,
	subtitle text,
	rights text,
	icon text,
	logo text,
	FOREIGN KEY lastUpdate (__FKlastUpdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY generator (__FKgenerator__) REFERENCES Generator (__IDGenerator__),
	PRIMARY KEY ATOM (__IDATOM__),
	__FKlastUpdate__ Integer,
	__FKgenerator__ Integer
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	title text,
	id text,
	rights text,
	summary text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY published (__FKpublished__) REFERENCES Date (__IDDate__),
	FOREIGN KEY lastUpdate (__FKlastUpdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY content (__FKcontent__) REFERENCES Content (__IDContent__),
	FOREIGN KEY atom (__FKatom__) REFERENCES ATOM (__IDATOM__),
	PRIMARY KEY Entry (__IDEntry__),
	__FKsource__ Integer,
	__FKcontent__ Integer,
	__FKpublished__ Integer,
	__FKatom__ Integer,
	__FKlastUpdate__ Integer
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	id text,
	icon text,
	logo text,
	rights text,
	title text,
	subtitle text,
	FOREIGN KEY lastUpdate (__FKlastUpdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY generator (__FKgenerator__) REFERENCES Generator (__IDGenerator__),
	FOREIGN KEY author (__FKauthor__) REFERENCES Author (__IDAuthor__),
	PRIMARY KEY Source (__IDSource__),
	__FKauthor__ Integer,
	__FKgenerator__ Integer,
	__FKlastUpdate__ Integer
) ;

CREATE TABLE Content (
	__IDContent__ Integer NOT NULL,
	type text,
	PRIMARY KEY Content (__IDContent__)
) ;

CREATE TABLE InLineXHTMLContent (
	__IDInLineXHTMLContent__ Integer NOT NULL,
	PRIMARY KEY InLineXHTMLContent (__IDInLineXHTMLContent__)
) ;

CREATE TABLE InLineOtherContent (
	__IDInLineOtherContent__ Integer NOT NULL,
	PRIMARY KEY InLineOtherContent (__IDInLineOtherContent__)
) ;

CREATE TABLE OutOfLineContent (
	__IDOutOfLineContent__ Integer NOT NULL,
	src text,
	PRIMARY KEY OutOfLineContent (__IDOutOfLineContent__)
) ;

CREATE TABLE Generator (
	__IDGenerator__ Integer NOT NULL,
	uri text,
	version text,
	PRIMARY KEY Generator (__IDGenerator__)
) ;

CREATE TABLE Category (
	__IDCategory__ Integer NOT NULL,
	term text,
	scheme text,
	"label" text,
	PRIMARY KEY Category (__IDCategory__)
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	href text,
	rel text,
	type text,
	hreflang text,
	title text,
	lenght Integer,
	PRIMARY KEY Link (__IDLink__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	name text,
	uri text,
	email text,
	PRIMARY KEY Person (__IDPerson__)
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	PRIMARY KEY Author (__IDAuthor__)
) ;

CREATE TABLE Contributor (
	__IDContributor__ Integer NOT NULL,
	PRIMARY KEY Contributor (__IDContributor__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	day Integer,
	month Integer,
	year Integer,
	hours Integer,
	minutes Integer,
	seconds Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE ATOM_entries_Entry (
	__IDATOM__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE Entry_contibutors_Contributor (
	__IDEntry__ Integer NOT NULL,
	__IDContributor__ Integer NOT NULL
) ;

CREATE TABLE ATOM_authors_Author (
	__IDATOM__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE Entry_authors_Author (
	__IDEntry__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE Source_categories_Category (
	__IDSource__ Integer NOT NULL,
	__IDCategory__ Integer NOT NULL
) ;

CREATE TABLE ATOM_categories_Category (
	__IDATOM__ Integer NOT NULL,
	__IDCategory__ Integer NOT NULL
) ;

CREATE TABLE ATOM_links_Link (
	__IDATOM__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Source_contributors_Contributor (
	__IDSource__ Integer NOT NULL,
	__IDContributor__ Integer NOT NULL
) ;

CREATE TABLE Entry_categories_Category (
	__IDEntry__ Integer NOT NULL,
	__IDCategory__ Integer NOT NULL
) ;

CREATE TABLE ATOM_contibutors_Contributor (
	__IDATOM__ Integer NOT NULL,
	__IDContributor__ Integer NOT NULL
) ;

CREATE TABLE Source_links_Link (
	__IDSource__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Entry_links_Link (
	__IDEntry__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;
