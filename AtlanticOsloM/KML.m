module KML {

	type Node {
		Name_Att : Text;
		ParentNode_Ref : ElementNode?;
	};

	type ElementNode : Node {
		Nodes_ContRef : Node*;
	};

	type AttributeNode : Node {
		Value_Att : Text;
	};

	type RootNode : ElementNode;

	type TextNode : ElementNode;

	type KMLNode : ElementNode;

	type KMLRootNode : RootNode;

	type Address : KMLNode {
		Value_Att : Text;
	};

	type AltitudeMode : KMLNode {
		Value_Att : AltitudeModeValue;
	};

	type AltitudeModeValue {"clampedToGround", "relativeToGround", "absolute"};

	type BalloonStyle : KMLNode;

	type Color : KMLNode {
		Value_Att : Text;
	};

	type ColorMode : KMLNode {
		Value_Att : ColorModeValue;
	};

	type ColorModeValue {"normal", "random"};

	type Cookie : KMLNode {
		Value_Att : Text;
	};

	type Coordinates : KMLNode;

	type Coordinate : KMLNode;

	type Description : KMLNode {
		Value_Att : Text;
	};

	type Document : KMLNode;

	type DrawOrder : KMLNode {
		Value_Att : Integer32;
	};

	type East : KMLNode {
		Value_Att : Double;
	};

	type Extrude : KMLNode {
		Value_Att : Logical;
	};

	type Fill : KMLNode {
		Value_Att : Logical;
	};

	type FlyToView : KMLNode {
		Value_Att : Logical;
	};

	type Folder : KMLNode;

	type GroundOverlay : KMLNode;

	type H : KMLNode {
		Value_Att : Integer32;
	};

	type Heading : KMLNode {
		Value_Att : Double;
	};

	type Href : KMLNode {
		Value_Att : Text;
	};

	type Icon : KMLNode;

	type IconStyle : KMLNode;

	type InnerBoundaryIs : KMLNode;

	type Key : KMLNode {
		Value_Att : Text;
	};

	type LabelStyle : KMLNode;

	type Latitude : KMLNode {
		Value_Att : Double;
	};

	type LatLonBox : KMLNode;

	type LinearRing : KMLNode;

	type LineString : KMLNode;

	type LineStyle : KMLNode {
		Id_Att : Text;
	};

	type LinkDescription : KMLNode {
		Value_Att : Text;
	};

	type LinkName : KMLNode {
		Value_Att : Text;
	};

	type Longitude : KMLNode {
		Value_Att : Double;
	};

	type LookAt : KMLNode;

	type Message : KMLNode;

	type MinRefreshPeriod : KMLNode {
		Value_Att : Text;
	};

	type MultiGeometry : KMLNode;

	type Name : KMLNode {
		Value_Att : Text;
	};

	type NetworkLink : KMLNode;

	type NetworkLinkControl : KMLNode;

	type North : KMLNode {
		Value_Att : Double;
	};

	type ObjArrayField : KMLNode;

	type ObjField : KMLNode;

	type Open : KMLNode {
		Value_Att : Text;
	};

	type OuterBoundaryIs : KMLNode;

	type Outline : KMLNode {
		Value_Att : Text;
	};

	type OverlayXY : KMLNode {
		X_Att : Text;
		Y_Att : Text;
		Xunits_Att : Text;
		Yunits_Att : Text;
	};

	type Pair : KMLNode;

	type Parent : KMLNode {
		Value_Att : Text;
	};

	type Placemark : KMLNode;

	type Point : KMLNode;

	type Polygon : KMLNode;

	type PolyStyle : KMLNode;

	type Range : KMLNode {
		Value_Att : Text;
	};

	type RefreshInterval : KMLNode {
		Value_Att : Text;
	};

	type RefreshMode : KMLNode {
		Value_Att : Text;
	};

	type RefreshVisibility : KMLNode {
		Value_Att : Text;
	};

	type Rotation : KMLNode {
		Value_Att : Text;
	};

	type Schema : KMLNode;

	type Scale : KMLNode {
		Value_Att : Text;
	};

	type ScreenOverlay : KMLNode {
		Id_Att : Text;
	};

	type ScreenXY : KMLNode {
		X_Att : Text;
		Y_Att : Text;
		Xunits_Att : Text;
		Yunits_Att : Text;
	};

	type SimpleArrayField : KMLNode;

	type SimpleField : KMLNode;

	type Size : KMLNode {
		X_Att : Text;
		Y_Att : Text;
		Xunits_Att : Text;
		Yunits_Att : Text;
	};

	type South : KMLNode {
		Value_Att : Double;
	};

	type Snippet : KMLNode;

	type Style : KMLNode {
		Id_Att : Text;
	};

	type StyleMap : KMLNode;

	type StyleUrl : KMLNode {
		Value_Att : Text;
	};

	type Tessellate : KMLNode {
		Value_Att : Text;
	};

	type Text : KMLNode;

	type TextColor : KMLNode {
		Value_Att : Text;
	};

	type Tilt : KMLNode {
		Value_Att : Text;
	};

	type Type : KMLNode {
		Value_Att : Text;
	};

	type Url : KMLNode;

	type ViewBoundScale : KMLNode {
		Value_Att : Text;
	};

	type ViewRefreshMode : KMLNode {
		Value_Att : Text;
	};

	type ViewRefreshTime : KMLNode {
		Value_Att : Integer32;
	};

	type ViewFormat : KMLNode {
		Value_Att : Text;
	};

	type Visibility : KMLNode {
		Value_Att : Text;
	};

	type W : KMLNode {
		Value_Att : Integer32;
	};

	type West : KMLNode {
		Value_Att : Double;
	};

	type Width : KMLNode {
		Value_Att : Double;
	};

	type X : KMLNode {
		Value_Att : Integer32;
	};

	type Y : KMLNode {
		Value_Att : Integer32;
	};
}