module BIBTEXML {

	type BibtexFile {
		Entries_ContRef : Entry*;
	};

	type Author {
		Name_Att : Text;
	};

	type Entry {
		Id_Att : Text;
		Abstract_Att : Text;
	};

	type AuthoredEntry : Entry {
		Authors_ContRef : Author+;
	};

	type BookTitledEntry : Entry {
		Booktitle_Att : Text;
	};

	type InstitutionEntry : Entry {
		Institution_Att : Text;
	};

	type EditoredEntry : Entry {
		Editor_Att : Text;
	};

	type DatedEntry : Entry {
		Year_Att : Text;
		Month_Att : Text;
	};

	type JournalEntry : Entry {
		Journal_Att : Text;
	};

	type TitledEntry : Entry {
		Title_Att : Text;
	};

	type NotedEntry : Entry {
		Note_Att : Text;
	};

	type PublisheredEntry : Entry {
		Publisher_Att : Text;
	};

	type SchoolEntry : Entry {
		School_Att : Text;
	};

	type Article : AuthoredEntry, DatedEntry, TitledEntry, JournalEntry {
		Volume_Att : Text;
		Number_Att : Text;
		Pages_Att : Text;
		Note_Att : Text;
	};

	type Book : AuthoredEntry, EditoredEntry, PublisheredEntry, DatedEntry, TitledEntry {
		Volume_Att : Text;
		Number_Att : Text;
		Series_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
		Note_Att : Text;
	};

	type Booklet : DatedEntry, TitledEntry {
		Authors_Ref : Author*;
		Howpublished_Att : Text;
		Address_Att : Text;
		Note_Att : Text;
	};

	type InBook : Book {
		Chapter_Att : Text;
		Type_Att : Text;
	};

	type InCollection : Book, BookTitledEntry {
		Chapter_Att : Text;
		Type_Att : Text;
	};

	type Manual : TitledEntry, AuthoredEntry, DatedEntry {
		Organization_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
		Note_Att : Text;
	};

	type TechReport : AuthoredEntry, InstitutionEntry, DatedEntry, TitledEntry {
		Type_Att : Text;
		Number_Att : Text;
		Address_Att : Text;
		Note_Att : Text;
	};

	type ThesisEntry : AuthoredEntry, DatedEntry, TitledEntry, SchoolEntry {
		Type_Att : Text;
		Address_Att : Text;
		Note_Att : Text;
	};

	type PhdThesis : ThesisEntry;

	type MastersThesis : ThesisEntry;

	type Proceedings : DatedEntry, TitledEntry {
		Editor_Att : Text;
		Volume_Att : Text;
		Number_Att : Text;
		Series_Att : Text;
		Address_Att : Text;
		Organization_Att : Text;
		Publisher_Att : Text;
		Note_Att : Text;
	};

	type InProceedings : AuthoredEntry, BookTitledEntry, Proceedings {
		Pages_Att : Text;
	};

	type Conference : InProceedings;

	type Unpublished : AuthoredEntry, TitledEntry, NotedEntry, DatedEntry;

	type Misc : Entry {
		Authors_Ref : Author*;
		Title_Att : Text;
		Howpublished_Att : Text;
		Month_Att : Text;
		Year_Att : Text;
		Note_Att : Text;
	};
}