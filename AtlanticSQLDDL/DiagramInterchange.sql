CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	width "Double",
	heigth "Double",
	PRIMARY KEY Dimension (__IDDimension__)
) ;

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	x "Double",
	y "Double",
	PRIMARY KEY Point (__IDPoint__)
) ;

CREATE TABLE BezierPoint (
	__IDBezierPoint__ Integer NOT NULL,
	PRIMARY KEY BezierPoint (__IDBezierPoint__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	"key" text,
	value text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE DiagramElement (
	__IDDiagramElement__ Integer NOT NULL,
	isVisible Boolean,
	FOREIGN KEY de_container (__FKde_container__) REFERENCES GraphElement (__IDGraphElement__),
	PRIMARY KEY DiagramElement (__IDDiagramElement__),
	__FKde_container__ Integer
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	isIndividualRepresentation Boolean,
	FOREIGN KEY referenced (__FKreferenced__) REFERENCES DiagramElement (__IDDiagramElement__),
	PRIMARY KEY Reference (__IDReference__),
	__FKreferenced__ Integer
) ;

CREATE TABLE GraphElement (
	__IDGraphElement__ Integer NOT NULL,
	FOREIGN KEY position (__FKposition__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY semanticModel (__FKsemanticModel__) REFERENCES SemanticModelBridge (__IDSemanticModelBridge__),
	PRIMARY KEY GraphElement (__IDGraphElement__),
	__FKsemanticModel__ Integer,
	__FKposition__ Integer
) ;

CREATE TABLE GraphEdge (
	__IDGraphEdge__ Integer NOT NULL,
	PRIMARY KEY GraphEdge (__IDGraphEdge__)
) ;

CREATE TABLE GraphNode (
	__IDGraphNode__ Integer NOT NULL,
	FOREIGN KEY size (__FKsize__) REFERENCES Dimension (__IDDimension__),
	PRIMARY KEY GraphNode (__IDGraphNode__),
	__FKsize__ Integer
) ;

CREATE TABLE GraphConnector (
	__IDGraphConnector__ Integer NOT NULL,
	FOREIGN KEY position (__FKposition__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY gc_graphElement (__FKgc_graphElement__) REFERENCES GraphElement (__IDGraphElement__),
	PRIMARY KEY GraphConnector (__IDGraphConnector__),
	__FKgc_graphElement__ Integer,
	__FKposition__ Integer
) ;

CREATE TABLE DiagramLink (
	__IDDiagramLink__ Integer NOT NULL,
	zoom "Double",
	FOREIGN KEY viewPort (__FKviewPort__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY dl_graphElement (__FKdl_graphElement__) REFERENCES GraphElement (__IDGraphElement__),
	FOREIGN KEY dl_diagram (__FKdl_diagram__) REFERENCES Diagram (__IDDiagram__),
	PRIMARY KEY DiagramLink (__IDDiagramLink__),
	__FKviewPort__ Integer,
	__FKdl_diagram__ Integer,
	__FKdl_graphElement__ Integer
) ;

CREATE TABLE SemanticModelBridge (
	__IDSemanticModelBridge__ Integer NOT NULL,
	presentation text,
	FOREIGN KEY smb_graphElement (__FKsmb_graphElement__) REFERENCES GraphElement (__IDGraphElement__),
	FOREIGN KEY smb_diagram (__FKsmb_diagram__) REFERENCES Diagram (__IDDiagram__),
	PRIMARY KEY SemanticModelBridge (__IDSemanticModelBridge__),
	__FKsmb_diagram__ Integer,
	__FKsmb_graphElement__ Integer
) ;

CREATE TABLE Diagram (
	__IDDiagram__ Integer NOT NULL,
	name text,
	zoom "Double",
	FOREIGN KEY viewPort (__FKviewPort__) REFERENCES Point (__IDPoint__),
	FOREIGN KEY namespace (__FKnamespace__) REFERENCES SemanticModelBridge (__IDSemanticModelBridge__),
	PRIMARY KEY Diagram (__IDDiagram__),
	__FKviewPort__ Integer,
	__FKnamespace__ Integer
) ;

CREATE TABLE SimpleSemanticModelElement (
	__IDSimpleSemanticModelElement__ Integer NOT NULL,
	typeInfo text,
	PRIMARY KEY SimpleSemanticModelElement (__IDSimpleSemanticModelElement__)
) ;

CREATE TABLE UML1SemanticModelBridge (
	__IDUML1SemanticModelBridge__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES CoreElement (__IDCoreElement__),
	PRIMARY KEY UML1SemanticModelBridge (__IDUML1SemanticModelBridge__),
	__FKelement__ Integer
) ;

CREATE TABLE CoreSemanticModelBridge (
	__IDCoreSemanticModelBridge__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES ElementsElement (__IDElementsElement__),
	PRIMARY KEY CoreSemanticModelBridge (__IDCoreSemanticModelBridge__),
	__FKelement__ Integer
) ;

CREATE TABLE CoreElement (
	__IDCoreElement__ Integer NOT NULL,
	PRIMARY KEY CoreElement (__IDCoreElement__)
) ;

CREATE TABLE ElementsElement (
	__IDElementsElement__ Integer NOT NULL,
	PRIMARY KEY ElementsElement (__IDElementsElement__)
) ;

CREATE TABLE LeafElement (
	__IDLeafElement__ Integer NOT NULL,
	PRIMARY KEY LeafElement (__IDLeafElement__)
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	text text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	uri text,
	mimeType text,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE GraphicPrimitive (
	__IDGraphicPrimitive__ Integer NOT NULL,
	PRIMARY KEY GraphicPrimitive (__IDGraphicPrimitive__)
) ;

CREATE TABLE Polyline (
	__IDPolyline__ Integer NOT NULL,
	closed Boolean,
	PRIMARY KEY Polyline (__IDPolyline__)
) ;

CREATE TABLE Ellipse (
	__IDEllipse__ Integer NOT NULL,
	FOREIGN KEY center (__FKcenter__) REFERENCES Point (__IDPoint__),
	radiusX "Double",
	radiusY "Double",
	rotation "Double",
	startAngle "Double",
	endAngle "Double",
	PRIMARY KEY Ellipse (__IDEllipse__),
	__FKcenter__ Integer
) ;

CREATE TABLE GraphEdge_anchors_GraphConnector (
	__IDGraphEdge__ Integer NOT NULL,
	__IDGraphConnector__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_links_DiagramLink (
	__IDGraphElement__ Integer NOT NULL,
	__IDDiagramLink__ Integer NOT NULL
) ;

CREATE TABLE BezierPoint_controls_Point (
	__IDBezierPoint__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE Polyline_waypoints_Point (
	__IDPolyline__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_anchorages_GraphConnector (
	__IDGraphElement__ Integer NOT NULL,
	__IDGraphConnector__ Integer NOT NULL
) ;

CREATE TABLE DiagramElement_references_Reference (
	__IDDiagramElement__ Integer NOT NULL,
	__IDReference__ Integer NOT NULL
) ;

CREATE TABLE DiagramElement_properties_Property (
	__IDDiagramElement__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE GraphElement_contained_DiagramElement (
	__IDGraphElement__ Integer NOT NULL,
	__IDDiagramElement__ Integer NOT NULL
) ;

CREATE TABLE GraphEdge_waypoints_Point (
	__IDGraphEdge__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE GraphConnector_graphEdges_GraphEdge (
	__IDGraphConnector__ Integer NOT NULL,
	__IDGraphEdge__ Integer NOT NULL
) ;

CREATE TABLE Diagram_diagramLinks_DiagramLink (
	__IDDiagram__ Integer NOT NULL,
	__IDDiagramLink__ Integer NOT NULL
) ;
