module Pcs {

	type Thing;

	type @[Meta-Reviewer] : Reviewer;

	type Reviewer : ConferenceMember, User, Member, ProgramCommitteeMember, Organizer, Speaker, Person {
		@[Invites_co-reviewers_Ref] : Reviewer?;
		Invited_by_Ref : Reviewer?;
		Has_a_review_reference_or_expertise_Ref : Thing*;
		Writes_review_Ref : Review?;
		HasReviewHistory_Ref : PersonalReviewHistory?;
		Executes_Ref : DoubleBlindReview?;
		Cooperates_Ref : ExternalReviewer?;
		IsAssignedTo_Ref : Paper?;
		HasConflictedPaper_Ref : Paper?;
		HasPreferredPaper_Ref : Paper?;
		HasPreferredTopic_Ref : ResearchTopic?;
		WriteReview_Ref : Review?;
		Has_made_review_Ref : Paper_Review?;
		UserName_Att : Text;
		Comments_to_Chair_Att : Text;
		Other_Areas_Att : Text;
		Refuses_Ref : Pending_Proposed_Conflict?;
		Reviews_Ref : Paper?;
		BidsFor_Ref : Paper?;
		Confirmes_Ref : Pending_Proposed_Conflict?;
		AssignedPaperBy_Ref : Program_Comitee_Chair?;
		AssignedByAdministrator_Ref : Administrator?;
		AdjustBid_Ref : Bid?;
		ReadPaper_Ref : Paper?;
		HasBeenAssigned_Ref : Paper?;
		AssignExternalReviewer_Ref : ExternalReviewer?;
	};

	type Decision;

	type Preference;

	type Bid {
		AdjustedBy_Ref : Reviewer?;
	};

