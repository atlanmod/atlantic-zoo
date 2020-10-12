module MetamodelRoot {

	type @[DataTypes.AssociationDirectionKind] {"None", "To", "From", "Both"};

	type @[DataTypes.OrientationKind] {"Horizontal", "Vertical"};

	type @[DataTypes.AccessLevelKind] {"Public", "Private"};

	type @[DataTypes.ProcessTypeKind] {"None", "Private", "Abstract", "Collaboration"};

	type @[DataTypes.StatusKind] {"None", "Ready", "Active", "Cancelled", "Aborting", "Aborted", "Completing", "Completed"};

	type @[DataTypes.AdHocOrderingKind] {"Sequential", "Parallel"};

	type @[DataTypes.ModeKind] {"Automatic", "Manual"};

	type @[DataTypes.GatewayTypeKind] {"Xor", "Or", "Complex", "And"};

	type @[DataTypes.ExecutionKind] {"Asynchr", "Synchr"};

	type @[DataTypes.TriggerKind] {"None", "Message", "Timer", "Rule", "Link", "Error", "Cancel", "Compensation", "Terminate", "Multiple"};

	type @[DataTypes.ImplementationKind] {"WebService", "Other", "Unspecified"};

	type @[XPDL.Element] {
		Id_Att : Text;
		Name_Att : Text;
	};

	type @[XPDL.Package] : @[XPDL.Element] {
		Script_ContRef : @[XPDL.Script]?;
		ExternalPackages_ContRef : @[XPDL.ExternalPackage]*;
		TypeDeclarations_ContRef : @[XPDL.TypeDeclaration]*;
		Participants_ContRef : @[XPDL.Participant]*;
		Applications_ContRef : @[XPDL.Application]*;
		DataFields_ContRef : @[XPDL.DataField]*;
		Pools_ContRef : @[XPDL.Pool]*;
		MessageFlows_ContRef : @[XPDL.MessageFlow]*;
		Associations_ContRef : @[XPDL.Association]*;
		Artifacts_ContRef : @[XPDL.Artifact]*;
		WorkflowProcesses_ContRef : @[XPDL.Process]*;
	};

	type @[XPDL.MessageFlow] : @[XPDL.Element] {
		TargetActivity_Ref : @[XPDL.Activity]?;
		SourceActivity_Ref : @[XPDL.Activity]?;
		TargetPool_Ref : @[XPDL.Pool]?;
		SourcePool_Ref : @[XPDL.Pool]?;
		Object_ContRef : @[XPDL.Object]?;
	};

	type @[XPDL.Association] : @[XPDL.Element] {
		AssociationDirection_Att : @[DataTypes.AssociationDirectionKind]?;
		TargetArtifact_Ref : @[XPDL.Artifact]?;
		SourceArtifact_Ref : @[XPDL.Artifact]?;
		TargetPool_Ref : @[XPDL.Pool]?;
		SourcePool_Ref : @[XPDL.Pool]?;
		TargetActivity_Ref : @[XPDL.Activity]?;
		SourceActivity_Ref : @[XPDL.Activity]?;
		Object_ContRef : @[XPDL.Object]?;
	};

	type @[XPDL.Pool] : @[XPDL.Element] {
		Orientation_Att : @[DataTypes.OrientationKind]?;
		BoundaryVisible_Att : Logical;
		Lanes_ContRef : @[XPDL.Lane]*;
		Object_ContRef : @[XPDL.Object]?;
		Participant_Ref : @[XPDL.Participant]?;
		Process_Ref : @[XPDL.Process]?;
	};

	type @[XPDL.Lane] : @[XPDL.Element] {
		Object_ContRef : @[XPDL.Object]?;
		ParentLane_Ref : @[XPDL.Lane]?;
		ParentPool_Ref : @[XPDL.Pool]?;
	};

	type @[XPDL.Participant] : @[XPDL.Element];

	type @[XPDL.Artifact] : @[XPDL.Element] {
		TextAnnotation_Att : Text;
		Group_Att : Text;
		Object_ContRef : @[XPDL.Object]?;
		DataObject_ContRef : @[XPDL.DataObject]?;
	};

	type @[XPDL.DataObject] : @[XPDL.Artifact] {
		State_Att : Text;
		RequiredForStart_Att : Logical;
		ProducedAtCompletion_Att : Logical;
		DataFields_ContRef : @[XPDL.DataField]*;
	};

	type @[XPDL.Group] : @[XPDL.Artifact];

	type @[XPDL.Annotation] : @[XPDL.Artifact];

	type @[XPDL.TypeDeclaration] : @[XPDL.Element];

	type @[XPDL.Application] : @[XPDL.Element];

	type @[XPDL.ParametrizedApplication] : @[XPDL.Application];

	type @[XPDL.ReferencedApplication] : @[XPDL.Application] {
		ExternalReference_ContRef : @[XPDL.ExternalReference]?;
	};

	type @[XPDL.Activity] : @[XPDL.Element] {
		IsStartActivity_Att : Logical;
		Status_Att : @[DataTypes.StatusKind]?;
		StartMode_Att : @[DataTypes.ModeKind];
		FinishMode_Att : @[DataTypes.ModeKind];
		StartQuantity_Att : Integer32;
		IsATransaction_Att : Logical;
		DataFields_ContRef : @[XPDL.DataField]*;
		Object_ContRef : @[XPDL.Object]?;
	};

	type @[XPDL.Task] : @[XPDL.Activity];

	type @[XPDL.TaskService] : @[XPDL.Task] {
		Implementation_Att : @[DataTypes.ImplementationKind]?;
	};

	type @[XPDL.TaskReceive] : @[XPDL.Task] {
		Instantiate_Att : Logical;
		Implementation_Att : @[DataTypes.ImplementationKind]?;
	};

	type @[XPDL.TaskManual] : @[XPDL.Task];

	type @[XPDL.TaskReference] : @[XPDL.Task] {
		TaskRef_Ref : @[XPDL.Task];
	};

	type @[XPDL.TaskScript] : @[XPDL.Task] {
		Script_ContRef : @[XPDL.Script];
	};

	type @[XPDL.TaskSend] : @[XPDL.Task] {
		Implementation_Att : @[DataTypes.ImplementationKind]?;
	};

	type @[XPDL.TaskUser] : @[XPDL.Task] {
		Implementation_Att : @[DataTypes.ImplementationKind]?;
	};

	type @[XPDL.TaskApplication] : @[XPDL.Task] {
		PackageRef_Ref : @[XPDL.Package]?;
	};

	type @[XPDL.Route] : @[XPDL.Activity] {
		GatewayType_Att : @[DataTypes.GatewayTypeKind]?;
		Instantiate_Att : Logical;
		MarkerVisiable_Att : Logical;
	};

	type @[XPDL.SubFlow] : @[XPDL.Activity] {
		Execution_Att : @[DataTypes.ExecutionKind]?;
		InstanceDataField_Att : Text;
		PackageRef_Ref : @[XPDL.Package]?;
		StartActivitySet_Ref : @[XPDL.ActivitySet]?;
		StartActivity_Ref : @[XPDL.Activity]?;
	};

	type @[XPDL.BlockActivity] : @[XPDL.Activity] {
		ActivitySet_Ref : @[XPDL.ActivitySet];
		StartActivity_Ref : @[XPDL.Activity]?;
	};

	type @[XPDL.Event] : @[XPDL.Activity] {
		TriggerKind_Att : @[DataTypes.TriggerKind];
		Implementation_Att : @[DataTypes.ImplementationKind]?;
		Trigger_ContRef : @[XPDL.Trigger]?;
	};

	type @[XPDL.Trigger];

	type @[XPDL.ResultCompensation] : @[XPDL.Trigger] {
		Activity_Ref : @[XPDL.Activity]?;
	};

	type @[XPDL.ResultError] : @[XPDL.Trigger] {
		ErrorCode_Att : Text;
	};

	type @[XPDL.ResultMultiple] : @[XPDL.Trigger];

	type @[XPDL.TriggerResultLink] : @[XPDL.Trigger] {
		ProcessRef_Ref : @[XPDL.Process];
	};

	type @[XPDL.TriggerResultMessage] : @[XPDL.Trigger];

	type @[XPDL.TriggerIntermediateMultiple] : @[XPDL.Trigger];

	type @[XPDL.TriggerMultiple] : @[XPDL.Trigger];

	type @[XPDL.TriggerRule] : @[XPDL.Trigger] {
		RuleName_Att : Text;
	};

	type @[XPDL.TriggerTimer] : @[XPDL.Trigger] {
		TimeDate_Att : Text;
		TimeCycle_Att : Text;
	};

	type @[XPDL.StartEvent] : @[XPDL.Event];

	type @[XPDL.IntermediateEvent] : @[XPDL.Event] {
		Target_Ref : @[XPDL.Activity]?;
	};

	type @[XPDL.EndEvent] : @[XPDL.Event];

	type @[XPDL.Gateway] : @[XPDL.Route];

	type @[XPDL.Process] : @[XPDL.Element] {
		AccessLevel_Att : @[DataTypes.AccessLevelKind]?;
		ProcessType_Att : @[DataTypes.ProcessTypeKind]?;
		Status_Att : @[DataTypes.StatusKind]?;
		SuppressJoinFailure_Att : Logical;
		EnableInstanceCompensation_Att : Logical;
		AdHoc_Att : Logical;
		AdHocOrdering_Att : @[DataTypes.AdHocOrderingKind]?;
		AdHocCompletionCondition_Att : Text;
		Participant_ContRef : @[XPDL.Participant]*;
		Applications_ContRef : @[XPDL.Application]*;
		DataField_ContRef : @[XPDL.DataField];
		ActivitySets_ContRef : @[XPDL.ActivitySet]*;
		Activities_ContRef : @[XPDL.Activity]*;
		Transitions_ContRef : @[XPDL.Transition]*;
		Object_ContRef : @[XPDL.Object]?;
		DefaultStartActivitySet_Ref : @[XPDL.ActivitySet]?;
		DefaultStartActivity_Ref : @[XPDL.Activity]?;
	};

	type @[XPDL.Transition] : @[XPDL.Element] {
		Quantity_Att : Integer32;
		Object_ContRef : @[XPDL.Object]?;
		To_Ref : @[XPDL.Activity];
		From_Ref : @[XPDL.Activity];
	};

	type @[XPDL.ActivitySet] : @[XPDL.Element] {
		AdHoc_Att : Logical;
		AdHocOrdering_Att : @[DataTypes.AdHocOrderingKind]?;
		AdHocCompletionCondition_Att : Text;
		DefaultStartActivity_Ref : @[XPDL.Activity]?;
		Activities_ContRef : @[XPDL.Activity]*;
		Transitions_ContRef : @[XPDL.Transition]*;
		Object_ContRef : @[XPDL.Object]?;
	};

	type @[XPDL.ExternalReference] {
		Xref_Att : Text;
		Location_Att : Text;
		Namespace_Att : Text;
	};

	type @[XPDL.Object] : @[XPDL.Element] {
		Categories_ContRef : @[XPDL.Category]*;
	};

	type @[XPDL.ExternalPackage] : @[XPDL.Element] {
		Href_Att : Text;
	};

	type @[XPDL.Category] : @[XPDL.Element];

	type @[XPDL.DataField] : @[XPDL.Element] {
		IsArray_Att : Logical;
		Correlation_Att : Logical;
		DataType_ContRef : @[XPDL.TypeDeclaration];
	};

	type @[XPDL.Script] {
		Type_Att : Text;
		Version_Att : Text;
		Grammar_Att : Text;
	};
}