module BibTeX {

	type BibTeXFile {
		Entries_ContRef : BibTeXEntry*;
	};

	type Author {
		Author_Att : Text;
	};

	type BibTeXEntry {
		Id_Att : Text;
	};

	type AuthoredEntry : BibTeXEntry {
		Authors_ContRef : Author+;
	};

	type DatedEntry : BibTeXEntry {
		Year_Att : Text;
	};

	type TitledEntry : BibTeXEntry {
		Title_Att : Text;
	};

	type BookTitledEntry : BibTeXEntry {
		Booktitle_Att : Text;
	};

	type Article : AuthoredEntry, DatedEntry, TitledEntry {
		Journal_Att : Text;
	};

	type TechReport : AuthoredEntry, DatedEntry, TitledEntry;

	type Unpublished : AuthoredEntry, TitledEntry {
		Note_Att : Text;
	};

	type Manual : TitledEntry;

	type Proceedings : DatedEntry, TitledEntry;

	type InProceedings : Proceedings, AuthoredEntry, BookTitledEntry;

	type Booklet : DatedEntry;

	type Book : AuthoredEntry, DatedEntry, TitledEntry {
		Publisher_Att : Text;
	};

	type InCollection : Book, BookTitledEntry;

	type InBook : Book {
		Chapter_Att : Integer32;
	};

	type Misc : BibTeXEntry;

	type ThesisEntry : AuthoredEntry, DatedEntry, TitledEntry {
		School_Att : Text;
	};

	type PhDThesis : ThesisEntry;

	type MasterThesis : ThesisEntry;
}