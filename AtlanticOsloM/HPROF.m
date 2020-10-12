module HPROF {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Profile : LocatedElement {
		Header_Att : Text;
		ThreadActions_ContRef : ThreadAction*;
		Traces_ContRef : Trace*;
		Times_ContRef : Times;
		Methods_ContRef : Method*;
	};

	type Method : LocatedElement {
		FullyQualifiedName_Att : Text;
		StackTraceElements_Ref : StackTraceElement*;
	};

	type ThreadAction : LocatedElement {
		Id_Att : Integer32;
	};

	type ThreadStart : ThreadAction {
		Obj_Att : Integer32;
		Name_Att : Text;
		Group_Att : Text;
	};

	type ThreadEnd : ThreadAction;

	type Trace : LocatedElement {
		Id_Att : Integer32;
		ThreadId_Att : Integer32;
		Elements_ContRef : StackTraceElement*;
		Times_Ref : Time*;
	};

	type StackTraceElement : LocatedElement {
		Method_Ref : Method;
		FileName_Att : Text;
		Line_Att : Integer32;
		Trace_Ref : Trace;
	};

	type Times : LocatedElement {
		Unit_Att : Text;
		Total_Att : Integer32;
		Date_ContRef : Date;
		Elements_ContRef : Time*;
	};

	type Time : LocatedElement {
		Rank_Att : Integer32;
		Self_Att : Double;
		Accum_Att : Double;
		Count_Att : Integer32;
		Trace_Ref : Trace;
		Method_Ref : Method;
	};

	type Date : LocatedElement {
		Day_Att : Day;
		Month_Att : Month;
		DayOfMonth_Att : Integer32;
		Hour_Att : Integer32;
		Minutes_Att : Integer32;
		Seconds_Att : Integer32;
		Year_Att : Integer32;
	};

	type Day {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	type Month {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
}