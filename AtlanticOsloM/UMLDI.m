module MetamodelRoot {

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
		Multiplicity_Ref : @[Data_Types.Multiplicity]?;
	};

	type @[Collaborations.AssociationRole] : @[Core.Association] {
		Base_Ref : @[Core.Association]?;
		ConformingLink_Ref : @[Common_Behavior.Link]*;
		Message_Ref : @[Collaborations.Message]*;
		Multiplicity_Ref : @[Data_Types.Multiplicity]?;
	};

	type @[Collaborations.AssociationEndRole] : @[Core.AssociationEnd] {
		Base_Ref : @[Core.AssociationEnd]?;
		AvailableQualifier_Ref : @[Core.Attribute]*;
		CollaborationMultiplicity_Ref : @[Data_Types.Multiplicity]?;
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

	type @[Use_Cases.UseCase] : @[Core.Classifier] {
		Include_Ref : @[Use_Cases.Include]*;
		Extend_Ref : @[Use_Cases.Extend]*;
		ExtensionPoint_ContRef : @[Use_Cases.ExtensionPoint]*;
	};

	type @[Use_Cases.Actor] : @[Core.Classifier];

	type @[Use_Cases.UseCaseInstance] : @[Common_Behavior.Instance];

	type @[Use_Cases.Extend] : @[Core.Relationship] {
		ExtensionPoint_Ref : @[Use_Cases.ExtensionPoint]+;
		Extension_Ref : @[Use_Cases.UseCase];
		Base_Ref : @[Use_Cases.UseCase];
		Condition_Ref : @[Data_Types.BooleanExpression];
	};

	type @[Use_Cases.Include] : @[Core.Relationship] {
		Addition_Ref : @[Use_Cases.UseCase];
		Base_Ref : @[Use_Cases.UseCase];
	};

	type @[Use_Cases.ExtensionPoint] : @[Core.ModelElement] {
		UseCase_Ref : @[Use_Cases.UseCase];
		Location_Att : Text;
	};

	type @[Data_Types.AggregationKind] {"ak_none", "ak_aggregate", "ak_composite"};

	type @[Data_Types.CallConcurrencyKind] {"cck_sequential", "cck_guarded", "cck_concurrent"};

	type @[Data_Types.ChangeableKind] {"ck_changeable", "ck_frozen", "ck_addOnly"};

	type @[Data_Types.OrderingKind] {"ok_unordered", "ok_ordered"};

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

	type @[Data_Types.TypeExpression] : @[Data_Types.Expression];

	type @[Data_Types.MappingExpression] : @[Data_Types.Expression];

	type @[Data_Types.ProcedureExpression] : @[Data_Types.Expression];

	type @[Data_Types.ObjectSetExpression] : @[Data_Types.Expression];

	type @[Data_Types.ActionExpression] : @[Data_Types.Expression];

	type @[Data_Types.IterationExpression] : @[Data_Types.Expression];

	type @[Data_Types.TimeExpression] : @[Data_Types.Expression];

	type @[Data_Types.ArgListsExpression] : @[Data_Types.Expression];

	type @[Data_Types.PseudostateKind] {"pk_choice", "pk_deepHistory", "pk_fork", "pk_initial", "pk_join", "pk_junction", "pk_shallowHistory"};

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
		Recurrence_Ref : @[Data_Types.IterationExpression]?;
		Target_Ref : @[Data_Types.ObjectSetExpression]?;
		IsAsynchronous_Att : Logical;
		Script_Ref : @[Data_Types.ActionExpression]?;
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
		Value_Ref : @[Data_Types.Expression];
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

	type @[Activity_Graphs.ActivityGraph] : @[State_Machines.StateMachine] {
		Partition_ContRef : @[Activity_Graphs.Partition]*;
	};

	type @[Activity_Graphs.Partition] : @[Core.ModelElement] {
		Contents_Ref : @[Core.ModelElement]*;
		ActivityGraph_Ref : @[Activity_Graphs.ActivityGraph];
	};

	type @[Activity_Graphs.SubactivityState] : @[State_Machines.SubmachineState] {
		IsDynamic_Att : Logical;
		DynamicArguments_Ref : @[Data_Types.ArgListsExpression]?;
		DynamicMultiplicity_Ref : @[Data_Types.Multiplicity]?;
	};

	type @[Activity_Graphs.ActionState] : @[State_Machines.SimpleState] {
		IsDynamic_Att : Logical;
		DynamicArguments_Ref : @[Data_Types.ArgListsExpression]?;
		DynamicMultiplicity_Ref : @[Data_Types.Multiplicity]?;
	};

	type @[Activity_Graphs.CallState] : @[Activity_Graphs.ActionState];

	type @[Activity_Graphs.ObjectFlowState] : @[State_Machines.SimpleState] {
		Type_Ref : @[Core.Classifier];
		Parameter_Ref : @[Core.Parameter]*;
		IsSynch_Att : Logical;
	};

	type @[Activity_Graphs.ClassifierInState] : @[Core.Classifier] {
		InState_Ref : @[State_Machines.State]+;
		Type_Ref : @[Core.Classifier];
	};

	type @[State_Machines.StateMachine] : @[Core.ModelElement] {
		Context_Ref : @[Core.ModelElement]?;
		SubmachineState_Ref : @[State_Machines.SubmachineState]*;
		Top_ContRef : @[State_Machines.State];
		Transitions_ContRef : @[State_Machines.Transition]*;
	};

	type @[State_Machines.Event] : @[Core.ModelElement] {
		Parameter_ContRef : @[Core.Parameter]*;
	};

	type @[State_Machines.StateVertex] : @[Core.ModelElement] {
		Container_Ref : @[State_Machines.CompositeState]?;
		Incoming_Ref : @[State_Machines.Transition]*;
		Outgoing_Ref : @[State_Machines.Transition]*;
	};

	type @[State_Machines.State] : @[State_Machines.StateVertex] {
		DeferrableEvent_Ref : @[State_Machines.Event]*;
		InternalTransition_ContRef : @[State_Machines.Transition]*;
		Exit_ContRef : @[Common_Behavior.Action]?;
		DoActivity_ContRef : @[Common_Behavior.Action]?;
		Entry_ContRef : @[Common_Behavior.Action]?;
		StateMachine_Ref : @[State_Machines.StateMachine]?;
	};

	type @[State_Machines.TimeEvent] : @[State_Machines.Event] {
		When_Ref : @[Data_Types.TimeExpression];
	};

	type @[State_Machines.CallEvent] : @[State_Machines.Event] {
		Operation_Ref : @[Core.Operation];
	};

	type @[State_Machines.SignalEvent] : @[State_Machines.Event] {
		Signal_Ref : @[Common_Behavior.Signal];
	};

	type @[State_Machines.Transition] : @[Core.ModelElement] {
		Target_Ref : @[State_Machines.StateVertex];
		Trigger_Ref : @[State_Machines.Event]?;
		StateMachine_Ref : @[State_Machines.StateMachine]?;
		Source_Ref : @[State_Machines.StateVertex];
		Effect_ContRef : @[Common_Behavior.Action]?;
		Guard_ContRef : @[State_Machines.Guard]?;
	};

	type @[State_Machines.CompositeState] : @[State_Machines.State] {
		Subvertex_ContRef : @[State_Machines.StateVertex]*;
		IsConcurrent_Att : Logical;
	};

	type @[State_Machines.ChangeEvent] : @[State_Machines.Event] {
		ChangeExpression_Ref : @[Data_Types.BooleanExpression];
	};

	type @[State_Machines.Guard] : @[Core.ModelElement] {
		Transition_Ref : @[State_Machines.Transition];
		Expression_Ref : @[Data_Types.BooleanExpression];
	};

	type @[State_Machines.Pseudostate] : @[State_Machines.StateVertex] {
		Kind_Att : @[Data_Types.PseudostateKind];
	};

	type @[State_Machines.SimpleState] : @[State_Machines.State];

	type @[State_Machines.SubmachineState] : @[State_Machines.CompositeState] {
		Submachine_Ref : @[State_Machines.StateMachine];
	};

	type @[State_Machines.SynchState] : @[State_Machines.StateVertex] {
		Bound_Att : Integer32;
	};

	type @[State_Machines.StubState] : @[State_Machines.StateVertex] {
		ReferenceState_Att : Text;
	};

	type @[State_Machines.FinalState] : @[State_Machines.State];

	type @[Diagram_Interchange.Point] {
		X_Att : Double;
		Y_Att : Double;
	};

	type @[Diagram_Interchange.Dimension] {
		Width_Att : Double;
		Height_Att : Double;
	};

	type @[Diagram_Interchange.BezierPoint] {
		Base_Ref : @[Diagram_Interchange.Point];
		Control1_Ref : @[Diagram_Interchange.Point];
		Control2_Ref : @[Diagram_Interchange.Point];
	};

	type @[Diagram_Interchange.DiagramElement] {
		Container_Ref : @[Diagram_Interchange.GraphElement]?;
		Property_ContRef : @[Diagram_Interchange.Property]*;
		Reference_Ref : @[Diagram_Interchange.Reference]*;
		IsVisible_Att : Logical;
	};

	type @[Diagram_Interchange.GraphElement] : @[Diagram_Interchange.DiagramElement] {
		SemanticModel_ContRef : @[Diagram_Interchange.SemanticModelBridge];
		Contained_ContRef : @[Diagram_Interchange.DiagramElement]*;
		Anchorage_ContRef : @[Diagram_Interchange.GraphConnector]*;
		Link_ContRef : @[Diagram_Interchange.DiagramLink]*;
		Position_Ref : @[Diagram_Interchange.Point];
	};

	type @[Diagram_Interchange.SemanticModelBridge] {
		Diagram_Ref : @[Diagram_Interchange.Diagram]?;
		GraphElement_Ref : @[Diagram_Interchange.GraphElement];
		Presentation_Att : Text;
	};

	type @[Diagram_Interchange.GraphEdge] : @[Diagram_Interchange.GraphElement] {
		Anchor_Ref : @[Diagram_Interchange.GraphConnector]#2 .. 2;
		Waypoints_Ref : @[Diagram_Interchange.BezierPoint]#2 ..;
	};

	type @[Diagram_Interchange.GraphNode] : @[Diagram_Interchange.GraphElement] {
		Size_Ref : @[Diagram_Interchange.Dimension]?;
	};

	type @[Diagram_Interchange.GraphConnector] {
		GraphElement_Ref : @[Diagram_Interchange.GraphElement];
		GraphEdge_Ref : @[Diagram_Interchange.GraphEdge]*;
		Position_Ref : @[Diagram_Interchange.Point];
	};

	type @[Diagram_Interchange.LeafElement] : @[Diagram_Interchange.DiagramElement];

	type @[Diagram_Interchange.Reference] : @[Diagram_Interchange.DiagramElement] {
		Referenced_Ref : @[Diagram_Interchange.DiagramElement];
	};

	type @[Diagram_Interchange.TextElement] : @[Diagram_Interchange.LeafElement] {
		Text_Att : Text;
	};

	type @[Diagram_Interchange.GraphicPrimitive] : @[Diagram_Interchange.LeafElement];

	type @[Diagram_Interchange.Polyline] : @[Diagram_Interchange.GraphicPrimitive] {
		Waypoints_Ref : @[Diagram_Interchange.BezierPoint]#2 ..;
		Closed_Att : Logical;
	};

	type @[Diagram_Interchange.Ellipse] : @[Diagram_Interchange.GraphicPrimitive] {
		Center_Ref : @[Diagram_Interchange.Point];
		RadiusX_Att : Double;
		RadiusY_Att : Double;
		Rotation_Att : Double;
		StartAngle_Att : Double;
		EndAngle_Att : Double;
	};

	type @[Diagram_Interchange.Image] : @[Diagram_Interchange.LeafElement] {
		Uri_Att : Text;
		MimeType_Att : Text;
	};

	type @[Diagram_Interchange.Property] {
		Key_Att : Text;
		Value_Att : Text;
	};

	type @[Diagram_Interchange.SimpleSemanticModelElement] : @[Diagram_Interchange.SemanticModelBridge] {
		TypeInfo_Att : Text;
	};

	type @[Diagram_Interchange.Uml1SemanticModelBridge] : @[Diagram_Interchange.SemanticModelBridge] {
		Element_Ref : @[Core.Element];
	};

	type @[Diagram_Interchange.CoreSemanticModelBridge] : @[Diagram_Interchange.SemanticModelBridge];

	type @[Diagram_Interchange.DiagramLink] {
		GraphElement_Ref : @[Diagram_Interchange.GraphElement];
		Diagram_Ref : @[Diagram_Interchange.Diagram];
		Zoom_Att : Double;
		Viewport_Ref : @[Diagram_Interchange.Point];
	};

	type @[Diagram_Interchange.Diagram] : @[Diagram_Interchange.GraphNode] {
		Owner_ContRef : @[Diagram_Interchange.SemanticModelBridge];
		DiagramLink_Ref : @[Diagram_Interchange.DiagramLink]*;
		Name_Att : Text;
		Zoom_Att : Double;
		Viewport_Ref : @[Diagram_Interchange.Point];
	};

	type @[Core.Element];

	type @[Core.ModelElement] : @[Core.Element] {
		TaggedValue_ContRef : @[Core.TaggedValue]*;
		ClientDependency_Ref : @[Core.Dependency]*;
		Constraint_Ref : @[Core.Constraint]*;
		Stereotype_Ref : @[Core.Stereotype]*;
		Comment_Ref : @[Core.Comment]*;
		SourceFlow_Ref : @[Core.Flow]*;
		TargetFlow_Ref : @[Core.Flow]*;
		TemplateParameter_ContRef : @[Core.TemplateParameter]*;
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

	type @[Core.Class] : @[Core.Classifier] {
		IsActive_Att : Logical;
	};

	type @[Core.DataType] : @[Core.Classifier];

	type @[Core.Feature] : @[Core.ModelElement] {
		Owner_Ref : @[Core.Classifier]?;
		OwnerScope_Att : @[Data_Types.ScopeKind];
	};

	type @[Core.StructuralFeature] : @[Core.Feature] {
		Type_Ref : @[Core.Classifier];
		Multiplicity_Ref : @[Data_Types.Multiplicity]?;
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
		Multiplicity_Ref : @[Data_Types.Multiplicity]?;
		Changeability_Att : @[Data_Types.ChangeableKind]?;
	};

	type @[Core.Interface] : @[Core.Classifier];

	type @[Core.Constraint] : @[Core.ModelElement] {
		ConstrainedElement_Ref : @[Core.ModelElement]*;
		Body_Ref : @[Data_Types.BooleanExpression]?;
	};

	type @[Core.Relationship] : @[Core.ModelElement];

	type @[Core.Association] : @[Core.GeneralizableElement], @[Core.Relationship] {
		Connection_ContRef : @[Core.AssociationEnd]#2 ..;
	};

	type @[Core.Attribute] : @[Core.StructuralFeature] {
		AssociationEnd_Ref : @[Core.AssociationEnd]?;
		InitialValue_Ref : @[Data_Types.Expression]?;
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
		DefaultValue_Ref : @[Data_Types.Expression]?;
		Kind_Att : @[Data_Types.ParameterDirectionKind];
	};

	type @[Core.Method] : @[Core.BehavioralFeature] {
		Specification_Ref : @[Core.Operation];
		Body_Ref : @[Data_Types.ProcedureExpression];
	};

	type @[Core.Generalization] : @[Core.Relationship] {
		Parent_Ref : @[Core.GeneralizableElement];
		Powertype_Ref : @[Core.Classifier]?;
		Child_Ref : @[Core.GeneralizableElement];
		Discriminator_Att : Text;
	};

	type @[Core.AssociationClass] : @[Core.Association], @[Core.Class];

	type @[Core.Dependency] : @[Core.Relationship] {
		Client_Ref : @[Core.ModelElement]+;
		Supplier_Ref : @[Core.ModelElement]+;
	};

	type @[Core.Abstraction] : @[Core.Dependency] {
		Mapping_Ref : @[Data_Types.MappingExpression]?;
	};

	type @[Core.PresentationElement] : @[Core.Element] {
		Subject_Ref : @[Core.ModelElement]*;
	};

	type @[Core.Usage] : @[Core.Dependency];

	type @[Core.Binding] : @[Core.Dependency] {
		Argument_ContRef : @[Core.TemplateArgument]+;
	};

	type @[Core.Component] : @[Core.Classifier] {
		DeploymentLocation_Ref : @[Core.Node]*;
		ResidentElement_ContRef : @[Core.ElementResidence]*;
		Implementation_Ref : @[Core.Artifact]*;
	};

	type @[Core.Node] : @[Core.Classifier] {
		DeployedComponent_Ref : @[Core.Component]*;
	};

	type @[Core.Permission] : @[Core.Dependency];

	type @[Core.Comment] : @[Core.ModelElement] {
		AnnotatedElement_Ref : @[Core.ModelElement]*;
		Body_Att : Text;
	};

	type @[Core.Flow] : @[Core.Relationship] {
		Source_Ref : @[Core.ModelElement]*;
		Target_Ref : @[Core.ModelElement]*;
	};

	type @[Core.ElementResidence] {
		Container_Ref : @[Core.Component];
		Resident_Ref : @[Core.ModelElement];
		Visibility_Att : @[Data_Types.VisibilityKind]?;
	};

	type @[Core.TemplateParameter] {
		Template_Ref : @[Core.ModelElement];
		Parameter_ContRef : @[Core.ModelElement];
		DefaultElement_Ref : @[Core.ModelElement]?;
	};

	type @[Core.Primitive] : @[Core.DataType];

	type @[Core.Enumeration] : @[Core.DataType] {
		Literal_ContRef : @[Core.EnumerationLiteral]+;
	};

	type @[Core.EnumerationLiteral] : @[Core.ModelElement] {
		Enumeration_Ref : @[Core.Enumeration];
	};

	type @[Core.Stereotype] : @[Core.GeneralizableElement] {
		StereotypeConstraint_ContRef : @[Core.Constraint]*;
		DefinedTag_ContRef : @[Core.TagDefinition]*;
		Icon_Att : Text;
		BaseClass_Att : Text;
	};

	type @[Core.TagDefinition] : @[Core.ModelElement] {
		Owner_Ref : @[Core.Stereotype]?;
		TagType_Att : Text;
		Multiplicity_Ref : @[Data_Types.Multiplicity]?;
	};

	type @[Core.TaggedValue] : @[Core.ModelElement] {
		Type_Ref : @[Core.TagDefinition];
		ReferenceValue_Ref : @[Core.ModelElement]*;
		ModelElement_Ref : @[Core.ModelElement];
		DataValue_Att : Text;
	};

	type @[Core.ProgrammingLanguageDataType] : @[Core.DataType] {
		Expression_Ref : @[Data_Types.TypeExpression];
	};

	type @[Core.Artifact] : @[Core.Classifier];

	type @[Core.TemplateArgument] {
		Binding_Ref : @[Core.Binding];
		ModelElement_Ref : @[Core.ModelElement];
	};

	type @[Model_Management.Package] : @[Core.GeneralizableElement], @[Core.Namespace] {
		ElementImport_ContRef : @[Model_Management.ElementImport]*;
	};

	type @[Model_Management.Model] : @[Model_Management.Package];

	type @[Model_Management.Subsystem] : @[Model_Management.Package], @[Core.Classifier] {
		IsInstantiable_Att : Logical;
	};

	type @[Model_Management.ElementImport] {
		Package_Ref : @[Model_Management.Package];
		ImportedElement_Ref : @[Core.ModelElement];
		Visibility_Att : @[Data_Types.VisibilityKind]?;
		Alias_Att : Text;
		IsSpecification_Att : Logical;
	};
}