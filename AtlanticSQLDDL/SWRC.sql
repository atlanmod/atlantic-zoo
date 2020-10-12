CREATE TABLE Bibliography (
	__IDBibliography__ Integer NOT NULL,
	PRIMARY KEY Bibliography (__IDBibliography__)
) ;

CREATE TABLE Publication (
	__IDPublication__ Integer NOT NULL,
	title text,
	abstract text,
	keywords text,
	note text,
	year Integer,
	PRIMARY KEY Publication (__IDPublication__)
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	journal text,
	month text,
	number Integer,
	pages text,
	volume Integer,
	PRIMARY KEY Article (__IDArticle__)
) ;

CREATE TABLE Book (
	__IDBook__ Integer NOT NULL,
	month text,
	number Integer,
	volume Integer,
	series text,
	source text,
	address text,
	edition text,
	isbn text,
	price text,
	FOREIGN KEY editor (__FKeditor__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY publisher (__FKpublisher__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY Book (__IDBook__),
	__FKpublisher__ Integer,
	__FKeditor__ Integer
) ;

CREATE TABLE InBook (
	__IDInBook__ Integer NOT NULL,
	FOREIGN KEY publisher (__FKpublisher__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY editor (__FKeditor__) REFERENCES Person (__IDPerson__),
	month text,
	number Integer,
	pages text,
	volume Integer,
	series text,
	chapter text,
	type text,
	address text,
	PRIMARY KEY InBook (__IDInBook__),
	__FKpublisher__ Integer,
	__FKeditor__ Integer
) ;

CREATE TABLE Booklet (
	__IDBooklet__ Integer NOT NULL,
	month text,
	address text,
	edition text,
	howpublished text,
	PRIMARY KEY Booklet (__IDBooklet__)
) ;

CREATE TABLE InCollection (
	__IDInCollection__ Integer NOT NULL,
	FOREIGN KEY editor (__FKeditor__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY publisher (__FKpublisher__) REFERENCES Organization (__IDOrganization__),
	month text,
	number Integer,
	pages text,
	address text,
	edition text,
	volume Integer,
	series text,
	chapter text,
	type text,
	booktitle text,
	PRIMARY KEY InCollection (__IDInCollection__),
	__FKpublisher__ Integer,
	__FKeditor__ Integer
) ;

CREATE TABLE InProceedings (
	__IDInProceedings__ Integer NOT NULL,
	FOREIGN KEY editor (__FKeditor__) REFERENCES Person (__IDPerson__),
	month text,
	number Integer,
	pages text,
	address text,
	volume Integer,
	series text,
	booktitle text,
	FOREIGN KEY organization (__FKorganization__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY publisher (__FKpublisher__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY InProceedings (__IDInProceedings__),
	__FKorganization__ Integer,
	__FKpublisher__ Integer,
	__FKeditor__ Integer
) ;

CREATE TABLE Proceedings (
	__IDProceedings__ Integer NOT NULL,
	FOREIGN KEY editor (__FKeditor__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY publisher (__FKpublisher__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY organization (__FKorganization__) REFERENCES Organization (__IDOrganization__),
	month text,
	number text,
	volume text,
	address text,
	series text,
	PRIMARY KEY Proceedings (__IDProceedings__),
	__FKorganization__ Integer,
	__FKeditor__ Integer,
	__FKpublisher__ Integer
) ;

CREATE TABLE Manual (
	__IDManual__ Integer NOT NULL,
	FOREIGN KEY organization (__FKorganization__) REFERENCES Organization (__IDOrganization__),
	month text,
	address text,
	edition text,
	PRIMARY KEY Manual (__IDManual__),
	__FKorganization__ Integer
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	month text,
	howpublished text,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE Unpublished (
	__IDUnpublished__ Integer NOT NULL,
	month text,
	PRIMARY KEY Unpublished (__IDUnpublished__)
) ;

CREATE TABLE Thesis (
	__IDThesis__ Integer NOT NULL,
	FOREIGN KEY school (__FKschool__) REFERENCES University (__IDUniversity__),
	month text,
	address text,
	type text,
	PRIMARY KEY Thesis (__IDThesis__),
	__FKschool__ Integer
) ;

CREATE TABLE MasterThesis (
	__IDMasterThesis__ Integer NOT NULL,
	PRIMARY KEY MasterThesis (__IDMasterThesis__)
) ;

CREATE TABLE PhDThesis (
	__IDPhDThesis__ Integer NOT NULL,
	PRIMARY KEY PhDThesis (__IDPhDThesis__)
) ;

CREATE TABLE Report (
	__IDReport__ Integer NOT NULL,
	PRIMARY KEY Report (__IDReport__)
) ;

CREATE TABLE ProjectReport (
	__IDProjectReport__ Integer NOT NULL,
	FOREIGN KEY describesProject (__FKdescribesProject__) REFERENCES Project (__IDProject__),
	PRIMARY KEY ProjectReport (__IDProjectReport__),
	__FKdescribesProject__ Integer
) ;

CREATE TABLE TechnicalReport (
	__IDTechnicalReport__ Integer NOT NULL,
	series text,
	FOREIGN KEY organization (__FKorganization__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY TechnicalReport (__IDTechnicalReport__),
	__FKorganization__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	name text,
	date text,
	eventTitle text,
	location text,
	FOREIGN KEY atEvent (__FKatEvent__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY hasPartEvent (__FKhasPartEvent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Event (__IDEvent__),
	__FKatEvent__ Integer,
	__FKhasPartEvent__ Integer
) ;

CREATE TABLE Conference (
	__IDConference__ Integer NOT NULL,
	series text,
	PRIMARY KEY Conference (__IDConference__)
) ;

CREATE TABLE Workshop (
	__IDWorkshop__ Integer NOT NULL,
	series text,
	PRIMARY KEY Workshop (__IDWorkshop__)
) ;

CREATE TABLE Exhibition (
	__IDExhibition__ Integer NOT NULL,
	PRIMARY KEY Exhibition (__IDExhibition__)
) ;

CREATE TABLE Lecture (
	__IDLecture__ Integer NOT NULL,
	FOREIGN KEY givenBy (__FKgivenBy__) REFERENCES Person (__IDPerson__),
	PRIMARY KEY Lecture (__IDLecture__),
	__FKgivenBy__ Integer
) ;

CREATE TABLE Meeting (
	__IDMeeting__ Integer NOT NULL,
	title text,
	PRIMARY KEY Meeting (__IDMeeting__)
) ;

CREATE TABLE ProjectMeeting (
	__IDProjectMeeting__ Integer NOT NULL,
	PRIMARY KEY ProjectMeeting (__IDProjectMeeting__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	address text,
	name text,
	email text,
	fax text,
	homepage text,
	phone text,
	photo text,
	PRIMARY KEY Person (__IDPerson__)
) ;

CREATE TABLE Employee (
	__IDEmployee__ Integer NOT NULL,
	FOREIGN KEY affiliation (__FKaffiliation__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY Employee (__IDEmployee__),
	__FKaffiliation__ Integer
) ;

CREATE TABLE Manager (
	__IDManager__ Integer NOT NULL,
	PRIMARY KEY Manager (__IDManager__)
) ;

CREATE TABLE AdministrativeStaff (
	__IDAdministrativeStaff__ Integer NOT NULL,
	PRIMARY KEY AdministrativeStaff (__IDAdministrativeStaff__)
) ;

CREATE TABLE TechnicalStaff (
	__IDTechnicalStaff__ Integer NOT NULL,
	PRIMARY KEY TechnicalStaff (__IDTechnicalStaff__)
) ;

CREATE TABLE AcademicStaff (
	__IDAcademicStaff__ Integer NOT NULL,
	FOREIGN KEY editor (__FKeditor__) REFERENCES Publication (__IDPublication__),
	FOREIGN KEY headOf (__FKheadOf__) REFERENCES Project (__IDProject__),
	FOREIGN KEY headOfGroup (__FKheadOfGroup__) REFERENCES ResearchGroup (__IDResearchGroup__),
	FOREIGN KEY memberOfPC (__FKmemberOfPC__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY organizerOrChairOf (__FKorganizerOrChairOf__) REFERENCES Event (__IDEvent__),
	FOREIGN KEY worksAtProject (__FKworksAtProject__) REFERENCES ResearchTopic (__IDResearchTopic__),
	PRIMARY KEY AcademicStaff (__IDAcademicStaff__),
	__FKorganizerOrChairOf__ Integer,
	__FKworksAtProject__ Integer,
	__FKeditor__ Integer,
	__FKmemberOfPC__ Integer,
	__FKheadOfGroup__ Integer,
	__FKheadOf__ Integer
) ;

CREATE TABLE Lecturer (
	__IDLecturer__ Integer NOT NULL,
	PRIMARY KEY Lecturer (__IDLecturer__)
) ;

CREATE TABLE FacultyMember (
	__IDFacultyMember__ Integer NOT NULL,
	PRIMARY KEY FacultyMember (__IDFacultyMember__)
) ;

CREATE TABLE FullProfessor (
	__IDFullProfessor__ Integer NOT NULL,
	PRIMARY KEY FullProfessor (__IDFullProfessor__)
) ;

CREATE TABLE AssistantProfessor (
	__IDAssistantProfessor__ Integer NOT NULL,
	PRIMARY KEY AssistantProfessor (__IDAssistantProfessor__)
) ;

CREATE TABLE AssociateProfessor (
	__IDAssociateProfessor__ Integer NOT NULL,
	PRIMARY KEY AssociateProfessor (__IDAssociateProfessor__)
) ;

CREATE TABLE Student (
	__IDStudent__ Integer NOT NULL,
	FOREIGN KEY studiesAt (__FKstudiesAt__) REFERENCES University (__IDUniversity__),
	PRIMARY KEY Student (__IDStudent__),
	__FKstudiesAt__ Integer
) ;

CREATE TABLE Undergraduate (
	__IDUndergraduate__ Integer NOT NULL,
	PRIMARY KEY Undergraduate (__IDUndergraduate__)
) ;

CREATE TABLE Graduate (
	__IDGraduate__ Integer NOT NULL,
	PRIMARY KEY Graduate (__IDGraduate__)
) ;

CREATE TABLE PhDStudent (
	__IDPhDStudent__ Integer NOT NULL,
	FOREIGN KEY worksAtProject (__FKworksAtProject__) REFERENCES Project (__IDProject__),
	FOREIGN KEY supervisor (__FKsupervisor__) REFERENCES AcademicStaff (__IDAcademicStaff__),
	PRIMARY KEY PhDStudent (__IDPhDStudent__),
	__FKworksAtProject__ Integer,
	__FKsupervisor__ Integer
) ;

CREATE TABLE Organization (
	__IDOrganization__ Integer NOT NULL,
	location text,
	name text,
	PRIMARY KEY Organization (__IDOrganization__)
) ;

CREATE TABLE ResearchGroup (
	__IDResearchGroup__ Integer NOT NULL,
	FOREIGN KEY head (__FKhead__) REFERENCES AcademicStaff (__IDAcademicStaff__),
	PRIMARY KEY ResearchGroup (__IDResearchGroup__),
	__FKhead__ Integer
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	PRIMARY KEY Association (__IDAssociation__)
) ;

CREATE TABLE Department (
	__IDDepartment__ Integer NOT NULL,
	FOREIGN KEY hasParts (__FKhasParts__) REFERENCES Institute (__IDInstitute__),
	PRIMARY KEY Department (__IDDepartment__),
	__FKhasParts__ Integer
) ;

CREATE TABLE Institute (
	__IDInstitute__ Integer NOT NULL,
	FOREIGN KEY cooperateWith (__FKcooperateWith__) REFERENCES Institute (__IDInstitute__),
	PRIMARY KEY Institute (__IDInstitute__),
	__FKcooperateWith__ Integer
) ;

CREATE TABLE Enterprise (
	__IDEnterprise__ Integer NOT NULL,
	PRIMARY KEY Enterprise (__IDEnterprise__)
) ;

CREATE TABLE University (
	__IDUniversity__ Integer NOT NULL,
	PRIMARY KEY University (__IDUniversity__)
) ;

CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	name text,
	FOREIGN KEY carriedOutBy (__FKcarriedOutBy__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY financedBy (__FKfinancedBy__) REFERENCES Organization (__IDOrganization__),
	FOREIGN KEY head (__FKhead__) REFERENCES AcademicStaff (__IDAcademicStaff__),
	PRIMARY KEY Project (__IDProject__),
	__FKhead__ Integer,
	__FKcarriedOutBy__ Integer,
	__FKfinancedBy__ Integer
) ;

CREATE TABLE ResearchProject (
	__IDResearchProject__ Integer NOT NULL,
	PRIMARY KEY ResearchProject (__IDResearchProject__)
) ;

CREATE TABLE DevelopmentProject (
	__IDDevelopmentProject__ Integer NOT NULL,
	PRIMARY KEY DevelopmentProject (__IDDevelopmentProject__)
) ;

CREATE TABLE SoftwareProject (
	__IDSoftwareProject__ Integer NOT NULL,
	FOREIGN KEY product (__FKproduct__) REFERENCES Product (__IDProduct__),
	PRIMARY KEY SoftwareProject (__IDSoftwareProject__),
	__FKproduct__ Integer
) ;

CREATE TABLE Product (
	__IDProduct__ Integer NOT NULL,
	name text,
	FOREIGN KEY developedBy (__FKdevelopedBy__) REFERENCES Organization (__IDOrganization__),
	PRIMARY KEY Product (__IDProduct__),
	__FKdevelopedBy__ Integer
) ;

CREATE TABLE SoftwareComponent (
	__IDSoftwareComponent__ Integer NOT NULL,
	hasPrice Integer,
	PRIMARY KEY SoftwareComponent (__IDSoftwareComponent__)
) ;

CREATE TABLE Topic (
	__IDTopic__ Integer NOT NULL,
	name text,
	PRIMARY KEY Topic (__IDTopic__)
) ;

CREATE TABLE ResearchTopic (
	__IDResearchTopic__ Integer NOT NULL,
	FOREIGN KEY dealWithIn (__FKdealWithIn__) REFERENCES Project (__IDProject__),
	PRIMARY KEY ResearchTopic (__IDResearchTopic__),
	__FKdealWithIn__ Integer
) ;

CREATE TABLE PhDStudent_publication_Publication (
	__IDPhDStudent__ Integer NOT NULL,
	__IDPublication__ Integer NOT NULL
) ;

CREATE TABLE Report_author_Person (
	__IDReport__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE AcademicStaff_publication_Publication (
	__IDAcademicStaff__ Integer NOT NULL,
	__IDPublication__ Integer NOT NULL
) ;

CREATE TABLE Organization_develops_Product (
	__IDOrganization__ Integer NOT NULL,
	__IDProduct__ Integer NOT NULL
) ;

CREATE TABLE Organization_publishes_Publication (
	__IDOrganization__ Integer NOT NULL,
	__IDPublication__ Integer NOT NULL
) ;

CREATE TABLE ResearchTopic_isWorkedOnBy_AcademicStaff (
	__IDResearchTopic__ Integer NOT NULL,
	__IDAcademicStaff__ Integer NOT NULL
) ;

CREATE TABLE InCollection_author_Person (
	__IDInCollection__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE University_hasParts_Department (
	__IDUniversity__ Integer NOT NULL,
	__IDDepartment__ Integer NOT NULL
) ;

CREATE TABLE AcademicStaff_cooperateWith_AcademicStaff (
	__IDAcademicStaff__ Integer NOT NULL,
	__IDAcademicStaff__ Integer NOT NULL
) ;

CREATE TABLE Unpublished_author_Person (
	__IDUnpublished__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Institute_hasParts_ResearchGroup (
	__IDInstitute__ Integer NOT NULL,
	__IDResearchGroup__ Integer NOT NULL
) ;

CREATE TABLE AcademicStaff_supervises_PhDStudent (
	__IDAcademicStaff__ Integer NOT NULL,
	__IDPhDStudent__ Integer NOT NULL
) ;

CREATE TABLE Bibliography_publications_Publication (
	__IDBibliography__ Integer NOT NULL,
	__IDPublication__ Integer NOT NULL
) ;

CREATE TABLE Project_projectInfo_ProjectReport (
	__IDProject__ Integer NOT NULL,
	__IDProjectReport__ Integer NOT NULL
) ;

CREATE TABLE Thesis_author_Person (
	__IDThesis__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Project_isAbout_ResearchTopic (
	__IDProject__ Integer NOT NULL,
	__IDResearchTopic__ Integer NOT NULL
) ;

CREATE TABLE Book_author_Person (
	__IDBook__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Article_author_Person (
	__IDArticle__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Booklet_author_Person (
	__IDBooklet__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Manual_author_Person (
	__IDManual__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Meeting_participant_Person (
	__IDMeeting__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE University_student_Student (
	__IDUniversity__ Integer NOT NULL,
	__IDStudent__ Integer NOT NULL
) ;

CREATE TABLE Organization_employs_Employee (
	__IDOrganization__ Integer NOT NULL,
	__IDEmployee__ Integer NOT NULL
) ;

CREATE TABLE Organization_finances_Project (
	__IDOrganization__ Integer NOT NULL,
	__IDProject__ Integer NOT NULL
) ;

CREATE TABLE Organization_carriesOut_Project (
	__IDOrganization__ Integer NOT NULL,
	__IDProject__ Integer NOT NULL
) ;

CREATE TABLE Project_member_Person (
	__IDProject__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE InBook_author_Person (
	__IDInBook__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE InProceedings_author_Person (
	__IDInProceedings__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE ResearchGroup_member_Employee (
	__IDResearchGroup__ Integer NOT NULL,
	__IDEmployee__ Integer NOT NULL
) ;

CREATE TABLE Organization_technicalReport_TechnicalReport (
	__IDOrganization__ Integer NOT NULL,
	__IDTechnicalReport__ Integer NOT NULL
) ;
