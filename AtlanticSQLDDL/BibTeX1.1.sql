CREATE TABLE BibTeXFile (
	__IDBibTeXFile__ Integer NOT NULL,
	PRIMARY KEY BibTeXFile (__IDBibTeXFile__)
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	author text,
	PRIMARY KEY Author (__IDAuthor__)
) ;

CREATE TABLE BibTeXEntry (
	__IDBibTeXEntry__ Integer NOT NULL,
	id text,
	PRIMARY KEY BibTeXEntry (__IDBibTeXEntry__)
) ;

CREATE TABLE AuthoredEntry (
	__IDAuthoredEntry__ Integer NOT NULL,
	PRIMARY KEY AuthoredEntry (__IDAuthoredEntry__)
) ;

CREATE TABLE DatedEntry (
	__IDDatedEntry__ Integer NOT NULL,
	year text,
	PRIMARY KEY DatedEntry (__IDDatedEntry__)
) ;

CREATE TABLE TitledEntry (
	__IDTitledEntry__ Integer NOT NULL,
	title text,
	PRIMARY KEY TitledEntry (__IDTitledEntry__)
) ;

CREATE TABLE BookTitledEntry (
	__IDBookTitledEntry__ Integer NOT NULL,
	booktitle text,
	PRIMARY KEY BookTitledEntry (__IDBookTitledEntry__)
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	journal text,
	PRIMARY KEY Article (__IDArticle__)
) ;

CREATE TABLE TechReport (
	__IDTechReport__ Integer NOT NULL,
	PRIMARY KEY TechReport (__IDTechReport__)
) ;

CREATE TABLE Unpublished (
	__IDUnpublished__ Integer NOT NULL,
	note text,
	PRIMARY KEY Unpublished (__IDUnpublished__)
) ;

CREATE TABLE Manual (
	__IDManual__ Integer NOT NULL,
	PRIMARY KEY Manual (__IDManual__)
) ;

CREATE TABLE Proceedings (
	__IDProceedings__ Integer NOT NULL,
	PRIMARY KEY Proceedings (__IDProceedings__)
) ;

CREATE TABLE InProceedings (
	__IDInProceedings__ Integer NOT NULL,
	PRIMARY KEY InProceedings (__IDInProceedings__)
) ;

CREATE TABLE Booklet (
	__IDBooklet__ Integer NOT NULL,
	PRIMARY KEY Booklet (__IDBooklet__)
) ;

CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	publisher text,
	PRIMARY KEY Book (__IDBook__)
) ;

CREATE TABLE InCollection (
	__IDInCollection__ Integer NOT NULL,
	PRIMARY KEY InCollection (__IDInCollection__)
) ;

CREATE TABLE InBook (
	__IDInBook__ Integer NOT NULL,
	chapter Integer,
	PRIMARY KEY InBook (__IDInBook__)
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE ThesisEntry (
	__IDThesisEntry__ Integer NOT NULL,
	school text,
	PRIMARY KEY ThesisEntry (__IDThesisEntry__)
) ;

CREATE TABLE PhDThesis (
	__IDPhDThesis__ Integer NOT NULL,
	PRIMARY KEY PhDThesis (__IDPhDThesis__)
) ;

CREATE TABLE MasterThesis (
	__IDMasterThesis__ Integer NOT NULL,
	PRIMARY KEY MasterThesis (__IDMasterThesis__)
) ;

CREATE TABLE AuthoredEntry_authors_Author (
	__IDAuthoredEntry__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE BibTeXFile_entries_BibTeXEntry (
	__IDBibTeXFile__ Integer NOT NULL,
	__IDBibTeXEntry__ Integer NOT NULL
) ;
