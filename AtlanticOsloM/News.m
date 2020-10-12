module News {

	type Element {
		Title_Att : Text;
		Description_Att : Text;
		Link_Att : Text;
	};

	type Newspaper : Element {
		Language_Att : Text;
		Copyright_Att : Text;
		PubDate_ContRef : Date?;
		Category_ContRef : Category?;
		News_ContRef : News*;
	};

	type News : Element {
		Author_Att : Text;
		Comments_Att : Text;
		PubDate_ContRef : Date?;
		Category_ContRef : Category?;
		Newspaper_Ref : Newspaper;
	};

	type Category {
		Value_Att : Text;
	};

	type Date {
		EDay_Att : DayKind;
		Day_Att : Integer32;
		Month_Att : Integer32;
		Year_Att : Integer32;
		Hours_Att : Integer32;
		Minutes_Att : Integer32;
		Seconds_Att : Integer32;
	};

	type DayKind {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
}