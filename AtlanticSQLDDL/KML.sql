CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	name text,
	FOREIGN KEY parentNode (__FKparentNode__) REFERENCES ElementNode (__IDElementNode__),
	PRIMARY KEY Node (__IDNode__),
	__FKparentNode__ Integer
) ;

CREATE TABLE ElementNode (
	__IDElementNode__ Integer NOT NULL,
	PRIMARY KEY ElementNode (__IDElementNode__)
) ;

CREATE TABLE AttributeNode (
	__IDAttributeNode__ Integer NOT NULL,
	value text,
	PRIMARY KEY AttributeNode (__IDAttributeNode__)
) ;

CREATE TABLE RootNode (
	__IDRootNode__ Integer NOT NULL,
	PRIMARY KEY RootNode (__IDRootNode__)
) ;

CREATE TABLE TextNode (
	__IDTextNode__ Integer NOT NULL,
	PRIMARY KEY TextNode (__IDTextNode__)
) ;

CREATE TABLE KMLNode (
	__IDKMLNode__ Integer NOT NULL,
	PRIMARY KEY KMLNode (__IDKMLNode__)
) ;

CREATE TABLE KMLRootNode (
	__IDKMLRootNode__ Integer NOT NULL,
	PRIMARY KEY KMLRootNode (__IDKMLRootNode__)
) ;

CREATE TABLE Address (
	__IDAddress__ Integer NOT NULL,
	value text,
	PRIMARY KEY Address (__IDAddress__)
) ;

CREATE TABLE AltitudeMode (
	__IDAltitudeMode__ Integer NOT NULL,
	value text,
	PRIMARY KEY AltitudeMode (__IDAltitudeMode__)
) ;

CREATE TABLE BalloonStyle (
	__IDBalloonStyle__ Integer NOT NULL,
	PRIMARY KEY BalloonStyle (__IDBalloonStyle__)
) ;

CREATE TABLE Color (
	__IDColor__ Integer NOT NULL,
	value text,
	PRIMARY KEY Color (__IDColor__)
) ;

CREATE TABLE ColorMode (
	__IDColorMode__ Integer NOT NULL,
	value text,
	PRIMARY KEY ColorMode (__IDColorMode__)
) ;

CREATE TABLE Cookie (
	__IDCookie__ Integer NOT NULL,
	value text,
	PRIMARY KEY Cookie (__IDCookie__)
) ;

CREATE TABLE Coordinates (
	__IDCoordinates__ Integer NOT NULL,
	PRIMARY KEY Coordinates (__IDCoordinates__)
) ;

