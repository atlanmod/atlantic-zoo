module BIBTEX {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Bibtex {
		Entries_ContRef : Entry*;
	};

	type Entry : LocatedElement {
		Key_Att : Text;
		Fields_ContRef : Field*;
	};

	type Article : Entry;

	type Book : Entry;

	type Inbook : Entry;

	type Booklet : Entry;

	type Inproceedings : Entry;

	type Proceedings : Entry;

	type Incollection : Entry;

	type Techreport : Entry;

	type PhdThesis : Entry;

	type MastersThesis : Entry;

	type Manual : Entry;

	type Misc : Entry;

	type Field {
		Value_Att : Text;
	};

	type Authors : Field;

	type AuthorUrls : Field;

	type Title : Field;

	type Journal : Field;

	type BookTitle : Field;

	type Institution : Field;

	type Organization : Field;

	type Type : Field;

	type Day : Field;

	type Number : Field;

	type Chapter : Field;

	type Volume : Field;

	type Series : Field;

	type Pages : Field;

	type Publisher : Field;

	type Howpublished : Field;

	type School : Field;

	type Editor : Field;

	type Edition : Field;

	type Address : Field;

	type Year : Field;

	type Month : Field;

	type Note : Field;

	type Text : Field;

	type AbstractField : Field;

	type Isbn : Field;

	type Issn : Field;

	type Url : Field;

	type Doi : Field;
}