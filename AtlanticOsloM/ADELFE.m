module ADELFE {

	type Classifier;

	type Environnement : Classifier {
		Element_ContRef : Element;
	};

	type Element : Classifier {
		Environnement_Ref : Environnement;
		Action_Ref : CooperativeAgent;
		Perception_Ref : CooperativeAgent;
	};

	type CooperativeAgent {
		ElementA_Ref : Element;
		ElementP_Ref : Element;
		Representation_ContRef : Representation+;
		Skill_ContRef : Skill+;
		Aptitude_ContRef : Aptitude*;
		Characteristic_ContRef : Characteristic*;
		Communication_ContRef : Communication*;
		Observes_Ref : CooperationRules+;
	};

	type Representation {
		CooperativeAgentR_Ref : CooperativeAgent;
		Element_Ref : Element;
	};

	type Skill {
		CooperativeAgentS_Ref : CooperativeAgent;
	};

	type Aptitude {
		CooperativeAgentA_Ref : CooperativeAgent;
	};

	type Characteristic {
		CooperativeAgentCha_Ref : CooperativeAgent;
	};

	type Communication {
		CooperativeAgentCom_Ref : CooperativeAgent;
		Aip_Ref : AIP*;
	};

	type AIP;

	type CooperationRules {
		Detects_Ref : NCS+;
	};

	type NCS {
		CooperationRules_Ref : CooperationRules;
	};

	type Incomprehension : NCS;

	type Ambiguity : NCS;

	type Incompetence : NCS;

	type Unproductiveness : NCS;

	type Concurrency : NCS;

	type Conflict : NCS;

	type Uselessness : NCS;
}