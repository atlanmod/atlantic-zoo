module SeminarSchedulingSystem {

	type SeminarSchedulingSystem {
		Presenter_Ref : Presenter*;
		Seminar_Ref : Seminar*;
	};

	type Presenter {
		Name_Att : Text;
		SeminarSchedulingSystem_Ref : SeminarSchedulingSystem;
		QualifiedFor_Ref : Seminar*;
		Offering_Ref : Offering*;
	};

	type Seminar {
		Title_Att : Text;
		SeminarSchedulingSystem_Ref : SeminarSchedulingSystem;
		Qualified_Ref : Presenter*;
		Offering_Ref : Offering*;
	};

	type Offering {
		Is_cancelled_Att : Logical;
		Date_Ref : Date;
		Attendee_Ref : Attendee*;
		Presenter_Ref : Presenter?;
		Seminar_Ref : Seminar?;
	};

	type Date {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
	};

	type Attendee {
		Name_Att : Text;
		Offering_Ref : Offering*;
	};
}