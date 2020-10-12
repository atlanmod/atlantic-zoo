( declare cmt_Thing )
( declare cmt_Meta-Reviewer )
( declare cmt_Reviewer )
( declare cmt_Decision )
( declare cmt_Person )
( declare cmt_Document )
( declare cmt_Preference )
( declare cmt_ProgramCommittee )
( declare cmt_Bid )
( declare cmt_Conference )
( declare cmt_ConferenceChair )
( declare cmt_ConferenceMember )
( declare cmt_AssociatedChair )
( declare cmt_ProgramCommitteeMember )
( declare cmt_AuthorNotReviewer )
( declare cmt_SubjectArea )
( declare cmt_ExternalReviewer )
( declare cmt_Chairman )
( declare cmt_ProgramCommitteeChair )
( declare cmt_Acceptance )
( declare cmt_Rejection )
( declare cmt_Review )
( declare cmt_Paper )
( declare cmt_Author )
( declare cmt_User )
( declare cmt_Co-author )
( declare cmt_PaperAbstract )
( declare cmt_PaperFullVersion )
( declare cmt_Administrator )
( declare cmt_Meta-Review )
( declare cmt_date )
( declare cmt_unsignedLong )
( declare cmt_anyURI )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def cmt ( struct-map
	KM3_Package
	:contents[( def cmt_Thing ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def cmt_Meta-Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Reviewer]
		:structuralFeatures[]
	) ) ( def cmt_Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_ConferenceMember cmt_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByAdministrator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_Administrator
			:location "12:3-12:84"
			:isContainer false
			:opposite assignReviewer
		) ( struct-map
			KM3_Reference
			:name "adjustBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_Bid
			:location "13:3-13:56"
			:isContainer false
			:opposite adjustedBy
		) ( struct-map
			KM3_Reference
			:name "readPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_Paper
			:location "14:3-14:62"
			:isContainer false
			:opposite readByReviewer
		) ( struct-map
			KM3_Reference
			:name "hasBeenAssigned"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_Paper
			:location "15:3-15:64"
			:isContainer false
			:opposite assignedTo
		) ( struct-map
			KM3_Reference
			:name "writeReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_Review
			:location "16:3-16:60"
			:isContainer false
			:opposite writtenBy
		) ( struct-map
			KM3_Reference
			:name "assignExternalReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Reviewer
			:type cmt_ExternalReviewer
			:location "17:3-17:90"
			:isContainer false
			:opposite assignedByReviewer
		)]
	) ) ( def cmt_Decision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def cmt_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Person
			:type String
			:location "26:3-26:33"
		) ( struct-map
			KM3_Reference
			:name "hasConflictOfInterest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Person
			:type cmt_Document
			:location "25:3-25:51"
			:isContainer false
		)]
	) ) ( def cmt_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def cmt_Preference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def cmt_ProgramCommittee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ProgramCommittee
			:type cmt_ProgramCommitteeMember
			:location "38:3-38:105"
			:isContainer false
			:opposite memberOfProgramCommittee
		)]
	) ) ( def cmt_Bid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "adjustedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Bid
			:type cmt_Reviewer
			:location "42:3-42:61"
			:isContainer false
			:opposite adjustBid
		)]
	) ) ( def cmt_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Thing]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type date
			:location "54:3-54:30"
		) ( struct-map
			KM3_Attribute
			:name "reviewsPerPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type Integer
			:location "55:3-55:44"
		) ( struct-map
			KM3_Attribute
			:name "logoURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type anyURI
			:location "56:3-56:35"
		) ( struct-map
			KM3_Attribute
			:name "acceptsHardcopySubmissions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type Boolean
			:location "57:3-57:55"
		) ( struct-map
			KM3_Attribute
			:name "siteURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type anyURI
			:location "58:3-58:35"
		) ( struct-map
			KM3_Reference
			:name "hasConferenceMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_ConferenceMember
			:location "46:3-46:87"
			:isContainer false
			:opposite memberOfConference
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentFinalizedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "47:3-47:96"
			:isContainer false
			:opposite finalizePaperAssignment
		) ( struct-map
			KM3_Reference
			:name "reviewCriteriaEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "48:3-48:89"
			:isContainer false
			:opposite enterReviewCriteria
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentToolsRunBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "49:3-49:95"
			:isContainer false
			:opposite runPaperAssignmentTools
		) ( struct-map
			KM3_Reference
			:name "virtualMeetingEnabledBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "50:3-50:90"
			:isContainer false
			:opposite enableVirtualMeeting
		) ( struct-map
			KM3_Reference
			:name "hardcopyMailingManifestsPrintedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "51:3-51:109"
			:isContainer false
			:opposite printHardcopyMailingManifests
		) ( struct-map
			KM3_Reference
			:name "detailsEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "52:3-52:85"
			:isContainer false
			:opposite enterConferenceDetails
		) ( struct-map
			KM3_Reference
			:name "reviewerBiddingStartedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Conference
			:type cmt_Administrator
			:location "53:3-53:91"
			:isContainer false
			:opposite startReviewerBidding
		)]
	) ) ( def cmt_ConferenceChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_ConferenceMember cmt_Chairman]
		:structuralFeatures[]
	) ) ( def cmt_ConferenceMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "memberOfConference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ConferenceMember
			:type cmt_Conference
			:location "66:3-66:81"
			:isContainer false
			:opposite hasConferenceMember
		)]
	) ) ( def cmt_AssociatedChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_ConferenceMember cmt_Chairman]
		:structuralFeatures[]
	) ) ( def cmt_ProgramCommitteeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Person cmt_ConferenceMember]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ProgramCommitteeMember
			:type Integer
			:location "75:3-75:38"
		) ( struct-map
			KM3_Reference
			:name "memberOfProgramCommittee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ProgramCommitteeMember
			:type cmt_ProgramCommittee
			:location "74:3-74:99"
			:isContainer false
			:opposite hasProgramCommitteeMember
		) ( struct-map
			KM3_Reference
			:name "addedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ProgramCommitteeMember
			:type cmt_Administrator
			:location "76:3-76:79"
			:isContainer false
			:opposite addProgramCommitteeMember
		)]
	) ) ( def cmt_AuthorNotReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Author]
		:structuralFeatures[]
	) ) ( def cmt_SubjectArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def cmt_ExternalReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner cmt_ExternalReviewer
			:type cmt_Reviewer
			:location "88:3-88:77"
			:isContainer false
			:opposite assignExternalReviewer
		)]
	) ) ( def cmt_Chairman ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Person cmt_ConferenceMember]
		:structuralFeatures[]
	) ) ( def cmt_ProgramCommitteeChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_ProgramCommitteeMember cmt_Chairman]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "endReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_ProgramCommitteeChair
			:type cmt_Review
			:location "96:3-96:37"
			:isContainer false
		)]
	) ) ( def cmt_Acceptance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Decision]
		:structuralFeatures[]
	) ) ( def cmt_Rejection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Decision]
		:structuralFeatures[]
	) ) ( def cmt_Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "writtenBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Review
			:type cmt_Reviewer
			:location "108:3-108:62"
			:isContainer false
			:opposite writeReview
		)]
	) ) ( def cmt_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Document]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "paperID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type unsignedLong
			:location "118:3-118:41"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type String
			:location "119:3-119:33"
		) ( struct-map
			KM3_Reference
			:name "hasCo-author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Co-author
			:location "112:3-112:74"
			:isContainer false
			:opposite co-writePaper
		) ( struct-map
			KM3_Reference
			:name "hasBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Bid
			:location "113:3-113:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasDecision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Decision
			:location "114:3-114:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignedTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Reviewer
			:location "115:3-115:67"
			:isContainer false
			:opposite hasBeenAssigned
		) ( struct-map
			KM3_Reference
			:name "hasSubjectArea"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_SubjectArea
			:location "116:3-116:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "readByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Reviewer
			:location "117:3-117:60"
			:isContainer false
			:opposite readPaper
		) ( struct-map
			KM3_Reference
			:name "hasAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Author
			:location "120:3-120:59"
			:isContainer false
			:opposite writePaper
		) ( struct-map
			KM3_Reference
			:name "acceptedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Administrator
			:location "121:3-121:68"
			:isContainer false
			:opposite acceptPaper
		) ( struct-map
			KM3_Reference
			:name "rejectedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Administrator
			:location "122:3-122:68"
			:isContainer false
			:opposite rejectPaper
		) ( struct-map
			KM3_Reference
			:name "readByMeta-Reviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Paper
			:type cmt_Meta-Reviewer
			:location "123:3-123:58"
			:isContainer false
		)]
	) ) ( def cmt_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_ConferenceMember cmt_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "submitPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Author
			:type cmt_Paper
			:location "127:3-127:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Author
			:type cmt_Paper
			:location "128:3-128:58"
			:isContainer false
			:opposite hasAuthor
		)]
	) ) ( def cmt_User ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Person]
		:structuralFeatures[]
	) ) ( def cmt_Co-author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Author]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "co-writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Co-author
			:type cmt_Paper
			:location "136:3-136:68"
			:isContainer false
			:opposite hasCo-author
		)]
	) ) ( def cmt_PaperAbstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Paper]
		:structuralFeatures[]
	) ) ( def cmt_PaperFullVersion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Paper]
		:structuralFeatures[]
	) ) ( def cmt_Administrator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "finalizePaperAssignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "148:3-148:93"
			:isContainer false
			:opposite paperAssignmentFinalizedBy
		) ( struct-map
			KM3_Reference
			:name "runPaperAssignmentTools"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "149:3-149:92"
			:isContainer false
			:opposite paperAssignmentToolsRunBy
		) ( struct-map
			KM3_Reference
			:name "enableVirtualMeeting"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "150:3-150:87"
			:isContainer false
			:opposite virtualMeetingEnabledBy
		) ( struct-map
			KM3_Reference
			:name "startReviewerBidding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "151:3-151:88"
			:isContainer false
			:opposite reviewerBiddingStartedBy
		) ( struct-map
			KM3_Reference
			:name "assignReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Reviewer
			:location "152:3-152:79"
			:isContainer false
			:opposite assignedByAdministrator
		) ( struct-map
			KM3_Reference
			:name "rejectPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Paper
			:location "153:3-153:60"
			:isContainer false
			:opposite rejectedBy
		) ( struct-map
			KM3_Reference
			:name "enterConferenceDetails"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "154:3-154:82"
			:isContainer false
			:opposite detailsEnteredBy
		) ( struct-map
			KM3_Reference
			:name "printHardcopyMailingManifests"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "155:3-155:106"
			:isContainer false
			:opposite hardcopyMailingManifestsPrintedBy
		) ( struct-map
			KM3_Reference
			:name "setMaxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_ProgramCommitteeMember
			:location "156:3-156:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enterReviewCriteria"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Conference
			:location "157:3-157:86"
			:isContainer false
			:opposite reviewCriteriaEnteredBy
		) ( struct-map
			KM3_Reference
			:name "acceptPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_Paper
			:location "158:3-158:60"
			:isContainer false
			:opposite acceptedBy
		) ( struct-map
			KM3_Reference
			:name "addProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner cmt_Administrator
			:type cmt_ProgramCommitteeMember
			:location "159:3-159:88"
			:isContainer false
			:opposite addedBy
		)]
	) ) ( def cmt_Meta-Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[cmt_Review]
		:structuralFeatures[]
	) ) ( def ptyp_date ( struct-map
		KM3_DataType
		:name "date"
		:location "166:2-166:16"
	) ) ( def ptyp_unsignedLong ( struct-map
		KM3_DataType
		:name "unsignedLong"
		:location "168:2-168:24"
	) ) ( def ptyp_anyURI ( struct-map
		KM3_DataType
		:name "anyURI"
		:location "170:2-170:18"
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "174:2-174:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "175:2-175:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "176:2-176:18"
	) )]
) )
