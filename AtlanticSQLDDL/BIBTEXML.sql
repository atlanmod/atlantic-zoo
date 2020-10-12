CREATE TABLE BibtexFile (
	__IDBibtexFile__ Integer NOT NULL,
	PRIMARY KEY BibtexFile (__IDBibtexFile__)
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	name text,
	PRIMARY KEY Author (__IDAuthor__)
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	id text,
	abstract text,
	PRIMARY KEY Entry (__IDEntry__)
) ;

CREATE TABLE AuthoredEntry (
	__IDAuthoredEntry__ Integer NOT NULL,
	PRIMARY KEY AuthoredEntry (__IDAuthoredEntry__)
) ;

CREATE TABLE BookTitledEntry (
	__IDBookTitledEntry__ Integer NOT NULL,
	booktitle text,
	PRIMARY KEY BookTitledEntry (__IDBookTitledEntry__)
) ;

CREATE TABLE InstitutionEntry (
	__IDInstitutionEntry__ Integer NOT NULL,
	institution text,
	PRIMARY KEY InstitutionEntry (__IDInstitutionEntry__)
) ;

CREATE TABLE EditoredEntry (
	__IDEditoredEntry__ Integer NOT NULL,
	editor text,
	PRIMARY KEY EditoredEntry (__IDEditoredEntry__)
) ;

CREATE TABLE DatedEntry (
	__IDDatedEntry__ Integer NOT NULL,
	year text,
	month text,
	PRIMARY KEY DatedEntry (__IDDatedEntry__)
) ;

CREATE TABLE JournalEntry (
	__IDJournalEntry__ Integer NOT NULL,
	journal text,
	PRIMARY KEY JournalEntry (__IDJournalEntry__)
) ;

CREATE TABLE TitledEntry (
	__IDTitledEntry__ Integer NOT NULL,
	title text,
	PRIMARY KEY TitledEntry (__IDTitledEntry__)
) ;

CREATE TABLE NotedEntry (
	__IDNotedEntry__ Integer NOT NULL,
	note text,
	PRIMARY KEY NotedEntry (__IDNotedEntry__)
) ;

CREATE TABLE PublisheredEntry (
	__IDPublisheredEntry__ Integer NOT NULL,
	publisher text,
	PRIMARY KEY PublisheredEntry (__IDPublisheredEntry__)
) ;

CREATE TABLE SchoolEntry (
	__IDSchoolEntry__ Integer NOT NULL,
	school text,
	PRIMARY KEY SchoolEntry (__IDSchoolEntry__)
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	volume text,
	number text,
	pages text,
	note text,
	PRIMARY KEY Article (__IDArticle__)
) ;

CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	volume text,
	number text,
	series text,
	address text,
	edition text,
	note text,
	PRIMARY KEY Book (__IDBook__)
) ;

CREATE TABLE Booklet (
	__IDBooklet__ Integer NOT NULL,
	howpublished text,
	address text,
	note text,
	PRIMARY KEY Booklet (__IDBooklet__)
) ;

CREATE TABLE InBook (
	__IDInBook__ Integer NOT NULL,
	chapter text,
	type text,
	PRIMARY KEY InBook (__IDInBook__)
) ;

CREATE TABLE InCollection (
	__IDInCollection__ Integer NOT NULL,
	chapter text,
	type text,
	PRIMARY KEY InCollection (__IDInCollection__)
) ;

CREATE TABLE Manual (
	__IDManual__ Integer NOT NULL,
	organization text,
	address text,
	edition text,
	note text,
	PRIMARY KEY Manual (__IDManual__)
) ;

CREATE TABLE TechReport (
	__IDTechReport__ Integer NOT NULL,
	type text,
	number text,
	address text,
	note text,
	PRIMARY KEY TechReport (__IDTechReport__)
) ;

CREATE TABLE ThesisEntry (
	__IDThesisEntry__ Integer NOT NULL,
	type text,
	address text,
	note text,
	PRIMARY KEY ThesisEntry (__IDThesisEntry__)
) ;

CREATE TABLE PhdThesis (
	__IDPhdThesis__ Integer NOT NULL,
	PRIMARY KEY PhdThesis (__IDPhdThesis__)
) ;

CREATE TABLE MastersThesis (
	__IDMastersThesis__ Integer NOT NULL,
	PRIMARY KEY MastersThesis (__IDMastersThesis__)
) ;

CREATE TABLE Proceedings (
	__IDProceedings__ Integer NOT NULL,
	editor text,
	volume text,
	number text,
	series text,
	address text,
	organization text,
	publisher text,
	note text,
	PRIMARY KEY Proceedings (__IDProceedings__)
) ;

CREATE TABLE InProceedings (
	__IDInProceedings__ Integer NOT NULL,
	pages text,
	PRIMARY KEY InProceedings (__IDInProceedings__)
) ;

CREATE TABLE Conference (
	__IDConference__ Integer NOT NULL,
	PRIMARY KEY Conference (__IDConference__)
) ;

CREATE TABLE Unpublished (
	__IDUnpublished__ Integer NOT NULL,
	PRIMARY KEY Unpublished (__IDUnpublished__)
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	title text,
	howpublished text,
	month text,
	year text,
	note text,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE AuthoredEntry_authors_Author (
	__IDAuthoredEntry__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE Booklet_authors_Author (
	__IDBooklet__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE Misc_authors_Author (
	__IDMisc__ Integer NOT NULL,
	__IDAuthor__ Integer NOT NULL
) ;

CREATE TABLE BibtexFile_entries_Entry (
	__IDBibtexFile__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;
