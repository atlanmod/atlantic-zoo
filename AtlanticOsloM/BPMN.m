module MetamodelRoot {

	type @[Bpmn.Activity] : @[Bpmn.Vertex], @[Bpmn.NamedBpmnObject] {
		OrderedMessages_ContRef : @[Bpmn.MessagingEdge]*;
		IncomingMessages_Ref : @[Bpmn.MessagingEdge]*;
		OutgoingMessages_Ref : @[Bpmn.MessagingEdge]*;
		Groups_Ref : @[Bpmn.Group]*;
		ActivityType_Att : @[Bpmn.ActivityType]?;
		EventHandlerFor_Ref : @[Bpmn.SubProcess]?;
		Lane_Ref : @[Bpmn.Lane]?;
		Looping_Att : Logical;
	};

	type @[Bpmn.ActivityType] {"SubProcess", "EventEndMultiple", "EventEndMessage", "EventIntermediateMessage", "EventStartMultiple", "EventIntermediateMultiple", "GatewayParallel", "EventStartTimer", "EventStartEmpty", "EventIntermediateCancel", "EventEndError", "EventStartRule", "EventEndTerminate", "EventStartLink", "EventIntermediateLink", "EventEndCancel", "EventEndLink", "EventIntermediateEmpty", "EventIntermediateCompensation", "Task", "GatewayDataBasedExclusive", "GatewayComplex", "EventEndEmpty", "EventIntermediateError", "EventIntermediateTimer", "EventEndCompensation", "EventStartMessage", "GatewayDataBasedInclusive", "GatewayEventBasedExclusive", "EventIntermediateRule"};

	type @[Bpmn.Artifact] : @[Bpmn.Identifiable], @[Bpmn.NamedBpmnObject] {
		Associations_ContRef : @[Bpmn.Association]*;
		ArtifactsContainer_Ref : @[Bpmn.ArtifactsContainer]?;
	};

	type @[Bpmn.ArtifactsContainer] : @[Bpmn.NamedBpmnObject] {
		Artifacts_ContRef : @[Bpmn.Artifact]*;
	};

	type @[Bpmn.Association] {
		Direction_Att : @[Bpmn.DirectionType]?;
		Source_Ref : @[Bpmn.Artifact]?;
		Target_Ref : @[Bpmn.IdentifiableNode]?;
	};

	type @[Bpmn.BpmnDiagram] : @[Bpmn.Identifiable], @[Bpmn.ArtifactsContainer] {
		Pools_ContRef : @[Bpmn.Pool]*;
		Messages_ContRef : @[Bpmn.MessagingEdge]*;
		Author_Att : Text;
		Title_Att : Text;
	};

	type @[Bpmn.DataObject] : @[Bpmn.Artifact];

	type @[Bpmn.DirectionType] {"Both", "From", "To", "None"};

	type @[Bpmn.Graph] : @[Bpmn.IdentifiableNode], @[Bpmn.ArtifactsContainer] {
		Vertices_ContRef : @[Bpmn.Vertex]*;
		SequenceEdges_ContRef : @[Bpmn.SequenceEdge]*;
	};

	type @[Bpmn.Group] : @[Bpmn.Artifact] {
		Activities_Ref : @[Bpmn.Activity]*;
	};

	type @[Bpmn.Identifiable] {
		ID_Att : Logical;
	};

	type @[Bpmn.IdentifiableNode] : @[Bpmn.Identifiable] {
		Associations_Ref : @[Bpmn.Association]*;
	};

	type @[Bpmn.Lane] : @[Bpmn.Identifiable], @[Bpmn.NamedBpmnObject] {
		Activities_Ref : @[Bpmn.Activity]*;
		Pool_Ref : @[Bpmn.Pool]?;
	};

	type @[Bpmn.MessagingEdge] : @[Bpmn.Identifiable], @[Bpmn.NamedBpmnObject] {
		BpmnDiagram_Ref : @[Bpmn.BpmnDiagram]?;
		Source_Ref : @[Bpmn.Activity]?;
		Target_Ref : @[Bpmn.Activity]?;
	};

	type @[Bpmn.NamedBpmnObject] {
		Documentation_Att : Text;
		Name_Att : Text;
		Ncname_Att : Text;
	};

	type @[Bpmn.Pool] : @[Bpmn.Graph], @[Bpmn.NamedBpmnObject] {
		Lanes_ContRef : @[Bpmn.Lane]*;
		BpmnDiagram_Ref : @[Bpmn.BpmnDiagram]?;
	};

	type @[Bpmn.SequenceEdge] : @[Bpmn.Identifiable], @[Bpmn.NamedBpmnObject] {
		Graph_Ref : @[Bpmn.Graph]?;
		IsDefault_Att : Logical;
		Source_Ref : @[Bpmn.Vertex]?;
		Target_Ref : @[Bpmn.Vertex]?;
	};

	type @[Bpmn.SubProcess] : @[Bpmn.Activity], @[Bpmn.Graph] {
		EventHandlers_ContRef : @[Bpmn.Activity]*;
		IsTransaction_Att : Logical;
	};

	type @[Bpmn.TextAnnotation] : @[Bpmn.Artifact];

	type @[Bpmn.Vertex] : @[Bpmn.IdentifiableNode] {
		OutgoingEdges_Ref : @[Bpmn.SequenceEdge]*;
		IncomingEdges_Ref : @[Bpmn.SequenceEdge]*;
		Graph_Ref : @[Bpmn.Graph]?;
	};
}