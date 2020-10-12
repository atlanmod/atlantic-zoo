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
	PRIMARY KEY Reviewer (__IDReviewer__),
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
	FOREIGN KEY hasConflictOfInterest (__FKhasConflictOfInterest__) REFERENCES Document (__IDDocument__),
	email text,
	PRIMARY KEY Person (__IDPerson__),
	__FKhasConflictOfInterest__ Integer
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	PRIMARY KEY Document (__IDDocument__)
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
	FOREIGN KEY writtenBy (__FKwrittenBy__) REFERENCES Reviewer (__IDReviewer__),
	PRIMARY KEY Review (__IDReview__),
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
	FOREIGN KEY submitPaper (__FKsubmitPaper__) REFERENCES Paper (__IDPaper__),
	FOREIGN KEY writePaper (__FKwritePaper__) REFERENCES Paper (__IDPaper__),
	PRIMARY KEY Author (__IDAuthor__),
	__FKsubmitPaper__ Integer,
	__FKwritePaper__ Integer
) ;

CREATE TABLE User (
	__IDUser__ Integer NOT NULL,
	PRIMARY KEY User (__IDUser__)
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
