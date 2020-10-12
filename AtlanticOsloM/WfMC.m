module WfMC {

	type WorkflowProcessDefinition {
		ParticipantSpecificatons_ContRef : WorkflowParticipantSpecification*;
		RevelantDatas_ContRef : WorkflowRelevantData*;
		ApplicationDeclarations_ContRef : WorkflowApplicationDeclaration*;
		ProcessActivities_ContRef : WorkflowProcessActivity*;
		TransitionInformations_ContRef : TransitionInformation*;
	};

	type WorkflowApplicationDeclaration {
		ProcessDefinition_Ref : WorkflowProcessDefinition;
		ProcessActivities_Ref : WorkflowProcessActivity*;
		RevelantDatas_Ref : WorkflowRelevantData*;
	};

	type WorkflowRelevantData {
		ProcessDefinition_Ref : WorkflowProcessDefinition;
		ApplicationDeclarations_Ref : WorkflowApplicationDeclaration*;
		ProcessActivities_Ref : WorkflowProcessActivity*;
		ParticipantSpecifications_Ref : WorkflowParticipantSpecification*;
		TransitionInformations_Ref : TransitionInformation*;
	};

	type WorkflowParticipantSpecification {
		ProcessDefinition_Ref : WorkflowProcessDefinition;
		RevelantDatas_Ref : WorkflowRelevantData*;
		ProcessActivities_Ref : WorkflowProcessActivity*;
	};

	type WorkflowProcessActivity {
		ProcessDefinition_Ref : WorkflowProcessDefinition;
		ApplicationDeclarations_Ref : WorkflowApplicationDeclaration*;
		RevelantDatas_Ref : WorkflowRelevantData*;
		ParticipantSpecifications_Ref : WorkflowParticipantSpecification*;
		To_transitionInformation_Ref : TransitionInformation;
		From_transitionInformation_Ref : TransitionInformation;
	};

	type TransitionInformation {
		ProcessDefinition_Ref : WorkflowProcessDefinition;
		RevelantDatas_Ref : WorkflowRelevantData*;
		To_processActivity_Ref : WorkflowProcessActivity;
		From_processActivity_Ref : WorkflowProcessActivity;
	};
}