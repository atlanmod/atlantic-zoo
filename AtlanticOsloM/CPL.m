module CPL {

	type Element;

	type CPL : Element {
		SubActions_ContRef : SubAction*;
		Outgoing_ContRef : Outgoing?;
		Incoming_ContRef : Incoming?;
	};

	type NodeContainer : Element {
		Contents_ContRef : Node?;
	};

	type SubAction : NodeContainer {
		Id_Att : Text;
	};

	type Outgoing : NodeContainer;

	type Incoming : NodeContainer;

	type NotPresent : NodeContainer;

	type Otherwise : NodeContainer;

	type SwitchedAddress : NodeContainer {
		Is_Att : Text;
		Contains_Att : Text;
		SubDomainOf_Att : Text;
	};

	type SwitchedString : NodeContainer {
		Is_Att : Text;
		Contains_Att : Text;
	};

	type SwitchedLanguage : NodeContainer {
		Matches_Att : Text;
	};

	type SwitchedTime : NodeContainer {
		Dtstart_Att : Text;
		Dtend_Att : Text;
		Duration_Att : Text;
		Freq_Att : Text;
		Until_Att : Text;
		Count_Att : Text;
		Interval_Att : Text;
		BySecond_Att : Text;
		ByMinute_Att : Text;
		ByHour_Att : Text;
		ByDay_Att : Text;
		ByMonthDay_Att : Text;
		ByYearDay_Att : Text;
		ByWeekNo_Att : Text;
		ByMonth_Att : Text;
		Wkst_Att : Text;
		BySetPos_Att : Text;
	};

	type SwitchedPriority : NodeContainer {
		Less_Att : Text;
		Greater_Att : Text;
		Equal_Att : Text;
	};

	type Busy : NodeContainer;

	type NoAnswer : NodeContainer;

	type Redirection : NodeContainer;

	type Failure : NodeContainer;

	type Default : NodeContainer;

	type Node : Element;

	type Switch : Node {
		NotPresent_ContRef : NotPresent?;
		Otherwise_ContRef : Otherwise?;
	};

	type AddressSwitch : Switch {
		Field_Att : Text;
		SubField_Att : Text;
		Addresses_ContRef : SwitchedAddress*;
	};

	type StringSwitch : Switch {
		Field_Att : Text;
		Strings_ContRef : SwitchedString*;
	};

	type LanguageSwitch : Switch {
		Languages_ContRef : SwitchedLanguage*;
	};

	type TimeSwitch : Switch {
		Tzid_Att : Text;
		Tzurl_Att : Text;
		Times_ContRef : SwitchedTime*;
	};

	type PrioritySwitch : Switch {
		Priorities_ContRef : SwitchedPriority*;
	};

	type Location : Node, NodeContainer {
		Url_Att : Text;
		Priority_Att : Text;
		Clear_Att : Text;
	};

	type SubCall : Node {
		Ref_Att : Text;
	};

	type Action : Node;

	type SignallingAction : Action;

	type Proxy : SignallingAction {
		Timeout_Att : Text;
		Recurse_Att : Text;
		Ordering_Att : Text;
		Busy_ContRef : Busy?;
		NoAnswer_ContRef : NoAnswer?;
		Redirection_ContRef : Redirection?;
		Failure_ContRef : Failure?;
		Default_ContRef : Default?;
	};

	type Redirect : SignallingAction {
		Permanent_Att : Text;
	};

	type Reject : SignallingAction {
		Status_Att : Text;
		Reason_Att : Text;
	};
}