module Family {

	type Family {
		Name_Att : Text;
		Members_Ref : Person*;
	};

	type Person {
		FirstName_Att : Text;
		ClosestFriend_Ref : Person;
		EmailAddresses_Att : Text;
	};
}