module DiagramInterchange {

	type Dimension {
		Width_Att : Double;
		Heigth_Att : Double;
	};

	type Point {
		X_Att : Double;
		Y_Att : Double;
	};

	type BezierPoint : Point {
		Controls_Ref : Point#0 .. 2;
	};

	type Property {
		Key_Att : Text;
		Value_Att : Text;
	};

	type DiagramElement {
		IsVisible_Att : Logical;
		Properties_ContRef : Property*;
		References_Ref : Reference*;
		De_container_Ref : GraphElement?;
	};

	type Reference : DiagramElement {
		IsIndividualRepresentation_Att : Logical;
		Referenced_Ref : DiagramElement;
	};

	type GraphElement : DiagramElement {
		Position_Ref : Point;
		Contained_ContRef : DiagramElement*;
		SemanticModel_ContRef : SemanticModelBridge;
		Anchorages_ContRef : GraphConnector*;
		Links_ContRef : DiagramLink*;
	};

	type GraphEdge : GraphElement {
		Waypoints_Ref : Point#0 .. 2;
		Anchors_Ref : GraphConnector#2 .. 2;
	};

	type GraphNode : GraphElement {
		Size_Ref : Dimension?;
	};

	type GraphConnector {
		Position_Ref : Point;
		Gc_graphElement_Ref : GraphElement;
		GraphEdges_Ref : GraphEdge*;
	};

	type DiagramLink {
		Zoom_Att : Double;
		ViewPort_Ref : Point;
		Dl_graphElement_Ref : GraphElement;
		Dl_diagram_Ref : Diagram;
	};

	type SemanticModelBridge {
		Presentation_Att : Text;
		Smb_graphElement_Ref : GraphElement?;
		Smb_diagram_Ref : Diagram?;
	};

	type Diagram : GraphNode {
		Name_Att : Text;
		Zoom_Att : Double;
		ViewPort_Ref : Point;
		DiagramLinks_Ref : DiagramLink*;
		Namespace_ContRef : SemanticModelBridge;
	};

	type SimpleSemanticModelElement : SemanticModelBridge {
		TypeInfo_Att : Text;
	};

	type UML1SemanticModelBridge : SemanticModelBridge {
		Element_Ref : CoreElement;
	};

	type CoreSemanticModelBridge : SemanticModelBridge {
		Element_Ref : ElementsElement;
	};

	type CoreElement;

	type ElementsElement;

	type LeafElement : DiagramElement;

	type TextElement : LeafElement {
		Text_Att : Text;
	};

	type Image : LeafElement {
		Uri_Att : Text;
		MimeType_Att : Text;
	};

	type GraphicPrimitive : LeafElement;

	type Polyline : GraphicPrimitive {
		Waypoints_Ref : Point#2 ..;
		Closed_Att : Logical;
	};

	type Ellipse : GraphicPrimitive {
		Center_Ref : Point;
		RadiusX_Att : Double;
		RadiusY_Att : Double;
		Rotation_Att : Double;
		StartAngle_Att : Double;
		EndAngle_Att : Double;
	};
}