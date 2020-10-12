module SoftwareQualityControl {

	type DateType {
		Day_Att : Integer32;
		Month_Att : Integer32;
		Year_Att : Integer32;
	};

	type ControlsSequence {
		Controls_ContRef : Control*;
	};

	type Control {
		C_controlsSequence_Ref : ControlsSequence;
		Responsible_Att : Text;
		Component_Att : Text;
		DevelopmentPhase_Att : Text;
		Scope_Att : Text;
		Date_ContRef : DateType;
		ControlledElt_Att : Text;
		EltRef_Att : Text;
		EltAuthor_Att : Text;
		FormRef_Att : Text;
		Type_ContRef : ControlType;
	};

	type ControlType {
		Ct_control_Ref : Control;
	};

	type BugTracking : ControlType {
		Bugs_ContRef : Bug*;
	};

	type Bug {
		B_bugTracking_Ref : BugTracking;
		Number_Att : Integer32;
		ComponentVersion_Att : Text;
		Description_Att : Text;
		Status_Att : BugStatusType;
		Originator_Att : Text;
		Responsible_Att : Text;
		CommentsAnswers_Att : Text;
		OpenDate_Att : Text;
		CloseDate_Att : Text;
	};

	type BugStatusType {"bst_open", "bst_closed", "bst_skipped"};
}