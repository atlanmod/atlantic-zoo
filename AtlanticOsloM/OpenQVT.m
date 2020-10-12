module OpenQVT {

	type Variable {
		Name_Att : Text;
		Type_Att : Text;
		Value_Att : Text;
		Visibility_Att : Text;
		Context_Ref : Context;
	};

	type Context {
		Variables_ContRef : Variable*;
		Rule_Ref : Rule;
	};

	type Rule {
		Context_ContRef : Context;
		SubRule_ContRef : Rule;
		SuperRule_Ref : Rule;
		Services_ContRef : Service*;
	};

	type RootRule : Rule {
		RuleSet_Ref : RuleSet;
	};

	type RuleSetCall : Rule {
		RuleSet_Ref : RuleSet;
	};

	type QARule : Rule {
		Query_ContRef : Query;
		Action_ContRef : Action;
	};

	type RuleSet {
		RootRule_ContRef : RootRule;
	};

	type Service {
		Visibility_Att : Text;
		Signature_Att : Text;
		Rule_Ref : Rule;
	};

	type OCLService : Service;

	type RTransService : Service;

	type JavaService : Service;

	type RulePart {
		Service_Ref : Service;
	};

	type Action : RulePart {
		QARule_Ref : QARule;
	};

	type RTransAction : Action;

	type JavaAction : Action;

	type Query : RulePart {
		QARule_Ref : QARule;
	};

	type OCLFilter : Query;

	type RTransQuery : Query;

	type JavaQuery : Query;

	type JavaFilter : Query;
}