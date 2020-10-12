Namespace edas

	#Region " Interface Thing "
		Interface Thing
			
		End Interface
	#End Region

	#Region " Interface [Meta-Reviewer] "
		Interface [Meta-Reviewer] : Inherits Reviewer
			
		End Interface
	#End Region

	#Region " Interface Reviewer "
		Interface Reviewer : Inherits ConferenceMember, User, Person
			Property [invites_co-reviewers] As [[Reviewer]]

			Property invited_by As [[Reviewer]]

			Property has_a_review_reference_or_expertise As List(Of [[Thing]]

			''' <summary>
			''' writes_review oppositeOf review_written_by
			''' </summary>
			Property writes_review As [[Review]]

			''' <summary>
			''' hasReviewHistory oppositeOf isReviewHistoryOf
			''' </summary>
			Property hasReviewHistory As [[PersonalReviewHistory]]

			Property assignedByAdministrator As [[Administrator]]

			''' <summary>
			''' adjustBid oppositeOf adjustedBy
			''' </summary>
			Property adjustBid As [[Bid]]

			Property readPaper As [[Paper]]

			Property hasBeenAssigned As [[Paper]]

			Property writeReview As [[Review]]

			''' <summary>
			''' assignExternalReviewer oppositeOf assignedByReviewer
			''' </summary>
			Property assignExternalReviewer As [[ExternalReviewer]]
		End Interface
	#End Region

	#Region " Interface Decision "
		Interface Decision
			
		End Interface
	#End Region

	#Region " Interface Preference "
		Interface Preference
			
		End Interface
	#End Region

	#Region " Interface ProgramCommittee "
		Interface ProgramCommittee
			''' <summary>
			''' hasProgramCommitteeMember oppositeOf memberOfProgramCommittee
			''' </summary>
			Property hasProgramCommitteeMember As [[ProgramCommitteeMember]]
		End Interface
	#End Region

	#Region " Interface Bid "
		Interface Bid
			Property adjustedBy As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface ConferenceChair "
		Interface ConferenceChair : Inherits ConferenceMember, Chairman
			
		End Interface
	#End Region

	#Region " Interface ConferenceMember "
		Interface ConferenceMember : Inherits Person
			Property memberOfConference As [[Conference]]
		End Interface
	#End Region

	#Region " Interface AssociatedChair "
		Interface AssociatedChair : Inherits ConferenceMember, Chairman
			
		End Interface
	#End Region

	#Region " Interface ProgramCommitteeMember "
		Interface ProgramCommitteeMember : Inherits Person, ConferenceMember
			''' <summary>
			''' memberOfProgramCommittee oppositeOf hasProgramCommitteeMember
			''' </summary>
			Property memberOfProgramCommittee As [[ProgramCommittee]]

			Property maxPapers As [Integer]

			Property addedBy As [[Administrator]]
		End Interface
	#End Region

	#Region " Interface AuthorNotReviewer "
		Interface AuthorNotReviewer : Inherits Author
			
		End Interface
	#End Region

	#Region " Interface SubjectArea "
		Interface SubjectArea
			
		End Interface
	#End Region

	#Region " Interface ExternalReviewer "
		Interface ExternalReviewer : Inherits Person
			Property assignedByReviewer As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface Chairman "
		Interface Chairman : Inherits Person, ConferenceMember
			
		End Interface
	#End Region

	#Region " Interface ProgramCommitteeChair "
		Interface ProgramCommitteeChair : Inherits ProgramCommitteeMember, Chairman
			Property endReview As [[Review]]
		End Interface
	#End Region

	#Region " Interface Acceptance "
		Interface Acceptance : Inherits Decision
			
		End Interface
	#End Region

	#Region " Interface Rejection "
		Interface Rejection : Inherits Decision
			
		End Interface
	#End Region

	#Region " Interface Paper "
		Interface Paper : Inherits Document, article, Regular_contribution, Contribution
			''' <summary>
			''' isWrittenBy oppositeOf hasRelatedPaper
			''' </summary>
			Property isWrittenBy As [[Author]]

			Property isReviewedBy As List(Of [[Person]]

			Property full_paper_size As [Integer]

			Property has_author As [[human]]

			''' <summary>
			''' hasCo-author oppositeOf co-writePaper
			''' </summary>
			Property [hasCo-author] As [[Co-author]]

			Property hasBid As [[Bid]]

			Property hasDecision As [[Decision]]

			Property assignedTo As [[Reviewer]]

			Property hasSubjectArea As [[SubjectArea]]

			Property readByReviewer As [[Reviewer]]

			Property paperID As unsignedLong

			Property title As [String]

			Property hasAuthor As [[Author]]

			Property acceptedBy As [[Administrator]]

			Property rejectedBy As [[Administrator]]

			Property [readByMeta-Reviewer] As [[Meta-Reviewer]]
		End Interface
	#End Region

	#Region " Interface [Co-author] "
		Interface [Co-author] : Inherits Author
			Property [co-writePaper] As [[Paper]]
		End Interface
	#End Region

	#Region " Interface PaperAbstract "
		Interface PaperAbstract : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface PaperFullVersion "
		Interface PaperFullVersion : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Administrator "
		Interface Administrator : Inherits User, Person
			Property approve As [[Event]]

			''' <summary>
			''' assign oppositeOf assigned_by
			''' </summary>
			Property assign As [[Role]]

			Property finalizePaperAssignment As [[Conference]]

			Property runPaperAssignmentTools As [[Conference]]

			Property enableVirtualMeeting As [[Conference]]

			Property startReviewerBidding As [[Conference]]

			Property assignReviewer As [[Reviewer]]

			Property rejectPaper As [[Paper]]

			Property enterConferenceDetails As [[Conference]]

			Property printHardcopyMailingManifests As [[Conference]]

			Property setMaxPapers As [[ProgramCommitteeMember]]

			Property enterReviewCriteria As [[Conference]]

			Property acceptPaper As [[Paper]]

			''' <summary>
			''' addProgramCommitteeMember oppositeOf addedBy
			''' </summary>
			Property addProgramCommitteeMember As [[ProgramCommitteeMember]]
		End Interface
	#End Region

	#Region " Interface [Meta-Review] "
		Interface [Meta-Review] : Inherits Review
			
		End Interface
	#End Region

	#Region " Interface [Event] "
		Interface [Event] : Inherits Thing
			Property conists_of As [[Event_Tracks]]

			''' <summary>
			''' confirmed_by oppositeOf confirm
			''' </summary>
			Property confirmed_by As [[Approval_Email]]

			''' <summary>
			''' defined_by oppositeOf define
			''' </summary>
			Property defined_by As [[Event_Setup]]

			''' <summary>
			''' approved_by oppositeOf approve
			''' </summary>
			Property approved_by As [[Administrator]]

			Property starts_on As [String]

			Property ends_on As [String]

			Property has_startdate As dateTime

			Property has_enddate As dateTime
		End Interface
	#End Region

	#Region " Interface Account "
		Interface Account
			''' <summary>
			''' registred_by oppositeOf register
			''' </summary>
			Property registred_by As [[Person]]
		End Interface
	#End Region

	#Region " Interface Inforamtion "
		Interface Inforamtion
			
		End Interface
	#End Region

	#Region " Interface User "
		Interface User : Inherits Person
			''' <summary>
			''' recieve oppositeOf recieved_by
			''' </summary>
			Property recieve As [[Document]]

			Property create As List(Of [[Thing]]

			''' <summary>
			''' submit oppositeOf submited__by
			''' </summary>
			Property submit As [[Document]]
		End Interface
	#End Region

	#Region " Interface Role "
		Interface Role : Inherits Thing
			''' <summary>
			''' assigned_by oppositeOf assign
			''' </summary>
			Property assigned_by As [[Administrator]]
		End Interface
	#End Region

	#Region " Interface Help_Request "
		Interface Help_Request : Inherits Request
			
		End Interface
	#End Region

	#Region " Interface Person "
		Interface Person : Inherits Thing
			Property hasConflictOfInterest As [[Document]]

			Property email As [String]

			Property inverse_of_add As List(Of [[Thing]]

			Property execute As List(Of [[Thing]]

			Property [get] As [[Inforamtion]]

			''' <summary>
			''' use oppositeOf used_by
			''' </summary>
			Property use As [[Document]]

			''' <summary>
			''' register oppositeOf registred_by
			''' </summary>
			Property register As [[Account]]

			Property modify As List(Of [[Thing]]

			Property take_part_in As [[Event]]

			Property remove As List(Of [[Thing]]

			Property add As [[Person]]

			''' <summary>
			''' send oppositeOf sent_by
			''' </summary>
			Property send As [[Activity]]

			Property added_by As [[Person]]

			''' <summary>
			''' attendeeAt oppositeOf hasAttendee
			''' </summary>
			Property attendeeAt As [[ConferenceEvent]]

			''' <summary>
			''' isMemberOf oppositeOf hasMember
			''' </summary>
			Property isMemberOf As [[Conference]]

			Property hasFirstName As [String]

			Property hasBiography As [String]

			Property hasLastName As [String]

			Property employedBy As [[Organization]]

			Property hasHomePage As [String]

			Property hasSurname As [String]

			Property hasFax As [String]

			Property hasFirstName As [String]

			Property hasPhone As [String]

			Property hasEmail As [String]

			''' <summary>
			''' contributes oppositeOf has_authors
			''' </summary>
			Property contributes As [[Conference_document]]

			Property has_an_email As [String]

			Property has_the_first_name As [String]

			Property has_gender As [[EEnum]]

			Property has_the_last_name As [String]
		End Interface
	#End Region

	#Region " Interface Symposium "
		Interface Symposium : Inherits [Event]
			
		End Interface
	#End Region

	#Region " Interface Abstract "
		Interface Abstract : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Document "
		Interface Document : Inherits Thing
			Property relatesTo As List(Of [[Thing]]

			''' <summary>
			''' recieved_by oppositeOf recieve
			''' </summary>
			Property recieved_by As [[User]]

			''' <summary>
			''' used_by oppositeOf use
			''' </summary>
			Property used_by As [[Person]]

			''' <summary>
			''' submited__by oppositeOf submit
			''' </summary>
			Property submited__by As [[User]]
		End Interface
	#End Region

	#Region " Interface Invited_Paper "
		Interface Invited_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Admin_Role "
		Interface Admin_Role : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface Paper_Typologies "
		Interface Paper_Typologies : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Event_Setup "
		Interface Event_Setup
			Property define As [[Event]]
		End Interface
	#End Region

	#Region " Interface Event_URL "
		Interface Event_URL : Inherits URL
			Property concerned As [[Event]]
		End Interface
	#End Region

	#Region " Interface Notification_Email "
		Interface Notification_Email : Inherits Email
			
		End Interface
	#End Region

	#Region " Interface Email "
		Interface Email : Inherits Document
			
		End Interface
	#End Region

	#Region " Interface Short_Paper "
		Interface Short_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Author_Role "
		Interface Author_Role : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface Preview "
		Interface Preview : Inherits Review_Form
			
		End Interface
	#End Region

	#Region " Interface Review_Form "
		Interface Review_Form : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Committe_Role "
		Interface Committe_Role : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface Group_Email "
		Interface Group_Email : Inherits Email
			
		End Interface
	#End Region

	#Region " Interface Submission_Template "
		Interface Submission_Template : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Review_Form_Setup "
		Interface Review_Form_Setup : Inherits Review_Form
			
		End Interface
	#End Region

	#Region " Interface Misc "
		Interface Misc : Inherits Help_Request
			
		End Interface
	#End Region

	#Region " Interface Event_Creation "
		Interface Event_Creation : Inherits Activity
			
		End Interface
	#End Region

	#Region " Interface Approval_Email "
		Interface Approval_Email : Inherits Email
			Property confirm As [[Event]]
		End Interface
	#End Region

	#Region " Interface Rejection_Email "
		Interface Rejection_Email : Inherits Email
			
		End Interface
	#End Region

	#Region " Interface Submission "
		Interface Submission : Inherits Document
			
		End Interface
	#End Region

	#Region " Interface Template "
		Interface Template : Inherits Document
			
		End Interface
	#End Region

	#Region " Interface Feature_Request "
		Interface Feature_Request : Inherits Help_Request
			
		End Interface
	#End Region

	#Region " Interface Event_Tracks "
		Interface Event_Tracks : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Request "
		Interface Request : Inherits Activity
			
		End Interface
	#End Region

	#Region " Interface Activity "
		Interface Activity
			Property has_result As List(Of [[Thing]]

			''' <summary>
			''' sent_by oppositeOf send
			''' </summary>
			Property sent_by As [[Person]]
		End Interface
	#End Region

	#Region " Interface Head_Role "
		Interface Head_Role : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface Detail "
		Interface Detail : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Corresponding_Author "
		Interface Corresponding_Author : Inherits Author
			
		End Interface
	#End Region

	#Region " Interface Reviewer_Role "
		Interface Reviewer_Role : Inherits Role
			
		End Interface
	#End Region

	#Region " Interface Event_Approval "
		Interface Event_Approval : Inherits Activity
			
		End Interface
	#End Region

	#Region " Interface Registration "
		Interface Registration : Inherits Activity
			
		End Interface
	#End Region

	#Region " Interface Full_Paper "
		Interface Full_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Research_Topic "
		Interface Research_Topic : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Description "
		Interface Description
			
		End Interface
	#End Region

	#Region " Interface Conference "
		Interface Conference : Inherits [Event], Thing, Working_event
			Property is_in_phase As [[phase_of_conference]]

			Property has_program As [[program]]

			''' <summary>
			''' hasMember oppositeOf isMemberOf
			''' </summary>
			Property hasMember As [[Person]]

			Property hasName As [String]

			Property endDate As dateTime

			Property paperDueOn As dateTime

			Property registrationDueOn As dateTime

			Property manuscriptDueOn As dateTime

			Property startDate As dateTime

			Property hasCountry As [[Country]]

			''' <summary>
			''' hasConferenceMember oppositeOf memberOfConference
			''' </summary>
			Property hasConferenceMember As [[ConferenceMember]]

			Property paperAssignmentFinalizedBy As [[Administrator]]

			Property reviewCriteriaEnteredBy As [[Administrator]]

			Property paperAssignmentToolsRunBy As [[Administrator]]

			Property virtualMeetingEnabledBy As [[Administrator]]

			Property hardcopyMailingManifestsPrintedBy As [[Administrator]]

			Property detailsEnteredBy As [[Administrator]]

			Property reviewerBiddingStartedBy As [[Administrator]]

			Property [date] As [[date]]

			Property reviewsPerPaper As [Integer]

			Property logoURL As anyURI

			Property acceptsHardcopySubmissions As [Boolean]

			Property siteURL As anyURI
		End Interface
	#End Region

	#Region " Interface Assistance "
		Interface Assistance : Inherits Help_Request
			
		End Interface
	#End Region

	#Region " Interface Email_Template "
		Interface Email_Template : Inherits Event_Setup
			
		End Interface
	#End Region

	#Region " Interface Conference_participant "
		Interface Conference_participant : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Active_conference_participant "
		Interface Active_conference_participant : Inherits Conference_contributor, Conference_participant
			''' <summary>
			''' gives_presentations oppositeOf is_given_by
			''' </summary>
			Property gives_presentations As [[Presentation]]
		End Interface
	#End Region

	#Region " Interface Passive_conference_participant "
		Interface Passive_conference_participant : Inherits Conference_participant
			
		End Interface
	#End Region

	#Region " Interface Review_expertise "
		Interface Review_expertise : Inherits Thing
			''' <summary>
			''' has_a_submitted_contribution oppositeOf has_a_review_expertise
			''' </summary>
			Property has_a_submitted_contribution As [[Submitted_contribution]]

			Property has_an_expertise As [[EEnum]]
		End Interface
	#End Region

	#Region " Interface Submitted_contribution "
		Interface Submitted_contribution : Inherits Written_contribution
			''' <summary>
			''' has_a_review_expertise oppositeOf has_a_submitted_contribution
			''' </summary>
			Property has_a_review_expertise As [[Review_expertise]]
		End Interface
	#End Region

	#Region " Interface Regular_author "
		Interface Regular_author : Inherits Conference_contributor
			
		End Interface
	#End Region

	#Region " Interface Conference_contributor "
		Interface Conference_contributor : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface [Contribution_1th-author] "
		Interface [Contribution_1th-author] : Inherits Regular_author
			
		End Interface
	#End Region

	#Region " Interface [Contribution_co-author] "
		Interface [Contribution_co-author] : Inherits Regular_author
			
		End Interface
	#End Region

	#Region " Interface Conference_contribution "
		Interface Conference_contribution : Inherits Conference_document
			''' <summary>
			''' is_submitted_at oppositeOf has_contributions
			''' </summary>
			Property is_submitted_at As [[Conference_volume]]
		End Interface
	#End Region

	#Region " Interface [Co-chair] "
		Interface [Co-chair] : Inherits Committee_member
			''' <summary>
			''' was_a_committe_co-chair_of oppositeOf has_a_committee_co-chair
			''' </summary>
			Property [was_a_committe_co-chair_of] As [[Committee]]
		End Interface
	#End Region

	#Region " Interface Committee "
		Interface Committee : Inherits User
			''' <summary>
			''' has_members oppositeOf was_a_member_of
			''' </summary>
			Property has_members As [[Committee_member]]

			''' <summary>
			''' was_a_committee_of oppositeOf has_a_commtitee
			''' </summary>
			Property was_a_committee_of As [[Conference_volume]]

			''' <summary>
			''' has_a_committee_co-chair oppositeOf was_a_committe_co-chair_of
			''' </summary>
			Property [has_a_committee_co-chair] As [[Co-chair]]

			''' <summary>
			''' has_a_committee_chair oppositeOf was_a_committee_chair_of
			''' </summary>
			Property has_a_committee_chair As [[Chair]]
		End Interface
	#End Region

	#Region " Interface Committee_member "
		Interface Committee_member : Inherits Person
			''' <summary>
			''' was_a_member_of oppositeOf has_members
			''' </summary>
			Property was_a_member_of As [[Committee]]
		End Interface
	#End Region

	#Region " Interface Abstract "
		Interface Abstract : Inherits Extended_abstract
			Property is_the_1th_part_of As List(Of [[Thing]]
		End Interface
	#End Region

	#Region " Interface Extended_abstract "
		Interface Extended_abstract : Inherits Regular_contribution
			
		End Interface
	#End Region

	#Region " Interface Important_dates "
		Interface Important_dates
			Property is_an_abstract_submission_date As [[date]]

			Property is_a_full_paper_submission_date As [[date]]

			Property is_an_ending_date As [[date]]

			Property is_a_date_of_acceptance_announcement As [[date]]

			Property is_a_date_of_camera_ready_paper_submission As [[date]]

			Property is_a_starting_date As [[date]]

			''' <summary>
			''' belong_to_a_conference_volume oppositeOf has_important_dates
			''' </summary>
			Property belong_to_a_conference_volume As [[Conference_volume]]
		End Interface
	#End Region

	#Region " Interface Invited_speaker "
		Interface Invited_speaker : Inherits Conference_contributor
			
		End Interface
	#End Region

	#Region " Interface Conference_proceedings "
		Interface Conference_proceedings
			Property has_an_ISBN As [String]

			''' <summary>
			''' has_a_publisher oppositeOf issues
			''' </summary>
			Property has_a_publisher As [[Publisher]]

			Property has_a_volume As [String]
		End Interface
	#End Region

	#Region " Interface Information_for_participants "
		Interface Information_for_participants : Inherits Conference_document
			
		End Interface
	#End Region

	#Region " Interface Conference_document "
		Interface Conference_document
			''' <summary>
			''' has_authors oppositeOf contributes
			''' </summary>
			Property has_authors As [[Person]]

			Property has_a_date_of_issue As [[date]]
		End Interface
	#End Region

	#Region " Interface Regular_contribution "
		Interface Regular_contribution : Inherits Written_contribution
			
		End Interface
	#End Region

	#Region " Interface Poster "
		Interface Poster : Inherits Conference_contribution
			
		End Interface
	#End Region

	#Region " Interface Written_contribution "
		Interface Written_contribution : Inherits Conference_contribution
			
		End Interface
	#End Region

	#Region " Interface Conference_applicant "
		Interface Conference_applicant : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Camera_ready_contribution "
		Interface Camera_ready_contribution : Inherits Accepted_contribution
			
		End Interface
	#End Region

	#Region " Interface Accepted_contribution "
		Interface Accepted_contribution : Inherits Reviewed_contribution
			
		End Interface
	#End Region

	#Region " Interface Program_committee "
		Interface Program_committee : Inherits Committee
			''' <summary>
			''' was_a_program_committee_of oppositeOf has_a_program_committee
			''' </summary>
			Property was_a_program_committee_of As [[Conference_volume]]
		End Interface
	#End Region

	#Region " Interface Organizing_committee "
		Interface Organizing_committee : Inherits Committee
			''' <summary>
			''' was_an_organizing_committee_of oppositeOf has_an_organizing_committee
			''' </summary>
			Property was_an_organizing_committee_of As [[Conference_volume]]
		End Interface
	#End Region

	#Region " Interface Steering_committee "
		Interface Steering_committee : Inherits Committee
			''' <summary>
			''' was_a_steering_committee_of oppositeOf has_a_steering_committee
			''' </summary>
			Property was_a_steering_committee_of As [[Conference_volume]]
		End Interface
	#End Region

	#Region " Interface Conference_volume "
		Interface Conference_volume : Inherits Conference
			''' <summary>
			''' has_parts oppositeOf is_part_of_conference_volumes
			''' </summary>
			Property has_parts As [[Conference_part]]

			Property has_workshops As [[Workshop]]

			Property has_tracks As [[Track]]

			Property has_tutorials As [[Tutorial]]

			''' <summary>
			''' has_a_commtitee oppositeOf was_a_committee_of
			''' </summary>
			Property has_a_commtitee As [[Committee]]

			''' <summary>
			''' has_a_steering_committee oppositeOf was_a_steering_committee_of
			''' </summary>
			Property has_a_steering_committee As [[Steering_committee]]

			''' <summary>
			''' has_an_organizing_committee oppositeOf was_an_organizing_committee_of
			''' </summary>
			Property has_an_organizing_committee As [[Organizing_committee]]

			''' <summary>
			''' has_important_dates oppositeOf belong_to_a_conference_volume
			''' </summary>
			Property has_important_dates As [[Important_dates]]

			''' <summary>
			''' has_contributions oppositeOf is_submitted_at
			''' </summary>
			Property has_contributions As [[Conference_contribution]]

			Property has_a_location As [String]

			''' <summary>
			''' has_a_program_committee oppositeOf was_a_program_committee_of
			''' </summary>
			Property has_a_program_committee As [[Program_committee]]
		End Interface
	#End Region

	#Region " Interface Call_for_paper "
		Interface Call_for_paper : Inherits Conference_document
			
		End Interface
	#End Region

	#Region " Interface Conference_announcement "
		Interface Conference_announcement : Inherits Conference_document
			
		End Interface
	#End Region

	#Region " Interface Invited_talk "
		Interface Invited_talk : Inherits Presentation
			
		End Interface
	#End Region

	#Region " Interface Conference_part "
		Interface Conference_part
			Property [has_a_track-workshop-tutorial_topic] As [[Topic]]

			''' <summary>
			''' is_part_of_conference_volumes oppositeOf has_parts
			''' </summary>
			Property is_part_of_conference_volumes As [[Conference_volume]]

			''' <summary>
			''' has_a_track-workshop-tutorial_chair oppositeOf was_a_track-workshop_chair_of
			''' </summary>
			Property [has_a_track-workshop-tutorial_chair] As [[Track-workshop_chair]]
		End Interface
	#End Region

	#Region " Interface Presentation "
		Interface Presentation : Inherits Conference_contribution
			''' <summary>
			''' is_given_by oppositeOf gives_presentations
			''' </summary>
			Property is_given_by As [[Active_conference_participant]]
		End Interface
	#End Region

	#Region " Interface Chair "
		Interface Chair : Inherits Committee_member
			''' <summary>
			''' was_a_committee_chair_of oppositeOf has_a_committee_chair
			''' </summary>
			Property was_a_committee_chair_of As [[Committee]]
		End Interface
	#End Region

	#Region " Interface Track "
		Interface Track : Inherits Conference_part
			
		End Interface
	#End Region

	#Region " Interface Rejected_contribution "
		Interface Rejected_contribution : Inherits Reviewed_contribution
			
		End Interface
	#End Region

	#Region " Interface Reviewed_contribution "
		Interface Reviewed_contribution : Inherits Submitted_contribution
			''' <summary>
			''' has_a_review oppositeOf reviews
			''' </summary>
			Property has_a_review As [[Review]]
		End Interface
	#End Region

	#Region " Interface Late_paid_applicant "
		Interface Late_paid_applicant : Inherits Paid_applicant
			
		End Interface
	#End Region

	#Region " Interface Paid_applicant "
		Interface Paid_applicant : Inherits Registeered_applicant
			
		End Interface
	#End Region

	#Region " Interface Early_paid_applicant "
		Interface Early_paid_applicant : Inherits Paid_applicant
			
		End Interface
	#End Region

	#Region " Interface Organizer "
		Interface Organizer : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Call_for_participation "
		Interface Call_for_participation : Inherits Conference_document
			
		End Interface
	#End Region

	#Region " Interface Publisher "
		Interface Publisher
			''' <summary>
			''' issues oppositeOf has_a_publisher
			''' </summary>
			Property issues As [[Conference_proceedings]]
		End Interface
	#End Region

	#Region " Interface Registeered_applicant "
		Interface Registeered_applicant : Inherits Conference_applicant
			
		End Interface
	#End Region

	#Region " Interface [Track-workshop_chair] "
		Interface [Track-workshop_chair] : Inherits Person
			''' <summary>
			''' was_a_track-workshop_chair_of oppositeOf has_a_track-workshop-tutorial_chair
			''' </summary>
			Property [was_a_track-workshop_chair_of] As [[Conference_part]]
		End Interface
	#End Region

	#Region " Interface Conference_www "
		Interface Conference_www : Inherits Conference_document
			Property has_a_URL As [String]
		End Interface
	#End Region

	#Region " Interface Conference_fees "
		Interface Conference_fees
			
		End Interface
	#End Region

	#Region " Interface Review_preference "
		Interface Review_preference : Inherits Thing
			Property has_a_topic_or_a_submission_contribution As List(Of [[Thing]]

			Property has_a_degree As [Integer]
		End Interface
	#End Region

	#Region " Interface Accepted_Paper "
		Interface Accepted_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Rejected_Paper "
		Interface Rejected_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Undecided_Paper "
		Interface Undecided_Paper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Manual_Paper_Assignment "
		Interface Manual_Paper_Assignment : Inherits paper_assignment
			Property manually_assign_paper As List(Of [[Program_Committee_member]]
		End Interface
	#End Region

	#Region " Interface Program_Committee_member "
		Interface Program_Committee_member : Inherits human
			
		End Interface
	#End Region

	#Region " Interface paper_assignment "
		Interface paper_assignment : Inherits activity
			Property assign_paper As [[Program_Committee_member]]

			Property is_performed_by As [[human]]
		End Interface
	#End Region

	#Region " Interface intensity "
		Interface intensity
			
		End Interface
	#End Region

	#Region " Interface [start_date_of_camera-ready_submission] "
		Interface [start_date_of_camera-ready_submission] : Inherits [camera-ready_submission_date]
			
		End Interface
	#End Region

	#Region " Interface [camera-ready_submission_date] "
		Interface [camera-ready_submission_date] : Inherits [date]
			
		End Interface
	#End Region

	#Region " Interface date_of_notification "
		Interface date_of_notification : Inherits [date]
			
		End Interface
	#End Region

	#Region " Interface [date] "
		Interface [date] : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface Contact_Person "
		Interface Contact_Person : Inherits human
			
		End Interface
	#End Region

	#Region " Interface bidding_of_reviewer "
		Interface bidding_of_reviewer : Inherits activity
			Property is_performed_by As [[human]]
		End Interface
	#End Region

	#Region " Interface activity "
		Interface activity
			Property is_followed_by As [[activity]]

			Property is_monitored_by As [[human]]

			Property has_intensity As [[intensity]]

			Property has_result As [[article]]

			''' <summary>
			''' is_performed_by oppositeOf performs_activity
			''' </summary>
			Property is_performed_by As [[human]]

			''' <summary>
			''' is_supervised_by oppositeOf supervises
			''' </summary>
			Property is_supervised_by As [[human]]
		End Interface
	#End Region

	#Region " Interface URL "
		Interface URL : Inherits Thing
			
		End Interface
	#End Region

	#Region " Interface conference_setup "
		Interface conference_setup : Inherits Thing
			Property sets_member As [[human]]

			Property is_made_by As [[human]]

			Property includes_topic As [[topic]]

			Property sets_date As [[date]]

			Property sets_URL As [[URL]]
		End Interface
	#End Region

	#Region " Interface human "
		Interface human
			''' <summary>
			''' is_author_of oppositeOf has_author
			''' </summary>
			Property is_author_of As [[article]]

			''' <summary>
			''' performs_activity oppositeOf is_performed_by
			''' </summary>
			Property performs_activity As [[activity]]

			Property is_employed_in As [[institute]]

			Property has_topic_of_interest As [[topic]]

			''' <summary>
			''' supervises oppositeOf is_supervised_by
			''' </summary>
			Property supervises As [[activity]]

			Property [e-mail] As [String]

			Property last_name As [String]

			Property first_name As [String]
		End Interface
	#End Region

	#Region " Interface managing_of_conference_process "
		Interface managing_of_conference_process : Inherits activity
			
		End Interface
	#End Region

	#Region " Interface Program_Committee_Chair "
		Interface Program_Committee_Chair : Inherits human
			
		End Interface
	#End Region

	#Region " Interface reviewing_proces "
		Interface reviewing_proces : Inherits activity
			
		End Interface
	#End Region

	#Region " Interface [end_date_of_camera-ready_submission] "
		Interface [end_date_of_camera-ready_submission] : Inherits [camera-ready_submission_date]
			
		End Interface
	#End Region

	#Region " Interface abstract_submission_date "
		Interface abstract_submission_date : Inherits [date]
			
		End Interface
	#End Region

	#Region " Interface group_email "
		Interface group_email : Inherits article
			
		End Interface
	#End Region

	#Region " Interface Senior_Reviewer_URL "
		Interface Senior_Reviewer_URL : Inherits URL
			
		End Interface
	#End Region

	#Region " Interface notification "
		Interface notification : Inherits activity
			Property has_result As [[article]]

			Property is_performed_by As [[human]]
		End Interface
	#End Region

	#Region " Interface notification_email "
		Interface notification_email : Inherits article
			
		End Interface
	#End Region

	#Region " Interface Chair_URL "
		Interface Chair_URL : Inherits URL
			
		End Interface
	#End Region

	#Region " Interface abstract_of_paper "
		Interface abstract_of_paper : Inherits article
			
		End Interface
	#End Region

	#Region " Interface submission_process "
		Interface submission_process : Inherits activity
			Property is_performed_by As [[human]]
		End Interface
	#End Region

	#Region " Interface topic "
		Interface topic
			
		End Interface
	#End Region

	#Region " Interface lower_tier_reviewing_process "
		Interface lower_tier_reviewing_process : Inherits reviewing_proces
			
		End Interface
	#End Region

	#Region " Interface start_date_of_conference "
		Interface start_date_of_conference : Inherits date_of_conference
			
		End Interface
	#End Region

	#Region " Interface date_of_conference "
		Interface date_of_conference : Inherits [date]
			
		End Interface
	#End Region

	#Region " Interface Senior_Program_Committee_member "
		Interface Senior_Program_Committee_member : Inherits Program_Committee_member
			Property supervises As List(Of [[activity]]
		End Interface
	#End Region

	#Region " Interface end_date_of_abstract_submission "
		Interface end_date_of_abstract_submission : Inherits abstract_submission_date
			
		End Interface
	#End Region

	#Region " Interface phase_of_conference "
		Interface phase_of_conference
			
		End Interface
	#End Region

	#Region " Interface Regular_Program_Committee_member "
		Interface Regular_Program_Committee_member : Inherits Program_Committee_member
			
		End Interface
	#End Region

	#Region " Interface start_date_of_full_paper_submission "
		Interface start_date_of_full_paper_submission : Inherits full_paper_submission_date
			
		End Interface
	#End Region

	#Region " Interface full_paper_submission_date "
		Interface full_paper_submission_date : Inherits [date]
			
		End Interface
	#End Region

	#Region " Interface start_date_of_abstract_submission "
		Interface start_date_of_abstract_submission : Inherits abstract_submission_date
			
		End Interface
	#End Region

	#Region " Interface end_date_of_conference "
		Interface end_date_of_conference : Inherits date_of_conference
			
		End Interface
	#End Region

	#Region " Interface review_form "
		Interface review_form : Inherits article
			Property is_created_in As [[activity]]
		End Interface
	#End Region

	#Region " Interface Automatic_Paper_Assignment "
		Interface Automatic_Paper_Assignment : Inherits paper_assignment
			Property automatically_assign_paper As List(Of [[Program_Committee_member]]
		End Interface
	#End Region

	#Region " Interface institute "
		Interface institute
			
		End Interface
	#End Region

	#Region " Interface classification "
		Interface classification
			
		End Interface
	#End Region

	#Region " Interface summary_of_reviews "
		Interface summary_of_reviews : Inherits article
			Property is_created_in As [[activity]]
		End Interface
	#End Region

	#Region " Interface upper_tier_reviewing_process "
		Interface upper_tier_reviewing_process : Inherits reviewing_proces
			Property is_performed_by As [[human]]
		End Interface
	#End Region

	#Region " Interface end_date_of_full_paper_submission "
		Interface end_date_of_full_paper_submission : Inherits full_paper_submission_date
			
		End Interface
	#End Region

	#Region " Interface acceptance_notification_email "
		Interface acceptance_notification_email : Inherits notification_email
			
		End Interface
	#End Region

	#Region " Interface rejection_notification_email "
		Interface rejection_notification_email : Inherits notification_email
			
		End Interface
	#End Region

	#Region " Interface Contact_Person_URL "
		Interface Contact_Person_URL : Inherits URL
			
		End Interface
	#End Region

	#Region " Interface Regular_Reviewer_URL "
		Interface Regular_Reviewer_URL : Inherits URL
			
		End Interface
	#End Region

	#Region " Interface Trip "
		Interface Trip : Inherits Social_event
			
		End Interface
	#End Region

	#Region " Interface Banquet "
		Interface Banquet : Inherits Social_event
			
		End Interface
	#End Region

	#Region " Interface Reception "
		Interface Reception : Inherits Social_event
			
		End Interface
	#End Region

	#Region " Interface Social_event "
		Interface Social_event : Inherits [Event]
			
		End Interface
	#End Region

	#Region " Interface Contribution "
		Interface Contribution : Inherits Thing
			''' <summary>
			''' writtenBy oppositeOf writes
			''' </summary>
			Property writtenBy As [[Author]]

			Property dealsWith As [[Topic]]

			Property remark As [String]

			Property abstract As [String]

			Property contactEmail As [String]

			Property hasKeyword As [String]

			Property hasTitle As [String]
		End Interface
	#End Region

	#Region " Interface City "
		Interface City
			
		End Interface
	#End Region

	#Region " Interface Country "
		Interface Country
			
		End Interface
	#End Region

	#Region " Interface Company "
		Interface Company : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface University "
		Interface University : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface Scholar "
		Interface Scholar : Inherits Person
			Property studyAt As [[University]]
		End Interface
	#End Region

	#Region " Interface Poster "
		Interface Poster : Inherits Contribution
			
		End Interface
	#End Region

	#Region " Interface Short_paper "
		Interface Short_paper : Inherits Contribution
			
		End Interface
	#End Region

	#Region " Interface Reviewing_results_event "
		Interface Reviewing_results_event : Inherits Administrative_event
			
		End Interface
	#End Region

	#Region " Interface Administrative_event "
		Interface Administrative_event : Inherits [Event]
			Property follows As [[Administrative_event]]

			Property parallel_with As [[Administrative_event]]
		End Interface
	#End Region

	#Region " Interface Reviewing_event "
		Interface Reviewing_event : Inherits Administrative_event
			
		End Interface
	#End Region

	#Region " Interface Registration_of_participants_event "
		Interface Registration_of_participants_event : Inherits Administrative_event
			
		End Interface
	#End Region

	#Region " Interface Submission_event "
		Interface Submission_event : Inherits Administrative_event
			
		End Interface
	#End Region

	#Region " Interface Camera_Ready_event "
		Interface Camera_Ready_event : Inherits Administrative_event
			
		End Interface
	#End Region

	#Region " Interface Workshop "
		Interface Workshop : Inherits Working_event, Conference_part, [Event], AcademicEvent
			
		End Interface
	#End Region

	#Region " Interface Tutorial "
		Interface Tutorial : Inherits Working_event, Conference_part
			
		End Interface
	#End Region

	#Region " Interface Working_event "
		Interface Working_event : Inherits [Event]
			''' <summary>
			''' hasTopic oppositeOf isTopicOf
			''' </summary>
			Property hasTopic As [[Topic]]

			Property hasAdministrativeEvent As [[Administrative_event]]
		End Interface
	#End Region

	#Region " Interface Member "
		Interface Member : Inherits Participant
			
		End Interface
	#End Region

	#Region " Interface Participant "
		Interface Participant : Inherits Person
			Property earlyRegistration As [Boolean]
		End Interface
	#End Region

	#Region " Interface Member_PC "
		Interface Member_PC : Inherits Person
			Property expertOn As [[Topic]]

			Property reviewes As [[Contribution]]
		End Interface
	#End Region

	#Region " Interface Chair_PC "
		Interface Chair_PC : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Student "
		Interface Student : Inherits Participant
			
		End Interface
	#End Region

	#Region " Interface Science_Worker "
		Interface Science_Worker : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Assistant "
		Interface Assistant : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Volunteer "
		Interface Volunteer : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Regular "
		Interface Regular : Inherits Participant
			
		End Interface
	#End Region

	#Region " Interface pc_meeting "
		Interface pc_meeting : Inherits [Event]
			
		End Interface
	#End Region

	#Region " Interface session "
		Interface session : Inherits [Event]
			
		End Interface
	#End Region

	#Region " Interface chair "
		Interface chair : Inherits Person
			Property assigns_reviewers_to_article As [[Reviewer]]

			''' <summary>
			''' creates_program oppositeOf program_created_by
			''' </summary>
			Property creates_program As [[program]]
		End Interface
	#End Region

	#Region " Interface abstract "
		Interface abstract : Inherits Document
			''' <summary>
			''' part_of_article oppositeOf has_abstract
			''' </summary>
			Property part_of_article As [[article]]
		End Interface
	#End Region

	#Region " Interface article "
		Interface article : Inherits Document
			Property goes_through As [[activity]]

			Property is_sent_to As [[human]]

			Property is_created_in As [[activity]]

			Property structure_created_by As [[human]]

			''' <summary>
			''' has_author oppositeOf is_author_of
			''' </summary>
			Property has_author As [[human]]

			Property gives_classification As [[classification]]

			''' <summary>
			''' article_written_by oppositeOf writes_article
			''' </summary>
			Property article_written_by As [[Author]]

			Property has_reviewer As [[Reviewer]]

			''' <summary>
			''' has_abstract oppositeOf part_of_article
			''' </summary>
			Property has_abstract As [[abstract]]
		End Interface
	#End Region

	#Region " Interface Review "
		Interface Review : Inherits article, Conference_document, Document
			Property writtenBy As [[Reviewer]]

			''' <summary>
			''' reviews oppositeOf has_a_review
			''' </summary>
			Property reviews As [[Reviewed_contribution]]

			Property gives_classification As [[classification]]

			Property is_created_in As [[activity]]

			''' <summary>
			''' review_written_by oppositeOf writes_review
			''' </summary>
			Property review_written_by As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface participant "
		Interface participant : Inherits Person
			Property submits_to_conference As [[Conference]]
		End Interface
	#End Region

	#Region " Interface program "
		Interface program
			''' <summary>
			''' program_created_by oppositeOf creates_program
			''' </summary>
			Property program_created_by As [[chair]]

			Property has_session As [[session]]
		End Interface
	#End Region

	#Region " Interface SlideSet "
		Interface SlideSet : Inherits Document
			
		End Interface
	#End Region

	#Region " Interface Programme "
		Interface Programme : Inherits Document
			''' <summary>
			''' belongsToEvent oppositeOf hasProgramme
			''' </summary>
			Property belongsToEvent As [[ConferenceEvent]]
		End Interface
	#End Region

	#Region " Interface MealMenu "
		Interface MealMenu : Inherits Document
			''' <summary>
			''' isMenuOf oppositeOf hasMenu
			''' </summary>
			Property isMenuOf As [[MealEvent]]
		End Interface
	#End Region

	#Region " Interface Topic "
		Interface Topic
			Property belongs_to_a_review_reference As [[Review_preference]]

			''' <summary>
			''' is_a_topis_of_conference_parts oppositeOf has_a_track-workshop-tutorial_topic
			''' </summary>
			Property is_a_topis_of_conference_parts As [[Conference_part]]

			''' <summary>
			''' isTopicOf oppositeOf hasTopic
			''' </summary>
			Property isTopicOf As [[Working_event]]
		End Interface
	#End Region

	#Region " Interface ConferenceEvent "
		Interface ConferenceEvent
			''' <summary>
			''' hasAttendee oppositeOf attendeeAt
			''' </summary>
			Property hasAttendee As [[Person]]

			''' <summary>
			''' hasLocation oppositeOf isLocationOf
			''' </summary>
			Property hasLocation As [[Place]]

			''' <summary>
			''' hasProgramme oppositeOf belongsToEvent
			''' </summary>
			Property hasProgramme As [[Programme]]

			Property hasEndDateTime As dateTime

			Property hasStartDateTime As dateTime
		End Interface
	#End Region

	#Region " Interface [Call] "
		Interface [Call]
			''' <summary>
			''' forEvent oppositeOf hasCall
			''' </summary>
			Property forEvent As [[AcademicEvent]]

			Property isInitiatedBy As List(Of [[Person]]

			Property hasSubmissionInstructions As [String]

			Property hasSubmissionDeadline As dateTime
		End Interface
	#End Region

	#Region " Interface ReviewRating "
		Interface ReviewRating
			
		End Interface
	#End Region

	#Region " Interface Organization "
		Interface Organization
			''' <summary>
			''' isProviderOf oppositeOf providedBy
			''' </summary>
			Property isProviderOf As [[Sponsorship]]
		End Interface
	#End Region

	#Region " Interface ReviewForm "
		Interface ReviewForm
			
		End Interface
	#End Region

	#Region " Interface PersonalHistory "
		Interface PersonalHistory
			
		End Interface
	#End Region

	#Region " Interface Sponsorship "
		Interface Sponsorship
			''' <summary>
			''' providedBy oppositeOf isProviderOf
			''' </summary>
			Property providedBy As [[Organization]]

			Property hasCostCurrency As [String]

			Property hasCostAmount As [Integer]
		End Interface
	#End Region

	#Region " Interface ReviewQuestion "
		Interface ReviewQuestion
			
		End Interface
	#End Region

	#Region " Interface ConferenceSession "
		Interface ConferenceSession
			
		End Interface
	#End Region

	#Region " Interface ContactInformation "
		Interface ContactInformation
			Property hasCity As [String]

			Property hasStreet As [String]

			Property hasPostalCode As [String]

			Property hasPhone As [String]
		End Interface
	#End Region

	#Region " Interface Place "
		Interface Place
			''' <summary>
			''' isLocationOf oppositeOf hasLocation
			''' </summary>
			Property isLocationOf As [[ConferenceEvent]]
		End Interface
	#End Region

	#Region " Interface WeekRejectRating "
		Interface WeekRejectRating : Inherits ReviewRating
			
		End Interface
	#End Region

	#Region " Interface AcceptRating "
		Interface AcceptRating : Inherits ReviewRating
			
		End Interface
	#End Region

	#Region " Interface AccpetIfRoomRating "
		Interface AccpetIfRoomRating : Inherits ReviewRating
			
		End Interface
	#End Region

	#Region " Interface RejectRating "
		Interface RejectRating : Inherits ReviewRating
			
		End Interface
	#End Region

	#Region " Interface MealEvent "
		Interface MealEvent : Inherits NonAcademicEvent
			''' <summary>
			''' hasMenu oppositeOf isMenuOf
			''' </summary>
			Property hasMenu As [[MealMenu]]
		End Interface
	#End Region

	#Region " Interface NonAcademicEvent "
		Interface NonAcademicEvent : Inherits ConferenceEvent
			
		End Interface
	#End Region

	#Region " Interface BreakEvent "
		Interface BreakEvent : Inherits NonAcademicEvent
			
		End Interface
	#End Region

	#Region " Interface ParallelAndDistributedComputingTopic "
		Interface ParallelAndDistributedComputingTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface WirelessCommunicationsTopic "
		Interface WirelessCommunicationsTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface OperatingTopicsystems "
		Interface OperatingTopicsystems : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksTopic "
		Interface ComputerNetworksTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface SatelliteAndSpaceCommunicationsTopic "
		Interface SatelliteAndSpaceCommunicationsTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface CADTopic "
		Interface CADTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface MultimediaTopic "
		Interface MultimediaTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface CommunicationsTopic "
		Interface CommunicationsTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface PowerlineTransmissionTopic "
		Interface PowerlineTransmissionTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface AntennasTopic "
		Interface AntennasTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface PerformanceTopic "
		Interface PerformanceTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface SignalProcessingTopic "
		Interface SignalProcessingTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface MicroelectronicsTopic "
		Interface MicroelectronicsTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface TestOnlyTopic "
		Interface TestOnlyTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface RadioCommunicationsTopic "
		Interface RadioCommunicationsTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface ComputerArchitectureTopic "
		Interface ComputerArchitectureTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface MedicineTopic "
		Interface MedicineTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface SecurityTopic "
		Interface SecurityTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface MobileComputingTopic "
		Interface MobileComputingTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface CryptographyTopic "
		Interface CryptographyTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface CommunicationTheoryTopic "
		Interface CommunicationTheoryTopic : Inherits Topic
			
		End Interface
	#End Region

	#Region " Interface ConferenceChair "
		Interface ConferenceChair : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface Author "
		Interface Author : Inherits Person, User, ConferenceMember
			Property submitPaper As [[Paper]]

			Property writePaper As [[Paper]]

			''' <summary>
			''' writes oppositeOf writtenBy
			''' </summary>
			Property writes As [[Contribution]]

			''' <summary>
			''' writes_article oppositeOf article_written_by
			''' </summary>
			Property writes_article As [[article]]

			Property assigns_article_to_conference As [[article]]

			''' <summary>
			''' hasRelatedPaper oppositeOf isWrittenBy
			''' </summary>
			Property hasRelatedPaper As [[Paper]]
		End Interface
	#End Region

	#Region " Interface DiningPlace "
		Interface DiningPlace : Inherits Place
			
		End Interface
	#End Region

	#Region " Interface Presenter "
		Interface Presenter : Inherits Author
			
		End Interface
	#End Region

	#Region " Interface AcademiaOrganization "
		Interface AcademiaOrganization : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface IndustryOrganization "
		Interface IndustryOrganization : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface NGO "
		Interface NGO : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface GovernmentOrganization "
		Interface GovernmentOrganization : Inherits Organization
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksEnterpriseTopic "
		Interface ComputerNetworksEnterpriseTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksSwitchingTopic "
		Interface ComputerNetworksSwitchingTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksSensorTopic "
		Interface ComputerNetworksSensorTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksSecurityTopic "
		Interface ComputerNetworksSecurityTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksOpticalTopic "
		Interface ComputerNetworksOpticalTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksMeasurementsTopic "
		Interface ComputerNetworksMeasurementsTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksManagementTopic "
		Interface ComputerNetworksManagementTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ComputerNetworksAapplicationsTopic "
		Interface ComputerNetworksAapplicationsTopic : Inherits ComputerNetworksTopic
			
		End Interface
	#End Region

	#Region " Interface ActivePaper "
		Interface ActivePaper : Inherits Paper
			Property hasRating As [[ReviewRating]]
		End Interface
	#End Region

	#Region " Interface PendingPaper "
		Interface PendingPaper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface WithdrawnPaper "
		Interface WithdrawnPaper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface RejectedPaper "
		Interface RejectedPaper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface AcceptedPaper "
		Interface AcceptedPaper : Inherits Paper
			''' <summary>
			''' relatedToEvent oppositeOf relatedToPaper
			''' </summary>
			Property relatedToEvent As [[PaperPresentation]]
		End Interface
	#End Region

	#Region " Interface PublishedPaper "
		Interface PublishedPaper : Inherits Paper
			
		End Interface
	#End Region

	#Region " Interface Attendee "
		Interface Attendee : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface CoffeeBreak "
		Interface CoffeeBreak : Inherits BreakEvent
			
		End Interface
	#End Region

	#Region " Interface FreeTimeBreak "
		Interface FreeTimeBreak : Inherits BreakEvent
			
		End Interface
	#End Region

	#Region " Interface MealBreak "
		Interface MealBreak : Inherits BreakEvent
			
		End Interface
	#End Region

	#Region " Interface ClosingTalk "
		Interface ClosingTalk : Inherits TalkEvent
			
		End Interface
	#End Region

	#Region " Interface WelcomeTalk "
		Interface WelcomeTalk : Inherits TalkEvent
			
		End Interface
	#End Region

	#Region " Interface TalkEvent "
		Interface TalkEvent : Inherits AcademicEvent
			
		End Interface
	#End Region

	#Region " Interface SessionChair "
		Interface SessionChair : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface TPCMember "
		Interface TPCMember : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface TwoLevelConference "
		Interface TwoLevelConference : Inherits Conference
			
		End Interface
	#End Region

	#Region " Interface CallForPapers "
		Interface CallForPapers : Inherits [Call]
			
		End Interface
	#End Region

	#Region " Interface TextualReviewQuestion "
		Interface TextualReviewQuestion : Inherits ReviewQuestion
			
		End Interface
	#End Region

	#Region " Interface NumericalReviewQuestion "
		Interface NumericalReviewQuestion : Inherits ReviewQuestion
			
		End Interface
	#End Region

	#Region " Interface OrganizationalMeeting "
		Interface OrganizationalMeeting : Inherits AcademicEvent
			
		End Interface
	#End Region

	#Region " Interface PaperPresentation "
		Interface PaperPresentation : Inherits AcademicEvent
			''' <summary>
			''' relatedToPaper oppositeOf relatedToEvent
			''' </summary>
			Property relatedToPaper As [[AcceptedPaper]]
		End Interface
	#End Region

	#Region " Interface AcademicEvent "
		Interface AcademicEvent : Inherits ConferenceEvent
			''' <summary>
			''' hasCall oppositeOf forEvent
			''' </summary>
			Property hasCall As [[Call]]
		End Interface
	#End Region

	#Region " Interface PersonalPublicationHistory "
		Interface PersonalPublicationHistory : Inherits PersonalHistory
			
		End Interface
	#End Region

	#Region " Interface Excursion "
		Interface Excursion : Inherits SocialEvent
			
		End Interface
	#End Region

	#Region " Interface SocialEvent "
		Interface SocialEvent : Inherits NonAcademicEvent
			
		End Interface
	#End Region

	#Region " Interface CallForReviews "
		Interface CallForReviews : Inherits [Call]
			
		End Interface
	#End Region

	#Region " Interface PersonalReviewHistory "
		Interface PersonalReviewHistory : Inherits PersonalHistory
			''' <summary>
			''' isReviewHistoryOf oppositeOf hasReviewHistory
			''' </summary>
			Property isReviewHistoryOf As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface ConferenceVenuePlace "
		Interface ConferenceVenuePlace : Inherits Place
			
		End Interface
	#End Region

	#Region " Interface CallForManuscripts "
		Interface CallForManuscripts : Inherits [Call]
			
		End Interface
	#End Region

	#Region " Interface Reception "
		Interface Reception : Inherits SocialEvent
			
		End Interface
	#End Region

	#Region " Interface SingleLevelConference "
		Interface SingleLevelConference : Inherits Conference
			
		End Interface
	#End Region

	#Region " Interface MeetingRoomPlace "
		Interface MeetingRoomPlace : Inherits Place
			
		End Interface
	#End Region

	#Region " Interface AccommodationPlace "
		Interface AccommodationPlace : Inherits Place
			
		End Interface
	#End Region

	#Region " Interface RatedPapers "
		Interface RatedPapers : Inherits ActivePaper
			
		End Interface
	#End Region

	#Region " Interface TravelGrant "
		Interface TravelGrant : Inherits Sponsorship
			
		End Interface
	#End Region

	#Region " Interface ConferenceDinner "
		Interface ConferenceDinner : Inherits MealEvent
			
		End Interface
	#End Region

	#Region " Enum EEnum "
		Enum EEnum
				[male]
				[female]
				[high]
				[medium]
				[low]
				[very__SPACE__high]
			End Enum
	#End Region
End Namespace
