CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	activityType text,
	FOREIGN KEY eventHandlerFor (__FKeventHandlerFor__) REFERENCES SubProcess (__IDSubProcess__),
	FOREIGN KEY lane (__FKlane__) REFERENCES Lane (__IDLane__),
	looping Boolean,
	PRIMARY KEY Activity (__IDActivity__),
	__FKeventHandlerFor__ Integer,
	__FKlane__ Integer
) ;

CREATE TABLE Artifact (
	__IDArtifact__ Integer NOT NULL,
	FOREIGN KEY artifactsContainer (__FKartifactsContainer__) REFERENCES ArtifactsContainer (__IDArtifactsContainer__),
	PRIMARY KEY Artifact (__IDArtifact__),
	__FKartifactsContainer__ Integer
) ;

CREATE TABLE ArtifactsContainer (
	__IDArtifactsContainer__ Integer NOT NULL,
	PRIMARY KEY ArtifactsContainer (__IDArtifactsContainer__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	direction text,
	FOREIGN KEY source (__FKsource__) REFERENCES Artifact (__IDArtifact__),
	FOREIGN KEY target (__FKtarget__) REFERENCES IdentifiableNode (__IDIdentifiableNode__),
	PRIMARY KEY Association (__IDAssociation__),
	__FKtarget__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE BpmnDiagram (
	__IDBpmnDiagram__ Integer NOT NULL,
	author text,
	title text,
	PRIMARY KEY BpmnDiagram (__IDBpmnDiagram__)
) ;

CREATE TABLE DataObject (
	__IDDataObject__ Integer NOT NULL,
	PRIMARY KEY DataObject (__IDDataObject__)
) ;

CREATE TABLE Graph (
	__IDGraph__ Integer NOT NULL,
	PRIMARY KEY Graph (__IDGraph__)
) ;

CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	PRIMARY KEY "Group" (__IDGroup__)
) ;

CREATE TABLE Identifiable (
	__IDIdentifiable__ Integer NOT NULL,
	iD text,
	PRIMARY KEY Identifiable (__IDIdentifiable__)
) ;

CREATE TABLE IdentifiableNode (
	__IDIdentifiableNode__ Integer NOT NULL,
	PRIMARY KEY IdentifiableNode (__IDIdentifiableNode__)
) ;

CREATE TABLE Lane (
	__IDLane__ Integer NOT NULL,
	FOREIGN KEY pool (__FKpool__) REFERENCES Pool (__IDPool__),
	PRIMARY KEY Lane (__IDLane__),
	__FKpool__ Integer
) ;

CREATE TABLE MessagingEdge (
	__IDMessagingEdge__ Integer NOT NULL,
	FOREIGN KEY bpmnDiagram (__FKbpmnDiagram__) REFERENCES BpmnDiagram (__IDBpmnDiagram__),
	FOREIGN KEY source (__FKsource__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY MessagingEdge (__IDMessagingEdge__),
	__FKbpmnDiagram__ Integer,
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE NamedBpmnObject (
	__IDNamedBpmnObject__ Integer NOT NULL,
	documentation text,
	name text,
	ncname text,
	PRIMARY KEY NamedBpmnObject (__IDNamedBpmnObject__)
) ;

CREATE TABLE Pool (
	__IDPool__ Integer NOT NULL,
	FOREIGN KEY bpmnDiagram (__FKbpmnDiagram__) REFERENCES BpmnDiagram (__IDBpmnDiagram__),
	PRIMARY KEY Pool (__IDPool__),
	__FKbpmnDiagram__ Integer
) ;

CREATE TABLE SequenceEdge (
	__IDSequenceEdge__ Integer NOT NULL,
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	isDefault Boolean,
	FOREIGN KEY source (__FKsource__) REFERENCES Vertex (__IDVertex__),
	FOREIGN KEY target (__FKtarget__) REFERENCES Vertex (__IDVertex__),
	PRIMARY KEY SequenceEdge (__IDSequenceEdge__),
	__FKgraph__ Integer,
	__FKsource__ Integer,
	__FKtarget__ Integer
) ;

CREATE TABLE SubProcess (
	__IDSubProcess__ Integer NOT NULL,
	isTransaction Boolean,
	PRIMARY KEY SubProcess (__IDSubProcess__)
) ;

CREATE TABLE TextAnnotation (
	__IDTextAnnotation__ Integer NOT NULL,
	PRIMARY KEY TextAnnotation (__IDTextAnnotation__)
) ;

CREATE TABLE Vertex (
	__IDVertex__ Integer NOT NULL,
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY Vertex (__IDVertex__),
	__FKgraph__ Integer
) ;

CREATE TABLE Activity_groups_Group (
	__IDActivity__ Integer NOT NULL,
	__IDGroup__ Integer NOT NULL
) ;

CREATE TABLE BpmnDiagram_messages_MessagingEdge (
	__IDBpmnDiagram__ Integer NOT NULL,
	__IDMessagingEdge__ Integer NOT NULL
) ;

CREATE TABLE SubProcess_eventHandlers_Activity (
	__IDSubProcess__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Graph_vertices_Vertex (
	__IDGraph__ Integer NOT NULL,
	__IDVertex__ Integer NOT NULL
) ;

CREATE TABLE Activity_outgoingMessages_MessagingEdge (
	__IDActivity__ Integer NOT NULL,
	__IDMessagingEdge__ Integer NOT NULL
) ;

CREATE TABLE Vertex_outgoingEdges_SequenceEdge (
	__IDVertex__ Integer NOT NULL,
	__IDSequenceEdge__ Integer NOT NULL
) ;

CREATE TABLE Graph_sequenceEdges_SequenceEdge (
	__IDGraph__ Integer NOT NULL,
	__IDSequenceEdge__ Integer NOT NULL
) ;

CREATE TABLE ArtifactsContainer_artifacts_Artifact (
	__IDArtifactsContainer__ Integer NOT NULL,
	__IDArtifact__ Integer NOT NULL
) ;

CREATE TABLE BpmnDiagram_pools_Pool (
	__IDBpmnDiagram__ Integer NOT NULL,
	__IDPool__ Integer NOT NULL
) ;

CREATE TABLE Lane_activities_Activity (
	__IDLane__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Activity_incomingMessages_MessagingEdge (
	__IDActivity__ Integer NOT NULL,
	__IDMessagingEdge__ Integer NOT NULL
) ;

CREATE TABLE Artifact_associations_Association (
	__IDArtifact__ Integer NOT NULL,
	__IDAssociation__ Integer NOT NULL
) ;

CREATE TABLE Pool_lanes_Lane (
	__IDPool__ Integer NOT NULL,
	__IDLane__ Integer NOT NULL
) ;

CREATE TABLE Vertex_incomingEdges_SequenceEdge (
	__IDVertex__ Integer NOT NULL,
	__IDSequenceEdge__ Integer NOT NULL
) ;

CREATE TABLE IdentifiableNode_associations_Association (
	__IDIdentifiableNode__ Integer NOT NULL,
	__IDAssociation__ Integer NOT NULL
) ;

CREATE TABLE Group_activities_Activity (
	__IDGroup__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;
