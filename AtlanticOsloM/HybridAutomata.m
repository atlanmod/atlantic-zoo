module HybridAutomata {

	type FiniteTransition {
		Trigger_Att : Text;
		Guard_Att : Text;
		Action_Att : Text;
	};

	type FiniteState {
		Name_Att : Text;
		Position_Att : Text;
		IsInit_Att : Logical;
	};
}