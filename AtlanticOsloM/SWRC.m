module SWRC {

	type Bibliography {
		Publications_ContRef : Publication*;
	};

	type Publication {
		Title_Att : Text;
		Abstract_Att : Text;
		Keywords_Att : Text;
		Note_Att : Text;
		Year_Att : Integer32;
	};

	type Article : Publication {
		Author_Ref : Person+;
		Journal_Att : Text;
		Month_Att : Text;
		Number_Att : Integer32;
		Pages_Att : Text;
		Volume_Att : Integer32;
	};

	type Book : Publication {
		Month_Att : Text;
		Number_Att : Integer32;
		Volume_Att : Integer32;
		Series_Att : Text;
		Source_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
		Isbn_Att : Text;
		Price_Att : Text;
		Editor_Ref : Person;
		Publisher_Ref : Organization;
		Author_Ref : Person+;
	};

	type InBook : Publication {
		Author_Ref : Person+;
		Publisher_Ref : Organization;
		Editor_Ref : Person;
		Month_Att : Text;
		Number_Att : Integer32;
		Pages_Att : Text;
		Volume_Att : Integer32;
		Series_Att : Text;
		Chapter_Att : Text;
		Type_Att : Text;
		Address_Att : Text;
	};

	type Booklet : Publication {
		Author_Ref : Person+;
		Month_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
		Howpublished_Att : Text;
	};

	type InCollection : Publication {
		Editor_Ref : Person;
		Author_Ref : Person+;
		Publisher_Ref : Organization;
		Month_Att : Text;
		Number_Att : Integer32;
		Pages_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
		Volume_Att : Integer32;
		Series_Att : Text;
		Chapter_Att : Text;
		Type_Att : Text;
		Booktitle_Att : Text;
	};

	type InProceedings : Publication {
		Editor_Ref : Person;
		Author_Ref : Person+;
		Month_Att : Text;
		Number_Att : Integer32;
		Pages_Att : Text;
		Address_Att : Text;
		Volume_Att : Integer32;
		Series_Att : Text;
		Booktitle_Att : Text;
		Organization_Ref : Organization;
		Publisher_Ref : Organization;
	};

	type Proceedings : Publication {
		Editor_Ref : Person;
		Publisher_Ref : Organization;
		Organization_Ref : Organization;
		Month_Att : Text;
		Number_Att : Text;
		Volume_Att : Text;
		Address_Att : Text;
		Series_Att : Text;
	};

	type Manual : Publication {
		Author_Ref : Person+;
		Organization_Ref : Organization;
		Month_Att : Text;
		Address_Att : Text;
		Edition_Att : Text;
	};

	type Misc : Publication {
		Month_Att : Text;
		Howpublished_Att : Text;
	};

	type Unpublished : Publication {
		Author_Ref : Person+;
		Month_Att : Text;
	};

	type Thesis : Publication {
		Author_Ref : Person+;
		School_Ref : University;
		Month_Att : Text;
		Address_Att : Text;
		Type_Att : Text;
	};

	type MasterThesis : Thesis;

	type PhDThesis : Thesis;

	type Report : Publication {
		Author_Ref : Person*;
	};

	type ProjectReport : Report {
		DescribesProject_Ref : Project;
	};

	type TechnicalReport : Report {
		Series_Att : Text;
		Organization_Ref : Organization;
	};

	type Event {
		Name_Att : Text;
		Date_Att : Text;
		EventTitle_Att : Text;
		Location_Att : Text;
		AtEvent_Ref : Event;
		HasPartEvent_Ref : Event;
	};

	type Conference : Event {
		Series_Att : Text;
	};

	type Workshop : Event {
		Series_Att : Text;
	};

	type Exhibition : Event;

	type Lecture : Event {
		GivenBy_Ref : Person;
	};

	type Meeting : Event {
		Title_Att : Text;
		Participant_Ref : Person*;
	};

	type ProjectMeeting : Meeting;

	type Person {
		Address_Att : Text;
		Name_Att : Text;
		Email_Att : Text;
		Fax_Att : Text;
		Homepage_Att : Text;
		Phone_Att : Text;
		Photo_Att : Text;
	};

	type Employee : Person {
		Affiliation_Ref : Organization;
	};

	type Manager : Employee;

	type AdministrativeStaff : Employee;

	type TechnicalStaff : Employee;

	type AcademicStaff : Person {
		CooperateWith_Ref : AcademicStaff*;
		Editor_Ref : Publication;
		HeadOf_Ref : Project;
		HeadOfGroup_Ref : ResearchGroup;
		MemberOfPC_Ref : Event;
		OrganizerOrChairOf_Ref : Event;
		Publication_Ref : Publication*;
		Supervises_Ref : PhDStudent*;
		WorksAtProject_Ref : ResearchTopic;
	};

	type Lecturer : AcademicStaff;

	type FacultyMember : AcademicStaff;

	type FullProfessor : FacultyMember;

	type AssistantProfessor : FacultyMember;

	type AssociateProfessor : FacultyMember;

	type Student : Person {
		StudiesAt_Ref : University;
	};

	type Undergraduate : Student;

	type Graduate : Student;

	type PhDStudent : Graduate {
		Publication_Ref : Publication*;
		WorksAtProject_Ref : Project;
		Supervisor_Ref : AcademicStaff;
	};

	type Organization {
		Location_Att : Text;
		Name_Att : Text;
		CarriesOut_Ref : Project*;
		Develops_Ref : Product*;
		Employs_Ref : Employee*;
		Finances_Ref : Project*;
		Publishes_Ref : Publication*;
		TechnicalReport_Ref : TechnicalReport*;
	};

	type ResearchGroup : Organization {
		Head_Ref : AcademicStaff;
		Member_Ref : Employee*;
	};

	type Association : Organization;

	type Department : Organization {
		HasParts_Ref : Institute;
	};

	type Institute : Organization {
		CooperateWith_Ref : Institute;
		HasParts_Ref : ResearchGroup*;
	};

	type Enterprise : Organization;

	type University : Organization {
		HasParts_Ref : Department*;
		Student_ContRef : Student*;
	};

	type Project {
		Name_Att : Text;
		CarriedOutBy_Ref : Organization;
		FinancedBy_Ref : Organization;
		Head_Ref : AcademicStaff;
		IsAbout_Ref : ResearchTopic+;
		Member_Ref : Person*;
		ProjectInfo_Ref : ProjectReport*;
	};

	type ResearchProject : Project;

	type DevelopmentProject : Project;

	type SoftwareProject : Project {
		Product_Ref : Product;
	};

	type Product {
		Name_Att : Text;
		DevelopedBy_Ref : Organization;
	};

	type SoftwareComponent : Product {
		HasPrice_Att : Integer32;
	};

	type Topic {
		Name_Att : Text;
	};

	type ResearchTopic : Topic {
		DealWithIn_Ref : Project;
		IsWorkedOnBy_Ref : AcademicStaff*;
	};
}