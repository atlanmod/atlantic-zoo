module Cocus {

	type Thing;

	type @[Meta-Reviewer] : Reviewer;

	type Reviewer : ConferenceMember, User {
		AssignedByAdministrator_Ref : Administrator?;
		AdjustBid_Ref : Bid?;
		ReadPaper_Ref : Paper?;
		HasBeenAssigned_Ref : Paper?;
		WriteReview_Ref : Review?;
		AssignExternalReviewer_Ref : ExternalReviewer?;
	};

	type Decision;

	type Preference;

	type ProgramCommittee {
		HasProgramCommitteeMember_Ref : ProgramCommitteeMember?;
	};

	type Bid {
		AdjustedBy_Ref : Reviewer?;
	};

	type Conference : Thing, Event {
		HasConferenceMember_Ref : ConferenceMember?;
		PaperAssignmentFinalizedBy_Ref : Administrator?;
		ReviewCriteriaEnteredBy_Ref : Administrator?;
		PaperAssignmentToolsRunBy_Ref : Administrator?;
		VirtualMeetingEnabledBy_Ref : Administrator?;
		HardcopyMailingManifestsPrintedBy_Ref : Administrator?;
		DetailsEnteredBy_Ref : Administrator?;
		ReviewerBiddingStartedBy_Ref : Administrator?;
		Date_Att : Logical;
		ReviewsPerPaper_Att : Integer32;
		LogoURL_Att : Logical;
		AcceptsHardcopySubmissions_Att : Logical;
		SiteURL_Att : Logical;
	};

	type ConferenceChair : ConferenceMember, Chairman;

	type ConferenceMember : Person {
		MemberOfConference_Ref : Conference?;
	};

	type AssociatedChair : ConferenceMember, Chairman;

	type ProgramCommitteeMember : Person, ConferenceMember {
		MemberOfProgramCommittee_Ref : ProgramCommittee?;
		MaxPapers_Att : Integer32;
		AddedBy_Ref : Administrator?;
	};

	type AuthorNotReviewer : Author;

	type SubjectArea;

	type ExternalReviewer : Person {
		AssignedByReviewer_Ref : Reviewer;
	};

	type Chairman : Person, ConferenceMember;

	type ProgramCommitteeChair : ProgramCommitteeMember, Chairman {
		EndReview_Ref : Review?;
	};

	type Acceptance : Decision;

	type Rejection : Decision;

	type Review : Document {
		WrittenBy_Ref : Reviewer?;
	};

	type Paper : Document {
		@[HasCo-author_Ref] : @[Co-author]?;
		HasBid_Ref : Bid?;
		HasDecision_Ref : Decision?;
		AssignedTo_Ref : Reviewer?;
		HasSubjectArea_Ref : SubjectArea?;
		ReadByReviewer_Ref : Reviewer;
		PaperID_Att : Logical;
		Title_Att : Text;
		HasAuthor_Ref : Author?;
		AcceptedBy_Ref : Administrator?;
		RejectedBy_Ref : Administrator?;
		@[ReadByMeta-Reviewer_Ref] : @[Meta-Reviewer]?;
	};

	type Author : ConferenceMember, User {
		SubmitPaper_Ref : Paper?;
		WritePaper_Ref : Paper?;
	};

	type @[Co-author] : Author {
		@[Co-writePaper_Ref] : Paper?;
	};

	type PaperAbstract : Paper;

	type PaperFullVersion : Paper;

	type Administrator : User, Person {
		Approve_Ref : Event?;
		Assign_Ref : Role?;
		FinalizePaperAssignment_Ref : Conference?;
		RunPaperAssignmentTools_Ref : Conference?;
		EnableVirtualMeeting_Ref : Conference?;
		StartReviewerBidding_Ref : Conference?;
		AssignReviewer_Ref : Reviewer?;
		RejectPaper_Ref : Paper?;
		EnterConferenceDetails_Ref : Conference?;
		PrintHardcopyMailingManifests_Ref : Conference?;
		SetMaxPapers_Ref : ProgramCommitteeMember?;
		EnterReviewCriteria_Ref : Conference?;
		AcceptPaper_Ref : Paper?;
		AddProgramCommitteeMember_Ref : ProgramCommitteeMember?;
	};

	type @[Meta-Review] : Review;

	type Workshop : Event;

	type Event : Thing {
		Conists_of_Ref : Event_Tracks?;
		Confirmed_by_Ref : Approval_Email?;
		Defined_by_Ref : Event_Setup?;
		Approved_by_Ref : Administrator?;
	};

	type Account {
		Registred_by_Ref : Person?;
	};

	type Inforamtion;

	type User : Person {
		Recieve_Ref : Document?;
		Create_Ref : Thing*;
		Submit_Ref : Document?;
	};

	type Role : Thing {
		Assigned_by_Ref : Administrator?;
	};

	type Help_Request : Request;

	type Person : Thing {
		Inverse_of_add_Ref : Thing*;
		Execute_Ref : Thing*;
		Get_Ref : Inforamtion?;
		Use_Ref : Document?;
		Register_Ref : Account?;
		Modify_Ref : Thing*;
		Take_part_in_Ref : Event?;
		Remove_Ref : Thing*;
		Add_Ref : Person?;
		Send_Ref : Activity?;
		Added_by_Ref : Person?;
		HasConflictOfInterest_Ref : Document?;
		Email_Att : Text;
	};

	type Symposium : Event;

	type Abstract : Paper;

	type Document : Thing {
		Recieved_by_Ref : User?;
		Used_by_Ref : Person?;
		Submited__by_Ref : User?;
	};

	type Invited_Paper : Paper;

	type Admin_Role : Role;

	type Paper_Typologies : Event_Setup;

	type Event_Setup {
		Define_Ref : Event?;
	};

	type Event_URL : URL {
		Concerned_Ref : Event?;
	};

	type URL;

	type Notification_Email : Email;

	type Email : Document;

	type Short_Paper : Paper;

	type Author_Role : Role;

	type Preview : Review_Form;

	type Review_Form : Event_Setup;

	type Committe_Role : Role;

	type Group_Email : Email;

	type Submission_Template : Event_Setup;

	type Review_Form_Setup : Review_Form;

	type Misc : Help_Request;

	type Event_Creation : Activity;

	type Approval_Email : Email {
		Confirm_Ref : Event?;
	};

	type Rejection_Email : Email;

	type Submission : Document;

	type Template : Document;

	type Feature_Request : Help_Request;

	type Committee : User;

	type Event_Tracks : Event_Setup;

	type Request : Activity;

	type Activity {
		Has_result_Ref : Thing*;
		Sent_by_Ref : Person?;
	};

	type Head_Role : Role;

	type Detail : Thing;

	type Corresponding_Author : Author;

	type Reviewer_Role : Role;

	type Event_Approval : Activity;

	type Registration : Activity;

	type Full_Paper : Paper;

	type Research_Topic : Event_Setup;

	type Description;

	type Assistance : Help_Request;

	type Email_Template : Event_Setup;
}