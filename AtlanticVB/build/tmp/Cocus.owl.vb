Namespace Cocus

	#Region " Interface Thing "
		Interface Thing
			
		End Interface
	#End Region

	#Region " Interface [Meta-Reviewer] "
		Interface [Meta-Reviewer] : Inherits Reviewer
			
		End Interface
	#End Region

	#Region " Interface Reviewer "
		Interface Reviewer : Inherits ConferenceMember, User
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
			''' <summary>
			''' adjustedBy oppositeOf adjustBid
			''' </summary>
			Property adjustedBy As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface Conference "
		Interface Conference : Inherits Thing, [Event]
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

			Property [date] As [date]

			Property reviewsPerPaper As [Integer]

			Property logoURL As anyURI

			Property acceptsHardcopySubmissions As [Boolean]

			Property siteURL As anyURI
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
			''' <summary>
			''' assignedByReviewer oppositeOf assignExternalReviewer
			''' </summary>
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

	#Region " Interface Review "
		Interface Review : Inherits Document
			''' <summary>
			''' writtenBy oppositeOf writeReview
			''' </summary>
			Property writtenBy As [[Reviewer]]
		End Interface
	#End Region

	#Region " Interface Paper "
		Interface Paper : Inherits Document
			''' <summary>
			''' hasCo-author oppositeOf co-writePaper
			''' </summary>
			Property [hasCo-author] As [[Co-author]]

			Property hasBid As [[Bid]]

			Property hasDecision As [[Decision]]

			''' <summary>
			''' assignedTo oppositeOf hasBeenAssigned
			''' </summary>
			Property assignedTo As [[Reviewer]]

			Property hasSubjectArea As [[SubjectArea]]

			''' <summary>
			''' readByReviewer oppositeOf readPaper
			''' </summary>
			Property readByReviewer As [[Reviewer]]

			Property paperID As unsignedLong

			Property title As [String]

			Property hasAuthor As [[Author]]

			Property acceptedBy As [[Administrator]]

			Property rejectedBy As [[Administrator]]

			Property [readByMeta-Reviewer] As [[Meta-Reviewer]]
		End Interface
	#End Region

	#Region " Interface Author "
		Interface Author : Inherits ConferenceMember, User
			Property submitPaper As [[Paper]]

			Property writePaper As [[Paper]]
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
			''' <summary>
			''' approve oppositeOf approved_by
			''' </summary>
			Property approve As [[Event]]

			''' <summary>
			''' assign oppositeOf assigned_by
			''' </summary>
			Property assign As [[Role]]

			Property finalizePaperAssignment As [[Conference]]

			Property runPaperAssignmentTools As [[Conference]]

			Property enableVirtualMeeting As [[Conference]]

			Property startReviewerBidding As [[Conference]]

			''' <summary>
			''' assignReviewer oppositeOf assignedByAdministrator
			''' </summary>
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

	#Region " Interface Workshop "
		Interface Workshop : Inherits [Event]
			
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

			Property hasConflictOfInterest As [[Document]]

			Property email As [String]
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
			''' <summary>
			''' define oppositeOf defined_by
			''' </summary>
			Property define As [[Event]]
		End Interface
	#End Region

	#Region " Interface Event_URL "
		Interface Event_URL : Inherits URL
			Property concerned As [[Event]]
		End Interface
	#End Region

	#Region " Interface URL "
		Interface URL
			
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
			''' <summary>
			''' confirm oppositeOf confirmed_by
			''' </summary>
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

	#Region " Interface Committee "
		Interface Committee : Inherits User
			
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

	#Region " Interface Assistance "
		Interface Assistance : Inherits Help_Request
			
		End Interface
	#End Region

	#Region " Interface Email_Template "
		Interface Email_Template : Inherits Event_Setup
			
		End Interface
	#End Region
End Namespace
