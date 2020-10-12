( declare Conference_Thing )
( declare Conference_Meta-Reviewer )
( declare Conference_Reviewer )
( declare Conference_Decision )
( declare Conference_Preference )
( declare Conference_ProgramCommittee )
( declare Conference_Bid )
( declare Conference_Conference )
( declare Conference_ConferenceChair )
( declare Conference_ConferenceMember )
( declare Conference_AssociatedChair )
( declare Conference_ProgramCommitteeMember )
( declare Conference_AuthorNotReviewer )
( declare Conference_SubjectArea )
( declare Conference_ExternalReviewer )
( declare Conference_Chairman )
( declare Conference_ProgramCommitteeChair )
( declare Conference_Acceptance )
( declare Conference_Rejection )
( declare Conference_Paper )
( declare Conference_Author )
( declare Conference_Co-author )
( declare Conference_PaperAbstract )
( declare Conference_PaperFullVersion )
( declare Conference_Administrator )
( declare Conference_Meta-Review )
( declare Conference_unsignedLong )
( declare Conference_anyURI )
( declare Conference_Event )
( declare Conference_Account )
( declare Conference_Inforamtion )
( declare Conference_User )
( declare Conference_Role )
( declare Conference_Help_Request )
( declare Conference_Person )
( declare Conference_Symposium )
( declare Conference_Abstract )
( declare Conference_Document )
( declare Conference_Invited_Paper )
( declare Conference_Admin_Role )
( declare Conference_Paper_Typologies )
( declare Conference_Event_Setup )
( declare Conference_Event_URL )
( declare Conference_URL )
( declare Conference_Notification_Email )
( declare Conference_Email )
( declare Conference_Short_Paper )
( declare Conference_Author_Role )
( declare Conference_Preview )
( declare Conference_Review_Form )
( declare Conference_Committe_Role )
( declare Conference_Group_Email )
( declare Conference_Submission_Template )
( declare Conference_Review_Form_Setup )
( declare Conference_Misc )
( declare Conference_Event_Creation )
( declare Conference_Approval_Email )
( declare Conference_Rejection_Email )
( declare Conference_Submission )
( declare Conference_Template )
( declare Conference_Feature_Request )
( declare Conference_Event_Tracks )
( declare Conference_Request )
( declare Conference_Activity )
( declare Conference_Head_Role )
( declare Conference_Detail )
( declare Conference_Corresponding_Author )
( declare Conference_Reviewer_Role )
( declare Conference_Event_Approval )
( declare Conference_Registration )
( declare Conference_Full_Paper )
( declare Conference_Research_Topic )
( declare Conference_Description )
( declare Conference_Assistance )
( declare Conference_Email_Template )
( declare Conference_Conference_participant )
( declare Conference_Active_conference_participant )
( declare Conference_Passive_conference_participant )
( declare Conference_Review_expertise )
( declare Conference_Submitted_contribution )
( declare Conference_Regular_author )
( declare Conference_Conference_contributor )
( declare Conference_Contribution_1th-author )
( declare Conference_Contribution_co-author )
( declare Conference_Conference_contribution )
( declare Conference_Co-chair )
( declare Conference_Committee )
( declare Conference_Committee_member )
( declare Conference_Abstract )
( declare Conference_Extended_abstract )
( declare Conference_Important_dates )
( declare Conference_Invited_speaker )
( declare Conference_Conference_proceedings )
( declare Conference_Information_for_participants )
( declare Conference_Conference_document )
( declare Conference_Organization )
( declare Conference_Regular_contribution )
( declare Conference_Poster )
( declare Conference_Written_contribution )
( declare Conference_Conference_applicant )
( declare Conference_Camera_ready_contribution )
( declare Conference_Accepted_contribution )
( declare Conference_Program_committee )
( declare Conference_Organizing_committee )
( declare Conference_Steering_committee )
( declare Conference_Conference_volume )
( declare Conference_Call_for_paper )
( declare Conference_Conference_announcement )
( declare Conference_Invited_talk )
( declare Conference_Conference_part )
( declare Conference_Presentation )
( declare Conference_Chair )
( declare Conference_Track )
( declare Conference_Workshop )
( declare Conference_Tutorial )
( declare Conference_Rejected_contribution )
( declare Conference_Reviewed_contribution )
( declare Conference_Review )
( declare Conference_Topic )
( declare Conference_Late_paid_applicant )
( declare Conference_Paid_applicant )
( declare Conference_Early_paid_applicant )
( declare Conference_Organizer )
( declare Conference_Call_for_participation )
( declare Conference_Publisher )
( declare Conference_Registeered_applicant )
( declare Conference_Track-workshop_chair )
( declare Conference_Conference_www )
( declare Conference_Conference_fees )
( declare Conference_Review_preference )
( declare Conference_date )
( declare Conference_EEnum )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def Conference ( struct-map
	KM3_Package
	:contents[( def EEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "high"
		:location "636:3-636:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "medium"
		:location "637:3-637:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "low"
		:location "638:3-638:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "very high"
		:location "639:3-639:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "male"
		:location "641:3-641:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "female"
		:location "642:3-642:18"
	)] ) ) ( def Conference_Thing ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Meta-Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Reviewer]
		:structuralFeatures[]
	) ) ( def Conference_Reviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_ConferenceMember Conference_User Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByAdministrator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Administrator
			:location "12:3-12:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "adjustBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Bid
			:location "13:3-13:56"
			:isContainer false
			:opposite adjustedBy
		) ( struct-map
			KM3_Reference
			:name "readPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Paper
			:location "14:3-14:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasBeenAssigned"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Paper
			:location "15:3-15:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "writeReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Review
			:location "16:3-16:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignExternalReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_ExternalReviewer
			:location "17:3-17:90"
			:isContainer false
			:opposite assignedByReviewer
		) ( struct-map
			KM3_Reference
			:name "invites_co-reviewers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Reviewer
			:location "18:3-18:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "invited_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Reviewer
			:location "19:3-19:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has_a_review_reference_or_expertise"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewer
			:type Conference_Thing
			:location "20:3-20:60"
			:isContainer false
		)]
	) ) ( def Conference_Decision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Preference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_ProgramCommittee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ProgramCommittee
			:type Conference_ProgramCommitteeMember
			:location "32:3-32:105"
			:isContainer false
			:opposite memberOfProgramCommittee
		)]
	) ) ( def Conference_Bid ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "adjustedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Bid
			:type Conference_Reviewer
			:location "36:3-36:40"
			:isContainer false
		)]
	) ) ( def Conference_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing Conference_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type date
			:location "48:3-48:30"
		) ( struct-map
			KM3_Attribute
			:name "reviewsPerPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Integer
			:location "49:3-49:44"
		) ( struct-map
			KM3_Attribute
			:name "logoURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type anyURI
			:location "50:3-50:35"
		) ( struct-map
			KM3_Attribute
			:name "acceptsHardcopySubmissions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Boolean
			:location "51:3-51:55"
		) ( struct-map
			KM3_Attribute
			:name "siteURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type anyURI
			:location "52:3-52:35"
		) ( struct-map
			KM3_Reference
			:name "hasConferenceMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_ConferenceMember
			:location "40:3-40:87"
			:isContainer false
			:opposite memberOfConference
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentFinalizedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "41:3-41:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reviewCriteriaEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "42:3-42:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "paperAssignmentToolsRunBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "43:3-43:60"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "virtualMeetingEnabledBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "44:3-44:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hardcopyMailingManifestsPrintedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "45:3-45:68"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "detailsEnteredBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "46:3-46:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reviewerBiddingStartedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference
			:type Conference_Administrator
			:location "47:3-47:59"
			:isContainer false
		)]
	) ) ( def Conference_ConferenceChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_ConferenceMember Conference_Chairman]
		:structuralFeatures[]
	) ) ( def Conference_ConferenceMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "memberOfConference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ConferenceMember
			:type Conference_Conference
			:location "60:3-60:50"
			:isContainer false
		)]
	) ) ( def Conference_AssociatedChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_ConferenceMember Conference_Chairman]
		:structuralFeatures[]
	) ) ( def Conference_ProgramCommitteeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person Conference_ConferenceMember]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ProgramCommitteeMember
			:type Integer
			:location "69:3-69:38"
		) ( struct-map
			KM3_Reference
			:name "memberOfProgramCommittee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ProgramCommitteeMember
			:type Conference_ProgramCommittee
			:location "68:3-68:99"
			:isContainer false
			:opposite hasProgramCommitteeMember
		) ( struct-map
			KM3_Reference
			:name "addedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ProgramCommitteeMember
			:type Conference_Administrator
			:location "70:3-70:42"
			:isContainer false
		)]
	) ) ( def Conference_AuthorNotReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Author]
		:structuralFeatures[]
	) ) ( def Conference_SubjectArea ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_ExternalReviewer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assignedByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Conference_ExternalReviewer
			:type Conference_Reviewer
			:location "82:3-82:43"
			:isContainer false
		)]
	) ) ( def Conference_Chairman ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person Conference_ConferenceMember]
		:structuralFeatures[]
	) ) ( def Conference_ProgramCommitteeChair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_ProgramCommitteeMember Conference_Chairman]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "endReview"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_ProgramCommitteeChair
			:type Conference_Review
			:location "90:3-90:37"
			:isContainer false
		)]
	) ) ( def Conference_Acceptance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Decision]
		:structuralFeatures[]
	) ) ( def Conference_Rejection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Decision]
		:structuralFeatures[]
	) ) ( def Conference_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Document Conference_Regular_contribution]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "paperID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type unsignedLong
			:location "110:3-110:41"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type String
			:location "111:3-111:33"
		) ( struct-map
			KM3_Reference
			:name "hasCo-author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Co-author
			:location "104:3-104:74"
			:isContainer false
			:opposite co-writePaper
		) ( struct-map
			KM3_Reference
			:name "hasBid"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Bid
			:location "105:3-105:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasDecision"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Decision
			:location "106:3-106:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignedTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Reviewer
			:location "107:3-107:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasSubjectArea"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_SubjectArea
			:location "108:3-108:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "readByReviewer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Reviewer
			:location "109:3-109:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Author
			:location "112:3-112:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "acceptedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Administrator
			:location "113:3-113:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rejectedBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Administrator
			:location "114:3-114:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "readByMeta-Reviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Paper
			:type Conference_Meta-Reviewer
			:location "115:3-115:58"
			:isContainer false
		)]
	) ) ( def Conference_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_ConferenceMember Conference_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "submitPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Author
			:type Conference_Paper
			:location "119:3-119:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Author
			:type Conference_Paper
			:location "120:3-120:37"
			:isContainer false
		)]
	) ) ( def Conference_Co-author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Author]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "co-writePaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Co-author
			:type Conference_Paper
			:location "124:3-124:42"
			:isContainer false
		)]
	) ) ( def Conference_PaperAbstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_PaperFullVersion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_Administrator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_User Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "approve"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Event
			:location "136:3-136:57"
			:isContainer false
			:opposite approved_by
		) ( struct-map
			KM3_Reference
			:name "assign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Role
			:location "137:3-137:55"
			:isContainer false
			:opposite assigned_by
		) ( struct-map
			KM3_Reference
			:name "finalizePaperAssignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "138:3-138:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "runPaperAssignmentTools"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "139:3-139:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enableVirtualMeeting"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "140:3-140:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "startReviewerBidding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "141:3-141:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "assignReviewer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Reviewer
			:location "142:3-142:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rejectPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Paper
			:location "143:3-143:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enterConferenceDetails"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "144:3-144:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "printHardcopyMailingManifests"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "145:3-145:61"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "setMaxPapers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_ProgramCommitteeMember
			:location "146:3-146:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "enterReviewCriteria"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Conference
			:location "147:3-147:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "acceptPaper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_Paper
			:location "148:3-148:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "addProgramCommitteeMember"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Administrator
			:type Conference_ProgramCommitteeMember
			:location "149:3-149:88"
			:isContainer false
			:opposite addedBy
		)]
	) ) ( def Conference_Meta-Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Review]
		:structuralFeatures[]
	) ) ( def ptyp_unsignedLong ( struct-map
		KM3_DataType
		:name "unsignedLong"
		:location "157:2-157:24"
	) ) ( def ptyp_anyURI ( struct-map
		KM3_DataType
		:name "anyURI"
		:location "159:2-159:18"
	) ) ( def Conference_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conists_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event
			:type Conference_Event_Tracks
			:location "162:3-162:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "confirmed_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event
			:type Conference_Approval_Email
			:location "163:3-163:67"
			:isContainer false
			:opposite confirm
		) ( struct-map
			KM3_Reference
			:name "defined_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event
			:type Conference_Event_Setup
			:location "164:3-164:61"
			:isContainer false
			:opposite define
		) ( struct-map
			KM3_Reference
			:name "approved_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event
			:type Conference_Administrator
			:location "165:3-165:65"
			:isContainer false
			:opposite approve
		)]
	) ) ( def Conference_Account ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "registred_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Account
			:type Conference_Person
			:location "169:3-169:60"
			:isContainer false
			:opposite register
		)]
	) ) ( def Conference_Inforamtion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_User ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "recieve"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_User
			:type Conference_Document
			:location "177:3-177:60"
			:isContainer false
			:opposite recieved_by
		) ( struct-map
			KM3_Reference
			:name "create"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_User
			:type Conference_Thing
			:location "178:3-178:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "submit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_User
			:type Conference_Document
			:location "179:3-179:60"
			:isContainer false
			:opposite submited__by
		)]
	) ) ( def Conference_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "assigned_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Role
			:type Conference_Administrator
			:location "183:3-183:64"
			:isContainer false
			:opposite assign
		)]
	) ) ( def Conference_Help_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Request]
		:structuralFeatures[]
	) ) ( def Conference_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_an_email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type String
			:location "203:3-203:40"
		) ( struct-map
			KM3_Attribute
			:name "has_the_first_name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type String
			:location "204:3-204:46"
		) ( struct-map
			KM3_Attribute
			:name "has_gender"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type EEnum
			:location "205:3-205:37"
		) ( struct-map
			KM3_Attribute
			:name "has_the_last_name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type String
			:location "206:3-206:45"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type String
			:location "208:3-208:33"
		) ( struct-map
			KM3_Reference
			:name "inverse_of_add"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Thing
			:location "191:3-191:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "execute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Thing
			:location "192:3-192:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "get"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Inforamtion
			:location "193:3-193:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Document
			:location "194:3-194:52"
			:isContainer false
			:opposite used_by
		) ( struct-map
			KM3_Reference
			:name "register"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Account
			:location "195:3-195:61"
			:isContainer false
			:opposite registred_by
		) ( struct-map
			KM3_Reference
			:name "modify"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Thing
			:location "196:3-196:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "take_part_in"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Event
			:location "197:3-197:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "remove"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Thing
			:location "198:3-198:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "add"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Person
			:location "199:3-199:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "send"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Activity
			:location "200:3-200:53"
			:isContainer false
			:opposite sent_by
		) ( struct-map
			KM3_Reference
			:name "added_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Person
			:location "201:3-201:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "contributes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Conference_document
			:location "202:3-202:75"
			:isContainer false
			:opposite has_authors
		) ( struct-map
			KM3_Reference
			:name "hasConflictOfInterest"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Person
			:type Conference_Document
			:location "207:3-207:51"
			:isContainer false
		)]
	) ) ( def Conference_Symposium ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event]
		:structuralFeatures[]
	) ) ( def Conference_Abstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "recieved_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Document
			:type Conference_User
			:location "222:3-222:56"
			:isContainer false
			:opposite recieve
		) ( struct-map
			KM3_Reference
			:name "used_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Document
			:type Conference_Person
			:location "223:3-223:50"
			:isContainer false
			:opposite use
		) ( struct-map
			KM3_Reference
			:name "submited__by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Document
			:type Conference_User
			:location "224:3-224:56"
			:isContainer false
			:opposite submit
		)]
	) ) ( def Conference_Invited_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_Admin_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Role]
		:structuralFeatures[]
	) ) ( def Conference_Paper_Typologies ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Event_Setup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "define"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event_Setup
			:type Conference_Event
			:location "240:3-240:55"
			:isContainer false
			:opposite defined_by
		)]
	) ) ( def Conference_Event_URL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_URL]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "concerned"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Event_URL
			:type Conference_Event
			:location "244:3-244:36"
			:isContainer false
		)]
	) ) ( def Conference_URL ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Notification_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Email]
		:structuralFeatures[]
	) ) ( def Conference_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Document]
		:structuralFeatures[]
	) ) ( def Conference_Short_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_Author_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Role]
		:structuralFeatures[]
	) ) ( def Conference_Preview ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Review_Form]
		:structuralFeatures[]
	) ) ( def Conference_Review_Form ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Committe_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Role]
		:structuralFeatures[]
	) ) ( def Conference_Group_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Email]
		:structuralFeatures[]
	) ) ( def Conference_Submission_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Review_Form_Setup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Review_Form]
		:structuralFeatures[]
	) ) ( def Conference_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Help_Request]
		:structuralFeatures[]
	) ) ( def Conference_Event_Creation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Activity]
		:structuralFeatures[]
	) ) ( def Conference_Approval_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Email]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "confirm"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Approval_Email
			:type Conference_Event
			:location "301:3-301:58"
			:isContainer false
			:opposite confirmed_by
		)]
	) ) ( def Conference_Rejection_Email ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Email]
		:structuralFeatures[]
	) ) ( def Conference_Submission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Document]
		:structuralFeatures[]
	) ) ( def Conference_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Document]
		:structuralFeatures[]
	) ) ( def Conference_Feature_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Help_Request]
		:structuralFeatures[]
	) ) ( def Conference_Event_Tracks ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Activity]
		:structuralFeatures[]
	) ) ( def Conference_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_result"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Activity
			:type Conference_Thing
			:location "330:3-330:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sent_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Activity
			:type Conference_Person
			:location "331:3-331:51"
			:isContainer false
			:opposite send
		)]
	) ) ( def Conference_Head_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Role]
		:structuralFeatures[]
	) ) ( def Conference_Detail ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[]
	) ) ( def Conference_Corresponding_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Author]
		:structuralFeatures[]
	) ) ( def Conference_Reviewer_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Role]
		:structuralFeatures[]
	) ) ( def Conference_Event_Approval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Activity]
		:structuralFeatures[]
	) ) ( def Conference_Registration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Activity]
		:structuralFeatures[]
	) ) ( def Conference_Full_Paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paper]
		:structuralFeatures[]
	) ) ( def Conference_Research_Topic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Assistance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Help_Request]
		:structuralFeatures[]
	) ) ( def Conference_Email_Template ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Event_Setup]
		:structuralFeatures[]
	) ) ( def Conference_Conference_participant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[]
	) ) ( def Conference_Active_conference_participant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contributor Conference_Conference_participant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "gives_presentations"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Active_conference_participant
			:type Conference_Presentation
			:location "384:3-384:76"
			:isContainer false
			:opposite is_given_by
		)]
	) ) ( def Conference_Passive_conference_participant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_participant]
		:structuralFeatures[]
	) ) ( def Conference_Review_expertise ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_an_expertise"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Review_expertise
			:type EEnum
			:location "394:3-394:43"
		) ( struct-map
			KM3_Reference
			:name "has_a_submitted_contribution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Review_expertise
			:type Conference_Submitted_contribution
			:location "393:3-393:106"
			:isContainer false
			:opposite has_a_review_expertise
		)]
	) ) ( def Conference_Submitted_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Written_contribution]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_a_review_expertise"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Submitted_contribution
			:type Conference_Review_expertise
			:location "398:3-398:100"
			:isContainer false
			:opposite has_a_submitted_contribution
		)]
	) ) ( def Conference_Regular_author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contributor]
		:structuralFeatures[]
	) ) ( def Conference_Conference_contributor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[]
	) ) ( def Conference_Contribution_1th-author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Regular_author]
		:structuralFeatures[]
	) ) ( def Conference_Contribution_co-author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Regular_author]
		:structuralFeatures[]
	) ) ( def Conference_Conference_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "is_submitted_at"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_contribution
			:type Conference_Conference_volume
			:location "419:3-419:83"
			:isContainer false
			:opposite has_contributions
		)]
	) ) ( def Conference_Co-chair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Committee_member]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_committe_co-chair_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Co-chair
			:type Conference_Committee
			:location "423:3-423:97"
			:isContainer false
			:opposite has_a_committee_co-chair
		)]
	) ) ( def Conference_Committee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_User]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_members"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Committee
			:type Conference_Committee_member
			:location "427:3-427:76"
			:isContainer false
			:opposite was_a_member_of
		) ( struct-map
			KM3_Reference
			:name "was_a_committee_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Committee
			:type Conference_Conference_volume
			:location "428:3-428:84"
			:isContainer false
			:opposite has_a_commtitee
		) ( struct-map
			KM3_Reference
			:name "has_a_committee_co-chair"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Committee
			:type Conference_Co-chair
			:location "429:3-429:98"
			:isContainer false
			:opposite was_a_committe_co-chair_of
		) ( struct-map
			KM3_Reference
			:name "has_a_committee_chair"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Committee
			:type Conference_Chair
			:location "430:3-430:84"
			:isContainer false
			:opposite was_a_committee_chair_of
		)]
	) ) ( def Conference_Committee_member ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_member_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Committee_member
			:type Conference_Committee
			:location "434:3-434:69"
			:isContainer false
			:opposite has_members
		)]
	) ) ( def Conference_Abstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Extended_abstract]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "is_the_1th_part_of"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Abstract
			:type Conference_Thing
			:location "438:3-438:43"
			:isContainer false
		)]
	) ) ( def Conference_Extended_abstract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Regular_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Important_dates ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "is_an_abstract_submission_date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "446:3-446:56"
		) ( struct-map
			KM3_Attribute
			:name "is_a_full_paper_submission_date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "447:3-447:57"
		) ( struct-map
			KM3_Attribute
			:name "is_an_ending_date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "448:3-448:43"
		) ( struct-map
			KM3_Attribute
			:name "is_a_date_of_acceptance_announcement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "449:3-449:62"
		) ( struct-map
			KM3_Attribute
			:name "is_a_date_of_camera_ready_paper_submission"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "450:3-450:68"
		) ( struct-map
			KM3_Attribute
			:name "is_a_starting_date"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type date
			:location "451:3-451:44"
		) ( struct-map
			KM3_Reference
			:name "belong_to_a_conference_volume"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Important_dates
			:type Conference_Conference_volume
			:location "452:3-452:99"
			:isContainer false
			:opposite has_important_dates
		)]
	) ) ( def Conference_Invited_speaker ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contributor]
		:structuralFeatures[]
	) ) ( def Conference_Conference_proceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_an_ISBN"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_proceedings
			:type String
			:location "460:3-460:39"
		) ( struct-map
			KM3_Attribute
			:name "has_a_volume"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_proceedings
			:type Integer
			:location "462:3-462:41"
		) ( struct-map
			KM3_Reference
			:name "has_a_publisher"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_proceedings
			:type Conference_Publisher
			:location "461:3-461:64"
			:isContainer false
			:opposite issues
		)]
	) ) ( def Conference_Information_for_participants ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[]
	) ) ( def Conference_Conference_document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_a_date_of_issue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_document
			:type date
			:location "471:3-471:45"
		) ( struct-map
			KM3_Reference
			:name "has_authors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_document
			:type Conference_Person
			:location "470:3-470:62"
			:isContainer false
			:opposite contributes
		)]
	) ) ( def Conference_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Regular_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Written_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Poster ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Written_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Conference_applicant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[]
	) ) ( def Conference_Camera_ready_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Accepted_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Accepted_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Reviewed_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Program_committee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Committee]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_program_committee_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Program_committee
			:type Conference_Conference_volume
			:location "503:3-503:100"
			:isContainer false
			:opposite has_a_program_committee
		)]
	) ) ( def Conference_Organizing_committee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Committee]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_an_organizing_committee_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Organizing_committee
			:type Conference_Conference_volume
			:location "507:3-507:108"
			:isContainer false
			:opposite has_an_organizing_committee
		)]
	) ) ( def Conference_Steering_committee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Committee]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_steering_committee_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Steering_committee
			:type Conference_Conference_volume
			:location "511:3-511:102"
			:isContainer false
			:opposite has_a_steering_committee
		)]
	) ) ( def Conference_Conference_volume ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_a_location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type String
			:location "524:3-524:42"
		) ( struct-map
			KM3_Reference
			:name "has_parts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Conference_part
			:location "515:3-515:87"
			:isContainer false
			:opposite is_part_of_conference_volumes
		) ( struct-map
			KM3_Reference
			:name "has_workshops"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Workshop
			:location "516:3-516:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has_tracks"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Track
			:location "517:3-517:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has_tutorials"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Tutorial
			:location "518:3-518:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "has_a_commtitee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Committee
			:location "519:3-519:76"
			:isContainer false
			:opposite was_a_committee_of
		) ( struct-map
			KM3_Reference
			:name "has_a_steering_committee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Steering_committee
			:location "520:3-520:103"
			:isContainer false
			:opposite was_a_steering_committee_of
		) ( struct-map
			KM3_Reference
			:name "has_an_organizing_committee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Organizing_committee
			:location "521:3-521:111"
			:isContainer false
			:opposite was_an_organizing_committee_of
		) ( struct-map
			KM3_Reference
			:name "has_important_dates"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Important_dates
			:location "522:3-522:97"
			:isContainer false
			:opposite belong_to_a_conference_volume
		) ( struct-map
			KM3_Reference
			:name "has_contributions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Conference_contribution
			:location "523:3-523:89"
			:isContainer false
			:opposite is_submitted_at
		) ( struct-map
			KM3_Reference
			:name "has_a_program_committee"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_volume
			:type Conference_Program_committee
			:location "525:3-525:100"
			:isContainer false
			:opposite was_a_program_committee_of
		)]
	) ) ( def Conference_Call_for_paper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[]
	) ) ( def Conference_Conference_announcement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[]
	) ) ( def Conference_Invited_talk ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Presentation]
		:structuralFeatures[]
	) ) ( def Conference_Conference_part ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_a_track-workshop-tutorial_topic"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_part
			:type Conference_Topic
			:location "543:3-543:106"
			:isContainer false
			:opposite is_a_topis_of_conference_parts
		) ( struct-map
			KM3_Reference
			:name "is_part_of_conference_volumes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_part
			:type Conference_Conference_volume
			:location "544:3-544:89"
			:isContainer false
			:opposite has_parts
		) ( struct-map
			KM3_Reference
			:name "has_a_track-workshop-tutorial_chair"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_part
			:type Conference_Track-workshop_chair
			:location "545:3-545:124"
			:isContainer false
			:opposite was_a_track-workshop_chair_of
		)]
	) ) ( def Conference_Presentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_contribution]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "is_given_by"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Presentation
			:type Conference_Active_conference_participant
			:location "549:3-549:93"
			:isContainer false
			:opposite gives_presentations
		)]
	) ) ( def Conference_Chair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Committee_member]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_committee_chair_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Chair
			:type Conference_Committee
			:location "553:3-553:88"
			:isContainer false
			:opposite has_a_committee_chair
		)]
	) ) ( def Conference_Track ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_part]
		:structuralFeatures[]
	) ) ( def Conference_Workshop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_part Conference_Event]
		:structuralFeatures[]
	) ) ( def Conference_Tutorial ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_part]
		:structuralFeatures[]
	) ) ( def Conference_Rejected_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Reviewed_contribution]
		:structuralFeatures[]
	) ) ( def Conference_Reviewed_contribution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Submitted_contribution]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "has_a_review"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Reviewed_contribution
			:type Conference_Review
			:location "573:3-573:59"
			:isContainer false
			:opposite reviews
		)]
	) ) ( def Conference_Review ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document Conference_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "writtenBy"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Review
			:type Conference_Reviewer
			:location "577:3-577:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "reviews"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Review
			:type Conference_Reviewed_contribution
			:location "578:3-578:74"
			:isContainer false
			:opposite has_a_review
		)]
	) ) ( def Conference_Topic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "belongs_to_a_review_reference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Topic
			:type Conference_Review_preference
			:location "582:3-582:68"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "is_a_topis_of_conference_parts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Topic
			:type Conference_Conference_part
			:location "583:3-583:116"
			:isContainer false
			:opposite has_a_track-workshop-tutorial_topic
		)]
	) ) ( def Conference_Late_paid_applicant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paid_applicant]
		:structuralFeatures[]
	) ) ( def Conference_Paid_applicant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Registeered_applicant]
		:structuralFeatures[]
	) ) ( def Conference_Early_paid_applicant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Paid_applicant]
		:structuralFeatures[]
	) ) ( def Conference_Organizer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[]
	) ) ( def Conference_Call_for_participation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[]
	) ) ( def Conference_Publisher ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "issues"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Publisher
			:type Conference_Conference_proceedings
			:location "607:3-607:77"
			:isContainer false
			:opposite has_a_publisher
		)]
	) ) ( def Conference_Registeered_applicant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_applicant]
		:structuralFeatures[]
	) ) ( def Conference_Track-workshop_chair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "was_a_track-workshop_chair_of"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Track-workshop_chair
			:type Conference_Conference_part
			:location "615:3-615:117"
			:isContainer false
			:opposite has_a_track-workshop-tutorial_chair
		)]
	) ) ( def Conference_Conference_www ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Conference_document]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_a_URL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Conference_www
			:type String
			:location "619:3-619:37"
		)]
	) ) ( def Conference_Conference_fees ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Conference_Review_preference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Conference_Thing]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "has_a_degree"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Conference_Review_preference
			:type Integer
			:location "628:3-628:41"
		) ( struct-map
			KM3_Reference
			:name "has_a_topic_or_a_submission_contribution"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Conference_Review_preference
			:type Conference_Thing
			:location "627:3-627:65"
			:isContainer false
		)]
	) ) ( def ptyp_date ( struct-map
		KM3_DataType
		:name "date"
		:location "631:2-631:16"
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "646:2-646:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "647:2-647:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "648:2-648:18"
	) )]
) )
