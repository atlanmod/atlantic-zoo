module Confious {

	type Thing;

	type Reviewer : ConferenceMember, User, Person {
		@[Invites_co-reviewers_Ref] : Reviewer?;
		Invited_by_Ref : Reviewer?;
		Has_a_review_reference_or_expertise_Ref : Thing*;
		AssignedByAdministrator_Ref : Administrator?;
		AdjustBid_Ref : Bid?;
		ReadPaper_Ref : Paper?;
		HasBeenAssigned_Ref : Paper?;
		WriteReview_Ref : Review?;
		AssignExternalReviewer_Ref : ExternalReviewer?;
	};

	type @[Meta-Reviewer] : Reviewer;

	type Decision;

	type Preference;

	type ProgramCommittee {
		HasProgramCommitteeMember_Ref : ProgramCommitteeMember?;
	};

	type Bid {
		AdjustedBy_Ref : Reviewer?;
	};

	type Conference : Thing, Event {
		Is_in_phase_Ref : Phase_of_conference?;
		HasConferenceMember_Ref : ConferenceMember?;
		PaperAssignmentFinalizedBy_Ref : Administrator?;
		ReviewCriteriaEnteredBy_Ref : Administrator?;
		PaperAssignmentToolsRunBy_Ref : Administrator?;
		VirtualMeetingEnabledBy_Ref : Administrator?;
		HardcopyMailingManifestsPrintedBy_Ref : Administrator?;
		DetailsEnteredBy_Ref : Administrator?;
		ReviewerBiddingStartedBy_Ref : Administrator?;
		Date_ContRef : Date?;
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

	type Review : Document, Article, Conference_document {
		Reviews_Ref : Reviewed_contribution?;
		Gives_classification_Ref : Classification;
		Is_created_in_Ref : Activity;
		WrittenBy_Ref : Reviewer?;
	};

	type Paper : Document, Article, Regular_contribution {
		Full_paper_size_Att : Integer32;
		Has_author_Ref : Human;
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
		HasConflictOfInterest_Ref : Document?;
		Email_Att : Text;
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

	type Committee : User {
		Has_members_Ref : Committee_member?;
		Was_a_committee_of_Ref : Conference_volume?;
		@[Has_a_committee_co-chair_Ref] : @[Co-chair]?;
		Has_a_committee_chair_Ref : Chair?;
	};

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

	type Committee_member : Person {
		Was_a_member_of_Ref : Committee?;
	};

	type Abstract : Extended_abstract {
		Is_the_1th_part_of_Ref : Thing*;
	};

	type Extended_abstract : Regular_contribution;

	type Important_dates {
		Is_an_abstract_submission_date_ContRef : Date?;
		Is_a_full_paper_submission_date_ContRef : Date?;
		Is_an_ending_date_ContRef : Date?;
		Is_a_date_of_acceptance_announcement_ContRef : Date?;
		Is_a_date_of_camera_ready_paper_submission_ContRef : Date?;
		Is_a_starting_date_ContRef : Date?;
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
		Has_a_date_of_issue_ContRef : Date?;
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

	type Accepted_Paper : Paper;

	type Rejected_Paper : Paper;

	type Undecided_Paper : Paper;

	type Manual_Paper_Assignment : Paper_assignment {
		Manually_assign_paper_Ref : Program_Committee_member*;
	};

	type Program_Committee_member : Human;

	type Paper_assignment : Activity {
		Assign_paper_Ref : Program_Committee_member?;
		Is_performed_by_Ref : Human;
	};

	type Intensity;

	type @[Start_date_of_camera-ready_submission] : @[Camera-ready_submission_date];

	type @[Camera-ready_submission_date] : Date;

	type Date_of_notification : Date;

	type Date : Thing;

	type Article {
		Goes_through_Ref : Activity?;
		Is_sent_to_Ref : Human?;
		Is_created_in_Ref : Activity?;
		Structure_created_by_Ref : Human?;
		Has_author_Ref : Human?;
		Gives_classification_Ref : Classification?;
	};

	type Contact_Person : Human;

	type Bidding_of_reviewer : Activity {
		Is_performed_by_Ref : Human;
	};

	type Activity {
		Is_followed_by_Ref : Activity?;
		Is_monitored_by_Ref : Human?;
		Has_intensity_Ref : Intensity?;
		Has_result_Ref : Article?;
		Is_performed_by_Ref : Human?;
		Is_supervised_by_Ref : Human?;
	};

	type URL : Thing;

	type Conference_setup : Thing {
		Sets_member_Ref : Human?;
		Is_made_by_Ref : Human?;
		Includes_topic_Ref : Topic?;
		Sets_date_Ref : Date?;
		Sets_URL_Ref : URL?;
	};

	type Human {
		Is_author_of_Ref : Article?;
		Performs_activity_Ref : Activity?;
		Is_employed_in_Ref : Institute?;
		Has_topic_of_interest_Ref : Topic?;
		Supervises_Ref : Activity?;
		@[E-mail_Att] : Text;
		Last_name_Att : Text;
		First_name_Att : Text;
	};

	type Managing_of_conference_process : Activity;

	type Program_Committee_Chair : Human;

	type Reviewing_proces : Activity;

	type @[End_date_of_camera-ready_submission] : @[Camera-ready_submission_date];

	type Abstract_submission_date : Date;

	type Group_email : Article;

	type Senior_Reviewer_URL : URL;

	type Notification : Activity {
		Has_result_Ref : Article;
		Is_performed_by_Ref : Human;
	};

	type Notification_email : Article;

	type Chair_URL : URL;

	type Abstract_of_paper : Article;

	type Submission_process : Activity {
		Is_performed_by_Ref : Human;
	};

	type Topic;

	type Lower_tier_reviewing_process : Reviewing_proces;

	type Start_date_of_conference : Date_of_conference;

	type Date_of_conference : Date;

	type Senior_Program_Committee_member : Program_Committee_member {
		Supervises_Ref : Activity#0 .. 4;
	};

	type End_date_of_abstract_submission : Abstract_submission_date;

	type Phase_of_conference;

	type Regular_Program_Committee_member : Program_Committee_member;

	type Start_date_of_full_paper_submission : Full_paper_submission_date;

	type Full_paper_submission_date : Date;

	type Start_date_of_abstract_submission : Abstract_submission_date;

	type End_date_of_conference : Date_of_conference;

	type Review_form : Article {
		Is_created_in_Ref : Activity;
	};

	type Automatic_Paper_Assignment : Paper_assignment {
		Automatically_assign_paper_Ref : Program_Committee_member*;
	};

	type Institute;

	type Classification;

	type Summary_of_reviews : Article {
		Is_created_in_Ref : Activity;
	};

	type Upper_tier_reviewing_process : Reviewing_proces {
		Is_performed_by_Ref : Human;
	};

	type End_date_of_full_paper_submission : Full_paper_submission_date;

	type Acceptance_notification_email : Notification_email;

	type Rejection_notification_email : Notification_email;

	type Contact_Person_URL : URL;

	type Regular_Reviewer_URL : URL;
}