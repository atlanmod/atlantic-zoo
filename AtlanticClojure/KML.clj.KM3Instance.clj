( declare KML_Node )
( declare KML_ElementNode )
( declare KML_AttributeNode )
( declare KML_RootNode )
( declare KML_TextNode )
( declare KML_KMLNode )
( declare KML_KMLRootNode )
( declare KML_Address )
( declare KML_AltitudeMode )
( declare KML_AltitudeModeValue )
( declare KML_BalloonStyle )
( declare KML_Color )
( declare KML_ColorMode )
( declare KML_ColorModeValue )
( declare KML_Cookie )
( declare KML_Coordinates )
( declare KML_Coordinate )
( declare KML_Description )
( declare KML_Document )
( declare KML_DrawOrder )
( declare KML_East )
( declare KML_Extrude )
( declare KML_Fill )
( declare KML_FlyToView )
( declare KML_Folder )
( declare KML_GroundOverlay )
( declare KML_H )
( declare KML_Heading )
( declare KML_Href )
( declare KML_Icon )
( declare KML_IconStyle )
( declare KML_InnerBoundaryIs )
( declare KML_Key )
( declare KML_LabelStyle )
( declare KML_Latitude )
( declare KML_LatLonBox )
( declare KML_LinearRing )
( declare KML_LineString )
( declare KML_LineStyle )
( declare KML_LinkDescription )
( declare KML_LinkName )
( declare KML_Longitude )
( declare KML_LookAt )
( declare KML_Message )
( declare KML_MinRefreshPeriod )
( declare KML_MultiGeometry )
( declare KML_Name )
( declare KML_NetworkLink )
( declare KML_NetworkLinkControl )
( declare KML_North )
( declare KML_ObjArrayField )
( declare KML_ObjField )
( declare KML_Open )
( declare KML_OuterBoundaryIs )
( declare KML_Outline )
( declare KML_OverlayXY )
( declare KML_Pair )
( declare KML_Parent )
( declare KML_Placemark )
( declare KML_Point )
( declare KML_Polygon )
( declare KML_PolyStyle )
( declare KML_Range )
( declare KML_RefreshInterval )
( declare KML_RefreshMode )
( declare KML_RefreshVisibility )
( declare KML_Rotation )
( declare KML_Schema )
( declare KML_Scale )
( declare KML_ScreenOverlay )
( declare KML_ScreenXY )
( declare KML_SimpleArrayField )
( declare KML_SimpleField )
( declare KML_Size )
( declare KML_South )
( declare KML_Snippet )
( declare KML_Style )
( declare KML_StyleMap )
( declare KML_StyleUrl )
( declare KML_Tessellate )
( declare KML_Text )
( declare KML_TextColor )
( declare KML_Tilt )
( declare KML_Type )
( declare KML_Url )
( declare KML_ViewBoundScale )
( declare KML_ViewRefreshMode )
( declare KML_ViewRefreshTime )
( declare KML_ViewFormat )
( declare KML_Visibility )
( declare KML_W )
( declare KML_West )
( declare KML_Width )
( declare KML_X )
( declare KML_Y )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( def KML ( struct-map
	KM3_Package
	:contents[( def AltitudeModeValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "clampedToGround"
		:location "64:3-64:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "relativeToGround"
		:location "65:3-65:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "absolute"
		:location "66:3-66:20"
	)] ) ) ( def ColorModeValue ( :literals[( struct-map
		KM3_EnumLiteral
		:name "normal"
		:location "88:3-88:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "random"
		:location "89:3-89:18"
	)] ) ) ( def KML_Node ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Node
			:type String
			:location "14:6-14:30"
		) ( struct-map
			KM3_Reference
			:name "parentNode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner KML_Node
			:type KML_ElementNode
			:location "15:3-15:60"
			:isContainer false
			:opposite nodes
		)]
	) ) ( def KML_ElementNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KML_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner KML_ElementNode
			:type KML_Node
			:location "21:3-21:69"
			:isContainer true
			:opposite parentNode
		)]
	) ) ( def KML_AttributeNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_Node]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_AttributeNode
			:type String
			:location "27:3-27:28"
		)]
	) ) ( def KML_RootNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KML_ElementNode]
		:structuralFeatures[]
	) ) ( def KML_TextNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_ElementNode]
		:structuralFeatures[]
	) ) ( def KML_KMLNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KML_ElementNode]
		:structuralFeatures[]
	) ) ( def KML_KMLRootNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_RootNode]
		:structuralFeatures[]
	) ) ( def KML_Address ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Address
			:type String
			:location "52:3-52:28"
		)]
	) ) ( def KML_AltitudeMode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_AltitudeMode
			:type AltitudeModeValue
			:location "58:3-58:39"
		)]
	) ) ( def KML_BalloonStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Color ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Color
			:type String
			:location "76:3-76:28"
		)]
	) ) ( def KML_ColorMode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ColorMode
			:type ColorModeValue
			:location "82:3-82:36"
		)]
	) ) ( def KML_Cookie ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Cookie
			:type String
			:location "95:3-95:28"
		)]
	) ) ( def KML_Coordinates ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Coordinate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Description
			:type String
			:location "109:3-109:28"
		)]
	) ) ( def KML_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_DrawOrder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_DrawOrder
			:type Integer
			:location "119:3-119:29"
		)]
	) ) ( def KML_East ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_East
			:type Double
			:location "125:3-125:28"
		)]
	) ) ( def KML_Extrude ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Extrude
			:type Boolean
			:location "131:3-131:29"
		)]
	) ) ( def KML_Fill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Fill
			:type Boolean
			:location "137:3-137:29"
		)]
	) ) ( def KML_FlyToView ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_FlyToView
			:type Boolean
			:location "144:3-144:29"
		)]
	) ) ( def KML_Folder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_GroundOverlay ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_H ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_H
			:type Integer
			:location "158:3-158:29"
		)]
	) ) ( def KML_Heading ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Heading
			:type Double
			:location "164:3-164:28"
		)]
	) ) ( def KML_Href ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Href
			:type String
			:location "170:3-170:28"
		)]
	) ) ( def KML_Icon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_IconStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_InnerBoundaryIs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Key
			:type String
			:location "188:3-188:28"
		)]
	) ) ( def KML_LabelStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Latitude ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Latitude
			:type Double
			:location "198:3-198:28"
		)]
	) ) ( def KML_LatLonBox ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_LinearRing ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_LineString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_LineStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_LineStyle
			:type String
			:location "216:3-216:25"
		)]
	) ) ( def KML_LinkDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_LinkDescription
			:type String
			:location "222:3-222:28"
		)]
	) ) ( def KML_LinkName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_LinkName
			:type String
			:location "228:3-228:28"
		)]
	) ) ( def KML_Longitude ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Longitude
			:type Double
			:location "234:3-234:28"
		)]
	) ) ( def KML_LookAt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_MinRefreshPeriod ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_MinRefreshPeriod
			:type String
			:location "248:3-248:28"
		)]
	) ) ( def KML_MultiGeometry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Name
			:type String
			:location "258:3-258:28"
		)]
	) ) ( def KML_NetworkLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_NetworkLinkControl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_North ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_North
			:type Double
			:location "272:3-272:28"
		)]
	) ) ( def KML_ObjArrayField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_ObjField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Open ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Open
			:type String
			:location "286:3-286:28"
		)]
	) ) ( def KML_OuterBoundaryIs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Outline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Outline
			:type String
			:location "296:3-296:28"
		)]
	) ) ( def KML_OverlayXY ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_OverlayXY
			:type String
			:location "302:3-302:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_OverlayXY
			:type String
			:location "303:3-303:24"
		) ( struct-map
			KM3_Attribute
			:name "xunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_OverlayXY
			:type String
			:location "304:3-304:29"
		) ( struct-map
			KM3_Attribute
			:name "yunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_OverlayXY
			:type String
			:location "305:3-305:29"
		)]
	) ) ( def KML_Pair ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Parent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Parent
			:type String
			:location "315:3-315:28"
		)]
	) ) ( def KML_Placemark ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Polygon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_PolyStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Range ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Range
			:type String
			:location "337:3-337:28"
		)]
	) ) ( def KML_RefreshInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_RefreshInterval
			:type String
			:location "343:3-343:28"
		)]
	) ) ( def KML_RefreshMode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_RefreshMode
			:type String
			:location "349:3-349:28"
		)]
	) ) ( def KML_RefreshVisibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_RefreshVisibility
			:type String
			:location "355:3-355:28"
		)]
	) ) ( def KML_Rotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Rotation
			:type String
			:location "361:3-361:28"
		)]
	) ) ( def KML_Schema ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Scale ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Scale
			:type String
			:location "371:3-371:28"
		)]
	) ) ( def KML_ScreenOverlay ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ScreenOverlay
			:type String
			:location "377:3-377:25"
		)]
	) ) ( def KML_ScreenXY ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ScreenXY
			:type String
			:location "383:3-383:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ScreenXY
			:type String
			:location "384:3-384:24"
		) ( struct-map
			KM3_Attribute
			:name "xunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ScreenXY
			:type String
			:location "385:3-385:29"
		) ( struct-map
			KM3_Attribute
			:name "yunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ScreenXY
			:type String
			:location "386:3-386:29"
		)]
	) ) ( def KML_SimpleArrayField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_SimpleField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Size ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Size
			:type String
			:location "400:3-400:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Size
			:type String
			:location "401:3-401:24"
		) ( struct-map
			KM3_Attribute
			:name "xunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Size
			:type String
			:location "402:3-402:29"
		) ( struct-map
			KM3_Attribute
			:name "yunits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Size
			:type String
			:location "403:3-403:29"
		)]
	) ) ( def KML_South ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_South
			:type Double
			:location "409:3-409:28"
		)]
	) ) ( def KML_Snippet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_Style ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Style
			:type String
			:location "419:3-419:25"
		)]
	) ) ( def KML_StyleMap ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_StyleUrl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_StyleUrl
			:type String
			:location "429:3-429:28"
		)]
	) ) ( def KML_Tessellate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Tessellate
			:type String
			:location "435:3-435:28"
		)]
	) ) ( def KML_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_TextColor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_TextColor
			:type String
			:location "445:3-445:28"
		)]
	) ) ( def KML_Tilt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Tilt
			:type String
			:location "451:3-451:28"
		)]
	) ) ( def KML_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Type
			:type String
			:location "457:3-457:28"
		)]
	) ) ( def KML_Url ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[]
	) ) ( def KML_ViewBoundScale ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ViewBoundScale
			:type String
			:location "467:3-467:28"
		)]
	) ) ( def KML_ViewRefreshMode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ViewRefreshMode
			:type String
			:location "473:3-473:28"
		)]
	) ) ( def KML_ViewRefreshTime ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ViewRefreshTime
			:type Integer
			:location "479:3-479:29"
		)]
	) ) ( def KML_ViewFormat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_ViewFormat
			:type String
			:location "485:3-485:28"
		)]
	) ) ( def KML_Visibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Visibility
			:type String
			:location "491:3-491:28"
		)]
	) ) ( def KML_W ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_W
			:type Integer
			:location "497:3-497:29"
		)]
	) ) ( def KML_West ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_West
			:type Double
			:location "503:3-503:28"
		)]
	) ) ( def KML_Width ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Width
			:type Double
			:location "509:3-509:28"
		)]
	) ) ( def KML_X ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_X
			:type Integer
			:location "515:3-515:29"
		)]
	) ) ( def KML_Y ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KML_KMLNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KML_Y
			:type Integer
			:location "521:3-521:29"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "529:2-529:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "530:2-530:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "531:2-531:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "532:2-532:18"
	) )]
) )
