module CDE {

	type IUmlType {
		Members_Ref : IUmlMember*;
	};

	type ICdeComponentSpec : IUmlType;

	type IUmlClass : IUmlType;

	type IUmlComponent : IUmlClass;

	type ICdeServer : IUmlComponent {
		Implements_Ref : ICdeComponent*;
	};

	type ICdeComponent : IUmlComponent;

	type IUmlMember;

	type ICdeMember : IUmlMember;

	type ICdeMemberExe {
		ExecutionPerformance_Att : Text;
		ResourceNeeded_Att : Text;
		ExecutionDetails_Att : Text;
	};
}