	type Conference : Thing, Scientific_Event, Working_event, Event {
		Is_in_phase_Ref : Phase_of_conference?;
		Has_program_Ref : Program?;
		HasMember_Ref : Person?;
		HasName_Att : Text;
		EndDate_Att : Logical;
		PaperDueOn_Att : Logical;
		RegistrationDueOn_Att : Logical;
		ManuscriptDueOn_Att : Logical;
		StartDate_Att : Logical;
		HasCountry_Ref : Country;
		IsOrganizedBy_Ref : OrganizingCommittee?;
		AnnualOrder_Att : Integer32;
		TakesPlace_Ref : Location?;
		HasAcronym_Att : Text;
		FinishedBy_Ref : Program_Comitee_Chair?;
		FocusesOn_Ref : Topic?;
		StartedBy_Ref : Program_Comitee_Chair?;
		TakesPlace_Ref : Location?;
		Has_conference_member_Ref : ConferenceMember?;
		WebSite_Att : Logical;
		Topic_of_conference_Att : Text;
		Date_ContRef : Date?;
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

	type ConferenceChair : ConferenceMember, Chairman, Person;

	type AssociatedChair : ConferenceMember, Chairman;

	type AuthorNotReviewer : Author;

	type SubjectArea;

	type ExternalReviewer : Person {
		AssignedByReviewer_Ref : Reviewer;
		CooperatesReviewer_Ref : Reviewer?;
	};

	type Chairman : Person, ConferenceMember;

	type ProgramCommitteeChair : ProgramCommitteeMember, Chairman {
		EndReview_Ref : Review?;
	};

	type Acceptance : Decision;

	type Rejection : Decision;

	type Paper : Contribution, Domain_Topic, ActivitySubmissionForm, Document, Article, Regular_contribution {
		Full_paper_size_Att : Integer32;
		IsWrittenBy_Ref : Author?;
		IsReviewedBy_Ref : Person*;
		HasReview_Ref : Review?;
		HasReviewer_Ref : Possible_Reviewer?;
		PaperIsSubmittedBy_Ref : Author?;
		IsRejectedBy_Ref : Chair?;
		IsAcceptedBy_Ref : Chair?;
		PaperIsAssignedTo_Ref : Reviewer?;
		HasSecondaryTopic_Ref : ResearchTopic?;
		HasMainTopic_Ref : ResearchTopic?;
		HasAuthor_Ref : Author?;
		HasStatus_Ref : PaperStatus?;
		HasTitle_Att : Text;
		HasID_Att : Text;
		HasAbstract_Ref : PaperAbstract?;
		IsRatedBy_Ref : Review?;
		Is_written_by_Ref : Author?;
		Abstract_Att : Text;
		Title_Att : Text;
		Students_Att : Text;
		Keywords_Att : Text;
		RejectedBy_Ref : Program_Comitee_Chair?;
		AcceptedBy_Ref : Program_Comitee_Chair?;
		ReviewedBy_Ref : Reviewer?;
		DiscussedBy_Ref : Program_Comitee?;
		IsPaperTypeOf_Att : EEnum?;
		AssignedToReviewBy_Ref : Program_Comitee_Chair?;
		HasBid_Att : EEnum?;
		Summary_Att : Text;
		Rejected_paper_by_Ref : CommitteeMember?;
		Accepted_by_Ref : CommitteeMember?;
		Written_paper_by_Ref : Author?;
		@[HasCo-author_Ref] : @[Co-Author]?;
		HasBid_Ref : Bid?;
		HasDecision_Ref : Decision?;
		AssignedTo_Ref : Reviewer?;
		HasSubjectArea_Ref : SubjectArea?;
		ReadByReviewer_Ref : Reviewer;
		PaperID_Att : Logical;
		Title_Att : Text;
		@[ReadByMeta-Reviewer_Ref] : @[Meta-Reviewer]?;
	};

	type Author : ConferenceMember, User, People, Person, Speaker {
		SubmitsPaper_Ref : Paper?;
		WritePaper_Ref : Paper?;
		Writes_Paper_Ref : Paper?;
		Changes_Ref : Contribution?;
		Write_paper_Ref : Paper?;
		SubmitPaper_Ref : Paper?;
		Writes_Ref : Contribution?;
		Writes_article_Ref : Article?;
		Assigns_article_to_conference_Ref : Article?;
		HasRelatedPaper_Ref : Paper?;
		ConflictsWith_Ref : Thing*;
		IsAuthorOf_Ref : ActivitySubmissionForm?;
		Conducts_Ref : Thing?;
	};

	type PaperFullVersion : Paper;

	type Administrator : User, ProgramCommitteeMember, Person {
		Approve_Ref : Event?;
		Assign_Ref : Role?;
		Assigns_Ref : Thing?;
		Send_Ref : Email?;
		Generate_Ref : Thing?;
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
		Starts_on_Att : Text;
		Ends_on_Att : Text;
		Has_startdate_Att : Logical;
		Has_enddate_Att : Logical;
		EventOnList_Ref : Thing*;
		PartOfEvent_Ref : Event?;
		HasEvent_Ref : Event?;
		OrganisedBy_Ref : Thing*;
		HeldIn_Ref : Location?;
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

	type Symposium : Event;

	type Document : Thing, Item {
		WrittenBy_Ref : Person?;
		HasUpdatedVersion_Ref : Document?;
		UpdatedVersionOf_Ref : Document?;
		RelatesTo_Ref : Thing*;
		Submited_by_Ref : Person?;
		Document_ID_Att : Text;
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

	type Template : Document;

	type Feature_Request : Help_Request;

	type Event_Tracks : Event_Setup;

	type Request : Activity;

	type Activity : Thing {
		HasTopic_Ref : Topic?;
		ExpectedAttendance_Att : Integer32;
		IsPartOf_Ref : Conference?;
		Is_followed_by_Ref : Activity?;
		Is_monitored_by_Ref : Human?;
		Has_intensity_Ref : Intensity?;
		Has_result_Ref : Article?;
		Is_performed_by_Ref : Human?;
		Is_supervised_by_Ref : Human?;
		Is_held_before_Ref : Time?;
		Is_held_in_Ref : Thing?;
		Is_held_after_Ref : Time?;
		Is_dated_on_Att : Logical;
		Has_result_Ref : Article?;
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

	type Person : Thing {
		Loggin_in_Ref : System?;
		Submit_Ref : Document?;
		Get_Ref : Email?;
		@[E-mail_Att] : Text;
		HasMail_Att : Text;
		WorksForCompany_Att : Text;
		EmployedBy_Ref : Organization?;
		HasHomePage_Att : Text;
		HasSurname_Att : Text;
		HasFax_Att : Text;
		HasFirstName_Att : Text;
		HasPhone_Att : Text;
		HasEmail_Att : Text;
		AttendeeAt_Ref : ConferenceEvent?;
		IsMemberOf_Ref : Conference?;
		HasFirstName_Att : Text;
		HasBiography_Att : Text;
		HasLastName_Att : Text;
		AuthorOf_Ref : Document?;
		Prepare_Ref : Item?;
		Occupy_Ref : Presenter_city*;
		Is_present_in_Ref : Thing*;
		Write_Ref : Item?;
		Obtain_Ref : Item?;
		Send_Ref : Item?;
		Speak_in_Ref : Thing*;
		Pay_Ref : Money?;
		Sign_Ref : Item?;
		Is_present_Ref : Time?;
		Give_Ref : Thing*;
		Need_Ref : Item?;
		HasAffiliation_Att : Text;
		HasFirstName_Att : Text;
		HasLastName_Att : Text;
		HasEmail_Att : Text;
		HasName_Att : Text;
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
		Added_by_Ref : Person?;
		Contributes_Ref : Conference_document?;
		Has_an_email_Att : Text;
		Has_the_first_name_Att : Text;
		Has_gender_Att : EEnum?;
		Has_the_last_name_Att : Text;
	};

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
		Has_a_volume_Att : Text;
	};

	type Information_for_participants : Conference_document;

	type Conference_document {
		Has_authors_Ref : Person?;
		Has_a_date_of_issue_ContRef : Date?;
	};

	type Regular_contribution : Written_contribution;

	type Poster : Conference_contribution;

	type Written_contribution : Conference_contribution;

	type Conference_applicant : Person;

	type Camera_ready_contribution : Accepted_contribution;

	type Accepted_contribution : Reviewed_contribution;

	type Program_committee : Committee, Committees {
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

	type Rejected_contribution : Reviewed_contribution;

	type Reviewed_contribution : Submitted_contribution {
		Has_a_review_Ref : Review?;
	};

	type Review : Conference_document, Thing, Document, Article {
		Gives_classification_Ref : Classification;
		Is_created_in_Ref : Activity;
		Review_written_by_Ref : Reviewer?;
		ReviewOfPaper_Ref : Paper?;
		ReviewWrittenBy_Ref : Possible_Reviewer?;
		ContainsEvaluation_Ref : Evaluation?;
		Rates_Ref : Paper?;
		IsWritenBy_Ref : Reviewer?;
		Assigned_review_by_Ref : Primary_Reviewer?;
		Written_review_by_Ref : Reviewer?;
		WrittenBy_Ref : Reviewer?;
		Reviews_Ref : Reviewed_contribution?;
	};

	type Late_paid_applicant : Paid_applicant;

	type Paid_applicant : Registeered_applicant;

	type Early_paid_applicant : Paid_applicant;

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

	type EEnum {"Yes", "No", "Unsure", "Accept", "Reject", "Unsure", "submitted", "missing", "notStarted", "active", "finished", "accepted", "rejected", "regular", "invited", "lowBid", "-", "CONFLICT", "wantNot", "highBid", "Compilers", "Microarchitecture", "Systems", "ForwardLookingIdea", "1", "2", "3", "4", "5", "6", "7", "male", "female", "high", "medium", "low", "very high"};

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

	type Article : Document {
		Article_written_by_Ref : Author?;
		Has_reviewer_Ref : Reviewer?;
		Has_abstract_Ref : Abstract?;
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

	type Trip : Social_event;

	type Banquet : Social_event;

	type Reception : Social_event;

	type Social_event : Event;

	type Organization {
		IsProviderOf_Ref : Sponsorship?;
	};

	type Country;

	type Company : Organization;

	type Scholar : Person {
		StudyAt_Ref : University?;
	};

	type Poster : Contribution;

	type Short_paper : Contribution;

	type Reviewing_results_event : Administrative_event;

	type Administrative_event : Event {
		Follows_Ref : Administrative_event?;
		Parallel_with_Ref : Administrative_event?;
	};

	type Reviewing_event : Administrative_event;

	type Registration_of_participants_event : Administrative_event;

	type Submission_event : Administrative_event;

	type Camera_Ready_event : Administrative_event;

	type Tutorial : Working_event, Conference_part, Activity, Lecture, Individual_Presentation;

	type Working_event : Event {
		HasTopic_Ref : Topic?;
		HasAdministrativeEvent_Ref : Administrative_event?;
	};

	type Member : Participant, People {
		Web_address_Att : Text;
	};

	type Participant : Person {
		Submits_to_conference_Ref : Conference?;
		EarlyRegistration_Att : Logical;
	};

	type Member_PC : Person {
		ExpertOn_Ref : Topic?;
		Reviewes_Ref : Contribution?;
	};

	type Chair_PC : Person;

	type Student : Participant;

	type Science_Worker : Person;

	type Assistant : Person;

	type Volunteer : Person;

	type Regular : Participant;

	type Pc_meeting : Event;

	type Session : Event;

	type Chair : Person, Committee_member {
		Was_a_committee_chair_of_Ref : Committee?;
		Assigns_reviewers_to_article_Ref : Reviewer?;
		Creates_program_Ref : Program?;
	};

	type Abstract : Paper, Contribution_File, Document, Extended_abstract {
		Is_the_1th_part_of_Ref : Thing*;
		Part_of_article_Ref : Article?;
	};

	type Program {
		Program_created_by_Ref : Chair?;
		Has_session_Ref : Session?;
	};

	type SlideSet : Document;

	type Programme : Document, Conference {
		BelongsToEvent_Ref : ConferenceEvent?;
	};

	type MealMenu : Document {
		IsMenuOf_Ref : MealEvent?;
	};

	type Topic : Thing {
		IsIncluded_Ref : Activity?;
		Belongs_to_a_review_reference_Ref : Review_preference?;
		Is_a_topis_of_conference_parts_Ref : Conference_part?;
		IsTopicOf_Ref : Working_event?;
	};

	type ConferenceEvent {
		HasAttendee_Ref : Person?;
		HasLocation_Ref : Place?;
		HasProgramme_Ref : Programme?;
		HasEndDateTime_Att : Logical;
		HasStartDateTime_Att : Logical;
	};

	type Call {
		ForEvent_Ref : AcademicEvent?;
		IsInitiatedBy_Ref : Person*;
		HasSubmissionInstructions_Att : Text;
		HasSubmissionDeadline_Att : Logical;
	};

	type ReviewRating;

	type ReviewForm;

	type PersonalHistory;

	type Sponsorship {
		ProvidedBy_Ref : Organization?;
		HasCostCurrency_Att : Text;
		HasCostAmount_Att : Integer32;
	};

	type ConferenceSession;

	type ContactInformation {
		HasCity_Att : Text;
		HasStreet_Att : Text;
		HasPostalCode_Att : Text;
		HasPhone_Att : Text;
	};

	type WeekRejectRating : ReviewRating;

	type AcceptRating : ReviewRating;

	type AccpetIfRoomRating : ReviewRating;

	type RejectRating : ReviewRating;

	type MealEvent : NonAcademicEvent {
		HasMenu_Ref : MealMenu?;
	};

	type NonAcademicEvent : ConferenceEvent;

	type BreakEvent : NonAcademicEvent;

	type ParallelAndDistributedComputingTopic : Topic;

	type WirelessCommunicationsTopic : Topic;

	type OperatingTopicsystems : Topic;

	type ComputerNetworksTopic : Topic;

	type SatelliteAndSpaceCommunicationsTopic : Topic;

	type CADTopic : Topic;

	type MultimediaTopic : Topic;

	type CommunicationsTopic : Topic;

	type PowerlineTransmissionTopic : Topic;

	type AntennasTopic : Topic;

	type PerformanceTopic : Topic;

	type SignalProcessingTopic : Topic;

	type MicroelectronicsTopic : Topic;

	type TestOnlyTopic : Topic;

	type RadioCommunicationsTopic : Topic;

	type ComputerArchitectureTopic : Topic;

	type MedicineTopic : Topic;

	type SecurityTopic : Topic;

	type MobileComputingTopic : Topic;

	type CryptographyTopic : Topic;

	type CommunicationTheoryTopic : Topic;

	type DiningPlace : Place;

	type Presenter : Author, Conference_Participant;

	type AcademiaOrganization : Organization;

	type IndustryOrganization : Organization;

	type NGO : Organization;

	type GovernmentOrganization : Organization;

	type ComputerNetworksEnterpriseTopic : ComputerNetworksTopic;

	type ComputerNetworksSwitchingTopic : ComputerNetworksTopic;

	type ComputerNetworksSensorTopic : ComputerNetworksTopic;

	type ComputerNetworksSecurityTopic : ComputerNetworksTopic;

	type ComputerNetworksOpticalTopic : ComputerNetworksTopic;

	type ComputerNetworksMeasurementsTopic : ComputerNetworksTopic;

	type ComputerNetworksManagementTopic : ComputerNetworksTopic;

	type ComputerNetworksAapplicationsTopic : ComputerNetworksTopic;

	type ActivePaper : Paper {
		HasRating_Ref : ReviewRating?;
	};

	type PendingPaper : Paper;

	type WithdrawnPaper : Paper;

	type RejectedPaper : Paper;

	type PublishedPaper : Paper;

	type Attendee : Person;

	type CoffeeBreak : BreakEvent;

	type FreeTimeBreak : BreakEvent;

	type MealBreak : BreakEvent;

	type ClosingTalk : TalkEvent;

	type WelcomeTalk : TalkEvent;

	type TalkEvent : AcademicEvent;

	type SessionChair : Person;

	type TPCMember : Person;

	type TwoLevelConference : Conference;

	type CallForPapers : Call;

	type TextualReviewQuestion : ReviewQuestion;

	type NumericalReviewQuestion : ReviewQuestion;

	type OrganizationalMeeting : AcademicEvent;

	type PaperPresentation : AcademicEvent {
		RelatedToPaper_Ref : AcceptedPaper?;
	};

	type AcademicEvent : ConferenceEvent {
		HasCall_Ref : Call?;
	};

	type PersonalPublicationHistory : PersonalHistory;

	type Excursion : SocialEvent;

	type SocialEvent : NonAcademicEvent;

	type CallForReviews : Call;

	type PersonalReviewHistory : PersonalHistory {
		IsReviewHistoryOf_Ref : Reviewer?;
	};

	type ConferenceVenuePlace : Place;

	type CallForManuscripts : Call;

	type Reception : SocialEvent;

	type SingleLevelConference : Conference;

	type MeetingRoomPlace : Place;

	type AccommodationPlace : Place;

	type RatedPapers : ActivePaper;

	type TravelGrant : Sponsorship;

	type ConferenceDinner : MealEvent;

	type Accepted_Paper : Evaluated_Paper;

	type Rejected_Paper : Evaluated_Paper;

	type Evaluated_Paper : Assigned_Paper {
		HasReview_Ref : Review#3 .. 1;
	};

	type Camera_Ready_Paper : Paper;

	type Positive_Review : Review;

	type Workshop_Paper : Paper;

	type Industrial_Paper : Paper;

	type Conference_Paper : Paper;

	type Industrial_Session : Conference_Session;

	type Conference_Session : Session;

	type Regular_Session : Session;

	type Poster_Session : Session;

	type Demo_Session : Session;

	type Paper_Author : Person;

	type Conference_Trip : Social_Event;

	type Social_Event : Event;

	type Tutorial_Abstract : Abstract;

	type Conference_Participant : Person;

	type Assigned_Paper : Submitted_Paper {
		HasReviewer_Ref : Possible_Reviewer#3 .. 1;
	};

	type Negative_Review : Review;

	type Neutral_Review : Review;

	type Research_Topic {
		TopicCoveredBy_Ref : Thing?;
	};

	type Organising_Agency : Organisation;

	type Academic_Institution : Organisation {
		ScientificallyOrganises_Ref : Academic_Institution?;
	};

	type Organisation {
		PublisherOf_Ref : Thing*;
		TechnicallyOrganises_Ref : Thing?;
	};

	type Proceedings_Publisher : Organisation;

	type Poster_Paper : Paper;

	type Regular_Paper : Paper;

	type Demo_Paper : Paper;

	type Location {
		LocationOf_Ref : Event?;
	};

	type Research_Institute : Academic_Institution;

	type Scientific_Event : Event;

	type Invited_Talk_Abstract : Abstract;

	type Agency_Staff_Member : Person;

	type Workshop_Session : Session;

	type Track : Scientific_Event, Conference_part;

	type Invited_Talk : Individual_Presentation;

	type Workshop : Scientific_Event, Activity, AcademicEvent, Working_event, Conference_part, Event;

	type Contributed_Talk : Individual_Presentation {
		PresentationOfPaper_Ref : Document*;
	};

	type Demo_Chair : Conference_Participant;

	type Tutorial_Chair : Conference_Participant, PC_Member;

	type PC_Chair : Conference_Participant, PC_Member;

	type PC_Member : Possible_Reviewer;

	type OC_Member : Conference_Participant;

	type Programme_Brochure : Document;

	type Flyer : Document;

	type Web_Site : Document;

	type @[Multi-author_Volume] : Document;

	type Individual_Presentation : Scientific_Event {
		PresentationOfPaper_Ref : Document*;
	};

	type OC_Chair : OC_Member;

	type Conference_Banquet : Social_Event;

	type Workshop_Chair : Conference_Participant, PC_Member;

	type Conference_Proceedings : Proceedings;

	type Session_Chair : PC_Member, Conference_Participant;

	type @[Early-Registered_Participant] : Conference_Participant;

	type @[Late-Registered_Participant] : Conference_Participant;

	type University : Academic_Institution, Organization;

	type Possible_Reviewer : Person {
		ReviewerOfPaper_Ref : Paper?;
	};

	type Student : Person;

	type Invited_Speaker : Presenter;

	type SC_Member : PC_Member;

	type Presenter_house : Building;

	type Building : Place;

	type Presenter_state : State;

	type Delegate : Person;

	type Presenter_city : City;

	type Hotel_registration_form : Form;

	type Deadline_hotel_reservation : Deadline;

	type Form : Document;

	type Car : Transport_vehicle;

	type Transport_vehicle : Item;

	type Mailing_list : Document;

	type Renting : Activity_before_conference;

	type Activity_before_conference : Activity;

	type Dinner_banquet : Social_program;

	type One_day_presenter : Delegate;

	type Social_program : Conference_activity;

	type PowerPoint_presentation : Presentation;

	type Presentation : Conference_activity, Conference_contribution {
		Is_given_by_Ref : Active_conference_participant?;
	};

	type Conference_restaurant : Building;

	type Conference_city : City;

	type Conference_state : State;

	type Submissions_deadline : Deadline;

	type Deadline : Time {
		Done_till_ContRef : Date?;
	};

	type Simulating : Research;

	type Research : Activity_before_conference;

	type Technic_activity : Conference_activity;

	type Conference_activity : Activity;

	type Technical_commitee : Delegate;

	type Place : Thing {
		IsLocationOf_Ref : ConferenceEvent?;
		Is_equipped_by_Ref : Item?;
	};

	type Author_cd_proceedings_included : Author;

	type Cd_proceening : Publication;

	type Trip_day : Time;

	type Time;

	type Record_of_attendance : Document;

	type Listener : Delegate;

	type Session_room : Place;

	type Brief_introduction_for_Session_chair : Document;

	type Session_chair : Delegate;

	type Invitation_letter : Document;

	type Registration_form : Form;

	type Viza : Document;

	type Registration : Conference_activity;

	type Conference_days : Time;

	type Conference_building : Building;

	type Registration_fee : Fee;

	type Departure : Activity_after_conference;

	type Activity_after_conference : Activity;

	type Conference_airport : Building;

	type Worker_lecturer : Lecturer;

	type Lecturer : Author;

	type Transparency : Document;

	type City : Thing;

	type Card : Item;

	type Item {
		Go_through_Ref : Activity?;
		Is_used_for_Ref : Thing*;
		Is_signed_by_Ref : Person?;
		Is_made_from_Ref : Item?;
		Is_sent_after_Ref : Time?;
		Is_needed_for_Ref : Person?;
		Is_sent_before_Ref : Time?;
		Is_prepared_by_Ref : Person?;
		Is_used_by_Ref : Person?;
		Is_given_to_Ref : Person?;
		Is_sent_by_Ref : Person?;
		Is_writen_by_Ref : Person?;
	};

	type Author_attendee_book_registration_fee : Registration_fee;

	type Book_proceeding : Publication;

	type Video_cassette_player : Audiovisual_equipment;

	type Audiovisual_equipment : Item;

	type Video_presentation : Presentation;

	type Hotel_room : Place;

	type Hotel_presenter : Delegate;

	type Conference_hotel : Building;

	type Money {
		Is_paid_with_Ref : Item?;
		Is_paid_by_Ref : Person?;
		Is_paid_in_Ref : Building?;
		Is_paid_for_Ref : Thing*;
		Has_amount_of_ContRef : Money?;
	};

	type State;

	type Introduction : Conference_activity;

	type Welcome_address : Conference_activity;

	type Value_added_tax : Tax;

	type Tax : Money;

	type Refusing_manuscript : Activity_before_conference;

	type Final_manuscript : Submission;

	type Accepting_manuscript : Activity_before_conference;

	type Submission : Document, Thing {
		WrittenBy_Ref : Author?;
		DealsWith_Ref : Topic?;
		Remark_Att : Text;
		Abstract_Att : Text;
		ContactEmail_Att : Text;
		HasKeyword_Att : Text;
		HasTitle_Att : Text;
	};

	type Sponsor_city : City;

	type Sponsor : Person;

	type Time_zone;

	type Introduction_of_speaker : Introduction;

	type Conference_hall : Place;

	type Plenary_lecture : Lecture;

	type Plenary_lecture_speaker : Author;

	type LCD_projector : Audiovisual_equipment;

	type Deadline_for_notification_of_acceptance : Deadline;

	type Tutorial_speaker : Author;

	type Registation_deadline : Deadline;

	type Single_hotel_room : Hotel_room;

	type Non_speaker : Delegate;

	type Author_information_form : Form;

	type Nonmember_registration_fee : Registration_fee;

	type IASTED_non_member : Delegate;

	type Hotel_fee : Fee;

	type Fee : Money;

	type Publication : Item;

	type Taxi : Transport_vehicle;

	type Sponsor_state : State;

	type Modelling : Research;

	type Worker_non_speaker : Non_speaker;

	type Nonauthor_registration_fee : Registration_fee;

	type Payment_document : Document;

	type Camera_ready_manuscript_deadline : Deadline;

	type One_conference_day : Conference_days;

	type Fee_for_extra_trip : Fee;

	type Full_day_tour : Activity_after_conference;

	type Conference_Hiker : Delegate;

	type Computer : Audiovisual_equipment;

	type IASTED_member : Delegate;

	type Memeber_registration_fee : Registration_fee;

	type Author_book_proceedings_included : Author;

	type Sponsor_company_house : Building;

	type Sponzorship : Money;

	type Student_lecturer : Lecturer;

	type Trip_city : City;

	type Cheque : Payment_document;

	type Shuttle_bus : Transport_vehicle;

	type Student_non_speaker : Non_speaker;

	type Student_registration_fee : Registration_fee;

	type Author_attendee_cd_registration_fee : Registration_fee;

	type Tip : Money;

	type Credit_card : Card;

	type Van : Transport_vehicle;

	type Main_office : Place;

	type Presenter_university : Building;

	type Departure_tax : Tax;

	type Receiving_manuscript : Activity_before_conference;

	type Double_hotel_room : Hotel_room;

	type Initial_manuscipt : Submission;

	type Coffee_break : Conference_activity;

	type Bank_transfer : Payment_document;

	type Overhead_projector : Audiovisual_equipment;

	type Speaker_lecture : Session;

	type Coctail_reception : Conference_activity;

	type Currency;

	type OrganizingCommittee : Thing {
		Organizes_Ref : Conference?;
	};

	type ProgramCoChair : OrganizingCommittee;

	type Organizer : Person, Thing;

	type PublicationsChair : OrganizingCommittee;

	type OutsideReferee : Person;

	type Lecture : Activity, Conference_activity {
		HasAcronym_Att : Text;
	};

	type ActivitySubmissionForm : Thing {
		IsSubmittedBy_Ref : Author?;
		HasAuthor_Ref : Author?;
		SubmissionDeadline_Att : Logical;
	};

	type WorkshopTutorialChair : OrganizingCommittee;

	type DoubleBlindReview : Thing {
		IsExecutedBy_Ref : Reviewer?;
	};

	type TutorialProposal : ActivitySubmissionForm;

	type RegistrationChair : OrganizingCommittee;

	type StudentAdvocate : OrganizingCommittee;

	type FinanceChair : OrganizingCommittee;

	type QualitatvieLecture : Lecture;

	type TraditionalLecture : Lecture;

	type PaperSubmissionChair : OrganizingCommittee;

	type PublicityWebChair : OrganizingCommittee;

	type SteeringCommittee : OrganizingCommittee;

	type GeneralCoChair : OrganizingCommittee;

	type WorksopProposal : ActivitySubmissionForm;

	type ProgramCommitteeMember : Person, ConferenceMember {
		MemberOfProgramCommittee_Ref : ProgramCommittee?;
		MaxPapers_Att : Integer32;
		AddedBy_Ref : Administrator?;
		IsMemberOf_Ref : ProgramCommittee?;
		HasPassword_Att : Text;
	};

	type ContactAuthor : Author {
		SubmitsAbstract_Ref : PaperAbstract?;
	};

	type ConferenceProgram : Thing {
		IsProgramOf_Ref : Conference;
		ConsistsOf_Ref : Slot?;
	};

	type PaperStatus {
		IsStatusOf_Ref : Paper?;
	};

	type Slot : Thing {
		Date_ContRef : Date?;
		EndsAt_Att : Logical;
		BeginsAt_Att : Logical;
		Forms_Ref : ConferenceProgram?;
		Hosts_Ref : Session?;
	};

	type Session : Thing, Lecture, Scientific_Event {
		HasAssignedPaper_Ref : AcceptedPaper?;
		Room_Att : Text;
		IsAssociatedTo_Ref : Slot?;
		HasChair_Ref : Chair?;
	};

	type ResearchTopic : Thing;

	type Question;

	type PaymentMode;

	type OutputDocument : Thing {
		IsProducedBy_Ref : Chair?;
	};

	type ProgramCommittee : Thing {
		HasProgramCommitteeMember_Ref : ProgramCommitteeMember?;
		HasMember_Ref : ProgramCommitteeMember?;
	};

	type Criterion : Thing {
		HasWeight_Att : Logical;
	};

	type AcceptedPaper : Paper {
		RelatedToEvent_Ref : PaperPresentation?;
		IsAssignedToSession_Ref : Session?;
	};

	type RejectedPaper : Paper;

	type Chair : ProgramCommitteeMember {
		Produces_Ref : OutputDocument?;
		Sets_Ref : Thing?;
		Accepts_Ref : Paper?;
		Rejects_Ref : Paper?;
		AsksForPreference_Ref : Reviewer?;
		IsChairOf_Ref : Session?;
	};

	type ConferenceAttendant : Person {
		MustPay_Ref : Fee?;
		HasAdress_Att : Text;
		Paid_Att : Logical;
		HasPhone_Att : Text;
	};

	type Evaluation : Document {
		IsContainedIn_Ref : Review?;
	};

	type PaperAbstract : Document, Paper {
		IsAbstractOf_Ref : Paper?;
		AbstractIsSubmittedBy_Ref : ContactAuthor?;
	};

	type ReviewQuestion : Question;

	type PaperQuestion : Question;

	type @[CD-ROM] : OutputDocument;

	type IndexOfAuthors : OutputDocument;

	type ExternalReviewersList : OutputDocument;

	type Proceedings : OutputDocument, @[Multi-author_Volume] {
		Includes_Ref : Thing*;
	};

	type Program : OutputDocument;

	type PCMembersList : OutputDocument;

	type ListOfAbstracts : OutputDocument;

	type BookletOfAbstracts : OutputDocument;

	type RFC : Topics;

	type Topics : Value_Partition;

	type Classic_Papers : Topics;

	type Networking : Topics;

	type Humour : Topics;

	type Programming : Topics;

	type Computer_Science : Topics;

	type Format : Value_Partition;

	type Value_Partition;

	type Adobe_PDF : Format;

	type MS_Word : Format;

	type Corel_Word_Perfect : Format;

	type HTML : Format;

	type PostScript : Format;

	type RTF : Format;

	type Text : Format;

	type High : Reviewer_Famliliarity;

	type Reviewer_Famliliarity : Review_Values;

	type Low : Reviewer_Famliliarity;

	type Moderate : Reviewer_Famliliarity;

	type Marginal_Tend_to_Reject : Reccommendation;

	type Reccommendation : Review_Values;

	type Marginal_Tend_to_Accept : Reccommendation;

	type Portable_Reject : Reccommendation;

	type Must_Accept : Reccommendation;

	type Clear_Reject : Reccommendation;

	type Clear_Accept : Reccommendation;

	type Program_chair : Member {
		Made_program_Ref : Conference_Program?;
	};

	type Conference_Program : Domain_Topic {
		Program_made_by_Ref : Program_chair?;
		Planned_papers_Ref : Planed_Paper?;
	};

	type Domain_Topic;

	type Planed_Paper : Reviewed_Paper {
		Is_planned_in_Ref : Conference_Program?;
	};

	type Valuable_Confirmation_of_Present_Knowledge : Overall_Value;

	type Other : Overall_Value;

	type Not_Much : Overall_Value;

	type New_Information : Overall_Value;

	type New_Perspective_Issue_Problem_Solving : Overall_Value;

	type Clarity_to_Present_Understanding : Overall_Value;

	type Overall_Value : Review_Values;

	type Tends_Towards_Theoretical : Paper_Categorization;

	type Paper_Categorization : Review_Values;

	type Tends_Towards_Practical : Paper_Categorization;

	type Balanced_Theory_and_Practice : Paper_Categorization;

	type Highly_Theoretical : Paper_Categorization;

	type Highly_Practical : Paper_Categorization;

	type Reviewed_Paper : Submitted_Paper;

	type Submitted_Paper : Paper {
		Is_stored_in_Ref : Paper_File?;
		Has_been_sent_by_Ref : Contact_Author?;
		Paper_Id_Att : Text;
		Comments_To_Chair_Att : Text;
	};

	type Paper_Review : Domain_Topic {
		Is_Candidate_for_Award_Ref : Long_bool?;
		Appropriate_length_Ref : Long_bool?;
		Has_Categorization_Ref : Paper_Categorization?;
		Has_Overall_Ref : Overall_Value?;
		Has_Reccommendation_Ref : Reccommendation?;
		Review_made_by_Ref : Reviewer?;
		Comments_for_Author_Att : Text;
		Comments_for_Program_Committee_Att : Text;
	};

	type Long_bool : Value_Partition;

	type Review_Values : Value_Partition;

	type Review_Committee : Committees;

	type Committees : Domain_Topic;

	type Advocate : Member {
		Will_advocate_Ref : Advocated_Paper?;
	};

	type Advocated_Paper : Submitted_Paper {
		To_advocate_by_Ref : Advocate?;
	};

	type Contact_Author : Author {
		Has_sent_Ref : Submitted_Paper?;
		Alternate_Email_Att : Text;
	};

	type Result_of_Advocate : Value_Partition;

	type People : Domain_Topic {
		Surname_Att : Text;
		Name_Att : Text;
		Country_Att : Text;
		@[E-mail_Att] : Text;
		Organisation_Att : Text;
	};

	type Source_Archive : Contribution_File;

	type Poster : Contribution_File;

	type Camera_Ready_Copy : Contribution_File;

	type Paper_File : Contribution_File, Domain_Topic {
		Is_Type_Ref : Format?;
	};

	type Slides : Contribution_File;

	type Contribution_File : Contribution {
		HasContributionFileStatus_Att : EEnum?;
	};

	type Discussion;

	type PhaseOfConferencePreparation {
		HasPhaseStatus_Att : EEnum?;
	};

	type Program_Comitee : Thing {
		Discusses_Ref : Paper?;
	};

	type Contribution : Thing {
		WrittenBy_Ref : Author?;
		DealsWith_Ref : Topic?;
		Remark_Att : Text;
		Abstract_Att : Text;
		ContactEmail_Att : Text;
		HasKeyword_Att : Text;
		HasTitle_Att : Text;
		ChangedBy_Ref : Author?;
		HasContributionStatus_Att : EEnum?;
	};

	type Conflict_Of_Interest : Thing;

	type Conflict_Rules : Thing;

	type Program_Comitee_Meeting : Thing;

	type Setup_Phase : PhaseOfConferencePreparation;

	type Camera_Ready_Copy_Phase : PhaseOfConferencePreparation;

	type Assignment_Phase : PhaseOfConferencePreparation;

	type Blocked_Phase : PhaseOfConferencePreparation;

	type Abstract_And_Paper_Submission_Phase : PhaseOfConferencePreparation;

	type Invitation_Of_Reviewers_Phase : PhaseOfConferencePreparation;

	type Review_Phase : PhaseOfConferencePreparation;

	type Closed_Phase : PhaseOfConferencePreparation;

	type Bidding_Phase : PhaseOfConferencePreparation;

	type Speaker : Person, Delegate;

	type Program_Comitee_Chair : Person {
		Finishes_Ref : Conference?;
		HeadOf_Ref : Program_Comitee?;
		Switches_Ref : PhaseOfConferencePreparation?;
		Starts_Ref : Conference?;
		Accepts_Ref : Paper?;
		AssignsToReview_Ref : Paper?;
		AssignsPaper_Ref : Reviewer?;
		Rejects_Ref : Paper?;
	};

	type Confirmed_Conflict : Conflict_Of_Interest;

	type Pending_Proposed_Conflict : Conflict_Of_Interest {
		RefusedBy_Ref : Reviewer?;
		ConfirmedBy_Ref : Reviewer?;
	};

	type Hidden_Conflict : Conflict_Of_Interest;

	type Deleted_Conflict : Conflict_Of_Interest;

	type Proposed_Conflict : Conflict_Of_Interest {
		ConflictProposedBy_Ref : Thing?;
	};

	type Self_Conflict : Conflict_Of_Interest;

	type @[Co-Author] : Author {
		@[Co-writePaper_Ref] : Paper?;
	};

	type MainAuthor : Author;

	type Bidding_And_Paper_Submission_Phase : Bidding_Phase;

	type Bidding_Without_Paper_Submission_Phase : Bidding_Phase;

	type @[E-mail_PC_Meeting] : Program_Comitee_Meeting;

	type PC_Meeting : Program_Comitee_Meeting;

	type External_Reviewer : Person;

	type Accepted_paper : Paper {
		Read_paper_by_Ref : Thing?;
		Rateed_paper_by_Ref : Thing?;
		Score_Att : EEnum?;
	};

	type Report;

	type Secondary_Reviewer : CommitteeMember;

	type CommitteeMember : ConferenceMember, Organizer {
		IsMemberOf_Ref : Conference?;
		Reject_paper_Ref : Paper?;
		Accept_Ref : Paper?;
	};

	type Email : Document {
		Sended_by_Ref : Administrator?;
		Receiver_of_email_Att : Text;
		Message_of_email_Att : Text;
		Subject_of_email_Att : Text;
	};

	type ConferenceMember : Person {
		MemberOfConference_Ref : Conference?;
		Member_of_conference_Ref : Conference?;
	};

	type Information : Email;

	type Electronic_proceeding;

	type System;

	type CD : Electronic_proceeding;

	type Invitation : Email;

	type Web_site : Electronic_proceeding;

	type Rejected_paper : Paper;

	type Primary_Reviewer : CommitteeMember {
		Assign_review_Ref : Review?;
	};
}