module Ekaw {

	type Thing;

	type @[Meta-Reviewer] : Reviewer;

	type Decision;

	type Preference;

	type ProgramCommittee {
		HasProgramCommitteeMember_Ref : ProgramCommitteeMember?;
	};

	type Bid {
		AdjustedBy_Ref : Reviewer?;
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
		AttendeeAt_Ref : ConferenceEvent?;
		IsMemberOf_Ref : Conference?;
		HasFirstName_Att : Text;
		HasBiography_Att : Text;
		HasLastName_Att : Text;
		EmployedBy_Ref : Organization?;
		HasHomePage_Att : Text;
		HasSurname_Att : Text;
		HasFax_Att : Text;
		HasFirstName_Att : Text;
		HasPhone_Att : Text;
		HasEmail_Att : Text;
		Contributes_Ref : Conference_document?;
		Has_an_email_Att : Text;
		Has_the_first_name_Att : Text;
		Has_gender_Att : EEnum?;
		Has_the_last_name_Att : Text;
		AuthorOf_Ref : Document?;
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
	};

	type Symposium : Event;

	type Document : Thing {
		RelatesTo_Ref : Thing*;
		WrittenBy_Ref : Person?;
		HasUpdatedVersion_Ref : Document?;
		UpdatedVersionOf_Ref : Document?;
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

	type Event_Tracks : Event_Setup;

	type Request : Activity;

	type Activity {
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

	type Abstract : Paper, Document, Extended_abstract {
		Part_of_article_Ref : Article?;
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

	type Track : Conference_part, Scientific_Event;

	type Rejected_contribution : Reviewed_contribution;

	type Reviewed_contribution : Submitted_contribution {
		Has_a_review_Ref : Review?;
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

	type EEnum {"male", "female", "high", "medium", "low", "very high"};

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

	type Event : Thing {
		EventOnList_Ref : Thing*;
		PartOfEvent_Ref : Event?;
		HasEvent_Ref : Event?;
		OrganisedBy_Ref : Thing*;
		HeldIn_Ref : Location?;
		Conists_of_Ref : Event_Tracks?;
		Confirmed_by_Ref : Approval_Email?;
		Defined_by_Ref : Event_Setup?;
		Approved_by_Ref : Administrator?;
		Starts_on_Att : Text;
		Ends_on_Att : Text;
		Has_startdate_Att : Logical;
		Has_enddate_Att : Logical;
	};

	type Contribution : Thing {
		WrittenBy_Ref : Author?;
		DealsWith_Ref : Topic?;
		Remark_Att : Text;
		Abstract_Att : Text;
		ContactEmail_Att : Text;
		HasKeyword_Att : Text;
		HasTitle_Att : Text;
	};

	type City;

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

	type Workshop : Working_event, Scientific_Event, AcademicEvent, Event, Conference_part;

	type Tutorial : Working_event, Conference_part, Individual_Presentation;

	type Working_event : Event {
		HasTopic_Ref : Topic?;
		HasAdministrativeEvent_Ref : Administrative_event?;
	};

	type Member : Participant;

	type Participant : Person {
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

	type Author : User, ConferenceMember, Person {
		Writes_article_Ref : Article?;
		Assigns_article_to_conference_Ref : Article?;
		HasRelatedPaper_Ref : Paper?;
		SubmitPaper_Ref : Paper?;
		WritePaper_Ref : Paper?;
		Writes_Ref : Contribution?;
	};

	type Pc_meeting : Event;

	type Session : Event;

	type Conference : Thing, Event, Working_event, Scientific_Event {
		Is_in_phase_Ref : Phase_of_conference?;
		HasMember_Ref : Person?;
		HasName_Att : Text;
		EndDate_Att : Logical;
		PaperDueOn_Att : Logical;
		RegistrationDueOn_Att : Logical;
		ManuscriptDueOn_Att : Logical;
		StartDate_Att : Logical;
		HasCountry_Ref : Country;
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
		Has_program_Ref : Program?;
	};

	type Chair : Person {
		Assigns_reviewers_to_article_Ref : Reviewer?;
		Creates_program_Ref : Program?;
	};

	type Review : Article, Document, Conference_document {
		ReviewOfPaper_Ref : Paper?;
		ReviewWrittenBy_Ref : Possible_Reviewer?;
		WrittenBy_Ref : Reviewer?;
		Reviews_Ref : Reviewed_contribution?;
		Gives_classification_Ref : Classification;
		Is_created_in_Ref : Activity;
		Review_written_by_Ref : Reviewer?;
	};

	type Participant : Person {
		Submits_to_conference_Ref : Conference?;
	};

	type Program {
		Program_created_by_Ref : Chair?;
		Has_session_Ref : Session?;
	};

	type SlideSet : Document;

	type Programme : Document {
		BelongsToEvent_Ref : ConferenceEvent?;
	};

	type MealMenu : Document {
		IsMenuOf_Ref : MealEvent?;
	};

	type Topic {
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

	type Organization {
		IsProviderOf_Ref : Sponsorship?;
	};

	type ReviewForm;

	type PersonalHistory;

	type Sponsorship {
		ProvidedBy_Ref : Organization?;
		HasCostCurrency_Att : Text;
		HasCostAmount_Att : Integer32;
	};

	type ReviewQuestion;

	type Country;

	type ConferenceSession;

	type ContactInformation {
		HasCity_Att : Text;
		HasStreet_Att : Text;
		HasPostalCode_Att : Text;
		HasPhone_Att : Text;
	};

	type Place {
		IsLocationOf_Ref : ConferenceEvent?;
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

	type ConferenceChair : Person;

	type DiningPlace : Place;

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

	type AcceptedPaper : Paper {
		RelatedToEvent_Ref : PaperPresentation?;
	};

	type PublishedPaper : Paper;

	type Attendee : Person;

	type CoffeeBreak : BreakEvent;

	type FreeTimeBreak : BreakEvent;

	type MealBreak : BreakEvent;

	type Reviewer : Person, ConferenceMember, User {
		AssignedByAdministrator_Ref : Administrator?;
		AdjustBid_Ref : Bid?;
		ReadPaper_Ref : Paper?;
		HasBeenAssigned_Ref : Paper?;
		WriteReview_Ref : Review?;
		AssignExternalReviewer_Ref : ExternalReviewer?;
		@[Invites_co-reviewers_Ref] : Reviewer?;
		Invited_by_Ref : Reviewer?;
		Has_a_review_reference_or_expertise_Ref : Thing*;
		Writes_review_Ref : Review?;
		HasReviewHistory_Ref : PersonalReviewHistory?;
	};

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

	type Paper : Document, Contribution, Article, Regular_contribution {
		Full_paper_size_Att : Integer32;
		Has_author_Ref : Human;
		IsWrittenBy_Ref : Author?;
		IsReviewedBy_Ref : Person*;
		HasReview_Ref : Review?;
		HasReviewer_Ref : Possible_Reviewer?;
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

	type Conference_Paper : Paper;

	type Industrial_Session : Conference_Session;

	type Conference_Session : Session;

	type Regular_Session : Session;

	type Poster_Session : Session;

	type Demo_Session : Session;

	type Session : Scientific_Event;

	type Paper_Author : Person;

	type Conference_Trip : Social_Event;

	type Social_Event : Event;

	type Tutorial_Abstract : Abstract;

	type Conference_Participant : Person;

	type Submitted_Paper : Paper;

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

	type Invited_Talk : Individual_Presentation;

	type Contributed_Talk : Individual_Presentation {
		PresentationOfPaper_Ref : Document*;
	};

	type Demo_Chair : Conference_Participant;

	type Tutorial_Chair : Conference_Participant, PC_Member;

	type PC_Chair : Conference_Participant, PC_Member;

	type PC_Member : Possible_Reviewer;

	type OC_Member : Conference_Participant;

	type Proceedings : @[Multi-author_Volume];

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

	type Presenter : Author, Conference_Participant;

	type SC_Member : PC_Member;
}