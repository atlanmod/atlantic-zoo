module ODPIV {

	type InvariantSchema {
		Constrainer_AT_Ref : ActionTemplate*;
		Constrainer_ATy_Ref : ActionType*;
		Constrainer_SC_Ref : StateChange*;
		Constrainer_S_Ref : State*;
		Constrainer_IOT_Ref : InformationObjectTemplate*;
		Constrainer_IOTy_Ref : InformationObjectType*;
	};

	type InformationObjectTemplate {
		IOT_IO_Ref : InformationObject*;
		IOT_constrainer_Ref : InvariantSchema*;
	};

	type InformationObjectType {
		IOTy_IO_Ref : InformationObject*;
		IOTy_constrainer_Ref : InvariantSchema*;
	};

	type InformationObject {
		Describer_Ref : StaticSchema*;
		IO_IOT_Ref : InformationObjectTemplate*;
		IO_IOTy_Ref : InformationObjectType*;
		IO_A_Ref : Action*;
		IO_S_Ref : State;
	};

	type State {
		Change_Ref : StateChange;
		CauseSC_Ref : StateChange;
		S_IO_ContRef : InformationObject;
		S_constrainer_Ref : InvariantSchema*;
	};

	type StateChange {
		StartState_Ref : State;
		EndState_Ref : State;
		Specifier_Ref : DynamicSchema+;
		Cause_Ref : Action*;
		SC_constrainer_Ref : InvariantSchema*;
	};

	type DynamicSchema {
		DsStateChange_Ref : StateChange*;
	};

	type StaticSchema {
		LocationTime_Att : Double;
		SS_IO_Ref : InformationObject+;
	};

	type Action {
		Effect_Ref : StateChange*;
		A_AT_Ref : ActionTemplate*;
		Participant_Ref : InformationObject*;
		A_ATy_Ref : ActionType*;
	};

	type ActionType {
		ATy_A_Ref : Action*;
		ATy_constrainer_Ref : InvariantSchema*;
	};

	type ActionTemplate {
		AT_A_Ref : Action*;
		AT_constrainer_Ref : InvariantSchema*;
	};
}