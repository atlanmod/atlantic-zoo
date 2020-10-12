CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	FOREIGN KEY position (__FKposition__) REFERENCES Coordinates (__IDCoordinates__),
	FOREIGN KEY size (__FKsize__) REFERENCES Dimension (__IDDimension__),
	FOREIGN KEY root (__FKroot__) REFERENCES Svg (__IDSvg__),
	fill text,
	viewBox text,
	FOREIGN KEY "group" (__FKgroup__) REFERENCES GroupingElement (__IDGroupingElement__),
	identifier text,
	FOREIGN KEY drawsMarker (__FKdrawsMarker__) REFERENCES Marker (__IDMarker__),
	PRIMARY KEY Element (__IDElement__),
	__FKgroup__ Integer,
	__FKroot__ Integer,
	__FKsize__ Integer,
	__FKdrawsMarker__ Integer,
	__FKposition__ Integer
) ;

CREATE TABLE StructuralElement (
	__IDStructuralElement__ Integer NOT NULL,
	PRIMARY KEY StructuralElement (__IDStructuralElement__)
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE Svg (
	__IDSvg__ Integer NOT NULL,
	namespace text,
	version text,
	baseProfile text,
	PRIMARY KEY Svg (__IDSvg__)
) ;

CREATE TABLE GroupingElement (
	__IDGroupingElement__ Integer NOT NULL,
	PRIMARY KEY GroupingElement (__IDGroupingElement__)
) ;

CREATE TABLE G (
	__IDG__ Integer NOT NULL,
	name text,
	PRIMARY KEY G (__IDG__)
) ;

CREATE TABLE Defs (
	__IDDefs__ Integer NOT NULL,
	PRIMARY KEY Defs (__IDDefs__)
) ;

CREATE TABLE Symbol (
	__IDSymbol__ Integer NOT NULL,
	PRIMARY KEY Symbol (__IDSymbol__)
) ;

CREATE TABLE "Use" (
	__IDUse__ Integer NOT NULL,
	PRIMARY KEY "Use" (__IDUse__)
) ;

CREATE TABLE GraphicalElement (
	__IDGraphicalElement__ Integer NOT NULL,
	stroke text,
	PRIMARY KEY GraphicalElement (__IDGraphicalElement__)
) ;

CREATE TABLE Shape (
	__IDShape__ Integer NOT NULL,
	PRIMARY KEY Shape (__IDShape__)
) ;

CREATE TABLE TextElement (
	__IDTextElement__ Integer NOT NULL,
	rotate "Double",
	textLength text,
	fontSize text,
	PRIMARY KEY TextElement (__IDTextElement__)
) ;

CREATE TABLE Rect (
	__IDRect__ Integer NOT NULL,
	rx "Double",
	ry "Double",
	PRIMARY KEY Rect (__IDRect__)
) ;

CREATE TABLE Circle (
	__IDCircle__ Integer NOT NULL,
	PRIMARY KEY Circle (__IDCircle__)
) ;

CREATE TABLE Ellipse (
	__IDEllipse__ Integer NOT NULL,
	PRIMARY KEY Ellipse (__IDEllipse__)
) ;

CREATE TABLE Line (
	__IDLine__ Integer NOT NULL,
	markerEnd text,
	markerStart text,
	PRIMARY KEY Line (__IDLine__)
) ;

CREATE TABLE Polyline (
	__IDPolyline__ Integer NOT NULL,
	strokeDashArray text,
	markerEnd text,
	markerStart text,
	PRIMARY KEY Polyline (__IDPolyline__)
) ;

CREATE TABLE Polygon (
	__IDPolygon__ Integer NOT NULL,
	markerEnd text,
	markerStart text,
	PRIMARY KEY Polygon (__IDPolygon__)
) ;

CREATE TABLE Path (
	__IDPath__ Integer NOT NULL,
	pathLength "Double",
	d text,
	markerEnd text,
	markerStart text,
	PRIMARY KEY Path (__IDPath__)
) ;

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	PRIMARY KEY Point (__IDPoint__)
) ;

