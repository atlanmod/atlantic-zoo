module Conference {

	type Thing;

	type @[Meta-Reviewer] : Reviewer;

	type Reviewer : ConferenceMember, User, Person {
		AssignedByAdministrator_Ref : Administrator?;
		AdjustBid_Ref : Bid?;
		ReadPaper_Ref : Paper?;
		HasBeenAssigned_Ref : Paper?;
		WriteReview_Ref : Review?;
		AssignExternalReviewer_Ref : ExternalReviewer?;
		@[Invites_co-reviewers_Ref] : Reviewer?;
		Invited_by_Ref : Reviewer?;
		Has_a_review_reference_or_expertise_Ref : Thing*;
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

	type Paper : Document, Regular_contribution {
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
		Contributes_Ref : Conference_document?;
		Has_an_email_Att : Text;
		Has_the_first_name_Att : Text;
		Has_gender_Att : EEnum?;
		Has_the_last_name_Att : Text;
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

	type Conference_participant : Person;

	type Active_conference_participant : Conference_contributor, Conference_participant {
		Gives_presentations_Ref : Presentation?;
	};

	type Passive_conference_participant : Conference_participant;

	type Review_expertise : Thing {
		Has_a_submitted_contribution_Ref : Submitted_contribution?;
		Has_an_expertise_Att : EEnum?;
	};

	type Submitted_contribution : Written_contribution {
		Has_a_review_expertise_Ref : Review_expertise?;
	};

	type Regular_author : Conference_contributor;

	type Conference_contributor : Person;

	type @[Contribution_1th-author] : Regular_author;

	type @[Contribution_co-author] : Regular_author;

	type Conference_contribution : Conference_document {
		Is_submitted_at_Ref : Conference_volume?;
	};

	type @[Co-chair] : Committee_member {
		@[Was_a_committe_co-chair_of_Ref] : Committee?;
	};

	type Committee : User {
		Has_members_Ref : Committee_member?;
		Was_a_committee_of_Ref : Conference_volume?;
		@[Has_a_committee_co-chair_Ref] : @[Co-chair]?;
		Has_a_committee_chair_Ref : Chair?;
	};

	type Committee_member : Person {
		Was_a_member_of_Ref : Committee?;
	};

	type Abstract : Extended_abstract {
		Is_the_1th_part_of_Ref : Thing*;
	};

	type Extended_abstract : Regular_contribution;

	type Important_dates {
		Is_an_abstract_submission_date_Att : Logical;
		Is_a_full_paper_submission_date_Att : Logical;
		Is_an_ending_date_Att : Logical;
		Is_a_date_of_acceptance_announcement_Att : Logical;
		Is_a_date_of_camera_ready_paper_submission_Att : Logical;
		Is_a_starting_date_Att : Logical;
		Belong_to_a_conference_volume_Ref : Conference_volume?;
	};

	type Invited_speaker : Conference_contributor;

	type Conference_proceedings {
		Has_an_ISBN_Att : Text;
		Has_a_publisher_Ref : Publisher?;
		Has_a_volume_Att : Integer32;
	};

	type Information_for_participants : Conference_document;

	type Conference_document {
		Has_authors_Ref : Person?;
		Has_a_date_of_issue_Att : Logical;
	};

	type Organization;

	type Regular_contribution : Written_contribution;

	type Poster : Conference_contribution;

	type Written_contribution : Conference_contribution;

	type Conference_applicant : Person;

	type Camera_ready_contribution : Accepted_contribution;

	type Accepted_contribution : Reviewed_contribution;

	type Program_committee : Committee {
		Was_a_program_committee_of_Ref : Conference_volume?;
	};

	type Organizing_committee : Committee {
		Was_an_organizing_committee_of_Ref : Conference_volume?;
	};

	type Steering_committee : Committee {
		Was_a_steering_committee_of_Ref : Conference_volume?;
	};

	type Conference_volume : Conference {
		Has_parts_Ref : Conference_part?;
		Has_workshops_Ref : Workshop?;
		Has_tracks_Ref : Track?;
		Has_tutorials_Ref : Tutorial?;
		Has_a_commtitee_Ref : Committee?;
		Has_a_steering_committee_Ref : Steering_committee?;
		Has_an_organizing_committee_Ref : Organizing_committee?;
		Has_important_dates_Ref : Important_dates?;
		Has_contributions_Ref : Conference_contribution?;
		Has_a_location_Att : Text;
		Has_a_program_committee_Ref : Program_committee?;
	};

	type Call_for_paper : Conference_document;

	type Conference_announcement : Conference_document;

	type Invited_talk : Presentation;

	type Conference_part {
		@[Has_a_track-workshop-tutorial_topic_Ref] : Topic?;
		Is_part_of_conference_volumes_Ref : Conference_volume?;
		@[Has_a_track-workshop-tutorial_chair_Ref] : @[Track-workshop_chair]?;
	};

	type Presentation : Conference_contribution {
		Is_given_by_Ref : Active_conference_participant?;
	};

	type Chair : Committee_member {
		Was_a_committee_chair_of_Ref : Committee?;
	};

	type Track : Conference_part;

	type Workshop : Conference_part, Event;

	type Tutorial : Conference_part;

	type Rejected_contribution : Reviewed_contribution;

	type Reviewed_contribution : Submitted_contribution {
		Has_a_review_Ref : Review?;
	};

	type Review : Conference_document, Document {
		WrittenBy_Ref : Reviewer?;
		Reviews_Ref : Reviewed_contribution?;
	};

	type Topic {
		Belongs_to_a_review_reference_Ref : Review_preference?;
		Is_a_topis_of_conference_parts_Ref : Conference_part?;
	};

	type Late_paid_applicant : Paid_applicant;

	type Paid_applicant : Registeered_applicant;

	type Early_paid_applicant : Paid_applicant;

	type Organizer : Thing;

	type Call_for_participation : Conference_document;

	type Publisher {
		Issues_Ref : Conference_proceedings?;
	};

	type Registeered_applicant : Conference_applicant;

	type @[Track-workshop_chair] : Person {
		@[Was_a_track-workshop_chair_of_Ref] : Conference_part?;
	};

	type Conference_www : Conference_document {
		Has_a_URL_Att : Text;
	};

	type Conference_fees;

	type Review_preference : Thing {
		Has_a_topic_or_a_submission_contribution_Ref : Thing*;
		Has_a_degree_Att : Integer32;
	};

	type EEnum {"high", "medium", "low", "very high", "male", "female"};
}