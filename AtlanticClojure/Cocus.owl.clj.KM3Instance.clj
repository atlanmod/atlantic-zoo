( declare Cocus_Thing )
( declare Cocus_Meta-Reviewer )
( declare Cocus_Reviewer )
( declare Cocus_Decision )
( declare Cocus_Preference )
( declare Cocus_ProgramCommittee )
( declare Cocus_Bid )
( declare Cocus_Conference )
( declare Cocus_ConferenceChair )
( declare Cocus_ConferenceMember )
( declare Cocus_AssociatedChair )
( declare Cocus_ProgramCommitteeMember )
( declare Cocus_AuthorNotReviewer )
( declare Cocus_SubjectArea )
( declare Cocus_ExternalReviewer )
( declare Cocus_Chairman )
( declare Cocus_ProgramCommitteeChair )
( declare Cocus_Acceptance )
( declare Cocus_Rejection )
( declare Cocus_Review )
( declare Cocus_Paper )
( declare Cocus_Author )
( declare Cocus_Co-author )
( declare Cocus_PaperAbstract )
( declare Cocus_PaperFullVersion )
( declare Cocus_Administrator )
( declare Cocus_Meta-Review )
( declare Cocus_date )
( declare Cocus_unsignedLong )
( declare Cocus_anyURI )
( declare Cocus_Workshop )
( declare Cocus_Event )
( declare Cocus_Account )
( declare Cocus_Inforamtion )
( declare Cocus_User )
( declare Cocus_Role )
( declare Cocus_Help_Request )
( declare Cocus_Person )
( declare Cocus_Symposium )
( declare Cocus_Abstract )
( declare Cocus_Document )
( declare Cocus_Invited_Paper )
( declare Cocus_Admin_Role )
( declare Cocus_Paper_Typologies )
( declare Cocus_Event_Setup )
( declare Cocus_Event_URL )
( declare Cocus_URL )
( declare Cocus_Notification_Email )
( declare Cocus_Email )
( declare Cocus_Short_Paper )
( declare Cocus_Author_Role )
( declare Cocus_Preview )
( declare Cocus_Review_Form )
( declare Cocus_Committe_Role )
( declare Cocus_Group_Email )
( declare Cocus_Submission_Template )
( declare Cocus_Review_Form_Setup )
( declare Cocus_Misc )
( declare Cocus_Event_Creation )
( declare Cocus_Approval_Email )
( declare Cocus_Rejection_Email )
( declare Cocus_Submission )
( declare Cocus_Template )
( declare Cocus_Feature_Request )
( declare Cocus_Committee )
( declare Cocus_Event_Tracks )
( declare Cocus_Request )
( declare Cocus_Activity )
( declare Cocus_Head_Role )
( declare Cocus_Detail )
( declare Cocus_Corresponding_Author )
( declare Cocus_Reviewer_Role )
( declare Cocus_Event_Approval )
( declare Cocus_Registration )
( declare Cocus_Full_Paper )
( declare Cocus_Research_Topic )
( declare Cocus_Description )
( declare Cocus_Assistance )
( declare Cocus_Email_Template )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Cocus ( struct-map
	KM3_Package
	:contents[( def Cocus_Thing ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_Meta-Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Reviewer]
		:structuralFeatures[]
	) ) ( def Cocus_Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_ConferenceMember Cocus_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByAdministrator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_Administrator
			:location "12:3-12:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "adjustBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_Bid
			:location "13:3-13:56"
			:isContainer false
			:opposite adjustedBy
		) ( struct-map
			KM3_Reference
			:name "readPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_Paper
			:location "14:3-14:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasBeenAssigned"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_Paper
			:location "15:3-15:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "writeReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_Review
			:location "16:3-16:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignExternalReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Reviewer
			:type Cocus_ExternalReviewer
			:location "17:3-17:90"
			:isContainer false
			:opposite assignedByReviewer
		)]
	) ) ( def Cocus_Decision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_Preference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_ProgramCommittee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ProgramCommittee
			:type Cocus_ProgramCommitteeMember
			:location "30:3-30:105"
			:isContainer false
			:opposite memberOfProgramCommittee
		)]
	) ) ( def Cocus_Bid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "adjustedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Bid
			:type Cocus_Reviewer
			:location "34:3-34:61"
			:isContainer false
			:opposite adjustBid
		)]
	) ) ( def Cocus_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing Cocus_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type date
			:location "46:3-46:30"
		) ( struct-map
			KM3_Attribute
			:name "reviewsPerPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Integer
			:location "47:3-47:44"
		) ( struct-map
			KM3_Attribute
			:name "logoURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type anyURI
			:location "48:3-48:35"
		) ( struct-map
			KM3_Attribute
			:name "acceptsHardcopySubmissions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Boolean
			:location "49:3-49:55"
		) ( struct-map
			KM3_Attribute
			:name "siteURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type anyURI
			:location "50:3-50:35"
		) ( struct-map
			KM3_Reference
			:name "hasConferenceMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_ConferenceMember
			:location "38:3-38:87"
			:isContainer false
			:opposite memberOfConference
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentFinalizedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "39:3-39:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reviewCriteriaEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "40:3-40:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentToolsRunBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "41:3-41:60"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "virtualMeetingEnabledBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "42:3-42:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hardcopyMailingManifestsPrintedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "43:3-43:68"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "detailsEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "44:3-44:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reviewerBiddingStartedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Conference
			:type Cocus_Administrator
			:location "45:3-45:59"
			:isContainer false
		)]
	) ) ( def Cocus_ConferenceChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_ConferenceMember Cocus_Chairman]
		:structuralFeatures[]
	) ) ( def Cocus_ConferenceMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "memberOfConference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ConferenceMember
			:type Cocus_Conference
			:location "58:3-58:50"
			:isContainer false
		)]
	) ) ( def Cocus_AssociatedChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_ConferenceMember Cocus_Chairman]
		:structuralFeatures[]
	) ) ( def Cocus_ProgramCommitteeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Person Cocus_ConferenceMember]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ProgramCommitteeMember
			:type Integer
			:location "67:3-67:38"
		) ( struct-map
			KM3_Reference
			:name "memberOfProgramCommittee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ProgramCommitteeMember
			:type Cocus_ProgramCommittee
			:location "66:3-66:99"
			:isContainer false
			:opposite hasProgramCommitteeMember
		) ( struct-map
			KM3_Reference
			:name "addedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ProgramCommitteeMember
			:type Cocus_Administrator
			:location "68:3-68:42"
			:isContainer false
		)]
	) ) ( def Cocus_AuthorNotReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Author]
		:structuralFeatures[]
	) ) ( def Cocus_SubjectArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_ExternalReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Cocus_ExternalReviewer
			:type Cocus_Reviewer
			:location "80:3-80:77"
			:isContainer false
			:opposite assignExternalReviewer
		)]
	) ) ( def Cocus_Chairman ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Person Cocus_ConferenceMember]
		:structuralFeatures[]
	) ) ( def Cocus_ProgramCommitteeChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_ProgramCommitteeMember Cocus_Chairman]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "endReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_ProgramCommitteeChair
			:type Cocus_Review
			:location "88:3-88:37"
			:isContainer false
		)]
	) ) ( def Cocus_Acceptance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Decision]
		:structuralFeatures[]
	) ) ( def Cocus_Rejection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Decision]
		:structuralFeatures[]
	) ) ( def Cocus_Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "writtenBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Review
			:type Cocus_Reviewer
			:location "100:3-100:62"
			:isContainer false
			:opposite writeReview
		)]
	) ) ( def Cocus_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Document]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "paperID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type unsignedLong
			:location "110:3-110:41"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type String
			:location "111:3-111:33"
		) ( struct-map
			KM3_Reference
			:name "hasCo-author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Co-author
			:location "104:3-104:74"
			:isContainer false
			:opposite co-writePaper
		) ( struct-map
			KM3_Reference
			:name "hasBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Bid
			:location "105:3-105:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasDecision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Decision
			:location "106:3-106:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignedTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Reviewer
			:location "107:3-107:67"
			:isContainer false
			:opposite hasBeenAssigned
		) ( struct-map
			KM3_Reference
			:name "hasSubjectArea"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_SubjectArea
			:location "108:3-108:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "readByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Reviewer
			:location "109:3-109:60"
			:isContainer false
			:opposite readPaper
		) ( struct-map
			KM3_Reference
			:name "hasAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Author
			:location "112:3-112:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "acceptedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Administrator
			:location "113:3-113:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rejectedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Administrator
			:location "114:3-114:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "readByMeta-Reviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Paper
			:type Cocus_Meta-Reviewer
			:location "115:3-115:58"
			:isContainer false
		)]
	) ) ( def Cocus_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_ConferenceMember Cocus_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "submitPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Author
			:type Cocus_Paper
			:location "119:3-119:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Author
			:type Cocus_Paper
			:location "120:3-120:37"
			:isContainer false
		)]
	) ) ( def Cocus_Co-author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Author]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "co-writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Co-author
			:type Cocus_Paper
			:location "125:3-125:42"
			:isContainer false
		)]
	) ) ( def Cocus_PaperAbstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_PaperFullVersion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_Administrator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_User Cocus_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "approve"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Event
			:location "137:3-137:57"
			:isContainer false
			:opposite approved_by
		) ( struct-map
			KM3_Reference
			:name "assign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Role
			:location "138:3-138:55"
			:isContainer false
			:opposite assigned_by
		) ( struct-map
			KM3_Reference
			:name "finalizePaperAssignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "139:3-139:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "runPaperAssignmentTools"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "140:3-140:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enableVirtualMeeting"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "141:3-141:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "startReviewerBidding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "142:3-142:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Reviewer
			:location "143:3-143:79"
			:isContainer false
			:opposite assignedByAdministrator
		) ( struct-map
			KM3_Reference
			:name "rejectPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Paper
			:location "144:3-144:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enterConferenceDetails"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "145:3-145:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "printHardcopyMailingManifests"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "146:3-146:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "setMaxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_ProgramCommitteeMember
			:location "147:3-147:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enterReviewCriteria"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Conference
			:location "148:3-148:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "acceptPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_Paper
			:location "149:3-149:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "addProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Administrator
			:type Cocus_ProgramCommitteeMember
			:location "150:3-150:88"
			:isContainer false
			:opposite addedBy
		)]
	) ) ( def Cocus_Meta-Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Review]
		:structuralFeatures[]
	) ) ( def ptyp_date ( struct-map
		KM3_DataType
		:name "date"
		:location "157:2-157:16"
	) ) ( def ptyp_unsignedLong ( struct-map
		KM3_DataType
		:name "unsignedLong"
		:location "159:2-159:24"
	) ) ( def ptyp_anyURI ( struct-map
		KM3_DataType
		:name "anyURI"
		:location "161:2-161:18"
	) ) ( def Cocus_Workshop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event]
		:structuralFeatures[]
	) ) ( def Cocus_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conists_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event
			:type Cocus_Event_Tracks
			:location "169:3-169:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "confirmed_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event
			:type Cocus_Approval_Email
			:location "170:3-170:67"
			:isContainer false
			:opposite confirm
		) ( struct-map
			KM3_Reference
			:name "defined_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event
			:type Cocus_Event_Setup
			:location "171:3-171:61"
			:isContainer false
			:opposite define
		) ( struct-map
			KM3_Reference
			:name "approved_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event
			:type Cocus_Administrator
			:location "172:3-172:65"
			:isContainer false
			:opposite approve
		)]
	) ) ( def Cocus_Account ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "registred_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Account
			:type Cocus_Person
			:location "176:3-176:60"
			:isContainer false
			:opposite register
		)]
	) ) ( def Cocus_Inforamtion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_User ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "recieve"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_User
			:type Cocus_Document
			:location "184:3-184:60"
			:isContainer false
			:opposite recieved_by
		) ( struct-map
			KM3_Reference
			:name "create"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_User
			:type Cocus_Thing
			:location "185:3-185:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "submit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_User
			:type Cocus_Document
			:location "186:3-186:60"
			:isContainer false
			:opposite submited__by
		)]
	) ) ( def Cocus_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assigned_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Role
			:type Cocus_Administrator
			:location "190:3-190:64"
			:isContainer false
			:opposite assign
		)]
	) ) ( def Cocus_Help_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Request]
		:structuralFeatures[]
	) ) ( def Cocus_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type String
			:location "211:3-211:33"
		) ( struct-map
			KM3_Reference
			:name "inverse_of_add"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Thing
			:location "199:3-199:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "execute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Thing
			:location "200:3-200:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "get"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Inforamtion
			:location "201:3-201:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Document
			:location "202:3-202:52"
			:isContainer false
			:opposite used_by
		) ( struct-map
			KM3_Reference
			:name "register"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Account
			:location "203:3-203:61"
			:isContainer false
			:opposite registred_by
		) ( struct-map
			KM3_Reference
			:name "modify"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Thing
			:location "204:3-204:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "take_part_in"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Event
			:location "205:3-205:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "remove"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Thing
			:location "206:3-206:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "add"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Person
			:location "207:3-207:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "send"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Activity
			:location "208:3-208:53"
			:isContainer false
			:opposite sent_by
		) ( struct-map
			KM3_Reference
			:name "added_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Person
			:location "209:3-209:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasConflictOfInterest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Person
			:type Cocus_Document
			:location "210:3-210:51"
			:isContainer false
		)]
	) ) ( def Cocus_Symposium ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event]
		:structuralFeatures[]
	) ) ( def Cocus_Abstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "recieved_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Document
			:type Cocus_User
			:location "223:3-223:56"
			:isContainer false
			:opposite recieve
		) ( struct-map
			KM3_Reference
			:name "used_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Document
			:type Cocus_Person
			:location "224:3-224:50"
			:isContainer false
			:opposite use
		) ( struct-map
			KM3_Reference
			:name "submited__by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Document
			:type Cocus_User
			:location "225:3-225:56"
			:isContainer false
			:opposite submit
		)]
	) ) ( def Cocus_Invited_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_Admin_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Role]
		:structuralFeatures[]
	) ) ( def Cocus_Paper_Typologies ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) ) ( def Cocus_Event_Setup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "define"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event_Setup
			:type Cocus_Event
			:location "241:3-241:55"
			:isContainer false
			:opposite defined_by
		)]
	) ) ( def Cocus_Event_URL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_URL]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "concerned"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Event_URL
			:type Cocus_Event
			:location "245:3-245:36"
			:isContainer false
		)]
	) ) ( def Cocus_URL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_Notification_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Email]
		:structuralFeatures[]
	) ) ( def Cocus_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Document]
		:structuralFeatures[]
	) ) ( def Cocus_Short_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_Author_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Role]
		:structuralFeatures[]
	) ) ( def Cocus_Preview ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Review_Form]
		:structuralFeatures[]
	) ) ( def Cocus_Review_Form ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) ) ( def Cocus_Committe_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Role]
		:structuralFeatures[]
	) ) ( def Cocus_Group_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Email]
		:structuralFeatures[]
	) ) ( def Cocus_Submission_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) ) ( def Cocus_Review_Form_Setup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Review_Form]
		:structuralFeatures[]
	) ) ( def Cocus_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Help_Request]
		:structuralFeatures[]
	) ) ( def Cocus_Event_Creation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Activity]
		:structuralFeatures[]
	) ) ( def Cocus_Approval_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Email]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "confirm"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Approval_Email
			:type Cocus_Event
			:location "303:3-303:58"
			:isContainer false
			:opposite confirmed_by
		)]
	) ) ( def Cocus_Rejection_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Email]
		:structuralFeatures[]
	) ) ( def Cocus_Submission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Document]
		:structuralFeatures[]
	) ) ( def Cocus_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Document]
		:structuralFeatures[]
	) ) ( def Cocus_Feature_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Help_Request]
		:structuralFeatures[]
	) ) ( def Cocus_Committee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_User]
		:structuralFeatures[]
	) ) ( def Cocus_Event_Tracks ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) ) ( def Cocus_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Activity]
		:structuralFeatures[]
	) ) ( def Cocus_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_result"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cocus_Activity
			:type Cocus_Thing
			:location "335:3-335:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sent_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Cocus_Activity
			:type Cocus_Person
			:location "336:3-336:51"
			:isContainer false
			:opposite send
		)]
	) ) ( def Cocus_Head_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Role]
		:structuralFeatures[]
	) ) ( def Cocus_Detail ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Thing]
		:structuralFeatures[]
	) ) ( def Cocus_Corresponding_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Author]
		:structuralFeatures[]
	) ) ( def Cocus_Reviewer_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Role]
		:structuralFeatures[]
	) ) ( def Cocus_Event_Approval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Activity]
		:structuralFeatures[]
	) ) ( def Cocus_Registration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Activity]
		:structuralFeatures[]
	) ) ( def Cocus_Full_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Paper]
		:structuralFeatures[]
	) ) ( def Cocus_Research_Topic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) ) ( def Cocus_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Cocus_Assistance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Help_Request]
		:structuralFeatures[]
	) ) ( def Cocus_Email_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cocus_Event_Setup]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "385:2-385:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "386:2-386:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "387:2-387:18"
	) )]
) )
