module WSLink {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Network : LocatedElement {
		Services_ContRef : Services*;
		Name_Att : Text;
	};

	type Services : LocatedElement {
		Name_Att : Text;
		URL_Att : Text;
		Descriptions_Att : Text;
	};

	type WebService : Services {
		LinkedServices_Ref : Services*;
	};

	type RSS : Services;
}