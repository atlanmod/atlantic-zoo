Namespace cmt

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
			''' <summary>
			''' assignedByAdministrator oppositeOf assignReviewer
			''' </summary>
			Property assignedByAdministrator As [[Administrator]]

			''' <summary>
			''' adjustBid oppositeOf adjustedBy
			''' </summary>
			Property adjustBid As [[Bid]]

			''' <summary>
			''' readPaper oppositeOf readByReviewer
			''' </summary>
			Property readPaper As [[Paper]]

			''' <summary>
			''' hasBeenAssigned oppositeOf assignedTo
			''' </summary>
			Property hasBeenAssigned As [[Paper]]

			''' <summary>
			''' writeReview oppositeOf writtenBy
			''' </summary>
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

	#Region " Interface Person "
		Interface Person
			Property hasConflictOfInterest As [[Document]]

			Property email As [String]
		End Interface
	#End Region

	#Region " Interface Document "
		Interface Document
			
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
		Interface Conference : Inherits Thing
			''' <summary>
			''' hasConferenceMember oppositeOf memberOfConference
			''' </summary>
			Property hasConferenceMember As [[ConferenceMember]]

			''' <summary>
			''' paperAssignmentFinalizedBy oppositeOf finalizePaperAssignment
			''' </summary>
			Property paperAssignmentFinalizedBy As [[Administrator]]

			''' <summary>
			''' reviewCriteriaEnteredBy oppositeOf enterReviewCriteria
			''' </summary>
			Property reviewCriteriaEnteredBy As [[Administrator]]

			''' <summary>
			''' paperAssignmentToolsRunBy oppositeOf runPaperAssignmentTools
			''' </summary>
			Property paperAssignmentToolsRunBy As [[Administrator]]

			''' <summary>
			''' virtualMeetingEnabledBy oppositeOf enableVirtualMeeting
			''' </summary>
			Property virtualMeetingEnabledBy As [[Administrator]]

			''' <summary>
			''' hardcopyMailingManifestsPrintedBy oppositeOf printHardcopyMailingManifests
			''' </summary>
			Property hardcopyMailingManifestsPrintedBy As [[Administrator]]

			''' <summary>
			''' detailsEnteredBy oppositeOf enterConferenceDetails
			''' </summary>
			Property detailsEnteredBy As [[Administrator]]

			''' <summary>
			''' reviewerBiddingStartedBy oppositeOf startReviewerBidding
			''' </summary>
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
			''' <summary>
			''' memberOfConference oppositeOf hasConferenceMember
			''' </summary>
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

			''' <summary>
			''' addedBy oppositeOf addProgramCommitteeMember
			''' </summary>
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

			''' <summary>
			''' hasAuthor oppositeOf writePaper
			''' </summary>
			Property hasAuthor As [[Author]]

			''' <summary>
			''' acceptedBy oppositeOf acceptPaper
			''' </summary>
			Property acceptedBy As [[Administrator]]

			''' <summary>
			''' rejectedBy oppositeOf rejectPaper
			''' </summary>
			Property rejectedBy As [[Administrator]]

			Property [readByMeta-Reviewer] As [[Meta-Reviewer]]
		End Interface
	#End Region

	#Region " Interface Author "
		Interface Author : Inherits ConferenceMember, User
			Property submitPaper As [[Paper]]

			''' <summary>
			''' writePaper oppositeOf hasAuthor
			''' </summary>
			Property writePaper As [[Paper]]
		End Interface
	#End Region

	#Region " Interface User "
		Interface User : Inherits Person
			
		End Interface
	#End Region

	#Region " Interface [Co-author] "
		Interface [Co-author] : Inherits Author
			''' <summary>
			''' co-writePaper oppositeOf hasCo-author
			''' </summary>
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
		Interface Administrator : Inherits User
			''' <summary>
			''' finalizePaperAssignment oppositeOf paperAssignmentFinalizedBy
			''' </summary>
			Property finalizePaperAssignment As [[Conference]]

			''' <summary>
			''' runPaperAssignmentTools oppositeOf paperAssignmentToolsRunBy
			''' </summary>
			Property runPaperAssignmentTools As [[Conference]]

			''' <summary>
			''' enableVirtualMeeting oppositeOf virtualMeetingEnabledBy
			''' </summary>
			Property enableVirtualMeeting As [[Conference]]

			''' <summary>
			''' startReviewerBidding oppositeOf reviewerBiddingStartedBy
			''' </summary>
			Property startReviewerBidding As [[Conference]]

			''' <summary>
			''' assignReviewer oppositeOf assignedByAdministrator
			''' </summary>
			Property assignReviewer As [[Reviewer]]

			''' <summary>
			''' rejectPaper oppositeOf rejectedBy
			''' </summary>
			Property rejectPaper As [[Paper]]

			''' <summary>
			''' enterConferenceDetails oppositeOf detailsEnteredBy
			''' </summary>
			Property enterConferenceDetails As [[Conference]]

			''' <summary>
			''' printHardcopyMailingManifests oppositeOf hardcopyMailingManifestsPrintedBy
			''' </summary>
			Property printHardcopyMailingManifests As [[Conference]]

			Property setMaxPapers As [[ProgramCommitteeMember]]

			''' <summary>
			''' enterReviewCriteria oppositeOf reviewCriteriaEnteredBy
			''' </summary>
			Property enterReviewCriteria As [[Conference]]

			''' <summary>
			''' acceptPaper oppositeOf acceptedBy
			''' </summary>
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
End Namespace
