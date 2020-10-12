module Diagnostic {

	type Severity {"error", "warning", "critic"};

	type Problem {
		Severity_Att : Severity;
		Location_Att : Text;
		Description_Att : Text;
	};
}