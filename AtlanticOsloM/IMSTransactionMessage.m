module IMSTransactionMessage {

	type OIMAPrefixFormats {"opp_one", "opp_two"};

	type TwoByteField;

	type VariableLengthField;

	type IMSTransactionMessage {
		OIMAPrefixFormat_Att : OIMAPrefixFormats;
		StandardFieldsFlag_Att : Logical;
		OIMAPrefixComponent_ContRef : OIMAPrefix?;
		StandardFieldComponent_ContRef : StandardFields?;
		MessageComponent_ContRef : ApplicationData;
	};

	type OIMAPrefix {
		ControlDataComponent_ContRef : ControlData;
		StateDataComponent_ContRef : StateData;
		SecurityDataComponent_ContRef : SecurityData?;
		UserDataComponent_ContRef : UserData?;
	};

	type ControlData;

	type StateData;

	type SecurityData;

	type UserData;

	type StandardFields {
		Length_Ref : TwoByteField;
		ReservedField_Ref : TwoByteField;
		TransactionCode_Ref : VariableLengthField;
	};

	type ApplicationData {
		LanguageElements_Ref : TDLangElement*;
		FieldComponents_ContRef : Field+;
	};

	type Field {
		FieldContainer_Ref : ApplicationData;
	};

	type TDLangElement;
}