module SVG {

	type Element {
		Owner_Ref : SvgFile*;
		Target_Ref : Use*;
		Attribute_Ref : Attribute*;
		Position_ContRef : Coordinates?;
		Size_ContRef : Dimension?;
		Root_Ref : Svg?;
		Fill_Att : Text;
		ViewBox_Att : Text;
		Group_Ref : GroupingElement?;
		Identifier_Att : Text;
		DrawsMarker_Ref : Marker?;
	};

	type StructuralElement : Element;

	type Image : StructuralElement {
		Referee_Ref : ReferencedFile*;
	};

	type Svg : StructuralElement {
		Owner_SVG_Ref : SvgFile*;
		Children_ContRef : Element*;
		Namespace_Att : Text;
		Version_Att : Text;
		BaseProfile_Att : Text;
	};

	type GroupingElement : StructuralElement {
		GroupContent_ContRef : Element*;
	};

	type G : GroupingElement {
		Name_Att : Text;
	};

	type Defs : GroupingElement;

	type Symbol : GroupingElement;

	type Use : StructuralElement {
		Use_Ref : Element*;
	};

	type GraphicalElement : Element {
		Stroke_Att : Text;
	};

	type Shape : GraphicalElement;

	type TextElement : GraphicalElement {
		Rotate_Att : Double;
		TextLength_Att : Text;
		FontSize_Att : Text;
	};

	type Rect : Shape {
		Rx_Att : Double;
		Ry_Att : Double;
	};

	type Circle : Shape;

	type Ellipse : Shape;

	type Line : Shape {
		Between_Ref : Point#2 .. 2;
		MarkerEnd_Att : Text;
		MarkerStart_Att : Text;
	};

	type Polyline : Shape {
		Waypoints_ContRef : Point*;
		StrokeDashArray_Att : Text;
		MarkerEnd_Att : Text;
		MarkerStart_Att : Text;
	};

	type Polygon : Shape {
		Waypoints_Ref : Point*;
		MarkerEnd_Att : Text;
		MarkerStart_Att : Text;
	};

	type Path : Shape {
		PathLength_Att : Double;
		D_Att : Text;
		MarkerEnd_Att : Text;
		MarkerStart_Att : Text;
	};

	type Point : Shape;

	type Marker : Shape {
		MarkerUnits_Att : Text;
		RefX_Att : Double;
		RefY_Att : Double;
		MarkerWidth_Att : Double;
		MarkerHeight_Att : Double;
		Orient_Att : Text;
		Drawing_ContRef : Element*;
	};

	type Text : TextElement {
		LengthAdjust_Att : Text;
		Content_Att : Text;
	};

	type Tspan : TextElement {
		Content_Att : Text;
	};

	type Tref : TextElement {
		XlinkHref_Ref : TextElement;
	};

	type Attribute {
		AttOwner_Ref : Element*;
	};

	type Transform : Attribute;

	type Scale : Transform {
		Sx_Att : Double;
		Sy_Att : Double;
	};

	type Translate : Transform {
		Tx_Att : Double;
		Ty_Att : Double;
	};

	type Rotate : Transform {
		Angle_Att : Double;
		Cx_Att : Double;
		Cy_Att : Double;
	};

	type Visibility : Attribute {
		Visible_Att : Logical;
	};

	type FontWeight : Attribute {
		Bold_Att : Logical;
	};

	type FontStyle : Attribute {
		Italic_Att : Logical;
	};

	type Dimension {
		Width_Att : Double;
		Height_Att : Double;
	};

	type Coordinates {
		X_Att : Double;
		Y_Att : Double;
	};

	type RelativeCoord : Coordinates;

	type AbsoluteCoord : Coordinates;

	type ReferencedFile {
		Referer_Ref : Image*;
		Name_Att : Text;
	};

	type SvgFile : ReferencedFile {
		Tag_Ref : Svg;
		Elements_Ref : Element*;
	};
}