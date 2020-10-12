module MetamodelRoot {

	type @[Core.Element];

	type @[Core.ModelElement] : @[Core.Element] {
		Namespace_Ref : @[Core.Namespace]?;
		Name_Att : Text;
		Visibility_Att : @[Data_Types.VisibilityKind]?;
		IsSpecification_Att : Logical;
	};

	type @[Core.GeneralizableElement] : @[Core.ModelElement] {
		Generalization_Ref : @[Core.Generalization]*;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type @[Core.Namespace] : @[Core.ModelElement] {
		OwnedElement_ContRef : @[Core.ModelElement]*;
	};

	type @[Core.Classifier] : @[Core.GeneralizableElement], @[Core.Namespace] {
		PowertypeRange_Ref : @[Core.Generalization]*;
		Feature_ContRef : @[Core.Feature]*;
	};

	type @[Core.Feature] : @[Core.ModelElement] {
		Owner_Ref : @[Core.Classifier]?;
		OwnerScope_Att : @[Data_Types.ScopeKind];
	};

	type @[Core.StructuralFeature] : @[Core.Feature] {
		Type_Ref : @[Core.Classifier];
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
		Changeability_Att : @[Data_Types.ChangeableKind]?;
		TargetScope_Att : @[Data_Types.ScopeKind]?;
		Ordering_Att : @[Data_Types.OrderingKind]?;
	};

	type @[Core.AssociationEnd] : @[Core.ModelElement] {
		Association_Ref : @[Core.Association];
		Specification_Ref : @[Core.Classifier]*;
		Participant_Ref : @[Core.Classifier];
		Qualifier_ContRef : @[Core.Attribute]*;
		IsNavigable_Att : Logical;
		Ordering_Att : @[Data_Types.OrderingKind]?;
		Aggregation_Att : @[Data_Types.AggregationKind]?;
		TargetScope_Att : @[Data_Types.ScopeKind]?;
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
		Changeability_Att : @[Data_Types.ChangeableKind]?;
	};

	type @[Core.Relationship] : @[Core.ModelElement];

	type @[Core.Association] : @[Core.GeneralizableElement], @[Core.Relationship] {
		Connection_ContRef : @[Core.AssociationEnd]#2 ..;
	};

	type @[Core.Attribute] : @[Core.StructuralFeature] {
		AssociationEnd_Ref : @[Core.AssociationEnd]?;
		InitialValue_ContRef : @[Data_Types.Expression]?;
	};

	type @[Core.BehavioralFeature] : @[Core.Feature] {
		Parameter_ContRef : @[Core.Parameter]*;
		IsQuery_Att : Logical;
	};

	type @[Core.Operation] : @[Core.BehavioralFeature] {
		Concurrency_Att : @[Data_Types.CallConcurrencyKind]?;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
		Specification_Att : Text;
	};

	type @[Core.Parameter] : @[Core.ModelElement] {
		Type_Ref : @[Core.Classifier];
		BehavioralFeature_Ref : @[Core.BehavioralFeature]?;
		DefaultValue_ContRef : @[Data_Types.Expression]?;
		Kind_Att : @[Data_Types.ParameterDirectionKind];
	};

	type @[Core.Generalization] : @[Core.Relationship] {
		Parent_Ref : @[Core.GeneralizableElement];
		Powertype_Ref : @[Core.Classifier]?;
		Child_Ref : @[Core.GeneralizableElement];
		Discriminator_Att : Text;
	};

	type @[Data_Types.AggregationKind] {"ak_none", "ak_aggregate", "ak_composite"};

	type @[Data_Types.ChangeableKind] {"ck_changeable", "ck_frozen", "ck_addOnly"};

	type @[Data_Types.OrderingKind] {"ok_unordered", "ok_ordered"};

	type @[Data_Types.CallConcurrencyKind] {"cck_sequential", "cck_guarded", "cck_concurrent"};

	type @[Data_Types.ParameterDirectionKind] {"pdk_in", "pdk_inout", "pdk_out", "pdk_return"};

	type @[Data_Types.ScopeKind] {"sk_instance", "sk_classifier"};

	type @[Data_Types.VisibilityKind] {"vk_public", "vk_protected", "vk_private", "vk_package"};

	type @[Data_Types.Multiplicity] {
		Range_ContRef : @[Data_Types.MultiplicityRange]+;
	};

	type @[Data_Types.MultiplicityRange] {
		Multiplicity_Ref : @[Data_Types.Multiplicity];
		Lower_Att : Integer32;
		Upper_Att : Integer32;
	};

	type @[Data_Types.Expression] {
		Language_Att : Text;
		Body_Att : Text;
	};

	type @[Data_Types.BooleanExpression] : @[Data_Types.Expression];

	type @[Data_Types.ObjectSetExpression] : @[Data_Types.Expression];

	type @[Data_Types.ActionExpression] : @[Data_Types.Expression];

	type @[Data_Types.IterationExpression] : @[Data_Types.Expression];

	type @[Common_Behavior.Instance] : @[Core.ModelElement] {
		OwnedInstance_ContRef : @[Common_Behavior.Instance]*;
		LinkEnd_Ref : @[Common_Behavior.LinkEnd]*;
		Classifier_Ref : @[Core.Classifier]+;
		ComponentInstance_Ref : @[Common_Behavior.ComponentInstance]?;
		Slot_ContRef : @[Common_Behavior.AttributeLink]*;
		OwnedLink_ContRef : @[Common_Behavior.Link]*;
	};

	type @[Common_Behavior.Signal] : @[Core.Classifier];

	type @[Common_Behavior.Action] : @[Core.ModelElement] {
		ActualArgument_ContRef : @[Common_Behavior.Argument]*;
		ActionSequence_Ref : @[Common_Behavior.ActionSequence]?;
		Recurrence_ContRef : @[Data_Types.IterationExpression]?;
		Target_ContRef : @[Data_Types.ObjectSetExpression]?;
		IsAsynchronous_Att : Logical;
		Script_ContRef : @[Data_Types.ActionExpression]?;
	};

	type @[Common_Behavior.CreateAction] : @[Common_Behavior.Action] {
		Instantiation_Ref : @[Core.Classifier];
	};

	type @[Common_Behavior.DestroyAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.UninterpretedAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.AttributeLink] : @[Core.ModelElement] {
		Instance_Ref : @[Common_Behavior.Instance]?;
		Value_Ref : @[Common_Behavior.Instance];
		LinkEnd_Ref : @[Common_Behavior.LinkEnd]?;
		Attribute_Ref : @[Core.Attribute];
	};

	type @[Common_Behavior.Object] : @[Common_Behavior.Instance];

	type @[Common_Behavior.Link] : @[Core.ModelElement] {
		Association_Ref : @[Core.Association];
		Connection_ContRef : @[Common_Behavior.LinkEnd]#2 ..;
	};

	type @[Common_Behavior.LinkObject] : @[Common_Behavior.Object], @[Common_Behavior.Link];

	type @[Common_Behavior.DataValue] : @[Common_Behavior.Instance];

	type @[Common_Behavior.CallAction] : @[Common_Behavior.Action] {
		Operation_Ref : @[Core.Operation];
	};

	type @[Common_Behavior.SendAction] : @[Common_Behavior.Action] {
		Signal_Ref : @[Common_Behavior.Signal];
	};

	type @[Common_Behavior.ActionSequence] : @[Common_Behavior.Action] {
		Action_ContRef : @[Common_Behavior.Action]*;
	};

	type @[Common_Behavior.Argument] : @[Core.ModelElement] {
		Action_Ref : @[Common_Behavior.Action]?;
		Value_ContRef : @[Data_Types.Expression];
	};

	type @[Common_Behavior.Reception] : @[Core.BehavioralFeature] {
		Signal_Ref : @[Common_Behavior.Signal];
		Specification_Att : Text;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type @[Common_Behavior.LinkEnd] : @[Core.ModelElement] {
		Link_Ref : @[Common_Behavior.Link];
		QualifiedValue_ContRef : @[Common_Behavior.AttributeLink]*;
		Instance_Ref : @[Common_Behavior.Instance];
		AssociationEnd_Ref : @[Core.AssociationEnd];
	};

	type @[Common_Behavior.ReturnAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.TerminateAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.Stimulus] : @[Core.ModelElement] {
		Argument_Ref : @[Common_Behavior.Instance]*;
		CommunicationLink_Ref : @[Common_Behavior.Link]?;
		Receiver_Ref : @[Common_Behavior.Instance];
		DispatchAction_Ref : @[Common_Behavior.Action];
		Sender_Ref : @[Common_Behavior.Instance];
	};

	type @[Common_Behavior.Exception] : @[Common_Behavior.Signal];

	type @[Common_Behavior.ComponentInstance] : @[Common_Behavior.Instance] {
		Resident_Ref : @[Common_Behavior.Instance]*;
		NodeInstance_Ref : @[Common_Behavior.NodeInstance]?;
	};

	type @[Common_Behavior.NodeInstance] : @[Common_Behavior.Instance] {
		Resident_Ref : @[Common_Behavior.ComponentInstance]*;
	};

	type @[Common_Behavior.SubsystemInstance] : @[Common_Behavior.Instance];

	type @[Collaborations.Collaboration] : @[Core.GeneralizableElement], @[Core.Namespace] {
		UsedCollaboration_Ref : @[Collaborations.Collaboration]*;
		RepresentedOperation_Ref : @[Core.Operation]?;
		RepresentedClassifier_Ref : @[Core.Classifier]?;
		Interaction_ContRef : @[Collaborations.Interaction]*;
		ConstrainingElement_Ref : @[Core.ModelElement]*;
	};

	type @[Collaborations.ClassifierRole] : @[Core.Classifier] {
		AvailableContents_Ref : @[Core.ModelElement]*;
		Base_Ref : @[Core.Classifier]+;
		ConformingInstance_Ref : @[Common_Behavior.Instance]*;
		AvailableFeature_Ref : @[Core.Feature]*;
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
	};

	type @[Collaborations.AssociationRole] : @[Core.Association] {
		Base_Ref : @[Core.Association]?;
		ConformingLink_Ref : @[Common_Behavior.Link]*;
		Message_Ref : @[Collaborations.Message]*;
		Multiplicity_ContRef : @[Data_Types.Multiplicity]?;
	};

	type @[Collaborations.AssociationEndRole] : @[Core.AssociationEnd] {
		Base_Ref : @[Core.AssociationEnd]?;
		AvailableQualifier_Ref : @[Core.Attribute]*;
		CollaborationMultiplicity_ContRef : @[Data_Types.Multiplicity]?;
	};

	type @[Collaborations.Message] : @[Core.ModelElement] {
		Interaction_Ref : @[Collaborations.Interaction];
		ConformingStimulus_Ref : @[Common_Behavior.Stimulus]*;
		Action_Ref : @[Common_Behavior.Action];
		CommunicationConnection_Ref : @[Collaborations.AssociationRole]?;
		Activator_Ref : @[Collaborations.Message]?;
		Receiver_Ref : @[Collaborations.ClassifierRole];
		Sender_Ref : @[Collaborations.ClassifierRole];
		Predecessor_Ref : @[Collaborations.Message]*;
	};

	type @[Collaborations.Interaction] : @[Core.ModelElement] {
		Message_ContRef : @[Collaborations.Message]+;
		Context_Ref : @[Collaborations.Collaboration];
	};

	type @[Collaborations.InteractionInstanceSet] : @[Core.ModelElement] {
		Interaction_Ref : @[Collaborations.Interaction]?;
		Context_Ref : @[Collaborations.CollaborationInstanceSet];
		ParticipatingStimulus_Ref : @[Common_Behavior.Stimulus]+;
	};

	type @[Collaborations.CollaborationInstanceSet] : @[Core.ModelElement] {
		Collaboration_Ref : @[Collaborations.Collaboration]?;
		ConstrainingElement_Ref : @[Core.ModelElement]*;
		ParticipatingInstance_Ref : @[Common_Behavior.Instance]+;
		InteractionInstanceSet_ContRef : @[Collaborations.InteractionInstanceSet]*;
		ParticipatingLink_Ref : @[Common_Behavior.Link]*;
	};
}