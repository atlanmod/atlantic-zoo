module SPEM {

	type ArtifactUsageName {
		IsInput_Att : Logical;
		IsOutput_Att : Logical;
		HasWorkPerArtifact_Att : Logical;
		ArtifactKind_Ref : ArtifactKind;
		WorkDefinition_Ref : WorkDefinition;
	};

	type ProcessDefinitionElement {
		Guidances_Ref : Guidance*;
		ProcessComponents_Ref : ProcessComponent*;
	};

	type Guidance : ProcessDefinitionElement {
		ProcessDefinitionElements_Ref : ProcessDefinitionElement+;
	};

	type ArtifactKind : ProcessDefinitionElement {
		ArtifactUsageNames_Ref : ArtifactUsageName*;
		Responsible_Ref : RoleKind?;
	};

	type WorkItem : ProcessDefinitionElement;

	type RoleKind : ProcessDefinitionElement {
		ArtifactKinds_Ref : ArtifactKind*;
	};

	type Condition : ProcessDefinitionElement;

	type ProcessComponent : ProcessDefinitionElement {
		ProcessDefinitionElements_Ref : ProcessDefinitionElement*;
	};

	type Goal : Condition {
		WorkDefinition_Ref : WorkDefinition;
	};

	type Precondition : Condition {
		WorkDefinition_Ref : WorkDefinition;
	};

	type WorkDefinition : WorkItem {
		ArtifactUsageNames_ContRef : ArtifactUsageName*;
		Goal_ContRef : Goal?;
		Precondition_ContRef : Precondition?;
	};

	type ActivityKind : WorkDefinition {
		Performer_Ref : RoleKind+;
		Assistant_Ref : RoleKind*;
	};

	type Iteration : WorkDefinition;

	type Phase : WorkDefinition;

	type Lifecycle : WorkDefinition;
}