module Mantis {

	type RelationshipType {"rt_related to", "rt_parent of", "rt_child of", "rt_duplicate of", "rt_has duplicate"};

	type MantisRoot {
		Issues_ContRef : Issue*;
	};

	type IdentifiedElt {
		Id_Att : Integer32;
	};

	type PrivateElt {
		Private_Att : Logical;
	};

	type Issue : IdentifiedElt, PrivateElt {
		I_mantisRoot_Ref : MantisRoot;
		Project_ContRef : ValueWithId;
		Category_Att : Text;
		Priority_ContRef : ValueWithId;
		Severity_ContRef : ValueWithId;
		Status_ContRef : ValueWithId;
		Reporter_ContRef : Person;
		Summary_Att : Text;
		Description_Att : Text;
		Version_Att : Text;
		Build_Att : Text;
		Platform_Att : Text;
		Os_Att : Text;
		OsVersion_Att : Text;
		Reproducibility_ContRef : ValueWithId;
		StepsToReproduce_Att : Text;
		AdditionalInfo_Att : Text;
		DateSubmitted_Att : Integer32;
		AssignedTo_ContRef : Person?;
		Projection_ContRef : ValueWithId?;
		Eta_ContRef : ValueWithId?;
		Resolution_ContRef : ValueWithId?;
		FixedInVersion_Att : Text;
		Attachments_ContRef : Attachment*;
		Relationships_ContRef : Relationship*;
		Notes_ContRef : Note*;
		LastUpdate_Att : Integer32;
	};

	type ValueWithId : IdentifiedElt {
		Value_Att : Text;
	};

	type Person : ValueWithId {
		Login_Att : Text;
	};

	type Relationship : IdentifiedElt {
		Type_Att : RelationshipType;
	};

	type TimeStampedElt {
		Timestamp_Att : Integer32;
	};

	type Note : TimeStampedElt, PrivateElt {
		Author_ContRef : Person;
		Text_Att : Text;
	};

	type Attachment : TimeStampedElt {
		Filename_Att : Text;
		Size_Att : Integer32;
		ContentType_Att : Text;
		DownloadUrl_Att : Text;
	};
}