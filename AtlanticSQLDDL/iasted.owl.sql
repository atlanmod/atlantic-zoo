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
	FOREIGN KEY writes_review (__FKwrites_review__) REFERENCES Review (__IDReview__),
	FOREIGN KEY hasReviewHistory (__FKhasReviewHistory__) REFERENCES PersonalReviewHistory (__IDPersonalReviewHistory__),
	FOREIGN KEY assignedByAdministrator (__FKassignedByAdministrator__) REFERENCES Administrator (__IDAdministrator__),
	FOREIGN KEY adjustBid (__FKadjustBid__) REFERENCES Bid (__IDBid__),
	FOREIGN KEY readPaper (__FKreadPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY hasBeenAssigned (__FKhasBeenAssigned__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writeReview (__FKwriteReview__) REFERENCES Review (__IDReview__),
	FOREIGN KEY assignExternalReviewer (__FKassignExternalReviewer__) REFERENCES ExternalReviewer (__IDExternalReviewer__),
	PRIMARY KEY Reviewer (__IDReviewer__),
	"__FKinvites_co-reviewers__" Integer,
	__FKinvited_by__ Integer,
	__FKwrites_review__ Integer,
	__FKhasReviewHistory__ Integer,
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
	FOREIGN KEY attendeeAt (__FKattendeeAt__) REFERENCES ConferenceEvent (__IDConferenceEvent__),
	FOREIGN KEY isMemberOf (__FKisMemberOf__) REFERENCES Conference (__IDConference__),
	hasFirstName text,
	hasBiography text,
	hasLastName text,
	FOREIGN KEY authorOf (__FKauthorOf__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY prepare (__FKprepare__) REFERENCES Item (__IDItem__),
	FOREIGN KEY "write" (__FKwrite__) REFERENCES Item (__IDItem__),
	FOREIGN KEY obtain (__FKobtain__) REFERENCES Item (__IDItem__),
	FOREIGN KEY send (__FKsend__) REFERENCES Item (__IDItem__),
	FOREIGN KEY pay (__FKpay__) REFERENCES Money (__IDMoney__),
	FOREIGN KEY sign (__FKsign__) REFERENCES Item (__IDItem__),
	FOREIGN KEY is_present (__FKis_present__) REFERENCES Time (__IDTime__),
	FOREIGN KEY need (__FKneed__) REFERENCES Item (__IDItem__),
	FOREIGN KEY hasConflictOfInterest (__FKhasConflictOfInterest__) REFERENCES Document (__IDDocument__),
	email text,
	PRIMARY KEY Person (__IDPerson__),
	__FKget__ Integer,
	__FKuse__ Integer,
	__FKregister__ Integer,
	__FKtake_part_in__ Integer,
	__FKadd__ Integer,
	__FKadded_by__ Integer,
	__FKcontributes__ Integer,
	__FKemployedBy__ Integer,
	__FKattendeeAt__ Integer,
	__FKisMemberOf__ Integer,
	__FKauthorOf__ Integer,
	__FKprepare__ Integer,
	__FKwrite__ Integer,
	__FKobtain__ Integer,
	__FKsend__ Integer,
	__FKpay__ Integer,
	__FKsign__ Integer,
	__FKis_present__ Integer,
	__FKneed__ Integer,
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
	FOREIGN KEY is_in_phase (__FKis_in_phase__) REFERENCES phase_of_conference (__IDphase_of_conference__),
	FOREIGN KEY has_program (__FKhas_program__) REFERENCES program (__IDprogram__),
	FOREIGN KEY hasMember (__FKhasMember__) REFERENCES Person (__IDPerson__),
	hasName text,
	endDate text,
	paperDueOn text,
	registrationDueOn text,
	manuscriptDueOn text,
	startDate text,
	FOREIGN KEY hasCountry (__FKhasCountry__) REFERENCES Country (__IDCountry__),
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
	__FKis_in_phase__ Integer,
	__FKhas_program__ Integer,
	__FKhasMember__ Integer,
	__FKhasCountry__ Integer,
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

CREATE TABLE "Meta-Review" (
	"__IDMeta-Review__" Integer NOT NULL,
	PRIMARY KEY "Meta-Review" ("__IDMeta-Review__")
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

CREATE TABLE Administrator (
	__IDAdministrator__ Integer NOT NULL,
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
	FOREIGN KEY approve (__FKapprove__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY assign (__FKassign__) REFERENCES Role (__IDRole__),
	PRIMARY KEY Administrator (__IDAdministrator__),
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
	__FKaddProgramCommitteeMember__ Integer,
	__FKapprove__ Integer,
	__FKassign__ Integer
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
	FOREIGN KEY part_of_article (__FKpart_of_article__) REFERENCES article (__IDarticle__),
	PRIMARY KEY Abstract (__IDAbstract__),
	__FKpart_of_article__ Integer
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
	has_a_volume text,
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

CREATE TABLE Chair (
	__IDChair__ Integer NOT NULL,
	FOREIGN KEY was_a_committee_chair_of (__FKwas_a_committee_chair_of__) REFERENCES Committee (__IDCommittee__),
	PRIMARY KEY Chair (__IDChair__),
	__FKwas_a_committee_chair_of__ Integer
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

CREATE TABLE Contact_Person (
	__IDContact_Person__ Integer NOT NULL,
	PRIMARY KEY Contact_Person (__IDContact_Person__)
) ;

CREATE TABLE bidding_of_reviewer (
	__IDbidding_of_reviewer__ Integer NOT NULL,
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	PRIMARY KEY bidding_of_reviewer (__IDbidding_of_reviewer__),
	__FKis_performed_by__ Integer
) ;

CREATE TABLE URL (
	__IDURL__ Integer NOT NULL,
	PRIMARY KEY URL (__IDURL__)
) ;

CREATE TABLE conference_setup (
	__IDconference_setup__ Integer NOT NULL,
	FOREIGN KEY sets_member (__FKsets_member__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_made_by (__FKis_made_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY includes_topic (__FKincludes_topic__) REFERENCES Topic (__IDTopic__),
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
	FOREIGN KEY performs_activity (__FKperforms_activity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY is_employed_in (__FKis_employed_in__) REFERENCES institute (__IDinstitute__),
	FOREIGN KEY has_topic_of_interest (__FKhas_topic_of_interest__) REFERENCES Topic (__IDTopic__),
	FOREIGN KEY supervises (__FKsupervises__) REFERENCES Activity (__IDActivity__),
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
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES Activity (__IDActivity__),
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
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES Activity (__IDActivity__),
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

CREATE TABLE Workshop (
	__IDWorkshop__ Integer NOT NULL,
	PRIMARY KEY Workshop (__IDWorkshop__)
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

CREATE TABLE pc_meeting (
	__IDpc_meeting__ Integer NOT NULL,
	PRIMARY KEY pc_meeting (__IDpc_meeting__)
) ;

CREATE TABLE session (
	__IDsession__ Integer NOT NULL,
	PRIMARY KEY session (__IDsession__)
) ;

CREATE TABLE chair (
	__IDchair__ Integer NOT NULL,
	FOREIGN KEY assigns_reviewers_to_article (__FKassigns_reviewers_to_article__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY creates_program (__FKcreates_program__) REFERENCES program (__IDprogram__),
	PRIMARY KEY chair (__IDchair__),
	__FKassigns_reviewers_to_article__ Integer,
	__FKcreates_program__ Integer
) ;

CREATE TABLE article (
	__IDarticle__ Integer NOT NULL,
	FOREIGN KEY goes_through (__FKgoes_through__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY is_sent_to (__FKis_sent_to__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY structure_created_by (__FKstructure_created_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY has_author (__FKhas_author__) REFERENCES human (__IDhuman__),
	FOREIGN KEY gives_classification (__FKgives_classification__) REFERENCES classification (__IDclassification__),
	FOREIGN KEY article_written_by (__FKarticle_written_by__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY has_reviewer (__FKhas_reviewer__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY has_abstract (__FKhas_abstract__) REFERENCES Abstract (__IDAbstract__),
	PRIMARY KEY article (__IDarticle__),
	__FKgoes_through__ Integer,
	__FKis_sent_to__ Integer,
	__FKis_created_in__ Integer,
	__FKstructure_created_by__ Integer,
	__FKhas_author__ Integer,
	__FKgives_classification__ Integer,
	__FKarticle_written_by__ Integer,
	__FKhas_reviewer__ Integer,
	__FKhas_abstract__ Integer
) ;

CREATE TABLE participant (
	__IDparticipant__ Integer NOT NULL,
	FOREIGN KEY submits_to_conference (__FKsubmits_to_conference__) REFERENCES Conference (__IDConference__),
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

CREATE TABLE SlideSet (
	__IDSlideSet__ Integer NOT NULL,
	PRIMARY KEY SlideSet (__IDSlideSet__)
) ;

CREATE TABLE Programme (
	__IDProgramme__ Integer NOT NULL,
	FOREIGN KEY belongsToEvent (__FKbelongsToEvent__) REFERENCES ConferenceEvent (__IDConferenceEvent__),
	PRIMARY KEY Programme (__IDProgramme__),
	__FKbelongsToEvent__ Integer
) ;

CREATE TABLE MealMenu (
	__IDMealMenu__ Integer NOT NULL,
	FOREIGN KEY isMenuOf (__FKisMenuOf__) REFERENCES MealEvent (__IDMealEvent__),
	PRIMARY KEY MealMenu (__IDMealMenu__),
	__FKisMenuOf__ Integer
) ;

CREATE TABLE Topic (
	__IDTopic__ Integer NOT NULL,
	FOREIGN KEY belongs_to_a_review_reference (__FKbelongs_to_a_review_reference__) REFERENCES Review_preference (__IDReview_preference__),
	FOREIGN KEY is_a_topis_of_conference_parts (__FKis_a_topis_of_conference_parts__) REFERENCES Conference_part (__IDConference_part__),
	FOREIGN KEY isTopicOf (__FKisTopicOf__) REFERENCES Working_event (__IDWorking_event__),
	PRIMARY KEY Topic (__IDTopic__),
	__FKbelongs_to_a_review_reference__ Integer,
	__FKis_a_topis_of_conference_parts__ Integer,
	__FKisTopicOf__ Integer
) ;

CREATE TABLE ConferenceEvent (
	__IDConferenceEvent__ Integer NOT NULL,
	FOREIGN KEY hasAttendee (__FKhasAttendee__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY hasLocation (__FKhasLocation__) REFERENCES Place (__IDPlace__),
	FOREIGN KEY hasProgramme (__FKhasProgramme__) REFERENCES Programme (__IDProgramme__),
	hasEndDateTime text,
	hasStartDateTime text,
	PRIMARY KEY ConferenceEvent (__IDConferenceEvent__),
	__FKhasAttendee__ Integer,
	__FKhasLocation__ Integer,
	__FKhasProgramme__ Integer
) ;

CREATE TABLE "Call" (
	__IDCall__ Integer NOT NULL,
	FOREIGN KEY forEvent (__FKforEvent__) REFERENCES AcademicEvent (__IDAcademicEvent__),
	hasSubmissionInstructions text,
	hasSubmissionDeadline text,
	PRIMARY KEY "Call" (__IDCall__),
	__FKforEvent__ Integer
) ;

CREATE TABLE ReviewRating (
	__IDReviewRating__ Integer NOT NULL,
	PRIMARY KEY ReviewRating (__IDReviewRating__)
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	FOREIGN KEY isProviderOf (__FKisProviderOf__) REFERENCES Sponsorship (__IDSponsorship__),
	PRIMARY KEY Organization (__IDOrganization__),
	__FKisProviderOf__ Integer
) ;

CREATE TABLE ReviewForm (
	__IDReviewForm__ Integer NOT NULL,
	PRIMARY KEY ReviewForm (__IDReviewForm__)
) ;

CREATE TABLE PersonalHistory (
	__IDPersonalHistory__ Integer NOT NULL,
	PRIMARY KEY PersonalHistory (__IDPersonalHistory__)
) ;

CREATE TABLE Sponsorship (
	__IDSponsorship__ Integer NOT NULL,
	FOREIGN KEY providedBy (__FKprovidedBy__) REFERENCES Organization (__IDOrganization__),
	hasCostCurrency text,
	hasCostAmount Integer,
	PRIMARY KEY Sponsorship (__IDSponsorship__),
	__FKprovidedBy__ Integer
) ;

CREATE TABLE ReviewQuestion (
	__IDReviewQuestion__ Integer NOT NULL,
	PRIMARY KEY ReviewQuestion (__IDReviewQuestion__)
) ;

CREATE TABLE ConferenceSession (
	__IDConferenceSession__ Integer NOT NULL,
	PRIMARY KEY ConferenceSession (__IDConferenceSession__)
) ;

CREATE TABLE ContactInformation (
	__IDContactInformation__ Integer NOT NULL,
	hasCity text,
	hasStreet text,
	hasPostalCode text,
	hasPhone text,
	PRIMARY KEY ContactInformation (__IDContactInformation__)
) ;

CREATE TABLE WeekRejectRating (
	__IDWeekRejectRating__ Integer NOT NULL,
	PRIMARY KEY WeekRejectRating (__IDWeekRejectRating__)
) ;

CREATE TABLE AcceptRating (
	__IDAcceptRating__ Integer NOT NULL,
	PRIMARY KEY AcceptRating (__IDAcceptRating__)
) ;

CREATE TABLE AccpetIfRoomRating (
	__IDAccpetIfRoomRating__ Integer NOT NULL,
	PRIMARY KEY AccpetIfRoomRating (__IDAccpetIfRoomRating__)
) ;

CREATE TABLE RejectRating (
	__IDRejectRating__ Integer NOT NULL,
	PRIMARY KEY RejectRating (__IDRejectRating__)
) ;

CREATE TABLE MealEvent (
	__IDMealEvent__ Integer NOT NULL,
	FOREIGN KEY hasMenu (__FKhasMenu__) REFERENCES MealMenu (__IDMealMenu__),
	PRIMARY KEY MealEvent (__IDMealEvent__),
	__FKhasMenu__ Integer
) ;

CREATE TABLE NonAcademicEvent (
	__IDNonAcademicEvent__ Integer NOT NULL,
	PRIMARY KEY NonAcademicEvent (__IDNonAcademicEvent__)
) ;

CREATE TABLE BreakEvent (
	__IDBreakEvent__ Integer NOT NULL,
	PRIMARY KEY BreakEvent (__IDBreakEvent__)
) ;

CREATE TABLE ParallelAndDistributedComputingTopic (
	__IDParallelAndDistributedComputingTopic__ Integer NOT NULL,
	PRIMARY KEY ParallelAndDistributedComputingTopic (__IDParallelAndDistributedComputingTopic__)
) ;

CREATE TABLE WirelessCommunicationsTopic (
	__IDWirelessCommunicationsTopic__ Integer NOT NULL,
	PRIMARY KEY WirelessCommunicationsTopic (__IDWirelessCommunicationsTopic__)
) ;

CREATE TABLE OperatingTopicsystems (
	__IDOperatingTopicsystems__ Integer NOT NULL,
	PRIMARY KEY OperatingTopicsystems (__IDOperatingTopicsystems__)
) ;

CREATE TABLE ComputerNetworksTopic (
	__IDComputerNetworksTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksTopic (__IDComputerNetworksTopic__)
) ;

CREATE TABLE SatelliteAndSpaceCommunicationsTopic (
	__IDSatelliteAndSpaceCommunicationsTopic__ Integer NOT NULL,
	PRIMARY KEY SatelliteAndSpaceCommunicationsTopic (__IDSatelliteAndSpaceCommunicationsTopic__)
) ;

CREATE TABLE CADTopic (
	__IDCADTopic__ Integer NOT NULL,
	PRIMARY KEY CADTopic (__IDCADTopic__)
) ;

CREATE TABLE MultimediaTopic (
	__IDMultimediaTopic__ Integer NOT NULL,
	PRIMARY KEY MultimediaTopic (__IDMultimediaTopic__)
) ;

CREATE TABLE CommunicationsTopic (
	__IDCommunicationsTopic__ Integer NOT NULL,
	PRIMARY KEY CommunicationsTopic (__IDCommunicationsTopic__)
) ;

CREATE TABLE PowerlineTransmissionTopic (
	__IDPowerlineTransmissionTopic__ Integer NOT NULL,
	PRIMARY KEY PowerlineTransmissionTopic (__IDPowerlineTransmissionTopic__)
) ;

CREATE TABLE AntennasTopic (
	__IDAntennasTopic__ Integer NOT NULL,
	PRIMARY KEY AntennasTopic (__IDAntennasTopic__)
) ;

CREATE TABLE PerformanceTopic (
	__IDPerformanceTopic__ Integer NOT NULL,
	PRIMARY KEY PerformanceTopic (__IDPerformanceTopic__)
) ;

CREATE TABLE SignalProcessingTopic (
	__IDSignalProcessingTopic__ Integer NOT NULL,
	PRIMARY KEY SignalProcessingTopic (__IDSignalProcessingTopic__)
) ;

CREATE TABLE MicroelectronicsTopic (
	__IDMicroelectronicsTopic__ Integer NOT NULL,
	PRIMARY KEY MicroelectronicsTopic (__IDMicroelectronicsTopic__)
) ;

CREATE TABLE TestOnlyTopic (
	__IDTestOnlyTopic__ Integer NOT NULL,
	PRIMARY KEY TestOnlyTopic (__IDTestOnlyTopic__)
) ;

CREATE TABLE RadioCommunicationsTopic (
	__IDRadioCommunicationsTopic__ Integer NOT NULL,
	PRIMARY KEY RadioCommunicationsTopic (__IDRadioCommunicationsTopic__)
) ;

CREATE TABLE ComputerArchitectureTopic (
	__IDComputerArchitectureTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerArchitectureTopic (__IDComputerArchitectureTopic__)
) ;

CREATE TABLE MedicineTopic (
	__IDMedicineTopic__ Integer NOT NULL,
	PRIMARY KEY MedicineTopic (__IDMedicineTopic__)
) ;

CREATE TABLE SecurityTopic (
	__IDSecurityTopic__ Integer NOT NULL,
	PRIMARY KEY SecurityTopic (__IDSecurityTopic__)
) ;

CREATE TABLE MobileComputingTopic (
	__IDMobileComputingTopic__ Integer NOT NULL,
	PRIMARY KEY MobileComputingTopic (__IDMobileComputingTopic__)
) ;

CREATE TABLE CryptographyTopic (
	__IDCryptographyTopic__ Integer NOT NULL,
	PRIMARY KEY CryptographyTopic (__IDCryptographyTopic__)
) ;

CREATE TABLE CommunicationTheoryTopic (
	__IDCommunicationTheoryTopic__ Integer NOT NULL,
	PRIMARY KEY CommunicationTheoryTopic (__IDCommunicationTheoryTopic__)
) ;

CREATE TABLE ConferenceChair (
	__IDConferenceChair__ Integer NOT NULL,
	PRIMARY KEY ConferenceChair (__IDConferenceChair__)
) ;

CREATE TABLE DiningPlace (
	__IDDiningPlace__ Integer NOT NULL,
	PRIMARY KEY DiningPlace (__IDDiningPlace__)
) ;

CREATE TABLE AcademiaOrganization (
	__IDAcademiaOrganization__ Integer NOT NULL,
	PRIMARY KEY AcademiaOrganization (__IDAcademiaOrganization__)
) ;

CREATE TABLE IndustryOrganization (
	__IDIndustryOrganization__ Integer NOT NULL,
	PRIMARY KEY IndustryOrganization (__IDIndustryOrganization__)
) ;

CREATE TABLE NGO (
	__IDNGO__ Integer NOT NULL,
	PRIMARY KEY NGO (__IDNGO__)
) ;

CREATE TABLE GovernmentOrganization (
	__IDGovernmentOrganization__ Integer NOT NULL,
	PRIMARY KEY GovernmentOrganization (__IDGovernmentOrganization__)
) ;

CREATE TABLE ComputerNetworksEnterpriseTopic (
	__IDComputerNetworksEnterpriseTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksEnterpriseTopic (__IDComputerNetworksEnterpriseTopic__)
) ;

CREATE TABLE ComputerNetworksSwitchingTopic (
	__IDComputerNetworksSwitchingTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksSwitchingTopic (__IDComputerNetworksSwitchingTopic__)
) ;

CREATE TABLE ComputerNetworksSensorTopic (
	__IDComputerNetworksSensorTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksSensorTopic (__IDComputerNetworksSensorTopic__)
) ;

CREATE TABLE ComputerNetworksSecurityTopic (
	__IDComputerNetworksSecurityTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksSecurityTopic (__IDComputerNetworksSecurityTopic__)
) ;

CREATE TABLE ComputerNetworksOpticalTopic (
	__IDComputerNetworksOpticalTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksOpticalTopic (__IDComputerNetworksOpticalTopic__)
) ;

CREATE TABLE ComputerNetworksMeasurementsTopic (
	__IDComputerNetworksMeasurementsTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksMeasurementsTopic (__IDComputerNetworksMeasurementsTopic__)
) ;

CREATE TABLE ComputerNetworksManagementTopic (
	__IDComputerNetworksManagementTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksManagementTopic (__IDComputerNetworksManagementTopic__)
) ;

CREATE TABLE ComputerNetworksAapplicationsTopic (
	__IDComputerNetworksAapplicationsTopic__ Integer NOT NULL,
	PRIMARY KEY ComputerNetworksAapplicationsTopic (__IDComputerNetworksAapplicationsTopic__)
) ;

CREATE TABLE ActivePaper (
	__IDActivePaper__ Integer NOT NULL,
	FOREIGN KEY hasRating (__FKhasRating__) REFERENCES ReviewRating (__IDReviewRating__),
	PRIMARY KEY ActivePaper (__IDActivePaper__),
	__FKhasRating__ Integer
) ;

CREATE TABLE PendingPaper (
	__IDPendingPaper__ Integer NOT NULL,
	PRIMARY KEY PendingPaper (__IDPendingPaper__)
) ;

CREATE TABLE WithdrawnPaper (
	__IDWithdrawnPaper__ Integer NOT NULL,
	PRIMARY KEY WithdrawnPaper (__IDWithdrawnPaper__)
) ;

CREATE TABLE RejectedPaper (
	__IDRejectedPaper__ Integer NOT NULL,
	PRIMARY KEY RejectedPaper (__IDRejectedPaper__)
) ;

CREATE TABLE AcceptedPaper (
	__IDAcceptedPaper__ Integer NOT NULL,
	FOREIGN KEY relatedToEvent (__FKrelatedToEvent__) REFERENCES PaperPresentation (__IDPaperPresentation__),
	PRIMARY KEY AcceptedPaper (__IDAcceptedPaper__),
	__FKrelatedToEvent__ Integer
) ;

CREATE TABLE PublishedPaper (
	__IDPublishedPaper__ Integer NOT NULL,
	PRIMARY KEY PublishedPaper (__IDPublishedPaper__)
) ;

CREATE TABLE Attendee (
	__IDAttendee__ Integer NOT NULL,
	PRIMARY KEY Attendee (__IDAttendee__)
) ;

CREATE TABLE CoffeeBreak (
	__IDCoffeeBreak__ Integer NOT NULL,
	PRIMARY KEY CoffeeBreak (__IDCoffeeBreak__)
) ;

CREATE TABLE FreeTimeBreak (
	__IDFreeTimeBreak__ Integer NOT NULL,
	PRIMARY KEY FreeTimeBreak (__IDFreeTimeBreak__)
) ;

CREATE TABLE MealBreak (
	__IDMealBreak__ Integer NOT NULL,
	PRIMARY KEY MealBreak (__IDMealBreak__)
) ;

CREATE TABLE ClosingTalk (
	__IDClosingTalk__ Integer NOT NULL,
	PRIMARY KEY ClosingTalk (__IDClosingTalk__)
) ;

CREATE TABLE WelcomeTalk (
	__IDWelcomeTalk__ Integer NOT NULL,
	PRIMARY KEY WelcomeTalk (__IDWelcomeTalk__)
) ;

CREATE TABLE TalkEvent (
	__IDTalkEvent__ Integer NOT NULL,
	PRIMARY KEY TalkEvent (__IDTalkEvent__)
) ;

CREATE TABLE SessionChair (
	__IDSessionChair__ Integer NOT NULL,
	PRIMARY KEY SessionChair (__IDSessionChair__)
) ;

CREATE TABLE TPCMember (
	__IDTPCMember__ Integer NOT NULL,
	PRIMARY KEY TPCMember (__IDTPCMember__)
) ;

CREATE TABLE TwoLevelConference (
	__IDTwoLevelConference__ Integer NOT NULL,
	PRIMARY KEY TwoLevelConference (__IDTwoLevelConference__)
) ;

CREATE TABLE CallForPapers (
	__IDCallForPapers__ Integer NOT NULL,
	PRIMARY KEY CallForPapers (__IDCallForPapers__)
) ;

CREATE TABLE TextualReviewQuestion (
	__IDTextualReviewQuestion__ Integer NOT NULL,
	PRIMARY KEY TextualReviewQuestion (__IDTextualReviewQuestion__)
) ;

CREATE TABLE NumericalReviewQuestion (
	__IDNumericalReviewQuestion__ Integer NOT NULL,
	PRIMARY KEY NumericalReviewQuestion (__IDNumericalReviewQuestion__)
) ;

CREATE TABLE OrganizationalMeeting (
	__IDOrganizationalMeeting__ Integer NOT NULL,
	PRIMARY KEY OrganizationalMeeting (__IDOrganizationalMeeting__)
) ;

CREATE TABLE PaperPresentation (
	__IDPaperPresentation__ Integer NOT NULL,
	FOREIGN KEY relatedToPaper (__FKrelatedToPaper__) REFERENCES AcceptedPaper (__IDAcceptedPaper__),
	PRIMARY KEY PaperPresentation (__IDPaperPresentation__),
	__FKrelatedToPaper__ Integer
) ;

CREATE TABLE AcademicEvent (
	__IDAcademicEvent__ Integer NOT NULL,
	FOREIGN KEY hasCall (__FKhasCall__) REFERENCES "Call" (__IDCall__),
	PRIMARY KEY AcademicEvent (__IDAcademicEvent__),
	__FKhasCall__ Integer
) ;

CREATE TABLE PersonalPublicationHistory (
	__IDPersonalPublicationHistory__ Integer NOT NULL,
	PRIMARY KEY PersonalPublicationHistory (__IDPersonalPublicationHistory__)
) ;

CREATE TABLE Excursion (
	__IDExcursion__ Integer NOT NULL,
	PRIMARY KEY Excursion (__IDExcursion__)
) ;

CREATE TABLE SocialEvent (
	__IDSocialEvent__ Integer NOT NULL,
	PRIMARY KEY SocialEvent (__IDSocialEvent__)
) ;

CREATE TABLE CallForReviews (
	__IDCallForReviews__ Integer NOT NULL,
	PRIMARY KEY CallForReviews (__IDCallForReviews__)
) ;

CREATE TABLE PersonalReviewHistory (
	__IDPersonalReviewHistory__ Integer NOT NULL,
	FOREIGN KEY isReviewHistoryOf (__FKisReviewHistoryOf__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY PersonalReviewHistory (__IDPersonalReviewHistory__),
	__FKisReviewHistoryOf__ Integer
) ;

CREATE TABLE ConferenceVenuePlace (
	__IDConferenceVenuePlace__ Integer NOT NULL,
	PRIMARY KEY ConferenceVenuePlace (__IDConferenceVenuePlace__)
) ;

CREATE TABLE CallForManuscripts (
	__IDCallForManuscripts__ Integer NOT NULL,
	PRIMARY KEY CallForManuscripts (__IDCallForManuscripts__)
) ;

CREATE TABLE Reception (
	__IDReception__ Integer NOT NULL,
	PRIMARY KEY Reception (__IDReception__)
) ;

CREATE TABLE SingleLevelConference (
	__IDSingleLevelConference__ Integer NOT NULL,
	PRIMARY KEY SingleLevelConference (__IDSingleLevelConference__)
) ;

CREATE TABLE MeetingRoomPlace (
	__IDMeetingRoomPlace__ Integer NOT NULL,
	PRIMARY KEY MeetingRoomPlace (__IDMeetingRoomPlace__)
) ;

CREATE TABLE AccommodationPlace (
	__IDAccommodationPlace__ Integer NOT NULL,
	PRIMARY KEY AccommodationPlace (__IDAccommodationPlace__)
) ;

CREATE TABLE RatedPapers (
	__IDRatedPapers__ Integer NOT NULL,
	PRIMARY KEY RatedPapers (__IDRatedPapers__)
) ;

CREATE TABLE TravelGrant (
	__IDTravelGrant__ Integer NOT NULL,
	PRIMARY KEY TravelGrant (__IDTravelGrant__)
) ;

CREATE TABLE ConferenceDinner (
	__IDConferenceDinner__ Integer NOT NULL,
	PRIMARY KEY ConferenceDinner (__IDConferenceDinner__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	FOREIGN KEY conists_of (__FKconists_of__) REFERENCES Event_Tracks (__IDEvent_Tracks__),
	FOREIGN KEY confirmed_by (__FKconfirmed_by__) REFERENCES Approval_Email (__IDApproval_Email__),
	FOREIGN KEY defined_by (__FKdefined_by__) REFERENCES Event_Setup (__IDEvent_Setup__),
	FOREIGN KEY approved_by (__FKapproved_by__) REFERENCES Administrator (__IDAdministrator__),
	starts_on text,
	ends_on text,
	has_startdate text,
	has_enddate text,
	FOREIGN KEY partOfEvent (__FKpartOfEvent__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY hasEvent (__FKhasEvent__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY heldIn (__FKheldIn__) REFERENCES Location (__IDLocation__),
	PRIMARY KEY Event (__IDEvent__),
	__FKconists_of__ Integer,
	__FKconfirmed_by__ Integer,
	__FKdefined_by__ Integer,
	__FKapproved_by__ Integer,
	__FKpartOfEvent__ Integer,
	__FKhasEvent__ Integer,
	__FKheldIn__ Integer
) ;

CREATE TABLE Accepted_Paper (
	__IDAccepted_Paper__ Integer NOT NULL,
	PRIMARY KEY Accepted_Paper (__IDAccepted_Paper__)
) ;

CREATE TABLE Rejected_Paper (
	__IDRejected_Paper__ Integer NOT NULL,
	PRIMARY KEY Rejected_Paper (__IDRejected_Paper__)
) ;

CREATE TABLE Evaluated_Paper (
	__IDEvaluated_Paper__ Integer NOT NULL,
	FOREIGN KEY hasReview (__FKhasReview__) REFERENCES Review (__IDReview__),
	PRIMARY KEY Evaluated_Paper (__IDEvaluated_Paper__),
	__FKhasReview__ Integer
) ;

CREATE TABLE Camera_Ready_Paper (
	__IDCamera_Ready_Paper__ Integer NOT NULL,
	PRIMARY KEY Camera_Ready_Paper (__IDCamera_Ready_Paper__)
) ;

CREATE TABLE Positive_Review (
	__IDPositive_Review__ Integer NOT NULL,
	PRIMARY KEY Positive_Review (__IDPositive_Review__)
) ;

CREATE TABLE Workshop_Paper (
	__IDWorkshop_Paper__ Integer NOT NULL,
	PRIMARY KEY Workshop_Paper (__IDWorkshop_Paper__)
) ;

CREATE TABLE Industrial_Paper (
	__IDIndustrial_Paper__ Integer NOT NULL,
	PRIMARY KEY Industrial_Paper (__IDIndustrial_Paper__)
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
	full_paper_size Integer,
	FOREIGN KEY has_author (__FKhas_author__) REFERENCES human (__IDhuman__),
	FOREIGN KEY isWrittenBy (__FKisWrittenBy__) REFERENCES Author (__IDAuthor__),
	FOREIGN KEY hasReview (__FKhasReview__) REFERENCES Review (__IDReview__),
	FOREIGN KEY hasReviewer (__FKhasReviewer__) REFERENCES Possible_Reviewer (__IDPossible_Reviewer__),
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
	"__FKreadByMeta-Reviewer__" Integer,
	__FKhas_author__ Integer,
	__FKisWrittenBy__ Integer,
	__FKhasReview__ Integer,
	__FKhasReviewer__ Integer
) ;

CREATE TABLE Conference_Paper (
	__IDConference_Paper__ Integer NOT NULL,
	PRIMARY KEY Conference_Paper (__IDConference_Paper__)
) ;

CREATE TABLE Industrial_Session (
	__IDIndustrial_Session__ Integer NOT NULL,
	PRIMARY KEY Industrial_Session (__IDIndustrial_Session__)
) ;

CREATE TABLE Conference_Session (
	__IDConference_Session__ Integer NOT NULL,
	PRIMARY KEY Conference_Session (__IDConference_Session__)
) ;

CREATE TABLE Regular_Session (
	__IDRegular_Session__ Integer NOT NULL,
	PRIMARY KEY Regular_Session (__IDRegular_Session__)
) ;

CREATE TABLE Poster_Session (
	__IDPoster_Session__ Integer NOT NULL,
	PRIMARY KEY Poster_Session (__IDPoster_Session__)
) ;

CREATE TABLE Demo_Session (
	__IDDemo_Session__ Integer NOT NULL,
	PRIMARY KEY Demo_Session (__IDDemo_Session__)
) ;

CREATE TABLE Paper_Author (
	__IDPaper_Author__ Integer NOT NULL,
	PRIMARY KEY Paper_Author (__IDPaper_Author__)
) ;

CREATE TABLE Conference_Trip (
	__IDConference_Trip__ Integer NOT NULL,
	PRIMARY KEY Conference_Trip (__IDConference_Trip__)
) ;

CREATE TABLE Social_Event (
	__IDSocial_Event__ Integer NOT NULL,
	PRIMARY KEY Social_Event (__IDSocial_Event__)
) ;

CREATE TABLE Tutorial_Abstract (
	__IDTutorial_Abstract__ Integer NOT NULL,
	PRIMARY KEY Tutorial_Abstract (__IDTutorial_Abstract__)
) ;

CREATE TABLE Conference_Participant (
	__IDConference_Participant__ Integer NOT NULL,
	PRIMARY KEY Conference_Participant (__IDConference_Participant__)
) ;

CREATE TABLE Submitted_Paper (
	__IDSubmitted_Paper__ Integer NOT NULL,
	PRIMARY KEY Submitted_Paper (__IDSubmitted_Paper__)
) ;

CREATE TABLE Assigned_Paper (
	__IDAssigned_Paper__ Integer NOT NULL,
	FOREIGN KEY hasReviewer (__FKhasReviewer__) REFERENCES Possible_Reviewer (__IDPossible_Reviewer__),
	PRIMARY KEY Assigned_Paper (__IDAssigned_Paper__),
	__FKhasReviewer__ Integer
) ;

CREATE TABLE Negative_Review (
	__IDNegative_Review__ Integer NOT NULL,
	PRIMARY KEY Negative_Review (__IDNegative_Review__)
) ;

CREATE TABLE Neutral_Review (
	__IDNeutral_Review__ Integer NOT NULL,
	PRIMARY KEY Neutral_Review (__IDNeutral_Review__)
) ;

CREATE TABLE Research_Topic (
	__IDResearch_Topic__ Integer NOT NULL,
	FOREIGN KEY topicCoveredBy (__FKtopicCoveredBy__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY Research_Topic (__IDResearch_Topic__),
	__FKtopicCoveredBy__ Integer
) ;

CREATE TABLE Organising_Agency (
	__IDOrganising_Agency__ Integer NOT NULL,
	PRIMARY KEY Organising_Agency (__IDOrganising_Agency__)
) ;

CREATE TABLE Academic_Institution (
	__IDAcademic_Institution__ Integer NOT NULL,
	FOREIGN KEY scientificallyOrganises (__FKscientificallyOrganises__) REFERENCES Academic_Institution (__IDAcademic_Institution__),
	PRIMARY KEY Academic_Institution (__IDAcademic_Institution__),
	__FKscientificallyOrganises__ Integer
) ;

CREATE TABLE Organisation (
	__IDOrganisation__ Integer NOT NULL,
	FOREIGN KEY technicallyOrganises (__FKtechnicallyOrganises__) REFERENCES Thing (__IDThing__),
	PRIMARY KEY Organisation (__IDOrganisation__),
	__FKtechnicallyOrganises__ Integer
) ;

CREATE TABLE Proceedings_Publisher (
	__IDProceedings_Publisher__ Integer NOT NULL,
	PRIMARY KEY Proceedings_Publisher (__IDProceedings_Publisher__)
) ;

CREATE TABLE Poster_Paper (
	__IDPoster_Paper__ Integer NOT NULL,
	PRIMARY KEY Poster_Paper (__IDPoster_Paper__)
) ;

CREATE TABLE Regular_Paper (
	__IDRegular_Paper__ Integer NOT NULL,
	PRIMARY KEY Regular_Paper (__IDRegular_Paper__)
) ;

CREATE TABLE Demo_Paper (
	__IDDemo_Paper__ Integer NOT NULL,
	PRIMARY KEY Demo_Paper (__IDDemo_Paper__)
) ;

CREATE TABLE Location (
	__IDLocation__ Integer NOT NULL,
	FOREIGN KEY locationOf (__FKlocationOf__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Location (__IDLocation__),
	__FKlocationOf__ Integer
) ;

CREATE TABLE Research_Institute (
	__IDResearch_Institute__ Integer NOT NULL,
	PRIMARY KEY Research_Institute (__IDResearch_Institute__)
) ;

CREATE TABLE Scientific_Event (
	__IDScientific_Event__ Integer NOT NULL,
	PRIMARY KEY Scientific_Event (__IDScientific_Event__)
) ;

CREATE TABLE Invited_Talk_Abstract (
	__IDInvited_Talk_Abstract__ Integer NOT NULL,
	PRIMARY KEY Invited_Talk_Abstract (__IDInvited_Talk_Abstract__)
) ;

CREATE TABLE Agency_Staff_Member (
	__IDAgency_Staff_Member__ Integer NOT NULL,
	PRIMARY KEY Agency_Staff_Member (__IDAgency_Staff_Member__)
) ;

CREATE TABLE Workshop_Session (
	__IDWorkshop_Session__ Integer NOT NULL,
	PRIMARY KEY Workshop_Session (__IDWorkshop_Session__)
) ;

CREATE TABLE Track (
	__IDTrack__ Integer NOT NULL,
	PRIMARY KEY Track (__IDTrack__)
) ;

CREATE TABLE Invited_Talk (
	__IDInvited_Talk__ Integer NOT NULL,
	PRIMARY KEY Invited_Talk (__IDInvited_Talk__)
) ;

CREATE TABLE Contributed_Talk (
	__IDContributed_Talk__ Integer NOT NULL,
	PRIMARY KEY Contributed_Talk (__IDContributed_Talk__)
) ;

CREATE TABLE Demo_Chair (
	__IDDemo_Chair__ Integer NOT NULL,
	PRIMARY KEY Demo_Chair (__IDDemo_Chair__)
) ;

CREATE TABLE Tutorial_Chair (
	__IDTutorial_Chair__ Integer NOT NULL,
	PRIMARY KEY Tutorial_Chair (__IDTutorial_Chair__)
) ;

CREATE TABLE PC_Chair (
	__IDPC_Chair__ Integer NOT NULL,
	PRIMARY KEY PC_Chair (__IDPC_Chair__)
) ;

CREATE TABLE PC_Member (
	__IDPC_Member__ Integer NOT NULL,
	PRIMARY KEY PC_Member (__IDPC_Member__)
) ;

CREATE TABLE OC_Member (
	__IDOC_Member__ Integer NOT NULL,
	PRIMARY KEY OC_Member (__IDOC_Member__)
) ;

CREATE TABLE Proceedings (
	__IDProceedings__ Integer NOT NULL,
	PRIMARY KEY Proceedings (__IDProceedings__)
) ;

CREATE TABLE Programme_Brochure (
	__IDProgramme_Brochure__ Integer NOT NULL,
	PRIMARY KEY Programme_Brochure (__IDProgramme_Brochure__)
) ;

CREATE TABLE Flyer (
	__IDFlyer__ Integer NOT NULL,
	PRIMARY KEY Flyer (__IDFlyer__)
) ;

CREATE TABLE Web_Site (
	__IDWeb_Site__ Integer NOT NULL,
	PRIMARY KEY Web_Site (__IDWeb_Site__)
) ;

CREATE TABLE "Multi-author_Volume" (
	"__IDMulti-author_Volume__" Integer NOT NULL,
	PRIMARY KEY "Multi-author_Volume" ("__IDMulti-author_Volume__")
) ;

CREATE TABLE Individual_Presentation (
	__IDIndividual_Presentation__ Integer NOT NULL,
	PRIMARY KEY Individual_Presentation (__IDIndividual_Presentation__)
) ;

CREATE TABLE OC_Chair (
	__IDOC_Chair__ Integer NOT NULL,
	PRIMARY KEY OC_Chair (__IDOC_Chair__)
) ;

CREATE TABLE Conference_Banquet (
	__IDConference_Banquet__ Integer NOT NULL,
	PRIMARY KEY Conference_Banquet (__IDConference_Banquet__)
) ;

CREATE TABLE Workshop_Chair (
	__IDWorkshop_Chair__ Integer NOT NULL,
	PRIMARY KEY Workshop_Chair (__IDWorkshop_Chair__)
) ;

CREATE TABLE Conference_Proceedings (
	__IDConference_Proceedings__ Integer NOT NULL,
	PRIMARY KEY Conference_Proceedings (__IDConference_Proceedings__)
) ;

CREATE TABLE Session_Chair (
	__IDSession_Chair__ Integer NOT NULL,
	PRIMARY KEY Session_Chair (__IDSession_Chair__)
) ;

CREATE TABLE "Early-Registered_Participant" (
	"__IDEarly-Registered_Participant__" Integer NOT NULL,
	PRIMARY KEY "Early-Registered_Participant" ("__IDEarly-Registered_Participant__")
) ;

CREATE TABLE "Late-Registered_Participant" (
	"__IDLate-Registered_Participant__" Integer NOT NULL,
	PRIMARY KEY "Late-Registered_Participant" ("__IDLate-Registered_Participant__")
) ;

CREATE TABLE Possible_Reviewer (
	__IDPossible_Reviewer__ Integer NOT NULL,
	FOREIGN KEY reviewerOfPaper (__FKreviewerOfPaper__) REFERENCES Paper (__IDPaper__),
	PRIMARY KEY Possible_Reviewer (__IDPossible_Reviewer__),
	__FKreviewerOfPaper__ Integer
) ;

CREATE TABLE Student (
	__IDStudent__ Integer NOT NULL,
	PRIMARY KEY Student (__IDStudent__)
) ;

CREATE TABLE Invited_Speaker (
	__IDInvited_Speaker__ Integer NOT NULL,
	PRIMARY KEY Invited_Speaker (__IDInvited_Speaker__)
) ;

CREATE TABLE Presenter (
	__IDPresenter__ Integer NOT NULL,
	PRIMARY KEY Presenter (__IDPresenter__)
) ;

CREATE TABLE SC_Member (
	__IDSC_Member__ Integer NOT NULL,
	PRIMARY KEY SC_Member (__IDSC_Member__)
) ;

CREATE TABLE Presenter_house (
	__IDPresenter_house__ Integer NOT NULL,
	PRIMARY KEY Presenter_house (__IDPresenter_house__)
) ;

CREATE TABLE Building (
	__IDBuilding__ Integer NOT NULL,
	PRIMARY KEY Building (__IDBuilding__)
) ;

CREATE TABLE Presenter_state (
	__IDPresenter_state__ Integer NOT NULL,
	PRIMARY KEY Presenter_state (__IDPresenter_state__)
) ;

CREATE TABLE Delegate (
	__IDDelegate__ Integer NOT NULL,
	PRIMARY KEY Delegate (__IDDelegate__)
) ;

CREATE TABLE Presenter_city (
	__IDPresenter_city__ Integer NOT NULL,
	PRIMARY KEY Presenter_city (__IDPresenter_city__)
) ;

CREATE TABLE Hotel_registration_form (
	__IDHotel_registration_form__ Integer NOT NULL,
	PRIMARY KEY Hotel_registration_form (__IDHotel_registration_form__)
) ;

CREATE TABLE Deadline_hotel_reservation (
	__IDDeadline_hotel_reservation__ Integer NOT NULL,
	PRIMARY KEY Deadline_hotel_reservation (__IDDeadline_hotel_reservation__)
) ;

CREATE TABLE Form (
	__IDForm__ Integer NOT NULL,
	PRIMARY KEY Form (__IDForm__)
) ;

CREATE TABLE Car (
	__IDCar__ Integer NOT NULL,
	PRIMARY KEY Car (__IDCar__)
) ;

CREATE TABLE Transport_vehicle (
	__IDTransport_vehicle__ Integer NOT NULL,
	PRIMARY KEY Transport_vehicle (__IDTransport_vehicle__)
) ;

CREATE TABLE Mailing_list (
	__IDMailing_list__ Integer NOT NULL,
	PRIMARY KEY Mailing_list (__IDMailing_list__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	FOREIGN KEY recieved_by (__FKrecieved_by__) REFERENCES User (__IDUser__),
	FOREIGN KEY used_by (__FKused_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY submited__by (__FKsubmited__by__) REFERENCES User (__IDUser__),
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY hasUpdatedVersion (__FKhasUpdatedVersion__) REFERENCES Document (__IDDocument__),
	FOREIGN KEY updatedVersionOf (__FKupdatedVersionOf__) REFERENCES Document (__IDDocument__),
	PRIMARY KEY Document (__IDDocument__),
	__FKrecieved_by__ Integer,
	__FKused_by__ Integer,
	__FKsubmited__by__ Integer,
	__FKwrittenBy__ Integer,
	__FKhasUpdatedVersion__ Integer,
	__FKupdatedVersionOf__ Integer
) ;

CREATE TABLE Renting (
	__IDRenting__ Integer NOT NULL,
	PRIMARY KEY Renting (__IDRenting__)
) ;

CREATE TABLE Activity_before_conference (
	__IDActivity_before_conference__ Integer NOT NULL,
	PRIMARY KEY Activity_before_conference (__IDActivity_before_conference__)
) ;

CREATE TABLE Dinner_banquet (
	__IDDinner_banquet__ Integer NOT NULL,
	PRIMARY KEY Dinner_banquet (__IDDinner_banquet__)
) ;

CREATE TABLE One_day_presenter (
	__IDOne_day_presenter__ Integer NOT NULL,
	PRIMARY KEY One_day_presenter (__IDOne_day_presenter__)
) ;

CREATE TABLE Social_program (
	__IDSocial_program__ Integer NOT NULL,
	PRIMARY KEY Social_program (__IDSocial_program__)
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	FOREIGN KEY sent_by (__FKsent_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_followed_by (__FKis_followed_by__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY is_monitored_by (__FKis_monitored_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY has_intensity (__FKhas_intensity__) REFERENCES intensity (__IDintensity__),
	FOREIGN KEY has_result (__FKhas_result__) REFERENCES article (__IDarticle__),
	FOREIGN KEY is_performed_by (__FKis_performed_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_supervised_by (__FKis_supervised_by__) REFERENCES human (__IDhuman__),
	FOREIGN KEY is_held_before (__FKis_held_before__) REFERENCES Time (__IDTime__),
	FOREIGN KEY is_held_after (__FKis_held_after__) REFERENCES Time (__IDTime__),
	is_dated_on text,
	PRIMARY KEY Activity (__IDActivity__),
	__FKsent_by__ Integer,
	__FKis_followed_by__ Integer,
	__FKis_monitored_by__ Integer,
	__FKhas_intensity__ Integer,
	__FKhas_result__ Integer,
	__FKis_performed_by__ Integer,
	__FKis_supervised_by__ Integer,
	__FKis_held_before__ Integer,
	__FKis_held_after__ Integer
) ;

CREATE TABLE PowerPoint_presentation (
	__IDPowerPoint_presentation__ Integer NOT NULL,
	PRIMARY KEY PowerPoint_presentation (__IDPowerPoint_presentation__)
) ;

CREATE TABLE Presentation (
	__IDPresentation__ Integer NOT NULL,
	FOREIGN KEY is_given_by (__FKis_given_by__) REFERENCES Active_conference_participant (__IDActive_conference_participant__),
	PRIMARY KEY Presentation (__IDPresentation__),
	__FKis_given_by__ Integer
) ;

CREATE TABLE Conference_restaurant (
	__IDConference_restaurant__ Integer NOT NULL,
	PRIMARY KEY Conference_restaurant (__IDConference_restaurant__)
) ;

CREATE TABLE Conference_city (
	__IDConference_city__ Integer NOT NULL,
	PRIMARY KEY Conference_city (__IDConference_city__)
) ;

CREATE TABLE Conference_state (
	__IDConference_state__ Integer NOT NULL,
	PRIMARY KEY Conference_state (__IDConference_state__)
) ;

CREATE TABLE Submissions_deadline (
	__IDSubmissions_deadline__ Integer NOT NULL,
	PRIMARY KEY Submissions_deadline (__IDSubmissions_deadline__)
) ;

CREATE TABLE Deadline (
	__IDDeadline__ Integer NOT NULL,
	done_till text,
	PRIMARY KEY Deadline (__IDDeadline__)
) ;

CREATE TABLE Simulating (
	__IDSimulating__ Integer NOT NULL,
	PRIMARY KEY Simulating (__IDSimulating__)
) ;

CREATE TABLE Research (
	__IDResearch__ Integer NOT NULL,
	PRIMARY KEY Research (__IDResearch__)
) ;

CREATE TABLE Technic_activity (
	__IDTechnic_activity__ Integer NOT NULL,
	PRIMARY KEY Technic_activity (__IDTechnic_activity__)
) ;

CREATE TABLE Conference_activity (
	__IDConference_activity__ Integer NOT NULL,
	PRIMARY KEY Conference_activity (__IDConference_activity__)
) ;

CREATE TABLE Technical_commitee (
	__IDTechnical_commitee__ Integer NOT NULL,
	PRIMARY KEY Technical_commitee (__IDTechnical_commitee__)
) ;

CREATE TABLE Place (
	__IDPlace__ Integer NOT NULL,
	FOREIGN KEY isLocationOf (__FKisLocationOf__) REFERENCES ConferenceEvent (__IDConferenceEvent__),
	FOREIGN KEY is_equipped_by (__FKis_equipped_by__) REFERENCES Item (__IDItem__),
	PRIMARY KEY Place (__IDPlace__),
	__FKisLocationOf__ Integer,
	__FKis_equipped_by__ Integer
) ;

CREATE TABLE Author_cd_proceedings_included (
	__IDAuthor_cd_proceedings_included__ Integer NOT NULL,
	PRIMARY KEY Author_cd_proceedings_included (__IDAuthor_cd_proceedings_included__)
) ;

CREATE TABLE Author (
	__IDAuthor__ Integer NOT NULL,
	FOREIGN KEY submitPaper (__FKsubmitPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writePaper (__FKwritePaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writes (__FKwrites__) REFERENCES Contribution (__IDContribution__),
	FOREIGN KEY writes_article (__FKwrites_article__) REFERENCES article (__IDarticle__),
	FOREIGN KEY assigns_article_to_conference (__FKassigns_article_to_conference__) REFERENCES article (__IDarticle__),
	FOREIGN KEY hasRelatedPaper (__FKhasRelatedPaper__) REFERENCES Paper (__IDPaper__),
	PRIMARY KEY Author (__IDAuthor__),
	__FKsubmitPaper__ Integer,
	__FKwritePaper__ Integer,
	__FKwrites__ Integer,
	__FKwrites_article__ Integer,
	__FKassigns_article_to_conference__ Integer,
	__FKhasRelatedPaper__ Integer
) ;

CREATE TABLE Cd_proceening (
	__IDCd_proceening__ Integer NOT NULL,
	PRIMARY KEY Cd_proceening (__IDCd_proceening__)
) ;

CREATE TABLE Trip_day (
	__IDTrip_day__ Integer NOT NULL,
	PRIMARY KEY Trip_day (__IDTrip_day__)
) ;

CREATE TABLE Time (
	__IDTime__ Integer NOT NULL,
	PRIMARY KEY Time (__IDTime__)
) ;

CREATE TABLE Record_of_attendance (
	__IDRecord_of_attendance__ Integer NOT NULL,
	PRIMARY KEY Record_of_attendance (__IDRecord_of_attendance__)
) ;

CREATE TABLE Listener (
	__IDListener__ Integer NOT NULL,
	PRIMARY KEY Listener (__IDListener__)
) ;

CREATE TABLE Session_room (
	__IDSession_room__ Integer NOT NULL,
	PRIMARY KEY Session_room (__IDSession_room__)
) ;

CREATE TABLE Brief_introduction_for_Session_chair (
	__IDBrief_introduction_for_Session_chair__ Integer NOT NULL,
	PRIMARY KEY Brief_introduction_for_Session_chair (__IDBrief_introduction_for_Session_chair__)
) ;

CREATE TABLE Session_chair (
	__IDSession_chair__ Integer NOT NULL,
	PRIMARY KEY Session_chair (__IDSession_chair__)
) ;

CREATE TABLE Invitation_letter (
	__IDInvitation_letter__ Integer NOT NULL,
	PRIMARY KEY Invitation_letter (__IDInvitation_letter__)
) ;

CREATE TABLE Registration_form (
	__IDRegistration_form__ Integer NOT NULL,
	PRIMARY KEY Registration_form (__IDRegistration_form__)
) ;

CREATE TABLE Viza (
	__IDViza__ Integer NOT NULL,
	PRIMARY KEY Viza (__IDViza__)
) ;

CREATE TABLE Registration (
	__IDRegistration__ Integer NOT NULL,
	PRIMARY KEY Registration (__IDRegistration__)
) ;

CREATE TABLE Conference_days (
	__IDConference_days__ Integer NOT NULL,
	PRIMARY KEY Conference_days (__IDConference_days__)
) ;

CREATE TABLE Conference_building (
	__IDConference_building__ Integer NOT NULL,
	PRIMARY KEY Conference_building (__IDConference_building__)
) ;

CREATE TABLE Registration_fee (
	__IDRegistration_fee__ Integer NOT NULL,
	PRIMARY KEY Registration_fee (__IDRegistration_fee__)
) ;

CREATE TABLE Departure (
	__IDDeparture__ Integer NOT NULL,
	PRIMARY KEY Departure (__IDDeparture__)
) ;

CREATE TABLE Activity_after_conference (
	__IDActivity_after_conference__ Integer NOT NULL,
	PRIMARY KEY Activity_after_conference (__IDActivity_after_conference__)
) ;

CREATE TABLE Conference_airport (
	__IDConference_airport__ Integer NOT NULL,
	PRIMARY KEY Conference_airport (__IDConference_airport__)
) ;

CREATE TABLE Worker_lecturer (
	__IDWorker_lecturer__ Integer NOT NULL,
	PRIMARY KEY Worker_lecturer (__IDWorker_lecturer__)
) ;

CREATE TABLE Lecturer (
	__IDLecturer__ Integer NOT NULL,
	PRIMARY KEY Lecturer (__IDLecturer__)
) ;

CREATE TABLE Transparency (
	__IDTransparency__ Integer NOT NULL,
	PRIMARY KEY Transparency (__IDTransparency__)
) ;

CREATE TABLE Speaker (
	__IDSpeaker__ Integer NOT NULL,
	PRIMARY KEY Speaker (__IDSpeaker__)
) ;

CREATE TABLE City (
	__IDCity__ Integer NOT NULL,
	PRIMARY KEY City (__IDCity__)
) ;

CREATE TABLE Card (
	__IDCard__ Integer NOT NULL,
	PRIMARY KEY Card (__IDCard__)
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	FOREIGN KEY go_through (__FKgo_through__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY is_signed_by (__FKis_signed_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_made_from (__FKis_made_from__) REFERENCES Item (__IDItem__),
	FOREIGN KEY is_sent_after (__FKis_sent_after__) REFERENCES Time (__IDTime__),
	FOREIGN KEY is_needed_for (__FKis_needed_for__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_sent_before (__FKis_sent_before__) REFERENCES Time (__IDTime__),
	FOREIGN KEY is_prepared_by (__FKis_prepared_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_used_by (__FKis_used_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_given_to (__FKis_given_to__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_sent_by (__FKis_sent_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_writen_by (__FKis_writen_by__) REFERENCES Person (__IDPerson__),
	PRIMARY KEY Item (__IDItem__),
	__FKgo_through__ Integer,
	__FKis_signed_by__ Integer,
	__FKis_made_from__ Integer,
	__FKis_sent_after__ Integer,
	__FKis_needed_for__ Integer,
	__FKis_sent_before__ Integer,
	__FKis_prepared_by__ Integer,
	__FKis_used_by__ Integer,
	__FKis_given_to__ Integer,
	__FKis_sent_by__ Integer,
	__FKis_writen_by__ Integer
) ;

CREATE TABLE Author_attendee_book_registration_fee (
	__IDAuthor_attendee_book_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Author_attendee_book_registration_fee (__IDAuthor_attendee_book_registration_fee__)
) ;

CREATE TABLE Book_proceeding (
	__IDBook_proceeding__ Integer NOT NULL,
	PRIMARY KEY Book_proceeding (__IDBook_proceeding__)
) ;

CREATE TABLE Video_cassette_player (
	__IDVideo_cassette_player__ Integer NOT NULL,
	PRIMARY KEY Video_cassette_player (__IDVideo_cassette_player__)
) ;

CREATE TABLE Audiovisual_equipment (
	__IDAudiovisual_equipment__ Integer NOT NULL,
	PRIMARY KEY Audiovisual_equipment (__IDAudiovisual_equipment__)
) ;

CREATE TABLE Video_presentation (
	__IDVideo_presentation__ Integer NOT NULL,
	PRIMARY KEY Video_presentation (__IDVideo_presentation__)
) ;

CREATE TABLE Hotel_room (
	__IDHotel_room__ Integer NOT NULL,
	PRIMARY KEY Hotel_room (__IDHotel_room__)
) ;

CREATE TABLE Hotel_presenter (
	__IDHotel_presenter__ Integer NOT NULL,
	PRIMARY KEY Hotel_presenter (__IDHotel_presenter__)
) ;

CREATE TABLE Conference_hotel (
	__IDConference_hotel__ Integer NOT NULL,
	PRIMARY KEY Conference_hotel (__IDConference_hotel__)
) ;

CREATE TABLE Money (
	__IDMoney__ Integer NOT NULL,
	FOREIGN KEY is_paid_with (__FKis_paid_with__) REFERENCES Item (__IDItem__),
	FOREIGN KEY is_paid_by (__FKis_paid_by__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY is_paid_in (__FKis_paid_in__) REFERENCES Building (__IDBuilding__),
	has_amount_of text,
	PRIMARY KEY Money (__IDMoney__),
	__FKis_paid_with__ Integer,
	__FKis_paid_by__ Integer,
	__FKis_paid_in__ Integer
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	PRIMARY KEY State (__IDState__)
) ;

CREATE TABLE Introduction (
	__IDIntroduction__ Integer NOT NULL,
	PRIMARY KEY Introduction (__IDIntroduction__)
) ;

CREATE TABLE Welcome_address (
	__IDWelcome_address__ Integer NOT NULL,
	PRIMARY KEY Welcome_address (__IDWelcome_address__)
) ;

CREATE TABLE Value_added_tax (
	__IDValue_added_tax__ Integer NOT NULL,
	PRIMARY KEY Value_added_tax (__IDValue_added_tax__)
) ;

CREATE TABLE Tax (
	__IDTax__ Integer NOT NULL,
	PRIMARY KEY Tax (__IDTax__)
) ;

CREATE TABLE Refusing_manuscript (
	__IDRefusing_manuscript__ Integer NOT NULL,
	PRIMARY KEY Refusing_manuscript (__IDRefusing_manuscript__)
) ;

CREATE TABLE Final_manuscript (
	__IDFinal_manuscript__ Integer NOT NULL,
	PRIMARY KEY Final_manuscript (__IDFinal_manuscript__)
) ;

CREATE TABLE Accepting_manuscript (
	__IDAccepting_manuscript__ Integer NOT NULL,
	PRIMARY KEY Accepting_manuscript (__IDAccepting_manuscript__)
) ;

CREATE TABLE Sponsor_city (
	__IDSponsor_city__ Integer NOT NULL,
	PRIMARY KEY Sponsor_city (__IDSponsor_city__)
) ;

CREATE TABLE Sponsor (
	__IDSponsor__ Integer NOT NULL,
	PRIMARY KEY Sponsor (__IDSponsor__)
) ;

CREATE TABLE Time_zone (
	__IDTime_zone__ Integer NOT NULL,
	PRIMARY KEY Time_zone (__IDTime_zone__)
) ;

CREATE TABLE Introduction_of_speaker (
	__IDIntroduction_of_speaker__ Integer NOT NULL,
	PRIMARY KEY Introduction_of_speaker (__IDIntroduction_of_speaker__)
) ;

CREATE TABLE Conference_hall (
	__IDConference_hall__ Integer NOT NULL,
	PRIMARY KEY Conference_hall (__IDConference_hall__)
) ;

CREATE TABLE Plenary_lecture (
	__IDPlenary_lecture__ Integer NOT NULL,
	PRIMARY KEY Plenary_lecture (__IDPlenary_lecture__)
) ;

CREATE TABLE Lecture (
	__IDLecture__ Integer NOT NULL,
	PRIMARY KEY Lecture (__IDLecture__)
) ;

CREATE TABLE Plenary_lecture_speaker (
	__IDPlenary_lecture_speaker__ Integer NOT NULL,
	PRIMARY KEY Plenary_lecture_speaker (__IDPlenary_lecture_speaker__)
) ;

CREATE TABLE LCD_projector (
	__IDLCD_projector__ Integer NOT NULL,
	PRIMARY KEY LCD_projector (__IDLCD_projector__)
) ;

CREATE TABLE Deadline_for_notification_of_acceptance (
	__IDDeadline_for_notification_of_acceptance__ Integer NOT NULL,
	PRIMARY KEY Deadline_for_notification_of_acceptance (__IDDeadline_for_notification_of_acceptance__)
) ;

CREATE TABLE Tutorial_speaker (
	__IDTutorial_speaker__ Integer NOT NULL,
	PRIMARY KEY Tutorial_speaker (__IDTutorial_speaker__)
) ;

CREATE TABLE Session (
	__IDSession__ Integer NOT NULL,
	PRIMARY KEY Session (__IDSession__)
) ;

CREATE TABLE Registation_deadline (
	__IDRegistation_deadline__ Integer NOT NULL,
	PRIMARY KEY Registation_deadline (__IDRegistation_deadline__)
) ;

CREATE TABLE Single_hotel_room (
	__IDSingle_hotel_room__ Integer NOT NULL,
	PRIMARY KEY Single_hotel_room (__IDSingle_hotel_room__)
) ;

CREATE TABLE Non_speaker (
	__IDNon_speaker__ Integer NOT NULL,
	PRIMARY KEY Non_speaker (__IDNon_speaker__)
) ;

CREATE TABLE Author_information_form (
	__IDAuthor_information_form__ Integer NOT NULL,
	PRIMARY KEY Author_information_form (__IDAuthor_information_form__)
) ;

CREATE TABLE Nonmember_registration_fee (
	__IDNonmember_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Nonmember_registration_fee (__IDNonmember_registration_fee__)
) ;

CREATE TABLE IASTED_non_member (
	__IDIASTED_non_member__ Integer NOT NULL,
	PRIMARY KEY IASTED_non_member (__IDIASTED_non_member__)
) ;

CREATE TABLE Hotel_fee (
	__IDHotel_fee__ Integer NOT NULL,
	PRIMARY KEY Hotel_fee (__IDHotel_fee__)
) ;

CREATE TABLE Fee (
	__IDFee__ Integer NOT NULL,
	PRIMARY KEY Fee (__IDFee__)
) ;

CREATE TABLE Publication (
	__IDPublication__ Integer NOT NULL,
	PRIMARY KEY Publication (__IDPublication__)
) ;

CREATE TABLE Taxi (
	__IDTaxi__ Integer NOT NULL,
	PRIMARY KEY Taxi (__IDTaxi__)
) ;

CREATE TABLE Sponsor_state (
	__IDSponsor_state__ Integer NOT NULL,
	PRIMARY KEY Sponsor_state (__IDSponsor_state__)
) ;

CREATE TABLE Review (
	__IDReview__ Integer NOT NULL,
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY reviews (__FKreviews__) REFERENCES Reviewed_contribution (__IDReviewed_contribution__),
	FOREIGN KEY gives_classification (__FKgives_classification__) REFERENCES classification (__IDclassification__),
	FOREIGN KEY is_created_in (__FKis_created_in__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY review_written_by (__FKreview_written_by__) REFERENCES Reviewer (__IDReviewer__),
	FOREIGN KEY reviewOfPaper (__FKreviewOfPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY reviewWrittenBy (__FKreviewWrittenBy__) REFERENCES Possible_Reviewer (__IDPossible_Reviewer__),
	PRIMARY KEY Review (__IDReview__),
	__FKwrittenBy__ Integer,
	__FKreviews__ Integer,
	__FKgives_classification__ Integer,
	__FKis_created_in__ Integer,
	__FKreview_written_by__ Integer,
	__FKreviewOfPaper__ Integer,
	__FKreviewWrittenBy__ Integer
) ;

CREATE TABLE Modelling (
	__IDModelling__ Integer NOT NULL,
	PRIMARY KEY Modelling (__IDModelling__)
) ;

CREATE TABLE Worker_non_speaker (
	__IDWorker_non_speaker__ Integer NOT NULL,
	PRIMARY KEY Worker_non_speaker (__IDWorker_non_speaker__)
) ;

CREATE TABLE Nonauthor_registration_fee (
	__IDNonauthor_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Nonauthor_registration_fee (__IDNonauthor_registration_fee__)
) ;

CREATE TABLE Payment_document (
	__IDPayment_document__ Integer NOT NULL,
	PRIMARY KEY Payment_document (__IDPayment_document__)
) ;

CREATE TABLE Camera_ready_manuscript_deadline (
	__IDCamera_ready_manuscript_deadline__ Integer NOT NULL,
	PRIMARY KEY Camera_ready_manuscript_deadline (__IDCamera_ready_manuscript_deadline__)
) ;

CREATE TABLE One_conference_day (
	__IDOne_conference_day__ Integer NOT NULL,
	PRIMARY KEY One_conference_day (__IDOne_conference_day__)
) ;

CREATE TABLE Fee_for_extra_trip (
	__IDFee_for_extra_trip__ Integer NOT NULL,
	PRIMARY KEY Fee_for_extra_trip (__IDFee_for_extra_trip__)
) ;

CREATE TABLE Full_day_tour (
	__IDFull_day_tour__ Integer NOT NULL,
	PRIMARY KEY Full_day_tour (__IDFull_day_tour__)
) ;

CREATE TABLE Conference_Hiker (
	__IDConference_Hiker__ Integer NOT NULL,
	PRIMARY KEY Conference_Hiker (__IDConference_Hiker__)
) ;

CREATE TABLE Computer (
	__IDComputer__ Integer NOT NULL,
	PRIMARY KEY Computer (__IDComputer__)
) ;

CREATE TABLE IASTED_member (
	__IDIASTED_member__ Integer NOT NULL,
	PRIMARY KEY IASTED_member (__IDIASTED_member__)
) ;

CREATE TABLE Memeber_registration_fee (
	__IDMemeber_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Memeber_registration_fee (__IDMemeber_registration_fee__)
) ;

CREATE TABLE Author_book_proceedings_included (
	__IDAuthor_book_proceedings_included__ Integer NOT NULL,
	PRIMARY KEY Author_book_proceedings_included (__IDAuthor_book_proceedings_included__)
) ;

CREATE TABLE Sponsor_company_house (
	__IDSponsor_company_house__ Integer NOT NULL,
	PRIMARY KEY Sponsor_company_house (__IDSponsor_company_house__)
) ;

CREATE TABLE Sponzorship (
	__IDSponzorship__ Integer NOT NULL,
	PRIMARY KEY Sponzorship (__IDSponzorship__)
) ;

CREATE TABLE Student_lecturer (
	__IDStudent_lecturer__ Integer NOT NULL,
	PRIMARY KEY Student_lecturer (__IDStudent_lecturer__)
) ;

CREATE TABLE Trip_city (
	__IDTrip_city__ Integer NOT NULL,
	PRIMARY KEY Trip_city (__IDTrip_city__)
) ;

CREATE TABLE Cheque (
	__IDCheque__ Integer NOT NULL,
	PRIMARY KEY Cheque (__IDCheque__)
) ;

CREATE TABLE Shuttle_bus (
	__IDShuttle_bus__ Integer NOT NULL,
	PRIMARY KEY Shuttle_bus (__IDShuttle_bus__)
) ;

CREATE TABLE Student_non_speaker (
	__IDStudent_non_speaker__ Integer NOT NULL,
	PRIMARY KEY Student_non_speaker (__IDStudent_non_speaker__)
) ;

CREATE TABLE Student_registration_fee (
	__IDStudent_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Student_registration_fee (__IDStudent_registration_fee__)
) ;

CREATE TABLE Author_attendee_cd_registration_fee (
	__IDAuthor_attendee_cd_registration_fee__ Integer NOT NULL,
	PRIMARY KEY Author_attendee_cd_registration_fee (__IDAuthor_attendee_cd_registration_fee__)
) ;

CREATE TABLE Tip (
	__IDTip__ Integer NOT NULL,
	PRIMARY KEY Tip (__IDTip__)
) ;

CREATE TABLE Credit_card (
	__IDCredit_card__ Integer NOT NULL,
	PRIMARY KEY Credit_card (__IDCredit_card__)
) ;

CREATE TABLE Van (
	__IDVan__ Integer NOT NULL,
	PRIMARY KEY Van (__IDVan__)
) ;

CREATE TABLE Main_office (
	__IDMain_office__ Integer NOT NULL,
	PRIMARY KEY Main_office (__IDMain_office__)
) ;

CREATE TABLE Presenter_university (
	__IDPresenter_university__ Integer NOT NULL,
	PRIMARY KEY Presenter_university (__IDPresenter_university__)
) ;

CREATE TABLE Departure_tax (
	__IDDeparture_tax__ Integer NOT NULL,
	PRIMARY KEY Departure_tax (__IDDeparture_tax__)
) ;

CREATE TABLE Receiving_manuscript (
	__IDReceiving_manuscript__ Integer NOT NULL,
	PRIMARY KEY Receiving_manuscript (__IDReceiving_manuscript__)
) ;

CREATE TABLE Double_hotel_room (
	__IDDouble_hotel_room__ Integer NOT NULL,
	PRIMARY KEY Double_hotel_room (__IDDouble_hotel_room__)
) ;

CREATE TABLE Initial_manuscipt (
	__IDInitial_manuscipt__ Integer NOT NULL,
	PRIMARY KEY Initial_manuscipt (__IDInitial_manuscipt__)
) ;

CREATE TABLE Coffee_break (
	__IDCoffee_break__ Integer NOT NULL,
	PRIMARY KEY Coffee_break (__IDCoffee_break__)
) ;

CREATE TABLE Bank_transfer (
	__IDBank_transfer__ Integer NOT NULL,
	PRIMARY KEY Bank_transfer (__IDBank_transfer__)
) ;

CREATE TABLE Overhead_projector (
	__IDOverhead_projector__ Integer NOT NULL,
	PRIMARY KEY Overhead_projector (__IDOverhead_projector__)
) ;

CREATE TABLE Speaker_lecture (
	__IDSpeaker_lecture__ Integer NOT NULL,
	PRIMARY KEY Speaker_lecture (__IDSpeaker_lecture__)
) ;

CREATE TABLE Coctail_reception (
	__IDCoctail_reception__ Integer NOT NULL,
	PRIMARY KEY Coctail_reception (__IDCoctail_reception__)
) ;

CREATE TABLE Currency (
	__IDCurrency__ Integer NOT NULL,
	PRIMARY KEY Currency (__IDCurrency__)
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

CREATE TABLE Person_occupy_Presenter_city (
	__IDPerson__ Integer NOT NULL,
	__IDPresenter_city__ Integer NOT NULL
) ;

CREATE TABLE Person_is_present_in_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_speak_in_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Person_give_Thing (
	__IDPerson__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE User_create_Thing (
	__IDUser__ Integer NOT NULL,
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

CREATE TABLE Senior_Program_Committee_member_supervises_Activity (
	__IDSenior_Program_Committee_member__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Automatic_Paper_Assignment_automatically_assign_paper_Program_Committee_member (
	__IDAutomatic_Paper_Assignment__ Integer NOT NULL,
	__IDProgram_Committee_member__ Integer NOT NULL
) ;

CREATE TABLE Call_isInitiatedBy_Person (
	__IDCall__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Event_eventOnList_Thing (
	__IDEvent__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Event_organisedBy_Thing (
	__IDEvent__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Paper_isReviewedBy_Person (
	__IDPaper__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Organisation_publisherOf_Thing (
	__IDOrganisation__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Contributed_Talk_presentationOfPaper_Document (
	__IDContributed_Talk__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Individual_Presentation_presentationOfPaper_Document (
	__IDIndividual_Presentation__ Integer NOT NULL,
	__IDDocument__ Integer NOT NULL
) ;

CREATE TABLE Document_relatesTo_Thing (
	__IDDocument__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Activity_has_result_Thing (
	__IDActivity__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Activity_is_held_in_Trip_day (
	__IDActivity__ Integer NOT NULL,
	__IDTrip_day__ Integer NOT NULL
) ;

CREATE TABLE Item_is_used_for_Thing (
	__IDItem__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;

CREATE TABLE Money_is_paid_for_Thing (
	__IDMoney__ Integer NOT NULL,
	__IDThing__ Integer NOT NULL
) ;
