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
	FOREIGN KEY assignedByAdministrator (__FKassignedByAdministrator__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY adjustBid (__FKadjustBid__) REFERENCES Bid (__IDBid__),
	FOREIGN KEY readPaper (__FKreadPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY hasBeenAssigned (__FKhasBeenAssigned__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writeReview (__FKwriteReview__) REFERENCES Review (__IDReview__),
	FOREIGN KEY assignExternalReviewer (__FKassignExternalReviewer__) REFERENCES ExternalReviewer (__IDExternalReviewer__),
	FOREIGN KEY "invites_co-reviewers" ("__FKinvites_co-reviewers__") REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY invited_by (__FKinvited_by__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY Reviewer (__IDReviewer__),
	__FKassignedByAdministrator__ Integer,
	__FKadjustBid__ Integer,
	__FKreadPaper__ Integer,
	__FKhasBeenAssigned__ Integer,
	__FKwriteReview__ Integer,
	__FKassignExternalReviewer__ Integer,
	"__FKinvites_co-reviewers__" Integer,
	__FKinvited_by__ Integer
) ;

CREATE TABLE Decision (
	__IDDecision__ Integer NOT NULL,
	PRIMARY KEY Decision (__IDDecision__)
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
	FOREIGN KEY submitPaper (__FKsubmitPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writePaper (__FKwritePaper__) REFERENCES Paper (__IDPaper__),
	PRIMARY KEY Author (__IDAuthor__),
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

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	FOREIGN KEY conists_of (__FKconists_of__) REFERENCES Event_Tracks (__IDEvent_Tracks__),
	FOREIGN KEY confirmed_by (__FKconfirmed_by__) REFERENCES Approval_Email (__IDApproval_Email__),
	FOREIGN KEY defined_by (__FKdefined_by__) REFERENCES Event_Setup (__IDEvent_Setup__),
	FOREIGN KEY approved_by (__FKapproved_by__) REFERENCES Administrator (__IDAdministrator__),
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
	__FKhasConflictOfInterest__ Integer
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

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	PRIMARY KEY Organization (__IDOrganization__)
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

CREATE TABLE Workshop (
	__IDWorkshop__ Integer NOT NULL,
	PRIMARY KEY Workshop (__IDWorkshop__)
) ;

CREATE TABLE Tutorial (
	__IDTutorial__ Integer NOT NULL,
	PRIMARY KEY Tutorial (__IDTutorial__)
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

CREATE TABLE Review (
	__IDReview__ Integer NOT NULL,
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY reviews (__FKreviews__) REFERENCES Reviewed_contribution (__IDReviewed_contribution__),
	PRIMARY KEY Review (__IDReview__),
	__FKwrittenBy__ Integer,
	__FKreviews__ Integer
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

CREATE TABLE Reviewer_has_a_review_reference_or_expertise_Thing (
	__IDReviewer__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE User_create_Thing (
	__IDUser__ Integer NOT NULL,
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