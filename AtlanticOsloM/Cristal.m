module Cristal {

	type Condition {
		PartCompositeMembers_Ref : PartCompositeMember*;
		ActCompositeMembers_Ref : ActCompositeMember*;
	};

	type CompositeParDef : PartDefinition {
		PartCompositeMember_ContRef : PartCompositeMember*;
	};

	type ElementaryPartDef : PartDefinition;

	type ElementaryActDef : ActivityDefinition;

	type CompositeActDef : ActivityDefinition {
		ActCompositeMembers_ContRef : ActCompositeMember*;
	};

	type ActCompositeMember {
		ActivityDefinitions_Ref : ActivityDefinition*;
	};

	type ActivityDefinition {
		ActCompositeMember_Ref : ActCompositeMember;
	};

	type PartDefinition {
		PartCompositeMembers_Ref : PartCompositeMember*;
	};

	type PartCompositeMember {
		PartDefinitions_Ref : PartDefinition;
	};
}