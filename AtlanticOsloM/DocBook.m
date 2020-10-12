module DocBook {

	type DocBook {
		Books_ContRef : Book+;
	};

	type Book {
		Articles_ContRef : Article+;
	};

	type TitledElement {
		Title_Att : Text;
	};

	type Article : TitledElement {
		Sections_1_ContRef : Sect1+;
	};

	type Sect1 : TitledElement {
		Paras_ContRef : Para+;
	};

	type Para {
		Content_Att : Text;
	};
}