CREATE TABLE Coordinate (
	__IDCoordinate__ Integer NOT NULL,
	PRIMARY KEY Coordinate (__IDCoordinate__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	value text,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Document (
	__IDDocument__ Integer NOT NULL,
	PRIMARY KEY Document (__IDDocument__)
) ;

CREATE TABLE DrawOrder (
	__IDDrawOrder__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY DrawOrder (__IDDrawOrder__)
) ;

CREATE TABLE East (
	__IDEast__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY East (__IDEast__)
) ;

CREATE TABLE Extrude (
	__IDExtrude__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY Extrude (__IDExtrude__)
) ;

CREATE TABLE Fill (
	__IDFill__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY Fill (__IDFill__)
) ;

CREATE TABLE FlyToView (
	__IDFlyToView__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY FlyToView (__IDFlyToView__)
) ;

CREATE TABLE Folder (
	__IDFolder__ Integer NOT NULL,
	PRIMARY KEY Folder (__IDFolder__)
) ;

CREATE TABLE GroundOverlay (
	__IDGroundOverlay__ Integer NOT NULL,
	PRIMARY KEY GroundOverlay (__IDGroundOverlay__)
) ;

CREATE TABLE H (
	__IDH__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY H (__IDH__)
) ;

CREATE TABLE Heading (
	__IDHeading__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY Heading (__IDHeading__)
) ;

CREATE TABLE Href (
	__IDHref__ Integer NOT NULL,
	value text,
	PRIMARY KEY Href (__IDHref__)
) ;

CREATE TABLE Icon (
	__IDIcon__ Integer NOT NULL,
	PRIMARY KEY Icon (__IDIcon__)
) ;

CREATE TABLE IconStyle (
	__IDIconStyle__ Integer NOT NULL,
	PRIMARY KEY IconStyle (__IDIconStyle__)
) ;

CREATE TABLE InnerBoundaryIs (
	__IDInnerBoundaryIs__ Integer NOT NULL,
	PRIMARY KEY InnerBoundaryIs (__IDInnerBoundaryIs__)
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	value text,
	PRIMARY KEY "Key" (__IDKey__)
) ;

CREATE TABLE LabelStyle (
	__IDLabelStyle__ Integer NOT NULL,
	PRIMARY KEY LabelStyle (__IDLabelStyle__)
) ;

CREATE TABLE Latitude (
	__IDLatitude__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY Latitude (__IDLatitude__)
) ;

CREATE TABLE LatLonBox (
	__IDLatLonBox__ Integer NOT NULL,
	PRIMARY KEY LatLonBox (__IDLatLonBox__)
) ;

CREATE TABLE LinearRing (
	__IDLinearRing__ Integer NOT NULL,
	PRIMARY KEY LinearRing (__IDLinearRing__)
) ;

CREATE TABLE LineString (
	__IDLineString__ Integer NOT NULL,
	PRIMARY KEY LineString (__IDLineString__)
) ;

CREATE TABLE LineStyle (
	__IDLineStyle__ Integer NOT NULL,
	id text,
	PRIMARY KEY LineStyle (__IDLineStyle__)
) ;

CREATE TABLE LinkDescription (
	__IDLinkDescription__ Integer NOT NULL,
	value text,
	PRIMARY KEY LinkDescription (__IDLinkDescription__)
) ;

CREATE TABLE LinkName (
	__IDLinkName__ Integer NOT NULL,
	value text,
	PRIMARY KEY LinkName (__IDLinkName__)
) ;

CREATE TABLE Longitude (
	__IDLongitude__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY Longitude (__IDLongitude__)
) ;

CREATE TABLE LookAt (
	__IDLookAt__ Integer NOT NULL,
	PRIMARY KEY LookAt (__IDLookAt__)
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE MinRefreshPeriod (
	__IDMinRefreshPeriod__ Integer NOT NULL,
	value text,
	PRIMARY KEY MinRefreshPeriod (__IDMinRefreshPeriod__)
) ;

CREATE TABLE MultiGeometry (
	__IDMultiGeometry__ Integer NOT NULL,
	PRIMARY KEY MultiGeometry (__IDMultiGeometry__)
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	value text,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE NetworkLink (
	__IDNetworkLink__ Integer NOT NULL,
	PRIMARY KEY NetworkLink (__IDNetworkLink__)
) ;

CREATE TABLE NetworkLinkControl (
	__IDNetworkLinkControl__ Integer NOT NULL,
	PRIMARY KEY NetworkLinkControl (__IDNetworkLinkControl__)
) ;

CREATE TABLE North (
	__IDNorth__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY North (__IDNorth__)
) ;

CREATE TABLE ObjArrayField (
	__IDObjArrayField__ Integer NOT NULL,
	PRIMARY KEY ObjArrayField (__IDObjArrayField__)
) ;

CREATE TABLE ObjField (
	__IDObjField__ Integer NOT NULL,
	PRIMARY KEY ObjField (__IDObjField__)
) ;

CREATE TABLE Open (
	__IDOpen__ Integer NOT NULL,
	value text,
	PRIMARY KEY Open (__IDOpen__)
) ;

CREATE TABLE OuterBoundaryIs (
	__IDOuterBoundaryIs__ Integer NOT NULL,
	PRIMARY KEY OuterBoundaryIs (__IDOuterBoundaryIs__)
) ;

CREATE TABLE Outline (
	__IDOutline__ Integer NOT NULL,
	value text,
	PRIMARY KEY Outline (__IDOutline__)
) ;

CREATE TABLE OverlayXY (
	__IDOverlayXY__ Integer NOT NULL,
	x text,
	y text,
	xunits text,
	yunits text,
	PRIMARY KEY OverlayXY (__IDOverlayXY__)
) ;

CREATE TABLE Pair (
	__IDPair__ Integer NOT NULL,
	PRIMARY KEY Pair (__IDPair__)
) ;

CREATE TABLE Parent (
	__IDParent__ Integer NOT NULL,
	value text,
	PRIMARY KEY Parent (__IDParent__)
) ;

CREATE TABLE Placemark (
	__IDPlacemark__ Integer NOT NULL,
	PRIMARY KEY Placemark (__IDPlacemark__)
) ;

CREATE TABLE Point (
	__IDPoint__ Integer NOT NULL,
	PRIMARY KEY Point (__IDPoint__)
) ;

CREATE TABLE Polygon (
	__IDPolygon__ Integer NOT NULL,
	PRIMARY KEY Polygon (__IDPolygon__)
) ;

CREATE TABLE PolyStyle (
	__IDPolyStyle__ Integer NOT NULL,
	PRIMARY KEY PolyStyle (__IDPolyStyle__)
) ;

CREATE TABLE Range (
	__IDRange__ Integer NOT NULL,
	value text,
	PRIMARY KEY Range (__IDRange__)
) ;

CREATE TABLE RefreshInterval (
	__IDRefreshInterval__ Integer NOT NULL,
	value text,
	PRIMARY KEY RefreshInterval (__IDRefreshInterval__)
) ;

CREATE TABLE RefreshMode (
	__IDRefreshMode__ Integer NOT NULL,
	value text,
	PRIMARY KEY RefreshMode (__IDRefreshMode__)
) ;

CREATE TABLE RefreshVisibility (
	__IDRefreshVisibility__ Integer NOT NULL,
	value text,
	PRIMARY KEY RefreshVisibility (__IDRefreshVisibility__)
) ;

CREATE TABLE Rotation (
	__IDRotation__ Integer NOT NULL,
	value text,
	PRIMARY KEY Rotation (__IDRotation__)
) ;

CREATE TABLE "Schema" (
	__IDSchema__ Integer NOT NULL,
	PRIMARY KEY "Schema" (__IDSchema__)
) ;

CREATE TABLE Scale (
	__IDScale__ Integer NOT NULL,
	value text,
	PRIMARY KEY Scale (__IDScale__)
) ;

CREATE TABLE ScreenOverlay (
	__IDScreenOverlay__ Integer NOT NULL,
	id text,
	PRIMARY KEY ScreenOverlay (__IDScreenOverlay__)
) ;

CREATE TABLE ScreenXY (
	__IDScreenXY__ Integer NOT NULL,
	x text,
	y text,
	xunits text,
	yunits text,
	PRIMARY KEY ScreenXY (__IDScreenXY__)
) ;

CREATE TABLE SimpleArrayField (
	__IDSimpleArrayField__ Integer NOT NULL,
	PRIMARY KEY SimpleArrayField (__IDSimpleArrayField__)
) ;

CREATE TABLE SimpleField (
	__IDSimpleField__ Integer NOT NULL,
	PRIMARY KEY SimpleField (__IDSimpleField__)
) ;

CREATE TABLE Size (
	__IDSize__ Integer NOT NULL,
	x text,
	y text,
	xunits text,
	yunits text,
	PRIMARY KEY Size (__IDSize__)
) ;

CREATE TABLE South (
	__IDSouth__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY South (__IDSouth__)
) ;

CREATE TABLE Snippet (
	__IDSnippet__ Integer NOT NULL,
	PRIMARY KEY Snippet (__IDSnippet__)
) ;

CREATE TABLE Style (
	__IDStyle__ Integer NOT NULL,
	id text,
	PRIMARY KEY Style (__IDStyle__)
) ;

CREATE TABLE StyleMap (
	__IDStyleMap__ Integer NOT NULL,
	PRIMARY KEY StyleMap (__IDStyleMap__)
) ;

CREATE TABLE StyleUrl (
	__IDStyleUrl__ Integer NOT NULL,
	value text,
	PRIMARY KEY StyleUrl (__IDStyleUrl__)
) ;

CREATE TABLE Tessellate (
	__IDTessellate__ Integer NOT NULL,
	value text,
	PRIMARY KEY Tessellate (__IDTessellate__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE TextColor (
	__IDTextColor__ Integer NOT NULL,
	value text,
	PRIMARY KEY TextColor (__IDTextColor__)
) ;

CREATE TABLE Tilt (
	__IDTilt__ Integer NOT NULL,
	value text,
	PRIMARY KEY Tilt (__IDTilt__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	value text,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Url (
	__IDUrl__ Integer NOT NULL,
	PRIMARY KEY Url (__IDUrl__)
) ;

CREATE TABLE ViewBoundScale (
	__IDViewBoundScale__ Integer NOT NULL,
	value text,
	PRIMARY KEY ViewBoundScale (__IDViewBoundScale__)
) ;

CREATE TABLE ViewRefreshMode (
	__IDViewRefreshMode__ Integer NOT NULL,
	value text,
	PRIMARY KEY ViewRefreshMode (__IDViewRefreshMode__)
) ;

CREATE TABLE ViewRefreshTime (
	__IDViewRefreshTime__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY ViewRefreshTime (__IDViewRefreshTime__)
) ;

CREATE TABLE ViewFormat (
	__IDViewFormat__ Integer NOT NULL,
	value text,
	PRIMARY KEY ViewFormat (__IDViewFormat__)
) ;

CREATE TABLE Visibility (
	__IDVisibility__ Integer NOT NULL,
	value text,
	PRIMARY KEY Visibility (__IDVisibility__)
) ;

CREATE TABLE W (
	__IDW__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY W (__IDW__)
) ;

CREATE TABLE West (
	__IDWest__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY West (__IDWest__)
) ;

CREATE TABLE Width (
	__IDWidth__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY Width (__IDWidth__)
) ;

CREATE TABLE X (
	__IDX__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY X (__IDX__)
) ;

CREATE TABLE Y (
	__IDY__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY Y (__IDY__)
) ;

CREATE TABLE ElementNode_nodes_Node (
	__IDElementNode__ Integer NOT NULL,
	__IDNode__ Integer NOT NULL
) ;
