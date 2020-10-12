( defstruct Thing )
( defstruct Meta-Reviewer )
( defstruct Reviewer )
( defstruct Decision )
( defstruct Person )
( defstruct Preference )
( defstruct ProgramCommittee )
( defstruct Bid )
( defstruct Conference :hasCountry )
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
( defstruct PaperAbstract :readByReviewer :has_author )
( defstruct PaperFullVersion :readByReviewer :has_author )
( defstruct Meta-Review :gives_classification :is_created_in )
( defstruct Account )
( defstruct Inforamtion )
( defstruct User )
( defstruct Role )
( defstruct Help_Request )
( defstruct Symposium )
( defstruct Administrator )
( defstruct Invited_Paper :readByReviewer :has_author )
( defstruct Admin_Role )
( defstruct Paper_Typologies )
( defstruct Event_Setup )
( defstruct Event_URL )
( defstruct Notification_Email )
( defstruct Email )
( defstruct Short_Paper :readByReviewer :has_author )
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
( defstruct Head_Role )
( defstruct Detail )
( defstruct Corresponding_Author )
( defstruct Reviewer_Role )
( defstruct Event_Approval )
( defstruct Registration )
( defstruct Full_Paper :readByReviewer :has_author )
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
( defstruct Abstract :readByReviewer :has_author )
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
( defstruct Chair )
( defstruct Tutorial )
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
( defstruct Accepted_Paper :readByReviewer :has_author )
( defstruct Rejected_Paper :readByReviewer :has_author )
( defstruct Undecided_Paper :readByReviewer :has_author )
( defstruct Manual_Paper_Assignment :is_performed_by )
( defstruct Program_Committee_member )
( defstruct paper_assignment :is_performed_by )
( defstruct intensity )
( defstruct start_date_of_camera-ready_submission )
( defstruct camera-ready_submission_date )
( defstruct date_of_notification )
( defstruct date )
( defstruct Contact_Person )
( defstruct bidding_of_reviewer :is_performed_by )
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
( defstruct Contribution )
( defstruct Country )
( defstruct Company )
( defstruct University )
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
( defstruct pc_meeting )
( defstruct session )
( defstruct chair )
( defstruct article )
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
( defstruct ConferenceSession )
( defstruct ContactInformation )
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
( defstruct ActivePaper :readByReviewer :has_author )
( defstruct PendingPaper :readByReviewer :has_author )
( defstruct WithdrawnPaper :readByReviewer :has_author )
( defstruct RejectedPaper :readByReviewer :has_author )
( defstruct AcceptedPaper :readByReviewer :has_author )
( defstruct PublishedPaper :readByReviewer :has_author )
( defstruct Attendee )
( defstruct CoffeeBreak )
( defstruct FreeTimeBreak )
( defstruct MealBreak )
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
( defstruct RatedPapers :readByReviewer :has_author )
( defstruct TravelGrant )
( defstruct ConferenceDinner )
( defstruct Event )
( defstruct Accepted_Paper :hasReview :hasReviewer :readByReviewer :has_author )
( defstruct Rejected_Paper :hasReview :hasReviewer :readByReviewer :has_author )
( defstruct Evaluated_Paper :hasReview :hasReviewer :readByReviewer :has_author )
( defstruct Camera_Ready_Paper :readByReviewer :has_author )
( defstruct Positive_Review :gives_classification :is_created_in )
( defstruct Workshop_Paper :readByReviewer :has_author )
( defstruct Industrial_Paper :readByReviewer :has_author )
( defstruct Paper :readByReviewer :has_author )
( defstruct Conference_Paper :readByReviewer :has_author )
( defstruct Industrial_Session )
( defstruct Conference_Session )
( defstruct Regular_Session )
( defstruct Poster_Session )
( defstruct Demo_Session )
( defstruct Paper_Author )
( defstruct Conference_Trip )
( defstruct Social_Event )
( defstruct Tutorial_Abstract :readByReviewer :has_author )
( defstruct Conference_Participant )
( defstruct Submitted_Paper :readByReviewer :has_author )
( defstruct Assigned_Paper :hasReviewer :readByReviewer :has_author )
( defstruct Negative_Review :gives_classification :is_created_in )
( defstruct Neutral_Review :gives_classification :is_created_in )
( defstruct Research_Topic )
( defstruct Organising_Agency )
( defstruct Academic_Institution )
( defstruct Organisation )
( defstruct Proceedings_Publisher )
( defstruct Poster_Paper :readByReviewer :has_author )
( defstruct Regular_Paper :readByReviewer :has_author )
( defstruct Demo_Paper :readByReviewer :has_author )
( defstruct Location )
( defstruct Research_Institute )
( defstruct Scientific_Event )
( defstruct Invited_Talk_Abstract :readByReviewer :has_author )
( defstruct Agency_Staff_Member )
( defstruct Workshop_Session )
( defstruct Track )
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
( defstruct Possible_Reviewer )
( defstruct Student )
( defstruct Invited_Speaker )
( defstruct Presenter )
( defstruct SC_Member )
( defstruct Presenter_house )
( defstruct Building )
( defstruct Presenter_state )
( defstruct Delegate )
( defstruct Presenter_city )
( defstruct Hotel_registration_form )
( defstruct Deadline_hotel_reservation )
( defstruct Form )
( defstruct Car )
( defstruct Transport_vehicle )
( defstruct Mailing_list )
( defstruct Document )
( defstruct Renting )
( defstruct Activity_before_conference )
( defstruct Dinner_banquet )
( defstruct One_day_presenter )
( defstruct Social_program )
( defstruct Activity )
( defstruct PowerPoint_presentation )
( defstruct Presentation )
( defstruct Conference_restaurant )
( defstruct Conference_city )
( defstruct Conference_state )
( defstruct Submissions_deadline )
( defstruct Deadline )
( defstruct Simulating )
( defstruct Research )
( defstruct Technic_activity )
( defstruct Conference_activity )
( defstruct Technical_commitee )
( defstruct Place )
( defstruct Author_cd_proceedings_included )
( defstruct Author )
( defstruct Cd_proceening )
( defstruct Trip_day )
( defstruct Time )
( defstruct Record_of_attendance )
( defstruct Listener )
( defstruct Session_room )
( defstruct Brief_introduction_for_Session_chair )
( defstruct Session_chair )
( defstruct Invitation_letter )
( defstruct Registration_form )
( defstruct Viza )
( defstruct Registration )
( defstruct Conference_days )
( defstruct Conference_building )
( defstruct Registration_fee )
( defstruct Departure )
( defstruct Activity_after_conference )
( defstruct Conference_airport )
( defstruct Worker_lecturer )
( defstruct Lecturer )
( defstruct Transparency )
( defstruct Speaker )
( defstruct City )
( defstruct Card )
( defstruct Item )
( defstruct Author_attendee_book_registration_fee )
( defstruct Book_proceeding )
( defstruct Video_cassette_player )
( defstruct Audiovisual_equipment )
( defstruct Video_presentation )
( defstruct Hotel_room )
( defstruct Hotel_presenter )
( defstruct Conference_hotel )
( defstruct Money )
( defstruct State )
( defstruct Introduction )
( defstruct Welcome_address )
( defstruct Value_added_tax )
( defstruct Tax )
( defstruct Refusing_manuscript )
( defstruct Final_manuscript )
( defstruct Accepting_manuscript )
( defstruct Sponsor_city )
( defstruct Sponsor )
( defstruct Time_zone )
( defstruct Introduction_of_speaker )
( defstruct Conference_hall )
( defstruct Plenary_lecture )
( defstruct Lecture )
( defstruct Plenary_lecture_speaker )
( defstruct LCD_projector )
( defstruct Deadline_for_notification_of_acceptance )
( defstruct Tutorial_speaker )
( defstruct Session )
( defstruct Registation_deadline )
( defstruct Single_hotel_room )
( defstruct Non_speaker )
( defstruct Author_information_form )
( defstruct Nonmember_registration_fee )
( defstruct IASTED_non_member )
( defstruct Hotel_fee )
( defstruct Fee )
( defstruct Publication )
( defstruct Taxi )
( defstruct Sponsor_state )
( defstruct Review :gives_classification :is_created_in )
( defstruct Modelling )
( defstruct Worker_non_speaker )
( defstruct Nonauthor_registration_fee )
( defstruct Payment_document )
( defstruct Camera_ready_manuscript_deadline )
( defstruct One_conference_day )
( defstruct Fee_for_extra_trip )
( defstruct Full_day_tour )
( defstruct Conference_Hiker )
( defstruct Computer )
( defstruct IASTED_member )
( defstruct Memeber_registration_fee )
( defstruct Author_book_proceedings_included )
( defstruct Sponsor_company_house )
( defstruct Sponzorship )
( defstruct Student_lecturer )
( defstruct Trip_city )
( defstruct Cheque )
( defstruct Shuttle_bus )
( defstruct Student_non_speaker )
( defstruct Student_registration_fee )
( defstruct Author_attendee_cd_registration_fee )
( defstruct Tip )
( defstruct Credit_card )
( defstruct Van )
( defstruct Main_office )
( defstruct Presenter_university )
( defstruct Departure_tax )
( defstruct Receiving_manuscript )
( defstruct Double_hotel_room )
( defstruct Initial_manuscipt )
( defstruct Coffee_break )
( defstruct Bank_transfer )
( defstruct Overhead_projector )
( defstruct Speaker_lecture )
( defstruct Coctail_reception )
( defstruct Currency )