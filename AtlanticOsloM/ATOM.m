module ATOM {

	type ATOM {
		Title_Att : Text;
		Id_Att : Text;
		Subtitle_Att : Text;
		Rights_Att : Text;
		Icon_Att : Text;
		Logo_Att : Text;
		Links_ContRef : Link+;
		LastUpdate_ContRef : Date;
		Generator_ContRef : Generator?;
		Categories_ContRef : Category*;
		Authors_ContRef : Author+;
		Contibutors_ContRef : Contributor*;
		Entries_ContRef : Entry*;
	};

	type Entry {
		Title_Att : Text;
		Id_Att : Text;
		Rights_Att : Text;
		Summary_Att : Text;
		Links_ContRef : Link+;
		Source_ContRef : Source?;
		Published_ContRef : Date?;
		LastUpdate_ContRef : Date;
		Content_ContRef : Content?;
		Categories_ContRef : Category*;
		Authors_ContRef : Author+;
		Contibutors_ContRef : Contributor*;
		Atom_Ref : ATOM;
	};

	type Source {
		Id_Att : Text;
		Icon_Att : Text;
		Logo_Att : Text;
		Rights_Att : Text;
		Title_Att : Text;
		Subtitle_Att : Text;
		Links_ContRef : Link*;
		LastUpdate_ContRef : Date?;
		Generator_ContRef : Generator?;
		Contributors_ContRef : Contributor*;
		Categories_ContRef : Category*;
		Author_ContRef : Author?;
	};

	type Content {
		Type_Att : Text;
	};

	type InLineXHTMLContent : Content;

	type InLineOtherContent : Content;

	type OutOfLineContent : Content {
		Src_Att : Text;
	};

	type Generator {
		Uri_Att : Text;
		Version_Att : Text;
	};

	type Category {
		Term_Att : Text;
		Scheme_Att : Text;
		Label_Att : Text;
	};

	type Link {
		Href_Att : Text;
		Rel_Att : Text;
		Type_Att : Text;
		Hreflang_Att : Text;
		Title_Att : Text;
		Lenght_Att : Integer32;
	};

	type Person {
		Name_Att : Text;
		Uri_Att : Text;
		Email_Att : Text;
	};

	type Author : Person;

	type Contributor : Person;

	type Date {
		Day_Att : Integer32;
		Month_Att : Integer32;
		Year_Att : Integer32;
		Hours_Att : Integer32;
		Minutes_Att : Integer32;
		Seconds_Att : Integer32;
	};
}