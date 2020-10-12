( defstruct Thing )
( defstruct Meta-Reviewer )
( defstruct Decision )
( defstruct Preference )
( defstruct ProgramCommittee )
( defstruct Bid )
( defstruct ConferenceChair )
( defstruct ConferenceMember )
( defstruct AssociatedChair )
( defstruct ProgramCommitteeMember )
( defstruct AuthorNotReviewer )
( defstruct SubjectArea )
( defstruct ExternalReviewer :assignedByReviewer )
( defstruct Chairman )
( defstruct ProgramCommitteeChair )
( defstruct Acceptance )
( defstruct Rejection )
( defstruct Co-author )
( defstruct PaperAbstract :has_author :readByReviewer )
( defstruct PaperFullVersion :has_author :readByReviewer )
( defstruct Administrator )
( defstruct Meta-Review :gives_classification :is_created_in )
( defstruct Account )
( defstruct Inforamtion )
( defstruct User )
( defstruct Role )
( defstruct Help_Request )
( defstruct Person )
( defstruct Symposium )
( defstruct Document )
( defstruct Invited_Paper :has_author :readByReviewer )
( defstruct Admin_Role )
( defstruct Paper_Typologies )
( defstruct Event_Setup )
( defstruct Event_URL )
( defstruct Notification_Email )
( defstruct Email )
( defstruct Short_Paper :has_author :readByReviewer )
( defstruct Author_Role )
( defstruct Preview )
( defstruct Review_Form )
( defstruct Committe_Role )
( defstruct Group_Email )
( defstruct Submission_Template )
( defstruct Review_Form_Setup )
( defstruct Misc )
( defstruct Event_Creation )
( defstruct Approval_Email )
( defstruct Rejection_Email )
( defstruct Submission )
( defstruct Template )
( defstruct Feature_Request )
( defstruct Event_Tracks )
( defstruct Request )
( defstruct Activity )
( defstruct Head_Role )
( defstruct Detail )
( defstruct Corresponding_Author )
( defstruct Reviewer_Role )
( defstruct Event_Approval )
( defstruct Registration )
( defstruct Full_Paper :has_author :readByReviewer )
( defstruct Research_Topic )
( defstruct Description )
( defstruct Assistance )
( defstruct Email_Template )
( defstruct Conference_participant )
( defstruct Active_conference_participant )
( defstruct Passive_conference_participant )
( defstruct Review_expertise )
( defstruct Submitted_contribution )
( defstruct Regular_author )
( defstruct Conference_contributor )
( defstruct Contribution_1th-author )
( defstruct Contribution_co-author )
( defstruct Conference_contribution )
( defstruct Co-chair )
( defstruct Committee )
( defstruct Committee_member )
( defstruct Abstract :has_author :readByReviewer )
( defstruct Extended_abstract )
( defstruct Important_dates )
( defstruct Invited_speaker )
( defstruct Conference_proceedings )
( defstruct Information_for_participants )
( defstruct Conference_document )
( defstruct Regular_contribution )
( defstruct Poster )
( defstruct Written_contribution )
( defstruct Conference_applicant )
( defstruct Camera_ready_contribution )
( defstruct Accepted_contribution )
( defstruct Program_committee )
( defstruct Organizing_committee )
( defstruct Steering_committee )
( defstruct Conference_volume :hasCountry )
( defstruct Call_for_paper )
( defstruct Conference_announcement )
( defstruct Invited_talk )
( defstruct Conference_part )
( defstruct Presentation )
( defstruct Chair )
( defstruct Track )
( defstruct Rejected_contribution )
( defstruct Reviewed_contribution )
( defstruct Late_paid_applicant )
( defstruct Paid_applicant )
( defstruct Early_paid_applicant )
( defstruct Organizer )
( defstruct Call_for_participation )
( defstruct Publisher )
( defstruct Registeered_applicant )
( defstruct Track-workshop_chair )
( defstruct Conference_www )
( defstruct Conference_fees )
( defstruct Review_preference )
( defstruct Accepted_Paper :has_author :readByReviewer )
( defstruct Rejected_Paper :has_author :readByReviewer )
( defstruct Undecided_Paper :has_author :readByReviewer )
( defstruct Manual_Paper_Assignment :is_performed_by )
( defstruct Program_Committee_member )
( defstruct paper_assignment :is_performed_by )
( defstruct intensity )
( defstruct start_date_of_camera-ready_submission )
( defstruct camera-ready_submission_date )
( defstruct date_of_notification )
( defstruct date )
( defstruct article )
( defstruct Contact_Person )
( defstruct bidding_of_reviewer :is_performed_by )
( defstruct activity )
( defstruct URL )
( defstruct conference_setup )
( defstruct human )
( defstruct managing_of_conference_process )
( defstruct Program_Committee_Chair )
( defstruct reviewing_proces )
( defstruct end_date_of_camera-ready_submission )
( defstruct abstract_submission_date )
( defstruct group_email )
( defstruct Senior_Reviewer_URL )
( defstruct notification :has_result :is_performed_by )
( defstruct notification_email )
( defstruct Chair_URL )
( defstruct abstract_of_paper )
( defstruct submission_process :is_performed_by )
( defstruct lower_tier_reviewing_process )
( defstruct start_date_of_conference )
( defstruct date_of_conference )
( defstruct Senior_Program_Committee_member )
( defstruct end_date_of_abstract_submission )
( defstruct phase_of_conference )
( defstruct Regular_Program_Committee_member )
( defstruct start_date_of_full_paper_submission )
( defstruct full_paper_submission_date )
( defstruct start_date_of_abstract_submission )
( defstruct end_date_of_conference )
( defstruct review_form :is_created_in )
( defstruct Automatic_Paper_Assignment :is_performed_by )
( defstruct institute )
( defstruct classification )
( defstruct summary_of_reviews :is_created_in )
( defstruct upper_tier_reviewing_process :is_performed_by )
( defstruct end_date_of_full_paper_submission )
( defstruct acceptance_notification_email )
( defstruct rejection_notification_email )
( defstruct Contact_Person_URL )
( defstruct Regular_Reviewer_URL )
( defstruct Trip )
( defstruct Banquet )
( defstruct Reception )
( defstruct Social_event )
( defstruct Event )
( defstruct Contribution )
( defstruct City )
( defstruct Company )
( defstruct Scholar )
( defstruct Poster )
( defstruct Short_paper )
( defstruct Reviewing_results_event )
( defstruct Administrative_event )
( defstruct Reviewing_event )
( defstruct Registration_of_participants_event )
( defstruct Submission_event )
( defstruct Camera_Ready_event )
( defstruct Workshop )
( defstruct Tutorial )
( defstruct Working_event )
( defstruct Member )
( defstruct Participant )
( defstruct Member_PC )
( defstruct Chair_PC )
( defstruct Student )
( defstruct Science_Worker )
( defstruct Assistant )
( defstruct Volunteer )
( defstruct Regular )
( defstruct Author )
( defstruct pc_meeting )
( defstruct session )
( defstruct conference :hasCountry )
( defstruct chair )
( defstruct Review :gives_classification :is_created_in )
( defstruct participant )
( defstruct program )
( defstruct SlideSet )
( defstruct Programme )
( defstruct MealMenu )
( defstruct Topic )
( defstruct ConferenceEvent )
( defstruct Call )
( defstruct ReviewRating )
( defstruct Organization )
( defstruct ReviewForm )
( defstruct PersonalHistory )
( defstruct Sponsorship )
( defstruct ReviewQuestion )
( defstruct Country )
( defstruct ConferenceSession )
( defstruct ContactInformation )
( defstruct Place )
( defstruct WeekRejectRating )
( defstruct AcceptRating )
( defstruct AccpetIfRoomRating )
( defstruct RejectRating )
( defstruct MealEvent )
( defstruct NonAcademicEvent )
( defstruct BreakEvent )
( defstruct ParallelAndDistributedComputingTopic )
( defstruct WirelessCommunicationsTopic )
( defstruct OperatingTopicsystems )
( defstruct ComputerNetworksTopic )
( defstruct SatelliteAndSpaceCommunicationsTopic )
( defstruct CADTopic )
( defstruct MultimediaTopic )
( defstruct CommunicationsTopic )
( defstruct PowerlineTransmissionTopic )
( defstruct AntennasTopic )
( defstruct PerformanceTopic )
( defstruct SignalProcessingTopic )
( defstruct MicroelectronicsTopic )
( defstruct TestOnlyTopic )
( defstruct RadioCommunicationsTopic )
( defstruct ComputerArchitectureTopic )
( defstruct MedicineTopic )
( defstruct SecurityTopic )
( defstruct MobileComputingTopic )
( defstruct CryptographyTopic )
( defstruct CommunicationTheoryTopic )
( defstruct ConferenceChair )
( defstruct DiningPlace )
( defstruct AcademiaOrganization )
( defstruct IndustryOrganization )
( defstruct NGO )
( defstruct GovernmentOrganization )
( defstruct ComputerNetworksEnterpriseTopic )
( defstruct ComputerNetworksSwitchingTopic )
( defstruct ComputerNetworksSensorTopic )
( defstruct ComputerNetworksSecurityTopic )
( defstruct ComputerNetworksOpticalTopic )
( defstruct ComputerNetworksMeasurementsTopic )
( defstruct ComputerNetworksManagementTopic )
( defstruct ComputerNetworksAapplicationsTopic )
( defstruct ActivePaper :has_author :readByReviewer )
( defstruct PendingPaper :has_author :readByReviewer )
( defstruct WithdrawnPaper :has_author :readByReviewer )
( defstruct RejectedPaper :has_author :readByReviewer )
( defstruct AcceptedPaper :has_author :readByReviewer )
( defstruct PublishedPaper :has_author :readByReviewer )
( defstruct Attendee )
( defstruct CoffeeBreak )
( defstruct FreeTimeBreak )
( defstruct MealBreak )
( defstruct Reviewer )
( defstruct ClosingTalk )
( defstruct WelcomeTalk )
( defstruct TalkEvent )
( defstruct SessionChair )
( defstruct TPCMember )
( defstruct TwoLevelConference :hasCountry )
( defstruct CallForPapers )
( defstruct TextualReviewQuestion )
( defstruct NumericalReviewQuestion )
( defstruct OrganizationalMeeting )
( defstruct PaperPresentation )
( defstruct AcademicEvent )
( defstruct PersonalPublicationHistory )
( defstruct Excursion )
( defstruct SocialEvent )
( defstruct CallForReviews )
( defstruct PersonalReviewHistory )
( defstruct ConferenceVenuePlace )
( defstruct CallForManuscripts )
( defstruct Reception )
( defstruct SingleLevelConference :hasCountry )
( defstruct MeetingRoomPlace )
( defstruct AccommodationPlace )
( defstruct RatedPapers :has_author :readByReviewer )
( defstruct TravelGrant )
( defstruct ConferenceDinner )
( defstruct Accepted_Paper :hasReview :hasReviewer :has_author :readByReviewer )
( defstruct Rejected_Paper :hasReview :hasReviewer :has_author :readByReviewer )
( defstruct Evaluated_Paper :hasReview :hasReviewer :has_author :readByReviewer )
( defstruct Camera_Ready_Paper :has_author :readByReviewer )
( defstruct Positive_Review :gives_classification :is_created_in )
( defstruct Workshop_Paper :has_author :readByReviewer )
( defstruct Industrial_Paper :has_author :readByReviewer )
( defstruct Paper :has_author :readByReviewer )
( defstruct Conference_Paper :has_author :readByReviewer )
( defstruct Industrial_Session )
( defstruct Conference_Session )
( defstruct Regular_Session )
( defstruct Poster_Session )
( defstruct Demo_Session )
( defstruct Session )
( defstruct Paper_Author )
( defstruct Conference_Trip )
( defstruct Social_Event )
( defstruct Tutorial_Abstract :has_author :readByReviewer )
( defstruct Conference_Participant )
( defstruct Submitted_Paper :has_author :readByReviewer )
( defstruct Assigned_Paper :hasReviewer :has_author :readByReviewer )
( defstruct Negative_Review :gives_classification :is_created_in )
( defstruct Neutral_Review :gives_classification :is_created_in )
( defstruct Research_Topic )
( defstruct Organising_Agency )
( defstruct Academic_Institution )
( defstruct Organisation )
( defstruct Proceedings_Publisher )
( defstruct Poster_Paper :has_author :readByReviewer )
( defstruct Regular_Paper :has_author :readByReviewer )
( defstruct Demo_Paper :has_author :readByReviewer )
( defstruct Location )
( defstruct Research_Institute )
( defstruct Scientific_Event )
( defstruct Invited_Talk_Abstract :has_author :readByReviewer )
( defstruct Agency_Staff_Member )
( defstruct Workshop_Session )
( defstruct Invited_Talk )
( defstruct Contributed_Talk )
( defstruct Demo_Chair )
( defstruct Tutorial_Chair )
( defstruct PC_Chair )
( defstruct PC_Member )
( defstruct OC_Member )
( defstruct Proceedings )
( defstruct Programme_Brochure )
( defstruct Flyer )
( defstruct Web_Site )
( defstruct Multi-author_Volume )
( defstruct Individual_Presentation )
( defstruct OC_Chair )
( defstruct Conference_Banquet )
( defstruct Workshop_Chair )
( defstruct Conference_Proceedings )
( defstruct Session_Chair )
( defstruct Early-Registered_Participant )
( defstruct Late-Registered_Participant )
( defstruct University )
( defstruct Possible_Reviewer )
( defstruct Student )
( defstruct Invited_Speaker )
( defstruct Presenter )
( defstruct SC_Member )
