module RSS {

	type RSS {
		Version_Att : Text;
		Channel_ContRef : Channel;
	};

	type Channel {
		Title_Att : Text;
		Link_Att : Text;
		Description_Att : Text;
		Language_Att : Text;
		Copyright_Att : Text;
		ManagingEditor_Att : Text;
		Webmaster_Att : Text;
		Generator_Att : Text;
		Docs_Att : Text;
		Ttl_Att : Integer32;
		Rating_Att : Text;
		SkipHours_Att : Integer32;
		SkipDays_Att : DayKind*;
		Rss_Ref : RSS;
		PubDate_ContRef : Date?;
		LastBuildDate_ContRef : Date?;
		Image_ContRef : Image?;
		TextInput_ContRef : TextInput?;
		Cloud_ContRef : Cloud?;
		Category_ContRef : Category?;
		Items_ContRef : Item*;
	};

	type Item {
		Title_Att : Text;
		Link_Att : Text;
		Description_Att : Text;
		Author_Att : Text;
		Comments_Att : Text;
		Guid_Att : Text;
		Source_ContRef : Source?;
		PubDate_ContRef : Date?;
		Enclosure_ContRef : Enclosure?;
		Category_ContRef : Category?;
		Channel_Ref : Channel;
	};

	type Image {
		Url_Att : Text;
		Title_Att : Text;
		Link_Att : Text;
		Description_Att : Text;
		Width_Att : Integer32;
		Height_Att : Integer32;
		Channel_Ref : Channel;
	};

	type TextInput {
		Title_Att : Text;
		Description_Att : Text;
		Name_Att : Text;
		Link_Att : Text;
		Channel_Ref : Channel;
	};

	type Cloud {
		Domain_Att : Text;
		Port_Att : Integer32;
		Path_Att : Text;
		RegisterProcedure_Att : Text;
		Protocol_Att : Text;
		Channel_Ref : Channel;
	};

	type Category {
		Domain_Att : Text;
		Value_Att : Text;
	};

	type Enclosure {
		Url_Att : Text;
		Lenght_Att : Integer32;
		Type_Att : Text;
	};

	type Source {
		Url_Att : Text;
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