CREATE TABLE Marker (
	__IDMarker__ Integer NOT NULL,
	markerUnits text,
	refX "Double",
	refY "Double",
	markerWidth "Double",
	markerHeight "Double",
	orient text,
	PRIMARY KEY Marker (__IDMarker__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	lengthAdjust text,
	content text,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Tspan (
	__IDTspan__ Integer NOT NULL,
	content text,
	PRIMARY KEY Tspan (__IDTspan__)
) ;

CREATE TABLE Tref (
	__IDTref__ Integer NOT NULL,
	FOREIGN KEY xlinkHref (__FKxlinkHref__) REFERENCES TextElement (__IDTextElement__),
	PRIMARY KEY Tref (__IDTref__),
	__FKxlinkHref__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Transform (
	__IDTransform__ Integer NOT NULL,
	PRIMARY KEY Transform (__IDTransform__)
) ;

CREATE TABLE Scale (
	__IDScale__ Integer NOT NULL,
	sx "Double",
	sy "Double",
	PRIMARY KEY Scale (__IDScale__)
) ;

CREATE TABLE Translate (
	__IDTranslate__ Integer NOT NULL,
	tx "Double",
	ty "Double",
	PRIMARY KEY Translate (__IDTranslate__)
) ;

CREATE TABLE Rotate (
	__IDRotate__ Integer NOT NULL,
	angle "Double",
	cx "Double",
	cy "Double",
	PRIMARY KEY Rotate (__IDRotate__)
) ;

CREATE TABLE Visibility (
	__IDVisibility__ Integer NOT NULL,
	visible Boolean,
	PRIMARY KEY Visibility (__IDVisibility__)
) ;

CREATE TABLE FontWeight (
	__IDFontWeight__ Integer NOT NULL,
	bold Boolean,
	PRIMARY KEY FontWeight (__IDFontWeight__)
) ;

CREATE TABLE FontStyle (
	__IDFontStyle__ Integer NOT NULL,
	italic Boolean,
	PRIMARY KEY FontStyle (__IDFontStyle__)
) ;

CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	width "Double",
	height "Double",
	PRIMARY KEY Dimension (__IDDimension__)
) ;

CREATE TABLE Coordinates (
	__IDCoordinates__ Integer NOT NULL,
	x "Double",
	y "Double",
	PRIMARY KEY Coordinates (__IDCoordinates__)
) ;

CREATE TABLE RelativeCoord (
	__IDRelativeCoord__ Integer NOT NULL,
	PRIMARY KEY RelativeCoord (__IDRelativeCoord__)
) ;

CREATE TABLE AbsoluteCoord (
	__IDAbsoluteCoord__ Integer NOT NULL,
	PRIMARY KEY AbsoluteCoord (__IDAbsoluteCoord__)
) ;

CREATE TABLE ReferencedFile (
	__IDReferencedFile__ Integer NOT NULL,
	name text,
	PRIMARY KEY ReferencedFile (__IDReferencedFile__)
) ;

CREATE TABLE SvgFile (
	__IDSvgFile__ Integer NOT NULL,
	FOREIGN KEY tag (__FKtag__) REFERENCES Svg (__IDSvg__),
	PRIMARY KEY SvgFile (__IDSvgFile__),
	__FKtag__ Integer
) ;

CREATE TABLE Element_owner_SvgFile (
	__IDElement__ Integer NOT NULL,
	__IDSvgFile__ Integer NOT NULL
) ;

CREATE TABLE Image_referee_ReferencedFile (
	__IDImage__ Integer NOT NULL,
	__IDReferencedFile__ Integer NOT NULL
) ;

CREATE TABLE Polyline_waypoints_Point (
	__IDPolyline__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE Element_target_Use (
	__IDElement__ Integer NOT NULL,
	__IDUse__ Integer NOT NULL
) ;

CREATE TABLE SvgFile_elements_Element (
	__IDSvgFile__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE ReferencedFile_referer_Image (
	__IDReferencedFile__ Integer NOT NULL,
	__IDImage__ Integer NOT NULL
) ;

CREATE TABLE Attribute_attOwner_Element (
	__IDAttribute__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Marker_drawing_Element (
	__IDMarker__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Use_use_Element (
	__IDUse__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Polygon_waypoints_Point (
	__IDPolygon__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE Svg_children_Element (
	__IDSvg__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE GroupingElement_groupContent_Element (
	__IDGroupingElement__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Svg_owner_SVG_SvgFile (
	__IDSvg__ Integer NOT NULL,
	__IDSvgFile__ Integer NOT NULL
) ;

CREATE TABLE Line_between_Point (
	__IDLine__ Integer NOT NULL,
	__IDPoint__ Integer NOT NULL
) ;

CREATE TABLE Element_attribute_Attribute (
	__IDElement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;
