module Trace {

	type Trace {
		Levels_ContRef : Level*;
		Name_Att : Text;
	};

	type Level {
		Trace_Ref : Trace;
		Calls_ContRef : Call*;
	};

	type Call {
		Level_Ref : Level;
		Indexes_ContRef : Index+;
		MethodName_Att : Text;
		DBAccessesNumber_Att : Integer32;
		DBRowsNumber_Att : Integer32;
		CPUTime_Att : Integer32;
	};

	type Index {
		Value_Att : Integer32;
	};
}