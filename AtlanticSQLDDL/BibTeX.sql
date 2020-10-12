CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Bibtex (
	__IDBibtex__ Integer NOT NULL,
	PRIMARY KEY Bibtex (__IDBibtex__)
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	"key" text,
	PRIMARY KEY Entry (__IDEntry__)
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	PRIMARY KEY Article (__IDArticle__)
) ;

CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	PRIMARY KEY Book (__IDBook__)
) ;

CREATE TABLE Inbook (
	__IDInbook__ Integer NOT NULL,
	PRIMARY KEY Inbook (__IDInbook__)
) ;

CREATE TABLE Booklet (
	__IDBooklet__ Integer NOT NULL,
	PRIMARY KEY Booklet (__IDBooklet__)
) ;

CREATE TABLE Inproceedings (
	__IDInproceedings__ Integer NOT NULL,
	PRIMARY KEY Inproceedings (__IDInproceedings__)
) ;

CREATE TABLE Proceedings (
	__IDProceedings__ Integer NOT NULL,
	PRIMARY KEY Proceedings (__IDProceedings__)
) ;

CREATE TABLE Incollection (
	__IDIncollection__ Integer NOT NULL,
	PRIMARY KEY Incollection (__IDIncollection__)
) ;

CREATE TABLE Techreport (
	__IDTechreport__ Integer NOT NULL,
	PRIMARY KEY Techreport (__IDTechreport__)
) ;

CREATE TABLE PhdThesis (
	__IDPhdThesis__ Integer NOT NULL,
	PRIMARY KEY PhdThesis (__IDPhdThesis__)
) ;

CREATE TABLE MastersThesis (
	__IDMastersThesis__ Integer NOT NULL,
	PRIMARY KEY MastersThesis (__IDMastersThesis__)
) ;

CREATE TABLE Manual (
	__IDManual__ Integer NOT NULL,
	PRIMARY KEY Manual (__IDManual__)
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	value text,
	PRIMARY KEY Field (__IDField__)
) ;

CREATE TABLE Authors (
	__IDAuthors__ Integer NOT NULL,
	PRIMARY KEY Authors (__IDAuthors__)
) ;

CREATE TABLE AuthorUrls (
	__IDAuthorUrls__ Integer NOT NULL,
	PRIMARY KEY AuthorUrls (__IDAuthorUrls__)
) ;

CREATE TABLE Title (
	__IDTitle__ Integer NOT NULL,
	PRIMARY KEY Title (__IDTitle__)
) ;

CREATE TABLE Journal (
	__IDJournal__ Integer NOT NULL,
	PRIMARY KEY Journal (__IDJournal__)
) ;

CREATE TABLE BookTitle (
	__IDBookTitle__ Integer NOT NULL,
	PRIMARY KEY BookTitle (__IDBookTitle__)
) ;

CREATE TABLE Institution (
	__IDInstitution__ Integer NOT NULL,
	PRIMARY KEY Institution (__IDInstitution__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	PRIMARY KEY Organization (__IDOrganization__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Day (
	__IDDay__ Integer NOT NULL,
	PRIMARY KEY Day (__IDDay__)
) ;

CREATE TABLE Number (
	__IDNumber__ Integer NOT NULL,
	PRIMARY KEY Number (__IDNumber__)
) ;

CREATE TABLE Chapter (
	__IDChapter__ Integer NOT NULL,
	PRIMARY KEY Chapter (__IDChapter__)
) ;

CREATE TABLE Volume (
	__IDVolume__ Integer NOT NULL,
	PRIMARY KEY Volume (__IDVolume__)
) ;

CREATE TABLE Series (
	__IDSeries__ Integer NOT NULL,
	PRIMARY KEY Series (__IDSeries__)
) ;

CREATE TABLE Pages (
	__IDPages__ Integer NOT NULL,
	PRIMARY KEY Pages (__IDPages__)
) ;

CREATE TABLE Publisher (
	__IDPublisher__ Integer NOT NULL,
	PRIMARY KEY Publisher (__IDPublisher__)
) ;

CREATE TABLE Howpublished (
	__IDHowpublished__ Integer NOT NULL,
	PRIMARY KEY Howpublished (__IDHowpublished__)
) ;

CREATE TABLE School (
	__IDSchool__ Integer NOT NULL,
	PRIMARY KEY School (__IDSchool__)
) ;

CREATE TABLE Editor (
	__IDEditor__ Integer NOT NULL,
	PRIMARY KEY Editor (__IDEditor__)
) ;

CREATE TABLE Edition (
	__IDEdition__ Integer NOT NULL,
	PRIMARY KEY Edition (__IDEdition__)
) ;

CREATE TABLE Address (
	__IDAddress__ Integer NOT NULL,
	PRIMARY KEY Address (__IDAddress__)
) ;

CREATE TABLE Year (
	__IDYear__ Integer NOT NULL,
	PRIMARY KEY Year (__IDYear__)
) ;

CREATE TABLE Month (
	__IDMonth__ Integer NOT NULL,
	PRIMARY KEY Month (__IDMonth__)
) ;

CREATE TABLE Note (
	__IDNote__ Integer NOT NULL,
	PRIMARY KEY Note (__IDNote__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE AbstractField (
	__IDAbstractField__ Integer NOT NULL,
	PRIMARY KEY AbstractField (__IDAbstractField__)
) ;

CREATE TABLE Isbn (
	__IDIsbn__ Integer NOT NULL,
	PRIMARY KEY Isbn (__IDIsbn__)
) ;

CREATE TABLE Issn (
	__IDIssn__ Integer NOT NULL,
	PRIMARY KEY Issn (__IDIssn__)
) ;

CREATE TABLE Url (
	__IDUrl__ Integer NOT NULL,
	PRIMARY KEY Url (__IDUrl__)
) ;

CREATE TABLE Doi (
	__IDDoi__ Integer NOT NULL,
	PRIMARY KEY Doi (__IDDoi__)
) ;

CREATE TABLE Bibtex_entries_Entry (
	__IDBibtex__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE Entry_fields_Field (
	__IDEntry__ Integer NOT NULL,
	__IDField__ Integer NOT NULL
) ;
