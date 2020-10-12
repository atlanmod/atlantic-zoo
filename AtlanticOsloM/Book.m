module Book {

	type Book {
		Title_Att : Text;
		Chapters_ContRef : Chapter*;
	};

	type Chapter {
		Title_Att : Text;
		NbPages_Att : Integer32;
		Author_Att : Text;
		Book_Ref : Book;
	};
}