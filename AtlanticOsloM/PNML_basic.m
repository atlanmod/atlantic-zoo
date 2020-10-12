module PNML {

	type IdedElement {
		Id_Att : Text;
	};

	type URI {
		Value_Att : Text;
	};

	type Color;

	type AnyElement {
		Name_Att : Text;
		Text_Att : Text;
	};

	type RotationType {"rtvertical", "rthorizontal", "rtdiagonal"};

	type ShapeType {"shtline", "shtcurve"};

	type StyleType {"sttsolid", "sttdash", "sttdot"};

	type DecorationType {"dtunderligne", "dtoverligne", "dtlinethrough"};

	type AlignType {"atleft", "atcenter", "atright"};

	type PNMLDocument {
		Xmlns_ContRef : URI;
		Nets_ContRef : NetElement+;
	};

	type NetElement : IdedElement {
		Type_ContRef : URI;
		Document_Ref : PNMLDocument;
		Contents_ContRef : NetContent*;
		Tools_ContRef : ToolSpecific*;
		Netgraphics_ContRef : NetGraphics?;
		Name_ContRef : Name?;
	};

	type NetContent {
		Net_Ref : NetElement;
		Name_ContRef : Name?;
	};

	type ToolSpecific {
		Tool_Att : Text;
		Version_Att : Text;
		Anyelement_ContRef : AnyElement*;
		Net_Ref : NetElement?;
		Arc_Ref : Arc?;
		Node_Ref : Node?;
	};

	type LabeledElement {
		Labels_ContRef : Label*;
		Annotationgraphics_ContRef : AnnotationGraphics?;
	};

	type Label {
		Text_Att : Text;
		Namedelement_Ref : LabeledElement;
	};

	type Name : LabeledElement {
		Net_Ref : NetElement?;
		Netcontent_Ref : NetContent?;
	};

	type Inscription : LabeledElement {
		Arc_Ref : Arc;
	};

	type InitialMarking : LabeledElement {
		Place_Ref : Place;
	};

	type NetContentElement : NetContent {
		Node_ContRef : Node;
	};

	type Arc : NetContent, IdedElement {
		Source_Ref : NetContentElement;
		Target_Ref : NetContentElement;
		Tools_ContRef : ToolSpecific*;
		Edgegraphics_ContRef : EdgeGraphics?;
		Inscription_ContRef : Inscription?;
	};

	type Node : IdedElement {
		Netcontentelement_ContRef : NetContentElement;
		Tools_ContRef : ToolSpecific*;
		Nodegraphics_ContRef : NodeGraphics?;
	};

	type Place : NetContentElement {
		Initialmarking_ContRef : InitialMarking?;
	};

	type Transition : NetContentElement;

	type Graphics;

	type NetGraphics : Graphics {
		Net_Ref : NetElement;
	};

	type NodeGraphics : Graphics {
		Node_Ref : Node;
		Position_ContRef : Position;
		Dimension_ContRef : Dimension?;
		Fill_ContRef : Fill?;
		Line_ContRef : Line?;
	};

	type EdgeGraphics : Graphics {
		Arc_Ref : Arc;
		Position_ContRef : Position*;
		Fill_ContRef : Fill?;
		Line_ContRef : Line?;
	};

	type AnnotationGraphics : Graphics {
		Namedelement_Ref : LabeledElement;
		Offset_ContRef : Offset;
		Font_ContRef : Font?;
		Fill_ContRef : Fill?;
		Line_ContRef : Line?;
	};

	type Coordinate {
		X_Att : Integer32;
		Y_Att : Integer32;
	};

	type Position : Coordinate {
		Nodegraphics_Ref : NodeGraphics?;
		Edgegraphics_Ref : EdgeGraphics?;
	};

	type Offset : Coordinate {
		Annotationgraphics_Ref : AnnotationGraphics;
	};

	type Dimension {
		Width_Att : Integer32;
		Height_Att : Integer32;
		Nodegraphics_Ref : NodeGraphics;
	};

	type Fill {
		Gradientrotation_Att : RotationType?;
		Interiorcolor_ContRef : Color?;
		Gradientcolor_ContRef : Color?;
		Image_ContRef : URI?;
		Nodegraphics_Ref : NodeGraphics?;
		Edgegraphics_Ref : EdgeGraphics?;
		Annotationgraphics_Ref : AnnotationGraphics?;
	};

	type Line {
		Color_ContRef : Color?;
		Width_Att : Integer32;
		Shape_Att : ShapeType?;
		Style_Att : StyleType?;
		Nodegraphics_Ref : NodeGraphics?;
		Edgegraphics_Ref : EdgeGraphics?;
		Annotationgraphics_Ref : AnnotationGraphics?;
	};

	type Font {
		Family_Att : Text;
		Style_Att : Text;
		Weight_Att : Text;
		Size_Att : Text;
		Decoration_Att : DecorationType?;
		Align_Att : AlignType?;
		Rotation_Att : Integer32;
		Annotationgraphics_Ref : AnnotationGraphics;
	};
}