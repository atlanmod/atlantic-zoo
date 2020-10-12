CREATE TABLE Thing (
	__IDThing__ Integer NOT NULL,
	PRIMARY KEY Thing (__IDThing__)
) ;

CREATE TABLE "Meta-Reviewer" (
	"__IDMeta-Reviewer__" Integer NOT NULL,
	PRIMARY KEY "Meta-Reviewer" ("__IDMeta-Reviewer__")
) ;

CREATE TABLE Reviewer (
	__IDReviewer__ Integer NOT NULL,
	FOREIGN KEY "invites_co-reviewers" ("__FKinvites_co-reviewers__") REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY invited_by (__FKinvited_by__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY assignedByAdministrator (__FKassignedByAdministrator__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY adjustBid (__FKadjustBid__) REFERENCES Bid (__IDBid__),
	FOREIGN KEY readPaper (__FKreadPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY hasBeenAssigned (__FKhasBeenAssigned__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writeReview (__FKwriteReview__) REFERENCES Review (__IDReview__),
	FOREIGN KEY assignExternalReviewer (__FKassignExternalReviewer__) REFERENCES ExternalReviewer (__IDExternalReviewer__),
	PRIMARY KEY Reviewer (__IDReviewer__),
	"__FKinvites_co-reviewers__" Integer,
	__FKinvited_by__ Integer,
	__FKassignedByAdministrator__ Integer,
	__FKadjustBid__ Integer,
	__FKreadPaper__ Integer,
	__FKhasBeenAssigned__ Integer,
	__FKwriteReview__ Integer,
	__FKassignExternalReviewer__ Integer
) ;

CREATE TABLE Decision (
	__IDDecision__ Integer NOT NULL,
	PRIMARY KEY Decision (__IDDecision__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	FOREIGN KEY get (__FKget__) REFERENCES Inforamtion (__IDInforamtion__),
	FOREIGN KEY "use" (__FKuse__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY register (__FKregister__) REFERENCES Account (__IDAccount__),
	FOREIGN KEY take_part_in (__FKtake_part_in__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY "add" (__FKadd__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY send (__FKsend__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY added_by (__FKadded_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY contributes (__FKcontributes__) REFERENCES Conference_document (__IDConference_document__),
	has_an_email text,
	has_the_first_name text,
	has_gender text,
	has_the_last_name text,
	FOREIGN KEY employedBy (__FKemployedBy__) REFERENCES Organization (__IDOrganization__),
	hasHomePage text,
	hasSurname text,
	hasFax text,
	hasFirstName text,
	hasPhone text,
	hasEmail text,
	FOREIGN KEY hasConflictOfInterest (__FKhasConflictOfInterest__) REFERENCES Document (__IDDocument__),
	email text,
	PRIMARY KEY Person (__IDPerson__),
	__FKget__ Integer,
	__FKuse__ Integer,
	__FKregister__ Integer,
	__FKtake_part_in__ Integer,
	__FKadd__ Integer,
	__FKsend__ Integer,
	__FKadded_by__ Integer,
	__FKcontributes__ Integer,
	__FKemployedBy__ Integer,
	__FKhasConflictOfInterest__ Integer
) ;

CREATE TABLE Preference (
	__IDPreference__ Integer NOT NULL,
	PRIMARY KEY Preference (__IDPreference__)
) ;

CREATE TABLE ProgramCommittee (
	__IDProgramCommittee__ Integer NOT NULL,
	FOREIGN KEY hasProgramCommitteeMember (__FKhasProgramCommitteeMember__) REFERENCES ProgramCommitteeMember (__IDProgramCommitteeMember__),
	PRIMARY KEY ProgramCommittee (__IDProgramCommittee__),
	__FKhasProgramCommitteeMember__ Integer
) ;

CREATE TABLE Bid (
	__IDBid__ Integer NOT NULL,
	FOREIGN KEY adjustedBy (__FKadjustedBy__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY Bid (__IDBid__),
	__FKadjustedBy__ Integer
) ;

CREATE TABLE Conference (
	__IDConference__ Integer NOT NULL,
	FOREIGN KEY hasConferenceMember (__FKhasConferenceMember__) REFERENCES ConferenceMember (__IDConferenceMember__),
	FOREIGN KEY paperAssignmentFinalizedBy (__FKpaperAssignmentFinalizedBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY reviewCriteriaEnteredBy (__FKreviewCriteriaEnteredBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY paperAssignmentToolsRunBy (__FKpaperAssignmentToolsRunBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY virtualMeetingEnabledBy (__FKvirtualMeetingEnabledBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY hardcopyMailingManifestsPrintedBy (__FKhardcopyMailingManifestsPrintedBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY detailsEnteredBy (__FKdetailsEnteredBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY reviewerBiddingStartedBy (__FKreviewerBiddingStartedBy__) REFERENCES Administrator (__IDAdministrator__),
	date text,
	reviewsPerPaper Integer,
	logoURL text,
	acceptsHardcopySubmissions Boolean,
	siteURL text,
	PRIMARY KEY Conference (__IDConference__),
	__FKhasConferenceMember__ Integer,
	__FKpaperAssignmentFinalizedBy__ Integer,
	__FKreviewCriteriaEnteredBy__ Integer,
	__FKpaperAssignmentToolsRunBy__ Integer,
	__FKvirtualMeetingEnabledBy__ Integer,
	__FKhardcopyMailingManifestsPrintedBy__ Integer,
	__FKdetailsEnteredBy__ Integer,
	__FKreviewerBiddingStartedBy__ Integer
) ;

CREATE TABLE ConferenceChair (
	__IDConferenceChair__ Integer NOT NULL,
	PRIMARY KEY ConferenceChair (__IDConferenceChair__)
) ;

CREATE TABLE ConferenceMember (
	__IDConferenceMember__ Integer NOT NULL,
	FOREIGN KEY memberOfConference (__FKmemberOfConference__) REFERENCES Conference (__IDConference__),
	PRIMARY KEY ConferenceMember (__IDConferenceMember__),
	__FKmemberOfConference__ Integer
) ;

CREATE TABLE AssociatedChair (
	__IDAssociatedChair__ Integer NOT NULL,
	PRIMARY KEY AssociatedChair (__IDAssociatedChair__)
) ;

CREATE TABLE ProgramCommitteeMember (
	__IDProgramCommitteeMember__ Integer NOT NULL,
	FOREIGN KEY memberOfProgramCommittee (__FKmemberOfProgramCommittee__) REFERENCES ProgramCommittee (__IDProgramCommittee__),
	maxPapers Integer,
	FOREIGN KEY addedBy (__FKaddedBy__) REFERENCES Administrator (__IDAdministrator__),
	PRIMARY KEY ProgramCommitteeMember (__IDProgramCommitteeMember__),
	__FKmemberOfProgramCommittee__ Integer,
	__FKaddedBy__ Integer
) ;

CREATE TABLE AuthorNotReviewer (
	__IDAuthorNotReviewer__ Integer NOT NULL,
	PRIMARY KEY AuthorNotReviewer (__IDAuthorNotReviewer__)
) ;

CREATE TABLE SubjectArea (
	__IDSubjectArea__ Integer NOT NULL,
	PRIMARY KEY SubjectArea (__IDSubjectArea__)
) ;

CREATE TABLE ExternalReviewer (
	__IDExternalReviewer__ Integer NOT NULL,
	FOREIGN KEY assignedByReviewer (__FKassignedByReviewer__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY ExternalReviewer (__IDExternalReviewer__),
	__FKassignedByReviewer__ Integer
) ;

CREATE TABLE Chairman (
	__IDChairman__ Integer NOT NULL,
	PRIMARY KEY Chairman (__IDChairman__)
) ;

CREATE TABLE ProgramCommitteeChair (
	__IDProgramCommitteeChair__ Integer NOT NULL,
	FOREIGN KEY endReview (__FKendReview__) REFERENCES Review (__IDReview__),
	PRIMARY KEY ProgramCommitteeChair (__IDProgramCommitteeChair__),
	__FKendReview__ Integer
) ;

CREATE TABLE Acceptance (
	__IDAcceptance__ Integer NOT NULL,
	PRIMARY KEY Acceptance (__IDAcceptance__)
) ;

CREATE TABLE Rejection (
	__IDRejection__ Integer NOT NULL,
	PRIMARY KEY Rejection (__IDRejection__)
) ;

CREATE TABLE Review (
	__IDReview__ Integer NOT NULL,
	FOREIGN KEY reviews (__FKreviews__) REFERENCES Reviewed_contribution (__IDReviewed_contribution__),
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY Review (__IDReview__),
	__FKreviews__ Integer,
	__FKwrittenBy__ Integer
) ;

CREATE TABLE Paper (
	__IDPaper__ Integer NOT NULL,
	FOREIGN KEY "hasCo-author" ("__FKhasCo-author__") REFERENCES "Co-author" ("__IDCo-author__"),
	FOREIGN KEY hasBid (__FKhasBid__) REFERENCES Bid (__IDBid__),
	FOREIGN KEY hasDecision (__FKhasDecision__) REFERENCES Decision (__IDDecision__),
	FOREIGN KEY assignedTo (__FKassignedTo__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY hasSubjectArea (__FKhasSubjectArea__) REFERENCES SubjectArea (__IDSubjectArea__),
	FOREIGN KEY readByReviewer (__FKreadByReviewer__) REFERENCES Reviewer (__IDReviewer__),
	paperID text,
	title text,
	FOREIGN KEY hasAuthor (__FKhasAuthor__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY acceptedBy (__FKacceptedBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY rejectedBy (__FKrejectedBy__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY "readByMeta-Reviewer" ("__FKreadByMeta-Reviewer__") REFERENCES "Meta-Reviewer" ("__IDMeta-Reviewer__"),
	PRIMARY KEY Paper (__IDPaper__),
	"__FKhasCo-author__" Integer,
	__FKhasBid__ Integer,
	__FKhasDecision__ Integer,
	__FKassignedTo__ Integer,
	__FKhasSubjectArea__ Integer,
	__FKreadByReviewer__ Integer,
	__FKhasAuthor__ Integer,
	__FKacceptedBy__ Integer,
	__FKrejectedBy__ Integer,
	"__FKreadByMeta-Reviewer__" Integer
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	FOREIGN KEY writes (__FKwrites__) REFERENCES Contribution (__IDContribution__),
	FOREIGN KEY submitPaper (__FKsubmitPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writePaper (__FKwritePaper__) REFERENCES Paper (__IDPaper__),
	PRIMARY KEY Author (__IDAuthor__),
	__FKwrites__ Integer,
	__FKsubmitPaper__ Integer,
	__FKwritePaper__ Integer
) ;

CREATE TABLE "Co-author" (
	"__IDCo-author__" Integer NOT NULL,
	FOREIGN KEY "co-writePaper" ("__FKco-writePaper__") REFERENCES Paper (__IDPaper__),
	PRIMARY KEY "Co-author" ("__IDCo-author__"),
	"__FKco-writePaper__" Integer
) ;

CREATE TABLE PaperAbstract (
	__IDPaperAbstract__ Integer NOT NULL,
	PRIMARY KEY PaperAbstract (__IDPaperAbstract__)
) ;

CREATE TABLE PaperFullVersion (
	__IDPaperFullVersion__ Integer NOT NULL,
	PRIMARY KEY PaperFullVersion (__IDPaperFullVersion__)
) ;

CREATE TABLE Administrator (
	__IDAdministrator__ Integer NOT NULL,
	FOREIGN KEY approve (__FKapprove__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY assign (__FKassign__) REFERENCES Role (__IDRole__),
	FOREIGN KEY finalizePaperAssignment (__FKfinalizePaperAssignment__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY runPaperAssignmentTools (__FKrunPaperAssignmentTools__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY enableVirtualMeeting (__FKenableVirtualMeeting__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY startReviewerBidding (__FKstartReviewerBidding__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY assignReviewer (__FKassignReviewer__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY rejectPaper (__FKrejectPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY enterConferenceDetails (__FKenterConferenceDetails__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY printHardcopyMailingManifests (__FKprintHardcopyMailingManifests__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY setMaxPapers (__FKsetMaxPapers__) REFERENCES ProgramCommitteeMember (__IDProgramCommitteeMember__),
	FOREIGN KEY enterReviewCriteria (__FKenterReviewCriteria__) REFERENCES Conference (__IDConference__),
	FOREIGN KEY acceptPaper (__FKacceptPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY addProgramCommitteeMember (__FKaddProgramCommitteeMember__) REFERENCES ProgramCommitteeMember (__IDProgramCommitteeMember__),
	PRIMARY KEY Administrator (__IDAdministrator__),
	__FKapprove__ Integer,
	__FKassign__ Integer,
	__FKfinalizePaperAssignment__ Integer,
	__FKrunPaperAssignmentTools__ Integer,
	__FKenableVirtualMeeting__ Integer,
	__FKstartReviewerBidding__ Integer,
	__FKassignReviewer__ Integer,
	__FKrejectPaper__ Integer,
	__FKenterConferenceDetails__ Integer,
	__FKprintHardcopyMailingManifests__ Integer,
	__FKsetMaxPapers__ Integer,
	__FKenterReviewCriteria__ Integer,
	__FKacceptPaper__ Integer,
	__FKaddProgramCommitteeMember__ Integer
) ;

CREATE TABLE "Meta-Review" (
	"__IDMeta-Review__" Integer NOT NULL,
	PRIMARY KEY "Meta-Review" ("__IDMeta-Review__")
) ;

CREATE TABLE Workshop (
	__IDWorkshop__ Integer NOT NULL,
	PRIMARY KEY Workshop (__IDWorkshop__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	FOREIGN KEY conists_of (__FKconists_of__) REFERENCES Event_Tracks (__IDEvent_Tracks__),
	FOREIGN KEY confirmed_by (__FKconfirmed_by__) REFERENCES Approval_Email (__IDApproval_Email__),
	FOREIGN KEY defined_by (__FKdefined_by__) REFERENCES Event_Setup (__IDEvent_Setup__),
	FOREIGN KEY approved_by (__FKapproved_by__) REFERENCES Administrator (__IDAdministrator__),
	starts_on text,
	ends_on text,
	PRIMARY KEY Event (__IDEvent__),
	__FKconists_of__ Integer,
	__FKconfirmed_by__ Integer,
	__FKdefined_by__ Integer,
	__FKapproved_by__ Integer
) ;

CREATE TABLE Account (
	__IDAccount__ Integer NOT NULL,
	FOREIGN KEY registred_by (__FKregistred_by__) REFERENCES Person (__IDPerson__),
	PRIMARY KEY Account (__IDAccount__),
	__FKregistred_by__ Integer
) ;

CREATE TABLE Inforamtion (
	__IDInforamtion__ Integer NOT NULL,
	PRIMARY KEY Inforamtion (__IDInforamtion__)
) ;

CREATE TABLE User (
	__IDUser__ Integer NOT NULL,
	FOREIGN KEY recieve (__FKrecieve__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY submit (__FKsubmit__) REFERENCES Document (__IDDocument__),
	PRIMARY KEY User (__IDUser__),
	__FKrecieve__ Integer,
	__FKsubmit__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY assigned_by (__FKassigned_by__) REFERENCES Administrator (__IDAdministrator__),
	PRIMARY KEY Role (__IDRole__),
	__FKassigned_by__ Integer
) ;

CREATE TABLE Help_Request (
	__IDHelp_Request__ Integer NOT NULL,
	PRIMARY KEY Help_Request (__IDHelp_Request__)
) ;

CREATE TABLE Symposium (
	__IDSymposium__ Integer NOT NULL,
	PRIMARY KEY Symposium (__IDSymposium__)
) ;

CREATE TABLE Abstract (
	__IDAbstract__ Integer NOT NULL,
	PRIMARY KEY Abstract (__IDAbstract__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	FOREIGN KEY recieved_by (__FKrecieved_by__) REFERENCES User (__IDUser__),
	FOREIGN KEY used_by (__FKused_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY submited__by (__FKsubmited__by__) REFERENCES User (__IDUser__),
	PRIMARY KEY Document (__IDDocument__),
	__FKrecieved_by__ Integer,
	__FKused_by__ Integer,
	__FKsubmited__by__ Integer
) ;

CREATE TABLE Invited_Paper (
	__IDInvited_Paper__ Integer NOT NULL,
	PRIMARY KEY Invited_Paper (__IDInvited_Paper__)
) ;

CREATE TABLE Admin_Role (
	__IDAdmin_Role__ Integer NOT NULL,
	PRIMARY KEY Admin_Role (__IDAdmin_Role__)
) ;

CREATE TABLE Paper_Typologies (
	__IDPaper_Typologies__ Integer NOT NULL,
	PRIMARY KEY Paper_Typologies (__IDPaper_Typologies__)
) ;

CREATE TABLE Event_Setup (
	__IDEvent_Setup__ Integer NOT NULL,
	FOREIGN KEY define (__FKdefine__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Event_Setup (__IDEvent_Setup__),
	__FKdefine__ Integer
) ;

CREATE TABLE Event_URL (
	__IDEvent_URL__ Integer NOT NULL,
	FOREIGN KEY concerned (__FKconcerned__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Event_URL (__IDEvent_URL__),
	__FKconcerned__ Integer
) ;

CREATE TABLE URL (
	__IDURL__ Integer NOT NULL,
	PRIMARY KEY URL (__IDURL__)
) ;

CREATE TABLE Notification_Email (
	__IDNotification_Email__ Integer NOT NULL,
	PRIMARY KEY Notification_Email (__IDNotification_Email__)
) ;

CREATE TABLE Email (
	__IDEmail__ Integer NOT NULL,
	PRIMARY KEY Email (__IDEmail__)
) ;

CREATE TABLE Short_Paper (
	__IDShort_Paper__ Integer NOT NULL,
	PRIMARY KEY Short_Paper (__IDShort_Paper__)
) ;

CREATE TABLE Author_Role (
	__IDAuthor_Role__ Integer NOT NULL,
	PRIMARY KEY Author_Role (__IDAuthor_Role__)
) ;

CREATE TABLE Preview (
	__IDPreview__ Integer NOT NULL,
	PRIMARY KEY Preview (__IDPreview__)
) ;

CREATE TABLE Review_Form (
	__IDReview_Form__ Integer NOT NULL,
	PRIMARY KEY Review_Form (__IDReview_Form__)
) ;

CREATE TABLE Committe_Role (
	__IDCommitte_Role__ Integer NOT NULL,
	PRIMARY KEY Committe_Role (__IDCommitte_Role__)
) ;

CREATE TABLE Group_Email (
	__IDGroup_Email__ Integer NOT NULL,
	PRIMARY KEY Group_Email (__IDGroup_Email__)
) ;

CREATE TABLE Submission_Template (
	__IDSubmission_Template__ Integer NOT NULL,
	PRIMARY KEY Submission_Template (__IDSubmission_Template__)
) ;

CREATE TABLE Review_Form_Setup (
	__IDReview_Form_Setup__ Integer NOT NULL,
	PRIMARY KEY Review_Form_Setup (__IDReview_Form_Setup__)
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE Event_Creation (
	__IDEvent_Creation__ Integer NOT NULL,
	PRIMARY KEY Event_Creation (__IDEvent_Creation__)
) ;

CREATE TABLE Approval_Email (
	__IDApproval_Email__ Integer NOT NULL,
	FOREIGN KEY confirm (__FKconfirm__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Approval_Email (__IDApproval_Email__),
	__FKconfirm__ Integer
) ;

CREATE TABLE Rejection_Email (
	__IDRejection_Email__ Integer NOT NULL,
	PRIMARY KEY Rejection_Email (__IDRejection_Email__)
) ;

CREATE TABLE Submission (
	__IDSubmission__ Integer NOT NULL,
	PRIMARY KEY Submission (__IDSubmission__)
) ;

CREATE TABLE Template (
	__IDTemplate__ Integer NOT NULL,
	PRIMARY KEY Template (__IDTemplate__)
) ;

CREATE TABLE Feature_Request (
	__IDFeature_Request__ Integer NOT NULL,
	PRIMARY KEY Feature_Request (__IDFeature_Request__)
) ;

CREATE TABLE Event_Tracks (
	__IDEvent_Tracks__ Integer NOT NULL,
	PRIMARY KEY Event_Tracks (__IDEvent_Tracks__)
) ;

CREATE TABLE Request (
	__IDRequest__ Integer NOT NULL,
	PRIMARY KEY Request (__IDRequest__)
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	FOREIGN KEY sent_by (__FKsent_by__) REFERENCES Person (__IDPerson__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKsent_by__ Integer
) ;

CREATE TABLE Head_Role (
	__IDHead_Role__ Integer NOT NULL,
	PRIMARY KEY Head_Role (__IDHead_Role__)
) ;

CREATE TABLE Detail (
	__IDDetail__ Integer NOT NULL,
	PRIMARY KEY Detail (__IDDetail__)
) ;

CREATE TABLE Corresponding_Author (
	__IDCorresponding_Author__ Integer NOT NULL,
	PRIMARY KEY Corresponding_Author (__IDCorresponding_Author__)
) ;

CREATE TABLE Reviewer_Role (
	__IDReviewer_Role__ Integer NOT NULL,
	PRIMARY KEY Reviewer_Role (__IDReviewer_Role__)
) ;

CREATE TABLE Event_Approval (
	__IDEvent_Approval__ Integer NOT NULL,
	PRIMARY KEY Event_Approval (__IDEvent_Approval__)
) ;

CREATE TABLE Registration (
	__IDRegistration__ Integer NOT NULL,
	PRIMARY KEY Registration (__IDRegistration__)
) ;

CREATE TABLE Full_Paper (
	__IDFull_Paper__ Integer NOT NULL,
	PRIMARY KEY Full_Paper (__IDFull_Paper__)
) ;

CREATE TABLE Research_Topic (
	__IDResearch_Topic__ Integer NOT NULL,
	PRIMARY KEY Research_Topic (__IDResearch_Topic__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Assistance (
	__IDAssistance__ Integer NOT NULL,
	PRIMARY KEY Assistance (__IDAssistance__)
) ;

CREATE TABLE Email_Template (
	__IDEmail_Template__ Integer NOT NULL,
	PRIMARY KEY Email_Template (__IDEmail_Template__)
) ;

CREATE TABLE Conference_participant (
	__IDConference_participant__ Integer NOT NULL,
	PRIMARY KEY Conference_participant (__IDConference_participant__)
) ;

CREATE TABLE Active_conference_participant (
	__IDActive_conference_participant__ Integer NOT NULL,
	FOREIGN KEY gives_presentations (__FKgives_presentations__) REFERENCES Presentation (__IDPresentation__),
	PRIMARY KEY Active_conference_participant (__IDActive_conference_participant__),
	__FKgives_presentations__ Integer
) ;

CREATE TABLE Passive_conference_participant (
	__IDPassive_conference_participant__ Integer NOT NULL,
	PRIMARY KEY Passive_conference_participant (__IDPassive_conference_participant__)
) ;

CREATE TABLE Review_expertise (
	__IDReview_expertise__ Integer NOT NULL,
	FOREIGN KEY has_a_submitted_contribution (__FKhas_a_submitted_contribution__) REFERENCES Submitted_contribution (__IDSubmitted_contribution__),
	has_an_expertise text,
	PRIMARY KEY Review_expertise (__IDReview_expertise__),
	__FKhas_a_submitted_contribution__ Integer
) ;

CREATE TABLE Submitted_contribution (
	__IDSubmitted_contribution__ Integer NOT NULL,
	FOREIGN KEY has_a_review_expertise (__FKhas_a_review_expertise__) REFERENCES Review_expertise (__IDReview_expertise__),
	PRIMARY KEY Submitted_contribution (__IDSubmitted_contribution__),
	__FKhas_a_review_expertise__ Integer
) ;

CREATE TABLE Regular_author (
	__IDRegular_author__ Integer NOT NULL,
	PRIMARY KEY Regular_author (__IDRegular_author__)
) ;

CREATE TABLE Conference_contributor (
	__IDConference_contributor__ Integer NOT NULL,
	PRIMARY KEY Conference_contributor (__IDConference_contributor__)
) ;

CREATE TABLE "Contribution_1th-author" (
	"__IDContribution_1th-author__" Integer NOT NULL,
	PRIMARY KEY "Contribution_1th-author" ("__IDContribution_1th-author__")
) ;

CREATE TABLE "Contribution_co-author" (
	"__IDContribution_co-author__" Integer NOT NULL,
	PRIMARY KEY "Contribution_co-author" ("__IDContribution_co-author__")
) ;

CREATE TABLE Conference_contribution (
	__IDConference_contribution__ Integer NOT NULL,
	FOREIGN KEY is_submitted_at (__FKis_submitted_at__) REFERENCES Conference_volume (__IDConference_volume__),
	PRIMARY KEY Conference_contribution (__IDConference_contribution__),
	__FKis_submitted_at__ Integer
) ;

CREATE TABLE "Co-chair" (
	"__IDCo-chair__" Integer NOT NULL,
	FOREIGN KEY "was_a_committe_co-chair_of" ("__FKwas_a_committe_co-chair_of__") REFERENCES Committee (__IDCommittee__),
	PRIMARY KEY "Co-chair" ("__IDCo-chair__"),
	"__FKwas_a_committe_co-chair_of__" Integer
) ;

CREATE TABLE Committee (
	__IDCommittee__ Integer NOT NULL,
	FOREIGN KEY has_members (__FKhas_members__) REFERENCES Committee_member (__IDCommittee_member__),
	FOREIGN KEY was_a_committee_of (__FKwas_a_committee_of__) REFERENCES Conference_volume (__IDConference_volume__),
	FOREIGN KEY "has_a_committee_co-chair" ("__FKhas_a_committee_co-chair__") REFERENCES "Co-chair" ("__IDCo-chair__"),
	FOREIGN KEY has_a_committee_chair (__FKhas_a_committee_chair__) REFERENCES Chair (__IDChair__),
	PRIMARY KEY Committee (__IDCommittee__),
	__FKhas_members__ Integer,
	__FKwas_a_committee_of__ Integer,
	"__FKhas_a_committee_co-chair__" Integer,
	__FKhas_a_committee_chair__ Integer
) ;

CREATE TABLE Committee_member (
	__IDCommittee_member__ Integer NOT NULL,
	FOREIGN KEY was_a_member_of (__FKwas_a_member_of__) REFERENCES Committee (__IDCommittee__),
	PRIMARY KEY Committee_member (__IDCommittee_member__),
	__FKwas_a_member_of__ Integer
) ;

CREATE TABLE Abstract (
	__IDAbstract__ Integer NOT NULL,
	PRIMARY KEY Abstract (__IDAbstract__)
) ;

CREATE TABLE Extended_abstract (
	__IDExtended_abstract__ Integer NOT NULL,
	PRIMARY KEY Extended_abstract (__IDExtended_abstract__)
) ;

CREATE TABLE Important_dates (
	__IDImportant_dates__ Integer NOT NULL,
	is_an_abstract_submission_date text,
	is_a_full_paper_submission_date text,
	is_an_ending_date text,
	is_a_date_of_acceptance_announcement text,
	is_a_date_of_camera_ready_paper_submission text,
	is_a_starting_date text,
	FOREIGN KEY belong_to_a_conference_volume (__FKbelong_to_a_conference_volume__) REFERENCES Conference_volume (__IDConference_volume__),
	PRIMARY KEY Important_dates (__IDImportant_dates__),
	__FKbelong_to_a_conference_volume__ Integer
) ;

CREATE TABLE Invited_speaker (
	__IDInvited_speaker__ Integer NOT NULL,
	PRIMARY KEY Invited_speaker (__IDInvited_speaker__)
) ;

CREATE TABLE Conference_proceedings (
	__IDConference_proceedings__ Integer NOT NULL,
	has_an_ISBN text,
	FOREIGN KEY has_a_publisher (__FKhas_a_publisher__) REFERENCES Publisher (__IDPublisher__),
	has_a_volume Integer,
	PRIMARY KEY Conference_proceedings (__IDConference_proceedings__),
	__FKhas_a_publisher__ Integer
) ;

CREATE TABLE Information_for_participants (
	__IDInformation_for_participants__ Integer NOT NULL,
	PRIMARY KEY Information_for_participants (__IDInformation_for_participants__)
) ;

CREATE TABLE Conference_document (
	__IDConference_document__ Integer NOT NULL,
	FOREIGN KEY has_authors (__FKhas_authors__) REFERENCES Person (__IDPerson__),
	has_a_date_of_issue text,
	PRIMARY KEY Conference_document (__IDConference_document__),
	__FKhas_authors__ Integer
) ;

CREATE TABLE Regular_contribution (
	__IDRegular_contribution__ Integer NOT NULL,
	PRIMARY KEY Regular_contribution (__IDRegular_contribution__)
) ;

CREATE TABLE Poster (
	__IDPoster__ Integer NOT NULL,
	PRIMARY KEY Poster (__IDPoster__)
) ;

CREATE TABLE Written_contribution (
	__IDWritten_contribution__ Integer NOT NULL,
	PRIMARY KEY Written_contribution (__IDWritten_contribution__)
) ;

CREATE TABLE Conference_applicant (
	__IDConference_applicant__ Integer NOT NULL,
	PRIMARY KEY Conference_applicant (__IDConference_applicant__)
) ;

CREATE TABLE Camera_ready_contribution (
	__IDCamera_ready_contribution__ Integer NOT NULL,
	PRIMARY KEY Camera_ready_contribution (__IDCamera_ready_contribution__)
) ;

CREATE TABLE Accepted_contribution (
	__IDAccepted_contribution__ Integer NOT NULL,
	PRIMARY KEY Accepted_contribution (__IDAccepted_contribution__)
) ;

CREATE TABLE Program_committee (
	__IDProgram_committee__ Integer NOT NULL,
	FOREIGN KEY was_a_program_committee_of (__FKwas_a_program_committee_of__) REFERENCES Conference_volume (__IDConference_volume__),
	PRIMARY KEY Program_committee (__IDProgram_committee__),
	__FKwas_a_program_committee_of__ Integer
) ;

CREATE TABLE Organizing_committee (
	__IDOrganizing_committee__ Integer NOT NULL,
	FOREIGN KEY was_an_organizing_committee_of (__FKwas_an_organizing_committee_of__) REFERENCES Conference_volume (__IDConference_volume__),
	PRIMARY KEY Organizing_committee (__IDOrganizing_committee__),
	__FKwas_an_organizing_committee_of__ Integer
) ;

CREATE TABLE Steering_committee (
	__IDSteering_committee__ Integer NOT NULL,
	FOREIGN KEY was_a_steering_committee_of (__FKwas_a_steering_committee_of__) REFERENCES Conference_volume (__IDConference_volume__),
	PRIMARY KEY Steering_committee (__IDSteering_committee__),
	__FKwas_a_steering_committee_of__ Integer
) ;

CREATE TABLE Conference_volume (
	__IDConference_volume__ Integer NOT NULL,
	FOREIGN KEY has_parts (__FKhas_parts__) REFERENCES Conference_part (__IDConference_part__),
	FOREIGN KEY has_workshops (__FKhas_workshops__) REFERENCES Workshop (__IDWorkshop__),
	FOREIGN KEY has_tracks (__FKhas_tracks__) REFERENCES Track (__IDTrack__),
	FOREIGN KEY has_tutorials (__FKhas_tutorials__) REFERENCES Tutorial (__IDTutorial__),
	FOREIGN KEY has_a_commtitee (__FKhas_a_commtitee__) REFERENCES Committee (__IDCommittee__),
	FOREIGN KEY has_a_steering_committee (__FKhas_a_steering_committee__) REFERENCES Steering_committee (__IDSteering_committee__),
	FOREIGN KEY has_an_organizing_committee (__FKhas_an_organizing_committee__) REFERENCES Organizing_committee (__IDOrganizing_committee__),
	FOREIGN KEY has_important_dates (__FKhas_important_dates__) REFERENCES Important_dates (__IDImportant_dates__),
	FOREIGN KEY has_contributions (__FKhas_contributions__) REFERENCES Conference_contribution (__IDConference_contribution__),
	has_a_location text,
	FOREIGN KEY has_a_program_committee (__FKhas_a_program_committee__) REFERENCES Program_committee (__IDProgram_committee__),
	PRIMARY KEY Conference_volume (__IDConference_volume__),
	__FKhas_parts__ Integer,
	__FKhas_workshops__ Integer,
	__FKhas_tracks__ Integer,
	__FKhas_tutorials__ Integer,
	__FKhas_a_commtitee__ Integer,
	__FKhas_a_steering_committee__ Integer,
	__FKhas_an_organizing_committee__ Integer,
	__FKhas_important_dates__ Integer,
	__FKhas_contributions__ Integer,
	__FKhas_a_program_committee__ Integer
) ;

CREATE TABLE Call_for_paper (
	__IDCall_for_paper__ Integer NOT NULL,
	PRIMARY KEY Call_for_paper (__IDCall_for_paper__)
) ;

CREATE TABLE Conference_announcement (
	__IDConference_announcement__ Integer NOT NULL,
	PRIMARY KEY Conference_announcement (__IDConference_announcement__)
) ;

CREATE TABLE Invited_talk (
	__IDInvited_talk__ Integer NOT NULL,
	PRIMARY KEY Invited_talk (__IDInvited_talk__)
) ;

CREATE TABLE Conference_part (
	__IDConference_part__ Integer NOT NULL,
	FOREIGN KEY "has_a_track-workshop-tutorial_topic" ("__FKhas_a_track-workshop-tutorial_topic__") REFERENCES Topic (__IDTopic__),
	FOREIGN KEY is_part_of_conference_volumes (__FKis_part_of_conference_volumes__) REFERENCES Conference_volume (__IDConference_volume__),
	FOREIGN KEY "has_a_track-workshop-tutorial_chair" ("__FKhas_a_track-workshop-tutorial_chair__") REFERENCES "Track-workshop_chair" ("__IDTrack-workshop_chair__"),
	PRIMARY KEY Conference_part (__IDConference_part__),
	"__FKhas_a_track-workshop-tutorial_topic__" Integer,
	__FKis_part_of_conference_volumes__ Integer,
	"__FKhas_a_track-workshop-tutorial_chair__" Integer
) ;

CREATE TABLE Presentation (
	__IDPresentation__ Integer NOT NULL,
	FOREIGN KEY is_given_by (__FKis_given_by__) REFERENCES Active_conference_participant (__IDActive_conference_participant__),
	PRIMARY KEY Presentation (__IDPresentation__),
	__FKis_given_by__ Integer
) ;

CREATE TABLE Chair (
	__IDChair__ Integer NOT NULL,
	FOREIGN KEY was_a_committee_chair_of (__FKwas_a_committee_chair_of__) REFERENCES Committee (__IDCommittee__),
	PRIMARY KEY Chair (__IDChair__),
	__FKwas_a_committee_chair_of__ Integer
) ;

CREATE TABLE Track (
	__IDTrack__ Integer NOT NULL,
	PRIMARY KEY Track (__IDTrack__)
) ;

CREATE TABLE Rejected_contribution (
	__IDRejected_contribution__ Integer NOT NULL,
	PRIMARY KEY Rejected_contribution (__IDRejected_contribution__)
) ;

CREATE TABLE Reviewed_contribution (
	__IDReviewed_contribution__ Integer NOT NULL,
	FOREIGN KEY has_a_review (__FKhas_a_review__) REFERENCES Review (__IDReview__),
	PRIMARY KEY Reviewed_contribution (__IDReviewed_contribution__),
	__FKhas_a_review__ Integer
) ;

CREATE TABLE Topic (
	__IDTopic__ Integer NOT NULL,
	FOREIGN KEY belongs_to_a_review_reference (__FKbelongs_to_a_review_reference__) REFERENCES Review_preference (__IDReview_preference__),
	FOREIGN KEY is_a_topis_of_conference_parts (__FKis_a_topis_of_conference_parts__) REFERENCES Conference_part (__IDConference_part__),
	PRIMARY KEY Topic (__IDTopic__),
	__FKbelongs_to_a_review_reference__ Integer,
	__FKis_a_topis_of_conference_parts__ Integer
) ;

CREATE TABLE Late_paid_applicant (
	__IDLate_paid_applicant__ Integer NOT NULL,
	PRIMARY KEY Late_paid_applicant (__IDLate_paid_applicant__)
) ;

CREATE TABLE Paid_applicant (
	__IDPaid_applicant__ Integer NOT NULL,
	PRIMARY KEY Paid_applicant (__IDPaid_applicant__)
) ;

CREATE TABLE Early_paid_applicant (
	__IDEarly_paid_applicant__ Integer NOT NULL,
	PRIMARY KEY Early_paid_applicant (__IDEarly_paid_applicant__)
) ;

CREATE TABLE Organizer (
	__IDOrganizer__ Integer NOT NULL,
	PRIMARY KEY Organizer (__IDOrganizer__)
) ;

CREATE TABLE Call_for_participation (
	__IDCall_for_participation__ Integer NOT NULL,
	PRIMARY KEY Call_for_participation (__IDCall_for_participation__)
) ;

CREATE TABLE Publisher (
	__IDPublisher__ Integer NOT NULL,
	FOREIGN KEY issues (__FKissues__) REFERENCES Conference_proceedings (__IDConference_proceedings__),
	PRIMARY KEY Publisher (__IDPublisher__),
	__FKissues__ Integer
) ;

CREATE TABLE Registeered_applicant (
	__IDRegisteered_applicant__ Integer NOT NULL,
	PRIMARY KEY Registeered_applicant (__IDRegisteered_applicant__)
) ;

CREATE TABLE "Track-workshop_chair" (
	"__IDTrack-workshop_chair__" Integer NOT NULL,
	FOREIGN KEY "was_a_track-workshop_chair_of" ("__FKwas_a_track-workshop_chair_of__") REFERENCES Conference_part (__IDConference_part__),
	PRIMARY KEY "Track-workshop_chair" ("__IDTrack-workshop_chair__"),
	"__FKwas_a_track-workshop_chair_of__" Integer
) ;

CREATE TABLE Conference_www (
	__IDConference_www__ Integer NOT NULL,
	has_a_URL text,
	PRIMARY KEY Conference_www (__IDConference_www__)
) ;

CREATE TABLE Conference_fees (
	__IDConference_fees__ Integer NOT NULL,
	PRIMARY KEY Conference_fees (__IDConference_fees__)
) ;

CREATE TABLE Review_preference (
	__IDReview_preference__ Integer NOT NULL,
	has_a_degree Integer,
	PRIMARY KEY Review_preference (__IDReview_preference__)
) ;

CREATE TABLE Accepted_Paper (
	__IDAccepted_Paper__ Integer NOT NULL,
	PRIMARY KEY Accepted_Paper (__IDAccepted_Paper__)
) ;

CREATE TABLE paper (
	__IDpaper__ Integer NOT NULL,
	full_paper_size Integer,
	FOREIGN KEY has_author (__FKhas_author__) REFERENCES human (__IDhuman__),
	PRIMARY KEY paper (__IDpaper__),
	__FKhas_author__ Integer
) ;

CREATE TABLE Rejected_Paper (
	__IDRejected_Paper__ Integer NOT NULL,
	PRIMARY KEY Rejected_Paper (__IDRejected_Paper__)
) ;

CREATE TABLE Undecided_Paper (
	__IDUndecided_Paper__ Integer NOT NULL,
	PRIMARY KEY Undecided_Paper (__IDUndecided_Paper__)
) ;

CREATE TABLE Manual_Paper_Assignment (
	__IDManual_Paper_Assignment__ Integer NOT NULL,
	PRIMARY KEY Manual_Paper_Assignment (__IDManual_Paper_Assignment__)
) ;

CREATE TABLE Program_Committee_member (
	__IDProgram_Committee_member__ Integer NOT NULL,
	PRIMARY KEY Program_Committee_member (__IDProgram_Committee_member__)
) ;

CREATE TABLE paper_assignment (
	__IDpaper_assignment__ Integer NOT NULL,
	FOREIGN KEY assign_paper (__FKassign_paper__) REFERENCES Program_Committee_member (__IDProgram_Committee_member__),
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY paper_assignment (__IDpaper_assignment__),
	__FKassign_paper__ Integer,
	__FKis_performed_by__ Integer
) ;

CREATE TABLE intensity (
	__IDintensity__ Integer NOT NULL,
	PRIMARY KEY intensity (__IDintensity__)
) ;

CREATE TABLE "start_date_of_camera-ready_submission" (
	"__IDstart_date_of_camera-ready_submission__" Integer NOT NULL,
	PRIMARY KEY "start_date_of_camera-ready_submission" ("__IDstart_date_of_camera-ready_submission__")
) ;

CREATE TABLE "camera-ready_submission_date" (
	"__IDcamera-ready_submission_date__" Integer NOT NULL,
	PRIMARY KEY "camera-ready_submission_date" ("__IDcamera-ready_submission_date__")
) ;

CREATE TABLE date_of_notification (
	__IDdate_of_notification__ Integer NOT NULL,
	PRIMARY KEY date_of_notification (__IDdate_of_notification__)
) ;

CREATE TABLE date (
	__IDdate__ Integer NOT NULL,
	PRIMARY KEY date (__IDdate__)
) ;

CREATE TABLE article (
	__IDarticle__ Integer NOT NULL,
	FOREIGN KEY article_written_by (__FKarticle_written_by__) REFERENCES author (__IDauthor__),
	FOREIGN KEY has_reviewer (__FKhas_reviewer__) REFERENCES reviewer (__IDreviewer__),
	FOREIGN KEY has_abstract (__FKhas_abstract__) REFERENCES abstract (__IDabstract__),
	FOREIGN KEY goes_through (__FKgoes_through__) REFERENCES activity (__IDactivity__),
	FOREIGN KEY is_sent_to (__FKis_sent_to__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES activity (__IDactivity__),
	FOREIGN KEY structure_created_by (__FKstructure_created_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY has_author (__FKhas_author__) REFERENCES human (__IDhuman__),
	FOREIGN KEY gives_classification (__FKgives_classification__) REFERENCES classification (__IDclassification__),
	PRIMARY KEY article (__IDarticle__),
	__FKarticle_written_by__ Integer,
	__FKhas_reviewer__ Integer,
	__FKhas_abstract__ Integer,
	__FKgoes_through__ Integer,
	__FKis_sent_to__ Integer,
	__FKis_created_in__ Integer,
	__FKstructure_created_by__ Integer,
	__FKhas_author__ Integer,
	__FKgives_classification__ Integer
) ;

CREATE TABLE Contact_Person (
	__IDContact_Person__ Integer NOT NULL,
	PRIMARY KEY Contact_Person (__IDContact_Person__)
) ;

CREATE TABLE conference (
	__IDconference__ Integer NOT NULL,
	FOREIGN KEY has_program (__FKhas_program__) REFERENCES program (__IDprogram__),
	FOREIGN KEY is_in_phase (__FKis_in_phase__) REFERENCES phase_of_conference (__IDphase_of_conference__),
	PRIMARY KEY conference (__IDconference__),
	__FKhas_program__ Integer,
	__FKis_in_phase__ Integer
) ;

CREATE TABLE bidding_of_reviewer (
	__IDbidding_of_reviewer__ Integer NOT NULL,
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY bidding_of_reviewer (__IDbidding_of_reviewer__),
	__FKis_performed_by__ Integer
) ;

CREATE TABLE activity (
	__IDactivity__ Integer NOT NULL,
	FOREIGN KEY is_followed_by (__FKis_followed_by__) REFERENCES activity (__IDactivity__),
	FOREIGN KEY is_monitored_by (__FKis_monitored_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY has_intensity (__FKhas_intensity__) REFERENCES intensity (__IDintensity__),
	FOREIGN KEY has_result (__FKhas_result__) REFERENCES article (__IDarticle__),
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_supervised_by (__FKis_supervised_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY activity (__IDactivity__),
	__FKis_followed_by__ Integer,
	__FKis_monitored_by__ Integer,
	__FKhas_intensity__ Integer,
	__FKhas_result__ Integer,
	__FKis_performed_by__ Integer,
	__FKis_supervised_by__ Integer
) ;

CREATE TABLE conference_setup (
	__IDconference_setup__ Integer NOT NULL,
	FOREIGN KEY sets_member (__FKsets_member__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_made_by (__FKis_made_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY includes_topic (__FKincludes_topic__) REFERENCES topic (__IDtopic__),
	FOREIGN KEY sets_date (__FKsets_date__) REFERENCES date (__IDdate__),
	FOREIGN KEY sets_URL (__FKsets_URL__) REFERENCES URL (__IDURL__),
	PRIMARY KEY conference_setup (__IDconference_setup__),
	__FKsets_member__ Integer,
	__FKis_made_by__ Integer,
	__FKincludes_topic__ Integer,
	__FKsets_date__ Integer,
	__FKsets_URL__ Integer
) ;

CREATE TABLE human (
	__IDhuman__ Integer NOT NULL,
	FOREIGN KEY is_author_of (__FKis_author_of__) REFERENCES article (__IDarticle__),
	FOREIGN KEY performs_activity (__FKperforms_activity__) REFERENCES activity (__IDactivity__),
	FOREIGN KEY is_employed_in (__FKis_employed_in__) REFERENCES institute (__IDinstitute__),
	FOREIGN KEY has_topic_of_interest (__FKhas_topic_of_interest__) REFERENCES topic (__IDtopic__),
	FOREIGN KEY supervises (__FKsupervises__) REFERENCES activity (__IDactivity__),
	"e-mail" text,
	last_name text,
	first_name text,
	PRIMARY KEY human (__IDhuman__),
	__FKis_author_of__ Integer,
	__FKperforms_activity__ Integer,
	__FKis_employed_in__ Integer,
	__FKhas_topic_of_interest__ Integer,
	__FKsupervises__ Integer
) ;

CREATE TABLE managing_of_conference_process (
	__IDmanaging_of_conference_process__ Integer NOT NULL,
	PRIMARY KEY managing_of_conference_process (__IDmanaging_of_conference_process__)
) ;

CREATE TABLE Program_Committee_Chair (
	__IDProgram_Committee_Chair__ Integer NOT NULL,
	PRIMARY KEY Program_Committee_Chair (__IDProgram_Committee_Chair__)
) ;

CREATE TABLE reviewing_proces (
	__IDreviewing_proces__ Integer NOT NULL,
	PRIMARY KEY reviewing_proces (__IDreviewing_proces__)
) ;

CREATE TABLE "end_date_of_camera-ready_submission" (
	"__IDend_date_of_camera-ready_submission__" Integer NOT NULL,
	PRIMARY KEY "end_date_of_camera-ready_submission" ("__IDend_date_of_camera-ready_submission__")
) ;

CREATE TABLE abstract_submission_date (
	__IDabstract_submission_date__ Integer NOT NULL,
	PRIMARY KEY abstract_submission_date (__IDabstract_submission_date__)
) ;

CREATE TABLE group_email (
	__IDgroup_email__ Integer NOT NULL,
	PRIMARY KEY group_email (__IDgroup_email__)
) ;

CREATE TABLE Senior_Reviewer_URL (
	__IDSenior_Reviewer_URL__ Integer NOT NULL,
	PRIMARY KEY Senior_Reviewer_URL (__IDSenior_Reviewer_URL__)
) ;

CREATE TABLE notification (
	__IDnotification__ Integer NOT NULL,
	FOREIGN KEY has_result (__FKhas_result__) REFERENCES article (__IDarticle__),
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY notification (__IDnotification__),
	__FKhas_result__ Integer,
	__FKis_performed_by__ Integer
) ;

CREATE TABLE notification_email (
	__IDnotification_email__ Integer NOT NULL,
	PRIMARY KEY notification_email (__IDnotification_email__)
) ;

CREATE TABLE Chair_URL (
	__IDChair_URL__ Integer NOT NULL,
	PRIMARY KEY Chair_URL (__IDChair_URL__)
) ;

CREATE TABLE abstract_of_paper (
	__IDabstract_of_paper__ Integer NOT NULL,
	PRIMARY KEY abstract_of_paper (__IDabstract_of_paper__)
) ;

CREATE TABLE submission_process (
	__IDsubmission_process__ Integer NOT NULL,
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY submission_process (__IDsubmission_process__),
	__FKis_performed_by__ Integer
) ;

CREATE TABLE topic (
	__IDtopic__ Integer NOT NULL,
	PRIMARY KEY topic (__IDtopic__)
) ;

CREATE TABLE lower_tier_reviewing_process (
	__IDlower_tier_reviewing_process__ Integer NOT NULL,
	PRIMARY KEY lower_tier_reviewing_process (__IDlower_tier_reviewing_process__)
) ;

CREATE TABLE start_date_of_conference (
	__IDstart_date_of_conference__ Integer NOT NULL,
	PRIMARY KEY start_date_of_conference (__IDstart_date_of_conference__)
) ;

CREATE TABLE date_of_conference (
	__IDdate_of_conference__ Integer NOT NULL,
	PRIMARY KEY date_of_conference (__IDdate_of_conference__)
) ;

CREATE TABLE Senior_Program_Committee_member (
	__IDSenior_Program_Committee_member__ Integer NOT NULL,
	PRIMARY KEY Senior_Program_Committee_member (__IDSenior_Program_Committee_member__)
) ;

CREATE TABLE end_date_of_abstract_submission (
	__IDend_date_of_abstract_submission__ Integer NOT NULL,
	PRIMARY KEY end_date_of_abstract_submission (__IDend_date_of_abstract_submission__)
) ;

CREATE TABLE phase_of_conference (
	__IDphase_of_conference__ Integer NOT NULL,
	PRIMARY KEY phase_of_conference (__IDphase_of_conference__)
) ;

CREATE TABLE Regular_Program_Committee_member (
	__IDRegular_Program_Committee_member__ Integer NOT NULL,
	PRIMARY KEY Regular_Program_Committee_member (__IDRegular_Program_Committee_member__)
) ;

CREATE TABLE start_date_of_full_paper_submission (
	__IDstart_date_of_full_paper_submission__ Integer NOT NULL,
	PRIMARY KEY start_date_of_full_paper_submission (__IDstart_date_of_full_paper_submission__)
) ;

CREATE TABLE full_paper_submission_date (
	__IDfull_paper_submission_date__ Integer NOT NULL,
	PRIMARY KEY full_paper_submission_date (__IDfull_paper_submission_date__)
) ;

CREATE TABLE start_date_of_abstract_submission (
	__IDstart_date_of_abstract_submission__ Integer NOT NULL,
	PRIMARY KEY start_date_of_abstract_submission (__IDstart_date_of_abstract_submission__)
) ;

CREATE TABLE end_date_of_conference (
	__IDend_date_of_conference__ Integer NOT NULL,
	PRIMARY KEY end_date_of_conference (__IDend_date_of_conference__)
) ;

CREATE TABLE review_form (
	__IDreview_form__ Integer NOT NULL,
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES activity (__IDactivity__),
	PRIMARY KEY review_form (__IDreview_form__),
	__FKis_created_in__ Integer
) ;

CREATE TABLE Automatic_Paper_Assignment (
	__IDAutomatic_Paper_Assignment__ Integer NOT NULL,
	PRIMARY KEY Automatic_Paper_Assignment (__IDAutomatic_Paper_Assignment__)
) ;

CREATE TABLE institute (
	__IDinstitute__ Integer NOT NULL,
	PRIMARY KEY institute (__IDinstitute__)
) ;

CREATE TABLE classification (
	__IDclassification__ Integer NOT NULL,
	PRIMARY KEY classification (__IDclassification__)
) ;

CREATE TABLE summary_of_reviews (
	__IDsummary_of_reviews__ Integer NOT NULL,
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES activity (__IDactivity__),
	PRIMARY KEY summary_of_reviews (__IDsummary_of_reviews__),
	__FKis_created_in__ Integer
) ;

CREATE TABLE upper_tier_reviewing_process (
	__IDupper_tier_reviewing_process__ Integer NOT NULL,
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY upper_tier_reviewing_process (__IDupper_tier_reviewing_process__),
	__FKis_performed_by__ Integer
) ;

CREATE TABLE end_date_of_full_paper_submission (
	__IDend_date_of_full_paper_submission__ Integer NOT NULL,
	PRIMARY KEY end_date_of_full_paper_submission (__IDend_date_of_full_paper_submission__)
) ;

CREATE TABLE acceptance_notification_email (
	__IDacceptance_notification_email__ Integer NOT NULL,
	PRIMARY KEY acceptance_notification_email (__IDacceptance_notification_email__)
) ;

CREATE TABLE rejection_notification_email (
	__IDrejection_notification_email__ Integer NOT NULL,
	PRIMARY KEY rejection_notification_email (__IDrejection_notification_email__)
) ;

CREATE TABLE Contact_Person_URL (
	__IDContact_Person_URL__ Integer NOT NULL,
	PRIMARY KEY Contact_Person_URL (__IDContact_Person_URL__)
) ;

CREATE TABLE Regular_Reviewer_URL (
	__IDRegular_Reviewer_URL__ Integer NOT NULL,
	PRIMARY KEY Regular_Reviewer_URL (__IDRegular_Reviewer_URL__)
) ;

CREATE TABLE Trip (
	__IDTrip__ Integer NOT NULL,
	PRIMARY KEY Trip (__IDTrip__)
) ;

CREATE TABLE Banquet (
	__IDBanquet__ Integer NOT NULL,
	PRIMARY KEY Banquet (__IDBanquet__)
) ;

CREATE TABLE Reception (
	__IDReception__ Integer NOT NULL,
	PRIMARY KEY Reception (__IDReception__)
) ;

CREATE TABLE Social_event (
	__IDSocial_event__ Integer NOT NULL,
	PRIMARY KEY Social_event (__IDSocial_event__)
) ;

CREATE TABLE Contribution (
	__IDContribution__ Integer NOT NULL,
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY dealsWith (__FKdealsWith__) REFERENCES Topic (__IDTopic__),
	remark text,
	abstract text,
	contactEmail text,
	hasKeyword text,
	hasTitle text,
	PRIMARY KEY Contribution (__IDContribution__),
	__FKwrittenBy__ Integer,
	__FKdealsWith__ Integer
) ;

CREATE TABLE City (
	__IDCity__ Integer NOT NULL,
	PRIMARY KEY City (__IDCity__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	PRIMARY KEY Organization (__IDOrganization__)
) ;

CREATE TABLE Country (
	__IDCountry__ Integer NOT NULL,
	PRIMARY KEY Country (__IDCountry__)
) ;

CREATE TABLE Company (
	__IDCompany__ Integer NOT NULL,
	PRIMARY KEY Company (__IDCompany__)
) ;

CREATE TABLE University (
	__IDUniversity__ Integer NOT NULL,
	PRIMARY KEY University (__IDUniversity__)
) ;

CREATE TABLE Scholar (
	__IDScholar__ Integer NOT NULL,
	FOREIGN KEY studyAt (__FKstudyAt__) REFERENCES University (__IDUniversity__),
	PRIMARY KEY Scholar (__IDScholar__),
	__FKstudyAt__ Integer
) ;

CREATE TABLE Poster (
	__IDPoster__ Integer NOT NULL,
	PRIMARY KEY Poster (__IDPoster__)
) ;

CREATE TABLE Short_paper (
	__IDShort_paper__ Integer NOT NULL,
	PRIMARY KEY Short_paper (__IDShort_paper__)
) ;

CREATE TABLE Reviewing_results_event (
	__IDReviewing_results_event__ Integer NOT NULL,
	PRIMARY KEY Reviewing_results_event (__IDReviewing_results_event__)
) ;

CREATE TABLE Administrative_event (
	__IDAdministrative_event__ Integer NOT NULL,
	FOREIGN KEY follows (__FKfollows__) REFERENCES Administrative_event (__IDAdministrative_event__),
	FOREIGN KEY parallel_with (__FKparallel_with__) REFERENCES Administrative_event (__IDAdministrative_event__),
	PRIMARY KEY Administrative_event (__IDAdministrative_event__),
	__FKfollows__ Integer,
	__FKparallel_with__ Integer
) ;

CREATE TABLE Reviewing_event (
	__IDReviewing_event__ Integer NOT NULL,
	PRIMARY KEY Reviewing_event (__IDReviewing_event__)
) ;

CREATE TABLE Registration_of_participants_event (
	__IDRegistration_of_participants_event__ Integer NOT NULL,
	PRIMARY KEY Registration_of_participants_event (__IDRegistration_of_participants_event__)
) ;

CREATE TABLE Submission_event (
	__IDSubmission_event__ Integer NOT NULL,
	PRIMARY KEY Submission_event (__IDSubmission_event__)
) ;

CREATE TABLE Camera_Ready_event (
	__IDCamera_Ready_event__ Integer NOT NULL,
	PRIMARY KEY Camera_Ready_event (__IDCamera_Ready_event__)
) ;

CREATE TABLE Tutorial (
	__IDTutorial__ Integer NOT NULL,
	PRIMARY KEY Tutorial (__IDTutorial__)
) ;

CREATE TABLE Working_event (
	__IDWorking_event__ Integer NOT NULL,
	FOREIGN KEY hasTopic (__FKhasTopic__) REFERENCES Topic (__IDTopic__),
	FOREIGN KEY hasAdministrativeEvent (__FKhasAdministrativeEvent__) REFERENCES Administrative_event (__IDAdministrative_event__),
	PRIMARY KEY Working_event (__IDWorking_event__),
	__FKhasTopic__ Integer,
	__FKhasAdministrativeEvent__ Integer
) ;

CREATE TABLE Member (
	__IDMember__ Integer NOT NULL,
	PRIMARY KEY Member (__IDMember__)
) ;

CREATE TABLE Participant (
	__IDParticipant__ Integer NOT NULL,
	earlyRegistration Boolean,
	PRIMARY KEY Participant (__IDParticipant__)
) ;

CREATE TABLE Member_PC (
	__IDMember_PC__ Integer NOT NULL,
	FOREIGN KEY expertOn (__FKexpertOn__) REFERENCES Topic (__IDTopic__),
	FOREIGN KEY reviewes (__FKreviewes__) REFERENCES Contribution (__IDContribution__),
	PRIMARY KEY Member_PC (__IDMember_PC__),
	__FKexpertOn__ Integer,
	__FKreviewes__ Integer
) ;

CREATE TABLE Chair_PC (
	__IDChair_PC__ Integer NOT NULL,
	PRIMARY KEY Chair_PC (__IDChair_PC__)
) ;

CREATE TABLE Student (
	__IDStudent__ Integer NOT NULL,
	PRIMARY KEY Student (__IDStudent__)
) ;

CREATE TABLE Science_Worker (
	__IDScience_Worker__ Integer NOT NULL,
	PRIMARY KEY Science_Worker (__IDScience_Worker__)
) ;

CREATE TABLE Assistant (
	__IDAssistant__ Integer NOT NULL,
	PRIMARY KEY Assistant (__IDAssistant__)
) ;

CREATE TABLE Volunteer (
	__IDVolunteer__ Integer NOT NULL,
	PRIMARY KEY Volunteer (__IDVolunteer__)
) ;

CREATE TABLE Regular (
	__IDRegular__ Integer NOT NULL,
	PRIMARY KEY Regular (__IDRegular__)
) ;

CREATE TABLE author (
	__IDauthor__ Integer NOT NULL,
	FOREIGN KEY writes_article (__FKwrites_article__) REFERENCES article (__IDarticle__),
	FOREIGN KEY assigns_article_to_conference (__FKassigns_article_to_conference__) REFERENCES article (__IDarticle__),
	PRIMARY KEY author (__IDauthor__),
	__FKwrites_article__ Integer,
	__FKassigns_article_to_conference__ Integer
) ;

CREATE TABLE person (
	__IDperson__ Integer NOT NULL,
	PRIMARY KEY person (__IDperson__)
) ;

CREATE TABLE pc_meeting (
	__IDpc_meeting__ Integer NOT NULL,
	PRIMARY KEY pc_meeting (__IDpc_meeting__)
) ;

CREATE TABLE event (
	__IDevent__ Integer NOT NULL,
	has_startdate text,
	has_enddate text,
	PRIMARY KEY event (__IDevent__)
) ;

CREATE TABLE session (
	__IDsession__ Integer NOT NULL,
	PRIMARY KEY session (__IDsession__)
) ;

CREATE TABLE chair (
	__IDchair__ Integer NOT NULL,
	FOREIGN KEY assigns_reviewers_to_article (__FKassigns_reviewers_to_article__) REFERENCES reviewer (__IDreviewer__),
	FOREIGN KEY creates_program (__FKcreates_program__) REFERENCES program (__IDprogram__),
	PRIMARY KEY chair (__IDchair__),
	__FKassigns_reviewers_to_article__ Integer,
	__FKcreates_program__ Integer
) ;

CREATE TABLE abstract (
	__IDabstract__ Integer NOT NULL,
	FOREIGN KEY part_of_article (__FKpart_of_article__) REFERENCES article (__IDarticle__),
	PRIMARY KEY abstract (__IDabstract__),
	__FKpart_of_article__ Integer
) ;

CREATE TABLE document (
	__IDdocument__ Integer NOT NULL,
	PRIMARY KEY document (__IDdocument__)
) ;

CREATE TABLE review (
	__IDreview__ Integer NOT NULL,
	FOREIGN KEY gives_classification (__FKgives_classification__) REFERENCES classification (__IDclassification__),
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES activity (__IDactivity__),
	FOREIGN KEY review_written_by (__FKreview_written_by__) REFERENCES reviewer (__IDreviewer__),
	PRIMARY KEY review (__IDreview__),
	__FKgives_classification__ Integer,
	__FKis_created_in__ Integer,
	__FKreview_written_by__ Integer
) ;

CREATE TABLE participant (
	__IDparticipant__ Integer NOT NULL,
	FOREIGN KEY submits_to_conference (__FKsubmits_to_conference__) REFERENCES conference (__IDconference__),
	PRIMARY KEY participant (__IDparticipant__),
	__FKsubmits_to_conference__ Integer
) ;

CREATE TABLE program (
	__IDprogram__ Integer NOT NULL,
	FOREIGN KEY program_created_by (__FKprogram_created_by__) REFERENCES chair (__IDchair__),
	FOREIGN KEY has_session (__FKhas_session__) REFERENCES session (__IDsession__),
	PRIMARY KEY program (__IDprogram__),
	__FKprogram_created_by__ Integer,
	__FKhas_session__ Integer
) ;

CREATE TABLE reviewer (
	__IDreviewer__ Integer NOT NULL,
	FOREIGN KEY writes_review (__FKwrites_review__) REFERENCES review (__IDreview__),
	PRIMARY KEY reviewer (__IDreviewer__),
	__FKwrites_review__ Integer
) ;

CREATE TABLE Reviewer_has_a_review_reference_or_expertise_Thing (
	__IDReviewer__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_inverse_of_add_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_execute_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_modify_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_remove_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE User_create_Thing (
	__IDUser__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Activity_has_result_Thing (
	__IDActivity__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Abstract_is_the_1th_part_of_Thing (
	__IDAbstract__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Review_preference_has_a_topic_or_a_submission_contribution_Thing (
	__IDReview_preference__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Manual_Paper_Assignment_manually_assign_paper_Program_Committee_member (
	__IDManual_Paper_Assignment__ Integer NOT NULL,
	__IDProgram_Committee_member__ Integer NOT NULL
) ;

CREATE TABLE Senior_Program_Committee_member_supervises_activity (
	__IDSenior_Program_Committee_member__ Integer NOT NULL,
	__IDactivity__ Integer NOT NULL
) ;

CREATE TABLE Automatic_Paper_Assignment_automatically_assign_paper_Program_Committee_member (
	__IDAutomatic_Paper_Assignment__ Integer NOT NULL,
	__IDProgram_Committee_member__ Integer NOT NULL
) ;
